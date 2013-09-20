/**
 */
package sc.ndt.editor.iecwind.iecwindiec.impl;

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

import sc.ndt.editor.iecwind.iecwindiec.Header;
import sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage;
import sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec;
import sc.ndt.editor.iecwind.iecwindiec.Section;
import sc.ndt.editor.iecwind.iecwindiec.iIECClass;
import sc.ndt.editor.iecwind.iecwindiec.iIECStd;
import sc.ndt.editor.iecwind.iecwindiec.iStart;
import sc.ndt.editor.iecwind.iecwindiec.nHubHeight;
import sc.ndt.editor.iecwind.iecwindiec.nRotDiam;
import sc.ndt.editor.iecwind.iecwindiec.nWindIn;
import sc.ndt.editor.iecwind.iecwindiec.nWindNom;
import sc.ndt.editor.iecwind.iecwindiec.nWindOut;
import sc.ndt.editor.iecwind.iecwindiec.nWindSlope;
import sc.ndt.editor.iecwind.iecwindiec.sWindTurb;
import sc.ndt.editor.iecwind.iecwindiec.siUnits;
import sc.ndt.editor.iecwind.iecwindiec.vOutList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Iecwindiec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getSIUnits <em>SI Units</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getStart <em>Start</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getIECClass <em>IEC Class</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getWindTurb <em>Wind Turb</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getWindSlope <em>Wind Slope</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getIECStandard <em>IEC Standard</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getHubHeight <em>Hub Height</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getRotDiam <em>Rot Diam</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getWindIn <em>Wind In</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getWindNom <em>Wind Nom</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getWindOut <em>Wind Out</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl#getOutList <em>Out List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelIecwindiecImpl extends MinimalEObjectImpl.Container implements ModelIecwindiec
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
   * The cached value of the '{@link #getSIUnits() <em>SI Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSIUnits()
   * @generated
   * @ordered
   */
  protected siUnits siUnits;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected iStart start;

  /**
   * The cached value of the '{@link #getIECClass() <em>IEC Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIECClass()
   * @generated
   * @ordered
   */
  protected iIECClass iecClass;

  /**
   * The cached value of the '{@link #getWindTurb() <em>Wind Turb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindTurb()
   * @generated
   * @ordered
   */
  protected sWindTurb windTurb;

  /**
   * The cached value of the '{@link #getWindSlope() <em>Wind Slope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindSlope()
   * @generated
   * @ordered
   */
  protected nWindSlope windSlope;

  /**
   * The cached value of the '{@link #getIECStandard() <em>IEC Standard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIECStandard()
   * @generated
   * @ordered
   */
  protected iIECStd iecStandard;

  /**
   * The cached value of the '{@link #getHubHeight() <em>Hub Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubHeight()
   * @generated
   * @ordered
   */
  protected nHubHeight hubHeight;

  /**
   * The cached value of the '{@link #getRotDiam() <em>Rot Diam</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotDiam()
   * @generated
   * @ordered
   */
  protected nRotDiam rotDiam;

  /**
   * The cached value of the '{@link #getWindIn() <em>Wind In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindIn()
   * @generated
   * @ordered
   */
  protected nWindIn windIn;

  /**
   * The cached value of the '{@link #getWindNom() <em>Wind Nom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindNom()
   * @generated
   * @ordered
   */
  protected nWindNom windNom;

  /**
   * The cached value of the '{@link #getWindOut() <em>Wind Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindOut()
   * @generated
   * @ordered
   */
  protected nWindOut windOut;

  /**
   * The cached value of the '{@link #getOutList() <em>Out List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutList()
   * @generated
   * @ordered
   */
  protected vOutList outList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelIecwindiecImpl()
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
    return IecwindiecPackage.Literals.MODEL_IECWINDIEC;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__HEAD, oldHead, newHead);
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
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__HEAD, newHead, newHead));
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
      sections = new EObjectContainmentEList<Section>(Section.class, this, IecwindiecPackage.MODEL_IECWINDIEC__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public siUnits getSIUnits()
  {
    return siUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSIUnits(siUnits newSIUnits, NotificationChain msgs)
  {
    siUnits oldSIUnits = siUnits;
    siUnits = newSIUnits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS, oldSIUnits, newSIUnits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSIUnits(siUnits newSIUnits)
  {
    if (newSIUnits != siUnits)
    {
      NotificationChain msgs = null;
      if (siUnits != null)
        msgs = ((InternalEObject)siUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS, null, msgs);
      if (newSIUnits != null)
        msgs = ((InternalEObject)newSIUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS, null, msgs);
      msgs = basicSetSIUnits(newSIUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS, newSIUnits, newSIUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iStart getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(iStart newStart, NotificationChain msgs)
  {
    iStart oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(iStart newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iIECClass getIECClass()
  {
    return iecClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIECClass(iIECClass newIECClass, NotificationChain msgs)
  {
    iIECClass oldIECClass = iecClass;
    iecClass = newIECClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS, oldIECClass, newIECClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIECClass(iIECClass newIECClass)
  {
    if (newIECClass != iecClass)
    {
      NotificationChain msgs = null;
      if (iecClass != null)
        msgs = ((InternalEObject)iecClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS, null, msgs);
      if (newIECClass != null)
        msgs = ((InternalEObject)newIECClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS, null, msgs);
      msgs = basicSetIECClass(newIECClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS, newIECClass, newIECClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sWindTurb getWindTurb()
  {
    return windTurb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWindTurb(sWindTurb newWindTurb, NotificationChain msgs)
  {
    sWindTurb oldWindTurb = windTurb;
    windTurb = newWindTurb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB, oldWindTurb, newWindTurb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindTurb(sWindTurb newWindTurb)
  {
    if (newWindTurb != windTurb)
    {
      NotificationChain msgs = null;
      if (windTurb != null)
        msgs = ((InternalEObject)windTurb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB, null, msgs);
      if (newWindTurb != null)
        msgs = ((InternalEObject)newWindTurb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB, null, msgs);
      msgs = basicSetWindTurb(newWindTurb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB, newWindTurb, newWindTurb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nWindSlope getWindSlope()
  {
    return windSlope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWindSlope(nWindSlope newWindSlope, NotificationChain msgs)
  {
    nWindSlope oldWindSlope = windSlope;
    windSlope = newWindSlope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE, oldWindSlope, newWindSlope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindSlope(nWindSlope newWindSlope)
  {
    if (newWindSlope != windSlope)
    {
      NotificationChain msgs = null;
      if (windSlope != null)
        msgs = ((InternalEObject)windSlope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE, null, msgs);
      if (newWindSlope != null)
        msgs = ((InternalEObject)newWindSlope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE, null, msgs);
      msgs = basicSetWindSlope(newWindSlope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE, newWindSlope, newWindSlope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iIECStd getIECStandard()
  {
    return iecStandard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIECStandard(iIECStd newIECStandard, NotificationChain msgs)
  {
    iIECStd oldIECStandard = iecStandard;
    iecStandard = newIECStandard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD, oldIECStandard, newIECStandard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIECStandard(iIECStd newIECStandard)
  {
    if (newIECStandard != iecStandard)
    {
      NotificationChain msgs = null;
      if (iecStandard != null)
        msgs = ((InternalEObject)iecStandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD, null, msgs);
      if (newIECStandard != null)
        msgs = ((InternalEObject)newIECStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD, null, msgs);
      msgs = basicSetIECStandard(newIECStandard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD, newIECStandard, newIECStandard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubHeight getHubHeight()
  {
    return hubHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHubHeight(nHubHeight newHubHeight, NotificationChain msgs)
  {
    nHubHeight oldHubHeight = hubHeight;
    hubHeight = newHubHeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT, oldHubHeight, newHubHeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHubHeight(nHubHeight newHubHeight)
  {
    if (newHubHeight != hubHeight)
    {
      NotificationChain msgs = null;
      if (hubHeight != null)
        msgs = ((InternalEObject)hubHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT, null, msgs);
      if (newHubHeight != null)
        msgs = ((InternalEObject)newHubHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT, null, msgs);
      msgs = basicSetHubHeight(newHubHeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT, newHubHeight, newHubHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRotDiam getRotDiam()
  {
    return rotDiam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRotDiam(nRotDiam newRotDiam, NotificationChain msgs)
  {
    nRotDiam oldRotDiam = rotDiam;
    rotDiam = newRotDiam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM, oldRotDiam, newRotDiam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotDiam(nRotDiam newRotDiam)
  {
    if (newRotDiam != rotDiam)
    {
      NotificationChain msgs = null;
      if (rotDiam != null)
        msgs = ((InternalEObject)rotDiam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM, null, msgs);
      if (newRotDiam != null)
        msgs = ((InternalEObject)newRotDiam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM, null, msgs);
      msgs = basicSetRotDiam(newRotDiam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM, newRotDiam, newRotDiam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nWindIn getWindIn()
  {
    return windIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWindIn(nWindIn newWindIn, NotificationChain msgs)
  {
    nWindIn oldWindIn = windIn;
    windIn = newWindIn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN, oldWindIn, newWindIn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindIn(nWindIn newWindIn)
  {
    if (newWindIn != windIn)
    {
      NotificationChain msgs = null;
      if (windIn != null)
        msgs = ((InternalEObject)windIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN, null, msgs);
      if (newWindIn != null)
        msgs = ((InternalEObject)newWindIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN, null, msgs);
      msgs = basicSetWindIn(newWindIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN, newWindIn, newWindIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nWindNom getWindNom()
  {
    return windNom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWindNom(nWindNom newWindNom, NotificationChain msgs)
  {
    nWindNom oldWindNom = windNom;
    windNom = newWindNom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM, oldWindNom, newWindNom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindNom(nWindNom newWindNom)
  {
    if (newWindNom != windNom)
    {
      NotificationChain msgs = null;
      if (windNom != null)
        msgs = ((InternalEObject)windNom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM, null, msgs);
      if (newWindNom != null)
        msgs = ((InternalEObject)newWindNom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM, null, msgs);
      msgs = basicSetWindNom(newWindNom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM, newWindNom, newWindNom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nWindOut getWindOut()
  {
    return windOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWindOut(nWindOut newWindOut, NotificationChain msgs)
  {
    nWindOut oldWindOut = windOut;
    windOut = newWindOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT, oldWindOut, newWindOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindOut(nWindOut newWindOut)
  {
    if (newWindOut != windOut)
    {
      NotificationChain msgs = null;
      if (windOut != null)
        msgs = ((InternalEObject)windOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT, null, msgs);
      if (newWindOut != null)
        msgs = ((InternalEObject)newWindOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT, null, msgs);
      msgs = basicSetWindOut(newWindOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT, newWindOut, newWindOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vOutList getOutList()
  {
    return outList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutList(vOutList newOutList, NotificationChain msgs)
  {
    vOutList oldOutList = outList;
    outList = newOutList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST, oldOutList, newOutList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutList(vOutList newOutList)
  {
    if (newOutList != outList)
    {
      NotificationChain msgs = null;
      if (outList != null)
        msgs = ((InternalEObject)outList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST, null, msgs);
      if (newOutList != null)
        msgs = ((InternalEObject)newOutList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST, null, msgs);
      msgs = basicSetOutList(newOutList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST, newOutList, newOutList));
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
      case IecwindiecPackage.MODEL_IECWINDIEC__HEAD:
        return basicSetHead(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS:
        return basicSetSIUnits(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__START:
        return basicSetStart(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS:
        return basicSetIECClass(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB:
        return basicSetWindTurb(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE:
        return basicSetWindSlope(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD:
        return basicSetIECStandard(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT:
        return basicSetHubHeight(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM:
        return basicSetRotDiam(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN:
        return basicSetWindIn(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM:
        return basicSetWindNom(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT:
        return basicSetWindOut(null, msgs);
      case IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST:
        return basicSetOutList(null, msgs);
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
      case IecwindiecPackage.MODEL_IECWINDIEC__HEAD:
        return getHead();
      case IecwindiecPackage.MODEL_IECWINDIEC__SECTIONS:
        return getSections();
      case IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS:
        return getSIUnits();
      case IecwindiecPackage.MODEL_IECWINDIEC__START:
        return getStart();
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS:
        return getIECClass();
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB:
        return getWindTurb();
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE:
        return getWindSlope();
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD:
        return getIECStandard();
      case IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT:
        return getHubHeight();
      case IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM:
        return getRotDiam();
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN:
        return getWindIn();
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM:
        return getWindNom();
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT:
        return getWindOut();
      case IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST:
        return getOutList();
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
      case IecwindiecPackage.MODEL_IECWINDIEC__HEAD:
        setHead((Header)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS:
        setSIUnits((siUnits)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__START:
        setStart((iStart)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS:
        setIECClass((iIECClass)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB:
        setWindTurb((sWindTurb)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE:
        setWindSlope((nWindSlope)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD:
        setIECStandard((iIECStd)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT:
        setHubHeight((nHubHeight)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM:
        setRotDiam((nRotDiam)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN:
        setWindIn((nWindIn)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM:
        setWindNom((nWindNom)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT:
        setWindOut((nWindOut)newValue);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST:
        setOutList((vOutList)newValue);
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
      case IecwindiecPackage.MODEL_IECWINDIEC__HEAD:
        setHead((Header)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__SECTIONS:
        getSections().clear();
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS:
        setSIUnits((siUnits)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__START:
        setStart((iStart)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS:
        setIECClass((iIECClass)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB:
        setWindTurb((sWindTurb)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE:
        setWindSlope((nWindSlope)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD:
        setIECStandard((iIECStd)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT:
        setHubHeight((nHubHeight)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM:
        setRotDiam((nRotDiam)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN:
        setWindIn((nWindIn)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM:
        setWindNom((nWindNom)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT:
        setWindOut((nWindOut)null);
        return;
      case IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST:
        setOutList((vOutList)null);
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
      case IecwindiecPackage.MODEL_IECWINDIEC__HEAD:
        return head != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__SECTIONS:
        return sections != null && !sections.isEmpty();
      case IecwindiecPackage.MODEL_IECWINDIEC__SI_UNITS:
        return siUnits != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__START:
        return start != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_CLASS:
        return iecClass != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_TURB:
        return windTurb != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_SLOPE:
        return windSlope != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__IEC_STANDARD:
        return iecStandard != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__HUB_HEIGHT:
        return hubHeight != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__ROT_DIAM:
        return rotDiam != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_IN:
        return windIn != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_NOM:
        return windNom != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__WIND_OUT:
        return windOut != null;
      case IecwindiecPackage.MODEL_IECWINDIEC__OUT_LIST:
        return outList != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelIecwindiecImpl
