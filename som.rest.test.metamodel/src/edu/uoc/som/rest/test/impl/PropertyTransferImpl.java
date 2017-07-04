/**
 */
package edu.uoc.som.rest.test.impl;

import edu.uoc.som.rest.test.PathLanguage;
import edu.uoc.som.rest.test.Property;
import edu.uoc.som.rest.test.PropertyLocation;
import edu.uoc.som.rest.test.PropertyTransfer;
import edu.uoc.som.rest.test.TestPackage;
import edu.uoc.som.rest.test.TestStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Transfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getSource <em>Source</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getSourcePropertyLocation <em>Source Property Location</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getSourcePropertyPath <em>Source Property Path</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getSourcePropertyPathValue <em>Source Property Path Value</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getTargetPropertyLocation <em>Target Property Location</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getTargetProperty <em>Target Property</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getTargetPropertyPath <em>Target Property Path</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.PropertyTransferImpl#getTargetPropertyPathValue <em>Target Property Path Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyTransferImpl extends TestStepImpl implements PropertyTransfer {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TestStep source;

	/**
	 * The default value of the '{@link #getSourcePropertyLocation() <em>Source Property Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyLocation()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyLocation SOURCE_PROPERTY_LOCATION_EDEFAULT = PropertyLocation.UNDEFINED;

	/**
	 * The cached value of the '{@link #getSourcePropertyLocation() <em>Source Property Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyLocation()
	 * @generated
	 * @ordered
	 */
	protected PropertyLocation sourcePropertyLocation = SOURCE_PROPERTY_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceProperty() <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProperty()
	 * @generated
	 * @ordered
	 */
	protected Property sourceProperty;

	/**
	 * The default value of the '{@link #getSourcePropertyPath() <em>Source Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final PathLanguage SOURCE_PROPERTY_PATH_EDEFAULT = PathLanguage.UNDEFINED;

	/**
	 * The cached value of the '{@link #getSourcePropertyPath() <em>Source Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyPath()
	 * @generated
	 * @ordered
	 */
	protected PathLanguage sourcePropertyPath = SOURCE_PROPERTY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcePropertyPathValue() <em>Source Property Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyPathValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PROPERTY_PATH_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePropertyPathValue() <em>Source Property Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyPathValue()
	 * @generated
	 * @ordered
	 */
	protected String sourcePropertyPathValue = SOURCE_PROPERTY_PATH_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TestStep target;

	/**
	 * The default value of the '{@link #getTargetPropertyLocation() <em>Target Property Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyLocation()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyLocation TARGET_PROPERTY_LOCATION_EDEFAULT = PropertyLocation.UNDEFINED;

	/**
	 * The cached value of the '{@link #getTargetPropertyLocation() <em>Target Property Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyLocation()
	 * @generated
	 * @ordered
	 */
	protected PropertyLocation targetPropertyLocation = TARGET_PROPERTY_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetProperty() <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProperty()
	 * @generated
	 * @ordered
	 */
	protected Property targetProperty;

	/**
	 * The default value of the '{@link #getTargetPropertyPath() <em>Target Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final PathLanguage TARGET_PROPERTY_PATH_EDEFAULT = PathLanguage.UNDEFINED;

	/**
	 * The cached value of the '{@link #getTargetPropertyPath() <em>Target Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected PathLanguage targetPropertyPath = TARGET_PROPERTY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPropertyPathValue() <em>Target Property Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyPathValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PROPERTY_PATH_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPropertyPathValue() <em>Target Property Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyPathValue()
	 * @generated
	 * @ordered
	 */
	protected String targetPropertyPathValue = TARGET_PROPERTY_PATH_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyTransferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.PROPERTY_TRANSFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestStep getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (TestStep)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.PROPERTY_TRANSFER__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestStep basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(TestStep newSource) {
		TestStep oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyLocation getSourcePropertyLocation() {
		return sourcePropertyLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePropertyLocation(PropertyLocation newSourcePropertyLocation) {
		PropertyLocation oldSourcePropertyLocation = sourcePropertyLocation;
		sourcePropertyLocation = newSourcePropertyLocation == null ? SOURCE_PROPERTY_LOCATION_EDEFAULT : newSourcePropertyLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_LOCATION, oldSourcePropertyLocation, sourcePropertyLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSourceProperty() {
		if (sourceProperty != null && sourceProperty.eIsProxy()) {
			InternalEObject oldSourceProperty = (InternalEObject)sourceProperty;
			sourceProperty = (Property)eResolveProxy(oldSourceProperty);
			if (sourceProperty != oldSourceProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
			}
		}
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetSourceProperty() {
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProperty(Property newSourceProperty) {
		Property oldSourceProperty = sourceProperty;
		sourceProperty = newSourceProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathLanguage getSourcePropertyPath() {
		return sourcePropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePropertyPath(PathLanguage newSourcePropertyPath) {
		PathLanguage oldSourcePropertyPath = sourcePropertyPath;
		sourcePropertyPath = newSourcePropertyPath == null ? SOURCE_PROPERTY_PATH_EDEFAULT : newSourcePropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH, oldSourcePropertyPath, sourcePropertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourcePropertyPathValue() {
		return sourcePropertyPathValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePropertyPathValue(String newSourcePropertyPathValue) {
		String oldSourcePropertyPathValue = sourcePropertyPathValue;
		sourcePropertyPathValue = newSourcePropertyPathValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH_VALUE, oldSourcePropertyPathValue, sourcePropertyPathValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestStep getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (TestStep)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.PROPERTY_TRANSFER__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestStep basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TestStep newTarget) {
		TestStep oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyLocation getTargetPropertyLocation() {
		return targetPropertyLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPropertyLocation(PropertyLocation newTargetPropertyLocation) {
		PropertyLocation oldTargetPropertyLocation = targetPropertyLocation;
		targetPropertyLocation = newTargetPropertyLocation == null ? TARGET_PROPERTY_LOCATION_EDEFAULT : newTargetPropertyLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_LOCATION, oldTargetPropertyLocation, targetPropertyLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getTargetProperty() {
		if (targetProperty != null && targetProperty.eIsProxy()) {
			InternalEObject oldTargetProperty = (InternalEObject)targetProperty;
			targetProperty = (Property)eResolveProxy(oldTargetProperty);
			if (targetProperty != oldTargetProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY, oldTargetProperty, targetProperty));
			}
		}
		return targetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetTargetProperty() {
		return targetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProperty(Property newTargetProperty) {
		Property oldTargetProperty = targetProperty;
		targetProperty = newTargetProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY, oldTargetProperty, targetProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathLanguage getTargetPropertyPath() {
		return targetPropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPropertyPath(PathLanguage newTargetPropertyPath) {
		PathLanguage oldTargetPropertyPath = targetPropertyPath;
		targetPropertyPath = newTargetPropertyPath == null ? TARGET_PROPERTY_PATH_EDEFAULT : newTargetPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH, oldTargetPropertyPath, targetPropertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetPropertyPathValue() {
		return targetPropertyPathValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPropertyPathValue(String newTargetPropertyPathValue) {
		String oldTargetPropertyPathValue = targetPropertyPathValue;
		targetPropertyPathValue = newTargetPropertyPathValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH_VALUE, oldTargetPropertyPathValue, targetPropertyPathValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.PROPERTY_TRANSFER__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_LOCATION:
				return getSourcePropertyLocation();
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY:
				if (resolve) return getSourceProperty();
				return basicGetSourceProperty();
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH:
				return getSourcePropertyPath();
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH_VALUE:
				return getSourcePropertyPathValue();
			case TestPackage.PROPERTY_TRANSFER__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_LOCATION:
				return getTargetPropertyLocation();
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY:
				if (resolve) return getTargetProperty();
				return basicGetTargetProperty();
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH:
				return getTargetPropertyPath();
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH_VALUE:
				return getTargetPropertyPathValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestPackage.PROPERTY_TRANSFER__SOURCE:
				setSource((TestStep)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_LOCATION:
				setSourcePropertyLocation((PropertyLocation)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY:
				setSourceProperty((Property)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH:
				setSourcePropertyPath((PathLanguage)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH_VALUE:
				setSourcePropertyPathValue((String)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET:
				setTarget((TestStep)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_LOCATION:
				setTargetPropertyLocation((PropertyLocation)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY:
				setTargetProperty((Property)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH:
				setTargetPropertyPath((PathLanguage)newValue);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH_VALUE:
				setTargetPropertyPathValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestPackage.PROPERTY_TRANSFER__SOURCE:
				setSource((TestStep)null);
				return;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_LOCATION:
				setSourcePropertyLocation(SOURCE_PROPERTY_LOCATION_EDEFAULT);
				return;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY:
				setSourceProperty((Property)null);
				return;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH:
				setSourcePropertyPath(SOURCE_PROPERTY_PATH_EDEFAULT);
				return;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH_VALUE:
				setSourcePropertyPathValue(SOURCE_PROPERTY_PATH_VALUE_EDEFAULT);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET:
				setTarget((TestStep)null);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_LOCATION:
				setTargetPropertyLocation(TARGET_PROPERTY_LOCATION_EDEFAULT);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY:
				setTargetProperty((Property)null);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH:
				setTargetPropertyPath(TARGET_PROPERTY_PATH_EDEFAULT);
				return;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH_VALUE:
				setTargetPropertyPathValue(TARGET_PROPERTY_PATH_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestPackage.PROPERTY_TRANSFER__SOURCE:
				return source != null;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_LOCATION:
				return sourcePropertyLocation != SOURCE_PROPERTY_LOCATION_EDEFAULT;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY:
				return sourceProperty != null;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH:
				return sourcePropertyPath != SOURCE_PROPERTY_PATH_EDEFAULT;
			case TestPackage.PROPERTY_TRANSFER__SOURCE_PROPERTY_PATH_VALUE:
				return SOURCE_PROPERTY_PATH_VALUE_EDEFAULT == null ? sourcePropertyPathValue != null : !SOURCE_PROPERTY_PATH_VALUE_EDEFAULT.equals(sourcePropertyPathValue);
			case TestPackage.PROPERTY_TRANSFER__TARGET:
				return target != null;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_LOCATION:
				return targetPropertyLocation != TARGET_PROPERTY_LOCATION_EDEFAULT;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY:
				return targetProperty != null;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH:
				return targetPropertyPath != TARGET_PROPERTY_PATH_EDEFAULT;
			case TestPackage.PROPERTY_TRANSFER__TARGET_PROPERTY_PATH_VALUE:
				return TARGET_PROPERTY_PATH_VALUE_EDEFAULT == null ? targetPropertyPathValue != null : !TARGET_PROPERTY_PATH_VALUE_EDEFAULT.equals(targetPropertyPathValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sourcePropertyLocation: ");
		result.append(sourcePropertyLocation);
		result.append(", sourcePropertyPath: ");
		result.append(sourcePropertyPath);
		result.append(", sourcePropertyPathValue: ");
		result.append(sourcePropertyPathValue);
		result.append(", targetPropertyLocation: ");
		result.append(targetPropertyLocation);
		result.append(", targetPropertyPath: ");
		result.append(targetPropertyPath);
		result.append(", targetPropertyPathValue: ");
		result.append(targetPropertyPathValue);
		result.append(')');
		return result.toString();
	}

} //PropertyTransferImpl
