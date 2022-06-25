/**
 */
package Bank.System;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Bank.System.client#getName <em>Name</em>}</li>
 *   <li>{@link Bank.System.client#getClient_id <em>Client id</em>}</li>
 * </ul>
 *
 * @see Bank.System.SystemPackage#getclient()
 * @model
 * @generated
 */
public interface client extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(name)
	 * @see Bank.System.SystemPackage#getclient_Name()
	 * @model required="true"
	 * @generated
	 */
	name getName();

	/**
	 * Sets the value of the '{@link Bank.System.client#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(name value);

	/**
	 * Returns the value of the '<em><b>Client id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client id</em>' reference.
	 * @see #setClient_id(client_id)
	 * @see Bank.System.SystemPackage#getclient_Client_id()
	 * @model required="true"
	 * @generated
	 */
	client_id getClient_id();

	/**
	 * Sets the value of the '{@link Bank.System.client#getClient_id <em>Client id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client id</em>' reference.
	 * @see #getClient_id()
	 * @generated
	 */
	void setClient_id(client_id value);

} // client
