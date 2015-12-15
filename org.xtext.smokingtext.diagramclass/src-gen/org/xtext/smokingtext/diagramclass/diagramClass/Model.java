/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Model#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.smokingtext.diagramclass.diagramClass.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference list.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getModel_Package()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.smokingtext.diagramclass.diagramClass.Package> getPackage();

} // Model
