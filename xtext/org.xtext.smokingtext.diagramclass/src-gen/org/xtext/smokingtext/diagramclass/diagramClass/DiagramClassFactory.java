/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage
 * @generated
 */
public interface DiagramClassFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DiagramClassFactory eINSTANCE = org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elements</em>'.
   * @generated
   */
  Elements createElements();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Dependancy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependancy</em>'.
   * @generated
   */
  Dependancy createDependancy();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Abstract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract</em>'.
   * @generated
   */
  Abstract createAbstract();

  /**
   * Returns a new object of class '<em>Bi Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bi Relation</em>'.
   * @generated
   */
  BiRelation createBiRelation();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>param In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>param In</em>'.
   * @generated
   */
  paramIn createparamIn();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DiagramClassPackage getDiagramClassPackage();

} //DiagramClassFactory
