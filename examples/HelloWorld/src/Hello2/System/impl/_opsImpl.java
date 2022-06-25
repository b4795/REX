/**
 */
package Hello2.System.impl;

import Hello2.System.SystemPackage;
import Hello2.System._ops;
import Hello2.System._string;

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
	public void print__string(_string S) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void launch_application() {
		SystemFactoryImpl factory = new SystemFactoryImpl();
		_string _local__string51 = factory.create_string();
		_local__string51.setValue("hello, world!");
		print__string(_local__string51);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SystemPackage._OPS___PRINT_STRING__STRING___STRING:
				print__string((_string)arguments.get(0));
				return null;
			case SystemPackage._OPS___LAUNCH_APPLICATION:
				launch_application();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //_opsImpl
