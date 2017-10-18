/**
 */
package som.rest.test;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.APIRequest#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link som.rest.test.APIRequest#getContentType <em>Content Type</em>}</li>
 *   <li>{@link som.rest.test.APIRequest#getAccept <em>Accept</em>}</li>
 *   <li>{@link som.rest.test.APIRequest#getScheme <em>Scheme</em>}</li>
 *   <li>{@link som.rest.test.APIRequest#getParameters <em>Parameters</em>}</li>
 *   <li>{@link som.rest.test.APIRequest#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link som.rest.test.APIRequest#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @see som.rest.test.TestPackage#getAPIRequest()
 * @model
 * @generated
 */
public interface APIRequest extends TestStep {
	/**
	 * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(String)
	 * @see som.rest.test.TestPackage#getAPIRequest_OperationId()
	 * @model
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link som.rest.test.APIRequest#getOperationId <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Id</em>' attribute.
	 * @see #getOperationId()
	 * @generated
	 */
	void setOperationId(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see som.rest.test.TestPackage#getAPIRequest_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link som.rest.test.APIRequest#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Accept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept</em>' attribute.
	 * @see #setAccept(String)
	 * @see som.rest.test.TestPackage#getAPIRequest_Accept()
	 * @model
	 * @generated
	 */
	String getAccept();

	/**
	 * Sets the value of the '{@link som.rest.test.APIRequest#getAccept <em>Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept</em>' attribute.
	 * @see #getAccept()
	 * @generated
	 */
	void setAccept(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * The literals are from the enumeration {@link som.rest.test.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see som.rest.test.SchemeType
	 * @see #setScheme(SchemeType)
	 * @see som.rest.test.TestPackage#getAPIRequest_Scheme()
	 * @model
	 * @generated
	 */
	SchemeType getScheme();

	/**
	 * Sets the value of the '{@link som.rest.test.APIRequest#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see som.rest.test.SchemeType
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(SchemeType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link som.rest.test.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see som.rest.test.TestPackage#getAPIRequest_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link som.rest.test.Assertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see som.rest.test.TestPackage#getAPIRequest_Assertions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assertion> getAssertions();

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' containment reference.
	 * @see #setAuthorization(Authorization)
	 * @see som.rest.test.TestPackage#getAPIRequest_Authorization()
	 * @model containment="true"
	 * @generated
	 */
	Authorization getAuthorization();

	/**
	 * Sets the value of the '{@link som.rest.test.APIRequest#getAuthorization <em>Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' containment reference.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(Authorization value);

} // APIRequest
