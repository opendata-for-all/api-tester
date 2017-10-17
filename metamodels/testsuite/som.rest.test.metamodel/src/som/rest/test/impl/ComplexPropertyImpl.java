/**
 */
package som.rest.test.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import som.rest.test.ComplexProperty;
import som.rest.test.PathLanguage;
import som.rest.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.impl.ComplexPropertyImpl#getPathLanguage <em>Path Language</em>}</li>
 *   <li>{@link som.rest.test.impl.ComplexPropertyImpl#getPathValue <em>Path Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComplexPropertyImpl extends PropertyImpl implements ComplexProperty {
	/**
	 * The default value of the '{@link #getPathLanguage() <em>Path Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final PathLanguage PATH_LANGUAGE_EDEFAULT = PathLanguage.UNDEFINED;

	/**
	 * The cached value of the '{@link #getPathLanguage() <em>Path Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLanguage()
	 * @generated
	 * @ordered
	 */
	protected PathLanguage pathLanguage = PATH_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathValue() <em>Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathValue()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathValue() <em>Path Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathValue()
	 * @generated
	 * @ordered
	 */
	protected String pathValue = PATH_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.COMPLEX_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathLanguage getPathLanguage() {
		return pathLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathLanguage(PathLanguage newPathLanguage) {
		PathLanguage oldPathLanguage = pathLanguage;
		pathLanguage = newPathLanguage == null ? PATH_LANGUAGE_EDEFAULT : newPathLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.COMPLEX_PROPERTY__PATH_LANGUAGE, oldPathLanguage, pathLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathValue() {
		return pathValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathValue(String newPathValue) {
		String oldPathValue = pathValue;
		pathValue = newPathValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.COMPLEX_PROPERTY__PATH_VALUE, oldPathValue, pathValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.COMPLEX_PROPERTY__PATH_LANGUAGE:
				return getPathLanguage();
			case TestPackage.COMPLEX_PROPERTY__PATH_VALUE:
				return getPathValue();
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
			case TestPackage.COMPLEX_PROPERTY__PATH_LANGUAGE:
				setPathLanguage((PathLanguage)newValue);
				return;
			case TestPackage.COMPLEX_PROPERTY__PATH_VALUE:
				setPathValue((String)newValue);
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
			case TestPackage.COMPLEX_PROPERTY__PATH_LANGUAGE:
				setPathLanguage(PATH_LANGUAGE_EDEFAULT);
				return;
			case TestPackage.COMPLEX_PROPERTY__PATH_VALUE:
				setPathValue(PATH_VALUE_EDEFAULT);
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
			case TestPackage.COMPLEX_PROPERTY__PATH_LANGUAGE:
				return pathLanguage != PATH_LANGUAGE_EDEFAULT;
			case TestPackage.COMPLEX_PROPERTY__PATH_VALUE:
				return PATH_VALUE_EDEFAULT == null ? pathValue != null : !PATH_VALUE_EDEFAULT.equals(pathValue);
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
		result.append(" (pathLanguage: ");
		result.append(pathLanguage);
		result.append(", pathValue: ");
		result.append(pathValue);
		result.append(')');
		return result.toString();
	}

} //ComplexPropertyImpl
