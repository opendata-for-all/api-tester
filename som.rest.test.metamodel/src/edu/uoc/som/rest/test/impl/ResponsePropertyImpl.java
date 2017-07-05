/**
 */
package edu.uoc.som.rest.test.impl;

import edu.uoc.som.rest.test.Request;
import edu.uoc.som.rest.test.ResponseProperty;
import edu.uoc.som.rest.test.TestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.rest.test.impl.ResponsePropertyImpl#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsePropertyImpl extends ComplexPropertyImpl implements ResponseProperty {
	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Request request;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.RESPONSE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Request)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.RESPONSE_PROPERTY__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Request newRequest) {
		Request oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.RESPONSE_PROPERTY__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.RESPONSE_PROPERTY__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
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
			case TestPackage.RESPONSE_PROPERTY__REQUEST:
				setRequest((Request)newValue);
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
			case TestPackage.RESPONSE_PROPERTY__REQUEST:
				setRequest((Request)null);
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
			case TestPackage.RESPONSE_PROPERTY__REQUEST:
				return request != null;
		}
		return super.eIsSet(featureID);
	}

} //ResponsePropertyImpl
