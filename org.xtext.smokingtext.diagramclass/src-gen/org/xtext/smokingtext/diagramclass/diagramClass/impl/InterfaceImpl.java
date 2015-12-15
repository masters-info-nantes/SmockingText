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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage;
import org.xtext.smokingtext.diagramclass.diagramClass.Interface;
import org.xtext.smokingtext.diagramclass.diagramClass.Method;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.InterfaceImpl#getInterfacename <em>Interfacename</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.InterfaceImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ElementsImpl implements Interface
{
  /**
   * The default value of the '{@link #getInterfacename() <em>Interfacename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfacename()
   * @generated
   * @ordered
   */
  protected static final String INTERFACENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterfacename() <em>Interfacename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfacename()
   * @generated
   * @ordered
   */
  protected String interfacename = INTERFACENAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<Method> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceImpl()
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
    return DiagramClassPackage.Literals.INTERFACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterfacename()
  {
    return interfacename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfacename(String newInterfacename)
  {
    String oldInterfacename = interfacename;
    interfacename = newInterfacename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.INTERFACE__INTERFACENAME, oldInterfacename, interfacename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<Method>(Method.class, this, DiagramClassPackage.INTERFACE__BODY);
    }
    return body;
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
      case DiagramClassPackage.INTERFACE__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case DiagramClassPackage.INTERFACE__INTERFACENAME:
        return getInterfacename();
      case DiagramClassPackage.INTERFACE__BODY:
        return getBody();
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
      case DiagramClassPackage.INTERFACE__INTERFACENAME:
        setInterfacename((String)newValue);
        return;
      case DiagramClassPackage.INTERFACE__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends Method>)newValue);
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
      case DiagramClassPackage.INTERFACE__INTERFACENAME:
        setInterfacename(INTERFACENAME_EDEFAULT);
        return;
      case DiagramClassPackage.INTERFACE__BODY:
        getBody().clear();
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
      case DiagramClassPackage.INTERFACE__INTERFACENAME:
        return INTERFACENAME_EDEFAULT == null ? interfacename != null : !INTERFACENAME_EDEFAULT.equals(interfacename);
      case DiagramClassPackage.INTERFACE__BODY:
        return body != null && !body.isEmpty();
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
    result.append(" (interfacename: ");
    result.append(interfacename);
    result.append(')');
    return result.toString();
  }

} //InterfaceImpl
