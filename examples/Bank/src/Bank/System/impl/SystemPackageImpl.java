/**
 */
package Bank.System.impl;

import Bank.System.SystemFactory;
import Bank.System.SystemPackage;
import Bank.System._boolean;
import Bank.System._integer;
import Bank.System._ops;
import Bank.System._string;
import Bank.System.account;
import Bank.System.account_id;
import Bank.System.address;
import Bank.System.amount;
import Bank.System.amount_available;
import Bank.System.bank;
import Bank.System.client;
import Bank.System.client_id;
import Bank.System.company_name;
import Bank.System.first_name;
import Bank.System.last_name;
import Bank.System.name;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemPackageImpl extends EPackageImpl implements SystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass first_nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass last_nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass company_nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass client_idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass account_idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amount_availableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _opsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Bank.System.SystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemPackageImpl() {
		super(eNS_URI, SystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemPackage init() {
		if (isInited) return (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemPackageImpl theSystemPackage = registeredSystemPackage instanceof SystemPackageImpl ? (SystemPackageImpl)registeredSystemPackage : new SystemPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSystemPackage.createPackageContents();

		// Initialize created meta-data
		theSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, theSystemPackage);
		return theSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_boolean() {
		return _booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute get_boolean_Value() {
		return (EAttribute)_booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_integer() {
		return _integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute get_integer_Value() {
		return (EAttribute)_integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_string() {
		return _stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute get_string_Value() {
		return (EAttribute)_stringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbank() {
		return bankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbank_Company_name() {
		return (EReference)bankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbank_Address() {
		return (EReference)bankEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbank_Clients() {
		return (EReference)bankEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbank_Accounts() {
		return (EReference)bankEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getname() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getname_First_name() {
		return (EReference)nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getname_Last_name() {
		return (EReference)nameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfirst_name() {
		return first_nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlast_name() {
		return last_nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcompany_name() {
		return company_nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getclient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclient_Name() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclient_Client_id() {
		return (EReference)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getclient_id() {
		return client_idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaccount_Account_id() {
		return (EReference)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaccount_Client_id() {
		return (EReference)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaccount_Amount_available() {
		return (EReference)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaccount_id() {
		return account_idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getamount() {
		return amountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getamount_available() {
		return amount_availableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_ops() {
		return _opsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Output__integer___integer() {
		return _opsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Output__string___string() {
		return _opsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Output_a_new_line() {
		return _opsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___boolean_is_false___boolean() {
		return _opsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___boolean_is_true___boolean() {
		return _opsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is__integer___integer__integer() {
		return _opsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___string_is__string___string__string() {
		return _opsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Read_input_from_user_and_store_it_in__integer___integer() {
		return _opsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Read_input_from_user_and_store_it_in__string___string() {
		return _opsEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_equal_to__integer_is__boolean___integer__integer__boolean() {
		return _opsEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_not_equal_to__integer_is__boolean___integer__integer__boolean() {
		return _opsEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_greater_than_or_equal_to__integer_is__boolean___integer__integer__boolean() {
		return _opsEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_greater_than__integer_is__boolean___integer__integer__boolean() {
		return _opsEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_less_than_or_equal_to__integer_is__boolean___integer__integer__boolean() {
		return _opsEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_less_than__integer_is__boolean___integer__integer__boolean() {
		return _opsEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__The_addition_of__integer_with__integer_is__integer___integer__integer__integer() {
		return _opsEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__The_difference_between__integer_and__integer_is__integer___integer__integer__integer() {
		return _opsEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___string_is_equal_to__string_is__boolean___string__string__boolean() {
		return _opsEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Require_press_enter_to_continue() {
		return _opsEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Clear_the_screen() {
		return _opsEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Name_is_name__name_name() {
		return _opsEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Output_client__client() {
		return _opsEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Output_account__account() {
		return _opsEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Account_is_the_element_number__integer_on_account__account__integer_EList() {
		return _opsEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_the_number_of_elements_in_account___integer_EList() {
		return _opsEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Client_is_the_element_number__integer_on_client__client__integer_EList() {
		return _opsEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_the_number_of_elements_in_client___integer_EList() {
		return _opsEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Add_client_to_bank__client_bank() {
		return _opsEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Add_account_to_bank__account_bank() {
		return _opsEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Generate_client_id_unique_to_bank__client_id_bank() {
		return _opsEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Generate_account_id_unique_to_bank__account_id_bank() {
		return _opsEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Create_client_on_bank__client_bank() {
		return _opsEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Client_is_the_client_with_client_id_on_bank__client_client_id_bank() {
		return _opsEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Client_id_is_valid_for_bank_is__boolean__client_id_bank__boolean() {
		return _opsEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean__client_id_EList__integer__integer__boolean() {
		return _opsEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Client_id_is_not_valid_for_bank_is__boolean__client_id_bank__boolean() {
		return _opsEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__List_all_client_in_bank__bank() {
		return _opsEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__List_clients_number__integer_to__integer_on_client___integer__integer_EList() {
		return _opsEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__List_all_accounts_in_bank__bank() {
		return _opsEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__List_accounts_number__integer_to__integer_on_account___integer__integer_EList() {
		return _opsEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Create_account_on_bank__account_bank() {
		return _opsEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Account_is_the_account_with_account_id_on_bank__account_account_id_bank() {
		return _opsEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Account_id_is_valid_for_bank_is__boolean__account_id_bank__boolean() {
		return _opsEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Account_id_is_not_valid_for_bank_is__boolean__account_id_bank__boolean() {
		return _opsEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__The_client_with_client_id_has_accounts_on_bank_is__boolean__client_id_bank__boolean() {
		return _opsEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Remove_the_client_with_client_id_from_bank__client_id_bank() {
		return _opsEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Remove_the_account_with_account_id_from_bank__account_id_bank() {
		return _opsEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Show_welcome_message_for_bank__bank() {
		return _opsEClass.getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Launch_create_a_client_page_for_bank__bank() {
		return _opsEClass.getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Launch_create_an_account_page_for_bank__bank() {
		return _opsEClass.getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Launch_remove_a_client_page_for_bank__bank() {
		return _opsEClass.getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Launch_remove_an_account_page_for_bank__bank() {
		return _opsEClass.getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Launch_main_menu_for_bank__bank() {
		return _opsEClass.getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Main() {
		return _opsEClass.getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactory getSystemFactory() {
		return (SystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		_booleanEClass = createEClass(_BOOLEAN);
		createEAttribute(_booleanEClass, _BOOLEAN__VALUE);

		_integerEClass = createEClass(_INTEGER);
		createEAttribute(_integerEClass, _INTEGER__VALUE);

		_stringEClass = createEClass(_STRING);
		createEAttribute(_stringEClass, _STRING__VALUE);

		bankEClass = createEClass(BANK);
		createEReference(bankEClass, BANK__COMPANY_NAME);
		createEReference(bankEClass, BANK__ADDRESS);
		createEReference(bankEClass, BANK__CLIENTS);
		createEReference(bankEClass, BANK__ACCOUNTS);

		nameEClass = createEClass(NAME);
		createEReference(nameEClass, NAME__FIRST_NAME);
		createEReference(nameEClass, NAME__LAST_NAME);

		first_nameEClass = createEClass(FIRST_NAME);

		last_nameEClass = createEClass(LAST_NAME);

		company_nameEClass = createEClass(COMPANY_NAME);

		addressEClass = createEClass(ADDRESS);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__NAME);
		createEReference(clientEClass, CLIENT__CLIENT_ID);

		client_idEClass = createEClass(CLIENT_ID);

		accountEClass = createEClass(ACCOUNT);
		createEReference(accountEClass, ACCOUNT__ACCOUNT_ID);
		createEReference(accountEClass, ACCOUNT__CLIENT_ID);
		createEReference(accountEClass, ACCOUNT__AMOUNT_AVAILABLE);

		account_idEClass = createEClass(ACCOUNT_ID);

		amountEClass = createEClass(AMOUNT);

		amount_availableEClass = createEClass(AMOUNT_AVAILABLE);

		_opsEClass = createEClass(_OPS);
		createEOperation(_opsEClass, _OPS___OUTPUT_INTEGER__INTEGER___INTEGER);
		createEOperation(_opsEClass, _OPS___OUTPUT_STRING__STRING___STRING);
		createEOperation(_opsEClass, _OPS___OUTPUT_ANEW_LINE);
		createEOperation(_opsEClass, _OPS___BOOLEAN_IS_FALSE___BOOLEAN);
		createEOperation(_opsEClass, _OPS___BOOLEAN_IS_TRUE___BOOLEAN);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_INTEGER__INTEGER___INTEGER__INTEGER);
		createEOperation(_opsEClass, _OPS___STRING_IS_STRING__STRING___STRING__STRING);
		createEOperation(_opsEClass, _OPS___READ_INPUT_FROM_USER_AND_STORE_IT_IN_INTEGER__INTEGER___INTEGER);
		createEOperation(_opsEClass, _OPS___READ_INPUT_FROM_USER_AND_STORE_IT_IN_STRING__STRING___STRING);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_NOT_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_GREATER_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_GREATER_THAN_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_LESS_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_LESS_THAN_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN);
		createEOperation(_opsEClass, _OPS___THE_ADDITION_OF_INTEGER_WITH_INTEGER_IS_INTEGER__INTEGER_WITH__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER);
		createEOperation(_opsEClass, _OPS___THE_DIFFERENCE_BETWEEN_INTEGER_AND_INTEGER_IS_INTEGER__INTEGER_AND__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER);
		createEOperation(_opsEClass, _OPS___STRING_IS_EQUAL_TO_STRING_IS_BOOLEAN__STRING_IS__BOOLEAN___STRING__STRING__BOOLEAN);
		createEOperation(_opsEClass, _OPS___REQUIRE_PRESS_ENTER_TO_CONTINUE);
		createEOperation(_opsEClass, _OPS___CLEAR_THE_SCREEN);
		createEOperation(_opsEClass, _OPS___NAME_IS_NAME__NAME_NAME);
		createEOperation(_opsEClass, _OPS___OUTPUT_CLIENT__CLIENT);
		createEOperation(_opsEClass, _OPS___OUTPUT_ACCOUNT__ACCOUNT);
		createEOperation(_opsEClass, _OPS___ACCOUNT_IS_THE_ELEMENT_NUMBER_INTEGER_ON_ACCOUNT__INTEGER_ON_ACCOUNT__ACCOUNT__INTEGER_ELIST);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_THE_NUMBER_OF_ELEMENTS_IN_ACCOUNT___INTEGER_ELIST);
		createEOperation(_opsEClass, _OPS___CLIENT_IS_THE_ELEMENT_NUMBER_INTEGER_ON_CLIENT__INTEGER_ON_CLIENT__CLIENT__INTEGER_ELIST);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_THE_NUMBER_OF_ELEMENTS_IN_CLIENT___INTEGER_ELIST);
		createEOperation(_opsEClass, _OPS___ADD_CLIENT_TO_BANK__CLIENT_BANK);
		createEOperation(_opsEClass, _OPS___ADD_ACCOUNT_TO_BANK__ACCOUNT_BANK);
		createEOperation(_opsEClass, _OPS___GENERATE_CLIENT_ID_UNIQUE_TO_BANK__CLIENT_ID_BANK);
		createEOperation(_opsEClass, _OPS___GENERATE_ACCOUNT_ID_UNIQUE_TO_BANK__ACCOUNT_ID_BANK);
		createEOperation(_opsEClass, _OPS___CREATE_CLIENT_ON_BANK__CLIENT_BANK);
		createEOperation(_opsEClass, _OPS___CLIENT_IS_THE_CLIENT_WITH_CLIENT_ID_ON_BANK__CLIENT_CLIENT_ID_BANK);
		createEOperation(_opsEClass, _OPS___CLIENT_ID_IS_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN);
		createEOperation(_opsEClass, _OPS___CLIENT_ID_IS_VALID_FOR_CLIENT_NUMBERS_INTEGER_TO_INTEGER_IS_BOOLEAN__INTEGER_TO__INTEGER_IS__BOOLEAN__CLIENT_ID_ELIST__INTEGER__INTEGER__BOOLEAN);
		createEOperation(_opsEClass, _OPS___CLIENT_ID_IS_NOT_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN);
		createEOperation(_opsEClass, _OPS___CREATE_ACCOUNT_ON_BANK__ACCOUNT_BANK);
		createEOperation(_opsEClass, _OPS___ACCOUNT_IS_THE_ACCOUNT_WITH_ACCOUNT_ID_ON_BANK__ACCOUNT_ACCOUNT_ID_BANK);
		createEOperation(_opsEClass, _OPS___ACCOUNT_ID_IS_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__ACCOUNT_ID_BANK__BOOLEAN);
		createEOperation(_opsEClass, _OPS___ACCOUNT_ID_IS_NOT_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__ACCOUNT_ID_BANK__BOOLEAN);
		createEOperation(_opsEClass, _OPS___THE_CLIENT_WITH_CLIENT_ID_HAS_ACCOUNTS_ON_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN);
		createEOperation(_opsEClass, _OPS___REMOVE_THE_CLIENT_WITH_CLIENT_ID_FROM_BANK__CLIENT_ID_BANK);
		createEOperation(_opsEClass, _OPS___REMOVE_THE_ACCOUNT_WITH_ACCOUNT_ID_FROM_BANK__ACCOUNT_ID_BANK);
		createEOperation(_opsEClass, _OPS___LIST_ALL_CLIENT_IN_BANK__BANK);
		createEOperation(_opsEClass, _OPS___LIST_CLIENTS_NUMBER_INTEGER_TO_INTEGER_ON_CLIENT__INTEGER_TO__INTEGER_ON_CLIENT___INTEGER__INTEGER_ELIST);
		createEOperation(_opsEClass, _OPS___LIST_ALL_ACCOUNTS_IN_BANK__BANK);
		createEOperation(_opsEClass, _OPS___LIST_ACCOUNTS_NUMBER_INTEGER_TO_INTEGER_ON_ACCOUNT__INTEGER_TO__INTEGER_ON_ACCOUNT___INTEGER__INTEGER_ELIST);
		createEOperation(_opsEClass, _OPS___SHOW_WELCOME_MESSAGE_FOR_BANK__BANK);
		createEOperation(_opsEClass, _OPS___LAUNCH_CREATE_ACLIENT_PAGE_FOR_BANK__BANK);
		createEOperation(_opsEClass, _OPS___LAUNCH_CREATE_AN_ACCOUNT_PAGE_FOR_BANK__BANK);
		createEOperation(_opsEClass, _OPS___LAUNCH_REMOVE_ACLIENT_PAGE_FOR_BANK__BANK);
		createEOperation(_opsEClass, _OPS___LAUNCH_REMOVE_AN_ACCOUNT_PAGE_FOR_BANK__BANK);
		createEOperation(_opsEClass, _OPS___LAUNCH_MAIN_MENU_FOR_BANK__BANK);
		createEOperation(_opsEClass, _OPS___MAIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		first_nameEClass.getESuperTypes().add(this.get_string());
		last_nameEClass.getESuperTypes().add(this.get_string());
		company_nameEClass.getESuperTypes().add(this.get_string());
		addressEClass.getESuperTypes().add(this.get_string());
		client_idEClass.getESuperTypes().add(this.get_integer());
		account_idEClass.getESuperTypes().add(this.get_integer());
		amountEClass.getESuperTypes().add(this.get_integer());
		amount_availableEClass.getESuperTypes().add(this.getamount());

		// Initialize classes, features, and operations; add parameters
		initEClass(_booleanEClass, _boolean.class, "_boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_boolean_Value(), theEcorePackage.getEBoolean(), "value", null, 0, 1, _boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_integerEClass, _integer.class, "_integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_integer_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, _integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_stringEClass, _string.class, "_string", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_string_Value(), theEcorePackage.getEString(), "value", null, 0, 1, _string.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bankEClass, bank.class, "bank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getbank_Company_name(), this.getcompany_name(), null, "company_name", null, 1, 1, bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getbank_Address(), this.getaddress(), null, "address", null, 1, 1, bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getbank_Clients(), this.getclient(), null, "clients", null, 0, -1, bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getbank_Accounts(), this.getaccount(), null, "accounts", null, 0, -1, bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameEClass, name.class, "name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getname_First_name(), this.getfirst_name(), null, "first_name", null, 1, 1, name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getname_Last_name(), this.getlast_name(), null, "last_name", null, 1, 1, name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(first_nameEClass, first_name.class, "first_name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(last_nameEClass, last_name.class, "last_name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(company_nameEClass, company_name.class, "company_name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addressEClass, address.class, "address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clientEClass, client.class, "client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getclient_Name(), this.getname(), null, "name", null, 1, 1, client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclient_Client_id(), this.getclient_id(), null, "client_id", null, 1, 1, client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(client_idEClass, client_id.class, "client_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accountEClass, account.class, "account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getaccount_Account_id(), this.getaccount_id(), null, "account_id", null, 1, 1, account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getaccount_Client_id(), this.getclient_id(), null, "client_id", null, 1, 1, account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getaccount_Amount_available(), this.getamount_available(), null, "amount_available", null, 1, 1, account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(account_idEClass, account_id.class, "account_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(amountEClass, amount.class, "amount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(amount_availableEClass, amount_available.class, "amount_available", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(_opsEClass, _ops.class, "_ops", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(get_ops__Output__integer___integer(), null, "output__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Output__string___string(), null, "output__string", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_string(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(get_ops__Output_a_new_line(), null, "output_a_new_line", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___boolean_is_false___boolean(), null, "_boolean_is_false", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___boolean_is_true___boolean(), null, "_boolean_is_true", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is__integer___integer__integer(), null, "_integer_is__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___string_is__string___string__string(), null, "_string_is__string", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_string(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_string(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Read_input_from_user_and_store_it_in__integer___integer(), null, "read_input_from_user_and_store_it_in__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Read_input_from_user_and_store_it_in__string___string(), null, "read_input_from_user_and_store_it_in__string", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_string(), "S", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_equal_to__integer_is__boolean___integer__integer__boolean(), null, "_integer_is_equal_to__integer_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_not_equal_to__integer_is__boolean___integer__integer__boolean(), null, "_integer_is_not_equal_to__integer_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_greater_than_or_equal_to__integer_is__boolean___integer__integer__boolean(), null, "_integer_is_greater_than_or_equal_to__integer_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_greater_than__integer_is__boolean___integer__integer__boolean(), null, "_integer_is_greater_than__integer_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_less_than_or_equal_to__integer_is__boolean___integer__integer__boolean(), null, "_integer_is_less_than_or_equal_to__integer_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_less_than__integer_is__boolean___integer__integer__boolean(), null, "_integer_is_less_than__integer_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__The_addition_of__integer_with__integer_is__integer___integer__integer__integer(), null, "the_addition_of__integer_with__integer_is__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__The_difference_between__integer_and__integer_is__integer___integer__integer__integer(), null, "the_difference_between__integer_and__integer_is__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___string_is_equal_to__string_is__boolean___string__string__boolean(), null, "_string_is_equal_to__string_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_string(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_string(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(get_ops__Require_press_enter_to_continue(), null, "require_press_enter_to_continue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(get_ops__Clear_the_screen(), null, "clear_the_screen", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Name_is_name__name_name(), null, "name_is_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getname(), "N1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getname(), "N2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Output_client__client(), null, "output_client", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Output_account__account(), null, "output_account", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Account_is_the_element_number__integer_on_account__account__integer_EList(), null, "account_is_the_element_number__integer_on_account", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "N", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount(), "As", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_the_number_of_elements_in_account___integer_EList(), null, "_integer_is_the_number_of_elements_in_account", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "N", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount(), "As", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Client_is_the_element_number__integer_on_client__client__integer_EList(), null, "client_is_the_element_number__integer_on_client", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "N", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "Cs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_the_number_of_elements_in_client___integer_EList(), null, "_integer_is_the_number_of_elements_in_client", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "N", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "Cs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Add_client_to_bank__client_bank(), null, "add_client_to_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Add_account_to_bank__account_bank(), null, "add_account_to_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Generate_client_id_unique_to_bank__client_id_bank(), null, "generate_client_id_unique_to_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Generate_account_id_unique_to_bank__account_id_bank(), null, "generate_account_id_unique_to_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Create_client_on_bank__client_bank(), null, "create_client_on_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Client_is_the_client_with_client_id_on_bank__client_client_id_bank(), null, "client_is_the_client_with_client_id_on_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Client_id_is_valid_for_bank_is__boolean__client_id_bank__boolean(), null, "client_id_is_valid_for_bank_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean__client_id_EList__integer__integer__boolean(), null, "client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "Cs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Client_id_is_not_valid_for_bank_is__boolean__client_id_bank__boolean(), null, "client_id_is_not_valid_for_bank_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Create_account_on_bank__account_bank(), null, "create_account_on_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Account_is_the_account_with_account_id_on_bank__account_account_id_bank(), null, "account_is_the_account_with_account_id_on_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Account_id_is_valid_for_bank_is__boolean__account_id_bank__boolean(), null, "account_id_is_valid_for_bank_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Account_id_is_not_valid_for_bank_is__boolean__account_id_bank__boolean(), null, "account_id_is_not_valid_for_bank_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__The_client_with_client_id_has_accounts_on_bank_is__boolean__client_id_bank__boolean(), null, "the_client_with_client_id_has_accounts_on_bank_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Remove_the_client_with_client_id_from_bank__client_id_bank(), null, "remove_the_client_with_client_id_from_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Remove_the_account_with_account_id_from_bank__account_id_bank(), null, "remove_the_account_with_account_id_from_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount_id(), "I", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__List_all_client_in_bank__bank(), null, "list_all_client_in_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__List_clients_number__integer_to__integer_on_client___integer__integer_EList(), null, "list_clients_number__integer_to__integer_on_client", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getclient(), "Cs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__List_all_accounts_in_bank__bank(), null, "list_all_accounts_in_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__List_accounts_number__integer_to__integer_on_account___integer__integer_EList(), null, "list_accounts_number__integer_to__integer_on_account", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getaccount(), "ACCs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Show_welcome_message_for_bank__bank(), null, "show_welcome_message_for_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Launch_create_a_client_page_for_bank__bank(), null, "launch_create_a_client_page_for_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Launch_create_an_account_page_for_bank__bank(), null, "launch_create_an_account_page_for_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Launch_remove_a_client_page_for_bank__bank(), null, "launch_remove_a_client_page_for_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Launch_remove_an_account_page_for_bank__bank(), null, "launch_remove_an_account_page_for_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Launch_main_menu_for_bank__bank(), null, "launch_main_menu_for_bank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getbank(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(get_ops__Main(), null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SystemPackageImpl
