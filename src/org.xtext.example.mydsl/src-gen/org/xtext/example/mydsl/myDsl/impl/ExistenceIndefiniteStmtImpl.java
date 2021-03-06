/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.ExistenceIndefiniteStmt;
import org.xtext.example.mydsl.myDsl.ExistencePluralIndefinitePhrase;
import org.xtext.example.mydsl.myDsl.ExistenceSingularIndefinitePhrase;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Indefinite Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExistenceIndefiniteStmtImpl#getPlural <em>Plural</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExistenceIndefiniteStmtImpl#getSingular <em>Singular</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistenceIndefiniteStmtImpl extends ExistenceStmtImpl implements ExistenceIndefiniteStmt
{
  /**
   * The cached value of the '{@link #getPlural() <em>Plural</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlural()
   * @generated
   * @ordered
   */
  protected ExistencePluralIndefinitePhrase plural;

  /**
   * The cached value of the '{@link #getSingular() <em>Singular</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingular()
   * @generated
   * @ordered
   */
  protected ExistenceSingularIndefinitePhrase singular;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExistenceIndefiniteStmtImpl()
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
    return MyDslPackage.Literals.EXISTENCE_INDEFINITE_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistencePluralIndefinitePhrase getPlural()
  {
    return plural;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlural(ExistencePluralIndefinitePhrase newPlural, NotificationChain msgs)
  {
    ExistencePluralIndefinitePhrase oldPlural = plural;
    plural = newPlural;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL, oldPlural, newPlural);
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
  public void setPlural(ExistencePluralIndefinitePhrase newPlural)
  {
    if (newPlural != plural)
    {
      NotificationChain msgs = null;
      if (plural != null)
        msgs = ((InternalEObject)plural).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL, null, msgs);
      if (newPlural != null)
        msgs = ((InternalEObject)newPlural).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL, null, msgs);
      msgs = basicSetPlural(newPlural, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL, newPlural, newPlural));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistenceSingularIndefinitePhrase getSingular()
  {
    return singular;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingular(ExistenceSingularIndefinitePhrase newSingular, NotificationChain msgs)
  {
    ExistenceSingularIndefinitePhrase oldSingular = singular;
    singular = newSingular;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR, oldSingular, newSingular);
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
  public void setSingular(ExistenceSingularIndefinitePhrase newSingular)
  {
    if (newSingular != singular)
    {
      NotificationChain msgs = null;
      if (singular != null)
        msgs = ((InternalEObject)singular).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR, null, msgs);
      if (newSingular != null)
        msgs = ((InternalEObject)newSingular).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR, null, msgs);
      msgs = basicSetSingular(newSingular, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR, newSingular, newSingular));
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
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL:
        return basicSetPlural(null, msgs);
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR:
        return basicSetSingular(null, msgs);
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
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL:
        return getPlural();
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR:
        return getSingular();
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
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL:
        setPlural((ExistencePluralIndefinitePhrase)newValue);
        return;
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR:
        setSingular((ExistenceSingularIndefinitePhrase)newValue);
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
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL:
        setPlural((ExistencePluralIndefinitePhrase)null);
        return;
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR:
        setSingular((ExistenceSingularIndefinitePhrase)null);
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
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__PLURAL:
        return plural != null;
      case MyDslPackage.EXISTENCE_INDEFINITE_STMT__SINGULAR:
        return singular != null;
    }
    return super.eIsSet(featureID);
  }

} //ExistenceIndefiniteStmtImpl
