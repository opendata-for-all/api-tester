/**
 */
package test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.HeaderAssertion#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getHeaderAssertion()
 * @model abstract="true"
 * @generated
 */
public interface HeaderAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see test.TestPackage#getHeaderAssertion_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link test.HeaderAssertion#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // HeaderAssertion
