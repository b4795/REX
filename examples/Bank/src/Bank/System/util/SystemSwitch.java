/**
 */
package Bank.System.util;

import Bank.System.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Bank.System.SystemPackage
 * @generated
 */
public class SystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSwitch() {
		if (modelPackage == null) {
			modelPackage = SystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SystemPackage._BOOLEAN: {
				_boolean _boolean = (_boolean)theEObject;
				T result = case_boolean(_boolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage._INTEGER: {
				_integer _integer = (_integer)theEObject;
				T result = case_integer(_integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage._STRING: {
				_string _string = (_string)theEObject;
				T result = case_string(_string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.BANK: {
				bank bank = (bank)theEObject;
				T result = casebank(bank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.NAME: {
				name name = (name)theEObject;
				T result = casename(name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.FIRST_NAME: {
				first_name first_name = (first_name)theEObject;
				T result = casefirst_name(first_name);
				if (result == null) result = case_string(first_name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.LAST_NAME: {
				last_name last_name = (last_name)theEObject;
				T result = caselast_name(last_name);
				if (result == null) result = case_string(last_name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.COMPANY_NAME: {
				company_name company_name = (company_name)theEObject;
				T result = casecompany_name(company_name);
				if (result == null) result = case_string(company_name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.ADDRESS: {
				address address = (address)theEObject;
				T result = caseaddress(address);
				if (result == null) result = case_string(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.CLIENT: {
				client client = (client)theEObject;
				T result = caseclient(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.CLIENT_ID: {
				client_id client_id = (client_id)theEObject;
				T result = caseclient_id(client_id);
				if (result == null) result = case_integer(client_id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.ACCOUNT: {
				account account = (account)theEObject;
				T result = caseaccount(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.ACCOUNT_ID: {
				account_id account_id = (account_id)theEObject;
				T result = caseaccount_id(account_id);
				if (result == null) result = case_integer(account_id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.AMOUNT: {
				amount amount = (amount)theEObject;
				T result = caseamount(amount);
				if (result == null) result = case_integer(amount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage.AMOUNT_AVAILABLE: {
				amount_available amount_available = (amount_available)theEObject;
				T result = caseamount_available(amount_available);
				if (result == null) result = caseamount(amount_available);
				if (result == null) result = case_integer(amount_available);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemPackage._OPS: {
				_ops _ops = (_ops)theEObject;
				T result = case_ops(_ops);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_boolean(_boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_integer(_integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>string</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>string</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_string(_string object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebank(bank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casename(name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>first name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>first name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefirst_name(first_name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>last name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>last name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselast_name(last_name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>company name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>company name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecompany_name(company_name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaddress(address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseclient(client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>client id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>client id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseclient_id(client_id object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaccount(account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>account id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>account id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaccount_id(account_id object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseamount(amount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>amount available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>amount available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseamount_available(amount_available object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ops</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ops</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_ops(_ops object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SystemSwitch
