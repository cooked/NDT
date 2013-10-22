/**
 */
package sc.ndt.editor.bmodestsp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.ndt.editor.bmodestsp.BmodestspFactory;
import sc.ndt.editor.bmodestsp.BmodestspPackage;
import sc.ndt.editor.bmodestsp.Header;
import sc.ndt.editor.bmodestsp.ModelBmodestsp;
import sc.ndt.editor.bmodestsp.aSec;
import sc.ndt.editor.bmodestsp.iNodes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BmodestspPackageImpl extends EPackageImpl implements BmodestspPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelBmodestspEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iNodesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aSecEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see sc.ndt.editor.bmodestsp.BmodestspPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BmodestspPackageImpl()
  {
    super(eNS_URI, BmodestspFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BmodestspPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BmodestspPackage init()
  {
    if (isInited) return (BmodestspPackage)EPackage.Registry.INSTANCE.getEPackage(BmodestspPackage.eNS_URI);

    // Obtain or create and register package
    BmodestspPackageImpl theBmodestspPackage = (BmodestspPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BmodestspPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BmodestspPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBmodestspPackage.createPackageContents();

    // Initialize created meta-data
    theBmodestspPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBmodestspPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BmodestspPackage.eNS_URI, theBmodestspPackage);
    return theBmodestspPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelBmodestsp()
  {
    return modelBmodestspEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodestsp_Head()
  {
    return (EReference)modelBmodestspEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodestsp_NNodes()
  {
    return (EReference)modelBmodestspEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodestsp_Sections()
  {
    return (EReference)modelBmodestspEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader()
  {
    return headerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader_Name()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiNodes()
  {
    return iNodesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNodes_Value()
  {
    return (EAttribute)iNodesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNodes_Name()
  {
    return (EAttribute)iNodesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaSec()
  {
    return aSecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Sec_loc()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Str_tw()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Tw_iner()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Mass_den()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Flp_iner()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Edge_iner()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Flp_stff()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Edge_stff()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Tor_stff()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Axial_stff()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Cg_offst()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Sc_offst()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaSec_Tc_offst()
  {
    return (EAttribute)aSecEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodestspFactory getBmodestspFactory()
  {
    return (BmodestspFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelBmodestspEClass = createEClass(MODEL_BMODESTSP);
    createEReference(modelBmodestspEClass, MODEL_BMODESTSP__HEAD);
    createEReference(modelBmodestspEClass, MODEL_BMODESTSP__NNODES);
    createEReference(modelBmodestspEClass, MODEL_BMODESTSP__SECTIONS);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__NAME);

    iNodesEClass = createEClass(INODES);
    createEAttribute(iNodesEClass, INODES__VALUE);
    createEAttribute(iNodesEClass, INODES__NAME);

    aSecEClass = createEClass(ASEC);
    createEAttribute(aSecEClass, ASEC__SEC_LOC);
    createEAttribute(aSecEClass, ASEC__STR_TW);
    createEAttribute(aSecEClass, ASEC__TW_INER);
    createEAttribute(aSecEClass, ASEC__MASS_DEN);
    createEAttribute(aSecEClass, ASEC__FLP_INER);
    createEAttribute(aSecEClass, ASEC__EDGE_INER);
    createEAttribute(aSecEClass, ASEC__FLP_STFF);
    createEAttribute(aSecEClass, ASEC__EDGE_STFF);
    createEAttribute(aSecEClass, ASEC__TOR_STFF);
    createEAttribute(aSecEClass, ASEC__AXIAL_STFF);
    createEAttribute(aSecEClass, ASEC__CG_OFFST);
    createEAttribute(aSecEClass, ASEC__SC_OFFST);
    createEAttribute(aSecEClass, ASEC__TC_OFFST);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelBmodestspEClass, ModelBmodestsp.class, "ModelBmodestsp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelBmodestsp_Head(), this.getHeader(), null, "Head", null, 0, 1, ModelBmodestsp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodestsp_NNodes(), this.getiNodes(), null, "NNodes", null, 0, 1, ModelBmodestsp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodestsp_Sections(), this.getaSec(), null, "Sections", null, 0, 1, ModelBmodestsp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iNodesEClass, iNodes.class, "iNodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiNodes_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iNodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiNodes_Name(), ecorePackage.getEString(), "name", null, 0, 1, iNodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aSecEClass, aSec.class, "aSec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaSec_Sec_loc(), ecorePackage.getEFloat(), "sec_loc", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Str_tw(), ecorePackage.getEFloat(), "str_tw", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Tw_iner(), ecorePackage.getEFloat(), "tw_iner", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Mass_den(), ecorePackage.getEFloat(), "mass_den", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Flp_iner(), ecorePackage.getEFloat(), "flp_iner", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Edge_iner(), ecorePackage.getEFloat(), "edge_iner", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Flp_stff(), ecorePackage.getEFloat(), "flp_stff", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Edge_stff(), ecorePackage.getEFloat(), "edge_stff", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Tor_stff(), ecorePackage.getEFloat(), "tor_stff", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Axial_stff(), ecorePackage.getEFloat(), "axial_stff", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Cg_offst(), ecorePackage.getEFloat(), "cg_offst", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Sc_offst(), ecorePackage.getEFloat(), "sc_offst", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaSec_Tc_offst(), ecorePackage.getEFloat(), "tc_offst", null, 0, -1, aSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BmodestspPackageImpl
