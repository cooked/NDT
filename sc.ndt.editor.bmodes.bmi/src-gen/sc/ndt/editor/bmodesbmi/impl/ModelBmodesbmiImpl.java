/**
 */
package sc.ndt.editor.bmodesbmi.impl;

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

import sc.ndt.editor.bmodesbmi.BmodesbmiPackage;
import sc.ndt.editor.bmodesbmi.Header;
import sc.ndt.editor.bmodesbmi.ModelBmodesbmi;
import sc.ndt.editor.bmodesbmi.Section;
import sc.ndt.editor.bmodesbmi.aElLoc;
import sc.ndt.editor.bmodesbmi.aNodeAttach;
import sc.ndt.editor.bmodesbmi.aTwrWires;
import sc.ndt.editor.bmodesbmi.aWireAngle;
import sc.ndt.editor.bmodesbmi.aWireStiff;
import sc.ndt.editor.bmodesbmi.bEcho;
import sc.ndt.editor.bmodesbmi.bMidNodeTw;
import sc.ndt.editor.bmodesbmi.bTabDelim;
import sc.ndt.editor.bmodesbmi.iBeamType;
import sc.ndt.editor.bmodesbmi.iHubConn;
import sc.ndt.editor.bmodesbmi.iIdMat;
import sc.ndt.editor.bmodesbmi.iModePr;
import sc.ndt.editor.bmodesbmi.iNSelt;
import sc.ndt.editor.bmodesbmi.iSecFile;
import sc.ndt.editor.bmodesbmi.iTwrAttach;
import sc.ndt.editor.bmodesbmi.iTwrSupport;
import sc.ndt.editor.bmodesbmi.nAxiStfMult;
import sc.ndt.editor.bmodesbmi.nBlThp;
import sc.ndt.editor.bmodesbmi.nCgOffsMult;
import sc.ndt.editor.bmodesbmi.nCmAxial;
import sc.ndt.editor.bmodesbmi.nCmLoc;
import sc.ndt.editor.bmodesbmi.nEdgStfMult;
import sc.ndt.editor.bmodesbmi.nFlpInrMult;
import sc.ndt.editor.bmodesbmi.nFlpstfMult;
import sc.ndt.editor.bmodesbmi.nHubRad;
import sc.ndt.editor.bmodesbmi.nIxxTip;
import sc.ndt.editor.bmodesbmi.nIxyTip;
import sc.ndt.editor.bmodesbmi.nIyyTip;
import sc.ndt.editor.bmodesbmi.nIyzTip;
import sc.ndt.editor.bmodesbmi.nIzxTip;
import sc.ndt.editor.bmodesbmi.nIzzTip;
import sc.ndt.editor.bmodesbmi.nLagInrMult;
import sc.ndt.editor.bmodesbmi.nPrecone;
import sc.ndt.editor.bmodesbmi.nRadius;
import sc.ndt.editor.bmodesbmi.nRotRpm;
import sc.ndt.editor.bmodesbmi.nRpmMult;
import sc.ndt.editor.bmodesbmi.nScOffsMult;
import sc.ndt.editor.bmodesbmi.nSecMasMult;
import sc.ndt.editor.bmodesbmi.nTcOffsMult;
import sc.ndt.editor.bmodesbmi.nTipMass;
import sc.ndt.editor.bmodesbmi.nTorStfMult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Bmodesbmi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getEcho <em>Echo</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getType <em>Type</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getInfModel <em>Inf Model</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getIndModel <em>Ind Model</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getAtoler <em>Atoler</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getTLModel <em>TL Model</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getHLModel <em>HL Model</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getBlThp <em>Bl Thp</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getHubConn <em>Hub Conn</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getModePr <em>Mode Pr</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getTabDelim <em>Tab Delim</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getMidNodeTw <em>Mid Node Tw</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getTipMass <em>Tip Mass</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getCmLoc <em>Cm Loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getCmAxial <em>Cm Axial</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getIxxTip <em>Ixx Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getIyyTip <em>Iyy Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getIzzTip <em>Izz Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getIxyTip <em>Ixy Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getIzxTip <em>Izx Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getIyzTip <em>Iyz Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getIdMat <em>Id Mat</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getSecFile <em>Sec File</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getSecMasMult <em>Sec Mas Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getFlpInrMult <em>Flp Inr Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getLagInrMult <em>Lag Inr Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getFlpstfMult <em>Flpstf Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getEdgStfMult <em>Edg Stf Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getTorStfMult <em>Tor Stf Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getAxiStfMult <em>Axi Stf Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getCgOffsMult <em>Cg Offs Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getScOffsMult <em>Sc Offs Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getTcOffsMult <em>Tc Offs Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getNSelt <em>NSelt</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getElLoc <em>El Loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getTwrSupport <em>Twr Support</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getTwrAttach <em>Twr Attach</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getTwrWires <em>Twr Wires</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getNodeAttach <em>Node Attach</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getWireStiff <em>Wire Stiff</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.ModelBmodesbmiImpl#getWireAngle <em>Wire Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelBmodesbmiImpl extends MinimalEObjectImpl.Container implements ModelBmodesbmi
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
   * The cached value of the '{@link #getSec() <em>Sec</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSec()
   * @generated
   * @ordered
   */
  protected EList<Section> sec;

  /**
   * The cached value of the '{@link #getEcho() <em>Echo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcho()
   * @generated
   * @ordered
   */
  protected bEcho echo;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected iBeamType type;

  /**
   * The cached value of the '{@link #getInfModel() <em>Inf Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfModel()
   * @generated
   * @ordered
   */
  protected nRotRpm infModel;

  /**
   * The cached value of the '{@link #getIndModel() <em>Ind Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndModel()
   * @generated
   * @ordered
   */
  protected nRpmMult indModel;

  /**
   * The cached value of the '{@link #getAtoler() <em>Atoler</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtoler()
   * @generated
   * @ordered
   */
  protected nRadius atoler;

  /**
   * The cached value of the '{@link #getTLModel() <em>TL Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTLModel()
   * @generated
   * @ordered
   */
  protected nHubRad tlModel;

  /**
   * The cached value of the '{@link #getHLModel() <em>HL Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHLModel()
   * @generated
   * @ordered
   */
  protected nPrecone hlModel;

  /**
   * The cached value of the '{@link #getBlThp() <em>Bl Thp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlThp()
   * @generated
   * @ordered
   */
  protected nBlThp blThp;

  /**
   * The cached value of the '{@link #getHubConn() <em>Hub Conn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubConn()
   * @generated
   * @ordered
   */
  protected iHubConn hubConn;

  /**
   * The cached value of the '{@link #getModePr() <em>Mode Pr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModePr()
   * @generated
   * @ordered
   */
  protected iModePr modePr;

  /**
   * The cached value of the '{@link #getTabDelim() <em>Tab Delim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabDelim()
   * @generated
   * @ordered
   */
  protected bTabDelim tabDelim;

  /**
   * The cached value of the '{@link #getMidNodeTw() <em>Mid Node Tw</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMidNodeTw()
   * @generated
   * @ordered
   */
  protected bMidNodeTw midNodeTw;

  /**
   * The cached value of the '{@link #getTipMass() <em>Tip Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipMass()
   * @generated
   * @ordered
   */
  protected nTipMass tipMass;

  /**
   * The cached value of the '{@link #getCmLoc() <em>Cm Loc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmLoc()
   * @generated
   * @ordered
   */
  protected nCmLoc cmLoc;

  /**
   * The cached value of the '{@link #getCmAxial() <em>Cm Axial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmAxial()
   * @generated
   * @ordered
   */
  protected nCmAxial cmAxial;

  /**
   * The cached value of the '{@link #getIxxTip() <em>Ixx Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxxTip()
   * @generated
   * @ordered
   */
  protected nIxxTip ixxTip;

  /**
   * The cached value of the '{@link #getIyyTip() <em>Iyy Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIyyTip()
   * @generated
   * @ordered
   */
  protected nIyyTip iyyTip;

  /**
   * The cached value of the '{@link #getIzzTip() <em>Izz Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIzzTip()
   * @generated
   * @ordered
   */
  protected nIzzTip izzTip;

  /**
   * The cached value of the '{@link #getIxyTip() <em>Ixy Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxyTip()
   * @generated
   * @ordered
   */
  protected nIxyTip ixyTip;

  /**
   * The cached value of the '{@link #getIzxTip() <em>Izx Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIzxTip()
   * @generated
   * @ordered
   */
  protected nIzxTip izxTip;

  /**
   * The cached value of the '{@link #getIyzTip() <em>Iyz Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIyzTip()
   * @generated
   * @ordered
   */
  protected nIyzTip iyzTip;

  /**
   * The cached value of the '{@link #getIdMat() <em>Id Mat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdMat()
   * @generated
   * @ordered
   */
  protected iIdMat idMat;

  /**
   * The cached value of the '{@link #getSecFile() <em>Sec File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecFile()
   * @generated
   * @ordered
   */
  protected iSecFile secFile;

  /**
   * The cached value of the '{@link #getSecMasMult() <em>Sec Mas Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecMasMult()
   * @generated
   * @ordered
   */
  protected nSecMasMult secMasMult;

  /**
   * The cached value of the '{@link #getFlpInrMult() <em>Flp Inr Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlpInrMult()
   * @generated
   * @ordered
   */
  protected nFlpInrMult flpInrMult;

  /**
   * The cached value of the '{@link #getLagInrMult() <em>Lag Inr Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLagInrMult()
   * @generated
   * @ordered
   */
  protected nLagInrMult lagInrMult;

  /**
   * The cached value of the '{@link #getFlpstfMult() <em>Flpstf Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlpstfMult()
   * @generated
   * @ordered
   */
  protected nFlpstfMult flpstfMult;

  /**
   * The cached value of the '{@link #getEdgStfMult() <em>Edg Stf Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgStfMult()
   * @generated
   * @ordered
   */
  protected nEdgStfMult edgStfMult;

  /**
   * The cached value of the '{@link #getTorStfMult() <em>Tor Stf Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTorStfMult()
   * @generated
   * @ordered
   */
  protected nTorStfMult torStfMult;

  /**
   * The cached value of the '{@link #getAxiStfMult() <em>Axi Stf Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxiStfMult()
   * @generated
   * @ordered
   */
  protected nAxiStfMult axiStfMult;

  /**
   * The cached value of the '{@link #getCgOffsMult() <em>Cg Offs Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCgOffsMult()
   * @generated
   * @ordered
   */
  protected nCgOffsMult cgOffsMult;

  /**
   * The cached value of the '{@link #getScOffsMult() <em>Sc Offs Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScOffsMult()
   * @generated
   * @ordered
   */
  protected nScOffsMult scOffsMult;

  /**
   * The cached value of the '{@link #getTcOffsMult() <em>Tc Offs Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcOffsMult()
   * @generated
   * @ordered
   */
  protected nTcOffsMult tcOffsMult;

  /**
   * The cached value of the '{@link #getNSelt() <em>NSelt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNSelt()
   * @generated
   * @ordered
   */
  protected iNSelt nSelt;

  /**
   * The cached value of the '{@link #getElLoc() <em>El Loc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElLoc()
   * @generated
   * @ordered
   */
  protected aElLoc elLoc;

  /**
   * The cached value of the '{@link #getTwrSupport() <em>Twr Support</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrSupport()
   * @generated
   * @ordered
   */
  protected iTwrSupport twrSupport;

  /**
   * The cached value of the '{@link #getTwrAttach() <em>Twr Attach</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrAttach()
   * @generated
   * @ordered
   */
  protected iTwrAttach twrAttach;

  /**
   * The cached value of the '{@link #getTwrWires() <em>Twr Wires</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrWires()
   * @generated
   * @ordered
   */
  protected aTwrWires twrWires;

  /**
   * The cached value of the '{@link #getNodeAttach() <em>Node Attach</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeAttach()
   * @generated
   * @ordered
   */
  protected aNodeAttach nodeAttach;

  /**
   * The cached value of the '{@link #getWireStiff() <em>Wire Stiff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWireStiff()
   * @generated
   * @ordered
   */
  protected aWireStiff wireStiff;

  /**
   * The cached value of the '{@link #getWireAngle() <em>Wire Angle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWireAngle()
   * @generated
   * @ordered
   */
  protected aWireAngle wireAngle;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelBmodesbmiImpl()
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
    return BmodesbmiPackage.Literals.MODEL_BMODESBMI;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__HEAD, oldHead, newHead);
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
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Section> getSec()
  {
    if (sec == null)
    {
      sec = new EObjectContainmentEList<Section>(Section.class, this, BmodesbmiPackage.MODEL_BMODESBMI__SEC);
    }
    return sec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bEcho getEcho()
  {
    return echo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEcho(bEcho newEcho, NotificationChain msgs)
  {
    bEcho oldEcho = echo;
    echo = newEcho;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__ECHO, oldEcho, newEcho);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcho(bEcho newEcho)
  {
    if (newEcho != echo)
    {
      NotificationChain msgs = null;
      if (echo != null)
        msgs = ((InternalEObject)echo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__ECHO, null, msgs);
      if (newEcho != null)
        msgs = ((InternalEObject)newEcho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__ECHO, null, msgs);
      msgs = basicSetEcho(newEcho, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__ECHO, newEcho, newEcho));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iBeamType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(iBeamType newType, NotificationChain msgs)
  {
    iBeamType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(iBeamType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRotRpm getInfModel()
  {
    return infModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfModel(nRotRpm newInfModel, NotificationChain msgs)
  {
    nRotRpm oldInfModel = infModel;
    infModel = newInfModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL, oldInfModel, newInfModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfModel(nRotRpm newInfModel)
  {
    if (newInfModel != infModel)
    {
      NotificationChain msgs = null;
      if (infModel != null)
        msgs = ((InternalEObject)infModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL, null, msgs);
      if (newInfModel != null)
        msgs = ((InternalEObject)newInfModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL, null, msgs);
      msgs = basicSetInfModel(newInfModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL, newInfModel, newInfModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRpmMult getIndModel()
  {
    return indModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndModel(nRpmMult newIndModel, NotificationChain msgs)
  {
    nRpmMult oldIndModel = indModel;
    indModel = newIndModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL, oldIndModel, newIndModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndModel(nRpmMult newIndModel)
  {
    if (newIndModel != indModel)
    {
      NotificationChain msgs = null;
      if (indModel != null)
        msgs = ((InternalEObject)indModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL, null, msgs);
      if (newIndModel != null)
        msgs = ((InternalEObject)newIndModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL, null, msgs);
      msgs = basicSetIndModel(newIndModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL, newIndModel, newIndModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRadius getAtoler()
  {
    return atoler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtoler(nRadius newAtoler, NotificationChain msgs)
  {
    nRadius oldAtoler = atoler;
    atoler = newAtoler;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__ATOLER, oldAtoler, newAtoler);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtoler(nRadius newAtoler)
  {
    if (newAtoler != atoler)
    {
      NotificationChain msgs = null;
      if (atoler != null)
        msgs = ((InternalEObject)atoler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__ATOLER, null, msgs);
      if (newAtoler != null)
        msgs = ((InternalEObject)newAtoler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__ATOLER, null, msgs);
      msgs = basicSetAtoler(newAtoler, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__ATOLER, newAtoler, newAtoler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubRad getTLModel()
  {
    return tlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTLModel(nHubRad newTLModel, NotificationChain msgs)
  {
    nHubRad oldTLModel = tlModel;
    tlModel = newTLModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL, oldTLModel, newTLModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTLModel(nHubRad newTLModel)
  {
    if (newTLModel != tlModel)
    {
      NotificationChain msgs = null;
      if (tlModel != null)
        msgs = ((InternalEObject)tlModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL, null, msgs);
      if (newTLModel != null)
        msgs = ((InternalEObject)newTLModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL, null, msgs);
      msgs = basicSetTLModel(newTLModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL, newTLModel, newTLModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPrecone getHLModel()
  {
    return hlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHLModel(nPrecone newHLModel, NotificationChain msgs)
  {
    nPrecone oldHLModel = hlModel;
    hlModel = newHLModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL, oldHLModel, newHLModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHLModel(nPrecone newHLModel)
  {
    if (newHLModel != hlModel)
    {
      NotificationChain msgs = null;
      if (hlModel != null)
        msgs = ((InternalEObject)hlModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL, null, msgs);
      if (newHLModel != null)
        msgs = ((InternalEObject)newHLModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL, null, msgs);
      msgs = basicSetHLModel(newHLModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL, newHLModel, newHLModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlThp getBlThp()
  {
    return blThp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlThp(nBlThp newBlThp, NotificationChain msgs)
  {
    nBlThp oldBlThp = blThp;
    blThp = newBlThp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__BL_THP, oldBlThp, newBlThp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlThp(nBlThp newBlThp)
  {
    if (newBlThp != blThp)
    {
      NotificationChain msgs = null;
      if (blThp != null)
        msgs = ((InternalEObject)blThp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__BL_THP, null, msgs);
      if (newBlThp != null)
        msgs = ((InternalEObject)newBlThp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__BL_THP, null, msgs);
      msgs = basicSetBlThp(newBlThp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__BL_THP, newBlThp, newBlThp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iHubConn getHubConn()
  {
    return hubConn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHubConn(iHubConn newHubConn, NotificationChain msgs)
  {
    iHubConn oldHubConn = hubConn;
    hubConn = newHubConn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN, oldHubConn, newHubConn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHubConn(iHubConn newHubConn)
  {
    if (newHubConn != hubConn)
    {
      NotificationChain msgs = null;
      if (hubConn != null)
        msgs = ((InternalEObject)hubConn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN, null, msgs);
      if (newHubConn != null)
        msgs = ((InternalEObject)newHubConn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN, null, msgs);
      msgs = basicSetHubConn(newHubConn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN, newHubConn, newHubConn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iModePr getModePr()
  {
    return modePr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModePr(iModePr newModePr, NotificationChain msgs)
  {
    iModePr oldModePr = modePr;
    modePr = newModePr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR, oldModePr, newModePr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModePr(iModePr newModePr)
  {
    if (newModePr != modePr)
    {
      NotificationChain msgs = null;
      if (modePr != null)
        msgs = ((InternalEObject)modePr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR, null, msgs);
      if (newModePr != null)
        msgs = ((InternalEObject)newModePr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR, null, msgs);
      msgs = basicSetModePr(newModePr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR, newModePr, newModePr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTabDelim getTabDelim()
  {
    return tabDelim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTabDelim(bTabDelim newTabDelim, NotificationChain msgs)
  {
    bTabDelim oldTabDelim = tabDelim;
    tabDelim = newTabDelim;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM, oldTabDelim, newTabDelim);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTabDelim(bTabDelim newTabDelim)
  {
    if (newTabDelim != tabDelim)
    {
      NotificationChain msgs = null;
      if (tabDelim != null)
        msgs = ((InternalEObject)tabDelim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM, null, msgs);
      if (newTabDelim != null)
        msgs = ((InternalEObject)newTabDelim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM, null, msgs);
      msgs = basicSetTabDelim(newTabDelim, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM, newTabDelim, newTabDelim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bMidNodeTw getMidNodeTw()
  {
    return midNodeTw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMidNodeTw(bMidNodeTw newMidNodeTw, NotificationChain msgs)
  {
    bMidNodeTw oldMidNodeTw = midNodeTw;
    midNodeTw = newMidNodeTw;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW, oldMidNodeTw, newMidNodeTw);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMidNodeTw(bMidNodeTw newMidNodeTw)
  {
    if (newMidNodeTw != midNodeTw)
    {
      NotificationChain msgs = null;
      if (midNodeTw != null)
        msgs = ((InternalEObject)midNodeTw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW, null, msgs);
      if (newMidNodeTw != null)
        msgs = ((InternalEObject)newMidNodeTw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW, null, msgs);
      msgs = basicSetMidNodeTw(newMidNodeTw, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW, newMidNodeTw, newMidNodeTw));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipMass getTipMass()
  {
    return tipMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipMass(nTipMass newTipMass, NotificationChain msgs)
  {
    nTipMass oldTipMass = tipMass;
    tipMass = newTipMass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS, oldTipMass, newTipMass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipMass(nTipMass newTipMass)
  {
    if (newTipMass != tipMass)
    {
      NotificationChain msgs = null;
      if (tipMass != null)
        msgs = ((InternalEObject)tipMass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS, null, msgs);
      if (newTipMass != null)
        msgs = ((InternalEObject)newTipMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS, null, msgs);
      msgs = basicSetTipMass(newTipMass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS, newTipMass, newTipMass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCmLoc getCmLoc()
  {
    return cmLoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmLoc(nCmLoc newCmLoc, NotificationChain msgs)
  {
    nCmLoc oldCmLoc = cmLoc;
    cmLoc = newCmLoc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC, oldCmLoc, newCmLoc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmLoc(nCmLoc newCmLoc)
  {
    if (newCmLoc != cmLoc)
    {
      NotificationChain msgs = null;
      if (cmLoc != null)
        msgs = ((InternalEObject)cmLoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC, null, msgs);
      if (newCmLoc != null)
        msgs = ((InternalEObject)newCmLoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC, null, msgs);
      msgs = basicSetCmLoc(newCmLoc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC, newCmLoc, newCmLoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCmAxial getCmAxial()
  {
    return cmAxial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmAxial(nCmAxial newCmAxial, NotificationChain msgs)
  {
    nCmAxial oldCmAxial = cmAxial;
    cmAxial = newCmAxial;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL, oldCmAxial, newCmAxial);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmAxial(nCmAxial newCmAxial)
  {
    if (newCmAxial != cmAxial)
    {
      NotificationChain msgs = null;
      if (cmAxial != null)
        msgs = ((InternalEObject)cmAxial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL, null, msgs);
      if (newCmAxial != null)
        msgs = ((InternalEObject)newCmAxial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL, null, msgs);
      msgs = basicSetCmAxial(newCmAxial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL, newCmAxial, newCmAxial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIxxTip getIxxTip()
  {
    return ixxTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIxxTip(nIxxTip newIxxTip, NotificationChain msgs)
  {
    nIxxTip oldIxxTip = ixxTip;
    ixxTip = newIxxTip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP, oldIxxTip, newIxxTip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIxxTip(nIxxTip newIxxTip)
  {
    if (newIxxTip != ixxTip)
    {
      NotificationChain msgs = null;
      if (ixxTip != null)
        msgs = ((InternalEObject)ixxTip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP, null, msgs);
      if (newIxxTip != null)
        msgs = ((InternalEObject)newIxxTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP, null, msgs);
      msgs = basicSetIxxTip(newIxxTip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP, newIxxTip, newIxxTip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIyyTip getIyyTip()
  {
    return iyyTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIyyTip(nIyyTip newIyyTip, NotificationChain msgs)
  {
    nIyyTip oldIyyTip = iyyTip;
    iyyTip = newIyyTip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP, oldIyyTip, newIyyTip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIyyTip(nIyyTip newIyyTip)
  {
    if (newIyyTip != iyyTip)
    {
      NotificationChain msgs = null;
      if (iyyTip != null)
        msgs = ((InternalEObject)iyyTip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP, null, msgs);
      if (newIyyTip != null)
        msgs = ((InternalEObject)newIyyTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP, null, msgs);
      msgs = basicSetIyyTip(newIyyTip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP, newIyyTip, newIyyTip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIzzTip getIzzTip()
  {
    return izzTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIzzTip(nIzzTip newIzzTip, NotificationChain msgs)
  {
    nIzzTip oldIzzTip = izzTip;
    izzTip = newIzzTip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP, oldIzzTip, newIzzTip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIzzTip(nIzzTip newIzzTip)
  {
    if (newIzzTip != izzTip)
    {
      NotificationChain msgs = null;
      if (izzTip != null)
        msgs = ((InternalEObject)izzTip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP, null, msgs);
      if (newIzzTip != null)
        msgs = ((InternalEObject)newIzzTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP, null, msgs);
      msgs = basicSetIzzTip(newIzzTip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP, newIzzTip, newIzzTip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIxyTip getIxyTip()
  {
    return ixyTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIxyTip(nIxyTip newIxyTip, NotificationChain msgs)
  {
    nIxyTip oldIxyTip = ixyTip;
    ixyTip = newIxyTip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP, oldIxyTip, newIxyTip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIxyTip(nIxyTip newIxyTip)
  {
    if (newIxyTip != ixyTip)
    {
      NotificationChain msgs = null;
      if (ixyTip != null)
        msgs = ((InternalEObject)ixyTip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP, null, msgs);
      if (newIxyTip != null)
        msgs = ((InternalEObject)newIxyTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP, null, msgs);
      msgs = basicSetIxyTip(newIxyTip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP, newIxyTip, newIxyTip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIzxTip getIzxTip()
  {
    return izxTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIzxTip(nIzxTip newIzxTip, NotificationChain msgs)
  {
    nIzxTip oldIzxTip = izxTip;
    izxTip = newIzxTip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP, oldIzxTip, newIzxTip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIzxTip(nIzxTip newIzxTip)
  {
    if (newIzxTip != izxTip)
    {
      NotificationChain msgs = null;
      if (izxTip != null)
        msgs = ((InternalEObject)izxTip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP, null, msgs);
      if (newIzxTip != null)
        msgs = ((InternalEObject)newIzxTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP, null, msgs);
      msgs = basicSetIzxTip(newIzxTip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP, newIzxTip, newIzxTip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIyzTip getIyzTip()
  {
    return iyzTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIyzTip(nIyzTip newIyzTip, NotificationChain msgs)
  {
    nIyzTip oldIyzTip = iyzTip;
    iyzTip = newIyzTip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP, oldIyzTip, newIyzTip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIyzTip(nIyzTip newIyzTip)
  {
    if (newIyzTip != iyzTip)
    {
      NotificationChain msgs = null;
      if (iyzTip != null)
        msgs = ((InternalEObject)iyzTip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP, null, msgs);
      if (newIyzTip != null)
        msgs = ((InternalEObject)newIyzTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP, null, msgs);
      msgs = basicSetIyzTip(newIyzTip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP, newIyzTip, newIyzTip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iIdMat getIdMat()
  {
    return idMat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdMat(iIdMat newIdMat, NotificationChain msgs)
  {
    iIdMat oldIdMat = idMat;
    idMat = newIdMat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT, oldIdMat, newIdMat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdMat(iIdMat newIdMat)
  {
    if (newIdMat != idMat)
    {
      NotificationChain msgs = null;
      if (idMat != null)
        msgs = ((InternalEObject)idMat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT, null, msgs);
      if (newIdMat != null)
        msgs = ((InternalEObject)newIdMat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT, null, msgs);
      msgs = basicSetIdMat(newIdMat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT, newIdMat, newIdMat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iSecFile getSecFile()
  {
    return secFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecFile(iSecFile newSecFile, NotificationChain msgs)
  {
    iSecFile oldSecFile = secFile;
    secFile = newSecFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE, oldSecFile, newSecFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecFile(iSecFile newSecFile)
  {
    if (newSecFile != secFile)
    {
      NotificationChain msgs = null;
      if (secFile != null)
        msgs = ((InternalEObject)secFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE, null, msgs);
      if (newSecFile != null)
        msgs = ((InternalEObject)newSecFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE, null, msgs);
      msgs = basicSetSecFile(newSecFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE, newSecFile, newSecFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSecMasMult getSecMasMult()
  {
    return secMasMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecMasMult(nSecMasMult newSecMasMult, NotificationChain msgs)
  {
    nSecMasMult oldSecMasMult = secMasMult;
    secMasMult = newSecMasMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT, oldSecMasMult, newSecMasMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecMasMult(nSecMasMult newSecMasMult)
  {
    if (newSecMasMult != secMasMult)
    {
      NotificationChain msgs = null;
      if (secMasMult != null)
        msgs = ((InternalEObject)secMasMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT, null, msgs);
      if (newSecMasMult != null)
        msgs = ((InternalEObject)newSecMasMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT, null, msgs);
      msgs = basicSetSecMasMult(newSecMasMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT, newSecMasMult, newSecMasMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFlpInrMult getFlpInrMult()
  {
    return flpInrMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFlpInrMult(nFlpInrMult newFlpInrMult, NotificationChain msgs)
  {
    nFlpInrMult oldFlpInrMult = flpInrMult;
    flpInrMult = newFlpInrMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT, oldFlpInrMult, newFlpInrMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlpInrMult(nFlpInrMult newFlpInrMult)
  {
    if (newFlpInrMult != flpInrMult)
    {
      NotificationChain msgs = null;
      if (flpInrMult != null)
        msgs = ((InternalEObject)flpInrMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT, null, msgs);
      if (newFlpInrMult != null)
        msgs = ((InternalEObject)newFlpInrMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT, null, msgs);
      msgs = basicSetFlpInrMult(newFlpInrMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT, newFlpInrMult, newFlpInrMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nLagInrMult getLagInrMult()
  {
    return lagInrMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLagInrMult(nLagInrMult newLagInrMult, NotificationChain msgs)
  {
    nLagInrMult oldLagInrMult = lagInrMult;
    lagInrMult = newLagInrMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT, oldLagInrMult, newLagInrMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLagInrMult(nLagInrMult newLagInrMult)
  {
    if (newLagInrMult != lagInrMult)
    {
      NotificationChain msgs = null;
      if (lagInrMult != null)
        msgs = ((InternalEObject)lagInrMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT, null, msgs);
      if (newLagInrMult != null)
        msgs = ((InternalEObject)newLagInrMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT, null, msgs);
      msgs = basicSetLagInrMult(newLagInrMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT, newLagInrMult, newLagInrMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFlpstfMult getFlpstfMult()
  {
    return flpstfMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFlpstfMult(nFlpstfMult newFlpstfMult, NotificationChain msgs)
  {
    nFlpstfMult oldFlpstfMult = flpstfMult;
    flpstfMult = newFlpstfMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT, oldFlpstfMult, newFlpstfMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlpstfMult(nFlpstfMult newFlpstfMult)
  {
    if (newFlpstfMult != flpstfMult)
    {
      NotificationChain msgs = null;
      if (flpstfMult != null)
        msgs = ((InternalEObject)flpstfMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT, null, msgs);
      if (newFlpstfMult != null)
        msgs = ((InternalEObject)newFlpstfMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT, null, msgs);
      msgs = basicSetFlpstfMult(newFlpstfMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT, newFlpstfMult, newFlpstfMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nEdgStfMult getEdgStfMult()
  {
    return edgStfMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEdgStfMult(nEdgStfMult newEdgStfMult, NotificationChain msgs)
  {
    nEdgStfMult oldEdgStfMult = edgStfMult;
    edgStfMult = newEdgStfMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT, oldEdgStfMult, newEdgStfMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEdgStfMult(nEdgStfMult newEdgStfMult)
  {
    if (newEdgStfMult != edgStfMult)
    {
      NotificationChain msgs = null;
      if (edgStfMult != null)
        msgs = ((InternalEObject)edgStfMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT, null, msgs);
      if (newEdgStfMult != null)
        msgs = ((InternalEObject)newEdgStfMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT, null, msgs);
      msgs = basicSetEdgStfMult(newEdgStfMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT, newEdgStfMult, newEdgStfMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTorStfMult getTorStfMult()
  {
    return torStfMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTorStfMult(nTorStfMult newTorStfMult, NotificationChain msgs)
  {
    nTorStfMult oldTorStfMult = torStfMult;
    torStfMult = newTorStfMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT, oldTorStfMult, newTorStfMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTorStfMult(nTorStfMult newTorStfMult)
  {
    if (newTorStfMult != torStfMult)
    {
      NotificationChain msgs = null;
      if (torStfMult != null)
        msgs = ((InternalEObject)torStfMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT, null, msgs);
      if (newTorStfMult != null)
        msgs = ((InternalEObject)newTorStfMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT, null, msgs);
      msgs = basicSetTorStfMult(newTorStfMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT, newTorStfMult, newTorStfMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAxiStfMult getAxiStfMult()
  {
    return axiStfMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAxiStfMult(nAxiStfMult newAxiStfMult, NotificationChain msgs)
  {
    nAxiStfMult oldAxiStfMult = axiStfMult;
    axiStfMult = newAxiStfMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT, oldAxiStfMult, newAxiStfMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAxiStfMult(nAxiStfMult newAxiStfMult)
  {
    if (newAxiStfMult != axiStfMult)
    {
      NotificationChain msgs = null;
      if (axiStfMult != null)
        msgs = ((InternalEObject)axiStfMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT, null, msgs);
      if (newAxiStfMult != null)
        msgs = ((InternalEObject)newAxiStfMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT, null, msgs);
      msgs = basicSetAxiStfMult(newAxiStfMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT, newAxiStfMult, newAxiStfMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCgOffsMult getCgOffsMult()
  {
    return cgOffsMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCgOffsMult(nCgOffsMult newCgOffsMult, NotificationChain msgs)
  {
    nCgOffsMult oldCgOffsMult = cgOffsMult;
    cgOffsMult = newCgOffsMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT, oldCgOffsMult, newCgOffsMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCgOffsMult(nCgOffsMult newCgOffsMult)
  {
    if (newCgOffsMult != cgOffsMult)
    {
      NotificationChain msgs = null;
      if (cgOffsMult != null)
        msgs = ((InternalEObject)cgOffsMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT, null, msgs);
      if (newCgOffsMult != null)
        msgs = ((InternalEObject)newCgOffsMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT, null, msgs);
      msgs = basicSetCgOffsMult(newCgOffsMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT, newCgOffsMult, newCgOffsMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nScOffsMult getScOffsMult()
  {
    return scOffsMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScOffsMult(nScOffsMult newScOffsMult, NotificationChain msgs)
  {
    nScOffsMult oldScOffsMult = scOffsMult;
    scOffsMult = newScOffsMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT, oldScOffsMult, newScOffsMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScOffsMult(nScOffsMult newScOffsMult)
  {
    if (newScOffsMult != scOffsMult)
    {
      NotificationChain msgs = null;
      if (scOffsMult != null)
        msgs = ((InternalEObject)scOffsMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT, null, msgs);
      if (newScOffsMult != null)
        msgs = ((InternalEObject)newScOffsMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT, null, msgs);
      msgs = basicSetScOffsMult(newScOffsMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT, newScOffsMult, newScOffsMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTcOffsMult getTcOffsMult()
  {
    return tcOffsMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTcOffsMult(nTcOffsMult newTcOffsMult, NotificationChain msgs)
  {
    nTcOffsMult oldTcOffsMult = tcOffsMult;
    tcOffsMult = newTcOffsMult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT, oldTcOffsMult, newTcOffsMult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTcOffsMult(nTcOffsMult newTcOffsMult)
  {
    if (newTcOffsMult != tcOffsMult)
    {
      NotificationChain msgs = null;
      if (tcOffsMult != null)
        msgs = ((InternalEObject)tcOffsMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT, null, msgs);
      if (newTcOffsMult != null)
        msgs = ((InternalEObject)newTcOffsMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT, null, msgs);
      msgs = basicSetTcOffsMult(newTcOffsMult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT, newTcOffsMult, newTcOffsMult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNSelt getNSelt()
  {
    return nSelt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNSelt(iNSelt newNSelt, NotificationChain msgs)
  {
    iNSelt oldNSelt = nSelt;
    nSelt = newNSelt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__NSELT, oldNSelt, newNSelt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNSelt(iNSelt newNSelt)
  {
    if (newNSelt != nSelt)
    {
      NotificationChain msgs = null;
      if (nSelt != null)
        msgs = ((InternalEObject)nSelt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__NSELT, null, msgs);
      if (newNSelt != null)
        msgs = ((InternalEObject)newNSelt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__NSELT, null, msgs);
      msgs = basicSetNSelt(newNSelt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__NSELT, newNSelt, newNSelt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aElLoc getElLoc()
  {
    return elLoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElLoc(aElLoc newElLoc, NotificationChain msgs)
  {
    aElLoc oldElLoc = elLoc;
    elLoc = newElLoc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC, oldElLoc, newElLoc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElLoc(aElLoc newElLoc)
  {
    if (newElLoc != elLoc)
    {
      NotificationChain msgs = null;
      if (elLoc != null)
        msgs = ((InternalEObject)elLoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC, null, msgs);
      if (newElLoc != null)
        msgs = ((InternalEObject)newElLoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC, null, msgs);
      msgs = basicSetElLoc(newElLoc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC, newElLoc, newElLoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iTwrSupport getTwrSupport()
  {
    return twrSupport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrSupport(iTwrSupport newTwrSupport, NotificationChain msgs)
  {
    iTwrSupport oldTwrSupport = twrSupport;
    twrSupport = newTwrSupport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT, oldTwrSupport, newTwrSupport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrSupport(iTwrSupport newTwrSupport)
  {
    if (newTwrSupport != twrSupport)
    {
      NotificationChain msgs = null;
      if (twrSupport != null)
        msgs = ((InternalEObject)twrSupport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT, null, msgs);
      if (newTwrSupport != null)
        msgs = ((InternalEObject)newTwrSupport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT, null, msgs);
      msgs = basicSetTwrSupport(newTwrSupport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT, newTwrSupport, newTwrSupport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iTwrAttach getTwrAttach()
  {
    return twrAttach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrAttach(iTwrAttach newTwrAttach, NotificationChain msgs)
  {
    iTwrAttach oldTwrAttach = twrAttach;
    twrAttach = newTwrAttach;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH, oldTwrAttach, newTwrAttach);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrAttach(iTwrAttach newTwrAttach)
  {
    if (newTwrAttach != twrAttach)
    {
      NotificationChain msgs = null;
      if (twrAttach != null)
        msgs = ((InternalEObject)twrAttach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH, null, msgs);
      if (newTwrAttach != null)
        msgs = ((InternalEObject)newTwrAttach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH, null, msgs);
      msgs = basicSetTwrAttach(newTwrAttach, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH, newTwrAttach, newTwrAttach));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aTwrWires getTwrWires()
  {
    return twrWires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrWires(aTwrWires newTwrWires, NotificationChain msgs)
  {
    aTwrWires oldTwrWires = twrWires;
    twrWires = newTwrWires;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES, oldTwrWires, newTwrWires);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrWires(aTwrWires newTwrWires)
  {
    if (newTwrWires != twrWires)
    {
      NotificationChain msgs = null;
      if (twrWires != null)
        msgs = ((InternalEObject)twrWires).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES, null, msgs);
      if (newTwrWires != null)
        msgs = ((InternalEObject)newTwrWires).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES, null, msgs);
      msgs = basicSetTwrWires(newTwrWires, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES, newTwrWires, newTwrWires));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aNodeAttach getNodeAttach()
  {
    return nodeAttach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeAttach(aNodeAttach newNodeAttach, NotificationChain msgs)
  {
    aNodeAttach oldNodeAttach = nodeAttach;
    nodeAttach = newNodeAttach;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH, oldNodeAttach, newNodeAttach);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeAttach(aNodeAttach newNodeAttach)
  {
    if (newNodeAttach != nodeAttach)
    {
      NotificationChain msgs = null;
      if (nodeAttach != null)
        msgs = ((InternalEObject)nodeAttach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH, null, msgs);
      if (newNodeAttach != null)
        msgs = ((InternalEObject)newNodeAttach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH, null, msgs);
      msgs = basicSetNodeAttach(newNodeAttach, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH, newNodeAttach, newNodeAttach));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aWireStiff getWireStiff()
  {
    return wireStiff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWireStiff(aWireStiff newWireStiff, NotificationChain msgs)
  {
    aWireStiff oldWireStiff = wireStiff;
    wireStiff = newWireStiff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF, oldWireStiff, newWireStiff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWireStiff(aWireStiff newWireStiff)
  {
    if (newWireStiff != wireStiff)
    {
      NotificationChain msgs = null;
      if (wireStiff != null)
        msgs = ((InternalEObject)wireStiff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF, null, msgs);
      if (newWireStiff != null)
        msgs = ((InternalEObject)newWireStiff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF, null, msgs);
      msgs = basicSetWireStiff(newWireStiff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF, newWireStiff, newWireStiff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aWireAngle getWireAngle()
  {
    return wireAngle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWireAngle(aWireAngle newWireAngle, NotificationChain msgs)
  {
    aWireAngle oldWireAngle = wireAngle;
    wireAngle = newWireAngle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE, oldWireAngle, newWireAngle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWireAngle(aWireAngle newWireAngle)
  {
    if (newWireAngle != wireAngle)
    {
      NotificationChain msgs = null;
      if (wireAngle != null)
        msgs = ((InternalEObject)wireAngle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE, null, msgs);
      if (newWireAngle != null)
        msgs = ((InternalEObject)newWireAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE, null, msgs);
      msgs = basicSetWireAngle(newWireAngle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE, newWireAngle, newWireAngle));
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
      case BmodesbmiPackage.MODEL_BMODESBMI__HEAD:
        return basicSetHead(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC:
        return ((InternalEList<?>)getSec()).basicRemove(otherEnd, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__ECHO:
        return basicSetEcho(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TYPE:
        return basicSetType(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL:
        return basicSetInfModel(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL:
        return basicSetIndModel(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__ATOLER:
        return basicSetAtoler(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL:
        return basicSetTLModel(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL:
        return basicSetHLModel(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__BL_THP:
        return basicSetBlThp(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN:
        return basicSetHubConn(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR:
        return basicSetModePr(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM:
        return basicSetTabDelim(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW:
        return basicSetMidNodeTw(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS:
        return basicSetTipMass(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC:
        return basicSetCmLoc(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL:
        return basicSetCmAxial(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP:
        return basicSetIxxTip(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP:
        return basicSetIyyTip(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP:
        return basicSetIzzTip(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP:
        return basicSetIxyTip(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP:
        return basicSetIzxTip(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP:
        return basicSetIyzTip(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT:
        return basicSetIdMat(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE:
        return basicSetSecFile(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT:
        return basicSetSecMasMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT:
        return basicSetFlpInrMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT:
        return basicSetLagInrMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT:
        return basicSetFlpstfMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT:
        return basicSetEdgStfMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT:
        return basicSetTorStfMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT:
        return basicSetAxiStfMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT:
        return basicSetCgOffsMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT:
        return basicSetScOffsMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT:
        return basicSetTcOffsMult(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__NSELT:
        return basicSetNSelt(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC:
        return basicSetElLoc(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT:
        return basicSetTwrSupport(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH:
        return basicSetTwrAttach(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES:
        return basicSetTwrWires(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH:
        return basicSetNodeAttach(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF:
        return basicSetWireStiff(null, msgs);
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE:
        return basicSetWireAngle(null, msgs);
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
      case BmodesbmiPackage.MODEL_BMODESBMI__HEAD:
        return getHead();
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC:
        return getSec();
      case BmodesbmiPackage.MODEL_BMODESBMI__ECHO:
        return getEcho();
      case BmodesbmiPackage.MODEL_BMODESBMI__TYPE:
        return getType();
      case BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL:
        return getInfModel();
      case BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL:
        return getIndModel();
      case BmodesbmiPackage.MODEL_BMODESBMI__ATOLER:
        return getAtoler();
      case BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL:
        return getTLModel();
      case BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL:
        return getHLModel();
      case BmodesbmiPackage.MODEL_BMODESBMI__BL_THP:
        return getBlThp();
      case BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN:
        return getHubConn();
      case BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR:
        return getModePr();
      case BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM:
        return getTabDelim();
      case BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW:
        return getMidNodeTw();
      case BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS:
        return getTipMass();
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC:
        return getCmLoc();
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL:
        return getCmAxial();
      case BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP:
        return getIxxTip();
      case BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP:
        return getIyyTip();
      case BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP:
        return getIzzTip();
      case BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP:
        return getIxyTip();
      case BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP:
        return getIzxTip();
      case BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP:
        return getIyzTip();
      case BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT:
        return getIdMat();
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE:
        return getSecFile();
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT:
        return getSecMasMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT:
        return getFlpInrMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT:
        return getLagInrMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT:
        return getFlpstfMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT:
        return getEdgStfMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT:
        return getTorStfMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT:
        return getAxiStfMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT:
        return getCgOffsMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT:
        return getScOffsMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT:
        return getTcOffsMult();
      case BmodesbmiPackage.MODEL_BMODESBMI__NSELT:
        return getNSelt();
      case BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC:
        return getElLoc();
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT:
        return getTwrSupport();
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH:
        return getTwrAttach();
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES:
        return getTwrWires();
      case BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH:
        return getNodeAttach();
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF:
        return getWireStiff();
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE:
        return getWireAngle();
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
      case BmodesbmiPackage.MODEL_BMODESBMI__HEAD:
        setHead((Header)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC:
        getSec().clear();
        getSec().addAll((Collection<? extends Section>)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__ECHO:
        setEcho((bEcho)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TYPE:
        setType((iBeamType)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL:
        setInfModel((nRotRpm)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL:
        setIndModel((nRpmMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__ATOLER:
        setAtoler((nRadius)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL:
        setTLModel((nHubRad)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL:
        setHLModel((nPrecone)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__BL_THP:
        setBlThp((nBlThp)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN:
        setHubConn((iHubConn)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR:
        setModePr((iModePr)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM:
        setTabDelim((bTabDelim)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW:
        setMidNodeTw((bMidNodeTw)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS:
        setTipMass((nTipMass)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC:
        setCmLoc((nCmLoc)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL:
        setCmAxial((nCmAxial)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP:
        setIxxTip((nIxxTip)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP:
        setIyyTip((nIyyTip)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP:
        setIzzTip((nIzzTip)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP:
        setIxyTip((nIxyTip)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP:
        setIzxTip((nIzxTip)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP:
        setIyzTip((nIyzTip)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT:
        setIdMat((iIdMat)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE:
        setSecFile((iSecFile)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT:
        setSecMasMult((nSecMasMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT:
        setFlpInrMult((nFlpInrMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT:
        setLagInrMult((nLagInrMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT:
        setFlpstfMult((nFlpstfMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT:
        setEdgStfMult((nEdgStfMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT:
        setTorStfMult((nTorStfMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT:
        setAxiStfMult((nAxiStfMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT:
        setCgOffsMult((nCgOffsMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT:
        setScOffsMult((nScOffsMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT:
        setTcOffsMult((nTcOffsMult)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__NSELT:
        setNSelt((iNSelt)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC:
        setElLoc((aElLoc)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT:
        setTwrSupport((iTwrSupport)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH:
        setTwrAttach((iTwrAttach)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES:
        setTwrWires((aTwrWires)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH:
        setNodeAttach((aNodeAttach)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF:
        setWireStiff((aWireStiff)newValue);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE:
        setWireAngle((aWireAngle)newValue);
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
      case BmodesbmiPackage.MODEL_BMODESBMI__HEAD:
        setHead((Header)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC:
        getSec().clear();
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__ECHO:
        setEcho((bEcho)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TYPE:
        setType((iBeamType)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL:
        setInfModel((nRotRpm)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL:
        setIndModel((nRpmMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__ATOLER:
        setAtoler((nRadius)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL:
        setTLModel((nHubRad)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL:
        setHLModel((nPrecone)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__BL_THP:
        setBlThp((nBlThp)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN:
        setHubConn((iHubConn)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR:
        setModePr((iModePr)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM:
        setTabDelim((bTabDelim)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW:
        setMidNodeTw((bMidNodeTw)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS:
        setTipMass((nTipMass)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC:
        setCmLoc((nCmLoc)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL:
        setCmAxial((nCmAxial)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP:
        setIxxTip((nIxxTip)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP:
        setIyyTip((nIyyTip)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP:
        setIzzTip((nIzzTip)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP:
        setIxyTip((nIxyTip)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP:
        setIzxTip((nIzxTip)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP:
        setIyzTip((nIyzTip)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT:
        setIdMat((iIdMat)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE:
        setSecFile((iSecFile)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT:
        setSecMasMult((nSecMasMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT:
        setFlpInrMult((nFlpInrMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT:
        setLagInrMult((nLagInrMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT:
        setFlpstfMult((nFlpstfMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT:
        setEdgStfMult((nEdgStfMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT:
        setTorStfMult((nTorStfMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT:
        setAxiStfMult((nAxiStfMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT:
        setCgOffsMult((nCgOffsMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT:
        setScOffsMult((nScOffsMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT:
        setTcOffsMult((nTcOffsMult)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__NSELT:
        setNSelt((iNSelt)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC:
        setElLoc((aElLoc)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT:
        setTwrSupport((iTwrSupport)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH:
        setTwrAttach((iTwrAttach)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES:
        setTwrWires((aTwrWires)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH:
        setNodeAttach((aNodeAttach)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF:
        setWireStiff((aWireStiff)null);
        return;
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE:
        setWireAngle((aWireAngle)null);
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
      case BmodesbmiPackage.MODEL_BMODESBMI__HEAD:
        return head != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC:
        return sec != null && !sec.isEmpty();
      case BmodesbmiPackage.MODEL_BMODESBMI__ECHO:
        return echo != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TYPE:
        return type != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__INF_MODEL:
        return infModel != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__IND_MODEL:
        return indModel != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__ATOLER:
        return atoler != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TL_MODEL:
        return tlModel != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__HL_MODEL:
        return hlModel != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__BL_THP:
        return blThp != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__HUB_CONN:
        return hubConn != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__MODE_PR:
        return modePr != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TAB_DELIM:
        return tabDelim != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__MID_NODE_TW:
        return midNodeTw != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TIP_MASS:
        return tipMass != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_LOC:
        return cmLoc != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__CM_AXIAL:
        return cmAxial != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__IXX_TIP:
        return ixxTip != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__IYY_TIP:
        return iyyTip != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__IZZ_TIP:
        return izzTip != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__IXY_TIP:
        return ixyTip != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__IZX_TIP:
        return izxTip != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__IYZ_TIP:
        return iyzTip != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__ID_MAT:
        return idMat != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_FILE:
        return secFile != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__SEC_MAS_MULT:
        return secMasMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__FLP_INR_MULT:
        return flpInrMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__LAG_INR_MULT:
        return lagInrMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__FLPSTF_MULT:
        return flpstfMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__EDG_STF_MULT:
        return edgStfMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TOR_STF_MULT:
        return torStfMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__AXI_STF_MULT:
        return axiStfMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__CG_OFFS_MULT:
        return cgOffsMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__SC_OFFS_MULT:
        return scOffsMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TC_OFFS_MULT:
        return tcOffsMult != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__NSELT:
        return nSelt != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__EL_LOC:
        return elLoc != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_SUPPORT:
        return twrSupport != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_ATTACH:
        return twrAttach != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__TWR_WIRES:
        return twrWires != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__NODE_ATTACH:
        return nodeAttach != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_STIFF:
        return wireStiff != null;
      case BmodesbmiPackage.MODEL_BMODESBMI__WIRE_ANGLE:
        return wireAngle != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelBmodesbmiImpl
