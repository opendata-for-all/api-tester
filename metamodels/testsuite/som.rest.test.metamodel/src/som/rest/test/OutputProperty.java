/**
 */
package som.rest.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.OutputProperty#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @see som.rest.test.TestPackage#getOutputProperty()
 * @model abstract="true"
 * @generated
 */
public interface OutputProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(APIRequest)
	 * @see som.rest.test.TestPackage#getOutputProperty_Request()
	 * @model required="true"
	 * @generated
	 */
	APIRequest getRequest();

	/**
	 * Sets the value of the '{@link som.rest.test.OutputProperty#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(APIRequest value);

} // OutputProperty
