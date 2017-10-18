/**
 */
package som.rest.test.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import som.rest.test.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestFactoryImpl extends EFactoryImpl implements TestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestFactory init() {
		try {
			TestFactory theTestFactory = (TestFactory)EPackage.Registry.INSTANCE.getEFactory(TestPackage.eNS_URI);
			if (theTestFactory != null) {
				return theTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TestPackage.TEST_SUITE: return createTestSuite();
			case TestPackage.TEST_CASE: return createTestCase();
			case TestPackage.API_REQUEST: return createAPIRequest();
			case TestPackage.PARAMETER: return createParameter();
			case TestPackage.RESPONSE_MESSAGE_CONTAINS_ASSERTION: return createResponseMessageContainsAssertion();
			case TestPackage.RESPONSE_MESSAGE_EQUALS_ASSERTION: return createResponseMessageEqualsAssertion();
			case TestPackage.SCHEMA_COMPLIANCE_ASSERTION: return createSchemaComplianceAssertion();
			case TestPackage.SLA_ASSERTION: return createSLAAssertion();
			case TestPackage.HEADER_EQUALS_ASSERTION: return createHeaderEqualsAssertion();
			case TestPackage.HEADER_EXISTS_ASSERTION: return createHeaderExistsAssertion();
			case TestPackage.INVALID_STATUS_CODES_ASSERTION: return createInvalidStatusCodesAssertion();
			case TestPackage.VALID_STATUS_CODES_ASSERTION: return createValidStatusCodesAssertion();
			case TestPackage.BASIC: return createBasic();
			case TestPackage.OAUTH2: return createOAuth2();
			case TestPackage.PROPERTY_TRANSFER: return createPropertyTransfer();
			case TestPackage.PARAMETER_PROPERTY: return createParameterProperty();
			case TestPackage.RESPONSE_PROPERTY: return createResponseProperty();
			case TestPackage.HEADER_PROPERTY: return createHeaderProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TestPackage.PARAMETER_LOCATION:
				return createParameterLocationFromString(eDataType, initialValue);
			case TestPackage.SCHEME_TYPE:
				return createSchemeTypeFromString(eDataType, initialValue);
			case TestPackage.HTTP_METHOD:
				return createHTTPMethodFromString(eDataType, initialValue);
			case TestPackage.PATH_LANGUAGE:
				return createPathLanguageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TestPackage.PARAMETER_LOCATION:
				return convertParameterLocationToString(eDataType, instanceValue);
			case TestPackage.SCHEME_TYPE:
				return convertSchemeTypeToString(eDataType, instanceValue);
			case TestPackage.HTTP_METHOD:
				return convertHTTPMethodToString(eDataType, instanceValue);
			case TestPackage.PATH_LANGUAGE:
				return convertPathLanguageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuite createTestSuite() {
		TestSuiteImpl testSuite = new TestSuiteImpl();
		return testSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIRequest createAPIRequest() {
		APIRequestImpl apiRequest = new APIRequestImpl();
		return apiRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMessageContainsAssertion createResponseMessageContainsAssertion() {
		ResponseMessageContainsAssertionImpl responseMessageContainsAssertion = new ResponseMessageContainsAssertionImpl();
		return responseMessageContainsAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMessageEqualsAssertion createResponseMessageEqualsAssertion() {
		ResponseMessageEqualsAssertionImpl responseMessageEqualsAssertion = new ResponseMessageEqualsAssertionImpl();
		return responseMessageEqualsAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaComplianceAssertion createSchemaComplianceAssertion() {
		SchemaComplianceAssertionImpl schemaComplianceAssertion = new SchemaComplianceAssertionImpl();
		return schemaComplianceAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLAAssertion createSLAAssertion() {
		SLAAssertionImpl slaAssertion = new SLAAssertionImpl();
		return slaAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderEqualsAssertion createHeaderEqualsAssertion() {
		HeaderEqualsAssertionImpl headerEqualsAssertion = new HeaderEqualsAssertionImpl();
		return headerEqualsAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderExistsAssertion createHeaderExistsAssertion() {
		HeaderExistsAssertionImpl headerExistsAssertion = new HeaderExistsAssertionImpl();
		return headerExistsAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidStatusCodesAssertion createInvalidStatusCodesAssertion() {
		InvalidStatusCodesAssertionImpl invalidStatusCodesAssertion = new InvalidStatusCodesAssertionImpl();
		return invalidStatusCodesAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidStatusCodesAssertion createValidStatusCodesAssertion() {
		ValidStatusCodesAssertionImpl validStatusCodesAssertion = new ValidStatusCodesAssertionImpl();
		return validStatusCodesAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2 createOAuth2() {
		OAuth2Impl oAuth2 = new OAuth2Impl();
		return oAuth2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTransfer createPropertyTransfer() {
		PropertyTransferImpl propertyTransfer = new PropertyTransferImpl();
		return propertyTransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterProperty createParameterProperty() {
		ParameterPropertyImpl parameterProperty = new ParameterPropertyImpl();
		return parameterProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseProperty createResponseProperty() {
		ResponsePropertyImpl responseProperty = new ResponsePropertyImpl();
		return responseProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderProperty createHeaderProperty() {
		HeaderPropertyImpl headerProperty = new HeaderPropertyImpl();
		return headerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation createParameterLocationFromString(EDataType eDataType, String initialValue) {
		ParameterLocation result = ParameterLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemeType createSchemeTypeFromString(EDataType eDataType, String initialValue) {
		SchemeType result = SchemeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPMethod createHTTPMethodFromString(EDataType eDataType, String initialValue) {
		HTTPMethod result = HTTPMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathLanguage createPathLanguageFromString(EDataType eDataType, String initialValue) {
		PathLanguage result = PathLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPackage getTestPackage() {
		return (TestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestPackage getPackage() {
		return TestPackage.eINSTANCE;
	}

} //TestFactoryImpl
