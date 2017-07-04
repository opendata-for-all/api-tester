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
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyLocation <em>Source Property Location</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyPath <em>Source Property Path</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyPathValue <em>Source Property Path Value</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyLocation <em>Target Property Location</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetProperty <em>Target Property</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyPath <em>Target Property Path</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyPathValue <em>Target Property Path Value</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer()
 * @model
 * @generated
 */
public interface PropertyTransfer extends TestStep {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TestStep)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_Source()
	 * @model
	 * @generated
	 */
	TestStep getSource();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TestStep value);

	/**
	 * Returns the value of the '<em><b>Source Property Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.rest.test.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Property Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property Location</em>' attribute.
	 * @see edu.uoc.som.rest.test.PropertyLocation
	 * @see #setSourcePropertyLocation(PropertyLocation)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_SourcePropertyLocation()
	 * @model
	 * @generated
	 */
	PropertyLocation getSourcePropertyLocation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyLocation <em>Source Property Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property Location</em>' attribute.
	 * @see edu.uoc.som.rest.test.PropertyLocation
	 * @see #getSourcePropertyLocation()
	 * @generated
	 */
	void setSourcePropertyLocation(PropertyLocation value);

	/**
	 * Returns the value of the '<em><b>Source Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property</em>' reference.
	 * @see #setSourceProperty(Property)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_SourceProperty()
	 * @model
	 * @generated
	 */
	Property getSourceProperty();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getSourceProperty <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property</em>' reference.
	 * @see #getSourceProperty()
	 * @generated
	 */
	void setSourceProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Source Property Path</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.rest.test.PathLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Property Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property Path</em>' attribute.
	 * @see edu.uoc.som.rest.test.PathLanguage
	 * @see #setSourcePropertyPath(PathLanguage)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_SourcePropertyPath()
	 * @model
	 * @generated
	 */
	PathLanguage getSourcePropertyPath();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyPath <em>Source Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property Path</em>' attribute.
	 * @see edu.uoc.som.rest.test.PathLanguage
	 * @see #getSourcePropertyPath()
	 * @generated
	 */
	void setSourcePropertyPath(PathLanguage value);

	/**
	 * Returns the value of the '<em><b>Source Property Path Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Property Path Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property Path Value</em>' attribute.
	 * @see #setSourcePropertyPathValue(String)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_SourcePropertyPathValue()
	 * @model
	 * @generated
	 */
	String getSourcePropertyPathValue();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getSourcePropertyPathValue <em>Source Property Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property Path Value</em>' attribute.
	 * @see #getSourcePropertyPathValue()
	 * @generated
	 */
	void setSourcePropertyPathValue(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TestStep)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_Target()
	 * @model
	 * @generated
	 */
	TestStep getTarget();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TestStep value);

	/**
	 * Returns the value of the '<em><b>Target Property Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.rest.test.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property Location</em>' attribute.
	 * @see edu.uoc.som.rest.test.PropertyLocation
	 * @see #setTargetPropertyLocation(PropertyLocation)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_TargetPropertyLocation()
	 * @model
	 * @generated
	 */
	PropertyLocation getTargetPropertyLocation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyLocation <em>Target Property Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property Location</em>' attribute.
	 * @see edu.uoc.som.rest.test.PropertyLocation
	 * @see #getTargetPropertyLocation()
	 * @generated
	 */
	void setTargetPropertyLocation(PropertyLocation value);

	/**
	 * Returns the value of the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property</em>' reference.
	 * @see #setTargetProperty(Property)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_TargetProperty()
	 * @model
	 * @generated
	 */
	Property getTargetProperty();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetProperty <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property</em>' reference.
	 * @see #getTargetProperty()
	 * @generated
	 */
	void setTargetProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Target Property Path</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.rest.test.PathLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property Path</em>' attribute.
	 * @see edu.uoc.som.rest.test.PathLanguage
	 * @see #setTargetPropertyPath(PathLanguage)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_TargetPropertyPath()
	 * @model
	 * @generated
	 */
	PathLanguage getTargetPropertyPath();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyPath <em>Target Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property Path</em>' attribute.
	 * @see edu.uoc.som.rest.test.PathLanguage
	 * @see #getTargetPropertyPath()
	 * @generated
	 */
	void setTargetPropertyPath(PathLanguage value);

	/**
	 * Returns the value of the '<em><b>Target Property Path Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property Path Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property Path Value</em>' attribute.
	 * @see #setTargetPropertyPathValue(String)
	 * @see edu.uoc.som.rest.test.TestPackage#getPropertyTransfer_TargetPropertyPathValue()
	 * @model
	 * @generated
	 */
	String getTargetPropertyPathValue();

	/**
	 * Sets the value of the '{@link edu.uoc.som.rest.test.PropertyTransfer#getTargetPropertyPathValue <em>Target Property Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property Path Value</em>' attribute.
	 * @see #getTargetPropertyPathValue()
	 * @generated
	 */
	void setTargetPropertyPathValue(String value);

} // PropertyTransfer
