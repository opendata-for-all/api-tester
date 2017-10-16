/**
 */
package edu.uoc.som.rest.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.rest.test.ComplexProperty#getPathLanguage <em>Path Language</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.ComplexProperty#getPathValue <em>Path Value</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.rest.test.TestPackage#getComplexProperty()
 * @model abstract="true"
 * @generated
 */
public interface ComplexProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Path Language</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * The literals are from the enumeration {@link edu.uoc.som.rest.test.PathLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Language</em>' attribute.
	 * @see edu.uoc.som.rest.test.PathLanguage
	 * @see #setPathLanguage(PathLanguage)
	 * @see edu.uoc.som.rest.test.TestPackage#getComplexProperty_PathLanguage()
	 * @model default="undefined"
	 * @generated
	 */
	PathLanguage getPathLanguage();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.ComplexProperty#getPathLanguage <em>Path Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Language</em>' attribute.
	 * @see edu.uoc.som.rest.test.PathLanguage
	 * @see #getPathLanguage()
	 * @generated
	 */
	void setPathLanguage(PathLanguage value);

	/**
	 * Returns the value of the '<em><b>Path Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Value</em>' attribute.
	 * @see #setPathValue(String)
	 * @see edu.uoc.som.rest.test.TestPackage#getComplexProperty_PathValue()
	 * @model
	 * @generated
	 */
	String getPathValue();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.ComplexProperty#getPathValue <em>Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Value</em>' attribute.
	 * @see #getPathValue()
	 * @generated
	 */
	void setPathValue(String value);

} // ComplexProperty
