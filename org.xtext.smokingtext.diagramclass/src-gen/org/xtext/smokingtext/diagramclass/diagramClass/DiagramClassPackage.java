/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramClassPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "diagramClass";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/smokingtext/diagramclass/DiagramClass";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "diagramClass";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DiagramClassPackage eINSTANCE = org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.ModelImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.ElementsImpl <em>Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.ElementsImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getElements()
   * @generated
   */
  int ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.ClassImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 2;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__CLASSNAME = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EXTENSION = ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Implements</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IMPLEMENTS = ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__BODY = ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.DependancyImpl <em>Dependancy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DependancyImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getDependancy()
   * @generated
   */
  int DEPENDANCY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDANCY__NAME = 0;

  /**
   * The number of structural features of the '<em>Dependancy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDANCY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.EnumerationImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 4;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__CLASSNAME = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.InterfaceImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 5;

  /**
   * The feature id for the '<em><b>Interfacename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__INTERFACENAME = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__BODY = ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AbstractImpl <em>Abstract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.AbstractImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getAbstract()
   * @generated
   */
  int ABSTRACT = 6;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT__CLASSNAME = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT__EXTENSION = ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Implements</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT__IMPLEMENTS = ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT__BODY = ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Abstract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.BiRelationImpl <em>Bi Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.BiRelationImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getBiRelation()
   * @generated
   */
  int BI_RELATION = 7;

  /**
   * The feature id for the '<em><b>Link Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BI_RELATION__LINK_NAME = 0;

  /**
   * The number of structural features of the '<em>Bi Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BI_RELATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.AttributeImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Attributename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTENAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Birelation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__BIRELATION = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.paramInImpl <em>param In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.paramInImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getparamIn()
   * @generated
   */
  int PARAM_IN = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_IN__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_IN__TYPE = 1;

  /**
   * The number of structural features of the '<em>param In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_IN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.MethodImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAM = 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN_TYPE = 2;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.PackageImpl
   * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Class Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__CLASS_TYPE = 1;

  /**
   * The feature id for the '<em><b>Sub Package</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__SUB_PACKAGE = 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.smokingtext.diagramclass.diagramClass.Model#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Model#getPackage()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Package();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Elements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elements</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Elements
   * @generated
   */
  EClass getElements();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Class#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Class#getClassname()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Classname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Class#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Class#getExtension()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Extension();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Class#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implements</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Class#getImplements()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.smokingtext.diagramclass.diagramClass.Class#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Class#getBody()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Dependancy <em>Dependancy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependancy</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Dependancy
   * @generated
   */
  EClass getDependancy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Dependancy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Dependancy#getName()
   * @see #getDependancy()
   * @generated
   */
  EAttribute getDependancy_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Enumeration#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Enumeration#getClassname()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Classname();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface#getInterfacename <em>Interfacename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interfacename</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Interface#getInterfacename()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Interfacename();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.smokingtext.diagramclass.diagramClass.Interface#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Interface#getBody()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Abstract
   * @generated
   */
  EClass getAbstract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getClassname()
   * @see #getAbstract()
   * @generated
   */
  EAttribute getAbstract_Classname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getExtension()
   * @see #getAbstract()
   * @generated
   */
  EAttribute getAbstract_Extension();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implements</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getImplements()
   * @see #getAbstract()
   * @generated
   */
  EAttribute getAbstract_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Abstract#getBody()
   * @see #getAbstract()
   * @generated
   */
  EReference getAbstract_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.BiRelation <em>Bi Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bi Relation</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.BiRelation
   * @generated
   */
  EClass getBiRelation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.BiRelation#getLinkName <em>Link Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link Name</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.BiRelation#getLinkName()
   * @see #getBiRelation()
   * @generated
   */
  EAttribute getBiRelation_LinkName();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getAttributename <em>Attributename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attributename</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getAttributename()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Attributename();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getBirelation <em>Birelation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Birelation</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Attribute#getBirelation()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Birelation();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.paramIn <em>param In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>param In</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.paramIn
   * @generated
   */
  EClass getparamIn();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.paramIn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.paramIn#getName()
   * @see #getparamIn()
   * @generated
   */
  EAttribute getparamIn_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.paramIn#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.paramIn#getType()
   * @see #getparamIn()
   * @generated
   */
  EAttribute getparamIn_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.smokingtext.diagramclass.diagramClass.Method#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Method#getParam()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Param();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Method#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Method#getReturnType()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_ReturnType();

  /**
   * Returns the meta object for class '{@link org.xtext.smokingtext.diagramclass.diagramClass.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.smokingtext.diagramclass.diagramClass.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.smokingtext.diagramclass.diagramClass.Package#getClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Type</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Package#getClassType()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_ClassType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.smokingtext.diagramclass.diagramClass.Package#getSubPackage <em>Sub Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Package</em>'.
   * @see org.xtext.smokingtext.diagramclass.diagramClass.Package#getSubPackage()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_SubPackage();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DiagramClassFactory getDiagramClassFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.ModelImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGE = eINSTANCE.getModel_Package();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.ElementsImpl <em>Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.ElementsImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getElements()
     * @generated
     */
    EClass ELEMENTS = eINSTANCE.getElements();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.ClassImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__CLASSNAME = eINSTANCE.getClass_Classname();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__EXTENSION = eINSTANCE.getClass_Extension();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__BODY = eINSTANCE.getClass_Body();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.DependancyImpl <em>Dependancy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DependancyImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getDependancy()
     * @generated
     */
    EClass DEPENDANCY = eINSTANCE.getDependancy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDANCY__NAME = eINSTANCE.getDependancy_Name();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.EnumerationImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__CLASSNAME = eINSTANCE.getEnumeration_Classname();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.InterfaceImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Interfacename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__INTERFACENAME = eINSTANCE.getInterface_Interfacename();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__BODY = eINSTANCE.getInterface_Body();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AbstractImpl <em>Abstract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.AbstractImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getAbstract()
     * @generated
     */
    EClass ABSTRACT = eINSTANCE.getAbstract();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT__CLASSNAME = eINSTANCE.getAbstract_Classname();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT__EXTENSION = eINSTANCE.getAbstract_Extension();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT__IMPLEMENTS = eINSTANCE.getAbstract_Implements();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT__BODY = eINSTANCE.getAbstract_Body();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.BiRelationImpl <em>Bi Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.BiRelationImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getBiRelation()
     * @generated
     */
    EClass BI_RELATION = eINSTANCE.getBiRelation();

    /**
     * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BI_RELATION__LINK_NAME = eINSTANCE.getBiRelation_LinkName();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.AttributeImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Attributename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTENAME = eINSTANCE.getAttribute_Attributename();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Birelation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__BIRELATION = eINSTANCE.getAttribute_Birelation();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.paramInImpl <em>param In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.paramInImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getparamIn()
     * @generated
     */
    EClass PARAM_IN = eINSTANCE.getparamIn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_IN__NAME = eINSTANCE.getparamIn_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_IN__TYPE = eINSTANCE.getparamIn_Type();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.MethodImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAM = eINSTANCE.getMethod_Param();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

    /**
     * The meta object literal for the '{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.PackageImpl
     * @see org.xtext.smokingtext.diagramclass.diagramClass.impl.DiagramClassPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Class Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__CLASS_TYPE = eINSTANCE.getPackage_ClassType();

    /**
     * The meta object literal for the '<em><b>Sub Package</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__SUB_PACKAGE = eINSTANCE.getPackage_SubPackage();

  }

} //DiagramClassPackage
