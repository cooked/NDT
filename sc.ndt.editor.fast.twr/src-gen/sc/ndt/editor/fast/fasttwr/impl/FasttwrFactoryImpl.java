/**
 */
package sc.ndt.editor.fast.fasttwr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.fast.fasttwr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FasttwrFactoryImpl extends EFactoryImpl implements FasttwrFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FasttwrFactory init()
  {
    try
    {
      FasttwrFactory theFasttwrFactory = (FasttwrFactory)EPackage.Registry.INSTANCE.getEFactory(FasttwrPackage.eNS_URI);
      if (theFasttwrFactory != null)
      {
        return theFasttwrFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FasttwrFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FasttwrFactoryImpl()
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
      case FasttwrPackage.MODEL_FASTTWR: return createModelFasttwr();
      case FasttwrPackage.HEADER: return createHeader();
      case FasttwrPackage.SECTION: return createSection();
      case FasttwrPackage.NN_TW_INP_ST: return createnNTwInpSt();
      case FasttwrPackage.BCALC_TMODE: return createbCalcTMode();
      case FasttwrPackage.NTWR_FA_DMP1: return createnTwrFADmp1();
      case FasttwrPackage.NTWR_FA_DMP2: return createnTwrFADmp2();
      case FasttwrPackage.NTWR_SS_DMP1: return createnTwrSSDmp1();
      case FasttwrPackage.NTWR_SS_DMP2: return createnTwrSSDmp2();
      case FasttwrPackage.NFA_ST_TUNR1: return createnFAStTunr1();
      case FasttwrPackage.NFA_ST_TUNR2: return createnFAStTunr2();
      case FasttwrPackage.NSS_ST_TUNR1: return createnSSStTunr1();
      case FasttwrPackage.NSS_ST_TUNR2: return createnSSStTunr2();
      case FasttwrPackage.ADJ_TW_MA: return createAdjTwMa();
      case FasttwrPackage.ADJ_FA_ST: return createAdjFASt();
      case FasttwrPackage.ADJ_SS_ST: return createAdjSSSt();
      case FasttwrPackage.NTW_FAM1_SH2: return createnTwFAM1Sh2();
      case FasttwrPackage.NTW_FAM1_SH3: return createnTwFAM1Sh3();
      case FasttwrPackage.NTW_FAM1_SH4: return createnTwFAM1Sh4();
      case FasttwrPackage.NTW_FAM1_SH5: return createnTwFAM1Sh5();
      case FasttwrPackage.NTW_FAM1_SH6: return createnTwFAM1Sh6();
      case FasttwrPackage.NTW_FAM2_SH2: return createnTwFAM2Sh2();
      case FasttwrPackage.NTW_FAM2_SH3: return createnTwFAM2Sh3();
      case FasttwrPackage.NTW_FAM2_SH4: return createnTwFAM2Sh4();
      case FasttwrPackage.NTW_FAM2_SH5: return createnTwFAM2Sh5();
      case FasttwrPackage.NTW_FAM2_SH6: return createnTwFAM2Sh6();
      case FasttwrPackage.NTW_SSM1_SH2: return createnTwSSM1Sh2();
      case FasttwrPackage.NTW_SSM1_SH3: return createnTwSSM1Sh3();
      case FasttwrPackage.NTW_SSM1_SH4: return createnTwSSM1Sh4();
      case FasttwrPackage.NTW_SSM1_SH5: return createnTwSSM1Sh5();
      case FasttwrPackage.NTW_SSM1_SH6: return createnTwSSM1Sh6();
      case FasttwrPackage.NTW_SSM2_SH2: return createnTwSSM2Sh2();
      case FasttwrPackage.NTW_SSM2_SH3: return createnTwSSM2Sh3();
      case FasttwrPackage.NTW_SSM2_SH4: return createnTwSSM2Sh4();
      case FasttwrPackage.NTW_SSM2_SH5: return createnTwSSM2Sh5();
      case FasttwrPackage.NTW_SSM2_SH6: return createnTwSSM2Sh6();
      case FasttwrPackage.ATWR_STAT: return createaTwrStat();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFasttwr createModelFasttwr()
  {
    ModelFasttwrImpl modelFasttwr = new ModelFasttwrImpl();
    return modelFasttwr;
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
  public nNTwInpSt createnNTwInpSt()
  {
    nNTwInpStImpl nNTwInpSt = new nNTwInpStImpl();
    return nNTwInpSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bCalcTMode createbCalcTMode()
  {
    bCalcTModeImpl bCalcTMode = new bCalcTModeImpl();
    return bCalcTMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrFADmp1 createnTwrFADmp1()
  {
    nTwrFADmp1Impl nTwrFADmp1 = new nTwrFADmp1Impl();
    return nTwrFADmp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrFADmp2 createnTwrFADmp2()
  {
    nTwrFADmp2Impl nTwrFADmp2 = new nTwrFADmp2Impl();
    return nTwrFADmp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrSSDmp1 createnTwrSSDmp1()
  {
    nTwrSSDmp1Impl nTwrSSDmp1 = new nTwrSSDmp1Impl();
    return nTwrSSDmp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrSSDmp2 createnTwrSSDmp2()
  {
    nTwrSSDmp2Impl nTwrSSDmp2 = new nTwrSSDmp2Impl();
    return nTwrSSDmp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFAStTunr1 createnFAStTunr1()
  {
    nFAStTunr1Impl nFAStTunr1 = new nFAStTunr1Impl();
    return nFAStTunr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFAStTunr2 createnFAStTunr2()
  {
    nFAStTunr2Impl nFAStTunr2 = new nFAStTunr2Impl();
    return nFAStTunr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSSStTunr1 createnSSStTunr1()
  {
    nSSStTunr1Impl nSSStTunr1 = new nSSStTunr1Impl();
    return nSSStTunr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSSStTunr2 createnSSStTunr2()
  {
    nSSStTunr2Impl nSSStTunr2 = new nSSStTunr2Impl();
    return nSSStTunr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjTwMa createAdjTwMa()
  {
    AdjTwMaImpl adjTwMa = new AdjTwMaImpl();
    return adjTwMa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjFASt createAdjFASt()
  {
    AdjFAStImpl adjFASt = new AdjFAStImpl();
    return adjFASt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjSSSt createAdjSSSt()
  {
    AdjSSStImpl adjSSSt = new AdjSSStImpl();
    return adjSSSt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh2 createnTwFAM1Sh2()
  {
    nTwFAM1Sh2Impl nTwFAM1Sh2 = new nTwFAM1Sh2Impl();
    return nTwFAM1Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh3 createnTwFAM1Sh3()
  {
    nTwFAM1Sh3Impl nTwFAM1Sh3 = new nTwFAM1Sh3Impl();
    return nTwFAM1Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh4 createnTwFAM1Sh4()
  {
    nTwFAM1Sh4Impl nTwFAM1Sh4 = new nTwFAM1Sh4Impl();
    return nTwFAM1Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh5 createnTwFAM1Sh5()
  {
    nTwFAM1Sh5Impl nTwFAM1Sh5 = new nTwFAM1Sh5Impl();
    return nTwFAM1Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM1Sh6 createnTwFAM1Sh6()
  {
    nTwFAM1Sh6Impl nTwFAM1Sh6 = new nTwFAM1Sh6Impl();
    return nTwFAM1Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh2 createnTwFAM2Sh2()
  {
    nTwFAM2Sh2Impl nTwFAM2Sh2 = new nTwFAM2Sh2Impl();
    return nTwFAM2Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh3 createnTwFAM2Sh3()
  {
    nTwFAM2Sh3Impl nTwFAM2Sh3 = new nTwFAM2Sh3Impl();
    return nTwFAM2Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh4 createnTwFAM2Sh4()
  {
    nTwFAM2Sh4Impl nTwFAM2Sh4 = new nTwFAM2Sh4Impl();
    return nTwFAM2Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh5 createnTwFAM2Sh5()
  {
    nTwFAM2Sh5Impl nTwFAM2Sh5 = new nTwFAM2Sh5Impl();
    return nTwFAM2Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwFAM2Sh6 createnTwFAM2Sh6()
  {
    nTwFAM2Sh6Impl nTwFAM2Sh6 = new nTwFAM2Sh6Impl();
    return nTwFAM2Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh2 createnTwSSM1Sh2()
  {
    nTwSSM1Sh2Impl nTwSSM1Sh2 = new nTwSSM1Sh2Impl();
    return nTwSSM1Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh3 createnTwSSM1Sh3()
  {
    nTwSSM1Sh3Impl nTwSSM1Sh3 = new nTwSSM1Sh3Impl();
    return nTwSSM1Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh4 createnTwSSM1Sh4()
  {
    nTwSSM1Sh4Impl nTwSSM1Sh4 = new nTwSSM1Sh4Impl();
    return nTwSSM1Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh5 createnTwSSM1Sh5()
  {
    nTwSSM1Sh5Impl nTwSSM1Sh5 = new nTwSSM1Sh5Impl();
    return nTwSSM1Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM1Sh6 createnTwSSM1Sh6()
  {
    nTwSSM1Sh6Impl nTwSSM1Sh6 = new nTwSSM1Sh6Impl();
    return nTwSSM1Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh2 createnTwSSM2Sh2()
  {
    nTwSSM2Sh2Impl nTwSSM2Sh2 = new nTwSSM2Sh2Impl();
    return nTwSSM2Sh2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh3 createnTwSSM2Sh3()
  {
    nTwSSM2Sh3Impl nTwSSM2Sh3 = new nTwSSM2Sh3Impl();
    return nTwSSM2Sh3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh4 createnTwSSM2Sh4()
  {
    nTwSSM2Sh4Impl nTwSSM2Sh4 = new nTwSSM2Sh4Impl();
    return nTwSSM2Sh4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh5 createnTwSSM2Sh5()
  {
    nTwSSM2Sh5Impl nTwSSM2Sh5 = new nTwSSM2Sh5Impl();
    return nTwSSM2Sh5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwSSM2Sh6 createnTwSSM2Sh6()
  {
    nTwSSM2Sh6Impl nTwSSM2Sh6 = new nTwSSM2Sh6Impl();
    return nTwSSM2Sh6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aTwrStat createaTwrStat()
  {
    aTwrStatImpl aTwrStat = new aTwrStatImpl();
    return aTwrStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FasttwrPackage getFasttwrPackage()
  {
    return (FasttwrPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FasttwrPackage getPackage()
  {
    return FasttwrPackage.eINSTANCE;
  }

} //FasttwrFactoryImpl
