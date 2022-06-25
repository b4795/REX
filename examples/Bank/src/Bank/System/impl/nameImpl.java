/**
 */
package Bank.System.impl;

import Bank.System.SystemFactory;
import Bank.System.SystemPackage;
import Bank.System.first_name;
import Bank.System.last_name;
import Bank.System.name;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Bank.System.impl.nameImpl#getFirst_name <em>First name</em>}</li>
 *   <li>{@link Bank.System.impl.nameImpl#getLast_name <em>Last name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class nameImpl extends MinimalEObjectImpl.Container implements name {
	/**
	 * The cached value of the '{@link #getFirst_name() <em>First name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_name()
	 * @generated
	 * @ordered
	 */
	protected first_name first_name;

	/**
	 * The cached value of the '{@link #getLast_name() <em>Last name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_name()
	 * @generated
	 * @ordered
	 */
	protected last_name last_name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected nameImpl() {
		super();
		
		first_name = SystemFactory.eINSTANCE.createfirst_name();
		last_name = SystemFactory.eINSTANCE.createlast_name();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public first_name getFirst_name() {
		if (first_name != null && first_name.eIsProxy()) {
			InternalEObject oldFirst_name = (InternalEObject)first_name;
			first_name = (first_name)eResolveProxy(oldFirst_name);
			if (first_name != oldFirst_name) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.NAME__FIRST_NAME, oldFirst_name, first_name));
			}
		}
		return first_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public first_name basicGetFirst_name() {
		return first_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst_name(first_name newFirst_name) {
		first_name oldFirst_name = first_name;
		first_name = newFirst_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.NAME__FIRST_NAME, oldFirst_name, first_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public last_name getLast_name() {
		if (last_name != null && last_name.eIsProxy()) {
			InternalEObject oldLast_name = (InternalEObject)last_name;
			last_name = (last_name)eResolveProxy(oldLast_name);
			if (last_name != oldLast_name) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.NAME__LAST_NAME, oldLast_name, last_name));
			}
		}
		return last_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public last_name basicGetLast_name() {
		return last_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast_name(last_name newLast_name) {
		last_name oldLast_name = last_name;
		last_name = newLast_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.NAME__LAST_NAME, oldLast_name, last_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.NAME__FIRST_NAME:
				if (resolve) return getFirst_name();
				return basicGetFirst_name();
			case SystemPackage.NAME__LAST_NAME:
				if (resolve) return getLast_name();
				return basicGetLast_name();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.NAME__FIRST_NAME:
				setFirst_name((first_name)newValue);
				return;
			case SystemPackage.NAME__LAST_NAME:
				setLast_name((last_name)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SystemPackage.NAME__FIRST_NAME:
				setFirst_name((first_name)null);
				return;
			case SystemPackage.NAME__LAST_NAME:
				setLast_name((last_name)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SystemPackage.NAME__FIRST_NAME:
				return first_name != null;
			case SystemPackage.NAME__LAST_NAME:
				return last_name != null;
		}
		return super.eIsSet(featureID);
	}

} //nameImpl
