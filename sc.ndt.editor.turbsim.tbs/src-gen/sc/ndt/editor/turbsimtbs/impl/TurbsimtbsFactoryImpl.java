/**
 */
package sc.ndt.editor.turbsimtbs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.turbsimtbs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurbsimtbsFactoryImpl extends EFactoryImpl implements TurbsimtbsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TurbsimtbsFactory init()
  {
    try
    {
      TurbsimtbsFactory theTurbsimtbsFactory = (TurbsimtbsFactory)EPackage.Registry.INSTANCE.getEFactory(TurbsimtbsPackage.eNS_URI);
      if (theTurbsimtbsFactory != null)
      {
        return theTurbsimtbsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TurbsimtbsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurbsimtbsFactoryImpl()
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
      case TurbsimtbsPackage.MODEL_TURBSIMTBS: return createModelTurbsimtbs();
      case TurbsimtbsPackage.HEADER: return createHeader();
      case TurbsimtbsPackage.SECTION: return createSection();
      case TurbsimtbsPackage.NRAND_SEED1: return createnRandSeed1();
      case TurbsimtbsPackage.NRAND_SEED2: return createnRandSeed2();
      case TurbsimtbsPackage.BWR_BHHTP: return createbWrBHHTP();
      case TurbsimtbsPackage.BWR_FHHTP: return createbWrFHHTP();
      case TurbsimtbsPackage.BWR_ADHH: return createbWrADHH();
      case TurbsimtbsPackage.BWR_ADFF: return createbWrADFF();
      case TurbsimtbsPackage.BWR_BLFF: return createbWrBLFF();
      case TurbsimtbsPackage.BWR_ADTWR: return createbWrADTWR();
      case TurbsimtbsPackage.BWR_FMTFF: return createbWrFMTFF();
      case TurbsimtbsPackage.BWR_ACT: return createbWrACT();
      case TurbsimtbsPackage.BCLOCKWISE: return createbClockwise();
      case TurbsimtbsPackage.ISCALE_IEC: return createiScaleIEC();
      case TurbsimtbsPackage.INUM_GRID_Z: return createiNumGrid_Z();
      case TurbsimtbsPackage.INUM_GRID_Y: return createiNumGrid_Y();
      case TurbsimtbsPackage.NTIME_STEP: return createnTimeStep();
      case TurbsimtbsPackage.NANALYSIS_TIME: return createnAnalysisTime();
      case TurbsimtbsPackage.NUSABLE_TIME: return createnUsableTime();
      case TurbsimtbsPackage.NHUB_HT: return createnHubHt();
      case TurbsimtbsPackage.NGRID_HEIGHT: return createnGridHeight();
      case TurbsimtbsPackage.NGRID_WIDTH: return createnGridWidth();
      case TurbsimtbsPackage.NV_FLOW_ANG: return createnVFlowAng();
      case TurbsimtbsPackage.NH_FLOW_ANG: return createnHFlowAng();
      case TurbsimtbsPackage.STURB_MODEL: return createsTurbModel();
      case TurbsimtbsPackage.SIE_CSTANDARD: return createsIECstandard();
      case TurbsimtbsPackage.SIE_CTURBC: return createsIECturbc();
      case TurbsimtbsPackage.SIEC_WIND_TYPE: return createsIEC_WindType();
      case TurbsimtbsPackage.SET_MC: return createsETMc();
      case TurbsimtbsPackage.SWIND_PROFILE_TYPE: return createsWindProfileType();
      case TurbsimtbsPackage.NREF_HT: return createnRefHt();
      case TurbsimtbsPackage.NUREF: return createnUref();
      case TurbsimtbsPackage.NZ_JET_MAX: return createnZJetMax();
      case TurbsimtbsPackage.NPL_EXP: return createnPLExp();
      case TurbsimtbsPackage.NZ0: return createnZ0();
      case TurbsimtbsPackage.NLOCATION: return createnLocation();
      case TurbsimtbsPackage.NRICH_NO: return createnRICH_NO();
      case TurbsimtbsPackage.NU_STAR: return createnUStar();
      case TurbsimtbsPackage.NZI: return createnZI();
      case TurbsimtbsPackage.NPC_UW: return createnPC_UW();
      case TurbsimtbsPackage.NPC_UV: return createnPC_UV();
      case TurbsimtbsPackage.NPC_VW: return createnPC_VW();
      case TurbsimtbsPackage.NINC_DEC1: return createnIncDec1();
      case TurbsimtbsPackage.NINC_DEC2: return createnIncDec2();
      case TurbsimtbsPackage.NINC_DEC3: return createnIncDec3();
      case TurbsimtbsPackage.NCOH_EXP: return createnCohExp();
      case TurbsimtbsPackage.SCT_EVENT_PATH: return createsCTEventPath();
      case TurbsimtbsPackage.SCT_EVENT_FILE: return createsCTEventFile();
      case TurbsimtbsPackage.BRANDOMIZE: return createbRandomize();
      case TurbsimtbsPackage.NDIST_SCL: return createnDistScl();
      case TurbsimtbsPackage.NCT_LY: return createnCTLy();
      case TurbsimtbsPackage.NCT_LZ: return createnCTLz();
      case TurbsimtbsPackage.NCT_START_TIME: return createnCTStartTime();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelTurbsimtbs createModelTurbsimtbs()
  {
    ModelTurbsimtbsImpl modelTurbsimtbs = new ModelTurbsimtbsImpl();
    return modelTurbsimtbs;
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
  public nRandSeed1 createnRandSeed1()
  {
    nRandSeed1Impl nRandSeed1 = new nRandSeed1Impl();
    return nRandSeed1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRandSeed2 createnRandSeed2()
  {
    nRandSeed2Impl nRandSeed2 = new nRandSeed2Impl();
    return nRandSeed2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrBHHTP createbWrBHHTP()
  {
    bWrBHHTPImpl bWrBHHTP = new bWrBHHTPImpl();
    return bWrBHHTP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrFHHTP createbWrFHHTP()
  {
    bWrFHHTPImpl bWrFHHTP = new bWrFHHTPImpl();
    return bWrFHHTP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrADHH createbWrADHH()
  {
    bWrADHHImpl bWrADHH = new bWrADHHImpl();
    return bWrADHH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrADFF createbWrADFF()
  {
    bWrADFFImpl bWrADFF = new bWrADFFImpl();
    return bWrADFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrBLFF createbWrBLFF()
  {
    bWrBLFFImpl bWrBLFF = new bWrBLFFImpl();
    return bWrBLFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrADTWR createbWrADTWR()
  {
    bWrADTWRImpl bWrADTWR = new bWrADTWRImpl();
    return bWrADTWR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrFMTFF createbWrFMTFF()
  {
    bWrFMTFFImpl bWrFMTFF = new bWrFMTFFImpl();
    return bWrFMTFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrACT createbWrACT()
  {
    bWrACTImpl bWrACT = new bWrACTImpl();
    return bWrACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bClockwise createbClockwise()
  {
    bClockwiseImpl bClockwise = new bClockwiseImpl();
    return bClockwise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iScaleIEC createiScaleIEC()
  {
    iScaleIECImpl iScaleIEC = new iScaleIECImpl();
    return iScaleIEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNumGrid_Z createiNumGrid_Z()
  {
    iNumGrid_ZImpl iNumGrid_Z = new iNumGrid_ZImpl();
    return iNumGrid_Z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNumGrid_Y createiNumGrid_Y()
  {
    iNumGrid_YImpl iNumGrid_Y = new iNumGrid_YImpl();
    return iNumGrid_Y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTimeStep createnTimeStep()
  {
    nTimeStepImpl nTimeStep = new nTimeStepImpl();
    return nTimeStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAnalysisTime createnAnalysisTime()
  {
    nAnalysisTimeImpl nAnalysisTime = new nAnalysisTimeImpl();
    return nAnalysisTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nUsableTime createnUsableTime()
  {
    nUsableTimeImpl nUsableTime = new nUsableTimeImpl();
    return nUsableTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubHt createnHubHt()
  {
    nHubHtImpl nHubHt = new nHubHtImpl();
    return nHubHt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGridHeight createnGridHeight()
  {
    nGridHeightImpl nGridHeight = new nGridHeightImpl();
    return nGridHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGridWidth createnGridWidth()
  {
    nGridWidthImpl nGridWidth = new nGridWidthImpl();
    return nGridWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVFlowAng createnVFlowAng()
  {
    nVFlowAngImpl nVFlowAng = new nVFlowAngImpl();
    return nVFlowAng;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHFlowAng createnHFlowAng()
  {
    nHFlowAngImpl nHFlowAng = new nHFlowAngImpl();
    return nHFlowAng;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sTurbModel createsTurbModel()
  {
    sTurbModelImpl sTurbModel = new sTurbModelImpl();
    return sTurbModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sIECstandard createsIECstandard()
  {
    sIECstandardImpl sIECstandard = new sIECstandardImpl();
    return sIECstandard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sIECturbc createsIECturbc()
  {
    sIECturbcImpl sIECturbc = new sIECturbcImpl();
    return sIECturbc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sIEC_WindType createsIEC_WindType()
  {
    sIEC_WindTypeImpl sIEC_WindType = new sIEC_WindTypeImpl();
    return sIEC_WindType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sETMc createsETMc()
  {
    sETMcImpl sETMc = new sETMcImpl();
    return sETMc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sWindProfileType createsWindProfileType()
  {
    sWindProfileTypeImpl sWindProfileType = new sWindProfileTypeImpl();
    return sWindProfileType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRefHt createnRefHt()
  {
    nRefHtImpl nRefHt = new nRefHtImpl();
    return nRefHt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nUref createnUref()
  {
    nUrefImpl nUref = new nUrefImpl();
    return nUref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nZJetMax createnZJetMax()
  {
    nZJetMaxImpl nZJetMax = new nZJetMaxImpl();
    return nZJetMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPLExp createnPLExp()
  {
    nPLExpImpl nPLExp = new nPLExpImpl();
    return nPLExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nZ0 createnZ0()
  {
    nZ0Impl nZ0 = new nZ0Impl();
    return nZ0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nLocation createnLocation()
  {
    nLocationImpl nLocation = new nLocationImpl();
    return nLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRICH_NO createnRICH_NO()
  {
    nRICH_NOImpl nRICH_NO = new nRICH_NOImpl();
    return nRICH_NO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nUStar createnUStar()
  {
    nUStarImpl nUStar = new nUStarImpl();
    return nUStar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nZI createnZI()
  {
    nZIImpl nZI = new nZIImpl();
    return nZI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPC_UW createnPC_UW()
  {
    nPC_UWImpl nPC_UW = new nPC_UWImpl();
    return nPC_UW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPC_UV createnPC_UV()
  {
    nPC_UVImpl nPC_UV = new nPC_UVImpl();
    return nPC_UV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPC_VW createnPC_VW()
  {
    nPC_VWImpl nPC_VW = new nPC_VWImpl();
    return nPC_VW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIncDec1 createnIncDec1()
  {
    nIncDec1Impl nIncDec1 = new nIncDec1Impl();
    return nIncDec1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIncDec2 createnIncDec2()
  {
    nIncDec2Impl nIncDec2 = new nIncDec2Impl();
    return nIncDec2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIncDec3 createnIncDec3()
  {
    nIncDec3Impl nIncDec3 = new nIncDec3Impl();
    return nIncDec3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCohExp createnCohExp()
  {
    nCohExpImpl nCohExp = new nCohExpImpl();
    return nCohExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sCTEventPath createsCTEventPath()
  {
    sCTEventPathImpl sCTEventPath = new sCTEventPathImpl();
    return sCTEventPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sCTEventFile createsCTEventFile()
  {
    sCTEventFileImpl sCTEventFile = new sCTEventFileImpl();
    return sCTEventFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bRandomize createbRandomize()
  {
    bRandomizeImpl bRandomize = new bRandomizeImpl();
    return bRandomize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDistScl createnDistScl()
  {
    nDistSclImpl nDistScl = new nDistSclImpl();
    return nDistScl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCTLy createnCTLy()
  {
    nCTLyImpl nCTLy = new nCTLyImpl();
    return nCTLy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCTLz createnCTLz()
  {
    nCTLzImpl nCTLz = new nCTLzImpl();
    return nCTLz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCTStartTime createnCTStartTime()
  {
    nCTStartTimeImpl nCTStartTime = new nCTStartTimeImpl();
    return nCTStartTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurbsimtbsPackage getTurbsimtbsPackage()
  {
    return (TurbsimtbsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TurbsimtbsPackage getPackage()
  {
    return TurbsimtbsPackage.eINSTANCE;
  }

} //TurbsimtbsFactoryImpl
