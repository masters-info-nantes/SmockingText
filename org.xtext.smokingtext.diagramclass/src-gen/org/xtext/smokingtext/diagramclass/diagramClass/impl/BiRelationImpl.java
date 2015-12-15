/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.smokingtext.diagramclass.diagramClass.BiRelation;
import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bi Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.BiRelationImpl#getLinkName <em>Link Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiRelationImpl extends MinimalEObjectImpl.Container implements BiRelation
{
  /**
   * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkName()
   * @generated
   * @ordered
   */
  protected static final String LINK_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkName()
   * @generated
   * @ordered
   */
  protected String linkName = LINK_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BiRelationImpl()
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
    return DiagramClassPackage.Literals.BI_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLinkName()
  {
    return linkName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkName(String newLinkName)
  {
    String oldLinkName = linkName;
    linkName = newLinkName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.BI_RELATION__LINK_NAME, oldLinkName, linkName));
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
      case DiagramClassPackage.BI_RELATION__LINK_NAME:
        return getLinkName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DiagramClassPackage.BI_RELATION__LINK_NAME:
        setLinkName((String)newValue);
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
      case DiagramClassPackage.BI_RELATION__LINK_NAME:
        setLinkName(LINK_NAME_EDEFAULT);
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
      case DiagramClassPackage.BI_RELATION__LINK_NAME:
        return LINK_NAME_EDEFAULT == null ? linkName != null : !LINK_NAME_EDEFAULT.equals(linkName);
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
    result.append(" (linkName: ");
    result.append(linkName);
    result.append(')');
    return result.toString();
  }

} //BiRelationImpl
