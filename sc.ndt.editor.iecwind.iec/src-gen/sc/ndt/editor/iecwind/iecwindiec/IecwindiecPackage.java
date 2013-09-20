/**
 */
package sc.ndt.editor.iecwind.iecwindiec;

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
 * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecFactory
 * @model kind="package"
 * @generated
 */
public interface IecwindiecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "iecwindiec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/iecwind/Iecwindiec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "iecwindiec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IecwindiecPackage eINSTANCE = sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl <em>Model Iecwindiec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getModelIecwindiec()
   * @generated
   */
  int MODEL_IECWINDIEC = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__HEAD = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__SECTIONS = 1;

  /**
   * The feature id for the '<em><b>SI Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__SI_UNITS = 2;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__START = 3;

  /**
   * The feature id for the '<em><b>IEC Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__IEC_CLASS = 4;

  /**
   * The feature id for the '<em><b>Wind Turb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__WIND_TURB = 5;

  /**
   * The feature id for the '<em><b>Wind Slope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__WIND_SLOPE = 6;

  /**
   * The feature id for the '<em><b>IEC Standard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__IEC_STANDARD = 7;

  /**
   * The feature id for the '<em><b>Hub Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__HUB_HEIGHT = 8;

  /**
   * The feature id for the '<em><b>Rot Diam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__ROT_DIAM = 9;

  /**
   * The feature id for the '<em><b>Wind In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__WIND_IN = 10;

  /**
   * The feature id for the '<em><b>Wind Nom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__WIND_NOM = 11;

  /**
   * The feature id for the '<em><b>Wind Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__WIND_OUT = 12;

  /**
   * The feature id for the '<em><b>Out List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC__OUT_LIST = 13;

  /**
   * The number of structural features of the '<em>Model Iecwindiec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IECWINDIEC_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.HeaderImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 1;

  /**
   * The feature id for the '<em><b>Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__ROW = 0;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.SectionImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getSection()
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
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.siUnitsImpl <em>si Units</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.siUnitsImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getsiUnits()
   * @generated
   */
  int SI_UNITS = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SI_UNITS__VALUE = 0;

  /**
   * The number of structural features of the '<em>si Units</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SI_UNITS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.iStartImpl <em>iStart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.iStartImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getiStart()
   * @generated
   */
  int ISTART = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISTART__VALUE = 0;

  /**
   * The number of structural features of the '<em>iStart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISTART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.iIECClassImpl <em>iIEC Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.iIECClassImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getiIECClass()
   * @generated
   */
  int IIEC_CLASS = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IIEC_CLASS__VALUE = 0;

  /**
   * The number of structural features of the '<em>iIEC Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IIEC_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.sWindTurbImpl <em>sWind Turb</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.sWindTurbImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getsWindTurb()
   * @generated
   */
  int SWIND_TURB = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIND_TURB__VALUE = 0;

  /**
   * The number of structural features of the '<em>sWind Turb</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIND_TURB_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nWindSlopeImpl <em>nWind Slope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.nWindSlopeImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnWindSlope()
   * @generated
   */
  int NWIND_SLOPE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NWIND_SLOPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>nWind Slope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NWIND_SLOPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.iIECStdImpl <em>iIEC Std</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.iIECStdImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getiIECStd()
   * @generated
   */
  int IIEC_STD = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IIEC_STD__VALUE = 0;

  /**
   * The number of structural features of the '<em>iIEC Std</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IIEC_STD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nHubHeightImpl <em>nHub Height</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.nHubHeightImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnHubHeight()
   * @generated
   */
  int NHUB_HEIGHT = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_HEIGHT__VALUE = 0;

  /**
   * The number of structural features of the '<em>nHub Height</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NHUB_HEIGHT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nRotDiamImpl <em>nRot Diam</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.nRotDiamImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnRotDiam()
   * @generated
   */
  int NROT_DIAM = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NROT_DIAM__VALUE = 0;

  /**
   * The number of structural features of the '<em>nRot Diam</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NROT_DIAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nWindInImpl <em>nWind In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.nWindInImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnWindIn()
   * @generated
   */
  int NWIND_IN = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NWIND_IN__VALUE = 0;

  /**
   * The number of structural features of the '<em>nWind In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NWIND_IN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nWindNomImpl <em>nWind Nom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.nWindNomImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnWindNom()
   * @generated
   */
  int NWIND_NOM = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NWIND_NOM__VALUE = 0;

  /**
   * The number of structural features of the '<em>nWind Nom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NWIND_NOM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nWindOutImpl <em>nWind Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.nWindOutImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnWindOut()
   * @generated
   */
  int NWIND_OUT = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NWIND_OUT__VALUE = 0;

  /**
   * The number of structural features of the '<em>nWind Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NWIND_OUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.vOutListImpl <em>vOut List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.vOutListImpl
   * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getvOutList()
   * @generated
   */
  int VOUT_LIST = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOUT_LIST__VALUE = 0;

  /**
   * The number of structural features of the '<em>vOut List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOUT_LIST_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec <em>Model Iecwindiec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Iecwindiec</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec
   * @generated
   */
  EClass getModelIecwindiec();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getHead()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_Head();

  /**
   * Returns the meta object for the containment reference list '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getSections()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_Sections();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getSIUnits <em>SI Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SI Units</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getSIUnits()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_SIUnits();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getStart()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_Start();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getIECClass <em>IEC Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IEC Class</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getIECClass()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_IECClass();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindTurb <em>Wind Turb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wind Turb</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindTurb()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_WindTurb();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindSlope <em>Wind Slope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wind Slope</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindSlope()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_WindSlope();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getIECStandard <em>IEC Standard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IEC Standard</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getIECStandard()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_IECStandard();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getHubHeight <em>Hub Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hub Height</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getHubHeight()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_HubHeight();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getRotDiam <em>Rot Diam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rot Diam</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getRotDiam()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_RotDiam();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindIn <em>Wind In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wind In</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindIn()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_WindIn();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindNom <em>Wind Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wind Nom</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindNom()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_WindNom();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindOut <em>Wind Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wind Out</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindOut()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_WindOut();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getOutList <em>Out List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out List</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getOutList()
   * @see #getModelIecwindiec()
   * @generated
   */
  EReference getModelIecwindiec_OutList();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.Header#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Row</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.Header#getRow()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Row();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.siUnits <em>si Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>si Units</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.siUnits
   * @generated
   */
  EClass getsiUnits();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.siUnits#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.siUnits#isValue()
   * @see #getsiUnits()
   * @generated
   */
  EAttribute getsiUnits_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.iStart <em>iStart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iStart</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.iStart
   * @generated
   */
  EClass getiStart();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.iStart#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.iStart#getValue()
   * @see #getiStart()
   * @generated
   */
  EAttribute getiStart_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.iIECClass <em>iIEC Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iIEC Class</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.iIECClass
   * @generated
   */
  EClass getiIECClass();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.iIECClass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.iIECClass#getValue()
   * @see #getiIECClass()
   * @generated
   */
  EAttribute getiIECClass_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.sWindTurb <em>sWind Turb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sWind Turb</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.sWindTurb
   * @generated
   */
  EClass getsWindTurb();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.sWindTurb#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.sWindTurb#getValue()
   * @see #getsWindTurb()
   * @generated
   */
  EAttribute getsWindTurb_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.nWindSlope <em>nWind Slope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nWind Slope</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindSlope
   * @generated
   */
  EClass getnWindSlope();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.nWindSlope#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindSlope#getValue()
   * @see #getnWindSlope()
   * @generated
   */
  EAttribute getnWindSlope_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.iIECStd <em>iIEC Std</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iIEC Std</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.iIECStd
   * @generated
   */
  EClass getiIECStd();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.iIECStd#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.iIECStd#getValue()
   * @see #getiIECStd()
   * @generated
   */
  EAttribute getiIECStd_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.nHubHeight <em>nHub Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nHub Height</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nHubHeight
   * @generated
   */
  EClass getnHubHeight();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.nHubHeight#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nHubHeight#getValue()
   * @see #getnHubHeight()
   * @generated
   */
  EAttribute getnHubHeight_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.nRotDiam <em>nRot Diam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nRot Diam</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nRotDiam
   * @generated
   */
  EClass getnRotDiam();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.nRotDiam#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nRotDiam#getValue()
   * @see #getnRotDiam()
   * @generated
   */
  EAttribute getnRotDiam_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.nWindIn <em>nWind In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nWind In</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindIn
   * @generated
   */
  EClass getnWindIn();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.nWindIn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindIn#getValue()
   * @see #getnWindIn()
   * @generated
   */
  EAttribute getnWindIn_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.nWindNom <em>nWind Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nWind Nom</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindNom
   * @generated
   */
  EClass getnWindNom();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.nWindNom#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindNom#getValue()
   * @see #getnWindNom()
   * @generated
   */
  EAttribute getnWindNom_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.nWindOut <em>nWind Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nWind Out</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindOut
   * @generated
   */
  EClass getnWindOut();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.nWindOut#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindOut#getValue()
   * @see #getnWindOut()
   * @generated
   */
  EAttribute getnWindOut_Value();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.iecwind.iecwindiec.vOutList <em>vOut List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vOut List</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.vOutList
   * @generated
   */
  EClass getvOutList();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.iecwind.iecwindiec.vOutList#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.iecwind.iecwindiec.vOutList#getValue()
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
  IecwindiecFactory getIecwindiecFactory();

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
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl <em>Model Iecwindiec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.ModelIecwindiecImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getModelIecwindiec()
     * @generated
     */
    EClass MODEL_IECWINDIEC = eINSTANCE.getModelIecwindiec();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__HEAD = eINSTANCE.getModelIecwindiec_Head();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__SECTIONS = eINSTANCE.getModelIecwindiec_Sections();

    /**
     * The meta object literal for the '<em><b>SI Units</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__SI_UNITS = eINSTANCE.getModelIecwindiec_SIUnits();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__START = eINSTANCE.getModelIecwindiec_Start();

    /**
     * The meta object literal for the '<em><b>IEC Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__IEC_CLASS = eINSTANCE.getModelIecwindiec_IECClass();

    /**
     * The meta object literal for the '<em><b>Wind Turb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__WIND_TURB = eINSTANCE.getModelIecwindiec_WindTurb();

    /**
     * The meta object literal for the '<em><b>Wind Slope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__WIND_SLOPE = eINSTANCE.getModelIecwindiec_WindSlope();

    /**
     * The meta object literal for the '<em><b>IEC Standard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__IEC_STANDARD = eINSTANCE.getModelIecwindiec_IECStandard();

    /**
     * The meta object literal for the '<em><b>Hub Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__HUB_HEIGHT = eINSTANCE.getModelIecwindiec_HubHeight();

    /**
     * The meta object literal for the '<em><b>Rot Diam</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__ROT_DIAM = eINSTANCE.getModelIecwindiec_RotDiam();

    /**
     * The meta object literal for the '<em><b>Wind In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__WIND_IN = eINSTANCE.getModelIecwindiec_WindIn();

    /**
     * The meta object literal for the '<em><b>Wind Nom</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__WIND_NOM = eINSTANCE.getModelIecwindiec_WindNom();

    /**
     * The meta object literal for the '<em><b>Wind Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__WIND_OUT = eINSTANCE.getModelIecwindiec_WindOut();

    /**
     * The meta object literal for the '<em><b>Out List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_IECWINDIEC__OUT_LIST = eINSTANCE.getModelIecwindiec_OutList();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.HeaderImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__ROW = eINSTANCE.getHeader_Row();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.SectionImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getSection()
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
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.siUnitsImpl <em>si Units</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.siUnitsImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getsiUnits()
     * @generated
     */
    EClass SI_UNITS = eINSTANCE.getsiUnits();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SI_UNITS__VALUE = eINSTANCE.getsiUnits_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.iStartImpl <em>iStart</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.iStartImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getiStart()
     * @generated
     */
    EClass ISTART = eINSTANCE.getiStart();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISTART__VALUE = eINSTANCE.getiStart_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.iIECClassImpl <em>iIEC Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.iIECClassImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getiIECClass()
     * @generated
     */
    EClass IIEC_CLASS = eINSTANCE.getiIECClass();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IIEC_CLASS__VALUE = eINSTANCE.getiIECClass_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.sWindTurbImpl <em>sWind Turb</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.sWindTurbImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getsWindTurb()
     * @generated
     */
    EClass SWIND_TURB = eINSTANCE.getsWindTurb();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWIND_TURB__VALUE = eINSTANCE.getsWindTurb_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nWindSlopeImpl <em>nWind Slope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.nWindSlopeImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnWindSlope()
     * @generated
     */
    EClass NWIND_SLOPE = eINSTANCE.getnWindSlope();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NWIND_SLOPE__VALUE = eINSTANCE.getnWindSlope_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.iIECStdImpl <em>iIEC Std</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.iIECStdImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getiIECStd()
     * @generated
     */
    EClass IIEC_STD = eINSTANCE.getiIECStd();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IIEC_STD__VALUE = eINSTANCE.getiIECStd_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nHubHeightImpl <em>nHub Height</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.nHubHeightImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnHubHeight()
     * @generated
     */
    EClass NHUB_HEIGHT = eINSTANCE.getnHubHeight();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NHUB_HEIGHT__VALUE = eINSTANCE.getnHubHeight_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nRotDiamImpl <em>nRot Diam</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.nRotDiamImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnRotDiam()
     * @generated
     */
    EClass NROT_DIAM = eINSTANCE.getnRotDiam();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NROT_DIAM__VALUE = eINSTANCE.getnRotDiam_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nWindInImpl <em>nWind In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.nWindInImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnWindIn()
     * @generated
     */
    EClass NWIND_IN = eINSTANCE.getnWindIn();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NWIND_IN__VALUE = eINSTANCE.getnWindIn_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nWindNomImpl <em>nWind Nom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.nWindNomImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnWindNom()
     * @generated
     */
    EClass NWIND_NOM = eINSTANCE.getnWindNom();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NWIND_NOM__VALUE = eINSTANCE.getnWindNom_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.nWindOutImpl <em>nWind Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.nWindOutImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getnWindOut()
     * @generated
     */
    EClass NWIND_OUT = eINSTANCE.getnWindOut();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NWIND_OUT__VALUE = eINSTANCE.getnWindOut_Value();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.iecwind.iecwindiec.impl.vOutListImpl <em>vOut List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.vOutListImpl
     * @see sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecPackageImpl#getvOutList()
     * @generated
     */
    EClass VOUT_LIST = eINSTANCE.getvOutList();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOUT_LIST__VALUE = eINSTANCE.getvOutList_Value();

  }

} //IecwindiecPackage
