/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Elements
{
  /**
   * Returns the value of the '<em><b>Methodname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodname</em>' attribute.
   * @see #setMethodname(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getInterface_Methodname()
   * @model
   * @generated
   */
  String getMethodname();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface#getMethodname <em>Methodname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methodname</em>' attribute.
   * @see #getMethodname()
   * @generated
   */
  void setMethodname(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smokingtext.diagramclass.diagramClass.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getInterface_Body()
   * @model containment="true"
   * @generated
   */
  EList<Method> getBody();

} // Interface
