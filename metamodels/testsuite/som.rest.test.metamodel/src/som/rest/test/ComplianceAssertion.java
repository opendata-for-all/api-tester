/**
 */
package som.rest.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.ComplianceAssertion#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see som.rest.test.TestPackage#getComplianceAssertion()
 * @model abstract="true"
 * @generated
 */
public interface ComplianceAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see som.rest.test.TestPackage#getComplianceAssertion_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link som.rest.test.ComplianceAssertion#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // ComplianceAssertion
