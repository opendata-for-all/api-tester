/**
 */
package edu.uoc.som.rest.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.rest.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/rest/test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = edu.uoc.som.rest.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.NamedElementImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.TestSuiteImpl <em>Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.TestSuiteImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__CREATED_AT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__UPDATED_AT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TEST_STEPS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.TestCaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.TestCaseImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TESTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.TestStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.TestStepImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getTestStep()
	 * @generated
	 */
	int TEST_STEP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_STEP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_STEP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_STEP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.RequestImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = TEST_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__HTTP_METHOD = TEST_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__HOST = TEST_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__PATH = TEST_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SCHEME = TEST_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__HEADERS = TEST_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__PARAMETERS = TEST_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ASSERTIONS = TEST_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__AUTHORIZATION = TEST_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__BODY = TEST_STEP_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = TEST_STEP_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = TEST_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.PropertyImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 27;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.ParameterImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOCATION = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.HeaderImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__KEY = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__VALUE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.AssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 7;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ERROR_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.ComplianceAssertionImpl <em>Compliance Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.ComplianceAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getComplianceAssertion()
	 * @generated
	 */
	int COMPLIANCE_ASSERTION = 8;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ASSERTION__ERROR_MESSAGE = ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ASSERTION__PATH = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compliance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compliance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.PerformanceAssertionImpl <em>Performance Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.PerformanceAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getPerformanceAssertion()
	 * @generated
	 */
	int PERFORMANCE_ASSERTION = 9;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ASSERTION__ERROR_MESSAGE = ASSERTION__ERROR_MESSAGE;

	/**
	 * The number of structural features of the '<em>Performance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Performance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.ResponseMessageAssertionImpl <em>Response Message Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.ResponseMessageAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getResponseMessageAssertion()
	 * @generated
	 */
	int RESPONSE_MESSAGE_ASSERTION = 10;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MESSAGE_ASSERTION__ERROR_MESSAGE = ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MESSAGE_ASSERTION__VALUE = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response Message Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MESSAGE_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response Message Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MESSAGE_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.ContainsAssertionImpl <em>Contains Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.ContainsAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getContainsAssertion()
	 * @generated
	 */
	int CONTAINS_ASSERTION = 11;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_ASSERTION__ERROR_MESSAGE = RESPONSE_MESSAGE_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_ASSERTION__VALUE = RESPONSE_MESSAGE_ASSERTION__VALUE;

	/**
	 * The number of structural features of the '<em>Contains Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_ASSERTION_FEATURE_COUNT = RESPONSE_MESSAGE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contains Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_ASSERTION_OPERATION_COUNT = RESPONSE_MESSAGE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.EqualsAssertionImpl <em>Equals Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.EqualsAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getEqualsAssertion()
	 * @generated
	 */
	int EQUALS_ASSERTION = 12;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_ASSERTION__ERROR_MESSAGE = RESPONSE_MESSAGE_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_ASSERTION__VALUE = RESPONSE_MESSAGE_ASSERTION__VALUE;

	/**
	 * The number of structural features of the '<em>Equals Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_ASSERTION_FEATURE_COUNT = RESPONSE_MESSAGE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_ASSERTION_OPERATION_COUNT = RESPONSE_MESSAGE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.SchemaComplianceAssertionImpl <em>Schema Compliance Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.SchemaComplianceAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getSchemaComplianceAssertion()
	 * @generated
	 */
	int SCHEMA_COMPLIANCE_ASSERTION = 13;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COMPLIANCE_ASSERTION__ERROR_MESSAGE = COMPLIANCE_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COMPLIANCE_ASSERTION__PATH = COMPLIANCE_ASSERTION__PATH;

	/**
	 * The number of structural features of the '<em>Schema Compliance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COMPLIANCE_ASSERTION_FEATURE_COUNT = COMPLIANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schema Compliance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COMPLIANCE_ASSERTION_OPERATION_COUNT = COMPLIANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.SLAAssertionImpl <em>SLA Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.SLAAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getSLAAssertion()
	 * @generated
	 */
	int SLA_ASSERTION = 14;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_ASSERTION__ERROR_MESSAGE = PERFORMANCE_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_ASSERTION__MAX_TIME = PERFORMANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SLA Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_ASSERTION_FEATURE_COUNT = PERFORMANCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SLA Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_ASSERTION_OPERATION_COUNT = PERFORMANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.HeaderAssertionImpl <em>Header Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.HeaderAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHeaderAssertion()
	 * @generated
	 */
	int HEADER_ASSERTION = 15;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ASSERTION__ERROR_MESSAGE = ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ASSERTION__KEY = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Header Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.HeaderEqualsAssertionImpl <em>Header Equals Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.HeaderEqualsAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHeaderEqualsAssertion()
	 * @generated
	 */
	int HEADER_EQUALS_ASSERTION = 16;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EQUALS_ASSERTION__ERROR_MESSAGE = HEADER_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EQUALS_ASSERTION__KEY = HEADER_ASSERTION__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EQUALS_ASSERTION__VALUE = HEADER_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header Equals Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EQUALS_ASSERTION_FEATURE_COUNT = HEADER_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Header Equals Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EQUALS_ASSERTION_OPERATION_COUNT = HEADER_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.HeaderExistsAssertionImpl <em>Header Exists Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.HeaderExistsAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHeaderExistsAssertion()
	 * @generated
	 */
	int HEADER_EXISTS_ASSERTION = 17;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EXISTS_ASSERTION__ERROR_MESSAGE = HEADER_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EXISTS_ASSERTION__KEY = HEADER_ASSERTION__KEY;

	/**
	 * The number of structural features of the '<em>Header Exists Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EXISTS_ASSERTION_FEATURE_COUNT = HEADER_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Exists Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EXISTS_ASSERTION_OPERATION_COUNT = HEADER_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.HTTPStatusAssertionImpl <em>HTTP Status Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.HTTPStatusAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHTTPStatusAssertion()
	 * @generated
	 */
	int HTTP_STATUS_ASSERTION = 18;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_STATUS_ASSERTION__ERROR_MESSAGE = ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_STATUS_ASSERTION__CODE = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTTP Status Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_STATUS_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HTTP Status Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_STATUS_ASSERTION_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.InvalidStatusCodesAssertionImpl <em>Invalid Status Codes Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.InvalidStatusCodesAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getInvalidStatusCodesAssertion()
	 * @generated
	 */
	int INVALID_STATUS_CODES_ASSERTION = 19;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_STATUS_CODES_ASSERTION__ERROR_MESSAGE = HTTP_STATUS_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_STATUS_CODES_ASSERTION__CODE = HTTP_STATUS_ASSERTION__CODE;

	/**
	 * The number of structural features of the '<em>Invalid Status Codes Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_STATUS_CODES_ASSERTION_FEATURE_COUNT = HTTP_STATUS_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Invalid Status Codes Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_STATUS_CODES_ASSERTION_OPERATION_COUNT = HTTP_STATUS_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.ValidStatusCodesAssertionImpl <em>Valid Status Codes Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.ValidStatusCodesAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getValidStatusCodesAssertion()
	 * @generated
	 */
	int VALID_STATUS_CODES_ASSERTION = 20;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_STATUS_CODES_ASSERTION__ERROR_MESSAGE = HTTP_STATUS_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_STATUS_CODES_ASSERTION__CODE = HTTP_STATUS_ASSERTION__CODE;

	/**
	 * The number of structural features of the '<em>Valid Status Codes Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_STATUS_CODES_ASSERTION_FEATURE_COUNT = HTTP_STATUS_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Valid Status Codes Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_STATUS_CODES_ASSERTION_OPERATION_COUNT = HTTP_STATUS_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.OpenAPIComplianceAssertionImpl <em>Open API Compliance Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.OpenAPIComplianceAssertionImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getOpenAPIComplianceAssertion()
	 * @generated
	 */
	int OPEN_API_COMPLIANCE_ASSERTION = 21;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_COMPLIANCE_ASSERTION__ERROR_MESSAGE = COMPLIANCE_ASSERTION__ERROR_MESSAGE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_COMPLIANCE_ASSERTION__PATH = COMPLIANCE_ASSERTION__PATH;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_COMPLIANCE_ASSERTION__STRICT = COMPLIANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open API Compliance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_COMPLIANCE_ASSERTION_FEATURE_COUNT = COMPLIANCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open API Compliance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_API_COMPLIANCE_ASSERTION_OPERATION_COUNT = COMPLIANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.AuthorizationImpl <em>Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.AuthorizationImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getAuthorization()
	 * @generated
	 */
	int AUTHORIZATION = 22;

	/**
	 * The number of structural features of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.BasicImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 23;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__USERNAME = AUTHORIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__PASSWORD = AUTHORIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = AUTHORIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_COUNT = AUTHORIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.OAuth2Impl <em>OAuth2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.OAuth2Impl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getOAuth2()
	 * @generated
	 */
	int OAUTH2 = 24;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__TOKEN = AUTHORIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_FEATURE_COUNT = AUTHORIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_OPERATION_COUNT = AUTHORIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.BodyImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 25;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__MEDIA_TYPE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__VALUE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl <em>Property Transfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.impl.PropertyTransferImpl
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getPropertyTransfer()
	 * @generated
	 */
	int PROPERTY_TRANSFER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__NAME = TEST_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__SOURCE = TEST_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Property Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__SOURCE_PROPERTY_LOCATION = TEST_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__SOURCE_PROPERTY = TEST_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH = TEST_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Property Path Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH_VALUE = TEST_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__TARGET = TEST_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Property Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__TARGET_PROPERTY_LOCATION = TEST_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__TARGET_PROPERTY = TEST_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__TARGET_PROPERTY_PATH = TEST_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target Property Path Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__TARGET_PROPERTY_PATH_VALUE = TEST_STEP_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Property Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER_FEATURE_COUNT = TEST_STEP_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Property Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER_OPERATION_COUNT = TEST_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.ParameterLocation
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 28;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.SchemeType <em>Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.SchemeType
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getSchemeType()
	 * @generated
	 */
	int SCHEME_TYPE = 29;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.HTTPMethod <em>HTTP Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.HTTPMethod
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHTTPMethod()
	 * @generated
	 */
	int HTTP_METHOD = 30;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.PathLanguage <em>Path Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.PathLanguage
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getPathLanguage()
	 * @generated
	 */
	int PATH_LANGUAGE = 31;

	/**
	 * The meta object id for the '{@link edu.uoc.som.rest.test.PropertyLocation <em>Property Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.rest.test.PropertyLocation
	 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getPropertyLocation()
	 * @generated
	 */
	int PROPERTY_LOCATION = 32;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.TestSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suite</em>'.
	 * @see edu.uoc.som.rest.test.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.TestSuite#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.rest.test.TestSuite#getDescription()
	 * @see #getTestSuite()
	 * @generated
	 */
	EAttribute getTestSuite_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.TestSuite#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see edu.uoc.som.rest.test.TestSuite#getCreatedAt()
	 * @see #getTestSuite()
	 * @generated
	 */
	EAttribute getTestSuite_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.TestSuite#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see edu.uoc.som.rest.test.TestSuite#getUpdatedAt()
	 * @see #getTestSuite()
	 * @generated
	 */
	EAttribute getTestSuite_UpdatedAt();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.rest.test.TestSuite#getTestSteps <em>Test Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Steps</em>'.
	 * @see edu.uoc.som.rest.test.TestSuite#getTestSteps()
	 * @see #getTestSuite()
	 * @generated
	 */
	EReference getTestSuite_TestSteps();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.TestCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see edu.uoc.som.rest.test.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.TestCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.rest.test.TestCase#getDescription()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.rest.test.TestCase#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see edu.uoc.som.rest.test.TestCase#getTests()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Tests();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.TestStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see edu.uoc.som.rest.test.TestStep
	 * @generated
	 */
	EClass getTestStep();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see edu.uoc.som.rest.test.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Request#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see edu.uoc.som.rest.test.Request#getHttpMethod()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Request#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see edu.uoc.som.rest.test.Request#getHost()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Host();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Request#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see edu.uoc.som.rest.test.Request#getPath()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Path();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Request#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see edu.uoc.som.rest.test.Request#getScheme()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Scheme();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.rest.test.Request#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see edu.uoc.som.rest.test.Request#getHeaders()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Headers();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.rest.test.Request#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see edu.uoc.som.rest.test.Request#getParameters()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.rest.test.Request#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see edu.uoc.som.rest.test.Request#getAssertions()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Assertions();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.rest.test.Request#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorization</em>'.
	 * @see edu.uoc.som.rest.test.Request#getAuthorization()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Authorization();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.rest.test.Request#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see edu.uoc.som.rest.test.Request#getBody()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Body();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see edu.uoc.som.rest.test.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.rest.test.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see edu.uoc.som.rest.test.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Parameter#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.uoc.som.rest.test.Parameter#getLocation()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.rest.test.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.uoc.som.rest.test.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see edu.uoc.som.rest.test.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Header#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see edu.uoc.som.rest.test.Header#getKey()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Key();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.rest.test.Header#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see edu.uoc.som.rest.test.Header#getValue()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see edu.uoc.som.rest.test.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Assertion#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see edu.uoc.som.rest.test.Assertion#getErrorMessage()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.ComplianceAssertion <em>Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Assertion</em>'.
	 * @see edu.uoc.som.rest.test.ComplianceAssertion
	 * @generated
	 */
	EClass getComplianceAssertion();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.ComplianceAssertion#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see edu.uoc.som.rest.test.ComplianceAssertion#getPath()
	 * @see #getComplianceAssertion()
	 * @generated
	 */
	EAttribute getComplianceAssertion_Path();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.PerformanceAssertion <em>Performance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Assertion</em>'.
	 * @see edu.uoc.som.rest.test.PerformanceAssertion
	 * @generated
	 */
	EClass getPerformanceAssertion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.ResponseMessageAssertion <em>Response Message Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Message Assertion</em>'.
	 * @see edu.uoc.som.rest.test.ResponseMessageAssertion
	 * @generated
	 */
	EClass getResponseMessageAssertion();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.ResponseMessageAssertion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.uoc.som.rest.test.ResponseMessageAssertion#getValue()
	 * @see #getResponseMessageAssertion()
	 * @generated
	 */
	EAttribute getResponseMessageAssertion_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.ContainsAssertion <em>Contains Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Assertion</em>'.
	 * @see edu.uoc.som.rest.test.ContainsAssertion
	 * @generated
	 */
	EClass getContainsAssertion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.EqualsAssertion <em>Equals Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals Assertion</em>'.
	 * @see edu.uoc.som.rest.test.EqualsAssertion
	 * @generated
	 */
	EClass getEqualsAssertion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.SchemaComplianceAssertion <em>Schema Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Compliance Assertion</em>'.
	 * @see edu.uoc.som.rest.test.SchemaComplianceAssertion
	 * @generated
	 */
	EClass getSchemaComplianceAssertion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.SLAAssertion <em>SLA Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLA Assertion</em>'.
	 * @see edu.uoc.som.rest.test.SLAAssertion
	 * @generated
	 */
	EClass getSLAAssertion();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.SLAAssertion#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see edu.uoc.som.rest.test.SLAAssertion#getMaxTime()
	 * @see #getSLAAssertion()
	 * @generated
	 */
	EAttribute getSLAAssertion_MaxTime();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.HeaderAssertion <em>Header Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Assertion</em>'.
	 * @see edu.uoc.som.rest.test.HeaderAssertion
	 * @generated
	 */
	EClass getHeaderAssertion();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.HeaderAssertion#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see edu.uoc.som.rest.test.HeaderAssertion#getKey()
	 * @see #getHeaderAssertion()
	 * @generated
	 */
	EAttribute getHeaderAssertion_Key();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.HeaderEqualsAssertion <em>Header Equals Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Equals Assertion</em>'.
	 * @see edu.uoc.som.rest.test.HeaderEqualsAssertion
	 * @generated
	 */
	EClass getHeaderEqualsAssertion();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.HeaderEqualsAssertion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.uoc.som.rest.test.HeaderEqualsAssertion#getValue()
	 * @see #getHeaderEqualsAssertion()
	 * @generated
	 */
	EAttribute getHeaderEqualsAssertion_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.HeaderExistsAssertion <em>Header Exists Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Exists Assertion</em>'.
	 * @see edu.uoc.som.rest.test.HeaderExistsAssertion
	 * @generated
	 */
	EClass getHeaderExistsAssertion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.HTTPStatusAssertion <em>HTTP Status Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Status Assertion</em>'.
	 * @see edu.uoc.som.rest.test.HTTPStatusAssertion
	 * @generated
	 */
	EClass getHTTPStatusAssertion();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.rest.test.HTTPStatusAssertion#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Code</em>'.
	 * @see edu.uoc.som.rest.test.HTTPStatusAssertion#getCode()
	 * @see #getHTTPStatusAssertion()
	 * @generated
	 */
	EAttribute getHTTPStatusAssertion_Code();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.InvalidStatusCodesAssertion <em>Invalid Status Codes Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Status Codes Assertion</em>'.
	 * @see edu.uoc.som.rest.test.InvalidStatusCodesAssertion
	 * @generated
	 */
	EClass getInvalidStatusCodesAssertion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.ValidStatusCodesAssertion <em>Valid Status Codes Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Status Codes Assertion</em>'.
	 * @see edu.uoc.som.rest.test.ValidStatusCodesAssertion
	 * @generated
	 */
	EClass getValidStatusCodesAssertion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.OpenAPIComplianceAssertion <em>Open API Compliance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open API Compliance Assertion</em>'.
	 * @see edu.uoc.som.rest.test.OpenAPIComplianceAssertion
	 * @generated
	 */
	EClass getOpenAPIComplianceAssertion();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.OpenAPIComplianceAssertion#getStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see edu.uoc.som.rest.test.OpenAPIComplianceAssertion#getStrict()
	 * @see #getOpenAPIComplianceAssertion()
	 * @generated
	 */
	EAttribute getOpenAPIComplianceAssertion_Strict();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization</em>'.
	 * @see edu.uoc.som.rest.test.Authorization
	 * @generated
	 */
	EClass getAuthorization();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see edu.uoc.som.rest.test.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Basic#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see edu.uoc.som.rest.test.Basic#getUsername()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Username();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Basic#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see edu.uoc.som.rest.test.Basic#getPassword()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Password();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2</em>'.
	 * @see edu.uoc.som.rest.test.OAuth2
	 * @generated
	 */
	EClass getOAuth2();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.OAuth2#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see edu.uoc.som.rest.test.OAuth2#getToken()
	 * @see #getOAuth2()
	 * @generated
	 */
	EAttribute getOAuth2_Token();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see edu.uoc.som.rest.test.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Body#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see edu.uoc.som.rest.test.Body#getMediaType()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.Body#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.uoc.som.rest.test.Body#getValue()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.PropertyTransfer <em>Property Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Transfer</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer
	 * @generated
	 */
	EClass getPropertyTransfer();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.rest.test.PropertyTransfer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getSource()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EReference getPropertyTransfer_Source();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyLocation <em>Source Property Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Property Location</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyLocation()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EAttribute getPropertyTransfer_SourcePropertyLocation();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.rest.test.PropertyTransfer#getSourceProperty <em>Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Property</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getSourceProperty()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EReference getPropertyTransfer_SourceProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyPath <em>Source Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Property Path</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyPath()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EAttribute getPropertyTransfer_SourcePropertyPath();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyPathValue <em>Source Property Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Property Path Value</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyPathValue()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EAttribute getPropertyTransfer_SourcePropertyPathValue();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.rest.test.PropertyTransfer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getTarget()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EReference getPropertyTransfer_Target();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyLocation <em>Target Property Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Property Location</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyLocation()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EAttribute getPropertyTransfer_TargetPropertyLocation();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getTargetProperty()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EReference getPropertyTransfer_TargetProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyPath <em>Target Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Property Path</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyPath()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EAttribute getPropertyTransfer_TargetPropertyPath();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyPathValue <em>Target Property Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Property Path Value</em>'.
	 * @see edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyPathValue()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EAttribute getPropertyTransfer_TargetPropertyPathValue();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.rest.test.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edu.uoc.som.rest.test.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.rest.test.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see edu.uoc.som.rest.test.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.rest.test.SchemeType <em>Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheme Type</em>'.
	 * @see edu.uoc.som.rest.test.SchemeType
	 * @generated
	 */
	EEnum getSchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.rest.test.HTTPMethod <em>HTTP Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Method</em>'.
	 * @see edu.uoc.som.rest.test.HTTPMethod
	 * @generated
	 */
	EEnum getHTTPMethod();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.rest.test.PathLanguage <em>Path Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Path Language</em>'.
	 * @see edu.uoc.som.rest.test.PathLanguage
	 * @generated
	 */
	EEnum getPathLanguage();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.rest.test.PropertyLocation <em>Property Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Location</em>'.
	 * @see edu.uoc.som.rest.test.PropertyLocation
	 * @generated
	 */
	EEnum getPropertyLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.TestSuiteImpl <em>Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.TestSuiteImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getTestSuite()
		 * @generated
		 */
		EClass TEST_SUITE = eINSTANCE.getTestSuite();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SUITE__DESCRIPTION = eINSTANCE.getTestSuite_Description();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SUITE__CREATED_AT = eINSTANCE.getTestSuite_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SUITE__UPDATED_AT = eINSTANCE.getTestSuite_UpdatedAt();

		/**
		 * The meta object literal for the '<em><b>Test Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE__TEST_STEPS = eINSTANCE.getTestSuite_TestSteps();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.TestCaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.TestCaseImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__DESCRIPTION = eINSTANCE.getTestCase_Description();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__TESTS = eINSTANCE.getTestCase_Tests();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.TestStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.TestStepImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getTestStep()
		 * @generated
		 */
		EClass TEST_STEP = eINSTANCE.getTestStep();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.RequestImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__HTTP_METHOD = eINSTANCE.getRequest_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__HOST = eINSTANCE.getRequest_Host();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__PATH = eINSTANCE.getRequest_Path();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__SCHEME = eINSTANCE.getRequest_Scheme();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__HEADERS = eINSTANCE.getRequest_Headers();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__PARAMETERS = eINSTANCE.getRequest_Parameters();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__ASSERTIONS = eINSTANCE.getRequest_Assertions();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__AUTHORIZATION = eINSTANCE.getRequest_Authorization();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__BODY = eINSTANCE.getRequest_Body();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.NamedElementImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.ParameterImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LOCATION = eINSTANCE.getParameter_Location();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.HeaderImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__KEY = eINSTANCE.getHeader_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__VALUE = eINSTANCE.getHeader_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.AssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__ERROR_MESSAGE = eINSTANCE.getAssertion_ErrorMessage();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.ComplianceAssertionImpl <em>Compliance Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.ComplianceAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getComplianceAssertion()
		 * @generated
		 */
		EClass COMPLIANCE_ASSERTION = eINSTANCE.getComplianceAssertion();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_ASSERTION__PATH = eINSTANCE.getComplianceAssertion_Path();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.PerformanceAssertionImpl <em>Performance Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.PerformanceAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getPerformanceAssertion()
		 * @generated
		 */
		EClass PERFORMANCE_ASSERTION = eINSTANCE.getPerformanceAssertion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.ResponseMessageAssertionImpl <em>Response Message Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.ResponseMessageAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getResponseMessageAssertion()
		 * @generated
		 */
		EClass RESPONSE_MESSAGE_ASSERTION = eINSTANCE.getResponseMessageAssertion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_MESSAGE_ASSERTION__VALUE = eINSTANCE.getResponseMessageAssertion_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.ContainsAssertionImpl <em>Contains Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.ContainsAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getContainsAssertion()
		 * @generated
		 */
		EClass CONTAINS_ASSERTION = eINSTANCE.getContainsAssertion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.EqualsAssertionImpl <em>Equals Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.EqualsAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getEqualsAssertion()
		 * @generated
		 */
		EClass EQUALS_ASSERTION = eINSTANCE.getEqualsAssertion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.SchemaComplianceAssertionImpl <em>Schema Compliance Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.SchemaComplianceAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getSchemaComplianceAssertion()
		 * @generated
		 */
		EClass SCHEMA_COMPLIANCE_ASSERTION = eINSTANCE.getSchemaComplianceAssertion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.SLAAssertionImpl <em>SLA Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.SLAAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getSLAAssertion()
		 * @generated
		 */
		EClass SLA_ASSERTION = eINSTANCE.getSLAAssertion();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLA_ASSERTION__MAX_TIME = eINSTANCE.getSLAAssertion_MaxTime();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.HeaderAssertionImpl <em>Header Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.HeaderAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHeaderAssertion()
		 * @generated
		 */
		EClass HEADER_ASSERTION = eINSTANCE.getHeaderAssertion();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_ASSERTION__KEY = eINSTANCE.getHeaderAssertion_Key();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.HeaderEqualsAssertionImpl <em>Header Equals Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.HeaderEqualsAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHeaderEqualsAssertion()
		 * @generated
		 */
		EClass HEADER_EQUALS_ASSERTION = eINSTANCE.getHeaderEqualsAssertion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_EQUALS_ASSERTION__VALUE = eINSTANCE.getHeaderEqualsAssertion_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.HeaderExistsAssertionImpl <em>Header Exists Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.HeaderExistsAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHeaderExistsAssertion()
		 * @generated
		 */
		EClass HEADER_EXISTS_ASSERTION = eINSTANCE.getHeaderExistsAssertion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.HTTPStatusAssertionImpl <em>HTTP Status Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.HTTPStatusAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHTTPStatusAssertion()
		 * @generated
		 */
		EClass HTTP_STATUS_ASSERTION = eINSTANCE.getHTTPStatusAssertion();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_STATUS_ASSERTION__CODE = eINSTANCE.getHTTPStatusAssertion_Code();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.InvalidStatusCodesAssertionImpl <em>Invalid Status Codes Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.InvalidStatusCodesAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getInvalidStatusCodesAssertion()
		 * @generated
		 */
		EClass INVALID_STATUS_CODES_ASSERTION = eINSTANCE.getInvalidStatusCodesAssertion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.ValidStatusCodesAssertionImpl <em>Valid Status Codes Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.ValidStatusCodesAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getValidStatusCodesAssertion()
		 * @generated
		 */
		EClass VALID_STATUS_CODES_ASSERTION = eINSTANCE.getValidStatusCodesAssertion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.OpenAPIComplianceAssertionImpl <em>Open API Compliance Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.OpenAPIComplianceAssertionImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getOpenAPIComplianceAssertion()
		 * @generated
		 */
		EClass OPEN_API_COMPLIANCE_ASSERTION = eINSTANCE.getOpenAPIComplianceAssertion();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_API_COMPLIANCE_ASSERTION__STRICT = eINSTANCE.getOpenAPIComplianceAssertion_Strict();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.AuthorizationImpl <em>Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.AuthorizationImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getAuthorization()
		 * @generated
		 */
		EClass AUTHORIZATION = eINSTANCE.getAuthorization();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.BasicImpl <em>Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.BasicImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getBasic()
		 * @generated
		 */
		EClass BASIC = eINSTANCE.getBasic();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__USERNAME = eINSTANCE.getBasic_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__PASSWORD = eINSTANCE.getBasic_Password();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.OAuth2Impl <em>OAuth2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.OAuth2Impl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getOAuth2()
		 * @generated
		 */
		EClass OAUTH2 = eINSTANCE.getOAuth2();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2__TOKEN = eINSTANCE.getOAuth2_Token();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.BodyImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__MEDIA_TYPE = eINSTANCE.getBody_MediaType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__VALUE = eINSTANCE.getBody_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl <em>Property Transfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.PropertyTransferImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getPropertyTransfer()
		 * @generated
		 */
		EClass PROPERTY_TRANSFER = eINSTANCE.getPropertyTransfer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TRANSFER__SOURCE = eINSTANCE.getPropertyTransfer_Source();

		/**
		 * The meta object literal for the '<em><b>Source Property Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TRANSFER__SOURCE_PROPERTY_LOCATION = eINSTANCE.getPropertyTransfer_SourcePropertyLocation();

		/**
		 * The meta object literal for the '<em><b>Source Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TRANSFER__SOURCE_PROPERTY = eINSTANCE.getPropertyTransfer_SourceProperty();

		/**
		 * The meta object literal for the '<em><b>Source Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH = eINSTANCE.getPropertyTransfer_SourcePropertyPath();

		/**
		 * The meta object literal for the '<em><b>Source Property Path Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH_VALUE = eINSTANCE.getPropertyTransfer_SourcePropertyPathValue();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TRANSFER__TARGET = eINSTANCE.getPropertyTransfer_Target();

		/**
		 * The meta object literal for the '<em><b>Target Property Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TRANSFER__TARGET_PROPERTY_LOCATION = eINSTANCE.getPropertyTransfer_TargetPropertyLocation();

		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TRANSFER__TARGET_PROPERTY = eINSTANCE.getPropertyTransfer_TargetProperty();

		/**
		 * The meta object literal for the '<em><b>Target Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TRANSFER__TARGET_PROPERTY_PATH = eINSTANCE.getPropertyTransfer_TargetPropertyPath();

		/**
		 * The meta object literal for the '<em><b>Target Property Path Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TRANSFER__TARGET_PROPERTY_PATH_VALUE = eINSTANCE.getPropertyTransfer_TargetPropertyPathValue();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.impl.PropertyImpl
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.ParameterLocation
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.SchemeType <em>Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.SchemeType
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getSchemeType()
		 * @generated
		 */
		EEnum SCHEME_TYPE = eINSTANCE.getSchemeType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.HTTPMethod <em>HTTP Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.HTTPMethod
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getHTTPMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHTTPMethod();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.PathLanguage <em>Path Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.PathLanguage
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getPathLanguage()
		 * @generated
		 */
		EEnum PATH_LANGUAGE = eINSTANCE.getPathLanguage();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.rest.test.PropertyLocation <em>Property Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.rest.test.PropertyLocation
		 * @see edu.uoc.som.rest.test.impl.TestPackageImpl#getPropertyLocation()
		 * @generated
		 */
		EEnum PROPERTY_LOCATION = eINSTANCE.getPropertyLocation();

	}

} //TestPackage
