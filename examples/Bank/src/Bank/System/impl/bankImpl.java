/**
 */
package Bank.System.impl;

import Bank.System.SystemFactory;
import Bank.System.SystemPackage;
import Bank.System.account;
import Bank.System.address;
import Bank.System.bank;
import Bank.System.client;
import Bank.System.company_name;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Bank.System.impl.bankImpl#getCompany_name <em>Company name</em>}</li>
 *   <li>{@link Bank.System.impl.bankImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link Bank.System.impl.bankImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link Bank.System.impl.bankImpl#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class bankImpl extends MinimalEObjectImpl.Container implements bank {
	/**
	 * The cached value of the '{@link #getCompany_name() <em>Company name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany_name()
	 * @generated
	 * @ordered
	 */
	protected company_name company_name;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected address address;

	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<client> clients;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<account> accounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected bankImpl() {
		super();
		
		company_name = SystemFactory.eINSTANCE.createcompany_name();
		address = SystemFactory.eINSTANCE.createaddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public company_name getCompany_name() {
		if (company_name != null && company_name.eIsProxy()) {
			InternalEObject oldCompany_name = (InternalEObject)company_name;
			company_name = (company_name)eResolveProxy(oldCompany_name);
			if (company_name != oldCompany_name) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.BANK__COMPANY_NAME, oldCompany_name, company_name));
			}
		}
		return company_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public company_name basicGetCompany_name() {
		return company_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany_name(company_name newCompany_name) {
		company_name oldCompany_name = company_name;
		company_name = newCompany_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.BANK__COMPANY_NAME, oldCompany_name, company_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public address getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (address)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.BANK__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public address basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(address newAddress) {
		address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.BANK__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<client> getClients() {
		if (clients == null) {
			clients = new EObjectResolvingEList<client>(client.class, this, SystemPackage.BANK__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectResolvingEList<account>(account.class, this, SystemPackage.BANK__ACCOUNTS);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.BANK__COMPANY_NAME:
				if (resolve) return getCompany_name();
				return basicGetCompany_name();
			case SystemPackage.BANK__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
			case SystemPackage.BANK__CLIENTS:
				return getClients();
			case SystemPackage.BANK__ACCOUNTS:
				return getAccounts();
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
			case SystemPackage.BANK__COMPANY_NAME:
				setCompany_name((company_name)newValue);
				return;
			case SystemPackage.BANK__ADDRESS:
				setAddress((address)newValue);
				return;
			case SystemPackage.BANK__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends client>)newValue);
				return;
			case SystemPackage.BANK__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends account>)newValue);
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
			case SystemPackage.BANK__COMPANY_NAME:
				setCompany_name((company_name)null);
				return;
			case SystemPackage.BANK__ADDRESS:
				setAddress((address)null);
				return;
			case SystemPackage.BANK__CLIENTS:
				getClients().clear();
				return;
			case SystemPackage.BANK__ACCOUNTS:
				getAccounts().clear();
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
			case SystemPackage.BANK__COMPANY_NAME:
				return company_name != null;
			case SystemPackage.BANK__ADDRESS:
				return address != null;
			case SystemPackage.BANK__CLIENTS:
				return clients != null && !clients.isEmpty();
			case SystemPackage.BANK__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //bankImpl
