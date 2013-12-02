/**
 */
package sc.ndt.editor.bmodes.bmodesout.impl;

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

import sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage;
import sc.ndt.editor.bmodes.bmodesout.Header;
import sc.ndt.editor.bmodes.bmodesout.Mode;
import sc.ndt.editor.bmodes.bmodesout.ModelBmodesout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Bmodesout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModelBmodesoutImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModelBmodesoutImpl#getModes <em>Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelBmodesoutImpl extends MinimalEObjectImpl.Container implements ModelBmodesout
{
  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected Header head;

  /**
   * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModes()
   * @generated
   * @ordered
   */
  protected EList<Mode> modes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelBmodesoutImpl()
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
    return BmodesoutPackage.Literals.MODEL_BMODESOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(Header newHead, NotificationChain msgs)
  {
    Header oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesoutPackage.MODEL_BMODESOUT__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(Header newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesoutPackage.MODEL_BMODESOUT__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesoutPackage.MODEL_BMODESOUT__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesoutPackage.MODEL_BMODESOUT__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mode> getModes()
  {
    if (modes == null)
    {
      modes = new EObjectContainmentEList<Mode>(Mode.class, this, BmodesoutPackage.MODEL_BMODESOUT__MODES);
    }
    return modes;
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
      case BmodesoutPackage.MODEL_BMODESOUT__HEAD:
        return basicSetHead(null, msgs);
      case BmodesoutPackage.MODEL_BMODESOUT__MODES:
        return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
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
      case BmodesoutPackage.MODEL_BMODESOUT__HEAD:
        return getHead();
      case BmodesoutPackage.MODEL_BMODESOUT__MODES:
        return getModes();
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
      case BmodesoutPackage.MODEL_BMODESOUT__HEAD:
        setHead((Header)newValue);
        return;
      case BmodesoutPackage.MODEL_BMODESOUT__MODES:
        getModes().clear();
        getModes().addAll((Collection<? extends Mode>)newValue);
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
      case BmodesoutPackage.MODEL_BMODESOUT__HEAD:
        setHead((Header)null);
        return;
      case BmodesoutPackage.MODEL_BMODESOUT__MODES:
        getModes().clear();
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
      case BmodesoutPackage.MODEL_BMODESOUT__HEAD:
        return head != null;
      case BmodesoutPackage.MODEL_BMODESOUT__MODES:
        return modes != null && !modes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelBmodesoutImpl
