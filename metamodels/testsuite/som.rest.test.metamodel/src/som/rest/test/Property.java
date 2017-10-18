/**
 */
package som.rest.test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.Property#getExpression <em>Expression</em>}</li>
 *   <li>{@link som.rest.test.Property#getPathLanguage <em>Path Language</em>}</li>
 * </ul>
 *
 * @see som.rest.test.TestPackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see som.rest.test.TestPackage#getProperty_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link som.rest.test.Property#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Path Language</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * The literals are from the enumeration {@link som.rest.test.PathLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Language</em>' attribute.
	 * @see som.rest.test.PathLanguage
	 * @see #setPathLanguage(PathLanguage)
	 * @see som.rest.test.TestPackage#getProperty_PathLanguage()
	 * @model default="undefined"
	 * @generated
	 */
	PathLanguage getPathLanguage();

	/**
	 * Sets the value of the '{@link som.rest.test.Property#getPathLanguage <em>Path Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Language</em>' attribute.
	 * @see som.rest.test.PathLanguage
	 * @see #getPathLanguage()
	 * @generated
	 */
	void setPathLanguage(PathLanguage value);

} // Property
