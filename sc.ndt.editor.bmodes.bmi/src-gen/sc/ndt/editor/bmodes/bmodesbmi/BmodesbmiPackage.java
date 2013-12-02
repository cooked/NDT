/**
 */
package sc.ndt.editor.bmodes.bmodesbmi;

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
 * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiFactory
 * @model kind="package"
 * @generated
 */
public interface BmodesbmiPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bmodesbmi";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/bmodes/Bmodesbmi";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bmodesbmi";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BmodesbmiPackage eINSTANCE = sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.ModelBmodesbmiImpl <em>Model Bmodesbmi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.ModelBmodesbmiImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getModelBmodesbmi()
   * @generated
   */
  int MODEL_BMODESBMI = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__HEAD = 0;

  /**
   * The feature id for the '<em><b>Sec</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__SEC = 1;

  /**
   * The feature id for the '<em><b>Echo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__ECHO = 2;

  /**
   * The feature id for the '<em><b>Beam Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__BEAM_TYPE = 3;

  /**
   * The feature id for the '<em><b>Rot Rpm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__ROT_RPM = 4;

  /**
   * The feature id for the '<em><b>Rpm Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__RPM_MULT = 5;

  /**
   * The feature id for the '<em><b>Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__RADIUS = 6;

  /**
   * The feature id for the '<em><b>Hub Rad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__HUB_RAD = 7;

  /**
   * The feature id for the '<em><b>Pre Cone</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__PRE_CONE = 8;

  /**
   * The feature id for the '<em><b>Bl Thp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__BL_THP = 9;

  /**
   * The feature id for the '<em><b>Hub Conn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__HUB_CONN = 10;

  /**
   * The feature id for the '<em><b>Mode Pr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__MODE_PR = 11;

  /**
   * The feature id for the '<em><b>Tab Delim</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__TAB_DELIM = 12;

  /**
   * The feature id for the '<em><b>Mid Node Tw</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__MID_NODE_TW = 13;

  /**
   * The feature id for the '<em><b>Tip Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__TIP_MASS = 14;

  /**
   * The feature id for the '<em><b>Cm Loc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__CM_LOC = 15;

  /**
   * The feature id for the '<em><b>Cm Axial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__CM_AXIAL = 16;

  /**
   * The feature id for the '<em><b>Ixx Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__IXX_TIP = 17;

  /**
   * The feature id for the '<em><b>Iyy Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__IYY_TIP = 18;

  /**
   * The feature id for the '<em><b>Izz Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__IZZ_TIP = 19;

  /**
   * The feature id for the '<em><b>Ixy Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__IXY_TIP = 20;

  /**
   * The feature id for the '<em><b>Izx Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__IZX_TIP = 21;

  /**
   * The feature id for the '<em><b>Iyz Tip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__IYZ_TIP = 22;

  /**
   * The feature id for the '<em><b>Id Mat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__ID_MAT = 23;

  /**
   * The feature id for the '<em><b>Sec File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__SEC_FILE = 24;

  /**
   * The feature id for the '<em><b>Sec Mas Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__SEC_MAS_MULT = 25;

  /**
   * The feature id for the '<em><b>Flp Inr Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__FLP_INR_MULT = 26;

  /**
   * The feature id for the '<em><b>Lag Inr Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__LAG_INR_MULT = 27;

  /**
   * The feature id for the '<em><b>Flpstf Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__FLPSTF_MULT = 28;

  /**
   * The feature id for the '<em><b>Edg Stf Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__EDG_STF_MULT = 29;

  /**
   * The feature id for the '<em><b>Tor Stf Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__TOR_STF_MULT = 30;

  /**
   * The feature id for the '<em><b>Axi Stf Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__AXI_STF_MULT = 31;

  /**
   * The feature id for the '<em><b>Cg Offs Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__CG_OFFS_MULT = 32;

  /**
   * The feature id for the '<em><b>Sc Offs Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__SC_OFFS_MULT = 33;

  /**
   * The feature id for the '<em><b>Tc Offs Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__TC_OFFS_MULT = 34;

  /**
   * The feature id for the '<em><b>NSelt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__NSELT = 35;

  /**
   * The feature id for the '<em><b>El Loc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__EL_LOC = 36;

  /**
   * The feature id for the '<em><b>Twr Support</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__TWR_SUPPORT = 37;

  /**
   * The feature id for the '<em><b>Twr Attach</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__TWR_ATTACH = 38;

  /**
   * The feature id for the '<em><b>Twr Wires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__TWR_WIRES = 39;

  /**
   * The feature id for the '<em><b>Node Attach</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__NODE_ATTACH = 40;

  /**
   * The feature id for the '<em><b>Wire Stiff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__WIRE_STIFF = 41;

  /**
   * The feature id for the '<em><b>Wire Angle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI__WIRE_ANGLE = 42;

  /**
   * The number of structural features of the '<em>Model Bmodesbmi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESBMI_FEATURE_COUNT = 43;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.HeaderImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__NAME = 0;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__DESC = 1;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.SectionImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getSection()
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
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.bEchoImpl <em>bEcho</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.bEchoImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getbEcho()
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
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iBeamTypeImpl <em>iBeam Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iBeamTypeImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiBeamType()
   * @generated
   */
  int IBEAM_TYPE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IBEAM_TYPE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IBEAM_TYPE__NAME = 1;

  /**
   * The number of structural features of the '<em>iBeam Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IBEAM_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nRotRpmImpl <em>nRot Rpm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nRotRpmImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnRotRpm()
   * @generated
   */
  int NROT_RPM = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NROT_RPM__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NROT_RPM__NAME = 1;

  /**
   * The number of structural features of the '<em>nRot Rpm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NROT_RPM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nRpmMultImpl <em>nRpm Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nRpmMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnRpmMult()
   * @generated
   */
  int NRPM_MULT = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRPM_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRPM_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nRpm Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRPM_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nRadiusImpl <em>nRadius</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nRadiusImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnRadius()
   * @generated
   */
  int NRADIUS = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRADIUS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRADIUS__NAME = 1;

  /**
   * The number of structural features of the '<em>nRadius</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRADIUS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nHubRadImpl <em>nHub Rad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nHubRadImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnHubRad()
   * @generated
   */
  int NHUB_RAD = 8;

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
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nPreconeImpl <em>nPrecone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nPreconeImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnPrecone()
   * @generated
   */
  int NPRECONE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRECONE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRECONE__NAME = 1;

  /**
   * The number of structural features of the '<em>nPrecone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPRECONE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nBlThpImpl <em>nBl Thp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nBlThpImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnBlThp()
   * @generated
   */
  int NBL_THP = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_THP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_THP__NAME = 1;

  /**
   * The number of structural features of the '<em>nBl Thp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBL_THP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iHubConnImpl <em>iHub Conn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iHubConnImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiHubConn()
   * @generated
   */
  int IHUB_CONN = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHUB_CONN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHUB_CONN__NAME = 1;

  /**
   * The number of structural features of the '<em>iHub Conn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHUB_CONN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iModePrImpl <em>iMode Pr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iModePrImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiModePr()
   * @generated
   */
  int IMODE_PR = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMODE_PR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMODE_PR__NAME = 1;

  /**
   * The number of structural features of the '<em>iMode Pr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMODE_PR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.bTabDelimImpl <em>bTab Delim</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.bTabDelimImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getbTabDelim()
   * @generated
   */
  int BTAB_DELIM = 13;

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
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.bMidNodeTwImpl <em>bMid Node Tw</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.bMidNodeTwImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getbMidNodeTw()
   * @generated
   */
  int BMID_NODE_TW = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BMID_NODE_TW__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BMID_NODE_TW__NAME = 1;

  /**
   * The number of structural features of the '<em>bMid Node Tw</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BMID_NODE_TW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nTipMassImpl <em>nTip Mass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nTipMassImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnTipMass()
   * @generated
   */
  int NTIP_MASS = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS__NAME = 1;

  /**
   * The number of structural features of the '<em>nTip Mass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIP_MASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nCmLocImpl <em>nCm Loc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nCmLocImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnCmLoc()
   * @generated
   */
  int NCM_LOC = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCM_LOC__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCM_LOC__NAME = 1;

  /**
   * The number of structural features of the '<em>nCm Loc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCM_LOC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nCmAxialImpl <em>nCm Axial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nCmAxialImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnCmAxial()
   * @generated
   */
  int NCM_AXIAL = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCM_AXIAL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCM_AXIAL__NAME = 1;

  /**
   * The number of structural features of the '<em>nCm Axial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCM_AXIAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIxxTipImpl <em>nIxx Tip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIxxTipImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIxxTip()
   * @generated
   */
  int NIXX_TIP = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIXX_TIP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIXX_TIP__NAME = 1;

  /**
   * The number of structural features of the '<em>nIxx Tip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIXX_TIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIyyTipImpl <em>nIyy Tip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIyyTipImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIyyTip()
   * @generated
   */
  int NIYY_TIP = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIYY_TIP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIYY_TIP__NAME = 1;

  /**
   * The number of structural features of the '<em>nIyy Tip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIYY_TIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIzzTipImpl <em>nIzz Tip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIzzTipImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIzzTip()
   * @generated
   */
  int NIZZ_TIP = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIZZ_TIP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIZZ_TIP__NAME = 1;

  /**
   * The number of structural features of the '<em>nIzz Tip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIZZ_TIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIxyTipImpl <em>nIxy Tip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIxyTipImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIxyTip()
   * @generated
   */
  int NIXY_TIP = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIXY_TIP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIXY_TIP__NAME = 1;

  /**
   * The number of structural features of the '<em>nIxy Tip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIXY_TIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIzxTipImpl <em>nIzx Tip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIzxTipImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIzxTip()
   * @generated
   */
  int NIZX_TIP = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIZX_TIP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIZX_TIP__NAME = 1;

  /**
   * The number of structural features of the '<em>nIzx Tip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIZX_TIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIyzTipImpl <em>nIyz Tip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIyzTipImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIyzTip()
   * @generated
   */
  int NIYZ_TIP = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIYZ_TIP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIYZ_TIP__NAME = 1;

  /**
   * The number of structural features of the '<em>nIyz Tip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIYZ_TIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iIdMatImpl <em>iId Mat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iIdMatImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiIdMat()
   * @generated
   */
  int IID_MAT = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IID_MAT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IID_MAT__NAME = 1;

  /**
   * The number of structural features of the '<em>iId Mat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IID_MAT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iSecFileImpl <em>iSec File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iSecFileImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiSecFile()
   * @generated
   */
  int ISEC_FILE = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISEC_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISEC_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>iSec File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISEC_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nSecMasMultImpl <em>nSec Mas Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nSecMasMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnSecMasMult()
   * @generated
   */
  int NSEC_MAS_MULT = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSEC_MAS_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSEC_MAS_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nSec Mas Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSEC_MAS_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nFlpInrMultImpl <em>nFlp Inr Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nFlpInrMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnFlpInrMult()
   * @generated
   */
  int NFLP_INR_MULT = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFLP_INR_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFLP_INR_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nFlp Inr Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFLP_INR_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nLagInrMultImpl <em>nLag Inr Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nLagInrMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnLagInrMult()
   * @generated
   */
  int NLAG_INR_MULT = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLAG_INR_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLAG_INR_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nLag Inr Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLAG_INR_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nFlpstfMultImpl <em>nFlpstf Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nFlpstfMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnFlpstfMult()
   * @generated
   */
  int NFLPSTF_MULT = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFLPSTF_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFLPSTF_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nFlpstf Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFLPSTF_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nEdgStfMultImpl <em>nEdg Stf Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nEdgStfMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnEdgStfMult()
   * @generated
   */
  int NEDG_STF_MULT = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEDG_STF_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEDG_STF_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nEdg Stf Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEDG_STF_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nTorStfMultImpl <em>nTor Stf Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nTorStfMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnTorStfMult()
   * @generated
   */
  int NTOR_STF_MULT = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTOR_STF_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTOR_STF_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nTor Stf Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTOR_STF_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nAxiStfMultImpl <em>nAxi Stf Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nAxiStfMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnAxiStfMult()
   * @generated
   */
  int NAXI_STF_MULT = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAXI_STF_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAXI_STF_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nAxi Stf Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAXI_STF_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nCgOffsMultImpl <em>nCg Offs Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nCgOffsMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnCgOffsMult()
   * @generated
   */
  int NCG_OFFS_MULT = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCG_OFFS_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCG_OFFS_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nCg Offs Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCG_OFFS_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nScOffsMultImpl <em>nSc Offs Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nScOffsMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnScOffsMult()
   * @generated
   */
  int NSC_OFFS_MULT = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSC_OFFS_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSC_OFFS_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nSc Offs Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSC_OFFS_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nTcOffsMultImpl <em>nTc Offs Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nTcOffsMultImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnTcOffsMult()
   * @generated
   */
  int NTC_OFFS_MULT = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTC_OFFS_MULT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTC_OFFS_MULT__NAME = 1;

  /**
   * The number of structural features of the '<em>nTc Offs Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTC_OFFS_MULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iNSeltImpl <em>iN Selt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iNSeltImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiNSelt()
   * @generated
   */
  int IN_SELT = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_SELT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_SELT__NAME = 1;

  /**
   * The number of structural features of the '<em>iN Selt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_SELT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aElLocImpl <em>aEl Loc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aElLocImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaElLoc()
   * @generated
   */
  int AEL_LOC = 37;

  /**
   * The feature id for the '<em><b>El loc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AEL_LOC__EL_LOC = 0;

  /**
   * The number of structural features of the '<em>aEl Loc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AEL_LOC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iTwrSupportImpl <em>iTwr Support</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iTwrSupportImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiTwrSupport()
   * @generated
   */
  int ITWR_SUPPORT = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_SUPPORT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_SUPPORT__NAME = 1;

  /**
   * The number of structural features of the '<em>iTwr Support</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_SUPPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iTwrAttachImpl <em>iTwr Attach</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iTwrAttachImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiTwrAttach()
   * @generated
   */
  int ITWR_ATTACH = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_ATTACH__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_ATTACH__NAME = 1;

  /**
   * The number of structural features of the '<em>iTwr Attach</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITWR_ATTACH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aTwrWiresImpl <em>aTwr Wires</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aTwrWiresImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaTwrWires()
   * @generated
   */
  int ATWR_WIRES = 40;

  /**
   * The feature id for the '<em><b>El loc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_WIRES__EL_LOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_WIRES__NAME = 1;

  /**
   * The number of structural features of the '<em>aTwr Wires</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_WIRES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aNodeAttachImpl <em>aNode Attach</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aNodeAttachImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaNodeAttach()
   * @generated
   */
  int ANODE_ATTACH = 41;

  /**
   * The feature id for the '<em><b>El loc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANODE_ATTACH__EL_LOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANODE_ATTACH__NAME = 1;

  /**
   * The number of structural features of the '<em>aNode Attach</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANODE_ATTACH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aWireStiffImpl <em>aWire Stiff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aWireStiffImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaWireStiff()
   * @generated
   */
  int AWIRE_STIFF = 42;

  /**
   * The feature id for the '<em><b>El loc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWIRE_STIFF__EL_LOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWIRE_STIFF__NAME = 1;

  /**
   * The number of structural features of the '<em>aWire Stiff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWIRE_STIFF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aWireAngleImpl <em>aWire Angle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aWireAngleImpl
   * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaWireAngle()
   * @generated
   */
  int AWIRE_ANGLE = 43;

  /**
   * The feature id for the '<em><b>El loc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWIRE_ANGLE__EL_LOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWIRE_ANGLE__NAME = 1;

  /**
   * The number of structural features of the '<em>aWire Angle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWIRE_ANGLE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi <em>Model Bmodesbmi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Bmodesbmi</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi
   * @generated
   */
  EClass getModelBmodesbmi();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHead()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_Head();

  /**
   * Returns the meta object for the containment reference list '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSec <em>Sec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sec</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSec()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_Sec();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getEcho <em>Echo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Echo</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getEcho()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_Echo();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getBeamType <em>Beam Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Beam Type</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getBeamType()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_BeamType();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRotRpm <em>Rot Rpm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rot Rpm</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRotRpm()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_RotRpm();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRpmMult <em>Rpm Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rpm Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRpmMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_RpmMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Radius</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getRadius()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_Radius();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHubRad <em>Hub Rad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hub Rad</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHubRad()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_HubRad();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getPreCone <em>Pre Cone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Cone</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getPreCone()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_PreCone();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getBlThp <em>Bl Thp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl Thp</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getBlThp()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_BlThp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHubConn <em>Hub Conn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hub Conn</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getHubConn()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_HubConn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getModePr <em>Mode Pr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mode Pr</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getModePr()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_ModePr();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTabDelim <em>Tab Delim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tab Delim</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTabDelim()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_TabDelim();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getMidNodeTw <em>Mid Node Tw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mid Node Tw</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getMidNodeTw()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_MidNodeTw();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTipMass <em>Tip Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tip Mass</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTipMass()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_TipMass();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCmLoc <em>Cm Loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cm Loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCmLoc()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_CmLoc();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCmAxial <em>Cm Axial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cm Axial</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCmAxial()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_CmAxial();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIxxTip <em>Ixx Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ixx Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIxxTip()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_IxxTip();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIyyTip <em>Iyy Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iyy Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIyyTip()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_IyyTip();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIzzTip <em>Izz Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Izz Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIzzTip()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_IzzTip();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIxyTip <em>Ixy Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ixy Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIxyTip()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_IxyTip();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIzxTip <em>Izx Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Izx Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIzxTip()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_IzxTip();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIyzTip <em>Iyz Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iyz Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIyzTip()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_IyzTip();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIdMat <em>Id Mat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id Mat</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getIdMat()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_IdMat();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSecFile <em>Sec File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sec File</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSecFile()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_SecFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSecMasMult <em>Sec Mas Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sec Mas Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getSecMasMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_SecMasMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getFlpInrMult <em>Flp Inr Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Flp Inr Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getFlpInrMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_FlpInrMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getLagInrMult <em>Lag Inr Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lag Inr Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getLagInrMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_LagInrMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getFlpstfMult <em>Flpstf Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Flpstf Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getFlpstfMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_FlpstfMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getEdgStfMult <em>Edg Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Edg Stf Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getEdgStfMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_EdgStfMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTorStfMult <em>Tor Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tor Stf Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTorStfMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_TorStfMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getAxiStfMult <em>Axi Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Axi Stf Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getAxiStfMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_AxiStfMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCgOffsMult <em>Cg Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cg Offs Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getCgOffsMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_CgOffsMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getScOffsMult <em>Sc Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sc Offs Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getScOffsMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_ScOffsMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTcOffsMult <em>Tc Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tc Offs Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTcOffsMult()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_TcOffsMult();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getNSelt <em>NSelt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>NSelt</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getNSelt()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_NSelt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getElLoc <em>El Loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>El Loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getElLoc()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_ElLoc();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrSupport <em>Twr Support</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr Support</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrSupport()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_TwrSupport();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrAttach <em>Twr Attach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr Attach</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrAttach()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_TwrAttach();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrWires <em>Twr Wires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr Wires</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getTwrWires()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_TwrWires();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getNodeAttach <em>Node Attach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node Attach</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getNodeAttach()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_NodeAttach();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getWireStiff <em>Wire Stiff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wire Stiff</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getWireStiff()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_WireStiff();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getWireAngle <em>Wire Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wire Angle</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi#getWireAngle()
   * @see #getModelBmodesbmi()
   * @generated
   */
  EReference getModelBmodesbmi_WireAngle();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.Header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.Header#getName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Name();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.Header#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.Header#getDesc()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Desc();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.bEcho <em>bEcho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bEcho</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bEcho
   * @generated
   */
  EClass getbEcho();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.bEcho#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bEcho#isValue()
   * @see #getbEcho()
   * @generated
   */
  EAttribute getbEcho_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.bEcho#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bEcho#getName()
   * @see #getbEcho()
   * @generated
   */
  EAttribute getbEcho_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.iBeamType <em>iBeam Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iBeam Type</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iBeamType
   * @generated
   */
  EClass getiBeamType();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iBeamType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iBeamType#getValue()
   * @see #getiBeamType()
   * @generated
   */
  EAttribute getiBeamType_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iBeamType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iBeamType#getName()
   * @see #getiBeamType()
   * @generated
   */
  EAttribute getiBeamType_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nRotRpm <em>nRot Rpm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRot Rpm</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRotRpm
   * @generated
   */
  EClass getnRotRpm();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nRotRpm#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRotRpm#getValue()
   * @see #getnRotRpm()
   * @generated
   */
  EAttribute getnRotRpm_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nRotRpm#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRotRpm#getName()
   * @see #getnRotRpm()
   * @generated
   */
  EAttribute getnRotRpm_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nRpmMult <em>nRpm Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRpm Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRpmMult
   * @generated
   */
  EClass getnRpmMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nRpmMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRpmMult#getValue()
   * @see #getnRpmMult()
   * @generated
   */
  EAttribute getnRpmMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nRpmMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRpmMult#getName()
   * @see #getnRpmMult()
   * @generated
   */
  EAttribute getnRpmMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nRadius <em>nRadius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRadius</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRadius
   * @generated
   */
  EClass getnRadius();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nRadius#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRadius#getValue()
   * @see #getnRadius()
   * @generated
   */
  EAttribute getnRadius_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nRadius#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nRadius#getName()
   * @see #getnRadius()
   * @generated
   */
  EAttribute getnRadius_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nHubRad <em>nHub Rad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHub Rad</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nHubRad
   * @generated
   */
  EClass getnHubRad();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nHubRad#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nHubRad#getValue()
   * @see #getnHubRad()
   * @generated
   */
  EAttribute getnHubRad_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nHubRad#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nHubRad#getName()
   * @see #getnHubRad()
   * @generated
   */
  EAttribute getnHubRad_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nPrecone <em>nPrecone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nPrecone</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nPrecone
   * @generated
   */
  EClass getnPrecone();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nPrecone#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nPrecone#getValue()
   * @see #getnPrecone()
   * @generated
   */
  EAttribute getnPrecone_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nPrecone#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nPrecone#getName()
   * @see #getnPrecone()
   * @generated
   */
  EAttribute getnPrecone_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nBlThp <em>nBl Thp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBl Thp</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nBlThp
   * @generated
   */
  EClass getnBlThp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nBlThp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nBlThp#getValue()
   * @see #getnBlThp()
   * @generated
   */
  EAttribute getnBlThp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nBlThp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nBlThp#getName()
   * @see #getnBlThp()
   * @generated
   */
  EAttribute getnBlThp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.iHubConn <em>iHub Conn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iHub Conn</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iHubConn
   * @generated
   */
  EClass getiHubConn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iHubConn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iHubConn#getValue()
   * @see #getiHubConn()
   * @generated
   */
  EAttribute getiHubConn_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iHubConn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iHubConn#getName()
   * @see #getiHubConn()
   * @generated
   */
  EAttribute getiHubConn_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.iModePr <em>iMode Pr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iMode Pr</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iModePr
   * @generated
   */
  EClass getiModePr();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iModePr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iModePr#getValue()
   * @see #getiModePr()
   * @generated
   */
  EAttribute getiModePr_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iModePr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iModePr#getName()
   * @see #getiModePr()
   * @generated
   */
  EAttribute getiModePr_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.bTabDelim <em>bTab Delim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTab Delim</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bTabDelim
   * @generated
   */
  EClass getbTabDelim();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.bTabDelim#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bTabDelim#isValue()
   * @see #getbTabDelim()
   * @generated
   */
  EAttribute getbTabDelim_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.bTabDelim#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bTabDelim#getName()
   * @see #getbTabDelim()
   * @generated
   */
  EAttribute getbTabDelim_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.bMidNodeTw <em>bMid Node Tw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bMid Node Tw</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bMidNodeTw
   * @generated
   */
  EClass getbMidNodeTw();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.bMidNodeTw#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bMidNodeTw#isValue()
   * @see #getbMidNodeTw()
   * @generated
   */
  EAttribute getbMidNodeTw_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.bMidNodeTw#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.bMidNodeTw#getName()
   * @see #getbMidNodeTw()
   * @generated
   */
  EAttribute getbMidNodeTw_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nTipMass <em>nTip Mass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTip Mass</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTipMass
   * @generated
   */
  EClass getnTipMass();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nTipMass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTipMass#getValue()
   * @see #getnTipMass()
   * @generated
   */
  EAttribute getnTipMass_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nTipMass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTipMass#getName()
   * @see #getnTipMass()
   * @generated
   */
  EAttribute getnTipMass_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nCmLoc <em>nCm Loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nCm Loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCmLoc
   * @generated
   */
  EClass getnCmLoc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nCmLoc#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCmLoc#getValue()
   * @see #getnCmLoc()
   * @generated
   */
  EAttribute getnCmLoc_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nCmLoc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCmLoc#getName()
   * @see #getnCmLoc()
   * @generated
   */
  EAttribute getnCmLoc_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nCmAxial <em>nCm Axial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nCm Axial</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCmAxial
   * @generated
   */
  EClass getnCmAxial();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nCmAxial#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCmAxial#getValue()
   * @see #getnCmAxial()
   * @generated
   */
  EAttribute getnCmAxial_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nCmAxial#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCmAxial#getName()
   * @see #getnCmAxial()
   * @generated
   */
  EAttribute getnCmAxial_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nIxxTip <em>nIxx Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nIxx Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIxxTip
   * @generated
   */
  EClass getnIxxTip();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIxxTip#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIxxTip#getValue()
   * @see #getnIxxTip()
   * @generated
   */
  EAttribute getnIxxTip_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIxxTip#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIxxTip#getName()
   * @see #getnIxxTip()
   * @generated
   */
  EAttribute getnIxxTip_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nIyyTip <em>nIyy Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nIyy Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIyyTip
   * @generated
   */
  EClass getnIyyTip();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIyyTip#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIyyTip#getValue()
   * @see #getnIyyTip()
   * @generated
   */
  EAttribute getnIyyTip_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIyyTip#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIyyTip#getName()
   * @see #getnIyyTip()
   * @generated
   */
  EAttribute getnIyyTip_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nIzzTip <em>nIzz Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nIzz Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIzzTip
   * @generated
   */
  EClass getnIzzTip();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIzzTip#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIzzTip#getValue()
   * @see #getnIzzTip()
   * @generated
   */
  EAttribute getnIzzTip_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIzzTip#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIzzTip#getName()
   * @see #getnIzzTip()
   * @generated
   */
  EAttribute getnIzzTip_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nIxyTip <em>nIxy Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nIxy Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIxyTip
   * @generated
   */
  EClass getnIxyTip();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIxyTip#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIxyTip#getValue()
   * @see #getnIxyTip()
   * @generated
   */
  EAttribute getnIxyTip_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIxyTip#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIxyTip#getName()
   * @see #getnIxyTip()
   * @generated
   */
  EAttribute getnIxyTip_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nIzxTip <em>nIzx Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nIzx Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIzxTip
   * @generated
   */
  EClass getnIzxTip();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIzxTip#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIzxTip#getValue()
   * @see #getnIzxTip()
   * @generated
   */
  EAttribute getnIzxTip_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIzxTip#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIzxTip#getName()
   * @see #getnIzxTip()
   * @generated
   */
  EAttribute getnIzxTip_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nIyzTip <em>nIyz Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nIyz Tip</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIyzTip
   * @generated
   */
  EClass getnIyzTip();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIyzTip#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIyzTip#getValue()
   * @see #getnIyzTip()
   * @generated
   */
  EAttribute getnIyzTip_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nIyzTip#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nIyzTip#getName()
   * @see #getnIyzTip()
   * @generated
   */
  EAttribute getnIyzTip_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.iIdMat <em>iId Mat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iId Mat</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iIdMat
   * @generated
   */
  EClass getiIdMat();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iIdMat#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iIdMat#getValue()
   * @see #getiIdMat()
   * @generated
   */
  EAttribute getiIdMat_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iIdMat#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iIdMat#getName()
   * @see #getiIdMat()
   * @generated
   */
  EAttribute getiIdMat_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.iSecFile <em>iSec File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iSec File</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iSecFile
   * @generated
   */
  EClass getiSecFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iSecFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iSecFile#getValue()
   * @see #getiSecFile()
   * @generated
   */
  EAttribute getiSecFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iSecFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iSecFile#getName()
   * @see #getiSecFile()
   * @generated
   */
  EAttribute getiSecFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nSecMasMult <em>nSec Mas Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSec Mas Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nSecMasMult
   * @generated
   */
  EClass getnSecMasMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nSecMasMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nSecMasMult#getValue()
   * @see #getnSecMasMult()
   * @generated
   */
  EAttribute getnSecMasMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nSecMasMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nSecMasMult#getName()
   * @see #getnSecMasMult()
   * @generated
   */
  EAttribute getnSecMasMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nFlpInrMult <em>nFlp Inr Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nFlp Inr Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nFlpInrMult
   * @generated
   */
  EClass getnFlpInrMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nFlpInrMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nFlpInrMult#getValue()
   * @see #getnFlpInrMult()
   * @generated
   */
  EAttribute getnFlpInrMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nFlpInrMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nFlpInrMult#getName()
   * @see #getnFlpInrMult()
   * @generated
   */
  EAttribute getnFlpInrMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nLagInrMult <em>nLag Inr Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nLag Inr Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nLagInrMult
   * @generated
   */
  EClass getnLagInrMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nLagInrMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nLagInrMult#getValue()
   * @see #getnLagInrMult()
   * @generated
   */
  EAttribute getnLagInrMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nLagInrMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nLagInrMult#getName()
   * @see #getnLagInrMult()
   * @generated
   */
  EAttribute getnLagInrMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nFlpstfMult <em>nFlpstf Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nFlpstf Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nFlpstfMult
   * @generated
   */
  EClass getnFlpstfMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nFlpstfMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nFlpstfMult#getValue()
   * @see #getnFlpstfMult()
   * @generated
   */
  EAttribute getnFlpstfMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nFlpstfMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nFlpstfMult#getName()
   * @see #getnFlpstfMult()
   * @generated
   */
  EAttribute getnFlpstfMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nEdgStfMult <em>nEdg Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nEdg Stf Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nEdgStfMult
   * @generated
   */
  EClass getnEdgStfMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nEdgStfMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nEdgStfMult#getValue()
   * @see #getnEdgStfMult()
   * @generated
   */
  EAttribute getnEdgStfMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nEdgStfMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nEdgStfMult#getName()
   * @see #getnEdgStfMult()
   * @generated
   */
  EAttribute getnEdgStfMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nTorStfMult <em>nTor Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTor Stf Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTorStfMult
   * @generated
   */
  EClass getnTorStfMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nTorStfMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTorStfMult#getValue()
   * @see #getnTorStfMult()
   * @generated
   */
  EAttribute getnTorStfMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nTorStfMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTorStfMult#getName()
   * @see #getnTorStfMult()
   * @generated
   */
  EAttribute getnTorStfMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nAxiStfMult <em>nAxi Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nAxi Stf Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nAxiStfMult
   * @generated
   */
  EClass getnAxiStfMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nAxiStfMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nAxiStfMult#getValue()
   * @see #getnAxiStfMult()
   * @generated
   */
  EAttribute getnAxiStfMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nAxiStfMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nAxiStfMult#getName()
   * @see #getnAxiStfMult()
   * @generated
   */
  EAttribute getnAxiStfMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nCgOffsMult <em>nCg Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nCg Offs Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCgOffsMult
   * @generated
   */
  EClass getnCgOffsMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nCgOffsMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCgOffsMult#getValue()
   * @see #getnCgOffsMult()
   * @generated
   */
  EAttribute getnCgOffsMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nCgOffsMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nCgOffsMult#getName()
   * @see #getnCgOffsMult()
   * @generated
   */
  EAttribute getnCgOffsMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nScOffsMult <em>nSc Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSc Offs Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nScOffsMult
   * @generated
   */
  EClass getnScOffsMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nScOffsMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nScOffsMult#getValue()
   * @see #getnScOffsMult()
   * @generated
   */
  EAttribute getnScOffsMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nScOffsMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nScOffsMult#getName()
   * @see #getnScOffsMult()
   * @generated
   */
  EAttribute getnScOffsMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.nTcOffsMult <em>nTc Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTc Offs Mult</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTcOffsMult
   * @generated
   */
  EClass getnTcOffsMult();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nTcOffsMult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTcOffsMult#getValue()
   * @see #getnTcOffsMult()
   * @generated
   */
  EAttribute getnTcOffsMult_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.nTcOffsMult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.nTcOffsMult#getName()
   * @see #getnTcOffsMult()
   * @generated
   */
  EAttribute getnTcOffsMult_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.iNSelt <em>iN Selt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iN Selt</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iNSelt
   * @generated
   */
  EClass getiNSelt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iNSelt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iNSelt#getValue()
   * @see #getiNSelt()
   * @generated
   */
  EAttribute getiNSelt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iNSelt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iNSelt#getName()
   * @see #getiNSelt()
   * @generated
   */
  EAttribute getiNSelt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.aElLoc <em>aEl Loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aEl Loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aElLoc
   * @generated
   */
  EClass getaElLoc();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesbmi.aElLoc#getEl_loc <em>El loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>El loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aElLoc#getEl_loc()
   * @see #getaElLoc()
   * @generated
   */
  EAttribute getaElLoc_El_loc();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.iTwrSupport <em>iTwr Support</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iTwr Support</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iTwrSupport
   * @generated
   */
  EClass getiTwrSupport();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iTwrSupport#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iTwrSupport#getValue()
   * @see #getiTwrSupport()
   * @generated
   */
  EAttribute getiTwrSupport_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iTwrSupport#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iTwrSupport#getName()
   * @see #getiTwrSupport()
   * @generated
   */
  EAttribute getiTwrSupport_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.iTwrAttach <em>iTwr Attach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iTwr Attach</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iTwrAttach
   * @generated
   */
  EClass getiTwrAttach();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iTwrAttach#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iTwrAttach#getValue()
   * @see #getiTwrAttach()
   * @generated
   */
  EAttribute getiTwrAttach_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.iTwrAttach#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.iTwrAttach#getName()
   * @see #getiTwrAttach()
   * @generated
   */
  EAttribute getiTwrAttach_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.aTwrWires <em>aTwr Wires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aTwr Wires</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aTwrWires
   * @generated
   */
  EClass getaTwrWires();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesbmi.aTwrWires#getEl_loc <em>El loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>El loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aTwrWires#getEl_loc()
   * @see #getaTwrWires()
   * @generated
   */
  EAttribute getaTwrWires_El_loc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.aTwrWires#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aTwrWires#getName()
   * @see #getaTwrWires()
   * @generated
   */
  EAttribute getaTwrWires_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach <em>aNode Attach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aNode Attach</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach
   * @generated
   */
  EClass getaNodeAttach();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach#getEl_loc <em>El loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>El loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach#getEl_loc()
   * @see #getaNodeAttach()
   * @generated
   */
  EAttribute getaNodeAttach_El_loc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach#getName()
   * @see #getaNodeAttach()
   * @generated
   */
  EAttribute getaNodeAttach_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.aWireStiff <em>aWire Stiff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aWire Stiff</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aWireStiff
   * @generated
   */
  EClass getaWireStiff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesbmi.aWireStiff#getEl_loc <em>El loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>El loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aWireStiff#getEl_loc()
   * @see #getaWireStiff()
   * @generated
   */
  EAttribute getaWireStiff_El_loc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.aWireStiff#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aWireStiff#getName()
   * @see #getaWireStiff()
   * @generated
   */
  EAttribute getaWireStiff_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesbmi.aWireAngle <em>aWire Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aWire Angle</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aWireAngle
   * @generated
   */
  EClass getaWireAngle();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesbmi.aWireAngle#getEl_loc <em>El loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>El loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aWireAngle#getEl_loc()
   * @see #getaWireAngle()
   * @generated
   */
  EAttribute getaWireAngle_El_loc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesbmi.aWireAngle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodes.bmodesbmi.aWireAngle#getName()
   * @see #getaWireAngle()
   * @generated
   */
  EAttribute getaWireAngle_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BmodesbmiFactory getBmodesbmiFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.ModelBmodesbmiImpl <em>Model Bmodesbmi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.ModelBmodesbmiImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getModelBmodesbmi()
     * @generated
     */
    EClass MODEL_BMODESBMI = eINSTANCE.getModelBmodesbmi();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__HEAD = eINSTANCE.getModelBmodesbmi_Head();

    /**
     * The meta object literal for the '<em><b>Sec</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__SEC = eINSTANCE.getModelBmodesbmi_Sec();

    /**
     * The meta object literal for the '<em><b>Echo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__ECHO = eINSTANCE.getModelBmodesbmi_Echo();

    /**
     * The meta object literal for the '<em><b>Beam Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__BEAM_TYPE = eINSTANCE.getModelBmodesbmi_BeamType();

    /**
     * The meta object literal for the '<em><b>Rot Rpm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__ROT_RPM = eINSTANCE.getModelBmodesbmi_RotRpm();

    /**
     * The meta object literal for the '<em><b>Rpm Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__RPM_MULT = eINSTANCE.getModelBmodesbmi_RpmMult();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__RADIUS = eINSTANCE.getModelBmodesbmi_Radius();

    /**
     * The meta object literal for the '<em><b>Hub Rad</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__HUB_RAD = eINSTANCE.getModelBmodesbmi_HubRad();

    /**
     * The meta object literal for the '<em><b>Pre Cone</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__PRE_CONE = eINSTANCE.getModelBmodesbmi_PreCone();

    /**
     * The meta object literal for the '<em><b>Bl Thp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__BL_THP = eINSTANCE.getModelBmodesbmi_BlThp();

    /**
     * The meta object literal for the '<em><b>Hub Conn</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__HUB_CONN = eINSTANCE.getModelBmodesbmi_HubConn();

    /**
     * The meta object literal for the '<em><b>Mode Pr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__MODE_PR = eINSTANCE.getModelBmodesbmi_ModePr();

    /**
     * The meta object literal for the '<em><b>Tab Delim</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__TAB_DELIM = eINSTANCE.getModelBmodesbmi_TabDelim();

    /**
     * The meta object literal for the '<em><b>Mid Node Tw</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__MID_NODE_TW = eINSTANCE.getModelBmodesbmi_MidNodeTw();

    /**
     * The meta object literal for the '<em><b>Tip Mass</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__TIP_MASS = eINSTANCE.getModelBmodesbmi_TipMass();

    /**
     * The meta object literal for the '<em><b>Cm Loc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__CM_LOC = eINSTANCE.getModelBmodesbmi_CmLoc();

    /**
     * The meta object literal for the '<em><b>Cm Axial</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__CM_AXIAL = eINSTANCE.getModelBmodesbmi_CmAxial();

    /**
     * The meta object literal for the '<em><b>Ixx Tip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__IXX_TIP = eINSTANCE.getModelBmodesbmi_IxxTip();

    /**
     * The meta object literal for the '<em><b>Iyy Tip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__IYY_TIP = eINSTANCE.getModelBmodesbmi_IyyTip();

    /**
     * The meta object literal for the '<em><b>Izz Tip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__IZZ_TIP = eINSTANCE.getModelBmodesbmi_IzzTip();

    /**
     * The meta object literal for the '<em><b>Ixy Tip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__IXY_TIP = eINSTANCE.getModelBmodesbmi_IxyTip();

    /**
     * The meta object literal for the '<em><b>Izx Tip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__IZX_TIP = eINSTANCE.getModelBmodesbmi_IzxTip();

    /**
     * The meta object literal for the '<em><b>Iyz Tip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__IYZ_TIP = eINSTANCE.getModelBmodesbmi_IyzTip();

    /**
     * The meta object literal for the '<em><b>Id Mat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__ID_MAT = eINSTANCE.getModelBmodesbmi_IdMat();

    /**
     * The meta object literal for the '<em><b>Sec File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__SEC_FILE = eINSTANCE.getModelBmodesbmi_SecFile();

    /**
     * The meta object literal for the '<em><b>Sec Mas Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__SEC_MAS_MULT = eINSTANCE.getModelBmodesbmi_SecMasMult();

    /**
     * The meta object literal for the '<em><b>Flp Inr Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__FLP_INR_MULT = eINSTANCE.getModelBmodesbmi_FlpInrMult();

    /**
     * The meta object literal for the '<em><b>Lag Inr Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__LAG_INR_MULT = eINSTANCE.getModelBmodesbmi_LagInrMult();

    /**
     * The meta object literal for the '<em><b>Flpstf Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__FLPSTF_MULT = eINSTANCE.getModelBmodesbmi_FlpstfMult();

    /**
     * The meta object literal for the '<em><b>Edg Stf Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__EDG_STF_MULT = eINSTANCE.getModelBmodesbmi_EdgStfMult();

    /**
     * The meta object literal for the '<em><b>Tor Stf Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__TOR_STF_MULT = eINSTANCE.getModelBmodesbmi_TorStfMult();

    /**
     * The meta object literal for the '<em><b>Axi Stf Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__AXI_STF_MULT = eINSTANCE.getModelBmodesbmi_AxiStfMult();

    /**
     * The meta object literal for the '<em><b>Cg Offs Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__CG_OFFS_MULT = eINSTANCE.getModelBmodesbmi_CgOffsMult();

    /**
     * The meta object literal for the '<em><b>Sc Offs Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__SC_OFFS_MULT = eINSTANCE.getModelBmodesbmi_ScOffsMult();

    /**
     * The meta object literal for the '<em><b>Tc Offs Mult</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__TC_OFFS_MULT = eINSTANCE.getModelBmodesbmi_TcOffsMult();

    /**
     * The meta object literal for the '<em><b>NSelt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__NSELT = eINSTANCE.getModelBmodesbmi_NSelt();

    /**
     * The meta object literal for the '<em><b>El Loc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__EL_LOC = eINSTANCE.getModelBmodesbmi_ElLoc();

    /**
     * The meta object literal for the '<em><b>Twr Support</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__TWR_SUPPORT = eINSTANCE.getModelBmodesbmi_TwrSupport();

    /**
     * The meta object literal for the '<em><b>Twr Attach</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__TWR_ATTACH = eINSTANCE.getModelBmodesbmi_TwrAttach();

    /**
     * The meta object literal for the '<em><b>Twr Wires</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__TWR_WIRES = eINSTANCE.getModelBmodesbmi_TwrWires();

    /**
     * The meta object literal for the '<em><b>Node Attach</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__NODE_ATTACH = eINSTANCE.getModelBmodesbmi_NodeAttach();

    /**
     * The meta object literal for the '<em><b>Wire Stiff</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__WIRE_STIFF = eINSTANCE.getModelBmodesbmi_WireStiff();

    /**
     * The meta object literal for the '<em><b>Wire Angle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESBMI__WIRE_ANGLE = eINSTANCE.getModelBmodesbmi_WireAngle();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.HeaderImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__DESC = eINSTANCE.getHeader_Desc();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.SectionImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.bEchoImpl <em>bEcho</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.bEchoImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getbEcho()
     * @generated
     */
    EClass BECHO = eINSTANCE.getbEcho();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BECHO__VALUE = eINSTANCE.getbEcho_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BECHO__NAME = eINSTANCE.getbEcho_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iBeamTypeImpl <em>iBeam Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iBeamTypeImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiBeamType()
     * @generated
     */
    EClass IBEAM_TYPE = eINSTANCE.getiBeamType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IBEAM_TYPE__VALUE = eINSTANCE.getiBeamType_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IBEAM_TYPE__NAME = eINSTANCE.getiBeamType_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nRotRpmImpl <em>nRot Rpm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nRotRpmImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnRotRpm()
     * @generated
     */
    EClass NROT_RPM = eINSTANCE.getnRotRpm();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NROT_RPM__VALUE = eINSTANCE.getnRotRpm_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NROT_RPM__NAME = eINSTANCE.getnRotRpm_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nRpmMultImpl <em>nRpm Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nRpmMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnRpmMult()
     * @generated
     */
    EClass NRPM_MULT = eINSTANCE.getnRpmMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRPM_MULT__VALUE = eINSTANCE.getnRpmMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRPM_MULT__NAME = eINSTANCE.getnRpmMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nRadiusImpl <em>nRadius</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nRadiusImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnRadius()
     * @generated
     */
    EClass NRADIUS = eINSTANCE.getnRadius();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRADIUS__VALUE = eINSTANCE.getnRadius_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRADIUS__NAME = eINSTANCE.getnRadius_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nHubRadImpl <em>nHub Rad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nHubRadImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnHubRad()
     * @generated
     */
    EClass NHUB_RAD = eINSTANCE.getnHubRad();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NHUB_RAD__VALUE = eINSTANCE.getnHubRad_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NHUB_RAD__NAME = eINSTANCE.getnHubRad_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nPreconeImpl <em>nPrecone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nPreconeImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnPrecone()
     * @generated
     */
    EClass NPRECONE = eINSTANCE.getnPrecone();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPRECONE__VALUE = eINSTANCE.getnPrecone_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPRECONE__NAME = eINSTANCE.getnPrecone_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nBlThpImpl <em>nBl Thp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nBlThpImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnBlThp()
     * @generated
     */
    EClass NBL_THP = eINSTANCE.getnBlThp();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBL_THP__VALUE = eINSTANCE.getnBlThp_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBL_THP__NAME = eINSTANCE.getnBlThp_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iHubConnImpl <em>iHub Conn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iHubConnImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiHubConn()
     * @generated
     */
    EClass IHUB_CONN = eINSTANCE.getiHubConn();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IHUB_CONN__VALUE = eINSTANCE.getiHubConn_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IHUB_CONN__NAME = eINSTANCE.getiHubConn_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iModePrImpl <em>iMode Pr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iModePrImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiModePr()
     * @generated
     */
    EClass IMODE_PR = eINSTANCE.getiModePr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMODE_PR__VALUE = eINSTANCE.getiModePr_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMODE_PR__NAME = eINSTANCE.getiModePr_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.bTabDelimImpl <em>bTab Delim</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.bTabDelimImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getbTabDelim()
     * @generated
     */
    EClass BTAB_DELIM = eINSTANCE.getbTabDelim();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BTAB_DELIM__VALUE = eINSTANCE.getbTabDelim_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BTAB_DELIM__NAME = eINSTANCE.getbTabDelim_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.bMidNodeTwImpl <em>bMid Node Tw</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.bMidNodeTwImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getbMidNodeTw()
     * @generated
     */
    EClass BMID_NODE_TW = eINSTANCE.getbMidNodeTw();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BMID_NODE_TW__VALUE = eINSTANCE.getbMidNodeTw_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BMID_NODE_TW__NAME = eINSTANCE.getbMidNodeTw_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nTipMassImpl <em>nTip Mass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nTipMassImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnTipMass()
     * @generated
     */
    EClass NTIP_MASS = eINSTANCE.getnTipMass();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTIP_MASS__VALUE = eINSTANCE.getnTipMass_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTIP_MASS__NAME = eINSTANCE.getnTipMass_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nCmLocImpl <em>nCm Loc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nCmLocImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnCmLoc()
     * @generated
     */
    EClass NCM_LOC = eINSTANCE.getnCmLoc();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCM_LOC__VALUE = eINSTANCE.getnCmLoc_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCM_LOC__NAME = eINSTANCE.getnCmLoc_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nCmAxialImpl <em>nCm Axial</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nCmAxialImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnCmAxial()
     * @generated
     */
    EClass NCM_AXIAL = eINSTANCE.getnCmAxial();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCM_AXIAL__VALUE = eINSTANCE.getnCmAxial_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCM_AXIAL__NAME = eINSTANCE.getnCmAxial_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIxxTipImpl <em>nIxx Tip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIxxTipImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIxxTip()
     * @generated
     */
    EClass NIXX_TIP = eINSTANCE.getnIxxTip();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIXX_TIP__VALUE = eINSTANCE.getnIxxTip_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIXX_TIP__NAME = eINSTANCE.getnIxxTip_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIyyTipImpl <em>nIyy Tip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIyyTipImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIyyTip()
     * @generated
     */
    EClass NIYY_TIP = eINSTANCE.getnIyyTip();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIYY_TIP__VALUE = eINSTANCE.getnIyyTip_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIYY_TIP__NAME = eINSTANCE.getnIyyTip_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIzzTipImpl <em>nIzz Tip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIzzTipImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIzzTip()
     * @generated
     */
    EClass NIZZ_TIP = eINSTANCE.getnIzzTip();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIZZ_TIP__VALUE = eINSTANCE.getnIzzTip_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIZZ_TIP__NAME = eINSTANCE.getnIzzTip_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIxyTipImpl <em>nIxy Tip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIxyTipImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIxyTip()
     * @generated
     */
    EClass NIXY_TIP = eINSTANCE.getnIxyTip();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIXY_TIP__VALUE = eINSTANCE.getnIxyTip_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIXY_TIP__NAME = eINSTANCE.getnIxyTip_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIzxTipImpl <em>nIzx Tip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIzxTipImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIzxTip()
     * @generated
     */
    EClass NIZX_TIP = eINSTANCE.getnIzxTip();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIZX_TIP__VALUE = eINSTANCE.getnIzxTip_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIZX_TIP__NAME = eINSTANCE.getnIzxTip_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nIyzTipImpl <em>nIyz Tip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nIyzTipImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnIyzTip()
     * @generated
     */
    EClass NIYZ_TIP = eINSTANCE.getnIyzTip();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIYZ_TIP__VALUE = eINSTANCE.getnIyzTip_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NIYZ_TIP__NAME = eINSTANCE.getnIyzTip_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iIdMatImpl <em>iId Mat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iIdMatImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiIdMat()
     * @generated
     */
    EClass IID_MAT = eINSTANCE.getiIdMat();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IID_MAT__VALUE = eINSTANCE.getiIdMat_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IID_MAT__NAME = eINSTANCE.getiIdMat_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iSecFileImpl <em>iSec File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iSecFileImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiSecFile()
     * @generated
     */
    EClass ISEC_FILE = eINSTANCE.getiSecFile();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISEC_FILE__VALUE = eINSTANCE.getiSecFile_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISEC_FILE__NAME = eINSTANCE.getiSecFile_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nSecMasMultImpl <em>nSec Mas Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nSecMasMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnSecMasMult()
     * @generated
     */
    EClass NSEC_MAS_MULT = eINSTANCE.getnSecMasMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSEC_MAS_MULT__VALUE = eINSTANCE.getnSecMasMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSEC_MAS_MULT__NAME = eINSTANCE.getnSecMasMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nFlpInrMultImpl <em>nFlp Inr Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nFlpInrMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnFlpInrMult()
     * @generated
     */
    EClass NFLP_INR_MULT = eINSTANCE.getnFlpInrMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFLP_INR_MULT__VALUE = eINSTANCE.getnFlpInrMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFLP_INR_MULT__NAME = eINSTANCE.getnFlpInrMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nLagInrMultImpl <em>nLag Inr Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nLagInrMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnLagInrMult()
     * @generated
     */
    EClass NLAG_INR_MULT = eINSTANCE.getnLagInrMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NLAG_INR_MULT__VALUE = eINSTANCE.getnLagInrMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NLAG_INR_MULT__NAME = eINSTANCE.getnLagInrMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nFlpstfMultImpl <em>nFlpstf Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nFlpstfMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnFlpstfMult()
     * @generated
     */
    EClass NFLPSTF_MULT = eINSTANCE.getnFlpstfMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFLPSTF_MULT__VALUE = eINSTANCE.getnFlpstfMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFLPSTF_MULT__NAME = eINSTANCE.getnFlpstfMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nEdgStfMultImpl <em>nEdg Stf Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nEdgStfMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnEdgStfMult()
     * @generated
     */
    EClass NEDG_STF_MULT = eINSTANCE.getnEdgStfMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEDG_STF_MULT__VALUE = eINSTANCE.getnEdgStfMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEDG_STF_MULT__NAME = eINSTANCE.getnEdgStfMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nTorStfMultImpl <em>nTor Stf Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nTorStfMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnTorStfMult()
     * @generated
     */
    EClass NTOR_STF_MULT = eINSTANCE.getnTorStfMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTOR_STF_MULT__VALUE = eINSTANCE.getnTorStfMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTOR_STF_MULT__NAME = eINSTANCE.getnTorStfMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nAxiStfMultImpl <em>nAxi Stf Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nAxiStfMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnAxiStfMult()
     * @generated
     */
    EClass NAXI_STF_MULT = eINSTANCE.getnAxiStfMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAXI_STF_MULT__VALUE = eINSTANCE.getnAxiStfMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAXI_STF_MULT__NAME = eINSTANCE.getnAxiStfMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nCgOffsMultImpl <em>nCg Offs Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nCgOffsMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnCgOffsMult()
     * @generated
     */
    EClass NCG_OFFS_MULT = eINSTANCE.getnCgOffsMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCG_OFFS_MULT__VALUE = eINSTANCE.getnCgOffsMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCG_OFFS_MULT__NAME = eINSTANCE.getnCgOffsMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nScOffsMultImpl <em>nSc Offs Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nScOffsMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnScOffsMult()
     * @generated
     */
    EClass NSC_OFFS_MULT = eINSTANCE.getnScOffsMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSC_OFFS_MULT__VALUE = eINSTANCE.getnScOffsMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSC_OFFS_MULT__NAME = eINSTANCE.getnScOffsMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.nTcOffsMultImpl <em>nTc Offs Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.nTcOffsMultImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getnTcOffsMult()
     * @generated
     */
    EClass NTC_OFFS_MULT = eINSTANCE.getnTcOffsMult();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTC_OFFS_MULT__VALUE = eINSTANCE.getnTcOffsMult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTC_OFFS_MULT__NAME = eINSTANCE.getnTcOffsMult_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iNSeltImpl <em>iN Selt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iNSeltImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiNSelt()
     * @generated
     */
    EClass IN_SELT = eINSTANCE.getiNSelt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_SELT__VALUE = eINSTANCE.getiNSelt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_SELT__NAME = eINSTANCE.getiNSelt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aElLocImpl <em>aEl Loc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aElLocImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaElLoc()
     * @generated
     */
    EClass AEL_LOC = eINSTANCE.getaElLoc();

    /**
     * The meta object literal for the '<em><b>El loc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AEL_LOC__EL_LOC = eINSTANCE.getaElLoc_El_loc();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iTwrSupportImpl <em>iTwr Support</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iTwrSupportImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiTwrSupport()
     * @generated
     */
    EClass ITWR_SUPPORT = eINSTANCE.getiTwrSupport();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITWR_SUPPORT__VALUE = eINSTANCE.getiTwrSupport_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITWR_SUPPORT__NAME = eINSTANCE.getiTwrSupport_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.iTwrAttachImpl <em>iTwr Attach</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.iTwrAttachImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getiTwrAttach()
     * @generated
     */
    EClass ITWR_ATTACH = eINSTANCE.getiTwrAttach();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITWR_ATTACH__VALUE = eINSTANCE.getiTwrAttach_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITWR_ATTACH__NAME = eINSTANCE.getiTwrAttach_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aTwrWiresImpl <em>aTwr Wires</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aTwrWiresImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaTwrWires()
     * @generated
     */
    EClass ATWR_WIRES = eINSTANCE.getaTwrWires();

    /**
     * The meta object literal for the '<em><b>El loc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_WIRES__EL_LOC = eINSTANCE.getaTwrWires_El_loc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_WIRES__NAME = eINSTANCE.getaTwrWires_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aNodeAttachImpl <em>aNode Attach</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aNodeAttachImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaNodeAttach()
     * @generated
     */
    EClass ANODE_ATTACH = eINSTANCE.getaNodeAttach();

    /**
     * The meta object literal for the '<em><b>El loc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANODE_ATTACH__EL_LOC = eINSTANCE.getaNodeAttach_El_loc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANODE_ATTACH__NAME = eINSTANCE.getaNodeAttach_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aWireStiffImpl <em>aWire Stiff</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aWireStiffImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaWireStiff()
     * @generated
     */
    EClass AWIRE_STIFF = eINSTANCE.getaWireStiff();

    /**
     * The meta object literal for the '<em><b>El loc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AWIRE_STIFF__EL_LOC = eINSTANCE.getaWireStiff_El_loc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AWIRE_STIFF__NAME = eINSTANCE.getaWireStiff_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aWireAngleImpl <em>aWire Angle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.aWireAngleImpl
     * @see sc.ndt.editor.bmodes.bmodesbmi.impl.BmodesbmiPackageImpl#getaWireAngle()
     * @generated
     */
    EClass AWIRE_ANGLE = eINSTANCE.getaWireAngle();

    /**
     * The meta object literal for the '<em><b>El loc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AWIRE_ANGLE__EL_LOC = eINSTANCE.getaWireAngle_El_loc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AWIRE_ANGLE__NAME = eINSTANCE.getaWireAngle_Name();

  }

} //BmodesbmiPackage
