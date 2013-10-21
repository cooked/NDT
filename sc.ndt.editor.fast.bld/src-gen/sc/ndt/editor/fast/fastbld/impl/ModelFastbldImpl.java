/**
 */
package sc.ndt.editor.fast.fastbld.impl;

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

import sc.ndt.editor.fast.fastbld.AdjBlMs;
import sc.ndt.editor.fast.fastbld.AdjEdSt;
import sc.ndt.editor.fast.fastbld.AdjFlSt;
import sc.ndt.editor.fast.fastbld.FastbldPackage;
import sc.ndt.editor.fast.fastbld.Header;
import sc.ndt.editor.fast.fastbld.ModelFastbld;
import sc.ndt.editor.fast.fastbld.Section;
import sc.ndt.editor.fast.fastbld.aAirStat;
import sc.ndt.editor.fast.fastbld.bCalcBMode;
import sc.ndt.editor.fast.fastbld.nBldEdDmp1;
import sc.ndt.editor.fast.fastbld.nBldEdgSh2;
import sc.ndt.editor.fast.fastbld.nBldEdgSh3;
import sc.ndt.editor.fast.fastbld.nBldEdgSh4;
import sc.ndt.editor.fast.fastbld.nBldEdgSh5;
import sc.ndt.editor.fast.fastbld.nBldEdgSh6;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh2;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh3;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh4;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh5;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh6;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh2;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh3;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh4;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh5;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh6;
import sc.ndt.editor.fast.fastbld.nBldFlDmp1;
import sc.ndt.editor.fast.fastbld.nBldFlDmp2;
import sc.ndt.editor.fast.fastbld.nFlStTunr1;
import sc.ndt.editor.fast.fastbld.nFlStTunr2;
import sc.ndt.editor.fast.fastbld.nNblInpSt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Fastbld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getNblInpSt <em>Nbl Inp St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getCalcBMode <em>Calc BMode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFlDmp1 <em>Bld Fl Dmp1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFlDmp2 <em>Bld Fl Dmp2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldEdDmp1 <em>Bld Ed Dmp1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getFlStTunr1 <em>Fl St Tunr1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getFlStTunr2 <em>Fl St Tunr2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getAdjBlMs <em>Adj Bl Ms</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getAdjFlSt <em>Adj Fl St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getAdjEdSt <em>Adj Ed St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getAirStat <em>Air Stat</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl1Sh2 <em>Bld Fl1 Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl1Sh3 <em>Bld Fl1 Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl1Sh4 <em>Bld Fl1 Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl1Sh5 <em>Bld Fl1 Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl1Sh6 <em>Bld Fl1 Sh6</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl2Sh2 <em>Bld Fl2 Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl2Sh3 <em>Bld Fl2 Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl2Sh4 <em>Bld Fl2 Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl2Sh5 <em>Bld Fl2 Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldFl2Sh6 <em>Bld Fl2 Sh6</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldEdgSh2 <em>Bld Edg Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldEdgSh3 <em>Bld Edg Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldEdgSh4 <em>Bld Edg Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldEdgSh5 <em>Bld Edg Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl#getBldEdgSh6 <em>Bld Edg Sh6</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelFastbldImpl extends MinimalEObjectImpl.Container implements ModelFastbld
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
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<Section> sections;

  /**
   * The cached value of the '{@link #getNblInpSt() <em>Nbl Inp St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNblInpSt()
   * @generated
   * @ordered
   */
  protected nNblInpSt nblInpSt;

  /**
   * The cached value of the '{@link #getCalcBMode() <em>Calc BMode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalcBMode()
   * @generated
   * @ordered
   */
  protected bCalcBMode calcBMode;

  /**
   * The cached value of the '{@link #getBldFlDmp1() <em>Bld Fl Dmp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFlDmp1()
   * @generated
   * @ordered
   */
  protected nBldFlDmp1 bldFlDmp1;

  /**
   * The cached value of the '{@link #getBldFlDmp2() <em>Bld Fl Dmp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFlDmp2()
   * @generated
   * @ordered
   */
  protected nBldFlDmp2 bldFlDmp2;

  /**
   * The cached value of the '{@link #getBldEdDmp1() <em>Bld Ed Dmp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldEdDmp1()
   * @generated
   * @ordered
   */
  protected nBldEdDmp1 bldEdDmp1;

  /**
   * The cached value of the '{@link #getFlStTunr1() <em>Fl St Tunr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlStTunr1()
   * @generated
   * @ordered
   */
  protected nFlStTunr1 flStTunr1;

  /**
   * The cached value of the '{@link #getFlStTunr2() <em>Fl St Tunr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlStTunr2()
   * @generated
   * @ordered
   */
  protected nFlStTunr2 flStTunr2;

  /**
   * The cached value of the '{@link #getAdjBlMs() <em>Adj Bl Ms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdjBlMs()
   * @generated
   * @ordered
   */
  protected AdjBlMs adjBlMs;

  /**
   * The cached value of the '{@link #getAdjFlSt() <em>Adj Fl St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdjFlSt()
   * @generated
   * @ordered
   */
  protected AdjFlSt adjFlSt;

  /**
   * The cached value of the '{@link #getAdjEdSt() <em>Adj Ed St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdjEdSt()
   * @generated
   * @ordered
   */
  protected AdjEdSt adjEdSt;

  /**
   * The cached value of the '{@link #getAirStat() <em>Air Stat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAirStat()
   * @generated
   * @ordered
   */
  protected aAirStat airStat;

  /**
   * The cached value of the '{@link #getBldFl1Sh2() <em>Bld Fl1 Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl1Sh2()
   * @generated
   * @ordered
   */
  protected nBldFl1Sh2 bldFl1Sh2;

  /**
   * The cached value of the '{@link #getBldFl1Sh3() <em>Bld Fl1 Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl1Sh3()
   * @generated
   * @ordered
   */
  protected nBldFl1Sh3 bldFl1Sh3;

  /**
   * The cached value of the '{@link #getBldFl1Sh4() <em>Bld Fl1 Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl1Sh4()
   * @generated
   * @ordered
   */
  protected nBldFl1Sh4 bldFl1Sh4;

  /**
   * The cached value of the '{@link #getBldFl1Sh5() <em>Bld Fl1 Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl1Sh5()
   * @generated
   * @ordered
   */
  protected nBldFl1Sh5 bldFl1Sh5;

  /**
   * The cached value of the '{@link #getBldFl1Sh6() <em>Bld Fl1 Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl1Sh6()
   * @generated
   * @ordered
   */
  protected nBldFl1Sh6 bldFl1Sh6;

  /**
   * The cached value of the '{@link #getBldFl2Sh2() <em>Bld Fl2 Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl2Sh2()
   * @generated
   * @ordered
   */
  protected nBldFl2Sh2 bldFl2Sh2;

  /**
   * The cached value of the '{@link #getBldFl2Sh3() <em>Bld Fl2 Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl2Sh3()
   * @generated
   * @ordered
   */
  protected nBldFl2Sh3 bldFl2Sh3;

  /**
   * The cached value of the '{@link #getBldFl2Sh4() <em>Bld Fl2 Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl2Sh4()
   * @generated
   * @ordered
   */
  protected nBldFl2Sh4 bldFl2Sh4;

  /**
   * The cached value of the '{@link #getBldFl2Sh5() <em>Bld Fl2 Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl2Sh5()
   * @generated
   * @ordered
   */
  protected nBldFl2Sh5 bldFl2Sh5;

  /**
   * The cached value of the '{@link #getBldFl2Sh6() <em>Bld Fl2 Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFl2Sh6()
   * @generated
   * @ordered
   */
  protected nBldFl2Sh6 bldFl2Sh6;

  /**
   * The cached value of the '{@link #getBldEdgSh2() <em>Bld Edg Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldEdgSh2()
   * @generated
   * @ordered
   */
  protected nBldEdgSh2 bldEdgSh2;

  /**
   * The cached value of the '{@link #getBldEdgSh3() <em>Bld Edg Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldEdgSh3()
   * @generated
   * @ordered
   */
  protected nBldEdgSh3 bldEdgSh3;

  /**
   * The cached value of the '{@link #getBldEdgSh4() <em>Bld Edg Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldEdgSh4()
   * @generated
   * @ordered
   */
  protected nBldEdgSh4 bldEdgSh4;

  /**
   * The cached value of the '{@link #getBldEdgSh5() <em>Bld Edg Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldEdgSh5()
   * @generated
   * @ordered
   */
  protected nBldEdgSh5 bldEdgSh5;

  /**
   * The cached value of the '{@link #getBldEdgSh6() <em>Bld Edg Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldEdgSh6()
   * @generated
   * @ordered
   */
  protected nBldEdgSh6 bldEdgSh6;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelFastbldImpl()
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
    return FastbldPackage.Literals.MODEL_FASTBLD;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__HEAD, oldHead, newHead);
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
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Section> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<Section>(Section.class, this, FastbldPackage.MODEL_FASTBLD__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNblInpSt getNblInpSt()
  {
    return nblInpSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNblInpSt(nNblInpSt newNblInpSt, NotificationChain msgs)
  {
    nNblInpSt oldNblInpSt = nblInpSt;
    nblInpSt = newNblInpSt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__NBL_INP_ST, oldNblInpSt, newNblInpSt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNblInpSt(nNblInpSt newNblInpSt)
  {
    if (newNblInpSt != nblInpSt)
    {
      NotificationChain msgs = null;
      if (nblInpSt != null)
        msgs = ((InternalEObject)nblInpSt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__NBL_INP_ST, null, msgs);
      if (newNblInpSt != null)
        msgs = ((InternalEObject)newNblInpSt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__NBL_INP_ST, null, msgs);
      msgs = basicSetNblInpSt(newNblInpSt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__NBL_INP_ST, newNblInpSt, newNblInpSt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bCalcBMode getCalcBMode()
  {
    return calcBMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCalcBMode(bCalcBMode newCalcBMode, NotificationChain msgs)
  {
    bCalcBMode oldCalcBMode = calcBMode;
    calcBMode = newCalcBMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__CALC_BMODE, oldCalcBMode, newCalcBMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalcBMode(bCalcBMode newCalcBMode)
  {
    if (newCalcBMode != calcBMode)
    {
      NotificationChain msgs = null;
      if (calcBMode != null)
        msgs = ((InternalEObject)calcBMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__CALC_BMODE, null, msgs);
      if (newCalcBMode != null)
        msgs = ((InternalEObject)newCalcBMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__CALC_BMODE, null, msgs);
      msgs = basicSetCalcBMode(newCalcBMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__CALC_BMODE, newCalcBMode, newCalcBMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFlDmp1 getBldFlDmp1()
  {
    return bldFlDmp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFlDmp1(nBldFlDmp1 newBldFlDmp1, NotificationChain msgs)
  {
    nBldFlDmp1 oldBldFlDmp1 = bldFlDmp1;
    bldFlDmp1 = newBldFlDmp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1, oldBldFlDmp1, newBldFlDmp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFlDmp1(nBldFlDmp1 newBldFlDmp1)
  {
    if (newBldFlDmp1 != bldFlDmp1)
    {
      NotificationChain msgs = null;
      if (bldFlDmp1 != null)
        msgs = ((InternalEObject)bldFlDmp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1, null, msgs);
      if (newBldFlDmp1 != null)
        msgs = ((InternalEObject)newBldFlDmp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1, null, msgs);
      msgs = basicSetBldFlDmp1(newBldFlDmp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1, newBldFlDmp1, newBldFlDmp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFlDmp2 getBldFlDmp2()
  {
    return bldFlDmp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFlDmp2(nBldFlDmp2 newBldFlDmp2, NotificationChain msgs)
  {
    nBldFlDmp2 oldBldFlDmp2 = bldFlDmp2;
    bldFlDmp2 = newBldFlDmp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2, oldBldFlDmp2, newBldFlDmp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFlDmp2(nBldFlDmp2 newBldFlDmp2)
  {
    if (newBldFlDmp2 != bldFlDmp2)
    {
      NotificationChain msgs = null;
      if (bldFlDmp2 != null)
        msgs = ((InternalEObject)bldFlDmp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2, null, msgs);
      if (newBldFlDmp2 != null)
        msgs = ((InternalEObject)newBldFlDmp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2, null, msgs);
      msgs = basicSetBldFlDmp2(newBldFlDmp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2, newBldFlDmp2, newBldFlDmp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdDmp1 getBldEdDmp1()
  {
    return bldEdDmp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldEdDmp1(nBldEdDmp1 newBldEdDmp1, NotificationChain msgs)
  {
    nBldEdDmp1 oldBldEdDmp1 = bldEdDmp1;
    bldEdDmp1 = newBldEdDmp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1, oldBldEdDmp1, newBldEdDmp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldEdDmp1(nBldEdDmp1 newBldEdDmp1)
  {
    if (newBldEdDmp1 != bldEdDmp1)
    {
      NotificationChain msgs = null;
      if (bldEdDmp1 != null)
        msgs = ((InternalEObject)bldEdDmp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1, null, msgs);
      if (newBldEdDmp1 != null)
        msgs = ((InternalEObject)newBldEdDmp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1, null, msgs);
      msgs = basicSetBldEdDmp1(newBldEdDmp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1, newBldEdDmp1, newBldEdDmp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFlStTunr1 getFlStTunr1()
  {
    return flStTunr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFlStTunr1(nFlStTunr1 newFlStTunr1, NotificationChain msgs)
  {
    nFlStTunr1 oldFlStTunr1 = flStTunr1;
    flStTunr1 = newFlStTunr1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1, oldFlStTunr1, newFlStTunr1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlStTunr1(nFlStTunr1 newFlStTunr1)
  {
    if (newFlStTunr1 != flStTunr1)
    {
      NotificationChain msgs = null;
      if (flStTunr1 != null)
        msgs = ((InternalEObject)flStTunr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1, null, msgs);
      if (newFlStTunr1 != null)
        msgs = ((InternalEObject)newFlStTunr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1, null, msgs);
      msgs = basicSetFlStTunr1(newFlStTunr1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1, newFlStTunr1, newFlStTunr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFlStTunr2 getFlStTunr2()
  {
    return flStTunr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFlStTunr2(nFlStTunr2 newFlStTunr2, NotificationChain msgs)
  {
    nFlStTunr2 oldFlStTunr2 = flStTunr2;
    flStTunr2 = newFlStTunr2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2, oldFlStTunr2, newFlStTunr2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlStTunr2(nFlStTunr2 newFlStTunr2)
  {
    if (newFlStTunr2 != flStTunr2)
    {
      NotificationChain msgs = null;
      if (flStTunr2 != null)
        msgs = ((InternalEObject)flStTunr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2, null, msgs);
      if (newFlStTunr2 != null)
        msgs = ((InternalEObject)newFlStTunr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2, null, msgs);
      msgs = basicSetFlStTunr2(newFlStTunr2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2, newFlStTunr2, newFlStTunr2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjBlMs getAdjBlMs()
  {
    return adjBlMs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdjBlMs(AdjBlMs newAdjBlMs, NotificationChain msgs)
  {
    AdjBlMs oldAdjBlMs = adjBlMs;
    adjBlMs = newAdjBlMs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS, oldAdjBlMs, newAdjBlMs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdjBlMs(AdjBlMs newAdjBlMs)
  {
    if (newAdjBlMs != adjBlMs)
    {
      NotificationChain msgs = null;
      if (adjBlMs != null)
        msgs = ((InternalEObject)adjBlMs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS, null, msgs);
      if (newAdjBlMs != null)
        msgs = ((InternalEObject)newAdjBlMs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS, null, msgs);
      msgs = basicSetAdjBlMs(newAdjBlMs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS, newAdjBlMs, newAdjBlMs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjFlSt getAdjFlSt()
  {
    return adjFlSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdjFlSt(AdjFlSt newAdjFlSt, NotificationChain msgs)
  {
    AdjFlSt oldAdjFlSt = adjFlSt;
    adjFlSt = newAdjFlSt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST, oldAdjFlSt, newAdjFlSt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdjFlSt(AdjFlSt newAdjFlSt)
  {
    if (newAdjFlSt != adjFlSt)
    {
      NotificationChain msgs = null;
      if (adjFlSt != null)
        msgs = ((InternalEObject)adjFlSt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST, null, msgs);
      if (newAdjFlSt != null)
        msgs = ((InternalEObject)newAdjFlSt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST, null, msgs);
      msgs = basicSetAdjFlSt(newAdjFlSt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST, newAdjFlSt, newAdjFlSt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjEdSt getAdjEdSt()
  {
    return adjEdSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdjEdSt(AdjEdSt newAdjEdSt, NotificationChain msgs)
  {
    AdjEdSt oldAdjEdSt = adjEdSt;
    adjEdSt = newAdjEdSt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST, oldAdjEdSt, newAdjEdSt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdjEdSt(AdjEdSt newAdjEdSt)
  {
    if (newAdjEdSt != adjEdSt)
    {
      NotificationChain msgs = null;
      if (adjEdSt != null)
        msgs = ((InternalEObject)adjEdSt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST, null, msgs);
      if (newAdjEdSt != null)
        msgs = ((InternalEObject)newAdjEdSt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST, null, msgs);
      msgs = basicSetAdjEdSt(newAdjEdSt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST, newAdjEdSt, newAdjEdSt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aAirStat getAirStat()
  {
    return airStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAirStat(aAirStat newAirStat, NotificationChain msgs)
  {
    aAirStat oldAirStat = airStat;
    airStat = newAirStat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__AIR_STAT, oldAirStat, newAirStat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAirStat(aAirStat newAirStat)
  {
    if (newAirStat != airStat)
    {
      NotificationChain msgs = null;
      if (airStat != null)
        msgs = ((InternalEObject)airStat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__AIR_STAT, null, msgs);
      if (newAirStat != null)
        msgs = ((InternalEObject)newAirStat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__AIR_STAT, null, msgs);
      msgs = basicSetAirStat(newAirStat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__AIR_STAT, newAirStat, newAirStat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh2 getBldFl1Sh2()
  {
    return bldFl1Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl1Sh2(nBldFl1Sh2 newBldFl1Sh2, NotificationChain msgs)
  {
    nBldFl1Sh2 oldBldFl1Sh2 = bldFl1Sh2;
    bldFl1Sh2 = newBldFl1Sh2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2, oldBldFl1Sh2, newBldFl1Sh2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl1Sh2(nBldFl1Sh2 newBldFl1Sh2)
  {
    if (newBldFl1Sh2 != bldFl1Sh2)
    {
      NotificationChain msgs = null;
      if (bldFl1Sh2 != null)
        msgs = ((InternalEObject)bldFl1Sh2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2, null, msgs);
      if (newBldFl1Sh2 != null)
        msgs = ((InternalEObject)newBldFl1Sh2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2, null, msgs);
      msgs = basicSetBldFl1Sh2(newBldFl1Sh2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2, newBldFl1Sh2, newBldFl1Sh2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh3 getBldFl1Sh3()
  {
    return bldFl1Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl1Sh3(nBldFl1Sh3 newBldFl1Sh3, NotificationChain msgs)
  {
    nBldFl1Sh3 oldBldFl1Sh3 = bldFl1Sh3;
    bldFl1Sh3 = newBldFl1Sh3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3, oldBldFl1Sh3, newBldFl1Sh3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl1Sh3(nBldFl1Sh3 newBldFl1Sh3)
  {
    if (newBldFl1Sh3 != bldFl1Sh3)
    {
      NotificationChain msgs = null;
      if (bldFl1Sh3 != null)
        msgs = ((InternalEObject)bldFl1Sh3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3, null, msgs);
      if (newBldFl1Sh3 != null)
        msgs = ((InternalEObject)newBldFl1Sh3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3, null, msgs);
      msgs = basicSetBldFl1Sh3(newBldFl1Sh3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3, newBldFl1Sh3, newBldFl1Sh3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh4 getBldFl1Sh4()
  {
    return bldFl1Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl1Sh4(nBldFl1Sh4 newBldFl1Sh4, NotificationChain msgs)
  {
    nBldFl1Sh4 oldBldFl1Sh4 = bldFl1Sh4;
    bldFl1Sh4 = newBldFl1Sh4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4, oldBldFl1Sh4, newBldFl1Sh4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl1Sh4(nBldFl1Sh4 newBldFl1Sh4)
  {
    if (newBldFl1Sh4 != bldFl1Sh4)
    {
      NotificationChain msgs = null;
      if (bldFl1Sh4 != null)
        msgs = ((InternalEObject)bldFl1Sh4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4, null, msgs);
      if (newBldFl1Sh4 != null)
        msgs = ((InternalEObject)newBldFl1Sh4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4, null, msgs);
      msgs = basicSetBldFl1Sh4(newBldFl1Sh4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4, newBldFl1Sh4, newBldFl1Sh4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh5 getBldFl1Sh5()
  {
    return bldFl1Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl1Sh5(nBldFl1Sh5 newBldFl1Sh5, NotificationChain msgs)
  {
    nBldFl1Sh5 oldBldFl1Sh5 = bldFl1Sh5;
    bldFl1Sh5 = newBldFl1Sh5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5, oldBldFl1Sh5, newBldFl1Sh5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl1Sh5(nBldFl1Sh5 newBldFl1Sh5)
  {
    if (newBldFl1Sh5 != bldFl1Sh5)
    {
      NotificationChain msgs = null;
      if (bldFl1Sh5 != null)
        msgs = ((InternalEObject)bldFl1Sh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5, null, msgs);
      if (newBldFl1Sh5 != null)
        msgs = ((InternalEObject)newBldFl1Sh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5, null, msgs);
      msgs = basicSetBldFl1Sh5(newBldFl1Sh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5, newBldFl1Sh5, newBldFl1Sh5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh6 getBldFl1Sh6()
  {
    return bldFl1Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl1Sh6(nBldFl1Sh6 newBldFl1Sh6, NotificationChain msgs)
  {
    nBldFl1Sh6 oldBldFl1Sh6 = bldFl1Sh6;
    bldFl1Sh6 = newBldFl1Sh6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6, oldBldFl1Sh6, newBldFl1Sh6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl1Sh6(nBldFl1Sh6 newBldFl1Sh6)
  {
    if (newBldFl1Sh6 != bldFl1Sh6)
    {
      NotificationChain msgs = null;
      if (bldFl1Sh6 != null)
        msgs = ((InternalEObject)bldFl1Sh6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6, null, msgs);
      if (newBldFl1Sh6 != null)
        msgs = ((InternalEObject)newBldFl1Sh6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6, null, msgs);
      msgs = basicSetBldFl1Sh6(newBldFl1Sh6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6, newBldFl1Sh6, newBldFl1Sh6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh2 getBldFl2Sh2()
  {
    return bldFl2Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl2Sh2(nBldFl2Sh2 newBldFl2Sh2, NotificationChain msgs)
  {
    nBldFl2Sh2 oldBldFl2Sh2 = bldFl2Sh2;
    bldFl2Sh2 = newBldFl2Sh2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2, oldBldFl2Sh2, newBldFl2Sh2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl2Sh2(nBldFl2Sh2 newBldFl2Sh2)
  {
    if (newBldFl2Sh2 != bldFl2Sh2)
    {
      NotificationChain msgs = null;
      if (bldFl2Sh2 != null)
        msgs = ((InternalEObject)bldFl2Sh2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2, null, msgs);
      if (newBldFl2Sh2 != null)
        msgs = ((InternalEObject)newBldFl2Sh2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2, null, msgs);
      msgs = basicSetBldFl2Sh2(newBldFl2Sh2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2, newBldFl2Sh2, newBldFl2Sh2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh3 getBldFl2Sh3()
  {
    return bldFl2Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl2Sh3(nBldFl2Sh3 newBldFl2Sh3, NotificationChain msgs)
  {
    nBldFl2Sh3 oldBldFl2Sh3 = bldFl2Sh3;
    bldFl2Sh3 = newBldFl2Sh3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3, oldBldFl2Sh3, newBldFl2Sh3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl2Sh3(nBldFl2Sh3 newBldFl2Sh3)
  {
    if (newBldFl2Sh3 != bldFl2Sh3)
    {
      NotificationChain msgs = null;
      if (bldFl2Sh3 != null)
        msgs = ((InternalEObject)bldFl2Sh3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3, null, msgs);
      if (newBldFl2Sh3 != null)
        msgs = ((InternalEObject)newBldFl2Sh3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3, null, msgs);
      msgs = basicSetBldFl2Sh3(newBldFl2Sh3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3, newBldFl2Sh3, newBldFl2Sh3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh4 getBldFl2Sh4()
  {
    return bldFl2Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl2Sh4(nBldFl2Sh4 newBldFl2Sh4, NotificationChain msgs)
  {
    nBldFl2Sh4 oldBldFl2Sh4 = bldFl2Sh4;
    bldFl2Sh4 = newBldFl2Sh4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4, oldBldFl2Sh4, newBldFl2Sh4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl2Sh4(nBldFl2Sh4 newBldFl2Sh4)
  {
    if (newBldFl2Sh4 != bldFl2Sh4)
    {
      NotificationChain msgs = null;
      if (bldFl2Sh4 != null)
        msgs = ((InternalEObject)bldFl2Sh4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4, null, msgs);
      if (newBldFl2Sh4 != null)
        msgs = ((InternalEObject)newBldFl2Sh4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4, null, msgs);
      msgs = basicSetBldFl2Sh4(newBldFl2Sh4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4, newBldFl2Sh4, newBldFl2Sh4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh5 getBldFl2Sh5()
  {
    return bldFl2Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl2Sh5(nBldFl2Sh5 newBldFl2Sh5, NotificationChain msgs)
  {
    nBldFl2Sh5 oldBldFl2Sh5 = bldFl2Sh5;
    bldFl2Sh5 = newBldFl2Sh5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5, oldBldFl2Sh5, newBldFl2Sh5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl2Sh5(nBldFl2Sh5 newBldFl2Sh5)
  {
    if (newBldFl2Sh5 != bldFl2Sh5)
    {
      NotificationChain msgs = null;
      if (bldFl2Sh5 != null)
        msgs = ((InternalEObject)bldFl2Sh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5, null, msgs);
      if (newBldFl2Sh5 != null)
        msgs = ((InternalEObject)newBldFl2Sh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5, null, msgs);
      msgs = basicSetBldFl2Sh5(newBldFl2Sh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5, newBldFl2Sh5, newBldFl2Sh5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh6 getBldFl2Sh6()
  {
    return bldFl2Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFl2Sh6(nBldFl2Sh6 newBldFl2Sh6, NotificationChain msgs)
  {
    nBldFl2Sh6 oldBldFl2Sh6 = bldFl2Sh6;
    bldFl2Sh6 = newBldFl2Sh6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6, oldBldFl2Sh6, newBldFl2Sh6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFl2Sh6(nBldFl2Sh6 newBldFl2Sh6)
  {
    if (newBldFl2Sh6 != bldFl2Sh6)
    {
      NotificationChain msgs = null;
      if (bldFl2Sh6 != null)
        msgs = ((InternalEObject)bldFl2Sh6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6, null, msgs);
      if (newBldFl2Sh6 != null)
        msgs = ((InternalEObject)newBldFl2Sh6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6, null, msgs);
      msgs = basicSetBldFl2Sh6(newBldFl2Sh6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6, newBldFl2Sh6, newBldFl2Sh6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh2 getBldEdgSh2()
  {
    return bldEdgSh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldEdgSh2(nBldEdgSh2 newBldEdgSh2, NotificationChain msgs)
  {
    nBldEdgSh2 oldBldEdgSh2 = bldEdgSh2;
    bldEdgSh2 = newBldEdgSh2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2, oldBldEdgSh2, newBldEdgSh2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldEdgSh2(nBldEdgSh2 newBldEdgSh2)
  {
    if (newBldEdgSh2 != bldEdgSh2)
    {
      NotificationChain msgs = null;
      if (bldEdgSh2 != null)
        msgs = ((InternalEObject)bldEdgSh2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2, null, msgs);
      if (newBldEdgSh2 != null)
        msgs = ((InternalEObject)newBldEdgSh2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2, null, msgs);
      msgs = basicSetBldEdgSh2(newBldEdgSh2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2, newBldEdgSh2, newBldEdgSh2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh3 getBldEdgSh3()
  {
    return bldEdgSh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldEdgSh3(nBldEdgSh3 newBldEdgSh3, NotificationChain msgs)
  {
    nBldEdgSh3 oldBldEdgSh3 = bldEdgSh3;
    bldEdgSh3 = newBldEdgSh3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3, oldBldEdgSh3, newBldEdgSh3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldEdgSh3(nBldEdgSh3 newBldEdgSh3)
  {
    if (newBldEdgSh3 != bldEdgSh3)
    {
      NotificationChain msgs = null;
      if (bldEdgSh3 != null)
        msgs = ((InternalEObject)bldEdgSh3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3, null, msgs);
      if (newBldEdgSh3 != null)
        msgs = ((InternalEObject)newBldEdgSh3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3, null, msgs);
      msgs = basicSetBldEdgSh3(newBldEdgSh3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3, newBldEdgSh3, newBldEdgSh3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh4 getBldEdgSh4()
  {
    return bldEdgSh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldEdgSh4(nBldEdgSh4 newBldEdgSh4, NotificationChain msgs)
  {
    nBldEdgSh4 oldBldEdgSh4 = bldEdgSh4;
    bldEdgSh4 = newBldEdgSh4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4, oldBldEdgSh4, newBldEdgSh4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldEdgSh4(nBldEdgSh4 newBldEdgSh4)
  {
    if (newBldEdgSh4 != bldEdgSh4)
    {
      NotificationChain msgs = null;
      if (bldEdgSh4 != null)
        msgs = ((InternalEObject)bldEdgSh4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4, null, msgs);
      if (newBldEdgSh4 != null)
        msgs = ((InternalEObject)newBldEdgSh4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4, null, msgs);
      msgs = basicSetBldEdgSh4(newBldEdgSh4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4, newBldEdgSh4, newBldEdgSh4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh5 getBldEdgSh5()
  {
    return bldEdgSh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldEdgSh5(nBldEdgSh5 newBldEdgSh5, NotificationChain msgs)
  {
    nBldEdgSh5 oldBldEdgSh5 = bldEdgSh5;
    bldEdgSh5 = newBldEdgSh5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5, oldBldEdgSh5, newBldEdgSh5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldEdgSh5(nBldEdgSh5 newBldEdgSh5)
  {
    if (newBldEdgSh5 != bldEdgSh5)
    {
      NotificationChain msgs = null;
      if (bldEdgSh5 != null)
        msgs = ((InternalEObject)bldEdgSh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5, null, msgs);
      if (newBldEdgSh5 != null)
        msgs = ((InternalEObject)newBldEdgSh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5, null, msgs);
      msgs = basicSetBldEdgSh5(newBldEdgSh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5, newBldEdgSh5, newBldEdgSh5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh6 getBldEdgSh6()
  {
    return bldEdgSh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldEdgSh6(nBldEdgSh6 newBldEdgSh6, NotificationChain msgs)
  {
    nBldEdgSh6 oldBldEdgSh6 = bldEdgSh6;
    bldEdgSh6 = newBldEdgSh6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6, oldBldEdgSh6, newBldEdgSh6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldEdgSh6(nBldEdgSh6 newBldEdgSh6)
  {
    if (newBldEdgSh6 != bldEdgSh6)
    {
      NotificationChain msgs = null;
      if (bldEdgSh6 != null)
        msgs = ((InternalEObject)bldEdgSh6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6, null, msgs);
      if (newBldEdgSh6 != null)
        msgs = ((InternalEObject)newBldEdgSh6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6, null, msgs);
      msgs = basicSetBldEdgSh6(newBldEdgSh6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6, newBldEdgSh6, newBldEdgSh6));
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
      case FastbldPackage.MODEL_FASTBLD__HEAD:
        return basicSetHead(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
      case FastbldPackage.MODEL_FASTBLD__NBL_INP_ST:
        return basicSetNblInpSt(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__CALC_BMODE:
        return basicSetCalcBMode(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1:
        return basicSetBldFlDmp1(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2:
        return basicSetBldFlDmp2(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1:
        return basicSetBldEdDmp1(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1:
        return basicSetFlStTunr1(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2:
        return basicSetFlStTunr2(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS:
        return basicSetAdjBlMs(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST:
        return basicSetAdjFlSt(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST:
        return basicSetAdjEdSt(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__AIR_STAT:
        return basicSetAirStat(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2:
        return basicSetBldFl1Sh2(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3:
        return basicSetBldFl1Sh3(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4:
        return basicSetBldFl1Sh4(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5:
        return basicSetBldFl1Sh5(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6:
        return basicSetBldFl1Sh6(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2:
        return basicSetBldFl2Sh2(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3:
        return basicSetBldFl2Sh3(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4:
        return basicSetBldFl2Sh4(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5:
        return basicSetBldFl2Sh5(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6:
        return basicSetBldFl2Sh6(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2:
        return basicSetBldEdgSh2(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3:
        return basicSetBldEdgSh3(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4:
        return basicSetBldEdgSh4(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5:
        return basicSetBldEdgSh5(null, msgs);
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6:
        return basicSetBldEdgSh6(null, msgs);
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
      case FastbldPackage.MODEL_FASTBLD__HEAD:
        return getHead();
      case FastbldPackage.MODEL_FASTBLD__SECTIONS:
        return getSections();
      case FastbldPackage.MODEL_FASTBLD__NBL_INP_ST:
        return getNblInpSt();
      case FastbldPackage.MODEL_FASTBLD__CALC_BMODE:
        return getCalcBMode();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1:
        return getBldFlDmp1();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2:
        return getBldFlDmp2();
      case FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1:
        return getBldEdDmp1();
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1:
        return getFlStTunr1();
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2:
        return getFlStTunr2();
      case FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS:
        return getAdjBlMs();
      case FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST:
        return getAdjFlSt();
      case FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST:
        return getAdjEdSt();
      case FastbldPackage.MODEL_FASTBLD__AIR_STAT:
        return getAirStat();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2:
        return getBldFl1Sh2();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3:
        return getBldFl1Sh3();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4:
        return getBldFl1Sh4();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5:
        return getBldFl1Sh5();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6:
        return getBldFl1Sh6();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2:
        return getBldFl2Sh2();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3:
        return getBldFl2Sh3();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4:
        return getBldFl2Sh4();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5:
        return getBldFl2Sh5();
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6:
        return getBldFl2Sh6();
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2:
        return getBldEdgSh2();
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3:
        return getBldEdgSh3();
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4:
        return getBldEdgSh4();
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5:
        return getBldEdgSh5();
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6:
        return getBldEdgSh6();
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
      case FastbldPackage.MODEL_FASTBLD__HEAD:
        setHead((Header)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__NBL_INP_ST:
        setNblInpSt((nNblInpSt)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__CALC_BMODE:
        setCalcBMode((bCalcBMode)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1:
        setBldFlDmp1((nBldFlDmp1)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2:
        setBldFlDmp2((nBldFlDmp2)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1:
        setBldEdDmp1((nBldEdDmp1)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1:
        setFlStTunr1((nFlStTunr1)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2:
        setFlStTunr2((nFlStTunr2)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS:
        setAdjBlMs((AdjBlMs)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST:
        setAdjFlSt((AdjFlSt)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST:
        setAdjEdSt((AdjEdSt)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__AIR_STAT:
        setAirStat((aAirStat)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2:
        setBldFl1Sh2((nBldFl1Sh2)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3:
        setBldFl1Sh3((nBldFl1Sh3)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4:
        setBldFl1Sh4((nBldFl1Sh4)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5:
        setBldFl1Sh5((nBldFl1Sh5)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6:
        setBldFl1Sh6((nBldFl1Sh6)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2:
        setBldFl2Sh2((nBldFl2Sh2)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3:
        setBldFl2Sh3((nBldFl2Sh3)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4:
        setBldFl2Sh4((nBldFl2Sh4)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5:
        setBldFl2Sh5((nBldFl2Sh5)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6:
        setBldFl2Sh6((nBldFl2Sh6)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2:
        setBldEdgSh2((nBldEdgSh2)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3:
        setBldEdgSh3((nBldEdgSh3)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4:
        setBldEdgSh4((nBldEdgSh4)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5:
        setBldEdgSh5((nBldEdgSh5)newValue);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6:
        setBldEdgSh6((nBldEdgSh6)newValue);
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
      case FastbldPackage.MODEL_FASTBLD__HEAD:
        setHead((Header)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__SECTIONS:
        getSections().clear();
        return;
      case FastbldPackage.MODEL_FASTBLD__NBL_INP_ST:
        setNblInpSt((nNblInpSt)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__CALC_BMODE:
        setCalcBMode((bCalcBMode)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1:
        setBldFlDmp1((nBldFlDmp1)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2:
        setBldFlDmp2((nBldFlDmp2)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1:
        setBldEdDmp1((nBldEdDmp1)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1:
        setFlStTunr1((nFlStTunr1)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2:
        setFlStTunr2((nFlStTunr2)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS:
        setAdjBlMs((AdjBlMs)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST:
        setAdjFlSt((AdjFlSt)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST:
        setAdjEdSt((AdjEdSt)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__AIR_STAT:
        setAirStat((aAirStat)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2:
        setBldFl1Sh2((nBldFl1Sh2)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3:
        setBldFl1Sh3((nBldFl1Sh3)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4:
        setBldFl1Sh4((nBldFl1Sh4)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5:
        setBldFl1Sh5((nBldFl1Sh5)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6:
        setBldFl1Sh6((nBldFl1Sh6)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2:
        setBldFl2Sh2((nBldFl2Sh2)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3:
        setBldFl2Sh3((nBldFl2Sh3)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4:
        setBldFl2Sh4((nBldFl2Sh4)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5:
        setBldFl2Sh5((nBldFl2Sh5)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6:
        setBldFl2Sh6((nBldFl2Sh6)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2:
        setBldEdgSh2((nBldEdgSh2)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3:
        setBldEdgSh3((nBldEdgSh3)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4:
        setBldEdgSh4((nBldEdgSh4)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5:
        setBldEdgSh5((nBldEdgSh5)null);
        return;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6:
        setBldEdgSh6((nBldEdgSh6)null);
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
      case FastbldPackage.MODEL_FASTBLD__HEAD:
        return head != null;
      case FastbldPackage.MODEL_FASTBLD__SECTIONS:
        return sections != null && !sections.isEmpty();
      case FastbldPackage.MODEL_FASTBLD__NBL_INP_ST:
        return nblInpSt != null;
      case FastbldPackage.MODEL_FASTBLD__CALC_BMODE:
        return calcBMode != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP1:
        return bldFlDmp1 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL_DMP2:
        return bldFlDmp2 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_ED_DMP1:
        return bldEdDmp1 != null;
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR1:
        return flStTunr1 != null;
      case FastbldPackage.MODEL_FASTBLD__FL_ST_TUNR2:
        return flStTunr2 != null;
      case FastbldPackage.MODEL_FASTBLD__ADJ_BL_MS:
        return adjBlMs != null;
      case FastbldPackage.MODEL_FASTBLD__ADJ_FL_ST:
        return adjFlSt != null;
      case FastbldPackage.MODEL_FASTBLD__ADJ_ED_ST:
        return adjEdSt != null;
      case FastbldPackage.MODEL_FASTBLD__AIR_STAT:
        return airStat != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH2:
        return bldFl1Sh2 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH3:
        return bldFl1Sh3 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH4:
        return bldFl1Sh4 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH5:
        return bldFl1Sh5 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL1_SH6:
        return bldFl1Sh6 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH2:
        return bldFl2Sh2 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH3:
        return bldFl2Sh3 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH4:
        return bldFl2Sh4 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH5:
        return bldFl2Sh5 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_FL2_SH6:
        return bldFl2Sh6 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH2:
        return bldEdgSh2 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH3:
        return bldEdgSh3 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH4:
        return bldEdgSh4 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH5:
        return bldEdgSh5 != null;
      case FastbldPackage.MODEL_FASTBLD__BLD_EDG_SH6:
        return bldEdgSh6 != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelFastbldImpl
