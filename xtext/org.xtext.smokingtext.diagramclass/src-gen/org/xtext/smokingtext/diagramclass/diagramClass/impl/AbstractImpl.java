/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.smokingtext.diagramclass.diagramClass.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.smokingtext.diagramclass.diagramClass.Abstract;
import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AbstractImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AbstractImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AbstractImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AbstractImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractImpl extends ElementsImpl implements Abstract
{
  /**
   * The default value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected static final String CLASSNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected String classname = CLASSNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected static final String EXTENSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected String extension = EXTENSION_EDEFAULT;

  /**
   * The default value of the '{@link #getImplements() <em>Implements</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected static final String IMPLEMENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected String implements_ = IMPLEMENTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<EObject> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractImpl()
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
    return DiagramClassPackage.Literals.ABSTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassname()
  {
    return classname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassname(String newClassname)
  {
    String oldClassname = classname;
    classname = newClassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.ABSTRACT__CLASSNAME, oldClassname, classname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(String newExtension)
  {
    String oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.ABSTRACT__EXTENSION, oldExtension, extension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImplements()
  {
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplements(String newImplements)
  {
    String oldImplements = implements_;
    implements_ = newImplements;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.ABSTRACT__IMPLEMENTS, oldImplements, implements_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<EObject>(EObject.class, this, DiagramClassPackage.ABSTRACT__BODY);
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
      case DiagramClassPackage.ABSTRACT__BODY:
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
      case DiagramClassPackage.ABSTRACT__CLASSNAME:
        return getClassname();
      case DiagramClassPackage.ABSTRACT__EXTENSION:
        return getExtension();
      case DiagramClassPackage.ABSTRACT__IMPLEMENTS:
        return getImplements();
      case DiagramClassPackage.ABSTRACT__BODY:
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
      case DiagramClassPackage.ABSTRACT__CLASSNAME:
        setClassname((String)newValue);
        return;
      case DiagramClassPackage.ABSTRACT__EXTENSION:
        setExtension((String)newValue);
        return;
      case DiagramClassPackage.ABSTRACT__IMPLEMENTS:
        setImplements((String)newValue);
        return;
      case DiagramClassPackage.ABSTRACT__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends EObject>)newValue);
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
      case DiagramClassPackage.ABSTRACT__CLASSNAME:
        setClassname(CLASSNAME_EDEFAULT);
        return;
      case DiagramClassPackage.ABSTRACT__EXTENSION:
        setExtension(EXTENSION_EDEFAULT);
        return;
      case DiagramClassPackage.ABSTRACT__IMPLEMENTS:
        setImplements(IMPLEMENTS_EDEFAULT);
        return;
      case DiagramClassPackage.ABSTRACT__BODY:
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
      case DiagramClassPackage.ABSTRACT__CLASSNAME:
        return CLASSNAME_EDEFAULT == null ? classname != null : !CLASSNAME_EDEFAULT.equals(classname);
      case DiagramClassPackage.ABSTRACT__EXTENSION:
        return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
      case DiagramClassPackage.ABSTRACT__IMPLEMENTS:
        return IMPLEMENTS_EDEFAULT == null ? implements_ != null : !IMPLEMENTS_EDEFAULT.equals(implements_);
      case DiagramClassPackage.ABSTRACT__BODY:
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
    result.append(" (classname: ");
    result.append(classname);
    result.append(", extension: ");
    result.append(extension);
    result.append(", implements: ");
    result.append(implements_);
    result.append(')');
    return result.toString();
  }

} //AbstractImpl
