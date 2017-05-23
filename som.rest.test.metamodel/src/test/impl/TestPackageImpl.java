/**
 */
package test.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import test.Assertion;
import test.Authorization;
import test.Basic;
import test.ComplianceAssertion;
import test.ContainsAssertion;
import test.EqualsAssertion;
import test.HTTPMethod;
import test.HTTPStatusAssertion;
import test.HeaderAssertion;
import test.HeaderEqualsAssertion;
import test.HeaderExistsAssertion;
import test.HeaderField;
import test.InvalidStatusCodesAssertion;
import test.NamedElement;
import test.OAuth2;
import test.OpenAPIComplianceAssertion;
import test.Parameter;
import test.ParameterLocation;
import test.PerformanceAssertion;
import test.Request;
import test.ResponseMessageAssertion;
import test.SLAAssertion;
import test.SchemaComplianceAssertion;
import test.SchemeType;
import test.Test;
import test.TestCase;
import test.TestFactory;
import test.TestPackage;
import test.TestSuite;
import test.ValidStatusCodesAssertion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseMessageAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaComplianceAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEqualsAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerExistsAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpStatusAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidStatusCodesAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validStatusCodesAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openAPIComplianceAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuth2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterLocationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see test.TestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackageImpl() {
		super(eNS_URI, TestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackage init() {
		if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

		// Obtain or create and register package
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTestPackage.createPackageContents();

		// Initialize created meta-data
		theTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackage.eNS_URI, theTestPackage);
		return theTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuite() {
		return testSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSuite_Description() {
		return (EAttribute)testSuiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSuite_CreatedAt() {
		return (EAttribute)testSuiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSuite_UpdatedAt() {
		return (EAttribute)testSuiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuite_TestCases() {
		return (EReference)testSuiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_Description() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Tests() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_HttpMethod() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Host() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Resource() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Scheme() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Headers() {
		return (EReference)requestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Parameters() {
		return (EReference)requestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Assertions() {
		return (EReference)requestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Authorization() {
		return (EReference)requestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Location() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderField() {
		return headerFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderField_Key() {
		return (EAttribute)headerFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderField_Value() {
		return (EAttribute)headerFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_ErrorMessage() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplianceAssertion() {
		return complianceAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceAssertion_Path() {
		return (EAttribute)complianceAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceAssertion() {
		return performanceAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseMessageAssertion() {
		return responseMessageAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseMessageAssertion_Value() {
		return (EAttribute)responseMessageAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainsAssertion() {
		return containsAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualsAssertion() {
		return equalsAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaComplianceAssertion() {
		return schemaComplianceAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLAAssertion() {
		return slaAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLAAssertion_MaxTime() {
		return (EAttribute)slaAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderAssertion() {
		return headerAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderAssertion_Key() {
		return (EAttribute)headerAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderEqualsAssertion() {
		return headerEqualsAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderEqualsAssertion_Value() {
		return (EAttribute)headerEqualsAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderExistsAssertion() {
		return headerExistsAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPStatusAssertion() {
		return httpStatusAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPStatusAssertion_Code() {
		return (EAttribute)httpStatusAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidStatusCodesAssertion() {
		return invalidStatusCodesAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidStatusCodesAssertion() {
		return validStatusCodesAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenAPIComplianceAssertion() {
		return openAPIComplianceAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenAPIComplianceAssertion_Strict() {
		return (EAttribute)openAPIComplianceAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorization() {
		return authorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasic() {
		return basicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Username() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Password() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuth2() {
		return oAuth2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2_Token() {
		return (EAttribute)oAuth2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHTTPMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemeType() {
		return schemeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterLocation() {
		return parameterLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFactory getTestFactory() {
		return (TestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		testSuiteEClass = createEClass(TEST_SUITE);
		createEAttribute(testSuiteEClass, TEST_SUITE__DESCRIPTION);
		createEAttribute(testSuiteEClass, TEST_SUITE__CREATED_AT);
		createEAttribute(testSuiteEClass, TEST_SUITE__UPDATED_AT);
		createEReference(testSuiteEClass, TEST_SUITE__TEST_CASES);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__DESCRIPTION);
		createEReference(testCaseEClass, TEST_CASE__TESTS);

		testEClass = createEClass(TEST);

		requestEClass = createEClass(REQUEST);
		createEAttribute(requestEClass, REQUEST__HTTP_METHOD);
		createEAttribute(requestEClass, REQUEST__HOST);
		createEAttribute(requestEClass, REQUEST__RESOURCE);
		createEAttribute(requestEClass, REQUEST__SCHEME);
		createEReference(requestEClass, REQUEST__HEADERS);
		createEReference(requestEClass, REQUEST__PARAMETERS);
		createEReference(requestEClass, REQUEST__ASSERTIONS);
		createEReference(requestEClass, REQUEST__AUTHORIZATION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__LOCATION);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		headerFieldEClass = createEClass(HEADER_FIELD);
		createEAttribute(headerFieldEClass, HEADER_FIELD__KEY);
		createEAttribute(headerFieldEClass, HEADER_FIELD__VALUE);

		assertionEClass = createEClass(ASSERTION);
		createEAttribute(assertionEClass, ASSERTION__ERROR_MESSAGE);

		complianceAssertionEClass = createEClass(COMPLIANCE_ASSERTION);
		createEAttribute(complianceAssertionEClass, COMPLIANCE_ASSERTION__PATH);

		performanceAssertionEClass = createEClass(PERFORMANCE_ASSERTION);

		responseMessageAssertionEClass = createEClass(RESPONSE_MESSAGE_ASSERTION);
		createEAttribute(responseMessageAssertionEClass, RESPONSE_MESSAGE_ASSERTION__VALUE);

		containsAssertionEClass = createEClass(CONTAINS_ASSERTION);

		equalsAssertionEClass = createEClass(EQUALS_ASSERTION);

		schemaComplianceAssertionEClass = createEClass(SCHEMA_COMPLIANCE_ASSERTION);

		slaAssertionEClass = createEClass(SLA_ASSERTION);
		createEAttribute(slaAssertionEClass, SLA_ASSERTION__MAX_TIME);

		headerAssertionEClass = createEClass(HEADER_ASSERTION);
		createEAttribute(headerAssertionEClass, HEADER_ASSERTION__KEY);

		headerEqualsAssertionEClass = createEClass(HEADER_EQUALS_ASSERTION);
		createEAttribute(headerEqualsAssertionEClass, HEADER_EQUALS_ASSERTION__VALUE);

		headerExistsAssertionEClass = createEClass(HEADER_EXISTS_ASSERTION);

		httpStatusAssertionEClass = createEClass(HTTP_STATUS_ASSERTION);
		createEAttribute(httpStatusAssertionEClass, HTTP_STATUS_ASSERTION__CODE);

		invalidStatusCodesAssertionEClass = createEClass(INVALID_STATUS_CODES_ASSERTION);

		validStatusCodesAssertionEClass = createEClass(VALID_STATUS_CODES_ASSERTION);

		openAPIComplianceAssertionEClass = createEClass(OPEN_API_COMPLIANCE_ASSERTION);
		createEAttribute(openAPIComplianceAssertionEClass, OPEN_API_COMPLIANCE_ASSERTION__STRICT);

		authorizationEClass = createEClass(AUTHORIZATION);

		basicEClass = createEClass(BASIC);
		createEAttribute(basicEClass, BASIC__USERNAME);
		createEAttribute(basicEClass, BASIC__PASSWORD);

		oAuth2EClass = createEClass(OAUTH2);
		createEAttribute(oAuth2EClass, OAUTH2__TOKEN);

		// Create enums
		httpMethodEEnum = createEEnum(HTTP_METHOD);
		schemeTypeEEnum = createEEnum(SCHEME_TYPE);
		parameterLocationEEnum = createEEnum(PARAMETER_LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testSuiteEClass.getESuperTypes().add(this.getNamedElement());
		testCaseEClass.getESuperTypes().add(this.getNamedElement());
		testEClass.getESuperTypes().add(this.getNamedElement());
		requestEClass.getESuperTypes().add(this.getTest());
		complianceAssertionEClass.getESuperTypes().add(this.getAssertion());
		performanceAssertionEClass.getESuperTypes().add(this.getAssertion());
		responseMessageAssertionEClass.getESuperTypes().add(this.getAssertion());
		containsAssertionEClass.getESuperTypes().add(this.getResponseMessageAssertion());
		equalsAssertionEClass.getESuperTypes().add(this.getResponseMessageAssertion());
		schemaComplianceAssertionEClass.getESuperTypes().add(this.getComplianceAssertion());
		slaAssertionEClass.getESuperTypes().add(this.getPerformanceAssertion());
		headerAssertionEClass.getESuperTypes().add(this.getAssertion());
		headerEqualsAssertionEClass.getESuperTypes().add(this.getHeaderAssertion());
		headerExistsAssertionEClass.getESuperTypes().add(this.getHeaderAssertion());
		httpStatusAssertionEClass.getESuperTypes().add(this.getAssertion());
		invalidStatusCodesAssertionEClass.getESuperTypes().add(this.getHTTPStatusAssertion());
		validStatusCodesAssertionEClass.getESuperTypes().add(this.getHTTPStatusAssertion());
		openAPIComplianceAssertionEClass.getESuperTypes().add(this.getComplianceAssertion());
		basicEClass.getESuperTypes().add(this.getAuthorization());
		oAuth2EClass.getESuperTypes().add(this.getAuthorization());

		// Initialize classes, features, and operations; add parameters
		initEClass(testSuiteEClass, TestSuite.class, "TestSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestSuite_Description(), ecorePackage.getEString(), "description", null, 0, 1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSuite_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSuite_UpdatedAt(), ecorePackage.getEString(), "updatedAt", null, 0, 1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSuite_TestCases(), this.getTestCase(), null, "testCases", null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase_Description(), ecorePackage.getEString(), "description", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Tests(), this.getTest(), null, "tests", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequest_HttpMethod(), this.getHTTPMethod(), "httpMethod", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Host(), ecorePackage.getEString(), "host", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Resource(), ecorePackage.getEString(), "resource", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Scheme(), this.getSchemeType(), "scheme", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequest_Headers(), this.getHeaderField(), null, "headers", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequest_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequest_Assertions(), this.getAssertion(), null, "assertions", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequest_Authorization(), this.getAuthorization(), null, "authorization", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Location(), this.getParameterLocation(), "location", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerFieldEClass, HeaderField.class, "HeaderField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderField_Key(), ecorePackage.getEString(), "key", null, 0, 1, HeaderField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderField_Value(), ecorePackage.getEString(), "value", null, 0, -1, HeaderField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertion_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceAssertionEClass, ComplianceAssertion.class, "ComplianceAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceAssertion_Path(), ecorePackage.getEString(), "path", null, 0, 1, ComplianceAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceAssertionEClass, PerformanceAssertion.class, "PerformanceAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseMessageAssertionEClass, ResponseMessageAssertion.class, "ResponseMessageAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseMessageAssertion_Value(), ecorePackage.getEString(), "value", null, 0, 1, ResponseMessageAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsAssertionEClass, ContainsAssertion.class, "ContainsAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalsAssertionEClass, EqualsAssertion.class, "EqualsAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schemaComplianceAssertionEClass, SchemaComplianceAssertion.class, "SchemaComplianceAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slaAssertionEClass, SLAAssertion.class, "SLAAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSLAAssertion_MaxTime(), ecorePackage.getEIntegerObject(), "maxTime", null, 0, 1, SLAAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerAssertionEClass, HeaderAssertion.class, "HeaderAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderAssertion_Key(), ecorePackage.getEString(), "key", null, 0, 1, HeaderAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEqualsAssertionEClass, HeaderEqualsAssertion.class, "HeaderEqualsAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderEqualsAssertion_Value(), ecorePackage.getEString(), "value", null, 0, 1, HeaderEqualsAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerExistsAssertionEClass, HeaderExistsAssertion.class, "HeaderExistsAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(httpStatusAssertionEClass, HTTPStatusAssertion.class, "HTTPStatusAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPStatusAssertion_Code(), ecorePackage.getEString(), "code", null, 0, -1, HTTPStatusAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidStatusCodesAssertionEClass, InvalidStatusCodesAssertion.class, "InvalidStatusCodesAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validStatusCodesAssertionEClass, ValidStatusCodesAssertion.class, "ValidStatusCodesAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openAPIComplianceAssertionEClass, OpenAPIComplianceAssertion.class, "OpenAPIComplianceAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenAPIComplianceAssertion_Strict(), ecorePackage.getEBooleanObject(), "strict", null, 0, 1, OpenAPIComplianceAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationEClass, Authorization.class, "Authorization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicEClass, Basic.class, "Basic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasic_Username(), ecorePackage.getEString(), "username", null, 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasic_Password(), ecorePackage.getEString(), "password", null, 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuth2EClass, OAuth2.class, "OAuth2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuth2_Token(), ecorePackage.getEString(), "token", null, 0, 1, OAuth2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(httpMethodEEnum, HTTPMethod.class, "HTTPMethod");
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.UNDEFINED);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.POST);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.PUT);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.DELETE);
		addEEnumLiteral(httpMethodEEnum, HTTPMethod.OPTIONS);

		initEEnum(schemeTypeEEnum, SchemeType.class, "SchemeType");
		addEEnumLiteral(schemeTypeEEnum, SchemeType.UNDEFINED);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.HTTP);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.HTTPS);

		initEEnum(parameterLocationEEnum, ParameterLocation.class, "ParameterLocation");
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.UNDEFINED);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.QUERY);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.PATH);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.HEADER);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.BODY);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.FORM);

		// Create resource
		createResource(eNS_URI);
	}

} //TestPackageImpl
