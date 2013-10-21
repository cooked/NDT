/**
 */
package sc.ndt.editor.turbsimtbs;

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
 * @see sc.ndt.editor.turbsimtbs.TurbsimtbsFactory
 * @model kind="package"
 * @generated
 */
public interface TurbsimtbsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "turbsimtbs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/turbsim/Turbsimtbs";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "turbsimtbs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TurbsimtbsPackage eINSTANCE = sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl <em>Model Turbsimtbs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getModelTurbsimtbs()
   * @generated
   */
  int MODEL_TURBSIMTBS = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__HEAD = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__SECTIONS = 1;

  /**
   * The feature id for the '<em><b>Rand Seed1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__RAND_SEED1 = 2;

  /**
   * The feature id for the '<em><b>Rand Seed2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__RAND_SEED2 = 3;

  /**
   * The feature id for the '<em><b>Wr BHHTP</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WR_BHHTP = 4;

  /**
   * The feature id for the '<em><b>Wr FHHTP</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WR_FHHTP = 5;

  /**
   * The feature id for the '<em><b>Wr ADHH</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WR_ADHH = 6;

  /**
   * The feature id for the '<em><b>Wr ADFF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WR_ADFF = 7;

  /**
   * The feature id for the '<em><b>Wr BLFF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WR_BLFF = 8;

  /**
   * The feature id for the '<em><b>Wr ADTWR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WR_ADTWR = 9;

  /**
   * The feature id for the '<em><b>Wr FMTFF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WR_FMTFF = 10;

  /**
   * The feature id for the '<em><b>Wr ACT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WR_ACT = 11;

  /**
   * The feature id for the '<em><b>Clockwise</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__CLOCKWISE = 12;

  /**
   * The feature id for the '<em><b>Scale IEC</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__SCALE_IEC = 13;

  /**
   * The feature id for the '<em><b>Num Grid Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__NUM_GRID_Z = 14;

  /**
   * The feature id for the '<em><b>Num Grid Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__NUM_GRID_Y = 15;

  /**
   * The feature id for the '<em><b>Time Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__TIME_STEP = 16;

  /**
   * The feature id for the '<em><b>Analysis Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__ANALYSIS_TIME = 17;

  /**
   * The feature id for the '<em><b>Usable Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__USABLE_TIME = 18;

  /**
   * The feature id for the '<em><b>Hub Ht</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__HUB_HT = 19;

  /**
   * The feature id for the '<em><b>Grid Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__GRID_HEIGHT = 20;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__GRID_WIDTH = 21;

  /**
   * The feature id for the '<em><b>VFlow Ang</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__VFLOW_ANG = 22;

  /**
   * The feature id for the '<em><b>HFlow Ang</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__HFLOW_ANG = 23;

  /**
   * The feature id for the '<em><b>Turb Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__TURB_MODEL = 24;

  /**
   * The feature id for the '<em><b>IE Cstandard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__IE_CSTANDARD = 25;

  /**
   * The feature id for the '<em><b>IE Cturbc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__IE_CTURBC = 26;

  /**
   * The feature id for the '<em><b>IEC Wind Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__IEC_WIND_TYPE = 27;

  /**
   * The feature id for the '<em><b>ET Mc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__ET_MC = 28;

  /**
   * The feature id for the '<em><b>Wind Profile Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__WIND_PROFILE_TYPE = 29;

  /**
   * The feature id for the '<em><b>Ref Ht</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__REF_HT = 30;

  /**
   * The feature id for the '<em><b>Uref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__UREF = 31;

  /**
   * The feature id for the '<em><b>ZJet Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__ZJET_MAX = 32;

  /**
   * The feature id for the '<em><b>PL Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__PL_EXP = 33;

  /**
   * The feature id for the '<em><b>Z0</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__Z0 = 34;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__LOCATION = 35;

  /**
   * The feature id for the '<em><b>RICH NO</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__RICH_NO = 36;

  /**
   * The feature id for the '<em><b>UStar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__USTAR = 37;

  /**
   * The feature id for the '<em><b>ZI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__ZI = 38;

  /**
   * The feature id for the '<em><b>PC UW</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__PC_UW = 39;

  /**
   * The feature id for the '<em><b>PC UV</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__PC_UV = 40;

  /**
   * The feature id for the '<em><b>PC VW</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__PC_VW = 41;

  /**
   * The feature id for the '<em><b>Inc Dec1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__INC_DEC1 = 42;

  /**
   * The feature id for the '<em><b>Inc Dec2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__INC_DEC2 = 43;

  /**
   * The feature id for the '<em><b>Inc Dec3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__INC_DEC3 = 44;

  /**
   * The feature id for the '<em><b>Coh Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__COH_EXP = 45;

  /**
   * The feature id for the '<em><b>CT Event Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__CT_EVENT_PATH = 46;

  /**
   * The feature id for the '<em><b>CT Event File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__CT_EVENT_FILE = 47;

  /**
   * The feature id for the '<em><b>Randomize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__RANDOMIZE = 48;

  /**
   * The feature id for the '<em><b>Dist Scl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__DIST_SCL = 49;

  /**
   * The feature id for the '<em><b>CT Ly</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__CT_LY = 50;

  /**
   * The feature id for the '<em><b>CT Lz</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__CT_LZ = 51;

  /**
   * The feature id for the '<em><b>CT Start Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS__CT_START_TIME = 52;

  /**
   * The number of structural features of the '<em>Model Turbsimtbs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TURBSIMTBS_FEATURE_COUNT = 53;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.HeaderImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 1;

  /**
   * The feature id for the '<em><b>Rows</b></em>' attribute.
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
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.SectionImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getSection()
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
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nRandSeed1Impl <em>nRand Seed1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nRandSeed1Impl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnRandSeed1()
   * @generated
   */
  int NRAND_SEED1 = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRAND_SEED1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRAND_SEED1__NAME = 1;

  /**
   * The number of structural features of the '<em>nRand Seed1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRAND_SEED1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nRandSeed2Impl <em>nRand Seed2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nRandSeed2Impl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnRandSeed2()
   * @generated
   */
  int NRAND_SEED2 = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRAND_SEED2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRAND_SEED2__NAME = 1;

  /**
   * The number of structural features of the '<em>nRand Seed2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRAND_SEED2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrBHHTPImpl <em>bWr BHHTP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bWrBHHTPImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrBHHTP()
   * @generated
   */
  int BWR_BHHTP = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_BHHTP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_BHHTP__NAME = 1;

  /**
   * The number of structural features of the '<em>bWr BHHTP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_BHHTP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrFHHTPImpl <em>bWr FHHTP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bWrFHHTPImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrFHHTP()
   * @generated
   */
  int BWR_FHHTP = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_FHHTP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_FHHTP__NAME = 1;

  /**
   * The number of structural features of the '<em>bWr FHHTP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_FHHTP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrADHHImpl <em>bWr ADHH</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bWrADHHImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrADHH()
   * @generated
   */
  int BWR_ADHH = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADHH__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADHH__NAME = 1;

  /**
   * The number of structural features of the '<em>bWr ADHH</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADHH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrADFFImpl <em>bWr ADFF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bWrADFFImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrADFF()
   * @generated
   */
  int BWR_ADFF = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADFF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADFF__NAME = 1;

  /**
   * The number of structural features of the '<em>bWr ADFF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADFF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrBLFFImpl <em>bWr BLFF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bWrBLFFImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrBLFF()
   * @generated
   */
  int BWR_BLFF = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_BLFF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_BLFF__NAME = 1;

  /**
   * The number of structural features of the '<em>bWr BLFF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_BLFF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrADTWRImpl <em>bWr ADTWR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bWrADTWRImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrADTWR()
   * @generated
   */
  int BWR_ADTWR = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADTWR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADTWR__NAME = 1;

  /**
   * The number of structural features of the '<em>bWr ADTWR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ADTWR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrFMTFFImpl <em>bWr FMTFF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bWrFMTFFImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrFMTFF()
   * @generated
   */
  int BWR_FMTFF = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_FMTFF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_FMTFF__NAME = 1;

  /**
   * The number of structural features of the '<em>bWr FMTFF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_FMTFF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrACTImpl <em>bWr ACT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bWrACTImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrACT()
   * @generated
   */
  int BWR_ACT = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ACT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ACT__NAME = 1;

  /**
   * The number of structural features of the '<em>bWr ACT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BWR_ACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bClockwiseImpl <em>bClockwise</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bClockwiseImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbClockwise()
   * @generated
   */
  int BCLOCKWISE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCLOCKWISE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCLOCKWISE__NAME = 1;

  /**
   * The number of structural features of the '<em>bClockwise</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCLOCKWISE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.iScaleIECImpl <em>iScale IEC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.iScaleIECImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getiScaleIEC()
   * @generated
   */
  int ISCALE_IEC = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISCALE_IEC__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISCALE_IEC__NAME = 1;

  /**
   * The number of structural features of the '<em>iScale IEC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISCALE_IEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.iNumGrid_ZImpl <em>iNum Grid Z</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.iNumGrid_ZImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getiNumGrid_Z()
   * @generated
   */
  int INUM_GRID_Z = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_GRID_Z__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_GRID_Z__NAME = 1;

  /**
   * The number of structural features of the '<em>iNum Grid Z</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_GRID_Z_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.iNumGrid_YImpl <em>iNum Grid Y</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.iNumGrid_YImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getiNumGrid_Y()
   * @generated
   */
  int INUM_GRID_Y = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_GRID_Y__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_GRID_Y__NAME = 1;

  /**
   * The number of structural features of the '<em>iNum Grid Y</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INUM_GRID_Y_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nTimeStepImpl <em>nTime Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nTimeStepImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnTimeStep()
   * @generated
   */
  int NTIME_STEP = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIME_STEP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIME_STEP__NAME = 1;

  /**
   * The number of structural features of the '<em>nTime Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTIME_STEP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nAnalysisTimeImpl <em>nAnalysis Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nAnalysisTimeImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnAnalysisTime()
   * @generated
   */
  int NANALYSIS_TIME = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NANALYSIS_TIME__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NANALYSIS_TIME__NAME = 1;

  /**
   * The number of structural features of the '<em>nAnalysis Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NANALYSIS_TIME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nUsableTimeImpl <em>nUsable Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nUsableTimeImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnUsableTime()
   * @generated
   */
  int NUSABLE_TIME = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUSABLE_TIME__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUSABLE_TIME__NAME = 1;

  /**
   * The number of structural features of the '<em>nUsable Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUSABLE_TIME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nHubHtImpl <em>nHub Ht</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nHubHtImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnHubHt()
   * @generated
   */
  int NHUB_HT = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_HT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_HT__NAME = 1;

  /**
   * The number of structural features of the '<em>nHub Ht</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_HT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nGridHeightImpl <em>nGrid Height</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nGridHeightImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnGridHeight()
   * @generated
   */
  int NGRID_HEIGHT = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRID_HEIGHT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRID_HEIGHT__NAME = 1;

  /**
   * The number of structural features of the '<em>nGrid Height</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRID_HEIGHT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nGridWidthImpl <em>nGrid Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nGridWidthImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnGridWidth()
   * @generated
   */
  int NGRID_WIDTH = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRID_WIDTH__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRID_WIDTH__NAME = 1;

  /**
   * The number of structural features of the '<em>nGrid Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NGRID_WIDTH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nVFlowAngImpl <em>nV Flow Ang</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nVFlowAngImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnVFlowAng()
   * @generated
   */
  int NV_FLOW_ANG = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NV_FLOW_ANG__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NV_FLOW_ANG__NAME = 1;

  /**
   * The number of structural features of the '<em>nV Flow Ang</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NV_FLOW_ANG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nHFlowAngImpl <em>nH Flow Ang</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nHFlowAngImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnHFlowAng()
   * @generated
   */
  int NH_FLOW_ANG = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NH_FLOW_ANG__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NH_FLOW_ANG__NAME = 1;

  /**
   * The number of structural features of the '<em>nH Flow Ang</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NH_FLOW_ANG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.sTurbModelImpl <em>sTurb Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.sTurbModelImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsTurbModel()
   * @generated
   */
  int STURB_MODEL = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STURB_MODEL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STURB_MODEL__NAME = 1;

  /**
   * The number of structural features of the '<em>sTurb Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STURB_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.sIECstandardImpl <em>sIE Cstandard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.sIECstandardImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsIECstandard()
   * @generated
   */
  int SIE_CSTANDARD = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIE_CSTANDARD__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIE_CSTANDARD__NAME = 1;

  /**
   * The number of structural features of the '<em>sIE Cstandard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIE_CSTANDARD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.sIECturbcImpl <em>sIE Cturbc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.sIECturbcImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsIECturbc()
   * @generated
   */
  int SIE_CTURBC = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIE_CTURBC__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIE_CTURBC__NAME = 1;

  /**
   * The number of structural features of the '<em>sIE Cturbc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIE_CTURBC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.sIEC_WindTypeImpl <em>sIEC Wind Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.sIEC_WindTypeImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsIEC_WindType()
   * @generated
   */
  int SIEC_WIND_TYPE = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIEC_WIND_TYPE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIEC_WIND_TYPE__NAME = 1;

  /**
   * The number of structural features of the '<em>sIEC Wind Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIEC_WIND_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.sETMcImpl <em>sET Mc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.sETMcImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsETMc()
   * @generated
   */
  int SET_MC = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MC__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MC__NAME = 1;

  /**
   * The number of structural features of the '<em>sET Mc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.sWindProfileTypeImpl <em>sWind Profile Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.sWindProfileTypeImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsWindProfileType()
   * @generated
   */
  int SWIND_PROFILE_TYPE = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIND_PROFILE_TYPE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIND_PROFILE_TYPE__NAME = 1;

  /**
   * The number of structural features of the '<em>sWind Profile Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIND_PROFILE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nRefHtImpl <em>nRef Ht</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nRefHtImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnRefHt()
   * @generated
   */
  int NREF_HT = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NREF_HT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NREF_HT__NAME = 1;

  /**
   * The number of structural features of the '<em>nRef Ht</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NREF_HT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nUrefImpl <em>nUref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nUrefImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnUref()
   * @generated
   */
  int NUREF = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUREF__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUREF__NAME = 1;

  /**
   * The number of structural features of the '<em>nUref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUREF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nZJetMaxImpl <em>nZ Jet Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nZJetMaxImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnZJetMax()
   * @generated
   */
  int NZ_JET_MAX = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZ_JET_MAX__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZ_JET_MAX__NAME = 1;

  /**
   * The number of structural features of the '<em>nZ Jet Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZ_JET_MAX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nPLExpImpl <em>nPL Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nPLExpImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnPLExp()
   * @generated
   */
  int NPL_EXP = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPL_EXP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPL_EXP__NAME = 1;

  /**
   * The number of structural features of the '<em>nPL Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPL_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nZ0Impl <em>nZ0</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nZ0Impl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnZ0()
   * @generated
   */
  int NZ0 = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZ0__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZ0__NAME = 1;

  /**
   * The number of structural features of the '<em>nZ0</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZ0_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nLocationImpl <em>nLocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nLocationImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnLocation()
   * @generated
   */
  int NLOCATION = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLOCATION__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLOCATION__NAME = 1;

  /**
   * The number of structural features of the '<em>nLocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nRICH_NOImpl <em>nRICH NO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nRICH_NOImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnRICH_NO()
   * @generated
   */
  int NRICH_NO = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRICH_NO__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRICH_NO__NAME = 1;

  /**
   * The number of structural features of the '<em>nRICH NO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NRICH_NO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nUStarImpl <em>nU Star</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nUStarImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnUStar()
   * @generated
   */
  int NU_STAR = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NU_STAR__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NU_STAR__NAME = 1;

  /**
   * The number of structural features of the '<em>nU Star</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NU_STAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nZIImpl <em>nZI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nZIImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnZI()
   * @generated
   */
  int NZI = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZI__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZI__NAME = 1;

  /**
   * The number of structural features of the '<em>nZI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NZI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nPC_UWImpl <em>nPC UW</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nPC_UWImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnPC_UW()
   * @generated
   */
  int NPC_UW = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_UW__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_UW__NAME = 1;

  /**
   * The number of structural features of the '<em>nPC UW</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_UW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nPC_UVImpl <em>nPC UV</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nPC_UVImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnPC_UV()
   * @generated
   */
  int NPC_UV = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_UV__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_UV__NAME = 1;

  /**
   * The number of structural features of the '<em>nPC UV</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_UV_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nPC_VWImpl <em>nPC VW</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nPC_VWImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnPC_VW()
   * @generated
   */
  int NPC_VW = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_VW__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_VW__NAME = 1;

  /**
   * The number of structural features of the '<em>nPC VW</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NPC_VW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nIncDec1Impl <em>nInc Dec1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nIncDec1Impl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnIncDec1()
   * @generated
   */
  int NINC_DEC1 = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC1__NAME = 1;

  /**
   * The number of structural features of the '<em>nInc Dec1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nIncDec2Impl <em>nInc Dec2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nIncDec2Impl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnIncDec2()
   * @generated
   */
  int NINC_DEC2 = 44;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC2__NAME = 1;

  /**
   * The number of structural features of the '<em>nInc Dec2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nIncDec3Impl <em>nInc Dec3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nIncDec3Impl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnIncDec3()
   * @generated
   */
  int NINC_DEC3 = 45;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC3__NAME = 1;

  /**
   * The number of structural features of the '<em>nInc Dec3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINC_DEC3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nCohExpImpl <em>nCoh Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nCohExpImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnCohExp()
   * @generated
   */
  int NCOH_EXP = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCOH_EXP__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCOH_EXP__NAME = 1;

  /**
   * The number of structural features of the '<em>nCoh Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCOH_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.sCTEventPathImpl <em>sCT Event Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.sCTEventPathImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsCTEventPath()
   * @generated
   */
  int SCT_EVENT_PATH = 47;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCT_EVENT_PATH__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCT_EVENT_PATH__NAME = 1;

  /**
   * The number of structural features of the '<em>sCT Event Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCT_EVENT_PATH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.sCTEventFileImpl <em>sCT Event File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.sCTEventFileImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsCTEventFile()
   * @generated
   */
  int SCT_EVENT_FILE = 48;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCT_EVENT_FILE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCT_EVENT_FILE__NAME = 1;

  /**
   * The number of structural features of the '<em>sCT Event File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCT_EVENT_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.bRandomizeImpl <em>bRandomize</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.bRandomizeImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbRandomize()
   * @generated
   */
  int BRANDOMIZE = 49;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANDOMIZE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANDOMIZE__NAME = 1;

  /**
   * The number of structural features of the '<em>bRandomize</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANDOMIZE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nDistSclImpl <em>nDist Scl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nDistSclImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnDistScl()
   * @generated
   */
  int NDIST_SCL = 50;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDIST_SCL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDIST_SCL__NAME = 1;

  /**
   * The number of structural features of the '<em>nDist Scl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NDIST_SCL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nCTLyImpl <em>nCT Ly</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nCTLyImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnCTLy()
   * @generated
   */
  int NCT_LY = 51;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_LY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_LY__NAME = 1;

  /**
   * The number of structural features of the '<em>nCT Ly</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_LY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nCTLzImpl <em>nCT Lz</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nCTLzImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnCTLz()
   * @generated
   */
  int NCT_LZ = 52;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_LZ__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_LZ__NAME = 1;

  /**
   * The number of structural features of the '<em>nCT Lz</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_LZ_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.nCTStartTimeImpl <em>nCT Start Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.nCTStartTimeImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnCTStartTime()
   * @generated
   */
  int NCT_START_TIME = 53;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_START_TIME__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_START_TIME__NAME = 1;

  /**
   * The number of structural features of the '<em>nCT Start Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NCT_START_TIME_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs <em>Model Turbsimtbs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Turbsimtbs</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs
   * @generated
   */
  EClass getModelTurbsimtbs();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHead()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_Head();

  /**
   * Returns the meta object for the containment reference list '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getSections()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_Sections();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandSeed1 <em>Rand Seed1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rand Seed1</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandSeed1()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_RandSeed1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandSeed2 <em>Rand Seed2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rand Seed2</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandSeed2()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_RandSeed2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrBHHTP <em>Wr BHHTP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wr BHHTP</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrBHHTP()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WrBHHTP();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrFHHTP <em>Wr FHHTP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wr FHHTP</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrFHHTP()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WrFHHTP();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADHH <em>Wr ADHH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wr ADHH</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADHH()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WrADHH();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADFF <em>Wr ADFF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wr ADFF</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADFF()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WrADFF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrBLFF <em>Wr BLFF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wr BLFF</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrBLFF()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WrBLFF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADTWR <em>Wr ADTWR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wr ADTWR</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADTWR()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WrADTWR();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrFMTFF <em>Wr FMTFF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wr FMTFF</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrFMTFF()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WrFMTFF();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrACT <em>Wr ACT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wr ACT</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrACT()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WrACT();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getClockwise <em>Clockwise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clockwise</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getClockwise()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_Clockwise();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getScaleIEC <em>Scale IEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scale IEC</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getScaleIEC()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_ScaleIEC();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getNumGrid_Z <em>Num Grid Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Grid Z</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getNumGrid_Z()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_NumGrid_Z();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getNumGrid_Y <em>Num Grid Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Grid Y</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getNumGrid_Y()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_NumGrid_Y();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getTimeStep <em>Time Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Step</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getTimeStep()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_TimeStep();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getAnalysisTime <em>Analysis Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Analysis Time</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getAnalysisTime()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_AnalysisTime();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUsableTime <em>Usable Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Usable Time</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUsableTime()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_UsableTime();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHubHt <em>Hub Ht</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hub Ht</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHubHt()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_HubHt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getGridHeight <em>Grid Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Grid Height</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getGridHeight()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_GridHeight();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getGridWidth <em>Grid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Grid Width</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getGridWidth()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_GridWidth();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getVFlowAng <em>VFlow Ang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VFlow Ang</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getVFlowAng()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_VFlowAng();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHFlowAng <em>HFlow Ang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HFlow Ang</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHFlowAng()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_HFlowAng();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getTurbModel <em>Turb Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Turb Model</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getTurbModel()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_TurbModel();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIECstandard <em>IE Cstandard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IE Cstandard</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIECstandard()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_IECstandard();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIECturbc <em>IE Cturbc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IE Cturbc</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIECturbc()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_IECturbc();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIEC_WindType <em>IEC Wind Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IEC Wind Type</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIEC_WindType()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_IEC_WindType();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getETMc <em>ET Mc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ET Mc</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getETMc()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_ETMc();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWindProfileType <em>Wind Profile Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wind Profile Type</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWindProfileType()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_WindProfileType();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRefHt <em>Ref Ht</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Ht</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRefHt()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_RefHt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUref <em>Uref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uref</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUref()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_Uref();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZJetMax <em>ZJet Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ZJet Max</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZJetMax()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_ZJetMax();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPLExp <em>PL Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PL Exp</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPLExp()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_PLExp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZ0 <em>Z0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Z0</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZ0()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_Z0();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getLocation()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_Location();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRICH_NO <em>RICH NO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>RICH NO</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRICH_NO()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_RICH_NO();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUStar <em>UStar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>UStar</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUStar()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_UStar();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZI <em>ZI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ZI</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZI()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_ZI();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_UW <em>PC UW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PC UW</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_UW()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_PC_UW();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_UV <em>PC UV</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PC UV</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_UV()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_PC_UV();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_VW <em>PC VW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PC VW</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_VW()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_PC_VW();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec1 <em>Inc Dec1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inc Dec1</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec1()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_IncDec1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec2 <em>Inc Dec2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inc Dec2</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec2()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_IncDec2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec3 <em>Inc Dec3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inc Dec3</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec3()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_IncDec3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCohExp <em>Coh Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coh Exp</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCohExp()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_CohExp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTEventPath <em>CT Event Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>CT Event Path</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTEventPath()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_CTEventPath();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTEventFile <em>CT Event File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>CT Event File</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTEventFile()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_CTEventFile();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandomize <em>Randomize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Randomize</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandomize()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_Randomize();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getDistScl <em>Dist Scl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dist Scl</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getDistScl()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_DistScl();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTLy <em>CT Ly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>CT Ly</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTLy()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_CTLy();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTLz <em>CT Lz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>CT Lz</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTLz()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_CTLz();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTStartTime <em>CT Start Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>CT Start Time</em>'.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTStartTime()
   * @see #getModelTurbsimtbs()
   * @generated
   */
  EReference getModelTurbsimtbs_CTStartTime();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.turbsimtbs.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.Header#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rows</em>'.
   * @see sc.ndt.editor.turbsimtbs.Header#getRows()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Rows();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see sc.ndt.editor.turbsimtbs.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nRandSeed1 <em>nRand Seed1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRand Seed1</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRandSeed1
   * @generated
   */
  EClass getnRandSeed1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nRandSeed1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRandSeed1#getValue()
   * @see #getnRandSeed1()
   * @generated
   */
  EAttribute getnRandSeed1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nRandSeed1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRandSeed1#getName()
   * @see #getnRandSeed1()
   * @generated
   */
  EAttribute getnRandSeed1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nRandSeed2 <em>nRand Seed2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRand Seed2</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRandSeed2
   * @generated
   */
  EClass getnRandSeed2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nRandSeed2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRandSeed2#getValue()
   * @see #getnRandSeed2()
   * @generated
   */
  EAttribute getnRandSeed2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nRandSeed2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRandSeed2#getName()
   * @see #getnRandSeed2()
   * @generated
   */
  EAttribute getnRandSeed2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bWrBHHTP <em>bWr BHHTP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bWr BHHTP</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrBHHTP
   * @generated
   */
  EClass getbWrBHHTP();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrBHHTP#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrBHHTP#isValue()
   * @see #getbWrBHHTP()
   * @generated
   */
  EAttribute getbWrBHHTP_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrBHHTP#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrBHHTP#getName()
   * @see #getbWrBHHTP()
   * @generated
   */
  EAttribute getbWrBHHTP_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bWrFHHTP <em>bWr FHHTP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bWr FHHTP</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrFHHTP
   * @generated
   */
  EClass getbWrFHHTP();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrFHHTP#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrFHHTP#isValue()
   * @see #getbWrFHHTP()
   * @generated
   */
  EAttribute getbWrFHHTP_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrFHHTP#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrFHHTP#getName()
   * @see #getbWrFHHTP()
   * @generated
   */
  EAttribute getbWrFHHTP_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bWrADHH <em>bWr ADHH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bWr ADHH</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADHH
   * @generated
   */
  EClass getbWrADHH();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrADHH#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADHH#isValue()
   * @see #getbWrADHH()
   * @generated
   */
  EAttribute getbWrADHH_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrADHH#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADHH#getName()
   * @see #getbWrADHH()
   * @generated
   */
  EAttribute getbWrADHH_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bWrADFF <em>bWr ADFF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bWr ADFF</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADFF
   * @generated
   */
  EClass getbWrADFF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrADFF#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADFF#isValue()
   * @see #getbWrADFF()
   * @generated
   */
  EAttribute getbWrADFF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrADFF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADFF#getName()
   * @see #getbWrADFF()
   * @generated
   */
  EAttribute getbWrADFF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bWrBLFF <em>bWr BLFF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bWr BLFF</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrBLFF
   * @generated
   */
  EClass getbWrBLFF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrBLFF#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrBLFF#isValue()
   * @see #getbWrBLFF()
   * @generated
   */
  EAttribute getbWrBLFF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrBLFF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrBLFF#getName()
   * @see #getbWrBLFF()
   * @generated
   */
  EAttribute getbWrBLFF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bWrADTWR <em>bWr ADTWR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bWr ADTWR</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADTWR
   * @generated
   */
  EClass getbWrADTWR();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrADTWR#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADTWR#isValue()
   * @see #getbWrADTWR()
   * @generated
   */
  EAttribute getbWrADTWR_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrADTWR#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrADTWR#getName()
   * @see #getbWrADTWR()
   * @generated
   */
  EAttribute getbWrADTWR_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bWrFMTFF <em>bWr FMTFF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bWr FMTFF</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrFMTFF
   * @generated
   */
  EClass getbWrFMTFF();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrFMTFF#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrFMTFF#isValue()
   * @see #getbWrFMTFF()
   * @generated
   */
  EAttribute getbWrFMTFF_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrFMTFF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrFMTFF#getName()
   * @see #getbWrFMTFF()
   * @generated
   */
  EAttribute getbWrFMTFF_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bWrACT <em>bWr ACT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bWr ACT</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrACT
   * @generated
   */
  EClass getbWrACT();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrACT#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrACT#isValue()
   * @see #getbWrACT()
   * @generated
   */
  EAttribute getbWrACT_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bWrACT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bWrACT#getName()
   * @see #getbWrACT()
   * @generated
   */
  EAttribute getbWrACT_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bClockwise <em>bClockwise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bClockwise</em>'.
   * @see sc.ndt.editor.turbsimtbs.bClockwise
   * @generated
   */
  EClass getbClockwise();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bClockwise#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bClockwise#isValue()
   * @see #getbClockwise()
   * @generated
   */
  EAttribute getbClockwise_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bClockwise#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bClockwise#getName()
   * @see #getbClockwise()
   * @generated
   */
  EAttribute getbClockwise_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.iScaleIEC <em>iScale IEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iScale IEC</em>'.
   * @see sc.ndt.editor.turbsimtbs.iScaleIEC
   * @generated
   */
  EClass getiScaleIEC();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.iScaleIEC#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.iScaleIEC#getValue()
   * @see #getiScaleIEC()
   * @generated
   */
  EAttribute getiScaleIEC_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.iScaleIEC#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.iScaleIEC#getName()
   * @see #getiScaleIEC()
   * @generated
   */
  EAttribute getiScaleIEC_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.iNumGrid_Z <em>iNum Grid Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iNum Grid Z</em>'.
   * @see sc.ndt.editor.turbsimtbs.iNumGrid_Z
   * @generated
   */
  EClass getiNumGrid_Z();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.iNumGrid_Z#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.iNumGrid_Z#getValue()
   * @see #getiNumGrid_Z()
   * @generated
   */
  EAttribute getiNumGrid_Z_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.iNumGrid_Z#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.iNumGrid_Z#getName()
   * @see #getiNumGrid_Z()
   * @generated
   */
  EAttribute getiNumGrid_Z_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.iNumGrid_Y <em>iNum Grid Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iNum Grid Y</em>'.
   * @see sc.ndt.editor.turbsimtbs.iNumGrid_Y
   * @generated
   */
  EClass getiNumGrid_Y();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.iNumGrid_Y#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.iNumGrid_Y#getValue()
   * @see #getiNumGrid_Y()
   * @generated
   */
  EAttribute getiNumGrid_Y_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.iNumGrid_Y#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.iNumGrid_Y#getName()
   * @see #getiNumGrid_Y()
   * @generated
   */
  EAttribute getiNumGrid_Y_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nTimeStep <em>nTime Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTime Step</em>'.
   * @see sc.ndt.editor.turbsimtbs.nTimeStep
   * @generated
   */
  EClass getnTimeStep();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nTimeStep#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nTimeStep#getValue()
   * @see #getnTimeStep()
   * @generated
   */
  EAttribute getnTimeStep_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nTimeStep#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nTimeStep#getName()
   * @see #getnTimeStep()
   * @generated
   */
  EAttribute getnTimeStep_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nAnalysisTime <em>nAnalysis Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nAnalysis Time</em>'.
   * @see sc.ndt.editor.turbsimtbs.nAnalysisTime
   * @generated
   */
  EClass getnAnalysisTime();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nAnalysisTime#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nAnalysisTime#getValue()
   * @see #getnAnalysisTime()
   * @generated
   */
  EAttribute getnAnalysisTime_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nAnalysisTime#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nAnalysisTime#getName()
   * @see #getnAnalysisTime()
   * @generated
   */
  EAttribute getnAnalysisTime_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nUsableTime <em>nUsable Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nUsable Time</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUsableTime
   * @generated
   */
  EClass getnUsableTime();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nUsableTime#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUsableTime#getValue()
   * @see #getnUsableTime()
   * @generated
   */
  EAttribute getnUsableTime_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nUsableTime#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUsableTime#getName()
   * @see #getnUsableTime()
   * @generated
   */
  EAttribute getnUsableTime_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nHubHt <em>nHub Ht</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHub Ht</em>'.
   * @see sc.ndt.editor.turbsimtbs.nHubHt
   * @generated
   */
  EClass getnHubHt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nHubHt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nHubHt#getValue()
   * @see #getnHubHt()
   * @generated
   */
  EAttribute getnHubHt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nHubHt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nHubHt#getName()
   * @see #getnHubHt()
   * @generated
   */
  EAttribute getnHubHt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nGridHeight <em>nGrid Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nGrid Height</em>'.
   * @see sc.ndt.editor.turbsimtbs.nGridHeight
   * @generated
   */
  EClass getnGridHeight();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nGridHeight#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nGridHeight#getValue()
   * @see #getnGridHeight()
   * @generated
   */
  EAttribute getnGridHeight_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nGridHeight#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nGridHeight#getName()
   * @see #getnGridHeight()
   * @generated
   */
  EAttribute getnGridHeight_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nGridWidth <em>nGrid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nGrid Width</em>'.
   * @see sc.ndt.editor.turbsimtbs.nGridWidth
   * @generated
   */
  EClass getnGridWidth();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nGridWidth#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nGridWidth#getValue()
   * @see #getnGridWidth()
   * @generated
   */
  EAttribute getnGridWidth_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nGridWidth#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nGridWidth#getName()
   * @see #getnGridWidth()
   * @generated
   */
  EAttribute getnGridWidth_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nVFlowAng <em>nV Flow Ang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nV Flow Ang</em>'.
   * @see sc.ndt.editor.turbsimtbs.nVFlowAng
   * @generated
   */
  EClass getnVFlowAng();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nVFlowAng#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nVFlowAng#getValue()
   * @see #getnVFlowAng()
   * @generated
   */
  EAttribute getnVFlowAng_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nVFlowAng#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nVFlowAng#getName()
   * @see #getnVFlowAng()
   * @generated
   */
  EAttribute getnVFlowAng_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nHFlowAng <em>nH Flow Ang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nH Flow Ang</em>'.
   * @see sc.ndt.editor.turbsimtbs.nHFlowAng
   * @generated
   */
  EClass getnHFlowAng();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nHFlowAng#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nHFlowAng#getValue()
   * @see #getnHFlowAng()
   * @generated
   */
  EAttribute getnHFlowAng_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nHFlowAng#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nHFlowAng#getName()
   * @see #getnHFlowAng()
   * @generated
   */
  EAttribute getnHFlowAng_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.sTurbModel <em>sTurb Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sTurb Model</em>'.
   * @see sc.ndt.editor.turbsimtbs.sTurbModel
   * @generated
   */
  EClass getsTurbModel();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sTurbModel#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.sTurbModel#getValue()
   * @see #getsTurbModel()
   * @generated
   */
  EAttribute getsTurbModel_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sTurbModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.sTurbModel#getName()
   * @see #getsTurbModel()
   * @generated
   */
  EAttribute getsTurbModel_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.sIECstandard <em>sIE Cstandard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sIE Cstandard</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIECstandard
   * @generated
   */
  EClass getsIECstandard();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sIECstandard#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIECstandard#getValue()
   * @see #getsIECstandard()
   * @generated
   */
  EAttribute getsIECstandard_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sIECstandard#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIECstandard#getName()
   * @see #getsIECstandard()
   * @generated
   */
  EAttribute getsIECstandard_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.sIECturbc <em>sIE Cturbc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sIE Cturbc</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIECturbc
   * @generated
   */
  EClass getsIECturbc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sIECturbc#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIECturbc#getValue()
   * @see #getsIECturbc()
   * @generated
   */
  EAttribute getsIECturbc_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sIECturbc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIECturbc#getName()
   * @see #getsIECturbc()
   * @generated
   */
  EAttribute getsIECturbc_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.sIEC_WindType <em>sIEC Wind Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sIEC Wind Type</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIEC_WindType
   * @generated
   */
  EClass getsIEC_WindType();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sIEC_WindType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIEC_WindType#getValue()
   * @see #getsIEC_WindType()
   * @generated
   */
  EAttribute getsIEC_WindType_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sIEC_WindType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.sIEC_WindType#getName()
   * @see #getsIEC_WindType()
   * @generated
   */
  EAttribute getsIEC_WindType_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.sETMc <em>sET Mc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sET Mc</em>'.
   * @see sc.ndt.editor.turbsimtbs.sETMc
   * @generated
   */
  EClass getsETMc();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sETMc#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.sETMc#getValue()
   * @see #getsETMc()
   * @generated
   */
  EAttribute getsETMc_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sETMc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.sETMc#getName()
   * @see #getsETMc()
   * @generated
   */
  EAttribute getsETMc_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.sWindProfileType <em>sWind Profile Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sWind Profile Type</em>'.
   * @see sc.ndt.editor.turbsimtbs.sWindProfileType
   * @generated
   */
  EClass getsWindProfileType();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sWindProfileType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.sWindProfileType#getValue()
   * @see #getsWindProfileType()
   * @generated
   */
  EAttribute getsWindProfileType_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sWindProfileType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.sWindProfileType#getName()
   * @see #getsWindProfileType()
   * @generated
   */
  EAttribute getsWindProfileType_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nRefHt <em>nRef Ht</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRef Ht</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRefHt
   * @generated
   */
  EClass getnRefHt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nRefHt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRefHt#getValue()
   * @see #getnRefHt()
   * @generated
   */
  EAttribute getnRefHt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nRefHt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRefHt#getName()
   * @see #getnRefHt()
   * @generated
   */
  EAttribute getnRefHt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nUref <em>nUref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nUref</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUref
   * @generated
   */
  EClass getnUref();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nUref#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUref#getValue()
   * @see #getnUref()
   * @generated
   */
  EAttribute getnUref_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nUref#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUref#getName()
   * @see #getnUref()
   * @generated
   */
  EAttribute getnUref_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nZJetMax <em>nZ Jet Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nZ Jet Max</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZJetMax
   * @generated
   */
  EClass getnZJetMax();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nZJetMax#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZJetMax#getValue()
   * @see #getnZJetMax()
   * @generated
   */
  EAttribute getnZJetMax_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nZJetMax#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZJetMax#getName()
   * @see #getnZJetMax()
   * @generated
   */
  EAttribute getnZJetMax_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nPLExp <em>nPL Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nPL Exp</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPLExp
   * @generated
   */
  EClass getnPLExp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nPLExp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPLExp#getValue()
   * @see #getnPLExp()
   * @generated
   */
  EAttribute getnPLExp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nPLExp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPLExp#getName()
   * @see #getnPLExp()
   * @generated
   */
  EAttribute getnPLExp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nZ0 <em>nZ0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nZ0</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZ0
   * @generated
   */
  EClass getnZ0();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nZ0#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZ0#getValue()
   * @see #getnZ0()
   * @generated
   */
  EAttribute getnZ0_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nZ0#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZ0#getName()
   * @see #getnZ0()
   * @generated
   */
  EAttribute getnZ0_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nLocation <em>nLocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nLocation</em>'.
   * @see sc.ndt.editor.turbsimtbs.nLocation
   * @generated
   */
  EClass getnLocation();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nLocation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nLocation#getValue()
   * @see #getnLocation()
   * @generated
   */
  EAttribute getnLocation_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nLocation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nLocation#getName()
   * @see #getnLocation()
   * @generated
   */
  EAttribute getnLocation_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nRICH_NO <em>nRICH NO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRICH NO</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRICH_NO
   * @generated
   */
  EClass getnRICH_NO();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nRICH_NO#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRICH_NO#getValue()
   * @see #getnRICH_NO()
   * @generated
   */
  EAttribute getnRICH_NO_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nRICH_NO#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nRICH_NO#getName()
   * @see #getnRICH_NO()
   * @generated
   */
  EAttribute getnRICH_NO_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nUStar <em>nU Star</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nU Star</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUStar
   * @generated
   */
  EClass getnUStar();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nUStar#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUStar#getValue()
   * @see #getnUStar()
   * @generated
   */
  EAttribute getnUStar_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nUStar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nUStar#getName()
   * @see #getnUStar()
   * @generated
   */
  EAttribute getnUStar_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nZI <em>nZI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nZI</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZI
   * @generated
   */
  EClass getnZI();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nZI#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZI#getValue()
   * @see #getnZI()
   * @generated
   */
  EAttribute getnZI_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nZI#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nZI#getName()
   * @see #getnZI()
   * @generated
   */
  EAttribute getnZI_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nPC_UW <em>nPC UW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nPC UW</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_UW
   * @generated
   */
  EClass getnPC_UW();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nPC_UW#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_UW#getValue()
   * @see #getnPC_UW()
   * @generated
   */
  EAttribute getnPC_UW_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nPC_UW#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_UW#getName()
   * @see #getnPC_UW()
   * @generated
   */
  EAttribute getnPC_UW_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nPC_UV <em>nPC UV</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nPC UV</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_UV
   * @generated
   */
  EClass getnPC_UV();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nPC_UV#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_UV#getValue()
   * @see #getnPC_UV()
   * @generated
   */
  EAttribute getnPC_UV_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nPC_UV#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_UV#getName()
   * @see #getnPC_UV()
   * @generated
   */
  EAttribute getnPC_UV_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nPC_VW <em>nPC VW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nPC VW</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_VW
   * @generated
   */
  EClass getnPC_VW();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nPC_VW#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_VW#getValue()
   * @see #getnPC_VW()
   * @generated
   */
  EAttribute getnPC_VW_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nPC_VW#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nPC_VW#getName()
   * @see #getnPC_VW()
   * @generated
   */
  EAttribute getnPC_VW_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nIncDec1 <em>nInc Dec1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nInc Dec1</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec1
   * @generated
   */
  EClass getnIncDec1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nIncDec1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec1#getValue()
   * @see #getnIncDec1()
   * @generated
   */
  EAttribute getnIncDec1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nIncDec1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec1#getName()
   * @see #getnIncDec1()
   * @generated
   */
  EAttribute getnIncDec1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nIncDec2 <em>nInc Dec2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nInc Dec2</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec2
   * @generated
   */
  EClass getnIncDec2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nIncDec2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec2#getValue()
   * @see #getnIncDec2()
   * @generated
   */
  EAttribute getnIncDec2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nIncDec2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec2#getName()
   * @see #getnIncDec2()
   * @generated
   */
  EAttribute getnIncDec2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nIncDec3 <em>nInc Dec3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nInc Dec3</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec3
   * @generated
   */
  EClass getnIncDec3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nIncDec3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec3#getValue()
   * @see #getnIncDec3()
   * @generated
   */
  EAttribute getnIncDec3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nIncDec3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nIncDec3#getName()
   * @see #getnIncDec3()
   * @generated
   */
  EAttribute getnIncDec3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nCohExp <em>nCoh Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nCoh Exp</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCohExp
   * @generated
   */
  EClass getnCohExp();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nCohExp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCohExp#getValue()
   * @see #getnCohExp()
   * @generated
   */
  EAttribute getnCohExp_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nCohExp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCohExp#getName()
   * @see #getnCohExp()
   * @generated
   */
  EAttribute getnCohExp_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.sCTEventPath <em>sCT Event Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sCT Event Path</em>'.
   * @see sc.ndt.editor.turbsimtbs.sCTEventPath
   * @generated
   */
  EClass getsCTEventPath();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sCTEventPath#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.sCTEventPath#getValue()
   * @see #getsCTEventPath()
   * @generated
   */
  EAttribute getsCTEventPath_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sCTEventPath#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.sCTEventPath#getName()
   * @see #getsCTEventPath()
   * @generated
   */
  EAttribute getsCTEventPath_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.sCTEventFile <em>sCT Event File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sCT Event File</em>'.
   * @see sc.ndt.editor.turbsimtbs.sCTEventFile
   * @generated
   */
  EClass getsCTEventFile();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sCTEventFile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.sCTEventFile#getValue()
   * @see #getsCTEventFile()
   * @generated
   */
  EAttribute getsCTEventFile_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.sCTEventFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.sCTEventFile#getName()
   * @see #getsCTEventFile()
   * @generated
   */
  EAttribute getsCTEventFile_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.bRandomize <em>bRandomize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bRandomize</em>'.
   * @see sc.ndt.editor.turbsimtbs.bRandomize
   * @generated
   */
  EClass getbRandomize();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bRandomize#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.bRandomize#isValue()
   * @see #getbRandomize()
   * @generated
   */
  EAttribute getbRandomize_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.bRandomize#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.bRandomize#getName()
   * @see #getbRandomize()
   * @generated
   */
  EAttribute getbRandomize_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nDistScl <em>nDist Scl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nDist Scl</em>'.
   * @see sc.ndt.editor.turbsimtbs.nDistScl
   * @generated
   */
  EClass getnDistScl();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nDistScl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nDistScl#getValue()
   * @see #getnDistScl()
   * @generated
   */
  EAttribute getnDistScl_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nDistScl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nDistScl#getName()
   * @see #getnDistScl()
   * @generated
   */
  EAttribute getnDistScl_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nCTLy <em>nCT Ly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nCT Ly</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTLy
   * @generated
   */
  EClass getnCTLy();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nCTLy#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTLy#getValue()
   * @see #getnCTLy()
   * @generated
   */
  EAttribute getnCTLy_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nCTLy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTLy#getName()
   * @see #getnCTLy()
   * @generated
   */
  EAttribute getnCTLy_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nCTLz <em>nCT Lz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nCT Lz</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTLz
   * @generated
   */
  EClass getnCTLz();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nCTLz#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTLz#getValue()
   * @see #getnCTLz()
   * @generated
   */
  EAttribute getnCTLz_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nCTLz#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTLz#getName()
   * @see #getnCTLz()
   * @generated
   */
  EAttribute getnCTLz_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.nCTStartTime <em>nCT Start Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nCT Start Time</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTStartTime
   * @generated
   */
  EClass getnCTStartTime();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nCTStartTime#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTStartTime#getValue()
   * @see #getnCTStartTime()
   * @generated
   */
  EAttribute getnCTStartTime_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.nCTStartTime#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.turbsimtbs.nCTStartTime#getName()
   * @see #getnCTStartTime()
   * @generated
   */
  EAttribute getnCTStartTime_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TurbsimtbsFactory getTurbsimtbsFactory();

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
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl <em>Model Turbsimtbs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getModelTurbsimtbs()
     * @generated
     */
    EClass MODEL_TURBSIMTBS = eINSTANCE.getModelTurbsimtbs();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__HEAD = eINSTANCE.getModelTurbsimtbs_Head();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__SECTIONS = eINSTANCE.getModelTurbsimtbs_Sections();

    /**
     * The meta object literal for the '<em><b>Rand Seed1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__RAND_SEED1 = eINSTANCE.getModelTurbsimtbs_RandSeed1();

    /**
     * The meta object literal for the '<em><b>Rand Seed2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__RAND_SEED2 = eINSTANCE.getModelTurbsimtbs_RandSeed2();

    /**
     * The meta object literal for the '<em><b>Wr BHHTP</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WR_BHHTP = eINSTANCE.getModelTurbsimtbs_WrBHHTP();

    /**
     * The meta object literal for the '<em><b>Wr FHHTP</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WR_FHHTP = eINSTANCE.getModelTurbsimtbs_WrFHHTP();

    /**
     * The meta object literal for the '<em><b>Wr ADHH</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WR_ADHH = eINSTANCE.getModelTurbsimtbs_WrADHH();

    /**
     * The meta object literal for the '<em><b>Wr ADFF</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WR_ADFF = eINSTANCE.getModelTurbsimtbs_WrADFF();

    /**
     * The meta object literal for the '<em><b>Wr BLFF</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WR_BLFF = eINSTANCE.getModelTurbsimtbs_WrBLFF();

    /**
     * The meta object literal for the '<em><b>Wr ADTWR</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WR_ADTWR = eINSTANCE.getModelTurbsimtbs_WrADTWR();

    /**
     * The meta object literal for the '<em><b>Wr FMTFF</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WR_FMTFF = eINSTANCE.getModelTurbsimtbs_WrFMTFF();

    /**
     * The meta object literal for the '<em><b>Wr ACT</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WR_ACT = eINSTANCE.getModelTurbsimtbs_WrACT();

    /**
     * The meta object literal for the '<em><b>Clockwise</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__CLOCKWISE = eINSTANCE.getModelTurbsimtbs_Clockwise();

    /**
     * The meta object literal for the '<em><b>Scale IEC</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__SCALE_IEC = eINSTANCE.getModelTurbsimtbs_ScaleIEC();

    /**
     * The meta object literal for the '<em><b>Num Grid Z</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__NUM_GRID_Z = eINSTANCE.getModelTurbsimtbs_NumGrid_Z();

    /**
     * The meta object literal for the '<em><b>Num Grid Y</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__NUM_GRID_Y = eINSTANCE.getModelTurbsimtbs_NumGrid_Y();

    /**
     * The meta object literal for the '<em><b>Time Step</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__TIME_STEP = eINSTANCE.getModelTurbsimtbs_TimeStep();

    /**
     * The meta object literal for the '<em><b>Analysis Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__ANALYSIS_TIME = eINSTANCE.getModelTurbsimtbs_AnalysisTime();

    /**
     * The meta object literal for the '<em><b>Usable Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__USABLE_TIME = eINSTANCE.getModelTurbsimtbs_UsableTime();

    /**
     * The meta object literal for the '<em><b>Hub Ht</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__HUB_HT = eINSTANCE.getModelTurbsimtbs_HubHt();

    /**
     * The meta object literal for the '<em><b>Grid Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__GRID_HEIGHT = eINSTANCE.getModelTurbsimtbs_GridHeight();

    /**
     * The meta object literal for the '<em><b>Grid Width</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__GRID_WIDTH = eINSTANCE.getModelTurbsimtbs_GridWidth();

    /**
     * The meta object literal for the '<em><b>VFlow Ang</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__VFLOW_ANG = eINSTANCE.getModelTurbsimtbs_VFlowAng();

    /**
     * The meta object literal for the '<em><b>HFlow Ang</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__HFLOW_ANG = eINSTANCE.getModelTurbsimtbs_HFlowAng();

    /**
     * The meta object literal for the '<em><b>Turb Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__TURB_MODEL = eINSTANCE.getModelTurbsimtbs_TurbModel();

    /**
     * The meta object literal for the '<em><b>IE Cstandard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__IE_CSTANDARD = eINSTANCE.getModelTurbsimtbs_IECstandard();

    /**
     * The meta object literal for the '<em><b>IE Cturbc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__IE_CTURBC = eINSTANCE.getModelTurbsimtbs_IECturbc();

    /**
     * The meta object literal for the '<em><b>IEC Wind Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__IEC_WIND_TYPE = eINSTANCE.getModelTurbsimtbs_IEC_WindType();

    /**
     * The meta object literal for the '<em><b>ET Mc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__ET_MC = eINSTANCE.getModelTurbsimtbs_ETMc();

    /**
     * The meta object literal for the '<em><b>Wind Profile Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__WIND_PROFILE_TYPE = eINSTANCE.getModelTurbsimtbs_WindProfileType();

    /**
     * The meta object literal for the '<em><b>Ref Ht</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__REF_HT = eINSTANCE.getModelTurbsimtbs_RefHt();

    /**
     * The meta object literal for the '<em><b>Uref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__UREF = eINSTANCE.getModelTurbsimtbs_Uref();

    /**
     * The meta object literal for the '<em><b>ZJet Max</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__ZJET_MAX = eINSTANCE.getModelTurbsimtbs_ZJetMax();

    /**
     * The meta object literal for the '<em><b>PL Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__PL_EXP = eINSTANCE.getModelTurbsimtbs_PLExp();

    /**
     * The meta object literal for the '<em><b>Z0</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__Z0 = eINSTANCE.getModelTurbsimtbs_Z0();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__LOCATION = eINSTANCE.getModelTurbsimtbs_Location();

    /**
     * The meta object literal for the '<em><b>RICH NO</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__RICH_NO = eINSTANCE.getModelTurbsimtbs_RICH_NO();

    /**
     * The meta object literal for the '<em><b>UStar</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__USTAR = eINSTANCE.getModelTurbsimtbs_UStar();

    /**
     * The meta object literal for the '<em><b>ZI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__ZI = eINSTANCE.getModelTurbsimtbs_ZI();

    /**
     * The meta object literal for the '<em><b>PC UW</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__PC_UW = eINSTANCE.getModelTurbsimtbs_PC_UW();

    /**
     * The meta object literal for the '<em><b>PC UV</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__PC_UV = eINSTANCE.getModelTurbsimtbs_PC_UV();

    /**
     * The meta object literal for the '<em><b>PC VW</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__PC_VW = eINSTANCE.getModelTurbsimtbs_PC_VW();

    /**
     * The meta object literal for the '<em><b>Inc Dec1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__INC_DEC1 = eINSTANCE.getModelTurbsimtbs_IncDec1();

    /**
     * The meta object literal for the '<em><b>Inc Dec2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__INC_DEC2 = eINSTANCE.getModelTurbsimtbs_IncDec2();

    /**
     * The meta object literal for the '<em><b>Inc Dec3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__INC_DEC3 = eINSTANCE.getModelTurbsimtbs_IncDec3();

    /**
     * The meta object literal for the '<em><b>Coh Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__COH_EXP = eINSTANCE.getModelTurbsimtbs_CohExp();

    /**
     * The meta object literal for the '<em><b>CT Event Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__CT_EVENT_PATH = eINSTANCE.getModelTurbsimtbs_CTEventPath();

    /**
     * The meta object literal for the '<em><b>CT Event File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__CT_EVENT_FILE = eINSTANCE.getModelTurbsimtbs_CTEventFile();

    /**
     * The meta object literal for the '<em><b>Randomize</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__RANDOMIZE = eINSTANCE.getModelTurbsimtbs_Randomize();

    /**
     * The meta object literal for the '<em><b>Dist Scl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__DIST_SCL = eINSTANCE.getModelTurbsimtbs_DistScl();

    /**
     * The meta object literal for the '<em><b>CT Ly</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__CT_LY = eINSTANCE.getModelTurbsimtbs_CTLy();

    /**
     * The meta object literal for the '<em><b>CT Lz</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__CT_LZ = eINSTANCE.getModelTurbsimtbs_CTLz();

    /**
     * The meta object literal for the '<em><b>CT Start Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_TURBSIMTBS__CT_START_TIME = eINSTANCE.getModelTurbsimtbs_CTStartTime();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.HeaderImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__ROWS = eINSTANCE.getHeader_Rows();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.SectionImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getSection()
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
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nRandSeed1Impl <em>nRand Seed1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nRandSeed1Impl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnRandSeed1()
     * @generated
     */
    EClass NRAND_SEED1 = eINSTANCE.getnRandSeed1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRAND_SEED1__VALUE = eINSTANCE.getnRandSeed1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRAND_SEED1__NAME = eINSTANCE.getnRandSeed1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nRandSeed2Impl <em>nRand Seed2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nRandSeed2Impl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnRandSeed2()
     * @generated
     */
    EClass NRAND_SEED2 = eINSTANCE.getnRandSeed2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRAND_SEED2__VALUE = eINSTANCE.getnRandSeed2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRAND_SEED2__NAME = eINSTANCE.getnRandSeed2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrBHHTPImpl <em>bWr BHHTP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bWrBHHTPImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrBHHTP()
     * @generated
     */
    EClass BWR_BHHTP = eINSTANCE.getbWrBHHTP();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_BHHTP__VALUE = eINSTANCE.getbWrBHHTP_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_BHHTP__NAME = eINSTANCE.getbWrBHHTP_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrFHHTPImpl <em>bWr FHHTP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bWrFHHTPImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrFHHTP()
     * @generated
     */
    EClass BWR_FHHTP = eINSTANCE.getbWrFHHTP();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_FHHTP__VALUE = eINSTANCE.getbWrFHHTP_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_FHHTP__NAME = eINSTANCE.getbWrFHHTP_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrADHHImpl <em>bWr ADHH</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bWrADHHImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrADHH()
     * @generated
     */
    EClass BWR_ADHH = eINSTANCE.getbWrADHH();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_ADHH__VALUE = eINSTANCE.getbWrADHH_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_ADHH__NAME = eINSTANCE.getbWrADHH_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrADFFImpl <em>bWr ADFF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bWrADFFImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrADFF()
     * @generated
     */
    EClass BWR_ADFF = eINSTANCE.getbWrADFF();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_ADFF__VALUE = eINSTANCE.getbWrADFF_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_ADFF__NAME = eINSTANCE.getbWrADFF_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrBLFFImpl <em>bWr BLFF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bWrBLFFImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrBLFF()
     * @generated
     */
    EClass BWR_BLFF = eINSTANCE.getbWrBLFF();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_BLFF__VALUE = eINSTANCE.getbWrBLFF_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_BLFF__NAME = eINSTANCE.getbWrBLFF_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrADTWRImpl <em>bWr ADTWR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bWrADTWRImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrADTWR()
     * @generated
     */
    EClass BWR_ADTWR = eINSTANCE.getbWrADTWR();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_ADTWR__VALUE = eINSTANCE.getbWrADTWR_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_ADTWR__NAME = eINSTANCE.getbWrADTWR_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrFMTFFImpl <em>bWr FMTFF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bWrFMTFFImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrFMTFF()
     * @generated
     */
    EClass BWR_FMTFF = eINSTANCE.getbWrFMTFF();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_FMTFF__VALUE = eINSTANCE.getbWrFMTFF_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_FMTFF__NAME = eINSTANCE.getbWrFMTFF_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bWrACTImpl <em>bWr ACT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bWrACTImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbWrACT()
     * @generated
     */
    EClass BWR_ACT = eINSTANCE.getbWrACT();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_ACT__VALUE = eINSTANCE.getbWrACT_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BWR_ACT__NAME = eINSTANCE.getbWrACT_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bClockwiseImpl <em>bClockwise</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bClockwiseImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbClockwise()
     * @generated
     */
    EClass BCLOCKWISE = eINSTANCE.getbClockwise();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCLOCKWISE__VALUE = eINSTANCE.getbClockwise_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCLOCKWISE__NAME = eINSTANCE.getbClockwise_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.iScaleIECImpl <em>iScale IEC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.iScaleIECImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getiScaleIEC()
     * @generated
     */
    EClass ISCALE_IEC = eINSTANCE.getiScaleIEC();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISCALE_IEC__VALUE = eINSTANCE.getiScaleIEC_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISCALE_IEC__NAME = eINSTANCE.getiScaleIEC_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.iNumGrid_ZImpl <em>iNum Grid Z</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.iNumGrid_ZImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getiNumGrid_Z()
     * @generated
     */
    EClass INUM_GRID_Z = eINSTANCE.getiNumGrid_Z();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INUM_GRID_Z__VALUE = eINSTANCE.getiNumGrid_Z_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INUM_GRID_Z__NAME = eINSTANCE.getiNumGrid_Z_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.iNumGrid_YImpl <em>iNum Grid Y</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.iNumGrid_YImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getiNumGrid_Y()
     * @generated
     */
    EClass INUM_GRID_Y = eINSTANCE.getiNumGrid_Y();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INUM_GRID_Y__VALUE = eINSTANCE.getiNumGrid_Y_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INUM_GRID_Y__NAME = eINSTANCE.getiNumGrid_Y_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nTimeStepImpl <em>nTime Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nTimeStepImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnTimeStep()
     * @generated
     */
    EClass NTIME_STEP = eINSTANCE.getnTimeStep();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTIME_STEP__VALUE = eINSTANCE.getnTimeStep_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTIME_STEP__NAME = eINSTANCE.getnTimeStep_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nAnalysisTimeImpl <em>nAnalysis Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nAnalysisTimeImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnAnalysisTime()
     * @generated
     */
    EClass NANALYSIS_TIME = eINSTANCE.getnAnalysisTime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NANALYSIS_TIME__VALUE = eINSTANCE.getnAnalysisTime_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NANALYSIS_TIME__NAME = eINSTANCE.getnAnalysisTime_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nUsableTimeImpl <em>nUsable Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nUsableTimeImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnUsableTime()
     * @generated
     */
    EClass NUSABLE_TIME = eINSTANCE.getnUsableTime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUSABLE_TIME__VALUE = eINSTANCE.getnUsableTime_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUSABLE_TIME__NAME = eINSTANCE.getnUsableTime_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nHubHtImpl <em>nHub Ht</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nHubHtImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnHubHt()
     * @generated
     */
    EClass NHUB_HT = eINSTANCE.getnHubHt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NHUB_HT__VALUE = eINSTANCE.getnHubHt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NHUB_HT__NAME = eINSTANCE.getnHubHt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nGridHeightImpl <em>nGrid Height</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nGridHeightImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnGridHeight()
     * @generated
     */
    EClass NGRID_HEIGHT = eINSTANCE.getnGridHeight();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NGRID_HEIGHT__VALUE = eINSTANCE.getnGridHeight_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NGRID_HEIGHT__NAME = eINSTANCE.getnGridHeight_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nGridWidthImpl <em>nGrid Width</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nGridWidthImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnGridWidth()
     * @generated
     */
    EClass NGRID_WIDTH = eINSTANCE.getnGridWidth();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NGRID_WIDTH__VALUE = eINSTANCE.getnGridWidth_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NGRID_WIDTH__NAME = eINSTANCE.getnGridWidth_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nVFlowAngImpl <em>nV Flow Ang</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nVFlowAngImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnVFlowAng()
     * @generated
     */
    EClass NV_FLOW_ANG = eINSTANCE.getnVFlowAng();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NV_FLOW_ANG__VALUE = eINSTANCE.getnVFlowAng_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NV_FLOW_ANG__NAME = eINSTANCE.getnVFlowAng_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nHFlowAngImpl <em>nH Flow Ang</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nHFlowAngImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnHFlowAng()
     * @generated
     */
    EClass NH_FLOW_ANG = eINSTANCE.getnHFlowAng();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NH_FLOW_ANG__VALUE = eINSTANCE.getnHFlowAng_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NH_FLOW_ANG__NAME = eINSTANCE.getnHFlowAng_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.sTurbModelImpl <em>sTurb Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.sTurbModelImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsTurbModel()
     * @generated
     */
    EClass STURB_MODEL = eINSTANCE.getsTurbModel();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STURB_MODEL__VALUE = eINSTANCE.getsTurbModel_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STURB_MODEL__NAME = eINSTANCE.getsTurbModel_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.sIECstandardImpl <em>sIE Cstandard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.sIECstandardImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsIECstandard()
     * @generated
     */
    EClass SIE_CSTANDARD = eINSTANCE.getsIECstandard();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIE_CSTANDARD__VALUE = eINSTANCE.getsIECstandard_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIE_CSTANDARD__NAME = eINSTANCE.getsIECstandard_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.sIECturbcImpl <em>sIE Cturbc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.sIECturbcImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsIECturbc()
     * @generated
     */
    EClass SIE_CTURBC = eINSTANCE.getsIECturbc();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIE_CTURBC__VALUE = eINSTANCE.getsIECturbc_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIE_CTURBC__NAME = eINSTANCE.getsIECturbc_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.sIEC_WindTypeImpl <em>sIEC Wind Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.sIEC_WindTypeImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsIEC_WindType()
     * @generated
     */
    EClass SIEC_WIND_TYPE = eINSTANCE.getsIEC_WindType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIEC_WIND_TYPE__VALUE = eINSTANCE.getsIEC_WindType_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIEC_WIND_TYPE__NAME = eINSTANCE.getsIEC_WindType_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.sETMcImpl <em>sET Mc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.sETMcImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsETMc()
     * @generated
     */
    EClass SET_MC = eINSTANCE.getsETMc();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_MC__VALUE = eINSTANCE.getsETMc_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_MC__NAME = eINSTANCE.getsETMc_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.sWindProfileTypeImpl <em>sWind Profile Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.sWindProfileTypeImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsWindProfileType()
     * @generated
     */
    EClass SWIND_PROFILE_TYPE = eINSTANCE.getsWindProfileType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWIND_PROFILE_TYPE__VALUE = eINSTANCE.getsWindProfileType_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWIND_PROFILE_TYPE__NAME = eINSTANCE.getsWindProfileType_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nRefHtImpl <em>nRef Ht</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nRefHtImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnRefHt()
     * @generated
     */
    EClass NREF_HT = eINSTANCE.getnRefHt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NREF_HT__VALUE = eINSTANCE.getnRefHt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NREF_HT__NAME = eINSTANCE.getnRefHt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nUrefImpl <em>nUref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nUrefImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnUref()
     * @generated
     */
    EClass NUREF = eINSTANCE.getnUref();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUREF__VALUE = eINSTANCE.getnUref_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUREF__NAME = eINSTANCE.getnUref_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nZJetMaxImpl <em>nZ Jet Max</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nZJetMaxImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnZJetMax()
     * @generated
     */
    EClass NZ_JET_MAX = eINSTANCE.getnZJetMax();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NZ_JET_MAX__VALUE = eINSTANCE.getnZJetMax_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NZ_JET_MAX__NAME = eINSTANCE.getnZJetMax_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nPLExpImpl <em>nPL Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nPLExpImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnPLExp()
     * @generated
     */
    EClass NPL_EXP = eINSTANCE.getnPLExp();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPL_EXP__VALUE = eINSTANCE.getnPLExp_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPL_EXP__NAME = eINSTANCE.getnPLExp_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nZ0Impl <em>nZ0</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nZ0Impl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnZ0()
     * @generated
     */
    EClass NZ0 = eINSTANCE.getnZ0();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NZ0__VALUE = eINSTANCE.getnZ0_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NZ0__NAME = eINSTANCE.getnZ0_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nLocationImpl <em>nLocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nLocationImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnLocation()
     * @generated
     */
    EClass NLOCATION = eINSTANCE.getnLocation();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NLOCATION__VALUE = eINSTANCE.getnLocation_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NLOCATION__NAME = eINSTANCE.getnLocation_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nRICH_NOImpl <em>nRICH NO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nRICH_NOImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnRICH_NO()
     * @generated
     */
    EClass NRICH_NO = eINSTANCE.getnRICH_NO();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRICH_NO__VALUE = eINSTANCE.getnRICH_NO_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NRICH_NO__NAME = eINSTANCE.getnRICH_NO_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nUStarImpl <em>nU Star</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nUStarImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnUStar()
     * @generated
     */
    EClass NU_STAR = eINSTANCE.getnUStar();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NU_STAR__VALUE = eINSTANCE.getnUStar_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NU_STAR__NAME = eINSTANCE.getnUStar_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nZIImpl <em>nZI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nZIImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnZI()
     * @generated
     */
    EClass NZI = eINSTANCE.getnZI();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NZI__VALUE = eINSTANCE.getnZI_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NZI__NAME = eINSTANCE.getnZI_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nPC_UWImpl <em>nPC UW</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nPC_UWImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnPC_UW()
     * @generated
     */
    EClass NPC_UW = eINSTANCE.getnPC_UW();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPC_UW__VALUE = eINSTANCE.getnPC_UW_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPC_UW__NAME = eINSTANCE.getnPC_UW_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nPC_UVImpl <em>nPC UV</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nPC_UVImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnPC_UV()
     * @generated
     */
    EClass NPC_UV = eINSTANCE.getnPC_UV();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPC_UV__VALUE = eINSTANCE.getnPC_UV_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPC_UV__NAME = eINSTANCE.getnPC_UV_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nPC_VWImpl <em>nPC VW</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nPC_VWImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnPC_VW()
     * @generated
     */
    EClass NPC_VW = eINSTANCE.getnPC_VW();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPC_VW__VALUE = eINSTANCE.getnPC_VW_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NPC_VW__NAME = eINSTANCE.getnPC_VW_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nIncDec1Impl <em>nInc Dec1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nIncDec1Impl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnIncDec1()
     * @generated
     */
    EClass NINC_DEC1 = eINSTANCE.getnIncDec1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NINC_DEC1__VALUE = eINSTANCE.getnIncDec1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NINC_DEC1__NAME = eINSTANCE.getnIncDec1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nIncDec2Impl <em>nInc Dec2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nIncDec2Impl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnIncDec2()
     * @generated
     */
    EClass NINC_DEC2 = eINSTANCE.getnIncDec2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NINC_DEC2__VALUE = eINSTANCE.getnIncDec2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NINC_DEC2__NAME = eINSTANCE.getnIncDec2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nIncDec3Impl <em>nInc Dec3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nIncDec3Impl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnIncDec3()
     * @generated
     */
    EClass NINC_DEC3 = eINSTANCE.getnIncDec3();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NINC_DEC3__VALUE = eINSTANCE.getnIncDec3_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NINC_DEC3__NAME = eINSTANCE.getnIncDec3_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nCohExpImpl <em>nCoh Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nCohExpImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnCohExp()
     * @generated
     */
    EClass NCOH_EXP = eINSTANCE.getnCohExp();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCOH_EXP__VALUE = eINSTANCE.getnCohExp_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCOH_EXP__NAME = eINSTANCE.getnCohExp_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.sCTEventPathImpl <em>sCT Event Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.sCTEventPathImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsCTEventPath()
     * @generated
     */
    EClass SCT_EVENT_PATH = eINSTANCE.getsCTEventPath();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCT_EVENT_PATH__VALUE = eINSTANCE.getsCTEventPath_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCT_EVENT_PATH__NAME = eINSTANCE.getsCTEventPath_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.sCTEventFileImpl <em>sCT Event File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.sCTEventFileImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getsCTEventFile()
     * @generated
     */
    EClass SCT_EVENT_FILE = eINSTANCE.getsCTEventFile();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCT_EVENT_FILE__VALUE = eINSTANCE.getsCTEventFile_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCT_EVENT_FILE__NAME = eINSTANCE.getsCTEventFile_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.bRandomizeImpl <em>bRandomize</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.bRandomizeImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getbRandomize()
     * @generated
     */
    EClass BRANDOMIZE = eINSTANCE.getbRandomize();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANDOMIZE__VALUE = eINSTANCE.getbRandomize_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANDOMIZE__NAME = eINSTANCE.getbRandomize_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nDistSclImpl <em>nDist Scl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nDistSclImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnDistScl()
     * @generated
     */
    EClass NDIST_SCL = eINSTANCE.getnDistScl();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NDIST_SCL__VALUE = eINSTANCE.getnDistScl_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NDIST_SCL__NAME = eINSTANCE.getnDistScl_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nCTLyImpl <em>nCT Ly</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nCTLyImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnCTLy()
     * @generated
     */
    EClass NCT_LY = eINSTANCE.getnCTLy();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCT_LY__VALUE = eINSTANCE.getnCTLy_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCT_LY__NAME = eINSTANCE.getnCTLy_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nCTLzImpl <em>nCT Lz</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nCTLzImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnCTLz()
     * @generated
     */
    EClass NCT_LZ = eINSTANCE.getnCTLz();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCT_LZ__VALUE = eINSTANCE.getnCTLz_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCT_LZ__NAME = eINSTANCE.getnCTLz_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.nCTStartTimeImpl <em>nCT Start Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.nCTStartTimeImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getnCTStartTime()
     * @generated
     */
    EClass NCT_START_TIME = eINSTANCE.getnCTStartTime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCT_START_TIME__VALUE = eINSTANCE.getnCTStartTime_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NCT_START_TIME__NAME = eINSTANCE.getnCTStartTime_Name();

  }

} //TurbsimtbsPackage
