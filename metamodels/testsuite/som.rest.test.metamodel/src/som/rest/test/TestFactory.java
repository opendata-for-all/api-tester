/**
 */
package som.rest.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see som.rest.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestFactory eINSTANCE = som.rest.test.impl.TestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suite</em>'.
	 * @generated
	 */
	TestSuite createTestSuite();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	TestCase createTestCase();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>Contains Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains Assertion</em>'.
	 * @generated
	 */
	ContainsAssertion createContainsAssertion();

	/**
	 * Returns a new object of class '<em>Equals Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equals Assertion</em>'.
	 * @generated
	 */
	EqualsAssertion createEqualsAssertion();

	/**
	 * Returns a new object of class '<em>Schema Compliance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Compliance Assertion</em>'.
	 * @generated
	 */
	SchemaComplianceAssertion createSchemaComplianceAssertion();

	/**
	 * Returns a new object of class '<em>SLA Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLA Assertion</em>'.
	 * @generated
	 */
	SLAAssertion createSLAAssertion();

	/**
	 * Returns a new object of class '<em>Header Equals Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Equals Assertion</em>'.
	 * @generated
	 */
	HeaderEqualsAssertion createHeaderEqualsAssertion();

	/**
	 * Returns a new object of class '<em>Header Exists Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Exists Assertion</em>'.
	 * @generated
	 */
	HeaderExistsAssertion createHeaderExistsAssertion();

	/**
	 * Returns a new object of class '<em>Invalid Status Codes Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Status Codes Assertion</em>'.
	 * @generated
	 */
	InvalidStatusCodesAssertion createInvalidStatusCodesAssertion();

	/**
	 * Returns a new object of class '<em>Valid Status Codes Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Status Codes Assertion</em>'.
	 * @generated
	 */
	ValidStatusCodesAssertion createValidStatusCodesAssertion();

	/**
	 * Returns a new object of class '<em>Open API Compliance Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open API Compliance Assertion</em>'.
	 * @generated
	 */
	OpenAPIComplianceAssertion createOpenAPIComplianceAssertion();

	/**
	 * Returns a new object of class '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic</em>'.
	 * @generated
	 */
	Basic createBasic();

	/**
	 * Returns a new object of class '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth2</em>'.
	 * @generated
	 */
	OAuth2 createOAuth2();

	/**
	 * Returns a new object of class '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body</em>'.
	 * @generated
	 */
	Body createBody();

	/**
	 * Returns a new object of class '<em>Property Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Transfer</em>'.
	 * @generated
	 */
	PropertyTransfer createPropertyTransfer();

	/**
	 * Returns a new object of class '<em>Header Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Property</em>'.
	 * @generated
	 */
	HeaderProperty createHeaderProperty();

	/**
	 * Returns a new object of class '<em>Parameter Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Property</em>'.
	 * @generated
	 */
	ParameterProperty createParameterProperty();

	/**
	 * Returns a new object of class '<em>Response Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Property</em>'.
	 * @generated
	 */
	ResponseProperty createResponseProperty();

	/**
	 * Returns a new object of class '<em>Body Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Property</em>'.
	 * @generated
	 */
	BodyProperty createBodyProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestPackage getTestPackage();

} //TestFactory
