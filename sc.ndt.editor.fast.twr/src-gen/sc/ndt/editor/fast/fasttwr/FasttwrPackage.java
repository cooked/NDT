/**
 */
package sc.ndt.editor.fast.fasttwr;

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
 * @see sc.ndt.editor.fast.fasttwr.FasttwrFactory
 * @model kind="package"
 * @generated
 */
public interface FasttwrPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fasttwr";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/fast/Fasttwr";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fasttwr";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FasttwrPackage eINSTANCE = sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl <em>Model Fasttwr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getModelFasttwr()
   * @generated
   */
  int MODEL_FASTTWR = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__HEAD = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__SECTIONS = 1;

  /**
   * The feature id for the '<em><b>NTw Inp St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__NTW_INP_ST = 2;

  /**
   * The feature id for the '<em><b>Calc TMode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__CALC_TMODE = 3;

  /**
   * The feature id for the '<em><b>Bld Fl Dmp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__BLD_FL_DMP1 = 4;

  /**
   * The feature id for the '<em><b>Bld Fl Dmp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__BLD_FL_DMP2 = 5;

  /**
   * The feature id for the '<em><b>Bld Ed Dmp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__BLD_ED_DMP1 = 6;

  /**
   * The feature id for the '<em><b>Bld Ed Dmp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__BLD_ED_DMP2 = 7;

  /**
   * The feature id for the '<em><b>FA St Tunr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__FA_ST_TUNR1 = 8;

  /**
   * The feature id for the '<em><b>FA St Tunr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__FA_ST_TUNR2 = 9;

  /**
   * The feature id for the '<em><b>SS St Tunr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__SS_ST_TUNR1 = 10;

  /**
   * The feature id for the '<em><b>SS St Tunr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__SS_ST_TUNR2 = 11;

  /**
   * The feature id for the '<em><b>Adj Tw Ma</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__ADJ_TW_MA = 12;

  /**
   * The feature id for the '<em><b>Adj FA St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__ADJ_FA_ST = 13;

  /**
   * The feature id for the '<em><b>Adj SS St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__ADJ_SS_ST = 14;

  /**
   * The feature id for the '<em><b>Twr Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TWR_STAT = 15;

  /**
   * The feature id for the '<em><b>Tw FAM1 Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM1_SH2 = 16;

  /**
   * The feature id for the '<em><b>Tw FAM1 Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM1_SH3 = 17;

  /**
   * The feature id for the '<em><b>Tw FAM1 Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM1_SH4 = 18;

  /**
   * The feature id for the '<em><b>Tw FAM1 Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM1_SH5 = 19;

  /**
   * The feature id for the '<em><b>Tw FAM1 Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM1_SH6 = 20;

  /**
   * The feature id for the '<em><b>Tw FAM2 Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM2_SH2 = 21;

  /**
   * The feature id for the '<em><b>Tw FAM2 Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM2_SH3 = 22;

  /**
   * The feature id for the '<em><b>Tw FAM2 Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM2_SH4 = 23;

  /**
   * The feature id for the '<em><b>Tw FAM2 Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM2_SH5 = 24;

  /**
   * The feature id for the '<em><b>Tw FAM2 Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_FAM2_SH6 = 25;

  /**
   * The feature id for the '<em><b>Tw SSM1 Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM1_SH2 = 26;

  /**
   * The feature id for the '<em><b>Tw SSM1 Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM1_SH3 = 27;

  /**
   * The feature id for the '<em><b>Tw SSM1 Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM1_SH4 = 28;

  /**
   * The feature id for the '<em><b>Tw SSM1 Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM1_SH5 = 29;

  /**
   * The feature id for the '<em><b>Tw SSM1 Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM1_SH6 = 30;

  /**
   * The feature id for the '<em><b>Tw SSM2 Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM2_SH2 = 31;

  /**
   * The feature id for the '<em><b>Tw SSM2 Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM2_SH3 = 32;

  /**
   * The feature id for the '<em><b>Tw SSM2 Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM2_SH4 = 33;

  /**
   * The feature id for the '<em><b>Tw SSM2 Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM2_SH5 = 34;

  /**
   * The feature id for the '<em><b>Tw SSM2 Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR__TW_SSM2_SH6 = 35;

  /**
   * The number of structural features of the '<em>Model Fasttwr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTTWR_FEATURE_COUNT = 36;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.HeaderImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getHeader()
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
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.SectionImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getSection()
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
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nNTwInpStImpl <em>nN Tw Inp St</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nNTwInpStImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnNTwInpSt()
   * @generated
   */
  int NN_TW_INP_ST = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_TW_INP_ST__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_TW_INP_ST__NAME = 1;

  /**
   * The number of structural features of the '<em>nN Tw Inp St</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_TW_INP_ST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.bCalcTModeImpl <em>bCalc TMode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.bCalcTModeImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getbCalcTMode()
   * @generated
   */
  int BCALC_TMODE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_TMODE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_TMODE__NAME = 1;

  /**
   * The number of structural features of the '<em>bCalc TMode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_TMODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwrFADmp1Impl <em>nTwr FA Dmp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwrFADmp1Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwrFADmp1()
   * @generated
   */
  int NTWR_FA_DMP1 = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_FA_DMP1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_FA_DMP1__NAME = 1;

  /**
   * The number of structural features of the '<em>nTwr FA Dmp1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_FA_DMP1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwrFADmp2Impl <em>nTwr FA Dmp2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwrFADmp2Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwrFADmp2()
   * @generated
   */
  int NTWR_FA_DMP2 = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_FA_DMP2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_FA_DMP2__NAME = 1;

  /**
   * The number of structural features of the '<em>nTwr FA Dmp2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_FA_DMP2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwrSSDmp1Impl <em>nTwr SS Dmp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwrSSDmp1Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwrSSDmp1()
   * @generated
   */
  int NTWR_SS_DMP1 = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SS_DMP1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SS_DMP1__NAME = 1;

  /**
   * The number of structural features of the '<em>nTwr SS Dmp1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SS_DMP1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwrSSDmp2Impl <em>nTwr SS Dmp2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwrSSDmp2Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwrSSDmp2()
   * @generated
   */
  int NTWR_SS_DMP2 = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SS_DMP2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SS_DMP2__NAME = 1;

  /**
   * The number of structural features of the '<em>nTwr SS Dmp2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTWR_SS_DMP2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nFAStTunr1Impl <em>nFA St Tunr1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nFAStTunr1Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnFAStTunr1()
   * @generated
   */
  int NFA_ST_TUNR1 = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFA_ST_TUNR1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFA_ST_TUNR1__NAME = 1;

  /**
   * The number of structural features of the '<em>nFA St Tunr1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFA_ST_TUNR1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nFAStTunr2Impl <em>nFA St Tunr2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nFAStTunr2Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnFAStTunr2()
   * @generated
   */
  int NFA_ST_TUNR2 = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFA_ST_TUNR2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFA_ST_TUNR2__NAME = 1;

  /**
   * The number of structural features of the '<em>nFA St Tunr2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFA_ST_TUNR2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nSSStTunr1Impl <em>nSS St Tunr1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nSSStTunr1Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnSSStTunr1()
   * @generated
   */
  int NSS_ST_TUNR1 = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSS_ST_TUNR1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSS_ST_TUNR1__NAME = 1;

  /**
   * The number of structural features of the '<em>nSS St Tunr1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSS_ST_TUNR1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nSSStTunr2Impl <em>nSS St Tunr2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nSSStTunr2Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnSSStTunr2()
   * @generated
   */
  int NSS_ST_TUNR2 = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSS_ST_TUNR2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSS_ST_TUNR2__NAME = 1;

  /**
   * The number of structural features of the '<em>nSS St Tunr2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NSS_ST_TUNR2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.AdjTwMaImpl <em>Adj Tw Ma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.AdjTwMaImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getAdjTwMa()
   * @generated
   */
  int ADJ_TW_MA = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_TW_MA__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_TW_MA__NAME = 1;

  /**
   * The number of structural features of the '<em>Adj Tw Ma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_TW_MA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.AdjFAStImpl <em>Adj FA St</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.AdjFAStImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getAdjFASt()
   * @generated
   */
  int ADJ_FA_ST = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_FA_ST__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_FA_ST__NAME = 1;

  /**
   * The number of structural features of the '<em>Adj FA St</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_FA_ST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.AdjSSStImpl <em>Adj SS St</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.AdjSSStImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getAdjSSSt()
   * @generated
   */
  int ADJ_SS_ST = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_SS_ST__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_SS_ST__NAME = 1;

  /**
   * The number of structural features of the '<em>Adj SS St</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_SS_ST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh2Impl <em>nTw FAM1 Sh2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh2Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh2()
   * @generated
   */
  int NTW_FAM1_SH2 = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH2__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM1 Sh2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh3Impl <em>nTw FAM1 Sh3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh3Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh3()
   * @generated
   */
  int NTW_FAM1_SH3 = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH3__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM1 Sh3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh4Impl <em>nTw FAM1 Sh4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh4Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh4()
   * @generated
   */
  int NTW_FAM1_SH4 = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH4__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH4__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM1 Sh4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH4_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh5Impl <em>nTw FAM1 Sh5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh5Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh5()
   * @generated
   */
  int NTW_FAM1_SH5 = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH5__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH5__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM1 Sh5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH5_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh6Impl <em>nTw FAM1 Sh6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh6Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh6()
   * @generated
   */
  int NTW_FAM1_SH6 = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH6__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH6__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM1 Sh6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM1_SH6_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh2Impl <em>nTw FAM2 Sh2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh2Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh2()
   * @generated
   */
  int NTW_FAM2_SH2 = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH2__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM2 Sh2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh3Impl <em>nTw FAM2 Sh3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh3Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh3()
   * @generated
   */
  int NTW_FAM2_SH3 = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH3__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM2 Sh3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh4Impl <em>nTw FAM2 Sh4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh4Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh4()
   * @generated
   */
  int NTW_FAM2_SH4 = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH4__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH4__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM2 Sh4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH4_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh5Impl <em>nTw FAM2 Sh5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh5Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh5()
   * @generated
   */
  int NTW_FAM2_SH5 = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH5__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH5__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM2 Sh5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH5_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh6Impl <em>nTw FAM2 Sh6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh6Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh6()
   * @generated
   */
  int NTW_FAM2_SH6 = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH6__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH6__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw FAM2 Sh6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_FAM2_SH6_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh2Impl <em>nTw SSM1 Sh2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh2Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh2()
   * @generated
   */
  int NTW_SSM1_SH2 = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH2__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM1 Sh2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh3Impl <em>nTw SSM1 Sh3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh3Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh3()
   * @generated
   */
  int NTW_SSM1_SH3 = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH3__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM1 Sh3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh4Impl <em>nTw SSM1 Sh4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh4Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh4()
   * @generated
   */
  int NTW_SSM1_SH4 = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH4__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH4__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM1 Sh4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH4_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh5Impl <em>nTw SSM1 Sh5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh5Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh5()
   * @generated
   */
  int NTW_SSM1_SH5 = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH5__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH5__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM1 Sh5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH5_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh6Impl <em>nTw SSM1 Sh6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh6Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh6()
   * @generated
   */
  int NTW_SSM1_SH6 = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH6__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH6__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM1 Sh6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM1_SH6_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh2Impl <em>nTw SSM2 Sh2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh2Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh2()
   * @generated
   */
  int NTW_SSM2_SH2 = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH2__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM2 Sh2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh3Impl <em>nTw SSM2 Sh3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh3Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh3()
   * @generated
   */
  int NTW_SSM2_SH3 = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH3__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM2 Sh3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh4Impl <em>nTw SSM2 Sh4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh4Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh4()
   * @generated
   */
  int NTW_SSM2_SH4 = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH4__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH4__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM2 Sh4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH4_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh5Impl <em>nTw SSM2 Sh5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh5Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh5()
   * @generated
   */
  int NTW_SSM2_SH5 = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH5__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH5__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM2 Sh5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH5_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh6Impl <em>nTw SSM2 Sh6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh6Impl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh6()
   * @generated
   */
  int NTW_SSM2_SH6 = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH6__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH6__NAME = 1;

  /**
   * The number of structural features of the '<em>nTw SSM2 Sh6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NTW_SSM2_SH6_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl <em>aTwr Stat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl
   * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getaTwrStat()
   * @generated
   */
  int ATWR_STAT = 36;

  /**
   * The feature id for the '<em><b>Ht Fract</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__HT_FRACT = 0;

  /**
   * The feature id for the '<em><b>TMass Den</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TMASS_DEN = 1;

  /**
   * The feature id for the '<em><b>Tw FA Stif</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TW_FA_STIF = 2;

  /**
   * The feature id for the '<em><b>Tw SS Stif</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TW_SS_STIF = 3;

  /**
   * The feature id for the '<em><b>Tw GJ Stif</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TW_GJ_STIF = 4;

  /**
   * The feature id for the '<em><b>Tw EA Stif</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TW_EA_STIF = 5;

  /**
   * The feature id for the '<em><b>Tw FA Iner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TW_FA_INER = 6;

  /**
   * The feature id for the '<em><b>Tw SS Iner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TW_SS_INER = 7;

  /**
   * The feature id for the '<em><b>Tw FAcg Of</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TW_FACG_OF = 8;

  /**
   * The feature id for the '<em><b>Tw SScg Of</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT__TW_SSCG_OF = 9;

  /**
   * The number of structural features of the '<em>aTwr Stat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATWR_STAT_FEATURE_COUNT = 10;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr <em>Model Fasttwr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Fasttwr</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr
   * @generated
   */
  EClass getModelFasttwr();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getHead()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_Head();

  /**
   * Returns the meta object for the containment reference list '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getSections()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_Sections();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getNTwInpSt <em>NTw Inp St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>NTw Inp St</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getNTwInpSt()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_NTwInpSt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getCalcTMode <em>Calc TMode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Calc TMode</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getCalcTMode()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_CalcTMode();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getBldFlDmp1 <em>Bld Fl Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl Dmp1</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getBldFlDmp1()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_BldFlDmp1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getBldFlDmp2 <em>Bld Fl Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl Dmp2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getBldFlDmp2()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_BldFlDmp2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getBldEdDmp1 <em>Bld Ed Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Ed Dmp1</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getBldEdDmp1()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_BldEdDmp1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getBldEdDmp2 <em>Bld Ed Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Ed Dmp2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getBldEdDmp2()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_BldEdDmp2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getFAStTunr1 <em>FA St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>FA St Tunr1</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getFAStTunr1()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_FAStTunr1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getFAStTunr2 <em>FA St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>FA St Tunr2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getFAStTunr2()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_FAStTunr2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getSSStTunr1 <em>SS St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SS St Tunr1</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getSSStTunr1()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_SSStTunr1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getSSStTunr2 <em>SS St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SS St Tunr2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getSSStTunr2()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_SSStTunr2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getAdjTwMa <em>Adj Tw Ma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adj Tw Ma</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getAdjTwMa()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_AdjTwMa();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getAdjFASt <em>Adj FA St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adj FA St</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getAdjFASt()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_AdjFASt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getAdjSSSt <em>Adj SS St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adj SS St</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getAdjSSSt()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_AdjSSSt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwrStat <em>Twr Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twr Stat</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwrStat()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwrStat();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh2 <em>Tw FAM1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM1 Sh2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh2()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM1Sh2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh3 <em>Tw FAM1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM1 Sh3</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh3()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM1Sh3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh4 <em>Tw FAM1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM1 Sh4</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh4()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM1Sh4();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh5 <em>Tw FAM1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM1 Sh5</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh5()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM1Sh5();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh6 <em>Tw FAM1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM1 Sh6</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM1Sh6()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM1Sh6();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh2 <em>Tw FAM2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM2 Sh2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh2()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM2Sh2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh3 <em>Tw FAM2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM2 Sh3</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh3()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM2Sh3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh4 <em>Tw FAM2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM2 Sh4</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh4()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM2Sh4();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh5 <em>Tw FAM2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM2 Sh5</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh5()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM2Sh5();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh6 <em>Tw FAM2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw FAM2 Sh6</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwFAM2Sh6()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwFAM2Sh6();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh2 <em>Tw SSM1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM1 Sh2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh2()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM1Sh2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh3 <em>Tw SSM1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM1 Sh3</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh3()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM1Sh3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh4 <em>Tw SSM1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM1 Sh4</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh4()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM1Sh4();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh5 <em>Tw SSM1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM1 Sh5</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh5()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM1Sh5();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh6 <em>Tw SSM1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM1 Sh6</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM1Sh6()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM1Sh6();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh2 <em>Tw SSM2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM2 Sh2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh2()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM2Sh2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh3 <em>Tw SSM2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM2 Sh3</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh3()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM2Sh3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh4 <em>Tw SSM2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM2 Sh4</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh4()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM2Sh4();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh5 <em>Tw SSM2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM2 Sh5</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh5()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM2Sh5();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh6 <em>Tw SSM2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tw SSM2 Sh6</em>'.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr#getTwSSM2Sh6()
   * @see #getModelFasttwr()
   * @generated
   */
  EReference getModelFasttwr_TwSSM2Sh6();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.fast.fasttwr.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.Header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.Header#getName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see sc.ndt.editor.fast.fasttwr.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nNTwInpSt <em>nN Tw Inp St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nN Tw Inp St</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nNTwInpSt
   * @generated
   */
  EClass getnNTwInpSt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nNTwInpSt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nNTwInpSt#getValue()
   * @see #getnNTwInpSt()
   * @generated
   */
  EAttribute getnNTwInpSt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nNTwInpSt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nNTwInpSt#getName()
   * @see #getnNTwInpSt()
   * @generated
   */
  EAttribute getnNTwInpSt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.bCalcTMode <em>bCalc TMode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bCalc TMode</em>'.
   * @see sc.ndt.editor.fast.fasttwr.bCalcTMode
   * @generated
   */
  EClass getbCalcTMode();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.bCalcTMode#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.bCalcTMode#isValue()
   * @see #getbCalcTMode()
   * @generated
   */
  EAttribute getbCalcTMode_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.bCalcTMode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.bCalcTMode#getName()
   * @see #getbCalcTMode()
   * @generated
   */
  EAttribute getbCalcTMode_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwrFADmp1 <em>nTwr FA Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTwr FA Dmp1</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrFADmp1
   * @generated
   */
  EClass getnTwrFADmp1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwrFADmp1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrFADmp1#getValue()
   * @see #getnTwrFADmp1()
   * @generated
   */
  EAttribute getnTwrFADmp1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwrFADmp1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrFADmp1#getName()
   * @see #getnTwrFADmp1()
   * @generated
   */
  EAttribute getnTwrFADmp1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwrFADmp2 <em>nTwr FA Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTwr FA Dmp2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrFADmp2
   * @generated
   */
  EClass getnTwrFADmp2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwrFADmp2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrFADmp2#getValue()
   * @see #getnTwrFADmp2()
   * @generated
   */
  EAttribute getnTwrFADmp2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwrFADmp2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrFADmp2#getName()
   * @see #getnTwrFADmp2()
   * @generated
   */
  EAttribute getnTwrFADmp2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwrSSDmp1 <em>nTwr SS Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTwr SS Dmp1</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrSSDmp1
   * @generated
   */
  EClass getnTwrSSDmp1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwrSSDmp1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrSSDmp1#getValue()
   * @see #getnTwrSSDmp1()
   * @generated
   */
  EAttribute getnTwrSSDmp1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwrSSDmp1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrSSDmp1#getName()
   * @see #getnTwrSSDmp1()
   * @generated
   */
  EAttribute getnTwrSSDmp1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwrSSDmp2 <em>nTwr SS Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTwr SS Dmp2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrSSDmp2
   * @generated
   */
  EClass getnTwrSSDmp2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwrSSDmp2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrSSDmp2#getValue()
   * @see #getnTwrSSDmp2()
   * @generated
   */
  EAttribute getnTwrSSDmp2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwrSSDmp2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwrSSDmp2#getName()
   * @see #getnTwrSSDmp2()
   * @generated
   */
  EAttribute getnTwrSSDmp2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nFAStTunr1 <em>nFA St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nFA St Tunr1</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nFAStTunr1
   * @generated
   */
  EClass getnFAStTunr1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nFAStTunr1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nFAStTunr1#getValue()
   * @see #getnFAStTunr1()
   * @generated
   */
  EAttribute getnFAStTunr1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nFAStTunr1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nFAStTunr1#getName()
   * @see #getnFAStTunr1()
   * @generated
   */
  EAttribute getnFAStTunr1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nFAStTunr2 <em>nFA St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nFA St Tunr2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nFAStTunr2
   * @generated
   */
  EClass getnFAStTunr2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nFAStTunr2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nFAStTunr2#getValue()
   * @see #getnFAStTunr2()
   * @generated
   */
  EAttribute getnFAStTunr2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nFAStTunr2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nFAStTunr2#getName()
   * @see #getnFAStTunr2()
   * @generated
   */
  EAttribute getnFAStTunr2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nSSStTunr1 <em>nSS St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSS St Tunr1</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nSSStTunr1
   * @generated
   */
  EClass getnSSStTunr1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nSSStTunr1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nSSStTunr1#getValue()
   * @see #getnSSStTunr1()
   * @generated
   */
  EAttribute getnSSStTunr1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nSSStTunr1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nSSStTunr1#getName()
   * @see #getnSSStTunr1()
   * @generated
   */
  EAttribute getnSSStTunr1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nSSStTunr2 <em>nSS St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nSS St Tunr2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nSSStTunr2
   * @generated
   */
  EClass getnSSStTunr2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nSSStTunr2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nSSStTunr2#getValue()
   * @see #getnSSStTunr2()
   * @generated
   */
  EAttribute getnSSStTunr2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nSSStTunr2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nSSStTunr2#getName()
   * @see #getnSSStTunr2()
   * @generated
   */
  EAttribute getnSSStTunr2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.AdjTwMa <em>Adj Tw Ma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adj Tw Ma</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjTwMa
   * @generated
   */
  EClass getAdjTwMa();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.AdjTwMa#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjTwMa#getValue()
   * @see #getAdjTwMa()
   * @generated
   */
  EAttribute getAdjTwMa_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.AdjTwMa#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjTwMa#getName()
   * @see #getAdjTwMa()
   * @generated
   */
  EAttribute getAdjTwMa_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.AdjFASt <em>Adj FA St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adj FA St</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjFASt
   * @generated
   */
  EClass getAdjFASt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.AdjFASt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjFASt#getValue()
   * @see #getAdjFASt()
   * @generated
   */
  EAttribute getAdjFASt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.AdjFASt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjFASt#getName()
   * @see #getAdjFASt()
   * @generated
   */
  EAttribute getAdjFASt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.AdjSSSt <em>Adj SS St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adj SS St</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjSSSt
   * @generated
   */
  EClass getAdjSSSt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.AdjSSSt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjSSSt#getValue()
   * @see #getAdjSSSt()
   * @generated
   */
  EAttribute getAdjSSSt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.AdjSSSt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.AdjSSSt#getName()
   * @see #getAdjSSSt()
   * @generated
   */
  EAttribute getAdjSSSt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2 <em>nTw FAM1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM1 Sh2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2
   * @generated
   */
  EClass getnTwFAM1Sh2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2#getValue()
   * @see #getnTwFAM1Sh2()
   * @generated
   */
  EAttribute getnTwFAM1Sh2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2#getName()
   * @see #getnTwFAM1Sh2()
   * @generated
   */
  EAttribute getnTwFAM1Sh2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3 <em>nTw FAM1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM1 Sh3</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3
   * @generated
   */
  EClass getnTwFAM1Sh3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3#getValue()
   * @see #getnTwFAM1Sh3()
   * @generated
   */
  EAttribute getnTwFAM1Sh3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3#getName()
   * @see #getnTwFAM1Sh3()
   * @generated
   */
  EAttribute getnTwFAM1Sh3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4 <em>nTw FAM1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM1 Sh4</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4
   * @generated
   */
  EClass getnTwFAM1Sh4();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4#getValue()
   * @see #getnTwFAM1Sh4()
   * @generated
   */
  EAttribute getnTwFAM1Sh4_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4#getName()
   * @see #getnTwFAM1Sh4()
   * @generated
   */
  EAttribute getnTwFAM1Sh4_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5 <em>nTw FAM1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM1 Sh5</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5
   * @generated
   */
  EClass getnTwFAM1Sh5();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5#getValue()
   * @see #getnTwFAM1Sh5()
   * @generated
   */
  EAttribute getnTwFAM1Sh5_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5#getName()
   * @see #getnTwFAM1Sh5()
   * @generated
   */
  EAttribute getnTwFAM1Sh5_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6 <em>nTw FAM1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM1 Sh6</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6
   * @generated
   */
  EClass getnTwFAM1Sh6();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6#getValue()
   * @see #getnTwFAM1Sh6()
   * @generated
   */
  EAttribute getnTwFAM1Sh6_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6#getName()
   * @see #getnTwFAM1Sh6()
   * @generated
   */
  EAttribute getnTwFAM1Sh6_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2 <em>nTw FAM2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM2 Sh2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2
   * @generated
   */
  EClass getnTwFAM2Sh2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2#getValue()
   * @see #getnTwFAM2Sh2()
   * @generated
   */
  EAttribute getnTwFAM2Sh2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2#getName()
   * @see #getnTwFAM2Sh2()
   * @generated
   */
  EAttribute getnTwFAM2Sh2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3 <em>nTw FAM2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM2 Sh3</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3
   * @generated
   */
  EClass getnTwFAM2Sh3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3#getValue()
   * @see #getnTwFAM2Sh3()
   * @generated
   */
  EAttribute getnTwFAM2Sh3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3#getName()
   * @see #getnTwFAM2Sh3()
   * @generated
   */
  EAttribute getnTwFAM2Sh3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4 <em>nTw FAM2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM2 Sh4</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4
   * @generated
   */
  EClass getnTwFAM2Sh4();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4#getValue()
   * @see #getnTwFAM2Sh4()
   * @generated
   */
  EAttribute getnTwFAM2Sh4_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4#getName()
   * @see #getnTwFAM2Sh4()
   * @generated
   */
  EAttribute getnTwFAM2Sh4_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5 <em>nTw FAM2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM2 Sh5</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5
   * @generated
   */
  EClass getnTwFAM2Sh5();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5#getValue()
   * @see #getnTwFAM2Sh5()
   * @generated
   */
  EAttribute getnTwFAM2Sh5_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5#getName()
   * @see #getnTwFAM2Sh5()
   * @generated
   */
  EAttribute getnTwFAM2Sh5_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6 <em>nTw FAM2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw FAM2 Sh6</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6
   * @generated
   */
  EClass getnTwFAM2Sh6();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6#getValue()
   * @see #getnTwFAM2Sh6()
   * @generated
   */
  EAttribute getnTwFAM2Sh6_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6#getName()
   * @see #getnTwFAM2Sh6()
   * @generated
   */
  EAttribute getnTwFAM2Sh6_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2 <em>nTw SSM1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM1 Sh2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2
   * @generated
   */
  EClass getnTwSSM1Sh2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2#getValue()
   * @see #getnTwSSM1Sh2()
   * @generated
   */
  EAttribute getnTwSSM1Sh2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2#getName()
   * @see #getnTwSSM1Sh2()
   * @generated
   */
  EAttribute getnTwSSM1Sh2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3 <em>nTw SSM1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM1 Sh3</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3
   * @generated
   */
  EClass getnTwSSM1Sh3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3#getValue()
   * @see #getnTwSSM1Sh3()
   * @generated
   */
  EAttribute getnTwSSM1Sh3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3#getName()
   * @see #getnTwSSM1Sh3()
   * @generated
   */
  EAttribute getnTwSSM1Sh3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4 <em>nTw SSM1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM1 Sh4</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4
   * @generated
   */
  EClass getnTwSSM1Sh4();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4#getValue()
   * @see #getnTwSSM1Sh4()
   * @generated
   */
  EAttribute getnTwSSM1Sh4_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4#getName()
   * @see #getnTwSSM1Sh4()
   * @generated
   */
  EAttribute getnTwSSM1Sh4_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5 <em>nTw SSM1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM1 Sh5</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5
   * @generated
   */
  EClass getnTwSSM1Sh5();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5#getValue()
   * @see #getnTwSSM1Sh5()
   * @generated
   */
  EAttribute getnTwSSM1Sh5_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5#getName()
   * @see #getnTwSSM1Sh5()
   * @generated
   */
  EAttribute getnTwSSM1Sh5_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6 <em>nTw SSM1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM1 Sh6</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6
   * @generated
   */
  EClass getnTwSSM1Sh6();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6#getValue()
   * @see #getnTwSSM1Sh6()
   * @generated
   */
  EAttribute getnTwSSM1Sh6_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6#getName()
   * @see #getnTwSSM1Sh6()
   * @generated
   */
  EAttribute getnTwSSM1Sh6_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2 <em>nTw SSM2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM2 Sh2</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2
   * @generated
   */
  EClass getnTwSSM2Sh2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2#getValue()
   * @see #getnTwSSM2Sh2()
   * @generated
   */
  EAttribute getnTwSSM2Sh2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2#getName()
   * @see #getnTwSSM2Sh2()
   * @generated
   */
  EAttribute getnTwSSM2Sh2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3 <em>nTw SSM2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM2 Sh3</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3
   * @generated
   */
  EClass getnTwSSM2Sh3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3#getValue()
   * @see #getnTwSSM2Sh3()
   * @generated
   */
  EAttribute getnTwSSM2Sh3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3#getName()
   * @see #getnTwSSM2Sh3()
   * @generated
   */
  EAttribute getnTwSSM2Sh3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4 <em>nTw SSM2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM2 Sh4</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4
   * @generated
   */
  EClass getnTwSSM2Sh4();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4#getValue()
   * @see #getnTwSSM2Sh4()
   * @generated
   */
  EAttribute getnTwSSM2Sh4_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4#getName()
   * @see #getnTwSSM2Sh4()
   * @generated
   */
  EAttribute getnTwSSM2Sh4_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5 <em>nTw SSM2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM2 Sh5</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5
   * @generated
   */
  EClass getnTwSSM2Sh5();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5#getValue()
   * @see #getnTwSSM2Sh5()
   * @generated
   */
  EAttribute getnTwSSM2Sh5_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5#getName()
   * @see #getnTwSSM2Sh5()
   * @generated
   */
  EAttribute getnTwSSM2Sh5_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6 <em>nTw SSM2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nTw SSM2 Sh6</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6
   * @generated
   */
  EClass getnTwSSM2Sh6();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6#getValue()
   * @see #getnTwSSM2Sh6()
   * @generated
   */
  EAttribute getnTwSSM2Sh6_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6#getName()
   * @see #getnTwSSM2Sh6()
   * @generated
   */
  EAttribute getnTwSSM2Sh6_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fasttwr.aTwrStat <em>aTwr Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aTwr Stat</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat
   * @generated
   */
  EClass getaTwrStat();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getHtFract <em>Ht Fract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ht Fract</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getHtFract()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_HtFract();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTMassDen <em>TMass Den</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>TMass Den</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTMassDen()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TMassDen();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTwFAStif <em>Tw FA Stif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw FA Stif</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTwFAStif()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TwFAStif();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTwSSStif <em>Tw SS Stif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw SS Stif</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTwSSStif()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TwSSStif();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTwGJStif <em>Tw GJ Stif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw GJ Stif</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTwGJStif()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TwGJStif();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTwEAStif <em>Tw EA Stif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw EA Stif</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTwEAStif()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TwEAStif();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTwFAIner <em>Tw FA Iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw FA Iner</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTwFAIner()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TwFAIner();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTwSSIner <em>Tw SS Iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw SS Iner</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTwSSIner()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TwSSIner();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTwFAcgOf <em>Tw FAcg Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw FAcg Of</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTwFAcgOf()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TwFAcgOf();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fasttwr.aTwrStat#getTwSScgOf <em>Tw SScg Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw SScg Of</em>'.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat#getTwSScgOf()
   * @see #getaTwrStat()
   * @generated
   */
  EAttribute getaTwrStat_TwSScgOf();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FasttwrFactory getFasttwrFactory();

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
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl <em>Model Fasttwr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.ModelFasttwrImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getModelFasttwr()
     * @generated
     */
    EClass MODEL_FASTTWR = eINSTANCE.getModelFasttwr();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__HEAD = eINSTANCE.getModelFasttwr_Head();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__SECTIONS = eINSTANCE.getModelFasttwr_Sections();

    /**
     * The meta object literal for the '<em><b>NTw Inp St</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__NTW_INP_ST = eINSTANCE.getModelFasttwr_NTwInpSt();

    /**
     * The meta object literal for the '<em><b>Calc TMode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__CALC_TMODE = eINSTANCE.getModelFasttwr_CalcTMode();

    /**
     * The meta object literal for the '<em><b>Bld Fl Dmp1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__BLD_FL_DMP1 = eINSTANCE.getModelFasttwr_BldFlDmp1();

    /**
     * The meta object literal for the '<em><b>Bld Fl Dmp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__BLD_FL_DMP2 = eINSTANCE.getModelFasttwr_BldFlDmp2();

    /**
     * The meta object literal for the '<em><b>Bld Ed Dmp1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__BLD_ED_DMP1 = eINSTANCE.getModelFasttwr_BldEdDmp1();

    /**
     * The meta object literal for the '<em><b>Bld Ed Dmp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__BLD_ED_DMP2 = eINSTANCE.getModelFasttwr_BldEdDmp2();

    /**
     * The meta object literal for the '<em><b>FA St Tunr1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__FA_ST_TUNR1 = eINSTANCE.getModelFasttwr_FAStTunr1();

    /**
     * The meta object literal for the '<em><b>FA St Tunr2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__FA_ST_TUNR2 = eINSTANCE.getModelFasttwr_FAStTunr2();

    /**
     * The meta object literal for the '<em><b>SS St Tunr1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__SS_ST_TUNR1 = eINSTANCE.getModelFasttwr_SSStTunr1();

    /**
     * The meta object literal for the '<em><b>SS St Tunr2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__SS_ST_TUNR2 = eINSTANCE.getModelFasttwr_SSStTunr2();

    /**
     * The meta object literal for the '<em><b>Adj Tw Ma</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__ADJ_TW_MA = eINSTANCE.getModelFasttwr_AdjTwMa();

    /**
     * The meta object literal for the '<em><b>Adj FA St</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__ADJ_FA_ST = eINSTANCE.getModelFasttwr_AdjFASt();

    /**
     * The meta object literal for the '<em><b>Adj SS St</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__ADJ_SS_ST = eINSTANCE.getModelFasttwr_AdjSSSt();

    /**
     * The meta object literal for the '<em><b>Twr Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TWR_STAT = eINSTANCE.getModelFasttwr_TwrStat();

    /**
     * The meta object literal for the '<em><b>Tw FAM1 Sh2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM1_SH2 = eINSTANCE.getModelFasttwr_TwFAM1Sh2();

    /**
     * The meta object literal for the '<em><b>Tw FAM1 Sh3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM1_SH3 = eINSTANCE.getModelFasttwr_TwFAM1Sh3();

    /**
     * The meta object literal for the '<em><b>Tw FAM1 Sh4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM1_SH4 = eINSTANCE.getModelFasttwr_TwFAM1Sh4();

    /**
     * The meta object literal for the '<em><b>Tw FAM1 Sh5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM1_SH5 = eINSTANCE.getModelFasttwr_TwFAM1Sh5();

    /**
     * The meta object literal for the '<em><b>Tw FAM1 Sh6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM1_SH6 = eINSTANCE.getModelFasttwr_TwFAM1Sh6();

    /**
     * The meta object literal for the '<em><b>Tw FAM2 Sh2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM2_SH2 = eINSTANCE.getModelFasttwr_TwFAM2Sh2();

    /**
     * The meta object literal for the '<em><b>Tw FAM2 Sh3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM2_SH3 = eINSTANCE.getModelFasttwr_TwFAM2Sh3();

    /**
     * The meta object literal for the '<em><b>Tw FAM2 Sh4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM2_SH4 = eINSTANCE.getModelFasttwr_TwFAM2Sh4();

    /**
     * The meta object literal for the '<em><b>Tw FAM2 Sh5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM2_SH5 = eINSTANCE.getModelFasttwr_TwFAM2Sh5();

    /**
     * The meta object literal for the '<em><b>Tw FAM2 Sh6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_FAM2_SH6 = eINSTANCE.getModelFasttwr_TwFAM2Sh6();

    /**
     * The meta object literal for the '<em><b>Tw SSM1 Sh2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM1_SH2 = eINSTANCE.getModelFasttwr_TwSSM1Sh2();

    /**
     * The meta object literal for the '<em><b>Tw SSM1 Sh3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM1_SH3 = eINSTANCE.getModelFasttwr_TwSSM1Sh3();

    /**
     * The meta object literal for the '<em><b>Tw SSM1 Sh4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM1_SH4 = eINSTANCE.getModelFasttwr_TwSSM1Sh4();

    /**
     * The meta object literal for the '<em><b>Tw SSM1 Sh5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM1_SH5 = eINSTANCE.getModelFasttwr_TwSSM1Sh5();

    /**
     * The meta object literal for the '<em><b>Tw SSM1 Sh6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM1_SH6 = eINSTANCE.getModelFasttwr_TwSSM1Sh6();

    /**
     * The meta object literal for the '<em><b>Tw SSM2 Sh2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM2_SH2 = eINSTANCE.getModelFasttwr_TwSSM2Sh2();

    /**
     * The meta object literal for the '<em><b>Tw SSM2 Sh3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM2_SH3 = eINSTANCE.getModelFasttwr_TwSSM2Sh3();

    /**
     * The meta object literal for the '<em><b>Tw SSM2 Sh4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM2_SH4 = eINSTANCE.getModelFasttwr_TwSSM2Sh4();

    /**
     * The meta object literal for the '<em><b>Tw SSM2 Sh5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM2_SH5 = eINSTANCE.getModelFasttwr_TwSSM2Sh5();

    /**
     * The meta object literal for the '<em><b>Tw SSM2 Sh6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTTWR__TW_SSM2_SH6 = eINSTANCE.getModelFasttwr_TwSSM2Sh6();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.HeaderImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getHeader()
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
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.SectionImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getSection()
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
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nNTwInpStImpl <em>nN Tw Inp St</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nNTwInpStImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnNTwInpSt()
     * @generated
     */
    EClass NN_TW_INP_ST = eINSTANCE.getnNTwInpSt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NN_TW_INP_ST__VALUE = eINSTANCE.getnNTwInpSt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NN_TW_INP_ST__NAME = eINSTANCE.getnNTwInpSt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.bCalcTModeImpl <em>bCalc TMode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.bCalcTModeImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getbCalcTMode()
     * @generated
     */
    EClass BCALC_TMODE = eINSTANCE.getbCalcTMode();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCALC_TMODE__VALUE = eINSTANCE.getbCalcTMode_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCALC_TMODE__NAME = eINSTANCE.getbCalcTMode_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwrFADmp1Impl <em>nTwr FA Dmp1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwrFADmp1Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwrFADmp1()
     * @generated
     */
    EClass NTWR_FA_DMP1 = eINSTANCE.getnTwrFADmp1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_FA_DMP1__VALUE = eINSTANCE.getnTwrFADmp1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_FA_DMP1__NAME = eINSTANCE.getnTwrFADmp1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwrFADmp2Impl <em>nTwr FA Dmp2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwrFADmp2Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwrFADmp2()
     * @generated
     */
    EClass NTWR_FA_DMP2 = eINSTANCE.getnTwrFADmp2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_FA_DMP2__VALUE = eINSTANCE.getnTwrFADmp2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_FA_DMP2__NAME = eINSTANCE.getnTwrFADmp2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwrSSDmp1Impl <em>nTwr SS Dmp1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwrSSDmp1Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwrSSDmp1()
     * @generated
     */
    EClass NTWR_SS_DMP1 = eINSTANCE.getnTwrSSDmp1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_SS_DMP1__VALUE = eINSTANCE.getnTwrSSDmp1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_SS_DMP1__NAME = eINSTANCE.getnTwrSSDmp1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwrSSDmp2Impl <em>nTwr SS Dmp2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwrSSDmp2Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwrSSDmp2()
     * @generated
     */
    EClass NTWR_SS_DMP2 = eINSTANCE.getnTwrSSDmp2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_SS_DMP2__VALUE = eINSTANCE.getnTwrSSDmp2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTWR_SS_DMP2__NAME = eINSTANCE.getnTwrSSDmp2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nFAStTunr1Impl <em>nFA St Tunr1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nFAStTunr1Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnFAStTunr1()
     * @generated
     */
    EClass NFA_ST_TUNR1 = eINSTANCE.getnFAStTunr1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFA_ST_TUNR1__VALUE = eINSTANCE.getnFAStTunr1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFA_ST_TUNR1__NAME = eINSTANCE.getnFAStTunr1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nFAStTunr2Impl <em>nFA St Tunr2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nFAStTunr2Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnFAStTunr2()
     * @generated
     */
    EClass NFA_ST_TUNR2 = eINSTANCE.getnFAStTunr2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFA_ST_TUNR2__VALUE = eINSTANCE.getnFAStTunr2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFA_ST_TUNR2__NAME = eINSTANCE.getnFAStTunr2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nSSStTunr1Impl <em>nSS St Tunr1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nSSStTunr1Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnSSStTunr1()
     * @generated
     */
    EClass NSS_ST_TUNR1 = eINSTANCE.getnSSStTunr1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSS_ST_TUNR1__VALUE = eINSTANCE.getnSSStTunr1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSS_ST_TUNR1__NAME = eINSTANCE.getnSSStTunr1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nSSStTunr2Impl <em>nSS St Tunr2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nSSStTunr2Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnSSStTunr2()
     * @generated
     */
    EClass NSS_ST_TUNR2 = eINSTANCE.getnSSStTunr2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSS_ST_TUNR2__VALUE = eINSTANCE.getnSSStTunr2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NSS_ST_TUNR2__NAME = eINSTANCE.getnSSStTunr2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.AdjTwMaImpl <em>Adj Tw Ma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.AdjTwMaImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getAdjTwMa()
     * @generated
     */
    EClass ADJ_TW_MA = eINSTANCE.getAdjTwMa();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_TW_MA__VALUE = eINSTANCE.getAdjTwMa_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_TW_MA__NAME = eINSTANCE.getAdjTwMa_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.AdjFAStImpl <em>Adj FA St</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.AdjFAStImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getAdjFASt()
     * @generated
     */
    EClass ADJ_FA_ST = eINSTANCE.getAdjFASt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_FA_ST__VALUE = eINSTANCE.getAdjFASt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_FA_ST__NAME = eINSTANCE.getAdjFASt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.AdjSSStImpl <em>Adj SS St</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.AdjSSStImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getAdjSSSt()
     * @generated
     */
    EClass ADJ_SS_ST = eINSTANCE.getAdjSSSt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_SS_ST__VALUE = eINSTANCE.getAdjSSSt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_SS_ST__NAME = eINSTANCE.getAdjSSSt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh2Impl <em>nTw FAM1 Sh2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh2Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh2()
     * @generated
     */
    EClass NTW_FAM1_SH2 = eINSTANCE.getnTwFAM1Sh2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH2__VALUE = eINSTANCE.getnTwFAM1Sh2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH2__NAME = eINSTANCE.getnTwFAM1Sh2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh3Impl <em>nTw FAM1 Sh3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh3Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh3()
     * @generated
     */
    EClass NTW_FAM1_SH3 = eINSTANCE.getnTwFAM1Sh3();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH3__VALUE = eINSTANCE.getnTwFAM1Sh3_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH3__NAME = eINSTANCE.getnTwFAM1Sh3_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh4Impl <em>nTw FAM1 Sh4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh4Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh4()
     * @generated
     */
    EClass NTW_FAM1_SH4 = eINSTANCE.getnTwFAM1Sh4();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH4__VALUE = eINSTANCE.getnTwFAM1Sh4_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH4__NAME = eINSTANCE.getnTwFAM1Sh4_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh5Impl <em>nTw FAM1 Sh5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh5Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh5()
     * @generated
     */
    EClass NTW_FAM1_SH5 = eINSTANCE.getnTwFAM1Sh5();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH5__VALUE = eINSTANCE.getnTwFAM1Sh5_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH5__NAME = eINSTANCE.getnTwFAM1Sh5_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh6Impl <em>nTw FAM1 Sh6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM1Sh6Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM1Sh6()
     * @generated
     */
    EClass NTW_FAM1_SH6 = eINSTANCE.getnTwFAM1Sh6();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH6__VALUE = eINSTANCE.getnTwFAM1Sh6_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM1_SH6__NAME = eINSTANCE.getnTwFAM1Sh6_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh2Impl <em>nTw FAM2 Sh2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh2Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh2()
     * @generated
     */
    EClass NTW_FAM2_SH2 = eINSTANCE.getnTwFAM2Sh2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH2__VALUE = eINSTANCE.getnTwFAM2Sh2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH2__NAME = eINSTANCE.getnTwFAM2Sh2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh3Impl <em>nTw FAM2 Sh3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh3Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh3()
     * @generated
     */
    EClass NTW_FAM2_SH3 = eINSTANCE.getnTwFAM2Sh3();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH3__VALUE = eINSTANCE.getnTwFAM2Sh3_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH3__NAME = eINSTANCE.getnTwFAM2Sh3_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh4Impl <em>nTw FAM2 Sh4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh4Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh4()
     * @generated
     */
    EClass NTW_FAM2_SH4 = eINSTANCE.getnTwFAM2Sh4();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH4__VALUE = eINSTANCE.getnTwFAM2Sh4_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH4__NAME = eINSTANCE.getnTwFAM2Sh4_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh5Impl <em>nTw FAM2 Sh5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh5Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh5()
     * @generated
     */
    EClass NTW_FAM2_SH5 = eINSTANCE.getnTwFAM2Sh5();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH5__VALUE = eINSTANCE.getnTwFAM2Sh5_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH5__NAME = eINSTANCE.getnTwFAM2Sh5_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh6Impl <em>nTw FAM2 Sh6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwFAM2Sh6Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwFAM2Sh6()
     * @generated
     */
    EClass NTW_FAM2_SH6 = eINSTANCE.getnTwFAM2Sh6();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH6__VALUE = eINSTANCE.getnTwFAM2Sh6_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_FAM2_SH6__NAME = eINSTANCE.getnTwFAM2Sh6_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh2Impl <em>nTw SSM1 Sh2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh2Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh2()
     * @generated
     */
    EClass NTW_SSM1_SH2 = eINSTANCE.getnTwSSM1Sh2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH2__VALUE = eINSTANCE.getnTwSSM1Sh2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH2__NAME = eINSTANCE.getnTwSSM1Sh2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh3Impl <em>nTw SSM1 Sh3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh3Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh3()
     * @generated
     */
    EClass NTW_SSM1_SH3 = eINSTANCE.getnTwSSM1Sh3();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH3__VALUE = eINSTANCE.getnTwSSM1Sh3_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH3__NAME = eINSTANCE.getnTwSSM1Sh3_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh4Impl <em>nTw SSM1 Sh4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh4Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh4()
     * @generated
     */
    EClass NTW_SSM1_SH4 = eINSTANCE.getnTwSSM1Sh4();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH4__VALUE = eINSTANCE.getnTwSSM1Sh4_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH4__NAME = eINSTANCE.getnTwSSM1Sh4_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh5Impl <em>nTw SSM1 Sh5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh5Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh5()
     * @generated
     */
    EClass NTW_SSM1_SH5 = eINSTANCE.getnTwSSM1Sh5();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH5__VALUE = eINSTANCE.getnTwSSM1Sh5_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH5__NAME = eINSTANCE.getnTwSSM1Sh5_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh6Impl <em>nTw SSM1 Sh6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM1Sh6Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM1Sh6()
     * @generated
     */
    EClass NTW_SSM1_SH6 = eINSTANCE.getnTwSSM1Sh6();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH6__VALUE = eINSTANCE.getnTwSSM1Sh6_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM1_SH6__NAME = eINSTANCE.getnTwSSM1Sh6_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh2Impl <em>nTw SSM2 Sh2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh2Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh2()
     * @generated
     */
    EClass NTW_SSM2_SH2 = eINSTANCE.getnTwSSM2Sh2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH2__VALUE = eINSTANCE.getnTwSSM2Sh2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH2__NAME = eINSTANCE.getnTwSSM2Sh2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh3Impl <em>nTw SSM2 Sh3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh3Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh3()
     * @generated
     */
    EClass NTW_SSM2_SH3 = eINSTANCE.getnTwSSM2Sh3();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH3__VALUE = eINSTANCE.getnTwSSM2Sh3_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH3__NAME = eINSTANCE.getnTwSSM2Sh3_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh4Impl <em>nTw SSM2 Sh4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh4Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh4()
     * @generated
     */
    EClass NTW_SSM2_SH4 = eINSTANCE.getnTwSSM2Sh4();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH4__VALUE = eINSTANCE.getnTwSSM2Sh4_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH4__NAME = eINSTANCE.getnTwSSM2Sh4_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh5Impl <em>nTw SSM2 Sh5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh5Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh5()
     * @generated
     */
    EClass NTW_SSM2_SH5 = eINSTANCE.getnTwSSM2Sh5();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH5__VALUE = eINSTANCE.getnTwSSM2Sh5_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH5__NAME = eINSTANCE.getnTwSSM2Sh5_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh6Impl <em>nTw SSM2 Sh6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.nTwSSM2Sh6Impl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getnTwSSM2Sh6()
     * @generated
     */
    EClass NTW_SSM2_SH6 = eINSTANCE.getnTwSSM2Sh6();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH6__VALUE = eINSTANCE.getnTwSSM2Sh6_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NTW_SSM2_SH6__NAME = eINSTANCE.getnTwSSM2Sh6_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl <em>aTwr Stat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl
     * @see sc.ndt.editor.fast.fasttwr.impl.FasttwrPackageImpl#getaTwrStat()
     * @generated
     */
    EClass ATWR_STAT = eINSTANCE.getaTwrStat();

    /**
     * The meta object literal for the '<em><b>Ht Fract</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__HT_FRACT = eINSTANCE.getaTwrStat_HtFract();

    /**
     * The meta object literal for the '<em><b>TMass Den</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TMASS_DEN = eINSTANCE.getaTwrStat_TMassDen();

    /**
     * The meta object literal for the '<em><b>Tw FA Stif</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TW_FA_STIF = eINSTANCE.getaTwrStat_TwFAStif();

    /**
     * The meta object literal for the '<em><b>Tw SS Stif</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TW_SS_STIF = eINSTANCE.getaTwrStat_TwSSStif();

    /**
     * The meta object literal for the '<em><b>Tw GJ Stif</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TW_GJ_STIF = eINSTANCE.getaTwrStat_TwGJStif();

    /**
     * The meta object literal for the '<em><b>Tw EA Stif</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TW_EA_STIF = eINSTANCE.getaTwrStat_TwEAStif();

    /**
     * The meta object literal for the '<em><b>Tw FA Iner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TW_FA_INER = eINSTANCE.getaTwrStat_TwFAIner();

    /**
     * The meta object literal for the '<em><b>Tw SS Iner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TW_SS_INER = eINSTANCE.getaTwrStat_TwSSIner();

    /**
     * The meta object literal for the '<em><b>Tw FAcg Of</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TW_FACG_OF = eINSTANCE.getaTwrStat_TwFAcgOf();

    /**
     * The meta object literal for the '<em><b>Tw SScg Of</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATWR_STAT__TW_SSCG_OF = eINSTANCE.getaTwrStat_TwSScgOf();

  }

} //FasttwrPackage
