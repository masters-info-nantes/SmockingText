/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramClassPackageImpl extends EPackageImpl implements DiagramClassPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependancyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass biRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramInEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DiagramClassPackageImpl()
  {
    super(eNS_URI, DiagramClassFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DiagramClassPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DiagramClassPackage init()
  {
    if (isInited) return (DiagramClassPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramClassPackage.eNS_URI);

    // Obtain or create and register package
    DiagramClassPackageImpl theDiagramClassPackage = (DiagramClassPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiagramClassPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiagramClassPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDiagramClassPackage.createPackageContents();

    // Initialize created meta-data
    theDiagramClassPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDiagramClassPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DiagramClassPackage.eNS_URI, theDiagramClassPackage);
    return theDiagramClassPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Greetings()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElements()
  {
    return elementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Classname()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Extension()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Implements()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Body()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependancy()
  {
    return dependancyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependancy_Name()
  {
    return (EAttribute)dependancyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeration()
  {
    return enumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumeration_Classname()
  {
    return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface()
  {
    return interfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_Interfacename()
  {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Body()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstract()
  {
    return abstractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstract_Classname()
  {
    return (EAttribute)abstractEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstract_Extension()
  {
    return (EAttribute)abstractEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstract_Implements()
  {
    return (EAttribute)abstractEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstract_Body()
  {
    return (EReference)abstractEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBiRelation()
  {
    return biRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBiRelation_LinkName()
  {
    return (EAttribute)biRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Attributename()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Type()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Birelation()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparamIn()
  {
    return paramInEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparamIn_Name()
  {
    return (EAttribute)paramInEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparamIn_Type()
  {
    return (EAttribute)paramInEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Param()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_ReturnType()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_ClassType()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_SubPackage()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramClassFactory getDiagramClassFactory()
  {
    return (DiagramClassFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__GREETINGS);

    elementsEClass = createEClass(ELEMENTS);

    classEClass = createEClass(CLASS);
    createEAttribute(classEClass, CLASS__CLASSNAME);
    createEAttribute(classEClass, CLASS__EXTENSION);
    createEAttribute(classEClass, CLASS__IMPLEMENTS);
    createEReference(classEClass, CLASS__BODY);

    dependancyEClass = createEClass(DEPENDANCY);
    createEAttribute(dependancyEClass, DEPENDANCY__NAME);

    enumerationEClass = createEClass(ENUMERATION);
    createEAttribute(enumerationEClass, ENUMERATION__CLASSNAME);

    interfaceEClass = createEClass(INTERFACE);
    createEAttribute(interfaceEClass, INTERFACE__INTERFACENAME);
    createEReference(interfaceEClass, INTERFACE__BODY);

    abstractEClass = createEClass(ABSTRACT);
    createEAttribute(abstractEClass, ABSTRACT__CLASSNAME);
    createEAttribute(abstractEClass, ABSTRACT__EXTENSION);
    createEAttribute(abstractEClass, ABSTRACT__IMPLEMENTS);
    createEReference(abstractEClass, ABSTRACT__BODY);

    biRelationEClass = createEClass(BI_RELATION);
    createEAttribute(biRelationEClass, BI_RELATION__LINK_NAME);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTENAME);
    createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
    createEReference(attributeEClass, ATTRIBUTE__BIRELATION);

    paramInEClass = createEClass(PARAM_IN);
    createEAttribute(paramInEClass, PARAM_IN__NAME);
    createEAttribute(paramInEClass, PARAM_IN__TYPE);

    methodEClass = createEClass(METHOD);
    createEAttribute(methodEClass, METHOD__NAME);
    createEReference(methodEClass, METHOD__PARAM);
    createEAttribute(methodEClass, METHOD__RETURN_TYPE);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__CLASS_TYPE);
    createEReference(packageEClass, PACKAGE__SUB_PACKAGE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    classEClass.getESuperTypes().add(this.getElements());
    enumerationEClass.getESuperTypes().add(this.getElements());
    interfaceEClass.getESuperTypes().add(this.getElements());
    abstractEClass.getESuperTypes().add(this.getElements());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Greetings(), this.getPackage(), null, "greetings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementsEClass, Elements.class, "Elements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classEClass, org.xtext.smokingtext.diagramclass.diagramClass.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, org.xtext.smokingtext.diagramclass.diagramClass.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, org.xtext.smokingtext.diagramclass.diagramClass.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Implements(), ecorePackage.getEString(), "implements", null, 0, 1, org.xtext.smokingtext.diagramclass.diagramClass.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Body(), ecorePackage.getEObject(), null, "body", null, 0, -1, org.xtext.smokingtext.diagramclass.diagramClass.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependancyEClass, Dependancy.class, "Dependancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependancy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dependancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumeration_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_Interfacename(), ecorePackage.getEString(), "interfacename", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Body(), this.getMethod(), null, "body", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstract_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, Abstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstract_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, Abstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstract_Implements(), ecorePackage.getEString(), "implements", null, 0, 1, Abstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstract_Body(), ecorePackage.getEObject(), null, "body", null, 0, -1, Abstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(biRelationEClass, BiRelation.class, "BiRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBiRelation_LinkName(), ecorePackage.getEString(), "linkName", null, 0, 1, BiRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Attributename(), ecorePackage.getEString(), "attributename", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Birelation(), this.getBiRelation(), null, "birelation", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramInEClass, paramIn.class, "paramIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getparamIn_Name(), ecorePackage.getEString(), "name", null, 0, 1, paramIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparamIn_Type(), ecorePackage.getEString(), "type", null, 0, 1, paramIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Param(), this.getparamIn(), null, "param", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, org.xtext.smokingtext.diagramclass.diagramClass.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.smokingtext.diagramclass.diagramClass.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_ClassType(), this.getElements(), null, "classType", null, 0, -1, org.xtext.smokingtext.diagramclass.diagramClass.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_SubPackage(), this.getPackage(), null, "subPackage", null, 0, -1, org.xtext.smokingtext.diagramclass.diagramClass.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DiagramClassPackageImpl
