/**
 */
package Bank.System.impl;

import Bank.System.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemFactoryImpl extends EFactoryImpl implements SystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemFactory init() {
		try {
			SystemFactory theSystemFactory = (SystemFactory)EPackage.Registry.INSTANCE.getEFactory(SystemPackage.eNS_URI);
			if (theSystemFactory != null) {
				return theSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SystemPackage._BOOLEAN: return create_boolean();
			case SystemPackage._INTEGER: return create_integer();
			case SystemPackage._STRING: return create_string();
			case SystemPackage.BANK: return createbank();
			case SystemPackage.NAME: return createname();
			case SystemPackage.FIRST_NAME: return createfirst_name();
			case SystemPackage.LAST_NAME: return createlast_name();
			case SystemPackage.COMPANY_NAME: return createcompany_name();
			case SystemPackage.ADDRESS: return createaddress();
			case SystemPackage.CLIENT: return createclient();
			case SystemPackage.CLIENT_ID: return createclient_id();
			case SystemPackage.ACCOUNT: return createaccount();
			case SystemPackage.ACCOUNT_ID: return createaccount_id();
			case SystemPackage.AMOUNT: return createamount();
			case SystemPackage.AMOUNT_AVAILABLE: return createamount_available();
			case SystemPackage._OPS: return create_ops();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _boolean create_boolean() {
		_booleanImpl _boolean = new _booleanImpl();
		return _boolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _integer create_integer() {
		_integerImpl _integer = new _integerImpl();
		return _integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _string create_string() {
		_stringImpl _string = new _stringImpl();
		return _string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bank createbank() {
		bankImpl bank = new bankImpl();
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public name createname() {
		nameImpl name = new nameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public first_name createfirst_name() {
		first_nameImpl first_name = new first_nameImpl();
		return first_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public last_name createlast_name() {
		last_nameImpl last_name = new last_nameImpl();
		return last_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public company_name createcompany_name() {
		company_nameImpl company_name = new company_nameImpl();
		return company_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public address createaddress() {
		addressImpl address = new addressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public client createclient() {
		clientImpl client = new clientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public client_id createclient_id() {
		client_idImpl client_id = new client_idImpl();
		return client_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public account createaccount() {
		accountImpl account = new accountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public account_id createaccount_id() {
		account_idImpl account_id = new account_idImpl();
		return account_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public amount createamount() {
		amountImpl amount = new amountImpl();
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public amount_available createamount_available() {
		amount_availableImpl amount_available = new amount_availableImpl();
		return amount_available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _ops create_ops() {
		_opsImpl _ops = new _opsImpl();
		return _ops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPackage getSystemPackage() {
		return (SystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemPackage getPackage() {
		return SystemPackage.eINSTANCE;
	}

} //SystemFactoryImpl
