/**
 */
package sc.ndt.editor.fast.fasttwr.impl;

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

import sc.ndt.editor.fast.fasttwr.AdjFASt;
import sc.ndt.editor.fast.fasttwr.AdjSSSt;
import sc.ndt.editor.fast.fasttwr.AdjTwMa;
import sc.ndt.editor.fast.fasttwr.FasttwrPackage;
import sc.ndt.editor.fast.fasttwr.Header;
import sc.ndt.editor.fast.fasttwr.ModelFasttwr;
import sc.ndt.editor.fast.fasttwr.Section;
import sc.ndt.editor.fast.fasttwr.aTwrStat;
import sc.ndt.editor.fast.fasttwr.bCalcTMode;
import sc.ndt.editor.fast.fasttwr.nFAStTunr1;
import sc.ndt.editor.fast.fasttwr.nFAStTunr2;
import sc.ndt.editor.fast.fasttwr.nNTwInpSt;
import sc.ndt.editor.fast.fasttwr.nSSStTunr1;
import sc.ndt.editor.fast.fasttwr.nSSStTunr2;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6;
import sc.ndt.editor.fast.fasttwr.nTwrFADmp1;
import sc.ndt.editor.fast.fasttwr.nTwrFADmp2;
import sc.ndt.editor.fast.fasttwr.nTwrSSDmp1;
import sc.ndt.editor.fast.fasttwr.nTwrSSDmp2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Fasttwr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getNTwInpSt <em>NTw Inp St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getCalcTMode <em>Calc TMode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getBldFlDmp1 <em>Bld Fl Dmp1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getBldFlDmp2 <em>Bld Fl Dmp2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getBldEdDmp1 <em>Bld Ed Dmp1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getBldEdDmp2 <em>Bld Ed Dmp2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getFAStTunr1 <em>FA St Tunr1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getFAStTunr2 <em>FA St Tunr2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getSSStTunr1 <em>SS St Tunr1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getSSStTunr2 <em>SS St Tunr2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getAdjTwMa <em>Adj Tw Ma</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getAdjFASt <em>Adj FA St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getAdjSSSt <em>Adj SS St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwrStat <em>Twr Stat</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM1Sh2 <em>Tw FAM1 Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM1Sh3 <em>Tw FAM1 Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM1Sh4 <em>Tw FAM1 Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM1Sh5 <em>Tw FAM1 Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM1Sh6 <em>Tw FAM1 Sh6</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM2Sh2 <em>Tw FAM2 Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM2Sh3 <em>Tw FAM2 Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM2Sh4 <em>Tw FAM2 Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM2Sh5 <em>Tw FAM2 Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwFAM2Sh6 <em>Tw FAM2 Sh6</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM1Sh2 <em>Tw SSM1 Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM1Sh3 <em>Tw SSM1 Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM1Sh4 <em>Tw SSM1 Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM1Sh5 <em>Tw SSM1 Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM1Sh6 <em>Tw SSM1 Sh6</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM2Sh2 <em>Tw SSM2 Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM2Sh3 <em>Tw SSM2 Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM2Sh4 <em>Tw SSM2 Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM2Sh5 <em>Tw SSM2 Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl#getTwSSM2Sh6 <em>Tw SSM2 Sh6</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelFasttwrImpl extends MinimalEObjectImpl.Container implements ModelFasttwr
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
   * The cached value of the '{@link #getNTwInpSt() <em>NTw Inp St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNTwInpSt()
   * @generated
   * @ordered
   */
  protected nNTwInpSt nTwInpSt;

  /**
   * The cached value of the '{@link #getCalcTMode() <em>Calc TMode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalcTMode()
   * @generated
   * @ordered
   */
  protected bCalcTMode calcTMode;

  /**
   * The cached value of the '{@link #getBldFlDmp1() <em>Bld Fl Dmp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFlDmp1()
   * @generated
   * @ordered
   */
  protected nTwrFADmp1 bldFlDmp1;

  /**
   * The cached value of the '{@link #getBldFlDmp2() <em>Bld Fl Dmp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFlDmp2()
   * @generated
   * @ordered
   */
  protected nTwrFADmp2 bldFlDmp2;

  /**
   * The cached value of the '{@link #getBldEdDmp1() <em>Bld Ed Dmp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldEdDmp1()
   * @generated
   * @ordered
   */
  protected nTwrSSDmp1 bldEdDmp1;

  /**
   * The cached value of the '{@link #getBldEdDmp2() <em>Bld Ed Dmp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldEdDmp2()
   * @generated
   * @ordered
   */
  protected nTwrSSDmp2 bldEdDmp2;

  /**
   * The cached value of the '{@link #getFAStTunr1() <em>FA St Tunr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFAStTunr1()
   * @generated
   * @ordered
   */
  protected nFAStTunr1 faStTunr1;

  /**
   * The cached value of the '{@link #getFAStTunr2() <em>FA St Tunr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFAStTunr2()
   * @generated
   * @ordered
   */
  protected nFAStTunr2 faStTunr2;

  /**
   * The cached value of the '{@link #getSSStTunr1() <em>SS St Tunr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSSStTunr1()
   * @generated
   * @ordered
   */
  protected nSSStTunr1 ssStTunr1;

  /**
   * The cached value of the '{@link #getSSStTunr2() <em>SS St Tunr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSSStTunr2()
   * @generated
   * @ordered
   */
  protected nSSStTunr2 ssStTunr2;

  /**
   * The cached value of the '{@link #getAdjTwMa() <em>Adj Tw Ma</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdjTwMa()
   * @generated
   * @ordered
   */
  protected AdjTwMa adjTwMa;

  /**
   * The cached value of the '{@link #getAdjFASt() <em>Adj FA St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdjFASt()
   * @generated
   * @ordered
   */
  protected AdjFASt adjFASt;

  /**
   * The cached value of the '{@link #getAdjSSSt() <em>Adj SS St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdjSSSt()
   * @generated
   * @ordered
   */
  protected AdjSSSt adjSSSt;

  /**
   * The cached value of the '{@link #getTwrStat() <em>Twr Stat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrStat()
   * @generated
   * @ordered
   */
  protected aTwrStat twrStat;

  /**
   * The cached value of the '{@link #getTwFAM1Sh2() <em>Tw FAM1 Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM1Sh2()
   * @generated
   * @ordered
   */
  protected nTwFAM1Sh2 twFAM1Sh2;

  /**
   * The cached value of the '{@link #getTwFAM1Sh3() <em>Tw FAM1 Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM1Sh3()
   * @generated
   * @ordered
   */
  protected nTwFAM1Sh3 twFAM1Sh3;

  /**
   * The cached value of the '{@link #getTwFAM1Sh4() <em>Tw FAM1 Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM1Sh4()
   * @generated
   * @ordered
   */
  protected nTwFAM1Sh4 twFAM1Sh4;

  /**
   * The cached value of the '{@link #getTwFAM1Sh5() <em>Tw FAM1 Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM1Sh5()
   * @generated
   * @ordered
   */
  protected nTwFAM1Sh5 twFAM1Sh5;

  /**
   * The cached value of the '{@link #getTwFAM1Sh6() <em>Tw FAM1 Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM1Sh6()
   * @generated
   * @ordered
   */
  protected nTwFAM1Sh6 twFAM1Sh6;

  /**
   * The cached value of the '{@link #getTwFAM2Sh2() <em>Tw FAM2 Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM2Sh2()
   * @generated
   * @ordered
   */
  protected nTwFAM2Sh2 twFAM2Sh2;

  /**
   * The cached value of the '{@link #getTwFAM2Sh3() <em>Tw FAM2 Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM2Sh3()
   * @generated
   * @ordered
   */
  protected nTwFAM2Sh3 twFAM2Sh3;

  /**
   * The cached value of the '{@link #getTwFAM2Sh4() <em>Tw FAM2 Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM2Sh4()
   * @generated
   * @ordered
   */
  protected nTwFAM2Sh4 twFAM2Sh4;

  /**
   * The cached value of the '{@link #getTwFAM2Sh5() <em>Tw FAM2 Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM2Sh5()
   * @generated
   * @ordered
   */
  protected nTwFAM2Sh5 twFAM2Sh5;

  /**
   * The cached value of the '{@link #getTwFAM2Sh6() <em>Tw FAM2 Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAM2Sh6()
   * @generated
   * @ordered
   */
  protected nTwFAM2Sh6 twFAM2Sh6;

  /**
   * The cached value of the '{@link #getTwSSM1Sh2() <em>Tw SSM1 Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM1Sh2()
   * @generated
   * @ordered
   */
  protected nTwSSM1Sh2 twSSM1Sh2;

  /**
   * The cached value of the '{@link #getTwSSM1Sh3() <em>Tw SSM1 Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM1Sh3()
   * @generated
   * @ordered
   */
  protected nTwSSM1Sh3 twSSM1Sh3;

  /**
   * The cached value of the '{@link #getTwSSM1Sh4() <em>Tw SSM1 Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM1Sh4()
   * @generated
   * @ordered
   */
  protected nTwSSM1Sh4 twSSM1Sh4;

  /**
   * The cached value of the '{@link #getTwSSM1Sh5() <em>Tw SSM1 Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM1Sh5()
   * @generated
   * @ordered
   */
  protected nTwSSM1Sh5 twSSM1Sh5;

  /**
   * The cached value of the '{@link #getTwSSM1Sh6() <em>Tw SSM1 Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM1Sh6()
   * @generated
   * @ordered
   */
  protected nTwSSM1Sh6 twSSM1Sh6;

  /**
   * The cached value of the '{@link #getTwSSM2Sh2() <em>Tw SSM2 Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM2Sh2()
   * @generated
   * @ordered
   */
  protected nTwSSM2Sh2 twSSM2Sh2;

  /**
   * The cached value of the '{@link #getTwSSM2Sh3() <em>Tw SSM2 Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM2Sh3()
   * @generated
   * @ordered
   */
  protected nTwSSM2Sh3 twSSM2Sh3;

  /**
   * The cached value of the '{@link #getTwSSM2Sh4() <em>Tw SSM2 Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM2Sh4()
   * @generated
   * @ordered
   */
  protected nTwSSM2Sh4 twSSM2Sh4;

  /**
   * The cached value of the '{@link #getTwSSM2Sh5() <em>Tw SSM2 Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM2Sh5()
   * @generated
   * @ordered
   */
  protected nTwSSM2Sh5 twSSM2Sh5;

  /**
   * The cached value of the '{@link #getTwSSM2Sh6() <em>Tw SSM2 Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSM2Sh6()
   * @generated
   * @ordered
   */
  protected nTwSSM2Sh6 twSSM2Sh6;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelFasttwrImpl()
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
    return FasttwrPackage.Literals.MODEL_FASTTWR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__HEAD, oldHead, newHead);
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
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__HEAD, newHead, newHead));
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
      sections = new EObjectContainmentEList<Section>(Section.class, this, FasttwrPackage.MODEL_FASTTWR__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNTwInpSt getNTwInpSt()
  {
    return nTwInpSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNTwInpSt(nNTwInpSt newNTwInpSt, NotificationChain msgs)
  {
    nNTwInpSt oldNTwInpSt = nTwInpSt;
    nTwInpSt = newNTwInpSt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST, oldNTwInpSt, newNTwInpSt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNTwInpSt(nNTwInpSt newNTwInpSt)
  {
    if (newNTwInpSt != nTwInpSt)
    {
      NotificationChain msgs = null;
      if (nTwInpSt != null)
        msgs = ((InternalEObject)nTwInpSt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST, null, msgs);
      if (newNTwInpSt != null)
        msgs = ((InternalEObject)newNTwInpSt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST, null, msgs);
      msgs = basicSetNTwInpSt(newNTwInpSt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST, newNTwInpSt, newNTwInpSt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bCalcTMode getCalcTMode()
  {
    return calcTMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCalcTMode(bCalcTMode newCalcTMode, NotificationChain msgs)
  {
    bCalcTMode oldCalcTMode = calcTMode;
    calcTMode = newCalcTMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__CALC_TMODE, oldCalcTMode, newCalcTMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalcTMode(bCalcTMode newCalcTMode)
  {
    if (newCalcTMode != calcTMode)
    {
      NotificationChain msgs = null;
      if (calcTMode != null)
        msgs = ((InternalEObject)calcTMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__CALC_TMODE, null, msgs);
      if (newCalcTMode != null)
        msgs = ((InternalEObject)newCalcTMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__CALC_TMODE, null, msgs);
      msgs = basicSetCalcTMode(newCalcTMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__CALC_TMODE, newCalcTMode, newCalcTMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrFADmp1 getBldFlDmp1()
  {
    return bldFlDmp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFlDmp1(nTwrFADmp1 newBldFlDmp1, NotificationChain msgs)
  {
    nTwrFADmp1 oldBldFlDmp1 = bldFlDmp1;
    bldFlDmp1 = newBldFlDmp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1, oldBldFlDmp1, newBldFlDmp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFlDmp1(nTwrFADmp1 newBldFlDmp1)
  {
    if (newBldFlDmp1 != bldFlDmp1)
    {
      NotificationChain msgs = null;
      if (bldFlDmp1 != null)
        msgs = ((InternalEObject)bldFlDmp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1, null, msgs);
      if (newBldFlDmp1 != null)
        msgs = ((InternalEObject)newBldFlDmp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1, null, msgs);
      msgs = basicSetBldFlDmp1(newBldFlDmp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1, newBldFlDmp1, newBldFlDmp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrFADmp2 getBldFlDmp2()
  {
    return bldFlDmp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFlDmp2(nTwrFADmp2 newBldFlDmp2, NotificationChain msgs)
  {
    nTwrFADmp2 oldBldFlDmp2 = bldFlDmp2;
    bldFlDmp2 = newBldFlDmp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2, oldBldFlDmp2, newBldFlDmp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFlDmp2(nTwrFADmp2 newBldFlDmp2)
  {
    if (newBldFlDmp2 != bldFlDmp2)
    {
      NotificationChain msgs = null;
      if (bldFlDmp2 != null)
        msgs = ((InternalEObject)bldFlDmp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2, null, msgs);
      if (newBldFlDmp2 != null)
        msgs = ((InternalEObject)newBldFlDmp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2, null, msgs);
      msgs = basicSetBldFlDmp2(newBldFlDmp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2, newBldFlDmp2, newBldFlDmp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrSSDmp1 getBldEdDmp1()
  {
    return bldEdDmp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldEdDmp1(nTwrSSDmp1 newBldEdDmp1, NotificationChain msgs)
  {
    nTwrSSDmp1 oldBldEdDmp1 = bldEdDmp1;
    bldEdDmp1 = newBldEdDmp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1, oldBldEdDmp1, newBldEdDmp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldEdDmp1(nTwrSSDmp1 newBldEdDmp1)
  {
    if (newBldEdDmp1 != bldEdDmp1)
    {
      NotificationChain msgs = null;
      if (bldEdDmp1 != null)
        msgs = ((InternalEObject)bldEdDmp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1, null, msgs);
      if (newBldEdDmp1 != null)
        msgs = ((InternalEObject)newBldEdDmp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1, null, msgs);
      msgs = basicSetBldEdDmp1(newBldEdDmp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1, newBldEdDmp1, newBldEdDmp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrSSDmp2 getBldEdDmp2()
  {
    return bldEdDmp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldEdDmp2(nTwrSSDmp2 newBldEdDmp2, NotificationChain msgs)
  {
    nTwrSSDmp2 oldBldEdDmp2 = bldEdDmp2;
    bldEdDmp2 = newBldEdDmp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2, oldBldEdDmp2, newBldEdDmp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldEdDmp2(nTwrSSDmp2 newBldEdDmp2)
  {
    if (newBldEdDmp2 != bldEdDmp2)
    {
      NotificationChain msgs = null;
      if (bldEdDmp2 != null)
        msgs = ((InternalEObject)bldEdDmp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2, null, msgs);
      if (newBldEdDmp2 != null)
        msgs = ((InternalEObject)newBldEdDmp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2, null, msgs);
      msgs = basicSetBldEdDmp2(newBldEdDmp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2, newBldEdDmp2, newBldEdDmp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFAStTunr1 getFAStTunr1()
  {
    return faStTunr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFAStTunr1(nFAStTunr1 newFAStTunr1, NotificationChain msgs)
  {
    nFAStTunr1 oldFAStTunr1 = faStTunr1;
    faStTunr1 = newFAStTunr1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1, oldFAStTunr1, newFAStTunr1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFAStTunr1(nFAStTunr1 newFAStTunr1)
  {
    if (newFAStTunr1 != faStTunr1)
    {
      NotificationChain msgs = null;
      if (faStTunr1 != null)
        msgs = ((InternalEObject)faStTunr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1, null, msgs);
      if (newFAStTunr1 != null)
        msgs = ((InternalEObject)newFAStTunr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1, null, msgs);
      msgs = basicSetFAStTunr1(newFAStTunr1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1, newFAStTunr1, newFAStTunr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFAStTunr2 getFAStTunr2()
  {
    return faStTunr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFAStTunr2(nFAStTunr2 newFAStTunr2, NotificationChain msgs)
  {
    nFAStTunr2 oldFAStTunr2 = faStTunr2;
    faStTunr2 = newFAStTunr2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2, oldFAStTunr2, newFAStTunr2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFAStTunr2(nFAStTunr2 newFAStTunr2)
  {
    if (newFAStTunr2 != faStTunr2)
    {
      NotificationChain msgs = null;
      if (faStTunr2 != null)
        msgs = ((InternalEObject)faStTunr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2, null, msgs);
      if (newFAStTunr2 != null)
        msgs = ((InternalEObject)newFAStTunr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2, null, msgs);
      msgs = basicSetFAStTunr2(newFAStTunr2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2, newFAStTunr2, newFAStTunr2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSSStTunr1 getSSStTunr1()
  {
    return ssStTunr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSSStTunr1(nSSStTunr1 newSSStTunr1, NotificationChain msgs)
  {
    nSSStTunr1 oldSSStTunr1 = ssStTunr1;
    ssStTunr1 = newSSStTunr1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1, oldSSStTunr1, newSSStTunr1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSSStTunr1(nSSStTunr1 newSSStTunr1)
  {
    if (newSSStTunr1 != ssStTunr1)
    {
      NotificationChain msgs = null;
      if (ssStTunr1 != null)
        msgs = ((InternalEObject)ssStTunr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1, null, msgs);
      if (newSSStTunr1 != null)
        msgs = ((InternalEObject)newSSStTunr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1, null, msgs);
      msgs = basicSetSSStTunr1(newSSStTunr1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1, newSSStTunr1, newSSStTunr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSSStTunr2 getSSStTunr2()
  {
    return ssStTunr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSSStTunr2(nSSStTunr2 newSSStTunr2, NotificationChain msgs)
  {
    nSSStTunr2 oldSSStTunr2 = ssStTunr2;
    ssStTunr2 = newSSStTunr2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2, oldSSStTunr2, newSSStTunr2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSSStTunr2(nSSStTunr2 newSSStTunr2)
  {
    if (newSSStTunr2 != ssStTunr2)
    {
      NotificationChain msgs = null;
      if (ssStTunr2 != null)
        msgs = ((InternalEObject)ssStTunr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2, null, msgs);
      if (newSSStTunr2 != null)
        msgs = ((InternalEObject)newSSStTunr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2, null, msgs);
      msgs = basicSetSSStTunr2(newSSStTunr2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2, newSSStTunr2, newSSStTunr2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjTwMa getAdjTwMa()
  {
    return adjTwMa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdjTwMa(AdjTwMa newAdjTwMa, NotificationChain msgs)
  {
    AdjTwMa oldAdjTwMa = adjTwMa;
    adjTwMa = newAdjTwMa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA, oldAdjTwMa, newAdjTwMa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdjTwMa(AdjTwMa newAdjTwMa)
  {
    if (newAdjTwMa != adjTwMa)
    {
      NotificationChain msgs = null;
      if (adjTwMa != null)
        msgs = ((InternalEObject)adjTwMa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA, null, msgs);
      if (newAdjTwMa != null)
        msgs = ((InternalEObject)newAdjTwMa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA, null, msgs);
      msgs = basicSetAdjTwMa(newAdjTwMa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA, newAdjTwMa, newAdjTwMa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjFASt getAdjFASt()
  {
    return adjFASt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdjFASt(AdjFASt newAdjFASt, NotificationChain msgs)
  {
    AdjFASt oldAdjFASt = adjFASt;
    adjFASt = newAdjFASt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST, oldAdjFASt, newAdjFASt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdjFASt(AdjFASt newAdjFASt)
  {
    if (newAdjFASt != adjFASt)
    {
      NotificationChain msgs = null;
      if (adjFASt != null)
        msgs = ((InternalEObject)adjFASt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST, null, msgs);
      if (newAdjFASt != null)
        msgs = ((InternalEObject)newAdjFASt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST, null, msgs);
      msgs = basicSetAdjFASt(newAdjFASt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST, newAdjFASt, newAdjFASt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjSSSt getAdjSSSt()
  {
    return adjSSSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdjSSSt(AdjSSSt newAdjSSSt, NotificationChain msgs)
  {
    AdjSSSt oldAdjSSSt = adjSSSt;
    adjSSSt = newAdjSSSt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST, oldAdjSSSt, newAdjSSSt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdjSSSt(AdjSSSt newAdjSSSt)
  {
    if (newAdjSSSt != adjSSSt)
    {
      NotificationChain msgs = null;
      if (adjSSSt != null)
        msgs = ((InternalEObject)adjSSSt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST, null, msgs);
      if (newAdjSSSt != null)
        msgs = ((InternalEObject)newAdjSSSt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST, null, msgs);
      msgs = basicSetAdjSSSt(newAdjSSSt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST, newAdjSSSt, newAdjSSSt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aTwrStat getTwrStat()
  {
    return twrStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrStat(aTwrStat newTwrStat, NotificationChain msgs)
  {
    aTwrStat oldTwrStat = twrStat;
    twrStat = newTwrStat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TWR_STAT, oldTwrStat, newTwrStat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrStat(aTwrStat newTwrStat)
  {
    if (newTwrStat != twrStat)
    {
      NotificationChain msgs = null;
      if (twrStat != null)
        msgs = ((InternalEObject)twrStat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TWR_STAT, null, msgs);
      if (newTwrStat != null)
        msgs = ((InternalEObject)newTwrStat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TWR_STAT, null, msgs);
      msgs = basicSetTwrStat(newTwrStat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TWR_STAT, newTwrStat, newTwrStat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh2 getTwFAM1Sh2()
  {
    return twFAM1Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM1Sh2(nTwFAM1Sh2 newTwFAM1Sh2, NotificationChain msgs)
  {
    nTwFAM1Sh2 oldTwFAM1Sh2 = twFAM1Sh2;
    twFAM1Sh2 = newTwFAM1Sh2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2, oldTwFAM1Sh2, newTwFAM1Sh2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM1Sh2(nTwFAM1Sh2 newTwFAM1Sh2)
  {
    if (newTwFAM1Sh2 != twFAM1Sh2)
    {
      NotificationChain msgs = null;
      if (twFAM1Sh2 != null)
        msgs = ((InternalEObject)twFAM1Sh2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2, null, msgs);
      if (newTwFAM1Sh2 != null)
        msgs = ((InternalEObject)newTwFAM1Sh2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2, null, msgs);
      msgs = basicSetTwFAM1Sh2(newTwFAM1Sh2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2, newTwFAM1Sh2, newTwFAM1Sh2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh3 getTwFAM1Sh3()
  {
    return twFAM1Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM1Sh3(nTwFAM1Sh3 newTwFAM1Sh3, NotificationChain msgs)
  {
    nTwFAM1Sh3 oldTwFAM1Sh3 = twFAM1Sh3;
    twFAM1Sh3 = newTwFAM1Sh3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3, oldTwFAM1Sh3, newTwFAM1Sh3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM1Sh3(nTwFAM1Sh3 newTwFAM1Sh3)
  {
    if (newTwFAM1Sh3 != twFAM1Sh3)
    {
      NotificationChain msgs = null;
      if (twFAM1Sh3 != null)
        msgs = ((InternalEObject)twFAM1Sh3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3, null, msgs);
      if (newTwFAM1Sh3 != null)
        msgs = ((InternalEObject)newTwFAM1Sh3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3, null, msgs);
      msgs = basicSetTwFAM1Sh3(newTwFAM1Sh3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3, newTwFAM1Sh3, newTwFAM1Sh3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh4 getTwFAM1Sh4()
  {
    return twFAM1Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM1Sh4(nTwFAM1Sh4 newTwFAM1Sh4, NotificationChain msgs)
  {
    nTwFAM1Sh4 oldTwFAM1Sh4 = twFAM1Sh4;
    twFAM1Sh4 = newTwFAM1Sh4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4, oldTwFAM1Sh4, newTwFAM1Sh4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM1Sh4(nTwFAM1Sh4 newTwFAM1Sh4)
  {
    if (newTwFAM1Sh4 != twFAM1Sh4)
    {
      NotificationChain msgs = null;
      if (twFAM1Sh4 != null)
        msgs = ((InternalEObject)twFAM1Sh4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4, null, msgs);
      if (newTwFAM1Sh4 != null)
        msgs = ((InternalEObject)newTwFAM1Sh4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4, null, msgs);
      msgs = basicSetTwFAM1Sh4(newTwFAM1Sh4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4, newTwFAM1Sh4, newTwFAM1Sh4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh5 getTwFAM1Sh5()
  {
    return twFAM1Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM1Sh5(nTwFAM1Sh5 newTwFAM1Sh5, NotificationChain msgs)
  {
    nTwFAM1Sh5 oldTwFAM1Sh5 = twFAM1Sh5;
    twFAM1Sh5 = newTwFAM1Sh5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5, oldTwFAM1Sh5, newTwFAM1Sh5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM1Sh5(nTwFAM1Sh5 newTwFAM1Sh5)
  {
    if (newTwFAM1Sh5 != twFAM1Sh5)
    {
      NotificationChain msgs = null;
      if (twFAM1Sh5 != null)
        msgs = ((InternalEObject)twFAM1Sh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5, null, msgs);
      if (newTwFAM1Sh5 != null)
        msgs = ((InternalEObject)newTwFAM1Sh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5, null, msgs);
      msgs = basicSetTwFAM1Sh5(newTwFAM1Sh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5, newTwFAM1Sh5, newTwFAM1Sh5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh6 getTwFAM1Sh6()
  {
    return twFAM1Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM1Sh6(nTwFAM1Sh6 newTwFAM1Sh6, NotificationChain msgs)
  {
    nTwFAM1Sh6 oldTwFAM1Sh6 = twFAM1Sh6;
    twFAM1Sh6 = newTwFAM1Sh6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6, oldTwFAM1Sh6, newTwFAM1Sh6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM1Sh6(nTwFAM1Sh6 newTwFAM1Sh6)
  {
    if (newTwFAM1Sh6 != twFAM1Sh6)
    {
      NotificationChain msgs = null;
      if (twFAM1Sh6 != null)
        msgs = ((InternalEObject)twFAM1Sh6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6, null, msgs);
      if (newTwFAM1Sh6 != null)
        msgs = ((InternalEObject)newTwFAM1Sh6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6, null, msgs);
      msgs = basicSetTwFAM1Sh6(newTwFAM1Sh6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6, newTwFAM1Sh6, newTwFAM1Sh6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh2 getTwFAM2Sh2()
  {
    return twFAM2Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM2Sh2(nTwFAM2Sh2 newTwFAM2Sh2, NotificationChain msgs)
  {
    nTwFAM2Sh2 oldTwFAM2Sh2 = twFAM2Sh2;
    twFAM2Sh2 = newTwFAM2Sh2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2, oldTwFAM2Sh2, newTwFAM2Sh2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM2Sh2(nTwFAM2Sh2 newTwFAM2Sh2)
  {
    if (newTwFAM2Sh2 != twFAM2Sh2)
    {
      NotificationChain msgs = null;
      if (twFAM2Sh2 != null)
        msgs = ((InternalEObject)twFAM2Sh2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2, null, msgs);
      if (newTwFAM2Sh2 != null)
        msgs = ((InternalEObject)newTwFAM2Sh2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2, null, msgs);
      msgs = basicSetTwFAM2Sh2(newTwFAM2Sh2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2, newTwFAM2Sh2, newTwFAM2Sh2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh3 getTwFAM2Sh3()
  {
    return twFAM2Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM2Sh3(nTwFAM2Sh3 newTwFAM2Sh3, NotificationChain msgs)
  {
    nTwFAM2Sh3 oldTwFAM2Sh3 = twFAM2Sh3;
    twFAM2Sh3 = newTwFAM2Sh3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3, oldTwFAM2Sh3, newTwFAM2Sh3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM2Sh3(nTwFAM2Sh3 newTwFAM2Sh3)
  {
    if (newTwFAM2Sh3 != twFAM2Sh3)
    {
      NotificationChain msgs = null;
      if (twFAM2Sh3 != null)
        msgs = ((InternalEObject)twFAM2Sh3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3, null, msgs);
      if (newTwFAM2Sh3 != null)
        msgs = ((InternalEObject)newTwFAM2Sh3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3, null, msgs);
      msgs = basicSetTwFAM2Sh3(newTwFAM2Sh3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3, newTwFAM2Sh3, newTwFAM2Sh3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh4 getTwFAM2Sh4()
  {
    return twFAM2Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM2Sh4(nTwFAM2Sh4 newTwFAM2Sh4, NotificationChain msgs)
  {
    nTwFAM2Sh4 oldTwFAM2Sh4 = twFAM2Sh4;
    twFAM2Sh4 = newTwFAM2Sh4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4, oldTwFAM2Sh4, newTwFAM2Sh4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM2Sh4(nTwFAM2Sh4 newTwFAM2Sh4)
  {
    if (newTwFAM2Sh4 != twFAM2Sh4)
    {
      NotificationChain msgs = null;
      if (twFAM2Sh4 != null)
        msgs = ((InternalEObject)twFAM2Sh4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4, null, msgs);
      if (newTwFAM2Sh4 != null)
        msgs = ((InternalEObject)newTwFAM2Sh4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4, null, msgs);
      msgs = basicSetTwFAM2Sh4(newTwFAM2Sh4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4, newTwFAM2Sh4, newTwFAM2Sh4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh5 getTwFAM2Sh5()
  {
    return twFAM2Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM2Sh5(nTwFAM2Sh5 newTwFAM2Sh5, NotificationChain msgs)
  {
    nTwFAM2Sh5 oldTwFAM2Sh5 = twFAM2Sh5;
    twFAM2Sh5 = newTwFAM2Sh5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5, oldTwFAM2Sh5, newTwFAM2Sh5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM2Sh5(nTwFAM2Sh5 newTwFAM2Sh5)
  {
    if (newTwFAM2Sh5 != twFAM2Sh5)
    {
      NotificationChain msgs = null;
      if (twFAM2Sh5 != null)
        msgs = ((InternalEObject)twFAM2Sh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5, null, msgs);
      if (newTwFAM2Sh5 != null)
        msgs = ((InternalEObject)newTwFAM2Sh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5, null, msgs);
      msgs = basicSetTwFAM2Sh5(newTwFAM2Sh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5, newTwFAM2Sh5, newTwFAM2Sh5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh6 getTwFAM2Sh6()
  {
    return twFAM2Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFAM2Sh6(nTwFAM2Sh6 newTwFAM2Sh6, NotificationChain msgs)
  {
    nTwFAM2Sh6 oldTwFAM2Sh6 = twFAM2Sh6;
    twFAM2Sh6 = newTwFAM2Sh6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6, oldTwFAM2Sh6, newTwFAM2Sh6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFAM2Sh6(nTwFAM2Sh6 newTwFAM2Sh6)
  {
    if (newTwFAM2Sh6 != twFAM2Sh6)
    {
      NotificationChain msgs = null;
      if (twFAM2Sh6 != null)
        msgs = ((InternalEObject)twFAM2Sh6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6, null, msgs);
      if (newTwFAM2Sh6 != null)
        msgs = ((InternalEObject)newTwFAM2Sh6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6, null, msgs);
      msgs = basicSetTwFAM2Sh6(newTwFAM2Sh6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6, newTwFAM2Sh6, newTwFAM2Sh6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh2 getTwSSM1Sh2()
  {
    return twSSM1Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM1Sh2(nTwSSM1Sh2 newTwSSM1Sh2, NotificationChain msgs)
  {
    nTwSSM1Sh2 oldTwSSM1Sh2 = twSSM1Sh2;
    twSSM1Sh2 = newTwSSM1Sh2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2, oldTwSSM1Sh2, newTwSSM1Sh2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM1Sh2(nTwSSM1Sh2 newTwSSM1Sh2)
  {
    if (newTwSSM1Sh2 != twSSM1Sh2)
    {
      NotificationChain msgs = null;
      if (twSSM1Sh2 != null)
        msgs = ((InternalEObject)twSSM1Sh2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2, null, msgs);
      if (newTwSSM1Sh2 != null)
        msgs = ((InternalEObject)newTwSSM1Sh2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2, null, msgs);
      msgs = basicSetTwSSM1Sh2(newTwSSM1Sh2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2, newTwSSM1Sh2, newTwSSM1Sh2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh3 getTwSSM1Sh3()
  {
    return twSSM1Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM1Sh3(nTwSSM1Sh3 newTwSSM1Sh3, NotificationChain msgs)
  {
    nTwSSM1Sh3 oldTwSSM1Sh3 = twSSM1Sh3;
    twSSM1Sh3 = newTwSSM1Sh3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3, oldTwSSM1Sh3, newTwSSM1Sh3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM1Sh3(nTwSSM1Sh3 newTwSSM1Sh3)
  {
    if (newTwSSM1Sh3 != twSSM1Sh3)
    {
      NotificationChain msgs = null;
      if (twSSM1Sh3 != null)
        msgs = ((InternalEObject)twSSM1Sh3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3, null, msgs);
      if (newTwSSM1Sh3 != null)
        msgs = ((InternalEObject)newTwSSM1Sh3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3, null, msgs);
      msgs = basicSetTwSSM1Sh3(newTwSSM1Sh3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3, newTwSSM1Sh3, newTwSSM1Sh3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh4 getTwSSM1Sh4()
  {
    return twSSM1Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM1Sh4(nTwSSM1Sh4 newTwSSM1Sh4, NotificationChain msgs)
  {
    nTwSSM1Sh4 oldTwSSM1Sh4 = twSSM1Sh4;
    twSSM1Sh4 = newTwSSM1Sh4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4, oldTwSSM1Sh4, newTwSSM1Sh4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM1Sh4(nTwSSM1Sh4 newTwSSM1Sh4)
  {
    if (newTwSSM1Sh4 != twSSM1Sh4)
    {
      NotificationChain msgs = null;
      if (twSSM1Sh4 != null)
        msgs = ((InternalEObject)twSSM1Sh4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4, null, msgs);
      if (newTwSSM1Sh4 != null)
        msgs = ((InternalEObject)newTwSSM1Sh4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4, null, msgs);
      msgs = basicSetTwSSM1Sh4(newTwSSM1Sh4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4, newTwSSM1Sh4, newTwSSM1Sh4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh5 getTwSSM1Sh5()
  {
    return twSSM1Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM1Sh5(nTwSSM1Sh5 newTwSSM1Sh5, NotificationChain msgs)
  {
    nTwSSM1Sh5 oldTwSSM1Sh5 = twSSM1Sh5;
    twSSM1Sh5 = newTwSSM1Sh5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5, oldTwSSM1Sh5, newTwSSM1Sh5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM1Sh5(nTwSSM1Sh5 newTwSSM1Sh5)
  {
    if (newTwSSM1Sh5 != twSSM1Sh5)
    {
      NotificationChain msgs = null;
      if (twSSM1Sh5 != null)
        msgs = ((InternalEObject)twSSM1Sh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5, null, msgs);
      if (newTwSSM1Sh5 != null)
        msgs = ((InternalEObject)newTwSSM1Sh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5, null, msgs);
      msgs = basicSetTwSSM1Sh5(newTwSSM1Sh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5, newTwSSM1Sh5, newTwSSM1Sh5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh6 getTwSSM1Sh6()
  {
    return twSSM1Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM1Sh6(nTwSSM1Sh6 newTwSSM1Sh6, NotificationChain msgs)
  {
    nTwSSM1Sh6 oldTwSSM1Sh6 = twSSM1Sh6;
    twSSM1Sh6 = newTwSSM1Sh6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6, oldTwSSM1Sh6, newTwSSM1Sh6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM1Sh6(nTwSSM1Sh6 newTwSSM1Sh6)
  {
    if (newTwSSM1Sh6 != twSSM1Sh6)
    {
      NotificationChain msgs = null;
      if (twSSM1Sh6 != null)
        msgs = ((InternalEObject)twSSM1Sh6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6, null, msgs);
      if (newTwSSM1Sh6 != null)
        msgs = ((InternalEObject)newTwSSM1Sh6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6, null, msgs);
      msgs = basicSetTwSSM1Sh6(newTwSSM1Sh6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6, newTwSSM1Sh6, newTwSSM1Sh6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh2 getTwSSM2Sh2()
  {
    return twSSM2Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM2Sh2(nTwSSM2Sh2 newTwSSM2Sh2, NotificationChain msgs)
  {
    nTwSSM2Sh2 oldTwSSM2Sh2 = twSSM2Sh2;
    twSSM2Sh2 = newTwSSM2Sh2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2, oldTwSSM2Sh2, newTwSSM2Sh2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM2Sh2(nTwSSM2Sh2 newTwSSM2Sh2)
  {
    if (newTwSSM2Sh2 != twSSM2Sh2)
    {
      NotificationChain msgs = null;
      if (twSSM2Sh2 != null)
        msgs = ((InternalEObject)twSSM2Sh2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2, null, msgs);
      if (newTwSSM2Sh2 != null)
        msgs = ((InternalEObject)newTwSSM2Sh2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2, null, msgs);
      msgs = basicSetTwSSM2Sh2(newTwSSM2Sh2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2, newTwSSM2Sh2, newTwSSM2Sh2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh3 getTwSSM2Sh3()
  {
    return twSSM2Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM2Sh3(nTwSSM2Sh3 newTwSSM2Sh3, NotificationChain msgs)
  {
    nTwSSM2Sh3 oldTwSSM2Sh3 = twSSM2Sh3;
    twSSM2Sh3 = newTwSSM2Sh3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3, oldTwSSM2Sh3, newTwSSM2Sh3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM2Sh3(nTwSSM2Sh3 newTwSSM2Sh3)
  {
    if (newTwSSM2Sh3 != twSSM2Sh3)
    {
      NotificationChain msgs = null;
      if (twSSM2Sh3 != null)
        msgs = ((InternalEObject)twSSM2Sh3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3, null, msgs);
      if (newTwSSM2Sh3 != null)
        msgs = ((InternalEObject)newTwSSM2Sh3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3, null, msgs);
      msgs = basicSetTwSSM2Sh3(newTwSSM2Sh3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3, newTwSSM2Sh3, newTwSSM2Sh3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh4 getTwSSM2Sh4()
  {
    return twSSM2Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM2Sh4(nTwSSM2Sh4 newTwSSM2Sh4, NotificationChain msgs)
  {
    nTwSSM2Sh4 oldTwSSM2Sh4 = twSSM2Sh4;
    twSSM2Sh4 = newTwSSM2Sh4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4, oldTwSSM2Sh4, newTwSSM2Sh4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM2Sh4(nTwSSM2Sh4 newTwSSM2Sh4)
  {
    if (newTwSSM2Sh4 != twSSM2Sh4)
    {
      NotificationChain msgs = null;
      if (twSSM2Sh4 != null)
        msgs = ((InternalEObject)twSSM2Sh4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4, null, msgs);
      if (newTwSSM2Sh4 != null)
        msgs = ((InternalEObject)newTwSSM2Sh4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4, null, msgs);
      msgs = basicSetTwSSM2Sh4(newTwSSM2Sh4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4, newTwSSM2Sh4, newTwSSM2Sh4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh5 getTwSSM2Sh5()
  {
    return twSSM2Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM2Sh5(nTwSSM2Sh5 newTwSSM2Sh5, NotificationChain msgs)
  {
    nTwSSM2Sh5 oldTwSSM2Sh5 = twSSM2Sh5;
    twSSM2Sh5 = newTwSSM2Sh5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5, oldTwSSM2Sh5, newTwSSM2Sh5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM2Sh5(nTwSSM2Sh5 newTwSSM2Sh5)
  {
    if (newTwSSM2Sh5 != twSSM2Sh5)
    {
      NotificationChain msgs = null;
      if (twSSM2Sh5 != null)
        msgs = ((InternalEObject)twSSM2Sh5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5, null, msgs);
      if (newTwSSM2Sh5 != null)
        msgs = ((InternalEObject)newTwSSM2Sh5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5, null, msgs);
      msgs = basicSetTwSSM2Sh5(newTwSSM2Sh5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5, newTwSSM2Sh5, newTwSSM2Sh5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh6 getTwSSM2Sh6()
  {
    return twSSM2Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSM2Sh6(nTwSSM2Sh6 newTwSSM2Sh6, NotificationChain msgs)
  {
    nTwSSM2Sh6 oldTwSSM2Sh6 = twSSM2Sh6;
    twSSM2Sh6 = newTwSSM2Sh6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6, oldTwSSM2Sh6, newTwSSM2Sh6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSM2Sh6(nTwSSM2Sh6 newTwSSM2Sh6)
  {
    if (newTwSSM2Sh6 != twSSM2Sh6)
    {
      NotificationChain msgs = null;
      if (twSSM2Sh6 != null)
        msgs = ((InternalEObject)twSSM2Sh6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6, null, msgs);
      if (newTwSSM2Sh6 != null)
        msgs = ((InternalEObject)newTwSSM2Sh6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6, null, msgs);
      msgs = basicSetTwSSM2Sh6(newTwSSM2Sh6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6, newTwSSM2Sh6, newTwSSM2Sh6));
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
      case FasttwrPackage.MODEL_FASTTWR__HEAD:
        return basicSetHead(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
      case FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST:
        return basicSetNTwInpSt(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__CALC_TMODE:
        return basicSetCalcTMode(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1:
        return basicSetBldFlDmp1(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2:
        return basicSetBldFlDmp2(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1:
        return basicSetBldEdDmp1(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2:
        return basicSetBldEdDmp2(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1:
        return basicSetFAStTunr1(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2:
        return basicSetFAStTunr2(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1:
        return basicSetSSStTunr1(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2:
        return basicSetSSStTunr2(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA:
        return basicSetAdjTwMa(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST:
        return basicSetAdjFASt(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST:
        return basicSetAdjSSSt(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TWR_STAT:
        return basicSetTwrStat(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2:
        return basicSetTwFAM1Sh2(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3:
        return basicSetTwFAM1Sh3(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4:
        return basicSetTwFAM1Sh4(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5:
        return basicSetTwFAM1Sh5(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6:
        return basicSetTwFAM1Sh6(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2:
        return basicSetTwFAM2Sh2(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3:
        return basicSetTwFAM2Sh3(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4:
        return basicSetTwFAM2Sh4(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5:
        return basicSetTwFAM2Sh5(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6:
        return basicSetTwFAM2Sh6(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2:
        return basicSetTwSSM1Sh2(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3:
        return basicSetTwSSM1Sh3(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4:
        return basicSetTwSSM1Sh4(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5:
        return basicSetTwSSM1Sh5(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6:
        return basicSetTwSSM1Sh6(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2:
        return basicSetTwSSM2Sh2(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3:
        return basicSetTwSSM2Sh3(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4:
        return basicSetTwSSM2Sh4(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5:
        return basicSetTwSSM2Sh5(null, msgs);
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6:
        return basicSetTwSSM2Sh6(null, msgs);
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
      case FasttwrPackage.MODEL_FASTTWR__HEAD:
        return getHead();
      case FasttwrPackage.MODEL_FASTTWR__SECTIONS:
        return getSections();
      case FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST:
        return getNTwInpSt();
      case FasttwrPackage.MODEL_FASTTWR__CALC_TMODE:
        return getCalcTMode();
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1:
        return getBldFlDmp1();
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2:
        return getBldFlDmp2();
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1:
        return getBldEdDmp1();
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2:
        return getBldEdDmp2();
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1:
        return getFAStTunr1();
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2:
        return getFAStTunr2();
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1:
        return getSSStTunr1();
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2:
        return getSSStTunr2();
      case FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA:
        return getAdjTwMa();
      case FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST:
        return getAdjFASt();
      case FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST:
        return getAdjSSSt();
      case FasttwrPackage.MODEL_FASTTWR__TWR_STAT:
        return getTwrStat();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2:
        return getTwFAM1Sh2();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3:
        return getTwFAM1Sh3();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4:
        return getTwFAM1Sh4();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5:
        return getTwFAM1Sh5();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6:
        return getTwFAM1Sh6();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2:
        return getTwFAM2Sh2();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3:
        return getTwFAM2Sh3();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4:
        return getTwFAM2Sh4();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5:
        return getTwFAM2Sh5();
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6:
        return getTwFAM2Sh6();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2:
        return getTwSSM1Sh2();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3:
        return getTwSSM1Sh3();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4:
        return getTwSSM1Sh4();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5:
        return getTwSSM1Sh5();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6:
        return getTwSSM1Sh6();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2:
        return getTwSSM2Sh2();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3:
        return getTwSSM2Sh3();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4:
        return getTwSSM2Sh4();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5:
        return getTwSSM2Sh5();
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6:
        return getTwSSM2Sh6();
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
      case FasttwrPackage.MODEL_FASTTWR__HEAD:
        setHead((Header)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST:
        setNTwInpSt((nNTwInpSt)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__CALC_TMODE:
        setCalcTMode((bCalcTMode)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1:
        setBldFlDmp1((nTwrFADmp1)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2:
        setBldFlDmp2((nTwrFADmp2)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1:
        setBldEdDmp1((nTwrSSDmp1)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2:
        setBldEdDmp2((nTwrSSDmp2)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1:
        setFAStTunr1((nFAStTunr1)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2:
        setFAStTunr2((nFAStTunr2)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1:
        setSSStTunr1((nSSStTunr1)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2:
        setSSStTunr2((nSSStTunr2)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA:
        setAdjTwMa((AdjTwMa)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST:
        setAdjFASt((AdjFASt)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST:
        setAdjSSSt((AdjSSSt)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TWR_STAT:
        setTwrStat((aTwrStat)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2:
        setTwFAM1Sh2((nTwFAM1Sh2)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3:
        setTwFAM1Sh3((nTwFAM1Sh3)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4:
        setTwFAM1Sh4((nTwFAM1Sh4)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5:
        setTwFAM1Sh5((nTwFAM1Sh5)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6:
        setTwFAM1Sh6((nTwFAM1Sh6)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2:
        setTwFAM2Sh2((nTwFAM2Sh2)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3:
        setTwFAM2Sh3((nTwFAM2Sh3)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4:
        setTwFAM2Sh4((nTwFAM2Sh4)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5:
        setTwFAM2Sh5((nTwFAM2Sh5)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6:
        setTwFAM2Sh6((nTwFAM2Sh6)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2:
        setTwSSM1Sh2((nTwSSM1Sh2)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3:
        setTwSSM1Sh3((nTwSSM1Sh3)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4:
        setTwSSM1Sh4((nTwSSM1Sh4)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5:
        setTwSSM1Sh5((nTwSSM1Sh5)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6:
        setTwSSM1Sh6((nTwSSM1Sh6)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2:
        setTwSSM2Sh2((nTwSSM2Sh2)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3:
        setTwSSM2Sh3((nTwSSM2Sh3)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4:
        setTwSSM2Sh4((nTwSSM2Sh4)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5:
        setTwSSM2Sh5((nTwSSM2Sh5)newValue);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6:
        setTwSSM2Sh6((nTwSSM2Sh6)newValue);
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
      case FasttwrPackage.MODEL_FASTTWR__HEAD:
        setHead((Header)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__SECTIONS:
        getSections().clear();
        return;
      case FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST:
        setNTwInpSt((nNTwInpSt)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__CALC_TMODE:
        setCalcTMode((bCalcTMode)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1:
        setBldFlDmp1((nTwrFADmp1)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2:
        setBldFlDmp2((nTwrFADmp2)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1:
        setBldEdDmp1((nTwrSSDmp1)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2:
        setBldEdDmp2((nTwrSSDmp2)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1:
        setFAStTunr1((nFAStTunr1)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2:
        setFAStTunr2((nFAStTunr2)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1:
        setSSStTunr1((nSSStTunr1)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2:
        setSSStTunr2((nSSStTunr2)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA:
        setAdjTwMa((AdjTwMa)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST:
        setAdjFASt((AdjFASt)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST:
        setAdjSSSt((AdjSSSt)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TWR_STAT:
        setTwrStat((aTwrStat)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2:
        setTwFAM1Sh2((nTwFAM1Sh2)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3:
        setTwFAM1Sh3((nTwFAM1Sh3)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4:
        setTwFAM1Sh4((nTwFAM1Sh4)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5:
        setTwFAM1Sh5((nTwFAM1Sh5)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6:
        setTwFAM1Sh6((nTwFAM1Sh6)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2:
        setTwFAM2Sh2((nTwFAM2Sh2)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3:
        setTwFAM2Sh3((nTwFAM2Sh3)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4:
        setTwFAM2Sh4((nTwFAM2Sh4)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5:
        setTwFAM2Sh5((nTwFAM2Sh5)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6:
        setTwFAM2Sh6((nTwFAM2Sh6)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2:
        setTwSSM1Sh2((nTwSSM1Sh2)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3:
        setTwSSM1Sh3((nTwSSM1Sh3)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4:
        setTwSSM1Sh4((nTwSSM1Sh4)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5:
        setTwSSM1Sh5((nTwSSM1Sh5)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6:
        setTwSSM1Sh6((nTwSSM1Sh6)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2:
        setTwSSM2Sh2((nTwSSM2Sh2)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3:
        setTwSSM2Sh3((nTwSSM2Sh3)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4:
        setTwSSM2Sh4((nTwSSM2Sh4)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5:
        setTwSSM2Sh5((nTwSSM2Sh5)null);
        return;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6:
        setTwSSM2Sh6((nTwSSM2Sh6)null);
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
      case FasttwrPackage.MODEL_FASTTWR__HEAD:
        return head != null;
      case FasttwrPackage.MODEL_FASTTWR__SECTIONS:
        return sections != null && !sections.isEmpty();
      case FasttwrPackage.MODEL_FASTTWR__NTW_INP_ST:
        return nTwInpSt != null;
      case FasttwrPackage.MODEL_FASTTWR__CALC_TMODE:
        return calcTMode != null;
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP1:
        return bldFlDmp1 != null;
      case FasttwrPackage.MODEL_FASTTWR__BLD_FL_DMP2:
        return bldFlDmp2 != null;
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP1:
        return bldEdDmp1 != null;
      case FasttwrPackage.MODEL_FASTTWR__BLD_ED_DMP2:
        return bldEdDmp2 != null;
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR1:
        return faStTunr1 != null;
      case FasttwrPackage.MODEL_FASTTWR__FA_ST_TUNR2:
        return faStTunr2 != null;
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR1:
        return ssStTunr1 != null;
      case FasttwrPackage.MODEL_FASTTWR__SS_ST_TUNR2:
        return ssStTunr2 != null;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_TW_MA:
        return adjTwMa != null;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_FA_ST:
        return adjFASt != null;
      case FasttwrPackage.MODEL_FASTTWR__ADJ_SS_ST:
        return adjSSSt != null;
      case FasttwrPackage.MODEL_FASTTWR__TWR_STAT:
        return twrStat != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH2:
        return twFAM1Sh2 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH3:
        return twFAM1Sh3 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH4:
        return twFAM1Sh4 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH5:
        return twFAM1Sh5 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM1_SH6:
        return twFAM1Sh6 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH2:
        return twFAM2Sh2 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH3:
        return twFAM2Sh3 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH4:
        return twFAM2Sh4 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH5:
        return twFAM2Sh5 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_FAM2_SH6:
        return twFAM2Sh6 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH2:
        return twSSM1Sh2 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH3:
        return twSSM1Sh3 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH4:
        return twSSM1Sh4 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH5:
        return twSSM1Sh5 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM1_SH6:
        return twSSM1Sh6 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH2:
        return twSSM2Sh2 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH3:
        return twSSM2Sh3 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH4:
        return twSSM2Sh4 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH5:
        return twSSM2Sh5 != null;
      case FasttwrPackage.MODEL_FASTTWR__TW_SSM2_SH6:
        return twSSM2Sh6 != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelFasttwrImpl
