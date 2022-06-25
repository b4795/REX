/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter Variable Declaration Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OperationParameterVariableDeclarationPhrase#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperationParameterVariableDeclarationPhrase()
 * @model
 * @generated
 */
public interface OperationParameterVariableDeclarationPhrase extends OperationParameterPhrase, OperationDefinitionBodyFunctionCallInRefsObjectsPhrase
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ExistenceIndefiniteRefPhrase)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperationParameterVariableDeclarationPhrase_Type()
   * @model containment="true"
   * @generated
   */
  ExistenceIndefiniteRefPhrase getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.OperationParameterVariableDeclarationPhrase#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ExistenceIndefiniteRefPhrase value);

} // OperationParameterVariableDeclarationPhrase