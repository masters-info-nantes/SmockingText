/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAbstract()
 * @model
 * @generated
 */
public interface Abstract extends Elements
{
  /**
   * Returns the value of the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' attribute.
   * @see #setClassname(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAbstract_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

  /**
   * Returns the value of the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension</em>' attribute.
   * @see #setExtension(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAbstract_Extension()
   * @model
   * @generated
   */
  String getExtension();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getExtension <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' attribute.
   * @see #getExtension()
   * @generated
   */
  void setExtension(String value);

  /**
   * Returns the value of the '<em><b>Implements</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' attribute.
   * @see #setImplements(String)
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAbstract_Implements()
   * @model
   * @generated
   */
  String getImplements();

  /**
   * Sets the value of the '{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getImplements <em>Implements</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implements</em>' attribute.
   * @see #getImplements()
   * @generated
   */
  void setImplements(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#getAbstract_Body()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getBody();

} // Abstract
