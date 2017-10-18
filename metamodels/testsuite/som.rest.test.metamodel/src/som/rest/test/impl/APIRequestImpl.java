/**
 */
package som.rest.test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import som.rest.test.APIRequest;
import som.rest.test.Assertion;
import som.rest.test.Authorization;
import som.rest.test.Parameter;
import som.rest.test.SchemeType;
import som.rest.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link som.rest.test.impl.APIRequestImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link som.rest.test.impl.APIRequestImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link som.rest.test.impl.APIRequestImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link som.rest.test.impl.APIRequestImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link som.rest.test.impl.APIRequestImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link som.rest.test.impl.APIRequestImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link som.rest.test.impl.APIRequestImpl#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIRequestImpl extends TestStepImpl implements APIRequest {
	/**
	 * The default value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected String operationId = OPERATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccept() <em>Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccept() <em>Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected String accept = ACCEPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final SchemeType SCHEME_EDEFAULT = SchemeType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected SchemeType scheme = SCHEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assertion> assertions;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected Authorization authorization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.API_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationId() {
		return operationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationId(String newOperationId) {
		String oldOperationId = operationId;
		operationId = newOperationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.API_REQUEST__OPERATION_ID, oldOperationId, operationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.API_REQUEST__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccept() {
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccept(String newAccept) {
		String oldAccept = accept;
		accept = newAccept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.API_REQUEST__ACCEPT, oldAccept, accept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemeType getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(SchemeType newScheme) {
		SchemeType oldScheme = scheme;
		scheme = newScheme == null ? SCHEME_EDEFAULT : newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.API_REQUEST__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, TestPackage.API_REQUEST__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assertion> getAssertions() {
		if (assertions == null) {
			assertions = new EObjectContainmentEList<Assertion>(Assertion.class, this, TestPackage.API_REQUEST__ASSERTIONS);
		}
		return assertions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorization getAuthorization() {
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorization(Authorization newAuthorization, NotificationChain msgs) {
		Authorization oldAuthorization = authorization;
		authorization = newAuthorization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.API_REQUEST__AUTHORIZATION, oldAuthorization, newAuthorization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(Authorization newAuthorization) {
		if (newAuthorization != authorization) {
			NotificationChain msgs = null;
			if (authorization != null)
				msgs = ((InternalEObject)authorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.API_REQUEST__AUTHORIZATION, null, msgs);
			if (newAuthorization != null)
				msgs = ((InternalEObject)newAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.API_REQUEST__AUTHORIZATION, null, msgs);
			msgs = basicSetAuthorization(newAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.API_REQUEST__AUTHORIZATION, newAuthorization, newAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.API_REQUEST__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TestPackage.API_REQUEST__ASSERTIONS:
				return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
			case TestPackage.API_REQUEST__AUTHORIZATION:
				return basicSetAuthorization(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.API_REQUEST__OPERATION_ID:
				return getOperationId();
			case TestPackage.API_REQUEST__CONTENT_TYPE:
				return getContentType();
			case TestPackage.API_REQUEST__ACCEPT:
				return getAccept();
			case TestPackage.API_REQUEST__SCHEME:
				return getScheme();
			case TestPackage.API_REQUEST__PARAMETERS:
				return getParameters();
			case TestPackage.API_REQUEST__ASSERTIONS:
				return getAssertions();
			case TestPackage.API_REQUEST__AUTHORIZATION:
				return getAuthorization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestPackage.API_REQUEST__OPERATION_ID:
				setOperationId((String)newValue);
				return;
			case TestPackage.API_REQUEST__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case TestPackage.API_REQUEST__ACCEPT:
				setAccept((String)newValue);
				return;
			case TestPackage.API_REQUEST__SCHEME:
				setScheme((SchemeType)newValue);
				return;
			case TestPackage.API_REQUEST__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TestPackage.API_REQUEST__ASSERTIONS:
				getAssertions().clear();
				getAssertions().addAll((Collection<? extends Assertion>)newValue);
				return;
			case TestPackage.API_REQUEST__AUTHORIZATION:
				setAuthorization((Authorization)newValue);
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
			case TestPackage.API_REQUEST__OPERATION_ID:
				setOperationId(OPERATION_ID_EDEFAULT);
				return;
			case TestPackage.API_REQUEST__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case TestPackage.API_REQUEST__ACCEPT:
				setAccept(ACCEPT_EDEFAULT);
				return;
			case TestPackage.API_REQUEST__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case TestPackage.API_REQUEST__PARAMETERS:
				getParameters().clear();
				return;
			case TestPackage.API_REQUEST__ASSERTIONS:
				getAssertions().clear();
				return;
			case TestPackage.API_REQUEST__AUTHORIZATION:
				setAuthorization((Authorization)null);
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
			case TestPackage.API_REQUEST__OPERATION_ID:
				return OPERATION_ID_EDEFAULT == null ? operationId != null : !OPERATION_ID_EDEFAULT.equals(operationId);
			case TestPackage.API_REQUEST__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case TestPackage.API_REQUEST__ACCEPT:
				return ACCEPT_EDEFAULT == null ? accept != null : !ACCEPT_EDEFAULT.equals(accept);
			case TestPackage.API_REQUEST__SCHEME:
				return scheme != SCHEME_EDEFAULT;
			case TestPackage.API_REQUEST__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case TestPackage.API_REQUEST__ASSERTIONS:
				return assertions != null && !assertions.isEmpty();
			case TestPackage.API_REQUEST__AUTHORIZATION:
				return authorization != null;
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
		result.append(" (operationId: ");
		result.append(operationId);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", accept: ");
		result.append(accept);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

} //APIRequestImpl
