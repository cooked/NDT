/**
 */
package sc.ndt.editor.fast.fastadn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sc.ndt.editor.fast.fastadn.FastadnPackage;
import sc.ndt.editor.fast.fastadn.Header;
import sc.ndt.editor.fast.fastadn.ModelFastadn;
import sc.ndt.editor.fast.fastadn.aAirStat;
import sc.ndt.editor.fast.fastadn.aFoilNm;
import sc.ndt.editor.fast.fastadn.iBldNodes;
import sc.ndt.editor.fast.fastadn.iNumFoil;
import sc.ndt.editor.fast.fastadn.nAtoler;
import sc.ndt.editor.fast.fastadn.nDTAero;
import sc.ndt.editor.fast.fastadn.nHH;
import sc.ndt.editor.fast.fastadn.nKinVisc;
import sc.ndt.editor.fast.fastadn.nRho;
import sc.ndt.editor.fast.fastadn.nShadHWid;
import sc.ndt.editor.fast.fastadn.nTShadRefPt;
import sc.ndt.editor.fast.fastadn.nTwrShad;
import sc.ndt.editor.fast.fastadn.sHLModel;
import sc.ndt.editor.fast.fastadn.sIndModel;
import sc.ndt.editor.fast.fastadn.sInfModel;
import sc.ndt.editor.fast.fastadn.sStallMod;
import sc.ndt.editor.fast.fastadn.sTLModel;
import sc.ndt.editor.fast.fastadn.sUnits;
import sc.ndt.editor.fast.fastadn.sUseCm;
import sc.ndt.editor.fast.fastadn.sWindFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Fastadn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getSIUnits <em>SI Units</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getStallMod <em>Stall Mod</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getUseCm <em>Use Cm</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getInfModel <em>Inf Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getIndModel <em>Ind Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getAtoler <em>Atoler</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getTLModel <em>TL Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getHLModel <em>HL Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getWindFile <em>Wind File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getHH <em>HH</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getTwrShad <em>Twr Shad</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getShadHWid <em>Shad HWid</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getTShadRefPt <em>TShad Ref Pt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getRho <em>Rho</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getKinVisc <em>Kin Visc</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getDTAero <em>DT Aero</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getNumFoil <em>Num Foil</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getFoilNm <em>Foil Nm</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getBldNodes <em>Bld Nodes</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl#getAirStat <em>Air Stat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelFastadnImpl extends MinimalEObjectImpl.Container implements ModelFastadn
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
   * The cached value of the '{@link #getSIUnits() <em>SI Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSIUnits()
   * @generated
   * @ordered
   */
  protected sUnits siUnits;

  /**
   * The cached value of the '{@link #getStallMod() <em>Stall Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStallMod()
   * @generated
   * @ordered
   */
  protected sStallMod stallMod;

  /**
   * The cached value of the '{@link #getUseCm() <em>Use Cm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseCm()
   * @generated
   * @ordered
   */
  protected sUseCm useCm;

  /**
   * The cached value of the '{@link #getInfModel() <em>Inf Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfModel()
   * @generated
   * @ordered
   */
  protected sInfModel infModel;

  /**
   * The cached value of the '{@link #getIndModel() <em>Ind Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndModel()
   * @generated
   * @ordered
   */
  protected sIndModel indModel;

  /**
   * The cached value of the '{@link #getAtoler() <em>Atoler</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtoler()
   * @generated
   * @ordered
   */
  protected nAtoler atoler;

  /**
   * The cached value of the '{@link #getTLModel() <em>TL Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTLModel()
   * @generated
   * @ordered
   */
  protected sTLModel tlModel;

  /**
   * The cached value of the '{@link #getHLModel() <em>HL Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHLModel()
   * @generated
   * @ordered
   */
  protected sHLModel hlModel;

  /**
   * The cached value of the '{@link #getWindFile() <em>Wind File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindFile()
   * @generated
   * @ordered
   */
  protected sWindFile windFile;

  /**
   * The cached value of the '{@link #getHH() <em>HH</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHH()
   * @generated
   * @ordered
   */
  protected nHH hh;

  /**
   * The cached value of the '{@link #getTwrShad() <em>Twr Shad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrShad()
   * @generated
   * @ordered
   */
  protected nTwrShad twrShad;

  /**
   * The cached value of the '{@link #getShadHWid() <em>Shad HWid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShadHWid()
   * @generated
   * @ordered
   */
  protected nShadHWid shadHWid;

  /**
   * The cached value of the '{@link #getTShadRefPt() <em>TShad Ref Pt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTShadRefPt()
   * @generated
   * @ordered
   */
  protected nTShadRefPt tShadRefPt;

  /**
   * The cached value of the '{@link #getRho() <em>Rho</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRho()
   * @generated
   * @ordered
   */
  protected nRho rho;

  /**
   * The cached value of the '{@link #getKinVisc() <em>Kin Visc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKinVisc()
   * @generated
   * @ordered
   */
  protected nKinVisc kinVisc;

  /**
   * The cached value of the '{@link #getDTAero() <em>DT Aero</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDTAero()
   * @generated
   * @ordered
   */
  protected nDTAero dtAero;

  /**
   * The cached value of the '{@link #getNumFoil() <em>Num Foil</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumFoil()
   * @generated
   * @ordered
   */
  protected iNumFoil numFoil;

  /**
   * The cached value of the '{@link #getFoilNm() <em>Foil Nm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoilNm()
   * @generated
   * @ordered
   */
  protected aFoilNm foilNm;

  /**
   * The cached value of the '{@link #getBldNodes() <em>Bld Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldNodes()
   * @generated
   * @ordered
   */
  protected iBldNodes bldNodes;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelFastadnImpl()
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
    return FastadnPackage.Literals.MODEL_FASTADN;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__HEAD, oldHead, newHead);
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
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sUnits getSIUnits()
  {
    return siUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSIUnits(sUnits newSIUnits, NotificationChain msgs)
  {
    sUnits oldSIUnits = siUnits;
    siUnits = newSIUnits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__SI_UNITS, oldSIUnits, newSIUnits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSIUnits(sUnits newSIUnits)
  {
    if (newSIUnits != siUnits)
    {
      NotificationChain msgs = null;
      if (siUnits != null)
        msgs = ((InternalEObject)siUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__SI_UNITS, null, msgs);
      if (newSIUnits != null)
        msgs = ((InternalEObject)newSIUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__SI_UNITS, null, msgs);
      msgs = basicSetSIUnits(newSIUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__SI_UNITS, newSIUnits, newSIUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sStallMod getStallMod()
  {
    return stallMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStallMod(sStallMod newStallMod, NotificationChain msgs)
  {
    sStallMod oldStallMod = stallMod;
    stallMod = newStallMod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__STALL_MOD, oldStallMod, newStallMod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStallMod(sStallMod newStallMod)
  {
    if (newStallMod != stallMod)
    {
      NotificationChain msgs = null;
      if (stallMod != null)
        msgs = ((InternalEObject)stallMod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__STALL_MOD, null, msgs);
      if (newStallMod != null)
        msgs = ((InternalEObject)newStallMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__STALL_MOD, null, msgs);
      msgs = basicSetStallMod(newStallMod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__STALL_MOD, newStallMod, newStallMod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sUseCm getUseCm()
  {
    return useCm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUseCm(sUseCm newUseCm, NotificationChain msgs)
  {
    sUseCm oldUseCm = useCm;
    useCm = newUseCm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__USE_CM, oldUseCm, newUseCm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseCm(sUseCm newUseCm)
  {
    if (newUseCm != useCm)
    {
      NotificationChain msgs = null;
      if (useCm != null)
        msgs = ((InternalEObject)useCm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__USE_CM, null, msgs);
      if (newUseCm != null)
        msgs = ((InternalEObject)newUseCm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__USE_CM, null, msgs);
      msgs = basicSetUseCm(newUseCm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__USE_CM, newUseCm, newUseCm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sInfModel getInfModel()
  {
    return infModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfModel(sInfModel newInfModel, NotificationChain msgs)
  {
    sInfModel oldInfModel = infModel;
    infModel = newInfModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__INF_MODEL, oldInfModel, newInfModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfModel(sInfModel newInfModel)
  {
    if (newInfModel != infModel)
    {
      NotificationChain msgs = null;
      if (infModel != null)
        msgs = ((InternalEObject)infModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__INF_MODEL, null, msgs);
      if (newInfModel != null)
        msgs = ((InternalEObject)newInfModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__INF_MODEL, null, msgs);
      msgs = basicSetInfModel(newInfModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__INF_MODEL, newInfModel, newInfModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sIndModel getIndModel()
  {
    return indModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndModel(sIndModel newIndModel, NotificationChain msgs)
  {
    sIndModel oldIndModel = indModel;
    indModel = newIndModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__IND_MODEL, oldIndModel, newIndModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndModel(sIndModel newIndModel)
  {
    if (newIndModel != indModel)
    {
      NotificationChain msgs = null;
      if (indModel != null)
        msgs = ((InternalEObject)indModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__IND_MODEL, null, msgs);
      if (newIndModel != null)
        msgs = ((InternalEObject)newIndModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__IND_MODEL, null, msgs);
      msgs = basicSetIndModel(newIndModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__IND_MODEL, newIndModel, newIndModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAtoler getAtoler()
  {
    return atoler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtoler(nAtoler newAtoler, NotificationChain msgs)
  {
    nAtoler oldAtoler = atoler;
    atoler = newAtoler;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__ATOLER, oldAtoler, newAtoler);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtoler(nAtoler newAtoler)
  {
    if (newAtoler != atoler)
    {
      NotificationChain msgs = null;
      if (atoler != null)
        msgs = ((InternalEObject)atoler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__ATOLER, null, msgs);
      if (newAtoler != null)
        msgs = ((InternalEObject)newAtoler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__ATOLER, null, msgs);
      msgs = basicSetAtoler(newAtoler, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__ATOLER, newAtoler, newAtoler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sTLModel getTLModel()
  {
    return tlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTLModel(sTLModel newTLModel, NotificationChain msgs)
  {
    sTLModel oldTLModel = tlModel;
    tlModel = newTLModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__TL_MODEL, oldTLModel, newTLModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTLModel(sTLModel newTLModel)
  {
    if (newTLModel != tlModel)
    {
      NotificationChain msgs = null;
      if (tlModel != null)
        msgs = ((InternalEObject)tlModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__TL_MODEL, null, msgs);
      if (newTLModel != null)
        msgs = ((InternalEObject)newTLModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__TL_MODEL, null, msgs);
      msgs = basicSetTLModel(newTLModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__TL_MODEL, newTLModel, newTLModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sHLModel getHLModel()
  {
    return hlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHLModel(sHLModel newHLModel, NotificationChain msgs)
  {
    sHLModel oldHLModel = hlModel;
    hlModel = newHLModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__HL_MODEL, oldHLModel, newHLModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHLModel(sHLModel newHLModel)
  {
    if (newHLModel != hlModel)
    {
      NotificationChain msgs = null;
      if (hlModel != null)
        msgs = ((InternalEObject)hlModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__HL_MODEL, null, msgs);
      if (newHLModel != null)
        msgs = ((InternalEObject)newHLModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__HL_MODEL, null, msgs);
      msgs = basicSetHLModel(newHLModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__HL_MODEL, newHLModel, newHLModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sWindFile getWindFile()
  {
    return windFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWindFile(sWindFile newWindFile, NotificationChain msgs)
  {
    sWindFile oldWindFile = windFile;
    windFile = newWindFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__WIND_FILE, oldWindFile, newWindFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindFile(sWindFile newWindFile)
  {
    if (newWindFile != windFile)
    {
      NotificationChain msgs = null;
      if (windFile != null)
        msgs = ((InternalEObject)windFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__WIND_FILE, null, msgs);
      if (newWindFile != null)
        msgs = ((InternalEObject)newWindFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__WIND_FILE, null, msgs);
      msgs = basicSetWindFile(newWindFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__WIND_FILE, newWindFile, newWindFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHH getHH()
  {
    return hh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHH(nHH newHH, NotificationChain msgs)
  {
    nHH oldHH = hh;
    hh = newHH;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__HH, oldHH, newHH);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHH(nHH newHH)
  {
    if (newHH != hh)
    {
      NotificationChain msgs = null;
      if (hh != null)
        msgs = ((InternalEObject)hh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__HH, null, msgs);
      if (newHH != null)
        msgs = ((InternalEObject)newHH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__HH, null, msgs);
      msgs = basicSetHH(newHH, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__HH, newHH, newHH));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrShad getTwrShad()
  {
    return twrShad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrShad(nTwrShad newTwrShad, NotificationChain msgs)
  {
    nTwrShad oldTwrShad = twrShad;
    twrShad = newTwrShad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__TWR_SHAD, oldTwrShad, newTwrShad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrShad(nTwrShad newTwrShad)
  {
    if (newTwrShad != twrShad)
    {
      NotificationChain msgs = null;
      if (twrShad != null)
        msgs = ((InternalEObject)twrShad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__TWR_SHAD, null, msgs);
      if (newTwrShad != null)
        msgs = ((InternalEObject)newTwrShad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__TWR_SHAD, null, msgs);
      msgs = basicSetTwrShad(newTwrShad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__TWR_SHAD, newTwrShad, newTwrShad));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nShadHWid getShadHWid()
  {
    return shadHWid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShadHWid(nShadHWid newShadHWid, NotificationChain msgs)
  {
    nShadHWid oldShadHWid = shadHWid;
    shadHWid = newShadHWid;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__SHAD_HWID, oldShadHWid, newShadHWid);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShadHWid(nShadHWid newShadHWid)
  {
    if (newShadHWid != shadHWid)
    {
      NotificationChain msgs = null;
      if (shadHWid != null)
        msgs = ((InternalEObject)shadHWid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__SHAD_HWID, null, msgs);
      if (newShadHWid != null)
        msgs = ((InternalEObject)newShadHWid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__SHAD_HWID, null, msgs);
      msgs = basicSetShadHWid(newShadHWid, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__SHAD_HWID, newShadHWid, newShadHWid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTShadRefPt getTShadRefPt()
  {
    return tShadRefPt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTShadRefPt(nTShadRefPt newTShadRefPt, NotificationChain msgs)
  {
    nTShadRefPt oldTShadRefPt = tShadRefPt;
    tShadRefPt = newTShadRefPt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT, oldTShadRefPt, newTShadRefPt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTShadRefPt(nTShadRefPt newTShadRefPt)
  {
    if (newTShadRefPt != tShadRefPt)
    {
      NotificationChain msgs = null;
      if (tShadRefPt != null)
        msgs = ((InternalEObject)tShadRefPt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT, null, msgs);
      if (newTShadRefPt != null)
        msgs = ((InternalEObject)newTShadRefPt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT, null, msgs);
      msgs = basicSetTShadRefPt(newTShadRefPt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT, newTShadRefPt, newTShadRefPt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRho getRho()
  {
    return rho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRho(nRho newRho, NotificationChain msgs)
  {
    nRho oldRho = rho;
    rho = newRho;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__RHO, oldRho, newRho);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRho(nRho newRho)
  {
    if (newRho != rho)
    {
      NotificationChain msgs = null;
      if (rho != null)
        msgs = ((InternalEObject)rho).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__RHO, null, msgs);
      if (newRho != null)
        msgs = ((InternalEObject)newRho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__RHO, null, msgs);
      msgs = basicSetRho(newRho, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__RHO, newRho, newRho));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nKinVisc getKinVisc()
  {
    return kinVisc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKinVisc(nKinVisc newKinVisc, NotificationChain msgs)
  {
    nKinVisc oldKinVisc = kinVisc;
    kinVisc = newKinVisc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__KIN_VISC, oldKinVisc, newKinVisc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKinVisc(nKinVisc newKinVisc)
  {
    if (newKinVisc != kinVisc)
    {
      NotificationChain msgs = null;
      if (kinVisc != null)
        msgs = ((InternalEObject)kinVisc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__KIN_VISC, null, msgs);
      if (newKinVisc != null)
        msgs = ((InternalEObject)newKinVisc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__KIN_VISC, null, msgs);
      msgs = basicSetKinVisc(newKinVisc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__KIN_VISC, newKinVisc, newKinVisc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDTAero getDTAero()
  {
    return dtAero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDTAero(nDTAero newDTAero, NotificationChain msgs)
  {
    nDTAero oldDTAero = dtAero;
    dtAero = newDTAero;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__DT_AERO, oldDTAero, newDTAero);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDTAero(nDTAero newDTAero)
  {
    if (newDTAero != dtAero)
    {
      NotificationChain msgs = null;
      if (dtAero != null)
        msgs = ((InternalEObject)dtAero).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__DT_AERO, null, msgs);
      if (newDTAero != null)
        msgs = ((InternalEObject)newDTAero).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__DT_AERO, null, msgs);
      msgs = basicSetDTAero(newDTAero, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__DT_AERO, newDTAero, newDTAero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNumFoil getNumFoil()
  {
    return numFoil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumFoil(iNumFoil newNumFoil, NotificationChain msgs)
  {
    iNumFoil oldNumFoil = numFoil;
    numFoil = newNumFoil;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__NUM_FOIL, oldNumFoil, newNumFoil);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumFoil(iNumFoil newNumFoil)
  {
    if (newNumFoil != numFoil)
    {
      NotificationChain msgs = null;
      if (numFoil != null)
        msgs = ((InternalEObject)numFoil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__NUM_FOIL, null, msgs);
      if (newNumFoil != null)
        msgs = ((InternalEObject)newNumFoil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__NUM_FOIL, null, msgs);
      msgs = basicSetNumFoil(newNumFoil, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__NUM_FOIL, newNumFoil, newNumFoil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aFoilNm getFoilNm()
  {
    return foilNm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFoilNm(aFoilNm newFoilNm, NotificationChain msgs)
  {
    aFoilNm oldFoilNm = foilNm;
    foilNm = newFoilNm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__FOIL_NM, oldFoilNm, newFoilNm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFoilNm(aFoilNm newFoilNm)
  {
    if (newFoilNm != foilNm)
    {
      NotificationChain msgs = null;
      if (foilNm != null)
        msgs = ((InternalEObject)foilNm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__FOIL_NM, null, msgs);
      if (newFoilNm != null)
        msgs = ((InternalEObject)newFoilNm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__FOIL_NM, null, msgs);
      msgs = basicSetFoilNm(newFoilNm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__FOIL_NM, newFoilNm, newFoilNm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iBldNodes getBldNodes()
  {
    return bldNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldNodes(iBldNodes newBldNodes, NotificationChain msgs)
  {
    iBldNodes oldBldNodes = bldNodes;
    bldNodes = newBldNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__BLD_NODES, oldBldNodes, newBldNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldNodes(iBldNodes newBldNodes)
  {
    if (newBldNodes != bldNodes)
    {
      NotificationChain msgs = null;
      if (bldNodes != null)
        msgs = ((InternalEObject)bldNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__BLD_NODES, null, msgs);
      if (newBldNodes != null)
        msgs = ((InternalEObject)newBldNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__BLD_NODES, null, msgs);
      msgs = basicSetBldNodes(newBldNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__BLD_NODES, newBldNodes, newBldNodes));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__AIR_STAT, oldAirStat, newAirStat);
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
        msgs = ((InternalEObject)airStat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__AIR_STAT, null, msgs);
      if (newAirStat != null)
        msgs = ((InternalEObject)newAirStat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastadnPackage.MODEL_FASTADN__AIR_STAT, null, msgs);
      msgs = basicSetAirStat(newAirStat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastadnPackage.MODEL_FASTADN__AIR_STAT, newAirStat, newAirStat));
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
      case FastadnPackage.MODEL_FASTADN__HEAD:
        return basicSetHead(null, msgs);
      case FastadnPackage.MODEL_FASTADN__SI_UNITS:
        return basicSetSIUnits(null, msgs);
      case FastadnPackage.MODEL_FASTADN__STALL_MOD:
        return basicSetStallMod(null, msgs);
      case FastadnPackage.MODEL_FASTADN__USE_CM:
        return basicSetUseCm(null, msgs);
      case FastadnPackage.MODEL_FASTADN__INF_MODEL:
        return basicSetInfModel(null, msgs);
      case FastadnPackage.MODEL_FASTADN__IND_MODEL:
        return basicSetIndModel(null, msgs);
      case FastadnPackage.MODEL_FASTADN__ATOLER:
        return basicSetAtoler(null, msgs);
      case FastadnPackage.MODEL_FASTADN__TL_MODEL:
        return basicSetTLModel(null, msgs);
      case FastadnPackage.MODEL_FASTADN__HL_MODEL:
        return basicSetHLModel(null, msgs);
      case FastadnPackage.MODEL_FASTADN__WIND_FILE:
        return basicSetWindFile(null, msgs);
      case FastadnPackage.MODEL_FASTADN__HH:
        return basicSetHH(null, msgs);
      case FastadnPackage.MODEL_FASTADN__TWR_SHAD:
        return basicSetTwrShad(null, msgs);
      case FastadnPackage.MODEL_FASTADN__SHAD_HWID:
        return basicSetShadHWid(null, msgs);
      case FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT:
        return basicSetTShadRefPt(null, msgs);
      case FastadnPackage.MODEL_FASTADN__RHO:
        return basicSetRho(null, msgs);
      case FastadnPackage.MODEL_FASTADN__KIN_VISC:
        return basicSetKinVisc(null, msgs);
      case FastadnPackage.MODEL_FASTADN__DT_AERO:
        return basicSetDTAero(null, msgs);
      case FastadnPackage.MODEL_FASTADN__NUM_FOIL:
        return basicSetNumFoil(null, msgs);
      case FastadnPackage.MODEL_FASTADN__FOIL_NM:
        return basicSetFoilNm(null, msgs);
      case FastadnPackage.MODEL_FASTADN__BLD_NODES:
        return basicSetBldNodes(null, msgs);
      case FastadnPackage.MODEL_FASTADN__AIR_STAT:
        return basicSetAirStat(null, msgs);
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
      case FastadnPackage.MODEL_FASTADN__HEAD:
        return getHead();
      case FastadnPackage.MODEL_FASTADN__SI_UNITS:
        return getSIUnits();
      case FastadnPackage.MODEL_FASTADN__STALL_MOD:
        return getStallMod();
      case FastadnPackage.MODEL_FASTADN__USE_CM:
        return getUseCm();
      case FastadnPackage.MODEL_FASTADN__INF_MODEL:
        return getInfModel();
      case FastadnPackage.MODEL_FASTADN__IND_MODEL:
        return getIndModel();
      case FastadnPackage.MODEL_FASTADN__ATOLER:
        return getAtoler();
      case FastadnPackage.MODEL_FASTADN__TL_MODEL:
        return getTLModel();
      case FastadnPackage.MODEL_FASTADN__HL_MODEL:
        return getHLModel();
      case FastadnPackage.MODEL_FASTADN__WIND_FILE:
        return getWindFile();
      case FastadnPackage.MODEL_FASTADN__HH:
        return getHH();
      case FastadnPackage.MODEL_FASTADN__TWR_SHAD:
        return getTwrShad();
      case FastadnPackage.MODEL_FASTADN__SHAD_HWID:
        return getShadHWid();
      case FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT:
        return getTShadRefPt();
      case FastadnPackage.MODEL_FASTADN__RHO:
        return getRho();
      case FastadnPackage.MODEL_FASTADN__KIN_VISC:
        return getKinVisc();
      case FastadnPackage.MODEL_FASTADN__DT_AERO:
        return getDTAero();
      case FastadnPackage.MODEL_FASTADN__NUM_FOIL:
        return getNumFoil();
      case FastadnPackage.MODEL_FASTADN__FOIL_NM:
        return getFoilNm();
      case FastadnPackage.MODEL_FASTADN__BLD_NODES:
        return getBldNodes();
      case FastadnPackage.MODEL_FASTADN__AIR_STAT:
        return getAirStat();
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
      case FastadnPackage.MODEL_FASTADN__HEAD:
        setHead((Header)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__SI_UNITS:
        setSIUnits((sUnits)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__STALL_MOD:
        setStallMod((sStallMod)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__USE_CM:
        setUseCm((sUseCm)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__INF_MODEL:
        setInfModel((sInfModel)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__IND_MODEL:
        setIndModel((sIndModel)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__ATOLER:
        setAtoler((nAtoler)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__TL_MODEL:
        setTLModel((sTLModel)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__HL_MODEL:
        setHLModel((sHLModel)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__WIND_FILE:
        setWindFile((sWindFile)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__HH:
        setHH((nHH)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__TWR_SHAD:
        setTwrShad((nTwrShad)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__SHAD_HWID:
        setShadHWid((nShadHWid)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT:
        setTShadRefPt((nTShadRefPt)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__RHO:
        setRho((nRho)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__KIN_VISC:
        setKinVisc((nKinVisc)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__DT_AERO:
        setDTAero((nDTAero)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__NUM_FOIL:
        setNumFoil((iNumFoil)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__FOIL_NM:
        setFoilNm((aFoilNm)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__BLD_NODES:
        setBldNodes((iBldNodes)newValue);
        return;
      case FastadnPackage.MODEL_FASTADN__AIR_STAT:
        setAirStat((aAirStat)newValue);
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
      case FastadnPackage.MODEL_FASTADN__HEAD:
        setHead((Header)null);
        return;
      case FastadnPackage.MODEL_FASTADN__SI_UNITS:
        setSIUnits((sUnits)null);
        return;
      case FastadnPackage.MODEL_FASTADN__STALL_MOD:
        setStallMod((sStallMod)null);
        return;
      case FastadnPackage.MODEL_FASTADN__USE_CM:
        setUseCm((sUseCm)null);
        return;
      case FastadnPackage.MODEL_FASTADN__INF_MODEL:
        setInfModel((sInfModel)null);
        return;
      case FastadnPackage.MODEL_FASTADN__IND_MODEL:
        setIndModel((sIndModel)null);
        return;
      case FastadnPackage.MODEL_FASTADN__ATOLER:
        setAtoler((nAtoler)null);
        return;
      case FastadnPackage.MODEL_FASTADN__TL_MODEL:
        setTLModel((sTLModel)null);
        return;
      case FastadnPackage.MODEL_FASTADN__HL_MODEL:
        setHLModel((sHLModel)null);
        return;
      case FastadnPackage.MODEL_FASTADN__WIND_FILE:
        setWindFile((sWindFile)null);
        return;
      case FastadnPackage.MODEL_FASTADN__HH:
        setHH((nHH)null);
        return;
      case FastadnPackage.MODEL_FASTADN__TWR_SHAD:
        setTwrShad((nTwrShad)null);
        return;
      case FastadnPackage.MODEL_FASTADN__SHAD_HWID:
        setShadHWid((nShadHWid)null);
        return;
      case FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT:
        setTShadRefPt((nTShadRefPt)null);
        return;
      case FastadnPackage.MODEL_FASTADN__RHO:
        setRho((nRho)null);
        return;
      case FastadnPackage.MODEL_FASTADN__KIN_VISC:
        setKinVisc((nKinVisc)null);
        return;
      case FastadnPackage.MODEL_FASTADN__DT_AERO:
        setDTAero((nDTAero)null);
        return;
      case FastadnPackage.MODEL_FASTADN__NUM_FOIL:
        setNumFoil((iNumFoil)null);
        return;
      case FastadnPackage.MODEL_FASTADN__FOIL_NM:
        setFoilNm((aFoilNm)null);
        return;
      case FastadnPackage.MODEL_FASTADN__BLD_NODES:
        setBldNodes((iBldNodes)null);
        return;
      case FastadnPackage.MODEL_FASTADN__AIR_STAT:
        setAirStat((aAirStat)null);
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
      case FastadnPackage.MODEL_FASTADN__HEAD:
        return head != null;
      case FastadnPackage.MODEL_FASTADN__SI_UNITS:
        return siUnits != null;
      case FastadnPackage.MODEL_FASTADN__STALL_MOD:
        return stallMod != null;
      case FastadnPackage.MODEL_FASTADN__USE_CM:
        return useCm != null;
      case FastadnPackage.MODEL_FASTADN__INF_MODEL:
        return infModel != null;
      case FastadnPackage.MODEL_FASTADN__IND_MODEL:
        return indModel != null;
      case FastadnPackage.MODEL_FASTADN__ATOLER:
        return atoler != null;
      case FastadnPackage.MODEL_FASTADN__TL_MODEL:
        return tlModel != null;
      case FastadnPackage.MODEL_FASTADN__HL_MODEL:
        return hlModel != null;
      case FastadnPackage.MODEL_FASTADN__WIND_FILE:
        return windFile != null;
      case FastadnPackage.MODEL_FASTADN__HH:
        return hh != null;
      case FastadnPackage.MODEL_FASTADN__TWR_SHAD:
        return twrShad != null;
      case FastadnPackage.MODEL_FASTADN__SHAD_HWID:
        return shadHWid != null;
      case FastadnPackage.MODEL_FASTADN__TSHAD_REF_PT:
        return tShadRefPt != null;
      case FastadnPackage.MODEL_FASTADN__RHO:
        return rho != null;
      case FastadnPackage.MODEL_FASTADN__KIN_VISC:
        return kinVisc != null;
      case FastadnPackage.MODEL_FASTADN__DT_AERO:
        return dtAero != null;
      case FastadnPackage.MODEL_FASTADN__NUM_FOIL:
        return numFoil != null;
      case FastadnPackage.MODEL_FASTADN__FOIL_NM:
        return foilNm != null;
      case FastadnPackage.MODEL_FASTADN__BLD_NODES:
        return bldNodes != null;
      case FastadnPackage.MODEL_FASTADN__AIR_STAT:
        return airStat != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelFastadnImpl
