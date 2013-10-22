/**
 */
package sc.ndt.editor.bmodestsp;

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
 * @see sc.ndt.editor.bmodestsp.BmodestspFactory
 * @model kind="package"
 * @generated
 */
public interface BmodestspPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bmodestsp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/Bmodestsp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bmodestsp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BmodestspPackage eINSTANCE = sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodestsp.impl.ModelBmodestspImpl <em>Model Bmodestsp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodestsp.impl.ModelBmodestspImpl
   * @see sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl#getModelBmodestsp()
   * @generated
   */
  int MODEL_BMODESTSP = 0;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESTSP__HEAD = 0;

  /**
   * The feature id for the '<em><b>NNodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESTSP__NNODES = 1;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESTSP__SECTIONS = 2;

  /**
   * The number of structural features of the '<em>Model Bmodestsp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BMODESTSP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodestsp.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodestsp.impl.HeaderImpl
   * @see sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl#getHeader()
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
   * The meta object id for the '{@link sc.ndt.editor.bmodestsp.impl.iNodesImpl <em>iNodes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodestsp.impl.iNodesImpl
   * @see sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl#getiNodes()
   * @generated
   */
  int INODES = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODES__VALUE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODES__NAME = 1;

  /**
   * The number of structural features of the '<em>iNodes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INODES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sc.ndt.editor.bmodestsp.impl.aSecImpl <em>aSec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.bmodestsp.impl.aSecImpl
   * @see sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl#getaSec()
   * @generated
   */
  int ASEC = 3;

  /**
   * The feature id for the '<em><b>Sec loc</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__SEC_LOC = 0;

  /**
   * The feature id for the '<em><b>Str tw</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__STR_TW = 1;

  /**
   * The feature id for the '<em><b>Tw iner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__TW_INER = 2;

  /**
   * The feature id for the '<em><b>Mass den</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__MASS_DEN = 3;

  /**
   * The feature id for the '<em><b>Flp iner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__FLP_INER = 4;

  /**
   * The feature id for the '<em><b>Edge iner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__EDGE_INER = 5;

  /**
   * The feature id for the '<em><b>Flp stff</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__FLP_STFF = 6;

  /**
   * The feature id for the '<em><b>Edge stff</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__EDGE_STFF = 7;

  /**
   * The feature id for the '<em><b>Tor stff</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__TOR_STFF = 8;

  /**
   * The feature id for the '<em><b>Axial stff</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__AXIAL_STFF = 9;

  /**
   * The feature id for the '<em><b>Cg offst</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__CG_OFFST = 10;

  /**
   * The feature id for the '<em><b>Sc offst</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__SC_OFFST = 11;

  /**
   * The feature id for the '<em><b>Tc offst</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC__TC_OFFST = 12;

  /**
   * The number of structural features of the '<em>aSec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASEC_FEATURE_COUNT = 13;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodestsp.ModelBmodestsp <em>Model Bmodestsp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Bmodestsp</em>'.
   * @see sc.ndt.editor.bmodestsp.ModelBmodestsp
   * @generated
   */
  EClass getModelBmodestsp();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see sc.ndt.editor.bmodestsp.ModelBmodestsp#getHead()
   * @see #getModelBmodestsp()
   * @generated
   */
  EReference getModelBmodestsp_Head();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getNNodes <em>NNodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>NNodes</em>'.
   * @see sc.ndt.editor.bmodestsp.ModelBmodestsp#getNNodes()
   * @see #getModelBmodestsp()
   * @generated
   */
  EReference getModelBmodestsp_NNodes();

  /**
   * Returns the meta object for the containment reference '{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sections</em>'.
   * @see sc.ndt.editor.bmodestsp.ModelBmodestsp#getSections()
   * @see #getModelBmodestsp()
   * @generated
   */
  EReference getModelBmodestsp_Sections();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodestsp.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see sc.ndt.editor.bmodestsp.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodestsp.Header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodestsp.Header#getName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodestsp.iNodes <em>iNodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>iNodes</em>'.
   * @see sc.ndt.editor.bmodestsp.iNodes
   * @generated
   */
  EClass getiNodes();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodestsp.iNodes#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see sc.ndt.editor.bmodestsp.iNodes#getValue()
   * @see #getiNodes()
   * @generated
   */
  EAttribute getiNodes_Value();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.bmodestsp.iNodes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sc.ndt.editor.bmodestsp.iNodes#getName()
   * @see #getiNodes()
   * @generated
   */
  EAttribute getiNodes_Name();

  /**
   * Returns the meta object for class '{@link sc.ndt.editor.bmodestsp.aSec <em>aSec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aSec</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec
   * @generated
   */
  EClass getaSec();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getSec_loc <em>Sec loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sec loc</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getSec_loc()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Sec_loc();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getStr_tw <em>Str tw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Str tw</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getStr_tw()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Str_tw();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getTw_iner <em>Tw iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tw iner</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getTw_iner()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Tw_iner();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getMass_den <em>Mass den</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mass den</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getMass_den()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Mass_den();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getFlp_iner <em>Flp iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flp iner</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getFlp_iner()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Flp_iner();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getEdge_iner <em>Edge iner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Edge iner</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getEdge_iner()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Edge_iner();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getFlp_stff <em>Flp stff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flp stff</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getFlp_stff()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Flp_stff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getEdge_stff <em>Edge stff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Edge stff</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getEdge_stff()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Edge_stff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getTor_stff <em>Tor stff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tor stff</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getTor_stff()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Tor_stff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getAxial_stff <em>Axial stff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Axial stff</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getAxial_stff()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Axial_stff();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getCg_offst <em>Cg offst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cg offst</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getCg_offst()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Cg_offst();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getSc_offst <em>Sc offst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sc offst</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getSc_offst()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Sc_offst();

  /**
   * Returns the meta object for the attribute list '{@link sc.ndt.editor.bmodestsp.aSec#getTc_offst <em>Tc offst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tc offst</em>'.
   * @see sc.ndt.editor.bmodestsp.aSec#getTc_offst()
   * @see #getaSec()
   * @generated
   */
  EAttribute getaSec_Tc_offst();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BmodestspFactory getBmodestspFactory();

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
     * The meta object literal for the '{@link sc.ndt.editor.bmodestsp.impl.ModelBmodestspImpl <em>Model Bmodestsp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodestsp.impl.ModelBmodestspImpl
     * @see sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl#getModelBmodestsp()
     * @generated
     */
    EClass MODEL_BMODESTSP = eINSTANCE.getModelBmodestsp();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESTSP__HEAD = eINSTANCE.getModelBmodestsp_Head();

    /**
     * The meta object literal for the '<em><b>NNodes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESTSP__NNODES = eINSTANCE.getModelBmodestsp_NNodes();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BMODESTSP__SECTIONS = eINSTANCE.getModelBmodestsp_Sections();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodestsp.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodestsp.impl.HeaderImpl
     * @see sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl#getHeader()
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
     * The meta object literal for the '{@link sc.ndt.editor.bmodestsp.impl.iNodesImpl <em>iNodes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodestsp.impl.iNodesImpl
     * @see sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl#getiNodes()
     * @generated
     */
    EClass INODES = eINSTANCE.getiNodes();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INODES__VALUE = eINSTANCE.getiNodes_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INODES__NAME = eINSTANCE.getiNodes_Name();

    /**
     * The meta object literal for the '{@link sc.ndt.editor.bmodestsp.impl.aSecImpl <em>aSec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.bmodestsp.impl.aSecImpl
     * @see sc.ndt.editor.bmodestsp.impl.BmodestspPackageImpl#getaSec()
     * @generated
     */
    EClass ASEC = eINSTANCE.getaSec();

    /**
     * The meta object literal for the '<em><b>Sec loc</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__SEC_LOC = eINSTANCE.getaSec_Sec_loc();

    /**
     * The meta object literal for the '<em><b>Str tw</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__STR_TW = eINSTANCE.getaSec_Str_tw();

    /**
     * The meta object literal for the '<em><b>Tw iner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__TW_INER = eINSTANCE.getaSec_Tw_iner();

    /**
     * The meta object literal for the '<em><b>Mass den</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__MASS_DEN = eINSTANCE.getaSec_Mass_den();

    /**
     * The meta object literal for the '<em><b>Flp iner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__FLP_INER = eINSTANCE.getaSec_Flp_iner();

    /**
     * The meta object literal for the '<em><b>Edge iner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__EDGE_INER = eINSTANCE.getaSec_Edge_iner();

    /**
     * The meta object literal for the '<em><b>Flp stff</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__FLP_STFF = eINSTANCE.getaSec_Flp_stff();

    /**
     * The meta object literal for the '<em><b>Edge stff</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__EDGE_STFF = eINSTANCE.getaSec_Edge_stff();

    /**
     * The meta object literal for the '<em><b>Tor stff</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__TOR_STFF = eINSTANCE.getaSec_Tor_stff();

    /**
     * The meta object literal for the '<em><b>Axial stff</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__AXIAL_STFF = eINSTANCE.getaSec_Axial_stff();

    /**
     * The meta object literal for the '<em><b>Cg offst</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__CG_OFFST = eINSTANCE.getaSec_Cg_offst();

    /**
     * The meta object literal for the '<em><b>Sc offst</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__SC_OFFST = eINSTANCE.getaSec_Sc_offst();

    /**
     * The meta object literal for the '<em><b>Tc offst</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASEC__TC_OFFST = eINSTANCE.getaSec_Tc_offst();

  }

} //BmodestspPackage
