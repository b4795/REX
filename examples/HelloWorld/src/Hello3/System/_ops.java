/**
 */
package Hello3.System;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ops</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Hello3.System.SystemPackage#get_ops()
 * @model
 * @generated
 */
public interface _ops extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SRequired="true"
	 * @generated
	 */
	void print__string(_string S);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start_a_new_line();

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
	 * @model
	 * @generated
	 */
	void launch_application();

} // _ops
