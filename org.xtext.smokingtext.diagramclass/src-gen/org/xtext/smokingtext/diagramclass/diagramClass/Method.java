/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Method#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Method#getParam <em>Param</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Method#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Method#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smokingtext.diagramclass.diagramClass.paramIn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getMethod_Param()
   * @model containment="true"
   * @generated
   */
  EList<paramIn> getParam();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see #setReturnType(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getMethod_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Method#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(String value);

} // Method
