/**
 */
package sc.ndt.editor.fast.fastadn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.fast.fastadn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FastadnFactoryImpl extends EFactoryImpl implements FastadnFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FastadnFactory init()
  {
    try
    {
      FastadnFactory theFastadnFactory = (FastadnFactory)EPackage.Registry.INSTANCE.getEFactory(FastadnPackage.eNS_URI);
      if (theFastadnFactory != null)
      {
        return theFastadnFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FastadnFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastadnFactoryImpl()
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
      case FastadnPackage.MODEL_FASTADN: return createModelFastadn();
      case FastadnPackage.HEADER: return createHeader();
      case FastadnPackage.SUNITS: return createsUnits();
      case FastadnPackage.SSTALL_MOD: return createsStallMod();
      case FastadnPackage.SUSE_CM: return createsUseCm();
      case FastadnPackage.SINF_MODEL: return createsInfModel();
      case FastadnPackage.SIND_MODEL: return createsIndModel();
      case FastadnPackage.NATOLER: return createnAtoler();
      case FastadnPackage.STL_MODEL: return createsTLModel();
      case FastadnPackage.SHL_MODEL: return createsHLModel();
      case FastadnPackage.SWIND_FILE: return createsWindFile();
      case FastadnPackage.NHH: return createnHH();
      case FastadnPackage.NTWR_SHAD: return createnTwrShad();
      case FastadnPackage.NSHAD_HWID: return createnShadHWid();
      case FastadnPackage.NT_SHAD_REF_PT: return createnTShadRefPt();
      case FastadnPackage.NRHO: return createnRho();
      case FastadnPackage.NKIN_VISC: return createnKinVisc();
      case FastadnPackage.NDT_AERO: return createnDTAero();
      case FastadnPackage.INUM_FOIL: return createiNumFoil();
      case FastadnPackage.AFOIL_NM: return createaFoilNm();
      case FastadnPackage.IBLD_NODES: return createiBldNodes();
      case FastadnPackage.AAIR_STAT: return createaAirStat();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFastadn createModelFastadn()
  {
    ModelFastadnImpl modelFastadn = new ModelFastadnImpl();
    return modelFastadn;
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
  public sUnits createsUnits()
  {
    sUnitsImpl sUnits = new sUnitsImpl();
    return sUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sStallMod createsStallMod()
  {
    sStallModImpl sStallMod = new sStallModImpl();
    return sStallMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sUseCm createsUseCm()
  {
    sUseCmImpl sUseCm = new sUseCmImpl();
    return sUseCm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sInfModel createsInfModel()
  {
    sInfModelImpl sInfModel = new sInfModelImpl();
    return sInfModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sIndModel createsIndModel()
  {
    sIndModelImpl sIndModel = new sIndModelImpl();
    return sIndModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAtoler createnAtoler()
  {
    nAtolerImpl nAtoler = new nAtolerImpl();
    return nAtoler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sTLModel createsTLModel()
  {
    sTLModelImpl sTLModel = new sTLModelImpl();
    return sTLModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sHLModel createsHLModel()
  {
    sHLModelImpl sHLModel = new sHLModelImpl();
    return sHLModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sWindFile createsWindFile()
  {
    sWindFileImpl sWindFile = new sWindFileImpl();
    return sWindFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHH createnHH()
  {
    nHHImpl nHH = new nHHImpl();
    return nHH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrShad createnTwrShad()
  {
    nTwrShadImpl nTwrShad = new nTwrShadImpl();
    return nTwrShad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nShadHWid createnShadHWid()
  {
    nShadHWidImpl nShadHWid = new nShadHWidImpl();
    return nShadHWid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTShadRefPt createnTShadRefPt()
  {
    nTShadRefPtImpl nTShadRefPt = new nTShadRefPtImpl();
    return nTShadRefPt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRho createnRho()
  {
    nRhoImpl nRho = new nRhoImpl();
    return nRho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nKinVisc createnKinVisc()
  {
    nKinViscImpl nKinVisc = new nKinViscImpl();
    return nKinVisc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDTAero createnDTAero()
  {
    nDTAeroImpl nDTAero = new nDTAeroImpl();
    return nDTAero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNumFoil createiNumFoil()
  {
    iNumFoilImpl iNumFoil = new iNumFoilImpl();
    return iNumFoil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aFoilNm createaFoilNm()
  {
    aFoilNmImpl aFoilNm = new aFoilNmImpl();
    return aFoilNm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iBldNodes createiBldNodes()
  {
    iBldNodesImpl iBldNodes = new iBldNodesImpl();
    return iBldNodes;
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
  public FastadnPackage getFastadnPackage()
  {
    return (FastadnPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FastadnPackage getPackage()
  {
    return FastadnPackage.eINSTANCE;
  }

} //FastadnFactoryImpl
