/**
 */
package edu.uoc.som.rest.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Transfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getSource <em>Source</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer()
 * @model
 * @generated
 */
public interface PropertyTransfer extends TestStep {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Property)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Property getSource();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Property value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Property)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Property getTarget();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Property value);

} // PropertyTransfer
