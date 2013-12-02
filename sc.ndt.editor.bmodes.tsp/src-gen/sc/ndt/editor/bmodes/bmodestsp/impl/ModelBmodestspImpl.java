/**
 */
package sc.ndt.editor.bmodes.bmodestsp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sc.ndt.editor.bmodes.bmodestsp.BmodestspPackage;
import sc.ndt.editor.bmodes.bmodestsp.Header;
import sc.ndt.editor.bmodes.bmodestsp.ModelBmodestsp;
import sc.ndt.editor.bmodes.bmodestsp.aSec;
import sc.ndt.editor.bmodes.bmodestsp.iNodes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Bmodestsp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.ModelBmodestspImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.ModelBmodestspImpl#getNNodes <em>NNodes</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.ModelBmodestspImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelBmodestspImpl extends MinimalEObjectImpl.Container implements ModelBmodestsp
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
   * The cached value of the '{@link #getNNodes() <em>NNodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNNodes()
   * @generated
   * @ordered
   */
  protected iNodes nNodes;

  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected aSec sections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelBmodestspImpl()
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
    return BmodestspPackage.Literals.MODEL_BMODESTSP;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodestspPackage.MODEL_BMODESTSP__HEAD, oldHead, newHead);
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
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodestspPackage.MODEL_BMODESTSP__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodestspPackage.MODEL_BMODESTSP__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodestspPackage.MODEL_BMODESTSP__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNodes getNNodes()
  {
    return nNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNNodes(iNodes newNNodes, NotificationChain msgs)
  {
    iNodes oldNNodes = nNodes;
    nNodes = newNNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodestspPackage.MODEL_BMODESTSP__NNODES, oldNNodes, newNNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNNodes(iNodes newNNodes)
  {
    if (newNNodes != nNodes)
    {
      NotificationChain msgs = null;
      if (nNodes != null)
        msgs = ((InternalEObject)nNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodestspPackage.MODEL_BMODESTSP__NNODES, null, msgs);
      if (newNNodes != null)
        msgs = ((InternalEObject)newNNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodestspPackage.MODEL_BMODESTSP__NNODES, null, msgs);
      msgs = basicSetNNodes(newNNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodestspPackage.MODEL_BMODESTSP__NNODES, newNNodes, newNNodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aSec getSections()
  {
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSections(aSec newSections, NotificationChain msgs)
  {
    aSec oldSections = sections;
    sections = newSections;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodestspPackage.MODEL_BMODESTSP__SECTIONS, oldSections, newSections);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSections(aSec newSections)
  {
    if (newSections != sections)
    {
      NotificationChain msgs = null;
      if (sections != null)
        msgs = ((InternalEObject)sections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodestspPackage.MODEL_BMODESTSP__SECTIONS, null, msgs);
      if (newSections != null)
        msgs = ((InternalEObject)newSections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodestspPackage.MODEL_BMODESTSP__SECTIONS, null, msgs);
      msgs = basicSetSections(newSections, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodestspPackage.MODEL_BMODESTSP__SECTIONS, newSections, newSections));
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
      case BmodestspPackage.MODEL_BMODESTSP__HEAD:
        return basicSetHead(null, msgs);
      case BmodestspPackage.MODEL_BMODESTSP__NNODES:
        return basicSetNNodes(null, msgs);
      case BmodestspPackage.MODEL_BMODESTSP__SECTIONS:
        return basicSetSections(null, msgs);
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
      case BmodestspPackage.MODEL_BMODESTSP__HEAD:
        return getHead();
      case BmodestspPackage.MODEL_BMODESTSP__NNODES:
        return getNNodes();
      case BmodestspPackage.MODEL_BMODESTSP__SECTIONS:
        return getSections();
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
      case BmodestspPackage.MODEL_BMODESTSP__HEAD:
        setHead((Header)newValue);
        return;
      case BmodestspPackage.MODEL_BMODESTSP__NNODES:
        setNNodes((iNodes)newValue);
        return;
      case BmodestspPackage.MODEL_BMODESTSP__SECTIONS:
        setSections((aSec)newValue);
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
      case BmodestspPackage.MODEL_BMODESTSP__HEAD:
        setHead((Header)null);
        return;
      case BmodestspPackage.MODEL_BMODESTSP__NNODES:
        setNNodes((iNodes)null);
        return;
      case BmodestspPackage.MODEL_BMODESTSP__SECTIONS:
        setSections((aSec)null);
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
      case BmodestspPackage.MODEL_BMODESTSP__HEAD:
        return head != null;
      case BmodestspPackage.MODEL_BMODESTSP__NNODES:
        return nNodes != null;
      case BmodestspPackage.MODEL_BMODESTSP__SECTIONS:
        return sections != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelBmodestspImpl
