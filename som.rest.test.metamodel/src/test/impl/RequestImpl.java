/**
 */
package test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import test.Assertion;
import test.Authorization;
import test.HTTPMethod;
import test.HeaderField;
import test.Parameter;
import test.Request;
import test.SchemeType;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.impl.RequestImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link test.impl.RequestImpl#getHost <em>Host</em>}</li>
 *   <li>{@link test.impl.RequestImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link test.impl.RequestImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link test.impl.RequestImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link test.impl.RequestImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link test.impl.RequestImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link test.impl.RequestImpl#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends TestImpl implements Request {
	/**
	 * The default value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPMethod HTTP_METHOD_EDEFAULT = HTTPMethod.UNDEFINED;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected HTTPMethod httpMethod = HTTP_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

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
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<HeaderField> headers;

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
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPMethod getHttpMethod() {
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpMethod(HTTPMethod newHttpMethod) {
		HTTPMethod oldHttpMethod = httpMethod;
		httpMethod = newHttpMethod == null ? HTTP_METHOD_EDEFAULT : newHttpMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.REQUEST__HTTP_METHOD, oldHttpMethod, httpMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.REQUEST__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.REQUEST__RESOURCE, oldResource, resource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.REQUEST__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderField> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<HeaderField>(HeaderField.class, this, TestPackage.REQUEST__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, TestPackage.REQUEST__PARAMETERS);
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
			assertions = new EObjectContainmentEList<Assertion>(Assertion.class, this, TestPackage.REQUEST__ASSERTIONS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.REQUEST__AUTHORIZATION, oldAuthorization, newAuthorization);
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
				msgs = ((InternalEObject)authorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.REQUEST__AUTHORIZATION, null, msgs);
			if (newAuthorization != null)
				msgs = ((InternalEObject)newAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.REQUEST__AUTHORIZATION, null, msgs);
			msgs = basicSetAuthorization(newAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.REQUEST__AUTHORIZATION, newAuthorization, newAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.REQUEST__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
			case TestPackage.REQUEST__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TestPackage.REQUEST__ASSERTIONS:
				return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
			case TestPackage.REQUEST__AUTHORIZATION:
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
			case TestPackage.REQUEST__HTTP_METHOD:
				return getHttpMethod();
			case TestPackage.REQUEST__HOST:
				return getHost();
			case TestPackage.REQUEST__RESOURCE:
				return getResource();
			case TestPackage.REQUEST__SCHEME:
				return getScheme();
			case TestPackage.REQUEST__HEADERS:
				return getHeaders();
			case TestPackage.REQUEST__PARAMETERS:
				return getParameters();
			case TestPackage.REQUEST__ASSERTIONS:
				return getAssertions();
			case TestPackage.REQUEST__AUTHORIZATION:
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
			case TestPackage.REQUEST__HTTP_METHOD:
				setHttpMethod((HTTPMethod)newValue);
				return;
			case TestPackage.REQUEST__HOST:
				setHost((String)newValue);
				return;
			case TestPackage.REQUEST__RESOURCE:
				setResource((String)newValue);
				return;
			case TestPackage.REQUEST__SCHEME:
				setScheme((SchemeType)newValue);
				return;
			case TestPackage.REQUEST__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends HeaderField>)newValue);
				return;
			case TestPackage.REQUEST__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TestPackage.REQUEST__ASSERTIONS:
				getAssertions().clear();
				getAssertions().addAll((Collection<? extends Assertion>)newValue);
				return;
			case TestPackage.REQUEST__AUTHORIZATION:
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
			case TestPackage.REQUEST__HTTP_METHOD:
				setHttpMethod(HTTP_METHOD_EDEFAULT);
				return;
			case TestPackage.REQUEST__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case TestPackage.REQUEST__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case TestPackage.REQUEST__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case TestPackage.REQUEST__HEADERS:
				getHeaders().clear();
				return;
			case TestPackage.REQUEST__PARAMETERS:
				getParameters().clear();
				return;
			case TestPackage.REQUEST__ASSERTIONS:
				getAssertions().clear();
				return;
			case TestPackage.REQUEST__AUTHORIZATION:
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
			case TestPackage.REQUEST__HTTP_METHOD:
				return httpMethod != HTTP_METHOD_EDEFAULT;
			case TestPackage.REQUEST__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case TestPackage.REQUEST__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case TestPackage.REQUEST__SCHEME:
				return scheme != SCHEME_EDEFAULT;
			case TestPackage.REQUEST__HEADERS:
				return headers != null && !headers.isEmpty();
			case TestPackage.REQUEST__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case TestPackage.REQUEST__ASSERTIONS:
				return assertions != null && !assertions.isEmpty();
			case TestPackage.REQUEST__AUTHORIZATION:
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
		result.append(" (httpMethod: ");
		result.append(httpMethod);
		result.append(", host: ");
		result.append(host);
		result.append(", resource: ");
		result.append(resource);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

} //RequestImpl
