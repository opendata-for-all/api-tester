package som.openapi.test.generator.transformation;


import java.io.FileNotFoundException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;

import core.JSONDataType;
import core.OpenAPIPackage;
import core.Operation;
import core.Parameter;
import core.ParameterLocation;
import core.Root;
import som.openapi.test.generator.utils.OpenAPIUtils;
import som.openapi.test.generator.utils.TesTSuiteUtils;
import som.rest.test.APIRequest;
import som.rest.test.InvalidStatusCodesAssertion;
import som.rest.test.SchemeType;
import som.rest.test.TestCase;
import som.rest.test.TestFactory;
import som.rest.test.TestSuite;
import som.rest.test.ValidStatusCodesAssertion;

public class TestSuiteGenerator {
	
	private TestFactory factory;
	private ResourceSet resSet;
	
	public TestSuiteGenerator() {
		factory = TestFactory.eINSTANCE;
		resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(OpenAPIPackage.eNS_URI, OpenAPIPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		   .put("oas", new XMIResourceFactoryImpl());
	}

	public TestSuite generateTestSuite (URI openAPIModelURI) {
		Resource openAPIResource = resSet.getResource(openAPIModelURI, true);
		return generateTestSuite((Root)openAPIResource.getContents().get(0));
		
	}
	public  TestSuite generateTestSuite(Root openAPIModel) {
		TestSuite testSuite = factory.createTestSuite();
		for(Operation operation: OpenAPIUtils.getAllOperations(openAPIModel)) {
			if(isSimpleInferencePossible(operation)) {
				testSuite.getTestCases().add(generateSimpleCorrectessTestCase(operation));
			}
		}
		
		for(Operation operation: OpenAPIUtils.getAllOperations(openAPIModel)) {
		for(Parameter parameter: operation.getParameters()) {
			if(isSimpleRequiredInferencePossible(operation, parameter)) {
				testSuite.getTestCases().add(generateSimpleRequiredTestCase(operation, parameter));
			}
		}
		}
		return testSuite;
		
	}
	public void generateAndSaveTestSuite (URI openAPIModelURI, URI testSuiteURI) throws FileNotFoundException {
		TestSuite testSuite = generateTestSuite(openAPIModelURI);
		TesTSuiteUtils.saveTestSuiteModel(testSuite, testSuiteURI);
		
	}
	public TestCase generateSimpleCorrectessTestCase(Operation operation){
		if(isSimpleInferencePossible(operation)) {
			TestCase testCase = factory.createTestCase();
			testCase.setName(operation.getOperationId()+"Test");
			testCase.setDescription("Correctness test case for "+operation.getOperationId());		
			APIRequest testStep = generateSimpleCorrectnessAPIRequest(operation);
			testCase.getTestSteps().add(testStep);
			return testCase;
		}
		return null;
	}

	public TestCase generateSimpleRequiredTestCase(Operation operation, Parameter parameter){
		if(isSimpleRequiredInferencePossible(operation, parameter)) {
			TestCase testCase = factory.createTestCase();
			testCase.setName(operation.getOperationId()+"Missing"+parameter.getName()+"Test");
			testCase.setDescription("Required test case for "+operation.getOperationId());		
			APIRequest testStep = generateSimpleRequiredAPIRequest(operation, parameter);
			testCase.getTestSteps().add(testStep);
			return testCase;
		}
		return null;
	}
	public APIRequest generateSimpleCorrectnessAPIRequest(Operation operation) {
		APIRequest testStep = factory.createAPIRequest();
		testStep.setAccept("application/json");
		testStep.setContentType("application/json");
		testStep.setName(operation.getOperationId()+"TestStep");
		testStep.setOperationId(operation.getOperationId());
		testStep.setScheme(SchemeType.HTTP);
		for(Parameter parameter: operation.getParameters()) {
			if (isSimpleInferencePossible(parameter)) {
				som.rest.test.Parameter parameterValue = factory.createParameter();
				parameterValue.setName(parameter.getName());
				parameterValue.setValue(getSimpleValue(parameter));
				testStep.getParameters().add(parameterValue);
			}
		}
		ValidStatusCodesAssertion validStatusCodeAssertion = factory.createValidStatusCodesAssertion();
		validStatusCodeAssertion.getCode().add("200");
		testStep.getAssertions().add(validStatusCodeAssertion);
		return testStep;
	}
	
	
	public APIRequest generateSimpleRequiredAPIRequest(Operation operation, Parameter parameter) {
		APIRequest testStep = factory.createAPIRequest();
		testStep.setAccept("application/json");
		testStep.setContentType("application/json");
		testStep.setName(operation.getOperationId()+"Missing"+parameter.getName()+"TestStep");
		testStep.setOperationId(operation.getOperationId());
		testStep.setScheme(SchemeType.HTTP);
		for(Parameter p: operation.getParameters()) {
			if (!p.equals(parameter) && isSimpleInferencePossible(p)) {
				som.rest.test.Parameter parameterValue = factory.createParameter();
				parameterValue.setName(p.getName());
				parameterValue.setValue(getSimpleValue(p));
				testStep.getParameters().add(parameterValue);
			}
		}
		InvalidStatusCodesAssertion inValidStatusCodeAssertion = factory.createInvalidStatusCodesAssertion();
		inValidStatusCodeAssertion.getCode().add("200");
		testStep.getAssertions().add(inValidStatusCodeAssertion);
		return testStep;
	}

public boolean isSimpleInferencePossible(Operation operation) {
	for(Parameter parameter: operation.getParameters()) {
		if(parameter.getRequired() && !isSimpleInferencePossible(parameter))
			return false;
	}
	return true;
}
public boolean isSimpleRequiredInferencePossible(Operation operation, Parameter parameter) {
	if(parameter.getLocation().equals(ParameterLocation.PATH))
		return false;
	for(Parameter p: operation.getParameters()) {
		if(parameter.getLocation().equals(ParameterLocation.PATH) && !p.equals(parameter) && p.getRequired() && !isSimpleInferencePossible(p) )
			return false;
	}
	return true;
}
	public boolean isSimpleInferencePossible(Parameter parameter) {
		if(!parameter.getLocation().equals(ParameterLocation.BODY)) {
		if(parameter.getDefault() != null && !parameter.getDefault().equals(""))
			return true;
		if(!parameter.getEnum().isEmpty())
			return true;
		if(parameter.getType().equals(JSONDataType.ARRAY)) {
			if (parameter.getItems() != null && parameter.getItems().getDefault() != null && !parameter.getItems().getDefault().equals(""))
				return true;
			if(parameter.getItems() != null && !parameter.getItems().getEnum().isEmpty())
				return true;
		}
			
		}
		else {
			if(parameter.getSchema()!= null && parameter.getSchema().getExample() != null && !parameter.getSchema().getExample().equals("")) {
				return true;
			}
		}
		return false;
	}
	public boolean hasDefaultValue(Parameter parameter) {
		if(parameter.getDefault() != null && !parameter.getDefault().equals(""))
	
		if(parameter.getType().equals(JSONDataType.ARRAY)) {
			if (parameter.getItems() != null && parameter.getItems().getDefault() != null && !parameter.getItems().getDefault().equals(""))
				return true;
	
		}
			
		
	
		return false;
	}
	public String getSimpleValue(Parameter parameter) {
		if(!parameter.getLocation().equals(ParameterLocation.BODY)) {
			if(!parameter.getType().equals(JSONDataType.ARRAY)) {
				if(parameter.getDefault() != null && !parameter.getDefault().equals(""))
				return parameter.getDefault();
				if(!parameter.getEnum().isEmpty()) {
					return parameter.getEnum().get(0);
				}
			}
			else {
				if(parameter.getItems()!= null && parameter.getItems().getDefault() != null && !parameter.getItems().getDefault().equals(""))
					return parameter.getItems().getDefault();
					if(!parameter.getItems().getEnum().isEmpty()) {
						return parameter.getItems().getEnum().get(0);
					}
			}
			
		
		}
			else {
				if(parameter.getSchema()!= null && parameter.getSchema().getExample() != null && !parameter.getSchema().getExample().equals("")) {
					return parameter.getSchema().getExample();
				}
			}
			return null;
		
	}

}
