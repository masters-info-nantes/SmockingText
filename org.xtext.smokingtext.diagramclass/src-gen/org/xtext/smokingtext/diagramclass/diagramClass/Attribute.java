/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getAttributename <em>Attributename</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getBirelation <em>Birelation</em>}</li>
 * </ul>
 *
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributename</em>' attribute.
   * @see #setAttributename(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAttribute_Attributename()
   * @model
   * @generated
   */
  String getAttributename();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getAttributename <em>Attributename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributename</em>' attribute.
   * @see #getAttributename()
   * @generated
   */
  void setAttributename(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAttribute_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Birelation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Birelation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Birelation</em>' containment reference.
   * @see #setBirelation(BiRelation)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAttribute_Birelation()
   * @model containment="true"
   * @generated
   */
  BiRelation getBirelation();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getBirelation <em>Birelation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Birelation</em>' containment reference.
   * @see #getBirelation()
   * @generated
   */
  void setBirelation(BiRelation value);

} // Attribute
