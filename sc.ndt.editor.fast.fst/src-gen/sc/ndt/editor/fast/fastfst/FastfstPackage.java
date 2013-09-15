/**
 */
package sc.ndt.editor.fast.fastfst;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.fast.fastfst.FastfstFactory
 * @model kind="package"
 * @generated
 */
public interface FastfstPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fastfst";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/fast/Fastfst";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fastfst";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FastfstPackage eINSTANCE = sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl <em>Model Fastfst</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getModelFastfst()
   * @generated
   */
  int MODEL_FASTFST = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__HEAD = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SECTIONS = 1;

  /**
   * The feature id for the '<em><b>Echo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__ECHO = 2;

  /**
   * The feature id for the '<em><b>ADAMS Prep</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__ADAMS_PREP = 3;

  /**
   * The feature id for the '<em><b>Anal Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__ANAL_MODE = 4;

  /**
   * The feature id for the '<em><b>Num Bl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NUM_BL = 5;

  /**
   * The feature id for the '<em><b>TMax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TMAX = 6;

  /**
   * The feature id for the '<em><b>DT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__DT = 7;

  /**
   * The feature id for the '<em><b>YC Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__YC_MODE = 8;

  /**
   * The feature id for the '<em><b>TYC On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TYC_ON = 9;

  /**
   * The feature id for the '<em><b>PC Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__PC_MODE = 10;

  /**
   * The feature id for the '<em><b>TPC On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TPC_ON = 11;

  /**
   * The feature id for the '<em><b>VS Contrl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__VS_CONTRL = 12;

  /**
   * The feature id for the '<em><b>VS Rt Gn Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__VS_RT_GN_SP = 13;

  /**
   * The feature id for the '<em><b>VS Rt Tq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__VS_RT_TQ = 14;

  /**
   * The feature id for the '<em><b>VS Rgn2 K</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__VS_RGN2_K = 15;

  /**
   * The feature id for the '<em><b>VS Sl Pc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__VS_SL_PC = 16;

  /**
   * The feature id for the '<em><b>Gen Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GEN_MODEL = 17;

  /**
   * The feature id for the '<em><b>Gen Ti Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GEN_TI_STR = 18;

  /**
   * The feature id for the '<em><b>Gen Ti Stp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GEN_TI_STP = 19;

  /**
   * The feature id for the '<em><b>Spd Gen On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SPD_GEN_ON = 20;

  /**
   * The feature id for the '<em><b>Tim Gen On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TIM_GEN_ON = 21;

  /**
   * The feature id for the '<em><b>Tim Gen Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TIM_GEN_OF = 22;

  /**
   * The feature id for the '<em><b>HSS Br Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__HSS_BR_MODE = 23;

  /**
   * The feature id for the '<em><b>THSS Br Dp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__THSS_BR_DP = 24;

  /**
   * The feature id for the '<em><b>Ti Dyn Brk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TI_DYN_BRK = 25;

  /**
   * The feature id for the '<em><b>TTp Br Dp 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TTP_BR_DP_1 = 26;

  /**
   * The feature id for the '<em><b>TTp Br Dp 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TTP_BR_DP_2 = 27;

  /**
   * The feature id for the '<em><b>TTp Br Dp 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TTP_BR_DP_3 = 28;

  /**
   * The feature id for the '<em><b>TB Dep ISp 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TB_DEP_ISP_1 = 29;

  /**
   * The feature id for the '<em><b>TB Dep ISp 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TB_DEP_ISP_2 = 30;

  /**
   * The feature id for the '<em><b>TB Dep ISp 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TB_DEP_ISP_3 = 31;

  /**
   * The feature id for the '<em><b>TYaw Man S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TYAW_MAN_S = 32;

  /**
   * The feature id for the '<em><b>TYaw Man E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TYAW_MAN_E = 33;

  /**
   * The feature id for the '<em><b>Nac Yaw F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NAC_YAW_F = 34;

  /**
   * The feature id for the '<em><b>TPit Man S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TPIT_MAN_S1 = 35;

  /**
   * The feature id for the '<em><b>TPit Man S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TPIT_MAN_S2 = 36;

  /**
   * The feature id for the '<em><b>TPit Man S3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TPIT_MAN_S3 = 37;

  /**
   * The feature id for the '<em><b>TPit Man E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TPIT_MAN_E1 = 38;

  /**
   * The feature id for the '<em><b>TPit Man E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TPIT_MAN_E2 = 39;

  /**
   * The feature id for the '<em><b>TPit Man E3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TPIT_MAN_E3 = 40;

  /**
   * The feature id for the '<em><b>Bl Pitch 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BL_PITCH_1 = 41;

  /**
   * The feature id for the '<em><b>Bl Pitch 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BL_PITCH_2 = 42;

  /**
   * The feature id for the '<em><b>Bl Pitch 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BL_PITCH_3 = 43;

  /**
   * The feature id for the '<em><b>Bl Pitch F1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BL_PITCH_F1 = 44;

  /**
   * The feature id for the '<em><b>Bl Pitch F2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BL_PITCH_F2 = 45;

  /**
   * The feature id for the '<em><b>Bl Pitch F3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BL_PITCH_F3 = 46;

  /**
   * The feature id for the '<em><b>Gravity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GRAVITY = 47;

  /**
   * The feature id for the '<em><b>Flap DOF1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__FLAP_DOF1 = 48;

  /**
   * The feature id for the '<em><b>Flap DOF2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__FLAP_DOF2 = 49;

  /**
   * The feature id for the '<em><b>Edge DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__EDGE_DOF = 50;

  /**
   * The feature id for the '<em><b>Teet DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_DOF = 51;

  /**
   * The feature id for the '<em><b>Dr Tr DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__DR_TR_DOF = 52;

  /**
   * The feature id for the '<em><b>Gen DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GEN_DOF = 53;

  /**
   * The feature id for the '<em><b>Yaw DOF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__YAW_DOF = 54;

  /**
   * The feature id for the '<em><b>Tw FADOF1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TW_FADOF1 = 55;

  /**
   * The feature id for the '<em><b>Tw FADOF2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TW_FADOF2 = 56;

  /**
   * The feature id for the '<em><b>Tw SSDOF1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TW_SSDOF1 = 57;

  /**
   * The feature id for the '<em><b>Tw SSDOF2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TW_SSDOF2 = 58;

  /**
   * The feature id for the '<em><b>Comp Aero</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__COMP_AERO = 59;

  /**
   * The feature id for the '<em><b>Comp Noise</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__COMP_NOISE = 60;

  /**
   * The feature id for the '<em><b>Oo PDefl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__OO_PDEFL = 61;

  /**
   * The feature id for the '<em><b>IP Defl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__IP_DEFL = 62;

  /**
   * The feature id for the '<em><b>Teet Defl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_DEFL = 63;

  /**
   * The feature id for the '<em><b>Azimuth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__AZIMUTH = 64;

  /**
   * The feature id for the '<em><b>Rot Speed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__ROT_SPEED = 65;

  /**
   * The feature id for the '<em><b>Nac Yaw</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NAC_YAW = 66;

  /**
   * The feature id for the '<em><b>TT Dsp FA</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TT_DSP_FA = 67;

  /**
   * The feature id for the '<em><b>TT Dsp SS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TT_DSP_SS = 68;

  /**
   * The feature id for the '<em><b>Tip Rad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TIP_RAD = 69;

  /**
   * The feature id for the '<em><b>Hub Rad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__HUB_RAD = 70;

  /**
   * The feature id for the '<em><b>PSpn El N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__PSPN_EL_N = 71;

  /**
   * The feature id for the '<em><b>Und Sling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__UND_SLING = 72;

  /**
   * The feature id for the '<em><b>Hub CM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__HUB_CM = 73;

  /**
   * The feature id for the '<em><b>Over Hang</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__OVER_HANG = 74;

  /**
   * The feature id for the '<em><b>Nac CMxn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NAC_CMXN = 75;

  /**
   * The feature id for the '<em><b>Nac CMyn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NAC_CMYN = 76;

  /**
   * The feature id for the '<em><b>Nac CMzn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NAC_CMZN = 77;

  /**
   * The feature id for the '<em><b>Tower Ht</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TOWER_HT = 78;

  /**
   * The feature id for the '<em><b>Twr2 Shft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TWR2_SHFT = 79;

  /**
   * The feature id for the '<em><b>Twr RB Ht</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TWR_RB_HT = 80;

  /**
   * The feature id for the '<em><b>Shft Tilt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SHFT_TILT = 81;

  /**
   * The feature id for the '<em><b>Delta3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__DELTA3 = 82;

  /**
   * The feature id for the '<em><b>Pre Cone 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__PRE_CONE_1 = 83;

  /**
   * The feature id for the '<em><b>Pre Cone 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__PRE_CONE_2 = 84;

  /**
   * The feature id for the '<em><b>Pre Cone 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__PRE_CONE_3 = 85;

  /**
   * The feature id for the '<em><b>Azim B1 Up</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__AZIM_B1_UP = 86;

  /**
   * The feature id for the '<em><b>Yaw Br Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__YAW_BR_MASS = 87;

  /**
   * The feature id for the '<em><b>Nac Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NAC_MASS = 88;

  /**
   * The feature id for the '<em><b>Hub Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__HUB_MASS = 89;

  /**
   * The feature id for the '<em><b>Tip Mass 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TIP_MASS_1 = 90;

  /**
   * The feature id for the '<em><b>Tip Mass 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TIP_MASS_2 = 91;

  /**
   * The feature id for the '<em><b>Tip Mass 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TIP_MASS_3 = 92;

  /**
   * The feature id for the '<em><b>Nac YIner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NAC_YINER = 93;

  /**
   * The feature id for the '<em><b>Gen Iner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GEN_INER = 94;

  /**
   * The feature id for the '<em><b>Hub Iner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__HUB_INER = 95;

  /**
   * The feature id for the '<em><b>GBox Eff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GBOX_EFF = 96;

  /**
   * The feature id for the '<em><b>Gen Eff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GEN_EFF = 97;

  /**
   * The feature id for the '<em><b>GB Ratio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GB_RATIO = 98;

  /**
   * The feature id for the '<em><b>GB Revers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__GB_REVERS = 99;

  /**
   * The feature id for the '<em><b>HSS Br Tq F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__HSS_BR_TQ_F = 100;

  /**
   * The feature id for the '<em><b>HSS Br DT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__HSS_BR_DT = 101;

  /**
   * The feature id for the '<em><b>Dyn Brk Fi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__DYN_BRK_FI = 102;

  /**
   * The feature id for the '<em><b>DT Tor Spr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__DT_TOR_SPR = 103;

  /**
   * The feature id for the '<em><b>DT Tor Dmp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__DT_TOR_DMP = 104;

  /**
   * The feature id for the '<em><b>SIG Sl Pc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SIG_SL_PC = 105;

  /**
   * The feature id for the '<em><b>SIG Sy Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SIG_SY_SP = 106;

  /**
   * The feature id for the '<em><b>SIG Rt Tq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SIG_RT_TQ = 107;

  /**
   * The feature id for the '<em><b>SIG PO Rt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SIG_PO_RT = 108;

  /**
   * The feature id for the '<em><b>TEC Freq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEC_FREQ = 109;

  /**
   * The feature id for the '<em><b>TEC Npol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEC_NPOL = 110;

  /**
   * The feature id for the '<em><b>TEC Sres</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEC_SRES = 111;

  /**
   * The feature id for the '<em><b>TEC Rres</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEC_RRES = 112;

  /**
   * The feature id for the '<em><b>TEC VLL</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEC_VLL = 113;

  /**
   * The feature id for the '<em><b>TEC SLR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEC_SLR = 114;

  /**
   * The feature id for the '<em><b>TEC RLR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEC_RLR = 115;

  /**
   * The feature id for the '<em><b>TEC MR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEC_MR = 116;

  /**
   * The feature id for the '<em><b>Ptfm Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__PTFM_MODEL = 117;

  /**
   * The feature id for the '<em><b>Ptfm File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__PTFM_FILE = 118;

  /**
   * The feature id for the '<em><b>Twr Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TWR_NODES = 119;

  /**
   * The feature id for the '<em><b>Twr File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TWR_FILE = 120;

  /**
   * The feature id for the '<em><b>Yaw Spr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__YAW_SPR = 121;

  /**
   * The feature id for the '<em><b>Yaw Damp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__YAW_DAMP = 122;

  /**
   * The feature id for the '<em><b>Yaw Neut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__YAW_NEUT = 123;

  /**
   * The feature id for the '<em><b>Furling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__FURLING = 124;

  /**
   * The feature id for the '<em><b>Furl File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__FURL_FILE = 125;

  /**
   * The feature id for the '<em><b>Teet Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_MOD = 126;

  /**
   * The feature id for the '<em><b>Teet Dmp P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_DMP_P = 127;

  /**
   * The feature id for the '<em><b>Teet Dmp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_DMP = 128;

  /**
   * The feature id for the '<em><b>Teet CDmp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_CDMP = 129;

  /**
   * The feature id for the '<em><b>Teet SSt P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_SST_P = 130;

  /**
   * The feature id for the '<em><b>Teet HSt P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_HST_P = 131;

  /**
   * The feature id for the '<em><b>Teet SS Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_SS_SP = 132;

  /**
   * The feature id for the '<em><b>Teet HS Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TEET_HS_SP = 133;

  /**
   * The feature id for the '<em><b>TB Dr Con N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TB_DR_CON_N = 134;

  /**
   * The feature id for the '<em><b>TB Dr Con D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TB_DR_CON_D = 135;

  /**
   * The feature id for the '<em><b>Tp Br DT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TP_BR_DT = 136;

  /**
   * The feature id for the '<em><b>Bld File 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BLD_FILE_1 = 137;

  /**
   * The feature id for the '<em><b>Bld File 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BLD_FILE_2 = 138;

  /**
   * The feature id for the '<em><b>Bld File 3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BLD_FILE_3 = 139;

  /**
   * The feature id for the '<em><b>AD File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__AD_FILE = 140;

  /**
   * The feature id for the '<em><b>Noise File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NOISE_FILE = 141;

  /**
   * The feature id for the '<em><b>ADAMS File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__ADAMS_FILE = 142;

  /**
   * The feature id for the '<em><b>Lin File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__LIN_FILE = 143;

  /**
   * The feature id for the '<em><b>Sum Print</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SUM_PRINT = 144;

  /**
   * The feature id for the '<em><b>Out File Fmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__OUT_FILE_FMT = 145;

  /**
   * The feature id for the '<em><b>Tab Delim</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TAB_DELIM = 146;

  /**
   * The feature id for the '<em><b>Out Fmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__OUT_FMT = 147;

  /**
   * The feature id for the '<em><b>TStart</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TSTART = 148;

  /**
   * The feature id for the '<em><b>Dec Fact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__DEC_FACT = 149;

  /**
   * The feature id for the '<em><b>Stts Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__STTS_TIME = 150;

  /**
   * The feature id for the '<em><b>Nc IM Uxn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NC_IM_UXN = 151;

  /**
   * The feature id for the '<em><b>Nc IM Uyn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NC_IM_UYN = 152;

  /**
   * The feature id for the '<em><b>Nc IM Uzn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NC_IM_UZN = 153;

  /**
   * The feature id for the '<em><b>Shft Gag L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__SHFT_GAG_L = 154;

  /**
   * The feature id for the '<em><b>NTw Gages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NTW_GAGES = 155;

  /**
   * The feature id for the '<em><b>Twr Gag Nd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__TWR_GAG_ND = 156;

  /**
   * The feature id for the '<em><b>NBl Gages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__NBL_GAGES = 157;

  /**
   * The feature id for the '<em><b>Bld Gag Nd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__BLD_GAG_ND = 158;

  /**
   * The feature id for the '<em><b>Out List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST__OUT_LIST = 159;

  /**
   * The number of structural features of the '<em>Model Fastfst</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTFST_FEATURE_COUNT = 160;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.HeaderImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 1;

  /**
   * The feature id for the '<em><b>Rows</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__ROWS = 0;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.SectionImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getSection()
   * @generated
   */
  int SECTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bEchoImpl <em>bEcho</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bEchoImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbEcho()
   * @generated
   */
  int BECHO = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECHO__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECHO__NAME = 1;

  /**
   * The number of structural features of the '<em>bEcho</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECHO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iADAMSPrepImpl <em>iADAMS Prep</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iADAMSPrepImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiADAMSPrep()
   * @generated
   */
  int IADAMS_PREP = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IADAMS_PREP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IADAMS_PREP__NAME = 1;

  /**
   * The number of structural features of the '<em>iADAMS Prep</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IADAMS_PREP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iAnalModeImpl <em>iAnal Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iAnalModeImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiAnalMode()
   * @generated
   */
  int IANAL_MODE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IANAL_MODE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IANAL_MODE__NAME = 1;

  /**
   * The number of structural features of the '<em>iAnal Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IANAL_MODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iNumBlImpl <em>iNum Bl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iNumBlImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiNumBl()
   * @generated
   */
  int INUM_BL = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_BL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_BL__NAME = 1;

  /**
   * The number of structural features of the '<em>iNum Bl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_BL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTMaxImpl <em>nT Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTMaxImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTMax()
   * @generated
   */
  int NT_MAX = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_MAX__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_MAX__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_MAX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nDTImpl <em>nDT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nDTImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnDT()
   * @generated
   */
  int NDT = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT__NAME = 1;

  /**
   * The number of structural features of the '<em>nDT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iYCModeImpl <em>iYC Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iYCModeImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiYCMode()
   * @generated
   */
  int IYC_MODE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IYC_MODE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IYC_MODE__NAME = 1;

  /**
   * The number of structural features of the '<em>iYC Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IYC_MODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTYCOnImpl <em>nTYC On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTYCOnImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTYCOn()
   * @generated
   */
  int NTYC_ON = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTYC_ON__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTYC_ON__NAME = 1;

  /**
   * The number of structural features of the '<em>nTYC On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTYC_ON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iPCModeImpl <em>iPC Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iPCModeImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiPCMode()
   * @generated
   */
  int IPC_MODE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_MODE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_MODE__NAME = 1;

  /**
   * The number of structural features of the '<em>iPC Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_MODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTPCOnImpl <em>nTPC On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTPCOnImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTPCOn()
   * @generated
   */
  int NTPC_ON = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTPC_ON__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTPC_ON__NAME = 1;

  /**
   * The number of structural features of the '<em>nTPC On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTPC_ON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iVSContrlImpl <em>iVS Contrl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iVSContrlImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiVSContrl()
   * @generated
   */
  int IVS_CONTRL = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVS_CONTRL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVS_CONTRL__NAME = 1;

  /**
   * The number of structural features of the '<em>iVS Contrl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVS_CONTRL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nVS_RtGnSpImpl <em>nVS Rt Gn Sp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nVS_RtGnSpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnVS_RtGnSp()
   * @generated
   */
  int NVS_RT_GN_SP = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RT_GN_SP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RT_GN_SP__NAME = 1;

  /**
   * The number of structural features of the '<em>nVS Rt Gn Sp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RT_GN_SP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nVS_RtTqImpl <em>nVS Rt Tq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nVS_RtTqImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnVS_RtTq()
   * @generated
   */
  int NVS_RT_TQ = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RT_TQ__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RT_TQ__NAME = 1;

  /**
   * The number of structural features of the '<em>nVS Rt Tq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RT_TQ_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nVS_Rgn2KImpl <em>nVS Rgn2 K</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nVS_Rgn2KImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnVS_Rgn2K()
   * @generated
   */
  int NVS_RGN2_K = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RGN2_K__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RGN2_K__NAME = 1;

  /**
   * The number of structural features of the '<em>nVS Rgn2 K</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_RGN2_K_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nVS_SlPcImpl <em>nVS Sl Pc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nVS_SlPcImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnVS_SlPc()
   * @generated
   */
  int NVS_SL_PC = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_SL_PC__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_SL_PC__NAME = 1;

  /**
   * The number of structural features of the '<em>nVS Sl Pc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NVS_SL_PC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iGenModelImpl <em>iGen Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iGenModelImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiGenModel()
   * @generated
   */
  int IGEN_MODEL = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGEN_MODEL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGEN_MODEL__NAME = 1;

  /**
   * The number of structural features of the '<em>iGen Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGEN_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bGenTiStrImpl <em>bGen Ti Str</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bGenTiStrImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbGenTiStr()
   * @generated
   */
  int BGEN_TI_STR = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_TI_STR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_TI_STR__NAME = 1;

  /**
   * The number of structural features of the '<em>bGen Ti Str</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_TI_STR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bGenTiStpImpl <em>bGen Ti Stp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bGenTiStpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbGenTiStp()
   * @generated
   */
  int BGEN_TI_STP = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_TI_STP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_TI_STP__NAME = 1;

  /**
   * The number of structural features of the '<em>bGen Ti Stp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_TI_STP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nSpdGenOnImpl <em>nSpd Gen On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nSpdGenOnImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnSpdGenOn()
   * @generated
   */
  int NSPD_GEN_ON = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSPD_GEN_ON__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSPD_GEN_ON__NAME = 1;

  /**
   * The number of structural features of the '<em>nSpd Gen On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSPD_GEN_ON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTimGenOnImpl <em>nTim Gen On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTimGenOnImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTimGenOn()
   * @generated
   */
  int NTIM_GEN_ON = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIM_GEN_ON__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIM_GEN_ON__NAME = 1;

  /**
   * The number of structural features of the '<em>nTim Gen On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIM_GEN_ON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTimGenOfImpl <em>nTim Gen Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTimGenOfImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTimGenOf()
   * @generated
   */
  int NTIM_GEN_OF = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIM_GEN_OF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIM_GEN_OF__NAME = 1;

  /**
   * The number of structural features of the '<em>nTim Gen Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIM_GEN_OF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iHSSBrModeImpl <em>iHSS Br Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iHSSBrModeImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiHSSBrMode()
   * @generated
   */
  int IHSS_BR_MODE = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHSS_BR_MODE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHSS_BR_MODE__NAME = 1;

  /**
   * The number of structural features of the '<em>iHSS Br Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHSS_BR_MODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTHSSBrDpImpl <em>nTHSS Br Dp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTHSSBrDpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTHSSBrDp()
   * @generated
   */
  int NTHSS_BR_DP = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTHSS_BR_DP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTHSS_BR_DP__NAME = 1;

  /**
   * The number of structural features of the '<em>nTHSS Br Dp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTHSS_BR_DP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTiDynBrkImpl <em>nTi Dyn Brk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTiDynBrkImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTiDynBrk()
   * @generated
   */
  int NTI_DYN_BRK = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTI_DYN_BRK__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTI_DYN_BRK__NAME = 1;

  /**
   * The number of structural features of the '<em>nTi Dyn Brk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTI_DYN_BRK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTTpBrDp_1_Impl <em>nT Tp Br Dp 1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTTpBrDp_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTTpBrDp_1_()
   * @generated
   */
  int NT_TP_BR_DP_1 = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_1__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Tp Br Dp 1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTTpBrDp_2_Impl <em>nT Tp Br Dp 2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTTpBrDp_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTTpBrDp_2_()
   * @generated
   */
  int NT_TP_BR_DP_2 = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_2__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Tp Br Dp 2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTTpBrDp_3_Impl <em>nT Tp Br Dp 3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTTpBrDp_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTTpBrDp_3_()
   * @generated
   */
  int NT_TP_BR_DP_3 = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_3__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Tp Br Dp 3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_TP_BR_DP_3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTBDepISp_1_Impl <em>nTB Dep ISp 1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTBDepISp_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTBDepISp_1_()
   * @generated
   */
  int NTB_DEP_ISP_1 = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_1__NAME = 1;

  /**
   * The number of structural features of the '<em>nTB Dep ISp 1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTBDepISp_2_Impl <em>nTB Dep ISp 2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTBDepISp_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTBDepISp_2_()
   * @generated
   */
  int NTB_DEP_ISP_2 = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_2__NAME = 1;

  /**
   * The number of structural features of the '<em>nTB Dep ISp 2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTBDepISp_3_Impl <em>nTB Dep ISp 3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTBDepISp_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTBDepISp_3_()
   * @generated
   */
  int NTB_DEP_ISP_3 = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_3__NAME = 1;

  /**
   * The number of structural features of the '<em>nTB Dep ISp 3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DEP_ISP_3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTYawManSImpl <em>nT Yaw Man S</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTYawManSImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTYawManS()
   * @generated
   */
  int NT_YAW_MAN_S = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_YAW_MAN_S__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_YAW_MAN_S__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Yaw Man S</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_YAW_MAN_S_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTYawManEImpl <em>nT Yaw Man E</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTYawManEImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTYawManE()
   * @generated
   */
  int NT_YAW_MAN_E = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_YAW_MAN_E__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_YAW_MAN_E__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Yaw Man E</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_YAW_MAN_E_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNacYawFImpl <em>nNac Yaw F</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNacYawFImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNacYawF()
   * @generated
   */
  int NNAC_YAW_F = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YAW_F__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YAW_F__NAME = 1;

  /**
   * The number of structural features of the '<em>nNac Yaw F</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YAW_F_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTPitManS_1_Impl <em>nT Pit Man S1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTPitManS_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTPitManS_1_()
   * @generated
   */
  int NT_PIT_MAN_S1 = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S1__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Pit Man S1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTPitManS_2_Impl <em>nT Pit Man S2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTPitManS_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTPitManS_2_()
   * @generated
   */
  int NT_PIT_MAN_S2 = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S2__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Pit Man S2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTPitManS_3_Impl <em>nT Pit Man S3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTPitManS_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTPitManS_3_()
   * @generated
   */
  int NT_PIT_MAN_S3 = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S3__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Pit Man S3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_S3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTPitManE_1_Impl <em>nT Pit Man E1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTPitManE_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTPitManE_1_()
   * @generated
   */
  int NT_PIT_MAN_E1 = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E1__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Pit Man E1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTPitManE_2_Impl <em>nT Pit Man E2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTPitManE_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTPitManE_2_()
   * @generated
   */
  int NT_PIT_MAN_E2 = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E2__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Pit Man E2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTPitManE_3_Impl <em>nT Pit Man E3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTPitManE_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTPitManE_3_()
   * @generated
   */
  int NT_PIT_MAN_E3 = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E3__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Pit Man E3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_PIT_MAN_E3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nBlPitch_1_Impl <em>nBl Pitch 1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nBlPitch_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnBlPitch_1_()
   * @generated
   */
  int NBL_PITCH_1 = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_1__NAME = 1;

  /**
   * The number of structural features of the '<em>nBl Pitch 1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nBlPitch_2_Impl <em>nBl Pitch 2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nBlPitch_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnBlPitch_2_()
   * @generated
   */
  int NBL_PITCH_2 = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_2__NAME = 1;

  /**
   * The number of structural features of the '<em>nBl Pitch 2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nBlPitch_3_Impl <em>nBl Pitch 3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nBlPitch_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnBlPitch_3_()
   * @generated
   */
  int NBL_PITCH_3 = 44;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_3__NAME = 1;

  /**
   * The number of structural features of the '<em>nBl Pitch 3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nBlPitchF_1_Impl <em>nBl Pitch F1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nBlPitchF_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnBlPitchF_1_()
   * @generated
   */
  int NBL_PITCH_F1 = 45;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F1__NAME = 1;

  /**
   * The number of structural features of the '<em>nBl Pitch F1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nBlPitchF_2_Impl <em>nBl Pitch F2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nBlPitchF_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnBlPitchF_2_()
   * @generated
   */
  int NBL_PITCH_F2 = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F2__NAME = 1;

  /**
   * The number of structural features of the '<em>nBl Pitch F2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nBlPitchF_3_Impl <em>nBl Pitch F3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nBlPitchF_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnBlPitchF_3_()
   * @generated
   */
  int NBL_PITCH_F3 = 47;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F3__NAME = 1;

  /**
   * The number of structural features of the '<em>nBl Pitch F3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_PITCH_F3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nGravityImpl <em>nGravity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nGravityImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnGravity()
   * @generated
   */
  int NGRAVITY = 48;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRAVITY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRAVITY__NAME = 1;

  /**
   * The number of structural features of the '<em>nGravity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRAVITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bFlapDOF1Impl <em>bFlap DOF1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bFlapDOF1Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbFlapDOF1()
   * @generated
   */
  int BFLAP_DOF1 = 49;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFLAP_DOF1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFLAP_DOF1__NAME = 1;

  /**
   * The number of structural features of the '<em>bFlap DOF1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFLAP_DOF1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bFlapDOF2Impl <em>bFlap DOF2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bFlapDOF2Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbFlapDOF2()
   * @generated
   */
  int BFLAP_DOF2 = 50;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFLAP_DOF2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFLAP_DOF2__NAME = 1;

  /**
   * The number of structural features of the '<em>bFlap DOF2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFLAP_DOF2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bEdgeDOFImpl <em>bEdge DOF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bEdgeDOFImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbEdgeDOF()
   * @generated
   */
  int BEDGE_DOF = 51;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEDGE_DOF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEDGE_DOF__NAME = 1;

  /**
   * The number of structural features of the '<em>bEdge DOF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEDGE_DOF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bTeetDOFImpl <em>bTeet DOF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bTeetDOFImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbTeetDOF()
   * @generated
   */
  int BTEET_DOF = 52;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTEET_DOF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTEET_DOF__NAME = 1;

  /**
   * The number of structural features of the '<em>bTeet DOF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTEET_DOF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bDrTrDOFImpl <em>bDr Tr DOF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bDrTrDOFImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbDrTrDOF()
   * @generated
   */
  int BDR_TR_DOF = 53;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDR_TR_DOF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDR_TR_DOF__NAME = 1;

  /**
   * The number of structural features of the '<em>bDr Tr DOF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDR_TR_DOF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bGenDOFImpl <em>bGen DOF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bGenDOFImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbGenDOF()
   * @generated
   */
  int BGEN_DOF = 54;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_DOF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_DOF__NAME = 1;

  /**
   * The number of structural features of the '<em>bGen DOF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGEN_DOF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bYawDOFImpl <em>bYaw DOF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bYawDOFImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbYawDOF()
   * @generated
   */
  int BYAW_DOF = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYAW_DOF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYAW_DOF__NAME = 1;

  /**
   * The number of structural features of the '<em>bYaw DOF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYAW_DOF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bTwFADOF1Impl <em>bTw FADOF1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bTwFADOF1Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbTwFADOF1()
   * @generated
   */
  int BTW_FADOF1 = 56;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_FADOF1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_FADOF1__NAME = 1;

  /**
   * The number of structural features of the '<em>bTw FADOF1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_FADOF1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bTwFADOF2Impl <em>bTw FADOF2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bTwFADOF2Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbTwFADOF2()
   * @generated
   */
  int BTW_FADOF2 = 57;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_FADOF2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_FADOF2__NAME = 1;

  /**
   * The number of structural features of the '<em>bTw FADOF2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_FADOF2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bTwSSDOF1Impl <em>bTw SSDOF1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bTwSSDOF1Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbTwSSDOF1()
   * @generated
   */
  int BTW_SSDOF1 = 58;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_SSDOF1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_SSDOF1__NAME = 1;

  /**
   * The number of structural features of the '<em>bTw SSDOF1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_SSDOF1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bTwSSDOF2Impl <em>bTw SSDOF2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bTwSSDOF2Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbTwSSDOF2()
   * @generated
   */
  int BTW_SSDOF2 = 59;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_SSDOF2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_SSDOF2__NAME = 1;

  /**
   * The number of structural features of the '<em>bTw SSDOF2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTW_SSDOF2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bCompAeroImpl <em>bComp Aero</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bCompAeroImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbCompAero()
   * @generated
   */
  int BCOMP_AERO = 60;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMP_AERO__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMP_AERO__NAME = 1;

  /**
   * The number of structural features of the '<em>bComp Aero</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMP_AERO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bCompNoiseImpl <em>bComp Noise</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bCompNoiseImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbCompNoise()
   * @generated
   */
  int BCOMP_NOISE = 61;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMP_NOISE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMP_NOISE__NAME = 1;

  /**
   * The number of structural features of the '<em>bComp Noise</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCOMP_NOISE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nOoPDeflImpl <em>nOo PDefl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nOoPDeflImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnOoPDefl()
   * @generated
   */
  int NOO_PDEFL = 62;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOO_PDEFL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOO_PDEFL__NAME = 1;

  /**
   * The number of structural features of the '<em>nOo PDefl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOO_PDEFL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nIPDeflImpl <em>nIP Defl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nIPDeflImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnIPDefl()
   * @generated
   */
  int NIP_DEFL = 63;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIP_DEFL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIP_DEFL__NAME = 1;

  /**
   * The number of structural features of the '<em>nIP Defl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIP_DEFL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTeetDeflImpl <em>nTeet Defl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTeetDeflImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTeetDefl()
   * @generated
   */
  int NTEET_DEFL = 64;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DEFL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DEFL__NAME = 1;

  /**
   * The number of structural features of the '<em>nTeet Defl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DEFL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nAzimuthImpl <em>nAzimuth</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nAzimuthImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnAzimuth()
   * @generated
   */
  int NAZIMUTH = 65;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAZIMUTH__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAZIMUTH__NAME = 1;

  /**
   * The number of structural features of the '<em>nAzimuth</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAZIMUTH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nRotSpeedImpl <em>nRot Speed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nRotSpeedImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnRotSpeed()
   * @generated
   */
  int NROT_SPEED = 66;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NROT_SPEED__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NROT_SPEED__NAME = 1;

  /**
   * The number of structural features of the '<em>nRot Speed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NROT_SPEED_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNacYawImpl <em>nNac Yaw</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNacYawImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNacYaw()
   * @generated
   */
  int NNAC_YAW = 67;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YAW__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YAW__NAME = 1;

  /**
   * The number of structural features of the '<em>nNac Yaw</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YAW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTTDspFAImpl <em>nTT Dsp FA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTTDspFAImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTTDspFA()
   * @generated
   */
  int NTT_DSP_FA = 68;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTT_DSP_FA__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTT_DSP_FA__NAME = 1;

  /**
   * The number of structural features of the '<em>nTT Dsp FA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTT_DSP_FA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTTDspSSImpl <em>nTT Dsp SS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTTDspSSImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTTDspSS()
   * @generated
   */
  int NTT_DSP_SS = 69;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTT_DSP_SS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTT_DSP_SS__NAME = 1;

  /**
   * The number of structural features of the '<em>nTT Dsp SS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTT_DSP_SS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTipRadImpl <em>nTip Rad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTipRadImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTipRad()
   * @generated
   */
  int NTIP_RAD = 70;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_RAD__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_RAD__NAME = 1;

  /**
   * The number of structural features of the '<em>nTip Rad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_RAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nHubRadImpl <em>nHub Rad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nHubRadImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnHubRad()
   * @generated
   */
  int NHUB_RAD = 71;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_RAD__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_RAD__NAME = 1;

  /**
   * The number of structural features of the '<em>nHub Rad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_RAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nPSpnElNImpl <em>nP Spn El N</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nPSpnElNImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnPSpnElN()
   * @generated
   */
  int NP_SPN_EL_N = 72;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NP_SPN_EL_N__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NP_SPN_EL_N__NAME = 1;

  /**
   * The number of structural features of the '<em>nP Spn El N</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NP_SPN_EL_N_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nUndSlingImpl <em>nUnd Sling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nUndSlingImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnUndSling()
   * @generated
   */
  int NUND_SLING = 73;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUND_SLING__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUND_SLING__NAME = 1;

  /**
   * The number of structural features of the '<em>nUnd Sling</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUND_SLING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nHubCMImpl <em>nHub CM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nHubCMImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnHubCM()
   * @generated
   */
  int NHUB_CM = 74;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_CM__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_CM__NAME = 1;

  /**
   * The number of structural features of the '<em>nHub CM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_CM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nOverHangImpl <em>nOver Hang</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nOverHangImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnOverHang()
   * @generated
   */
  int NOVER_HANG = 75;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOVER_HANG__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOVER_HANG__NAME = 1;

  /**
   * The number of structural features of the '<em>nOver Hang</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOVER_HANG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNacCMxnImpl <em>nNac CMxn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNacCMxnImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNacCMxn()
   * @generated
   */
  int NNAC_CMXN = 76;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMXN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMXN__NAME = 1;

  /**
   * The number of structural features of the '<em>nNac CMxn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMXN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNacCMynImpl <em>nNac CMyn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNacCMynImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNacCMyn()
   * @generated
   */
  int NNAC_CMYN = 77;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMYN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMYN__NAME = 1;

  /**
   * The number of structural features of the '<em>nNac CMyn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMYN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNacCMznImpl <em>nNac CMzn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNacCMznImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNacCMzn()
   * @generated
   */
  int NNAC_CMZN = 78;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMZN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMZN__NAME = 1;

  /**
   * The number of structural features of the '<em>nNac CMzn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_CMZN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTowerHtImpl <em>nTower Ht</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTowerHtImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTowerHt()
   * @generated
   */
  int NTOWER_HT = 79;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTOWER_HT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTOWER_HT__NAME = 1;

  /**
   * The number of structural features of the '<em>nTower Ht</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTOWER_HT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTwr2ShftImpl <em>nTwr2 Shft</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTwr2ShftImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTwr2Shft()
   * @generated
   */
  int NTWR2_SHFT = 80;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR2_SHFT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR2_SHFT__NAME = 1;

  /**
   * The number of structural features of the '<em>nTwr2 Shft</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR2_SHFT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTwrRBHtImpl <em>nTwr RB Ht</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTwrRBHtImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTwrRBHt()
   * @generated
   */
  int NTWR_RB_HT = 81;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_RB_HT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_RB_HT__NAME = 1;

  /**
   * The number of structural features of the '<em>nTwr RB Ht</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_RB_HT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nShftTiltImpl <em>nShft Tilt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nShftTiltImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnShftTilt()
   * @generated
   */
  int NSHFT_TILT = 82;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHFT_TILT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHFT_TILT__NAME = 1;

  /**
   * The number of structural features of the '<em>nShft Tilt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHFT_TILT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nDelta3Impl <em>nDelta3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nDelta3Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnDelta3()
   * @generated
   */
  int NDELTA3 = 83;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDELTA3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDELTA3__NAME = 1;

  /**
   * The number of structural features of the '<em>nDelta3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDELTA3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nPreCone_1_Impl <em>nPre Cone 1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nPreCone_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnPreCone_1_()
   * @generated
   */
  int NPRE_CONE_1 = 84;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_1__NAME = 1;

  /**
   * The number of structural features of the '<em>nPre Cone 1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nPreCone_2_Impl <em>nPre Cone 2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nPreCone_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnPreCone_2_()
   * @generated
   */
  int NPRE_CONE_2 = 85;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_2__NAME = 1;

  /**
   * The number of structural features of the '<em>nPre Cone 2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nPreCone_3_Impl <em>nPre Cone 3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nPreCone_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnPreCone_3_()
   * @generated
   */
  int NPRE_CONE_3 = 86;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_3__NAME = 1;

  /**
   * The number of structural features of the '<em>nPre Cone 3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRE_CONE_3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nAzimB1UpImpl <em>nAzim B1 Up</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nAzimB1UpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnAzimB1Up()
   * @generated
   */
  int NAZIM_B1_UP = 87;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAZIM_B1_UP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAZIM_B1_UP__NAME = 1;

  /**
   * The number of structural features of the '<em>nAzim B1 Up</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAZIM_B1_UP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nYawBrMassImpl <em>nYaw Br Mass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nYawBrMassImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnYawBrMass()
   * @generated
   */
  int NYAW_BR_MASS = 88;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_BR_MASS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_BR_MASS__NAME = 1;

  /**
   * The number of structural features of the '<em>nYaw Br Mass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_BR_MASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNacMassImpl <em>nNac Mass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNacMassImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNacMass()
   * @generated
   */
  int NNAC_MASS = 89;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_MASS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_MASS__NAME = 1;

  /**
   * The number of structural features of the '<em>nNac Mass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_MASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nHubMassImpl <em>nHub Mass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nHubMassImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnHubMass()
   * @generated
   */
  int NHUB_MASS = 90;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_MASS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_MASS__NAME = 1;

  /**
   * The number of structural features of the '<em>nHub Mass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_MASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTipMass_1_Impl <em>nTip Mass 1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTipMass_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTipMass_1_()
   * @generated
   */
  int NTIP_MASS_1 = 91;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_1__NAME = 1;

  /**
   * The number of structural features of the '<em>nTip Mass 1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTipMass_2_Impl <em>nTip Mass 2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTipMass_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTipMass_2_()
   * @generated
   */
  int NTIP_MASS_2 = 92;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_2__NAME = 1;

  /**
   * The number of structural features of the '<em>nTip Mass 2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTipMass_3_Impl <em>nTip Mass 3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTipMass_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTipMass_3_()
   * @generated
   */
  int NTIP_MASS_3 = 93;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_3__NAME = 1;

  /**
   * The number of structural features of the '<em>nTip Mass 3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNacYInerImpl <em>nNac YIner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNacYInerImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNacYIner()
   * @generated
   */
  int NNAC_YINER = 94;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YINER__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YINER__NAME = 1;

  /**
   * The number of structural features of the '<em>nNac YIner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNAC_YINER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nGenInerImpl <em>nGen Iner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nGenInerImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnGenIner()
   * @generated
   */
  int NGEN_INER = 95;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGEN_INER__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGEN_INER__NAME = 1;

  /**
   * The number of structural features of the '<em>nGen Iner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGEN_INER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nHubInerImpl <em>nHub Iner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nHubInerImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnHubIner()
   * @generated
   */
  int NHUB_INER = 96;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_INER__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_INER__NAME = 1;

  /**
   * The number of structural features of the '<em>nHub Iner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_INER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nGBoxEffImpl <em>nG Box Eff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nGBoxEffImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnGBoxEff()
   * @generated
   */
  int NG_BOX_EFF = 97;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NG_BOX_EFF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NG_BOX_EFF__NAME = 1;

  /**
   * The number of structural features of the '<em>nG Box Eff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NG_BOX_EFF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nGenEffImpl <em>nGen Eff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nGenEffImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnGenEff()
   * @generated
   */
  int NGEN_EFF = 98;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGEN_EFF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGEN_EFF__NAME = 1;

  /**
   * The number of structural features of the '<em>nGen Eff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGEN_EFF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nGBRatioImpl <em>nGB Ratio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nGBRatioImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnGBRatio()
   * @generated
   */
  int NGB_RATIO = 99;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGB_RATIO__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGB_RATIO__NAME = 1;

  /**
   * The number of structural features of the '<em>nGB Ratio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGB_RATIO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bGBReversImpl <em>bGB Revers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bGBReversImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbGBRevers()
   * @generated
   */
  int BGB_REVERS = 100;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGB_REVERS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGB_REVERS__NAME = 1;

  /**
   * The number of structural features of the '<em>bGB Revers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BGB_REVERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nHSSBrTqFImpl <em>nHSS Br Tq F</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nHSSBrTqFImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnHSSBrTqF()
   * @generated
   */
  int NHSS_BR_TQ_F = 101;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHSS_BR_TQ_F__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHSS_BR_TQ_F__NAME = 1;

  /**
   * The number of structural features of the '<em>nHSS Br Tq F</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHSS_BR_TQ_F_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nHSSBrDTImpl <em>nHSS Br DT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nHSSBrDTImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnHSSBrDT()
   * @generated
   */
  int NHSS_BR_DT = 102;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHSS_BR_DT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHSS_BR_DT__NAME = 1;

  /**
   * The number of structural features of the '<em>nHSS Br DT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHSS_BR_DT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fDynBrkFiImpl <em>fDyn Brk Fi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fDynBrkFiImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfDynBrkFi()
   * @generated
   */
  int FDYN_BRK_FI = 103;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FDYN_BRK_FI__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FDYN_BRK_FI__NAME = 1;

  /**
   * The number of structural features of the '<em>fDyn Brk Fi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FDYN_BRK_FI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nDTTorSprImpl <em>nDT Tor Spr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nDTTorSprImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnDTTorSpr()
   * @generated
   */
  int NDT_TOR_SPR = 104;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_TOR_SPR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_TOR_SPR__NAME = 1;

  /**
   * The number of structural features of the '<em>nDT Tor Spr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_TOR_SPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nDTTorDmpImpl <em>nDT Tor Dmp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nDTTorDmpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnDTTorDmp()
   * @generated
   */
  int NDT_TOR_DMP = 105;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_TOR_DMP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_TOR_DMP__NAME = 1;

  /**
   * The number of structural features of the '<em>nDT Tor Dmp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_TOR_DMP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nSIG_SlPcImpl <em>nSIG Sl Pc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nSIG_SlPcImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnSIG_SlPc()
   * @generated
   */
  int NSIG_SL_PC = 106;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_SL_PC__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_SL_PC__NAME = 1;

  /**
   * The number of structural features of the '<em>nSIG Sl Pc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_SL_PC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nSIG_SySpImpl <em>nSIG Sy Sp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nSIG_SySpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnSIG_SySp()
   * @generated
   */
  int NSIG_SY_SP = 107;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_SY_SP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_SY_SP__NAME = 1;

  /**
   * The number of structural features of the '<em>nSIG Sy Sp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_SY_SP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nSIG_RtTqImpl <em>nSIG Rt Tq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nSIG_RtTqImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnSIG_RtTq()
   * @generated
   */
  int NSIG_RT_TQ = 108;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_RT_TQ__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_RT_TQ__NAME = 1;

  /**
   * The number of structural features of the '<em>nSIG Rt Tq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_RT_TQ_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nSIG_PORtImpl <em>nSIG PO Rt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nSIG_PORtImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnSIG_PORt()
   * @generated
   */
  int NSIG_PO_RT = 109;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_PO_RT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_PO_RT__NAME = 1;

  /**
   * The number of structural features of the '<em>nSIG PO Rt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSIG_PO_RT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTEC_FreqImpl <em>nTEC Freq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTEC_FreqImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTEC_Freq()
   * @generated
   */
  int NTEC_FREQ = 110;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_FREQ__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_FREQ__NAME = 1;

  /**
   * The number of structural features of the '<em>nTEC Freq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_FREQ_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTEC_NpolImpl <em>nTEC Npol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTEC_NpolImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTEC_Npol()
   * @generated
   */
  int NTEC_NPOL = 111;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_NPOL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_NPOL__NAME = 1;

  /**
   * The number of structural features of the '<em>nTEC Npol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_NPOL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTEC_SresImpl <em>nTEC Sres</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTEC_SresImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTEC_Sres()
   * @generated
   */
  int NTEC_SRES = 112;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_SRES__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_SRES__NAME = 1;

  /**
   * The number of structural features of the '<em>nTEC Sres</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_SRES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTEC_RresImpl <em>nTEC Rres</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTEC_RresImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTEC_Rres()
   * @generated
   */
  int NTEC_RRES = 113;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_RRES__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_RRES__NAME = 1;

  /**
   * The number of structural features of the '<em>nTEC Rres</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_RRES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTEC_VLLImpl <em>nTEC VLL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTEC_VLLImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTEC_VLL()
   * @generated
   */
  int NTEC_VLL = 114;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_VLL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_VLL__NAME = 1;

  /**
   * The number of structural features of the '<em>nTEC VLL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_VLL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTEC_SLRImpl <em>nTEC SLR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTEC_SLRImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTEC_SLR()
   * @generated
   */
  int NTEC_SLR = 115;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_SLR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_SLR__NAME = 1;

  /**
   * The number of structural features of the '<em>nTEC SLR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_SLR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTEC_RLRImpl <em>nTEC RLR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTEC_RLRImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTEC_RLR()
   * @generated
   */
  int NTEC_RLR = 116;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_RLR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_RLR__NAME = 1;

  /**
   * The number of structural features of the '<em>nTEC RLR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_RLR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTEC_MRImpl <em>nTEC MR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTEC_MRImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTEC_MR()
   * @generated
   */
  int NTEC_MR = 117;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_MR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_MR__NAME = 1;

  /**
   * The number of structural features of the '<em>nTEC MR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEC_MR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iPtfmModelImpl <em>iPtfm Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iPtfmModelImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiPtfmModel()
   * @generated
   */
  int IPTFM_MODEL = 118;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPTFM_MODEL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPTFM_MODEL__NAME = 1;

  /**
   * The number of structural features of the '<em>iPtfm Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPTFM_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fPtfmFileImpl <em>fPtfm File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fPtfmFileImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfPtfmFile()
   * @generated
   */
  int FPTFM_FILE = 119;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FPTFM_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FPTFM_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>fPtfm File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FPTFM_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iTwrNodesImpl <em>iTwr Nodes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iTwrNodesImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiTwrNodes()
   * @generated
   */
  int ITWR_NODES = 120;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_NODES__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_NODES__NAME = 1;

  /**
   * The number of structural features of the '<em>iTwr Nodes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_NODES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fTwrFileImpl <em>fTwr File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fTwrFileImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfTwrFile()
   * @generated
   */
  int FTWR_FILE = 121;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FTWR_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FTWR_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>fTwr File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FTWR_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nYawSprImpl <em>nYaw Spr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nYawSprImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnYawSpr()
   * @generated
   */
  int NYAW_SPR = 122;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_SPR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_SPR__NAME = 1;

  /**
   * The number of structural features of the '<em>nYaw Spr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_SPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nYawDampImpl <em>nYaw Damp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nYawDampImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnYawDamp()
   * @generated
   */
  int NYAW_DAMP = 123;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_DAMP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_DAMP__NAME = 1;

  /**
   * The number of structural features of the '<em>nYaw Damp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_DAMP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nYawNeutImpl <em>nYaw Neut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nYawNeutImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnYawNeut()
   * @generated
   */
  int NYAW_NEUT = 124;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_NEUT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_NEUT__NAME = 1;

  /**
   * The number of structural features of the '<em>nYaw Neut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NYAW_NEUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bFurlingImpl <em>bFurling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bFurlingImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbFurling()
   * @generated
   */
  int BFURLING = 125;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFURLING__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFURLING__NAME = 1;

  /**
   * The number of structural features of the '<em>bFurling</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BFURLING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fFurlFileImpl <em>fFurl File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fFurlFileImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfFurlFile()
   * @generated
   */
  int FFURL_FILE = 126;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FFURL_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FFURL_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>fFurl File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FFURL_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iTeetModImpl <em>iTeet Mod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iTeetModImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiTeetMod()
   * @generated
   */
  int ITEET_MOD = 127;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEET_MOD__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEET_MOD__NAME = 1;

  /**
   * The number of structural features of the '<em>iTeet Mod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEET_MOD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTeetDmpPImpl <em>nTeet Dmp P</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTeetDmpPImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTeetDmpP()
   * @generated
   */
  int NTEET_DMP_P = 128;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DMP_P__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DMP_P__NAME = 1;

  /**
   * The number of structural features of the '<em>nTeet Dmp P</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DMP_P_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTeetDmpImpl <em>nTeet Dmp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTeetDmpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTeetDmp()
   * @generated
   */
  int NTEET_DMP = 129;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DMP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DMP__NAME = 1;

  /**
   * The number of structural features of the '<em>nTeet Dmp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_DMP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTeetCDmpImpl <em>nTeet CDmp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTeetCDmpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTeetCDmp()
   * @generated
   */
  int NTEET_CDMP = 130;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_CDMP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_CDMP__NAME = 1;

  /**
   * The number of structural features of the '<em>nTeet CDmp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_CDMP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTeetSStPImpl <em>nTeet SSt P</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTeetSStPImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTeetSStP()
   * @generated
   */
  int NTEET_SST_P = 131;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_SST_P__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_SST_P__NAME = 1;

  /**
   * The number of structural features of the '<em>nTeet SSt P</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_SST_P_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTeetHStPImpl <em>nTeet HSt P</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTeetHStPImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTeetHStP()
   * @generated
   */
  int NTEET_HST_P = 132;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_HST_P__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_HST_P__NAME = 1;

  /**
   * The number of structural features of the '<em>nTeet HSt P</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_HST_P_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTeetSSSpImpl <em>nTeet SS Sp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTeetSSSpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTeetSSSp()
   * @generated
   */
  int NTEET_SS_SP = 133;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_SS_SP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_SS_SP__NAME = 1;

  /**
   * The number of structural features of the '<em>nTeet SS Sp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_SS_SP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTeetHSSpImpl <em>nTeet HS Sp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTeetHSSpImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTeetHSSp()
   * @generated
   */
  int NTEET_HS_SP = 134;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_HS_SP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_HS_SP__NAME = 1;

  /**
   * The number of structural features of the '<em>nTeet HS Sp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTEET_HS_SP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTBDrConNImpl <em>nTB Dr Con N</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTBDrConNImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTBDrConN()
   * @generated
   */
  int NTB_DR_CON_N = 135;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DR_CON_N__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DR_CON_N__NAME = 1;

  /**
   * The number of structural features of the '<em>nTB Dr Con N</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DR_CON_N_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTBDrConDImpl <em>nTB Dr Con D</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTBDrConDImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTBDrConD()
   * @generated
   */
  int NTB_DR_CON_D = 136;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DR_CON_D__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DR_CON_D__NAME = 1;

  /**
   * The number of structural features of the '<em>nTB Dr Con D</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTB_DR_CON_D_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTpBrDTImpl <em>nTp Br DT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTpBrDTImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTpBrDT()
   * @generated
   */
  int NTP_BR_DT = 137;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTP_BR_DT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTP_BR_DT__NAME = 1;

  /**
   * The number of structural features of the '<em>nTp Br DT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTP_BR_DT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fBldFile_1_Impl <em>fBld File 1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fBldFile_1_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfBldFile_1_()
   * @generated
   */
  int FBLD_FILE_1 = 138;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_1__NAME = 1;

  /**
   * The number of structural features of the '<em>fBld File 1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fBldFile_2_Impl <em>fBld File 2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fBldFile_2_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfBldFile_2_()
   * @generated
   */
  int FBLD_FILE_2 = 139;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_2__NAME = 1;

  /**
   * The number of structural features of the '<em>fBld File 2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fBldFile_3_Impl <em>fBld File 3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fBldFile_3_Impl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfBldFile_3_()
   * @generated
   */
  int FBLD_FILE_3 = 140;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_3__NAME = 1;

  /**
   * The number of structural features of the '<em>fBld File 3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FBLD_FILE_3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fADFileImpl <em>fAD File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fADFileImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfADFile()
   * @generated
   */
  int FAD_FILE = 141;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAD_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAD_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>fAD File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAD_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fNoiseFileImpl <em>fNoise File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fNoiseFileImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfNoiseFile()
   * @generated
   */
  int FNOISE_FILE = 142;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FNOISE_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FNOISE_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>fNoise File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FNOISE_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fADAMSFileImpl <em>fADAMS File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fADAMSFileImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfADAMSFile()
   * @generated
   */
  int FADAMS_FILE = 143;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADAMS_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADAMS_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>fADAMS File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADAMS_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.fLinFileImpl <em>fLin File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.fLinFileImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getfLinFile()
   * @generated
   */
  int FLIN_FILE = 144;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLIN_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLIN_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>fLin File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLIN_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bSumPrintImpl <em>bSum Print</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bSumPrintImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbSumPrint()
   * @generated
   */
  int BSUM_PRINT = 145;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSUM_PRINT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSUM_PRINT__NAME = 1;

  /**
   * The number of structural features of the '<em>bSum Print</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSUM_PRINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bOutFileFmtImpl <em>bOut File Fmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bOutFileFmtImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbOutFileFmt()
   * @generated
   */
  int BOUT_FILE_FMT = 146;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUT_FILE_FMT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUT_FILE_FMT__NAME = 1;

  /**
   * The number of structural features of the '<em>bOut File Fmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUT_FILE_FMT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.bTabDelimImpl <em>bTab Delim</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.bTabDelimImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getbTabDelim()
   * @generated
   */
  int BTAB_DELIM = 147;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTAB_DELIM__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTAB_DELIM__NAME = 1;

  /**
   * The number of structural features of the '<em>bTab Delim</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTAB_DELIM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.sOutFmtImpl <em>sOut Fmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.sOutFmtImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getsOutFmt()
   * @generated
   */
  int SOUT_FMT = 148;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUT_FMT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUT_FMT__NAME = 1;

  /**
   * The number of structural features of the '<em>sOut Fmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUT_FMT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nTStartImpl <em>nT Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nTStartImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnTStart()
   * @generated
   */
  int NT_START = 149;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_START__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_START__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_START_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iDecFactImpl <em>iDec Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iDecFactImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiDecFact()
   * @generated
   */
  int IDEC_FACT = 150;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEC_FACT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEC_FACT__NAME = 1;

  /**
   * The number of structural features of the '<em>iDec Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDEC_FACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nSttsTimeImpl <em>nStts Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nSttsTimeImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnSttsTime()
   * @generated
   */
  int NSTTS_TIME = 151;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSTTS_TIME__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSTTS_TIME__NAME = 1;

  /**
   * The number of structural features of the '<em>nStts Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSTTS_TIME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNcIMUxnImpl <em>nNc IM Uxn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNcIMUxnImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNcIMUxn()
   * @generated
   */
  int NNC_IM_UXN = 152;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UXN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UXN__NAME = 1;

  /**
   * The number of structural features of the '<em>nNc IM Uxn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UXN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNcIMUynImpl <em>nNc IM Uyn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNcIMUynImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNcIMUyn()
   * @generated
   */
  int NNC_IM_UYN = 153;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UYN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UYN__NAME = 1;

  /**
   * The number of structural features of the '<em>nNc IM Uyn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UYN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nNcIMUznImpl <em>nNc IM Uzn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nNcIMUznImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnNcIMUzn()
   * @generated
   */
  int NNC_IM_UZN = 154;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UZN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UZN__NAME = 1;

  /**
   * The number of structural features of the '<em>nNc IM Uzn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNC_IM_UZN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.nShftGagLImpl <em>nShft Gag L</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.nShftGagLImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getnShftGagL()
   * @generated
   */
  int NSHFT_GAG_L = 155;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHFT_GAG_L__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHFT_GAG_L__NAME = 1;

  /**
   * The number of structural features of the '<em>nShft Gag L</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHFT_GAG_L_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iNTwGagesImpl <em>iN Tw Gages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iNTwGagesImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiNTwGages()
   * @generated
   */
  int IN_TW_GAGES = 156;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TW_GAGES__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TW_GAGES__NAME = 1;

  /**
   * The number of structural features of the '<em>iN Tw Gages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TW_GAGES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.aTwrGagNdImpl <em>aTwr Gag Nd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.aTwrGagNdImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getaTwrGagNd()
   * @generated
   */
  int ATWR_GAG_ND = 157;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_GAG_ND__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_GAG_ND__NAME = 1;

  /**
   * The number of structural features of the '<em>aTwr Gag Nd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_GAG_ND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.iNBlGagesImpl <em>iN Bl Gages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.iNBlGagesImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getiNBlGages()
   * @generated
   */
  int IN_BL_GAGES = 158;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BL_GAGES__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BL_GAGES__NAME = 1;

  /**
   * The number of structural features of the '<em>iN Bl Gages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BL_GAGES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.aBldGagNdImpl <em>aBld Gag Nd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.aBldGagNdImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getaBldGagNd()
   * @generated
   */
  int ABLD_GAG_ND = 159;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABLD_GAG_ND__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABLD_GAG_ND__NAME = 1;

  /**
   * The number of structural features of the '<em>aBld Gag Nd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABLD_GAG_ND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastfst.impl.vOutListImpl <em>vOut List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastfst.impl.vOutListImpl
   * @see sc.ndt.editor.fast.fastfst.impl.FastfstPackageImpl#getvOutList()
   * @generated
   */
  int VOUT_LIST = 160;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOUT_LIST__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOUT_LIST__VALUE = 1;

  /**
   * The number of structural features of the '<em>vOut List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOUT_LIST_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.ModelFastfst <em>Model Fastfst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Fastfst</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst
   * @generated
   */
  EClass getModelFastfst();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getHead()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_Head();

  /**
   * Returns the meta object for the containment reference list '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getSections()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_Sections();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getEcho <em>Echo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Echo</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getEcho()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_Echo();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADAMSPrep <em>ADAMS Prep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ADAMS Prep</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getADAMSPrep()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_ADAMSPrep();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAnalMode <em>Anal Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anal Mode</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getAnalMode()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_AnalMode();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNumBl <em>Num Bl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Bl</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNumBl()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NumBl();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTMax <em>TMax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TMax</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTMax()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TMax();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDT <em>DT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>DT</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getDT()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_DT();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYCMode <em>YC Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>YC Mode</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getYCMode()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_YCMode();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYCOn <em>TYC On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TYC On</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTYCOn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TYCOn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPCMode <em>PC Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PC Mode</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getPCMode()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_PCMode();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPCOn <em>TPC On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TPC On</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTPCOn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TPCOn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVSContrl <em>VS Contrl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VS Contrl</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getVSContrl()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_VSContrl();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_RtGnSp <em>VS Rt Gn Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VS Rt Gn Sp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_RtGnSp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_VS_RtGnSp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_RtTq <em>VS Rt Tq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VS Rt Tq</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_RtTq()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_VS_RtTq();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_Rgn2K <em>VS Rgn2 K</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VS Rgn2 K</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_Rgn2K()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_VS_Rgn2K();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_SlPc <em>VS Sl Pc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VS Sl Pc</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getVS_SlPc()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_VS_SlPc();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenModel <em>Gen Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gen Model</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGenModel()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GenModel();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenTiStr <em>Gen Ti Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gen Ti Str</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGenTiStr()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GenTiStr();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenTiStp <em>Gen Ti Stp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gen Ti Stp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGenTiStp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GenTiStp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSpdGenOn <em>Spd Gen On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spd Gen On</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getSpdGenOn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_SpdGenOn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTimGenOn <em>Tim Gen On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tim Gen On</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTimGenOn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TimGenOn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTimGenOf <em>Tim Gen Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tim Gen Of</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTimGenOf()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TimGenOf();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrMode <em>HSS Br Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HSS Br Mode</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrMode()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_HSSBrMode();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTHSSBrDp <em>THSS Br Dp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>THSS Br Dp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTHSSBrDp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_THSSBrDp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTiDynBrk <em>Ti Dyn Brk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ti Dyn Brk</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTiDynBrk()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TiDynBrk();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_1_ <em>TTp Br Dp 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TTp Br Dp 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TTpBrDp_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_2_ <em>TTp Br Dp 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TTp Br Dp 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TTpBrDp_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_3_ <em>TTp Br Dp 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TTp Br Dp 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTTpBrDp_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TTpBrDp_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_1_ <em>TB Dep ISp 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TB Dep ISp 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TBDepISp_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_2_ <em>TB Dep ISp 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TB Dep ISp 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TBDepISp_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_3_ <em>TB Dep ISp 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TB Dep ISp 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDepISp_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TBDepISp_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYawManS <em>TYaw Man S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TYaw Man S</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTYawManS()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TYawManS();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTYawManE <em>TYaw Man E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TYaw Man E</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTYawManE()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TYawManE();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYawF <em>Nac Yaw F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nac Yaw F</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYawF()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NacYawF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_1_ <em>TPit Man S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TPit Man S1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TPitManS_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_2_ <em>TPit Man S2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TPit Man S2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TPitManS_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_3_ <em>TPit Man S3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TPit Man S3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManS_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TPitManS_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_1_ <em>TPit Man E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TPit Man E1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TPitManE_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_2_ <em>TPit Man E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TPit Man E2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TPitManE_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_3_ <em>TPit Man E3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TPit Man E3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTPitManE_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TPitManE_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_1_ <em>Bl Pitch 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl Pitch 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BlPitch_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_2_ <em>Bl Pitch 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl Pitch 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BlPitch_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_3_ <em>Bl Pitch 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl Pitch 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitch_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BlPitch_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_1_ <em>Bl Pitch F1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl Pitch F1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BlPitchF_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_2_ <em>Bl Pitch F2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl Pitch F2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BlPitchF_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_3_ <em>Bl Pitch F3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl Pitch F3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBlPitchF_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BlPitchF_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGravity <em>Gravity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gravity</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGravity()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_Gravity();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFlapDOF1 <em>Flap DOF1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Flap DOF1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getFlapDOF1()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_FlapDOF1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFlapDOF2 <em>Flap DOF2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Flap DOF2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getFlapDOF2()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_FlapDOF2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getEdgeDOF <em>Edge DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Edge DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getEdgeDOF()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_EdgeDOF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDOF <em>Teet DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDOF()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetDOF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDrTrDOF <em>Dr Tr DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dr Tr DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getDrTrDOF()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_DrTrDOF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenDOF <em>Gen DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gen DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGenDOF()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GenDOF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawDOF <em>Yaw DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Yaw DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getYawDOF()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_YawDOF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwFADOF1 <em>Tw FADOF1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FADOF1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwFADOF1()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TwFADOF1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwFADOF2 <em>Tw FADOF2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FADOF2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwFADOF2()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TwFADOF2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwSSDOF1 <em>Tw SSDOF1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSDOF1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwSSDOF1()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TwSSDOF1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwSSDOF2 <em>Tw SSDOF2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSDOF2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwSSDOF2()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TwSSDOF2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getCompAero <em>Comp Aero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comp Aero</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getCompAero()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_CompAero();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getCompNoise <em>Comp Noise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comp Noise</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getCompNoise()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_CompNoise();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOoPDefl <em>Oo PDefl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Oo PDefl</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getOoPDefl()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_OoPDefl();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getIPDefl <em>IP Defl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IP Defl</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getIPDefl()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_IPDefl();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDefl <em>Teet Defl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet Defl</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDefl()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetDefl();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAzimuth <em>Azimuth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Azimuth</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getAzimuth()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_Azimuth();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getRotSpeed <em>Rot Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rot Speed</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getRotSpeed()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_RotSpeed();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYaw <em>Nac Yaw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nac Yaw</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYaw()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NacYaw();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTDspFA <em>TT Dsp FA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TT Dsp FA</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTTDspFA()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TTDspFA();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTTDspSS <em>TT Dsp SS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TT Dsp SS</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTTDspSS()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TTDspSS();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipRad <em>Tip Rad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tip Rad</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTipRad()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TipRad();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubRad <em>Hub Rad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hub Rad</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getHubRad()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_HubRad();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPSpnElN <em>PSpn El N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PSpn El N</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getPSpnElN()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_PSpnElN();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getUndSling <em>Und Sling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Und Sling</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getUndSling()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_UndSling();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubCM <em>Hub CM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hub CM</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getHubCM()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_HubCM();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOverHang <em>Over Hang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Over Hang</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getOverHang()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_OverHang();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMxn <em>Nac CMxn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nac CMxn</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMxn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NacCMxn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMyn <em>Nac CMyn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nac CMyn</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMyn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NacCMyn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMzn <em>Nac CMzn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nac CMzn</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNacCMzn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NacCMzn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTowerHt <em>Tower Ht</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tower Ht</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTowerHt()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TowerHt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwr2Shft <em>Twr2 Shft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr2 Shft</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwr2Shft()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_Twr2Shft();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrRBHt <em>Twr RB Ht</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr RB Ht</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrRBHt()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TwrRBHt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getShftTilt <em>Shft Tilt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shft Tilt</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getShftTilt()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_ShftTilt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDelta3 <em>Delta3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delta3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getDelta3()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_Delta3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_1_ <em>Pre Cone 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Cone 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_PreCone_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_2_ <em>Pre Cone 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Cone 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_PreCone_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_3_ <em>Pre Cone 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Cone 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getPreCone_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_PreCone_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getAzimB1Up <em>Azim B1 Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Azim B1 Up</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getAzimB1Up()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_AzimB1Up();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawBrMass <em>Yaw Br Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Yaw Br Mass</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getYawBrMass()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_YawBrMass();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacMass <em>Nac Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nac Mass</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNacMass()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NacMass();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubMass <em>Hub Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hub Mass</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getHubMass()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_HubMass();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_1_ <em>Tip Mass 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tip Mass 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TipMass_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_2_ <em>Tip Mass 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tip Mass 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TipMass_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_3_ <em>Tip Mass 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tip Mass 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTipMass_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TipMass_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYIner <em>Nac YIner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nac YIner</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNacYIner()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NacYIner();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenIner <em>Gen Iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gen Iner</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGenIner()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GenIner();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHubIner <em>Hub Iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hub Iner</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getHubIner()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_HubIner();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBoxEff <em>GBox Eff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>GBox Eff</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGBoxEff()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GBoxEff();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGenEff <em>Gen Eff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gen Eff</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGenEff()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GenEff();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBRatio <em>GB Ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>GB Ratio</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGBRatio()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GBRatio();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getGBRevers <em>GB Revers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>GB Revers</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getGBRevers()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_GBRevers();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrTqF <em>HSS Br Tq F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HSS Br Tq F</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrTqF()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_HSSBrTqF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrDT <em>HSS Br DT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HSS Br DT</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getHSSBrDT()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_HSSBrDT();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDynBrkFi <em>Dyn Brk Fi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dyn Brk Fi</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getDynBrkFi()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_DynBrkFi();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDTTorSpr <em>DT Tor Spr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>DT Tor Spr</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getDTTorSpr()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_DTTorSpr();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDTTorDmp <em>DT Tor Dmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>DT Tor Dmp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getDTTorDmp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_DTTorDmp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_SlPc <em>SIG Sl Pc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SIG Sl Pc</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_SlPc()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_SIG_SlPc();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_SySp <em>SIG Sy Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SIG Sy Sp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_SySp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_SIG_SySp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_RtTq <em>SIG Rt Tq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SIG Rt Tq</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_RtTq()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_SIG_RtTq();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_PORt <em>SIG PO Rt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SIG PO Rt</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getSIG_PORt()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_SIG_PORt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Freq <em>TEC Freq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TEC Freq</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Freq()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TEC_Freq();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Npol <em>TEC Npol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TEC Npol</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Npol()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TEC_Npol();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Sres <em>TEC Sres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TEC Sres</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Sres()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TEC_Sres();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Rres <em>TEC Rres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TEC Rres</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_Rres()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TEC_Rres();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_VLL <em>TEC VLL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TEC VLL</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_VLL()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TEC_VLL();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_SLR <em>TEC SLR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TEC SLR</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_SLR()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TEC_SLR();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_RLR <em>TEC RLR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TEC RLR</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_RLR()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TEC_RLR();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_MR <em>TEC MR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TEC MR</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTEC_MR()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TEC_MR();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPtfmModel <em>Ptfm Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ptfm Model</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getPtfmModel()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_PtfmModel();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getPtfmFile <em>Ptfm File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ptfm File</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getPtfmFile()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_PtfmFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrNodes <em>Twr Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr Nodes</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrNodes()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TwrNodes();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrFile <em>Twr File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr File</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrFile()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TwrFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawSpr <em>Yaw Spr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Yaw Spr</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getYawSpr()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_YawSpr();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawDamp <em>Yaw Damp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Yaw Damp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getYawDamp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_YawDamp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getYawNeut <em>Yaw Neut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Yaw Neut</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getYawNeut()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_YawNeut();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFurling <em>Furling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Furling</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getFurling()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_Furling();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getFurlFile <em>Furl File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Furl File</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getFurlFile()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_FurlFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetMod <em>Teet Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet Mod</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetMod()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetMod();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDmpP <em>Teet Dmp P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet Dmp P</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDmpP()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetDmpP();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDmp <em>Teet Dmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet Dmp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetDmp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetDmp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetCDmp <em>Teet CDmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet CDmp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetCDmp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetCDmp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetSStP <em>Teet SSt P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet SSt P</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetSStP()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetSStP();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetHStP <em>Teet HSt P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet HSt P</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetHStP()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetHStP();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetSSSp <em>Teet SS Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet SS Sp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetSSSp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetSSSp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetHSSp <em>Teet HS Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Teet HS Sp</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTeetHSSp()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TeetHSSp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDrConN <em>TB Dr Con N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TB Dr Con N</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDrConN()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TBDrConN();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDrConD <em>TB Dr Con D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TB Dr Con D</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTBDrConD()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TBDrConD();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTpBrDT <em>Tp Br DT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tp Br DT</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTpBrDT()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TpBrDT();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_1_ <em>Bld File 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld File 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_1_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BldFile_1_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_2_ <em>Bld File 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld File 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_2_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BldFile_2_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_3_ <em>Bld File 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld File 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBldFile_3_()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BldFile_3_();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADFile <em>AD File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>AD File</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getADFile()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_ADFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNoiseFile <em>Noise File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Noise File</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNoiseFile()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NoiseFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getADAMSFile <em>ADAMS File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ADAMS File</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getADAMSFile()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_ADAMSFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getLinFile <em>Lin File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lin File</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getLinFile()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_LinFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSumPrint <em>Sum Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sum Print</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getSumPrint()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_SumPrint();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutFileFmt <em>Out File Fmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out File Fmt</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getOutFileFmt()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_OutFileFmt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTabDelim <em>Tab Delim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tab Delim</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTabDelim()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TabDelim();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutFmt <em>Out Fmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out Fmt</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getOutFmt()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_OutFmt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTStart <em>TStart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TStart</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTStart()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TStart();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getDecFact <em>Dec Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec Fact</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getDecFact()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_DecFact();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getSttsTime <em>Stts Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stts Time</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getSttsTime()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_SttsTime();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUxn <em>Nc IM Uxn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nc IM Uxn</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUxn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NcIMUxn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUyn <em>Nc IM Uyn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nc IM Uyn</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUyn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NcIMUyn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUzn <em>Nc IM Uzn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nc IM Uzn</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNcIMUzn()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NcIMUzn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getShftGagL <em>Shft Gag L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shft Gag L</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getShftGagL()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_ShftGagL();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNTwGages <em>NTw Gages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>NTw Gages</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNTwGages()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NTwGages();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrGagNd <em>Twr Gag Nd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr Gag Nd</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getTwrGagNd()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_TwrGagNd();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getNBlGages <em>NBl Gages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>NBl Gages</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getNBlGages()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_NBlGages();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getBldGagNd <em>Bld Gag Nd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Gag Nd</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getBldGagNd()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_BldGagNd();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastfst.ModelFastfst#getOutList <em>Out List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out List</em>'.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst#getOutList()
   * @see #getModelFastfst()
   * @generated
   */
  EReference getModelFastfst_OutList();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.fast.fastfst.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastfst.Header#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rows</em>'.
   * @see sc.ndt.editor.fast.fastfst.Header#getRows()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Rows();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see sc.ndt.editor.fast.fastfst.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bEcho <em>bEcho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bEcho</em>'.
   * @see sc.ndt.editor.fast.fastfst.bEcho
   * @generated
   */
  EClass getbEcho();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bEcho#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bEcho#isValue()
   * @see #getbEcho()
   * @generated
   */
  EAttribute getbEcho_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bEcho#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bEcho#getName()
   * @see #getbEcho()
   * @generated
   */
  EAttribute getbEcho_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iADAMSPrep <em>iADAMS Prep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iADAMS Prep</em>'.
   * @see sc.ndt.editor.fast.fastfst.iADAMSPrep
   * @generated
   */
  EClass getiADAMSPrep();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iADAMSPrep#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iADAMSPrep#getValue()
   * @see #getiADAMSPrep()
   * @generated
   */
  EAttribute getiADAMSPrep_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iADAMSPrep#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iADAMSPrep#getName()
   * @see #getiADAMSPrep()
   * @generated
   */
  EAttribute getiADAMSPrep_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iAnalMode <em>iAnal Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iAnal Mode</em>'.
   * @see sc.ndt.editor.fast.fastfst.iAnalMode
   * @generated
   */
  EClass getiAnalMode();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iAnalMode#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iAnalMode#getValue()
   * @see #getiAnalMode()
   * @generated
   */
  EAttribute getiAnalMode_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iAnalMode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iAnalMode#getName()
   * @see #getiAnalMode()
   * @generated
   */
  EAttribute getiAnalMode_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iNumBl <em>iNum Bl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iNum Bl</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNumBl
   * @generated
   */
  EClass getiNumBl();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iNumBl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNumBl#getValue()
   * @see #getiNumBl()
   * @generated
   */
  EAttribute getiNumBl_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iNumBl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNumBl#getName()
   * @see #getiNumBl()
   * @generated
   */
  EAttribute getiNumBl_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTMax <em>nT Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Max</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTMax
   * @generated
   */
  EClass getnTMax();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTMax#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTMax#getValue()
   * @see #getnTMax()
   * @generated
   */
  EAttribute getnTMax_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTMax#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTMax#getName()
   * @see #getnTMax()
   * @generated
   */
  EAttribute getnTMax_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nDT <em>nDT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nDT</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDT
   * @generated
   */
  EClass getnDT();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nDT#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDT#getValue()
   * @see #getnDT()
   * @generated
   */
  EAttribute getnDT_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nDT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDT#getName()
   * @see #getnDT()
   * @generated
   */
  EAttribute getnDT_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iYCMode <em>iYC Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iYC Mode</em>'.
   * @see sc.ndt.editor.fast.fastfst.iYCMode
   * @generated
   */
  EClass getiYCMode();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iYCMode#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iYCMode#getValue()
   * @see #getiYCMode()
   * @generated
   */
  EAttribute getiYCMode_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iYCMode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iYCMode#getName()
   * @see #getiYCMode()
   * @generated
   */
  EAttribute getiYCMode_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTYCOn <em>nTYC On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTYC On</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYCOn
   * @generated
   */
  EClass getnTYCOn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTYCOn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYCOn#getValue()
   * @see #getnTYCOn()
   * @generated
   */
  EAttribute getnTYCOn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTYCOn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYCOn#getName()
   * @see #getnTYCOn()
   * @generated
   */
  EAttribute getnTYCOn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iPCMode <em>iPC Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iPC Mode</em>'.
   * @see sc.ndt.editor.fast.fastfst.iPCMode
   * @generated
   */
  EClass getiPCMode();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iPCMode#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iPCMode#getValue()
   * @see #getiPCMode()
   * @generated
   */
  EAttribute getiPCMode_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iPCMode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iPCMode#getName()
   * @see #getiPCMode()
   * @generated
   */
  EAttribute getiPCMode_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTPCOn <em>nTPC On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTPC On</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPCOn
   * @generated
   */
  EClass getnTPCOn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPCOn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPCOn#getValue()
   * @see #getnTPCOn()
   * @generated
   */
  EAttribute getnTPCOn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPCOn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPCOn#getName()
   * @see #getnTPCOn()
   * @generated
   */
  EAttribute getnTPCOn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iVSContrl <em>iVS Contrl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iVS Contrl</em>'.
   * @see sc.ndt.editor.fast.fastfst.iVSContrl
   * @generated
   */
  EClass getiVSContrl();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iVSContrl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iVSContrl#getValue()
   * @see #getiVSContrl()
   * @generated
   */
  EAttribute getiVSContrl_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iVSContrl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iVSContrl#getName()
   * @see #getiVSContrl()
   * @generated
   */
  EAttribute getiVSContrl_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nVS_RtGnSp <em>nVS Rt Gn Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nVS Rt Gn Sp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_RtGnSp
   * @generated
   */
  EClass getnVS_RtGnSp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nVS_RtGnSp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_RtGnSp#getValue()
   * @see #getnVS_RtGnSp()
   * @generated
   */
  EAttribute getnVS_RtGnSp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nVS_RtGnSp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_RtGnSp#getName()
   * @see #getnVS_RtGnSp()
   * @generated
   */
  EAttribute getnVS_RtGnSp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nVS_RtTq <em>nVS Rt Tq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nVS Rt Tq</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_RtTq
   * @generated
   */
  EClass getnVS_RtTq();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nVS_RtTq#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_RtTq#getValue()
   * @see #getnVS_RtTq()
   * @generated
   */
  EAttribute getnVS_RtTq_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nVS_RtTq#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_RtTq#getName()
   * @see #getnVS_RtTq()
   * @generated
   */
  EAttribute getnVS_RtTq_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nVS_Rgn2K <em>nVS Rgn2 K</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nVS Rgn2 K</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_Rgn2K
   * @generated
   */
  EClass getnVS_Rgn2K();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nVS_Rgn2K#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_Rgn2K#getValue()
   * @see #getnVS_Rgn2K()
   * @generated
   */
  EAttribute getnVS_Rgn2K_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nVS_Rgn2K#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_Rgn2K#getName()
   * @see #getnVS_Rgn2K()
   * @generated
   */
  EAttribute getnVS_Rgn2K_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nVS_SlPc <em>nVS Sl Pc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nVS Sl Pc</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_SlPc
   * @generated
   */
  EClass getnVS_SlPc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nVS_SlPc#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_SlPc#getValue()
   * @see #getnVS_SlPc()
   * @generated
   */
  EAttribute getnVS_SlPc_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nVS_SlPc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nVS_SlPc#getName()
   * @see #getnVS_SlPc()
   * @generated
   */
  EAttribute getnVS_SlPc_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iGenModel <em>iGen Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iGen Model</em>'.
   * @see sc.ndt.editor.fast.fastfst.iGenModel
   * @generated
   */
  EClass getiGenModel();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iGenModel#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iGenModel#getValue()
   * @see #getiGenModel()
   * @generated
   */
  EAttribute getiGenModel_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iGenModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iGenModel#getName()
   * @see #getiGenModel()
   * @generated
   */
  EAttribute getiGenModel_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bGenTiStr <em>bGen Ti Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bGen Ti Str</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenTiStr
   * @generated
   */
  EClass getbGenTiStr();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bGenTiStr#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenTiStr#isValue()
   * @see #getbGenTiStr()
   * @generated
   */
  EAttribute getbGenTiStr_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bGenTiStr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenTiStr#getName()
   * @see #getbGenTiStr()
   * @generated
   */
  EAttribute getbGenTiStr_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bGenTiStp <em>bGen Ti Stp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bGen Ti Stp</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenTiStp
   * @generated
   */
  EClass getbGenTiStp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bGenTiStp#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenTiStp#isValue()
   * @see #getbGenTiStp()
   * @generated
   */
  EAttribute getbGenTiStp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bGenTiStp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenTiStp#getName()
   * @see #getbGenTiStp()
   * @generated
   */
  EAttribute getbGenTiStp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nSpdGenOn <em>nSpd Gen On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSpd Gen On</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSpdGenOn
   * @generated
   */
  EClass getnSpdGenOn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSpdGenOn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSpdGenOn#getValue()
   * @see #getnSpdGenOn()
   * @generated
   */
  EAttribute getnSpdGenOn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSpdGenOn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSpdGenOn#getName()
   * @see #getnSpdGenOn()
   * @generated
   */
  EAttribute getnSpdGenOn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTimGenOn <em>nTim Gen On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTim Gen On</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTimGenOn
   * @generated
   */
  EClass getnTimGenOn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTimGenOn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTimGenOn#getValue()
   * @see #getnTimGenOn()
   * @generated
   */
  EAttribute getnTimGenOn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTimGenOn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTimGenOn#getName()
   * @see #getnTimGenOn()
   * @generated
   */
  EAttribute getnTimGenOn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTimGenOf <em>nTim Gen Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTim Gen Of</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTimGenOf
   * @generated
   */
  EClass getnTimGenOf();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTimGenOf#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTimGenOf#getValue()
   * @see #getnTimGenOf()
   * @generated
   */
  EAttribute getnTimGenOf_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTimGenOf#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTimGenOf#getName()
   * @see #getnTimGenOf()
   * @generated
   */
  EAttribute getnTimGenOf_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iHSSBrMode <em>iHSS Br Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iHSS Br Mode</em>'.
   * @see sc.ndt.editor.fast.fastfst.iHSSBrMode
   * @generated
   */
  EClass getiHSSBrMode();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iHSSBrMode#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iHSSBrMode#getValue()
   * @see #getiHSSBrMode()
   * @generated
   */
  EAttribute getiHSSBrMode_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iHSSBrMode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iHSSBrMode#getName()
   * @see #getiHSSBrMode()
   * @generated
   */
  EAttribute getiHSSBrMode_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTHSSBrDp <em>nTHSS Br Dp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTHSS Br Dp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTHSSBrDp
   * @generated
   */
  EClass getnTHSSBrDp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTHSSBrDp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTHSSBrDp#getValue()
   * @see #getnTHSSBrDp()
   * @generated
   */
  EAttribute getnTHSSBrDp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTHSSBrDp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTHSSBrDp#getName()
   * @see #getnTHSSBrDp()
   * @generated
   */
  EAttribute getnTHSSBrDp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTiDynBrk <em>nTi Dyn Brk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTi Dyn Brk</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTiDynBrk
   * @generated
   */
  EClass getnTiDynBrk();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTiDynBrk#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTiDynBrk#getValue()
   * @see #getnTiDynBrk()
   * @generated
   */
  EAttribute getnTiDynBrk_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTiDynBrk#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTiDynBrk#getName()
   * @see #getnTiDynBrk()
   * @generated
   */
  EAttribute getnTiDynBrk_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_1_ <em>nT Tp Br Dp 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Tp Br Dp 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_1_
   * @generated
   */
  EClass getnTTpBrDp_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_1_#getValue()
   * @see #getnTTpBrDp_1_()
   * @generated
   */
  EAttribute getnTTpBrDp_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_1_#getName()
   * @see #getnTTpBrDp_1_()
   * @generated
   */
  EAttribute getnTTpBrDp_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_2_ <em>nT Tp Br Dp 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Tp Br Dp 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_2_
   * @generated
   */
  EClass getnTTpBrDp_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_2_#getValue()
   * @see #getnTTpBrDp_2_()
   * @generated
   */
  EAttribute getnTTpBrDp_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_2_#getName()
   * @see #getnTTpBrDp_2_()
   * @generated
   */
  EAttribute getnTTpBrDp_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_3_ <em>nT Tp Br Dp 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Tp Br Dp 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_3_
   * @generated
   */
  EClass getnTTpBrDp_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_3_#getValue()
   * @see #getnTTpBrDp_3_()
   * @generated
   */
  EAttribute getnTTpBrDp_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_3_#getName()
   * @see #getnTTpBrDp_3_()
   * @generated
   */
  EAttribute getnTTpBrDp_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_1_ <em>nTB Dep ISp 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTB Dep ISp 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_1_
   * @generated
   */
  EClass getnTBDepISp_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_1_#getValue()
   * @see #getnTBDepISp_1_()
   * @generated
   */
  EAttribute getnTBDepISp_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_1_#getName()
   * @see #getnTBDepISp_1_()
   * @generated
   */
  EAttribute getnTBDepISp_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_2_ <em>nTB Dep ISp 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTB Dep ISp 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_2_
   * @generated
   */
  EClass getnTBDepISp_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_2_#getValue()
   * @see #getnTBDepISp_2_()
   * @generated
   */
  EAttribute getnTBDepISp_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_2_#getName()
   * @see #getnTBDepISp_2_()
   * @generated
   */
  EAttribute getnTBDepISp_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_3_ <em>nTB Dep ISp 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTB Dep ISp 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_3_
   * @generated
   */
  EClass getnTBDepISp_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_3_#getValue()
   * @see #getnTBDepISp_3_()
   * @generated
   */
  EAttribute getnTBDepISp_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_3_#getName()
   * @see #getnTBDepISp_3_()
   * @generated
   */
  EAttribute getnTBDepISp_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTYawManS <em>nT Yaw Man S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Yaw Man S</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYawManS
   * @generated
   */
  EClass getnTYawManS();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTYawManS#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYawManS#getValue()
   * @see #getnTYawManS()
   * @generated
   */
  EAttribute getnTYawManS_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTYawManS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYawManS#getName()
   * @see #getnTYawManS()
   * @generated
   */
  EAttribute getnTYawManS_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTYawManE <em>nT Yaw Man E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Yaw Man E</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYawManE
   * @generated
   */
  EClass getnTYawManE();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTYawManE#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYawManE#getValue()
   * @see #getnTYawManE()
   * @generated
   */
  EAttribute getnTYawManE_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTYawManE#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTYawManE#getName()
   * @see #getnTYawManE()
   * @generated
   */
  EAttribute getnTYawManE_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNacYawF <em>nNac Yaw F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNac Yaw F</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYawF
   * @generated
   */
  EClass getnNacYawF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacYawF#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYawF#getValue()
   * @see #getnNacYawF()
   * @generated
   */
  EAttribute getnNacYawF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacYawF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYawF#getName()
   * @see #getnNacYawF()
   * @generated
   */
  EAttribute getnNacYawF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTPitManS_1_ <em>nT Pit Man S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Pit Man S1</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_1_
   * @generated
   */
  EClass getnTPitManS_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManS_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_1_#getValue()
   * @see #getnTPitManS_1_()
   * @generated
   */
  EAttribute getnTPitManS_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManS_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_1_#getName()
   * @see #getnTPitManS_1_()
   * @generated
   */
  EAttribute getnTPitManS_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTPitManS_2_ <em>nT Pit Man S2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Pit Man S2</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_2_
   * @generated
   */
  EClass getnTPitManS_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManS_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_2_#getValue()
   * @see #getnTPitManS_2_()
   * @generated
   */
  EAttribute getnTPitManS_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManS_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_2_#getName()
   * @see #getnTPitManS_2_()
   * @generated
   */
  EAttribute getnTPitManS_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTPitManS_3_ <em>nT Pit Man S3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Pit Man S3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_3_
   * @generated
   */
  EClass getnTPitManS_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManS_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_3_#getValue()
   * @see #getnTPitManS_3_()
   * @generated
   */
  EAttribute getnTPitManS_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManS_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_3_#getName()
   * @see #getnTPitManS_3_()
   * @generated
   */
  EAttribute getnTPitManS_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTPitManE_1_ <em>nT Pit Man E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Pit Man E1</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_1_
   * @generated
   */
  EClass getnTPitManE_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManE_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_1_#getValue()
   * @see #getnTPitManE_1_()
   * @generated
   */
  EAttribute getnTPitManE_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManE_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_1_#getName()
   * @see #getnTPitManE_1_()
   * @generated
   */
  EAttribute getnTPitManE_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTPitManE_2_ <em>nT Pit Man E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Pit Man E2</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_2_
   * @generated
   */
  EClass getnTPitManE_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManE_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_2_#getValue()
   * @see #getnTPitManE_2_()
   * @generated
   */
  EAttribute getnTPitManE_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManE_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_2_#getName()
   * @see #getnTPitManE_2_()
   * @generated
   */
  EAttribute getnTPitManE_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTPitManE_3_ <em>nT Pit Man E3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Pit Man E3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_3_
   * @generated
   */
  EClass getnTPitManE_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManE_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_3_#getValue()
   * @see #getnTPitManE_3_()
   * @generated
   */
  EAttribute getnTPitManE_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTPitManE_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_3_#getName()
   * @see #getnTPitManE_3_()
   * @generated
   */
  EAttribute getnTPitManE_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nBlPitch_1_ <em>nBl Pitch 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBl Pitch 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_1_
   * @generated
   */
  EClass getnBlPitch_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitch_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_1_#getValue()
   * @see #getnBlPitch_1_()
   * @generated
   */
  EAttribute getnBlPitch_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitch_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_1_#getName()
   * @see #getnBlPitch_1_()
   * @generated
   */
  EAttribute getnBlPitch_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nBlPitch_2_ <em>nBl Pitch 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBl Pitch 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_2_
   * @generated
   */
  EClass getnBlPitch_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitch_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_2_#getValue()
   * @see #getnBlPitch_2_()
   * @generated
   */
  EAttribute getnBlPitch_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitch_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_2_#getName()
   * @see #getnBlPitch_2_()
   * @generated
   */
  EAttribute getnBlPitch_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nBlPitch_3_ <em>nBl Pitch 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBl Pitch 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_3_
   * @generated
   */
  EClass getnBlPitch_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitch_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_3_#getValue()
   * @see #getnBlPitch_3_()
   * @generated
   */
  EAttribute getnBlPitch_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitch_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_3_#getName()
   * @see #getnBlPitch_3_()
   * @generated
   */
  EAttribute getnBlPitch_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_1_ <em>nBl Pitch F1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBl Pitch F1</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_1_
   * @generated
   */
  EClass getnBlPitchF_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_1_#getValue()
   * @see #getnBlPitchF_1_()
   * @generated
   */
  EAttribute getnBlPitchF_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_1_#getName()
   * @see #getnBlPitchF_1_()
   * @generated
   */
  EAttribute getnBlPitchF_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_2_ <em>nBl Pitch F2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBl Pitch F2</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_2_
   * @generated
   */
  EClass getnBlPitchF_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_2_#getValue()
   * @see #getnBlPitchF_2_()
   * @generated
   */
  EAttribute getnBlPitchF_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_2_#getName()
   * @see #getnBlPitchF_2_()
   * @generated
   */
  EAttribute getnBlPitchF_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_3_ <em>nBl Pitch F3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBl Pitch F3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_3_
   * @generated
   */
  EClass getnBlPitchF_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_3_#getValue()
   * @see #getnBlPitchF_3_()
   * @generated
   */
  EAttribute getnBlPitchF_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_3_#getName()
   * @see #getnBlPitchF_3_()
   * @generated
   */
  EAttribute getnBlPitchF_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nGravity <em>nGravity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nGravity</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGravity
   * @generated
   */
  EClass getnGravity();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGravity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGravity#getValue()
   * @see #getnGravity()
   * @generated
   */
  EAttribute getnGravity_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGravity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGravity#getName()
   * @see #getnGravity()
   * @generated
   */
  EAttribute getnGravity_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bFlapDOF1 <em>bFlap DOF1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bFlap DOF1</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFlapDOF1
   * @generated
   */
  EClass getbFlapDOF1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bFlapDOF1#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFlapDOF1#isValue()
   * @see #getbFlapDOF1()
   * @generated
   */
  EAttribute getbFlapDOF1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bFlapDOF1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFlapDOF1#getName()
   * @see #getbFlapDOF1()
   * @generated
   */
  EAttribute getbFlapDOF1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bFlapDOF2 <em>bFlap DOF2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bFlap DOF2</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFlapDOF2
   * @generated
   */
  EClass getbFlapDOF2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bFlapDOF2#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFlapDOF2#isValue()
   * @see #getbFlapDOF2()
   * @generated
   */
  EAttribute getbFlapDOF2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bFlapDOF2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFlapDOF2#getName()
   * @see #getbFlapDOF2()
   * @generated
   */
  EAttribute getbFlapDOF2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bEdgeDOF <em>bEdge DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bEdge DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.bEdgeDOF
   * @generated
   */
  EClass getbEdgeDOF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bEdgeDOF#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bEdgeDOF#isValue()
   * @see #getbEdgeDOF()
   * @generated
   */
  EAttribute getbEdgeDOF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bEdgeDOF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bEdgeDOF#getName()
   * @see #getbEdgeDOF()
   * @generated
   */
  EAttribute getbEdgeDOF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bTeetDOF <em>bTeet DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTeet DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTeetDOF
   * @generated
   */
  EClass getbTeetDOF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTeetDOF#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTeetDOF#isValue()
   * @see #getbTeetDOF()
   * @generated
   */
  EAttribute getbTeetDOF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTeetDOF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTeetDOF#getName()
   * @see #getbTeetDOF()
   * @generated
   */
  EAttribute getbTeetDOF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bDrTrDOF <em>bDr Tr DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bDr Tr DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.bDrTrDOF
   * @generated
   */
  EClass getbDrTrDOF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bDrTrDOF#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bDrTrDOF#isValue()
   * @see #getbDrTrDOF()
   * @generated
   */
  EAttribute getbDrTrDOF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bDrTrDOF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bDrTrDOF#getName()
   * @see #getbDrTrDOF()
   * @generated
   */
  EAttribute getbDrTrDOF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bGenDOF <em>bGen DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bGen DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenDOF
   * @generated
   */
  EClass getbGenDOF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bGenDOF#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenDOF#isValue()
   * @see #getbGenDOF()
   * @generated
   */
  EAttribute getbGenDOF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bGenDOF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGenDOF#getName()
   * @see #getbGenDOF()
   * @generated
   */
  EAttribute getbGenDOF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bYawDOF <em>bYaw DOF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bYaw DOF</em>'.
   * @see sc.ndt.editor.fast.fastfst.bYawDOF
   * @generated
   */
  EClass getbYawDOF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bYawDOF#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bYawDOF#isValue()
   * @see #getbYawDOF()
   * @generated
   */
  EAttribute getbYawDOF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bYawDOF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bYawDOF#getName()
   * @see #getbYawDOF()
   * @generated
   */
  EAttribute getbYawDOF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bTwFADOF1 <em>bTw FADOF1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTw FADOF1</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwFADOF1
   * @generated
   */
  EClass getbTwFADOF1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTwFADOF1#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwFADOF1#isValue()
   * @see #getbTwFADOF1()
   * @generated
   */
  EAttribute getbTwFADOF1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTwFADOF1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwFADOF1#getName()
   * @see #getbTwFADOF1()
   * @generated
   */
  EAttribute getbTwFADOF1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bTwFADOF2 <em>bTw FADOF2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTw FADOF2</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwFADOF2
   * @generated
   */
  EClass getbTwFADOF2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTwFADOF2#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwFADOF2#isValue()
   * @see #getbTwFADOF2()
   * @generated
   */
  EAttribute getbTwFADOF2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTwFADOF2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwFADOF2#getName()
   * @see #getbTwFADOF2()
   * @generated
   */
  EAttribute getbTwFADOF2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bTwSSDOF1 <em>bTw SSDOF1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTw SSDOF1</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwSSDOF1
   * @generated
   */
  EClass getbTwSSDOF1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTwSSDOF1#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwSSDOF1#isValue()
   * @see #getbTwSSDOF1()
   * @generated
   */
  EAttribute getbTwSSDOF1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTwSSDOF1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwSSDOF1#getName()
   * @see #getbTwSSDOF1()
   * @generated
   */
  EAttribute getbTwSSDOF1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bTwSSDOF2 <em>bTw SSDOF2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTw SSDOF2</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwSSDOF2
   * @generated
   */
  EClass getbTwSSDOF2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTwSSDOF2#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwSSDOF2#isValue()
   * @see #getbTwSSDOF2()
   * @generated
   */
  EAttribute getbTwSSDOF2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTwSSDOF2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTwSSDOF2#getName()
   * @see #getbTwSSDOF2()
   * @generated
   */
  EAttribute getbTwSSDOF2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bCompAero <em>bComp Aero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bComp Aero</em>'.
   * @see sc.ndt.editor.fast.fastfst.bCompAero
   * @generated
   */
  EClass getbCompAero();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bCompAero#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bCompAero#isValue()
   * @see #getbCompAero()
   * @generated
   */
  EAttribute getbCompAero_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bCompAero#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bCompAero#getName()
   * @see #getbCompAero()
   * @generated
   */
  EAttribute getbCompAero_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bCompNoise <em>bComp Noise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bComp Noise</em>'.
   * @see sc.ndt.editor.fast.fastfst.bCompNoise
   * @generated
   */
  EClass getbCompNoise();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bCompNoise#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bCompNoise#isValue()
   * @see #getbCompNoise()
   * @generated
   */
  EAttribute getbCompNoise_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bCompNoise#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bCompNoise#getName()
   * @see #getbCompNoise()
   * @generated
   */
  EAttribute getbCompNoise_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nOoPDefl <em>nOo PDefl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nOo PDefl</em>'.
   * @see sc.ndt.editor.fast.fastfst.nOoPDefl
   * @generated
   */
  EClass getnOoPDefl();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nOoPDefl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nOoPDefl#getValue()
   * @see #getnOoPDefl()
   * @generated
   */
  EAttribute getnOoPDefl_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nOoPDefl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nOoPDefl#getName()
   * @see #getnOoPDefl()
   * @generated
   */
  EAttribute getnOoPDefl_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nIPDefl <em>nIP Defl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nIP Defl</em>'.
   * @see sc.ndt.editor.fast.fastfst.nIPDefl
   * @generated
   */
  EClass getnIPDefl();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nIPDefl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nIPDefl#getValue()
   * @see #getnIPDefl()
   * @generated
   */
  EAttribute getnIPDefl_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nIPDefl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nIPDefl#getName()
   * @see #getnIPDefl()
   * @generated
   */
  EAttribute getnIPDefl_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTeetDefl <em>nTeet Defl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTeet Defl</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDefl
   * @generated
   */
  EClass getnTeetDefl();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetDefl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDefl#getValue()
   * @see #getnTeetDefl()
   * @generated
   */
  EAttribute getnTeetDefl_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetDefl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDefl#getName()
   * @see #getnTeetDefl()
   * @generated
   */
  EAttribute getnTeetDefl_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nAzimuth <em>nAzimuth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nAzimuth</em>'.
   * @see sc.ndt.editor.fast.fastfst.nAzimuth
   * @generated
   */
  EClass getnAzimuth();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nAzimuth#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nAzimuth#getValue()
   * @see #getnAzimuth()
   * @generated
   */
  EAttribute getnAzimuth_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nAzimuth#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nAzimuth#getName()
   * @see #getnAzimuth()
   * @generated
   */
  EAttribute getnAzimuth_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nRotSpeed <em>nRot Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRot Speed</em>'.
   * @see sc.ndt.editor.fast.fastfst.nRotSpeed
   * @generated
   */
  EClass getnRotSpeed();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nRotSpeed#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nRotSpeed#getValue()
   * @see #getnRotSpeed()
   * @generated
   */
  EAttribute getnRotSpeed_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nRotSpeed#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nRotSpeed#getName()
   * @see #getnRotSpeed()
   * @generated
   */
  EAttribute getnRotSpeed_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNacYaw <em>nNac Yaw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNac Yaw</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYaw
   * @generated
   */
  EClass getnNacYaw();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacYaw#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYaw#getValue()
   * @see #getnNacYaw()
   * @generated
   */
  EAttribute getnNacYaw_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacYaw#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYaw#getName()
   * @see #getnNacYaw()
   * @generated
   */
  EAttribute getnNacYaw_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTTDspFA <em>nTT Dsp FA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTT Dsp FA</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTDspFA
   * @generated
   */
  EClass getnTTDspFA();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTDspFA#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTDspFA#getValue()
   * @see #getnTTDspFA()
   * @generated
   */
  EAttribute getnTTDspFA_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTDspFA#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTDspFA#getName()
   * @see #getnTTDspFA()
   * @generated
   */
  EAttribute getnTTDspFA_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTTDspSS <em>nTT Dsp SS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTT Dsp SS</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTDspSS
   * @generated
   */
  EClass getnTTDspSS();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTDspSS#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTDspSS#getValue()
   * @see #getnTTDspSS()
   * @generated
   */
  EAttribute getnTTDspSS_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTTDspSS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTTDspSS#getName()
   * @see #getnTTDspSS()
   * @generated
   */
  EAttribute getnTTDspSS_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTipRad <em>nTip Rad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTip Rad</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipRad
   * @generated
   */
  EClass getnTipRad();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTipRad#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipRad#getValue()
   * @see #getnTipRad()
   * @generated
   */
  EAttribute getnTipRad_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTipRad#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipRad#getName()
   * @see #getnTipRad()
   * @generated
   */
  EAttribute getnTipRad_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nHubRad <em>nHub Rad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHub Rad</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubRad
   * @generated
   */
  EClass getnHubRad();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHubRad#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubRad#getValue()
   * @see #getnHubRad()
   * @generated
   */
  EAttribute getnHubRad_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHubRad#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubRad#getName()
   * @see #getnHubRad()
   * @generated
   */
  EAttribute getnHubRad_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nPSpnElN <em>nP Spn El N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nP Spn El N</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPSpnElN
   * @generated
   */
  EClass getnPSpnElN();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nPSpnElN#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPSpnElN#getValue()
   * @see #getnPSpnElN()
   * @generated
   */
  EAttribute getnPSpnElN_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nPSpnElN#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPSpnElN#getName()
   * @see #getnPSpnElN()
   * @generated
   */
  EAttribute getnPSpnElN_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nUndSling <em>nUnd Sling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nUnd Sling</em>'.
   * @see sc.ndt.editor.fast.fastfst.nUndSling
   * @generated
   */
  EClass getnUndSling();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nUndSling#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nUndSling#getValue()
   * @see #getnUndSling()
   * @generated
   */
  EAttribute getnUndSling_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nUndSling#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nUndSling#getName()
   * @see #getnUndSling()
   * @generated
   */
  EAttribute getnUndSling_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nHubCM <em>nHub CM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHub CM</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubCM
   * @generated
   */
  EClass getnHubCM();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHubCM#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubCM#getValue()
   * @see #getnHubCM()
   * @generated
   */
  EAttribute getnHubCM_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHubCM#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubCM#getName()
   * @see #getnHubCM()
   * @generated
   */
  EAttribute getnHubCM_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nOverHang <em>nOver Hang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nOver Hang</em>'.
   * @see sc.ndt.editor.fast.fastfst.nOverHang
   * @generated
   */
  EClass getnOverHang();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nOverHang#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nOverHang#getValue()
   * @see #getnOverHang()
   * @generated
   */
  EAttribute getnOverHang_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nOverHang#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nOverHang#getName()
   * @see #getnOverHang()
   * @generated
   */
  EAttribute getnOverHang_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNacCMxn <em>nNac CMxn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNac CMxn</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMxn
   * @generated
   */
  EClass getnNacCMxn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacCMxn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMxn#getValue()
   * @see #getnNacCMxn()
   * @generated
   */
  EAttribute getnNacCMxn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacCMxn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMxn#getName()
   * @see #getnNacCMxn()
   * @generated
   */
  EAttribute getnNacCMxn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNacCMyn <em>nNac CMyn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNac CMyn</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMyn
   * @generated
   */
  EClass getnNacCMyn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacCMyn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMyn#getValue()
   * @see #getnNacCMyn()
   * @generated
   */
  EAttribute getnNacCMyn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacCMyn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMyn#getName()
   * @see #getnNacCMyn()
   * @generated
   */
  EAttribute getnNacCMyn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNacCMzn <em>nNac CMzn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNac CMzn</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMzn
   * @generated
   */
  EClass getnNacCMzn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacCMzn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMzn#getValue()
   * @see #getnNacCMzn()
   * @generated
   */
  EAttribute getnNacCMzn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacCMzn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacCMzn#getName()
   * @see #getnNacCMzn()
   * @generated
   */
  EAttribute getnNacCMzn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTowerHt <em>nTower Ht</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTower Ht</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTowerHt
   * @generated
   */
  EClass getnTowerHt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTowerHt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTowerHt#getValue()
   * @see #getnTowerHt()
   * @generated
   */
  EAttribute getnTowerHt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTowerHt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTowerHt#getName()
   * @see #getnTowerHt()
   * @generated
   */
  EAttribute getnTowerHt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTwr2Shft <em>nTwr2 Shft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTwr2 Shft</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTwr2Shft
   * @generated
   */
  EClass getnTwr2Shft();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTwr2Shft#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTwr2Shft#getValue()
   * @see #getnTwr2Shft()
   * @generated
   */
  EAttribute getnTwr2Shft_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTwr2Shft#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTwr2Shft#getName()
   * @see #getnTwr2Shft()
   * @generated
   */
  EAttribute getnTwr2Shft_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTwrRBHt <em>nTwr RB Ht</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTwr RB Ht</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTwrRBHt
   * @generated
   */
  EClass getnTwrRBHt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTwrRBHt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTwrRBHt#getValue()
   * @see #getnTwrRBHt()
   * @generated
   */
  EAttribute getnTwrRBHt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTwrRBHt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTwrRBHt#getName()
   * @see #getnTwrRBHt()
   * @generated
   */
  EAttribute getnTwrRBHt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nShftTilt <em>nShft Tilt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nShft Tilt</em>'.
   * @see sc.ndt.editor.fast.fastfst.nShftTilt
   * @generated
   */
  EClass getnShftTilt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nShftTilt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nShftTilt#getValue()
   * @see #getnShftTilt()
   * @generated
   */
  EAttribute getnShftTilt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nShftTilt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nShftTilt#getName()
   * @see #getnShftTilt()
   * @generated
   */
  EAttribute getnShftTilt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nDelta3 <em>nDelta3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nDelta3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDelta3
   * @generated
   */
  EClass getnDelta3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nDelta3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDelta3#getValue()
   * @see #getnDelta3()
   * @generated
   */
  EAttribute getnDelta3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nDelta3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDelta3#getName()
   * @see #getnDelta3()
   * @generated
   */
  EAttribute getnDelta3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nPreCone_1_ <em>nPre Cone 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nPre Cone 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_1_
   * @generated
   */
  EClass getnPreCone_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nPreCone_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_1_#getValue()
   * @see #getnPreCone_1_()
   * @generated
   */
  EAttribute getnPreCone_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nPreCone_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_1_#getName()
   * @see #getnPreCone_1_()
   * @generated
   */
  EAttribute getnPreCone_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nPreCone_2_ <em>nPre Cone 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nPre Cone 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_2_
   * @generated
   */
  EClass getnPreCone_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nPreCone_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_2_#getValue()
   * @see #getnPreCone_2_()
   * @generated
   */
  EAttribute getnPreCone_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nPreCone_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_2_#getName()
   * @see #getnPreCone_2_()
   * @generated
   */
  EAttribute getnPreCone_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nPreCone_3_ <em>nPre Cone 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nPre Cone 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_3_
   * @generated
   */
  EClass getnPreCone_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nPreCone_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_3_#getValue()
   * @see #getnPreCone_3_()
   * @generated
   */
  EAttribute getnPreCone_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nPreCone_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_3_#getName()
   * @see #getnPreCone_3_()
   * @generated
   */
  EAttribute getnPreCone_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nAzimB1Up <em>nAzim B1 Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nAzim B1 Up</em>'.
   * @see sc.ndt.editor.fast.fastfst.nAzimB1Up
   * @generated
   */
  EClass getnAzimB1Up();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nAzimB1Up#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nAzimB1Up#getValue()
   * @see #getnAzimB1Up()
   * @generated
   */
  EAttribute getnAzimB1Up_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nAzimB1Up#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nAzimB1Up#getName()
   * @see #getnAzimB1Up()
   * @generated
   */
  EAttribute getnAzimB1Up_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nYawBrMass <em>nYaw Br Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nYaw Br Mass</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawBrMass
   * @generated
   */
  EClass getnYawBrMass();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nYawBrMass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawBrMass#getValue()
   * @see #getnYawBrMass()
   * @generated
   */
  EAttribute getnYawBrMass_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nYawBrMass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawBrMass#getName()
   * @see #getnYawBrMass()
   * @generated
   */
  EAttribute getnYawBrMass_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNacMass <em>nNac Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNac Mass</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacMass
   * @generated
   */
  EClass getnNacMass();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacMass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacMass#getValue()
   * @see #getnNacMass()
   * @generated
   */
  EAttribute getnNacMass_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacMass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacMass#getName()
   * @see #getnNacMass()
   * @generated
   */
  EAttribute getnNacMass_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nHubMass <em>nHub Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHub Mass</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubMass
   * @generated
   */
  EClass getnHubMass();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHubMass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubMass#getValue()
   * @see #getnHubMass()
   * @generated
   */
  EAttribute getnHubMass_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHubMass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubMass#getName()
   * @see #getnHubMass()
   * @generated
   */
  EAttribute getnHubMass_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTipMass_1_ <em>nTip Mass 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTip Mass 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_1_
   * @generated
   */
  EClass getnTipMass_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTipMass_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_1_#getValue()
   * @see #getnTipMass_1_()
   * @generated
   */
  EAttribute getnTipMass_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTipMass_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_1_#getName()
   * @see #getnTipMass_1_()
   * @generated
   */
  EAttribute getnTipMass_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTipMass_2_ <em>nTip Mass 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTip Mass 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_2_
   * @generated
   */
  EClass getnTipMass_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTipMass_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_2_#getValue()
   * @see #getnTipMass_2_()
   * @generated
   */
  EAttribute getnTipMass_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTipMass_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_2_#getName()
   * @see #getnTipMass_2_()
   * @generated
   */
  EAttribute getnTipMass_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTipMass_3_ <em>nTip Mass 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTip Mass 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_3_
   * @generated
   */
  EClass getnTipMass_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTipMass_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_3_#getValue()
   * @see #getnTipMass_3_()
   * @generated
   */
  EAttribute getnTipMass_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTipMass_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_3_#getName()
   * @see #getnTipMass_3_()
   * @generated
   */
  EAttribute getnTipMass_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNacYIner <em>nNac YIner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNac YIner</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYIner
   * @generated
   */
  EClass getnNacYIner();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacYIner#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYIner#getValue()
   * @see #getnNacYIner()
   * @generated
   */
  EAttribute getnNacYIner_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNacYIner#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNacYIner#getName()
   * @see #getnNacYIner()
   * @generated
   */
  EAttribute getnNacYIner_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nGenIner <em>nGen Iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nGen Iner</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGenIner
   * @generated
   */
  EClass getnGenIner();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGenIner#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGenIner#getValue()
   * @see #getnGenIner()
   * @generated
   */
  EAttribute getnGenIner_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGenIner#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGenIner#getName()
   * @see #getnGenIner()
   * @generated
   */
  EAttribute getnGenIner_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nHubIner <em>nHub Iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHub Iner</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubIner
   * @generated
   */
  EClass getnHubIner();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHubIner#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubIner#getValue()
   * @see #getnHubIner()
   * @generated
   */
  EAttribute getnHubIner_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHubIner#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHubIner#getName()
   * @see #getnHubIner()
   * @generated
   */
  EAttribute getnHubIner_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nGBoxEff <em>nG Box Eff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nG Box Eff</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGBoxEff
   * @generated
   */
  EClass getnGBoxEff();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGBoxEff#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGBoxEff#getValue()
   * @see #getnGBoxEff()
   * @generated
   */
  EAttribute getnGBoxEff_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGBoxEff#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGBoxEff#getName()
   * @see #getnGBoxEff()
   * @generated
   */
  EAttribute getnGBoxEff_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nGenEff <em>nGen Eff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nGen Eff</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGenEff
   * @generated
   */
  EClass getnGenEff();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGenEff#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGenEff#getValue()
   * @see #getnGenEff()
   * @generated
   */
  EAttribute getnGenEff_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGenEff#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGenEff#getName()
   * @see #getnGenEff()
   * @generated
   */
  EAttribute getnGenEff_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nGBRatio <em>nGB Ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nGB Ratio</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGBRatio
   * @generated
   */
  EClass getnGBRatio();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGBRatio#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGBRatio#getValue()
   * @see #getnGBRatio()
   * @generated
   */
  EAttribute getnGBRatio_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nGBRatio#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nGBRatio#getName()
   * @see #getnGBRatio()
   * @generated
   */
  EAttribute getnGBRatio_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bGBRevers <em>bGB Revers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bGB Revers</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGBRevers
   * @generated
   */
  EClass getbGBRevers();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bGBRevers#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGBRevers#isValue()
   * @see #getbGBRevers()
   * @generated
   */
  EAttribute getbGBRevers_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bGBRevers#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bGBRevers#getName()
   * @see #getbGBRevers()
   * @generated
   */
  EAttribute getbGBRevers_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nHSSBrTqF <em>nHSS Br Tq F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHSS Br Tq F</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHSSBrTqF
   * @generated
   */
  EClass getnHSSBrTqF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHSSBrTqF#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHSSBrTqF#getValue()
   * @see #getnHSSBrTqF()
   * @generated
   */
  EAttribute getnHSSBrTqF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHSSBrTqF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHSSBrTqF#getName()
   * @see #getnHSSBrTqF()
   * @generated
   */
  EAttribute getnHSSBrTqF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nHSSBrDT <em>nHSS Br DT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHSS Br DT</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHSSBrDT
   * @generated
   */
  EClass getnHSSBrDT();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHSSBrDT#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHSSBrDT#getValue()
   * @see #getnHSSBrDT()
   * @generated
   */
  EAttribute getnHSSBrDT_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nHSSBrDT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nHSSBrDT#getName()
   * @see #getnHSSBrDT()
   * @generated
   */
  EAttribute getnHSSBrDT_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fDynBrkFi <em>fDyn Brk Fi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fDyn Brk Fi</em>'.
   * @see sc.ndt.editor.fast.fastfst.fDynBrkFi
   * @generated
   */
  EClass getfDynBrkFi();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fDynBrkFi#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fDynBrkFi#getValue()
   * @see #getfDynBrkFi()
   * @generated
   */
  EAttribute getfDynBrkFi_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fDynBrkFi#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fDynBrkFi#getName()
   * @see #getfDynBrkFi()
   * @generated
   */
  EAttribute getfDynBrkFi_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nDTTorSpr <em>nDT Tor Spr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nDT Tor Spr</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDTTorSpr
   * @generated
   */
  EClass getnDTTorSpr();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nDTTorSpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDTTorSpr#getValue()
   * @see #getnDTTorSpr()
   * @generated
   */
  EAttribute getnDTTorSpr_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nDTTorSpr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDTTorSpr#getName()
   * @see #getnDTTorSpr()
   * @generated
   */
  EAttribute getnDTTorSpr_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nDTTorDmp <em>nDT Tor Dmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nDT Tor Dmp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDTTorDmp
   * @generated
   */
  EClass getnDTTorDmp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nDTTorDmp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDTTorDmp#getValue()
   * @see #getnDTTorDmp()
   * @generated
   */
  EAttribute getnDTTorDmp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nDTTorDmp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nDTTorDmp#getName()
   * @see #getnDTTorDmp()
   * @generated
   */
  EAttribute getnDTTorDmp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nSIG_SlPc <em>nSIG Sl Pc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSIG Sl Pc</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_SlPc
   * @generated
   */
  EClass getnSIG_SlPc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSIG_SlPc#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_SlPc#getValue()
   * @see #getnSIG_SlPc()
   * @generated
   */
  EAttribute getnSIG_SlPc_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSIG_SlPc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_SlPc#getName()
   * @see #getnSIG_SlPc()
   * @generated
   */
  EAttribute getnSIG_SlPc_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nSIG_SySp <em>nSIG Sy Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSIG Sy Sp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_SySp
   * @generated
   */
  EClass getnSIG_SySp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSIG_SySp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_SySp#getValue()
   * @see #getnSIG_SySp()
   * @generated
   */
  EAttribute getnSIG_SySp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSIG_SySp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_SySp#getName()
   * @see #getnSIG_SySp()
   * @generated
   */
  EAttribute getnSIG_SySp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nSIG_RtTq <em>nSIG Rt Tq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSIG Rt Tq</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_RtTq
   * @generated
   */
  EClass getnSIG_RtTq();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSIG_RtTq#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_RtTq#getValue()
   * @see #getnSIG_RtTq()
   * @generated
   */
  EAttribute getnSIG_RtTq_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSIG_RtTq#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_RtTq#getName()
   * @see #getnSIG_RtTq()
   * @generated
   */
  EAttribute getnSIG_RtTq_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nSIG_PORt <em>nSIG PO Rt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSIG PO Rt</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_PORt
   * @generated
   */
  EClass getnSIG_PORt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSIG_PORt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_PORt#getValue()
   * @see #getnSIG_PORt()
   * @generated
   */
  EAttribute getnSIG_PORt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSIG_PORt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSIG_PORt#getName()
   * @see #getnSIG_PORt()
   * @generated
   */
  EAttribute getnSIG_PORt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTEC_Freq <em>nTEC Freq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTEC Freq</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Freq
   * @generated
   */
  EClass getnTEC_Freq();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_Freq#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Freq#getValue()
   * @see #getnTEC_Freq()
   * @generated
   */
  EAttribute getnTEC_Freq_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_Freq#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Freq#getName()
   * @see #getnTEC_Freq()
   * @generated
   */
  EAttribute getnTEC_Freq_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTEC_Npol <em>nTEC Npol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTEC Npol</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Npol
   * @generated
   */
  EClass getnTEC_Npol();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_Npol#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Npol#getValue()
   * @see #getnTEC_Npol()
   * @generated
   */
  EAttribute getnTEC_Npol_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_Npol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Npol#getName()
   * @see #getnTEC_Npol()
   * @generated
   */
  EAttribute getnTEC_Npol_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTEC_Sres <em>nTEC Sres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTEC Sres</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Sres
   * @generated
   */
  EClass getnTEC_Sres();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_Sres#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Sres#getValue()
   * @see #getnTEC_Sres()
   * @generated
   */
  EAttribute getnTEC_Sres_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_Sres#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Sres#getName()
   * @see #getnTEC_Sres()
   * @generated
   */
  EAttribute getnTEC_Sres_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTEC_Rres <em>nTEC Rres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTEC Rres</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Rres
   * @generated
   */
  EClass getnTEC_Rres();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_Rres#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Rres#getValue()
   * @see #getnTEC_Rres()
   * @generated
   */
  EAttribute getnTEC_Rres_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_Rres#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Rres#getName()
   * @see #getnTEC_Rres()
   * @generated
   */
  EAttribute getnTEC_Rres_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTEC_VLL <em>nTEC VLL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTEC VLL</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_VLL
   * @generated
   */
  EClass getnTEC_VLL();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_VLL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_VLL#getValue()
   * @see #getnTEC_VLL()
   * @generated
   */
  EAttribute getnTEC_VLL_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_VLL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_VLL#getName()
   * @see #getnTEC_VLL()
   * @generated
   */
  EAttribute getnTEC_VLL_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTEC_SLR <em>nTEC SLR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTEC SLR</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_SLR
   * @generated
   */
  EClass getnTEC_SLR();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_SLR#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_SLR#getValue()
   * @see #getnTEC_SLR()
   * @generated
   */
  EAttribute getnTEC_SLR_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_SLR#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_SLR#getName()
   * @see #getnTEC_SLR()
   * @generated
   */
  EAttribute getnTEC_SLR_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTEC_RLR <em>nTEC RLR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTEC RLR</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_RLR
   * @generated
   */
  EClass getnTEC_RLR();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_RLR#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_RLR#getValue()
   * @see #getnTEC_RLR()
   * @generated
   */
  EAttribute getnTEC_RLR_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_RLR#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_RLR#getName()
   * @see #getnTEC_RLR()
   * @generated
   */
  EAttribute getnTEC_RLR_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTEC_MR <em>nTEC MR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTEC MR</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_MR
   * @generated
   */
  EClass getnTEC_MR();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_MR#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_MR#getValue()
   * @see #getnTEC_MR()
   * @generated
   */
  EAttribute getnTEC_MR_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTEC_MR#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTEC_MR#getName()
   * @see #getnTEC_MR()
   * @generated
   */
  EAttribute getnTEC_MR_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iPtfmModel <em>iPtfm Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iPtfm Model</em>'.
   * @see sc.ndt.editor.fast.fastfst.iPtfmModel
   * @generated
   */
  EClass getiPtfmModel();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iPtfmModel#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iPtfmModel#getValue()
   * @see #getiPtfmModel()
   * @generated
   */
  EAttribute getiPtfmModel_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iPtfmModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iPtfmModel#getName()
   * @see #getiPtfmModel()
   * @generated
   */
  EAttribute getiPtfmModel_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fPtfmFile <em>fPtfm File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fPtfm File</em>'.
   * @see sc.ndt.editor.fast.fastfst.fPtfmFile
   * @generated
   */
  EClass getfPtfmFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fPtfmFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fPtfmFile#getValue()
   * @see #getfPtfmFile()
   * @generated
   */
  EAttribute getfPtfmFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fPtfmFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fPtfmFile#getName()
   * @see #getfPtfmFile()
   * @generated
   */
  EAttribute getfPtfmFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iTwrNodes <em>iTwr Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iTwr Nodes</em>'.
   * @see sc.ndt.editor.fast.fastfst.iTwrNodes
   * @generated
   */
  EClass getiTwrNodes();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iTwrNodes#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iTwrNodes#getValue()
   * @see #getiTwrNodes()
   * @generated
   */
  EAttribute getiTwrNodes_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iTwrNodes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iTwrNodes#getName()
   * @see #getiTwrNodes()
   * @generated
   */
  EAttribute getiTwrNodes_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fTwrFile <em>fTwr File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fTwr File</em>'.
   * @see sc.ndt.editor.fast.fastfst.fTwrFile
   * @generated
   */
  EClass getfTwrFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fTwrFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fTwrFile#getValue()
   * @see #getfTwrFile()
   * @generated
   */
  EAttribute getfTwrFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fTwrFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fTwrFile#getName()
   * @see #getfTwrFile()
   * @generated
   */
  EAttribute getfTwrFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nYawSpr <em>nYaw Spr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nYaw Spr</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawSpr
   * @generated
   */
  EClass getnYawSpr();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nYawSpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawSpr#getValue()
   * @see #getnYawSpr()
   * @generated
   */
  EAttribute getnYawSpr_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nYawSpr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawSpr#getName()
   * @see #getnYawSpr()
   * @generated
   */
  EAttribute getnYawSpr_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nYawDamp <em>nYaw Damp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nYaw Damp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawDamp
   * @generated
   */
  EClass getnYawDamp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nYawDamp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawDamp#getValue()
   * @see #getnYawDamp()
   * @generated
   */
  EAttribute getnYawDamp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nYawDamp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawDamp#getName()
   * @see #getnYawDamp()
   * @generated
   */
  EAttribute getnYawDamp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nYawNeut <em>nYaw Neut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nYaw Neut</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawNeut
   * @generated
   */
  EClass getnYawNeut();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nYawNeut#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawNeut#getValue()
   * @see #getnYawNeut()
   * @generated
   */
  EAttribute getnYawNeut_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nYawNeut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nYawNeut#getName()
   * @see #getnYawNeut()
   * @generated
   */
  EAttribute getnYawNeut_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bFurling <em>bFurling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bFurling</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFurling
   * @generated
   */
  EClass getbFurling();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bFurling#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFurling#isValue()
   * @see #getbFurling()
   * @generated
   */
  EAttribute getbFurling_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bFurling#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bFurling#getName()
   * @see #getbFurling()
   * @generated
   */
  EAttribute getbFurling_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fFurlFile <em>fFurl File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fFurl File</em>'.
   * @see sc.ndt.editor.fast.fastfst.fFurlFile
   * @generated
   */
  EClass getfFurlFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fFurlFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fFurlFile#getValue()
   * @see #getfFurlFile()
   * @generated
   */
  EAttribute getfFurlFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fFurlFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fFurlFile#getName()
   * @see #getfFurlFile()
   * @generated
   */
  EAttribute getfFurlFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iTeetMod <em>iTeet Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iTeet Mod</em>'.
   * @see sc.ndt.editor.fast.fastfst.iTeetMod
   * @generated
   */
  EClass getiTeetMod();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iTeetMod#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iTeetMod#getValue()
   * @see #getiTeetMod()
   * @generated
   */
  EAttribute getiTeetMod_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iTeetMod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iTeetMod#getName()
   * @see #getiTeetMod()
   * @generated
   */
  EAttribute getiTeetMod_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTeetDmpP <em>nTeet Dmp P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTeet Dmp P</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDmpP
   * @generated
   */
  EClass getnTeetDmpP();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetDmpP#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDmpP#getValue()
   * @see #getnTeetDmpP()
   * @generated
   */
  EAttribute getnTeetDmpP_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetDmpP#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDmpP#getName()
   * @see #getnTeetDmpP()
   * @generated
   */
  EAttribute getnTeetDmpP_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTeetDmp <em>nTeet Dmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTeet Dmp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDmp
   * @generated
   */
  EClass getnTeetDmp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetDmp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDmp#getValue()
   * @see #getnTeetDmp()
   * @generated
   */
  EAttribute getnTeetDmp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetDmp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetDmp#getName()
   * @see #getnTeetDmp()
   * @generated
   */
  EAttribute getnTeetDmp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTeetCDmp <em>nTeet CDmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTeet CDmp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetCDmp
   * @generated
   */
  EClass getnTeetCDmp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetCDmp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetCDmp#getValue()
   * @see #getnTeetCDmp()
   * @generated
   */
  EAttribute getnTeetCDmp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetCDmp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetCDmp#getName()
   * @see #getnTeetCDmp()
   * @generated
   */
  EAttribute getnTeetCDmp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTeetSStP <em>nTeet SSt P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTeet SSt P</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetSStP
   * @generated
   */
  EClass getnTeetSStP();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetSStP#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetSStP#getValue()
   * @see #getnTeetSStP()
   * @generated
   */
  EAttribute getnTeetSStP_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetSStP#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetSStP#getName()
   * @see #getnTeetSStP()
   * @generated
   */
  EAttribute getnTeetSStP_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTeetHStP <em>nTeet HSt P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTeet HSt P</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetHStP
   * @generated
   */
  EClass getnTeetHStP();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetHStP#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetHStP#getValue()
   * @see #getnTeetHStP()
   * @generated
   */
  EAttribute getnTeetHStP_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetHStP#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetHStP#getName()
   * @see #getnTeetHStP()
   * @generated
   */
  EAttribute getnTeetHStP_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTeetSSSp <em>nTeet SS Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTeet SS Sp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetSSSp
   * @generated
   */
  EClass getnTeetSSSp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetSSSp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetSSSp#getValue()
   * @see #getnTeetSSSp()
   * @generated
   */
  EAttribute getnTeetSSSp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetSSSp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetSSSp#getName()
   * @see #getnTeetSSSp()
   * @generated
   */
  EAttribute getnTeetSSSp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTeetHSSp <em>nTeet HS Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTeet HS Sp</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetHSSp
   * @generated
   */
  EClass getnTeetHSSp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetHSSp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetHSSp#getValue()
   * @see #getnTeetHSSp()
   * @generated
   */
  EAttribute getnTeetHSSp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTeetHSSp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTeetHSSp#getName()
   * @see #getnTeetHSSp()
   * @generated
   */
  EAttribute getnTeetHSSp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTBDrConN <em>nTB Dr Con N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTB Dr Con N</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDrConN
   * @generated
   */
  EClass getnTBDrConN();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDrConN#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDrConN#getValue()
   * @see #getnTBDrConN()
   * @generated
   */
  EAttribute getnTBDrConN_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDrConN#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDrConN#getName()
   * @see #getnTBDrConN()
   * @generated
   */
  EAttribute getnTBDrConN_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTBDrConD <em>nTB Dr Con D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTB Dr Con D</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDrConD
   * @generated
   */
  EClass getnTBDrConD();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDrConD#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDrConD#getValue()
   * @see #getnTBDrConD()
   * @generated
   */
  EAttribute getnTBDrConD_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTBDrConD#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTBDrConD#getName()
   * @see #getnTBDrConD()
   * @generated
   */
  EAttribute getnTBDrConD_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTpBrDT <em>nTp Br DT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTp Br DT</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTpBrDT
   * @generated
   */
  EClass getnTpBrDT();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTpBrDT#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTpBrDT#getValue()
   * @see #getnTpBrDT()
   * @generated
   */
  EAttribute getnTpBrDT_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTpBrDT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTpBrDT#getName()
   * @see #getnTpBrDT()
   * @generated
   */
  EAttribute getnTpBrDT_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fBldFile_1_ <em>fBld File 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fBld File 1</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_1_
   * @generated
   */
  EClass getfBldFile_1_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fBldFile_1_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_1_#getValue()
   * @see #getfBldFile_1_()
   * @generated
   */
  EAttribute getfBldFile_1__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fBldFile_1_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_1_#getName()
   * @see #getfBldFile_1_()
   * @generated
   */
  EAttribute getfBldFile_1__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fBldFile_2_ <em>fBld File 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fBld File 2</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_2_
   * @generated
   */
  EClass getfBldFile_2_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fBldFile_2_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_2_#getValue()
   * @see #getfBldFile_2_()
   * @generated
   */
  EAttribute getfBldFile_2__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fBldFile_2_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_2_#getName()
   * @see #getfBldFile_2_()
   * @generated
   */
  EAttribute getfBldFile_2__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fBldFile_3_ <em>fBld File 3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fBld File 3</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_3_
   * @generated
   */
  EClass getfBldFile_3_();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fBldFile_3_#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_3_#getValue()
   * @see #getfBldFile_3_()
   * @generated
   */
  EAttribute getfBldFile_3__Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fBldFile_3_#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_3_#getName()
   * @see #getfBldFile_3_()
   * @generated
   */
  EAttribute getfBldFile_3__Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fADFile <em>fAD File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fAD File</em>'.
   * @see sc.ndt.editor.fast.fastfst.fADFile
   * @generated
   */
  EClass getfADFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fADFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fADFile#getValue()
   * @see #getfADFile()
   * @generated
   */
  EAttribute getfADFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fADFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fADFile#getName()
   * @see #getfADFile()
   * @generated
   */
  EAttribute getfADFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fNoiseFile <em>fNoise File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fNoise File</em>'.
   * @see sc.ndt.editor.fast.fastfst.fNoiseFile
   * @generated
   */
  EClass getfNoiseFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fNoiseFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fNoiseFile#getValue()
   * @see #getfNoiseFile()
   * @generated
   */
  EAttribute getfNoiseFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fNoiseFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fNoiseFile#getName()
   * @see #getfNoiseFile()
   * @generated
   */
  EAttribute getfNoiseFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fADAMSFile <em>fADAMS File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fADAMS File</em>'.
   * @see sc.ndt.editor.fast.fastfst.fADAMSFile
   * @generated
   */
  EClass getfADAMSFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fADAMSFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fADAMSFile#getValue()
   * @see #getfADAMSFile()
   * @generated
   */
  EAttribute getfADAMSFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fADAMSFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fADAMSFile#getName()
   * @see #getfADAMSFile()
   * @generated
   */
  EAttribute getfADAMSFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.fLinFile <em>fLin File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fLin File</em>'.
   * @see sc.ndt.editor.fast.fastfst.fLinFile
   * @generated
   */
  EClass getfLinFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fLinFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.fLinFile#getValue()
   * @see #getfLinFile()
   * @generated
   */
  EAttribute getfLinFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.fLinFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.fLinFile#getName()
   * @see #getfLinFile()
   * @generated
   */
  EAttribute getfLinFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bSumPrint <em>bSum Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bSum Print</em>'.
   * @see sc.ndt.editor.fast.fastfst.bSumPrint
   * @generated
   */
  EClass getbSumPrint();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bSumPrint#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bSumPrint#isValue()
   * @see #getbSumPrint()
   * @generated
   */
  EAttribute getbSumPrint_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bSumPrint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bSumPrint#getName()
   * @see #getbSumPrint()
   * @generated
   */
  EAttribute getbSumPrint_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bOutFileFmt <em>bOut File Fmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bOut File Fmt</em>'.
   * @see sc.ndt.editor.fast.fastfst.bOutFileFmt
   * @generated
   */
  EClass getbOutFileFmt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bOutFileFmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bOutFileFmt#getValue()
   * @see #getbOutFileFmt()
   * @generated
   */
  EAttribute getbOutFileFmt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bOutFileFmt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bOutFileFmt#getName()
   * @see #getbOutFileFmt()
   * @generated
   */
  EAttribute getbOutFileFmt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.bTabDelim <em>bTab Delim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTab Delim</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTabDelim
   * @generated
   */
  EClass getbTabDelim();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTabDelim#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTabDelim#isValue()
   * @see #getbTabDelim()
   * @generated
   */
  EAttribute getbTabDelim_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.bTabDelim#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.bTabDelim#getName()
   * @see #getbTabDelim()
   * @generated
   */
  EAttribute getbTabDelim_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.sOutFmt <em>sOut Fmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sOut Fmt</em>'.
   * @see sc.ndt.editor.fast.fastfst.sOutFmt
   * @generated
   */
  EClass getsOutFmt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.sOutFmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.sOutFmt#getValue()
   * @see #getsOutFmt()
   * @generated
   */
  EAttribute getsOutFmt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.sOutFmt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.sOutFmt#getName()
   * @see #getsOutFmt()
   * @generated
   */
  EAttribute getsOutFmt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nTStart <em>nT Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Start</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTStart
   * @generated
   */
  EClass getnTStart();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTStart#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTStart#getValue()
   * @see #getnTStart()
   * @generated
   */
  EAttribute getnTStart_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nTStart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nTStart#getName()
   * @see #getnTStart()
   * @generated
   */
  EAttribute getnTStart_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iDecFact <em>iDec Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iDec Fact</em>'.
   * @see sc.ndt.editor.fast.fastfst.iDecFact
   * @generated
   */
  EClass getiDecFact();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iDecFact#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iDecFact#getValue()
   * @see #getiDecFact()
   * @generated
   */
  EAttribute getiDecFact_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iDecFact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iDecFact#getName()
   * @see #getiDecFact()
   * @generated
   */
  EAttribute getiDecFact_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nSttsTime <em>nStts Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nStts Time</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSttsTime
   * @generated
   */
  EClass getnSttsTime();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSttsTime#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSttsTime#getValue()
   * @see #getnSttsTime()
   * @generated
   */
  EAttribute getnSttsTime_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nSttsTime#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nSttsTime#getName()
   * @see #getnSttsTime()
   * @generated
   */
  EAttribute getnSttsTime_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNcIMUxn <em>nNc IM Uxn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNc IM Uxn</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUxn
   * @generated
   */
  EClass getnNcIMUxn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNcIMUxn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUxn#getValue()
   * @see #getnNcIMUxn()
   * @generated
   */
  EAttribute getnNcIMUxn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNcIMUxn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUxn#getName()
   * @see #getnNcIMUxn()
   * @generated
   */
  EAttribute getnNcIMUxn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNcIMUyn <em>nNc IM Uyn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNc IM Uyn</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUyn
   * @generated
   */
  EClass getnNcIMUyn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNcIMUyn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUyn#getValue()
   * @see #getnNcIMUyn()
   * @generated
   */
  EAttribute getnNcIMUyn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNcIMUyn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUyn#getName()
   * @see #getnNcIMUyn()
   * @generated
   */
  EAttribute getnNcIMUyn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nNcIMUzn <em>nNc IM Uzn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNc IM Uzn</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUzn
   * @generated
   */
  EClass getnNcIMUzn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNcIMUzn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUzn#getValue()
   * @see #getnNcIMUzn()
   * @generated
   */
  EAttribute getnNcIMUzn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nNcIMUzn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUzn#getName()
   * @see #getnNcIMUzn()
   * @generated
   */
  EAttribute getnNcIMUzn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.nShftGagL <em>nShft Gag L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nShft Gag L</em>'.
   * @see sc.ndt.editor.fast.fastfst.nShftGagL
   * @generated
   */
  EClass getnShftGagL();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nShftGagL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.nShftGagL#getValue()
   * @see #getnShftGagL()
   * @generated
   */
  EAttribute getnShftGagL_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.nShftGagL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.nShftGagL#getName()
   * @see #getnShftGagL()
   * @generated
   */
  EAttribute getnShftGagL_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iNTwGages <em>iN Tw Gages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iN Tw Gages</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNTwGages
   * @generated
   */
  EClass getiNTwGages();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iNTwGages#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNTwGages#getValue()
   * @see #getiNTwGages()
   * @generated
   */
  EAttribute getiNTwGages_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iNTwGages#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNTwGages#getName()
   * @see #getiNTwGages()
   * @generated
   */
  EAttribute getiNTwGages_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.aTwrGagNd <em>aTwr Gag Nd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aTwr Gag Nd</em>'.
   * @see sc.ndt.editor.fast.fastfst.aTwrGagNd
   * @generated
   */
  EClass getaTwrGagNd();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.aTwrGagNd#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.aTwrGagNd#getValue()
   * @see #getaTwrGagNd()
   * @generated
   */
  EAttribute getaTwrGagNd_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.aTwrGagNd#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.aTwrGagNd#getName()
   * @see #getaTwrGagNd()
   * @generated
   */
  EAttribute getaTwrGagNd_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.iNBlGages <em>iN Bl Gages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iN Bl Gages</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNBlGages
   * @generated
   */
  EClass getiNBlGages();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iNBlGages#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNBlGages#getValue()
   * @see #getiNBlGages()
   * @generated
   */
  EAttribute getiNBlGages_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.iNBlGages#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.iNBlGages#getName()
   * @see #getiNBlGages()
   * @generated
   */
  EAttribute getiNBlGages_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.aBldGagNd <em>aBld Gag Nd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aBld Gag Nd</em>'.
   * @see sc.ndt.editor.fast.fastfst.aBldGagNd
   * @generated
   */
  EClass getaBldGagNd();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.aBldGagNd#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.aBldGagNd#getValue()
   * @see #getaBldGagNd()
   * @generated
   */
  EAttribute getaBldGagNd_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.aBldGagNd#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.aBldGagNd#getName()
   * @see #getaBldGagNd()
   * @generated
   */
  EAttribute getaBldGagNd_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastfst.vOutList <em>vOut List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vOut List</em>'.
   * @see sc.ndt.editor.fast.fastfst.vOutList
   * @generated
   */
  EClass getvOutList();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.vOutList#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastfst.vOutList#getName()
   * @see #getvOutList()
   * @generated
   */
  EAttribute getvOutList_Name();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastfst.vOutList#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastfst.vOutList#getValue()
   * @see #getvOutList()
   * @generated
   */
  EAttribute getvOutList_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FastfstFactory getFastfstFactory();

} //FastfstPackage
