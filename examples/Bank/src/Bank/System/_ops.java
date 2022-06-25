/**
 */
package Bank.System;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ops</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Bank.System.SystemPackage#get_ops()
 * @model
 * @generated
 */
public interface _ops extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true"
	 * @generated
	 */
	void output__integer(_integer X);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true"
	 * @generated
	 */
	void output__string(_string X);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void output_a_new_line();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void _boolean_is_false(_boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void _boolean_is_true(_boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true"
	 * @generated
	 */
	void _integer_is__integer(_integer X, _integer Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true"
	 * @generated
	 */
	void _string_is__string(_string X, _string Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true"
	 * @generated
	 */
	void read_input_from_user_and_store_it_in__integer(_integer I);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SRequired="true"
	 * @generated
	 */
	void read_input_from_user_and_store_it_in__string(_string S);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true" BRequired="true"
	 * @generated
	 */
	void _integer_is_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true" BRequired="true"
	 * @generated
	 */
	void _integer_is_not_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true" BRequired="true"
	 * @generated
	 */
	void _integer_is_greater_than_or_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true" BRequired="true"
	 * @generated
	 */
	void _integer_is_greater_than__integer_is__boolean(_integer X, _integer Y, _boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true" BRequired="true"
	 * @generated
	 */
	void _integer_is_less_than_or_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true" BRequired="true"
	 * @generated
	 */
	void _integer_is_less_than__integer_is__boolean(_integer X, _integer Y, _boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ARequired="true" BRequired="true" XRequired="true"
	 * @generated
	 */
	void the_addition_of__integer_with__integer_is__integer(_integer A, _integer B, _integer X);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ARequired="true" BRequired="true" XRequired="true"
	 * @generated
	 */
	void the_difference_between__integer_and__integer_is__integer(_integer A, _integer B, _integer X);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true" BRequired="true"
	 * @generated
	 */
	void _string_is_equal_to__string_is__boolean(_string X, _string Y, _boolean B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void require_press_enter_to_continue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear_the_screen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model N1Required="true" N2Required="true"
	 * @generated
	 */
	void name_is_name(name N1, name N2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model CRequired="true"
	 * @generated
	 */
	void output_client(client C);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ARequired="true"
	 * @generated
	 */
	void output_account(account A);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ARequired="true" NRequired="true" AsMany="true"
	 * @generated
	 */
	void account_is_the_element_number__integer_on_account(account A, _integer N, EList<account> As);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model NRequired="true" AsMany="true"
	 * @generated
	 */
	void _integer_is_the_number_of_elements_in_account(_integer N, EList<account> As);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model CRequired="true" NRequired="true" CsMany="true"
	 * @generated
	 */
	void client_is_the_element_number__integer_on_client(client C, _integer N, EList<client> Cs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model NRequired="true" CsMany="true"
	 * @generated
	 */
	void _integer_is_the_number_of_elements_in_client(_integer N, EList<client> Cs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model CRequired="true" BRequired="true"
	 * @generated
	 */
	void add_client_to_bank(client C, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model CRequired="true" BRequired="true"
	 * @generated
	 */
	void add_account_to_bank(account C, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true"
	 * @generated
	 */
	void generate_client_id_unique_to_bank(client_id I, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true"
	 * @generated
	 */
	void generate_account_id_unique_to_bank(account_id I, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model CRequired="true" BRequired="true"
	 * @generated
	 */
	void create_client_on_bank(client C, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model CRequired="true" IRequired="true" BRequired="true"
	 * @generated
	 */
	void client_is_the_client_with_client_id_on_bank(client C, client_id I, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true" YRequired="true"
	 * @generated
	 */
	void client_id_is_valid_for_bank_is__boolean(client_id I, bank B, _boolean Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" CsMany="true" ARequired="true" BRequired="true" YRequired="true"
	 * @generated
	 */
	void client_id_is_valid_for_client_numbers__integer_to__integer_is__boolean(client_id I, EList<client> Cs, _integer A, _integer B, _boolean Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true" YRequired="true"
	 * @generated
	 */
	void client_id_is_not_valid_for_bank_is__boolean(client_id I, bank B, _boolean Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void list_all_client_in_bank(bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ARequired="true" BRequired="true" CsMany="true"
	 * @generated
	 */
	void list_clients_number__integer_to__integer_on_client(_integer A, _integer B, EList<client> Cs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void list_all_accounts_in_bank(bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ARequired="true" BRequired="true" ACCsMany="true"
	 * @generated
	 */
	void list_accounts_number__integer_to__integer_on_account(_integer A, _integer B, EList<account> ACCs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ARequired="true" BRequired="true"
	 * @generated
	 */
	void create_account_on_bank(account A, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ARequired="true" IRequired="true" BRequired="true"
	 * @generated
	 */
	void account_is_the_account_with_account_id_on_bank(account A, account_id I, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true" YRequired="true"
	 * @generated
	 */
	void account_id_is_valid_for_bank_is__boolean(account_id I, bank B, _boolean Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true" YRequired="true"
	 * @generated
	 */
	void account_id_is_not_valid_for_bank_is__boolean(account_id I, bank B, _boolean Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true" YRequired="true"
	 * @generated
	 */
	void the_client_with_client_id_has_accounts_on_bank_is__boolean(client_id I, bank B, _boolean Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true"
	 * @generated
	 */
	void remove_the_client_with_client_id_from_bank(client_id I, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IRequired="true" BRequired="true"
	 * @generated
	 */
	void remove_the_account_with_account_id_from_bank(account_id I, bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void show_welcome_message_for_bank(bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void launch_create_a_client_page_for_bank(bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void launch_create_an_account_page_for_bank(bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void launch_remove_a_client_page_for_bank(bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void launch_remove_an_account_page_for_bank(bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model BRequired="true"
	 * @generated
	 */
	void launch_main_menu_for_bank(bank B);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

} // _ops
