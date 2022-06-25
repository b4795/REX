/**
 */
package Bank.System.impl;

import Bank.System.SystemPackage;
import Bank.System._boolean;
import Bank.System._integer;
import Bank.System._ops;
import Bank.System._string;
import Bank.System.account;
import Bank.System.account_id;
import Bank.System.bank;
import Bank.System.client;
import Bank.System.client_id;
import Bank.System.name;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ops</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class _opsImpl extends MinimalEObjectImpl.Container implements _ops {

	int last_client_id = 0;
	int last_account_id = 0;
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _opsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals._OPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void output__integer(_integer X) {
		System.out.print(X.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void output__string(_string X) {
		System.out.print(X.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void output_a_new_line() {
		System.out.println();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _boolean_is_false(_boolean B) {
		B.setValue(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _boolean_is_true(_boolean B) {
		B.setValue(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is__integer(_integer X, _integer Y) {
		X.setValue(Y.getValue());;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _string_is__string(_string X, _string Y) {
		X.setValue(Y.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void read_input_from_user_and_store_it_in__integer(_integer I) {
		I.setValue(scanner.nextInt());
		scanner.nextLine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void read_input_from_user_and_store_it_in__string(_string S) {
		S.setValue(scanner.nextLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B) {
		B.setValue(X.getValue() == Y.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is_not_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B) {
		B.setValue(X.getValue() != Y.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is_greater_than_or_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B) {
		B.setValue(X.getValue() >= Y.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is_greater_than__integer_is__boolean(_integer X, _integer Y, _boolean B) {
		B.setValue(X.getValue() > Y.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is_less_than_or_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B) {
		B.setValue(X.getValue() <= Y.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is_less_than__integer_is__boolean(_integer X, _integer Y, _boolean B) {
		B.setValue(X.getValue() < Y.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void the_addition_of__integer_with__integer_is__integer(_integer A, _integer B, _integer X) {
		X.setValue(A.getValue() + B.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void the_difference_between__integer_and__integer_is__integer(_integer A, _integer B, _integer X) {
		X.setValue(A.getValue() - B.getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _string_is_equal_to__string_is__boolean(_string X, _string Y, _boolean B) {
		B.setValue(X.getValue().equals(Y.getValue()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void require_press_enter_to_continue() {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string15522 = factory.create_string();
		_local__string15522.setValue("Press ENTER to continue...");
		output__string(_local__string15522);
		_string S = factory.create_string();
		read_input_from_user_and_store_it_in__string(S);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear_the_screen() {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		output_a_new_line();
		output_a_new_line();
		output_a_new_line();
		output_a_new_line();
		output_a_new_line();
		output_a_new_line();
		output_a_new_line();
		output_a_new_line();
		output_a_new_line();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void name_is_name(final name N1, final name N2) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string fn = factory.create_string();
		_string ln = factory.create_string();
		_string_is__string(fn, N2.getFirst_name());
		_string_is__string(ln, N2.getLast_name());
		_string_is__string(N1.getFirst_name(), fn);
		_string_is__string(N1.getLast_name(), ln);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void output_client(final client C) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string568443 = factory.create_string();
		_local__string568443.setValue(" ");
		_string _local__string50821 = factory.create_string();
		_local__string50821.setValue(" (id: ");
		_string _local__string65903 = factory.create_string();
		_local__string65903.setValue(")");
		name N = factory.createname();
		name_is_name(N, C.getName());
		output__string(N.getFirst_name());
		output__string(_local__string568443);
		output__string(N.getLast_name());
		output__string(_local__string50821);
		output__integer(C.getClient_id());
		output__string(_local__string65903);
		output_a_new_line();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void output_account(final account A) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string860422 = factory.create_string();
		_local__string860422.setValue("account #");
		_string _local__string746391 = factory.create_string();
		_local__string746391.setValue(" (client id: ");
		_string _local__string565972 = factory.create_string();
		_local__string565972.setValue(", amount available: ");
		_string _local__string611089 = factory.create_string();
		_local__string611089.setValue(")");
		output__string(_local__string860422);
		output__integer(A.getAccount_id());
		output__string(_local__string746391);
		output__integer(A.getClient_id());
		output__string(_local__string565972);
		output__integer(A.getAmount_available());
		output__string(_local__string611089);
		output_a_new_line();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void account_is_the_element_number__integer_on_account(account A, _integer N, EList<account> As) {
		account a = As.get(N.getValue() - 1);
		A.setAccount_id(a.getAccount_id());
		A.setAmount_available(a.getAmount_available());
		A.setClient_id(a.getClient_id());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is_the_number_of_elements_in_account(_integer N, EList<account> As) {
		N.setValue(As.size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void client_is_the_element_number__integer_on_client(client C, _integer N, EList<client> Cs) {
		client c = Cs.get(N.getValue() - 1);
		C.setName(c.getName());
		C.setClient_id(c.getClient_id());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void _integer_is_the_number_of_elements_in_client(_integer N, EList<client> Cs) {
		N.setValue(Cs.size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void add_client_to_bank(client C, bank B) {
		B.getClients().add(C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void add_account_to_bank(account C, bank B) {
		B.getAccounts().add(C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generate_client_id_unique_to_bank(client_id I, bank B) {
		last_client_id += 1;
		I.setValue(last_client_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generate_account_id_unique_to_bank(account_id I, bank B) {
		last_account_id += 1;
		I.setValue(last_account_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create_client_on_bank(final client C, final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string440289 = factory.create_string();
		_local__string440289.setValue("First name: ");
		_string _local__string176059 = factory.create_string();
		_local__string176059.setValue("Last name: ");
		name N = factory.createname();
		client_id I = factory.createclient_id();
		output__string(_local__string440289);
		read_input_from_user_and_store_it_in__string(N.getFirst_name());
		output__string(_local__string176059);
		read_input_from_user_and_store_it_in__string(N.getLast_name());
		name_is_name(C.getName(), N);
		generate_client_id_unique_to_bank(I, B);
		_integer_is__integer(C.getClient_id(), I);
		add_client_to_bank(C, B);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void client_is_the_client_with_client_id_on_bank(client C, client_id I, bank B) {
		for (client c : B.getClients()) {
			if (c.getClient_id().getValue() == I.getValue()) {
				C.setName(c.getName());
				C.setClient_id(c.getClient_id());
				return;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void client_id_is_valid_for_bank_is__boolean(final client_id I, final bank B, final _boolean Y) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_integer N = factory.create_integer();
		_integer_is_the_number_of_elements_in_client(N, B.getClients());
		_boolean _local_boolean330935 = factory.create_boolean();
		_integer _local__integer111077 = factory.create_integer();
		_local__integer111077.setValue(1);
		_integer_is_greater_than_or_equal_to__integer_is__boolean(N, _local__integer111077, _local_boolean330935);
		if (_local_boolean330935.isValue()) {
		_integer _local__integer566582 = factory.create_integer();
		_local__integer566582.setValue(1);
		client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean(I, B.getClients(), _local__integer566582, N, Y);
		}
		else {
		_boolean_is_false(Y);
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean(final client_id I, final EList<client> Cs, final _integer A, final _integer B, final _boolean Y) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_boolean _local_boolean865963 = factory.create_boolean();
		_integer_is_greater_than__integer_is__boolean(A, B, _local_boolean865963);
		if (_local_boolean865963.isValue()) {
		_boolean_is_false(Y);
		}
		else {
		client C = factory.createclient();
		client_is_the_element_number__integer_on_client(C, A, Cs);
		_boolean _local_boolean78397 = factory.create_boolean();
		_integer_is_equal_to__integer_is__boolean(I, C.getClient_id(), _local_boolean78397);
		if (_local_boolean78397.isValue()) {
		_boolean_is_true(Y);
		}
		else {
		_integer _local__integer649463 = factory.create_integer();
		_local__integer649463.setValue(1);
		the_addition_of__integer_with__integer_is__integer(A, _local__integer649463, A);
		client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean(I, Cs, A, B, Y);
		}
		;
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void client_id_is_not_valid_for_bank_is__boolean(final client_id I, final bank B, final _boolean Y) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_boolean _local_boolean927102 = factory.create_boolean();
		client_id_is_valid_for_bank_is__boolean(I, B, _local_boolean927102);
		if (_local_boolean927102.isValue()) {
		_boolean_is_false(Y);
		}
		else {
		_boolean_is_true(Y);
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void list_all_client_in_bank(final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_integer N = factory.create_integer();
		_integer_is_the_number_of_elements_in_client(N, B.getClients());
		_boolean _local_boolean300770 = factory.create_boolean();
		_integer _local__integer729900 = factory.create_integer();
		_local__integer729900.setValue(1);
		_integer_is_greater_than_or_equal_to__integer_is__boolean(N, _local__integer729900, _local_boolean300770);
		if (_local_boolean300770.isValue()) {
		_integer _local__integer619966 = factory.create_integer();
		_local__integer619966.setValue(1);
		list_clients_number__integer_to__integer_on_client(_local__integer619966, N, B.getClients());
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void list_clients_number__integer_to__integer_on_client(final _integer A, final _integer B, final EList<client> Cs) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_boolean _local_boolean786020 = factory.create_boolean();
		_integer_is_less_than_or_equal_to__integer_is__boolean(A, B, _local_boolean786020);
		if (_local_boolean786020.isValue()) {
		_integer _local__integer191829 = factory.create_integer();
		_local__integer191829.setValue(1);
		client C = factory.createclient();
		client_is_the_element_number__integer_on_client(C, A, Cs);
		output_client(C);
		the_addition_of__integer_with__integer_is__integer(A, _local__integer191829, A);
		list_clients_number__integer_to__integer_on_client(A, B, Cs);
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void list_all_accounts_in_bank(final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_integer N = factory.create_integer();
		_integer_is_the_number_of_elements_in_account(N, B.getAccounts());
		_boolean _local_boolean24761 = factory.create_boolean();
		_integer _local__integer943657 = factory.create_integer();
		_local__integer943657.setValue(1);
		_integer_is_greater_than_or_equal_to__integer_is__boolean(N, _local__integer943657, _local_boolean24761);
		if (_local_boolean24761.isValue()) {
		_integer _local__integer981403 = factory.create_integer();
		_local__integer981403.setValue(1);
		list_accounts_number__integer_to__integer_on_account(_local__integer981403, N, B.getAccounts());
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void list_accounts_number__integer_to__integer_on_account(final _integer A, final _integer B, final EList<account> ACCs) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_boolean _local_boolean349861 = factory.create_boolean();
		_integer_is_less_than_or_equal_to__integer_is__boolean(A, B, _local_boolean349861);
		if (_local_boolean349861.isValue()) {
		_integer _local__integer175345 = factory.create_integer();
		_local__integer175345.setValue(1);
		account ACC = factory.createaccount();
		account_is_the_element_number__integer_on_account(ACC, A, ACCs);
		output_account(ACC);
		the_addition_of__integer_with__integer_is__integer(A, _local__integer175345, A);
		list_accounts_number__integer_to__integer_on_account(A, B, ACCs);
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create_account_on_bank(final account A, final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_integer _local__integer421258 = factory.create_integer();
		_local__integer421258.setValue(0);
		account_id I = factory.createaccount_id();
		_integer_is__integer(A.getAmount_available(), _local__integer421258);
		generate_account_id_unique_to_bank(I, B);
		_integer_is__integer(A.getAccount_id(), I);
		add_account_to_bank(A, B);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void account_is_the_account_with_account_id_on_bank(account A, account_id I, bank B) {
		for (account a : B.getAccounts()) {
			if (a.getAccount_id().getValue() == I.getValue()) {
				A.setAccount_id(a.getAccount_id());
				A.setAmount_available(a.getAmount_available());
				A.setClient_id(a.getClient_id());
				return;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void account_id_is_valid_for_bank_is__boolean(account_id I, bank B, _boolean Y) {
		for (account a : B.getAccounts()) {
			if (a.getAccount_id().getValue() == I.getValue()) {
				Y.setValue(true);
				return;
			}
		}
		Y.setValue(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void account_id_is_not_valid_for_bank_is__boolean(final account_id I, final bank B, final _boolean Y) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_boolean _local_boolean110057 = factory.create_boolean();
		account_id_is_valid_for_bank_is__boolean(I, B, _local_boolean110057);
		if (_local_boolean110057.isValue()) {
		_boolean_is_false(Y);
		}
		else {
		_boolean_is_true(Y);
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void the_client_with_client_id_has_accounts_on_bank_is__boolean(client_id I, bank B, _boolean Y) {
		for (account a : B.getAccounts()) {
			if (a.getClient_id().getValue() == I.getValue()) {
				Y.setValue(true);
				return;
			}
		}
		Y.setValue(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void remove_the_client_with_client_id_from_bank(client_id I, bank B) {
		for (client c : B.getClients()) {
			if (c.getClient_id().getValue() == I.getValue()) {
				B.getClients().remove(c);
				return;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void remove_the_account_with_account_id_from_bank(account_id I, bank B) {
		for (account a : B.getAccounts()) {
			if (a.getAccount_id().getValue() == I.getValue()) {
				B.getAccounts().remove(a);
				return;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void show_welcome_message_for_bank(final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string367360 = factory.create_string();
		_local__string367360.setValue("Welcome to ");
		_string _local__string997267 = factory.create_string();
		_local__string997267.setValue("!");
		_string _local__string827310 = factory.create_string();
		_local__string827310.setValue("If you don't find what you are looking for,");
		_string _local__string907892 = factory.create_string();
		_local__string907892.setValue("you can reach us at the following address:");
		_string _local__string974065 = factory.create_string();
		_local__string974065.setValue("    ");
		output__string(_local__string367360);
		output__string(B.getCompany_name());
		output__string(_local__string997267);
		output_a_new_line();
		output_a_new_line();
		output__string(_local__string827310);
		output_a_new_line();
		output__string(_local__string907892);
		output_a_new_line();
		output_a_new_line();
		output__string(_local__string974065);
		output__string(B.getAddress());
		output_a_new_line();
		output_a_new_line();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void launch_create_a_client_page_for_bank(final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string321219 = factory.create_string();
		_local__string321219.setValue("CREATE A NEW CLIENT");
		output__string(_local__string321219);
		output_a_new_line();
		client C = factory.createclient();
		create_client_on_bank(C, B);
		output_client(C);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void launch_create_an_account_page_for_bank(final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string620774 = factory.create_string();
		_local__string620774.setValue("CREATE A NEW ACCOUNT");
		_string _local__string468893 = factory.create_string();
		_local__string468893.setValue("Client id: ");
		output__string(_local__string620774);
		output_a_new_line();
		client_id I = factory.createclient_id();
		output__string(_local__string468893);
		read_input_from_user_and_store_it_in__integer(I);
		_boolean _local_boolean743664 = factory.create_boolean();
		client_id_is_valid_for_bank_is__boolean(I, B, _local_boolean743664);
		if (_local_boolean743664.isValue()) {
		account A = factory.createaccount();
		create_account_on_bank(A, B);
		_integer_is__integer(A.getClient_id(), I);
		output_account(A);
		}
		else {
		_string _local__string895097 = factory.create_string();
		_local__string895097.setValue("That is not valid client id. Please try again.");
		output__string(_local__string895097);
		output_a_new_line();
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void launch_remove_a_client_page_for_bank(final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string194811 = factory.create_string();
		_local__string194811.setValue("REMOVE A CLIENT");
		_string _local__string492571 = factory.create_string();
		_local__string492571.setValue("Client id: ");
		output__string(_local__string194811);
		output_a_new_line();
		client_id I = factory.createclient_id();
		output__string(_local__string492571);
		read_input_from_user_and_store_it_in__integer(I);
		_boolean _local_boolean133509 = factory.create_boolean();
		client_id_is_not_valid_for_bank_is__boolean(I, B, _local_boolean133509);
		if (_local_boolean133509.isValue()) {
		_string _local__string499406 = factory.create_string();
		_local__string499406.setValue("That is not valid client id. Please try again.");
		output__string(_local__string499406);
		output_a_new_line();
		}
		else {
		_boolean _local_boolean523137 = factory.create_boolean();
		the_client_with_client_id_has_accounts_on_bank_is__boolean(I, B, _local_boolean523137);
		if (_local_boolean523137.isValue()) {
		_string _local__string964410 = factory.create_string();
		_local__string964410.setValue("The client has accounts. Please remove them first.");
		output__string(_local__string964410);
		output_a_new_line();
		}
		else {
		remove_the_client_with_client_id_from_bank(I, B);
		}
		;
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void launch_remove_an_account_page_for_bank(final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string61703 = factory.create_string();
		_local__string61703.setValue("REMOVE AN ACCOUNT");
		_string _local__string104291 = factory.create_string();
		_local__string104291.setValue("Account id: ");
		output__string(_local__string61703);
		output_a_new_line();
		account_id I = factory.createaccount_id();
		output__string(_local__string104291);
		read_input_from_user_and_store_it_in__integer(I);
		_boolean _local_boolean935589 = factory.create_boolean();
		account_id_is_not_valid_for_bank_is__boolean(I, B, _local_boolean935589);
		if (_local_boolean935589.isValue()) {
		_string _local__string89597 = factory.create_string();
		_local__string89597.setValue("That is not valid account id. Please try again.");
		output__string(_local__string89597);
		output_a_new_line();
		}
		else {
		account C = factory.createaccount();
		account_is_the_account_with_account_id_on_bank(C, I, B);
		_boolean _local_boolean376865 = factory.create_boolean();
		_integer _local__integer932008 = factory.create_integer();
		_local__integer932008.setValue(0);
		_integer_is_not_equal_to__integer_is__boolean(C.getAmount_available(), _local__integer932008, _local_boolean376865);
		if (_local_boolean376865.isValue()) {
		_string _local__string614565 = factory.create_string();
		_local__string614565.setValue("The account is not empty. Please empty it first.");
		output__string(_local__string614565);
		output_a_new_line();
		}
		else {
		remove_the_account_with_account_id_from_bank(I, B);
		}
		;
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void launch_main_menu_for_bank(final bank B) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string330853 = factory.create_string();
		_local__string330853.setValue("1. List clients");
		_string _local__string272922 = factory.create_string();
		_local__string272922.setValue("2. List accounts");
		_string _local__string445087 = factory.create_string();
		_local__string445087.setValue("3. Create a client");
		_string _local__string227723 = factory.create_string();
		_local__string227723.setValue("4. Create an account");
		_string _local__string477077 = factory.create_string();
		_local__string477077.setValue("5. Remove a client");
		_string _local__string51412 = factory.create_string();
		_local__string51412.setValue("6. Remove an account");
		_string _local__string260540 = factory.create_string();
		_local__string260540.setValue("7. Deposit");
		_string _local__string460682 = factory.create_string();
		_local__string460682.setValue("8. Withdraw");
		_string _local__string262885 = factory.create_string();
		_local__string262885.setValue("9. Transfer");
		_string _local__string258325 = factory.create_string();
		_local__string258325.setValue("0. Exit");
		_string _local__string556783 = factory.create_string();
		_local__string556783.setValue("What would you like to do? Enter an option: ");
		clear_the_screen();
		show_welcome_message_for_bank(B);
		output__string(_local__string330853);
		output_a_new_line();
		output__string(_local__string272922);
		output_a_new_line();
		output__string(_local__string445087);
		output_a_new_line();
		output__string(_local__string227723);
		output_a_new_line();
		output__string(_local__string477077);
		output_a_new_line();
		output__string(_local__string51412);
		output_a_new_line();
		output__string(_local__string260540);
		output_a_new_line();
		output__string(_local__string460682);
		output_a_new_line();
		output__string(_local__string262885);
		output_a_new_line();
		output__string(_local__string258325);
		output_a_new_line();
		output_a_new_line();
		output__string(_local__string556783);
		_string O = factory.create_string();
		read_input_from_user_and_store_it_in__string(O);
		output_a_new_line();
		output_a_new_line();
		_boolean _local_boolean524259 = factory.create_boolean();
		_string _local__string148618 = factory.create_string();
		_local__string148618.setValue("1");
		_string_is_equal_to__string_is__boolean(O, _local__string148618, _local_boolean524259);
		if (_local_boolean524259.isValue()) {
		_string _local__string822438 = factory.create_string();
		_local__string822438.setValue("LIST OF CLIENTS");
		output__string(_local__string822438);
		output_a_new_line();
		list_all_client_in_bank(B);
		require_press_enter_to_continue();
		launch_main_menu_for_bank(B);
		}
		else {
		_boolean _local_boolean284026 = factory.create_boolean();
		_string _local__string178015 = factory.create_string();
		_local__string178015.setValue("2");
		_string_is_equal_to__string_is__boolean(O, _local__string178015, _local_boolean284026);
		if (_local_boolean284026.isValue()) {
		_string _local__string169717 = factory.create_string();
		_local__string169717.setValue("LIST OF ACCOUNTS");
		output__string(_local__string169717);
		output_a_new_line();
		list_all_accounts_in_bank(B);
		require_press_enter_to_continue();
		launch_main_menu_for_bank(B);
		}
		else {
		_boolean _local_boolean34084 = factory.create_boolean();
		_string _local__string995 = factory.create_string();
		_local__string995.setValue("3");
		_string_is_equal_to__string_is__boolean(O, _local__string995, _local_boolean34084);
		if (_local_boolean34084.isValue()) {
		launch_create_a_client_page_for_bank(B);
		require_press_enter_to_continue();
		launch_main_menu_for_bank(B);
		}
		else {
		_boolean _local_boolean790941 = factory.create_boolean();
		_string _local__string52249 = factory.create_string();
		_local__string52249.setValue("4");
		_string_is_equal_to__string_is__boolean(O, _local__string52249, _local_boolean790941);
		if (_local_boolean790941.isValue()) {
		launch_create_an_account_page_for_bank(B);
		require_press_enter_to_continue();
		launch_main_menu_for_bank(B);
		}
		else {
		_boolean _local_boolean767609 = factory.create_boolean();
		_string _local__string284043 = factory.create_string();
		_local__string284043.setValue("5");
		_string_is_equal_to__string_is__boolean(O, _local__string284043, _local_boolean767609);
		if (_local_boolean767609.isValue()) {
		launch_remove_a_client_page_for_bank(B);
		require_press_enter_to_continue();
		launch_main_menu_for_bank(B);
		}
		else {
		_boolean _local_boolean330005 = factory.create_boolean();
		_string _local__string33144 = factory.create_string();
		_local__string33144.setValue("6");
		_string_is_equal_to__string_is__boolean(O, _local__string33144, _local_boolean330005);
		if (_local_boolean330005.isValue()) {
		launch_remove_an_account_page_for_bank(B);
		require_press_enter_to_continue();
		launch_main_menu_for_bank(B);
		}
		else {
		_boolean _local_boolean646881 = factory.create_boolean();
		_string _local__string10996 = factory.create_string();
		_local__string10996.setValue("0");
		_string_is_equal_to__string_is__boolean(O, _local__string10996, _local_boolean646881);
		if (_local_boolean646881.isValue()) {
		_string _local__string53671 = factory.create_string();
		_local__string53671.setValue("LEAVING...");
		output__string(_local__string53671);
		output_a_new_line();
		}
		else {
		_string _local__string283188 = factory.create_string();
		_local__string283188.setValue("That option is not valid or it is not implemented. Please try again.");
		output__string(_local__string283188);
		output_a_new_line();
		require_press_enter_to_continue();
		launch_main_menu_for_bank(B);
		}
		;
		}
		;
		}
		;
		}
		;
		}
		;
		}
		;
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main() {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string207996 = factory.create_string();
		_local__string207996.setValue("XPTO Bank");
		_string _local__string478677 = factory.create_string();
		_local__string478677.setValue("XPTO Bank, Street S, City C, Country C2");
		bank B = factory.createbank();
		_string_is__string(B.getCompany_name(), _local__string207996);
		_string_is__string(B.getAddress(), _local__string478677);
		launch_main_menu_for_bank(B);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SystemPackage._OPS___OUTPUT_INTEGER__INTEGER___INTEGER:
				output__integer((_integer)arguments.get(0));
				return null;
			case SystemPackage._OPS___OUTPUT_STRING__STRING___STRING:
				output__string((_string)arguments.get(0));
				return null;
			case SystemPackage._OPS___OUTPUT_ANEW_LINE:
				output_a_new_line();
				return null;
			case SystemPackage._OPS___BOOLEAN_IS_FALSE___BOOLEAN:
				_boolean_is_false((_boolean)arguments.get(0));
				return null;
			case SystemPackage._OPS___BOOLEAN_IS_TRUE___BOOLEAN:
				_boolean_is_true((_boolean)arguments.get(0));
				return null;
			case SystemPackage._OPS___INTEGER_IS_INTEGER__INTEGER___INTEGER__INTEGER:
				_integer_is__integer((_integer)arguments.get(0), (_integer)arguments.get(1));
				return null;
			case SystemPackage._OPS___STRING_IS_STRING__STRING___STRING__STRING:
				_string_is__string((_string)arguments.get(0), (_string)arguments.get(1));
				return null;
			case SystemPackage._OPS___READ_INPUT_FROM_USER_AND_STORE_IT_IN_INTEGER__INTEGER___INTEGER:
				read_input_from_user_and_store_it_in__integer((_integer)arguments.get(0));
				return null;
			case SystemPackage._OPS___READ_INPUT_FROM_USER_AND_STORE_IT_IN_STRING__STRING___STRING:
				read_input_from_user_and_store_it_in__string((_string)arguments.get(0));
				return null;
			case SystemPackage._OPS___INTEGER_IS_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN:
				_integer_is_equal_to__integer_is__boolean((_integer)arguments.get(0), (_integer)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___INTEGER_IS_NOT_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN:
				_integer_is_not_equal_to__integer_is__boolean((_integer)arguments.get(0), (_integer)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___INTEGER_IS_GREATER_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN:
				_integer_is_greater_than_or_equal_to__integer_is__boolean((_integer)arguments.get(0), (_integer)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___INTEGER_IS_GREATER_THAN_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN:
				_integer_is_greater_than__integer_is__boolean((_integer)arguments.get(0), (_integer)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___INTEGER_IS_LESS_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN:
				_integer_is_less_than_or_equal_to__integer_is__boolean((_integer)arguments.get(0), (_integer)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___INTEGER_IS_LESS_THAN_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN:
				_integer_is_less_than__integer_is__boolean((_integer)arguments.get(0), (_integer)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___THE_ADDITION_OF_INTEGER_WITH_INTEGER_IS_INTEGER__INTEGER_WITH__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER:
				the_addition_of__integer_with__integer_is__integer((_integer)arguments.get(0), (_integer)arguments.get(1), (_integer)arguments.get(2));
				return null;
			case SystemPackage._OPS___THE_DIFFERENCE_BETWEEN_INTEGER_AND_INTEGER_IS_INTEGER__INTEGER_AND__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER:
				the_difference_between__integer_and__integer_is__integer((_integer)arguments.get(0), (_integer)arguments.get(1), (_integer)arguments.get(2));
				return null;
			case SystemPackage._OPS___STRING_IS_EQUAL_TO_STRING_IS_BOOLEAN__STRING_IS__BOOLEAN___STRING__STRING__BOOLEAN:
				_string_is_equal_to__string_is__boolean((_string)arguments.get(0), (_string)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___REQUIRE_PRESS_ENTER_TO_CONTINUE:
				require_press_enter_to_continue();
				return null;
			case SystemPackage._OPS___CLEAR_THE_SCREEN:
				clear_the_screen();
				return null;
			case SystemPackage._OPS___NAME_IS_NAME__NAME_NAME:
				name_is_name((name)arguments.get(0), (name)arguments.get(1));
				return null;
			case SystemPackage._OPS___OUTPUT_CLIENT__CLIENT:
				output_client((client)arguments.get(0));
				return null;
			case SystemPackage._OPS___OUTPUT_ACCOUNT__ACCOUNT:
				output_account((account)arguments.get(0));
				return null;
			case SystemPackage._OPS___ACCOUNT_IS_THE_ELEMENT_NUMBER_INTEGER_ON_ACCOUNT__INTEGER_ON_ACCOUNT__ACCOUNT__INTEGER_ELIST:
				account_is_the_element_number__integer_on_account((account)arguments.get(0), (_integer)arguments.get(1), (EList<account>)arguments.get(2));
				return null;
			case SystemPackage._OPS___INTEGER_IS_THE_NUMBER_OF_ELEMENTS_IN_ACCOUNT___INTEGER_ELIST:
				_integer_is_the_number_of_elements_in_account((_integer)arguments.get(0), (EList<account>)arguments.get(1));
				return null;
			case SystemPackage._OPS___CLIENT_IS_THE_ELEMENT_NUMBER_INTEGER_ON_CLIENT__INTEGER_ON_CLIENT__CLIENT__INTEGER_ELIST:
				client_is_the_element_number__integer_on_client((client)arguments.get(0), (_integer)arguments.get(1), (EList<client>)arguments.get(2));
				return null;
			case SystemPackage._OPS___INTEGER_IS_THE_NUMBER_OF_ELEMENTS_IN_CLIENT___INTEGER_ELIST:
				_integer_is_the_number_of_elements_in_client((_integer)arguments.get(0), (EList<client>)arguments.get(1));
				return null;
			case SystemPackage._OPS___ADD_CLIENT_TO_BANK__CLIENT_BANK:
				add_client_to_bank((client)arguments.get(0), (bank)arguments.get(1));
				return null;
			case SystemPackage._OPS___ADD_ACCOUNT_TO_BANK__ACCOUNT_BANK:
				add_account_to_bank((account)arguments.get(0), (bank)arguments.get(1));
				return null;
			case SystemPackage._OPS___GENERATE_CLIENT_ID_UNIQUE_TO_BANK__CLIENT_ID_BANK:
				generate_client_id_unique_to_bank((client_id)arguments.get(0), (bank)arguments.get(1));
				return null;
			case SystemPackage._OPS___GENERATE_ACCOUNT_ID_UNIQUE_TO_BANK__ACCOUNT_ID_BANK:
				generate_account_id_unique_to_bank((account_id)arguments.get(0), (bank)arguments.get(1));
				return null;
			case SystemPackage._OPS___CREATE_CLIENT_ON_BANK__CLIENT_BANK:
				create_client_on_bank((client)arguments.get(0), (bank)arguments.get(1));
				return null;
			case SystemPackage._OPS___CLIENT_IS_THE_CLIENT_WITH_CLIENT_ID_ON_BANK__CLIENT_CLIENT_ID_BANK:
				client_is_the_client_with_client_id_on_bank((client)arguments.get(0), (client_id)arguments.get(1), (bank)arguments.get(2));
				return null;
			case SystemPackage._OPS___CLIENT_ID_IS_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN:
				client_id_is_valid_for_bank_is__boolean((client_id)arguments.get(0), (bank)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___CLIENT_ID_IS_VALID_FOR_CLIENT_NUMBERS_INTEGER_TO_INTEGER_IS_BOOLEAN__INTEGER_TO__INTEGER_IS__BOOLEAN__CLIENT_ID_ELIST__INTEGER__INTEGER__BOOLEAN:
				client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean((client_id)arguments.get(0), (EList<client>)arguments.get(1), (_integer)arguments.get(2), (_integer)arguments.get(3), (_boolean)arguments.get(4));
				return null;
			case SystemPackage._OPS___CLIENT_ID_IS_NOT_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN:
				client_id_is_not_valid_for_bank_is__boolean((client_id)arguments.get(0), (bank)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___CREATE_ACCOUNT_ON_BANK__ACCOUNT_BANK:
				create_account_on_bank((account)arguments.get(0), (bank)arguments.get(1));
				return null;
			case SystemPackage._OPS___ACCOUNT_IS_THE_ACCOUNT_WITH_ACCOUNT_ID_ON_BANK__ACCOUNT_ACCOUNT_ID_BANK:
				account_is_the_account_with_account_id_on_bank((account)arguments.get(0), (account_id)arguments.get(1), (bank)arguments.get(2));
				return null;
			case SystemPackage._OPS___ACCOUNT_ID_IS_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__ACCOUNT_ID_BANK__BOOLEAN:
				account_id_is_valid_for_bank_is__boolean((account_id)arguments.get(0), (bank)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___ACCOUNT_ID_IS_NOT_VALID_FOR_BANK_IS_BOOLEAN__BOOLEAN__ACCOUNT_ID_BANK__BOOLEAN:
				account_id_is_not_valid_for_bank_is__boolean((account_id)arguments.get(0), (bank)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___THE_CLIENT_WITH_CLIENT_ID_HAS_ACCOUNTS_ON_BANK_IS_BOOLEAN__BOOLEAN__CLIENT_ID_BANK__BOOLEAN:
				the_client_with_client_id_has_accounts_on_bank_is__boolean((client_id)arguments.get(0), (bank)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___REMOVE_THE_CLIENT_WITH_CLIENT_ID_FROM_BANK__CLIENT_ID_BANK:
				remove_the_client_with_client_id_from_bank((client_id)arguments.get(0), (bank)arguments.get(1));
				return null;
			case SystemPackage._OPS___REMOVE_THE_ACCOUNT_WITH_ACCOUNT_ID_FROM_BANK__ACCOUNT_ID_BANK:
				remove_the_account_with_account_id_from_bank((account_id)arguments.get(0), (bank)arguments.get(1));
				return null;
			case SystemPackage._OPS___LIST_ALL_CLIENT_IN_BANK__BANK:
				list_all_client_in_bank((bank)arguments.get(0));
				return null;
			case SystemPackage._OPS___LIST_CLIENTS_NUMBER_INTEGER_TO_INTEGER_ON_CLIENT__INTEGER_TO__INTEGER_ON_CLIENT___INTEGER__INTEGER_ELIST:
				list_clients_number__integer_to__integer_on_client((_integer)arguments.get(0), (_integer)arguments.get(1), (EList<client>)arguments.get(2));
				return null;
			case SystemPackage._OPS___LIST_ALL_ACCOUNTS_IN_BANK__BANK:
				list_all_accounts_in_bank((bank)arguments.get(0));
				return null;
			case SystemPackage._OPS___LIST_ACCOUNTS_NUMBER_INTEGER_TO_INTEGER_ON_ACCOUNT__INTEGER_TO__INTEGER_ON_ACCOUNT___INTEGER__INTEGER_ELIST:
				list_accounts_number__integer_to__integer_on_account((_integer)arguments.get(0), (_integer)arguments.get(1), (EList<account>)arguments.get(2));
				return null;
			case SystemPackage._OPS___SHOW_WELCOME_MESSAGE_FOR_BANK__BANK:
				show_welcome_message_for_bank((bank)arguments.get(0));
				return null;
			case SystemPackage._OPS___LAUNCH_CREATE_ACLIENT_PAGE_FOR_BANK__BANK:
				launch_create_a_client_page_for_bank((bank)arguments.get(0));
				return null;
			case SystemPackage._OPS___LAUNCH_CREATE_AN_ACCOUNT_PAGE_FOR_BANK__BANK:
				launch_create_an_account_page_for_bank((bank)arguments.get(0));
				return null;
			case SystemPackage._OPS___LAUNCH_REMOVE_ACLIENT_PAGE_FOR_BANK__BANK:
				launch_remove_a_client_page_for_bank((bank)arguments.get(0));
				return null;
			case SystemPackage._OPS___LAUNCH_REMOVE_AN_ACCOUNT_PAGE_FOR_BANK__BANK:
				launch_remove_an_account_page_for_bank((bank)arguments.get(0));
				return null;
			case SystemPackage._OPS___LAUNCH_MAIN_MENU_FOR_BANK__BANK:
				launch_main_menu_for_bank((bank)arguments.get(0));
				return null;
			case SystemPackage._OPS___MAIN:
				main();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //_opsImpl
