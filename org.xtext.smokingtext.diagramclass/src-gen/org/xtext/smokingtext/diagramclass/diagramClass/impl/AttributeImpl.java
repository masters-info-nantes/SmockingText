/**
 */
package org.xtext.smokingtext.diagramclass.diagramClass.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.smokingtext.diagramclass.diagramClass.Attribute;
import org.xtext.smokingtext.diagramclass.diagramClass.BiRelation;
import org.xtext.smokingtext.diagramclass.diagramClass.DiagramClassPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AttributeImpl#getAttributename <em>Attributename</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.smokingtext.diagramclass.diagramClass.impl.AttributeImpl#getBirelation <em>Birelation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getAttributename() <em>Attributename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributename()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributename() <em>Attributename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributename()
   * @generated
   * @ordered
   */
  protected String attributename = ATTRIBUTENAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBirelation() <em>Birelation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirelation()
   * @generated
   * @ordered
   */
  protected BiRelation birelation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return DiagramClassPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttributename()
  {
    return attributename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributename(String newAttributename)
  {
    String oldAttributename = attributename;
    attributename = newAttributename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.ATTRIBUTE__ATTRIBUTENAME, oldAttributename, attributename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BiRelation getBirelation()
  {
    return birelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBirelation(BiRelation newBirelation, NotificationChain msgs)
  {
    BiRelation oldBirelation = birelation;
    birelation = newBirelation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramClassPackage.ATTRIBUTE__BIRELATION, oldBirelation, newBirelation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBirelation(BiRelation newBirelation)
  {
    if (newBirelation != birelation)
    {
      NotificationChain msgs = null;
      if (birelation != null)
        msgs = ((InternalEObject)birelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramClassPackage.ATTRIBUTE__BIRELATION, null, msgs);
      if (newBirelation != null)
        msgs = ((InternalEObject)newBirelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramClassPackage.ATTRIBUTE__BIRELATION, null, msgs);
      msgs = basicSetBirelation(newBirelation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramClassPackage.ATTRIBUTE__BIRELATION, newBirelation, newBirelation));
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
      case DiagramClassPackage.ATTRIBUTE__BIRELATION:
        return basicSetBirelation(null, msgs);
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
      case DiagramClassPackage.ATTRIBUTE__ATTRIBUTENAME:
        return getAttributename();
      case DiagramClassPackage.ATTRIBUTE__TYPE:
        return getType();
      case DiagramClassPackage.ATTRIBUTE__BIRELATION:
        return getBirelation();
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
      case DiagramClassPackage.ATTRIBUTE__ATTRIBUTENAME:
        setAttributename((String)newValue);
        return;
      case DiagramClassPackage.ATTRIBUTE__TYPE:
        setType((String)newValue);
        return;
      case DiagramClassPackage.ATTRIBUTE__BIRELATION:
        setBirelation((BiRelation)newValue);
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
      case DiagramClassPackage.ATTRIBUTE__ATTRIBUTENAME:
        setAttributename(ATTRIBUTENAME_EDEFAULT);
        return;
      case DiagramClassPackage.ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DiagramClassPackage.ATTRIBUTE__BIRELATION:
        setBirelation((BiRelation)null);
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
      case DiagramClassPackage.ATTRIBUTE__ATTRIBUTENAME:
        return ATTRIBUTENAME_EDEFAULT == null ? attributename != null : !ATTRIBUTENAME_EDEFAULT.equals(attributename);
      case DiagramClassPackage.ATTRIBUTE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DiagramClassPackage.ATTRIBUTE__BIRELATION:
        return birelation != null;
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
    result.append(" (attributename: ");
    result.append(attributename);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
