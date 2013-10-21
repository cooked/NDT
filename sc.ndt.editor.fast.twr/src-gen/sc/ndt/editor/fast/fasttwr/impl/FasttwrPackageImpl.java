/**
 */
package sc.ndt.editor.fast.fasttwr.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.ndt.editor.fast.fasttwr.AdjFASt;
import sc.ndt.editor.fast.fasttwr.AdjSSSt;
import sc.ndt.editor.fast.fasttwr.AdjTwMa;
import sc.ndt.editor.fast.fasttwr.FasttwrFactory;
import sc.ndt.editor.fast.fasttwr.FasttwrPackage;
import sc.ndt.editor.fast.fasttwr.Header;
import sc.ndt.editor.fast.fasttwr.ModelFasttwr;
import sc.ndt.editor.fast.fasttwr.Section;
import sc.ndt.editor.fast.fasttwr.aTwrStat;
import sc.ndt.editor.fast.fasttwr.bCalcTMode;
import sc.ndt.editor.fast.fasttwr.nFAStTunr1;
import sc.ndt.editor.fast.fasttwr.nFAStTunr2;
import sc.ndt.editor.fast.fasttwr.nNTwInpSt;
import sc.ndt.editor.fast.fasttwr.nSSStTunr1;
import sc.ndt.editor.fast.fasttwr.nSSStTunr2;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6;
import sc.ndt.editor.fast.fasttwr.nTwrFADmp1;
import sc.ndt.editor.fast.fasttwr.nTwrFADmp2;
import sc.ndt.editor.fast.fasttwr.nTwrSSDmp1;
import sc.ndt.editor.fast.fasttwr.nTwrSSDmp2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FasttwrPackageImpl extends EPackageImpl implements FasttwrPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelFasttwrEClass = null;

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
  private EClass nNTwInpStEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bCalcTModeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwrFADmp1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwrFADmp2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwrSSDmp1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwrSSDmp2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nFAStTunr1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nFAStTunr2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSSStTunr1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSSStTunr2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adjTwMaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adjFAStEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adjSSStEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM1Sh2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM1Sh3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM1Sh4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM1Sh5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM1Sh6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM2Sh2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM2Sh3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM2Sh4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM2Sh5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwFAM2Sh6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM1Sh2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM1Sh3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM1Sh4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM1Sh5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM1Sh6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM2Sh2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM2Sh3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM2Sh4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM2Sh5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwSSM2Sh6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aTwrStatEClass = null;

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
   * @see sc.ndt.editor.fast.fasttwr.FasttwrPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FasttwrPackageImpl()
  {
    super(eNS_URI, FasttwrFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link FasttwrPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FasttwrPackage init()
  {
    if (isInited) return (FasttwrPackage)EPackage.Registry.INSTANCE.getEPackage(FasttwrPackage.eNS_URI);

    // Obtain or create and register package
    FasttwrPackageImpl theFasttwrPackage = (FasttwrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FasttwrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FasttwrPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFasttwrPackage.createPackageContents();

    // Initialize created meta-data
    theFasttwrPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFasttwrPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FasttwrPackage.eNS_URI, theFasttwrPackage);
    return theFasttwrPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelFasttwr()
  {
    return modelFasttwrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_Head()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_Sections()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_NTwInpSt()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_CalcTMode()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_BldFlDmp1()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_BldFlDmp2()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_BldEdDmp1()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_BldEdDmp2()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_FAStTunr1()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_FAStTunr2()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_SSStTunr1()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_SSStTunr2()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_AdjTwMa()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_AdjFASt()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_AdjSSSt()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwrStat()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM1Sh2()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM1Sh3()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM1Sh4()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM1Sh5()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM1Sh6()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM2Sh2()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM2Sh3()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM2Sh4()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM2Sh5()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwFAM2Sh6()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM1Sh2()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM1Sh3()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM1Sh4()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM1Sh5()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM1Sh6()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM2Sh2()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM2Sh3()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM2Sh4()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM2Sh5()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFasttwr_TwSSM2Sh6()
  {
    return (EReference)modelFasttwrEClass.getEStructuralFeatures().get(35);
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
  public EClass getnNTwInpSt()
  {
    return nNTwInpStEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNTwInpSt_Value()
  {
    return (EAttribute)nNTwInpStEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNTwInpSt_Name()
  {
    return (EAttribute)nNTwInpStEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbCalcTMode()
  {
    return bCalcTModeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCalcTMode_Value()
  {
    return (EAttribute)bCalcTModeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCalcTMode_Name()
  {
    return (EAttribute)bCalcTModeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwrFADmp1()
  {
    return nTwrFADmp1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrFADmp1_Value()
  {
    return (EAttribute)nTwrFADmp1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrFADmp1_Name()
  {
    return (EAttribute)nTwrFADmp1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwrFADmp2()
  {
    return nTwrFADmp2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrFADmp2_Value()
  {
    return (EAttribute)nTwrFADmp2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrFADmp2_Name()
  {
    return (EAttribute)nTwrFADmp2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwrSSDmp1()
  {
    return nTwrSSDmp1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrSSDmp1_Value()
  {
    return (EAttribute)nTwrSSDmp1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrSSDmp1_Name()
  {
    return (EAttribute)nTwrSSDmp1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwrSSDmp2()
  {
    return nTwrSSDmp2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrSSDmp2_Value()
  {
    return (EAttribute)nTwrSSDmp2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrSSDmp2_Name()
  {
    return (EAttribute)nTwrSSDmp2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnFAStTunr1()
  {
    return nFAStTunr1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFAStTunr1_Value()
  {
    return (EAttribute)nFAStTunr1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFAStTunr1_Name()
  {
    return (EAttribute)nFAStTunr1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnFAStTunr2()
  {
    return nFAStTunr2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFAStTunr2_Value()
  {
    return (EAttribute)nFAStTunr2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFAStTunr2_Name()
  {
    return (EAttribute)nFAStTunr2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSSStTunr1()
  {
    return nSSStTunr1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSSStTunr1_Value()
  {
    return (EAttribute)nSSStTunr1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSSStTunr1_Name()
  {
    return (EAttribute)nSSStTunr1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSSStTunr2()
  {
    return nSSStTunr2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSSStTunr2_Value()
  {
    return (EAttribute)nSSStTunr2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSSStTunr2_Name()
  {
    return (EAttribute)nSSStTunr2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdjTwMa()
  {
    return adjTwMaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjTwMa_Value()
  {
    return (EAttribute)adjTwMaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjTwMa_Name()
  {
    return (EAttribute)adjTwMaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdjFASt()
  {
    return adjFAStEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjFASt_Value()
  {
    return (EAttribute)adjFAStEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjFASt_Name()
  {
    return (EAttribute)adjFAStEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdjSSSt()
  {
    return adjSSStEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjSSSt_Value()
  {
    return (EAttribute)adjSSStEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjSSSt_Name()
  {
    return (EAttribute)adjSSStEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM1Sh2()
  {
    return nTwFAM1Sh2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh2_Value()
  {
    return (EAttribute)nTwFAM1Sh2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh2_Name()
  {
    return (EAttribute)nTwFAM1Sh2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM1Sh3()
  {
    return nTwFAM1Sh3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh3_Value()
  {
    return (EAttribute)nTwFAM1Sh3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh3_Name()
  {
    return (EAttribute)nTwFAM1Sh3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM1Sh4()
  {
    return nTwFAM1Sh4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh4_Value()
  {
    return (EAttribute)nTwFAM1Sh4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh4_Name()
  {
    return (EAttribute)nTwFAM1Sh4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM1Sh5()
  {
    return nTwFAM1Sh5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh5_Value()
  {
    return (EAttribute)nTwFAM1Sh5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh5_Name()
  {
    return (EAttribute)nTwFAM1Sh5EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM1Sh6()
  {
    return nTwFAM1Sh6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh6_Value()
  {
    return (EAttribute)nTwFAM1Sh6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM1Sh6_Name()
  {
    return (EAttribute)nTwFAM1Sh6EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM2Sh2()
  {
    return nTwFAM2Sh2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh2_Value()
  {
    return (EAttribute)nTwFAM2Sh2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh2_Name()
  {
    return (EAttribute)nTwFAM2Sh2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM2Sh3()
  {
    return nTwFAM2Sh3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh3_Value()
  {
    return (EAttribute)nTwFAM2Sh3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh3_Name()
  {
    return (EAttribute)nTwFAM2Sh3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM2Sh4()
  {
    return nTwFAM2Sh4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh4_Value()
  {
    return (EAttribute)nTwFAM2Sh4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh4_Name()
  {
    return (EAttribute)nTwFAM2Sh4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM2Sh5()
  {
    return nTwFAM2Sh5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh5_Value()
  {
    return (EAttribute)nTwFAM2Sh5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh5_Name()
  {
    return (EAttribute)nTwFAM2Sh5EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwFAM2Sh6()
  {
    return nTwFAM2Sh6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh6_Value()
  {
    return (EAttribute)nTwFAM2Sh6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwFAM2Sh6_Name()
  {
    return (EAttribute)nTwFAM2Sh6EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM1Sh2()
  {
    return nTwSSM1Sh2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh2_Value()
  {
    return (EAttribute)nTwSSM1Sh2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh2_Name()
  {
    return (EAttribute)nTwSSM1Sh2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM1Sh3()
  {
    return nTwSSM1Sh3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh3_Value()
  {
    return (EAttribute)nTwSSM1Sh3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh3_Name()
  {
    return (EAttribute)nTwSSM1Sh3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM1Sh4()
  {
    return nTwSSM1Sh4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh4_Value()
  {
    return (EAttribute)nTwSSM1Sh4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh4_Name()
  {
    return (EAttribute)nTwSSM1Sh4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM1Sh5()
  {
    return nTwSSM1Sh5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh5_Value()
  {
    return (EAttribute)nTwSSM1Sh5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh5_Name()
  {
    return (EAttribute)nTwSSM1Sh5EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM1Sh6()
  {
    return nTwSSM1Sh6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh6_Value()
  {
    return (EAttribute)nTwSSM1Sh6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM1Sh6_Name()
  {
    return (EAttribute)nTwSSM1Sh6EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM2Sh2()
  {
    return nTwSSM2Sh2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh2_Value()
  {
    return (EAttribute)nTwSSM2Sh2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh2_Name()
  {
    return (EAttribute)nTwSSM2Sh2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM2Sh3()
  {
    return nTwSSM2Sh3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh3_Value()
  {
    return (EAttribute)nTwSSM2Sh3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh3_Name()
  {
    return (EAttribute)nTwSSM2Sh3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM2Sh4()
  {
    return nTwSSM2Sh4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh4_Value()
  {
    return (EAttribute)nTwSSM2Sh4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh4_Name()
  {
    return (EAttribute)nTwSSM2Sh4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM2Sh5()
  {
    return nTwSSM2Sh5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh5_Value()
  {
    return (EAttribute)nTwSSM2Sh5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh5_Name()
  {
    return (EAttribute)nTwSSM2Sh5EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwSSM2Sh6()
  {
    return nTwSSM2Sh6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh6_Value()
  {
    return (EAttribute)nTwSSM2Sh6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwSSM2Sh6_Name()
  {
    return (EAttribute)nTwSSM2Sh6EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaTwrStat()
  {
    return aTwrStatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_HtFract()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TMassDen()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TwFAStif()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TwSSStif()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TwGJStif()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TwEAStif()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TwFAIner()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TwSSIner()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TwFAcgOf()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrStat_TwSScgOf()
  {
    return (EAttribute)aTwrStatEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FasttwrFactory getFasttwrFactory()
  {
    return (FasttwrFactory)getEFactoryInstance();
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
    modelFasttwrEClass = createEClass(MODEL_FASTTWR);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__HEAD);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__SECTIONS);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__NTW_INP_ST);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__CALC_TMODE);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__BLD_FL_DMP1);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__BLD_FL_DMP2);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__BLD_ED_DMP1);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__BLD_ED_DMP2);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__FA_ST_TUNR1);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__FA_ST_TUNR2);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__SS_ST_TUNR1);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__SS_ST_TUNR2);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__ADJ_TW_MA);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__ADJ_FA_ST);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__ADJ_SS_ST);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TWR_STAT);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM1_SH2);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM1_SH3);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM1_SH4);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM1_SH5);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM1_SH6);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM2_SH2);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM2_SH3);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM2_SH4);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM2_SH5);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_FAM2_SH6);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM1_SH2);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM1_SH3);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM1_SH4);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM1_SH5);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM1_SH6);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM2_SH2);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM2_SH3);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM2_SH4);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM2_SH5);
    createEReference(modelFasttwrEClass, MODEL_FASTTWR__TW_SSM2_SH6);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__NAME);

    sectionEClass = createEClass(SECTION);
    createEAttribute(sectionEClass, SECTION__NAME);

    nNTwInpStEClass = createEClass(NN_TW_INP_ST);
    createEAttribute(nNTwInpStEClass, NN_TW_INP_ST__VALUE);
    createEAttribute(nNTwInpStEClass, NN_TW_INP_ST__NAME);

    bCalcTModeEClass = createEClass(BCALC_TMODE);
    createEAttribute(bCalcTModeEClass, BCALC_TMODE__VALUE);
    createEAttribute(bCalcTModeEClass, BCALC_TMODE__NAME);

    nTwrFADmp1EClass = createEClass(NTWR_FA_DMP1);
    createEAttribute(nTwrFADmp1EClass, NTWR_FA_DMP1__VALUE);
    createEAttribute(nTwrFADmp1EClass, NTWR_FA_DMP1__NAME);

    nTwrFADmp2EClass = createEClass(NTWR_FA_DMP2);
    createEAttribute(nTwrFADmp2EClass, NTWR_FA_DMP2__VALUE);
    createEAttribute(nTwrFADmp2EClass, NTWR_FA_DMP2__NAME);

    nTwrSSDmp1EClass = createEClass(NTWR_SS_DMP1);
    createEAttribute(nTwrSSDmp1EClass, NTWR_SS_DMP1__VALUE);
    createEAttribute(nTwrSSDmp1EClass, NTWR_SS_DMP1__NAME);

    nTwrSSDmp2EClass = createEClass(NTWR_SS_DMP2);
    createEAttribute(nTwrSSDmp2EClass, NTWR_SS_DMP2__VALUE);
    createEAttribute(nTwrSSDmp2EClass, NTWR_SS_DMP2__NAME);

    nFAStTunr1EClass = createEClass(NFA_ST_TUNR1);
    createEAttribute(nFAStTunr1EClass, NFA_ST_TUNR1__VALUE);
    createEAttribute(nFAStTunr1EClass, NFA_ST_TUNR1__NAME);

    nFAStTunr2EClass = createEClass(NFA_ST_TUNR2);
    createEAttribute(nFAStTunr2EClass, NFA_ST_TUNR2__VALUE);
    createEAttribute(nFAStTunr2EClass, NFA_ST_TUNR2__NAME);

    nSSStTunr1EClass = createEClass(NSS_ST_TUNR1);
    createEAttribute(nSSStTunr1EClass, NSS_ST_TUNR1__VALUE);
    createEAttribute(nSSStTunr1EClass, NSS_ST_TUNR1__NAME);

    nSSStTunr2EClass = createEClass(NSS_ST_TUNR2);
    createEAttribute(nSSStTunr2EClass, NSS_ST_TUNR2__VALUE);
    createEAttribute(nSSStTunr2EClass, NSS_ST_TUNR2__NAME);

    adjTwMaEClass = createEClass(ADJ_TW_MA);
    createEAttribute(adjTwMaEClass, ADJ_TW_MA__VALUE);
    createEAttribute(adjTwMaEClass, ADJ_TW_MA__NAME);

    adjFAStEClass = createEClass(ADJ_FA_ST);
    createEAttribute(adjFAStEClass, ADJ_FA_ST__VALUE);
    createEAttribute(adjFAStEClass, ADJ_FA_ST__NAME);

    adjSSStEClass = createEClass(ADJ_SS_ST);
    createEAttribute(adjSSStEClass, ADJ_SS_ST__VALUE);
    createEAttribute(adjSSStEClass, ADJ_SS_ST__NAME);

    nTwFAM1Sh2EClass = createEClass(NTW_FAM1_SH2);
    createEAttribute(nTwFAM1Sh2EClass, NTW_FAM1_SH2__VALUE);
    createEAttribute(nTwFAM1Sh2EClass, NTW_FAM1_SH2__NAME);

    nTwFAM1Sh3EClass = createEClass(NTW_FAM1_SH3);
    createEAttribute(nTwFAM1Sh3EClass, NTW_FAM1_SH3__VALUE);
    createEAttribute(nTwFAM1Sh3EClass, NTW_FAM1_SH3__NAME);

    nTwFAM1Sh4EClass = createEClass(NTW_FAM1_SH4);
    createEAttribute(nTwFAM1Sh4EClass, NTW_FAM1_SH4__VALUE);
    createEAttribute(nTwFAM1Sh4EClass, NTW_FAM1_SH4__NAME);

    nTwFAM1Sh5EClass = createEClass(NTW_FAM1_SH5);
    createEAttribute(nTwFAM1Sh5EClass, NTW_FAM1_SH5__VALUE);
    createEAttribute(nTwFAM1Sh5EClass, NTW_FAM1_SH5__NAME);

    nTwFAM1Sh6EClass = createEClass(NTW_FAM1_SH6);
    createEAttribute(nTwFAM1Sh6EClass, NTW_FAM1_SH6__VALUE);
    createEAttribute(nTwFAM1Sh6EClass, NTW_FAM1_SH6__NAME);

    nTwFAM2Sh2EClass = createEClass(NTW_FAM2_SH2);
    createEAttribute(nTwFAM2Sh2EClass, NTW_FAM2_SH2__VALUE);
    createEAttribute(nTwFAM2Sh2EClass, NTW_FAM2_SH2__NAME);

    nTwFAM2Sh3EClass = createEClass(NTW_FAM2_SH3);
    createEAttribute(nTwFAM2Sh3EClass, NTW_FAM2_SH3__VALUE);
    createEAttribute(nTwFAM2Sh3EClass, NTW_FAM2_SH3__NAME);

    nTwFAM2Sh4EClass = createEClass(NTW_FAM2_SH4);
    createEAttribute(nTwFAM2Sh4EClass, NTW_FAM2_SH4__VALUE);
    createEAttribute(nTwFAM2Sh4EClass, NTW_FAM2_SH4__NAME);

    nTwFAM2Sh5EClass = createEClass(NTW_FAM2_SH5);
    createEAttribute(nTwFAM2Sh5EClass, NTW_FAM2_SH5__VALUE);
    createEAttribute(nTwFAM2Sh5EClass, NTW_FAM2_SH5__NAME);

    nTwFAM2Sh6EClass = createEClass(NTW_FAM2_SH6);
    createEAttribute(nTwFAM2Sh6EClass, NTW_FAM2_SH6__VALUE);
    createEAttribute(nTwFAM2Sh6EClass, NTW_FAM2_SH6__NAME);

    nTwSSM1Sh2EClass = createEClass(NTW_SSM1_SH2);
    createEAttribute(nTwSSM1Sh2EClass, NTW_SSM1_SH2__VALUE);
    createEAttribute(nTwSSM1Sh2EClass, NTW_SSM1_SH2__NAME);

    nTwSSM1Sh3EClass = createEClass(NTW_SSM1_SH3);
    createEAttribute(nTwSSM1Sh3EClass, NTW_SSM1_SH3__VALUE);
    createEAttribute(nTwSSM1Sh3EClass, NTW_SSM1_SH3__NAME);

    nTwSSM1Sh4EClass = createEClass(NTW_SSM1_SH4);
    createEAttribute(nTwSSM1Sh4EClass, NTW_SSM1_SH4__VALUE);
    createEAttribute(nTwSSM1Sh4EClass, NTW_SSM1_SH4__NAME);

    nTwSSM1Sh5EClass = createEClass(NTW_SSM1_SH5);
    createEAttribute(nTwSSM1Sh5EClass, NTW_SSM1_SH5__VALUE);
    createEAttribute(nTwSSM1Sh5EClass, NTW_SSM1_SH5__NAME);

    nTwSSM1Sh6EClass = createEClass(NTW_SSM1_SH6);
    createEAttribute(nTwSSM1Sh6EClass, NTW_SSM1_SH6__VALUE);
    createEAttribute(nTwSSM1Sh6EClass, NTW_SSM1_SH6__NAME);

    nTwSSM2Sh2EClass = createEClass(NTW_SSM2_SH2);
    createEAttribute(nTwSSM2Sh2EClass, NTW_SSM2_SH2__VALUE);
    createEAttribute(nTwSSM2Sh2EClass, NTW_SSM2_SH2__NAME);

    nTwSSM2Sh3EClass = createEClass(NTW_SSM2_SH3);
    createEAttribute(nTwSSM2Sh3EClass, NTW_SSM2_SH3__VALUE);
    createEAttribute(nTwSSM2Sh3EClass, NTW_SSM2_SH3__NAME);

    nTwSSM2Sh4EClass = createEClass(NTW_SSM2_SH4);
    createEAttribute(nTwSSM2Sh4EClass, NTW_SSM2_SH4__VALUE);
    createEAttribute(nTwSSM2Sh4EClass, NTW_SSM2_SH4__NAME);

    nTwSSM2Sh5EClass = createEClass(NTW_SSM2_SH5);
    createEAttribute(nTwSSM2Sh5EClass, NTW_SSM2_SH5__VALUE);
    createEAttribute(nTwSSM2Sh5EClass, NTW_SSM2_SH5__NAME);

    nTwSSM2Sh6EClass = createEClass(NTW_SSM2_SH6);
    createEAttribute(nTwSSM2Sh6EClass, NTW_SSM2_SH6__VALUE);
    createEAttribute(nTwSSM2Sh6EClass, NTW_SSM2_SH6__NAME);

    aTwrStatEClass = createEClass(ATWR_STAT);
    createEAttribute(aTwrStatEClass, ATWR_STAT__HT_FRACT);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TMASS_DEN);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TW_FA_STIF);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TW_SS_STIF);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TW_GJ_STIF);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TW_EA_STIF);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TW_FA_INER);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TW_SS_INER);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TW_FACG_OF);
    createEAttribute(aTwrStatEClass, ATWR_STAT__TW_SSCG_OF);
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
    initEClass(modelFasttwrEClass, ModelFasttwr.class, "ModelFasttwr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelFasttwr_Head(), this.getHeader(), null, "Head", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_Sections(), this.getSection(), null, "sections", null, 0, -1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_NTwInpSt(), this.getnNTwInpSt(), null, "NTwInpSt", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_CalcTMode(), this.getbCalcTMode(), null, "CalcTMode", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_BldFlDmp1(), this.getnTwrFADmp1(), null, "BldFlDmp1", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_BldFlDmp2(), this.getnTwrFADmp2(), null, "BldFlDmp2", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_BldEdDmp1(), this.getnTwrSSDmp1(), null, "BldEdDmp1", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_BldEdDmp2(), this.getnTwrSSDmp2(), null, "BldEdDmp2", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_FAStTunr1(), this.getnFAStTunr1(), null, "FAStTunr1", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_FAStTunr2(), this.getnFAStTunr2(), null, "FAStTunr2", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_SSStTunr1(), this.getnSSStTunr1(), null, "SSStTunr1", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_SSStTunr2(), this.getnSSStTunr2(), null, "SSStTunr2", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_AdjTwMa(), this.getAdjTwMa(), null, "AdjTwMa", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_AdjFASt(), this.getAdjFASt(), null, "AdjFASt", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_AdjSSSt(), this.getAdjSSSt(), null, "AdjSSSt", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwrStat(), this.getaTwrStat(), null, "TwrStat", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM1Sh2(), this.getnTwFAM1Sh2(), null, "TwFAM1Sh2", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM1Sh3(), this.getnTwFAM1Sh3(), null, "TwFAM1Sh3", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM1Sh4(), this.getnTwFAM1Sh4(), null, "TwFAM1Sh4", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM1Sh5(), this.getnTwFAM1Sh5(), null, "TwFAM1Sh5", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM1Sh6(), this.getnTwFAM1Sh6(), null, "TwFAM1Sh6", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM2Sh2(), this.getnTwFAM2Sh2(), null, "TwFAM2Sh2", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM2Sh3(), this.getnTwFAM2Sh3(), null, "TwFAM2Sh3", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM2Sh4(), this.getnTwFAM2Sh4(), null, "TwFAM2Sh4", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM2Sh5(), this.getnTwFAM2Sh5(), null, "TwFAM2Sh5", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwFAM2Sh6(), this.getnTwFAM2Sh6(), null, "TwFAM2Sh6", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM1Sh2(), this.getnTwSSM1Sh2(), null, "TwSSM1Sh2", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM1Sh3(), this.getnTwSSM1Sh3(), null, "TwSSM1Sh3", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM1Sh4(), this.getnTwSSM1Sh4(), null, "TwSSM1Sh4", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM1Sh5(), this.getnTwSSM1Sh5(), null, "TwSSM1Sh5", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM1Sh6(), this.getnTwSSM1Sh6(), null, "TwSSM1Sh6", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM2Sh2(), this.getnTwSSM2Sh2(), null, "TwSSM2Sh2", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM2Sh3(), this.getnTwSSM2Sh3(), null, "TwSSM2Sh3", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM2Sh4(), this.getnTwSSM2Sh4(), null, "TwSSM2Sh4", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM2Sh5(), this.getnTwSSM2Sh5(), null, "TwSSM2Sh5", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFasttwr_TwSSM2Sh6(), this.getnTwSSM2Sh6(), null, "TwSSM2Sh6", null, 0, 1, ModelFasttwr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nNTwInpStEClass, nNTwInpSt.class, "nNTwInpSt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnNTwInpSt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, nNTwInpSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnNTwInpSt_Name(), ecorePackage.getEString(), "name", null, 0, 1, nNTwInpSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bCalcTModeEClass, bCalcTMode.class, "bCalcTMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbCalcTMode_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bCalcTMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbCalcTMode_Name(), ecorePackage.getEString(), "name", null, 0, 1, bCalcTMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwrFADmp1EClass, nTwrFADmp1.class, "nTwrFADmp1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwrFADmp1_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwrFADmp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwrFADmp1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwrFADmp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwrFADmp2EClass, nTwrFADmp2.class, "nTwrFADmp2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwrFADmp2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwrFADmp2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwrFADmp2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwrFADmp2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwrSSDmp1EClass, nTwrSSDmp1.class, "nTwrSSDmp1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwrSSDmp1_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwrSSDmp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwrSSDmp1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwrSSDmp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwrSSDmp2EClass, nTwrSSDmp2.class, "nTwrSSDmp2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwrSSDmp2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwrSSDmp2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwrSSDmp2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwrSSDmp2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nFAStTunr1EClass, nFAStTunr1.class, "nFAStTunr1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnFAStTunr1_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nFAStTunr1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnFAStTunr1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nFAStTunr1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nFAStTunr2EClass, nFAStTunr2.class, "nFAStTunr2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnFAStTunr2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nFAStTunr2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnFAStTunr2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nFAStTunr2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nSSStTunr1EClass, nSSStTunr1.class, "nSSStTunr1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnSSStTunr1_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nSSStTunr1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnSSStTunr1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nSSStTunr1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nSSStTunr2EClass, nSSStTunr2.class, "nSSStTunr2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnSSStTunr2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nSSStTunr2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnSSStTunr2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nSSStTunr2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adjTwMaEClass, AdjTwMa.class, "AdjTwMa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdjTwMa_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AdjTwMa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdjTwMa_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjTwMa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adjFAStEClass, AdjFASt.class, "AdjFASt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdjFASt_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AdjFASt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdjFASt_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjFASt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adjSSStEClass, AdjSSSt.class, "AdjSSSt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdjSSSt_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AdjSSSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdjSSSt_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjSSSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM1Sh2EClass, nTwFAM1Sh2.class, "nTwFAM1Sh2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM1Sh2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM1Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM1Sh2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM1Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM1Sh3EClass, nTwFAM1Sh3.class, "nTwFAM1Sh3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM1Sh3_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM1Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM1Sh3_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM1Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM1Sh4EClass, nTwFAM1Sh4.class, "nTwFAM1Sh4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM1Sh4_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM1Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM1Sh4_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM1Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM1Sh5EClass, nTwFAM1Sh5.class, "nTwFAM1Sh5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM1Sh5_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM1Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM1Sh5_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM1Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM1Sh6EClass, nTwFAM1Sh6.class, "nTwFAM1Sh6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM1Sh6_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM1Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM1Sh6_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM1Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM2Sh2EClass, nTwFAM2Sh2.class, "nTwFAM2Sh2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM2Sh2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM2Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM2Sh2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM2Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM2Sh3EClass, nTwFAM2Sh3.class, "nTwFAM2Sh3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM2Sh3_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM2Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM2Sh3_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM2Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM2Sh4EClass, nTwFAM2Sh4.class, "nTwFAM2Sh4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM2Sh4_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM2Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM2Sh4_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM2Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM2Sh5EClass, nTwFAM2Sh5.class, "nTwFAM2Sh5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM2Sh5_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM2Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM2Sh5_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM2Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwFAM2Sh6EClass, nTwFAM2Sh6.class, "nTwFAM2Sh6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwFAM2Sh6_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwFAM2Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwFAM2Sh6_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwFAM2Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM1Sh2EClass, nTwSSM1Sh2.class, "nTwSSM1Sh2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM1Sh2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM1Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM1Sh2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM1Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM1Sh3EClass, nTwSSM1Sh3.class, "nTwSSM1Sh3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM1Sh3_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM1Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM1Sh3_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM1Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM1Sh4EClass, nTwSSM1Sh4.class, "nTwSSM1Sh4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM1Sh4_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM1Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM1Sh4_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM1Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM1Sh5EClass, nTwSSM1Sh5.class, "nTwSSM1Sh5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM1Sh5_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM1Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM1Sh5_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM1Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM1Sh6EClass, nTwSSM1Sh6.class, "nTwSSM1Sh6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM1Sh6_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM1Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM1Sh6_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM1Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM2Sh2EClass, nTwSSM2Sh2.class, "nTwSSM2Sh2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM2Sh2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM2Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM2Sh2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM2Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM2Sh3EClass, nTwSSM2Sh3.class, "nTwSSM2Sh3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM2Sh3_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM2Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM2Sh3_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM2Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM2Sh4EClass, nTwSSM2Sh4.class, "nTwSSM2Sh4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM2Sh4_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM2Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM2Sh4_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM2Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM2Sh5EClass, nTwSSM2Sh5.class, "nTwSSM2Sh5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM2Sh5_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM2Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM2Sh5_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM2Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwSSM2Sh6EClass, nTwSSM2Sh6.class, "nTwSSM2Sh6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwSSM2Sh6_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwSSM2Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwSSM2Sh6_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwSSM2Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aTwrStatEClass, aTwrStat.class, "aTwrStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaTwrStat_HtFract(), ecorePackage.getEFloat(), "HtFract", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TMassDen(), ecorePackage.getEFloat(), "TMassDen", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TwFAStif(), ecorePackage.getEFloat(), "TwFAStif", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TwSSStif(), ecorePackage.getEFloat(), "TwSSStif", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TwGJStif(), ecorePackage.getEFloat(), "TwGJStif", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TwEAStif(), ecorePackage.getEFloat(), "TwEAStif", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TwFAIner(), ecorePackage.getEFloat(), "TwFAIner", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TwSSIner(), ecorePackage.getEFloat(), "TwSSIner", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TwFAcgOf(), ecorePackage.getEFloat(), "TwFAcgOf", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrStat_TwSScgOf(), ecorePackage.getEFloat(), "TwSScgOf", null, 0, -1, aTwrStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FasttwrPackageImpl
