/**
 */
package som.rest.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.BodyProperty#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see som.rest.test.TestPackage#getBodyProperty()
 * @model
 * @generated
 */
public interface BodyProperty extends ComplexProperty {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Body)
	 * @see som.rest.test.TestPackage#getBodyProperty_Body()
	 * @model required="true"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link som.rest.test.BodyProperty#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

} // BodyProperty
