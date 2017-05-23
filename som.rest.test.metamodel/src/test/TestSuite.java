/**
 */
package test;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.TestSuite#getDescription <em>Description</em>}</li>
 *   <li>{@link test.TestSuite#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link test.TestSuite#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link test.TestSuite#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends NamedElement {
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
	 * @see test.TestPackage#getTestSuite_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link test.TestSuite#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see test.TestPackage#getTestSuite_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link test.TestSuite#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(String)
	 * @see test.TestPackage#getTestSuite_UpdatedAt()
	 * @model
	 * @generated
	 */
	String getUpdatedAt();

	/**
	 * Sets the value of the '{@link test.TestSuite#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(String value);

	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link test.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' containment reference list.
	 * @see test.TestPackage#getTestSuite_TestCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getTestCases();

} // TestSuite
