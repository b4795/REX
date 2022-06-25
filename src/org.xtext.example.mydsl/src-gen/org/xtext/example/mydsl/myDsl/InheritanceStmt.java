/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InheritanceStmt#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InheritanceStmt#getSuperclass <em>Superclass</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInheritanceStmt()
 * @model
 * @generated
 */
public interface InheritanceStmt extends Stmt
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(ExistenceSingularRefListPhrase)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInheritanceStmt_Class()
   * @model containment="true"
   * @generated
   */
  ExistenceSingularRefListPhrase getClass_();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InheritanceStmt#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(ExistenceSingularRefListPhrase value);

  /**
   * Returns the value of the '<em><b>Superclass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superclass</em>' containment reference.
   * @see #setSuperclass(ExistenceSingularRefListPhrase)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInheritanceStmt_Superclass()
   * @model containment="true"
   * @generated
   */
  ExistenceSingularRefListPhrase getSuperclass();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InheritanceStmt#getSuperclass <em>Superclass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Superclass</em>' containment reference.
   * @see #getSuperclass()
   * @generated
   */
  void setSuperclass(ExistenceSingularRefListPhrase value);

} // InheritanceStmt
