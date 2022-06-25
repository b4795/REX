/**
 */
package Bank.System.util;

import Bank.System.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Bank.System.SystemPackage
 * @generated
 */
public class SystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemSwitch<Adapter> modelSwitch =
		new SystemSwitch<Adapter>() {
			@Override
			public Adapter case_boolean(_boolean object) {
				return create_booleanAdapter();
			}
			@Override
			public Adapter case_integer(_integer object) {
				return create_integerAdapter();
			}
			@Override
			public Adapter case_string(_string object) {
				return create_stringAdapter();
			}
			@Override
			public Adapter casebank(bank object) {
				return createbankAdapter();
			}
			@Override
			public Adapter casename(name object) {
				return createnameAdapter();
			}
			@Override
			public Adapter casefirst_name(first_name object) {
				return createfirst_nameAdapter();
			}
			@Override
			public Adapter caselast_name(last_name object) {
				return createlast_nameAdapter();
			}
			@Override
			public Adapter casecompany_name(company_name object) {
				return createcompany_nameAdapter();
			}
			@Override
			public Adapter caseaddress(address object) {
				return createaddressAdapter();
			}
			@Override
			public Adapter caseclient(client object) {
				return createclientAdapter();
			}
			@Override
			public Adapter caseclient_id(client_id object) {
				return createclient_idAdapter();
			}
			@Override
			public Adapter caseaccount(account object) {
				return createaccountAdapter();
			}
			@Override
			public Adapter caseaccount_id(account_id object) {
				return createaccount_idAdapter();
			}
			@Override
			public Adapter caseamount(amount object) {
				return createamountAdapter();
			}
			@Override
			public Adapter caseamount_available(amount_available object) {
				return createamount_availableAdapter();
			}
			@Override
			public Adapter case_ops(_ops object) {
				return create_opsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Bank.System._boolean <em>boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System._boolean
	 * @generated
	 */
	public Adapter create_booleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System._integer <em>integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System._integer
	 * @generated
	 */
	public Adapter create_integerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System._string <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System._string
	 * @generated
	 */
	public Adapter create_stringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.bank <em>bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.bank
	 * @generated
	 */
	public Adapter createbankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.name <em>name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.name
	 * @generated
	 */
	public Adapter createnameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.first_name <em>first name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.first_name
	 * @generated
	 */
	public Adapter createfirst_nameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.last_name <em>last name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.last_name
	 * @generated
	 */
	public Adapter createlast_nameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.company_name <em>company name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.company_name
	 * @generated
	 */
	public Adapter createcompany_nameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.address <em>address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.address
	 * @generated
	 */
	public Adapter createaddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.client <em>client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.client
	 * @generated
	 */
	public Adapter createclientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.client_id <em>client id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.client_id
	 * @generated
	 */
	public Adapter createclient_idAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.account <em>account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.account
	 * @generated
	 */
	public Adapter createaccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.account_id <em>account id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.account_id
	 * @generated
	 */
	public Adapter createaccount_idAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.amount <em>amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.amount
	 * @generated
	 */
	public Adapter createamountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System.amount_available <em>amount available</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System.amount_available
	 * @generated
	 */
	public Adapter createamount_availableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bank.System._ops <em>ops</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bank.System._ops
	 * @generated
	 */
	public Adapter create_opsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SystemAdapterFactory
