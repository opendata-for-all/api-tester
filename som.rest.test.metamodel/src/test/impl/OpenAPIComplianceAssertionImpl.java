/**
 */
package test.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import test.OpenAPIComplianceAssertion;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open API Compliance Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.impl.OpenAPIComplianceAssertionImpl#getStrict <em>Strict</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenAPIComplianceAssertionImpl extends ComplianceAssertionImpl implements OpenAPIComplianceAssertion {
	/**
	 * The default value of the '{@link #getStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrict()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STRICT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrict()
	 * @generated
	 * @ordered
	 */
	protected Boolean strict = STRICT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenAPIComplianceAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.OPEN_API_COMPLIANCE_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStrict() {
		return strict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrict(Boolean newStrict) {
		Boolean oldStrict = strict;
		strict = newStrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.OPEN_API_COMPLIANCE_ASSERTION__STRICT, oldStrict, strict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.OPEN_API_COMPLIANCE_ASSERTION__STRICT:
				return getStrict();
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
			case TestPackage.OPEN_API_COMPLIANCE_ASSERTION__STRICT:
				setStrict((Boolean)newValue);
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
			case TestPackage.OPEN_API_COMPLIANCE_ASSERTION__STRICT:
				setStrict(STRICT_EDEFAULT);
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
			case TestPackage.OPEN_API_COMPLIANCE_ASSERTION__STRICT:
				return STRICT_EDEFAULT == null ? strict != null : !STRICT_EDEFAULT.equals(strict);
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
		result.append(" (strict: ");
		result.append(strict);
		result.append(')');
		return result.toString();
	}

} //OpenAPIComplianceAssertionImpl
