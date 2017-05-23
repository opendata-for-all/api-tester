/**
 */
package test;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Status Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.HTTPStatusAssertion#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getHTTPStatusAssertion()
 * @model abstract="true"
 * @generated
 */
public interface HTTPStatusAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute list.
	 * @see test.TestPackage#getHTTPStatusAssertion_Code()
	 * @model
	 * @generated
	 */
	EList<String> getCode();

} // HTTPStatusAssertion
