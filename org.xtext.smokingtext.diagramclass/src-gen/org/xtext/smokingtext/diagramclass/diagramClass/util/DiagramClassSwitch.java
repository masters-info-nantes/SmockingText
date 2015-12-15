/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.smokingtext.diagramclass.diagramClass.Abstract;
import org.xtext.smokingtext.diagramclass.diagramClass.Attribute;
import org.xtext.smokingtext.diagramclass.diagramClass.BiRelation;
import org.xtext.smokingtext.diagramclass.diagramClass.Dependancy;
import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage;
import org.xtext.smokingtext.diagramclass.diagramClass.Elements;
import org.xtext.smokingtext.diagramclass.diagramClass.Enumeration;
import org.xtext.smokingtext.diagramclass.diagramClass.Interface;
import org.xtext.smokingtext.diagramclass.diagramClass.Method;
import org.xtext.smokingtext.diagramclass.diagramClass.Model;
import org.xtext.smokingtext.diagramclass.diagramClass.paramIn;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage
 * @generated
 */
public class DiagramClassSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DiagramClassPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramClassSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DiagramClassPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DiagramClassPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.ELEMENTS:
      {
        Elements elements = (Elements)theEObject;
        T result = caseElements(elements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.CLASS:
      {
        org.xtext.smokingtext.diagramclass.diagramClass.Class class_ = (org.xtext.smokingtext.diagramclass.diagramClass.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseElements(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.DEPENDANCY:
      {
        Dependancy dependancy = (Dependancy)theEObject;
        T result = caseDependancy(dependancy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseElements(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = caseElements(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.ABSTRACT:
      {
        Abstract abstract_ = (Abstract)theEObject;
        T result = caseAbstract(abstract_);
        if (result == null) result = caseElements(abstract_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.BI_RELATION:
      {
        BiRelation biRelation = (BiRelation)theEObject;
        T result = caseBiRelation(biRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.PARAM_IN:
      {
        paramIn paramIn = (paramIn)theEObject;
        T result = caseparamIn(paramIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DiagramClassPackage.PACKAGE:
      {
        org.xtext.smokingtext.diagramclass.diagramClass.Package package_ = (org.xtext.smokingtext.diagramclass.diagramClass.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElements(Elements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(org.xtext.smokingtext.diagramclass.diagramClass.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependancy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependancy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependancy(Dependancy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstract(Abstract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bi Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bi Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBiRelation(BiRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>param In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>param In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparamIn(paramIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(org.xtext.smokingtext.diagramclass.diagramClass.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DiagramClassSwitch
