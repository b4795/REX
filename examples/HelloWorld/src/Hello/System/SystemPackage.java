/**
 */
package Hello.System;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see Hello.System.SystemFactory
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
	SystemPackage eINSTANCE = Hello.System.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link Hello.System.impl._opsImpl <em>ops</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hello.System.impl._opsImpl
	 * @see Hello.System.impl.SystemPackageImpl#get_ops()
	 * @generated
	 */
	int _OPS = 0;

	/**
	 * The number of structural features of the '<em>ops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Print hello world</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___PRINT_HELLO_WORLD = 0;

	/**
	 * The operation id for the '<em>Launch application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LAUNCH_APPLICATION = 1;

	/**
	 * The number of operations of the '<em>ops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link Hello.System._ops <em>ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ops</em>'.
	 * @see Hello.System._ops
	 * @generated
	 */
	EClass get_ops();

	/**
	 * Returns the meta object for the '{@link Hello.System._ops#print_hello_world() <em>Print hello world</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print hello world</em>' operation.
	 * @see Hello.System._ops#print_hello_world()
	 * @generated
	 */
	EOperation get_ops__Print_hello_world();

	/**
	 * Returns the meta object for the '{@link Hello.System._ops#launch_application() <em>Launch application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch application</em>' operation.
	 * @see Hello.System._ops#launch_application()
	 * @generated
	 */
	EOperation get_ops__Launch_application();

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
		 * The meta object literal for the '{@link Hello.System.impl._opsImpl <em>ops</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hello.System.impl._opsImpl
		 * @see Hello.System.impl.SystemPackageImpl#get_ops()
		 * @generated
		 */
		EClass _OPS = eINSTANCE.get_ops();

		/**
		 * The meta object literal for the '<em><b>Print hello world</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___PRINT_HELLO_WORLD = eINSTANCE.get_ops__Print_hello_world();

		/**
		 * The meta object literal for the '<em><b>Launch application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LAUNCH_APPLICATION = eINSTANCE.get_ops__Launch_application();

	}

} //SystemPackage
