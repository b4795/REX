/**
 */
package Bank.System.impl;

import Bank.System.SystemFactory;
import Bank.System.SystemPackage;
import Bank.System.account;
import Bank.System.account_id;
import Bank.System.amount_available;

import Bank.System.client_id;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Bank.System.impl.accountImpl#getAccount_id <em>Account id</em>}</li>
 *   <li>{@link Bank.System.impl.accountImpl#getClient_id <em>Client id</em>}</li>
 *   <li>{@link Bank.System.impl.accountImpl#getAmount_available <em>Amount available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class accountImpl extends MinimalEObjectImpl.Container implements account {
	/**
	 * The cached value of the '{@link #getAccount_id() <em>Account id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount_id()
	 * @generated
	 * @ordered
	 */
	protected account_id account_id;

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
	 * The cached value of the '{@link #getAmount_available() <em>Amount available</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount_available()
	 * @generated
	 * @ordered
	 */
	protected amount_available amount_available;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected accountImpl() {
		super();
		
		account_id = SystemFactory.eINSTANCE.createaccount_id();
		client_id = SystemFactory.eINSTANCE.createclient_id();
		amount_available = SystemFactory.eINSTANCE.createamount_available();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public account_id getAccount_id() {
		if (account_id != null && account_id.eIsProxy()) {
			InternalEObject oldAccount_id = (InternalEObject)account_id;
			account_id = (account_id)eResolveProxy(oldAccount_id);
			if (account_id != oldAccount_id) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.ACCOUNT__ACCOUNT_ID, oldAccount_id, account_id));
			}
		}
		return account_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public account_id basicGetAccount_id() {
		return account_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount_id(account_id newAccount_id) {
		account_id oldAccount_id = account_id;
		account_id = newAccount_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.ACCOUNT__ACCOUNT_ID, oldAccount_id, account_id));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.ACCOUNT__CLIENT_ID, oldClient_id, client_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.ACCOUNT__CLIENT_ID, oldClient_id, client_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public amount_available getAmount_available() {
		if (amount_available != null && amount_available.eIsProxy()) {
			InternalEObject oldAmount_available = (InternalEObject)amount_available;
			amount_available = (amount_available)eResolveProxy(oldAmount_available);
			if (amount_available != oldAmount_available) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.ACCOUNT__AMOUNT_AVAILABLE, oldAmount_available, amount_available));
			}
		}
		return amount_available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public amount_available basicGetAmount_available() {
		return amount_available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount_available(amount_available newAmount_available) {
		amount_available oldAmount_available = amount_available;
		amount_available = newAmount_available;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.ACCOUNT__AMOUNT_AVAILABLE, oldAmount_available, amount_available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.ACCOUNT__ACCOUNT_ID:
				if (resolve) return getAccount_id();
				return basicGetAccount_id();
			case SystemPackage.ACCOUNT__CLIENT_ID:
				if (resolve) return getClient_id();
				return basicGetClient_id();
			case SystemPackage.ACCOUNT__AMOUNT_AVAILABLE:
				if (resolve) return getAmount_available();
				return basicGetAmount_available();
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
			case SystemPackage.ACCOUNT__ACCOUNT_ID:
				setAccount_id((account_id)newValue);
				return;
			case SystemPackage.ACCOUNT__CLIENT_ID:
				setClient_id((client_id)newValue);
				return;
			case SystemPackage.ACCOUNT__AMOUNT_AVAILABLE:
				setAmount_available((amount_available)newValue);
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
			case SystemPackage.ACCOUNT__ACCOUNT_ID:
				setAccount_id((account_id)null);
				return;
			case SystemPackage.ACCOUNT__CLIENT_ID:
				setClient_id((client_id)null);
				return;
			case SystemPackage.ACCOUNT__AMOUNT_AVAILABLE:
				setAmount_available((amount_available)null);
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
			case SystemPackage.ACCOUNT__ACCOUNT_ID:
				return account_id != null;
			case SystemPackage.ACCOUNT__CLIENT_ID:
				return client_id != null;
			case SystemPackage.ACCOUNT__AMOUNT_AVAILABLE:
				return amount_available != null;
		}
		return super.eIsSet(featureID);
	}

} //accountImpl
