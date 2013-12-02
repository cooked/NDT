/**
 */
package sc.ndt.editor.bmodes.bmodesout.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.ndt.editor.bmodes.bmodesout.BmodesoutFactory;
import sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage;
import sc.ndt.editor.bmodes.bmodesout.Header;
import sc.ndt.editor.bmodes.bmodesout.Mode;
import sc.ndt.editor.bmodes.bmodesout.ModelBmodesout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BmodesoutPackageImpl extends EPackageImpl implements BmodesoutPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelBmodesoutEClass = null;

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
  private EClass modeEClass = null;

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
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BmodesoutPackageImpl()
  {
    super(eNS_URI, BmodesoutFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BmodesoutPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BmodesoutPackage init()
  {
    if (isInited) return (BmodesoutPackage)EPackage.Registry.INSTANCE.getEPackage(BmodesoutPackage.eNS_URI);

    // Obtain or create and register package
    BmodesoutPackageImpl theBmodesoutPackage = (BmodesoutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BmodesoutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BmodesoutPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBmodesoutPackage.createPackageContents();

    // Initialize created meta-data
    theBmodesoutPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBmodesoutPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BmodesoutPackage.eNS_URI, theBmodesoutPackage);
    return theBmodesoutPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelBmodesout()
  {
    return modelBmodesoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesout_Head()
  {
    return (EReference)modelBmodesoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesout_Modes()
  {
    return (EReference)modelBmodesoutEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getHeader_N()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMode()
  {
    return modeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Index()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Freq()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Span_loc()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Flap_disp()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Flap_slope()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Lag_disp()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Lag_slope()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Twist()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesoutFactory getBmodesoutFactory()
  {
    return (BmodesoutFactory)getEFactoryInstance();
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
    modelBmodesoutEClass = createEClass(MODEL_BMODESOUT);
    createEReference(modelBmodesoutEClass, MODEL_BMODESOUT__HEAD);
    createEReference(modelBmodesoutEClass, MODEL_BMODESOUT__MODES);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__N);

    modeEClass = createEClass(MODE);
    createEAttribute(modeEClass, MODE__INDEX);
    createEAttribute(modeEClass, MODE__FREQ);
    createEAttribute(modeEClass, MODE__SPAN_LOC);
    createEAttribute(modeEClass, MODE__FLAP_DISP);
    createEAttribute(modeEClass, MODE__FLAP_SLOPE);
    createEAttribute(modeEClass, MODE__LAG_DISP);
    createEAttribute(modeEClass, MODE__LAG_SLOPE);
    createEAttribute(modeEClass, MODE__TWIST);
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
    initEClass(modelBmodesoutEClass, ModelBmodesout.class, "ModelBmodesout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelBmodesout_Head(), this.getHeader(), null, "Head", null, 0, 1, ModelBmodesout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesout_Modes(), this.getMode(), null, "Modes", null, 0, -1, ModelBmodesout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_N(), ecorePackage.getEInt(), "n", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMode_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMode_Freq(), ecorePackage.getEFloat(), "freq", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMode_Span_loc(), ecorePackage.getEFloat(), "span_loc", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMode_Flap_disp(), ecorePackage.getEFloat(), "flap_disp", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMode_Flap_slope(), ecorePackage.getEFloat(), "flap_slope", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMode_Lag_disp(), ecorePackage.getEFloat(), "lag_disp", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMode_Lag_slope(), ecorePackage.getEFloat(), "lag_slope", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMode_Twist(), ecorePackage.getEFloat(), "twist", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BmodesoutPackageImpl
