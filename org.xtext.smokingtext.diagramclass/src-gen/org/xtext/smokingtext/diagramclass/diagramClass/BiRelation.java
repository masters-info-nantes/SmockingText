/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bi Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.BiRelation#getLinkName <em>Link Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getBiRelation()
 * @model
 * @generated
 */
public interface BiRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Link Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Name</em>' attribute.
   * @see #setLinkName(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getBiRelation_LinkName()
   * @model
   * @generated
   */
  String getLinkName();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.BiRelation#getLinkName <em>Link Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link Name</em>' attribute.
   * @see #getLinkName()
   * @generated
   */
  void setLinkName(String value);

} // BiRelation
