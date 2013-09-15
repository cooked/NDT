/**
 */
package sc.ndt.editor.fast.fastfst;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Fastfst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getEcho <em>Echo</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADAMSPrep <em>ADAMS Prep</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAnalMode <em>Anal Mode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNumBl <em>Num Bl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTMax <em>TMax</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDT <em>DT</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYCMode <em>YC Mode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYCOn <em>TYC On</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPCMode <em>PC Mode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPCOn <em>TPC On</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVSContrl <em>VS Contrl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_RtGnSp <em>VS Rt Gn Sp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_RtTq <em>VS Rt Tq</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_Rgn2K <em>VS Rgn2 K</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_SlPc <em>VS Sl Pc</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenTiStr <em>Gen Ti Str</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenTiStp <em>Gen Ti Stp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSpdGenOn <em>Spd Gen On</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTimGenOn <em>Tim Gen On</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTimGenOf <em>Tim Gen Of</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrMode <em>HSS Br Mode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTHSSBrDp <em>THSS Br Dp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTiDynBrk <em>Ti Dyn Brk</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_1_ <em>TTp Br Dp 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_2_ <em>TTp Br Dp 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_3_ <em>TTp Br Dp 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_1_ <em>TB Dep ISp 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_2_ <em>TB Dep ISp 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_3_ <em>TB Dep ISp 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYawManS <em>TYaw Man S</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYawManE <em>TYaw Man E</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYawF <em>Nac Yaw F</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_1_ <em>TPit Man S1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_2_ <em>TPit Man S2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_3_ <em>TPit Man S3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_1_ <em>TPit Man E1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_2_ <em>TPit Man E2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_3_ <em>TPit Man E3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_1_ <em>Bl Pitch 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_2_ <em>Bl Pitch 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_3_ <em>Bl Pitch 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_1_ <em>Bl Pitch F1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_2_ <em>Bl Pitch F2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_3_ <em>Bl Pitch F3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGravity <em>Gravity</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFlapDOF1 <em>Flap DOF1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFlapDOF2 <em>Flap DOF2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getEdgeDOF <em>Edge DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDOF <em>Teet DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDrTrDOF <em>Dr Tr DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenDOF <em>Gen DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawDOF <em>Yaw DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwFADOF1 <em>Tw FADOF1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwFADOF2 <em>Tw FADOF2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwSSDOF1 <em>Tw SSDOF1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwSSDOF2 <em>Tw SSDOF2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getCompAero <em>Comp Aero</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getCompNoise <em>Comp Noise</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOoPDefl <em>Oo PDefl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getIPDefl <em>IP Defl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDefl <em>Teet Defl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getRotSpeed <em>Rot Speed</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYaw <em>Nac Yaw</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTDspFA <em>TT Dsp FA</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTDspSS <em>TT Dsp SS</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipRad <em>Tip Rad</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubRad <em>Hub Rad</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPSpnElN <em>PSpn El N</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getUndSling <em>Und Sling</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubCM <em>Hub CM</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOverHang <em>Over Hang</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMxn <em>Nac CMxn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMyn <em>Nac CMyn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMzn <em>Nac CMzn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTowerHt <em>Tower Ht</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwr2Shft <em>Twr2 Shft</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrRBHt <em>Twr RB Ht</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getShftTilt <em>Shft Tilt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDelta3 <em>Delta3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_1_ <em>Pre Cone 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_2_ <em>Pre Cone 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_3_ <em>Pre Cone 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAzimB1Up <em>Azim B1 Up</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawBrMass <em>Yaw Br Mass</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacMass <em>Nac Mass</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubMass <em>Hub Mass</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_1_ <em>Tip Mass 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_2_ <em>Tip Mass 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_3_ <em>Tip Mass 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYIner <em>Nac YIner</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenIner <em>Gen Iner</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubIner <em>Hub Iner</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBoxEff <em>GBox Eff</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenEff <em>Gen Eff</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBRatio <em>GB Ratio</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBRevers <em>GB Revers</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrTqF <em>HSS Br Tq F</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrDT <em>HSS Br DT</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDynBrkFi <em>Dyn Brk Fi</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDTTorSpr <em>DT Tor Spr</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDTTorDmp <em>DT Tor Dmp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_SlPc <em>SIG Sl Pc</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_SySp <em>SIG Sy Sp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_RtTq <em>SIG Rt Tq</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_PORt <em>SIG PO Rt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Freq <em>TEC Freq</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Npol <em>TEC Npol</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Sres <em>TEC Sres</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Rres <em>TEC Rres</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_VLL <em>TEC VLL</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_SLR <em>TEC SLR</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_RLR <em>TEC RLR</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_MR <em>TEC MR</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPtfmModel <em>Ptfm Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPtfmFile <em>Ptfm File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrNodes <em>Twr Nodes</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrFile <em>Twr File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawSpr <em>Yaw Spr</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawDamp <em>Yaw Damp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawNeut <em>Yaw Neut</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFurling <em>Furling</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFurlFile <em>Furl File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetMod <em>Teet Mod</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDmpP <em>Teet Dmp P</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDmp <em>Teet Dmp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetCDmp <em>Teet CDmp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetSStP <em>Teet SSt P</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetHStP <em>Teet HSt P</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetSSSp <em>Teet SS Sp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetHSSp <em>Teet HS Sp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDrConN <em>TB Dr Con N</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDrConD <em>TB Dr Con D</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTpBrDT <em>Tp Br DT</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_1_ <em>Bld File 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_2_ <em>Bld File 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_3_ <em>Bld File 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADFile <em>AD File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNoiseFile <em>Noise File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADAMSFile <em>ADAMS File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getLinFile <em>Lin File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSumPrint <em>Sum Print</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutFileFmt <em>Out File Fmt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTabDelim <em>Tab Delim</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutFmt <em>Out Fmt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTStart <em>TStart</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDecFact <em>Dec Fact</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSttsTime <em>Stts Time</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUxn <em>Nc IM Uxn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUyn <em>Nc IM Uyn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUzn <em>Nc IM Uzn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getShftGagL <em>Shft Gag L</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNTwGages <em>NTw Gages</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrGagNd <em>Twr Gag Nd</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNBlGages <em>NBl Gages</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldGagNd <em>Bld Gag Nd</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutList <em>Out List</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst()
 * @model
 * @generated
 */
public interface ModelFastfst extends EObject
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
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_Head()
   * @model containment="true"
   * @generated
   */
  Header getHead();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Header value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link sc.ndt.editor.fast.fastfst.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

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
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_Echo()
   * @model containment="true"
   * @generated
   */
  bEcho getEcho();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getEcho <em>Echo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Echo</em>' containment reference.
   * @see #getEcho()
   * @generated
   */
  void setEcho(bEcho value);

  /**
   * Returns the value of the '<em><b>ADAMS Prep</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ADAMS Prep</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ADAMS Prep</em>' containment reference.
   * @see #setADAMSPrep(iADAMSPrep)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_ADAMSPrep()
   * @model containment="true"
   * @generated
   */
  iADAMSPrep getADAMSPrep();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADAMSPrep <em>ADAMS Prep</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ADAMS Prep</em>' containment reference.
   * @see #getADAMSPrep()
   * @generated
   */
  void setADAMSPrep(iADAMSPrep value);

  /**
   * Returns the value of the '<em><b>Anal Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anal Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anal Mode</em>' containment reference.
   * @see #setAnalMode(iAnalMode)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_AnalMode()
   * @model containment="true"
   * @generated
   */
  iAnalMode getAnalMode();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAnalMode <em>Anal Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anal Mode</em>' containment reference.
   * @see #getAnalMode()
   * @generated
   */
  void setAnalMode(iAnalMode value);

  /**
   * Returns the value of the '<em><b>Num Bl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Bl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Bl</em>' containment reference.
   * @see #setNumBl(iNumBl)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NumBl()
   * @model containment="true"
   * @generated
   */
  iNumBl getNumBl();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNumBl <em>Num Bl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Bl</em>' containment reference.
   * @see #getNumBl()
   * @generated
   */
  void setNumBl(iNumBl value);

  /**
   * Returns the value of the '<em><b>TMax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TMax</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TMax</em>' containment reference.
   * @see #setTMax(nTMax)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TMax()
   * @model containment="true"
   * @generated
   */
  nTMax getTMax();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTMax <em>TMax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TMax</em>' containment reference.
   * @see #getTMax()
   * @generated
   */
  void setTMax(nTMax value);

  /**
   * Returns the value of the '<em><b>DT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DT</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DT</em>' containment reference.
   * @see #setDT(nDT)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_DT()
   * @model containment="true"
   * @generated
   */
  nDT getDT();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDT <em>DT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DT</em>' containment reference.
   * @see #getDT()
   * @generated
   */
  void setDT(nDT value);

  /**
   * Returns the value of the '<em><b>YC Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>YC Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>YC Mode</em>' containment reference.
   * @see #setYCMode(iYCMode)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_YCMode()
   * @model containment="true"
   * @generated
   */
  iYCMode getYCMode();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYCMode <em>YC Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>YC Mode</em>' containment reference.
   * @see #getYCMode()
   * @generated
   */
  void setYCMode(iYCMode value);

  /**
   * Returns the value of the '<em><b>TYC On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TYC On</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TYC On</em>' containment reference.
   * @see #setTYCOn(nTYCOn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TYCOn()
   * @model containment="true"
   * @generated
   */
  nTYCOn getTYCOn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYCOn <em>TYC On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TYC On</em>' containment reference.
   * @see #getTYCOn()
   * @generated
   */
  void setTYCOn(nTYCOn value);

  /**
   * Returns the value of the '<em><b>PC Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PC Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PC Mode</em>' containment reference.
   * @see #setPCMode(iPCMode)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_PCMode()
   * @model containment="true"
   * @generated
   */
  iPCMode getPCMode();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPCMode <em>PC Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PC Mode</em>' containment reference.
   * @see #getPCMode()
   * @generated
   */
  void setPCMode(iPCMode value);

  /**
   * Returns the value of the '<em><b>TPC On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TPC On</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TPC On</em>' containment reference.
   * @see #setTPCOn(nTPCOn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TPCOn()
   * @model containment="true"
   * @generated
   */
  nTPCOn getTPCOn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPCOn <em>TPC On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TPC On</em>' containment reference.
   * @see #getTPCOn()
   * @generated
   */
  void setTPCOn(nTPCOn value);

  /**
   * Returns the value of the '<em><b>VS Contrl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VS Contrl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VS Contrl</em>' containment reference.
   * @see #setVSContrl(iVSContrl)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_VSContrl()
   * @model containment="true"
   * @generated
   */
  iVSContrl getVSContrl();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVSContrl <em>VS Contrl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VS Contrl</em>' containment reference.
   * @see #getVSContrl()
   * @generated
   */
  void setVSContrl(iVSContrl value);

  /**
   * Returns the value of the '<em><b>VS Rt Gn Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VS Rt Gn Sp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VS Rt Gn Sp</em>' containment reference.
   * @see #setVS_RtGnSp(nVS_RtGnSp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_VS_RtGnSp()
   * @model containment="true"
   * @generated
   */
  nVS_RtGnSp getVS_RtGnSp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_RtGnSp <em>VS Rt Gn Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VS Rt Gn Sp</em>' containment reference.
   * @see #getVS_RtGnSp()
   * @generated
   */
  void setVS_RtGnSp(nVS_RtGnSp value);

  /**
   * Returns the value of the '<em><b>VS Rt Tq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VS Rt Tq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VS Rt Tq</em>' containment reference.
   * @see #setVS_RtTq(nVS_RtTq)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_VS_RtTq()
   * @model containment="true"
   * @generated
   */
  nVS_RtTq getVS_RtTq();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_RtTq <em>VS Rt Tq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VS Rt Tq</em>' containment reference.
   * @see #getVS_RtTq()
   * @generated
   */
  void setVS_RtTq(nVS_RtTq value);

  /**
   * Returns the value of the '<em><b>VS Rgn2 K</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VS Rgn2 K</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VS Rgn2 K</em>' containment reference.
   * @see #setVS_Rgn2K(nVS_Rgn2K)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_VS_Rgn2K()
   * @model containment="true"
   * @generated
   */
  nVS_Rgn2K getVS_Rgn2K();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_Rgn2K <em>VS Rgn2 K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VS Rgn2 K</em>' containment reference.
   * @see #getVS_Rgn2K()
   * @generated
   */
  void setVS_Rgn2K(nVS_Rgn2K value);

  /**
   * Returns the value of the '<em><b>VS Sl Pc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VS Sl Pc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VS Sl Pc</em>' containment reference.
   * @see #setVS_SlPc(nVS_SlPc)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_VS_SlPc()
   * @model containment="true"
   * @generated
   */
  nVS_SlPc getVS_SlPc();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_SlPc <em>VS Sl Pc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VS Sl Pc</em>' containment reference.
   * @see #getVS_SlPc()
   * @generated
   */
  void setVS_SlPc(nVS_SlPc value);

  /**
   * Returns the value of the '<em><b>Gen Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Model</em>' containment reference.
   * @see #setGenModel(iGenModel)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GenModel()
   * @model containment="true"
   * @generated
   */
  iGenModel getGenModel();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenModel <em>Gen Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen Model</em>' containment reference.
   * @see #getGenModel()
   * @generated
   */
  void setGenModel(iGenModel value);

  /**
   * Returns the value of the '<em><b>Gen Ti Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen Ti Str</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Ti Str</em>' containment reference.
   * @see #setGenTiStr(bGenTiStr)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GenTiStr()
   * @model containment="true"
   * @generated
   */
  bGenTiStr getGenTiStr();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenTiStr <em>Gen Ti Str</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen Ti Str</em>' containment reference.
   * @see #getGenTiStr()
   * @generated
   */
  void setGenTiStr(bGenTiStr value);

  /**
   * Returns the value of the '<em><b>Gen Ti Stp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen Ti Stp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Ti Stp</em>' containment reference.
   * @see #setGenTiStp(bGenTiStp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GenTiStp()
   * @model containment="true"
   * @generated
   */
  bGenTiStp getGenTiStp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenTiStp <em>Gen Ti Stp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen Ti Stp</em>' containment reference.
   * @see #getGenTiStp()
   * @generated
   */
  void setGenTiStp(bGenTiStp value);

  /**
   * Returns the value of the '<em><b>Spd Gen On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spd Gen On</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spd Gen On</em>' containment reference.
   * @see #setSpdGenOn(nSpdGenOn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_SpdGenOn()
   * @model containment="true"
   * @generated
   */
  nSpdGenOn getSpdGenOn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSpdGenOn <em>Spd Gen On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spd Gen On</em>' containment reference.
   * @see #getSpdGenOn()
   * @generated
   */
  void setSpdGenOn(nSpdGenOn value);

  /**
   * Returns the value of the '<em><b>Tim Gen On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tim Gen On</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tim Gen On</em>' containment reference.
   * @see #setTimGenOn(nTimGenOn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TimGenOn()
   * @model containment="true"
   * @generated
   */
  nTimGenOn getTimGenOn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTimGenOn <em>Tim Gen On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tim Gen On</em>' containment reference.
   * @see #getTimGenOn()
   * @generated
   */
  void setTimGenOn(nTimGenOn value);

  /**
   * Returns the value of the '<em><b>Tim Gen Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tim Gen Of</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tim Gen Of</em>' containment reference.
   * @see #setTimGenOf(nTimGenOf)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TimGenOf()
   * @model containment="true"
   * @generated
   */
  nTimGenOf getTimGenOf();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTimGenOf <em>Tim Gen Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tim Gen Of</em>' containment reference.
   * @see #getTimGenOf()
   * @generated
   */
  void setTimGenOf(nTimGenOf value);

  /**
   * Returns the value of the '<em><b>HSS Br Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HSS Br Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HSS Br Mode</em>' containment reference.
   * @see #setHSSBrMode(iHSSBrMode)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_HSSBrMode()
   * @model containment="true"
   * @generated
   */
  iHSSBrMode getHSSBrMode();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrMode <em>HSS Br Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HSS Br Mode</em>' containment reference.
   * @see #getHSSBrMode()
   * @generated
   */
  void setHSSBrMode(iHSSBrMode value);

  /**
   * Returns the value of the '<em><b>THSS Br Dp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>THSS Br Dp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>THSS Br Dp</em>' containment reference.
   * @see #setTHSSBrDp(nTHSSBrDp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_THSSBrDp()
   * @model containment="true"
   * @generated
   */
  nTHSSBrDp getTHSSBrDp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTHSSBrDp <em>THSS Br Dp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>THSS Br Dp</em>' containment reference.
   * @see #getTHSSBrDp()
   * @generated
   */
  void setTHSSBrDp(nTHSSBrDp value);

  /**
   * Returns the value of the '<em><b>Ti Dyn Brk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ti Dyn Brk</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ti Dyn Brk</em>' containment reference.
   * @see #setTiDynBrk(nTiDynBrk)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TiDynBrk()
   * @model containment="true"
   * @generated
   */
  nTiDynBrk getTiDynBrk();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTiDynBrk <em>Ti Dyn Brk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ti Dyn Brk</em>' containment reference.
   * @see #getTiDynBrk()
   * @generated
   */
  void setTiDynBrk(nTiDynBrk value);

  /**
   * Returns the value of the '<em><b>TTp Br Dp 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TTp Br Dp 1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TTp Br Dp 1</em>' containment reference.
   * @see #setTTpBrDp_1_(nTTpBrDp_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TTpBrDp_1_()
   * @model containment="true"
   * @generated
   */
  nTTpBrDp_1_ getTTpBrDp_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_1_ <em>TTp Br Dp 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TTp Br Dp 1</em>' containment reference.
   * @see #getTTpBrDp_1_()
   * @generated
   */
  void setTTpBrDp_1_(nTTpBrDp_1_ value);

  /**
   * Returns the value of the '<em><b>TTp Br Dp 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TTp Br Dp 2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TTp Br Dp 2</em>' containment reference.
   * @see #setTTpBrDp_2_(nTTpBrDp_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TTpBrDp_2_()
   * @model containment="true"
   * @generated
   */
  nTTpBrDp_2_ getTTpBrDp_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_2_ <em>TTp Br Dp 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TTp Br Dp 2</em>' containment reference.
   * @see #getTTpBrDp_2_()
   * @generated
   */
  void setTTpBrDp_2_(nTTpBrDp_2_ value);

  /**
   * Returns the value of the '<em><b>TTp Br Dp 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TTp Br Dp 3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TTp Br Dp 3</em>' containment reference.
   * @see #setTTpBrDp_3_(nTTpBrDp_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TTpBrDp_3_()
   * @model containment="true"
   * @generated
   */
  nTTpBrDp_3_ getTTpBrDp_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_3_ <em>TTp Br Dp 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TTp Br Dp 3</em>' containment reference.
   * @see #getTTpBrDp_3_()
   * @generated
   */
  void setTTpBrDp_3_(nTTpBrDp_3_ value);

  /**
   * Returns the value of the '<em><b>TB Dep ISp 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TB Dep ISp 1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TB Dep ISp 1</em>' containment reference.
   * @see #setTBDepISp_1_(nTBDepISp_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TBDepISp_1_()
   * @model containment="true"
   * @generated
   */
  nTBDepISp_1_ getTBDepISp_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_1_ <em>TB Dep ISp 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TB Dep ISp 1</em>' containment reference.
   * @see #getTBDepISp_1_()
   * @generated
   */
  void setTBDepISp_1_(nTBDepISp_1_ value);

  /**
   * Returns the value of the '<em><b>TB Dep ISp 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TB Dep ISp 2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TB Dep ISp 2</em>' containment reference.
   * @see #setTBDepISp_2_(nTBDepISp_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TBDepISp_2_()
   * @model containment="true"
   * @generated
   */
  nTBDepISp_2_ getTBDepISp_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_2_ <em>TB Dep ISp 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TB Dep ISp 2</em>' containment reference.
   * @see #getTBDepISp_2_()
   * @generated
   */
  void setTBDepISp_2_(nTBDepISp_2_ value);

  /**
   * Returns the value of the '<em><b>TB Dep ISp 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TB Dep ISp 3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TB Dep ISp 3</em>' containment reference.
   * @see #setTBDepISp_3_(nTBDepISp_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TBDepISp_3_()
   * @model containment="true"
   * @generated
   */
  nTBDepISp_3_ getTBDepISp_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_3_ <em>TB Dep ISp 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TB Dep ISp 3</em>' containment reference.
   * @see #getTBDepISp_3_()
   * @generated
   */
  void setTBDepISp_3_(nTBDepISp_3_ value);

  /**
   * Returns the value of the '<em><b>TYaw Man S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TYaw Man S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TYaw Man S</em>' containment reference.
   * @see #setTYawManS(nTYawManS)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TYawManS()
   * @model containment="true"
   * @generated
   */
  nTYawManS getTYawManS();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYawManS <em>TYaw Man S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TYaw Man S</em>' containment reference.
   * @see #getTYawManS()
   * @generated
   */
  void setTYawManS(nTYawManS value);

  /**
   * Returns the value of the '<em><b>TYaw Man E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TYaw Man E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TYaw Man E</em>' containment reference.
   * @see #setTYawManE(nTYawManE)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TYawManE()
   * @model containment="true"
   * @generated
   */
  nTYawManE getTYawManE();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYawManE <em>TYaw Man E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TYaw Man E</em>' containment reference.
   * @see #getTYawManE()
   * @generated
   */
  void setTYawManE(nTYawManE value);

  /**
   * Returns the value of the '<em><b>Nac Yaw F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nac Yaw F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nac Yaw F</em>' containment reference.
   * @see #setNacYawF(nNacYawF)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NacYawF()
   * @model containment="true"
   * @generated
   */
  nNacYawF getNacYawF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYawF <em>Nac Yaw F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nac Yaw F</em>' containment reference.
   * @see #getNacYawF()
   * @generated
   */
  void setNacYawF(nNacYawF value);

  /**
   * Returns the value of the '<em><b>TPit Man S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TPit Man S1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TPit Man S1</em>' containment reference.
   * @see #setTPitManS_1_(nTPitManS_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TPitManS_1_()
   * @model containment="true"
   * @generated
   */
  nTPitManS_1_ getTPitManS_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_1_ <em>TPit Man S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TPit Man S1</em>' containment reference.
   * @see #getTPitManS_1_()
   * @generated
   */
  void setTPitManS_1_(nTPitManS_1_ value);

  /**
   * Returns the value of the '<em><b>TPit Man S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TPit Man S2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TPit Man S2</em>' containment reference.
   * @see #setTPitManS_2_(nTPitManS_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TPitManS_2_()
   * @model containment="true"
   * @generated
   */
  nTPitManS_2_ getTPitManS_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_2_ <em>TPit Man S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TPit Man S2</em>' containment reference.
   * @see #getTPitManS_2_()
   * @generated
   */
  void setTPitManS_2_(nTPitManS_2_ value);

  /**
   * Returns the value of the '<em><b>TPit Man S3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TPit Man S3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TPit Man S3</em>' containment reference.
   * @see #setTPitManS_3_(nTPitManS_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TPitManS_3_()
   * @model containment="true"
   * @generated
   */
  nTPitManS_3_ getTPitManS_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_3_ <em>TPit Man S3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TPit Man S3</em>' containment reference.
   * @see #getTPitManS_3_()
   * @generated
   */
  void setTPitManS_3_(nTPitManS_3_ value);

  /**
   * Returns the value of the '<em><b>TPit Man E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TPit Man E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TPit Man E1</em>' containment reference.
   * @see #setTPitManE_1_(nTPitManE_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TPitManE_1_()
   * @model containment="true"
   * @generated
   */
  nTPitManE_1_ getTPitManE_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_1_ <em>TPit Man E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TPit Man E1</em>' containment reference.
   * @see #getTPitManE_1_()
   * @generated
   */
  void setTPitManE_1_(nTPitManE_1_ value);

  /**
   * Returns the value of the '<em><b>TPit Man E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TPit Man E2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TPit Man E2</em>' containment reference.
   * @see #setTPitManE_2_(nTPitManE_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TPitManE_2_()
   * @model containment="true"
   * @generated
   */
  nTPitManE_2_ getTPitManE_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_2_ <em>TPit Man E2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TPit Man E2</em>' containment reference.
   * @see #getTPitManE_2_()
   * @generated
   */
  void setTPitManE_2_(nTPitManE_2_ value);

  /**
   * Returns the value of the '<em><b>TPit Man E3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TPit Man E3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TPit Man E3</em>' containment reference.
   * @see #setTPitManE_3_(nTPitManE_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TPitManE_3_()
   * @model containment="true"
   * @generated
   */
  nTPitManE_3_ getTPitManE_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_3_ <em>TPit Man E3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TPit Man E3</em>' containment reference.
   * @see #getTPitManE_3_()
   * @generated
   */
  void setTPitManE_3_(nTPitManE_3_ value);

  /**
   * Returns the value of the '<em><b>Bl Pitch 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bl Pitch 1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bl Pitch 1</em>' containment reference.
   * @see #setBlPitch_1_(nBlPitch_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BlPitch_1_()
   * @model containment="true"
   * @generated
   */
  nBlPitch_1_ getBlPitch_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_1_ <em>Bl Pitch 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl Pitch 1</em>' containment reference.
   * @see #getBlPitch_1_()
   * @generated
   */
  void setBlPitch_1_(nBlPitch_1_ value);

  /**
   * Returns the value of the '<em><b>Bl Pitch 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bl Pitch 2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bl Pitch 2</em>' containment reference.
   * @see #setBlPitch_2_(nBlPitch_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BlPitch_2_()
   * @model containment="true"
   * @generated
   */
  nBlPitch_2_ getBlPitch_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_2_ <em>Bl Pitch 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl Pitch 2</em>' containment reference.
   * @see #getBlPitch_2_()
   * @generated
   */
  void setBlPitch_2_(nBlPitch_2_ value);

  /**
   * Returns the value of the '<em><b>Bl Pitch 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bl Pitch 3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bl Pitch 3</em>' containment reference.
   * @see #setBlPitch_3_(nBlPitch_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BlPitch_3_()
   * @model containment="true"
   * @generated
   */
  nBlPitch_3_ getBlPitch_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_3_ <em>Bl Pitch 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl Pitch 3</em>' containment reference.
   * @see #getBlPitch_3_()
   * @generated
   */
  void setBlPitch_3_(nBlPitch_3_ value);

  /**
   * Returns the value of the '<em><b>Bl Pitch F1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bl Pitch F1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bl Pitch F1</em>' containment reference.
   * @see #setBlPitchF_1_(nBlPitchF_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BlPitchF_1_()
   * @model containment="true"
   * @generated
   */
  nBlPitchF_1_ getBlPitchF_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_1_ <em>Bl Pitch F1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl Pitch F1</em>' containment reference.
   * @see #getBlPitchF_1_()
   * @generated
   */
  void setBlPitchF_1_(nBlPitchF_1_ value);

  /**
   * Returns the value of the '<em><b>Bl Pitch F2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bl Pitch F2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bl Pitch F2</em>' containment reference.
   * @see #setBlPitchF_2_(nBlPitchF_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BlPitchF_2_()
   * @model containment="true"
   * @generated
   */
  nBlPitchF_2_ getBlPitchF_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_2_ <em>Bl Pitch F2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl Pitch F2</em>' containment reference.
   * @see #getBlPitchF_2_()
   * @generated
   */
  void setBlPitchF_2_(nBlPitchF_2_ value);

  /**
   * Returns the value of the '<em><b>Bl Pitch F3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bl Pitch F3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bl Pitch F3</em>' containment reference.
   * @see #setBlPitchF_3_(nBlPitchF_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BlPitchF_3_()
   * @model containment="true"
   * @generated
   */
  nBlPitchF_3_ getBlPitchF_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_3_ <em>Bl Pitch F3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl Pitch F3</em>' containment reference.
   * @see #getBlPitchF_3_()
   * @generated
   */
  void setBlPitchF_3_(nBlPitchF_3_ value);

  /**
   * Returns the value of the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gravity</em>' containment reference.
   * @see #setGravity(nGravity)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_Gravity()
   * @model containment="true"
   * @generated
   */
  nGravity getGravity();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGravity <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gravity</em>' containment reference.
   * @see #getGravity()
   * @generated
   */
  void setGravity(nGravity value);

  /**
   * Returns the value of the '<em><b>Flap DOF1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flap DOF1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flap DOF1</em>' containment reference.
   * @see #setFlapDOF1(bFlapDOF1)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_FlapDOF1()
   * @model containment="true"
   * @generated
   */
  bFlapDOF1 getFlapDOF1();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFlapDOF1 <em>Flap DOF1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flap DOF1</em>' containment reference.
   * @see #getFlapDOF1()
   * @generated
   */
  void setFlapDOF1(bFlapDOF1 value);

  /**
   * Returns the value of the '<em><b>Flap DOF2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flap DOF2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flap DOF2</em>' containment reference.
   * @see #setFlapDOF2(bFlapDOF2)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_FlapDOF2()
   * @model containment="true"
   * @generated
   */
  bFlapDOF2 getFlapDOF2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFlapDOF2 <em>Flap DOF2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flap DOF2</em>' containment reference.
   * @see #getFlapDOF2()
   * @generated
   */
  void setFlapDOF2(bFlapDOF2 value);

  /**
   * Returns the value of the '<em><b>Edge DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge DOF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge DOF</em>' containment reference.
   * @see #setEdgeDOF(bEdgeDOF)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_EdgeDOF()
   * @model containment="true"
   * @generated
   */
  bEdgeDOF getEdgeDOF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getEdgeDOF <em>Edge DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edge DOF</em>' containment reference.
   * @see #getEdgeDOF()
   * @generated
   */
  void setEdgeDOF(bEdgeDOF value);

  /**
   * Returns the value of the '<em><b>Teet DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet DOF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet DOF</em>' containment reference.
   * @see #setTeetDOF(bTeetDOF)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetDOF()
   * @model containment="true"
   * @generated
   */
  bTeetDOF getTeetDOF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDOF <em>Teet DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet DOF</em>' containment reference.
   * @see #getTeetDOF()
   * @generated
   */
  void setTeetDOF(bTeetDOF value);

  /**
   * Returns the value of the '<em><b>Dr Tr DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dr Tr DOF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dr Tr DOF</em>' containment reference.
   * @see #setDrTrDOF(bDrTrDOF)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_DrTrDOF()
   * @model containment="true"
   * @generated
   */
  bDrTrDOF getDrTrDOF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDrTrDOF <em>Dr Tr DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dr Tr DOF</em>' containment reference.
   * @see #getDrTrDOF()
   * @generated
   */
  void setDrTrDOF(bDrTrDOF value);

  /**
   * Returns the value of the '<em><b>Gen DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen DOF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen DOF</em>' containment reference.
   * @see #setGenDOF(bGenDOF)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GenDOF()
   * @model containment="true"
   * @generated
   */
  bGenDOF getGenDOF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenDOF <em>Gen DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen DOF</em>' containment reference.
   * @see #getGenDOF()
   * @generated
   */
  void setGenDOF(bGenDOF value);

  /**
   * Returns the value of the '<em><b>Yaw DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yaw DOF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yaw DOF</em>' containment reference.
   * @see #setYawDOF(bYawDOF)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_YawDOF()
   * @model containment="true"
   * @generated
   */
  bYawDOF getYawDOF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawDOF <em>Yaw DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yaw DOF</em>' containment reference.
   * @see #getYawDOF()
   * @generated
   */
  void setYawDOF(bYawDOF value);

  /**
   * Returns the value of the '<em><b>Tw FADOF1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tw FADOF1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tw FADOF1</em>' containment reference.
   * @see #setTwFADOF1(bTwFADOF1)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TwFADOF1()
   * @model containment="true"
   * @generated
   */
  bTwFADOF1 getTwFADOF1();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwFADOF1 <em>Tw FADOF1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tw FADOF1</em>' containment reference.
   * @see #getTwFADOF1()
   * @generated
   */
  void setTwFADOF1(bTwFADOF1 value);

  /**
   * Returns the value of the '<em><b>Tw FADOF2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tw FADOF2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tw FADOF2</em>' containment reference.
   * @see #setTwFADOF2(bTwFADOF2)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TwFADOF2()
   * @model containment="true"
   * @generated
   */
  bTwFADOF2 getTwFADOF2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwFADOF2 <em>Tw FADOF2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tw FADOF2</em>' containment reference.
   * @see #getTwFADOF2()
   * @generated
   */
  void setTwFADOF2(bTwFADOF2 value);

  /**
   * Returns the value of the '<em><b>Tw SSDOF1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tw SSDOF1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tw SSDOF1</em>' containment reference.
   * @see #setTwSSDOF1(bTwSSDOF1)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TwSSDOF1()
   * @model containment="true"
   * @generated
   */
  bTwSSDOF1 getTwSSDOF1();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwSSDOF1 <em>Tw SSDOF1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tw SSDOF1</em>' containment reference.
   * @see #getTwSSDOF1()
   * @generated
   */
  void setTwSSDOF1(bTwSSDOF1 value);

  /**
   * Returns the value of the '<em><b>Tw SSDOF2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tw SSDOF2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tw SSDOF2</em>' containment reference.
   * @see #setTwSSDOF2(bTwSSDOF2)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TwSSDOF2()
   * @model containment="true"
   * @generated
   */
  bTwSSDOF2 getTwSSDOF2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwSSDOF2 <em>Tw SSDOF2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tw SSDOF2</em>' containment reference.
   * @see #getTwSSDOF2()
   * @generated
   */
  void setTwSSDOF2(bTwSSDOF2 value);

  /**
   * Returns the value of the '<em><b>Comp Aero</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp Aero</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp Aero</em>' containment reference.
   * @see #setCompAero(bCompAero)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_CompAero()
   * @model containment="true"
   * @generated
   */
  bCompAero getCompAero();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getCompAero <em>Comp Aero</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp Aero</em>' containment reference.
   * @see #getCompAero()
   * @generated
   */
  void setCompAero(bCompAero value);

  /**
   * Returns the value of the '<em><b>Comp Noise</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp Noise</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp Noise</em>' containment reference.
   * @see #setCompNoise(bCompNoise)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_CompNoise()
   * @model containment="true"
   * @generated
   */
  bCompNoise getCompNoise();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getCompNoise <em>Comp Noise</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp Noise</em>' containment reference.
   * @see #getCompNoise()
   * @generated
   */
  void setCompNoise(bCompNoise value);

  /**
   * Returns the value of the '<em><b>Oo PDefl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oo PDefl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oo PDefl</em>' containment reference.
   * @see #setOoPDefl(nOoPDefl)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_OoPDefl()
   * @model containment="true"
   * @generated
   */
  nOoPDefl getOoPDefl();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOoPDefl <em>Oo PDefl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oo PDefl</em>' containment reference.
   * @see #getOoPDefl()
   * @generated
   */
  void setOoPDefl(nOoPDefl value);

  /**
   * Returns the value of the '<em><b>IP Defl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IP Defl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IP Defl</em>' containment reference.
   * @see #setIPDefl(nIPDefl)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_IPDefl()
   * @model containment="true"
   * @generated
   */
  nIPDefl getIPDefl();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getIPDefl <em>IP Defl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IP Defl</em>' containment reference.
   * @see #getIPDefl()
   * @generated
   */
  void setIPDefl(nIPDefl value);

  /**
   * Returns the value of the '<em><b>Teet Defl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet Defl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet Defl</em>' containment reference.
   * @see #setTeetDefl(nTeetDefl)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetDefl()
   * @model containment="true"
   * @generated
   */
  nTeetDefl getTeetDefl();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDefl <em>Teet Defl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet Defl</em>' containment reference.
   * @see #getTeetDefl()
   * @generated
   */
  void setTeetDefl(nTeetDefl value);

  /**
   * Returns the value of the '<em><b>Azimuth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Azimuth</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Azimuth</em>' containment reference.
   * @see #setAzimuth(nAzimuth)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_Azimuth()
   * @model containment="true"
   * @generated
   */
  nAzimuth getAzimuth();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAzimuth <em>Azimuth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Azimuth</em>' containment reference.
   * @see #getAzimuth()
   * @generated
   */
  void setAzimuth(nAzimuth value);

  /**
   * Returns the value of the '<em><b>Rot Speed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rot Speed</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rot Speed</em>' containment reference.
   * @see #setRotSpeed(nRotSpeed)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_RotSpeed()
   * @model containment="true"
   * @generated
   */
  nRotSpeed getRotSpeed();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getRotSpeed <em>Rot Speed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rot Speed</em>' containment reference.
   * @see #getRotSpeed()
   * @generated
   */
  void setRotSpeed(nRotSpeed value);

  /**
   * Returns the value of the '<em><b>Nac Yaw</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nac Yaw</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nac Yaw</em>' containment reference.
   * @see #setNacYaw(nNacYaw)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NacYaw()
   * @model containment="true"
   * @generated
   */
  nNacYaw getNacYaw();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYaw <em>Nac Yaw</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nac Yaw</em>' containment reference.
   * @see #getNacYaw()
   * @generated
   */
  void setNacYaw(nNacYaw value);

  /**
   * Returns the value of the '<em><b>TT Dsp FA</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TT Dsp FA</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TT Dsp FA</em>' containment reference.
   * @see #setTTDspFA(nTTDspFA)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TTDspFA()
   * @model containment="true"
   * @generated
   */
  nTTDspFA getTTDspFA();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTDspFA <em>TT Dsp FA</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TT Dsp FA</em>' containment reference.
   * @see #getTTDspFA()
   * @generated
   */
  void setTTDspFA(nTTDspFA value);

  /**
   * Returns the value of the '<em><b>TT Dsp SS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TT Dsp SS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TT Dsp SS</em>' containment reference.
   * @see #setTTDspSS(nTTDspSS)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TTDspSS()
   * @model containment="true"
   * @generated
   */
  nTTDspSS getTTDspSS();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTDspSS <em>TT Dsp SS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TT Dsp SS</em>' containment reference.
   * @see #getTTDspSS()
   * @generated
   */
  void setTTDspSS(nTTDspSS value);

  /**
   * Returns the value of the '<em><b>Tip Rad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tip Rad</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tip Rad</em>' containment reference.
   * @see #setTipRad(nTipRad)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TipRad()
   * @model containment="true"
   * @generated
   */
  nTipRad getTipRad();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipRad <em>Tip Rad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tip Rad</em>' containment reference.
   * @see #getTipRad()
   * @generated
   */
  void setTipRad(nTipRad value);

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
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_HubRad()
   * @model containment="true"
   * @generated
   */
  nHubRad getHubRad();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubRad <em>Hub Rad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub Rad</em>' containment reference.
   * @see #getHubRad()
   * @generated
   */
  void setHubRad(nHubRad value);

  /**
   * Returns the value of the '<em><b>PSpn El N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PSpn El N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PSpn El N</em>' containment reference.
   * @see #setPSpnElN(nPSpnElN)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_PSpnElN()
   * @model containment="true"
   * @generated
   */
  nPSpnElN getPSpnElN();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPSpnElN <em>PSpn El N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PSpn El N</em>' containment reference.
   * @see #getPSpnElN()
   * @generated
   */
  void setPSpnElN(nPSpnElN value);

  /**
   * Returns the value of the '<em><b>Und Sling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Und Sling</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Und Sling</em>' containment reference.
   * @see #setUndSling(nUndSling)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_UndSling()
   * @model containment="true"
   * @generated
   */
  nUndSling getUndSling();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getUndSling <em>Und Sling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Und Sling</em>' containment reference.
   * @see #getUndSling()
   * @generated
   */
  void setUndSling(nUndSling value);

  /**
   * Returns the value of the '<em><b>Hub CM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub CM</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub CM</em>' containment reference.
   * @see #setHubCM(nHubCM)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_HubCM()
   * @model containment="true"
   * @generated
   */
  nHubCM getHubCM();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubCM <em>Hub CM</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub CM</em>' containment reference.
   * @see #getHubCM()
   * @generated
   */
  void setHubCM(nHubCM value);

  /**
   * Returns the value of the '<em><b>Over Hang</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Over Hang</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Over Hang</em>' containment reference.
   * @see #setOverHang(nOverHang)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_OverHang()
   * @model containment="true"
   * @generated
   */
  nOverHang getOverHang();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOverHang <em>Over Hang</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Over Hang</em>' containment reference.
   * @see #getOverHang()
   * @generated
   */
  void setOverHang(nOverHang value);

  /**
   * Returns the value of the '<em><b>Nac CMxn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nac CMxn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nac CMxn</em>' containment reference.
   * @see #setNacCMxn(nNacCMxn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NacCMxn()
   * @model containment="true"
   * @generated
   */
  nNacCMxn getNacCMxn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMxn <em>Nac CMxn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nac CMxn</em>' containment reference.
   * @see #getNacCMxn()
   * @generated
   */
  void setNacCMxn(nNacCMxn value);

  /**
   * Returns the value of the '<em><b>Nac CMyn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nac CMyn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nac CMyn</em>' containment reference.
   * @see #setNacCMyn(nNacCMyn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NacCMyn()
   * @model containment="true"
   * @generated
   */
  nNacCMyn getNacCMyn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMyn <em>Nac CMyn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nac CMyn</em>' containment reference.
   * @see #getNacCMyn()
   * @generated
   */
  void setNacCMyn(nNacCMyn value);

  /**
   * Returns the value of the '<em><b>Nac CMzn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nac CMzn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nac CMzn</em>' containment reference.
   * @see #setNacCMzn(nNacCMzn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NacCMzn()
   * @model containment="true"
   * @generated
   */
  nNacCMzn getNacCMzn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMzn <em>Nac CMzn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nac CMzn</em>' containment reference.
   * @see #getNacCMzn()
   * @generated
   */
  void setNacCMzn(nNacCMzn value);

  /**
   * Returns the value of the '<em><b>Tower Ht</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tower Ht</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tower Ht</em>' containment reference.
   * @see #setTowerHt(nTowerHt)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TowerHt()
   * @model containment="true"
   * @generated
   */
  nTowerHt getTowerHt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTowerHt <em>Tower Ht</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tower Ht</em>' containment reference.
   * @see #getTowerHt()
   * @generated
   */
  void setTowerHt(nTowerHt value);

  /**
   * Returns the value of the '<em><b>Twr2 Shft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr2 Shft</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr2 Shft</em>' containment reference.
   * @see #setTwr2Shft(nTwr2Shft)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_Twr2Shft()
   * @model containment="true"
   * @generated
   */
  nTwr2Shft getTwr2Shft();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwr2Shft <em>Twr2 Shft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr2 Shft</em>' containment reference.
   * @see #getTwr2Shft()
   * @generated
   */
  void setTwr2Shft(nTwr2Shft value);

  /**
   * Returns the value of the '<em><b>Twr RB Ht</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr RB Ht</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr RB Ht</em>' containment reference.
   * @see #setTwrRBHt(nTwrRBHt)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TwrRBHt()
   * @model containment="true"
   * @generated
   */
  nTwrRBHt getTwrRBHt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrRBHt <em>Twr RB Ht</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr RB Ht</em>' containment reference.
   * @see #getTwrRBHt()
   * @generated
   */
  void setTwrRBHt(nTwrRBHt value);

  /**
   * Returns the value of the '<em><b>Shft Tilt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shft Tilt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shft Tilt</em>' containment reference.
   * @see #setShftTilt(nShftTilt)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_ShftTilt()
   * @model containment="true"
   * @generated
   */
  nShftTilt getShftTilt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getShftTilt <em>Shft Tilt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shft Tilt</em>' containment reference.
   * @see #getShftTilt()
   * @generated
   */
  void setShftTilt(nShftTilt value);

  /**
   * Returns the value of the '<em><b>Delta3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta3</em>' containment reference.
   * @see #setDelta3(nDelta3)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_Delta3()
   * @model containment="true"
   * @generated
   */
  nDelta3 getDelta3();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDelta3 <em>Delta3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delta3</em>' containment reference.
   * @see #getDelta3()
   * @generated
   */
  void setDelta3(nDelta3 value);

  /**
   * Returns the value of the '<em><b>Pre Cone 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Cone 1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Cone 1</em>' containment reference.
   * @see #setPreCone_1_(nPreCone_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_PreCone_1_()
   * @model containment="true"
   * @generated
   */
  nPreCone_1_ getPreCone_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_1_ <em>Pre Cone 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Cone 1</em>' containment reference.
   * @see #getPreCone_1_()
   * @generated
   */
  void setPreCone_1_(nPreCone_1_ value);

  /**
   * Returns the value of the '<em><b>Pre Cone 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Cone 2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Cone 2</em>' containment reference.
   * @see #setPreCone_2_(nPreCone_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_PreCone_2_()
   * @model containment="true"
   * @generated
   */
  nPreCone_2_ getPreCone_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_2_ <em>Pre Cone 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Cone 2</em>' containment reference.
   * @see #getPreCone_2_()
   * @generated
   */
  void setPreCone_2_(nPreCone_2_ value);

  /**
   * Returns the value of the '<em><b>Pre Cone 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Cone 3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Cone 3</em>' containment reference.
   * @see #setPreCone_3_(nPreCone_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_PreCone_3_()
   * @model containment="true"
   * @generated
   */
  nPreCone_3_ getPreCone_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_3_ <em>Pre Cone 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Cone 3</em>' containment reference.
   * @see #getPreCone_3_()
   * @generated
   */
  void setPreCone_3_(nPreCone_3_ value);

  /**
   * Returns the value of the '<em><b>Azim B1 Up</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Azim B1 Up</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Azim B1 Up</em>' containment reference.
   * @see #setAzimB1Up(nAzimB1Up)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_AzimB1Up()
   * @model containment="true"
   * @generated
   */
  nAzimB1Up getAzimB1Up();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAzimB1Up <em>Azim B1 Up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Azim B1 Up</em>' containment reference.
   * @see #getAzimB1Up()
   * @generated
   */
  void setAzimB1Up(nAzimB1Up value);

  /**
   * Returns the value of the '<em><b>Yaw Br Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yaw Br Mass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yaw Br Mass</em>' containment reference.
   * @see #setYawBrMass(nYawBrMass)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_YawBrMass()
   * @model containment="true"
   * @generated
   */
  nYawBrMass getYawBrMass();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawBrMass <em>Yaw Br Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yaw Br Mass</em>' containment reference.
   * @see #getYawBrMass()
   * @generated
   */
  void setYawBrMass(nYawBrMass value);

  /**
   * Returns the value of the '<em><b>Nac Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nac Mass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nac Mass</em>' containment reference.
   * @see #setNacMass(nNacMass)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NacMass()
   * @model containment="true"
   * @generated
   */
  nNacMass getNacMass();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacMass <em>Nac Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nac Mass</em>' containment reference.
   * @see #getNacMass()
   * @generated
   */
  void setNacMass(nNacMass value);

  /**
   * Returns the value of the '<em><b>Hub Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub Mass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub Mass</em>' containment reference.
   * @see #setHubMass(nHubMass)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_HubMass()
   * @model containment="true"
   * @generated
   */
  nHubMass getHubMass();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubMass <em>Hub Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub Mass</em>' containment reference.
   * @see #getHubMass()
   * @generated
   */
  void setHubMass(nHubMass value);

  /**
   * Returns the value of the '<em><b>Tip Mass 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tip Mass 1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tip Mass 1</em>' containment reference.
   * @see #setTipMass_1_(nTipMass_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TipMass_1_()
   * @model containment="true"
   * @generated
   */
  nTipMass_1_ getTipMass_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_1_ <em>Tip Mass 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tip Mass 1</em>' containment reference.
   * @see #getTipMass_1_()
   * @generated
   */
  void setTipMass_1_(nTipMass_1_ value);

  /**
   * Returns the value of the '<em><b>Tip Mass 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tip Mass 2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tip Mass 2</em>' containment reference.
   * @see #setTipMass_2_(nTipMass_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TipMass_2_()
   * @model containment="true"
   * @generated
   */
  nTipMass_2_ getTipMass_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_2_ <em>Tip Mass 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tip Mass 2</em>' containment reference.
   * @see #getTipMass_2_()
   * @generated
   */
  void setTipMass_2_(nTipMass_2_ value);

  /**
   * Returns the value of the '<em><b>Tip Mass 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tip Mass 3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tip Mass 3</em>' containment reference.
   * @see #setTipMass_3_(nTipMass_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TipMass_3_()
   * @model containment="true"
   * @generated
   */
  nTipMass_3_ getTipMass_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_3_ <em>Tip Mass 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tip Mass 3</em>' containment reference.
   * @see #getTipMass_3_()
   * @generated
   */
  void setTipMass_3_(nTipMass_3_ value);

  /**
   * Returns the value of the '<em><b>Nac YIner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nac YIner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nac YIner</em>' containment reference.
   * @see #setNacYIner(nNacYIner)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NacYIner()
   * @model containment="true"
   * @generated
   */
  nNacYIner getNacYIner();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYIner <em>Nac YIner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nac YIner</em>' containment reference.
   * @see #getNacYIner()
   * @generated
   */
  void setNacYIner(nNacYIner value);

  /**
   * Returns the value of the '<em><b>Gen Iner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen Iner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Iner</em>' containment reference.
   * @see #setGenIner(nGenIner)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GenIner()
   * @model containment="true"
   * @generated
   */
  nGenIner getGenIner();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenIner <em>Gen Iner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen Iner</em>' containment reference.
   * @see #getGenIner()
   * @generated
   */
  void setGenIner(nGenIner value);

  /**
   * Returns the value of the '<em><b>Hub Iner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub Iner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub Iner</em>' containment reference.
   * @see #setHubIner(nHubIner)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_HubIner()
   * @model containment="true"
   * @generated
   */
  nHubIner getHubIner();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubIner <em>Hub Iner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub Iner</em>' containment reference.
   * @see #getHubIner()
   * @generated
   */
  void setHubIner(nHubIner value);

  /**
   * Returns the value of the '<em><b>GBox Eff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GBox Eff</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GBox Eff</em>' containment reference.
   * @see #setGBoxEff(nGBoxEff)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GBoxEff()
   * @model containment="true"
   * @generated
   */
  nGBoxEff getGBoxEff();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBoxEff <em>GBox Eff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>GBox Eff</em>' containment reference.
   * @see #getGBoxEff()
   * @generated
   */
  void setGBoxEff(nGBoxEff value);

  /**
   * Returns the value of the '<em><b>Gen Eff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen Eff</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Eff</em>' containment reference.
   * @see #setGenEff(nGenEff)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GenEff()
   * @model containment="true"
   * @generated
   */
  nGenEff getGenEff();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenEff <em>Gen Eff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen Eff</em>' containment reference.
   * @see #getGenEff()
   * @generated
   */
  void setGenEff(nGenEff value);

  /**
   * Returns the value of the '<em><b>GB Ratio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GB Ratio</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GB Ratio</em>' containment reference.
   * @see #setGBRatio(nGBRatio)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GBRatio()
   * @model containment="true"
   * @generated
   */
  nGBRatio getGBRatio();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBRatio <em>GB Ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>GB Ratio</em>' containment reference.
   * @see #getGBRatio()
   * @generated
   */
  void setGBRatio(nGBRatio value);

  /**
   * Returns the value of the '<em><b>GB Revers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GB Revers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GB Revers</em>' containment reference.
   * @see #setGBRevers(bGBRevers)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_GBRevers()
   * @model containment="true"
   * @generated
   */
  bGBRevers getGBRevers();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBRevers <em>GB Revers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>GB Revers</em>' containment reference.
   * @see #getGBRevers()
   * @generated
   */
  void setGBRevers(bGBRevers value);

  /**
   * Returns the value of the '<em><b>HSS Br Tq F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HSS Br Tq F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HSS Br Tq F</em>' containment reference.
   * @see #setHSSBrTqF(nHSSBrTqF)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_HSSBrTqF()
   * @model containment="true"
   * @generated
   */
  nHSSBrTqF getHSSBrTqF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrTqF <em>HSS Br Tq F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HSS Br Tq F</em>' containment reference.
   * @see #getHSSBrTqF()
   * @generated
   */
  void setHSSBrTqF(nHSSBrTqF value);

  /**
   * Returns the value of the '<em><b>HSS Br DT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HSS Br DT</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HSS Br DT</em>' containment reference.
   * @see #setHSSBrDT(nHSSBrDT)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_HSSBrDT()
   * @model containment="true"
   * @generated
   */
  nHSSBrDT getHSSBrDT();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrDT <em>HSS Br DT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HSS Br DT</em>' containment reference.
   * @see #getHSSBrDT()
   * @generated
   */
  void setHSSBrDT(nHSSBrDT value);

  /**
   * Returns the value of the '<em><b>Dyn Brk Fi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dyn Brk Fi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dyn Brk Fi</em>' containment reference.
   * @see #setDynBrkFi(fDynBrkFi)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_DynBrkFi()
   * @model containment="true"
   * @generated
   */
  fDynBrkFi getDynBrkFi();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDynBrkFi <em>Dyn Brk Fi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dyn Brk Fi</em>' containment reference.
   * @see #getDynBrkFi()
   * @generated
   */
  void setDynBrkFi(fDynBrkFi value);

  /**
   * Returns the value of the '<em><b>DT Tor Spr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DT Tor Spr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DT Tor Spr</em>' containment reference.
   * @see #setDTTorSpr(nDTTorSpr)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_DTTorSpr()
   * @model containment="true"
   * @generated
   */
  nDTTorSpr getDTTorSpr();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDTTorSpr <em>DT Tor Spr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DT Tor Spr</em>' containment reference.
   * @see #getDTTorSpr()
   * @generated
   */
  void setDTTorSpr(nDTTorSpr value);

  /**
   * Returns the value of the '<em><b>DT Tor Dmp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DT Tor Dmp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DT Tor Dmp</em>' containment reference.
   * @see #setDTTorDmp(nDTTorDmp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_DTTorDmp()
   * @model containment="true"
   * @generated
   */
  nDTTorDmp getDTTorDmp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDTTorDmp <em>DT Tor Dmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DT Tor Dmp</em>' containment reference.
   * @see #getDTTorDmp()
   * @generated
   */
  void setDTTorDmp(nDTTorDmp value);

  /**
   * Returns the value of the '<em><b>SIG Sl Pc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SIG Sl Pc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SIG Sl Pc</em>' containment reference.
   * @see #setSIG_SlPc(nSIG_SlPc)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_SIG_SlPc()
   * @model containment="true"
   * @generated
   */
  nSIG_SlPc getSIG_SlPc();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_SlPc <em>SIG Sl Pc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SIG Sl Pc</em>' containment reference.
   * @see #getSIG_SlPc()
   * @generated
   */
  void setSIG_SlPc(nSIG_SlPc value);

  /**
   * Returns the value of the '<em><b>SIG Sy Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SIG Sy Sp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SIG Sy Sp</em>' containment reference.
   * @see #setSIG_SySp(nSIG_SySp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_SIG_SySp()
   * @model containment="true"
   * @generated
   */
  nSIG_SySp getSIG_SySp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_SySp <em>SIG Sy Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SIG Sy Sp</em>' containment reference.
   * @see #getSIG_SySp()
   * @generated
   */
  void setSIG_SySp(nSIG_SySp value);

  /**
   * Returns the value of the '<em><b>SIG Rt Tq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SIG Rt Tq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SIG Rt Tq</em>' containment reference.
   * @see #setSIG_RtTq(nSIG_RtTq)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_SIG_RtTq()
   * @model containment="true"
   * @generated
   */
  nSIG_RtTq getSIG_RtTq();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_RtTq <em>SIG Rt Tq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SIG Rt Tq</em>' containment reference.
   * @see #getSIG_RtTq()
   * @generated
   */
  void setSIG_RtTq(nSIG_RtTq value);

  /**
   * Returns the value of the '<em><b>SIG PO Rt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SIG PO Rt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SIG PO Rt</em>' containment reference.
   * @see #setSIG_PORt(nSIG_PORt)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_SIG_PORt()
   * @model containment="true"
   * @generated
   */
  nSIG_PORt getSIG_PORt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_PORt <em>SIG PO Rt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SIG PO Rt</em>' containment reference.
   * @see #getSIG_PORt()
   * @generated
   */
  void setSIG_PORt(nSIG_PORt value);

  /**
   * Returns the value of the '<em><b>TEC Freq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEC Freq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEC Freq</em>' containment reference.
   * @see #setTEC_Freq(nTEC_Freq)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TEC_Freq()
   * @model containment="true"
   * @generated
   */
  nTEC_Freq getTEC_Freq();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Freq <em>TEC Freq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEC Freq</em>' containment reference.
   * @see #getTEC_Freq()
   * @generated
   */
  void setTEC_Freq(nTEC_Freq value);

  /**
   * Returns the value of the '<em><b>TEC Npol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEC Npol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEC Npol</em>' containment reference.
   * @see #setTEC_Npol(nTEC_Npol)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TEC_Npol()
   * @model containment="true"
   * @generated
   */
  nTEC_Npol getTEC_Npol();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Npol <em>TEC Npol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEC Npol</em>' containment reference.
   * @see #getTEC_Npol()
   * @generated
   */
  void setTEC_Npol(nTEC_Npol value);

  /**
   * Returns the value of the '<em><b>TEC Sres</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEC Sres</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEC Sres</em>' containment reference.
   * @see #setTEC_Sres(nTEC_Sres)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TEC_Sres()
   * @model containment="true"
   * @generated
   */
  nTEC_Sres getTEC_Sres();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Sres <em>TEC Sres</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEC Sres</em>' containment reference.
   * @see #getTEC_Sres()
   * @generated
   */
  void setTEC_Sres(nTEC_Sres value);

  /**
   * Returns the value of the '<em><b>TEC Rres</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEC Rres</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEC Rres</em>' containment reference.
   * @see #setTEC_Rres(nTEC_Rres)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TEC_Rres()
   * @model containment="true"
   * @generated
   */
  nTEC_Rres getTEC_Rres();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Rres <em>TEC Rres</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEC Rres</em>' containment reference.
   * @see #getTEC_Rres()
   * @generated
   */
  void setTEC_Rres(nTEC_Rres value);

  /**
   * Returns the value of the '<em><b>TEC VLL</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEC VLL</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEC VLL</em>' containment reference.
   * @see #setTEC_VLL(nTEC_VLL)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TEC_VLL()
   * @model containment="true"
   * @generated
   */
  nTEC_VLL getTEC_VLL();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_VLL <em>TEC VLL</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEC VLL</em>' containment reference.
   * @see #getTEC_VLL()
   * @generated
   */
  void setTEC_VLL(nTEC_VLL value);

  /**
   * Returns the value of the '<em><b>TEC SLR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEC SLR</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEC SLR</em>' containment reference.
   * @see #setTEC_SLR(nTEC_SLR)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TEC_SLR()
   * @model containment="true"
   * @generated
   */
  nTEC_SLR getTEC_SLR();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_SLR <em>TEC SLR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEC SLR</em>' containment reference.
   * @see #getTEC_SLR()
   * @generated
   */
  void setTEC_SLR(nTEC_SLR value);

  /**
   * Returns the value of the '<em><b>TEC RLR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEC RLR</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEC RLR</em>' containment reference.
   * @see #setTEC_RLR(nTEC_RLR)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TEC_RLR()
   * @model containment="true"
   * @generated
   */
  nTEC_RLR getTEC_RLR();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_RLR <em>TEC RLR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEC RLR</em>' containment reference.
   * @see #getTEC_RLR()
   * @generated
   */
  void setTEC_RLR(nTEC_RLR value);

  /**
   * Returns the value of the '<em><b>TEC MR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TEC MR</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TEC MR</em>' containment reference.
   * @see #setTEC_MR(nTEC_MR)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TEC_MR()
   * @model containment="true"
   * @generated
   */
  nTEC_MR getTEC_MR();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_MR <em>TEC MR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TEC MR</em>' containment reference.
   * @see #getTEC_MR()
   * @generated
   */
  void setTEC_MR(nTEC_MR value);

  /**
   * Returns the value of the '<em><b>Ptfm Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ptfm Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ptfm Model</em>' containment reference.
   * @see #setPtfmModel(iPtfmModel)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_PtfmModel()
   * @model containment="true"
   * @generated
   */
  iPtfmModel getPtfmModel();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPtfmModel <em>Ptfm Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ptfm Model</em>' containment reference.
   * @see #getPtfmModel()
   * @generated
   */
  void setPtfmModel(iPtfmModel value);

  /**
   * Returns the value of the '<em><b>Ptfm File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ptfm File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ptfm File</em>' containment reference.
   * @see #setPtfmFile(fPtfmFile)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_PtfmFile()
   * @model containment="true"
   * @generated
   */
  fPtfmFile getPtfmFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPtfmFile <em>Ptfm File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ptfm File</em>' containment reference.
   * @see #getPtfmFile()
   * @generated
   */
  void setPtfmFile(fPtfmFile value);

  /**
   * Returns the value of the '<em><b>Twr Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr Nodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr Nodes</em>' containment reference.
   * @see #setTwrNodes(iTwrNodes)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TwrNodes()
   * @model containment="true"
   * @generated
   */
  iTwrNodes getTwrNodes();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrNodes <em>Twr Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr Nodes</em>' containment reference.
   * @see #getTwrNodes()
   * @generated
   */
  void setTwrNodes(iTwrNodes value);

  /**
   * Returns the value of the '<em><b>Twr File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr File</em>' containment reference.
   * @see #setTwrFile(fTwrFile)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TwrFile()
   * @model containment="true"
   * @generated
   */
  fTwrFile getTwrFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrFile <em>Twr File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr File</em>' containment reference.
   * @see #getTwrFile()
   * @generated
   */
  void setTwrFile(fTwrFile value);

  /**
   * Returns the value of the '<em><b>Yaw Spr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yaw Spr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yaw Spr</em>' containment reference.
   * @see #setYawSpr(nYawSpr)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_YawSpr()
   * @model containment="true"
   * @generated
   */
  nYawSpr getYawSpr();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawSpr <em>Yaw Spr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yaw Spr</em>' containment reference.
   * @see #getYawSpr()
   * @generated
   */
  void setYawSpr(nYawSpr value);

  /**
   * Returns the value of the '<em><b>Yaw Damp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yaw Damp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yaw Damp</em>' containment reference.
   * @see #setYawDamp(nYawDamp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_YawDamp()
   * @model containment="true"
   * @generated
   */
  nYawDamp getYawDamp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawDamp <em>Yaw Damp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yaw Damp</em>' containment reference.
   * @see #getYawDamp()
   * @generated
   */
  void setYawDamp(nYawDamp value);

  /**
   * Returns the value of the '<em><b>Yaw Neut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yaw Neut</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yaw Neut</em>' containment reference.
   * @see #setYawNeut(nYawNeut)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_YawNeut()
   * @model containment="true"
   * @generated
   */
  nYawNeut getYawNeut();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawNeut <em>Yaw Neut</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yaw Neut</em>' containment reference.
   * @see #getYawNeut()
   * @generated
   */
  void setYawNeut(nYawNeut value);

  /**
   * Returns the value of the '<em><b>Furling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Furling</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Furling</em>' containment reference.
   * @see #setFurling(bFurling)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_Furling()
   * @model containment="true"
   * @generated
   */
  bFurling getFurling();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFurling <em>Furling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Furling</em>' containment reference.
   * @see #getFurling()
   * @generated
   */
  void setFurling(bFurling value);

  /**
   * Returns the value of the '<em><b>Furl File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Furl File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Furl File</em>' containment reference.
   * @see #setFurlFile(fFurlFile)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_FurlFile()
   * @model containment="true"
   * @generated
   */
  fFurlFile getFurlFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFurlFile <em>Furl File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Furl File</em>' containment reference.
   * @see #getFurlFile()
   * @generated
   */
  void setFurlFile(fFurlFile value);

  /**
   * Returns the value of the '<em><b>Teet Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet Mod</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet Mod</em>' containment reference.
   * @see #setTeetMod(iTeetMod)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetMod()
   * @model containment="true"
   * @generated
   */
  iTeetMod getTeetMod();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetMod <em>Teet Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet Mod</em>' containment reference.
   * @see #getTeetMod()
   * @generated
   */
  void setTeetMod(iTeetMod value);

  /**
   * Returns the value of the '<em><b>Teet Dmp P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet Dmp P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet Dmp P</em>' containment reference.
   * @see #setTeetDmpP(nTeetDmpP)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetDmpP()
   * @model containment="true"
   * @generated
   */
  nTeetDmpP getTeetDmpP();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDmpP <em>Teet Dmp P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet Dmp P</em>' containment reference.
   * @see #getTeetDmpP()
   * @generated
   */
  void setTeetDmpP(nTeetDmpP value);

  /**
   * Returns the value of the '<em><b>Teet Dmp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet Dmp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet Dmp</em>' containment reference.
   * @see #setTeetDmp(nTeetDmp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetDmp()
   * @model containment="true"
   * @generated
   */
  nTeetDmp getTeetDmp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDmp <em>Teet Dmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet Dmp</em>' containment reference.
   * @see #getTeetDmp()
   * @generated
   */
  void setTeetDmp(nTeetDmp value);

  /**
   * Returns the value of the '<em><b>Teet CDmp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet CDmp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet CDmp</em>' containment reference.
   * @see #setTeetCDmp(nTeetCDmp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetCDmp()
   * @model containment="true"
   * @generated
   */
  nTeetCDmp getTeetCDmp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetCDmp <em>Teet CDmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet CDmp</em>' containment reference.
   * @see #getTeetCDmp()
   * @generated
   */
  void setTeetCDmp(nTeetCDmp value);

  /**
   * Returns the value of the '<em><b>Teet SSt P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet SSt P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet SSt P</em>' containment reference.
   * @see #setTeetSStP(nTeetSStP)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetSStP()
   * @model containment="true"
   * @generated
   */
  nTeetSStP getTeetSStP();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetSStP <em>Teet SSt P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet SSt P</em>' containment reference.
   * @see #getTeetSStP()
   * @generated
   */
  void setTeetSStP(nTeetSStP value);

  /**
   * Returns the value of the '<em><b>Teet HSt P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet HSt P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet HSt P</em>' containment reference.
   * @see #setTeetHStP(nTeetHStP)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetHStP()
   * @model containment="true"
   * @generated
   */
  nTeetHStP getTeetHStP();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetHStP <em>Teet HSt P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet HSt P</em>' containment reference.
   * @see #getTeetHStP()
   * @generated
   */
  void setTeetHStP(nTeetHStP value);

  /**
   * Returns the value of the '<em><b>Teet SS Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet SS Sp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet SS Sp</em>' containment reference.
   * @see #setTeetSSSp(nTeetSSSp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetSSSp()
   * @model containment="true"
   * @generated
   */
  nTeetSSSp getTeetSSSp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetSSSp <em>Teet SS Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet SS Sp</em>' containment reference.
   * @see #getTeetSSSp()
   * @generated
   */
  void setTeetSSSp(nTeetSSSp value);

  /**
   * Returns the value of the '<em><b>Teet HS Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teet HS Sp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teet HS Sp</em>' containment reference.
   * @see #setTeetHSSp(nTeetHSSp)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TeetHSSp()
   * @model containment="true"
   * @generated
   */
  nTeetHSSp getTeetHSSp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetHSSp <em>Teet HS Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teet HS Sp</em>' containment reference.
   * @see #getTeetHSSp()
   * @generated
   */
  void setTeetHSSp(nTeetHSSp value);

  /**
   * Returns the value of the '<em><b>TB Dr Con N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TB Dr Con N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TB Dr Con N</em>' containment reference.
   * @see #setTBDrConN(nTBDrConN)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TBDrConN()
   * @model containment="true"
   * @generated
   */
  nTBDrConN getTBDrConN();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDrConN <em>TB Dr Con N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TB Dr Con N</em>' containment reference.
   * @see #getTBDrConN()
   * @generated
   */
  void setTBDrConN(nTBDrConN value);

  /**
   * Returns the value of the '<em><b>TB Dr Con D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TB Dr Con D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TB Dr Con D</em>' containment reference.
   * @see #setTBDrConD(nTBDrConD)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TBDrConD()
   * @model containment="true"
   * @generated
   */
  nTBDrConD getTBDrConD();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDrConD <em>TB Dr Con D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TB Dr Con D</em>' containment reference.
   * @see #getTBDrConD()
   * @generated
   */
  void setTBDrConD(nTBDrConD value);

  /**
   * Returns the value of the '<em><b>Tp Br DT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp Br DT</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp Br DT</em>' containment reference.
   * @see #setTpBrDT(nTpBrDT)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TpBrDT()
   * @model containment="true"
   * @generated
   */
  nTpBrDT getTpBrDT();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTpBrDT <em>Tp Br DT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp Br DT</em>' containment reference.
   * @see #getTpBrDT()
   * @generated
   */
  void setTpBrDT(nTpBrDT value);

  /**
   * Returns the value of the '<em><b>Bld File 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld File 1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld File 1</em>' containment reference.
   * @see #setBldFile_1_(fBldFile_1_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BldFile_1_()
   * @model containment="true"
   * @generated
   */
  fBldFile_1_ getBldFile_1_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_1_ <em>Bld File 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld File 1</em>' containment reference.
   * @see #getBldFile_1_()
   * @generated
   */
  void setBldFile_1_(fBldFile_1_ value);

  /**
   * Returns the value of the '<em><b>Bld File 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld File 2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld File 2</em>' containment reference.
   * @see #setBldFile_2_(fBldFile_2_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BldFile_2_()
   * @model containment="true"
   * @generated
   */
  fBldFile_2_ getBldFile_2_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_2_ <em>Bld File 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld File 2</em>' containment reference.
   * @see #getBldFile_2_()
   * @generated
   */
  void setBldFile_2_(fBldFile_2_ value);

  /**
   * Returns the value of the '<em><b>Bld File 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld File 3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld File 3</em>' containment reference.
   * @see #setBldFile_3_(fBldFile_3_)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BldFile_3_()
   * @model containment="true"
   * @generated
   */
  fBldFile_3_ getBldFile_3_();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_3_ <em>Bld File 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld File 3</em>' containment reference.
   * @see #getBldFile_3_()
   * @generated
   */
  void setBldFile_3_(fBldFile_3_ value);

  /**
   * Returns the value of the '<em><b>AD File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AD File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AD File</em>' containment reference.
   * @see #setADFile(fADFile)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_ADFile()
   * @model containment="true"
   * @generated
   */
  fADFile getADFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADFile <em>AD File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AD File</em>' containment reference.
   * @see #getADFile()
   * @generated
   */
  void setADFile(fADFile value);

  /**
   * Returns the value of the '<em><b>Noise File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Noise File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Noise File</em>' containment reference.
   * @see #setNoiseFile(fNoiseFile)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NoiseFile()
   * @model containment="true"
   * @generated
   */
  fNoiseFile getNoiseFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNoiseFile <em>Noise File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Noise File</em>' containment reference.
   * @see #getNoiseFile()
   * @generated
   */
  void setNoiseFile(fNoiseFile value);

  /**
   * Returns the value of the '<em><b>ADAMS File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ADAMS File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ADAMS File</em>' containment reference.
   * @see #setADAMSFile(fADAMSFile)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_ADAMSFile()
   * @model containment="true"
   * @generated
   */
  fADAMSFile getADAMSFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADAMSFile <em>ADAMS File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ADAMS File</em>' containment reference.
   * @see #getADAMSFile()
   * @generated
   */
  void setADAMSFile(fADAMSFile value);

  /**
   * Returns the value of the '<em><b>Lin File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lin File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lin File</em>' containment reference.
   * @see #setLinFile(fLinFile)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_LinFile()
   * @model containment="true"
   * @generated
   */
  fLinFile getLinFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getLinFile <em>Lin File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lin File</em>' containment reference.
   * @see #getLinFile()
   * @generated
   */
  void setLinFile(fLinFile value);

  /**
   * Returns the value of the '<em><b>Sum Print</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sum Print</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum Print</em>' containment reference.
   * @see #setSumPrint(bSumPrint)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_SumPrint()
   * @model containment="true"
   * @generated
   */
  bSumPrint getSumPrint();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSumPrint <em>Sum Print</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum Print</em>' containment reference.
   * @see #getSumPrint()
   * @generated
   */
  void setSumPrint(bSumPrint value);

  /**
   * Returns the value of the '<em><b>Out File Fmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out File Fmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out File Fmt</em>' containment reference.
   * @see #setOutFileFmt(bOutFileFmt)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_OutFileFmt()
   * @model containment="true"
   * @generated
   */
  bOutFileFmt getOutFileFmt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutFileFmt <em>Out File Fmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out File Fmt</em>' containment reference.
   * @see #getOutFileFmt()
   * @generated
   */
  void setOutFileFmt(bOutFileFmt value);

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
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TabDelim()
   * @model containment="true"
   * @generated
   */
  bTabDelim getTabDelim();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTabDelim <em>Tab Delim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tab Delim</em>' containment reference.
   * @see #getTabDelim()
   * @generated
   */
  void setTabDelim(bTabDelim value);

  /**
   * Returns the value of the '<em><b>Out Fmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Fmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Fmt</em>' containment reference.
   * @see #setOutFmt(sOutFmt)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_OutFmt()
   * @model containment="true"
   * @generated
   */
  sOutFmt getOutFmt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutFmt <em>Out Fmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Fmt</em>' containment reference.
   * @see #getOutFmt()
   * @generated
   */
  void setOutFmt(sOutFmt value);

  /**
   * Returns the value of the '<em><b>TStart</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TStart</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TStart</em>' containment reference.
   * @see #setTStart(nTStart)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TStart()
   * @model containment="true"
   * @generated
   */
  nTStart getTStart();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTStart <em>TStart</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TStart</em>' containment reference.
   * @see #getTStart()
   * @generated
   */
  void setTStart(nTStart value);

  /**
   * Returns the value of the '<em><b>Dec Fact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dec Fact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec Fact</em>' containment reference.
   * @see #setDecFact(iDecFact)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_DecFact()
   * @model containment="true"
   * @generated
   */
  iDecFact getDecFact();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDecFact <em>Dec Fact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec Fact</em>' containment reference.
   * @see #getDecFact()
   * @generated
   */
  void setDecFact(iDecFact value);

  /**
   * Returns the value of the '<em><b>Stts Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stts Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stts Time</em>' containment reference.
   * @see #setSttsTime(nSttsTime)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_SttsTime()
   * @model containment="true"
   * @generated
   */
  nSttsTime getSttsTime();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSttsTime <em>Stts Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stts Time</em>' containment reference.
   * @see #getSttsTime()
   * @generated
   */
  void setSttsTime(nSttsTime value);

  /**
   * Returns the value of the '<em><b>Nc IM Uxn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nc IM Uxn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nc IM Uxn</em>' containment reference.
   * @see #setNcIMUxn(nNcIMUxn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NcIMUxn()
   * @model containment="true"
   * @generated
   */
  nNcIMUxn getNcIMUxn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUxn <em>Nc IM Uxn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nc IM Uxn</em>' containment reference.
   * @see #getNcIMUxn()
   * @generated
   */
  void setNcIMUxn(nNcIMUxn value);

  /**
   * Returns the value of the '<em><b>Nc IM Uyn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nc IM Uyn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nc IM Uyn</em>' containment reference.
   * @see #setNcIMUyn(nNcIMUyn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NcIMUyn()
   * @model containment="true"
   * @generated
   */
  nNcIMUyn getNcIMUyn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUyn <em>Nc IM Uyn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nc IM Uyn</em>' containment reference.
   * @see #getNcIMUyn()
   * @generated
   */
  void setNcIMUyn(nNcIMUyn value);

  /**
   * Returns the value of the '<em><b>Nc IM Uzn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nc IM Uzn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nc IM Uzn</em>' containment reference.
   * @see #setNcIMUzn(nNcIMUzn)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NcIMUzn()
   * @model containment="true"
   * @generated
   */
  nNcIMUzn getNcIMUzn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUzn <em>Nc IM Uzn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nc IM Uzn</em>' containment reference.
   * @see #getNcIMUzn()
   * @generated
   */
  void setNcIMUzn(nNcIMUzn value);

  /**
   * Returns the value of the '<em><b>Shft Gag L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shft Gag L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shft Gag L</em>' containment reference.
   * @see #setShftGagL(nShftGagL)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_ShftGagL()
   * @model containment="true"
   * @generated
   */
  nShftGagL getShftGagL();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getShftGagL <em>Shft Gag L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shft Gag L</em>' containment reference.
   * @see #getShftGagL()
   * @generated
   */
  void setShftGagL(nShftGagL value);

  /**
   * Returns the value of the '<em><b>NTw Gages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>NTw Gages</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>NTw Gages</em>' containment reference.
   * @see #setNTwGages(iNTwGages)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NTwGages()
   * @model containment="true"
   * @generated
   */
  iNTwGages getNTwGages();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNTwGages <em>NTw Gages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NTw Gages</em>' containment reference.
   * @see #getNTwGages()
   * @generated
   */
  void setNTwGages(iNTwGages value);

  /**
   * Returns the value of the '<em><b>Twr Gag Nd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr Gag Nd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr Gag Nd</em>' containment reference.
   * @see #setTwrGagNd(aTwrGagNd)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_TwrGagNd()
   * @model containment="true"
   * @generated
   */
  aTwrGagNd getTwrGagNd();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrGagNd <em>Twr Gag Nd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr Gag Nd</em>' containment reference.
   * @see #getTwrGagNd()
   * @generated
   */
  void setTwrGagNd(aTwrGagNd value);

  /**
   * Returns the value of the '<em><b>NBl Gages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>NBl Gages</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>NBl Gages</em>' containment reference.
   * @see #setNBlGages(iNBlGages)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_NBlGages()
   * @model containment="true"
   * @generated
   */
  iNBlGages getNBlGages();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNBlGages <em>NBl Gages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NBl Gages</em>' containment reference.
   * @see #getNBlGages()
   * @generated
   */
  void setNBlGages(iNBlGages value);

  /**
   * Returns the value of the '<em><b>Bld Gag Nd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Gag Nd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Gag Nd</em>' containment reference.
   * @see #setBldGagNd(aBldGagNd)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_BldGagNd()
   * @model containment="true"
   * @generated
   */
  aBldGagNd getBldGagNd();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldGagNd <em>Bld Gag Nd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Gag Nd</em>' containment reference.
   * @see #getBldGagNd()
   * @generated
   */
  void setBldGagNd(aBldGagNd value);

  /**
   * Returns the value of the '<em><b>Out List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out List</em>' containment reference.
   * @see #setOutList(vOutList)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getModelFastfst_OutList()
   * @model containment="true"
   * @generated
   */
  vOutList getOutList();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutList <em>Out List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out List</em>' containment reference.
   * @see #getOutList()
   * @generated
   */
  void setOutList(vOutList value);

} // ModelFastfst
