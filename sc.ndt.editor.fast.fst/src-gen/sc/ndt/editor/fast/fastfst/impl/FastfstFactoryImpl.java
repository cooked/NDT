/**
 */
package sc.ndt.editor.fast.fastfst.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.fast.fastfst.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FastfstFactoryImpl extends EFactoryImpl implements FastfstFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FastfstFactory init()
  {
    try
    {
      FastfstFactory theFastfstFactory = (FastfstFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ndt.sc/editor/fast/Fastfst"); 
      if (theFastfstFactory != null)
      {
        return theFastfstFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FastfstFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastfstFactoryImpl()
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
      case FastfstPackage.MODEL_FASTFST: return createModelFastfst();
      case FastfstPackage.HEADER: return createHeader();
      case FastfstPackage.SECTION: return createSection();
      case FastfstPackage.BECHO: return createbEcho();
      case FastfstPackage.IADAMS_PREP: return createiADAMSPrep();
      case FastfstPackage.IANAL_MODE: return createiAnalMode();
      case FastfstPackage.INUM_BL: return createiNumBl();
      case FastfstPackage.NT_MAX: return createnTMax();
      case FastfstPackage.NDT: return createnDT();
      case FastfstPackage.IYC_MODE: return createiYCMode();
      case FastfstPackage.NTYC_ON: return createnTYCOn();
      case FastfstPackage.IPC_MODE: return createiPCMode();
      case FastfstPackage.NTPC_ON: return createnTPCOn();
      case FastfstPackage.IVS_CONTRL: return createiVSContrl();
      case FastfstPackage.NVS_RT_GN_SP: return createnVS_RtGnSp();
      case FastfstPackage.NVS_RT_TQ: return createnVS_RtTq();
      case FastfstPackage.NVS_RGN2_K: return createnVS_Rgn2K();
      case FastfstPackage.NVS_SL_PC: return createnVS_SlPc();
      case FastfstPackage.IGEN_MODEL: return createiGenModel();
      case FastfstPackage.BGEN_TI_STR: return createbGenTiStr();
      case FastfstPackage.BGEN_TI_STP: return createbGenTiStp();
      case FastfstPackage.NSPD_GEN_ON: return createnSpdGenOn();
      case FastfstPackage.NTIM_GEN_ON: return createnTimGenOn();
      case FastfstPackage.NTIM_GEN_OF: return createnTimGenOf();
      case FastfstPackage.IHSS_BR_MODE: return createiHSSBrMode();
      case FastfstPackage.NTHSS_BR_DP: return createnTHSSBrDp();
      case FastfstPackage.NTI_DYN_BRK: return createnTiDynBrk();
      case FastfstPackage.NT_TP_BR_DP_1: return createnTTpBrDp_1_();
      case FastfstPackage.NT_TP_BR_DP_2: return createnTTpBrDp_2_();
      case FastfstPackage.NT_TP_BR_DP_3: return createnTTpBrDp_3_();
      case FastfstPackage.NTB_DEP_ISP_1: return createnTBDepISp_1_();
      case FastfstPackage.NTB_DEP_ISP_2: return createnTBDepISp_2_();
      case FastfstPackage.NTB_DEP_ISP_3: return createnTBDepISp_3_();
      case FastfstPackage.NT_YAW_MAN_S: return createnTYawManS();
      case FastfstPackage.NT_YAW_MAN_E: return createnTYawManE();
      case FastfstPackage.NNAC_YAW_F: return createnNacYawF();
      case FastfstPackage.NT_PIT_MAN_S1: return createnTPitManS_1_();
      case FastfstPackage.NT_PIT_MAN_S2: return createnTPitManS_2_();
      case FastfstPackage.NT_PIT_MAN_S3: return createnTPitManS_3_();
      case FastfstPackage.NT_PIT_MAN_E1: return createnTPitManE_1_();
      case FastfstPackage.NT_PIT_MAN_E2: return createnTPitManE_2_();
      case FastfstPackage.NT_PIT_MAN_E3: return createnTPitManE_3_();
      case FastfstPackage.NBL_PITCH_1: return createnBlPitch_1_();
      case FastfstPackage.NBL_PITCH_2: return createnBlPitch_2_();
      case FastfstPackage.NBL_PITCH_3: return createnBlPitch_3_();
      case FastfstPackage.NBL_PITCH_F1: return createnBlPitchF_1_();
      case FastfstPackage.NBL_PITCH_F2: return createnBlPitchF_2_();
      case FastfstPackage.NBL_PITCH_F3: return createnBlPitchF_3_();
      case FastfstPackage.NGRAVITY: return createnGravity();
      case FastfstPackage.BFLAP_DOF1: return createbFlapDOF1();
      case FastfstPackage.BFLAP_DOF2: return createbFlapDOF2();
      case FastfstPackage.BEDGE_DOF: return createbEdgeDOF();
      case FastfstPackage.BTEET_DOF: return createbTeetDOF();
      case FastfstPackage.BDR_TR_DOF: return createbDrTrDOF();
      case FastfstPackage.BGEN_DOF: return createbGenDOF();
      case FastfstPackage.BYAW_DOF: return createbYawDOF();
      case FastfstPackage.BTW_FADOF1: return createbTwFADOF1();
      case FastfstPackage.BTW_FADOF2: return createbTwFADOF2();
      case FastfstPackage.BTW_SSDOF1: return createbTwSSDOF1();
      case FastfstPackage.BTW_SSDOF2: return createbTwSSDOF2();
      case FastfstPackage.BCOMP_AERO: return createbCompAero();
      case FastfstPackage.BCOMP_NOISE: return createbCompNoise();
      case FastfstPackage.NOO_PDEFL: return createnOoPDefl();
      case FastfstPackage.NIP_DEFL: return createnIPDefl();
      case FastfstPackage.NTEET_DEFL: return createnTeetDefl();
      case FastfstPackage.NAZIMUTH: return createnAzimuth();
      case FastfstPackage.NROT_SPEED: return createnRotSpeed();
      case FastfstPackage.NNAC_YAW: return createnNacYaw();
      case FastfstPackage.NTT_DSP_FA: return createnTTDspFA();
      case FastfstPackage.NTT_DSP_SS: return createnTTDspSS();
      case FastfstPackage.NTIP_RAD: return createnTipRad();
      case FastfstPackage.NHUB_RAD: return createnHubRad();
      case FastfstPackage.NP_SPN_EL_N: return createnPSpnElN();
      case FastfstPackage.NUND_SLING: return createnUndSling();
      case FastfstPackage.NHUB_CM: return createnHubCM();
      case FastfstPackage.NOVER_HANG: return createnOverHang();
      case FastfstPackage.NNAC_CMXN: return createnNacCMxn();
      case FastfstPackage.NNAC_CMYN: return createnNacCMyn();
      case FastfstPackage.NNAC_CMZN: return createnNacCMzn();
      case FastfstPackage.NTOWER_HT: return createnTowerHt();
      case FastfstPackage.NTWR2_SHFT: return createnTwr2Shft();
      case FastfstPackage.NTWR_RB_HT: return createnTwrRBHt();
      case FastfstPackage.NSHFT_TILT: return createnShftTilt();
      case FastfstPackage.NDELTA3: return createnDelta3();
      case FastfstPackage.NPRE_CONE_1: return createnPreCone_1_();
      case FastfstPackage.NPRE_CONE_2: return createnPreCone_2_();
      case FastfstPackage.NPRE_CONE_3: return createnPreCone_3_();
      case FastfstPackage.NAZIM_B1_UP: return createnAzimB1Up();
      case FastfstPackage.NYAW_BR_MASS: return createnYawBrMass();
      case FastfstPackage.NNAC_MASS: return createnNacMass();
      case FastfstPackage.NHUB_MASS: return createnHubMass();
      case FastfstPackage.NTIP_MASS_1: return createnTipMass_1_();
      case FastfstPackage.NTIP_MASS_2: return createnTipMass_2_();
      case FastfstPackage.NTIP_MASS_3: return createnTipMass_3_();
      case FastfstPackage.NNAC_YINER: return createnNacYIner();
      case FastfstPackage.NGEN_INER: return createnGenIner();
      case FastfstPackage.NHUB_INER: return createnHubIner();
      case FastfstPackage.NG_BOX_EFF: return createnGBoxEff();
      case FastfstPackage.NGEN_EFF: return createnGenEff();
      case FastfstPackage.NGB_RATIO: return createnGBRatio();
      case FastfstPackage.BGB_REVERS: return createbGBRevers();
      case FastfstPackage.NHSS_BR_TQ_F: return createnHSSBrTqF();
      case FastfstPackage.NHSS_BR_DT: return createnHSSBrDT();
      case FastfstPackage.FDYN_BRK_FI: return createfDynBrkFi();
      case FastfstPackage.NDT_TOR_SPR: return createnDTTorSpr();
      case FastfstPackage.NDT_TOR_DMP: return createnDTTorDmp();
      case FastfstPackage.NSIG_SL_PC: return createnSIG_SlPc();
      case FastfstPackage.NSIG_SY_SP: return createnSIG_SySp();
      case FastfstPackage.NSIG_RT_TQ: return createnSIG_RtTq();
      case FastfstPackage.NSIG_PO_RT: return createnSIG_PORt();
      case FastfstPackage.NTEC_FREQ: return createnTEC_Freq();
      case FastfstPackage.NTEC_NPOL: return createnTEC_Npol();
      case FastfstPackage.NTEC_SRES: return createnTEC_Sres();
      case FastfstPackage.NTEC_RRES: return createnTEC_Rres();
      case FastfstPackage.NTEC_VLL: return createnTEC_VLL();
      case FastfstPackage.NTEC_SLR: return createnTEC_SLR();
      case FastfstPackage.NTEC_RLR: return createnTEC_RLR();
      case FastfstPackage.NTEC_MR: return createnTEC_MR();
      case FastfstPackage.IPTFM_MODEL: return createiPtfmModel();
      case FastfstPackage.FPTFM_FILE: return createfPtfmFile();
      case FastfstPackage.ITWR_NODES: return createiTwrNodes();
      case FastfstPackage.FTWR_FILE: return createfTwrFile();
      case FastfstPackage.NYAW_SPR: return createnYawSpr();
      case FastfstPackage.NYAW_DAMP: return createnYawDamp();
      case FastfstPackage.NYAW_NEUT: return createnYawNeut();
      case FastfstPackage.BFURLING: return createbFurling();
      case FastfstPackage.FFURL_FILE: return createfFurlFile();
      case FastfstPackage.ITEET_MOD: return createiTeetMod();
      case FastfstPackage.NTEET_DMP_P: return createnTeetDmpP();
      case FastfstPackage.NTEET_DMP: return createnTeetDmp();
      case FastfstPackage.NTEET_CDMP: return createnTeetCDmp();
      case FastfstPackage.NTEET_SST_P: return createnTeetSStP();
      case FastfstPackage.NTEET_HST_P: return createnTeetHStP();
      case FastfstPackage.NTEET_SS_SP: return createnTeetSSSp();
      case FastfstPackage.NTEET_HS_SP: return createnTeetHSSp();
      case FastfstPackage.NTB_DR_CON_N: return createnTBDrConN();
      case FastfstPackage.NTB_DR_CON_D: return createnTBDrConD();
      case FastfstPackage.NTP_BR_DT: return createnTpBrDT();
      case FastfstPackage.FBLD_FILE_1: return createfBldFile_1_();
      case FastfstPackage.FBLD_FILE_2: return createfBldFile_2_();
      case FastfstPackage.FBLD_FILE_3: return createfBldFile_3_();
      case FastfstPackage.FAD_FILE: return createfADFile();
      case FastfstPackage.FNOISE_FILE: return createfNoiseFile();
      case FastfstPackage.FADAMS_FILE: return createfADAMSFile();
      case FastfstPackage.FLIN_FILE: return createfLinFile();
      case FastfstPackage.BSUM_PRINT: return createbSumPrint();
      case FastfstPackage.BOUT_FILE_FMT: return createbOutFileFmt();
      case FastfstPackage.BTAB_DELIM: return createbTabDelim();
      case FastfstPackage.SOUT_FMT: return createsOutFmt();
      case FastfstPackage.NT_START: return createnTStart();
      case FastfstPackage.IDEC_FACT: return createiDecFact();
      case FastfstPackage.NSTTS_TIME: return createnSttsTime();
      case FastfstPackage.NNC_IM_UXN: return createnNcIMUxn();
      case FastfstPackage.NNC_IM_UYN: return createnNcIMUyn();
      case FastfstPackage.NNC_IM_UZN: return createnNcIMUzn();
      case FastfstPackage.NSHFT_GAG_L: return createnShftGagL();
      case FastfstPackage.IN_TW_GAGES: return createiNTwGages();
      case FastfstPackage.ATWR_GAG_ND: return createaTwrGagNd();
      case FastfstPackage.IN_BL_GAGES: return createiNBlGages();
      case FastfstPackage.ABLD_GAG_ND: return createaBldGagNd();
      case FastfstPackage.VOUT_LIST: return createvOutList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFastfst createModelFastfst()
  {
    ModelFastfstImpl modelFastfst = new ModelFastfstImpl();
    return modelFastfst;
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
  public bEcho createbEcho()
  {
    bEchoImpl bEcho = new bEchoImpl();
    return bEcho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iADAMSPrep createiADAMSPrep()
  {
    iADAMSPrepImpl iADAMSPrep = new iADAMSPrepImpl();
    return iADAMSPrep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iAnalMode createiAnalMode()
  {
    iAnalModeImpl iAnalMode = new iAnalModeImpl();
    return iAnalMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNumBl createiNumBl()
  {
    iNumBlImpl iNumBl = new iNumBlImpl();
    return iNumBl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTMax createnTMax()
  {
    nTMaxImpl nTMax = new nTMaxImpl();
    return nTMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDT createnDT()
  {
    nDTImpl nDT = new nDTImpl();
    return nDT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iYCMode createiYCMode()
  {
    iYCModeImpl iYCMode = new iYCModeImpl();
    return iYCMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTYCOn createnTYCOn()
  {
    nTYCOnImpl nTYCOn = new nTYCOnImpl();
    return nTYCOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iPCMode createiPCMode()
  {
    iPCModeImpl iPCMode = new iPCModeImpl();
    return iPCMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPCOn createnTPCOn()
  {
    nTPCOnImpl nTPCOn = new nTPCOnImpl();
    return nTPCOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iVSContrl createiVSContrl()
  {
    iVSContrlImpl iVSContrl = new iVSContrlImpl();
    return iVSContrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVS_RtGnSp createnVS_RtGnSp()
  {
    nVS_RtGnSpImpl nVS_RtGnSp = new nVS_RtGnSpImpl();
    return nVS_RtGnSp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVS_RtTq createnVS_RtTq()
  {
    nVS_RtTqImpl nVS_RtTq = new nVS_RtTqImpl();
    return nVS_RtTq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVS_Rgn2K createnVS_Rgn2K()
  {
    nVS_Rgn2KImpl nVS_Rgn2K = new nVS_Rgn2KImpl();
    return nVS_Rgn2K;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVS_SlPc createnVS_SlPc()
  {
    nVS_SlPcImpl nVS_SlPc = new nVS_SlPcImpl();
    return nVS_SlPc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iGenModel createiGenModel()
  {
    iGenModelImpl iGenModel = new iGenModelImpl();
    return iGenModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bGenTiStr createbGenTiStr()
  {
    bGenTiStrImpl bGenTiStr = new bGenTiStrImpl();
    return bGenTiStr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bGenTiStp createbGenTiStp()
  {
    bGenTiStpImpl bGenTiStp = new bGenTiStpImpl();
    return bGenTiStp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSpdGenOn createnSpdGenOn()
  {
    nSpdGenOnImpl nSpdGenOn = new nSpdGenOnImpl();
    return nSpdGenOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTimGenOn createnTimGenOn()
  {
    nTimGenOnImpl nTimGenOn = new nTimGenOnImpl();
    return nTimGenOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTimGenOf createnTimGenOf()
  {
    nTimGenOfImpl nTimGenOf = new nTimGenOfImpl();
    return nTimGenOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iHSSBrMode createiHSSBrMode()
  {
    iHSSBrModeImpl iHSSBrMode = new iHSSBrModeImpl();
    return iHSSBrMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTHSSBrDp createnTHSSBrDp()
  {
    nTHSSBrDpImpl nTHSSBrDp = new nTHSSBrDpImpl();
    return nTHSSBrDp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTiDynBrk createnTiDynBrk()
  {
    nTiDynBrkImpl nTiDynBrk = new nTiDynBrkImpl();
    return nTiDynBrk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTpBrDp_1_ createnTTpBrDp_1_()
  {
    nTTpBrDp_1_Impl nTTpBrDp_1_ = new nTTpBrDp_1_Impl();
    return nTTpBrDp_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTpBrDp_2_ createnTTpBrDp_2_()
  {
    nTTpBrDp_2_Impl nTTpBrDp_2_ = new nTTpBrDp_2_Impl();
    return nTTpBrDp_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTpBrDp_3_ createnTTpBrDp_3_()
  {
    nTTpBrDp_3_Impl nTTpBrDp_3_ = new nTTpBrDp_3_Impl();
    return nTTpBrDp_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDepISp_1_ createnTBDepISp_1_()
  {
    nTBDepISp_1_Impl nTBDepISp_1_ = new nTBDepISp_1_Impl();
    return nTBDepISp_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDepISp_2_ createnTBDepISp_2_()
  {
    nTBDepISp_2_Impl nTBDepISp_2_ = new nTBDepISp_2_Impl();
    return nTBDepISp_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDepISp_3_ createnTBDepISp_3_()
  {
    nTBDepISp_3_Impl nTBDepISp_3_ = new nTBDepISp_3_Impl();
    return nTBDepISp_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTYawManS createnTYawManS()
  {
    nTYawManSImpl nTYawManS = new nTYawManSImpl();
    return nTYawManS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTYawManE createnTYawManE()
  {
    nTYawManEImpl nTYawManE = new nTYawManEImpl();
    return nTYawManE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacYawF createnNacYawF()
  {
    nNacYawFImpl nNacYawF = new nNacYawFImpl();
    return nNacYawF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManS_1_ createnTPitManS_1_()
  {
    nTPitManS_1_Impl nTPitManS_1_ = new nTPitManS_1_Impl();
    return nTPitManS_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManS_2_ createnTPitManS_2_()
  {
    nTPitManS_2_Impl nTPitManS_2_ = new nTPitManS_2_Impl();
    return nTPitManS_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManS_3_ createnTPitManS_3_()
  {
    nTPitManS_3_Impl nTPitManS_3_ = new nTPitManS_3_Impl();
    return nTPitManS_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManE_1_ createnTPitManE_1_()
  {
    nTPitManE_1_Impl nTPitManE_1_ = new nTPitManE_1_Impl();
    return nTPitManE_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManE_2_ createnTPitManE_2_()
  {
    nTPitManE_2_Impl nTPitManE_2_ = new nTPitManE_2_Impl();
    return nTPitManE_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManE_3_ createnTPitManE_3_()
  {
    nTPitManE_3_Impl nTPitManE_3_ = new nTPitManE_3_Impl();
    return nTPitManE_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitch_1_ createnBlPitch_1_()
  {
    nBlPitch_1_Impl nBlPitch_1_ = new nBlPitch_1_Impl();
    return nBlPitch_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitch_2_ createnBlPitch_2_()
  {
    nBlPitch_2_Impl nBlPitch_2_ = new nBlPitch_2_Impl();
    return nBlPitch_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitch_3_ createnBlPitch_3_()
  {
    nBlPitch_3_Impl nBlPitch_3_ = new nBlPitch_3_Impl();
    return nBlPitch_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitchF_1_ createnBlPitchF_1_()
  {
    nBlPitchF_1_Impl nBlPitchF_1_ = new nBlPitchF_1_Impl();
    return nBlPitchF_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitchF_2_ createnBlPitchF_2_()
  {
    nBlPitchF_2_Impl nBlPitchF_2_ = new nBlPitchF_2_Impl();
    return nBlPitchF_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitchF_3_ createnBlPitchF_3_()
  {
    nBlPitchF_3_Impl nBlPitchF_3_ = new nBlPitchF_3_Impl();
    return nBlPitchF_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGravity createnGravity()
  {
    nGravityImpl nGravity = new nGravityImpl();
    return nGravity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bFlapDOF1 createbFlapDOF1()
  {
    bFlapDOF1Impl bFlapDOF1 = new bFlapDOF1Impl();
    return bFlapDOF1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bFlapDOF2 createbFlapDOF2()
  {
    bFlapDOF2Impl bFlapDOF2 = new bFlapDOF2Impl();
    return bFlapDOF2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bEdgeDOF createbEdgeDOF()
  {
    bEdgeDOFImpl bEdgeDOF = new bEdgeDOFImpl();
    return bEdgeDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTeetDOF createbTeetDOF()
  {
    bTeetDOFImpl bTeetDOF = new bTeetDOFImpl();
    return bTeetDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bDrTrDOF createbDrTrDOF()
  {
    bDrTrDOFImpl bDrTrDOF = new bDrTrDOFImpl();
    return bDrTrDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bGenDOF createbGenDOF()
  {
    bGenDOFImpl bGenDOF = new bGenDOFImpl();
    return bGenDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bYawDOF createbYawDOF()
  {
    bYawDOFImpl bYawDOF = new bYawDOFImpl();
    return bYawDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTwFADOF1 createbTwFADOF1()
  {
    bTwFADOF1Impl bTwFADOF1 = new bTwFADOF1Impl();
    return bTwFADOF1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTwFADOF2 createbTwFADOF2()
  {
    bTwFADOF2Impl bTwFADOF2 = new bTwFADOF2Impl();
    return bTwFADOF2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTwSSDOF1 createbTwSSDOF1()
  {
    bTwSSDOF1Impl bTwSSDOF1 = new bTwSSDOF1Impl();
    return bTwSSDOF1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTwSSDOF2 createbTwSSDOF2()
  {
    bTwSSDOF2Impl bTwSSDOF2 = new bTwSSDOF2Impl();
    return bTwSSDOF2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bCompAero createbCompAero()
  {
    bCompAeroImpl bCompAero = new bCompAeroImpl();
    return bCompAero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bCompNoise createbCompNoise()
  {
    bCompNoiseImpl bCompNoise = new bCompNoiseImpl();
    return bCompNoise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nOoPDefl createnOoPDefl()
  {
    nOoPDeflImpl nOoPDefl = new nOoPDeflImpl();
    return nOoPDefl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIPDefl createnIPDefl()
  {
    nIPDeflImpl nIPDefl = new nIPDeflImpl();
    return nIPDefl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetDefl createnTeetDefl()
  {
    nTeetDeflImpl nTeetDefl = new nTeetDeflImpl();
    return nTeetDefl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAzimuth createnAzimuth()
  {
    nAzimuthImpl nAzimuth = new nAzimuthImpl();
    return nAzimuth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRotSpeed createnRotSpeed()
  {
    nRotSpeedImpl nRotSpeed = new nRotSpeedImpl();
    return nRotSpeed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacYaw createnNacYaw()
  {
    nNacYawImpl nNacYaw = new nNacYawImpl();
    return nNacYaw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTDspFA createnTTDspFA()
  {
    nTTDspFAImpl nTTDspFA = new nTTDspFAImpl();
    return nTTDspFA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTDspSS createnTTDspSS()
  {
    nTTDspSSImpl nTTDspSS = new nTTDspSSImpl();
    return nTTDspSS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipRad createnTipRad()
  {
    nTipRadImpl nTipRad = new nTipRadImpl();
    return nTipRad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubRad createnHubRad()
  {
    nHubRadImpl nHubRad = new nHubRadImpl();
    return nHubRad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPSpnElN createnPSpnElN()
  {
    nPSpnElNImpl nPSpnElN = new nPSpnElNImpl();
    return nPSpnElN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nUndSling createnUndSling()
  {
    nUndSlingImpl nUndSling = new nUndSlingImpl();
    return nUndSling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubCM createnHubCM()
  {
    nHubCMImpl nHubCM = new nHubCMImpl();
    return nHubCM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nOverHang createnOverHang()
  {
    nOverHangImpl nOverHang = new nOverHangImpl();
    return nOverHang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacCMxn createnNacCMxn()
  {
    nNacCMxnImpl nNacCMxn = new nNacCMxnImpl();
    return nNacCMxn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacCMyn createnNacCMyn()
  {
    nNacCMynImpl nNacCMyn = new nNacCMynImpl();
    return nNacCMyn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacCMzn createnNacCMzn()
  {
    nNacCMznImpl nNacCMzn = new nNacCMznImpl();
    return nNacCMzn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTowerHt createnTowerHt()
  {
    nTowerHtImpl nTowerHt = new nTowerHtImpl();
    return nTowerHt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwr2Shft createnTwr2Shft()
  {
    nTwr2ShftImpl nTwr2Shft = new nTwr2ShftImpl();
    return nTwr2Shft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrRBHt createnTwrRBHt()
  {
    nTwrRBHtImpl nTwrRBHt = new nTwrRBHtImpl();
    return nTwrRBHt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nShftTilt createnShftTilt()
  {
    nShftTiltImpl nShftTilt = new nShftTiltImpl();
    return nShftTilt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDelta3 createnDelta3()
  {
    nDelta3Impl nDelta3 = new nDelta3Impl();
    return nDelta3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPreCone_1_ createnPreCone_1_()
  {
    nPreCone_1_Impl nPreCone_1_ = new nPreCone_1_Impl();
    return nPreCone_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPreCone_2_ createnPreCone_2_()
  {
    nPreCone_2_Impl nPreCone_2_ = new nPreCone_2_Impl();
    return nPreCone_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPreCone_3_ createnPreCone_3_()
  {
    nPreCone_3_Impl nPreCone_3_ = new nPreCone_3_Impl();
    return nPreCone_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAzimB1Up createnAzimB1Up()
  {
    nAzimB1UpImpl nAzimB1Up = new nAzimB1UpImpl();
    return nAzimB1Up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nYawBrMass createnYawBrMass()
  {
    nYawBrMassImpl nYawBrMass = new nYawBrMassImpl();
    return nYawBrMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacMass createnNacMass()
  {
    nNacMassImpl nNacMass = new nNacMassImpl();
    return nNacMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubMass createnHubMass()
  {
    nHubMassImpl nHubMass = new nHubMassImpl();
    return nHubMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipMass_1_ createnTipMass_1_()
  {
    nTipMass_1_Impl nTipMass_1_ = new nTipMass_1_Impl();
    return nTipMass_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipMass_2_ createnTipMass_2_()
  {
    nTipMass_2_Impl nTipMass_2_ = new nTipMass_2_Impl();
    return nTipMass_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipMass_3_ createnTipMass_3_()
  {
    nTipMass_3_Impl nTipMass_3_ = new nTipMass_3_Impl();
    return nTipMass_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacYIner createnNacYIner()
  {
    nNacYInerImpl nNacYIner = new nNacYInerImpl();
    return nNacYIner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGenIner createnGenIner()
  {
    nGenInerImpl nGenIner = new nGenInerImpl();
    return nGenIner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubIner createnHubIner()
  {
    nHubInerImpl nHubIner = new nHubInerImpl();
    return nHubIner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGBoxEff createnGBoxEff()
  {
    nGBoxEffImpl nGBoxEff = new nGBoxEffImpl();
    return nGBoxEff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGenEff createnGenEff()
  {
    nGenEffImpl nGenEff = new nGenEffImpl();
    return nGenEff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGBRatio createnGBRatio()
  {
    nGBRatioImpl nGBRatio = new nGBRatioImpl();
    return nGBRatio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bGBRevers createbGBRevers()
  {
    bGBReversImpl bGBRevers = new bGBReversImpl();
    return bGBRevers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHSSBrTqF createnHSSBrTqF()
  {
    nHSSBrTqFImpl nHSSBrTqF = new nHSSBrTqFImpl();
    return nHSSBrTqF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHSSBrDT createnHSSBrDT()
  {
    nHSSBrDTImpl nHSSBrDT = new nHSSBrDTImpl();
    return nHSSBrDT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fDynBrkFi createfDynBrkFi()
  {
    fDynBrkFiImpl fDynBrkFi = new fDynBrkFiImpl();
    return fDynBrkFi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDTTorSpr createnDTTorSpr()
  {
    nDTTorSprImpl nDTTorSpr = new nDTTorSprImpl();
    return nDTTorSpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDTTorDmp createnDTTorDmp()
  {
    nDTTorDmpImpl nDTTorDmp = new nDTTorDmpImpl();
    return nDTTorDmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSIG_SlPc createnSIG_SlPc()
  {
    nSIG_SlPcImpl nSIG_SlPc = new nSIG_SlPcImpl();
    return nSIG_SlPc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSIG_SySp createnSIG_SySp()
  {
    nSIG_SySpImpl nSIG_SySp = new nSIG_SySpImpl();
    return nSIG_SySp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSIG_RtTq createnSIG_RtTq()
  {
    nSIG_RtTqImpl nSIG_RtTq = new nSIG_RtTqImpl();
    return nSIG_RtTq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSIG_PORt createnSIG_PORt()
  {
    nSIG_PORtImpl nSIG_PORt = new nSIG_PORtImpl();
    return nSIG_PORt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_Freq createnTEC_Freq()
  {
    nTEC_FreqImpl nTEC_Freq = new nTEC_FreqImpl();
    return nTEC_Freq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_Npol createnTEC_Npol()
  {
    nTEC_NpolImpl nTEC_Npol = new nTEC_NpolImpl();
    return nTEC_Npol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_Sres createnTEC_Sres()
  {
    nTEC_SresImpl nTEC_Sres = new nTEC_SresImpl();
    return nTEC_Sres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_Rres createnTEC_Rres()
  {
    nTEC_RresImpl nTEC_Rres = new nTEC_RresImpl();
    return nTEC_Rres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_VLL createnTEC_VLL()
  {
    nTEC_VLLImpl nTEC_VLL = new nTEC_VLLImpl();
    return nTEC_VLL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_SLR createnTEC_SLR()
  {
    nTEC_SLRImpl nTEC_SLR = new nTEC_SLRImpl();
    return nTEC_SLR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_RLR createnTEC_RLR()
  {
    nTEC_RLRImpl nTEC_RLR = new nTEC_RLRImpl();
    return nTEC_RLR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_MR createnTEC_MR()
  {
    nTEC_MRImpl nTEC_MR = new nTEC_MRImpl();
    return nTEC_MR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iPtfmModel createiPtfmModel()
  {
    iPtfmModelImpl iPtfmModel = new iPtfmModelImpl();
    return iPtfmModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fPtfmFile createfPtfmFile()
  {
    fPtfmFileImpl fPtfmFile = new fPtfmFileImpl();
    return fPtfmFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iTwrNodes createiTwrNodes()
  {
    iTwrNodesImpl iTwrNodes = new iTwrNodesImpl();
    return iTwrNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fTwrFile createfTwrFile()
  {
    fTwrFileImpl fTwrFile = new fTwrFileImpl();
    return fTwrFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nYawSpr createnYawSpr()
  {
    nYawSprImpl nYawSpr = new nYawSprImpl();
    return nYawSpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nYawDamp createnYawDamp()
  {
    nYawDampImpl nYawDamp = new nYawDampImpl();
    return nYawDamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nYawNeut createnYawNeut()
  {
    nYawNeutImpl nYawNeut = new nYawNeutImpl();
    return nYawNeut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bFurling createbFurling()
  {
    bFurlingImpl bFurling = new bFurlingImpl();
    return bFurling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fFurlFile createfFurlFile()
  {
    fFurlFileImpl fFurlFile = new fFurlFileImpl();
    return fFurlFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iTeetMod createiTeetMod()
  {
    iTeetModImpl iTeetMod = new iTeetModImpl();
    return iTeetMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetDmpP createnTeetDmpP()
  {
    nTeetDmpPImpl nTeetDmpP = new nTeetDmpPImpl();
    return nTeetDmpP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetDmp createnTeetDmp()
  {
    nTeetDmpImpl nTeetDmp = new nTeetDmpImpl();
    return nTeetDmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetCDmp createnTeetCDmp()
  {
    nTeetCDmpImpl nTeetCDmp = new nTeetCDmpImpl();
    return nTeetCDmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetSStP createnTeetSStP()
  {
    nTeetSStPImpl nTeetSStP = new nTeetSStPImpl();
    return nTeetSStP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetHStP createnTeetHStP()
  {
    nTeetHStPImpl nTeetHStP = new nTeetHStPImpl();
    return nTeetHStP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetSSSp createnTeetSSSp()
  {
    nTeetSSSpImpl nTeetSSSp = new nTeetSSSpImpl();
    return nTeetSSSp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetHSSp createnTeetHSSp()
  {
    nTeetHSSpImpl nTeetHSSp = new nTeetHSSpImpl();
    return nTeetHSSp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDrConN createnTBDrConN()
  {
    nTBDrConNImpl nTBDrConN = new nTBDrConNImpl();
    return nTBDrConN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDrConD createnTBDrConD()
  {
    nTBDrConDImpl nTBDrConD = new nTBDrConDImpl();
    return nTBDrConD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTpBrDT createnTpBrDT()
  {
    nTpBrDTImpl nTpBrDT = new nTpBrDTImpl();
    return nTpBrDT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fBldFile_1_ createfBldFile_1_()
  {
    fBldFile_1_Impl fBldFile_1_ = new fBldFile_1_Impl();
    return fBldFile_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fBldFile_2_ createfBldFile_2_()
  {
    fBldFile_2_Impl fBldFile_2_ = new fBldFile_2_Impl();
    return fBldFile_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fBldFile_3_ createfBldFile_3_()
  {
    fBldFile_3_Impl fBldFile_3_ = new fBldFile_3_Impl();
    return fBldFile_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fADFile createfADFile()
  {
    fADFileImpl fADFile = new fADFileImpl();
    return fADFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fNoiseFile createfNoiseFile()
  {
    fNoiseFileImpl fNoiseFile = new fNoiseFileImpl();
    return fNoiseFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fADAMSFile createfADAMSFile()
  {
    fADAMSFileImpl fADAMSFile = new fADAMSFileImpl();
    return fADAMSFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fLinFile createfLinFile()
  {
    fLinFileImpl fLinFile = new fLinFileImpl();
    return fLinFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bSumPrint createbSumPrint()
  {
    bSumPrintImpl bSumPrint = new bSumPrintImpl();
    return bSumPrint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bOutFileFmt createbOutFileFmt()
  {
    bOutFileFmtImpl bOutFileFmt = new bOutFileFmtImpl();
    return bOutFileFmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTabDelim createbTabDelim()
  {
    bTabDelimImpl bTabDelim = new bTabDelimImpl();
    return bTabDelim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sOutFmt createsOutFmt()
  {
    sOutFmtImpl sOutFmt = new sOutFmtImpl();
    return sOutFmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTStart createnTStart()
  {
    nTStartImpl nTStart = new nTStartImpl();
    return nTStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iDecFact createiDecFact()
  {
    iDecFactImpl iDecFact = new iDecFactImpl();
    return iDecFact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSttsTime createnSttsTime()
  {
    nSttsTimeImpl nSttsTime = new nSttsTimeImpl();
    return nSttsTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNcIMUxn createnNcIMUxn()
  {
    nNcIMUxnImpl nNcIMUxn = new nNcIMUxnImpl();
    return nNcIMUxn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNcIMUyn createnNcIMUyn()
  {
    nNcIMUynImpl nNcIMUyn = new nNcIMUynImpl();
    return nNcIMUyn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNcIMUzn createnNcIMUzn()
  {
    nNcIMUznImpl nNcIMUzn = new nNcIMUznImpl();
    return nNcIMUzn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nShftGagL createnShftGagL()
  {
    nShftGagLImpl nShftGagL = new nShftGagLImpl();
    return nShftGagL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNTwGages createiNTwGages()
  {
    iNTwGagesImpl iNTwGages = new iNTwGagesImpl();
    return iNTwGages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aTwrGagNd createaTwrGagNd()
  {
    aTwrGagNdImpl aTwrGagNd = new aTwrGagNdImpl();
    return aTwrGagNd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNBlGages createiNBlGages()
  {
    iNBlGagesImpl iNBlGages = new iNBlGagesImpl();
    return iNBlGages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aBldGagNd createaBldGagNd()
  {
    aBldGagNdImpl aBldGagNd = new aBldGagNdImpl();
    return aBldGagNd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vOutList createvOutList()
  {
    vOutListImpl vOutList = new vOutListImpl();
    return vOutList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastfstPackage getFastfstPackage()
  {
    return (FastfstPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FastfstPackage getPackage()
  {
    return FastfstPackage.eINSTANCE;
  }

} //FastfstFactoryImpl
