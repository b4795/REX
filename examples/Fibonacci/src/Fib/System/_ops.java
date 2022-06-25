/**
 */
package Fib.System;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ops</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Fib.System.SystemPackage#get_ops()
 * @model
 * @generated
 */
public interface _ops extends EObject {
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
	 * @model XRequired="true" YRequired="true" BRequired="true"
	 * @generated
	 */
	void _integer_is_greater_than_or_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B);

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
	 * @model XRequired="true"
	 * @generated
	 */
	void output__integer(_integer X);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model XRequired="true" YRequired="true"
	 * @generated
	 */
	void the_fibonacci_function_of__integer_is__integer(_integer X, _integer Y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void launch_application();

} // _ops
