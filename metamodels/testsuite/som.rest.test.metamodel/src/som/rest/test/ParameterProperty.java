/**
 */
package som.rest.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.ParameterProperty#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see som.rest.test.TestPackage#getParameterProperty()
 * @model
 * @generated
 */
public interface ParameterProperty extends InputProperty {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see som.rest.test.TestPackage#getParameterProperty_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link som.rest.test.ParameterProperty#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterProperty
