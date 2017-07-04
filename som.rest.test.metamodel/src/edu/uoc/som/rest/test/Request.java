/**
 */
package edu.uoc.som.rest.test;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.rest.test.Request#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.Request#getHost <em>Host</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.Request#getPath <em>Path</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.Request#getScheme <em>Scheme</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.Request#getHeaders <em>Headers</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.Request#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.Request#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.Request#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.Request#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.rest.test.TestPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends TestStep {
	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.rest.test.HTTPMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see edu.uoc.som.rest.test.HTTPMethod
	 * @see #setHttpMethod(HTTPMethod)
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_HttpMethod()
	 * @model
	 * @generated
	 */
	HTTPMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.Request#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see edu.uoc.som.rest.test.HTTPMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HTTPMethod value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.Request#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

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
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.Request#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.rest.test.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see edu.uoc.som.rest.test.SchemeType
	 * @see #setScheme(SchemeType)
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_Scheme()
	 * @model
	 * @generated
	 */
	SchemeType getScheme();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.Request#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see edu.uoc.som.rest.test.SchemeType
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(SchemeType value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.rest.test.Header}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_Headers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Header> getHeaders();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.rest.test.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.rest.test.Assertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_Assertions()
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
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_Authorization()
	 * @model containment="true"
	 * @generated
	 */
	Authorization getAuthorization();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.Request#getAuthorization <em>Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' containment reference.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(Authorization value);

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
	 * @see edu.uoc.som.rest.test.TestPackage#getRequest_Body()
	 * @model
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.Request#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

} // Request
