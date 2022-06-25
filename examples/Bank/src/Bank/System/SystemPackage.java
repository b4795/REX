/**
 */
package Bank.System;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Bank.System.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "System";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "System";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "System";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = Bank.System.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link Bank.System.impl._booleanImpl <em>boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl._booleanImpl
	 * @see Bank.System.impl.SystemPackageImpl#get_boolean()
	 * @generated
	 */
	int _BOOLEAN = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _BOOLEAN__VALUE = 0;

	/**
	 * The number of structural features of the '<em>boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _BOOLEAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _BOOLEAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl._integerImpl <em>integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl._integerImpl
	 * @see Bank.System.impl.SystemPackageImpl#get_integer()
	 * @generated
	 */
	int _INTEGER = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _INTEGER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _INTEGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _INTEGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl._stringImpl <em>string</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl._stringImpl
	 * @see Bank.System.impl.SystemPackageImpl#get_string()
	 * @generated
	 */
	int _STRING = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _STRING__VALUE = 0;

	/**
	 * The number of structural features of the '<em>string</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _STRING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>string</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.bankImpl <em>bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.bankImpl
	 * @see Bank.System.impl.SystemPackageImpl#getbank()
	 * @generated
	 */
	int BANK = 3;

	/**
	 * The feature id for the '<em><b>Company name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__COMPANY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__CLIENTS = 2;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ACCOUNTS = 3;

	/**
	 * The number of structural features of the '<em>bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.nameImpl <em>name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.nameImpl
	 * @see Bank.System.impl.SystemPackageImpl#getname()
	 * @generated
	 */
	int NAME = 4;

	/**
	 * The feature id for the '<em><b>First name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__LAST_NAME = 1;

	/**
	 * The number of structural features of the '<em>name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.first_nameImpl <em>first name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.first_nameImpl
	 * @see Bank.System.impl.SystemPackageImpl#getfirst_name()
	 * @generated
	 */
	int FIRST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME__VALUE = _STRING__VALUE;

	/**
	 * The number of structural features of the '<em>first name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_FEATURE_COUNT = _STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>first name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_OPERATION_COUNT = _STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.last_nameImpl <em>last name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.last_nameImpl
	 * @see Bank.System.impl.SystemPackageImpl#getlast_name()
	 * @generated
	 */
	int LAST_NAME = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME__VALUE = _STRING__VALUE;

	/**
	 * The number of structural features of the '<em>last name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_FEATURE_COUNT = _STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>last name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_OPERATION_COUNT = _STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.company_nameImpl <em>company name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.company_nameImpl
	 * @see Bank.System.impl.SystemPackageImpl#getcompany_name()
	 * @generated
	 */
	int COMPANY_NAME = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_NAME__VALUE = _STRING__VALUE;

	/**
	 * The number of structural features of the '<em>company name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_NAME_FEATURE_COUNT = _STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>company name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_NAME_OPERATION_COUNT = _STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.addressImpl <em>address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.addressImpl
	 * @see Bank.System.impl.SystemPackageImpl#getaddress()
	 * @generated
	 */
	int ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__VALUE = _STRING__VALUE;

	/**
	 * The number of structural features of the '<em>address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = _STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = _STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.clientImpl <em>client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.clientImpl
	 * @see Bank.System.impl.SystemPackageImpl#getclient()
	 * @generated
	 */
	int CLIENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Client id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CLIENT_ID = 1;

	/**
	 * The number of structural features of the '<em>client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.client_idImpl <em>client id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.client_idImpl
	 * @see Bank.System.impl.SystemPackageImpl#getclient_id()
	 * @generated
	 */
	int CLIENT_ID = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_ID__VALUE = _INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>client id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_ID_FEATURE_COUNT = _INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>client id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_ID_OPERATION_COUNT = _INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.accountImpl <em>account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.accountImpl
	 * @see Bank.System.impl.SystemPackageImpl#getaccount()
	 * @generated
	 */
	int ACCOUNT = 11;

	/**
	 * The feature id for the '<em><b>Account id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ACCOUNT_ID = 0;

	/**
	 * The feature id for the '<em><b>Client id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CLIENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Amount available</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__AMOUNT_AVAILABLE = 2;

	/**
	 * The number of structural features of the '<em>account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.account_idImpl <em>account id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.account_idImpl
	 * @see Bank.System.impl.SystemPackageImpl#getaccount_id()
	 * @generated
	 */
	int ACCOUNT_ID = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_ID__VALUE = _INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>account id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_ID_FEATURE_COUNT = _INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>account id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_ID_OPERATION_COUNT = _INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.amountImpl <em>amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.amountImpl
	 * @see Bank.System.impl.SystemPackageImpl#getamount()
	 * @generated
	 */
	int AMOUNT = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__VALUE = _INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FEATURE_COUNT = _INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_OPERATION_COUNT = _INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl.amount_availableImpl <em>amount available</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl.amount_availableImpl
	 * @see Bank.System.impl.SystemPackageImpl#getamount_available()
	 * @generated
	 */
	int AMOUNT_AVAILABLE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_AVAILABLE__VALUE = AMOUNT__VALUE;

	/**
	 * The number of structural features of the '<em>amount available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_AVAILABLE_FEATURE_COUNT = AMOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>amount available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_AVAILABLE_OPERATION_COUNT = AMOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bank.System.impl._opsImpl <em>ops</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bank.System.impl._opsImpl
	 * @see Bank.System.impl.SystemPackageImpl#get_ops()
	 * @generated
	 */
	int _OPS = 15;

	/**
	 * The number of structural features of the '<em>ops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Output integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___OUTPUT_INTEGER__INTEGER___INTEGER = 0;

	/**
	 * The operation id for the '<em>Output string</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___OUTPUT_STRING__STRING___STRING = 1;

	/**
	 * The operation id for the '<em>Output anew line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___OUTPUT_ANEW_LINE = 2;

	/**
	 * The operation id for the '<em>boolean is false</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___BOOLEAN_IS_FALSE___BOOLEAN = 3;

	/**
	 * The operation id for the '<em>boolean is true</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___BOOLEAN_IS_TRUE___BOOLEAN = 4;

	/**
	 * The operation id for the '<em>integer is integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_INTEGER__INTEGER___INTEGER__INTEGER = 5;

	/**
	 * The operation id for the '<em>string is string</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___STRING_IS_STRING__STRING___STRING__STRING = 6;

	/**
	 * The operation id for the '<em>Read input from user and store it in integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___READ_INPUT_FROM_USER_AND_STORE_IT_IN_INTEGER__INTEGER___INTEGER = 7;

	/**
	 * The operation id for the '<em>Read input from user and store it in string</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___READ_INPUT_FROM_USER_AND_STORE_IT_IN_STRING__STRING___STRING = 8;

	/**
	 * The operation id for the '<em>integer is equal to integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = 9;

	/**
	 * The operation id for the '<em>integer is not equal to integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_NOT_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = 10;

	/**
	 * The operation id for the '<em>integer is greater than or equal to integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_GREATER_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = 11;

	/**
	 * The operation id for the '<em>integer is greater than integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_GREATER_THAN_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = 12;

	/**
	 * The operation id for the '<em>integer is less than or equal to integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_LESS_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = 13;

	/**
	 * The operation id for the '<em>integer is less than integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_LESS_THAN_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = 14;

	/**
	 * The operation id for the '<em>The addition of integer with integer is integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___THE_ADDITION_OF_INTEGER_WITH_INTEGER_IS_INTEGER__INTEGER_WITH__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER = 15;

	/**
	 * The operation id for the '<em>The difference between integer and integer is integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___THE_DIFFERENCE_BETWEEN_INTEGER_AND_INTEGER_IS_INTEGER__INTEGER_AND__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER = 16;

	/**
	 * The operation id for the '<em>string is equal to string is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___STRING_IS_EQUAL_TO_STRING_IS_BOOLEAN__STRING_IS__BOOLEAN___STRING__STRING__BOOLEAN = 17;

	/**
	 * The operation id for the '<em>Require press enter to continue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___REQUIRE_PRESS_ENTER_TO_CONTINUE = 18;

	/**
	 * The operation id for the '<em>Clear the screen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___CLEAR_THE_SCREEN = 19;

	/**
	 * The operation id for the '<em>Name is name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___NAME_IS_NAME__NAME_NAME = 20;

	/**
	 * The operation id for the '<em>Output client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___OUTPUT_CLIENT__CLIENT = 21;

	/**
	 * The operation id for the '<em>Output account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___OUTPUT_ACCOUNT__ACCOUNT = 22;

	/**
	 * The operation id for the '<em>Account is the element number integer on account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___ACCOUNT_IS_THE_ELEMENT_NUMBER_INTEGER_ON_ACCOUNT__INTEGER_ON_ACCOUNT__ACCOUNT__INTEGER_ELIST = 23;

	/**
	 * The operation id for the '<em>integer is the number of elements in account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_THE_NUMBER_OF_ELEMENTS_IN_ACCOUNT___INTEGER_ELIST = 24;

	/**
	 * The operation id for the '<em>Client is the element number integer on client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___CLIENT_IS_THE_ELEMENT_NUMBER_INTEGER_ON_CLIENT__INTEGER_ON_CLIENT__CLIENT__INTEGER_ELIST = 25;

	/**
	 * The operation id for the '<em>integer is the number of elements in client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_THE_NUMBER_OF_ELEMENTS_IN_CLIENT___INTEGER_ELIST = 26;

	/**
	 * The operation id for the '<em>Add client to bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___ADD_CLIENT_TO_BANK__CLIENT_BANK = 27;

	/**
	 * The operation id for the '<em>Add account to bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___ADD_ACCOUNT_TO_BANK__ACCOUNT_BANK = 28;

	/**
	 * The operation id for the '<em>Generate client id unique to bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___GENERATE_CLIENT_ID_UNIQUE_TO_BANK__CLIENT_ID_BANK = 29;

	/**
	 * The operation id for the '<em>Generate account id unique to bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___GENERATE_ACCOUNT_ID_UNIQUE_TO_BANK__ACCOUNT_ID_BANK = 30;

	/**
	 * The operation id for the '<em>Create client on bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___CREATE_CLIENT_ON_BANK__CLIENT_BANK = 31;

	/**
	 * The operation id for the '<em>Client is the client with client id on bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___CLIENT_IS_THE_CLIENT_WITH_CLIENT_ID_ON_BANK__CLIENT_CLIENT_ID_BANK = 32;

	/**
	 * The operation id for the '<em>Client id is valid for bank is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___CLIENT_ID_IS_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN = 33;

	/**
	 * The operation id for the '<em>Client id is valid for client numbers integer to integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___CLIENT_ID_IS_VALID_FOR_CLIENT_NUMBERS_INTEGER_TO_INTEGER_IS_BOOLEAN__INTEGER_TO__INTEGER_IS__BOOLEAN__CLIENT_ID_ELIST__INTEGER__INTEGER__BOOLEAN = 34;

	/**
	 * The operation id for the '<em>Client id is not valid for bank is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___CLIENT_ID_IS_NOT_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN = 35;

	/**
	 * The operation id for the '<em>Create account on bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___CREATE_ACCOUNT_ON_BANK__ACCOUNT_BANK = 36;

	/**
	 * The operation id for the '<em>Account is the account with account id on bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___ACCOUNT_IS_THE_ACCOUNT_WITH_ACCOUNT_ID_ON_BANK__ACCOUNT_ACCOUNT_ID_BANK = 37;

	/**
	 * The operation id for the '<em>Account id is valid for bank is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___ACCOUNT_ID_IS_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__ACCOUNT_ID_BANK__BOOLEAN = 38;

	/**
	 * The operation id for the '<em>Account id is not valid for bank is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___ACCOUNT_ID_IS_NOT_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__ACCOUNT_ID_BANK__BOOLEAN = 39;

	/**
	 * The operation id for the '<em>The client with client id has accounts on bank is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___THE_CLIENT_WITH_CLIENT_ID_HAS_ACCOUNTS_ON_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN = 40;

	/**
	 * The operation id for the '<em>Remove the client with client id from bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___REMOVE_THE_CLIENT_WITH_CLIENT_ID_FROM_BANK__CLIENT_ID_BANK = 41;

	/**
	 * The operation id for the '<em>Remove the account with account id from bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___REMOVE_THE_ACCOUNT_WITH_ACCOUNT_ID_FROM_BANK__ACCOUNT_ID_BANK = 42;

	/**
	 * The operation id for the '<em>List all client in bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LIST_ALL_CLIENT_IN_BANK__BANK = 43;

	/**
	 * The operation id for the '<em>List clients number integer to integer on client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LIST_CLIENTS_NUMBER_INTEGER_TO_INTEGER_ON_CLIENT__INTEGER_TO__INTEGER_ON_CLIENT___INTEGER__INTEGER_ELIST = 44;

	/**
	 * The operation id for the '<em>List all accounts in bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LIST_ALL_ACCOUNTS_IN_BANK__BANK = 45;

	/**
	 * The operation id for the '<em>List accounts number integer to integer on account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LIST_ACCOUNTS_NUMBER_INTEGER_TO_INTEGER_ON_ACCOUNT__INTEGER_TO__INTEGER_ON_ACCOUNT___INTEGER__INTEGER_ELIST = 46;

	/**
	 * The operation id for the '<em>Show welcome message for bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___SHOW_WELCOME_MESSAGE_FOR_BANK__BANK = 47;

	/**
	 * The operation id for the '<em>Launch create aclient page for bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LAUNCH_CREATE_ACLIENT_PAGE_FOR_BANK__BANK = 48;

	/**
	 * The operation id for the '<em>Launch create an account page for bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LAUNCH_CREATE_AN_ACCOUNT_PAGE_FOR_BANK__BANK = 49;

	/**
	 * The operation id for the '<em>Launch remove aclient page for bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LAUNCH_REMOVE_ACLIENT_PAGE_FOR_BANK__BANK = 50;

	/**
	 * The operation id for the '<em>Launch remove an account page for bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LAUNCH_REMOVE_AN_ACCOUNT_PAGE_FOR_BANK__BANK = 51;

	/**
	 * The operation id for the '<em>Launch main menu for bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LAUNCH_MAIN_MENU_FOR_BANK__BANK = 52;

	/**
	 * The operation id for the '<em>Main</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___MAIN = 53;

	/**
	 * The number of operations of the '<em>ops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS_OPERATION_COUNT = 54;


	/**
	 * Returns the meta object for class '{@link Bank.System._boolean <em>boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>boolean</em>'.
	 * @see Bank.System._boolean
	 * @generated
	 */
	EClass get_boolean();

	/**
	 * Returns the meta object for the attribute '{@link Bank.System._boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Bank.System._boolean#isValue()
	 * @see #get_boolean()
	 * @generated
	 */
	EAttribute get_boolean_Value();

	/**
	 * Returns the meta object for class '{@link Bank.System._integer <em>integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>integer</em>'.
	 * @see Bank.System._integer
	 * @generated
	 */
	EClass get_integer();

	/**
	 * Returns the meta object for the attribute '{@link Bank.System._integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Bank.System._integer#getValue()
	 * @see #get_integer()
	 * @generated
	 */
	EAttribute get_integer_Value();

	/**
	 * Returns the meta object for class '{@link Bank.System._string <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>string</em>'.
	 * @see Bank.System._string
	 * @generated
	 */
	EClass get_string();

	/**
	 * Returns the meta object for the attribute '{@link Bank.System._string#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Bank.System._string#getValue()
	 * @see #get_string()
	 * @generated
	 */
	EAttribute get_string_Value();

	/**
	 * Returns the meta object for class '{@link Bank.System.bank <em>bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bank</em>'.
	 * @see Bank.System.bank
	 * @generated
	 */
	EClass getbank();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.bank#getCompany_name <em>Company name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Company name</em>'.
	 * @see Bank.System.bank#getCompany_name()
	 * @see #getbank()
	 * @generated
	 */
	EReference getbank_Company_name();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.bank#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see Bank.System.bank#getAddress()
	 * @see #getbank()
	 * @generated
	 */
	EReference getbank_Address();

	/**
	 * Returns the meta object for the reference list '{@link Bank.System.bank#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clients</em>'.
	 * @see Bank.System.bank#getClients()
	 * @see #getbank()
	 * @generated
	 */
	EReference getbank_Clients();

	/**
	 * Returns the meta object for the reference list '{@link Bank.System.bank#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accounts</em>'.
	 * @see Bank.System.bank#getAccounts()
	 * @see #getbank()
	 * @generated
	 */
	EReference getbank_Accounts();

	/**
	 * Returns the meta object for class '{@link Bank.System.name <em>name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name</em>'.
	 * @see Bank.System.name
	 * @generated
	 */
	EClass getname();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.name#getFirst_name <em>First name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First name</em>'.
	 * @see Bank.System.name#getFirst_name()
	 * @see #getname()
	 * @generated
	 */
	EReference getname_First_name();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.name#getLast_name <em>Last name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last name</em>'.
	 * @see Bank.System.name#getLast_name()
	 * @see #getname()
	 * @generated
	 */
	EReference getname_Last_name();

	/**
	 * Returns the meta object for class '{@link Bank.System.first_name <em>first name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>first name</em>'.
	 * @see Bank.System.first_name
	 * @generated
	 */
	EClass getfirst_name();

	/**
	 * Returns the meta object for class '{@link Bank.System.last_name <em>last name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>last name</em>'.
	 * @see Bank.System.last_name
	 * @generated
	 */
	EClass getlast_name();

	/**
	 * Returns the meta object for class '{@link Bank.System.company_name <em>company name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>company name</em>'.
	 * @see Bank.System.company_name
	 * @generated
	 */
	EClass getcompany_name();

	/**
	 * Returns the meta object for class '{@link Bank.System.address <em>address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>address</em>'.
	 * @see Bank.System.address
	 * @generated
	 */
	EClass getaddress();

	/**
	 * Returns the meta object for class '{@link Bank.System.client <em>client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>client</em>'.
	 * @see Bank.System.client
	 * @generated
	 */
	EClass getclient();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see Bank.System.client#getName()
	 * @see #getclient()
	 * @generated
	 */
	EReference getclient_Name();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.client#getClient_id <em>Client id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client id</em>'.
	 * @see Bank.System.client#getClient_id()
	 * @see #getclient()
	 * @generated
	 */
	EReference getclient_Client_id();

	/**
	 * Returns the meta object for class '{@link Bank.System.client_id <em>client id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>client id</em>'.
	 * @see Bank.System.client_id
	 * @generated
	 */
	EClass getclient_id();

	/**
	 * Returns the meta object for class '{@link Bank.System.account <em>account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>account</em>'.
	 * @see Bank.System.account
	 * @generated
	 */
	EClass getaccount();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.account#getAccount_id <em>Account id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account id</em>'.
	 * @see Bank.System.account#getAccount_id()
	 * @see #getaccount()
	 * @generated
	 */
	EReference getaccount_Account_id();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.account#getClient_id <em>Client id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client id</em>'.
	 * @see Bank.System.account#getClient_id()
	 * @see #getaccount()
	 * @generated
	 */
	EReference getaccount_Client_id();

	/**
	 * Returns the meta object for the reference '{@link Bank.System.account#getAmount_available <em>Amount available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amount available</em>'.
	 * @see Bank.System.account#getAmount_available()
	 * @see #getaccount()
	 * @generated
	 */
	EReference getaccount_Amount_available();

	/**
	 * Returns the meta object for class '{@link Bank.System.account_id <em>account id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>account id</em>'.
	 * @see Bank.System.account_id
	 * @generated
	 */
	EClass getaccount_id();

	/**
	 * Returns the meta object for class '{@link Bank.System.amount <em>amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>amount</em>'.
	 * @see Bank.System.amount
	 * @generated
	 */
	EClass getamount();

	/**
	 * Returns the meta object for class '{@link Bank.System.amount_available <em>amount available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>amount available</em>'.
	 * @see Bank.System.amount_available
	 * @generated
	 */
	EClass getamount_available();

	/**
	 * Returns the meta object for class '{@link Bank.System._ops <em>ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ops</em>'.
	 * @see Bank.System._ops
	 * @generated
	 */
	EClass get_ops();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#output__integer(Bank.System._integer) <em>Output integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output integer</em>' operation.
	 * @see Bank.System._ops#output__integer(Bank.System._integer)
	 * @generated
	 */
	EOperation get_ops__Output__integer___integer();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#output__string(Bank.System._string) <em>Output string</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output string</em>' operation.
	 * @see Bank.System._ops#output__string(Bank.System._string)
	 * @generated
	 */
	EOperation get_ops__Output__string___string();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#output_a_new_line() <em>Output anew line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output anew line</em>' operation.
	 * @see Bank.System._ops#output_a_new_line()
	 * @generated
	 */
	EOperation get_ops__Output_a_new_line();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_boolean_is_false(Bank.System._boolean) <em>boolean is false</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>boolean is false</em>' operation.
	 * @see Bank.System._ops#_boolean_is_false(Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___boolean_is_false___boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_boolean_is_true(Bank.System._boolean) <em>boolean is true</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>boolean is true</em>' operation.
	 * @see Bank.System._ops#_boolean_is_true(Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___boolean_is_true___boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is__integer(Bank.System._integer, Bank.System._integer) <em>integer is integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is integer</em>' operation.
	 * @see Bank.System._ops#_integer_is__integer(Bank.System._integer, Bank.System._integer)
	 * @generated
	 */
	EOperation get_ops___integer_is__integer___integer__integer();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_string_is__string(Bank.System._string, Bank.System._string) <em>string is string</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>string is string</em>' operation.
	 * @see Bank.System._ops#_string_is__string(Bank.System._string, Bank.System._string)
	 * @generated
	 */
	EOperation get_ops___string_is__string___string__string();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#read_input_from_user_and_store_it_in__integer(Bank.System._integer) <em>Read input from user and store it in integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read input from user and store it in integer</em>' operation.
	 * @see Bank.System._ops#read_input_from_user_and_store_it_in__integer(Bank.System._integer)
	 * @generated
	 */
	EOperation get_ops__Read_input_from_user_and_store_it_in__integer___integer();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#read_input_from_user_and_store_it_in__string(Bank.System._string) <em>Read input from user and store it in string</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read input from user and store it in string</em>' operation.
	 * @see Bank.System._ops#read_input_from_user_and_store_it_in__string(Bank.System._string)
	 * @generated
	 */
	EOperation get_ops__Read_input_from_user_and_store_it_in__string___string();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is_equal_to__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean) <em>integer is equal to integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is equal to integer is boolean</em>' operation.
	 * @see Bank.System._ops#_integer_is_equal_to__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___integer_is_equal_to__integer_is__boolean___integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is_not_equal_to__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean) <em>integer is not equal to integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is not equal to integer is boolean</em>' operation.
	 * @see Bank.System._ops#_integer_is_not_equal_to__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___integer_is_not_equal_to__integer_is__boolean___integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is_greater_than_or_equal_to__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean) <em>integer is greater than or equal to integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is greater than or equal to integer is boolean</em>' operation.
	 * @see Bank.System._ops#_integer_is_greater_than_or_equal_to__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___integer_is_greater_than_or_equal_to__integer_is__boolean___integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is_greater_than__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean) <em>integer is greater than integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is greater than integer is boolean</em>' operation.
	 * @see Bank.System._ops#_integer_is_greater_than__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___integer_is_greater_than__integer_is__boolean___integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is_less_than_or_equal_to__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean) <em>integer is less than or equal to integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is less than or equal to integer is boolean</em>' operation.
	 * @see Bank.System._ops#_integer_is_less_than_or_equal_to__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___integer_is_less_than_or_equal_to__integer_is__boolean___integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is_less_than__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean) <em>integer is less than integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is less than integer is boolean</em>' operation.
	 * @see Bank.System._ops#_integer_is_less_than__integer_is__boolean(Bank.System._integer, Bank.System._integer, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___integer_is_less_than__integer_is__boolean___integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#the_addition_of__integer_with__integer_is__integer(Bank.System._integer, Bank.System._integer, Bank.System._integer) <em>The addition of integer with integer is integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>The addition of integer with integer is integer</em>' operation.
	 * @see Bank.System._ops#the_addition_of__integer_with__integer_is__integer(Bank.System._integer, Bank.System._integer, Bank.System._integer)
	 * @generated
	 */
	EOperation get_ops__The_addition_of__integer_with__integer_is__integer___integer__integer__integer();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#the_difference_between__integer_and__integer_is__integer(Bank.System._integer, Bank.System._integer, Bank.System._integer) <em>The difference between integer and integer is integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>The difference between integer and integer is integer</em>' operation.
	 * @see Bank.System._ops#the_difference_between__integer_and__integer_is__integer(Bank.System._integer, Bank.System._integer, Bank.System._integer)
	 * @generated
	 */
	EOperation get_ops__The_difference_between__integer_and__integer_is__integer___integer__integer__integer();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_string_is_equal_to__string_is__boolean(Bank.System._string, Bank.System._string, Bank.System._boolean) <em>string is equal to string is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>string is equal to string is boolean</em>' operation.
	 * @see Bank.System._ops#_string_is_equal_to__string_is__boolean(Bank.System._string, Bank.System._string, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops___string_is_equal_to__string_is__boolean___string__string__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#require_press_enter_to_continue() <em>Require press enter to continue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Require press enter to continue</em>' operation.
	 * @see Bank.System._ops#require_press_enter_to_continue()
	 * @generated
	 */
	EOperation get_ops__Require_press_enter_to_continue();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#clear_the_screen() <em>Clear the screen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear the screen</em>' operation.
	 * @see Bank.System._ops#clear_the_screen()
	 * @generated
	 */
	EOperation get_ops__Clear_the_screen();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#name_is_name(Bank.System.name, Bank.System.name) <em>Name is name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name is name</em>' operation.
	 * @see Bank.System._ops#name_is_name(Bank.System.name, Bank.System.name)
	 * @generated
	 */
	EOperation get_ops__Name_is_name__name_name();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#output_client(Bank.System.client) <em>Output client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output client</em>' operation.
	 * @see Bank.System._ops#output_client(Bank.System.client)
	 * @generated
	 */
	EOperation get_ops__Output_client__client();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#output_account(Bank.System.account) <em>Output account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output account</em>' operation.
	 * @see Bank.System._ops#output_account(Bank.System.account)
	 * @generated
	 */
	EOperation get_ops__Output_account__account();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#account_is_the_element_number__integer_on_account(Bank.System.account, Bank.System._integer, org.eclipse.emf.common.util.EList) <em>Account is the element number integer on account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Account is the element number integer on account</em>' operation.
	 * @see Bank.System._ops#account_is_the_element_number__integer_on_account(Bank.System.account, Bank.System._integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation get_ops__Account_is_the_element_number__integer_on_account__account__integer_EList();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is_the_number_of_elements_in_account(Bank.System._integer, org.eclipse.emf.common.util.EList) <em>integer is the number of elements in account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is the number of elements in account</em>' operation.
	 * @see Bank.System._ops#_integer_is_the_number_of_elements_in_account(Bank.System._integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation get_ops___integer_is_the_number_of_elements_in_account___integer_EList();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#client_is_the_element_number__integer_on_client(Bank.System.client, Bank.System._integer, org.eclipse.emf.common.util.EList) <em>Client is the element number integer on client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Client is the element number integer on client</em>' operation.
	 * @see Bank.System._ops#client_is_the_element_number__integer_on_client(Bank.System.client, Bank.System._integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation get_ops__Client_is_the_element_number__integer_on_client__client__integer_EList();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#_integer_is_the_number_of_elements_in_client(Bank.System._integer, org.eclipse.emf.common.util.EList) <em>integer is the number of elements in client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is the number of elements in client</em>' operation.
	 * @see Bank.System._ops#_integer_is_the_number_of_elements_in_client(Bank.System._integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation get_ops___integer_is_the_number_of_elements_in_client___integer_EList();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#add_client_to_bank(Bank.System.client, Bank.System.bank) <em>Add client to bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add client to bank</em>' operation.
	 * @see Bank.System._ops#add_client_to_bank(Bank.System.client, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Add_client_to_bank__client_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#add_account_to_bank(Bank.System.account, Bank.System.bank) <em>Add account to bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add account to bank</em>' operation.
	 * @see Bank.System._ops#add_account_to_bank(Bank.System.account, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Add_account_to_bank__account_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#generate_client_id_unique_to_bank(Bank.System.client_id, Bank.System.bank) <em>Generate client id unique to bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate client id unique to bank</em>' operation.
	 * @see Bank.System._ops#generate_client_id_unique_to_bank(Bank.System.client_id, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Generate_client_id_unique_to_bank__client_id_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#generate_account_id_unique_to_bank(Bank.System.account_id, Bank.System.bank) <em>Generate account id unique to bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate account id unique to bank</em>' operation.
	 * @see Bank.System._ops#generate_account_id_unique_to_bank(Bank.System.account_id, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Generate_account_id_unique_to_bank__account_id_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#create_client_on_bank(Bank.System.client, Bank.System.bank) <em>Create client on bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create client on bank</em>' operation.
	 * @see Bank.System._ops#create_client_on_bank(Bank.System.client, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Create_client_on_bank__client_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#client_is_the_client_with_client_id_on_bank(Bank.System.client, Bank.System.client_id, Bank.System.bank) <em>Client is the client with client id on bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Client is the client with client id on bank</em>' operation.
	 * @see Bank.System._ops#client_is_the_client_with_client_id_on_bank(Bank.System.client, Bank.System.client_id, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Client_is_the_client_with_client_id_on_bank__client_client_id_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#client_id_is_valid_for_bank_is__boolean(Bank.System.client_id, Bank.System.bank, Bank.System._boolean) <em>Client id is valid for bank is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Client id is valid for bank is boolean</em>' operation.
	 * @see Bank.System._ops#client_id_is_valid_for_bank_is__boolean(Bank.System.client_id, Bank.System.bank, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops__Client_id_is_valid_for_bank_is__boolean__client_id_bank__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean(Bank.System.client_id, org.eclipse.emf.common.util.EList, Bank.System._integer, Bank.System._integer, Bank.System._boolean) <em>Client id is valid for client numbers integer to integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Client id is valid for client numbers integer to integer is boolean</em>' operation.
	 * @see Bank.System._ops#client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean(Bank.System.client_id, org.eclipse.emf.common.util.EList, Bank.System._integer, Bank.System._integer, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops__Client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean__client_id_EList__integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#client_id_is_not_valid_for_bank_is__boolean(Bank.System.client_id, Bank.System.bank, Bank.System._boolean) <em>Client id is not valid for bank is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Client id is not valid for bank is boolean</em>' operation.
	 * @see Bank.System._ops#client_id_is_not_valid_for_bank_is__boolean(Bank.System.client_id, Bank.System.bank, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops__Client_id_is_not_valid_for_bank_is__boolean__client_id_bank__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#list_all_client_in_bank(Bank.System.bank) <em>List all client in bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List all client in bank</em>' operation.
	 * @see Bank.System._ops#list_all_client_in_bank(Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__List_all_client_in_bank__bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#list_clients_number__integer_to__integer_on_client(Bank.System._integer, Bank.System._integer, org.eclipse.emf.common.util.EList) <em>List clients number integer to integer on client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List clients number integer to integer on client</em>' operation.
	 * @see Bank.System._ops#list_clients_number__integer_to__integer_on_client(Bank.System._integer, Bank.System._integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation get_ops__List_clients_number__integer_to__integer_on_client___integer__integer_EList();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#list_all_accounts_in_bank(Bank.System.bank) <em>List all accounts in bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List all accounts in bank</em>' operation.
	 * @see Bank.System._ops#list_all_accounts_in_bank(Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__List_all_accounts_in_bank__bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#list_accounts_number__integer_to__integer_on_account(Bank.System._integer, Bank.System._integer, org.eclipse.emf.common.util.EList) <em>List accounts number integer to integer on account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List accounts number integer to integer on account</em>' operation.
	 * @see Bank.System._ops#list_accounts_number__integer_to__integer_on_account(Bank.System._integer, Bank.System._integer, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation get_ops__List_accounts_number__integer_to__integer_on_account___integer__integer_EList();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#create_account_on_bank(Bank.System.account, Bank.System.bank) <em>Create account on bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create account on bank</em>' operation.
	 * @see Bank.System._ops#create_account_on_bank(Bank.System.account, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Create_account_on_bank__account_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#account_is_the_account_with_account_id_on_bank(Bank.System.account, Bank.System.account_id, Bank.System.bank) <em>Account is the account with account id on bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Account is the account with account id on bank</em>' operation.
	 * @see Bank.System._ops#account_is_the_account_with_account_id_on_bank(Bank.System.account, Bank.System.account_id, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Account_is_the_account_with_account_id_on_bank__account_account_id_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#account_id_is_valid_for_bank_is__boolean(Bank.System.account_id, Bank.System.bank, Bank.System._boolean) <em>Account id is valid for bank is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Account id is valid for bank is boolean</em>' operation.
	 * @see Bank.System._ops#account_id_is_valid_for_bank_is__boolean(Bank.System.account_id, Bank.System.bank, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops__Account_id_is_valid_for_bank_is__boolean__account_id_bank__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#account_id_is_not_valid_for_bank_is__boolean(Bank.System.account_id, Bank.System.bank, Bank.System._boolean) <em>Account id is not valid for bank is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Account id is not valid for bank is boolean</em>' operation.
	 * @see Bank.System._ops#account_id_is_not_valid_for_bank_is__boolean(Bank.System.account_id, Bank.System.bank, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops__Account_id_is_not_valid_for_bank_is__boolean__account_id_bank__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#the_client_with_client_id_has_accounts_on_bank_is__boolean(Bank.System.client_id, Bank.System.bank, Bank.System._boolean) <em>The client with client id has accounts on bank is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>The client with client id has accounts on bank is boolean</em>' operation.
	 * @see Bank.System._ops#the_client_with_client_id_has_accounts_on_bank_is__boolean(Bank.System.client_id, Bank.System.bank, Bank.System._boolean)
	 * @generated
	 */
	EOperation get_ops__The_client_with_client_id_has_accounts_on_bank_is__boolean__client_id_bank__boolean();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#remove_the_client_with_client_id_from_bank(Bank.System.client_id, Bank.System.bank) <em>Remove the client with client id from bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove the client with client id from bank</em>' operation.
	 * @see Bank.System._ops#remove_the_client_with_client_id_from_bank(Bank.System.client_id, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Remove_the_client_with_client_id_from_bank__client_id_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#remove_the_account_with_account_id_from_bank(Bank.System.account_id, Bank.System.bank) <em>Remove the account with account id from bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove the account with account id from bank</em>' operation.
	 * @see Bank.System._ops#remove_the_account_with_account_id_from_bank(Bank.System.account_id, Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Remove_the_account_with_account_id_from_bank__account_id_bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#show_welcome_message_for_bank(Bank.System.bank) <em>Show welcome message for bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show welcome message for bank</em>' operation.
	 * @see Bank.System._ops#show_welcome_message_for_bank(Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Show_welcome_message_for_bank__bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#launch_create_a_client_page_for_bank(Bank.System.bank) <em>Launch create aclient page for bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch create aclient page for bank</em>' operation.
	 * @see Bank.System._ops#launch_create_a_client_page_for_bank(Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Launch_create_a_client_page_for_bank__bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#launch_create_an_account_page_for_bank(Bank.System.bank) <em>Launch create an account page for bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch create an account page for bank</em>' operation.
	 * @see Bank.System._ops#launch_create_an_account_page_for_bank(Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Launch_create_an_account_page_for_bank__bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#launch_remove_a_client_page_for_bank(Bank.System.bank) <em>Launch remove aclient page for bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch remove aclient page for bank</em>' operation.
	 * @see Bank.System._ops#launch_remove_a_client_page_for_bank(Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Launch_remove_a_client_page_for_bank__bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#launch_remove_an_account_page_for_bank(Bank.System.bank) <em>Launch remove an account page for bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch remove an account page for bank</em>' operation.
	 * @see Bank.System._ops#launch_remove_an_account_page_for_bank(Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Launch_remove_an_account_page_for_bank__bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#launch_main_menu_for_bank(Bank.System.bank) <em>Launch main menu for bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch main menu for bank</em>' operation.
	 * @see Bank.System._ops#launch_main_menu_for_bank(Bank.System.bank)
	 * @generated
	 */
	EOperation get_ops__Launch_main_menu_for_bank__bank();

	/**
	 * Returns the meta object for the '{@link Bank.System._ops#main() <em>Main</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Main</em>' operation.
	 * @see Bank.System._ops#main()
	 * @generated
	 */
	EOperation get_ops__Main();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Bank.System.impl._booleanImpl <em>boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl._booleanImpl
		 * @see Bank.System.impl.SystemPackageImpl#get_boolean()
		 * @generated
		 */
		EClass _BOOLEAN = eINSTANCE.get_boolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _BOOLEAN__VALUE = eINSTANCE.get_boolean_Value();

		/**
		 * The meta object literal for the '{@link Bank.System.impl._integerImpl <em>integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl._integerImpl
		 * @see Bank.System.impl.SystemPackageImpl#get_integer()
		 * @generated
		 */
		EClass _INTEGER = eINSTANCE.get_integer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _INTEGER__VALUE = eINSTANCE.get_integer_Value();

		/**
		 * The meta object literal for the '{@link Bank.System.impl._stringImpl <em>string</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl._stringImpl
		 * @see Bank.System.impl.SystemPackageImpl#get_string()
		 * @generated
		 */
		EClass _STRING = eINSTANCE.get_string();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _STRING__VALUE = eINSTANCE.get_string_Value();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.bankImpl <em>bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.bankImpl
		 * @see Bank.System.impl.SystemPackageImpl#getbank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getbank();

		/**
		 * The meta object literal for the '<em><b>Company name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__COMPANY_NAME = eINSTANCE.getbank_Company_name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__ADDRESS = eINSTANCE.getbank_Address();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__CLIENTS = eINSTANCE.getbank_Clients();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__ACCOUNTS = eINSTANCE.getbank_Accounts();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.nameImpl <em>name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.nameImpl
		 * @see Bank.System.impl.SystemPackageImpl#getname()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getname();

		/**
		 * The meta object literal for the '<em><b>First name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME__FIRST_NAME = eINSTANCE.getname_First_name();

		/**
		 * The meta object literal for the '<em><b>Last name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME__LAST_NAME = eINSTANCE.getname_Last_name();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.first_nameImpl <em>first name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.first_nameImpl
		 * @see Bank.System.impl.SystemPackageImpl#getfirst_name()
		 * @generated
		 */
		EClass FIRST_NAME = eINSTANCE.getfirst_name();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.last_nameImpl <em>last name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.last_nameImpl
		 * @see Bank.System.impl.SystemPackageImpl#getlast_name()
		 * @generated
		 */
		EClass LAST_NAME = eINSTANCE.getlast_name();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.company_nameImpl <em>company name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.company_nameImpl
		 * @see Bank.System.impl.SystemPackageImpl#getcompany_name()
		 * @generated
		 */
		EClass COMPANY_NAME = eINSTANCE.getcompany_name();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.addressImpl <em>address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.addressImpl
		 * @see Bank.System.impl.SystemPackageImpl#getaddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getaddress();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.clientImpl <em>client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.clientImpl
		 * @see Bank.System.impl.SystemPackageImpl#getclient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getclient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__NAME = eINSTANCE.getclient_Name();

		/**
		 * The meta object literal for the '<em><b>Client id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__CLIENT_ID = eINSTANCE.getclient_Client_id();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.client_idImpl <em>client id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.client_idImpl
		 * @see Bank.System.impl.SystemPackageImpl#getclient_id()
		 * @generated
		 */
		EClass CLIENT_ID = eINSTANCE.getclient_id();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.accountImpl <em>account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.accountImpl
		 * @see Bank.System.impl.SystemPackageImpl#getaccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getaccount();

		/**
		 * The meta object literal for the '<em><b>Account id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__ACCOUNT_ID = eINSTANCE.getaccount_Account_id();

		/**
		 * The meta object literal for the '<em><b>Client id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__CLIENT_ID = eINSTANCE.getaccount_Client_id();

		/**
		 * The meta object literal for the '<em><b>Amount available</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__AMOUNT_AVAILABLE = eINSTANCE.getaccount_Amount_available();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.account_idImpl <em>account id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.account_idImpl
		 * @see Bank.System.impl.SystemPackageImpl#getaccount_id()
		 * @generated
		 */
		EClass ACCOUNT_ID = eINSTANCE.getaccount_id();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.amountImpl <em>amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.amountImpl
		 * @see Bank.System.impl.SystemPackageImpl#getamount()
		 * @generated
		 */
		EClass AMOUNT = eINSTANCE.getamount();

		/**
		 * The meta object literal for the '{@link Bank.System.impl.amount_availableImpl <em>amount available</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl.amount_availableImpl
		 * @see Bank.System.impl.SystemPackageImpl#getamount_available()
		 * @generated
		 */
		EClass AMOUNT_AVAILABLE = eINSTANCE.getamount_available();

		/**
		 * The meta object literal for the '{@link Bank.System.impl._opsImpl <em>ops</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bank.System.impl._opsImpl
		 * @see Bank.System.impl.SystemPackageImpl#get_ops()
		 * @generated
		 */
		EClass _OPS = eINSTANCE.get_ops();

		/**
		 * The meta object literal for the '<em><b>Output integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___OUTPUT_INTEGER__INTEGER___INTEGER = eINSTANCE.get_ops__Output__integer___integer();

		/**
		 * The meta object literal for the '<em><b>Output string</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___OUTPUT_STRING__STRING___STRING = eINSTANCE.get_ops__Output__string___string();

		/**
		 * The meta object literal for the '<em><b>Output anew line</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___OUTPUT_ANEW_LINE = eINSTANCE.get_ops__Output_a_new_line();

		/**
		 * The meta object literal for the '<em><b>boolean is false</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___BOOLEAN_IS_FALSE___BOOLEAN = eINSTANCE.get_ops___boolean_is_false___boolean();

		/**
		 * The meta object literal for the '<em><b>boolean is true</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___BOOLEAN_IS_TRUE___BOOLEAN = eINSTANCE.get_ops___boolean_is_true___boolean();

		/**
		 * The meta object literal for the '<em><b>integer is integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_INTEGER__INTEGER___INTEGER__INTEGER = eINSTANCE.get_ops___integer_is__integer___integer__integer();

		/**
		 * The meta object literal for the '<em><b>string is string</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___STRING_IS_STRING__STRING___STRING__STRING = eINSTANCE.get_ops___string_is__string___string__string();

		/**
		 * The meta object literal for the '<em><b>Read input from user and store it in integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___READ_INPUT_FROM_USER_AND_STORE_IT_IN_INTEGER__INTEGER___INTEGER = eINSTANCE.get_ops__Read_input_from_user_and_store_it_in__integer___integer();

		/**
		 * The meta object literal for the '<em><b>Read input from user and store it in string</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___READ_INPUT_FROM_USER_AND_STORE_IT_IN_STRING__STRING___STRING = eINSTANCE.get_ops__Read_input_from_user_and_store_it_in__string___string();

		/**
		 * The meta object literal for the '<em><b>integer is equal to integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops___integer_is_equal_to__integer_is__boolean___integer__integer__boolean();

		/**
		 * The meta object literal for the '<em><b>integer is not equal to integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_NOT_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops___integer_is_not_equal_to__integer_is__boolean___integer__integer__boolean();

		/**
		 * The meta object literal for the '<em><b>integer is greater than or equal to integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_GREATER_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops___integer_is_greater_than_or_equal_to__integer_is__boolean___integer__integer__boolean();

		/**
		 * The meta object literal for the '<em><b>integer is greater than integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_GREATER_THAN_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops___integer_is_greater_than__integer_is__boolean___integer__integer__boolean();

		/**
		 * The meta object literal for the '<em><b>integer is less than or equal to integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_LESS_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops___integer_is_less_than_or_equal_to__integer_is__boolean___integer__integer__boolean();

		/**
		 * The meta object literal for the '<em><b>integer is less than integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_LESS_THAN_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops___integer_is_less_than__integer_is__boolean___integer__integer__boolean();

		/**
		 * The meta object literal for the '<em><b>The addition of integer with integer is integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___THE_ADDITION_OF_INTEGER_WITH_INTEGER_IS_INTEGER__INTEGER_WITH__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER = eINSTANCE.get_ops__The_addition_of__integer_with__integer_is__integer___integer__integer__integer();

		/**
		 * The meta object literal for the '<em><b>The difference between integer and integer is integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___THE_DIFFERENCE_BETWEEN_INTEGER_AND_INTEGER_IS_INTEGER__INTEGER_AND__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER = eINSTANCE.get_ops__The_difference_between__integer_and__integer_is__integer___integer__integer__integer();

		/**
		 * The meta object literal for the '<em><b>string is equal to string is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___STRING_IS_EQUAL_TO_STRING_IS_BOOLEAN__STRING_IS__BOOLEAN___STRING__STRING__BOOLEAN = eINSTANCE.get_ops___string_is_equal_to__string_is__boolean___string__string__boolean();

		/**
		 * The meta object literal for the '<em><b>Require press enter to continue</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___REQUIRE_PRESS_ENTER_TO_CONTINUE = eINSTANCE.get_ops__Require_press_enter_to_continue();

		/**
		 * The meta object literal for the '<em><b>Clear the screen</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___CLEAR_THE_SCREEN = eINSTANCE.get_ops__Clear_the_screen();

		/**
		 * The meta object literal for the '<em><b>Name is name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___NAME_IS_NAME__NAME_NAME = eINSTANCE.get_ops__Name_is_name__name_name();

		/**
		 * The meta object literal for the '<em><b>Output client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___OUTPUT_CLIENT__CLIENT = eINSTANCE.get_ops__Output_client__client();

		/**
		 * The meta object literal for the '<em><b>Output account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___OUTPUT_ACCOUNT__ACCOUNT = eINSTANCE.get_ops__Output_account__account();

		/**
		 * The meta object literal for the '<em><b>Account is the element number integer on account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___ACCOUNT_IS_THE_ELEMENT_NUMBER_INTEGER_ON_ACCOUNT__INTEGER_ON_ACCOUNT__ACCOUNT__INTEGER_ELIST = eINSTANCE.get_ops__Account_is_the_element_number__integer_on_account__account__integer_EList();

		/**
		 * The meta object literal for the '<em><b>integer is the number of elements in account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_THE_NUMBER_OF_ELEMENTS_IN_ACCOUNT___INTEGER_ELIST = eINSTANCE.get_ops___integer_is_the_number_of_elements_in_account___integer_EList();

		/**
		 * The meta object literal for the '<em><b>Client is the element number integer on client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___CLIENT_IS_THE_ELEMENT_NUMBER_INTEGER_ON_CLIENT__INTEGER_ON_CLIENT__CLIENT__INTEGER_ELIST = eINSTANCE.get_ops__Client_is_the_element_number__integer_on_client__client__integer_EList();

		/**
		 * The meta object literal for the '<em><b>integer is the number of elements in client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_THE_NUMBER_OF_ELEMENTS_IN_CLIENT___INTEGER_ELIST = eINSTANCE.get_ops___integer_is_the_number_of_elements_in_client___integer_EList();

		/**
		 * The meta object literal for the '<em><b>Add client to bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___ADD_CLIENT_TO_BANK__CLIENT_BANK = eINSTANCE.get_ops__Add_client_to_bank__client_bank();

		/**
		 * The meta object literal for the '<em><b>Add account to bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___ADD_ACCOUNT_TO_BANK__ACCOUNT_BANK = eINSTANCE.get_ops__Add_account_to_bank__account_bank();

		/**
		 * The meta object literal for the '<em><b>Generate client id unique to bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___GENERATE_CLIENT_ID_UNIQUE_TO_BANK__CLIENT_ID_BANK = eINSTANCE.get_ops__Generate_client_id_unique_to_bank__client_id_bank();

		/**
		 * The meta object literal for the '<em><b>Generate account id unique to bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___GENERATE_ACCOUNT_ID_UNIQUE_TO_BANK__ACCOUNT_ID_BANK = eINSTANCE.get_ops__Generate_account_id_unique_to_bank__account_id_bank();

		/**
		 * The meta object literal for the '<em><b>Create client on bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___CREATE_CLIENT_ON_BANK__CLIENT_BANK = eINSTANCE.get_ops__Create_client_on_bank__client_bank();

		/**
		 * The meta object literal for the '<em><b>Client is the client with client id on bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___CLIENT_IS_THE_CLIENT_WITH_CLIENT_ID_ON_BANK__CLIENT_CLIENT_ID_BANK = eINSTANCE.get_ops__Client_is_the_client_with_client_id_on_bank__client_client_id_bank();

		/**
		 * The meta object literal for the '<em><b>Client id is valid for bank is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___CLIENT_ID_IS_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN = eINSTANCE.get_ops__Client_id_is_valid_for_bank_is__boolean__client_id_bank__boolean();

		/**
		 * The meta object literal for the '<em><b>Client id is valid for client numbers integer to integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___CLIENT_ID_IS_VALID_FOR_CLIENT_NUMBERS_INTEGER_TO_INTEGER_IS_BOOLEAN__INTEGER_TO__INTEGER_IS__BOOLEAN__CLIENT_ID_ELIST__INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops__Client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean__client_id_EList__integer__integer__boolean();

		/**
		 * The meta object literal for the '<em><b>Client id is not valid for bank is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___CLIENT_ID_IS_NOT_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN = eINSTANCE.get_ops__Client_id_is_not_valid_for_bank_is__boolean__client_id_bank__boolean();

		/**
		 * The meta object literal for the '<em><b>List all client in bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LIST_ALL_CLIENT_IN_BANK__BANK = eINSTANCE.get_ops__List_all_client_in_bank__bank();

		/**
		 * The meta object literal for the '<em><b>List clients number integer to integer on client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LIST_CLIENTS_NUMBER_INTEGER_TO_INTEGER_ON_CLIENT__INTEGER_TO__INTEGER_ON_CLIENT___INTEGER__INTEGER_ELIST = eINSTANCE.get_ops__List_clients_number__integer_to__integer_on_client___integer__integer_EList();

		/**
		 * The meta object literal for the '<em><b>List all accounts in bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LIST_ALL_ACCOUNTS_IN_BANK__BANK = eINSTANCE.get_ops__List_all_accounts_in_bank__bank();

		/**
		 * The meta object literal for the '<em><b>List accounts number integer to integer on account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LIST_ACCOUNTS_NUMBER_INTEGER_TO_INTEGER_ON_ACCOUNT__INTEGER_TO__INTEGER_ON_ACCOUNT___INTEGER__INTEGER_ELIST = eINSTANCE.get_ops__List_accounts_number__integer_to__integer_on_account___integer__integer_EList();

		/**
		 * The meta object literal for the '<em><b>Create account on bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___CREATE_ACCOUNT_ON_BANK__ACCOUNT_BANK = eINSTANCE.get_ops__Create_account_on_bank__account_bank();

		/**
		 * The meta object literal for the '<em><b>Account is the account with account id on bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___ACCOUNT_IS_THE_ACCOUNT_WITH_ACCOUNT_ID_ON_BANK__ACCOUNT_ACCOUNT_ID_BANK = eINSTANCE.get_ops__Account_is_the_account_with_account_id_on_bank__account_account_id_bank();

		/**
		 * The meta object literal for the '<em><b>Account id is valid for bank is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___ACCOUNT_ID_IS_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__ACCOUNT_ID_BANK__BOOLEAN = eINSTANCE.get_ops__Account_id_is_valid_for_bank_is__boolean__account_id_bank__boolean();

		/**
		 * The meta object literal for the '<em><b>Account id is not valid for bank is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___ACCOUNT_ID_IS_NOT_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__ACCOUNT_ID_BANK__BOOLEAN = eINSTANCE.get_ops__Account_id_is_not_valid_for_bank_is__boolean__account_id_bank__boolean();

		/**
		 * The meta object literal for the '<em><b>The client with client id has accounts on bank is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___THE_CLIENT_WITH_CLIENT_ID_HAS_ACCOUNTS_ON_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN = eINSTANCE.get_ops__The_client_with_client_id_has_accounts_on_bank_is__boolean__client_id_bank__boolean();

		/**
		 * The meta object literal for the '<em><b>Remove the client with client id from bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___REMOVE_THE_CLIENT_WITH_CLIENT_ID_FROM_BANK__CLIENT_ID_BANK = eINSTANCE.get_ops__Remove_the_client_with_client_id_from_bank__client_id_bank();

		/**
		 * The meta object literal for the '<em><b>Remove the account with account id from bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___REMOVE_THE_ACCOUNT_WITH_ACCOUNT_ID_FROM_BANK__ACCOUNT_ID_BANK = eINSTANCE.get_ops__Remove_the_account_with_account_id_from_bank__account_id_bank();

		/**
		 * The meta object literal for the '<em><b>Show welcome message for bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___SHOW_WELCOME_MESSAGE_FOR_BANK__BANK = eINSTANCE.get_ops__Show_welcome_message_for_bank__bank();

		/**
		 * The meta object literal for the '<em><b>Launch create aclient page for bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LAUNCH_CREATE_ACLIENT_PAGE_FOR_BANK__BANK = eINSTANCE.get_ops__Launch_create_a_client_page_for_bank__bank();

		/**
		 * The meta object literal for the '<em><b>Launch create an account page for bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LAUNCH_CREATE_AN_ACCOUNT_PAGE_FOR_BANK__BANK = eINSTANCE.get_ops__Launch_create_an_account_page_for_bank__bank();

		/**
		 * The meta object literal for the '<em><b>Launch remove aclient page for bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LAUNCH_REMOVE_ACLIENT_PAGE_FOR_BANK__BANK = eINSTANCE.get_ops__Launch_remove_a_client_page_for_bank__bank();

		/**
		 * The meta object literal for the '<em><b>Launch remove an account page for bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LAUNCH_REMOVE_AN_ACCOUNT_PAGE_FOR_BANK__BANK = eINSTANCE.get_ops__Launch_remove_an_account_page_for_bank__bank();

		/**
		 * The meta object literal for the '<em><b>Launch main menu for bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LAUNCH_MAIN_MENU_FOR_BANK__BANK = eINSTANCE.get_ops__Launch_main_menu_for_bank__bank();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___MAIN = eINSTANCE.get_ops__Main();

	}

} //SystemPackage
