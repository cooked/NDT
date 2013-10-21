/**
 */
package sc.ndt.editor.fast.fastbld.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.ndt.editor.fast.fastbld.AdjBlMs;
import sc.ndt.editor.fast.fastbld.AdjEdSt;
import sc.ndt.editor.fast.fastbld.AdjFlSt;
import sc.ndt.editor.fast.fastbld.FastbldFactory;
import sc.ndt.editor.fast.fastbld.FastbldPackage;
import sc.ndt.editor.fast.fastbld.Header;
import sc.ndt.editor.fast.fastbld.ModelFastbld;
import sc.ndt.editor.fast.fastbld.Section;
import sc.ndt.editor.fast.fastbld.aAirStat;
import sc.ndt.editor.fast.fastbld.bCalcBMode;
import sc.ndt.editor.fast.fastbld.nBldEdDmp1;
import sc.ndt.editor.fast.fastbld.nBldEdgSh2;
import sc.ndt.editor.fast.fastbld.nBldEdgSh3;
import sc.ndt.editor.fast.fastbld.nBldEdgSh4;
import sc.ndt.editor.fast.fastbld.nBldEdgSh5;
import sc.ndt.editor.fast.fastbld.nBldEdgSh6;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh2;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh3;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh4;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh5;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh6;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh2;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh3;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh4;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh5;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh6;
import sc.ndt.editor.fast.fastbld.nBldFlDmp1;
import sc.ndt.editor.fast.fastbld.nBldFlDmp2;
import sc.ndt.editor.fast.fastbld.nFlStTunr1;
import sc.ndt.editor.fast.fastbld.nFlStTunr2;
import sc.ndt.editor.fast.fastbld.nNblInpSt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FastbldPackageImpl extends EPackageImpl implements FastbldPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelFastbldEClass = null;

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
  private EClass nNblInpStEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bCalcBModeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFlDmp1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFlDmp2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldEdDmp1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nFlStTunr1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nFlStTunr2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adjBlMsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adjFlStEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adjEdStEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl1Sh2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl1Sh3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl1Sh4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl1Sh5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl1Sh6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl2Sh2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl2Sh3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl2Sh4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl2Sh5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldFl2Sh6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldEdgSh2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldEdgSh3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldEdgSh4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldEdgSh5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBldEdgSh6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aAirStatEClass = null;

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
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FastbldPackageImpl()
  {
    super(eNS_URI, FastbldFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link FastbldPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FastbldPackage init()
  {
    if (isInited) return (FastbldPackage)EPackage.Registry.INSTANCE.getEPackage(FastbldPackage.eNS_URI);

    // Obtain or create and register package
    FastbldPackageImpl theFastbldPackage = (FastbldPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FastbldPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FastbldPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFastbldPackage.createPackageContents();

    // Initialize created meta-data
    theFastbldPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFastbldPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FastbldPackage.eNS_URI, theFastbldPackage);
    return theFastbldPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelFastbld()
  {
    return modelFastbldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_Head()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_Sections()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_NblInpSt()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_CalcBMode()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFlDmp1()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFlDmp2()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldEdDmp1()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_FlStTunr1()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_FlStTunr2()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_AdjBlMs()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_AdjFlSt()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_AdjEdSt()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_AirStat()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl1Sh2()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl1Sh3()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl1Sh4()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl1Sh5()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl1Sh6()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl2Sh2()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl2Sh3()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl2Sh4()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl2Sh5()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldFl2Sh6()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldEdgSh2()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldEdgSh3()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldEdgSh4()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldEdgSh5()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastbld_BldEdgSh6()
  {
    return (EReference)modelFastbldEClass.getEStructuralFeatures().get(27);
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
  public EClass getnNblInpSt()
  {
    return nNblInpStEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNblInpSt_Value()
  {
    return (EAttribute)nNblInpStEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNblInpSt_Name()
  {
    return (EAttribute)nNblInpStEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbCalcBMode()
  {
    return bCalcBModeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCalcBMode_Value()
  {
    return (EAttribute)bCalcBModeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCalcBMode_Name()
  {
    return (EAttribute)bCalcBModeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFlDmp1()
  {
    return nBldFlDmp1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFlDmp1_Value()
  {
    return (EAttribute)nBldFlDmp1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFlDmp1_Name()
  {
    return (EAttribute)nBldFlDmp1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFlDmp2()
  {
    return nBldFlDmp2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFlDmp2_Value()
  {
    return (EAttribute)nBldFlDmp2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFlDmp2_Name()
  {
    return (EAttribute)nBldFlDmp2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldEdDmp1()
  {
    return nBldEdDmp1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdDmp1_Value()
  {
    return (EAttribute)nBldEdDmp1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdDmp1_Name()
  {
    return (EAttribute)nBldEdDmp1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnFlStTunr1()
  {
    return nFlStTunr1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFlStTunr1_Value()
  {
    return (EAttribute)nFlStTunr1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFlStTunr1_Name()
  {
    return (EAttribute)nFlStTunr1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnFlStTunr2()
  {
    return nFlStTunr2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFlStTunr2_Value()
  {
    return (EAttribute)nFlStTunr2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFlStTunr2_Name()
  {
    return (EAttribute)nFlStTunr2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdjBlMs()
  {
    return adjBlMsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjBlMs_Value()
  {
    return (EAttribute)adjBlMsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjBlMs_Name()
  {
    return (EAttribute)adjBlMsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdjFlSt()
  {
    return adjFlStEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjFlSt_Value()
  {
    return (EAttribute)adjFlStEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjFlSt_Name()
  {
    return (EAttribute)adjFlStEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdjEdSt()
  {
    return adjEdStEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjEdSt_Value()
  {
    return (EAttribute)adjEdStEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdjEdSt_Name()
  {
    return (EAttribute)adjEdStEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl1Sh2()
  {
    return nBldFl1Sh2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh2_Value()
  {
    return (EAttribute)nBldFl1Sh2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh2_Name()
  {
    return (EAttribute)nBldFl1Sh2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl1Sh3()
  {
    return nBldFl1Sh3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh3_Value()
  {
    return (EAttribute)nBldFl1Sh3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh3_Name()
  {
    return (EAttribute)nBldFl1Sh3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl1Sh4()
  {
    return nBldFl1Sh4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh4_Value()
  {
    return (EAttribute)nBldFl1Sh4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh4_Name()
  {
    return (EAttribute)nBldFl1Sh4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl1Sh5()
  {
    return nBldFl1Sh5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh5_Value()
  {
    return (EAttribute)nBldFl1Sh5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh5_Name()
  {
    return (EAttribute)nBldFl1Sh5EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl1Sh6()
  {
    return nBldFl1Sh6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh6_Value()
  {
    return (EAttribute)nBldFl1Sh6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl1Sh6_Name()
  {
    return (EAttribute)nBldFl1Sh6EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl2Sh2()
  {
    return nBldFl2Sh2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh2_Value()
  {
    return (EAttribute)nBldFl2Sh2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh2_Name()
  {
    return (EAttribute)nBldFl2Sh2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl2Sh3()
  {
    return nBldFl2Sh3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh3_Value()
  {
    return (EAttribute)nBldFl2Sh3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh3_Name()
  {
    return (EAttribute)nBldFl2Sh3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl2Sh4()
  {
    return nBldFl2Sh4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh4_Value()
  {
    return (EAttribute)nBldFl2Sh4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh4_Name()
  {
    return (EAttribute)nBldFl2Sh4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl2Sh5()
  {
    return nBldFl2Sh5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh5_Value()
  {
    return (EAttribute)nBldFl2Sh5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh5_Name()
  {
    return (EAttribute)nBldFl2Sh5EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldFl2Sh6()
  {
    return nBldFl2Sh6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh6_Value()
  {
    return (EAttribute)nBldFl2Sh6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldFl2Sh6_Name()
  {
    return (EAttribute)nBldFl2Sh6EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldEdgSh2()
  {
    return nBldEdgSh2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh2_Value()
  {
    return (EAttribute)nBldEdgSh2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh2_Name()
  {
    return (EAttribute)nBldEdgSh2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldEdgSh3()
  {
    return nBldEdgSh3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh3_Value()
  {
    return (EAttribute)nBldEdgSh3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh3_Name()
  {
    return (EAttribute)nBldEdgSh3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldEdgSh4()
  {
    return nBldEdgSh4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh4_Value()
  {
    return (EAttribute)nBldEdgSh4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh4_Name()
  {
    return (EAttribute)nBldEdgSh4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldEdgSh5()
  {
    return nBldEdgSh5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh5_Value()
  {
    return (EAttribute)nBldEdgSh5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh5_Name()
  {
    return (EAttribute)nBldEdgSh5EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBldEdgSh6()
  {
    return nBldEdgSh6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh6_Value()
  {
    return (EAttribute)nBldEdgSh6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBldEdgSh6_Name()
  {
    return (EAttribute)nBldEdgSh6EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaAirStat()
  {
    return aAirStatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_Bldfrac()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_AeroCent()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_StrcTwst()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_BMassDen()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_FlpStff()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_EdgStff()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_GJStff()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_EAStff()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_Alpha()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_FlpIner()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_EdgIner()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_PrecrvRef()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_PreswpRef()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_FlpcgOf()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_EdgcgOf()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_FlpEAOf()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_EdgEAOf()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastbldFactory getFastbldFactory()
  {
    return (FastbldFactory)getEFactoryInstance();
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
    modelFastbldEClass = createEClass(MODEL_FASTBLD);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__HEAD);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__SECTIONS);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__NBL_INP_ST);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__CALC_BMODE);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL_DMP1);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL_DMP2);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_ED_DMP1);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__FL_ST_TUNR1);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__FL_ST_TUNR2);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__ADJ_BL_MS);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__ADJ_FL_ST);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__ADJ_ED_ST);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__AIR_STAT);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL1_SH2);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL1_SH3);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL1_SH4);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL1_SH5);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL1_SH6);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL2_SH2);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL2_SH3);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL2_SH4);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL2_SH5);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_FL2_SH6);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_EDG_SH2);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_EDG_SH3);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_EDG_SH4);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_EDG_SH5);
    createEReference(modelFastbldEClass, MODEL_FASTBLD__BLD_EDG_SH6);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__NAME);

    sectionEClass = createEClass(SECTION);
    createEAttribute(sectionEClass, SECTION__NAME);

    nNblInpStEClass = createEClass(NNBL_INP_ST);
    createEAttribute(nNblInpStEClass, NNBL_INP_ST__VALUE);
    createEAttribute(nNblInpStEClass, NNBL_INP_ST__NAME);

    bCalcBModeEClass = createEClass(BCALC_BMODE);
    createEAttribute(bCalcBModeEClass, BCALC_BMODE__VALUE);
    createEAttribute(bCalcBModeEClass, BCALC_BMODE__NAME);

    nBldFlDmp1EClass = createEClass(NBLD_FL_DMP1);
    createEAttribute(nBldFlDmp1EClass, NBLD_FL_DMP1__VALUE);
    createEAttribute(nBldFlDmp1EClass, NBLD_FL_DMP1__NAME);

    nBldFlDmp2EClass = createEClass(NBLD_FL_DMP2);
    createEAttribute(nBldFlDmp2EClass, NBLD_FL_DMP2__VALUE);
    createEAttribute(nBldFlDmp2EClass, NBLD_FL_DMP2__NAME);

    nBldEdDmp1EClass = createEClass(NBLD_ED_DMP1);
    createEAttribute(nBldEdDmp1EClass, NBLD_ED_DMP1__VALUE);
    createEAttribute(nBldEdDmp1EClass, NBLD_ED_DMP1__NAME);

    nFlStTunr1EClass = createEClass(NFL_ST_TUNR1);
    createEAttribute(nFlStTunr1EClass, NFL_ST_TUNR1__VALUE);
    createEAttribute(nFlStTunr1EClass, NFL_ST_TUNR1__NAME);

    nFlStTunr2EClass = createEClass(NFL_ST_TUNR2);
    createEAttribute(nFlStTunr2EClass, NFL_ST_TUNR2__VALUE);
    createEAttribute(nFlStTunr2EClass, NFL_ST_TUNR2__NAME);

    adjBlMsEClass = createEClass(ADJ_BL_MS);
    createEAttribute(adjBlMsEClass, ADJ_BL_MS__VALUE);
    createEAttribute(adjBlMsEClass, ADJ_BL_MS__NAME);

    adjFlStEClass = createEClass(ADJ_FL_ST);
    createEAttribute(adjFlStEClass, ADJ_FL_ST__VALUE);
    createEAttribute(adjFlStEClass, ADJ_FL_ST__NAME);

    adjEdStEClass = createEClass(ADJ_ED_ST);
    createEAttribute(adjEdStEClass, ADJ_ED_ST__VALUE);
    createEAttribute(adjEdStEClass, ADJ_ED_ST__NAME);

    nBldFl1Sh2EClass = createEClass(NBLD_FL1_SH2);
    createEAttribute(nBldFl1Sh2EClass, NBLD_FL1_SH2__VALUE);
    createEAttribute(nBldFl1Sh2EClass, NBLD_FL1_SH2__NAME);

    nBldFl1Sh3EClass = createEClass(NBLD_FL1_SH3);
    createEAttribute(nBldFl1Sh3EClass, NBLD_FL1_SH3__VALUE);
    createEAttribute(nBldFl1Sh3EClass, NBLD_FL1_SH3__NAME);

    nBldFl1Sh4EClass = createEClass(NBLD_FL1_SH4);
    createEAttribute(nBldFl1Sh4EClass, NBLD_FL1_SH4__VALUE);
    createEAttribute(nBldFl1Sh4EClass, NBLD_FL1_SH4__NAME);

    nBldFl1Sh5EClass = createEClass(NBLD_FL1_SH5);
    createEAttribute(nBldFl1Sh5EClass, NBLD_FL1_SH5__VALUE);
    createEAttribute(nBldFl1Sh5EClass, NBLD_FL1_SH5__NAME);

    nBldFl1Sh6EClass = createEClass(NBLD_FL1_SH6);
    createEAttribute(nBldFl1Sh6EClass, NBLD_FL1_SH6__VALUE);
    createEAttribute(nBldFl1Sh6EClass, NBLD_FL1_SH6__NAME);

    nBldFl2Sh2EClass = createEClass(NBLD_FL2_SH2);
    createEAttribute(nBldFl2Sh2EClass, NBLD_FL2_SH2__VALUE);
    createEAttribute(nBldFl2Sh2EClass, NBLD_FL2_SH2__NAME);

    nBldFl2Sh3EClass = createEClass(NBLD_FL2_SH3);
    createEAttribute(nBldFl2Sh3EClass, NBLD_FL2_SH3__VALUE);
    createEAttribute(nBldFl2Sh3EClass, NBLD_FL2_SH3__NAME);

    nBldFl2Sh4EClass = createEClass(NBLD_FL2_SH4);
    createEAttribute(nBldFl2Sh4EClass, NBLD_FL2_SH4__VALUE);
    createEAttribute(nBldFl2Sh4EClass, NBLD_FL2_SH4__NAME);

    nBldFl2Sh5EClass = createEClass(NBLD_FL2_SH5);
    createEAttribute(nBldFl2Sh5EClass, NBLD_FL2_SH5__VALUE);
    createEAttribute(nBldFl2Sh5EClass, NBLD_FL2_SH5__NAME);

    nBldFl2Sh6EClass = createEClass(NBLD_FL2_SH6);
    createEAttribute(nBldFl2Sh6EClass, NBLD_FL2_SH6__VALUE);
    createEAttribute(nBldFl2Sh6EClass, NBLD_FL2_SH6__NAME);

    nBldEdgSh2EClass = createEClass(NBLD_EDG_SH2);
    createEAttribute(nBldEdgSh2EClass, NBLD_EDG_SH2__VALUE);
    createEAttribute(nBldEdgSh2EClass, NBLD_EDG_SH2__NAME);

    nBldEdgSh3EClass = createEClass(NBLD_EDG_SH3);
    createEAttribute(nBldEdgSh3EClass, NBLD_EDG_SH3__VALUE);
    createEAttribute(nBldEdgSh3EClass, NBLD_EDG_SH3__NAME);

    nBldEdgSh4EClass = createEClass(NBLD_EDG_SH4);
    createEAttribute(nBldEdgSh4EClass, NBLD_EDG_SH4__VALUE);
    createEAttribute(nBldEdgSh4EClass, NBLD_EDG_SH4__NAME);

    nBldEdgSh5EClass = createEClass(NBLD_EDG_SH5);
    createEAttribute(nBldEdgSh5EClass, NBLD_EDG_SH5__VALUE);
    createEAttribute(nBldEdgSh5EClass, NBLD_EDG_SH5__NAME);

    nBldEdgSh6EClass = createEClass(NBLD_EDG_SH6);
    createEAttribute(nBldEdgSh6EClass, NBLD_EDG_SH6__VALUE);
    createEAttribute(nBldEdgSh6EClass, NBLD_EDG_SH6__NAME);

    aAirStatEClass = createEClass(AAIR_STAT);
    createEAttribute(aAirStatEClass, AAIR_STAT__BLDFRAC);
    createEAttribute(aAirStatEClass, AAIR_STAT__AERO_CENT);
    createEAttribute(aAirStatEClass, AAIR_STAT__STRC_TWST);
    createEAttribute(aAirStatEClass, AAIR_STAT__BMASS_DEN);
    createEAttribute(aAirStatEClass, AAIR_STAT__FLP_STFF);
    createEAttribute(aAirStatEClass, AAIR_STAT__EDG_STFF);
    createEAttribute(aAirStatEClass, AAIR_STAT__GJ_STFF);
    createEAttribute(aAirStatEClass, AAIR_STAT__EA_STFF);
    createEAttribute(aAirStatEClass, AAIR_STAT__ALPHA);
    createEAttribute(aAirStatEClass, AAIR_STAT__FLP_INER);
    createEAttribute(aAirStatEClass, AAIR_STAT__EDG_INER);
    createEAttribute(aAirStatEClass, AAIR_STAT__PRECRV_REF);
    createEAttribute(aAirStatEClass, AAIR_STAT__PRESWP_REF);
    createEAttribute(aAirStatEClass, AAIR_STAT__FLPCG_OF);
    createEAttribute(aAirStatEClass, AAIR_STAT__EDGCG_OF);
    createEAttribute(aAirStatEClass, AAIR_STAT__FLP_EA_OF);
    createEAttribute(aAirStatEClass, AAIR_STAT__EDG_EA_OF);
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
    initEClass(modelFastbldEClass, ModelFastbld.class, "ModelFastbld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelFastbld_Head(), this.getHeader(), null, "Head", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_Sections(), this.getSection(), null, "sections", null, 0, -1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_NblInpSt(), this.getnNblInpSt(), null, "NblInpSt", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_CalcBMode(), this.getbCalcBMode(), null, "CalcBMode", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFlDmp1(), this.getnBldFlDmp1(), null, "BldFlDmp1", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFlDmp2(), this.getnBldFlDmp2(), null, "BldFlDmp2", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldEdDmp1(), this.getnBldEdDmp1(), null, "BldEdDmp1", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_FlStTunr1(), this.getnFlStTunr1(), null, "FlStTunr1", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_FlStTunr2(), this.getnFlStTunr2(), null, "FlStTunr2", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_AdjBlMs(), this.getAdjBlMs(), null, "AdjBlMs", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_AdjFlSt(), this.getAdjFlSt(), null, "AdjFlSt", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_AdjEdSt(), this.getAdjEdSt(), null, "AdjEdSt", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_AirStat(), this.getaAirStat(), null, "AirStat", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl1Sh2(), this.getnBldFl1Sh2(), null, "BldFl1Sh2", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl1Sh3(), this.getnBldFl1Sh3(), null, "BldFl1Sh3", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl1Sh4(), this.getnBldFl1Sh4(), null, "BldFl1Sh4", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl1Sh5(), this.getnBldFl1Sh5(), null, "BldFl1Sh5", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl1Sh6(), this.getnBldFl1Sh6(), null, "BldFl1Sh6", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl2Sh2(), this.getnBldFl2Sh2(), null, "BldFl2Sh2", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl2Sh3(), this.getnBldFl2Sh3(), null, "BldFl2Sh3", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl2Sh4(), this.getnBldFl2Sh4(), null, "BldFl2Sh4", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl2Sh5(), this.getnBldFl2Sh5(), null, "BldFl2Sh5", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldFl2Sh6(), this.getnBldFl2Sh6(), null, "BldFl2Sh6", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldEdgSh2(), this.getnBldEdgSh2(), null, "BldEdgSh2", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldEdgSh3(), this.getnBldEdgSh3(), null, "BldEdgSh3", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldEdgSh4(), this.getnBldEdgSh4(), null, "BldEdgSh4", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldEdgSh5(), this.getnBldEdgSh5(), null, "BldEdgSh5", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastbld_BldEdgSh6(), this.getnBldEdgSh6(), null, "BldEdgSh6", null, 0, 1, ModelFastbld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nNblInpStEClass, nNblInpSt.class, "nNblInpSt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnNblInpSt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, nNblInpSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnNblInpSt_Name(), ecorePackage.getEString(), "name", null, 0, 1, nNblInpSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bCalcBModeEClass, bCalcBMode.class, "bCalcBMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbCalcBMode_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bCalcBMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbCalcBMode_Name(), ecorePackage.getEString(), "name", null, 0, 1, bCalcBMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFlDmp1EClass, nBldFlDmp1.class, "nBldFlDmp1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFlDmp1_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFlDmp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFlDmp1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFlDmp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFlDmp2EClass, nBldFlDmp2.class, "nBldFlDmp2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFlDmp2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFlDmp2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFlDmp2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFlDmp2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldEdDmp1EClass, nBldEdDmp1.class, "nBldEdDmp1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldEdDmp1_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldEdDmp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldEdDmp1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldEdDmp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nFlStTunr1EClass, nFlStTunr1.class, "nFlStTunr1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnFlStTunr1_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nFlStTunr1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnFlStTunr1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nFlStTunr1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nFlStTunr2EClass, nFlStTunr2.class, "nFlStTunr2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnFlStTunr2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nFlStTunr2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnFlStTunr2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nFlStTunr2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adjBlMsEClass, AdjBlMs.class, "AdjBlMs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdjBlMs_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AdjBlMs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdjBlMs_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjBlMs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adjFlStEClass, AdjFlSt.class, "AdjFlSt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdjFlSt_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AdjFlSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdjFlSt_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjFlSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adjEdStEClass, AdjEdSt.class, "AdjEdSt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdjEdSt_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AdjEdSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdjEdSt_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdjEdSt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl1Sh2EClass, nBldFl1Sh2.class, "nBldFl1Sh2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl1Sh2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl1Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl1Sh2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl1Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl1Sh3EClass, nBldFl1Sh3.class, "nBldFl1Sh3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl1Sh3_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl1Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl1Sh3_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl1Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl1Sh4EClass, nBldFl1Sh4.class, "nBldFl1Sh4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl1Sh4_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl1Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl1Sh4_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl1Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl1Sh5EClass, nBldFl1Sh5.class, "nBldFl1Sh5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl1Sh5_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl1Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl1Sh5_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl1Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl1Sh6EClass, nBldFl1Sh6.class, "nBldFl1Sh6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl1Sh6_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl1Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl1Sh6_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl1Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl2Sh2EClass, nBldFl2Sh2.class, "nBldFl2Sh2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl2Sh2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl2Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl2Sh2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl2Sh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl2Sh3EClass, nBldFl2Sh3.class, "nBldFl2Sh3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl2Sh3_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl2Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl2Sh3_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl2Sh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl2Sh4EClass, nBldFl2Sh4.class, "nBldFl2Sh4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl2Sh4_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl2Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl2Sh4_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl2Sh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl2Sh5EClass, nBldFl2Sh5.class, "nBldFl2Sh5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl2Sh5_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl2Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl2Sh5_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl2Sh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldFl2Sh6EClass, nBldFl2Sh6.class, "nBldFl2Sh6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldFl2Sh6_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldFl2Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldFl2Sh6_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldFl2Sh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldEdgSh2EClass, nBldEdgSh2.class, "nBldEdgSh2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldEdgSh2_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldEdgSh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldEdgSh2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldEdgSh2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldEdgSh3EClass, nBldEdgSh3.class, "nBldEdgSh3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldEdgSh3_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldEdgSh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldEdgSh3_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldEdgSh3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldEdgSh4EClass, nBldEdgSh4.class, "nBldEdgSh4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldEdgSh4_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldEdgSh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldEdgSh4_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldEdgSh4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldEdgSh5EClass, nBldEdgSh5.class, "nBldEdgSh5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldEdgSh5_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldEdgSh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldEdgSh5_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldEdgSh5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBldEdgSh6EClass, nBldEdgSh6.class, "nBldEdgSh6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBldEdgSh6_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBldEdgSh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBldEdgSh6_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBldEdgSh6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aAirStatEClass, aAirStat.class, "aAirStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaAirStat_Bldfrac(), ecorePackage.getEFloat(), "bldfrac", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_AeroCent(), ecorePackage.getEFloat(), "AeroCent", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_StrcTwst(), ecorePackage.getEFloat(), "StrcTwst", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_BMassDen(), ecorePackage.getEFloat(), "BMassDen", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_FlpStff(), ecorePackage.getEFloat(), "FlpStff", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_EdgStff(), ecorePackage.getEFloat(), "EdgStff", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_GJStff(), ecorePackage.getEFloat(), "GJStff", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_EAStff(), ecorePackage.getEFloat(), "EAStff", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_Alpha(), ecorePackage.getEFloat(), "Alpha", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_FlpIner(), ecorePackage.getEFloat(), "FlpIner", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_EdgIner(), ecorePackage.getEFloat(), "EdgIner", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_PrecrvRef(), ecorePackage.getEFloat(), "PrecrvRef", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_PreswpRef(), ecorePackage.getEFloat(), "PreswpRef", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_FlpcgOf(), ecorePackage.getEFloat(), "FlpcgOf", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_EdgcgOf(), ecorePackage.getEFloat(), "EdgcgOf", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_FlpEAOf(), ecorePackage.getEFloat(), "FlpEAOf", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_EdgEAOf(), ecorePackage.getEFloat(), "EdgEAOf", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FastbldPackageImpl
