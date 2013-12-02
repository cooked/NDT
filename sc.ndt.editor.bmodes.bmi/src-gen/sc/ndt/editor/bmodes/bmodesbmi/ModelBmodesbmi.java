/**
 */
package sc.ndt.editor.bmodes.bmodesbmi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Bmodesbmi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSec <em>Sec</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getEcho <em>Echo</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getBeamType <em>Beam Type</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRotRpm <em>Rot Rpm</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRpmMult <em>Rpm Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRadius <em>Radius</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHubRad <em>Hub Rad</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getPreCone <em>Pre Cone</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getBlThp <em>Bl Thp</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHubConn <em>Hub Conn</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getModePr <em>Mode Pr</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTabDelim <em>Tab Delim</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getMidNodeTw <em>Mid Node Tw</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTipMass <em>Tip Mass</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCmLoc <em>Cm Loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCmAxial <em>Cm Axial</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIxxTip <em>Ixx Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIyyTip <em>Iyy Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIzzTip <em>Izz Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIxyTip <em>Ixy Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIzxTip <em>Izx Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIyzTip <em>Iyz Tip</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIdMat <em>Id Mat</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSecFile <em>Sec File</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSecMasMult <em>Sec Mas Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getFlpInrMult <em>Flp Inr Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getLagInrMult <em>Lag Inr Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getFlpstfMult <em>Flpstf Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getEdgStfMult <em>Edg Stf Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTorStfMult <em>Tor Stf Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getAxiStfMult <em>Axi Stf Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCgOffsMult <em>Cg Offs Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getScOffsMult <em>Sc Offs Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTcOffsMult <em>Tc Offs Mult</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getNSelt <em>NSelt</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getElLoc <em>El Loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrSupport <em>Twr Support</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrAttach <em>Twr Attach</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrWires <em>Twr Wires</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getNodeAttach <em>Node Attach</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getWireStiff <em>Wire Stiff</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getWireAngle <em>Wire Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi()
 * @model
 * @generated
 */
public interface ModelBmodesbmi extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(Header)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_Head()
   * @model containment="true"
   * @generated
   */
  Header getHead();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Header value);

  /**
   * Returns the value of the '<em><b>Sec</b></em>' containment reference list.
   * The list contents are of type {@link sc.ndt.editor.bmodes.bmodesbmi.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sec</em>' containment reference list.
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_Sec()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSec();

  /**
   * Returns the value of the '<em><b>Echo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Echo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Echo</em>' containment reference.
   * @see #setEcho(bEcho)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_Echo()
   * @model containment="true"
   * @generated
   */
  bEcho getEcho();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getEcho <em>Echo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Echo</em>' containment reference.
   * @see #getEcho()
   * @generated
   */
  void setEcho(bEcho value);

  /**
   * Returns the value of the '<em><b>Beam Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beam Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beam Type</em>' containment reference.
   * @see #setBeamType(iBeamType)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_BeamType()
   * @model containment="true"
   * @generated
   */
  iBeamType getBeamType();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getBeamType <em>Beam Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beam Type</em>' containment reference.
   * @see #getBeamType()
   * @generated
   */
  void setBeamType(iBeamType value);

  /**
   * Returns the value of the '<em><b>Rot Rpm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rot Rpm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rot Rpm</em>' containment reference.
   * @see #setRotRpm(nRotRpm)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_RotRpm()
   * @model containment="true"
   * @generated
   */
  nRotRpm getRotRpm();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRotRpm <em>Rot Rpm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rot Rpm</em>' containment reference.
   * @see #getRotRpm()
   * @generated
   */
  void setRotRpm(nRotRpm value);

  /**
   * Returns the value of the '<em><b>Rpm Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rpm Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rpm Mult</em>' containment reference.
   * @see #setRpmMult(nRpmMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_RpmMult()
   * @model containment="true"
   * @generated
   */
  nRpmMult getRpmMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRpmMult <em>Rpm Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rpm Mult</em>' containment reference.
   * @see #getRpmMult()
   * @generated
   */
  void setRpmMult(nRpmMult value);

  /**
   * Returns the value of the '<em><b>Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radius</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radius</em>' containment reference.
   * @see #setRadius(nRadius)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_Radius()
   * @model containment="true"
   * @generated
   */
  nRadius getRadius();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRadius <em>Radius</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius</em>' containment reference.
   * @see #getRadius()
   * @generated
   */
  void setRadius(nRadius value);

  /**
   * Returns the value of the '<em><b>Hub Rad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub Rad</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub Rad</em>' containment reference.
   * @see #setHubRad(nHubRad)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_HubRad()
   * @model containment="true"
   * @generated
   */
  nHubRad getHubRad();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHubRad <em>Hub Rad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub Rad</em>' containment reference.
   * @see #getHubRad()
   * @generated
   */
  void setHubRad(nHubRad value);

  /**
   * Returns the value of the '<em><b>Pre Cone</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Cone</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Cone</em>' containment reference.
   * @see #setPreCone(nPrecone)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_PreCone()
   * @model containment="true"
   * @generated
   */
  nPrecone getPreCone();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getPreCone <em>Pre Cone</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Cone</em>' containment reference.
   * @see #getPreCone()
   * @generated
   */
  void setPreCone(nPrecone value);

  /**
   * Returns the value of the '<em><b>Bl Thp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bl Thp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bl Thp</em>' containment reference.
   * @see #setBlThp(nBlThp)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_BlThp()
   * @model containment="true"
   * @generated
   */
  nBlThp getBlThp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getBlThp <em>Bl Thp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl Thp</em>' containment reference.
   * @see #getBlThp()
   * @generated
   */
  void setBlThp(nBlThp value);

  /**
   * Returns the value of the '<em><b>Hub Conn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub Conn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub Conn</em>' containment reference.
   * @see #setHubConn(iHubConn)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_HubConn()
   * @model containment="true"
   * @generated
   */
  iHubConn getHubConn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHubConn <em>Hub Conn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub Conn</em>' containment reference.
   * @see #getHubConn()
   * @generated
   */
  void setHubConn(iHubConn value);

  /**
   * Returns the value of the '<em><b>Mode Pr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode Pr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode Pr</em>' containment reference.
   * @see #setModePr(iModePr)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_ModePr()
   * @model containment="true"
   * @generated
   */
  iModePr getModePr();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getModePr <em>Mode Pr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode Pr</em>' containment reference.
   * @see #getModePr()
   * @generated
   */
  void setModePr(iModePr value);

  /**
   * Returns the value of the '<em><b>Tab Delim</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tab Delim</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tab Delim</em>' containment reference.
   * @see #setTabDelim(bTabDelim)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_TabDelim()
   * @model containment="true"
   * @generated
   */
  bTabDelim getTabDelim();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTabDelim <em>Tab Delim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tab Delim</em>' containment reference.
   * @see #getTabDelim()
   * @generated
   */
  void setTabDelim(bTabDelim value);

  /**
   * Returns the value of the '<em><b>Mid Node Tw</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mid Node Tw</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mid Node Tw</em>' containment reference.
   * @see #setMidNodeTw(bMidNodeTw)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_MidNodeTw()
   * @model containment="true"
   * @generated
   */
  bMidNodeTw getMidNodeTw();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getMidNodeTw <em>Mid Node Tw</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mid Node Tw</em>' containment reference.
   * @see #getMidNodeTw()
   * @generated
   */
  void setMidNodeTw(bMidNodeTw value);

  /**
   * Returns the value of the '<em><b>Tip Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tip Mass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tip Mass</em>' containment reference.
   * @see #setTipMass(nTipMass)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_TipMass()
   * @model containment="true"
   * @generated
   */
  nTipMass getTipMass();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTipMass <em>Tip Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tip Mass</em>' containment reference.
   * @see #getTipMass()
   * @generated
   */
  void setTipMass(nTipMass value);

  /**
   * Returns the value of the '<em><b>Cm Loc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cm Loc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cm Loc</em>' containment reference.
   * @see #setCmLoc(nCmLoc)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_CmLoc()
   * @model containment="true"
   * @generated
   */
  nCmLoc getCmLoc();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCmLoc <em>Cm Loc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cm Loc</em>' containment reference.
   * @see #getCmLoc()
   * @generated
   */
  void setCmLoc(nCmLoc value);

  /**
   * Returns the value of the '<em><b>Cm Axial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cm Axial</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cm Axial</em>' containment reference.
   * @see #setCmAxial(nCmAxial)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_CmAxial()
   * @model containment="true"
   * @generated
   */
  nCmAxial getCmAxial();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCmAxial <em>Cm Axial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cm Axial</em>' containment reference.
   * @see #getCmAxial()
   * @generated
   */
  void setCmAxial(nCmAxial value);

  /**
   * Returns the value of the '<em><b>Ixx Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ixx Tip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ixx Tip</em>' containment reference.
   * @see #setIxxTip(nIxxTip)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_IxxTip()
   * @model containment="true"
   * @generated
   */
  nIxxTip getIxxTip();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIxxTip <em>Ixx Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ixx Tip</em>' containment reference.
   * @see #getIxxTip()
   * @generated
   */
  void setIxxTip(nIxxTip value);

  /**
   * Returns the value of the '<em><b>Iyy Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iyy Tip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iyy Tip</em>' containment reference.
   * @see #setIyyTip(nIyyTip)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_IyyTip()
   * @model containment="true"
   * @generated
   */
  nIyyTip getIyyTip();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIyyTip <em>Iyy Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iyy Tip</em>' containment reference.
   * @see #getIyyTip()
   * @generated
   */
  void setIyyTip(nIyyTip value);

  /**
   * Returns the value of the '<em><b>Izz Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Izz Tip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Izz Tip</em>' containment reference.
   * @see #setIzzTip(nIzzTip)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_IzzTip()
   * @model containment="true"
   * @generated
   */
  nIzzTip getIzzTip();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIzzTip <em>Izz Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Izz Tip</em>' containment reference.
   * @see #getIzzTip()
   * @generated
   */
  void setIzzTip(nIzzTip value);

  /**
   * Returns the value of the '<em><b>Ixy Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ixy Tip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ixy Tip</em>' containment reference.
   * @see #setIxyTip(nIxyTip)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_IxyTip()
   * @model containment="true"
   * @generated
   */
  nIxyTip getIxyTip();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIxyTip <em>Ixy Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ixy Tip</em>' containment reference.
   * @see #getIxyTip()
   * @generated
   */
  void setIxyTip(nIxyTip value);

  /**
   * Returns the value of the '<em><b>Izx Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Izx Tip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Izx Tip</em>' containment reference.
   * @see #setIzxTip(nIzxTip)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_IzxTip()
   * @model containment="true"
   * @generated
   */
  nIzxTip getIzxTip();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIzxTip <em>Izx Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Izx Tip</em>' containment reference.
   * @see #getIzxTip()
   * @generated
   */
  void setIzxTip(nIzxTip value);

  /**
   * Returns the value of the '<em><b>Iyz Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iyz Tip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iyz Tip</em>' containment reference.
   * @see #setIyzTip(nIyzTip)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_IyzTip()
   * @model containment="true"
   * @generated
   */
  nIyzTip getIyzTip();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIyzTip <em>Iyz Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iyz Tip</em>' containment reference.
   * @see #getIyzTip()
   * @generated
   */
  void setIyzTip(nIyzTip value);

  /**
   * Returns the value of the '<em><b>Id Mat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Mat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Mat</em>' containment reference.
   * @see #setIdMat(iIdMat)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_IdMat()
   * @model containment="true"
   * @generated
   */
  iIdMat getIdMat();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIdMat <em>Id Mat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Mat</em>' containment reference.
   * @see #getIdMat()
   * @generated
   */
  void setIdMat(iIdMat value);

  /**
   * Returns the value of the '<em><b>Sec File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sec File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sec File</em>' containment reference.
   * @see #setSecFile(iSecFile)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_SecFile()
   * @model containment="true"
   * @generated
   */
  iSecFile getSecFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSecFile <em>Sec File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sec File</em>' containment reference.
   * @see #getSecFile()
   * @generated
   */
  void setSecFile(iSecFile value);

  /**
   * Returns the value of the '<em><b>Sec Mas Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sec Mas Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sec Mas Mult</em>' containment reference.
   * @see #setSecMasMult(nSecMasMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_SecMasMult()
   * @model containment="true"
   * @generated
   */
  nSecMasMult getSecMasMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSecMasMult <em>Sec Mas Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sec Mas Mult</em>' containment reference.
   * @see #getSecMasMult()
   * @generated
   */
  void setSecMasMult(nSecMasMult value);

  /**
   * Returns the value of the '<em><b>Flp Inr Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flp Inr Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flp Inr Mult</em>' containment reference.
   * @see #setFlpInrMult(nFlpInrMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_FlpInrMult()
   * @model containment="true"
   * @generated
   */
  nFlpInrMult getFlpInrMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getFlpInrMult <em>Flp Inr Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flp Inr Mult</em>' containment reference.
   * @see #getFlpInrMult()
   * @generated
   */
  void setFlpInrMult(nFlpInrMult value);

  /**
   * Returns the value of the '<em><b>Lag Inr Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lag Inr Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lag Inr Mult</em>' containment reference.
   * @see #setLagInrMult(nLagInrMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_LagInrMult()
   * @model containment="true"
   * @generated
   */
  nLagInrMult getLagInrMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getLagInrMult <em>Lag Inr Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lag Inr Mult</em>' containment reference.
   * @see #getLagInrMult()
   * @generated
   */
  void setLagInrMult(nLagInrMult value);

  /**
   * Returns the value of the '<em><b>Flpstf Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flpstf Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flpstf Mult</em>' containment reference.
   * @see #setFlpstfMult(nFlpstfMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_FlpstfMult()
   * @model containment="true"
   * @generated
   */
  nFlpstfMult getFlpstfMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getFlpstfMult <em>Flpstf Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flpstf Mult</em>' containment reference.
   * @see #getFlpstfMult()
   * @generated
   */
  void setFlpstfMult(nFlpstfMult value);

  /**
   * Returns the value of the '<em><b>Edg Stf Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edg Stf Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edg Stf Mult</em>' containment reference.
   * @see #setEdgStfMult(nEdgStfMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_EdgStfMult()
   * @model containment="true"
   * @generated
   */
  nEdgStfMult getEdgStfMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getEdgStfMult <em>Edg Stf Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edg Stf Mult</em>' containment reference.
   * @see #getEdgStfMult()
   * @generated
   */
  void setEdgStfMult(nEdgStfMult value);

  /**
   * Returns the value of the '<em><b>Tor Stf Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tor Stf Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tor Stf Mult</em>' containment reference.
   * @see #setTorStfMult(nTorStfMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_TorStfMult()
   * @model containment="true"
   * @generated
   */
  nTorStfMult getTorStfMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTorStfMult <em>Tor Stf Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tor Stf Mult</em>' containment reference.
   * @see #getTorStfMult()
   * @generated
   */
  void setTorStfMult(nTorStfMult value);

  /**
   * Returns the value of the '<em><b>Axi Stf Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axi Stf Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axi Stf Mult</em>' containment reference.
   * @see #setAxiStfMult(nAxiStfMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_AxiStfMult()
   * @model containment="true"
   * @generated
   */
  nAxiStfMult getAxiStfMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getAxiStfMult <em>Axi Stf Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axi Stf Mult</em>' containment reference.
   * @see #getAxiStfMult()
   * @generated
   */
  void setAxiStfMult(nAxiStfMult value);

  /**
   * Returns the value of the '<em><b>Cg Offs Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cg Offs Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cg Offs Mult</em>' containment reference.
   * @see #setCgOffsMult(nCgOffsMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_CgOffsMult()
   * @model containment="true"
   * @generated
   */
  nCgOffsMult getCgOffsMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCgOffsMult <em>Cg Offs Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cg Offs Mult</em>' containment reference.
   * @see #getCgOffsMult()
   * @generated
   */
  void setCgOffsMult(nCgOffsMult value);

  /**
   * Returns the value of the '<em><b>Sc Offs Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sc Offs Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sc Offs Mult</em>' containment reference.
   * @see #setScOffsMult(nScOffsMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_ScOffsMult()
   * @model containment="true"
   * @generated
   */
  nScOffsMult getScOffsMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getScOffsMult <em>Sc Offs Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sc Offs Mult</em>' containment reference.
   * @see #getScOffsMult()
   * @generated
   */
  void setScOffsMult(nScOffsMult value);

  /**
   * Returns the value of the '<em><b>Tc Offs Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tc Offs Mult</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tc Offs Mult</em>' containment reference.
   * @see #setTcOffsMult(nTcOffsMult)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_TcOffsMult()
   * @model containment="true"
   * @generated
   */
  nTcOffsMult getTcOffsMult();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTcOffsMult <em>Tc Offs Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tc Offs Mult</em>' containment reference.
   * @see #getTcOffsMult()
   * @generated
   */
  void setTcOffsMult(nTcOffsMult value);

  /**
   * Returns the value of the '<em><b>NSelt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>NSelt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>NSelt</em>' containment reference.
   * @see #setNSelt(iNSelt)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_NSelt()
   * @model containment="true"
   * @generated
   */
  iNSelt getNSelt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getNSelt <em>NSelt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NSelt</em>' containment reference.
   * @see #getNSelt()
   * @generated
   */
  void setNSelt(iNSelt value);

  /**
   * Returns the value of the '<em><b>El Loc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El Loc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El Loc</em>' containment reference.
   * @see #setElLoc(aElLoc)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_ElLoc()
   * @model containment="true"
   * @generated
   */
  aElLoc getElLoc();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getElLoc <em>El Loc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El Loc</em>' containment reference.
   * @see #getElLoc()
   * @generated
   */
  void setElLoc(aElLoc value);

  /**
   * Returns the value of the '<em><b>Twr Support</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr Support</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr Support</em>' containment reference.
   * @see #setTwrSupport(iTwrSupport)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_TwrSupport()
   * @model containment="true"
   * @generated
   */
  iTwrSupport getTwrSupport();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrSupport <em>Twr Support</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr Support</em>' containment reference.
   * @see #getTwrSupport()
   * @generated
   */
  void setTwrSupport(iTwrSupport value);

  /**
   * Returns the value of the '<em><b>Twr Attach</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr Attach</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr Attach</em>' containment reference.
   * @see #setTwrAttach(iTwrAttach)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_TwrAttach()
   * @model containment="true"
   * @generated
   */
  iTwrAttach getTwrAttach();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrAttach <em>Twr Attach</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr Attach</em>' containment reference.
   * @see #getTwrAttach()
   * @generated
   */
  void setTwrAttach(iTwrAttach value);

  /**
   * Returns the value of the '<em><b>Twr Wires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr Wires</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr Wires</em>' containment reference.
   * @see #setTwrWires(aTwrWires)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_TwrWires()
   * @model containment="true"
   * @generated
   */
  aTwrWires getTwrWires();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrWires <em>Twr Wires</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr Wires</em>' containment reference.
   * @see #getTwrWires()
   * @generated
   */
  void setTwrWires(aTwrWires value);

  /**
   * Returns the value of the '<em><b>Node Attach</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Attach</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Attach</em>' containment reference.
   * @see #setNodeAttach(aNodeAttach)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_NodeAttach()
   * @model containment="true"
   * @generated
   */
  aNodeAttach getNodeAttach();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getNodeAttach <em>Node Attach</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Attach</em>' containment reference.
   * @see #getNodeAttach()
   * @generated
   */
  void setNodeAttach(aNodeAttach value);

  /**
   * Returns the value of the '<em><b>Wire Stiff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wire Stiff</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wire Stiff</em>' containment reference.
   * @see #setWireStiff(aWireStiff)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_WireStiff()
   * @model containment="true"
   * @generated
   */
  aWireStiff getWireStiff();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getWireStiff <em>Wire Stiff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wire Stiff</em>' containment reference.
   * @see #getWireStiff()
   * @generated
   */
  void setWireStiff(aWireStiff value);

  /**
   * Returns the value of the '<em><b>Wire Angle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wire Angle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wire Angle</em>' containment reference.
   * @see #setWireAngle(aWireAngle)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getModelBmodesbmi_WireAngle()
   * @model containment="true"
   * @generated
   */
  aWireAngle getWireAngle();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getWireAngle <em>Wire Angle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wire Angle</em>' containment reference.
   * @see #getWireAngle()
   * @generated
   */
  void setWireAngle(aWireAngle value);

} // ModelBmodesbmi
