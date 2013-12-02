/**
 */
package sc.ndt.editor.bmodes.bmodesout;

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
 * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutFactory
 * @model kind="package"
 * @generated
 */
public interface BmodesoutPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bmodesout";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/bmodes/Bmodesout";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bmodesout";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BmodesoutPackage eINSTANCE = sc.ndt.editor.bmodes.bmodesout.impl.BmodesoutPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesout.impl.ModelBmodesoutImpl <em>Model Bmodesout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesout.impl.ModelBmodesoutImpl
   * @see sc.ndt.editor.bmodes.bmodesout.impl.BmodesoutPackageImpl#getModelBmodesout()
   * @generated
   */
  int MODEL_BMODESOUT = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESOUT__HEAD = 0;

  /**
   * The feature id for the '<em><b>Modes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESOUT__MODES = 1;

  /**
   * The number of structural features of the '<em>Model Bmodesout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESOUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesout.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesout.impl.HeaderImpl
   * @see sc.ndt.editor.bmodes.bmodesout.impl.BmodesoutPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__N = 0;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl <em>Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl
   * @see sc.ndt.editor.bmodes.bmodesout.impl.BmodesoutPackageImpl#getMode()
   * @generated
   */
  int MODE = 2;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__INDEX = 0;

  /**
   * The feature id for the '<em><b>Freq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__FREQ = 1;

  /**
   * The feature id for the '<em><b>Span loc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__SPAN_LOC = 2;

  /**
   * The feature id for the '<em><b>Flap disp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__FLAP_DISP = 3;

  /**
   * The feature id for the '<em><b>Flap slope</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__FLAP_SLOPE = 4;

  /**
   * The feature id for the '<em><b>Lag disp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__LAG_DISP = 5;

  /**
   * The feature id for the '<em><b>Lag slope</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__LAG_SLOPE = 6;

  /**
   * The feature id for the '<em><b>Twist</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__TWIST = 7;

  /**
   * The number of structural features of the '<em>Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_FEATURE_COUNT = 8;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesout.ModelBmodesout <em>Model Bmodesout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Bmodesout</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.ModelBmodesout
   * @generated
   */
  EClass getModelBmodesout();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodes.bmodesout.ModelBmodesout#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.ModelBmodesout#getHead()
   * @see #getModelBmodesout()
   * @generated
   */
  EReference getModelBmodesout_Head();

  /**
   * Returns the meta object for the containment reference list '{@link sc.ndt.editor.bmodes.bmodesout.ModelBmodesout#getModes <em>Modes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modes</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.ModelBmodesout#getModes()
   * @see #getModelBmodesout()
   * @generated
   */
  EReference getModelBmodesout_Modes();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesout.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesout.Header#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Header#getN()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_N();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodes.bmodesout.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode
   * @generated
   */
  EClass getMode();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode#getIndex()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Index();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getFreq <em>Freq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Freq</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode#getFreq()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Freq();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getSpan_loc <em>Span loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Span loc</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode#getSpan_loc()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Span_loc();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getFlap_disp <em>Flap disp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flap disp</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode#getFlap_disp()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Flap_disp();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getFlap_slope <em>Flap slope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flap slope</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode#getFlap_slope()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Flap_slope();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getLag_disp <em>Lag disp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Lag disp</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode#getLag_disp()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Lag_disp();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getLag_slope <em>Lag slope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Lag slope</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode#getLag_slope()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Lag_slope();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getTwist <em>Twist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Twist</em>'.
   * @see sc.ndt.editor.bmodes.bmodesout.Mode#getTwist()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Twist();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BmodesoutFactory getBmodesoutFactory();

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
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesout.impl.ModelBmodesoutImpl <em>Model Bmodesout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesout.impl.ModelBmodesoutImpl
     * @see sc.ndt.editor.bmodes.bmodesout.impl.BmodesoutPackageImpl#getModelBmodesout()
     * @generated
     */
    EClass MODEL_BMODESOUT = eINSTANCE.getModelBmodesout();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESOUT__HEAD = eINSTANCE.getModelBmodesout_Head();

    /**
     * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESOUT__MODES = eINSTANCE.getModelBmodesout_Modes();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesout.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesout.impl.HeaderImpl
     * @see sc.ndt.editor.bmodes.bmodesout.impl.BmodesoutPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__N = eINSTANCE.getHeader_N();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl <em>Mode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl
     * @see sc.ndt.editor.bmodes.bmodesout.impl.BmodesoutPackageImpl#getMode()
     * @generated
     */
    EClass MODE = eINSTANCE.getMode();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__INDEX = eINSTANCE.getMode_Index();

    /**
     * The meta object literal for the '<em><b>Freq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__FREQ = eINSTANCE.getMode_Freq();

    /**
     * The meta object literal for the '<em><b>Span loc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__SPAN_LOC = eINSTANCE.getMode_Span_loc();

    /**
     * The meta object literal for the '<em><b>Flap disp</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__FLAP_DISP = eINSTANCE.getMode_Flap_disp();

    /**
     * The meta object literal for the '<em><b>Flap slope</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__FLAP_SLOPE = eINSTANCE.getMode_Flap_slope();

    /**
     * The meta object literal for the '<em><b>Lag disp</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__LAG_DISP = eINSTANCE.getMode_Lag_disp();

    /**
     * The meta object literal for the '<em><b>Lag slope</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__LAG_SLOPE = eINSTANCE.getMode_Lag_slope();

    /**
     * The meta object literal for the '<em><b>Twist</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__TWIST = eINSTANCE.getMode_Twist();

  }

} //BmodesoutPackage
