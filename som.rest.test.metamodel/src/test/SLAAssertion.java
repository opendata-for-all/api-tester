/**
 */
package test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLA Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.SLAAssertion#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getSLAAssertion()
 * @model
 * @generated
 */
public interface SLAAssertion extends PerformanceAssertion {
	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(Integer)
	 * @see test.TestPackage#getSLAAssertion_MaxTime()
	 * @model
	 * @generated
	 */
	Integer getMaxTime();

	/**
	 * Sets the value of the '{@link test.SLAAssertion#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(Integer value);

} // SLAAssertion
