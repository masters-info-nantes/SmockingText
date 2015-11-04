/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Package#getClassType <em>Class Type</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Package#getSubPackage <em>Sub Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
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
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Class Type</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smokingtext.diagramclass.diagramClass.Elements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Type</em>' containment reference list.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getPackage_ClassType()
   * @model containment="true"
   * @generated
   */
  EList<Elements> getClassType();

  /**
   * Returns the value of the '<em><b>Sub Package</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smokingtext.diagramclass.diagramClass.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Package</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Package</em>' containment reference list.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getPackage_SubPackage()
   * @model containment="true"
   * @generated
   */
  EList<Package> getSubPackage();

} // Package
