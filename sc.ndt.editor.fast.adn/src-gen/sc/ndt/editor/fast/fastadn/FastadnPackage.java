/**
 */
package sc.ndt.editor.fast.fastadn;

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
 * @see sc.ndt.editor.fast.fastadn.FastadnFactory
 * @model kind="package"
 * @generated
 */
public interface FastadnPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fastadn";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/fast/Fastadn";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fastadn";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FastadnPackage eINSTANCE = sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl <em>Model Fastadn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getModelFastadn()
   * @generated
   */
  int MODEL_FASTADN = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__HEAD = 0;

  /**
   * The feature id for the '<em><b>SI Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__SI_UNITS = 1;

  /**
   * The feature id for the '<em><b>Stall Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__STALL_MOD = 2;

  /**
   * The feature id for the '<em><b>Use Cm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__USE_CM = 3;

  /**
   * The feature id for the '<em><b>Inf Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__INF_MODEL = 4;

  /**
   * The feature id for the '<em><b>Ind Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__IND_MODEL = 5;

  /**
   * The feature id for the '<em><b>Atoler</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__ATOLER = 6;

  /**
   * The feature id for the '<em><b>TL Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__TL_MODEL = 7;

  /**
   * The feature id for the '<em><b>HL Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__HL_MODEL = 8;

  /**
   * The feature id for the '<em><b>Wind File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__WIND_FILE = 9;

  /**
   * The feature id for the '<em><b>HH</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__HH = 10;

  /**
   * The feature id for the '<em><b>Twr Shad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__TWR_SHAD = 11;

  /**
   * The feature id for the '<em><b>Shad HWid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__SHAD_HWID = 12;

  /**
   * The feature id for the '<em><b>TShad Ref Pt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__TSHAD_REF_PT = 13;

  /**
   * The feature id for the '<em><b>Rho</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__RHO = 14;

  /**
   * The feature id for the '<em><b>Kin Visc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__KIN_VISC = 15;

  /**
   * The feature id for the '<em><b>DT Aero</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__DT_AERO = 16;

  /**
   * The feature id for the '<em><b>Num Foil</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__NUM_FOIL = 17;

  /**
   * The feature id for the '<em><b>Foil Nm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__FOIL_NM = 18;

  /**
   * The feature id for the '<em><b>Bld Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__BLD_NODES = 19;

  /**
   * The feature id for the '<em><b>Air Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN__AIR_STAT = 20;

  /**
   * The number of structural features of the '<em>Model Fastadn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTADN_FEATURE_COUNT = 21;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.HeaderImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getHeader()
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
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.sUnitsImpl <em>sUnits</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.sUnitsImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsUnits()
   * @generated
   */
  int SUNITS = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUNITS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUNITS__NAME = 1;

  /**
   * The number of structural features of the '<em>sUnits</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUNITS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.sStallModImpl <em>sStall Mod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.sStallModImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsStallMod()
   * @generated
   */
  int SSTALL_MOD = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSTALL_MOD__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSTALL_MOD__NAME = 1;

  /**
   * The number of structural features of the '<em>sStall Mod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSTALL_MOD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.sUseCmImpl <em>sUse Cm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.sUseCmImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsUseCm()
   * @generated
   */
  int SUSE_CM = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSE_CM__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSE_CM__NAME = 1;

  /**
   * The number of structural features of the '<em>sUse Cm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSE_CM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.sInfModelImpl <em>sInf Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.sInfModelImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsInfModel()
   * @generated
   */
  int SINF_MODEL = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINF_MODEL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINF_MODEL__NAME = 1;

  /**
   * The number of structural features of the '<em>sInf Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINF_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.sIndModelImpl <em>sInd Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.sIndModelImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsIndModel()
   * @generated
   */
  int SIND_MODEL = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIND_MODEL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIND_MODEL__NAME = 1;

  /**
   * The number of structural features of the '<em>sInd Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIND_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.nAtolerImpl <em>nAtoler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.nAtolerImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnAtoler()
   * @generated
   */
  int NATOLER = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATOLER__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATOLER__NAME = 1;

  /**
   * The number of structural features of the '<em>nAtoler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATOLER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.sTLModelImpl <em>sTL Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.sTLModelImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsTLModel()
   * @generated
   */
  int STL_MODEL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STL_MODEL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STL_MODEL__NAME = 1;

  /**
   * The number of structural features of the '<em>sTL Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STL_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.sHLModelImpl <em>sHL Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.sHLModelImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsHLModel()
   * @generated
   */
  int SHL_MODEL = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHL_MODEL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHL_MODEL__NAME = 1;

  /**
   * The number of structural features of the '<em>sHL Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHL_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.fWindFileImpl <em>fWind File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.fWindFileImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getfWindFile()
   * @generated
   */
  int FWIND_FILE = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FWIND_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FWIND_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>fWind File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FWIND_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.nHHImpl <em>nHH</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.nHHImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnHH()
   * @generated
   */
  int NHH = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHH__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHH__NAME = 1;

  /**
   * The number of structural features of the '<em>nHH</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.nTwrShadImpl <em>nTwr Shad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.nTwrShadImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnTwrShad()
   * @generated
   */
  int NTWR_SHAD = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SHAD__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SHAD__NAME = 1;

  /**
   * The number of structural features of the '<em>nTwr Shad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SHAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.bTwrPotImpl <em>bTwr Pot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.bTwrPotImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getbTwrPot()
   * @generated
   */
  int BTWR_POT = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTWR_POT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTWR_POT__NAME = 1;

  /**
   * The number of structural features of the '<em>bTwr Pot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTWR_POT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.bTwrShdImpl <em>bTwr Shd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.bTwrShdImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getbTwrShd()
   * @generated
   */
  int BTWR_SHD = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTWR_SHD__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTWR_SHD__NAME = 1;

  /**
   * The number of structural features of the '<em>bTwr Shd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BTWR_SHD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.fTwrFileImpl <em>fTwr File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.fTwrFileImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getfTwrFile()
   * @generated
   */
  int FTWR_FILE = 15;

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
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.bCalcTwrAeroImpl <em>bCalc Twr Aero</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.bCalcTwrAeroImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getbCalcTwrAero()
   * @generated
   */
  int BCALC_TWR_AERO = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_TWR_AERO__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_TWR_AERO__NAME = 1;

  /**
   * The number of structural features of the '<em>bCalc Twr Aero</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_TWR_AERO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.nShadHWidImpl <em>nShad HWid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.nShadHWidImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnShadHWid()
   * @generated
   */
  int NSHAD_HWID = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHAD_HWID__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHAD_HWID__NAME = 1;

  /**
   * The number of structural features of the '<em>nShad HWid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSHAD_HWID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.nTShadRefPtImpl <em>nT Shad Ref Pt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.nTShadRefPtImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnTShadRefPt()
   * @generated
   */
  int NT_SHAD_REF_PT = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_SHAD_REF_PT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_SHAD_REF_PT__NAME = 1;

  /**
   * The number of structural features of the '<em>nT Shad Ref Pt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NT_SHAD_REF_PT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.nRhoImpl <em>nRho</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.nRhoImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnRho()
   * @generated
   */
  int NRHO = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRHO__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRHO__NAME = 1;

  /**
   * The number of structural features of the '<em>nRho</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRHO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.nKinViscImpl <em>nKin Visc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.nKinViscImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnKinVisc()
   * @generated
   */
  int NKIN_VISC = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NKIN_VISC__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NKIN_VISC__NAME = 1;

  /**
   * The number of structural features of the '<em>nKin Visc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NKIN_VISC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.nDTAeroImpl <em>nDT Aero</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.nDTAeroImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnDTAero()
   * @generated
   */
  int NDT_AERO = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_AERO__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_AERO__NAME = 1;

  /**
   * The number of structural features of the '<em>nDT Aero</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDT_AERO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.iNumFoilImpl <em>iNum Foil</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.iNumFoilImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getiNumFoil()
   * @generated
   */
  int INUM_FOIL = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_FOIL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_FOIL__NAME = 1;

  /**
   * The number of structural features of the '<em>iNum Foil</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_FOIL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.aAirfoilListImpl <em>aAirfoil List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.aAirfoilListImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getaAirfoilList()
   * @generated
   */
  int AAIRFOIL_LIST = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIRFOIL_LIST__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIRFOIL_LIST__NAME = 1;

  /**
   * The number of structural features of the '<em>aAirfoil List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIRFOIL_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.iBldNodesImpl <em>iBld Nodes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.iBldNodesImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getiBldNodes()
   * @generated
   */
  int IBLD_NODES = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IBLD_NODES__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IBLD_NODES__NAME = 1;

  /**
   * The number of structural features of the '<em>iBld Nodes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IBLD_NODES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastadn.impl.aAirStatImpl <em>aAir Stat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastadn.impl.aAirStatImpl
   * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getaAirStat()
   * @generated
   */
  int AAIR_STAT = 25;

  /**
   * The feature id for the '<em><b>Rnodes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__RNODES = 0;

  /**
   * The feature id for the '<em><b>Aerotwst</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__AEROTWST = 1;

  /**
   * The feature id for the '<em><b>Drnodes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__DRNODES = 2;

  /**
   * The feature id for the '<em><b>Chord</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__CHORD = 3;

  /**
   * The feature id for the '<em><b>Nfoil</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__NFOIL = 4;

  /**
   * The feature id for the '<em><b>Prnelm</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__PRNELM = 5;

  /**
   * The number of structural features of the '<em>aAir Stat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT_FEATURE_COUNT = 6;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.ModelFastadn <em>Model Fastadn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Fastadn</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn
   * @generated
   */
  EClass getModelFastadn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getHead()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_Head();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getSIUnits <em>SI Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SI Units</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getSIUnits()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_SIUnits();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getStallMod <em>Stall Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stall Mod</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getStallMod()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_StallMod();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getUseCm <em>Use Cm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Use Cm</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getUseCm()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_UseCm();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getInfModel <em>Inf Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inf Model</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getInfModel()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_InfModel();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getIndModel <em>Ind Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ind Model</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getIndModel()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_IndModel();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getAtoler <em>Atoler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atoler</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getAtoler()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_Atoler();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTLModel <em>TL Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TL Model</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getTLModel()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_TLModel();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHLModel <em>HL Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HL Model</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getHLModel()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_HLModel();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getWindFile <em>Wind File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wind File</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getWindFile()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_WindFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHH <em>HH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HH</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getHH()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_HH();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTwrShad <em>Twr Shad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr Shad</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getTwrShad()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_TwrShad();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getShadHWid <em>Shad HWid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shad HWid</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getShadHWid()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_ShadHWid();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTShadRefPt <em>TShad Ref Pt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>TShad Ref Pt</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getTShadRefPt()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_TShadRefPt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getRho <em>Rho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rho</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getRho()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_Rho();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getKinVisc <em>Kin Visc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kin Visc</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getKinVisc()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_KinVisc();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getDTAero <em>DT Aero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>DT Aero</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getDTAero()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_DTAero();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getNumFoil <em>Num Foil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Foil</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getNumFoil()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_NumFoil();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getFoilNm <em>Foil Nm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foil Nm</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getFoilNm()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_FoilNm();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getBldNodes <em>Bld Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Nodes</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getBldNodes()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_BldNodes();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getAirStat <em>Air Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Air Stat</em>'.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn#getAirStat()
   * @see #getModelFastadn()
   * @generated
   */
  EReference getModelFastadn_AirStat();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.fast.fastadn.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.Header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.Header#getName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.sUnits <em>sUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sUnits</em>'.
   * @see sc.ndt.editor.fast.fastadn.sUnits
   * @generated
   */
  EClass getsUnits();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sUnits#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.sUnits#getValue()
   * @see #getsUnits()
   * @generated
   */
  EAttribute getsUnits_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sUnits#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.sUnits#getName()
   * @see #getsUnits()
   * @generated
   */
  EAttribute getsUnits_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.sStallMod <em>sStall Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sStall Mod</em>'.
   * @see sc.ndt.editor.fast.fastadn.sStallMod
   * @generated
   */
  EClass getsStallMod();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sStallMod#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.sStallMod#getValue()
   * @see #getsStallMod()
   * @generated
   */
  EAttribute getsStallMod_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sStallMod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.sStallMod#getName()
   * @see #getsStallMod()
   * @generated
   */
  EAttribute getsStallMod_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.sUseCm <em>sUse Cm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sUse Cm</em>'.
   * @see sc.ndt.editor.fast.fastadn.sUseCm
   * @generated
   */
  EClass getsUseCm();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sUseCm#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.sUseCm#getValue()
   * @see #getsUseCm()
   * @generated
   */
  EAttribute getsUseCm_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sUseCm#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.sUseCm#getName()
   * @see #getsUseCm()
   * @generated
   */
  EAttribute getsUseCm_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.sInfModel <em>sInf Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sInf Model</em>'.
   * @see sc.ndt.editor.fast.fastadn.sInfModel
   * @generated
   */
  EClass getsInfModel();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sInfModel#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.sInfModel#getValue()
   * @see #getsInfModel()
   * @generated
   */
  EAttribute getsInfModel_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sInfModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.sInfModel#getName()
   * @see #getsInfModel()
   * @generated
   */
  EAttribute getsInfModel_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.sIndModel <em>sInd Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sInd Model</em>'.
   * @see sc.ndt.editor.fast.fastadn.sIndModel
   * @generated
   */
  EClass getsIndModel();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sIndModel#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.sIndModel#getValue()
   * @see #getsIndModel()
   * @generated
   */
  EAttribute getsIndModel_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sIndModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.sIndModel#getName()
   * @see #getsIndModel()
   * @generated
   */
  EAttribute getsIndModel_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.nAtoler <em>nAtoler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nAtoler</em>'.
   * @see sc.ndt.editor.fast.fastadn.nAtoler
   * @generated
   */
  EClass getnAtoler();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nAtoler#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.nAtoler#getValue()
   * @see #getnAtoler()
   * @generated
   */
  EAttribute getnAtoler_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nAtoler#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.nAtoler#getName()
   * @see #getnAtoler()
   * @generated
   */
  EAttribute getnAtoler_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.sTLModel <em>sTL Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sTL Model</em>'.
   * @see sc.ndt.editor.fast.fastadn.sTLModel
   * @generated
   */
  EClass getsTLModel();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sTLModel#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.sTLModel#getValue()
   * @see #getsTLModel()
   * @generated
   */
  EAttribute getsTLModel_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sTLModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.sTLModel#getName()
   * @see #getsTLModel()
   * @generated
   */
  EAttribute getsTLModel_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.sHLModel <em>sHL Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sHL Model</em>'.
   * @see sc.ndt.editor.fast.fastadn.sHLModel
   * @generated
   */
  EClass getsHLModel();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sHLModel#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.sHLModel#getValue()
   * @see #getsHLModel()
   * @generated
   */
  EAttribute getsHLModel_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.sHLModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.sHLModel#getName()
   * @see #getsHLModel()
   * @generated
   */
  EAttribute getsHLModel_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.fWindFile <em>fWind File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fWind File</em>'.
   * @see sc.ndt.editor.fast.fastadn.fWindFile
   * @generated
   */
  EClass getfWindFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.fWindFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.fWindFile#getValue()
   * @see #getfWindFile()
   * @generated
   */
  EAttribute getfWindFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.fWindFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.fWindFile#getName()
   * @see #getfWindFile()
   * @generated
   */
  EAttribute getfWindFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.nHH <em>nHH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHH</em>'.
   * @see sc.ndt.editor.fast.fastadn.nHH
   * @generated
   */
  EClass getnHH();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nHH#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.nHH#getValue()
   * @see #getnHH()
   * @generated
   */
  EAttribute getnHH_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nHH#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.nHH#getName()
   * @see #getnHH()
   * @generated
   */
  EAttribute getnHH_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.nTwrShad <em>nTwr Shad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTwr Shad</em>'.
   * @see sc.ndt.editor.fast.fastadn.nTwrShad
   * @generated
   */
  EClass getnTwrShad();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nTwrShad#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.nTwrShad#getValue()
   * @see #getnTwrShad()
   * @generated
   */
  EAttribute getnTwrShad_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nTwrShad#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.nTwrShad#getName()
   * @see #getnTwrShad()
   * @generated
   */
  EAttribute getnTwrShad_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.bTwrPot <em>bTwr Pot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTwr Pot</em>'.
   * @see sc.ndt.editor.fast.fastadn.bTwrPot
   * @generated
   */
  EClass getbTwrPot();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.bTwrPot#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.bTwrPot#isValue()
   * @see #getbTwrPot()
   * @generated
   */
  EAttribute getbTwrPot_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.bTwrPot#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.bTwrPot#getName()
   * @see #getbTwrPot()
   * @generated
   */
  EAttribute getbTwrPot_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.bTwrShd <em>bTwr Shd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bTwr Shd</em>'.
   * @see sc.ndt.editor.fast.fastadn.bTwrShd
   * @generated
   */
  EClass getbTwrShd();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.bTwrShd#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.bTwrShd#isValue()
   * @see #getbTwrShd()
   * @generated
   */
  EAttribute getbTwrShd_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.bTwrShd#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.bTwrShd#getName()
   * @see #getbTwrShd()
   * @generated
   */
  EAttribute getbTwrShd_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.fTwrFile <em>fTwr File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fTwr File</em>'.
   * @see sc.ndt.editor.fast.fastadn.fTwrFile
   * @generated
   */
  EClass getfTwrFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.fTwrFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.fTwrFile#getValue()
   * @see #getfTwrFile()
   * @generated
   */
  EAttribute getfTwrFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.fTwrFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.fTwrFile#getName()
   * @see #getfTwrFile()
   * @generated
   */
  EAttribute getfTwrFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.bCalcTwrAero <em>bCalc Twr Aero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bCalc Twr Aero</em>'.
   * @see sc.ndt.editor.fast.fastadn.bCalcTwrAero
   * @generated
   */
  EClass getbCalcTwrAero();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.bCalcTwrAero#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.bCalcTwrAero#isValue()
   * @see #getbCalcTwrAero()
   * @generated
   */
  EAttribute getbCalcTwrAero_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.bCalcTwrAero#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.bCalcTwrAero#getName()
   * @see #getbCalcTwrAero()
   * @generated
   */
  EAttribute getbCalcTwrAero_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.nShadHWid <em>nShad HWid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nShad HWid</em>'.
   * @see sc.ndt.editor.fast.fastadn.nShadHWid
   * @generated
   */
  EClass getnShadHWid();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nShadHWid#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.nShadHWid#getValue()
   * @see #getnShadHWid()
   * @generated
   */
  EAttribute getnShadHWid_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nShadHWid#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.nShadHWid#getName()
   * @see #getnShadHWid()
   * @generated
   */
  EAttribute getnShadHWid_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.nTShadRefPt <em>nT Shad Ref Pt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nT Shad Ref Pt</em>'.
   * @see sc.ndt.editor.fast.fastadn.nTShadRefPt
   * @generated
   */
  EClass getnTShadRefPt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nTShadRefPt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.nTShadRefPt#getValue()
   * @see #getnTShadRefPt()
   * @generated
   */
  EAttribute getnTShadRefPt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nTShadRefPt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.nTShadRefPt#getName()
   * @see #getnTShadRefPt()
   * @generated
   */
  EAttribute getnTShadRefPt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.nRho <em>nRho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRho</em>'.
   * @see sc.ndt.editor.fast.fastadn.nRho
   * @generated
   */
  EClass getnRho();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nRho#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.nRho#getValue()
   * @see #getnRho()
   * @generated
   */
  EAttribute getnRho_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nRho#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.nRho#getName()
   * @see #getnRho()
   * @generated
   */
  EAttribute getnRho_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.nKinVisc <em>nKin Visc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nKin Visc</em>'.
   * @see sc.ndt.editor.fast.fastadn.nKinVisc
   * @generated
   */
  EClass getnKinVisc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nKinVisc#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.nKinVisc#getValue()
   * @see #getnKinVisc()
   * @generated
   */
  EAttribute getnKinVisc_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nKinVisc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.nKinVisc#getName()
   * @see #getnKinVisc()
   * @generated
   */
  EAttribute getnKinVisc_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.nDTAero <em>nDT Aero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nDT Aero</em>'.
   * @see sc.ndt.editor.fast.fastadn.nDTAero
   * @generated
   */
  EClass getnDTAero();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nDTAero#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.nDTAero#getValue()
   * @see #getnDTAero()
   * @generated
   */
  EAttribute getnDTAero_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.nDTAero#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.nDTAero#getName()
   * @see #getnDTAero()
   * @generated
   */
  EAttribute getnDTAero_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.iNumFoil <em>iNum Foil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iNum Foil</em>'.
   * @see sc.ndt.editor.fast.fastadn.iNumFoil
   * @generated
   */
  EClass getiNumFoil();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.iNumFoil#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.iNumFoil#getValue()
   * @see #getiNumFoil()
   * @generated
   */
  EAttribute getiNumFoil_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.iNumFoil#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.iNumFoil#getName()
   * @see #getiNumFoil()
   * @generated
   */
  EAttribute getiNumFoil_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.aAirfoilList <em>aAirfoil List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aAirfoil List</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirfoilList
   * @generated
   */
  EClass getaAirfoilList();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastadn.aAirfoilList#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirfoilList#getValue()
   * @see #getaAirfoilList()
   * @generated
   */
  EAttribute getaAirfoilList_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.aAirfoilList#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirfoilList#getName()
   * @see #getaAirfoilList()
   * @generated
   */
  EAttribute getaAirfoilList_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.iBldNodes <em>iBld Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iBld Nodes</em>'.
   * @see sc.ndt.editor.fast.fastadn.iBldNodes
   * @generated
   */
  EClass getiBldNodes();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.iBldNodes#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastadn.iBldNodes#getValue()
   * @see #getiBldNodes()
   * @generated
   */
  EAttribute getiBldNodes_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastadn.iBldNodes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastadn.iBldNodes#getName()
   * @see #getiBldNodes()
   * @generated
   */
  EAttribute getiBldNodes_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastadn.aAirStat <em>aAir Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aAir Stat</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirStat
   * @generated
   */
  EClass getaAirStat();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastadn.aAirStat#getRnodes <em>Rnodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rnodes</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirStat#getRnodes()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_Rnodes();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastadn.aAirStat#getAerotwst <em>Aerotwst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Aerotwst</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirStat#getAerotwst()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_Aerotwst();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastadn.aAirStat#getDrnodes <em>Drnodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Drnodes</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirStat#getDrnodes()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_Drnodes();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastadn.aAirStat#getChord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Chord</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirStat#getChord()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_Chord();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastadn.aAirStat#getNfoil <em>Nfoil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nfoil</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirStat#getNfoil()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_Nfoil();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastadn.aAirStat#getPrnelm <em>Prnelm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Prnelm</em>'.
   * @see sc.ndt.editor.fast.fastadn.aAirStat#getPrnelm()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_Prnelm();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FastadnFactory getFastadnFactory();

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
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl <em>Model Fastadn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.ModelFastadnImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getModelFastadn()
     * @generated
     */
    EClass MODEL_FASTADN = eINSTANCE.getModelFastadn();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__HEAD = eINSTANCE.getModelFastadn_Head();

    /**
     * The meta object literal for the '<em><b>SI Units</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__SI_UNITS = eINSTANCE.getModelFastadn_SIUnits();

    /**
     * The meta object literal for the '<em><b>Stall Mod</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__STALL_MOD = eINSTANCE.getModelFastadn_StallMod();

    /**
     * The meta object literal for the '<em><b>Use Cm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__USE_CM = eINSTANCE.getModelFastadn_UseCm();

    /**
     * The meta object literal for the '<em><b>Inf Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__INF_MODEL = eINSTANCE.getModelFastadn_InfModel();

    /**
     * The meta object literal for the '<em><b>Ind Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__IND_MODEL = eINSTANCE.getModelFastadn_IndModel();

    /**
     * The meta object literal for the '<em><b>Atoler</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__ATOLER = eINSTANCE.getModelFastadn_Atoler();

    /**
     * The meta object literal for the '<em><b>TL Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__TL_MODEL = eINSTANCE.getModelFastadn_TLModel();

    /**
     * The meta object literal for the '<em><b>HL Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__HL_MODEL = eINSTANCE.getModelFastadn_HLModel();

    /**
     * The meta object literal for the '<em><b>Wind File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__WIND_FILE = eINSTANCE.getModelFastadn_WindFile();

    /**
     * The meta object literal for the '<em><b>HH</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__HH = eINSTANCE.getModelFastadn_HH();

    /**
     * The meta object literal for the '<em><b>Twr Shad</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__TWR_SHAD = eINSTANCE.getModelFastadn_TwrShad();

    /**
     * The meta object literal for the '<em><b>Shad HWid</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__SHAD_HWID = eINSTANCE.getModelFastadn_ShadHWid();

    /**
     * The meta object literal for the '<em><b>TShad Ref Pt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__TSHAD_REF_PT = eINSTANCE.getModelFastadn_TShadRefPt();

    /**
     * The meta object literal for the '<em><b>Rho</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__RHO = eINSTANCE.getModelFastadn_Rho();

    /**
     * The meta object literal for the '<em><b>Kin Visc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__KIN_VISC = eINSTANCE.getModelFastadn_KinVisc();

    /**
     * The meta object literal for the '<em><b>DT Aero</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__DT_AERO = eINSTANCE.getModelFastadn_DTAero();

    /**
     * The meta object literal for the '<em><b>Num Foil</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__NUM_FOIL = eINSTANCE.getModelFastadn_NumFoil();

    /**
     * The meta object literal for the '<em><b>Foil Nm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__FOIL_NM = eINSTANCE.getModelFastadn_FoilNm();

    /**
     * The meta object literal for the '<em><b>Bld Nodes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__BLD_NODES = eINSTANCE.getModelFastadn_BldNodes();

    /**
     * The meta object literal for the '<em><b>Air Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTADN__AIR_STAT = eINSTANCE.getModelFastadn_AirStat();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.HeaderImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getHeader()
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
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.sUnitsImpl <em>sUnits</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.sUnitsImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsUnits()
     * @generated
     */
    EClass SUNITS = eINSTANCE.getsUnits();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUNITS__VALUE = eINSTANCE.getsUnits_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUNITS__NAME = eINSTANCE.getsUnits_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.sStallModImpl <em>sStall Mod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.sStallModImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsStallMod()
     * @generated
     */
    EClass SSTALL_MOD = eINSTANCE.getsStallMod();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SSTALL_MOD__VALUE = eINSTANCE.getsStallMod_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SSTALL_MOD__NAME = eINSTANCE.getsStallMod_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.sUseCmImpl <em>sUse Cm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.sUseCmImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsUseCm()
     * @generated
     */
    EClass SUSE_CM = eINSTANCE.getsUseCm();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUSE_CM__VALUE = eINSTANCE.getsUseCm_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUSE_CM__NAME = eINSTANCE.getsUseCm_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.sInfModelImpl <em>sInf Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.sInfModelImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsInfModel()
     * @generated
     */
    EClass SINF_MODEL = eINSTANCE.getsInfModel();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINF_MODEL__VALUE = eINSTANCE.getsInfModel_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINF_MODEL__NAME = eINSTANCE.getsInfModel_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.sIndModelImpl <em>sInd Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.sIndModelImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsIndModel()
     * @generated
     */
    EClass SIND_MODEL = eINSTANCE.getsIndModel();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIND_MODEL__VALUE = eINSTANCE.getsIndModel_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIND_MODEL__NAME = eINSTANCE.getsIndModel_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.nAtolerImpl <em>nAtoler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.nAtolerImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnAtoler()
     * @generated
     */
    EClass NATOLER = eINSTANCE.getnAtoler();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NATOLER__VALUE = eINSTANCE.getnAtoler_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NATOLER__NAME = eINSTANCE.getnAtoler_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.sTLModelImpl <em>sTL Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.sTLModelImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsTLModel()
     * @generated
     */
    EClass STL_MODEL = eINSTANCE.getsTLModel();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STL_MODEL__VALUE = eINSTANCE.getsTLModel_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STL_MODEL__NAME = eINSTANCE.getsTLModel_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.sHLModelImpl <em>sHL Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.sHLModelImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getsHLModel()
     * @generated
     */
    EClass SHL_MODEL = eINSTANCE.getsHLModel();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHL_MODEL__VALUE = eINSTANCE.getsHLModel_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHL_MODEL__NAME = eINSTANCE.getsHLModel_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.fWindFileImpl <em>fWind File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.fWindFileImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getfWindFile()
     * @generated
     */
    EClass FWIND_FILE = eINSTANCE.getfWindFile();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FWIND_FILE__VALUE = eINSTANCE.getfWindFile_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FWIND_FILE__NAME = eINSTANCE.getfWindFile_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.nHHImpl <em>nHH</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.nHHImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnHH()
     * @generated
     */
    EClass NHH = eINSTANCE.getnHH();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NHH__VALUE = eINSTANCE.getnHH_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NHH__NAME = eINSTANCE.getnHH_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.nTwrShadImpl <em>nTwr Shad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.nTwrShadImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnTwrShad()
     * @generated
     */
    EClass NTWR_SHAD = eINSTANCE.getnTwrShad();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_SHAD__VALUE = eINSTANCE.getnTwrShad_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_SHAD__NAME = eINSTANCE.getnTwrShad_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.bTwrPotImpl <em>bTwr Pot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.bTwrPotImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getbTwrPot()
     * @generated
     */
    EClass BTWR_POT = eINSTANCE.getbTwrPot();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BTWR_POT__VALUE = eINSTANCE.getbTwrPot_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BTWR_POT__NAME = eINSTANCE.getbTwrPot_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.bTwrShdImpl <em>bTwr Shd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.bTwrShdImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getbTwrShd()
     * @generated
     */
    EClass BTWR_SHD = eINSTANCE.getbTwrShd();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BTWR_SHD__VALUE = eINSTANCE.getbTwrShd_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BTWR_SHD__NAME = eINSTANCE.getbTwrShd_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.fTwrFileImpl <em>fTwr File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.fTwrFileImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getfTwrFile()
     * @generated
     */
    EClass FTWR_FILE = eINSTANCE.getfTwrFile();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FTWR_FILE__VALUE = eINSTANCE.getfTwrFile_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FTWR_FILE__NAME = eINSTANCE.getfTwrFile_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.bCalcTwrAeroImpl <em>bCalc Twr Aero</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.bCalcTwrAeroImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getbCalcTwrAero()
     * @generated
     */
    EClass BCALC_TWR_AERO = eINSTANCE.getbCalcTwrAero();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCALC_TWR_AERO__VALUE = eINSTANCE.getbCalcTwrAero_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCALC_TWR_AERO__NAME = eINSTANCE.getbCalcTwrAero_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.nShadHWidImpl <em>nShad HWid</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.nShadHWidImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnShadHWid()
     * @generated
     */
    EClass NSHAD_HWID = eINSTANCE.getnShadHWid();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSHAD_HWID__VALUE = eINSTANCE.getnShadHWid_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSHAD_HWID__NAME = eINSTANCE.getnShadHWid_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.nTShadRefPtImpl <em>nT Shad Ref Pt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.nTShadRefPtImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnTShadRefPt()
     * @generated
     */
    EClass NT_SHAD_REF_PT = eINSTANCE.getnTShadRefPt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NT_SHAD_REF_PT__VALUE = eINSTANCE.getnTShadRefPt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NT_SHAD_REF_PT__NAME = eINSTANCE.getnTShadRefPt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.nRhoImpl <em>nRho</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.nRhoImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnRho()
     * @generated
     */
    EClass NRHO = eINSTANCE.getnRho();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRHO__VALUE = eINSTANCE.getnRho_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRHO__NAME = eINSTANCE.getnRho_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.nKinViscImpl <em>nKin Visc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.nKinViscImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnKinVisc()
     * @generated
     */
    EClass NKIN_VISC = eINSTANCE.getnKinVisc();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NKIN_VISC__VALUE = eINSTANCE.getnKinVisc_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NKIN_VISC__NAME = eINSTANCE.getnKinVisc_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.nDTAeroImpl <em>nDT Aero</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.nDTAeroImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getnDTAero()
     * @generated
     */
    EClass NDT_AERO = eINSTANCE.getnDTAero();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NDT_AERO__VALUE = eINSTANCE.getnDTAero_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NDT_AERO__NAME = eINSTANCE.getnDTAero_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.iNumFoilImpl <em>iNum Foil</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.iNumFoilImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getiNumFoil()
     * @generated
     */
    EClass INUM_FOIL = eINSTANCE.getiNumFoil();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INUM_FOIL__VALUE = eINSTANCE.getiNumFoil_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INUM_FOIL__NAME = eINSTANCE.getiNumFoil_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.aAirfoilListImpl <em>aAirfoil List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.aAirfoilListImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getaAirfoilList()
     * @generated
     */
    EClass AAIRFOIL_LIST = eINSTANCE.getaAirfoilList();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIRFOIL_LIST__VALUE = eINSTANCE.getaAirfoilList_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIRFOIL_LIST__NAME = eINSTANCE.getaAirfoilList_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.iBldNodesImpl <em>iBld Nodes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.iBldNodesImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getiBldNodes()
     * @generated
     */
    EClass IBLD_NODES = eINSTANCE.getiBldNodes();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IBLD_NODES__VALUE = eINSTANCE.getiBldNodes_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IBLD_NODES__NAME = eINSTANCE.getiBldNodes_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastadn.impl.aAirStatImpl <em>aAir Stat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastadn.impl.aAirStatImpl
     * @see sc.ndt.editor.fast.fastadn.impl.FastadnPackageImpl#getaAirStat()
     * @generated
     */
    EClass AAIR_STAT = eINSTANCE.getaAirStat();

    /**
     * The meta object literal for the '<em><b>Rnodes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__RNODES = eINSTANCE.getaAirStat_Rnodes();

    /**
     * The meta object literal for the '<em><b>Aerotwst</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__AEROTWST = eINSTANCE.getaAirStat_Aerotwst();

    /**
     * The meta object literal for the '<em><b>Drnodes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__DRNODES = eINSTANCE.getaAirStat_Drnodes();

    /**
     * The meta object literal for the '<em><b>Chord</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__CHORD = eINSTANCE.getaAirStat_Chord();

    /**
     * The meta object literal for the '<em><b>Nfoil</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__NFOIL = eINSTANCE.getaAirStat_Nfoil();

    /**
     * The meta object literal for the '<em><b>Prnelm</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__PRNELM = eINSTANCE.getaAirStat_Prnelm();

  }

} //FastadnPackage
