/**
 */
package Bank.System;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Bank.System.SystemPackage
 * @generated
 */
public interface SystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemFactory eINSTANCE = Bank.System.impl.SystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>boolean</em>'.
	 * @generated
	 */
	_boolean create_boolean();

	/**
	 * Returns a new object of class '<em>integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>integer</em>'.
	 * @generated
	 */
	_integer create_integer();

	/**
	 * Returns a new object of class '<em>string</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>string</em>'.
	 * @generated
	 */
	_string create_string();

	/**
	 * Returns a new object of class '<em>bank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>bank</em>'.
	 * @generated
	 */
	bank createbank();

	/**
	 * Returns a new object of class '<em>name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name</em>'.
	 * @generated
	 */
	name createname();

	/**
	 * Returns a new object of class '<em>first name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>first name</em>'.
	 * @generated
	 */
	first_name createfirst_name();

	/**
	 * Returns a new object of class '<em>last name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>last name</em>'.
	 * @generated
	 */
	last_name createlast_name();

	/**
	 * Returns a new object of class '<em>company name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>company name</em>'.
	 * @generated
	 */
	company_name createcompany_name();

	/**
	 * Returns a new object of class '<em>address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>address</em>'.
	 * @generated
	 */
	address createaddress();

	/**
	 * Returns a new object of class '<em>client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>client</em>'.
	 * @generated
	 */
	client createclient();

	/**
	 * Returns a new object of class '<em>client id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>client id</em>'.
	 * @generated
	 */
	client_id createclient_id();

	/**
	 * Returns a new object of class '<em>account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>account</em>'.
	 * @generated
	 */
	account createaccount();

	/**
	 * Returns a new object of class '<em>account id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>account id</em>'.
	 * @generated
	 */
	account_id createaccount_id();

	/**
	 * Returns a new object of class '<em>amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>amount</em>'.
	 * @generated
	 */
	amount createamount();

	/**
	 * Returns a new object of class '<em>amount available</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>amount available</em>'.
	 * @generated
	 */
	amount_available createamount_available();

	/**
	 * Returns a new object of class '<em>ops</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ops</em>'.
	 * @generated
	 */
	_ops create_ops();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemPackage getSystemPackage();

} //SystemFactory
