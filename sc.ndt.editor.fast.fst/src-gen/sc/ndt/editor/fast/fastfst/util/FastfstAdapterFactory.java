/**
 */
package sc.ndt.editor.fast.fastfst.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sc.ndt.editor.fast.fastfst.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.fast.fastfst.FastfstPackage
 * @generated
 */
public class FastfstAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FastfstPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastfstAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FastfstPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FastfstSwitch<Adapter> modelSwitch =
    new FastfstSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelFastfst(ModelFastfst object)
      {
        return createModelFastfstAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter casebEcho(bEcho object)
      {
        return createbEchoAdapter();
      }
      @Override
      public Adapter caseiADAMSPrep(iADAMSPrep object)
      {
        return createiADAMSPrepAdapter();
      }
      @Override
      public Adapter caseiAnalMode(iAnalMode object)
      {
        return createiAnalModeAdapter();
      }
      @Override
      public Adapter caseiNumBl(iNumBl object)
      {
        return createiNumBlAdapter();
      }
      @Override
      public Adapter casenTMax(nTMax object)
      {
        return createnTMaxAdapter();
      }
      @Override
      public Adapter casenDT(nDT object)
      {
        return createnDTAdapter();
      }
      @Override
      public Adapter caseiYCMode(iYCMode object)
      {
        return createiYCModeAdapter();
      }
      @Override
      public Adapter casenTYCOn(nTYCOn object)
      {
        return createnTYCOnAdapter();
      }
      @Override
      public Adapter caseiPCMode(iPCMode object)
      {
        return createiPCModeAdapter();
      }
      @Override
      public Adapter casenTPCOn(nTPCOn object)
      {
        return createnTPCOnAdapter();
      }
      @Override
      public Adapter caseiVSContrl(iVSContrl object)
      {
        return createiVSContrlAdapter();
      }
      @Override
      public Adapter casenVS_RtGnSp(nVS_RtGnSp object)
      {
        return createnVS_RtGnSpAdapter();
      }
      @Override
      public Adapter casenVS_RtTq(nVS_RtTq object)
      {
        return createnVS_RtTqAdapter();
      }
      @Override
      public Adapter casenVS_Rgn2K(nVS_Rgn2K object)
      {
        return createnVS_Rgn2KAdapter();
      }
      @Override
      public Adapter casenVS_SlPc(nVS_SlPc object)
      {
        return createnVS_SlPcAdapter();
      }
      @Override
      public Adapter caseiGenModel(iGenModel object)
      {
        return createiGenModelAdapter();
      }
      @Override
      public Adapter casebGenTiStr(bGenTiStr object)
      {
        return createbGenTiStrAdapter();
      }
      @Override
      public Adapter casebGenTiStp(bGenTiStp object)
      {
        return createbGenTiStpAdapter();
      }
      @Override
      public Adapter casenSpdGenOn(nSpdGenOn object)
      {
        return createnSpdGenOnAdapter();
      }
      @Override
      public Adapter casenTimGenOn(nTimGenOn object)
      {
        return createnTimGenOnAdapter();
      }
      @Override
      public Adapter casenTimGenOf(nTimGenOf object)
      {
        return createnTimGenOfAdapter();
      }
      @Override
      public Adapter caseiHSSBrMode(iHSSBrMode object)
      {
        return createiHSSBrModeAdapter();
      }
      @Override
      public Adapter casenTHSSBrDp(nTHSSBrDp object)
      {
        return createnTHSSBrDpAdapter();
      }
      @Override
      public Adapter casenTiDynBrk(nTiDynBrk object)
      {
        return createnTiDynBrkAdapter();
      }
      @Override
      public Adapter casenTTpBrDp_1_(nTTpBrDp_1_ object)
      {
        return createnTTpBrDp_1_Adapter();
      }
      @Override
      public Adapter casenTTpBrDp_2_(nTTpBrDp_2_ object)
      {
        return createnTTpBrDp_2_Adapter();
      }
      @Override
      public Adapter casenTTpBrDp_3_(nTTpBrDp_3_ object)
      {
        return createnTTpBrDp_3_Adapter();
      }
      @Override
      public Adapter casenTBDepISp_1_(nTBDepISp_1_ object)
      {
        return createnTBDepISp_1_Adapter();
      }
      @Override
      public Adapter casenTBDepISp_2_(nTBDepISp_2_ object)
      {
        return createnTBDepISp_2_Adapter();
      }
      @Override
      public Adapter casenTBDepISp_3_(nTBDepISp_3_ object)
      {
        return createnTBDepISp_3_Adapter();
      }
      @Override
      public Adapter casenTYawManS(nTYawManS object)
      {
        return createnTYawManSAdapter();
      }
      @Override
      public Adapter casenTYawManE(nTYawManE object)
      {
        return createnTYawManEAdapter();
      }
      @Override
      public Adapter casenNacYawF(nNacYawF object)
      {
        return createnNacYawFAdapter();
      }
      @Override
      public Adapter casenTPitManS_1_(nTPitManS_1_ object)
      {
        return createnTPitManS_1_Adapter();
      }
      @Override
      public Adapter casenTPitManS_2_(nTPitManS_2_ object)
      {
        return createnTPitManS_2_Adapter();
      }
      @Override
      public Adapter casenTPitManS_3_(nTPitManS_3_ object)
      {
        return createnTPitManS_3_Adapter();
      }
      @Override
      public Adapter casenTPitManE_1_(nTPitManE_1_ object)
      {
        return createnTPitManE_1_Adapter();
      }
      @Override
      public Adapter casenTPitManE_2_(nTPitManE_2_ object)
      {
        return createnTPitManE_2_Adapter();
      }
      @Override
      public Adapter casenTPitManE_3_(nTPitManE_3_ object)
      {
        return createnTPitManE_3_Adapter();
      }
      @Override
      public Adapter casenBlPitch_1_(nBlPitch_1_ object)
      {
        return createnBlPitch_1_Adapter();
      }
      @Override
      public Adapter casenBlPitch_2_(nBlPitch_2_ object)
      {
        return createnBlPitch_2_Adapter();
      }
      @Override
      public Adapter casenBlPitch_3_(nBlPitch_3_ object)
      {
        return createnBlPitch_3_Adapter();
      }
      @Override
      public Adapter casenBlPitchF_1_(nBlPitchF_1_ object)
      {
        return createnBlPitchF_1_Adapter();
      }
      @Override
      public Adapter casenBlPitchF_2_(nBlPitchF_2_ object)
      {
        return createnBlPitchF_2_Adapter();
      }
      @Override
      public Adapter casenBlPitchF_3_(nBlPitchF_3_ object)
      {
        return createnBlPitchF_3_Adapter();
      }
      @Override
      public Adapter casenGravity(nGravity object)
      {
        return createnGravityAdapter();
      }
      @Override
      public Adapter casebFlapDOF1(bFlapDOF1 object)
      {
        return createbFlapDOF1Adapter();
      }
      @Override
      public Adapter casebFlapDOF2(bFlapDOF2 object)
      {
        return createbFlapDOF2Adapter();
      }
      @Override
      public Adapter casebEdgeDOF(bEdgeDOF object)
      {
        return createbEdgeDOFAdapter();
      }
      @Override
      public Adapter casebTeetDOF(bTeetDOF object)
      {
        return createbTeetDOFAdapter();
      }
      @Override
      public Adapter casebDrTrDOF(bDrTrDOF object)
      {
        return createbDrTrDOFAdapter();
      }
      @Override
      public Adapter casebGenDOF(bGenDOF object)
      {
        return createbGenDOFAdapter();
      }
      @Override
      public Adapter casebYawDOF(bYawDOF object)
      {
        return createbYawDOFAdapter();
      }
      @Override
      public Adapter casebTwFADOF1(bTwFADOF1 object)
      {
        return createbTwFADOF1Adapter();
      }
      @Override
      public Adapter casebTwFADOF2(bTwFADOF2 object)
      {
        return createbTwFADOF2Adapter();
      }
      @Override
      public Adapter casebTwSSDOF1(bTwSSDOF1 object)
      {
        return createbTwSSDOF1Adapter();
      }
      @Override
      public Adapter casebTwSSDOF2(bTwSSDOF2 object)
      {
        return createbTwSSDOF2Adapter();
      }
      @Override
      public Adapter casebCompAero(bCompAero object)
      {
        return createbCompAeroAdapter();
      }
      @Override
      public Adapter casebCompNoise(bCompNoise object)
      {
        return createbCompNoiseAdapter();
      }
      @Override
      public Adapter casenOoPDefl(nOoPDefl object)
      {
        return createnOoPDeflAdapter();
      }
      @Override
      public Adapter casenIPDefl(nIPDefl object)
      {
        return createnIPDeflAdapter();
      }
      @Override
      public Adapter casenTeetDefl(nTeetDefl object)
      {
        return createnTeetDeflAdapter();
      }
      @Override
      public Adapter casenAzimuth(nAzimuth object)
      {
        return createnAzimuthAdapter();
      }
      @Override
      public Adapter casenRotSpeed(nRotSpeed object)
      {
        return createnRotSpeedAdapter();
      }
      @Override
      public Adapter casenNacYaw(nNacYaw object)
      {
        return createnNacYawAdapter();
      }
      @Override
      public Adapter casenTTDspFA(nTTDspFA object)
      {
        return createnTTDspFAAdapter();
      }
      @Override
      public Adapter casenTTDspSS(nTTDspSS object)
      {
        return createnTTDspSSAdapter();
      }
      @Override
      public Adapter casenTipRad(nTipRad object)
      {
        return createnTipRadAdapter();
      }
      @Override
      public Adapter casenHubRad(nHubRad object)
      {
        return createnHubRadAdapter();
      }
      @Override
      public Adapter casenPSpnElN(nPSpnElN object)
      {
        return createnPSpnElNAdapter();
      }
      @Override
      public Adapter casenUndSling(nUndSling object)
      {
        return createnUndSlingAdapter();
      }
      @Override
      public Adapter casenHubCM(nHubCM object)
      {
        return createnHubCMAdapter();
      }
      @Override
      public Adapter casenOverHang(nOverHang object)
      {
        return createnOverHangAdapter();
      }
      @Override
      public Adapter casenNacCMxn(nNacCMxn object)
      {
        return createnNacCMxnAdapter();
      }
      @Override
      public Adapter casenNacCMyn(nNacCMyn object)
      {
        return createnNacCMynAdapter();
      }
      @Override
      public Adapter casenNacCMzn(nNacCMzn object)
      {
        return createnNacCMznAdapter();
      }
      @Override
      public Adapter casenTowerHt(nTowerHt object)
      {
        return createnTowerHtAdapter();
      }
      @Override
      public Adapter casenTwr2Shft(nTwr2Shft object)
      {
        return createnTwr2ShftAdapter();
      }
      @Override
      public Adapter casenTwrRBHt(nTwrRBHt object)
      {
        return createnTwrRBHtAdapter();
      }
      @Override
      public Adapter casenShftTilt(nShftTilt object)
      {
        return createnShftTiltAdapter();
      }
      @Override
      public Adapter casenDelta3(nDelta3 object)
      {
        return createnDelta3Adapter();
      }
      @Override
      public Adapter casenPreCone_1_(nPreCone_1_ object)
      {
        return createnPreCone_1_Adapter();
      }
      @Override
      public Adapter casenPreCone_2_(nPreCone_2_ object)
      {
        return createnPreCone_2_Adapter();
      }
      @Override
      public Adapter casenPreCone_3_(nPreCone_3_ object)
      {
        return createnPreCone_3_Adapter();
      }
      @Override
      public Adapter casenAzimB1Up(nAzimB1Up object)
      {
        return createnAzimB1UpAdapter();
      }
      @Override
      public Adapter casenYawBrMass(nYawBrMass object)
      {
        return createnYawBrMassAdapter();
      }
      @Override
      public Adapter casenNacMass(nNacMass object)
      {
        return createnNacMassAdapter();
      }
      @Override
      public Adapter casenHubMass(nHubMass object)
      {
        return createnHubMassAdapter();
      }
      @Override
      public Adapter casenTipMass_1_(nTipMass_1_ object)
      {
        return createnTipMass_1_Adapter();
      }
      @Override
      public Adapter casenTipMass_2_(nTipMass_2_ object)
      {
        return createnTipMass_2_Adapter();
      }
      @Override
      public Adapter casenTipMass_3_(nTipMass_3_ object)
      {
        return createnTipMass_3_Adapter();
      }
      @Override
      public Adapter casenNacYIner(nNacYIner object)
      {
        return createnNacYInerAdapter();
      }
      @Override
      public Adapter casenGenIner(nGenIner object)
      {
        return createnGenInerAdapter();
      }
      @Override
      public Adapter casenHubIner(nHubIner object)
      {
        return createnHubInerAdapter();
      }
      @Override
      public Adapter casenGBoxEff(nGBoxEff object)
      {
        return createnGBoxEffAdapter();
      }
      @Override
      public Adapter casenGenEff(nGenEff object)
      {
        return createnGenEffAdapter();
      }
      @Override
      public Adapter casenGBRatio(nGBRatio object)
      {
        return createnGBRatioAdapter();
      }
      @Override
      public Adapter casebGBRevers(bGBRevers object)
      {
        return createbGBReversAdapter();
      }
      @Override
      public Adapter casenHSSBrTqF(nHSSBrTqF object)
      {
        return createnHSSBrTqFAdapter();
      }
      @Override
      public Adapter casenHSSBrDT(nHSSBrDT object)
      {
        return createnHSSBrDTAdapter();
      }
      @Override
      public Adapter casefDynBrkFi(fDynBrkFi object)
      {
        return createfDynBrkFiAdapter();
      }
      @Override
      public Adapter casenDTTorSpr(nDTTorSpr object)
      {
        return createnDTTorSprAdapter();
      }
      @Override
      public Adapter casenDTTorDmp(nDTTorDmp object)
      {
        return createnDTTorDmpAdapter();
      }
      @Override
      public Adapter casenSIG_SlPc(nSIG_SlPc object)
      {
        return createnSIG_SlPcAdapter();
      }
      @Override
      public Adapter casenSIG_SySp(nSIG_SySp object)
      {
        return createnSIG_SySpAdapter();
      }
      @Override
      public Adapter casenSIG_RtTq(nSIG_RtTq object)
      {
        return createnSIG_RtTqAdapter();
      }
      @Override
      public Adapter casenSIG_PORt(nSIG_PORt object)
      {
        return createnSIG_PORtAdapter();
      }
      @Override
      public Adapter casenTEC_Freq(nTEC_Freq object)
      {
        return createnTEC_FreqAdapter();
      }
      @Override
      public Adapter casenTEC_Npol(nTEC_Npol object)
      {
        return createnTEC_NpolAdapter();
      }
      @Override
      public Adapter casenTEC_Sres(nTEC_Sres object)
      {
        return createnTEC_SresAdapter();
      }
      @Override
      public Adapter casenTEC_Rres(nTEC_Rres object)
      {
        return createnTEC_RresAdapter();
      }
      @Override
      public Adapter casenTEC_VLL(nTEC_VLL object)
      {
        return createnTEC_VLLAdapter();
      }
      @Override
      public Adapter casenTEC_SLR(nTEC_SLR object)
      {
        return createnTEC_SLRAdapter();
      }
      @Override
      public Adapter casenTEC_RLR(nTEC_RLR object)
      {
        return createnTEC_RLRAdapter();
      }
      @Override
      public Adapter casenTEC_MR(nTEC_MR object)
      {
        return createnTEC_MRAdapter();
      }
      @Override
      public Adapter caseiPtfmModel(iPtfmModel object)
      {
        return createiPtfmModelAdapter();
      }
      @Override
      public Adapter casefPtfmFile(fPtfmFile object)
      {
        return createfPtfmFileAdapter();
      }
      @Override
      public Adapter caseiTwrNodes(iTwrNodes object)
      {
        return createiTwrNodesAdapter();
      }
      @Override
      public Adapter casefTwrFile(fTwrFile object)
      {
        return createfTwrFileAdapter();
      }
      @Override
      public Adapter casenYawSpr(nYawSpr object)
      {
        return createnYawSprAdapter();
      }
      @Override
      public Adapter casenYawDamp(nYawDamp object)
      {
        return createnYawDampAdapter();
      }
      @Override
      public Adapter casenYawNeut(nYawNeut object)
      {
        return createnYawNeutAdapter();
      }
      @Override
      public Adapter casebFurling(bFurling object)
      {
        return createbFurlingAdapter();
      }
      @Override
      public Adapter casefFurlFile(fFurlFile object)
      {
        return createfFurlFileAdapter();
      }
      @Override
      public Adapter caseiTeetMod(iTeetMod object)
      {
        return createiTeetModAdapter();
      }
      @Override
      public Adapter casenTeetDmpP(nTeetDmpP object)
      {
        return createnTeetDmpPAdapter();
      }
      @Override
      public Adapter casenTeetDmp(nTeetDmp object)
      {
        return createnTeetDmpAdapter();
      }
      @Override
      public Adapter casenTeetCDmp(nTeetCDmp object)
      {
        return createnTeetCDmpAdapter();
      }
      @Override
      public Adapter casenTeetSStP(nTeetSStP object)
      {
        return createnTeetSStPAdapter();
      }
      @Override
      public Adapter casenTeetHStP(nTeetHStP object)
      {
        return createnTeetHStPAdapter();
      }
      @Override
      public Adapter casenTeetSSSp(nTeetSSSp object)
      {
        return createnTeetSSSpAdapter();
      }
      @Override
      public Adapter casenTeetHSSp(nTeetHSSp object)
      {
        return createnTeetHSSpAdapter();
      }
      @Override
      public Adapter casenTBDrConN(nTBDrConN object)
      {
        return createnTBDrConNAdapter();
      }
      @Override
      public Adapter casenTBDrConD(nTBDrConD object)
      {
        return createnTBDrConDAdapter();
      }
      @Override
      public Adapter casenTpBrDT(nTpBrDT object)
      {
        return createnTpBrDTAdapter();
      }
      @Override
      public Adapter casefBldFile_1_(fBldFile_1_ object)
      {
        return createfBldFile_1_Adapter();
      }
      @Override
      public Adapter casefBldFile_2_(fBldFile_2_ object)
      {
        return createfBldFile_2_Adapter();
      }
      @Override
      public Adapter casefBldFile_3_(fBldFile_3_ object)
      {
        return createfBldFile_3_Adapter();
      }
      @Override
      public Adapter casefADFile(fADFile object)
      {
        return createfADFileAdapter();
      }
      @Override
      public Adapter casefNoiseFile(fNoiseFile object)
      {
        return createfNoiseFileAdapter();
      }
      @Override
      public Adapter casefADAMSFile(fADAMSFile object)
      {
        return createfADAMSFileAdapter();
      }
      @Override
      public Adapter casefLinFile(fLinFile object)
      {
        return createfLinFileAdapter();
      }
      @Override
      public Adapter casebSumPrint(bSumPrint object)
      {
        return createbSumPrintAdapter();
      }
      @Override
      public Adapter casebOutFileFmt(bOutFileFmt object)
      {
        return createbOutFileFmtAdapter();
      }
      @Override
      public Adapter casebTabDelim(bTabDelim object)
      {
        return createbTabDelimAdapter();
      }
      @Override
      public Adapter casesOutFmt(sOutFmt object)
      {
        return createsOutFmtAdapter();
      }
      @Override
      public Adapter casenTStart(nTStart object)
      {
        return createnTStartAdapter();
      }
      @Override
      public Adapter caseiDecFact(iDecFact object)
      {
        return createiDecFactAdapter();
      }
      @Override
      public Adapter casenSttsTime(nSttsTime object)
      {
        return createnSttsTimeAdapter();
      }
      @Override
      public Adapter casenNcIMUxn(nNcIMUxn object)
      {
        return createnNcIMUxnAdapter();
      }
      @Override
      public Adapter casenNcIMUyn(nNcIMUyn object)
      {
        return createnNcIMUynAdapter();
      }
      @Override
      public Adapter casenNcIMUzn(nNcIMUzn object)
      {
        return createnNcIMUznAdapter();
      }
      @Override
      public Adapter casenShftGagL(nShftGagL object)
      {
        return createnShftGagLAdapter();
      }
      @Override
      public Adapter caseiNTwGages(iNTwGages object)
      {
        return createiNTwGagesAdapter();
      }
      @Override
      public Adapter caseaTwrGagNd(aTwrGagNd object)
      {
        return createaTwrGagNdAdapter();
      }
      @Override
      public Adapter caseiNBlGages(iNBlGages object)
      {
        return createiNBlGagesAdapter();
      }
      @Override
      public Adapter caseaBldGagNd(aBldGagNd object)
      {
        return createaBldGagNdAdapter();
      }
      @Override
      public Adapter casevOutList(vOutList object)
      {
        return createvOutListAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.ModelFastfst <em>Model Fastfst</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.ModelFastfst
   * @generated
   */
  public Adapter createModelFastfstAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bEcho <em>bEcho</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bEcho
   * @generated
   */
  public Adapter createbEchoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iADAMSPrep <em>iADAMS Prep</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iADAMSPrep
   * @generated
   */
  public Adapter createiADAMSPrepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iAnalMode <em>iAnal Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iAnalMode
   * @generated
   */
  public Adapter createiAnalModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iNumBl <em>iNum Bl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iNumBl
   * @generated
   */
  public Adapter createiNumBlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTMax <em>nT Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTMax
   * @generated
   */
  public Adapter createnTMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nDT <em>nDT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nDT
   * @generated
   */
  public Adapter createnDTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iYCMode <em>iYC Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iYCMode
   * @generated
   */
  public Adapter createiYCModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTYCOn <em>nTYC On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTYCOn
   * @generated
   */
  public Adapter createnTYCOnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iPCMode <em>iPC Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iPCMode
   * @generated
   */
  public Adapter createiPCModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTPCOn <em>nTPC On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTPCOn
   * @generated
   */
  public Adapter createnTPCOnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iVSContrl <em>iVS Contrl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iVSContrl
   * @generated
   */
  public Adapter createiVSContrlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nVS_RtGnSp <em>nVS Rt Gn Sp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nVS_RtGnSp
   * @generated
   */
  public Adapter createnVS_RtGnSpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nVS_RtTq <em>nVS Rt Tq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nVS_RtTq
   * @generated
   */
  public Adapter createnVS_RtTqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nVS_Rgn2K <em>nVS Rgn2 K</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nVS_Rgn2K
   * @generated
   */
  public Adapter createnVS_Rgn2KAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nVS_SlPc <em>nVS Sl Pc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nVS_SlPc
   * @generated
   */
  public Adapter createnVS_SlPcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iGenModel <em>iGen Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iGenModel
   * @generated
   */
  public Adapter createiGenModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bGenTiStr <em>bGen Ti Str</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bGenTiStr
   * @generated
   */
  public Adapter createbGenTiStrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bGenTiStp <em>bGen Ti Stp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bGenTiStp
   * @generated
   */
  public Adapter createbGenTiStpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nSpdGenOn <em>nSpd Gen On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nSpdGenOn
   * @generated
   */
  public Adapter createnSpdGenOnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTimGenOn <em>nTim Gen On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTimGenOn
   * @generated
   */
  public Adapter createnTimGenOnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTimGenOf <em>nTim Gen Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTimGenOf
   * @generated
   */
  public Adapter createnTimGenOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iHSSBrMode <em>iHSS Br Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iHSSBrMode
   * @generated
   */
  public Adapter createiHSSBrModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTHSSBrDp <em>nTHSS Br Dp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTHSSBrDp
   * @generated
   */
  public Adapter createnTHSSBrDpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTiDynBrk <em>nTi Dyn Brk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTiDynBrk
   * @generated
   */
  public Adapter createnTiDynBrkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_1_ <em>nT Tp Br Dp 1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_1_
   * @generated
   */
  public Adapter createnTTpBrDp_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_2_ <em>nT Tp Br Dp 2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_2_
   * @generated
   */
  public Adapter createnTTpBrDp_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTTpBrDp_3_ <em>nT Tp Br Dp 3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTTpBrDp_3_
   * @generated
   */
  public Adapter createnTTpBrDp_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_1_ <em>nTB Dep ISp 1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_1_
   * @generated
   */
  public Adapter createnTBDepISp_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_2_ <em>nTB Dep ISp 2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_2_
   * @generated
   */
  public Adapter createnTBDepISp_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTBDepISp_3_ <em>nTB Dep ISp 3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTBDepISp_3_
   * @generated
   */
  public Adapter createnTBDepISp_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTYawManS <em>nT Yaw Man S</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTYawManS
   * @generated
   */
  public Adapter createnTYawManSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTYawManE <em>nT Yaw Man E</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTYawManE
   * @generated
   */
  public Adapter createnTYawManEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNacYawF <em>nNac Yaw F</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNacYawF
   * @generated
   */
  public Adapter createnNacYawFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTPitManS_1_ <em>nT Pit Man S1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_1_
   * @generated
   */
  public Adapter createnTPitManS_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTPitManS_2_ <em>nT Pit Man S2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_2_
   * @generated
   */
  public Adapter createnTPitManS_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTPitManS_3_ <em>nT Pit Man S3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTPitManS_3_
   * @generated
   */
  public Adapter createnTPitManS_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTPitManE_1_ <em>nT Pit Man E1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_1_
   * @generated
   */
  public Adapter createnTPitManE_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTPitManE_2_ <em>nT Pit Man E2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_2_
   * @generated
   */
  public Adapter createnTPitManE_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTPitManE_3_ <em>nT Pit Man E3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTPitManE_3_
   * @generated
   */
  public Adapter createnTPitManE_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nBlPitch_1_ <em>nBl Pitch 1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_1_
   * @generated
   */
  public Adapter createnBlPitch_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nBlPitch_2_ <em>nBl Pitch 2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_2_
   * @generated
   */
  public Adapter createnBlPitch_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nBlPitch_3_ <em>nBl Pitch 3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nBlPitch_3_
   * @generated
   */
  public Adapter createnBlPitch_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_1_ <em>nBl Pitch F1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_1_
   * @generated
   */
  public Adapter createnBlPitchF_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_2_ <em>nBl Pitch F2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_2_
   * @generated
   */
  public Adapter createnBlPitchF_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nBlPitchF_3_ <em>nBl Pitch F3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nBlPitchF_3_
   * @generated
   */
  public Adapter createnBlPitchF_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nGravity <em>nGravity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nGravity
   * @generated
   */
  public Adapter createnGravityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bFlapDOF1 <em>bFlap DOF1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bFlapDOF1
   * @generated
   */
  public Adapter createbFlapDOF1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bFlapDOF2 <em>bFlap DOF2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bFlapDOF2
   * @generated
   */
  public Adapter createbFlapDOF2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bEdgeDOF <em>bEdge DOF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bEdgeDOF
   * @generated
   */
  public Adapter createbEdgeDOFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bTeetDOF <em>bTeet DOF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bTeetDOF
   * @generated
   */
  public Adapter createbTeetDOFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bDrTrDOF <em>bDr Tr DOF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bDrTrDOF
   * @generated
   */
  public Adapter createbDrTrDOFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bGenDOF <em>bGen DOF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bGenDOF
   * @generated
   */
  public Adapter createbGenDOFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bYawDOF <em>bYaw DOF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bYawDOF
   * @generated
   */
  public Adapter createbYawDOFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bTwFADOF1 <em>bTw FADOF1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bTwFADOF1
   * @generated
   */
  public Adapter createbTwFADOF1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bTwFADOF2 <em>bTw FADOF2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bTwFADOF2
   * @generated
   */
  public Adapter createbTwFADOF2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bTwSSDOF1 <em>bTw SSDOF1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bTwSSDOF1
   * @generated
   */
  public Adapter createbTwSSDOF1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bTwSSDOF2 <em>bTw SSDOF2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bTwSSDOF2
   * @generated
   */
  public Adapter createbTwSSDOF2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bCompAero <em>bComp Aero</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bCompAero
   * @generated
   */
  public Adapter createbCompAeroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bCompNoise <em>bComp Noise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bCompNoise
   * @generated
   */
  public Adapter createbCompNoiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nOoPDefl <em>nOo PDefl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nOoPDefl
   * @generated
   */
  public Adapter createnOoPDeflAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nIPDefl <em>nIP Defl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nIPDefl
   * @generated
   */
  public Adapter createnIPDeflAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTeetDefl <em>nTeet Defl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTeetDefl
   * @generated
   */
  public Adapter createnTeetDeflAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nAzimuth <em>nAzimuth</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nAzimuth
   * @generated
   */
  public Adapter createnAzimuthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nRotSpeed <em>nRot Speed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nRotSpeed
   * @generated
   */
  public Adapter createnRotSpeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNacYaw <em>nNac Yaw</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNacYaw
   * @generated
   */
  public Adapter createnNacYawAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTTDspFA <em>nTT Dsp FA</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTTDspFA
   * @generated
   */
  public Adapter createnTTDspFAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTTDspSS <em>nTT Dsp SS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTTDspSS
   * @generated
   */
  public Adapter createnTTDspSSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTipRad <em>nTip Rad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTipRad
   * @generated
   */
  public Adapter createnTipRadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nHubRad <em>nHub Rad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nHubRad
   * @generated
   */
  public Adapter createnHubRadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nPSpnElN <em>nP Spn El N</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nPSpnElN
   * @generated
   */
  public Adapter createnPSpnElNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nUndSling <em>nUnd Sling</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nUndSling
   * @generated
   */
  public Adapter createnUndSlingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nHubCM <em>nHub CM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nHubCM
   * @generated
   */
  public Adapter createnHubCMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nOverHang <em>nOver Hang</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nOverHang
   * @generated
   */
  public Adapter createnOverHangAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNacCMxn <em>nNac CMxn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNacCMxn
   * @generated
   */
  public Adapter createnNacCMxnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNacCMyn <em>nNac CMyn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNacCMyn
   * @generated
   */
  public Adapter createnNacCMynAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNacCMzn <em>nNac CMzn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNacCMzn
   * @generated
   */
  public Adapter createnNacCMznAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTowerHt <em>nTower Ht</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTowerHt
   * @generated
   */
  public Adapter createnTowerHtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTwr2Shft <em>nTwr2 Shft</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTwr2Shft
   * @generated
   */
  public Adapter createnTwr2ShftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTwrRBHt <em>nTwr RB Ht</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTwrRBHt
   * @generated
   */
  public Adapter createnTwrRBHtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nShftTilt <em>nShft Tilt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nShftTilt
   * @generated
   */
  public Adapter createnShftTiltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nDelta3 <em>nDelta3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nDelta3
   * @generated
   */
  public Adapter createnDelta3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nPreCone_1_ <em>nPre Cone 1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_1_
   * @generated
   */
  public Adapter createnPreCone_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nPreCone_2_ <em>nPre Cone 2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_2_
   * @generated
   */
  public Adapter createnPreCone_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nPreCone_3_ <em>nPre Cone 3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nPreCone_3_
   * @generated
   */
  public Adapter createnPreCone_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nAzimB1Up <em>nAzim B1 Up</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nAzimB1Up
   * @generated
   */
  public Adapter createnAzimB1UpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nYawBrMass <em>nYaw Br Mass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nYawBrMass
   * @generated
   */
  public Adapter createnYawBrMassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNacMass <em>nNac Mass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNacMass
   * @generated
   */
  public Adapter createnNacMassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nHubMass <em>nHub Mass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nHubMass
   * @generated
   */
  public Adapter createnHubMassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTipMass_1_ <em>nTip Mass 1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_1_
   * @generated
   */
  public Adapter createnTipMass_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTipMass_2_ <em>nTip Mass 2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_2_
   * @generated
   */
  public Adapter createnTipMass_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTipMass_3_ <em>nTip Mass 3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTipMass_3_
   * @generated
   */
  public Adapter createnTipMass_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNacYIner <em>nNac YIner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNacYIner
   * @generated
   */
  public Adapter createnNacYInerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nGenIner <em>nGen Iner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nGenIner
   * @generated
   */
  public Adapter createnGenInerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nHubIner <em>nHub Iner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nHubIner
   * @generated
   */
  public Adapter createnHubInerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nGBoxEff <em>nG Box Eff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nGBoxEff
   * @generated
   */
  public Adapter createnGBoxEffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nGenEff <em>nGen Eff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nGenEff
   * @generated
   */
  public Adapter createnGenEffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nGBRatio <em>nGB Ratio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nGBRatio
   * @generated
   */
  public Adapter createnGBRatioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bGBRevers <em>bGB Revers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bGBRevers
   * @generated
   */
  public Adapter createbGBReversAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nHSSBrTqF <em>nHSS Br Tq F</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nHSSBrTqF
   * @generated
   */
  public Adapter createnHSSBrTqFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nHSSBrDT <em>nHSS Br DT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nHSSBrDT
   * @generated
   */
  public Adapter createnHSSBrDTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fDynBrkFi <em>fDyn Brk Fi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fDynBrkFi
   * @generated
   */
  public Adapter createfDynBrkFiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nDTTorSpr <em>nDT Tor Spr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nDTTorSpr
   * @generated
   */
  public Adapter createnDTTorSprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nDTTorDmp <em>nDT Tor Dmp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nDTTorDmp
   * @generated
   */
  public Adapter createnDTTorDmpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nSIG_SlPc <em>nSIG Sl Pc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nSIG_SlPc
   * @generated
   */
  public Adapter createnSIG_SlPcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nSIG_SySp <em>nSIG Sy Sp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nSIG_SySp
   * @generated
   */
  public Adapter createnSIG_SySpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nSIG_RtTq <em>nSIG Rt Tq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nSIG_RtTq
   * @generated
   */
  public Adapter createnSIG_RtTqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nSIG_PORt <em>nSIG PO Rt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nSIG_PORt
   * @generated
   */
  public Adapter createnSIG_PORtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTEC_Freq <em>nTEC Freq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Freq
   * @generated
   */
  public Adapter createnTEC_FreqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTEC_Npol <em>nTEC Npol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Npol
   * @generated
   */
  public Adapter createnTEC_NpolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTEC_Sres <em>nTEC Sres</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Sres
   * @generated
   */
  public Adapter createnTEC_SresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTEC_Rres <em>nTEC Rres</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTEC_Rres
   * @generated
   */
  public Adapter createnTEC_RresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTEC_VLL <em>nTEC VLL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTEC_VLL
   * @generated
   */
  public Adapter createnTEC_VLLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTEC_SLR <em>nTEC SLR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTEC_SLR
   * @generated
   */
  public Adapter createnTEC_SLRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTEC_RLR <em>nTEC RLR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTEC_RLR
   * @generated
   */
  public Adapter createnTEC_RLRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTEC_MR <em>nTEC MR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTEC_MR
   * @generated
   */
  public Adapter createnTEC_MRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iPtfmModel <em>iPtfm Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iPtfmModel
   * @generated
   */
  public Adapter createiPtfmModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fPtfmFile <em>fPtfm File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fPtfmFile
   * @generated
   */
  public Adapter createfPtfmFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iTwrNodes <em>iTwr Nodes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iTwrNodes
   * @generated
   */
  public Adapter createiTwrNodesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fTwrFile <em>fTwr File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fTwrFile
   * @generated
   */
  public Adapter createfTwrFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nYawSpr <em>nYaw Spr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nYawSpr
   * @generated
   */
  public Adapter createnYawSprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nYawDamp <em>nYaw Damp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nYawDamp
   * @generated
   */
  public Adapter createnYawDampAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nYawNeut <em>nYaw Neut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nYawNeut
   * @generated
   */
  public Adapter createnYawNeutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bFurling <em>bFurling</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bFurling
   * @generated
   */
  public Adapter createbFurlingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fFurlFile <em>fFurl File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fFurlFile
   * @generated
   */
  public Adapter createfFurlFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iTeetMod <em>iTeet Mod</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iTeetMod
   * @generated
   */
  public Adapter createiTeetModAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTeetDmpP <em>nTeet Dmp P</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTeetDmpP
   * @generated
   */
  public Adapter createnTeetDmpPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTeetDmp <em>nTeet Dmp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTeetDmp
   * @generated
   */
  public Adapter createnTeetDmpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTeetCDmp <em>nTeet CDmp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTeetCDmp
   * @generated
   */
  public Adapter createnTeetCDmpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTeetSStP <em>nTeet SSt P</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTeetSStP
   * @generated
   */
  public Adapter createnTeetSStPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTeetHStP <em>nTeet HSt P</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTeetHStP
   * @generated
   */
  public Adapter createnTeetHStPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTeetSSSp <em>nTeet SS Sp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTeetSSSp
   * @generated
   */
  public Adapter createnTeetSSSpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTeetHSSp <em>nTeet HS Sp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTeetHSSp
   * @generated
   */
  public Adapter createnTeetHSSpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTBDrConN <em>nTB Dr Con N</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTBDrConN
   * @generated
   */
  public Adapter createnTBDrConNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTBDrConD <em>nTB Dr Con D</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTBDrConD
   * @generated
   */
  public Adapter createnTBDrConDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTpBrDT <em>nTp Br DT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTpBrDT
   * @generated
   */
  public Adapter createnTpBrDTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fBldFile_1_ <em>fBld File 1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_1_
   * @generated
   */
  public Adapter createfBldFile_1_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fBldFile_2_ <em>fBld File 2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_2_
   * @generated
   */
  public Adapter createfBldFile_2_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fBldFile_3_ <em>fBld File 3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fBldFile_3_
   * @generated
   */
  public Adapter createfBldFile_3_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fADFile <em>fAD File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fADFile
   * @generated
   */
  public Adapter createfADFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fNoiseFile <em>fNoise File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fNoiseFile
   * @generated
   */
  public Adapter createfNoiseFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fADAMSFile <em>fADAMS File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fADAMSFile
   * @generated
   */
  public Adapter createfADAMSFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.fLinFile <em>fLin File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.fLinFile
   * @generated
   */
  public Adapter createfLinFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bSumPrint <em>bSum Print</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bSumPrint
   * @generated
   */
  public Adapter createbSumPrintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bOutFileFmt <em>bOut File Fmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bOutFileFmt
   * @generated
   */
  public Adapter createbOutFileFmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.bTabDelim <em>bTab Delim</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.bTabDelim
   * @generated
   */
  public Adapter createbTabDelimAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.sOutFmt <em>sOut Fmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.sOutFmt
   * @generated
   */
  public Adapter createsOutFmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nTStart <em>nT Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nTStart
   * @generated
   */
  public Adapter createnTStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iDecFact <em>iDec Fact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iDecFact
   * @generated
   */
  public Adapter createiDecFactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nSttsTime <em>nStts Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nSttsTime
   * @generated
   */
  public Adapter createnSttsTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNcIMUxn <em>nNc IM Uxn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUxn
   * @generated
   */
  public Adapter createnNcIMUxnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNcIMUyn <em>nNc IM Uyn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUyn
   * @generated
   */
  public Adapter createnNcIMUynAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nNcIMUzn <em>nNc IM Uzn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nNcIMUzn
   * @generated
   */
  public Adapter createnNcIMUznAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.nShftGagL <em>nShft Gag L</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.nShftGagL
   * @generated
   */
  public Adapter createnShftGagLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iNTwGages <em>iN Tw Gages</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iNTwGages
   * @generated
   */
  public Adapter createiNTwGagesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.aTwrGagNd <em>aTwr Gag Nd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.aTwrGagNd
   * @generated
   */
  public Adapter createaTwrGagNdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.iNBlGages <em>iN Bl Gages</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.iNBlGages
   * @generated
   */
  public Adapter createiNBlGagesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.aBldGagNd <em>aBld Gag Nd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.aBldGagNd
   * @generated
   */
  public Adapter createaBldGagNdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastfst.vOutList <em>vOut List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastfst.vOutList
   * @generated
   */
  public Adapter createvOutListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FastfstAdapterFactory
