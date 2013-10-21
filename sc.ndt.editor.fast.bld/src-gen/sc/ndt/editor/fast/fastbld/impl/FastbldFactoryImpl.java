/**
 */
package sc.ndt.editor.fast.fastbld.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.fast.fastbld.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FastbldFactoryImpl extends EFactoryImpl implements FastbldFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FastbldFactory init()
  {
    try
    {
      FastbldFactory theFastbldFactory = (FastbldFactory)EPackage.Registry.INSTANCE.getEFactory(FastbldPackage.eNS_URI);
      if (theFastbldFactory != null)
      {
        return theFastbldFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FastbldFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastbldFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FastbldPackage.MODEL_FASTBLD: return createModelFastbld();
      case FastbldPackage.HEADER: return createHeader();
      case FastbldPackage.SECTION: return createSection();
      case FastbldPackage.NNBL_INP_ST: return createnNblInpSt();
      case FastbldPackage.BCALC_BMODE: return createbCalcBMode();
      case FastbldPackage.NBLD_FL_DMP1: return createnBldFlDmp1();
      case FastbldPackage.NBLD_FL_DMP2: return createnBldFlDmp2();
      case FastbldPackage.NBLD_ED_DMP1: return createnBldEdDmp1();
      case FastbldPackage.NFL_ST_TUNR1: return createnFlStTunr1();
      case FastbldPackage.NFL_ST_TUNR2: return createnFlStTunr2();
      case FastbldPackage.ADJ_BL_MS: return createAdjBlMs();
      case FastbldPackage.ADJ_FL_ST: return createAdjFlSt();
      case FastbldPackage.ADJ_ED_ST: return createAdjEdSt();
      case FastbldPackage.NBLD_FL1_SH2: return createnBldFl1Sh2();
      case FastbldPackage.NBLD_FL1_SH3: return createnBldFl1Sh3();
      case FastbldPackage.NBLD_FL1_SH4: return createnBldFl1Sh4();
      case FastbldPackage.NBLD_FL1_SH5: return createnBldFl1Sh5();
      case FastbldPackage.NBLD_FL1_SH6: return createnBldFl1Sh6();
      case FastbldPackage.NBLD_FL2_SH2: return createnBldFl2Sh2();
      case FastbldPackage.NBLD_FL2_SH3: return createnBldFl2Sh3();
      case FastbldPackage.NBLD_FL2_SH4: return createnBldFl2Sh4();
      case FastbldPackage.NBLD_FL2_SH5: return createnBldFl2Sh5();
      case FastbldPackage.NBLD_FL2_SH6: return createnBldFl2Sh6();
      case FastbldPackage.NBLD_EDG_SH2: return createnBldEdgSh2();
      case FastbldPackage.NBLD_EDG_SH3: return createnBldEdgSh3();
      case FastbldPackage.NBLD_EDG_SH4: return createnBldEdgSh4();
      case FastbldPackage.NBLD_EDG_SH5: return createnBldEdgSh5();
      case FastbldPackage.NBLD_EDG_SH6: return createnBldEdgSh6();
      case FastbldPackage.AAIR_STAT: return createaAirStat();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFastbld createModelFastbld()
  {
    ModelFastbldImpl modelFastbld = new ModelFastbldImpl();
    return modelFastbld;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNblInpSt createnNblInpSt()
  {
    nNblInpStImpl nNblInpSt = new nNblInpStImpl();
    return nNblInpSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bCalcBMode createbCalcBMode()
  {
    bCalcBModeImpl bCalcBMode = new bCalcBModeImpl();
    return bCalcBMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFlDmp1 createnBldFlDmp1()
  {
    nBldFlDmp1Impl nBldFlDmp1 = new nBldFlDmp1Impl();
    return nBldFlDmp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFlDmp2 createnBldFlDmp2()
  {
    nBldFlDmp2Impl nBldFlDmp2 = new nBldFlDmp2Impl();
    return nBldFlDmp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdDmp1 createnBldEdDmp1()
  {
    nBldEdDmp1Impl nBldEdDmp1 = new nBldEdDmp1Impl();
    return nBldEdDmp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFlStTunr1 createnFlStTunr1()
  {
    nFlStTunr1Impl nFlStTunr1 = new nFlStTunr1Impl();
    return nFlStTunr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFlStTunr2 createnFlStTunr2()
  {
    nFlStTunr2Impl nFlStTunr2 = new nFlStTunr2Impl();
    return nFlStTunr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjBlMs createAdjBlMs()
  {
    AdjBlMsImpl adjBlMs = new AdjBlMsImpl();
    return adjBlMs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjFlSt createAdjFlSt()
  {
    AdjFlStImpl adjFlSt = new AdjFlStImpl();
    return adjFlSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjEdSt createAdjEdSt()
  {
    AdjEdStImpl adjEdSt = new AdjEdStImpl();
    return adjEdSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh2 createnBldFl1Sh2()
  {
    nBldFl1Sh2Impl nBldFl1Sh2 = new nBldFl1Sh2Impl();
    return nBldFl1Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh3 createnBldFl1Sh3()
  {
    nBldFl1Sh3Impl nBldFl1Sh3 = new nBldFl1Sh3Impl();
    return nBldFl1Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh4 createnBldFl1Sh4()
  {
    nBldFl1Sh4Impl nBldFl1Sh4 = new nBldFl1Sh4Impl();
    return nBldFl1Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh5 createnBldFl1Sh5()
  {
    nBldFl1Sh5Impl nBldFl1Sh5 = new nBldFl1Sh5Impl();
    return nBldFl1Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl1Sh6 createnBldFl1Sh6()
  {
    nBldFl1Sh6Impl nBldFl1Sh6 = new nBldFl1Sh6Impl();
    return nBldFl1Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh2 createnBldFl2Sh2()
  {
    nBldFl2Sh2Impl nBldFl2Sh2 = new nBldFl2Sh2Impl();
    return nBldFl2Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh3 createnBldFl2Sh3()
  {
    nBldFl2Sh3Impl nBldFl2Sh3 = new nBldFl2Sh3Impl();
    return nBldFl2Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh4 createnBldFl2Sh4()
  {
    nBldFl2Sh4Impl nBldFl2Sh4 = new nBldFl2Sh4Impl();
    return nBldFl2Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh5 createnBldFl2Sh5()
  {
    nBldFl2Sh5Impl nBldFl2Sh5 = new nBldFl2Sh5Impl();
    return nBldFl2Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldFl2Sh6 createnBldFl2Sh6()
  {
    nBldFl2Sh6Impl nBldFl2Sh6 = new nBldFl2Sh6Impl();
    return nBldFl2Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh2 createnBldEdgSh2()
  {
    nBldEdgSh2Impl nBldEdgSh2 = new nBldEdgSh2Impl();
    return nBldEdgSh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh3 createnBldEdgSh3()
  {
    nBldEdgSh3Impl nBldEdgSh3 = new nBldEdgSh3Impl();
    return nBldEdgSh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh4 createnBldEdgSh4()
  {
    nBldEdgSh4Impl nBldEdgSh4 = new nBldEdgSh4Impl();
    return nBldEdgSh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh5 createnBldEdgSh5()
  {
    nBldEdgSh5Impl nBldEdgSh5 = new nBldEdgSh5Impl();
    return nBldEdgSh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBldEdgSh6 createnBldEdgSh6()
  {
    nBldEdgSh6Impl nBldEdgSh6 = new nBldEdgSh6Impl();
    return nBldEdgSh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aAirStat createaAirStat()
  {
    aAirStatImpl aAirStat = new aAirStatImpl();
    return aAirStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastbldPackage getFastbldPackage()
  {
    return (FastbldPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FastbldPackage getPackage()
  {
    return FastbldPackage.eINSTANCE;
  }

} //FastbldFactoryImpl
