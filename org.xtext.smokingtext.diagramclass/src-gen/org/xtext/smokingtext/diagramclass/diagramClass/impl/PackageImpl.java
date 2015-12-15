/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage;
import org.xtext.smokingtext.diagramclass.diagramClass.Elements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.PackageImpl#getClassType <em>Class Type</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.PackageImpl#getSubPackage <em>Sub Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements org.xtext.smokingtext.diagramclass.diagramClass.Package
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getClassType() <em>Class Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassType()
   * @generated
   * @ordered
   */
  protected EList<Elements> classType;

  /**
   * The cached value of the '{@link #getSubPackage() <em>Sub Package</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPackage()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.smokingtext.diagramclass.diagramClass.Package> subPackage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DiagramClassPackage.Literals.PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Elements> getClassType()
  {
    if (classType == null)
    {
      classType = new EObjectContainmentEList<Elements>(Elements.class, this, DiagramClassPackage.PACKAGE__CLASS_TYPE);
    }
    return classType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.smokingtext.diagramclass.diagramClass.Package> getSubPackage()
  {
    if (subPackage == null)
    {
      subPackage = new EObjectContainmentEList<org.xtext.smokingtext.diagramclass.diagramClass.Package>(org.xtext.smokingtext.diagramclass.diagramClass.Package.class, this, DiagramClassPackage.PACKAGE__SUB_PACKAGE);
    }
    return subPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DiagramClassPackage.PACKAGE__CLASS_TYPE:
        return ((InternalEList<?>)getClassType()).basicRemove(otherEnd, msgs);
      case DiagramClassPackage.PACKAGE__SUB_PACKAGE:
        return ((InternalEList<?>)getSubPackage()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DiagramClassPackage.PACKAGE__NAME:
        return getName();
      case DiagramClassPackage.PACKAGE__CLASS_TYPE:
        return getClassType();
      case DiagramClassPackage.PACKAGE__SUB_PACKAGE:
        return getSubPackage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DiagramClassPackage.PACKAGE__NAME:
        setName((String)newValue);
        return;
      case DiagramClassPackage.PACKAGE__CLASS_TYPE:
        getClassType().clear();
        getClassType().addAll((Collection<? extends Elements>)newValue);
        return;
      case DiagramClassPackage.PACKAGE__SUB_PACKAGE:
        getSubPackage().clear();
        getSubPackage().addAll((Collection<? extends org.xtext.smokingtext.diagramclass.diagramClass.Package>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DiagramClassPackage.PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DiagramClassPackage.PACKAGE__CLASS_TYPE:
        getClassType().clear();
        return;
      case DiagramClassPackage.PACKAGE__SUB_PACKAGE:
        getSubPackage().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DiagramClassPackage.PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DiagramClassPackage.PACKAGE__CLASS_TYPE:
        return classType != null && !classType.isEmpty();
      case DiagramClassPackage.PACKAGE__SUB_PACKAGE:
        return subPackage != null && !subPackage.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PackageImpl
