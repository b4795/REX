/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.ExistenceIndefiniteRefPhrase;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.OperationDefinitionBodyFunctionCallInRefsObjectsPhrase;
import org.xtext.example.mydsl.myDsl.OperationDefinitionBodyFunctionCallInRefsPhrase;
import org.xtext.example.mydsl.myDsl.OperationParameterVariableDeclarationPhrase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Parameter Variable Declaration Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperationParameterVariableDeclarationPhraseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperationParameterVariableDeclarationPhraseImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationParameterVariableDeclarationPhraseImpl extends OperationParameterPhraseImpl implements OperationParameterVariableDeclarationPhrase
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ExistenceIndefiniteRefPhrase type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationParameterVariableDeclarationPhraseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistenceIndefiniteRefPhrase getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ExistenceIndefiniteRefPhrase newType, NotificationChain msgs)
  {
    ExistenceIndefiniteRefPhrase oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(ExistenceIndefiniteRefPhrase newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE:
        return basicSetType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__NAME:
        return getName();
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE:
        setType((ExistenceIndefiniteRefPhrase)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE:
        setType((ExistenceIndefiniteRefPhrase)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == OperationDefinitionBodyFunctionCallInRefsPhrase.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__NAME: return MyDslPackage.OPERATION_DEFINITION_BODY_FUNCTION_CALL_IN_REFS_PHRASE__NAME;
        default: return -1;
      }
    }
    if (baseClass == OperationDefinitionBodyFunctionCallInRefsObjectsPhrase.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == OperationDefinitionBodyFunctionCallInRefsPhrase.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.OPERATION_DEFINITION_BODY_FUNCTION_CALL_IN_REFS_PHRASE__NAME: return MyDslPackage.OPERATION_PARAMETER_VARIABLE_DECLARATION_PHRASE__NAME;
        default: return -1;
      }
    }
    if (baseClass == OperationDefinitionBodyFunctionCallInRefsObjectsPhrase.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //OperationParameterVariableDeclarationPhraseImpl
