/**
 */
package sc.ndt.editor.fast.fastbld;

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
 * @see sc.ndt.editor.fast.fastbld.FastbldFactory
 * @model kind="package"
 * @generated
 */
public interface FastbldPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fastbld";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/fast/Fastbld";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fastbld";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FastbldPackage eINSTANCE = sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl <em>Model Fastbld</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getModelFastbld()
   * @generated
   */
  int MODEL_FASTBLD = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__HEAD = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__SECTIONS = 1;

  /**
   * The feature id for the '<em><b>Nbl Inp St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__NBL_INP_ST = 2;

  /**
   * The feature id for the '<em><b>Calc BMode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__CALC_BMODE = 3;

  /**
   * The feature id for the '<em><b>Bld Fl Dmp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL_DMP1 = 4;

  /**
   * The feature id for the '<em><b>Bld Fl Dmp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL_DMP2 = 5;

  /**
   * The feature id for the '<em><b>Bld Ed Dmp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_ED_DMP1 = 6;

  /**
   * The feature id for the '<em><b>Fl St Tunr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__FL_ST_TUNR1 = 7;

  /**
   * The feature id for the '<em><b>Fl St Tunr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__FL_ST_TUNR2 = 8;

  /**
   * The feature id for the '<em><b>Adj Bl Ms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__ADJ_BL_MS = 9;

  /**
   * The feature id for the '<em><b>Adj Fl St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__ADJ_FL_ST = 10;

  /**
   * The feature id for the '<em><b>Adj Ed St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__ADJ_ED_ST = 11;

  /**
   * The feature id for the '<em><b>Air Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__AIR_STAT = 12;

  /**
   * The feature id for the '<em><b>Bld Fl1 Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL1_SH2 = 13;

  /**
   * The feature id for the '<em><b>Bld Fl1 Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL1_SH3 = 14;

  /**
   * The feature id for the '<em><b>Bld Fl1 Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL1_SH4 = 15;

  /**
   * The feature id for the '<em><b>Bld Fl1 Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL1_SH5 = 16;

  /**
   * The feature id for the '<em><b>Bld Fl1 Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL1_SH6 = 17;

  /**
   * The feature id for the '<em><b>Bld Fl2 Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL2_SH2 = 18;

  /**
   * The feature id for the '<em><b>Bld Fl2 Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL2_SH3 = 19;

  /**
   * The feature id for the '<em><b>Bld Fl2 Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL2_SH4 = 20;

  /**
   * The feature id for the '<em><b>Bld Fl2 Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL2_SH5 = 21;

  /**
   * The feature id for the '<em><b>Bld Fl2 Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_FL2_SH6 = 22;

  /**
   * The feature id for the '<em><b>Bld Edg Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_EDG_SH2 = 23;

  /**
   * The feature id for the '<em><b>Bld Edg Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_EDG_SH3 = 24;

  /**
   * The feature id for the '<em><b>Bld Edg Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_EDG_SH4 = 25;

  /**
   * The feature id for the '<em><b>Bld Edg Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_EDG_SH5 = 26;

  /**
   * The feature id for the '<em><b>Bld Edg Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD__BLD_EDG_SH6 = 27;

  /**
   * The number of structural features of the '<em>Model Fastbld</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FASTBLD_FEATURE_COUNT = 28;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.HeaderImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getHeader()
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
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.SectionImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getSection()
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
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nNblInpStImpl <em>nNbl Inp St</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nNblInpStImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnNblInpSt()
   * @generated
   */
  int NNBL_INP_ST = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNBL_INP_ST__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNBL_INP_ST__NAME = 1;

  /**
   * The number of structural features of the '<em>nNbl Inp St</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NNBL_INP_ST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.bCalcBModeImpl <em>bCalc BMode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.bCalcBModeImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getbCalcBMode()
   * @generated
   */
  int BCALC_BMODE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_BMODE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_BMODE__NAME = 1;

  /**
   * The number of structural features of the '<em>bCalc BMode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCALC_BMODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFlDmp1Impl <em>nBld Fl Dmp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFlDmp1Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFlDmp1()
   * @generated
   */
  int NBLD_FL_DMP1 = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL_DMP1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL_DMP1__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl Dmp1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL_DMP1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFlDmp2Impl <em>nBld Fl Dmp2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFlDmp2Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFlDmp2()
   * @generated
   */
  int NBLD_FL_DMP2 = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL_DMP2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL_DMP2__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl Dmp2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL_DMP2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdDmp1Impl <em>nBld Ed Dmp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldEdDmp1Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdDmp1()
   * @generated
   */
  int NBLD_ED_DMP1 = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_ED_DMP1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_ED_DMP1__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Ed Dmp1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_ED_DMP1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nFlStTunr1Impl <em>nFl St Tunr1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nFlStTunr1Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnFlStTunr1()
   * @generated
   */
  int NFL_ST_TUNR1 = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFL_ST_TUNR1__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFL_ST_TUNR1__NAME = 1;

  /**
   * The number of structural features of the '<em>nFl St Tunr1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFL_ST_TUNR1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nFlStTunr2Impl <em>nFl St Tunr2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nFlStTunr2Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnFlStTunr2()
   * @generated
   */
  int NFL_ST_TUNR2 = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFL_ST_TUNR2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFL_ST_TUNR2__NAME = 1;

  /**
   * The number of structural features of the '<em>nFl St Tunr2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFL_ST_TUNR2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.AdjBlMsImpl <em>Adj Bl Ms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.AdjBlMsImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getAdjBlMs()
   * @generated
   */
  int ADJ_BL_MS = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_BL_MS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_BL_MS__NAME = 1;

  /**
   * The number of structural features of the '<em>Adj Bl Ms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_BL_MS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.AdjFlStImpl <em>Adj Fl St</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.AdjFlStImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getAdjFlSt()
   * @generated
   */
  int ADJ_FL_ST = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_FL_ST__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_FL_ST__NAME = 1;

  /**
   * The number of structural features of the '<em>Adj Fl St</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_FL_ST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.AdjEdStImpl <em>Adj Ed St</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.AdjEdStImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getAdjEdSt()
   * @generated
   */
  int ADJ_ED_ST = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_ED_ST__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_ED_ST__NAME = 1;

  /**
   * The number of structural features of the '<em>Adj Ed St</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADJ_ED_ST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh2Impl <em>nBld Fl1 Sh2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh2Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh2()
   * @generated
   */
  int NBLD_FL1_SH2 = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH2__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl1 Sh2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh3Impl <em>nBld Fl1 Sh3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh3Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh3()
   * @generated
   */
  int NBLD_FL1_SH3 = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH3__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl1 Sh3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh4Impl <em>nBld Fl1 Sh4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh4Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh4()
   * @generated
   */
  int NBLD_FL1_SH4 = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH4__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH4__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl1 Sh4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH4_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh5Impl <em>nBld Fl1 Sh5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh5Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh5()
   * @generated
   */
  int NBLD_FL1_SH5 = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH5__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH5__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl1 Sh5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH5_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh6Impl <em>nBld Fl1 Sh6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh6Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh6()
   * @generated
   */
  int NBLD_FL1_SH6 = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH6__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH6__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl1 Sh6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL1_SH6_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh2Impl <em>nBld Fl2 Sh2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh2Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh2()
   * @generated
   */
  int NBLD_FL2_SH2 = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH2__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl2 Sh2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh3Impl <em>nBld Fl2 Sh3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh3Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh3()
   * @generated
   */
  int NBLD_FL2_SH3 = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH3__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl2 Sh3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh4Impl <em>nBld Fl2 Sh4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh4Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh4()
   * @generated
   */
  int NBLD_FL2_SH4 = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH4__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH4__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl2 Sh4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH4_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh5Impl <em>nBld Fl2 Sh5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh5Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh5()
   * @generated
   */
  int NBLD_FL2_SH5 = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH5__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH5__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl2 Sh5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH5_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh6Impl <em>nBld Fl2 Sh6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh6Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh6()
   * @generated
   */
  int NBLD_FL2_SH6 = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH6__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH6__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Fl2 Sh6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_FL2_SH6_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh2Impl <em>nBld Edg Sh2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh2Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh2()
   * @generated
   */
  int NBLD_EDG_SH2 = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH2__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Edg Sh2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh3Impl <em>nBld Edg Sh3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh3Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh3()
   * @generated
   */
  int NBLD_EDG_SH3 = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH3__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH3__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Edg Sh3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh4Impl <em>nBld Edg Sh4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh4Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh4()
   * @generated
   */
  int NBLD_EDG_SH4 = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH4__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH4__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Edg Sh4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH4_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh5Impl <em>nBld Edg Sh5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh5Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh5()
   * @generated
   */
  int NBLD_EDG_SH5 = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH5__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH5__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Edg Sh5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH5_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh6Impl <em>nBld Edg Sh6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh6Impl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh6()
   * @generated
   */
  int NBLD_EDG_SH6 = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH6__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH6__NAME = 1;

  /**
   * The number of structural features of the '<em>nBld Edg Sh6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NBLD_EDG_SH6_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.fast.fastbld.impl.aAirStatImpl <em>aAir Stat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.fast.fastbld.impl.aAirStatImpl
   * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getaAirStat()
   * @generated
   */
  int AAIR_STAT = 28;

  /**
   * The feature id for the '<em><b>Bldfrac</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__BLDFRAC = 0;

  /**
   * The feature id for the '<em><b>Aero Cent</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__AERO_CENT = 1;

  /**
   * The feature id for the '<em><b>Strc Twst</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__STRC_TWST = 2;

  /**
   * The feature id for the '<em><b>BMass Den</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__BMASS_DEN = 3;

  /**
   * The feature id for the '<em><b>Flp Stff</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__FLP_STFF = 4;

  /**
   * The feature id for the '<em><b>Edg Stff</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__EDG_STFF = 5;

  /**
   * The feature id for the '<em><b>GJ Stff</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__GJ_STFF = 6;

  /**
   * The feature id for the '<em><b>EA Stff</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__EA_STFF = 7;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__ALPHA = 8;

  /**
   * The feature id for the '<em><b>Flp Iner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__FLP_INER = 9;

  /**
   * The feature id for the '<em><b>Edg Iner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__EDG_INER = 10;

  /**
   * The feature id for the '<em><b>Precrv Ref</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__PRECRV_REF = 11;

  /**
   * The feature id for the '<em><b>Preswp Ref</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__PRESWP_REF = 12;

  /**
   * The feature id for the '<em><b>Flpcg Of</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__FLPCG_OF = 13;

  /**
   * The feature id for the '<em><b>Edgcg Of</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__EDGCG_OF = 14;

  /**
   * The feature id for the '<em><b>Flp EA Of</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__FLP_EA_OF = 15;

  /**
   * The feature id for the '<em><b>Edg EA Of</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT__EDG_EA_OF = 16;

  /**
   * The number of structural features of the '<em>aAir Stat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AAIR_STAT_FEATURE_COUNT = 17;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.ModelFastbld <em>Model Fastbld</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Fastbld</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld
   * @generated
   */
  EClass getModelFastbld();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getHead()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_Head();

  /**
   * Returns the meta object for the containment reference list '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getSections()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_Sections();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getNblInpSt <em>Nbl Inp St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nbl Inp St</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getNblInpSt()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_NblInpSt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getCalcBMode <em>Calc BMode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Calc BMode</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getCalcBMode()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_CalcBMode();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFlDmp1 <em>Bld Fl Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl Dmp1</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFlDmp1()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFlDmp1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFlDmp2 <em>Bld Fl Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl Dmp2</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFlDmp2()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFlDmp2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdDmp1 <em>Bld Ed Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Ed Dmp1</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdDmp1()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldEdDmp1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getFlStTunr1 <em>Fl St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fl St Tunr1</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getFlStTunr1()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_FlStTunr1();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getFlStTunr2 <em>Fl St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fl St Tunr2</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getFlStTunr2()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_FlStTunr2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjBlMs <em>Adj Bl Ms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adj Bl Ms</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjBlMs()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_AdjBlMs();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjFlSt <em>Adj Fl St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adj Fl St</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjFlSt()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_AdjFlSt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjEdSt <em>Adj Ed St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adj Ed St</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjEdSt()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_AdjEdSt();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAirStat <em>Air Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Air Stat</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getAirStat()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_AirStat();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh2 <em>Bld Fl1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl1 Sh2</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh2()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl1Sh2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh3 <em>Bld Fl1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl1 Sh3</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh3()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl1Sh3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh4 <em>Bld Fl1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl1 Sh4</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh4()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl1Sh4();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh5 <em>Bld Fl1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl1 Sh5</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh5()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl1Sh5();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh6 <em>Bld Fl1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl1 Sh6</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh6()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl1Sh6();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh2 <em>Bld Fl2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl2 Sh2</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh2()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl2Sh2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh3 <em>Bld Fl2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl2 Sh3</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh3()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl2Sh3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh4 <em>Bld Fl2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl2 Sh4</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh4()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl2Sh4();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh5 <em>Bld Fl2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl2 Sh5</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh5()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl2Sh5();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh6 <em>Bld Fl2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Fl2 Sh6</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh6()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldFl2Sh6();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh2 <em>Bld Edg Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Edg Sh2</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh2()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldEdgSh2();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh3 <em>Bld Edg Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Edg Sh3</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh3()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldEdgSh3();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh4 <em>Bld Edg Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Edg Sh4</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh4()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldEdgSh4();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh5 <em>Bld Edg Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Edg Sh5</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh5()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldEdgSh5();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh6 <em>Bld Edg Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bld Edg Sh6</em>'.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh6()
   * @see #getModelFastbld()
   * @generated
   */
  EReference getModelFastbld_BldEdgSh6();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.fast.fastbld.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.Header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.Header#getName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see sc.ndt.editor.fast.fastbld.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nNblInpSt <em>nNbl Inp St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nNbl Inp St</em>'.
   * @see sc.ndt.editor.fast.fastbld.nNblInpSt
   * @generated
   */
  EClass getnNblInpSt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nNblInpSt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nNblInpSt#getValue()
   * @see #getnNblInpSt()
   * @generated
   */
  EAttribute getnNblInpSt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nNblInpSt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nNblInpSt#getName()
   * @see #getnNblInpSt()
   * @generated
   */
  EAttribute getnNblInpSt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.bCalcBMode <em>bCalc BMode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bCalc BMode</em>'.
   * @see sc.ndt.editor.fast.fastbld.bCalcBMode
   * @generated
   */
  EClass getbCalcBMode();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.bCalcBMode#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.bCalcBMode#isValue()
   * @see #getbCalcBMode()
   * @generated
   */
  EAttribute getbCalcBMode_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.bCalcBMode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.bCalcBMode#getName()
   * @see #getbCalcBMode()
   * @generated
   */
  EAttribute getbCalcBMode_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFlDmp1 <em>nBld Fl Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl Dmp1</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFlDmp1
   * @generated
   */
  EClass getnBldFlDmp1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFlDmp1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFlDmp1#getValue()
   * @see #getnBldFlDmp1()
   * @generated
   */
  EAttribute getnBldFlDmp1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFlDmp1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFlDmp1#getName()
   * @see #getnBldFlDmp1()
   * @generated
   */
  EAttribute getnBldFlDmp1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFlDmp2 <em>nBld Fl Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl Dmp2</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFlDmp2
   * @generated
   */
  EClass getnBldFlDmp2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFlDmp2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFlDmp2#getValue()
   * @see #getnBldFlDmp2()
   * @generated
   */
  EAttribute getnBldFlDmp2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFlDmp2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFlDmp2#getName()
   * @see #getnBldFlDmp2()
   * @generated
   */
  EAttribute getnBldFlDmp2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldEdDmp1 <em>nBld Ed Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Ed Dmp1</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdDmp1
   * @generated
   */
  EClass getnBldEdDmp1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdDmp1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdDmp1#getValue()
   * @see #getnBldEdDmp1()
   * @generated
   */
  EAttribute getnBldEdDmp1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdDmp1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdDmp1#getName()
   * @see #getnBldEdDmp1()
   * @generated
   */
  EAttribute getnBldEdDmp1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nFlStTunr1 <em>nFl St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nFl St Tunr1</em>'.
   * @see sc.ndt.editor.fast.fastbld.nFlStTunr1
   * @generated
   */
  EClass getnFlStTunr1();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nFlStTunr1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nFlStTunr1#getValue()
   * @see #getnFlStTunr1()
   * @generated
   */
  EAttribute getnFlStTunr1_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nFlStTunr1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nFlStTunr1#getName()
   * @see #getnFlStTunr1()
   * @generated
   */
  EAttribute getnFlStTunr1_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nFlStTunr2 <em>nFl St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nFl St Tunr2</em>'.
   * @see sc.ndt.editor.fast.fastbld.nFlStTunr2
   * @generated
   */
  EClass getnFlStTunr2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nFlStTunr2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nFlStTunr2#getValue()
   * @see #getnFlStTunr2()
   * @generated
   */
  EAttribute getnFlStTunr2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nFlStTunr2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nFlStTunr2#getName()
   * @see #getnFlStTunr2()
   * @generated
   */
  EAttribute getnFlStTunr2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.AdjBlMs <em>Adj Bl Ms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adj Bl Ms</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjBlMs
   * @generated
   */
  EClass getAdjBlMs();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.AdjBlMs#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjBlMs#getValue()
   * @see #getAdjBlMs()
   * @generated
   */
  EAttribute getAdjBlMs_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.AdjBlMs#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjBlMs#getName()
   * @see #getAdjBlMs()
   * @generated
   */
  EAttribute getAdjBlMs_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.AdjFlSt <em>Adj Fl St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adj Fl St</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjFlSt
   * @generated
   */
  EClass getAdjFlSt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.AdjFlSt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjFlSt#getValue()
   * @see #getAdjFlSt()
   * @generated
   */
  EAttribute getAdjFlSt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.AdjFlSt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjFlSt#getName()
   * @see #getAdjFlSt()
   * @generated
   */
  EAttribute getAdjFlSt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.AdjEdSt <em>Adj Ed St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adj Ed St</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjEdSt
   * @generated
   */
  EClass getAdjEdSt();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.AdjEdSt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjEdSt#getValue()
   * @see #getAdjEdSt()
   * @generated
   */
  EAttribute getAdjEdSt_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.AdjEdSt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.AdjEdSt#getName()
   * @see #getAdjEdSt()
   * @generated
   */
  EAttribute getAdjEdSt_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh2 <em>nBld Fl1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl1 Sh2</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh2
   * @generated
   */
  EClass getnBldFl1Sh2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh2#getValue()
   * @see #getnBldFl1Sh2()
   * @generated
   */
  EAttribute getnBldFl1Sh2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh2#getName()
   * @see #getnBldFl1Sh2()
   * @generated
   */
  EAttribute getnBldFl1Sh2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh3 <em>nBld Fl1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl1 Sh3</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh3
   * @generated
   */
  EClass getnBldFl1Sh3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh3#getValue()
   * @see #getnBldFl1Sh3()
   * @generated
   */
  EAttribute getnBldFl1Sh3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh3#getName()
   * @see #getnBldFl1Sh3()
   * @generated
   */
  EAttribute getnBldFl1Sh3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh4 <em>nBld Fl1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl1 Sh4</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh4
   * @generated
   */
  EClass getnBldFl1Sh4();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh4#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh4#getValue()
   * @see #getnBldFl1Sh4()
   * @generated
   */
  EAttribute getnBldFl1Sh4_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh4#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh4#getName()
   * @see #getnBldFl1Sh4()
   * @generated
   */
  EAttribute getnBldFl1Sh4_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh5 <em>nBld Fl1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl1 Sh5</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh5
   * @generated
   */
  EClass getnBldFl1Sh5();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh5#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh5#getValue()
   * @see #getnBldFl1Sh5()
   * @generated
   */
  EAttribute getnBldFl1Sh5_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh5#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh5#getName()
   * @see #getnBldFl1Sh5()
   * @generated
   */
  EAttribute getnBldFl1Sh5_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh6 <em>nBld Fl1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl1 Sh6</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh6
   * @generated
   */
  EClass getnBldFl1Sh6();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh6#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh6#getValue()
   * @see #getnBldFl1Sh6()
   * @generated
   */
  EAttribute getnBldFl1Sh6_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh6#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh6#getName()
   * @see #getnBldFl1Sh6()
   * @generated
   */
  EAttribute getnBldFl1Sh6_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh2 <em>nBld Fl2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl2 Sh2</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh2
   * @generated
   */
  EClass getnBldFl2Sh2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh2#getValue()
   * @see #getnBldFl2Sh2()
   * @generated
   */
  EAttribute getnBldFl2Sh2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh2#getName()
   * @see #getnBldFl2Sh2()
   * @generated
   */
  EAttribute getnBldFl2Sh2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh3 <em>nBld Fl2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl2 Sh3</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh3
   * @generated
   */
  EClass getnBldFl2Sh3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh3#getValue()
   * @see #getnBldFl2Sh3()
   * @generated
   */
  EAttribute getnBldFl2Sh3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh3#getName()
   * @see #getnBldFl2Sh3()
   * @generated
   */
  EAttribute getnBldFl2Sh3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh4 <em>nBld Fl2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl2 Sh4</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh4
   * @generated
   */
  EClass getnBldFl2Sh4();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh4#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh4#getValue()
   * @see #getnBldFl2Sh4()
   * @generated
   */
  EAttribute getnBldFl2Sh4_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh4#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh4#getName()
   * @see #getnBldFl2Sh4()
   * @generated
   */
  EAttribute getnBldFl2Sh4_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh5 <em>nBld Fl2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl2 Sh5</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh5
   * @generated
   */
  EClass getnBldFl2Sh5();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh5#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh5#getValue()
   * @see #getnBldFl2Sh5()
   * @generated
   */
  EAttribute getnBldFl2Sh5_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh5#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh5#getName()
   * @see #getnBldFl2Sh5()
   * @generated
   */
  EAttribute getnBldFl2Sh5_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh6 <em>nBld Fl2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Fl2 Sh6</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh6
   * @generated
   */
  EClass getnBldFl2Sh6();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh6#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh6#getValue()
   * @see #getnBldFl2Sh6()
   * @generated
   */
  EAttribute getnBldFl2Sh6_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh6#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh6#getName()
   * @see #getnBldFl2Sh6()
   * @generated
   */
  EAttribute getnBldFl2Sh6_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh2 <em>nBld Edg Sh2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Edg Sh2</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh2
   * @generated
   */
  EClass getnBldEdgSh2();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh2#getValue()
   * @see #getnBldEdgSh2()
   * @generated
   */
  EAttribute getnBldEdgSh2_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh2#getName()
   * @see #getnBldEdgSh2()
   * @generated
   */
  EAttribute getnBldEdgSh2_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh3 <em>nBld Edg Sh3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Edg Sh3</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh3
   * @generated
   */
  EClass getnBldEdgSh3();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh3#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh3#getValue()
   * @see #getnBldEdgSh3()
   * @generated
   */
  EAttribute getnBldEdgSh3_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh3#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh3#getName()
   * @see #getnBldEdgSh3()
   * @generated
   */
  EAttribute getnBldEdgSh3_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh4 <em>nBld Edg Sh4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Edg Sh4</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh4
   * @generated
   */
  EClass getnBldEdgSh4();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh4#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh4#getValue()
   * @see #getnBldEdgSh4()
   * @generated
   */
  EAttribute getnBldEdgSh4_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh4#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh4#getName()
   * @see #getnBldEdgSh4()
   * @generated
   */
  EAttribute getnBldEdgSh4_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh5 <em>nBld Edg Sh5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Edg Sh5</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh5
   * @generated
   */
  EClass getnBldEdgSh5();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh5#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh5#getValue()
   * @see #getnBldEdgSh5()
   * @generated
   */
  EAttribute getnBldEdgSh5_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh5#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh5#getName()
   * @see #getnBldEdgSh5()
   * @generated
   */
  EAttribute getnBldEdgSh5_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh6 <em>nBld Edg Sh6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nBld Edg Sh6</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh6
   * @generated
   */
  EClass getnBldEdgSh6();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh6#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh6#getValue()
   * @see #getnBldEdgSh6()
   * @generated
   */
  EAttribute getnBldEdgSh6_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh6#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh6#getName()
   * @see #getnBldEdgSh6()
   * @generated
   */
  EAttribute getnBldEdgSh6_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.fast.fastbld.aAirStat <em>aAir Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aAir Stat</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat
   * @generated
   */
  EClass getaAirStat();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getBldfrac <em>Bldfrac</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Bldfrac</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getBldfrac()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_Bldfrac();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getAeroCent <em>Aero Cent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Aero Cent</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getAeroCent()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_AeroCent();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getStrcTwst <em>Strc Twst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Strc Twst</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getStrcTwst()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_StrcTwst();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getBMassDen <em>BMass Den</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>BMass Den</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getBMassDen()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_BMassDen();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getFlpStff <em>Flp Stff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flp Stff</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getFlpStff()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_FlpStff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getEdgStff <em>Edg Stff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Edg Stff</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getEdgStff()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_EdgStff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getGJStff <em>GJ Stff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>GJ Stff</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getGJStff()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_GJStff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getEAStff <em>EA Stff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>EA Stff</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getEAStff()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_EAStff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Alpha</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getAlpha()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_Alpha();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getFlpIner <em>Flp Iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flp Iner</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getFlpIner()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_FlpIner();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getEdgIner <em>Edg Iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Edg Iner</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getEdgIner()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_EdgIner();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getPrecrvRef <em>Precrv Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Precrv Ref</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getPrecrvRef()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_PrecrvRef();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getPreswpRef <em>Preswp Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Preswp Ref</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getPreswpRef()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_PreswpRef();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getFlpcgOf <em>Flpcg Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flpcg Of</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getFlpcgOf()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_FlpcgOf();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getEdgcgOf <em>Edgcg Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Edgcg Of</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getEdgcgOf()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_EdgcgOf();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getFlpEAOf <em>Flp EA Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flp EA Of</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getFlpEAOf()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_FlpEAOf();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.fast.fastbld.aAirStat#getEdgEAOf <em>Edg EA Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Edg EA Of</em>'.
   * @see sc.ndt.editor.fast.fastbld.aAirStat#getEdgEAOf()
   * @see #getaAirStat()
   * @generated
   */
  EAttribute getaAirStat_EdgEAOf();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FastbldFactory getFastbldFactory();

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
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl <em>Model Fastbld</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.ModelFastbldImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getModelFastbld()
     * @generated
     */
    EClass MODEL_FASTBLD = eINSTANCE.getModelFastbld();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__HEAD = eINSTANCE.getModelFastbld_Head();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__SECTIONS = eINSTANCE.getModelFastbld_Sections();

    /**
     * The meta object literal for the '<em><b>Nbl Inp St</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__NBL_INP_ST = eINSTANCE.getModelFastbld_NblInpSt();

    /**
     * The meta object literal for the '<em><b>Calc BMode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__CALC_BMODE = eINSTANCE.getModelFastbld_CalcBMode();

    /**
     * The meta object literal for the '<em><b>Bld Fl Dmp1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL_DMP1 = eINSTANCE.getModelFastbld_BldFlDmp1();

    /**
     * The meta object literal for the '<em><b>Bld Fl Dmp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL_DMP2 = eINSTANCE.getModelFastbld_BldFlDmp2();

    /**
     * The meta object literal for the '<em><b>Bld Ed Dmp1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_ED_DMP1 = eINSTANCE.getModelFastbld_BldEdDmp1();

    /**
     * The meta object literal for the '<em><b>Fl St Tunr1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__FL_ST_TUNR1 = eINSTANCE.getModelFastbld_FlStTunr1();

    /**
     * The meta object literal for the '<em><b>Fl St Tunr2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__FL_ST_TUNR2 = eINSTANCE.getModelFastbld_FlStTunr2();

    /**
     * The meta object literal for the '<em><b>Adj Bl Ms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__ADJ_BL_MS = eINSTANCE.getModelFastbld_AdjBlMs();

    /**
     * The meta object literal for the '<em><b>Adj Fl St</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__ADJ_FL_ST = eINSTANCE.getModelFastbld_AdjFlSt();

    /**
     * The meta object literal for the '<em><b>Adj Ed St</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__ADJ_ED_ST = eINSTANCE.getModelFastbld_AdjEdSt();

    /**
     * The meta object literal for the '<em><b>Air Stat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__AIR_STAT = eINSTANCE.getModelFastbld_AirStat();

    /**
     * The meta object literal for the '<em><b>Bld Fl1 Sh2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL1_SH2 = eINSTANCE.getModelFastbld_BldFl1Sh2();

    /**
     * The meta object literal for the '<em><b>Bld Fl1 Sh3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL1_SH3 = eINSTANCE.getModelFastbld_BldFl1Sh3();

    /**
     * The meta object literal for the '<em><b>Bld Fl1 Sh4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL1_SH4 = eINSTANCE.getModelFastbld_BldFl1Sh4();

    /**
     * The meta object literal for the '<em><b>Bld Fl1 Sh5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL1_SH5 = eINSTANCE.getModelFastbld_BldFl1Sh5();

    /**
     * The meta object literal for the '<em><b>Bld Fl1 Sh6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL1_SH6 = eINSTANCE.getModelFastbld_BldFl1Sh6();

    /**
     * The meta object literal for the '<em><b>Bld Fl2 Sh2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL2_SH2 = eINSTANCE.getModelFastbld_BldFl2Sh2();

    /**
     * The meta object literal for the '<em><b>Bld Fl2 Sh3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL2_SH3 = eINSTANCE.getModelFastbld_BldFl2Sh3();

    /**
     * The meta object literal for the '<em><b>Bld Fl2 Sh4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL2_SH4 = eINSTANCE.getModelFastbld_BldFl2Sh4();

    /**
     * The meta object literal for the '<em><b>Bld Fl2 Sh5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL2_SH5 = eINSTANCE.getModelFastbld_BldFl2Sh5();

    /**
     * The meta object literal for the '<em><b>Bld Fl2 Sh6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_FL2_SH6 = eINSTANCE.getModelFastbld_BldFl2Sh6();

    /**
     * The meta object literal for the '<em><b>Bld Edg Sh2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_EDG_SH2 = eINSTANCE.getModelFastbld_BldEdgSh2();

    /**
     * The meta object literal for the '<em><b>Bld Edg Sh3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_EDG_SH3 = eINSTANCE.getModelFastbld_BldEdgSh3();

    /**
     * The meta object literal for the '<em><b>Bld Edg Sh4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_EDG_SH4 = eINSTANCE.getModelFastbld_BldEdgSh4();

    /**
     * The meta object literal for the '<em><b>Bld Edg Sh5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_EDG_SH5 = eINSTANCE.getModelFastbld_BldEdgSh5();

    /**
     * The meta object literal for the '<em><b>Bld Edg Sh6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FASTBLD__BLD_EDG_SH6 = eINSTANCE.getModelFastbld_BldEdgSh6();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.HeaderImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getHeader()
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
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.SectionImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getSection()
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
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nNblInpStImpl <em>nNbl Inp St</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nNblInpStImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnNblInpSt()
     * @generated
     */
    EClass NNBL_INP_ST = eINSTANCE.getnNblInpSt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NNBL_INP_ST__VALUE = eINSTANCE.getnNblInpSt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NNBL_INP_ST__NAME = eINSTANCE.getnNblInpSt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.bCalcBModeImpl <em>bCalc BMode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.bCalcBModeImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getbCalcBMode()
     * @generated
     */
    EClass BCALC_BMODE = eINSTANCE.getbCalcBMode();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCALC_BMODE__VALUE = eINSTANCE.getbCalcBMode_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCALC_BMODE__NAME = eINSTANCE.getbCalcBMode_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFlDmp1Impl <em>nBld Fl Dmp1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFlDmp1Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFlDmp1()
     * @generated
     */
    EClass NBLD_FL_DMP1 = eINSTANCE.getnBldFlDmp1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL_DMP1__VALUE = eINSTANCE.getnBldFlDmp1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL_DMP1__NAME = eINSTANCE.getnBldFlDmp1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFlDmp2Impl <em>nBld Fl Dmp2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFlDmp2Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFlDmp2()
     * @generated
     */
    EClass NBLD_FL_DMP2 = eINSTANCE.getnBldFlDmp2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL_DMP2__VALUE = eINSTANCE.getnBldFlDmp2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL_DMP2__NAME = eINSTANCE.getnBldFlDmp2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdDmp1Impl <em>nBld Ed Dmp1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldEdDmp1Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdDmp1()
     * @generated
     */
    EClass NBLD_ED_DMP1 = eINSTANCE.getnBldEdDmp1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_ED_DMP1__VALUE = eINSTANCE.getnBldEdDmp1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_ED_DMP1__NAME = eINSTANCE.getnBldEdDmp1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nFlStTunr1Impl <em>nFl St Tunr1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nFlStTunr1Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnFlStTunr1()
     * @generated
     */
    EClass NFL_ST_TUNR1 = eINSTANCE.getnFlStTunr1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFL_ST_TUNR1__VALUE = eINSTANCE.getnFlStTunr1_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFL_ST_TUNR1__NAME = eINSTANCE.getnFlStTunr1_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nFlStTunr2Impl <em>nFl St Tunr2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nFlStTunr2Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnFlStTunr2()
     * @generated
     */
    EClass NFL_ST_TUNR2 = eINSTANCE.getnFlStTunr2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFL_ST_TUNR2__VALUE = eINSTANCE.getnFlStTunr2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NFL_ST_TUNR2__NAME = eINSTANCE.getnFlStTunr2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.AdjBlMsImpl <em>Adj Bl Ms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.AdjBlMsImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getAdjBlMs()
     * @generated
     */
    EClass ADJ_BL_MS = eINSTANCE.getAdjBlMs();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_BL_MS__VALUE = eINSTANCE.getAdjBlMs_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_BL_MS__NAME = eINSTANCE.getAdjBlMs_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.AdjFlStImpl <em>Adj Fl St</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.AdjFlStImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getAdjFlSt()
     * @generated
     */
    EClass ADJ_FL_ST = eINSTANCE.getAdjFlSt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_FL_ST__VALUE = eINSTANCE.getAdjFlSt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_FL_ST__NAME = eINSTANCE.getAdjFlSt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.AdjEdStImpl <em>Adj Ed St</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.AdjEdStImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getAdjEdSt()
     * @generated
     */
    EClass ADJ_ED_ST = eINSTANCE.getAdjEdSt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_ED_ST__VALUE = eINSTANCE.getAdjEdSt_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADJ_ED_ST__NAME = eINSTANCE.getAdjEdSt_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh2Impl <em>nBld Fl1 Sh2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh2Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh2()
     * @generated
     */
    EClass NBLD_FL1_SH2 = eINSTANCE.getnBldFl1Sh2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH2__VALUE = eINSTANCE.getnBldFl1Sh2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH2__NAME = eINSTANCE.getnBldFl1Sh2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh3Impl <em>nBld Fl1 Sh3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh3Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh3()
     * @generated
     */
    EClass NBLD_FL1_SH3 = eINSTANCE.getnBldFl1Sh3();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH3__VALUE = eINSTANCE.getnBldFl1Sh3_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH3__NAME = eINSTANCE.getnBldFl1Sh3_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh4Impl <em>nBld Fl1 Sh4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh4Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh4()
     * @generated
     */
    EClass NBLD_FL1_SH4 = eINSTANCE.getnBldFl1Sh4();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH4__VALUE = eINSTANCE.getnBldFl1Sh4_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH4__NAME = eINSTANCE.getnBldFl1Sh4_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh5Impl <em>nBld Fl1 Sh5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh5Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh5()
     * @generated
     */
    EClass NBLD_FL1_SH5 = eINSTANCE.getnBldFl1Sh5();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH5__VALUE = eINSTANCE.getnBldFl1Sh5_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH5__NAME = eINSTANCE.getnBldFl1Sh5_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh6Impl <em>nBld Fl1 Sh6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl1Sh6Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl1Sh6()
     * @generated
     */
    EClass NBLD_FL1_SH6 = eINSTANCE.getnBldFl1Sh6();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH6__VALUE = eINSTANCE.getnBldFl1Sh6_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL1_SH6__NAME = eINSTANCE.getnBldFl1Sh6_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh2Impl <em>nBld Fl2 Sh2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh2Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh2()
     * @generated
     */
    EClass NBLD_FL2_SH2 = eINSTANCE.getnBldFl2Sh2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH2__VALUE = eINSTANCE.getnBldFl2Sh2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH2__NAME = eINSTANCE.getnBldFl2Sh2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh3Impl <em>nBld Fl2 Sh3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh3Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh3()
     * @generated
     */
    EClass NBLD_FL2_SH3 = eINSTANCE.getnBldFl2Sh3();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH3__VALUE = eINSTANCE.getnBldFl2Sh3_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH3__NAME = eINSTANCE.getnBldFl2Sh3_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh4Impl <em>nBld Fl2 Sh4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh4Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh4()
     * @generated
     */
    EClass NBLD_FL2_SH4 = eINSTANCE.getnBldFl2Sh4();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH4__VALUE = eINSTANCE.getnBldFl2Sh4_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH4__NAME = eINSTANCE.getnBldFl2Sh4_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh5Impl <em>nBld Fl2 Sh5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh5Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh5()
     * @generated
     */
    EClass NBLD_FL2_SH5 = eINSTANCE.getnBldFl2Sh5();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH5__VALUE = eINSTANCE.getnBldFl2Sh5_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH5__NAME = eINSTANCE.getnBldFl2Sh5_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh6Impl <em>nBld Fl2 Sh6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldFl2Sh6Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldFl2Sh6()
     * @generated
     */
    EClass NBLD_FL2_SH6 = eINSTANCE.getnBldFl2Sh6();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH6__VALUE = eINSTANCE.getnBldFl2Sh6_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_FL2_SH6__NAME = eINSTANCE.getnBldFl2Sh6_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh2Impl <em>nBld Edg Sh2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh2Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh2()
     * @generated
     */
    EClass NBLD_EDG_SH2 = eINSTANCE.getnBldEdgSh2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH2__VALUE = eINSTANCE.getnBldEdgSh2_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH2__NAME = eINSTANCE.getnBldEdgSh2_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh3Impl <em>nBld Edg Sh3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh3Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh3()
     * @generated
     */
    EClass NBLD_EDG_SH3 = eINSTANCE.getnBldEdgSh3();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH3__VALUE = eINSTANCE.getnBldEdgSh3_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH3__NAME = eINSTANCE.getnBldEdgSh3_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh4Impl <em>nBld Edg Sh4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh4Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh4()
     * @generated
     */
    EClass NBLD_EDG_SH4 = eINSTANCE.getnBldEdgSh4();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH4__VALUE = eINSTANCE.getnBldEdgSh4_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH4__NAME = eINSTANCE.getnBldEdgSh4_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh5Impl <em>nBld Edg Sh5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh5Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh5()
     * @generated
     */
    EClass NBLD_EDG_SH5 = eINSTANCE.getnBldEdgSh5();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH5__VALUE = eINSTANCE.getnBldEdgSh5_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH5__NAME = eINSTANCE.getnBldEdgSh5_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.nBldEdgSh6Impl <em>nBld Edg Sh6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.nBldEdgSh6Impl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getnBldEdgSh6()
     * @generated
     */
    EClass NBLD_EDG_SH6 = eINSTANCE.getnBldEdgSh6();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH6__VALUE = eINSTANCE.getnBldEdgSh6_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NBLD_EDG_SH6__NAME = eINSTANCE.getnBldEdgSh6_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.fast.fastbld.impl.aAirStatImpl <em>aAir Stat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.fast.fastbld.impl.aAirStatImpl
     * @see sc.ndt.editor.fast.fastbld.impl.FastbldPackageImpl#getaAirStat()
     * @generated
     */
    EClass AAIR_STAT = eINSTANCE.getaAirStat();

    /**
     * The meta object literal for the '<em><b>Bldfrac</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__BLDFRAC = eINSTANCE.getaAirStat_Bldfrac();

    /**
     * The meta object literal for the '<em><b>Aero Cent</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__AERO_CENT = eINSTANCE.getaAirStat_AeroCent();

    /**
     * The meta object literal for the '<em><b>Strc Twst</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__STRC_TWST = eINSTANCE.getaAirStat_StrcTwst();

    /**
     * The meta object literal for the '<em><b>BMass Den</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__BMASS_DEN = eINSTANCE.getaAirStat_BMassDen();

    /**
     * The meta object literal for the '<em><b>Flp Stff</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__FLP_STFF = eINSTANCE.getaAirStat_FlpStff();

    /**
     * The meta object literal for the '<em><b>Edg Stff</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__EDG_STFF = eINSTANCE.getaAirStat_EdgStff();

    /**
     * The meta object literal for the '<em><b>GJ Stff</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__GJ_STFF = eINSTANCE.getaAirStat_GJStff();

    /**
     * The meta object literal for the '<em><b>EA Stff</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__EA_STFF = eINSTANCE.getaAirStat_EAStff();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__ALPHA = eINSTANCE.getaAirStat_Alpha();

    /**
     * The meta object literal for the '<em><b>Flp Iner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__FLP_INER = eINSTANCE.getaAirStat_FlpIner();

    /**
     * The meta object literal for the '<em><b>Edg Iner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__EDG_INER = eINSTANCE.getaAirStat_EdgIner();

    /**
     * The meta object literal for the '<em><b>Precrv Ref</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__PRECRV_REF = eINSTANCE.getaAirStat_PrecrvRef();

    /**
     * The meta object literal for the '<em><b>Preswp Ref</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__PRESWP_REF = eINSTANCE.getaAirStat_PreswpRef();

    /**
     * The meta object literal for the '<em><b>Flpcg Of</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__FLPCG_OF = eINSTANCE.getaAirStat_FlpcgOf();

    /**
     * The meta object literal for the '<em><b>Edgcg Of</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__EDGCG_OF = eINSTANCE.getaAirStat_EdgcgOf();

    /**
     * The meta object literal for the '<em><b>Flp EA Of</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__FLP_EA_OF = eINSTANCE.getaAirStat_FlpEAOf();

    /**
     * The meta object literal for the '<em><b>Edg EA Of</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AAIR_STAT__EDG_EA_OF = eINSTANCE.getaAirStat_EdgEAOf();

  }

} //FastbldPackage
