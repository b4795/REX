/**
 */
package Bank.System;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Bank.System.account#getAccount_id <em>Account id</em>}</li>
 *   <li>{@link Bank.System.account#getClient_id <em>Client id</em>}</li>
 *   <li>{@link Bank.System.account#getAmount_available <em>Amount available</em>}</li>
 * </ul>
 *
 * @see Bank.System.SystemPackage#getaccount()
 * @model
 * @generated
 */
public interface account extends EObject {
	/**
	 * Returns the value of the '<em><b>Account id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account id</em>' reference.
	 * @see #setAccount_id(account_id)
	 * @see Bank.System.SystemPackage#getaccount_Account_id()
	 * @model required="true"
	 * @generated
	 */
	account_id getAccount_id();

	/**
	 * Sets the value of the '{@link Bank.System.account#getAccount_id <em>Account id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account id</em>' reference.
	 * @see #getAccount_id()
	 * @generated
	 */
	void setAccount_id(account_id value);

	/**
	 * Returns the value of the '<em><b>Client id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client id</em>' reference.
	 * @see #setClient_id(client_id)
	 * @see Bank.System.SystemPackage#getaccount_Client_id()
	 * @model required="true"
	 * @generated
	 */
	client_id getClient_id();

	/**
	 * Sets the value of the '{@link Bank.System.account#getClient_id <em>Client id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client id</em>' reference.
	 * @see #getClient_id()
	 * @generated
	 */
	void setClient_id(client_id value);

	/**
	 * Returns the value of the '<em><b>Amount available</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount available</em>' reference.
	 * @see #setAmount_available(amount_available)
	 * @see Bank.System.SystemPackage#getaccount_Amount_available()
	 * @model required="true"
	 * @generated
	 */
	amount_available getAmount_available();

	/**
	 * Sets the value of the '{@link Bank.System.account#getAmount_available <em>Amount available</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount available</em>' reference.
	 * @see #getAmount_available()
	 * @generated
	 */
	void setAmount_available(amount_available value);

} // account
