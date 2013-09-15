/**
 */
package sc.ndt.editor.fast.fastfst.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sc.ndt.editor.fast.fastfst.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.fast.fastfst.FastfstPackage
 * @generated
 */
public class FastfstSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FastfstPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastfstSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FastfstPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FastfstPackage.MODEL_FASTFST:
      {
        ModelFastfst modelFastfst = (ModelFastfst)theEObject;
        T result = caseModelFastfst(modelFastfst);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BECHO:
      {
        bEcho bEcho = (bEcho)theEObject;
        T result = casebEcho(bEcho);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IADAMS_PREP:
      {
        iADAMSPrep iADAMSPrep = (iADAMSPrep)theEObject;
        T result = caseiADAMSPrep(iADAMSPrep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IANAL_MODE:
      {
        iAnalMode iAnalMode = (iAnalMode)theEObject;
        T result = caseiAnalMode(iAnalMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.INUM_BL:
      {
        iNumBl iNumBl = (iNumBl)theEObject;
        T result = caseiNumBl(iNumBl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_MAX:
      {
        nTMax nTMax = (nTMax)theEObject;
        T result = casenTMax(nTMax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NDT:
      {
        nDT nDT = (nDT)theEObject;
        T result = casenDT(nDT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IYC_MODE:
      {
        iYCMode iYCMode = (iYCMode)theEObject;
        T result = caseiYCMode(iYCMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTYC_ON:
      {
        nTYCOn nTYCOn = (nTYCOn)theEObject;
        T result = casenTYCOn(nTYCOn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IPC_MODE:
      {
        iPCMode iPCMode = (iPCMode)theEObject;
        T result = caseiPCMode(iPCMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTPC_ON:
      {
        nTPCOn nTPCOn = (nTPCOn)theEObject;
        T result = casenTPCOn(nTPCOn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IVS_CONTRL:
      {
        iVSContrl iVSContrl = (iVSContrl)theEObject;
        T result = caseiVSContrl(iVSContrl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NVS_RT_GN_SP:
      {
        nVS_RtGnSp nVS_RtGnSp = (nVS_RtGnSp)theEObject;
        T result = casenVS_RtGnSp(nVS_RtGnSp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NVS_RT_TQ:
      {
        nVS_RtTq nVS_RtTq = (nVS_RtTq)theEObject;
        T result = casenVS_RtTq(nVS_RtTq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NVS_RGN2_K:
      {
        nVS_Rgn2K nVS_Rgn2K = (nVS_Rgn2K)theEObject;
        T result = casenVS_Rgn2K(nVS_Rgn2K);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NVS_SL_PC:
      {
        nVS_SlPc nVS_SlPc = (nVS_SlPc)theEObject;
        T result = casenVS_SlPc(nVS_SlPc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IGEN_MODEL:
      {
        iGenModel iGenModel = (iGenModel)theEObject;
        T result = caseiGenModel(iGenModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BGEN_TI_STR:
      {
        bGenTiStr bGenTiStr = (bGenTiStr)theEObject;
        T result = casebGenTiStr(bGenTiStr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BGEN_TI_STP:
      {
        bGenTiStp bGenTiStp = (bGenTiStp)theEObject;
        T result = casebGenTiStp(bGenTiStp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NSPD_GEN_ON:
      {
        nSpdGenOn nSpdGenOn = (nSpdGenOn)theEObject;
        T result = casenSpdGenOn(nSpdGenOn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTIM_GEN_ON:
      {
        nTimGenOn nTimGenOn = (nTimGenOn)theEObject;
        T result = casenTimGenOn(nTimGenOn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTIM_GEN_OF:
      {
        nTimGenOf nTimGenOf = (nTimGenOf)theEObject;
        T result = casenTimGenOf(nTimGenOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IHSS_BR_MODE:
      {
        iHSSBrMode iHSSBrMode = (iHSSBrMode)theEObject;
        T result = caseiHSSBrMode(iHSSBrMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTHSS_BR_DP:
      {
        nTHSSBrDp nTHSSBrDp = (nTHSSBrDp)theEObject;
        T result = casenTHSSBrDp(nTHSSBrDp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTI_DYN_BRK:
      {
        nTiDynBrk nTiDynBrk = (nTiDynBrk)theEObject;
        T result = casenTiDynBrk(nTiDynBrk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_TP_BR_DP_1:
      {
        nTTpBrDp_1_ nTTpBrDp_1_ = (nTTpBrDp_1_)theEObject;
        T result = casenTTpBrDp_1_(nTTpBrDp_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_TP_BR_DP_2:
      {
        nTTpBrDp_2_ nTTpBrDp_2_ = (nTTpBrDp_2_)theEObject;
        T result = casenTTpBrDp_2_(nTTpBrDp_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_TP_BR_DP_3:
      {
        nTTpBrDp_3_ nTTpBrDp_3_ = (nTTpBrDp_3_)theEObject;
        T result = casenTTpBrDp_3_(nTTpBrDp_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTB_DEP_ISP_1:
      {
        nTBDepISp_1_ nTBDepISp_1_ = (nTBDepISp_1_)theEObject;
        T result = casenTBDepISp_1_(nTBDepISp_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTB_DEP_ISP_2:
      {
        nTBDepISp_2_ nTBDepISp_2_ = (nTBDepISp_2_)theEObject;
        T result = casenTBDepISp_2_(nTBDepISp_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTB_DEP_ISP_3:
      {
        nTBDepISp_3_ nTBDepISp_3_ = (nTBDepISp_3_)theEObject;
        T result = casenTBDepISp_3_(nTBDepISp_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_YAW_MAN_S:
      {
        nTYawManS nTYawManS = (nTYawManS)theEObject;
        T result = casenTYawManS(nTYawManS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_YAW_MAN_E:
      {
        nTYawManE nTYawManE = (nTYawManE)theEObject;
        T result = casenTYawManE(nTYawManE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNAC_YAW_F:
      {
        nNacYawF nNacYawF = (nNacYawF)theEObject;
        T result = casenNacYawF(nNacYawF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_PIT_MAN_S1:
      {
        nTPitManS_1_ nTPitManS_1_ = (nTPitManS_1_)theEObject;
        T result = casenTPitManS_1_(nTPitManS_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_PIT_MAN_S2:
      {
        nTPitManS_2_ nTPitManS_2_ = (nTPitManS_2_)theEObject;
        T result = casenTPitManS_2_(nTPitManS_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_PIT_MAN_S3:
      {
        nTPitManS_3_ nTPitManS_3_ = (nTPitManS_3_)theEObject;
        T result = casenTPitManS_3_(nTPitManS_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_PIT_MAN_E1:
      {
        nTPitManE_1_ nTPitManE_1_ = (nTPitManE_1_)theEObject;
        T result = casenTPitManE_1_(nTPitManE_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_PIT_MAN_E2:
      {
        nTPitManE_2_ nTPitManE_2_ = (nTPitManE_2_)theEObject;
        T result = casenTPitManE_2_(nTPitManE_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_PIT_MAN_E3:
      {
        nTPitManE_3_ nTPitManE_3_ = (nTPitManE_3_)theEObject;
        T result = casenTPitManE_3_(nTPitManE_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NBL_PITCH_1:
      {
        nBlPitch_1_ nBlPitch_1_ = (nBlPitch_1_)theEObject;
        T result = casenBlPitch_1_(nBlPitch_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NBL_PITCH_2:
      {
        nBlPitch_2_ nBlPitch_2_ = (nBlPitch_2_)theEObject;
        T result = casenBlPitch_2_(nBlPitch_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NBL_PITCH_3:
      {
        nBlPitch_3_ nBlPitch_3_ = (nBlPitch_3_)theEObject;
        T result = casenBlPitch_3_(nBlPitch_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NBL_PITCH_F1:
      {
        nBlPitchF_1_ nBlPitchF_1_ = (nBlPitchF_1_)theEObject;
        T result = casenBlPitchF_1_(nBlPitchF_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NBL_PITCH_F2:
      {
        nBlPitchF_2_ nBlPitchF_2_ = (nBlPitchF_2_)theEObject;
        T result = casenBlPitchF_2_(nBlPitchF_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NBL_PITCH_F3:
      {
        nBlPitchF_3_ nBlPitchF_3_ = (nBlPitchF_3_)theEObject;
        T result = casenBlPitchF_3_(nBlPitchF_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NGRAVITY:
      {
        nGravity nGravity = (nGravity)theEObject;
        T result = casenGravity(nGravity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BFLAP_DOF1:
      {
        bFlapDOF1 bFlapDOF1 = (bFlapDOF1)theEObject;
        T result = casebFlapDOF1(bFlapDOF1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BFLAP_DOF2:
      {
        bFlapDOF2 bFlapDOF2 = (bFlapDOF2)theEObject;
        T result = casebFlapDOF2(bFlapDOF2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BEDGE_DOF:
      {
        bEdgeDOF bEdgeDOF = (bEdgeDOF)theEObject;
        T result = casebEdgeDOF(bEdgeDOF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BTEET_DOF:
      {
        bTeetDOF bTeetDOF = (bTeetDOF)theEObject;
        T result = casebTeetDOF(bTeetDOF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BDR_TR_DOF:
      {
        bDrTrDOF bDrTrDOF = (bDrTrDOF)theEObject;
        T result = casebDrTrDOF(bDrTrDOF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BGEN_DOF:
      {
        bGenDOF bGenDOF = (bGenDOF)theEObject;
        T result = casebGenDOF(bGenDOF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BYAW_DOF:
      {
        bYawDOF bYawDOF = (bYawDOF)theEObject;
        T result = casebYawDOF(bYawDOF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BTW_FADOF1:
      {
        bTwFADOF1 bTwFADOF1 = (bTwFADOF1)theEObject;
        T result = casebTwFADOF1(bTwFADOF1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BTW_FADOF2:
      {
        bTwFADOF2 bTwFADOF2 = (bTwFADOF2)theEObject;
        T result = casebTwFADOF2(bTwFADOF2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BTW_SSDOF1:
      {
        bTwSSDOF1 bTwSSDOF1 = (bTwSSDOF1)theEObject;
        T result = casebTwSSDOF1(bTwSSDOF1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BTW_SSDOF2:
      {
        bTwSSDOF2 bTwSSDOF2 = (bTwSSDOF2)theEObject;
        T result = casebTwSSDOF2(bTwSSDOF2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BCOMP_AERO:
      {
        bCompAero bCompAero = (bCompAero)theEObject;
        T result = casebCompAero(bCompAero);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BCOMP_NOISE:
      {
        bCompNoise bCompNoise = (bCompNoise)theEObject;
        T result = casebCompNoise(bCompNoise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NOO_PDEFL:
      {
        nOoPDefl nOoPDefl = (nOoPDefl)theEObject;
        T result = casenOoPDefl(nOoPDefl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NIP_DEFL:
      {
        nIPDefl nIPDefl = (nIPDefl)theEObject;
        T result = casenIPDefl(nIPDefl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEET_DEFL:
      {
        nTeetDefl nTeetDefl = (nTeetDefl)theEObject;
        T result = casenTeetDefl(nTeetDefl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NAZIMUTH:
      {
        nAzimuth nAzimuth = (nAzimuth)theEObject;
        T result = casenAzimuth(nAzimuth);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NROT_SPEED:
      {
        nRotSpeed nRotSpeed = (nRotSpeed)theEObject;
        T result = casenRotSpeed(nRotSpeed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNAC_YAW:
      {
        nNacYaw nNacYaw = (nNacYaw)theEObject;
        T result = casenNacYaw(nNacYaw);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTT_DSP_FA:
      {
        nTTDspFA nTTDspFA = (nTTDspFA)theEObject;
        T result = casenTTDspFA(nTTDspFA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTT_DSP_SS:
      {
        nTTDspSS nTTDspSS = (nTTDspSS)theEObject;
        T result = casenTTDspSS(nTTDspSS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTIP_RAD:
      {
        nTipRad nTipRad = (nTipRad)theEObject;
        T result = casenTipRad(nTipRad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NHUB_RAD:
      {
        nHubRad nHubRad = (nHubRad)theEObject;
        T result = casenHubRad(nHubRad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NP_SPN_EL_N:
      {
        nPSpnElN nPSpnElN = (nPSpnElN)theEObject;
        T result = casenPSpnElN(nPSpnElN);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NUND_SLING:
      {
        nUndSling nUndSling = (nUndSling)theEObject;
        T result = casenUndSling(nUndSling);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NHUB_CM:
      {
        nHubCM nHubCM = (nHubCM)theEObject;
        T result = casenHubCM(nHubCM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NOVER_HANG:
      {
        nOverHang nOverHang = (nOverHang)theEObject;
        T result = casenOverHang(nOverHang);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNAC_CMXN:
      {
        nNacCMxn nNacCMxn = (nNacCMxn)theEObject;
        T result = casenNacCMxn(nNacCMxn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNAC_CMYN:
      {
        nNacCMyn nNacCMyn = (nNacCMyn)theEObject;
        T result = casenNacCMyn(nNacCMyn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNAC_CMZN:
      {
        nNacCMzn nNacCMzn = (nNacCMzn)theEObject;
        T result = casenNacCMzn(nNacCMzn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTOWER_HT:
      {
        nTowerHt nTowerHt = (nTowerHt)theEObject;
        T result = casenTowerHt(nTowerHt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTWR2_SHFT:
      {
        nTwr2Shft nTwr2Shft = (nTwr2Shft)theEObject;
        T result = casenTwr2Shft(nTwr2Shft);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTWR_RB_HT:
      {
        nTwrRBHt nTwrRBHt = (nTwrRBHt)theEObject;
        T result = casenTwrRBHt(nTwrRBHt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NSHFT_TILT:
      {
        nShftTilt nShftTilt = (nShftTilt)theEObject;
        T result = casenShftTilt(nShftTilt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NDELTA3:
      {
        nDelta3 nDelta3 = (nDelta3)theEObject;
        T result = casenDelta3(nDelta3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NPRE_CONE_1:
      {
        nPreCone_1_ nPreCone_1_ = (nPreCone_1_)theEObject;
        T result = casenPreCone_1_(nPreCone_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NPRE_CONE_2:
      {
        nPreCone_2_ nPreCone_2_ = (nPreCone_2_)theEObject;
        T result = casenPreCone_2_(nPreCone_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NPRE_CONE_3:
      {
        nPreCone_3_ nPreCone_3_ = (nPreCone_3_)theEObject;
        T result = casenPreCone_3_(nPreCone_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NAZIM_B1_UP:
      {
        nAzimB1Up nAzimB1Up = (nAzimB1Up)theEObject;
        T result = casenAzimB1Up(nAzimB1Up);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NYAW_BR_MASS:
      {
        nYawBrMass nYawBrMass = (nYawBrMass)theEObject;
        T result = casenYawBrMass(nYawBrMass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNAC_MASS:
      {
        nNacMass nNacMass = (nNacMass)theEObject;
        T result = casenNacMass(nNacMass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NHUB_MASS:
      {
        nHubMass nHubMass = (nHubMass)theEObject;
        T result = casenHubMass(nHubMass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTIP_MASS_1:
      {
        nTipMass_1_ nTipMass_1_ = (nTipMass_1_)theEObject;
        T result = casenTipMass_1_(nTipMass_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTIP_MASS_2:
      {
        nTipMass_2_ nTipMass_2_ = (nTipMass_2_)theEObject;
        T result = casenTipMass_2_(nTipMass_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTIP_MASS_3:
      {
        nTipMass_3_ nTipMass_3_ = (nTipMass_3_)theEObject;
        T result = casenTipMass_3_(nTipMass_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNAC_YINER:
      {
        nNacYIner nNacYIner = (nNacYIner)theEObject;
        T result = casenNacYIner(nNacYIner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NGEN_INER:
      {
        nGenIner nGenIner = (nGenIner)theEObject;
        T result = casenGenIner(nGenIner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NHUB_INER:
      {
        nHubIner nHubIner = (nHubIner)theEObject;
        T result = casenHubIner(nHubIner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NG_BOX_EFF:
      {
        nGBoxEff nGBoxEff = (nGBoxEff)theEObject;
        T result = casenGBoxEff(nGBoxEff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NGEN_EFF:
      {
        nGenEff nGenEff = (nGenEff)theEObject;
        T result = casenGenEff(nGenEff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NGB_RATIO:
      {
        nGBRatio nGBRatio = (nGBRatio)theEObject;
        T result = casenGBRatio(nGBRatio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BGB_REVERS:
      {
        bGBRevers bGBRevers = (bGBRevers)theEObject;
        T result = casebGBRevers(bGBRevers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NHSS_BR_TQ_F:
      {
        nHSSBrTqF nHSSBrTqF = (nHSSBrTqF)theEObject;
        T result = casenHSSBrTqF(nHSSBrTqF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NHSS_BR_DT:
      {
        nHSSBrDT nHSSBrDT = (nHSSBrDT)theEObject;
        T result = casenHSSBrDT(nHSSBrDT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FDYN_BRK_FI:
      {
        fDynBrkFi fDynBrkFi = (fDynBrkFi)theEObject;
        T result = casefDynBrkFi(fDynBrkFi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NDT_TOR_SPR:
      {
        nDTTorSpr nDTTorSpr = (nDTTorSpr)theEObject;
        T result = casenDTTorSpr(nDTTorSpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NDT_TOR_DMP:
      {
        nDTTorDmp nDTTorDmp = (nDTTorDmp)theEObject;
        T result = casenDTTorDmp(nDTTorDmp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NSIG_SL_PC:
      {
        nSIG_SlPc nSIG_SlPc = (nSIG_SlPc)theEObject;
        T result = casenSIG_SlPc(nSIG_SlPc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NSIG_SY_SP:
      {
        nSIG_SySp nSIG_SySp = (nSIG_SySp)theEObject;
        T result = casenSIG_SySp(nSIG_SySp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NSIG_RT_TQ:
      {
        nSIG_RtTq nSIG_RtTq = (nSIG_RtTq)theEObject;
        T result = casenSIG_RtTq(nSIG_RtTq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NSIG_PO_RT:
      {
        nSIG_PORt nSIG_PORt = (nSIG_PORt)theEObject;
        T result = casenSIG_PORt(nSIG_PORt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEC_FREQ:
      {
        nTEC_Freq nTEC_Freq = (nTEC_Freq)theEObject;
        T result = casenTEC_Freq(nTEC_Freq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEC_NPOL:
      {
        nTEC_Npol nTEC_Npol = (nTEC_Npol)theEObject;
        T result = casenTEC_Npol(nTEC_Npol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEC_SRES:
      {
        nTEC_Sres nTEC_Sres = (nTEC_Sres)theEObject;
        T result = casenTEC_Sres(nTEC_Sres);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEC_RRES:
      {
        nTEC_Rres nTEC_Rres = (nTEC_Rres)theEObject;
        T result = casenTEC_Rres(nTEC_Rres);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEC_VLL:
      {
        nTEC_VLL nTEC_VLL = (nTEC_VLL)theEObject;
        T result = casenTEC_VLL(nTEC_VLL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEC_SLR:
      {
        nTEC_SLR nTEC_SLR = (nTEC_SLR)theEObject;
        T result = casenTEC_SLR(nTEC_SLR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEC_RLR:
      {
        nTEC_RLR nTEC_RLR = (nTEC_RLR)theEObject;
        T result = casenTEC_RLR(nTEC_RLR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEC_MR:
      {
        nTEC_MR nTEC_MR = (nTEC_MR)theEObject;
        T result = casenTEC_MR(nTEC_MR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IPTFM_MODEL:
      {
        iPtfmModel iPtfmModel = (iPtfmModel)theEObject;
        T result = caseiPtfmModel(iPtfmModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FPTFM_FILE:
      {
        fPtfmFile fPtfmFile = (fPtfmFile)theEObject;
        T result = casefPtfmFile(fPtfmFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.ITWR_NODES:
      {
        iTwrNodes iTwrNodes = (iTwrNodes)theEObject;
        T result = caseiTwrNodes(iTwrNodes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FTWR_FILE:
      {
        fTwrFile fTwrFile = (fTwrFile)theEObject;
        T result = casefTwrFile(fTwrFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NYAW_SPR:
      {
        nYawSpr nYawSpr = (nYawSpr)theEObject;
        T result = casenYawSpr(nYawSpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NYAW_DAMP:
      {
        nYawDamp nYawDamp = (nYawDamp)theEObject;
        T result = casenYawDamp(nYawDamp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NYAW_NEUT:
      {
        nYawNeut nYawNeut = (nYawNeut)theEObject;
        T result = casenYawNeut(nYawNeut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BFURLING:
      {
        bFurling bFurling = (bFurling)theEObject;
        T result = casebFurling(bFurling);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FFURL_FILE:
      {
        fFurlFile fFurlFile = (fFurlFile)theEObject;
        T result = casefFurlFile(fFurlFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.ITEET_MOD:
      {
        iTeetMod iTeetMod = (iTeetMod)theEObject;
        T result = caseiTeetMod(iTeetMod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEET_DMP_P:
      {
        nTeetDmpP nTeetDmpP = (nTeetDmpP)theEObject;
        T result = casenTeetDmpP(nTeetDmpP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEET_DMP:
      {
        nTeetDmp nTeetDmp = (nTeetDmp)theEObject;
        T result = casenTeetDmp(nTeetDmp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEET_CDMP:
      {
        nTeetCDmp nTeetCDmp = (nTeetCDmp)theEObject;
        T result = casenTeetCDmp(nTeetCDmp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEET_SST_P:
      {
        nTeetSStP nTeetSStP = (nTeetSStP)theEObject;
        T result = casenTeetSStP(nTeetSStP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEET_HST_P:
      {
        nTeetHStP nTeetHStP = (nTeetHStP)theEObject;
        T result = casenTeetHStP(nTeetHStP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEET_SS_SP:
      {
        nTeetSSSp nTeetSSSp = (nTeetSSSp)theEObject;
        T result = casenTeetSSSp(nTeetSSSp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTEET_HS_SP:
      {
        nTeetHSSp nTeetHSSp = (nTeetHSSp)theEObject;
        T result = casenTeetHSSp(nTeetHSSp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTB_DR_CON_N:
      {
        nTBDrConN nTBDrConN = (nTBDrConN)theEObject;
        T result = casenTBDrConN(nTBDrConN);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTB_DR_CON_D:
      {
        nTBDrConD nTBDrConD = (nTBDrConD)theEObject;
        T result = casenTBDrConD(nTBDrConD);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NTP_BR_DT:
      {
        nTpBrDT nTpBrDT = (nTpBrDT)theEObject;
        T result = casenTpBrDT(nTpBrDT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FBLD_FILE_1:
      {
        fBldFile_1_ fBldFile_1_ = (fBldFile_1_)theEObject;
        T result = casefBldFile_1_(fBldFile_1_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FBLD_FILE_2:
      {
        fBldFile_2_ fBldFile_2_ = (fBldFile_2_)theEObject;
        T result = casefBldFile_2_(fBldFile_2_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FBLD_FILE_3:
      {
        fBldFile_3_ fBldFile_3_ = (fBldFile_3_)theEObject;
        T result = casefBldFile_3_(fBldFile_3_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FAD_FILE:
      {
        fADFile fADFile = (fADFile)theEObject;
        T result = casefADFile(fADFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FNOISE_FILE:
      {
        fNoiseFile fNoiseFile = (fNoiseFile)theEObject;
        T result = casefNoiseFile(fNoiseFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FADAMS_FILE:
      {
        fADAMSFile fADAMSFile = (fADAMSFile)theEObject;
        T result = casefADAMSFile(fADAMSFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.FLIN_FILE:
      {
        fLinFile fLinFile = (fLinFile)theEObject;
        T result = casefLinFile(fLinFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BSUM_PRINT:
      {
        bSumPrint bSumPrint = (bSumPrint)theEObject;
        T result = casebSumPrint(bSumPrint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BOUT_FILE_FMT:
      {
        bOutFileFmt bOutFileFmt = (bOutFileFmt)theEObject;
        T result = casebOutFileFmt(bOutFileFmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.BTAB_DELIM:
      {
        bTabDelim bTabDelim = (bTabDelim)theEObject;
        T result = casebTabDelim(bTabDelim);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.SOUT_FMT:
      {
        sOutFmt sOutFmt = (sOutFmt)theEObject;
        T result = casesOutFmt(sOutFmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NT_START:
      {
        nTStart nTStart = (nTStart)theEObject;
        T result = casenTStart(nTStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IDEC_FACT:
      {
        iDecFact iDecFact = (iDecFact)theEObject;
        T result = caseiDecFact(iDecFact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NSTTS_TIME:
      {
        nSttsTime nSttsTime = (nSttsTime)theEObject;
        T result = casenSttsTime(nSttsTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNC_IM_UXN:
      {
        nNcIMUxn nNcIMUxn = (nNcIMUxn)theEObject;
        T result = casenNcIMUxn(nNcIMUxn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNC_IM_UYN:
      {
        nNcIMUyn nNcIMUyn = (nNcIMUyn)theEObject;
        T result = casenNcIMUyn(nNcIMUyn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NNC_IM_UZN:
      {
        nNcIMUzn nNcIMUzn = (nNcIMUzn)theEObject;
        T result = casenNcIMUzn(nNcIMUzn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.NSHFT_GAG_L:
      {
        nShftGagL nShftGagL = (nShftGagL)theEObject;
        T result = casenShftGagL(nShftGagL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IN_TW_GAGES:
      {
        iNTwGages iNTwGages = (iNTwGages)theEObject;
        T result = caseiNTwGages(iNTwGages);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.ATWR_GAG_ND:
      {
        aTwrGagNd aTwrGagNd = (aTwrGagNd)theEObject;
        T result = caseaTwrGagNd(aTwrGagNd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.IN_BL_GAGES:
      {
        iNBlGages iNBlGages = (iNBlGages)theEObject;
        T result = caseiNBlGages(iNBlGages);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.ABLD_GAG_ND:
      {
        aBldGagNd aBldGagNd = (aBldGagNd)theEObject;
        T result = caseaBldGagNd(aBldGagNd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastfstPackage.VOUT_LIST:
      {
        vOutList vOutList = (vOutList)theEObject;
        T result = casevOutList(vOutList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Fastfst</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Fastfst</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelFastfst(ModelFastfst object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeader(Header object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bEcho</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bEcho</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebEcho(bEcho object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iADAMS Prep</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iADAMS Prep</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiADAMSPrep(iADAMSPrep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iAnal Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iAnal Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiAnalMode(iAnalMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iNum Bl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iNum Bl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiNumBl(iNumBl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Max</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Max</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTMax(nTMax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nDT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nDT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenDT(nDT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iYC Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iYC Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiYCMode(iYCMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTYC On</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTYC On</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTYCOn(nTYCOn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iPC Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iPC Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiPCMode(iPCMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTPC On</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTPC On</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTPCOn(nTPCOn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iVS Contrl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iVS Contrl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiVSContrl(iVSContrl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nVS Rt Gn Sp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nVS Rt Gn Sp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenVS_RtGnSp(nVS_RtGnSp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nVS Rt Tq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nVS Rt Tq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenVS_RtTq(nVS_RtTq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nVS Rgn2 K</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nVS Rgn2 K</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenVS_Rgn2K(nVS_Rgn2K object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nVS Sl Pc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nVS Sl Pc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenVS_SlPc(nVS_SlPc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iGen Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iGen Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiGenModel(iGenModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bGen Ti Str</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bGen Ti Str</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebGenTiStr(bGenTiStr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bGen Ti Stp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bGen Ti Stp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebGenTiStp(bGenTiStp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSpd Gen On</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSpd Gen On</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSpdGenOn(nSpdGenOn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTim Gen On</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTim Gen On</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTimGenOn(nTimGenOn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTim Gen Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTim Gen Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTimGenOf(nTimGenOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iHSS Br Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iHSS Br Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiHSSBrMode(iHSSBrMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTHSS Br Dp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTHSS Br Dp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTHSSBrDp(nTHSSBrDp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTi Dyn Brk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTi Dyn Brk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTiDynBrk(nTiDynBrk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Tp Br Dp 1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Tp Br Dp 1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTTpBrDp_1_(nTTpBrDp_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Tp Br Dp 2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Tp Br Dp 2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTTpBrDp_2_(nTTpBrDp_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Tp Br Dp 3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Tp Br Dp 3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTTpBrDp_3_(nTTpBrDp_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTB Dep ISp 1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTB Dep ISp 1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTBDepISp_1_(nTBDepISp_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTB Dep ISp 2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTB Dep ISp 2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTBDepISp_2_(nTBDepISp_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTB Dep ISp 3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTB Dep ISp 3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTBDepISp_3_(nTBDepISp_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Yaw Man S</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Yaw Man S</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTYawManS(nTYawManS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Yaw Man E</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Yaw Man E</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTYawManE(nTYawManE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNac Yaw F</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNac Yaw F</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNacYawF(nNacYawF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Pit Man S1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Pit Man S1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTPitManS_1_(nTPitManS_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Pit Man S2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Pit Man S2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTPitManS_2_(nTPitManS_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Pit Man S3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Pit Man S3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTPitManS_3_(nTPitManS_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Pit Man E1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Pit Man E1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTPitManE_1_(nTPitManE_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Pit Man E2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Pit Man E2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTPitManE_2_(nTPitManE_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Pit Man E3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Pit Man E3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTPitManE_3_(nTPitManE_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBl Pitch 1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBl Pitch 1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBlPitch_1_(nBlPitch_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBl Pitch 2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBl Pitch 2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBlPitch_2_(nBlPitch_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBl Pitch 3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBl Pitch 3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBlPitch_3_(nBlPitch_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBl Pitch F1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBl Pitch F1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBlPitchF_1_(nBlPitchF_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBl Pitch F2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBl Pitch F2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBlPitchF_2_(nBlPitchF_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBl Pitch F3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBl Pitch F3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBlPitchF_3_(nBlPitchF_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nGravity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nGravity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenGravity(nGravity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bFlap DOF1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bFlap DOF1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebFlapDOF1(bFlapDOF1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bFlap DOF2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bFlap DOF2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebFlapDOF2(bFlapDOF2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bEdge DOF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bEdge DOF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebEdgeDOF(bEdgeDOF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTeet DOF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTeet DOF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTeetDOF(bTeetDOF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bDr Tr DOF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bDr Tr DOF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebDrTrDOF(bDrTrDOF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bGen DOF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bGen DOF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebGenDOF(bGenDOF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bYaw DOF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bYaw DOF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebYawDOF(bYawDOF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTw FADOF1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTw FADOF1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTwFADOF1(bTwFADOF1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTw FADOF2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTw FADOF2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTwFADOF2(bTwFADOF2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTw SSDOF1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTw SSDOF1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTwSSDOF1(bTwSSDOF1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTw SSDOF2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTw SSDOF2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTwSSDOF2(bTwSSDOF2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bComp Aero</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bComp Aero</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebCompAero(bCompAero object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bComp Noise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bComp Noise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebCompNoise(bCompNoise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nOo PDefl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nOo PDefl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenOoPDefl(nOoPDefl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nIP Defl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nIP Defl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIPDefl(nIPDefl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTeet Defl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTeet Defl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTeetDefl(nTeetDefl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nAzimuth</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nAzimuth</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenAzimuth(nAzimuth object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRot Speed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRot Speed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRotSpeed(nRotSpeed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNac Yaw</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNac Yaw</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNacYaw(nNacYaw object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTT Dsp FA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTT Dsp FA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTTDspFA(nTTDspFA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTT Dsp SS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTT Dsp SS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTTDspSS(nTTDspSS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTip Rad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTip Rad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTipRad(nTipRad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHub Rad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHub Rad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHubRad(nHubRad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nP Spn El N</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nP Spn El N</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPSpnElN(nPSpnElN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nUnd Sling</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nUnd Sling</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenUndSling(nUndSling object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHub CM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHub CM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHubCM(nHubCM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nOver Hang</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nOver Hang</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenOverHang(nOverHang object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNac CMxn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNac CMxn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNacCMxn(nNacCMxn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNac CMyn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNac CMyn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNacCMyn(nNacCMyn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNac CMzn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNac CMzn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNacCMzn(nNacCMzn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTower Ht</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTower Ht</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTowerHt(nTowerHt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTwr2 Shft</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTwr2 Shft</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwr2Shft(nTwr2Shft object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTwr RB Ht</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTwr RB Ht</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwrRBHt(nTwrRBHt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nShft Tilt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nShft Tilt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenShftTilt(nShftTilt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nDelta3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nDelta3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenDelta3(nDelta3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nPre Cone 1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nPre Cone 1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPreCone_1_(nPreCone_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nPre Cone 2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nPre Cone 2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPreCone_2_(nPreCone_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nPre Cone 3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nPre Cone 3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPreCone_3_(nPreCone_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nAzim B1 Up</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nAzim B1 Up</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenAzimB1Up(nAzimB1Up object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nYaw Br Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nYaw Br Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenYawBrMass(nYawBrMass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNac Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNac Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNacMass(nNacMass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHub Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHub Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHubMass(nHubMass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTip Mass 1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTip Mass 1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTipMass_1_(nTipMass_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTip Mass 2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTip Mass 2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTipMass_2_(nTipMass_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTip Mass 3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTip Mass 3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTipMass_3_(nTipMass_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNac YIner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNac YIner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNacYIner(nNacYIner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nGen Iner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nGen Iner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenGenIner(nGenIner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHub Iner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHub Iner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHubIner(nHubIner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nG Box Eff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nG Box Eff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenGBoxEff(nGBoxEff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nGen Eff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nGen Eff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenGenEff(nGenEff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nGB Ratio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nGB Ratio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenGBRatio(nGBRatio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bGB Revers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bGB Revers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebGBRevers(bGBRevers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHSS Br Tq F</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHSS Br Tq F</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHSSBrTqF(nHSSBrTqF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHSS Br DT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHSS Br DT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHSSBrDT(nHSSBrDT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fDyn Brk Fi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fDyn Brk Fi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefDynBrkFi(fDynBrkFi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nDT Tor Spr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nDT Tor Spr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenDTTorSpr(nDTTorSpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nDT Tor Dmp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nDT Tor Dmp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenDTTorDmp(nDTTorDmp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSIG Sl Pc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSIG Sl Pc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSIG_SlPc(nSIG_SlPc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSIG Sy Sp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSIG Sy Sp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSIG_SySp(nSIG_SySp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSIG Rt Tq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSIG Rt Tq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSIG_RtTq(nSIG_RtTq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSIG PO Rt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSIG PO Rt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSIG_PORt(nSIG_PORt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTEC Freq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTEC Freq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTEC_Freq(nTEC_Freq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTEC Npol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTEC Npol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTEC_Npol(nTEC_Npol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTEC Sres</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTEC Sres</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTEC_Sres(nTEC_Sres object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTEC Rres</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTEC Rres</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTEC_Rres(nTEC_Rres object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTEC VLL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTEC VLL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTEC_VLL(nTEC_VLL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTEC SLR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTEC SLR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTEC_SLR(nTEC_SLR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTEC RLR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTEC RLR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTEC_RLR(nTEC_RLR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTEC MR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTEC MR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTEC_MR(nTEC_MR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iPtfm Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iPtfm Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiPtfmModel(iPtfmModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fPtfm File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fPtfm File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefPtfmFile(fPtfmFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iTwr Nodes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iTwr Nodes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiTwrNodes(iTwrNodes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fTwr File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fTwr File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefTwrFile(fTwrFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nYaw Spr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nYaw Spr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenYawSpr(nYawSpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nYaw Damp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nYaw Damp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenYawDamp(nYawDamp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nYaw Neut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nYaw Neut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenYawNeut(nYawNeut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bFurling</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bFurling</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebFurling(bFurling object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fFurl File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fFurl File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefFurlFile(fFurlFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iTeet Mod</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iTeet Mod</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiTeetMod(iTeetMod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTeet Dmp P</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTeet Dmp P</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTeetDmpP(nTeetDmpP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTeet Dmp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTeet Dmp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTeetDmp(nTeetDmp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTeet CDmp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTeet CDmp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTeetCDmp(nTeetCDmp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTeet SSt P</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTeet SSt P</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTeetSStP(nTeetSStP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTeet HSt P</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTeet HSt P</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTeetHStP(nTeetHStP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTeet SS Sp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTeet SS Sp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTeetSSSp(nTeetSSSp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTeet HS Sp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTeet HS Sp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTeetHSSp(nTeetHSSp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTB Dr Con N</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTB Dr Con N</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTBDrConN(nTBDrConN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTB Dr Con D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTB Dr Con D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTBDrConD(nTBDrConD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTp Br DT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTp Br DT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTpBrDT(nTpBrDT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fBld File 1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fBld File 1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefBldFile_1_(fBldFile_1_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fBld File 2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fBld File 2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefBldFile_2_(fBldFile_2_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fBld File 3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fBld File 3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefBldFile_3_(fBldFile_3_ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fAD File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fAD File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefADFile(fADFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fNoise File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fNoise File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefNoiseFile(fNoiseFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fADAMS File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fADAMS File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefADAMSFile(fADAMSFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fLin File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fLin File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefLinFile(fLinFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bSum Print</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bSum Print</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebSumPrint(bSumPrint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bOut File Fmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bOut File Fmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebOutFileFmt(bOutFileFmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTab Delim</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTab Delim</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTabDelim(bTabDelim object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sOut Fmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sOut Fmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesOutFmt(sOutFmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTStart(nTStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iDec Fact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iDec Fact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiDecFact(iDecFact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nStts Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nStts Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSttsTime(nSttsTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNc IM Uxn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNc IM Uxn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNcIMUxn(nNcIMUxn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNc IM Uyn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNc IM Uyn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNcIMUyn(nNcIMUyn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nNc IM Uzn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNc IM Uzn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNcIMUzn(nNcIMUzn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nShft Gag L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nShft Gag L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenShftGagL(nShftGagL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iN Tw Gages</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iN Tw Gages</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiNTwGages(iNTwGages object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aTwr Gag Nd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aTwr Gag Nd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaTwrGagNd(aTwrGagNd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iN Bl Gages</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iN Bl Gages</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiNBlGages(iNBlGages object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aBld Gag Nd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aBld Gag Nd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaBldGagNd(aBldGagNd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>vOut List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>vOut List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevOutList(vOutList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FastfstSwitch
