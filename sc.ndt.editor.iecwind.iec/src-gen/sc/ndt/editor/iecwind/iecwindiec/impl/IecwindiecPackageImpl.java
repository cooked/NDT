/**
 */
package sc.ndt.editor.iecwind.iecwindiec.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.ndt.editor.iecwind.iecwindiec.Header;
import sc.ndt.editor.iecwind.iecwindiec.IecwindiecFactory;
import sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage;
import sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec;
import sc.ndt.editor.iecwind.iecwindiec.Section;
import sc.ndt.editor.iecwind.iecwindiec.iIECClass;
import sc.ndt.editor.iecwind.iecwindiec.iIECStd;
import sc.ndt.editor.iecwind.iecwindiec.iStart;
import sc.ndt.editor.iecwind.iecwindiec.nHubHeight;
import sc.ndt.editor.iecwind.iecwindiec.nRotDiam;
import sc.ndt.editor.iecwind.iecwindiec.nWindIn;
import sc.ndt.editor.iecwind.iecwindiec.nWindNom;
import sc.ndt.editor.iecwind.iecwindiec.nWindOut;
import sc.ndt.editor.iecwind.iecwindiec.nWindSlope;
import sc.ndt.editor.iecwind.iecwindiec.sWindTurb;
import sc.ndt.editor.iecwind.iecwindiec.siUnits;
import sc.ndt.editor.iecwind.iecwindiec.vOutList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IecwindiecPackageImpl extends EPackageImpl implements IecwindiecPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelIecwindiecEClass = null;

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
  private EClass sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siUnitsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iIECClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sWindTurbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nWindSlopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iIECStdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHubHeightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRotDiamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nWindInEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nWindNomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nWindOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vOutListEClass = null;

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
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private IecwindiecPackageImpl()
  {
    super(eNS_URI, IecwindiecFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link IecwindiecPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static IecwindiecPackage init()
  {
    if (isInited) return (IecwindiecPackage)EPackage.Registry.INSTANCE.getEPackage(IecwindiecPackage.eNS_URI);

    // Obtain or create and register package
    IecwindiecPackageImpl theIecwindiecPackage = (IecwindiecPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IecwindiecPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IecwindiecPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theIecwindiecPackage.createPackageContents();

    // Initialize created meta-data
    theIecwindiecPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theIecwindiecPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(IecwindiecPackage.eNS_URI, theIecwindiecPackage);
    return theIecwindiecPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelIecwindiec()
  {
    return modelIecwindiecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_Head()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_Sections()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_SIUnits()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_Start()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_IECClass()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_WindTurb()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_WindSlope()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_IECStandard()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_HubHeight()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_RotDiam()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_WindIn()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_WindNom()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_WindOut()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIecwindiec_OutList()
  {
    return (EReference)modelIecwindiecEClass.getEStructuralFeatures().get(13);
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
  public EAttribute getHeader_Row()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Name()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsiUnits()
  {
    return siUnitsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsiUnits_Value()
  {
    return (EAttribute)siUnitsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiStart()
  {
    return iStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiStart_Value()
  {
    return (EAttribute)iStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiIECClass()
  {
    return iIECClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiIECClass_Value()
  {
    return (EAttribute)iIECClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsWindTurb()
  {
    return sWindTurbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsWindTurb_Value()
  {
    return (EAttribute)sWindTurbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnWindSlope()
  {
    return nWindSlopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnWindSlope_Value()
  {
    return (EAttribute)nWindSlopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiIECStd()
  {
    return iIECStdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiIECStd_Value()
  {
    return (EAttribute)iIECStdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHubHeight()
  {
    return nHubHeightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubHeight_Value()
  {
    return (EAttribute)nHubHeightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRotDiam()
  {
    return nRotDiamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRotDiam_Value()
  {
    return (EAttribute)nRotDiamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnWindIn()
  {
    return nWindInEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnWindIn_Value()
  {
    return (EAttribute)nWindInEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnWindNom()
  {
    return nWindNomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnWindNom_Value()
  {
    return (EAttribute)nWindNomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnWindOut()
  {
    return nWindOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnWindOut_Value()
  {
    return (EAttribute)nWindOutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvOutList()
  {
    return vOutListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvOutList_Value()
  {
    return (EAttribute)vOutListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IecwindiecFactory getIecwindiecFactory()
  {
    return (IecwindiecFactory)getEFactoryInstance();
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
    modelIecwindiecEClass = createEClass(MODEL_IECWINDIEC);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__HEAD);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__SECTIONS);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__SI_UNITS);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__START);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__IEC_CLASS);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__WIND_TURB);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__WIND_SLOPE);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__IEC_STANDARD);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__HUB_HEIGHT);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__ROT_DIAM);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__WIND_IN);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__WIND_NOM);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__WIND_OUT);
    createEReference(modelIecwindiecEClass, MODEL_IECWINDIEC__OUT_LIST);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__ROW);

    sectionEClass = createEClass(SECTION);
    createEAttribute(sectionEClass, SECTION__NAME);

    siUnitsEClass = createEClass(SI_UNITS);
    createEAttribute(siUnitsEClass, SI_UNITS__VALUE);

    iStartEClass = createEClass(ISTART);
    createEAttribute(iStartEClass, ISTART__VALUE);

    iIECClassEClass = createEClass(IIEC_CLASS);
    createEAttribute(iIECClassEClass, IIEC_CLASS__VALUE);

    sWindTurbEClass = createEClass(SWIND_TURB);
    createEAttribute(sWindTurbEClass, SWIND_TURB__VALUE);

    nWindSlopeEClass = createEClass(NWIND_SLOPE);
    createEAttribute(nWindSlopeEClass, NWIND_SLOPE__VALUE);

    iIECStdEClass = createEClass(IIEC_STD);
    createEAttribute(iIECStdEClass, IIEC_STD__VALUE);

    nHubHeightEClass = createEClass(NHUB_HEIGHT);
    createEAttribute(nHubHeightEClass, NHUB_HEIGHT__VALUE);

    nRotDiamEClass = createEClass(NROT_DIAM);
    createEAttribute(nRotDiamEClass, NROT_DIAM__VALUE);

    nWindInEClass = createEClass(NWIND_IN);
    createEAttribute(nWindInEClass, NWIND_IN__VALUE);

    nWindNomEClass = createEClass(NWIND_NOM);
    createEAttribute(nWindNomEClass, NWIND_NOM__VALUE);

    nWindOutEClass = createEClass(NWIND_OUT);
    createEAttribute(nWindOutEClass, NWIND_OUT__VALUE);

    vOutListEClass = createEClass(VOUT_LIST);
    createEAttribute(vOutListEClass, VOUT_LIST__VALUE);
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
    initEClass(modelIecwindiecEClass, ModelIecwindiec.class, "ModelIecwindiec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelIecwindiec_Head(), this.getHeader(), null, "Head", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_Sections(), this.getSection(), null, "sections", null, 0, -1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_SIUnits(), this.getsiUnits(), null, "SIUnits", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_Start(), this.getiStart(), null, "Start", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_IECClass(), this.getiIECClass(), null, "IECClass", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_WindTurb(), this.getsWindTurb(), null, "WindTurb", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_WindSlope(), this.getnWindSlope(), null, "WindSlope", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_IECStandard(), this.getiIECStd(), null, "IECStandard", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_HubHeight(), this.getnHubHeight(), null, "HubHeight", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_RotDiam(), this.getnRotDiam(), null, "RotDiam", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_WindIn(), this.getnWindIn(), null, "WindIn", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_WindNom(), this.getnWindNom(), null, "WindNom", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_WindOut(), this.getnWindOut(), null, "WindOut", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelIecwindiec_OutList(), this.getvOutList(), null, "OutList", null, 0, 1, ModelIecwindiec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_Row(), ecorePackage.getEString(), "row", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(siUnitsEClass, siUnits.class, "siUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsiUnits_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, siUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iStartEClass, iStart.class, "iStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiStart_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, iStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iIECClassEClass, iIECClass.class, "iIECClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiIECClass_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iIECClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sWindTurbEClass, sWindTurb.class, "sWindTurb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsWindTurb_Value(), ecorePackage.getEString(), "value", null, 0, 1, sWindTurb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nWindSlopeEClass, nWindSlope.class, "nWindSlope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnWindSlope_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nWindSlope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iIECStdEClass, iIECStd.class, "iIECStd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiIECStd_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iIECStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nHubHeightEClass, nHubHeight.class, "nHubHeight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnHubHeight_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nHubHeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRotDiamEClass, nRotDiam.class, "nRotDiam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRotDiam_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nRotDiam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nWindInEClass, nWindIn.class, "nWindIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnWindIn_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nWindIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nWindNomEClass, nWindNom.class, "nWindNom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnWindNom_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nWindNom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nWindOutEClass, nWindOut.class, "nWindOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnWindOut_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nWindOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vOutListEClass, vOutList.class, "vOutList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvOutList_Value(), ecorePackage.getEString(), "value", null, 0, 1, vOutList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //IecwindiecPackageImpl
