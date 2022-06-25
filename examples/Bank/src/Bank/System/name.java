/**
 */
package Bank.System;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Bank.System.name#getFirst_name <em>First name</em>}</li>
 *   <li>{@link Bank.System.name#getLast_name <em>Last name</em>}</li>
 * </ul>
 *
 * @see Bank.System.SystemPackage#getname()
 * @model
 * @generated
 */
public interface name extends EObject {
	/**
	 * Returns the value of the '<em><b>First name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First name</em>' reference.
	 * @see #setFirst_name(first_name)
	 * @see Bank.System.SystemPackage#getname_First_name()
	 * @model required="true"
	 * @generated
	 */
	first_name getFirst_name();

	/**
	 * Sets the value of the '{@link Bank.System.name#getFirst_name <em>First name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First name</em>' reference.
	 * @see #getFirst_name()
	 * @generated
	 */
	void setFirst_name(first_name value);

	/**
	 * Returns the value of the '<em><b>Last name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last name</em>' reference.
	 * @see #setLast_name(last_name)
	 * @see Bank.System.SystemPackage#getname_Last_name()
	 * @model required="true"
	 * @generated
	 */
	last_name getLast_name();

	/**
	 * Sets the value of the '{@link Bank.System.name#getLast_name <em>Last name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last name</em>' reference.
	 * @see #getLast_name()
	 * @generated
	 */
	void setLast_name(last_name value);

} // name
