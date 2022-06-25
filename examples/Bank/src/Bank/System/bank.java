/**
 */
package Bank.System;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Bank.System.bank#getCompany_name <em>Company name</em>}</li>
 *   <li>{@link Bank.System.bank#getAddress <em>Address</em>}</li>
 *   <li>{@link Bank.System.bank#getClients <em>Clients</em>}</li>
 *   <li>{@link Bank.System.bank#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @see Bank.System.SystemPackage#getbank()
 * @model
 * @generated
 */
public interface bank extends EObject {
	/**
	 * Returns the value of the '<em><b>Company name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company name</em>' reference.
	 * @see #setCompany_name(company_name)
	 * @see Bank.System.SystemPackage#getbank_Company_name()
	 * @model required="true"
	 * @generated
	 */
	company_name getCompany_name();

	/**
	 * Sets the value of the '{@link Bank.System.bank#getCompany_name <em>Company name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company name</em>' reference.
	 * @see #getCompany_name()
	 * @generated
	 */
	void setCompany_name(company_name value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(address)
	 * @see Bank.System.SystemPackage#getbank_Address()
	 * @model required="true"
	 * @generated
	 */
	address getAddress();

	/**
	 * Sets the value of the '{@link Bank.System.bank#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(address value);

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' reference list.
	 * The list contents are of type {@link Bank.System.client}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' reference list.
	 * @see Bank.System.SystemPackage#getbank_Clients()
	 * @model
	 * @generated
	 */
	EList<client> getClients();

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' reference list.
	 * The list contents are of type {@link Bank.System.account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' reference list.
	 * @see Bank.System.SystemPackage#getbank_Accounts()
	 * @model
	 * @generated
	 */
	EList<account> getAccounts();

} // bank
