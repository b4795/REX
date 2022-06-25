/**
 */
package Fib.System.impl;

import Fib.System.SystemFactory;
import Fib.System.SystemPackage;
import Fib.System._boolean;
import Fib.System._integer;
import Fib.System._ops;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemPackageImpl extends EPackageImpl implements SystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _opsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Fib.System.SystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemPackageImpl() {
		super(eNS_URI, SystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemPackage init() {
		if (isInited) return (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemPackageImpl theSystemPackage = registeredSystemPackage instanceof SystemPackageImpl ? (SystemPackageImpl)registeredSystemPackage : new SystemPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSystemPackage.createPackageContents();

		// Initialize created meta-data
		theSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, theSystemPackage);
		return theSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_boolean() {
		return _booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute get_boolean_Value() {
		return (EAttribute)_booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_integer() {
		return _integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute get_integer_Value() {
		return (EAttribute)_integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_ops() {
		return _opsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is__integer___integer__integer() {
		return _opsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops___integer_is_greater_than_or_equal_to__integer_is__boolean___integer__integer__boolean() {
		return _opsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__The_addition_of__integer_with__integer_is__integer___integer__integer__integer() {
		return _opsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__The_difference_between__integer_and__integer_is__integer___integer__integer__integer() {
		return _opsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Output__integer___integer() {
		return _opsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__The_fibonacci_function_of__integer_is__integer___integer__integer() {
		return _opsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_ops__Launch_application() {
		return _opsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactory getSystemFactory() {
		return (SystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		_booleanEClass = createEClass(_BOOLEAN);
		createEAttribute(_booleanEClass, _BOOLEAN__VALUE);

		_integerEClass = createEClass(_INTEGER);
		createEAttribute(_integerEClass, _INTEGER__VALUE);

		_opsEClass = createEClass(_OPS);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_INTEGER__INTEGER___INTEGER__INTEGER);
		createEOperation(_opsEClass, _OPS___INTEGER_IS_GREATER_THAN_OR_EQUAL_TO_INTEGER_IS_BOOLEAN__INTEGER_IS__BOOLEAN___INTEGER__INTEGER__BOOLEAN);
		createEOperation(_opsEClass, _OPS___THE_ADDITION_OF_INTEGER_WITH_INTEGER_IS_INTEGER__INTEGER_WITH__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER);
		createEOperation(_opsEClass, _OPS___THE_DIFFERENCE_BETWEEN_INTEGER_AND_INTEGER_IS_INTEGER__INTEGER_AND__INTEGER_IS__INTEGER___INTEGER__INTEGER__INTEGER);
		createEOperation(_opsEClass, _OPS___OUTPUT_INTEGER__INTEGER___INTEGER);
		createEOperation(_opsEClass, _OPS___THE_FIBONACCI_FUNCTION_OF_INTEGER_IS_INTEGER__INTEGER_IS__INTEGER___INTEGER__INTEGER);
		createEOperation(_opsEClass, _OPS___LAUNCH_APPLICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(_booleanEClass, _boolean.class, "_boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_boolean_Value(), theEcorePackage.getEBoolean(), "value", null, 0, 1, _boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_integerEClass, _integer.class, "_integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_integer_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, _integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_opsEClass, _ops.class, "_ops", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(get_ops___integer_is__integer___integer__integer(), null, "_integer_is__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops___integer_is_greater_than_or_equal_to__integer_is__boolean___integer__integer__boolean(), null, "_integer_is_greater_than_or_equal_to__integer_is__boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_boolean(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__The_addition_of__integer_with__integer_is__integer___integer__integer__integer(), null, "the_addition_of__integer_with__integer_is__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__The_difference_between__integer_and__integer_is__integer___integer__integer__integer(), null, "the_difference_between__integer_and__integer_is__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "A", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "B", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__Output__integer___integer(), null, "output__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_ops__The_fibonacci_function_of__integer_is__integer___integer__integer(), null, "the_fibonacci_function_of__integer_is__integer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "X", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.get_integer(), "Y", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(get_ops__Launch_application(), null, "launch_application", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SystemPackageImpl
