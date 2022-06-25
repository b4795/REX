/**
 */
package Fib.System.impl;

import Fib.System.SystemPackage;
import Fib.System._boolean;
import Fib.System._integer;
import Fib.System._ops;

import java.lang.reflect.InvocationTargetException;

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
	 * @generated
	 */
	public void _integer_is__integer(_integer X, _integer Y) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _integer_is_greater_than_or_equal_to__integer_is__boolean(_integer X, _integer Y, _boolean B) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void the_addition_of__integer_with__integer_is__integer(_integer A, _integer B, _integer X) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void the_difference_between__integer_and__integer_is__integer(_integer A, _integer B, _integer X) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void output__integer(_integer X) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void the_fibonacci_function_of__integer_is__integer(final _integer X, final _integer Y) {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_boolean _local_boolean225 = factory.create_boolean();
		_integer _local__integer260 = factory.create_integer();
		_local__integer260.setValue(3);
		_integer_is_greater_than_or_equal_to__integer_is__boolean(X, _local__integer260, _local_boolean225);
		if (_local_boolean225.isValue()) {
		_integer _local__integer913 = factory.create_integer();
		_local__integer913.setValue(1);
		_integer _local__integer333 = factory.create_integer();
		_local__integer333.setValue(2);
		_integer N1 = factory.create_integer();
		_integer N2 = factory.create_integer();
		the_difference_between__integer_and__integer_is__integer(X, _local__integer913, N1);
		the_difference_between__integer_and__integer_is__integer(X, _local__integer333, N2);
		_integer A = factory.create_integer();
		_integer B = factory.create_integer();
		the_fibonacci_function_of__integer_is__integer(N1, A);
		the_fibonacci_function_of__integer_is__integer(N2, B);
		the_addition_of__integer_with__integer_is__integer(A, B, Y);
		}
		else {
		_integer _local__integer128 = factory.create_integer();
		_local__integer128.setValue(1);
		_integer_is__integer(Y, _local__integer128);
		}
		;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void launch_application() {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_integer _local__integer318 = factory.create_integer();
		_local__integer318.setValue(1);
		_integer _local__integer670 = factory.create_integer();
		_local__integer670.setValue(2);
		_integer _local__integer997 = factory.create_integer();
		_local__integer997.setValue(10);
		_integer A = factory.create_integer();
		_integer B = factory.create_integer();
		_integer C = factory.create_integer();
		the_fibonacci_function_of__integer_is__integer(_local__integer318, A);
		the_fibonacci_function_of__integer_is__integer(_local__integer670, B);
		the_fibonacci_function_of__integer_is__integer(_local__integer997, C);
		output__integer(A);
		output__integer(B);
		output__integer(C);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SystemPackage._OPS___INTEGER_IS_INTEGER__INTEGER___INTEGER__INTEGER:
				_integer_is__integer((_integer)arguments.get(0), (_integer)arguments.get(1));
				return null;
			case SystemPackage._OPS___INTEGER_IS_GREATER_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN:
				_integer_is_greater_than_or_equal_to__integer_is__boolean((_integer)arguments.get(0), (_integer)arguments.get(1), (_boolean)arguments.get(2));
				return null;
			case SystemPackage._OPS___THE_ADDITION_OF_INTEGER_WITH_INTEGER_IS_INTEGER__INTEGER_WITH__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER:
				the_addition_of__integer_with__integer_is__integer((_integer)arguments.get(0), (_integer)arguments.get(1), (_integer)arguments.get(2));
				return null;
			case SystemPackage._OPS___THE_DIFFERENCE_BETWEEN_INTEGER_AND_INTEGER_IS_INTEGER__INTEGER_AND__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER:
				the_difference_between__integer_and__integer_is__integer((_integer)arguments.get(0), (_integer)arguments.get(1), (_integer)arguments.get(2));
				return null;
			case SystemPackage._OPS___OUTPUT_INTEGER__INTEGER___INTEGER:
				output__integer((_integer)arguments.get(0));
				return null;
			case SystemPackage._OPS___THE_FIBONACCI_FUNCTION_OF_INTEGER_IS_INTEGER__INTEGER_IS__INTEGER___INTEGER__INTEGER:
				the_fibonacci_function_of__integer_is__integer((_integer)arguments.get(0), (_integer)arguments.get(1));
				return null;
			case SystemPackage._OPS___LAUNCH_APPLICATION:
				launch_application();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //_opsImpl
