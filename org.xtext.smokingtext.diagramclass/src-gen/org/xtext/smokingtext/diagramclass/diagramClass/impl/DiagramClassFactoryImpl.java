/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.smokingtext.diagramclass.diagramClass.Abstract;
import org.xtext.smokingtext.diagramclass.diagramClass.Attribute;
import org.xtext.smokingtext.diagramclass.diagramClass.BiRelation;
import org.xtext.smokingtext.diagramclass.diagramClass.Dependancy;
import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassFactory;
import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage;
import org.xtext.smokingtext.diagramclass.diagramClass.Elements;
import org.xtext.smokingtext.diagramclass.diagramClass.Enumeration;
import org.xtext.smokingtext.diagramclass.diagramClass.Interface;
import org.xtext.smokingtext.diagramclass.diagramClass.Method;
import org.xtext.smokingtext.diagramclass.diagramClass.Model;
import org.xtext.smokingtext.diagramclass.diagramClass.paramIn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramClassFactoryImpl extends EFactoryImpl implements DiagramClassFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DiagramClassFactory init()
  {
    try
    {
      DiagramClassFactory theDiagramClassFactory = (DiagramClassFactory)EPackage.Registry.INSTANCE.getEFactory(DiagramClassPackage.eNS_URI);
      if (theDiagramClassFactory != null)
      {
        return theDiagramClassFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DiagramClassFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramClassFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DiagramClassPackage.MODEL: return createModel();
      case DiagramClassPackage.ELEMENTS: return createElements();
      case DiagramClassPackage.CLASS: return createClass();
      case DiagramClassPackage.DEPENDANCY: return createDependancy();
      case DiagramClassPackage.ENUMERATION: return createEnumeration();
      case DiagramClassPackage.INTERFACE: return createInterface();
      case DiagramClassPackage.ABSTRACT: return createAbstract();
      case DiagramClassPackage.BI_RELATION: return createBiRelation();
      case DiagramClassPackage.ATTRIBUTE: return createAttribute();
      case DiagramClassPackage.PARAM_IN: return createparamIn();
      case DiagramClassPackage.METHOD: return createMethod();
      case DiagramClassPackage.PACKAGE: return createPackage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elements createElements()
  {
    ElementsImpl elements = new ElementsImpl();
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.smokingtext.diagramclass.diagramClass.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependancy createDependancy()
  {
    DependancyImpl dependancy = new DependancyImpl();
    return dependancy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstract createAbstract()
  {
    AbstractImpl abstract_ = new AbstractImpl();
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BiRelation createBiRelation()
  {
    BiRelationImpl biRelation = new BiRelationImpl();
    return biRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public paramIn createparamIn()
  {
    paramInImpl paramIn = new paramInImpl();
    return paramIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.smokingtext.diagramclass.diagramClass.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramClassPackage getDiagramClassPackage()
  {
    return (DiagramClassPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DiagramClassPackage getPackage()
  {
    return DiagramClassPackage.eINSTANCE;
  }

} //DiagramClassFactoryImpl
