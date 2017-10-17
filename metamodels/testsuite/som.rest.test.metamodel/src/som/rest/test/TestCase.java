/**
 */
package som.rest.test;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.TestCase#getDescription <em>Description</em>}</li>
 *   <li>{@link som.rest.test.TestCase#getTestSteps <em>Test Steps</em>}</li>
 * </ul>
 *
 * @see som.rest.test.TestPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see som.rest.test.TestPackage#getTestCase_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link som.rest.test.TestCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Test Steps</b></em>' containment reference list.
	 * The list contents are of type {@link som.rest.test.TestStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Steps</em>' containment reference list.
	 * @see som.rest.test.TestPackage#getTestCase_TestSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestStep> getTestSteps();

} // TestCase
