/**
 */
package test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.OAuth2#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getOAuth2()
 * @model
 * @generated
 */
public interface OAuth2 extends Authorization {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see test.TestPackage#getOAuth2_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link test.OAuth2#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // OAuth2
