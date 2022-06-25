/**
 */
package Bank.System.impl;

import Bank.System.SystemFactory;
import Bank.System.SystemPackage;
import Bank.System.client;
import Bank.System.client_id;
import Bank.System.name;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Bank.System.impl.clientImpl#getName <em>Name</em>}</li>
 *   <li>{@link Bank.System.impl.clientImpl#getClient_id <em>Client id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class clientImpl extends MinimalEObjectImpl.Container implements client {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected name name;

	/**
	 * The cached value of the '{@link #getClient_id() <em>Client id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_id()
	 * @generated
	 * @ordered
	 */
	protected client_id client_id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected clientImpl() {
		super();
		
		name = SystemFactory.eINSTANCE.createname();
		client_id = SystemFactory.eINSTANCE.createclient_id();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public name getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (name)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.CLIENT__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public name basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(name newName) {
		name oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.CLIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public client_id getClient_id() {
		if (client_id != null && client_id.eIsProxy()) {
			InternalEObject oldClient_id = (InternalEObject)client_id;
			client_id = (client_id)eResolveProxy(oldClient_id);
			if (client_id != oldClient_id) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.CLIENT__CLIENT_ID, oldClient_id, client_id));
			}
		}
		return client_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public client_id basicGetClient_id() {
		return client_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_id(client_id newClient_id) {
		client_id oldClient_id = client_id;
		client_id = newClient_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.CLIENT__CLIENT_ID, oldClient_id, client_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.CLIENT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case SystemPackage.CLIENT__CLIENT_ID:
				if (resolve) return getClient_id();
				return basicGetClient_id();
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
			case SystemPackage.CLIENT__NAME:
				setName((name)newValue);
				return;
			case SystemPackage.CLIENT__CLIENT_ID:
				setClient_id((client_id)newValue);
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
			case SystemPackage.CLIENT__NAME:
				setName((name)null);
				return;
			case SystemPackage.CLIENT__CLIENT_ID:
				setClient_id((client_id)null);
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
			case SystemPackage.CLIENT__NAME:
				return name != null;
			case SystemPackage.CLIENT__CLIENT_ID:
				return client_id != null;
		}
		return super.eIsSet(featureID);
	}

} //clientImpl
