/**
 */
package som.rest.test.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import som.rest.test.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see som.rest.test.TestPackage
 * @generated
 */
public class TestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSwitch() {
		if (modelPackage == null) {
			modelPackage = TestPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TestPackage.TEST_SUITE: {
				TestSuite testSuite = (TestSuite)theEObject;
				T result = caseTestSuite(testSuite);
				if (result == null) result = caseNamedElement(testSuite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.TEST_CASE: {
				TestCase testCase = (TestCase)theEObject;
				T result = caseTestCase(testCase);
				if (result == null) result = caseNamedElement(testCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.TEST_STEP: {
				TestStep testStep = (TestStep)theEObject;
				T result = caseTestStep(testStep);
				if (result == null) result = caseNamedElement(testStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.API_REQUEST: {
				APIRequest apiRequest = (APIRequest)theEObject;
				T result = caseAPIRequest(apiRequest);
				if (result == null) result = caseTestStep(apiRequest);
				if (result == null) result = caseNamedElement(apiRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.COMPLIANCE_ASSERTION: {
				ComplianceAssertion complianceAssertion = (ComplianceAssertion)theEObject;
				T result = caseComplianceAssertion(complianceAssertion);
				if (result == null) result = caseAssertion(complianceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.PERFORMANCE_ASSERTION: {
				PerformanceAssertion performanceAssertion = (PerformanceAssertion)theEObject;
				T result = casePerformanceAssertion(performanceAssertion);
				if (result == null) result = caseAssertion(performanceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.RESPONSE_MESSAGE_ASSERTION: {
				ResponseMessageAssertion responseMessageAssertion = (ResponseMessageAssertion)theEObject;
				T result = caseResponseMessageAssertion(responseMessageAssertion);
				if (result == null) result = caseAssertion(responseMessageAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.RESPONSE_MESSAGE_CONTAINS_ASSERTION: {
				ResponseMessageContainsAssertion responseMessageContainsAssertion = (ResponseMessageContainsAssertion)theEObject;
				T result = caseResponseMessageContainsAssertion(responseMessageContainsAssertion);
				if (result == null) result = caseResponseMessageAssertion(responseMessageContainsAssertion);
				if (result == null) result = caseAssertion(responseMessageContainsAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.RESPONSE_MESSAGE_EQUALS_ASSERTION: {
				ResponseMessageEqualsAssertion responseMessageEqualsAssertion = (ResponseMessageEqualsAssertion)theEObject;
				T result = caseResponseMessageEqualsAssertion(responseMessageEqualsAssertion);
				if (result == null) result = caseResponseMessageAssertion(responseMessageEqualsAssertion);
				if (result == null) result = caseAssertion(responseMessageEqualsAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.SCHEMA_COMPLIANCE_ASSERTION: {
				SchemaComplianceAssertion schemaComplianceAssertion = (SchemaComplianceAssertion)theEObject;
				T result = caseSchemaComplianceAssertion(schemaComplianceAssertion);
				if (result == null) result = caseComplianceAssertion(schemaComplianceAssertion);
				if (result == null) result = caseAssertion(schemaComplianceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.SLA_ASSERTION: {
				SLAAssertion slaAssertion = (SLAAssertion)theEObject;
				T result = caseSLAAssertion(slaAssertion);
				if (result == null) result = casePerformanceAssertion(slaAssertion);
				if (result == null) result = caseAssertion(slaAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEADER_ASSERTION: {
				HeaderAssertion headerAssertion = (HeaderAssertion)theEObject;
				T result = caseHeaderAssertion(headerAssertion);
				if (result == null) result = caseAssertion(headerAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEADER_EQUALS_ASSERTION: {
				HeaderEqualsAssertion headerEqualsAssertion = (HeaderEqualsAssertion)theEObject;
				T result = caseHeaderEqualsAssertion(headerEqualsAssertion);
				if (result == null) result = caseHeaderAssertion(headerEqualsAssertion);
				if (result == null) result = caseAssertion(headerEqualsAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEADER_EXISTS_ASSERTION: {
				HeaderExistsAssertion headerExistsAssertion = (HeaderExistsAssertion)theEObject;
				T result = caseHeaderExistsAssertion(headerExistsAssertion);
				if (result == null) result = caseHeaderAssertion(headerExistsAssertion);
				if (result == null) result = caseAssertion(headerExistsAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HTTP_STATUS_ASSERTION: {
				HTTPStatusAssertion httpStatusAssertion = (HTTPStatusAssertion)theEObject;
				T result = caseHTTPStatusAssertion(httpStatusAssertion);
				if (result == null) result = caseAssertion(httpStatusAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.INVALID_STATUS_CODES_ASSERTION: {
				InvalidStatusCodesAssertion invalidStatusCodesAssertion = (InvalidStatusCodesAssertion)theEObject;
				T result = caseInvalidStatusCodesAssertion(invalidStatusCodesAssertion);
				if (result == null) result = caseHTTPStatusAssertion(invalidStatusCodesAssertion);
				if (result == null) result = caseAssertion(invalidStatusCodesAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.VALID_STATUS_CODES_ASSERTION: {
				ValidStatusCodesAssertion validStatusCodesAssertion = (ValidStatusCodesAssertion)theEObject;
				T result = caseValidStatusCodesAssertion(validStatusCodesAssertion);
				if (result == null) result = caseHTTPStatusAssertion(validStatusCodesAssertion);
				if (result == null) result = caseAssertion(validStatusCodesAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.AUTHORIZATION: {
				Authorization authorization = (Authorization)theEObject;
				T result = caseAuthorization(authorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.BASIC: {
				Basic basic = (Basic)theEObject;
				T result = caseBasic(basic);
				if (result == null) result = caseAuthorization(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.OAUTH2: {
				OAuth2 oAuth2 = (OAuth2)theEObject;
				T result = caseOAuth2(oAuth2);
				if (result == null) result = caseAuthorization(oAuth2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.PROPERTY_TRANSFER: {
				PropertyTransfer propertyTransfer = (PropertyTransfer)theEObject;
				T result = casePropertyTransfer(propertyTransfer);
				if (result == null) result = caseTestStep(propertyTransfer);
				if (result == null) result = caseNamedElement(propertyTransfer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.PARAMETER_PROPERTY: {
				ParameterProperty parameterProperty = (ParameterProperty)theEObject;
				T result = caseParameterProperty(parameterProperty);
				if (result == null) result = caseInputProperty(parameterProperty);
				if (result == null) result = caseProperty(parameterProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.RESPONSE_PROPERTY: {
				ResponseProperty responseProperty = (ResponseProperty)theEObject;
				T result = caseResponseProperty(responseProperty);
				if (result == null) result = caseOutputProperty(responseProperty);
				if (result == null) result = caseProperty(responseProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.INPUT_PROPERTY: {
				InputProperty inputProperty = (InputProperty)theEObject;
				T result = caseInputProperty(inputProperty);
				if (result == null) result = caseProperty(inputProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.OUTPUT_PROPERTY: {
				OutputProperty outputProperty = (OutputProperty)theEObject;
				T result = caseOutputProperty(outputProperty);
				if (result == null) result = caseProperty(outputProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEADER_PROPERTY: {
				HeaderProperty headerProperty = (HeaderProperty)theEObject;
				T result = caseHeaderProperty(headerProperty);
				if (result == null) result = caseOutputProperty(headerProperty);
				if (result == null) result = caseProperty(headerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSuite(TestSuite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCase(TestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestStep(TestStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIRequest(APIRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceAssertion(ComplianceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceAssertion(PerformanceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Message Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Message Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMessageAssertion(ResponseMessageAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Message Contains Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Message Contains Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMessageContainsAssertion(ResponseMessageContainsAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Message Equals Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Message Equals Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMessageEqualsAssertion(ResponseMessageEqualsAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Compliance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Compliance Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaComplianceAssertion(SchemaComplianceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLA Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLA Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLAAssertion(SLAAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderAssertion(HeaderAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Equals Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Equals Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderEqualsAssertion(HeaderEqualsAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Exists Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Exists Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderExistsAssertion(HeaderExistsAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Status Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Status Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPStatusAssertion(HTTPStatusAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Status Codes Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Status Codes Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidStatusCodesAssertion(InvalidStatusCodesAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Status Codes Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Status Codes Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidStatusCodesAssertion(ValidStatusCodesAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorization(Authorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasic(Basic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuth2(OAuth2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Transfer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyTransfer(PropertyTransfer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterProperty(ParameterProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseProperty(ResponseProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputProperty(InputProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputProperty(OutputProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderProperty(HeaderProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TestSwitch
