/**
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
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Elements
{
  /**
   * Returns the value of the '<em><b>Interfacename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfacename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfacename</em>' attribute.
   * @see #setInterfacename(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getInterface_Interfacename()
   * @model
   * @generated
   */
  String getInterfacename();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface#getInterfacename <em>Interfacename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interfacename</em>' attribute.
   * @see #getInterfacename()
   * @generated
   */
  void setInterfacename(String value);

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
