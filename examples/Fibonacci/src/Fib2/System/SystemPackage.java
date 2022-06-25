/**
 */
package Fib2.System;

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
 * @see Fib2.System.SystemFactory
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
	SystemPackage eINSTANCE = Fib2.System.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link Fib2.System.impl._booleanImpl <em>boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Fib2.System.impl._booleanImpl
	 * @see Fib2.System.impl.SystemPackageImpl#get_boolean()
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
	 * The meta object id for the '{@link Fib2.System.impl._integerImpl <em>integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Fib2.System.impl._integerImpl
	 * @see Fib2.System.impl.SystemPackageImpl#get_integer()
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
	 * The meta object id for the '{@link Fib2.System.impl._opsImpl <em>ops</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Fib2.System.impl._opsImpl
	 * @see Fib2.System.impl.SystemPackageImpl#get_ops()
	 * @generated
	 */
	int _OPS = 2;

	/**
	 * The number of structural features of the '<em>ops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>integer is integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_INTEGER__INTEGER___INTEGER__INTEGER = 0;

	/**
	 * The operation id for the '<em>integer is greater than or equal to integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_GREATER_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = 1;

	/**
	 * The operation id for the '<em>integer is less than or equal to integer is boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___INTEGER_IS_LESS_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = 2;

	/**
	 * The operation id for the '<em>The addition of integer with integer is integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___THE_ADDITION_OF_INTEGER_WITH_INTEGER_IS_INTEGER__INTEGER_WITH__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER = 3;

	/**
	 * The operation id for the '<em>The difference between integer and integer is integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___THE_DIFFERENCE_BETWEEN_INTEGER_AND_INTEGER_IS_INTEGER__INTEGER_AND__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER = 4;

	/**
	 * The operation id for the '<em>Output integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___OUTPUT_INTEGER__INTEGER___INTEGER = 5;

	/**
	 * The operation id for the '<em>The fibonacci function of integer is integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___THE_FIBONACCI_FUNCTION_OF_INTEGER_IS_INTEGER__INTEGER_IS__INTEGER___INTEGER__INTEGER = 6;

	/**
	 * The operation id for the '<em>Output the result of the fibonacci function from integer to integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___OUTPUT_THE_RESULT_OF_THE_FIBONACCI_FUNCTION_FROM_INTEGER_TO_INTEGER__INTEGER_TO__INTEGER___INTEGER__INTEGER = 7;

	/**
	 * The operation id for the '<em>Output the result of the fibonacci function up to integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___OUTPUT_THE_RESULT_OF_THE_FIBONACCI_FUNCTION_UP_TO_INTEGER__INTEGER___INTEGER = 8;

	/**
	 * The operation id for the '<em>Launch application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS___LAUNCH_APPLICATION = 9;

	/**
	 * The number of operations of the '<em>ops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OPS_OPERATION_COUNT = 10;


	/**
	 * Returns the meta object for class '{@link Fib2.System._boolean <em>boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>boolean</em>'.
	 * @see Fib2.System._boolean
	 * @generated
	 */
	EClass get_boolean();

	/**
	 * Returns the meta object for the attribute '{@link Fib2.System._boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Fib2.System._boolean#isValue()
	 * @see #get_boolean()
	 * @generated
	 */
	EAttribute get_boolean_Value();

	/**
	 * Returns the meta object for class '{@link Fib2.System._integer <em>integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>integer</em>'.
	 * @see Fib2.System._integer
	 * @generated
	 */
	EClass get_integer();

	/**
	 * Returns the meta object for the attribute '{@link Fib2.System._integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Fib2.System._integer#getValue()
	 * @see #get_integer()
	 * @generated
	 */
	EAttribute get_integer_Value();

	/**
	 * Returns the meta object for class '{@link Fib2.System._ops <em>ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ops</em>'.
	 * @see Fib2.System._ops
	 * @generated
	 */
	EClass get_ops();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#_integer_is__integer(Fib2.System._integer, Fib2.System._integer) <em>integer is integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is integer</em>' operation.
	 * @see Fib2.System._ops#_integer_is__integer(Fib2.System._integer, Fib2.System._integer)
	 * @generated
	 */
	EOperation get_ops___integer_is__integer___integer__integer();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#_integer_is_greater_than_or_equal_to__integer_is__boolean(Fib2.System._integer, Fib2.System._integer, Fib2.System._boolean) <em>integer is greater than or equal to integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is greater than or equal to integer is boolean</em>' operation.
	 * @see Fib2.System._ops#_integer_is_greater_than_or_equal_to__integer_is__boolean(Fib2.System._integer, Fib2.System._integer, Fib2.System._boolean)
	 * @generated
	 */
	EOperation get_ops___integer_is_greater_than_or_equal_to__integer_is__boolean___integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#_integer_is_less_than_or_equal_to__integer_is__boolean(Fib2.System._integer, Fib2.System._integer, Fib2.System._boolean) <em>integer is less than or equal to integer is boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>integer is less than or equal to integer is boolean</em>' operation.
	 * @see Fib2.System._ops#_integer_is_less_than_or_equal_to__integer_is__boolean(Fib2.System._integer, Fib2.System._integer, Fib2.System._boolean)
	 * @generated
	 */
	EOperation get_ops___integer_is_less_than_or_equal_to__integer_is__boolean___integer__integer__boolean();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#the_addition_of__integer_with__integer_is__integer(Fib2.System._integer, Fib2.System._integer, Fib2.System._integer) <em>The addition of integer with integer is integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>The addition of integer with integer is integer</em>' operation.
	 * @see Fib2.System._ops#the_addition_of__integer_with__integer_is__integer(Fib2.System._integer, Fib2.System._integer, Fib2.System._integer)
	 * @generated
	 */
	EOperation get_ops__The_addition_of__integer_with__integer_is__integer___integer__integer__integer();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#the_difference_between__integer_and__integer_is__integer(Fib2.System._integer, Fib2.System._integer, Fib2.System._integer) <em>The difference between integer and integer is integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>The difference between integer and integer is integer</em>' operation.
	 * @see Fib2.System._ops#the_difference_between__integer_and__integer_is__integer(Fib2.System._integer, Fib2.System._integer, Fib2.System._integer)
	 * @generated
	 */
	EOperation get_ops__The_difference_between__integer_and__integer_is__integer___integer__integer__integer();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#output__integer(Fib2.System._integer) <em>Output integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output integer</em>' operation.
	 * @see Fib2.System._ops#output__integer(Fib2.System._integer)
	 * @generated
	 */
	EOperation get_ops__Output__integer___integer();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#the_fibonacci_function_of__integer_is__integer(Fib2.System._integer, Fib2.System._integer) <em>The fibonacci function of integer is integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>The fibonacci function of integer is integer</em>' operation.
	 * @see Fib2.System._ops#the_fibonacci_function_of__integer_is__integer(Fib2.System._integer, Fib2.System._integer)
	 * @generated
	 */
	EOperation get_ops__The_fibonacci_function_of__integer_is__integer___integer__integer();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#output_the_result_of_the_fibonacci_function_from__integer_to__integer(Fib2.System._integer, Fib2.System._integer) <em>Output the result of the fibonacci function from integer to integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output the result of the fibonacci function from integer to integer</em>' operation.
	 * @see Fib2.System._ops#output_the_result_of_the_fibonacci_function_from__integer_to__integer(Fib2.System._integer, Fib2.System._integer)
	 * @generated
	 */
	EOperation get_ops__Output_the_result_of_the_fibonacci_function_from__integer_to__integer___integer__integer();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#output_the_result_of_the_fibonacci_function_up_to__integer(Fib2.System._integer) <em>Output the result of the fibonacci function up to integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output the result of the fibonacci function up to integer</em>' operation.
	 * @see Fib2.System._ops#output_the_result_of_the_fibonacci_function_up_to__integer(Fib2.System._integer)
	 * @generated
	 */
	EOperation get_ops__Output_the_result_of_the_fibonacci_function_up_to__integer___integer();

	/**
	 * Returns the meta object for the '{@link Fib2.System._ops#launch_application() <em>Launch application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Launch application</em>' operation.
	 * @see Fib2.System._ops#launch_application()
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
		 * The meta object literal for the '{@link Fib2.System.impl._booleanImpl <em>boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Fib2.System.impl._booleanImpl
		 * @see Fib2.System.impl.SystemPackageImpl#get_boolean()
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
		 * The meta object literal for the '{@link Fib2.System.impl._integerImpl <em>integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Fib2.System.impl._integerImpl
		 * @see Fib2.System.impl.SystemPackageImpl#get_integer()
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
		 * The meta object literal for the '{@link Fib2.System.impl._opsImpl <em>ops</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Fib2.System.impl._opsImpl
		 * @see Fib2.System.impl.SystemPackageImpl#get_ops()
		 * @generated
		 */
		EClass _OPS = eINSTANCE.get_ops();

		/**
		 * The meta object literal for the '<em><b>integer is integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_INTEGER__INTEGER___INTEGER__INTEGER = eINSTANCE.get_ops___integer_is__integer___integer__integer();

		/**
		 * The meta object literal for the '<em><b>integer is greater than or equal to integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_GREATER_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops___integer_is_greater_than_or_equal_to__integer_is__boolean___integer__integer__boolean();

		/**
		 * The meta object literal for the '<em><b>integer is less than or equal to integer is boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___INTEGER_IS_LESS_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN = eINSTANCE.get_ops___integer_is_less_than_or_equal_to__integer_is__boolean___integer__integer__boolean();

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
		 * The meta object literal for the '<em><b>Output integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___OUTPUT_INTEGER__INTEGER___INTEGER = eINSTANCE.get_ops__Output__integer___integer();

		/**
		 * The meta object literal for the '<em><b>The fibonacci function of integer is integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___THE_FIBONACCI_FUNCTION_OF_INTEGER_IS_INTEGER__INTEGER_IS__INTEGER___INTEGER__INTEGER = eINSTANCE.get_ops__The_fibonacci_function_of__integer_is__integer___integer__integer();

		/**
		 * The meta object literal for the '<em><b>Output the result of the fibonacci function from integer to integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___OUTPUT_THE_RESULT_OF_THE_FIBONACCI_FUNCTION_FROM_INTEGER_TO_INTEGER__INTEGER_TO__INTEGER___INTEGER__INTEGER = eINSTANCE.get_ops__Output_the_result_of_the_fibonacci_function_from__integer_to__integer___integer__integer();

		/**
		 * The meta object literal for the '<em><b>Output the result of the fibonacci function up to integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___OUTPUT_THE_RESULT_OF_THE_FIBONACCI_FUNCTION_UP_TO_INTEGER__INTEGER___INTEGER = eINSTANCE.get_ops__Output_the_result_of_the_fibonacci_function_up_to__integer___integer();

		/**
		 * The meta object literal for the '<em><b>Launch application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _OPS___LAUNCH_APPLICATION = eINSTANCE.get_ops__Launch_application();

	}

} //SystemPackage
