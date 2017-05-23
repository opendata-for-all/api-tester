/**
 */
package test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open API Compliance Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.OpenAPIComplianceAssertion#getStrict <em>Strict</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getOpenAPIComplianceAssertion()
 * @model
 * @generated
 */
public interface OpenAPIComplianceAssertion extends ComplianceAssertion {
	/**
	 * Returns the value of the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict</em>' attribute.
	 * @see #setStrict(Boolean)
	 * @see test.TestPackage#getOpenAPIComplianceAssertion_Strict()
	 * @model
	 * @generated
	 */
	Boolean getStrict();

	/**
	 * Sets the value of the '{@link test.OpenAPIComplianceAssertion#getStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' attribute.
	 * @see #getStrict()
	 * @generated
	 */
	void setStrict(Boolean value);

} // OpenAPIComplianceAssertion
