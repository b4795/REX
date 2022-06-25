/**
 */
package Hello2.System;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see Hello2.System.SystemFactory
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
	SystemPackage eINSTANCE = Hello2.System.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link Hello2.System.impl._stringImpl <em>string</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hello2.System.impl._stringImpl
	 * @see Hello2.System.impl.SystemPackageImpl#get_string()
	 * @generated
	 */
	int _STRING = 0;

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
	 * The meta object id for the '{@link Hello2.System.impl._opsImpl <em>ops</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Hello2.System.impl._opsImpl
	 * @see Hello2.System.impl.SystemPackageImpl#get_ops()
	 * @generated
	 */
	int _OPS = 1;

	/**
	 * The number of structural features of the '<em>ops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Print string</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___PRINT_STRING__STRING___STRING = 0;

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
	 * Returns the meta object for class '{@link Hello2.System._string <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>string</em>'.
	 * @see Hello2.System._string
	 * @generated
	 */
	EClass get_string();

	/**
	 * Returns the meta object for the attribute '{@link Hello2.System._string#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Hello2.System._string#getValue()
	 * @see #get_string()
	 * @generated
	 */
	EAttribute get_string_Value();

	/**
	 * Returns the meta object for class '{@link Hello2.System._ops <em>ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ops</em>'.
	 * @see Hello2.System._ops
	 * @generated
	 */
	EClass get_ops();

	/**
	 * Returns the meta object for the '{@link Hello2.System._ops#print__string(Hello2.System._string) <em>Print string</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print string</em>' operation.
	 * @see Hello2.System._ops#print__string(Hello2.System._string)
	 * @generated
	 */
	EOperation get_ops__Print__string___string();

	/**
	 * Returns the meta object for the '{@link Hello2.System._ops#launch_application() <em>Launch application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch application</em>' operation.
	 * @see Hello2.System._ops#launch_application()
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
		 * The meta object literal for the '{@link Hello2.System.impl._stringImpl <em>string</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hello2.System.impl._stringImpl
		 * @see Hello2.System.impl.SystemPackageImpl#get_string()
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
		 * The meta object literal for the '{@link Hello2.System.impl._opsImpl <em>ops</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Hello2.System.impl._opsImpl
		 * @see Hello2.System.impl.SystemPackageImpl#get_ops()
		 * @generated
		 */
		EClass _OPS = eINSTANCE.get_ops();

		/**
		 * The meta object literal for the '<em><b>Print string</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___PRINT_STRING__STRING___STRING = eINSTANCE.get_ops__Print__string___string();

		/**
		 * The meta object literal for the '<em><b>Launch application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LAUNCH_APPLICATION = eINSTANCE.get_ops__Launch_application();

	}

} //SystemPackage
