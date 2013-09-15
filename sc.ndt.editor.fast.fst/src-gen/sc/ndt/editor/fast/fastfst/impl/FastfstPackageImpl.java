/**
 */
package sc.ndt.editor.fast.fastfst.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import sc.ndt.editor.fast.fastfst.FastfstFactory;
import sc.ndt.editor.fast.fastfst.FastfstPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FastfstPackageImpl extends EPackageImpl implements FastfstPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "fastfst.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelFastfstEClass = null;

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
  private EClass bEchoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iADAMSPrepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iAnalModeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iNumBlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTMaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nDTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iYCModeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTYCOnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iPCModeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTPCOnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iVSContrlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nVS_RtGnSpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nVS_RtTqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nVS_Rgn2KEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nVS_SlPcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iGenModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bGenTiStrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bGenTiStpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSpdGenOnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTimGenOnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTimGenOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iHSSBrModeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTHSSBrDpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTiDynBrkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTTpBrDp_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTTpBrDp_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTTpBrDp_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTBDepISp_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTBDepISp_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTBDepISp_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTYawManSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTYawManEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNacYawFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTPitManS_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTPitManS_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTPitManS_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTPitManE_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTPitManE_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTPitManE_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBlPitch_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBlPitch_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBlPitch_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBlPitchF_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBlPitchF_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBlPitchF_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nGravityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bFlapDOF1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bFlapDOF2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bEdgeDOFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTeetDOFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bDrTrDOFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bGenDOFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bYawDOFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTwFADOF1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTwFADOF2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTwSSDOF1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTwSSDOF2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bCompAeroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bCompNoiseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nOoPDeflEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIPDeflEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTeetDeflEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nAzimuthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRotSpeedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNacYawEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTTDspFAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTTDspSSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTipRadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHubRadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPSpnElNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nUndSlingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHubCMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nOverHangEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNacCMxnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNacCMynEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNacCMznEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTowerHtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwr2ShftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwrRBHtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nShftTiltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nDelta3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPreCone_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPreCone_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPreCone_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nAzimB1UpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nYawBrMassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNacMassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHubMassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTipMass_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTipMass_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTipMass_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNacYInerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nGenInerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHubInerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nGBoxEffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nGenEffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nGBRatioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bGBReversEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHSSBrTqFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHSSBrDTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fDynBrkFiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nDTTorSprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nDTTorDmpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSIG_SlPcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSIG_SySpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSIG_RtTqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSIG_PORtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTEC_FreqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTEC_NpolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTEC_SresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTEC_RresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTEC_VLLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTEC_SLREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTEC_RLREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTEC_MREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iPtfmModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fPtfmFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iTwrNodesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fTwrFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nYawSprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nYawDampEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nYawNeutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bFurlingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fFurlFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iTeetModEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTeetDmpPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTeetDmpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTeetCDmpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTeetSStPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTeetHStPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTeetSSSpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTeetHSSpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTBDrConNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTBDrConDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTpBrDTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fBldFile_1_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fBldFile_2_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fBldFile_3_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fADFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fNoiseFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fADAMSFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fLinFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bSumPrintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bOutFileFmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTabDelimEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sOutFmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iDecFactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSttsTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNcIMUxnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNcIMUynEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nNcIMUznEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nShftGagLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iNTwGagesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aTwrGagNdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iNBlGagesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aBldGagNdEClass = null;

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
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FastfstPackageImpl()
  {
    super(eNS_URI, FastfstFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link FastfstPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static FastfstPackage init()
  {
    if (isInited) return (FastfstPackage)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI);

    // Obtain or create and register package
    FastfstPackageImpl theFastfstPackage = (FastfstPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FastfstPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FastfstPackageImpl());

    isInited = true;

    // Load packages
    theFastfstPackage.loadPackage();

    // Fix loaded packages
    theFastfstPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theFastfstPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FastfstPackage.eNS_URI, theFastfstPackage);
    return theFastfstPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelFastfst()
  {
    if (modelFastfstEClass == null)
    {
      modelFastfstEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(0);
    }
    return modelFastfstEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_Head()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_Sections()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_Echo()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_ADAMSPrep()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_AnalMode()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NumBl()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TMax()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_DT()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_YCMode()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TYCOn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_PCMode()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TPCOn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_VSContrl()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_VS_RtGnSp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_VS_RtTq()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_VS_Rgn2K()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_VS_SlPc()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GenModel()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GenTiStr()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GenTiStp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_SpdGenOn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TimGenOn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TimGenOf()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_HSSBrMode()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_THSSBrDp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TiDynBrk()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TTpBrDp_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TTpBrDp_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TTpBrDp_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TBDepISp_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TBDepISp_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TBDepISp_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TYawManS()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TYawManE()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NacYawF()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TPitManS_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TPitManS_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TPitManS_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TPitManE_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TPitManE_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TPitManE_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BlPitch_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BlPitch_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BlPitch_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(43);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BlPitchF_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(44);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BlPitchF_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(45);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BlPitchF_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(46);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_Gravity()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(47);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_FlapDOF1()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(48);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_FlapDOF2()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(49);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_EdgeDOF()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(50);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetDOF()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(51);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_DrTrDOF()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(52);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GenDOF()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(53);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_YawDOF()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(54);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TwFADOF1()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(55);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TwFADOF2()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(56);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TwSSDOF1()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(57);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TwSSDOF2()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(58);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_CompAero()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(59);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_CompNoise()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(60);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_OoPDefl()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(61);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_IPDefl()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(62);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetDefl()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(63);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_Azimuth()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(64);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_RotSpeed()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(65);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NacYaw()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(66);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TTDspFA()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(67);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TTDspSS()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(68);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TipRad()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(69);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_HubRad()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(70);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_PSpnElN()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(71);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_UndSling()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(72);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_HubCM()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(73);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_OverHang()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(74);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NacCMxn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(75);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NacCMyn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(76);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NacCMzn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(77);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TowerHt()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(78);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_Twr2Shft()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(79);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TwrRBHt()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(80);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_ShftTilt()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(81);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_Delta3()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(82);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_PreCone_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(83);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_PreCone_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(84);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_PreCone_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(85);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_AzimB1Up()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(86);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_YawBrMass()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(87);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NacMass()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(88);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_HubMass()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(89);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TipMass_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(90);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TipMass_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(91);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TipMass_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(92);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NacYIner()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(93);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GenIner()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(94);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_HubIner()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(95);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GBoxEff()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(96);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GenEff()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(97);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GBRatio()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(98);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_GBRevers()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(99);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_HSSBrTqF()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(100);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_HSSBrDT()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(101);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_DynBrkFi()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(102);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_DTTorSpr()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(103);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_DTTorDmp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(104);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_SIG_SlPc()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(105);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_SIG_SySp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(106);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_SIG_RtTq()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(107);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_SIG_PORt()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(108);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TEC_Freq()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(109);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TEC_Npol()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(110);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TEC_Sres()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(111);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TEC_Rres()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(112);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TEC_VLL()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(113);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TEC_SLR()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(114);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TEC_RLR()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(115);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TEC_MR()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(116);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_PtfmModel()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(117);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_PtfmFile()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(118);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TwrNodes()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(119);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TwrFile()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(120);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_YawSpr()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(121);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_YawDamp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(122);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_YawNeut()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(123);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_Furling()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(124);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_FurlFile()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(125);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetMod()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(126);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetDmpP()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(127);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetDmp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(128);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetCDmp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(129);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetSStP()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(130);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetHStP()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(131);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetSSSp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(132);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TeetHSSp()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(133);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TBDrConN()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(134);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TBDrConD()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(135);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TpBrDT()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(136);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BldFile_1_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(137);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BldFile_2_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(138);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BldFile_3_()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(139);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_ADFile()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(140);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NoiseFile()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(141);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_ADAMSFile()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(142);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_LinFile()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(143);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_SumPrint()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(144);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_OutFileFmt()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(145);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TabDelim()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(146);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_OutFmt()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(147);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TStart()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(148);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_DecFact()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(149);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_SttsTime()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(150);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NcIMUxn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(151);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NcIMUyn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(152);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NcIMUzn()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(153);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_ShftGagL()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(154);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NTwGages()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(155);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_TwrGagNd()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(156);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_NBlGages()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(157);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_BldGagNd()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(158);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastfst_OutList()
  {
        return (EReference)getModelFastfst().getEStructuralFeatures().get(159);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader()
  {
    if (headerEClass == null)
    {
      headerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(1);
    }
    return headerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader_Rows()
  {
        return (EAttribute)getHeader().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    if (sectionEClass == null)
    {
      sectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(2);
    }
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Name()
  {
        return (EAttribute)getSection().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbEcho()
  {
    if (bEchoEClass == null)
    {
      bEchoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(3);
    }
    return bEchoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbEcho_Value()
  {
        return (EAttribute)getbEcho().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbEcho_Name()
  {
        return (EAttribute)getbEcho().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiADAMSPrep()
  {
    if (iADAMSPrepEClass == null)
    {
      iADAMSPrepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(4);
    }
    return iADAMSPrepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiADAMSPrep_Value()
  {
        return (EAttribute)getiADAMSPrep().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiADAMSPrep_Name()
  {
        return (EAttribute)getiADAMSPrep().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiAnalMode()
  {
    if (iAnalModeEClass == null)
    {
      iAnalModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(5);
    }
    return iAnalModeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiAnalMode_Value()
  {
        return (EAttribute)getiAnalMode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiAnalMode_Name()
  {
        return (EAttribute)getiAnalMode().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiNumBl()
  {
    if (iNumBlEClass == null)
    {
      iNumBlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(6);
    }
    return iNumBlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNumBl_Value()
  {
        return (EAttribute)getiNumBl().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNumBl_Name()
  {
        return (EAttribute)getiNumBl().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTMax()
  {
    if (nTMaxEClass == null)
    {
      nTMaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(7);
    }
    return nTMaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTMax_Value()
  {
        return (EAttribute)getnTMax().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTMax_Name()
  {
        return (EAttribute)getnTMax().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnDT()
  {
    if (nDTEClass == null)
    {
      nDTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(8);
    }
    return nDTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDT_Value()
  {
        return (EAttribute)getnDT().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDT_Name()
  {
        return (EAttribute)getnDT().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiYCMode()
  {
    if (iYCModeEClass == null)
    {
      iYCModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(9);
    }
    return iYCModeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiYCMode_Value()
  {
        return (EAttribute)getiYCMode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiYCMode_Name()
  {
        return (EAttribute)getiYCMode().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTYCOn()
  {
    if (nTYCOnEClass == null)
    {
      nTYCOnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(10);
    }
    return nTYCOnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTYCOn_Value()
  {
        return (EAttribute)getnTYCOn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTYCOn_Name()
  {
        return (EAttribute)getnTYCOn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiPCMode()
  {
    if (iPCModeEClass == null)
    {
      iPCModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(11);
    }
    return iPCModeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiPCMode_Value()
  {
        return (EAttribute)getiPCMode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiPCMode_Name()
  {
        return (EAttribute)getiPCMode().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTPCOn()
  {
    if (nTPCOnEClass == null)
    {
      nTPCOnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(12);
    }
    return nTPCOnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPCOn_Value()
  {
        return (EAttribute)getnTPCOn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPCOn_Name()
  {
        return (EAttribute)getnTPCOn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiVSContrl()
  {
    if (iVSContrlEClass == null)
    {
      iVSContrlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(13);
    }
    return iVSContrlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiVSContrl_Value()
  {
        return (EAttribute)getiVSContrl().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiVSContrl_Name()
  {
        return (EAttribute)getiVSContrl().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnVS_RtGnSp()
  {
    if (nVS_RtGnSpEClass == null)
    {
      nVS_RtGnSpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(14);
    }
    return nVS_RtGnSpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVS_RtGnSp_Value()
  {
        return (EAttribute)getnVS_RtGnSp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVS_RtGnSp_Name()
  {
        return (EAttribute)getnVS_RtGnSp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnVS_RtTq()
  {
    if (nVS_RtTqEClass == null)
    {
      nVS_RtTqEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(15);
    }
    return nVS_RtTqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVS_RtTq_Value()
  {
        return (EAttribute)getnVS_RtTq().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVS_RtTq_Name()
  {
        return (EAttribute)getnVS_RtTq().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnVS_Rgn2K()
  {
    if (nVS_Rgn2KEClass == null)
    {
      nVS_Rgn2KEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(16);
    }
    return nVS_Rgn2KEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVS_Rgn2K_Value()
  {
        return (EAttribute)getnVS_Rgn2K().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVS_Rgn2K_Name()
  {
        return (EAttribute)getnVS_Rgn2K().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnVS_SlPc()
  {
    if (nVS_SlPcEClass == null)
    {
      nVS_SlPcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(17);
    }
    return nVS_SlPcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVS_SlPc_Value()
  {
        return (EAttribute)getnVS_SlPc().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVS_SlPc_Name()
  {
        return (EAttribute)getnVS_SlPc().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiGenModel()
  {
    if (iGenModelEClass == null)
    {
      iGenModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(18);
    }
    return iGenModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiGenModel_Value()
  {
        return (EAttribute)getiGenModel().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiGenModel_Name()
  {
        return (EAttribute)getiGenModel().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbGenTiStr()
  {
    if (bGenTiStrEClass == null)
    {
      bGenTiStrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(19);
    }
    return bGenTiStrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbGenTiStr_Value()
  {
        return (EAttribute)getbGenTiStr().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbGenTiStr_Name()
  {
        return (EAttribute)getbGenTiStr().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbGenTiStp()
  {
    if (bGenTiStpEClass == null)
    {
      bGenTiStpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(20);
    }
    return bGenTiStpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbGenTiStp_Value()
  {
        return (EAttribute)getbGenTiStp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbGenTiStp_Name()
  {
        return (EAttribute)getbGenTiStp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSpdGenOn()
  {
    if (nSpdGenOnEClass == null)
    {
      nSpdGenOnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(21);
    }
    return nSpdGenOnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSpdGenOn_Value()
  {
        return (EAttribute)getnSpdGenOn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSpdGenOn_Name()
  {
        return (EAttribute)getnSpdGenOn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTimGenOn()
  {
    if (nTimGenOnEClass == null)
    {
      nTimGenOnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(22);
    }
    return nTimGenOnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTimGenOn_Value()
  {
        return (EAttribute)getnTimGenOn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTimGenOn_Name()
  {
        return (EAttribute)getnTimGenOn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTimGenOf()
  {
    if (nTimGenOfEClass == null)
    {
      nTimGenOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(23);
    }
    return nTimGenOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTimGenOf_Value()
  {
        return (EAttribute)getnTimGenOf().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTimGenOf_Name()
  {
        return (EAttribute)getnTimGenOf().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiHSSBrMode()
  {
    if (iHSSBrModeEClass == null)
    {
      iHSSBrModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(24);
    }
    return iHSSBrModeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiHSSBrMode_Value()
  {
        return (EAttribute)getiHSSBrMode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiHSSBrMode_Name()
  {
        return (EAttribute)getiHSSBrMode().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTHSSBrDp()
  {
    if (nTHSSBrDpEClass == null)
    {
      nTHSSBrDpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(25);
    }
    return nTHSSBrDpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTHSSBrDp_Value()
  {
        return (EAttribute)getnTHSSBrDp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTHSSBrDp_Name()
  {
        return (EAttribute)getnTHSSBrDp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTiDynBrk()
  {
    if (nTiDynBrkEClass == null)
    {
      nTiDynBrkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(26);
    }
    return nTiDynBrkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTiDynBrk_Value()
  {
        return (EAttribute)getnTiDynBrk().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTiDynBrk_Name()
  {
        return (EAttribute)getnTiDynBrk().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTTpBrDp_1_()
  {
    if (nTTpBrDp_1_EClass == null)
    {
      nTTpBrDp_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(27);
    }
    return nTTpBrDp_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTpBrDp_1__Value()
  {
        return (EAttribute)getnTTpBrDp_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTpBrDp_1__Name()
  {
        return (EAttribute)getnTTpBrDp_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTTpBrDp_2_()
  {
    if (nTTpBrDp_2_EClass == null)
    {
      nTTpBrDp_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(28);
    }
    return nTTpBrDp_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTpBrDp_2__Value()
  {
        return (EAttribute)getnTTpBrDp_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTpBrDp_2__Name()
  {
        return (EAttribute)getnTTpBrDp_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTTpBrDp_3_()
  {
    if (nTTpBrDp_3_EClass == null)
    {
      nTTpBrDp_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(29);
    }
    return nTTpBrDp_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTpBrDp_3__Value()
  {
        return (EAttribute)getnTTpBrDp_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTpBrDp_3__Name()
  {
        return (EAttribute)getnTTpBrDp_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTBDepISp_1_()
  {
    if (nTBDepISp_1_EClass == null)
    {
      nTBDepISp_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(30);
    }
    return nTBDepISp_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDepISp_1__Value()
  {
        return (EAttribute)getnTBDepISp_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDepISp_1__Name()
  {
        return (EAttribute)getnTBDepISp_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTBDepISp_2_()
  {
    if (nTBDepISp_2_EClass == null)
    {
      nTBDepISp_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(31);
    }
    return nTBDepISp_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDepISp_2__Value()
  {
        return (EAttribute)getnTBDepISp_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDepISp_2__Name()
  {
        return (EAttribute)getnTBDepISp_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTBDepISp_3_()
  {
    if (nTBDepISp_3_EClass == null)
    {
      nTBDepISp_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(32);
    }
    return nTBDepISp_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDepISp_3__Value()
  {
        return (EAttribute)getnTBDepISp_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDepISp_3__Name()
  {
        return (EAttribute)getnTBDepISp_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTYawManS()
  {
    if (nTYawManSEClass == null)
    {
      nTYawManSEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(33);
    }
    return nTYawManSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTYawManS_Value()
  {
        return (EAttribute)getnTYawManS().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTYawManS_Name()
  {
        return (EAttribute)getnTYawManS().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTYawManE()
  {
    if (nTYawManEEClass == null)
    {
      nTYawManEEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(34);
    }
    return nTYawManEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTYawManE_Value()
  {
        return (EAttribute)getnTYawManE().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTYawManE_Name()
  {
        return (EAttribute)getnTYawManE().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNacYawF()
  {
    if (nNacYawFEClass == null)
    {
      nNacYawFEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(35);
    }
    return nNacYawFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacYawF_Value()
  {
        return (EAttribute)getnNacYawF().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacYawF_Name()
  {
        return (EAttribute)getnNacYawF().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTPitManS_1_()
  {
    if (nTPitManS_1_EClass == null)
    {
      nTPitManS_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(36);
    }
    return nTPitManS_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManS_1__Value()
  {
        return (EAttribute)getnTPitManS_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManS_1__Name()
  {
        return (EAttribute)getnTPitManS_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTPitManS_2_()
  {
    if (nTPitManS_2_EClass == null)
    {
      nTPitManS_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(37);
    }
    return nTPitManS_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManS_2__Value()
  {
        return (EAttribute)getnTPitManS_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManS_2__Name()
  {
        return (EAttribute)getnTPitManS_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTPitManS_3_()
  {
    if (nTPitManS_3_EClass == null)
    {
      nTPitManS_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(38);
    }
    return nTPitManS_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManS_3__Value()
  {
        return (EAttribute)getnTPitManS_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManS_3__Name()
  {
        return (EAttribute)getnTPitManS_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTPitManE_1_()
  {
    if (nTPitManE_1_EClass == null)
    {
      nTPitManE_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(39);
    }
    return nTPitManE_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManE_1__Value()
  {
        return (EAttribute)getnTPitManE_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManE_1__Name()
  {
        return (EAttribute)getnTPitManE_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTPitManE_2_()
  {
    if (nTPitManE_2_EClass == null)
    {
      nTPitManE_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(40);
    }
    return nTPitManE_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManE_2__Value()
  {
        return (EAttribute)getnTPitManE_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManE_2__Name()
  {
        return (EAttribute)getnTPitManE_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTPitManE_3_()
  {
    if (nTPitManE_3_EClass == null)
    {
      nTPitManE_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(41);
    }
    return nTPitManE_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManE_3__Value()
  {
        return (EAttribute)getnTPitManE_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTPitManE_3__Name()
  {
        return (EAttribute)getnTPitManE_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBlPitch_1_()
  {
    if (nBlPitch_1_EClass == null)
    {
      nBlPitch_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(42);
    }
    return nBlPitch_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitch_1__Value()
  {
        return (EAttribute)getnBlPitch_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitch_1__Name()
  {
        return (EAttribute)getnBlPitch_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBlPitch_2_()
  {
    if (nBlPitch_2_EClass == null)
    {
      nBlPitch_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(43);
    }
    return nBlPitch_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitch_2__Value()
  {
        return (EAttribute)getnBlPitch_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitch_2__Name()
  {
        return (EAttribute)getnBlPitch_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBlPitch_3_()
  {
    if (nBlPitch_3_EClass == null)
    {
      nBlPitch_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(44);
    }
    return nBlPitch_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitch_3__Value()
  {
        return (EAttribute)getnBlPitch_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitch_3__Name()
  {
        return (EAttribute)getnBlPitch_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBlPitchF_1_()
  {
    if (nBlPitchF_1_EClass == null)
    {
      nBlPitchF_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(45);
    }
    return nBlPitchF_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitchF_1__Value()
  {
        return (EAttribute)getnBlPitchF_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitchF_1__Name()
  {
        return (EAttribute)getnBlPitchF_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBlPitchF_2_()
  {
    if (nBlPitchF_2_EClass == null)
    {
      nBlPitchF_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(46);
    }
    return nBlPitchF_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitchF_2__Value()
  {
        return (EAttribute)getnBlPitchF_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitchF_2__Name()
  {
        return (EAttribute)getnBlPitchF_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBlPitchF_3_()
  {
    if (nBlPitchF_3_EClass == null)
    {
      nBlPitchF_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(47);
    }
    return nBlPitchF_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitchF_3__Value()
  {
        return (EAttribute)getnBlPitchF_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlPitchF_3__Name()
  {
        return (EAttribute)getnBlPitchF_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnGravity()
  {
    if (nGravityEClass == null)
    {
      nGravityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(48);
    }
    return nGravityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGravity_Value()
  {
        return (EAttribute)getnGravity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGravity_Name()
  {
        return (EAttribute)getnGravity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbFlapDOF1()
  {
    if (bFlapDOF1EClass == null)
    {
      bFlapDOF1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(49);
    }
    return bFlapDOF1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbFlapDOF1_Value()
  {
        return (EAttribute)getbFlapDOF1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbFlapDOF1_Name()
  {
        return (EAttribute)getbFlapDOF1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbFlapDOF2()
  {
    if (bFlapDOF2EClass == null)
    {
      bFlapDOF2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(50);
    }
    return bFlapDOF2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbFlapDOF2_Value()
  {
        return (EAttribute)getbFlapDOF2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbFlapDOF2_Name()
  {
        return (EAttribute)getbFlapDOF2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbEdgeDOF()
  {
    if (bEdgeDOFEClass == null)
    {
      bEdgeDOFEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(51);
    }
    return bEdgeDOFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbEdgeDOF_Value()
  {
        return (EAttribute)getbEdgeDOF().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbEdgeDOF_Name()
  {
        return (EAttribute)getbEdgeDOF().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTeetDOF()
  {
    if (bTeetDOFEClass == null)
    {
      bTeetDOFEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(52);
    }
    return bTeetDOFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTeetDOF_Value()
  {
        return (EAttribute)getbTeetDOF().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTeetDOF_Name()
  {
        return (EAttribute)getbTeetDOF().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbDrTrDOF()
  {
    if (bDrTrDOFEClass == null)
    {
      bDrTrDOFEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(53);
    }
    return bDrTrDOFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbDrTrDOF_Value()
  {
        return (EAttribute)getbDrTrDOF().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbDrTrDOF_Name()
  {
        return (EAttribute)getbDrTrDOF().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbGenDOF()
  {
    if (bGenDOFEClass == null)
    {
      bGenDOFEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(54);
    }
    return bGenDOFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbGenDOF_Value()
  {
        return (EAttribute)getbGenDOF().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbGenDOF_Name()
  {
        return (EAttribute)getbGenDOF().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbYawDOF()
  {
    if (bYawDOFEClass == null)
    {
      bYawDOFEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(55);
    }
    return bYawDOFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbYawDOF_Value()
  {
        return (EAttribute)getbYawDOF().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbYawDOF_Name()
  {
        return (EAttribute)getbYawDOF().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTwFADOF1()
  {
    if (bTwFADOF1EClass == null)
    {
      bTwFADOF1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(56);
    }
    return bTwFADOF1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwFADOF1_Value()
  {
        return (EAttribute)getbTwFADOF1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwFADOF1_Name()
  {
        return (EAttribute)getbTwFADOF1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTwFADOF2()
  {
    if (bTwFADOF2EClass == null)
    {
      bTwFADOF2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(57);
    }
    return bTwFADOF2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwFADOF2_Value()
  {
        return (EAttribute)getbTwFADOF2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwFADOF2_Name()
  {
        return (EAttribute)getbTwFADOF2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTwSSDOF1()
  {
    if (bTwSSDOF1EClass == null)
    {
      bTwSSDOF1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(58);
    }
    return bTwSSDOF1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwSSDOF1_Value()
  {
        return (EAttribute)getbTwSSDOF1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwSSDOF1_Name()
  {
        return (EAttribute)getbTwSSDOF1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTwSSDOF2()
  {
    if (bTwSSDOF2EClass == null)
    {
      bTwSSDOF2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(59);
    }
    return bTwSSDOF2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwSSDOF2_Value()
  {
        return (EAttribute)getbTwSSDOF2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwSSDOF2_Name()
  {
        return (EAttribute)getbTwSSDOF2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbCompAero()
  {
    if (bCompAeroEClass == null)
    {
      bCompAeroEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(60);
    }
    return bCompAeroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCompAero_Value()
  {
        return (EAttribute)getbCompAero().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCompAero_Name()
  {
        return (EAttribute)getbCompAero().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbCompNoise()
  {
    if (bCompNoiseEClass == null)
    {
      bCompNoiseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(61);
    }
    return bCompNoiseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCompNoise_Value()
  {
        return (EAttribute)getbCompNoise().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCompNoise_Name()
  {
        return (EAttribute)getbCompNoise().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnOoPDefl()
  {
    if (nOoPDeflEClass == null)
    {
      nOoPDeflEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(62);
    }
    return nOoPDeflEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnOoPDefl_Value()
  {
        return (EAttribute)getnOoPDefl().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnOoPDefl_Name()
  {
        return (EAttribute)getnOoPDefl().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIPDefl()
  {
    if (nIPDeflEClass == null)
    {
      nIPDeflEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(63);
    }
    return nIPDeflEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIPDefl_Value()
  {
        return (EAttribute)getnIPDefl().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIPDefl_Name()
  {
        return (EAttribute)getnIPDefl().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTeetDefl()
  {
    if (nTeetDeflEClass == null)
    {
      nTeetDeflEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(64);
    }
    return nTeetDeflEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetDefl_Value()
  {
        return (EAttribute)getnTeetDefl().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetDefl_Name()
  {
        return (EAttribute)getnTeetDefl().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnAzimuth()
  {
    if (nAzimuthEClass == null)
    {
      nAzimuthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(65);
    }
    return nAzimuthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAzimuth_Value()
  {
        return (EAttribute)getnAzimuth().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAzimuth_Name()
  {
        return (EAttribute)getnAzimuth().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRotSpeed()
  {
    if (nRotSpeedEClass == null)
    {
      nRotSpeedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(66);
    }
    return nRotSpeedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRotSpeed_Value()
  {
        return (EAttribute)getnRotSpeed().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRotSpeed_Name()
  {
        return (EAttribute)getnRotSpeed().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNacYaw()
  {
    if (nNacYawEClass == null)
    {
      nNacYawEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(67);
    }
    return nNacYawEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacYaw_Value()
  {
        return (EAttribute)getnNacYaw().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacYaw_Name()
  {
        return (EAttribute)getnNacYaw().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTTDspFA()
  {
    if (nTTDspFAEClass == null)
    {
      nTTDspFAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(68);
    }
    return nTTDspFAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTDspFA_Value()
  {
        return (EAttribute)getnTTDspFA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTDspFA_Name()
  {
        return (EAttribute)getnTTDspFA().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTTDspSS()
  {
    if (nTTDspSSEClass == null)
    {
      nTTDspSSEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(69);
    }
    return nTTDspSSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTDspSS_Value()
  {
        return (EAttribute)getnTTDspSS().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTTDspSS_Name()
  {
        return (EAttribute)getnTTDspSS().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTipRad()
  {
    if (nTipRadEClass == null)
    {
      nTipRadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(70);
    }
    return nTipRadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipRad_Value()
  {
        return (EAttribute)getnTipRad().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipRad_Name()
  {
        return (EAttribute)getnTipRad().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHubRad()
  {
    if (nHubRadEClass == null)
    {
      nHubRadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(71);
    }
    return nHubRadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubRad_Value()
  {
        return (EAttribute)getnHubRad().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubRad_Name()
  {
        return (EAttribute)getnHubRad().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPSpnElN()
  {
    if (nPSpnElNEClass == null)
    {
      nPSpnElNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(72);
    }
    return nPSpnElNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPSpnElN_Value()
  {
        return (EAttribute)getnPSpnElN().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPSpnElN_Name()
  {
        return (EAttribute)getnPSpnElN().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnUndSling()
  {
    if (nUndSlingEClass == null)
    {
      nUndSlingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(73);
    }
    return nUndSlingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnUndSling_Value()
  {
        return (EAttribute)getnUndSling().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnUndSling_Name()
  {
        return (EAttribute)getnUndSling().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHubCM()
  {
    if (nHubCMEClass == null)
    {
      nHubCMEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(74);
    }
    return nHubCMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubCM_Value()
  {
        return (EAttribute)getnHubCM().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubCM_Name()
  {
        return (EAttribute)getnHubCM().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnOverHang()
  {
    if (nOverHangEClass == null)
    {
      nOverHangEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(75);
    }
    return nOverHangEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnOverHang_Value()
  {
        return (EAttribute)getnOverHang().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnOverHang_Name()
  {
        return (EAttribute)getnOverHang().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNacCMxn()
  {
    if (nNacCMxnEClass == null)
    {
      nNacCMxnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(76);
    }
    return nNacCMxnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacCMxn_Value()
  {
        return (EAttribute)getnNacCMxn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacCMxn_Name()
  {
        return (EAttribute)getnNacCMxn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNacCMyn()
  {
    if (nNacCMynEClass == null)
    {
      nNacCMynEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(77);
    }
    return nNacCMynEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacCMyn_Value()
  {
        return (EAttribute)getnNacCMyn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacCMyn_Name()
  {
        return (EAttribute)getnNacCMyn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNacCMzn()
  {
    if (nNacCMznEClass == null)
    {
      nNacCMznEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(78);
    }
    return nNacCMznEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacCMzn_Value()
  {
        return (EAttribute)getnNacCMzn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacCMzn_Name()
  {
        return (EAttribute)getnNacCMzn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTowerHt()
  {
    if (nTowerHtEClass == null)
    {
      nTowerHtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(79);
    }
    return nTowerHtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTowerHt_Value()
  {
        return (EAttribute)getnTowerHt().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTowerHt_Name()
  {
        return (EAttribute)getnTowerHt().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwr2Shft()
  {
    if (nTwr2ShftEClass == null)
    {
      nTwr2ShftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(80);
    }
    return nTwr2ShftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwr2Shft_Value()
  {
        return (EAttribute)getnTwr2Shft().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwr2Shft_Name()
  {
        return (EAttribute)getnTwr2Shft().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwrRBHt()
  {
    if (nTwrRBHtEClass == null)
    {
      nTwrRBHtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(81);
    }
    return nTwrRBHtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrRBHt_Value()
  {
        return (EAttribute)getnTwrRBHt().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrRBHt_Name()
  {
        return (EAttribute)getnTwrRBHt().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnShftTilt()
  {
    if (nShftTiltEClass == null)
    {
      nShftTiltEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(82);
    }
    return nShftTiltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnShftTilt_Value()
  {
        return (EAttribute)getnShftTilt().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnShftTilt_Name()
  {
        return (EAttribute)getnShftTilt().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnDelta3()
  {
    if (nDelta3EClass == null)
    {
      nDelta3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(83);
    }
    return nDelta3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDelta3_Value()
  {
        return (EAttribute)getnDelta3().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDelta3_Name()
  {
        return (EAttribute)getnDelta3().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPreCone_1_()
  {
    if (nPreCone_1_EClass == null)
    {
      nPreCone_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(84);
    }
    return nPreCone_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPreCone_1__Value()
  {
        return (EAttribute)getnPreCone_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPreCone_1__Name()
  {
        return (EAttribute)getnPreCone_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPreCone_2_()
  {
    if (nPreCone_2_EClass == null)
    {
      nPreCone_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(85);
    }
    return nPreCone_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPreCone_2__Value()
  {
        return (EAttribute)getnPreCone_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPreCone_2__Name()
  {
        return (EAttribute)getnPreCone_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPreCone_3_()
  {
    if (nPreCone_3_EClass == null)
    {
      nPreCone_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(86);
    }
    return nPreCone_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPreCone_3__Value()
  {
        return (EAttribute)getnPreCone_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPreCone_3__Name()
  {
        return (EAttribute)getnPreCone_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnAzimB1Up()
  {
    if (nAzimB1UpEClass == null)
    {
      nAzimB1UpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(87);
    }
    return nAzimB1UpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAzimB1Up_Value()
  {
        return (EAttribute)getnAzimB1Up().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAzimB1Up_Name()
  {
        return (EAttribute)getnAzimB1Up().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnYawBrMass()
  {
    if (nYawBrMassEClass == null)
    {
      nYawBrMassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(88);
    }
    return nYawBrMassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnYawBrMass_Value()
  {
        return (EAttribute)getnYawBrMass().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnYawBrMass_Name()
  {
        return (EAttribute)getnYawBrMass().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNacMass()
  {
    if (nNacMassEClass == null)
    {
      nNacMassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(89);
    }
    return nNacMassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacMass_Value()
  {
        return (EAttribute)getnNacMass().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacMass_Name()
  {
        return (EAttribute)getnNacMass().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHubMass()
  {
    if (nHubMassEClass == null)
    {
      nHubMassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(90);
    }
    return nHubMassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubMass_Value()
  {
        return (EAttribute)getnHubMass().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubMass_Name()
  {
        return (EAttribute)getnHubMass().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTipMass_1_()
  {
    if (nTipMass_1_EClass == null)
    {
      nTipMass_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(91);
    }
    return nTipMass_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipMass_1__Value()
  {
        return (EAttribute)getnTipMass_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipMass_1__Name()
  {
        return (EAttribute)getnTipMass_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTipMass_2_()
  {
    if (nTipMass_2_EClass == null)
    {
      nTipMass_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(92);
    }
    return nTipMass_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipMass_2__Value()
  {
        return (EAttribute)getnTipMass_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipMass_2__Name()
  {
        return (EAttribute)getnTipMass_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTipMass_3_()
  {
    if (nTipMass_3_EClass == null)
    {
      nTipMass_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(93);
    }
    return nTipMass_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipMass_3__Value()
  {
        return (EAttribute)getnTipMass_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipMass_3__Name()
  {
        return (EAttribute)getnTipMass_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNacYIner()
  {
    if (nNacYInerEClass == null)
    {
      nNacYInerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(94);
    }
    return nNacYInerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacYIner_Value()
  {
        return (EAttribute)getnNacYIner().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNacYIner_Name()
  {
        return (EAttribute)getnNacYIner().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnGenIner()
  {
    if (nGenInerEClass == null)
    {
      nGenInerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(95);
    }
    return nGenInerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGenIner_Value()
  {
        return (EAttribute)getnGenIner().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGenIner_Name()
  {
        return (EAttribute)getnGenIner().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHubIner()
  {
    if (nHubInerEClass == null)
    {
      nHubInerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(96);
    }
    return nHubInerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubIner_Value()
  {
        return (EAttribute)getnHubIner().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubIner_Name()
  {
        return (EAttribute)getnHubIner().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnGBoxEff()
  {
    if (nGBoxEffEClass == null)
    {
      nGBoxEffEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(97);
    }
    return nGBoxEffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGBoxEff_Value()
  {
        return (EAttribute)getnGBoxEff().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGBoxEff_Name()
  {
        return (EAttribute)getnGBoxEff().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnGenEff()
  {
    if (nGenEffEClass == null)
    {
      nGenEffEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(98);
    }
    return nGenEffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGenEff_Value()
  {
        return (EAttribute)getnGenEff().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGenEff_Name()
  {
        return (EAttribute)getnGenEff().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnGBRatio()
  {
    if (nGBRatioEClass == null)
    {
      nGBRatioEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(99);
    }
    return nGBRatioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGBRatio_Value()
  {
        return (EAttribute)getnGBRatio().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGBRatio_Name()
  {
        return (EAttribute)getnGBRatio().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbGBRevers()
  {
    if (bGBReversEClass == null)
    {
      bGBReversEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(100);
    }
    return bGBReversEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbGBRevers_Value()
  {
        return (EAttribute)getbGBRevers().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbGBRevers_Name()
  {
        return (EAttribute)getbGBRevers().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHSSBrTqF()
  {
    if (nHSSBrTqFEClass == null)
    {
      nHSSBrTqFEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(101);
    }
    return nHSSBrTqFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHSSBrTqF_Value()
  {
        return (EAttribute)getnHSSBrTqF().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHSSBrTqF_Name()
  {
        return (EAttribute)getnHSSBrTqF().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHSSBrDT()
  {
    if (nHSSBrDTEClass == null)
    {
      nHSSBrDTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(102);
    }
    return nHSSBrDTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHSSBrDT_Value()
  {
        return (EAttribute)getnHSSBrDT().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHSSBrDT_Name()
  {
        return (EAttribute)getnHSSBrDT().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfDynBrkFi()
  {
    if (fDynBrkFiEClass == null)
    {
      fDynBrkFiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(103);
    }
    return fDynBrkFiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfDynBrkFi_Value()
  {
        return (EAttribute)getfDynBrkFi().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfDynBrkFi_Name()
  {
        return (EAttribute)getfDynBrkFi().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnDTTorSpr()
  {
    if (nDTTorSprEClass == null)
    {
      nDTTorSprEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(104);
    }
    return nDTTorSprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDTTorSpr_Value()
  {
        return (EAttribute)getnDTTorSpr().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDTTorSpr_Name()
  {
        return (EAttribute)getnDTTorSpr().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnDTTorDmp()
  {
    if (nDTTorDmpEClass == null)
    {
      nDTTorDmpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(105);
    }
    return nDTTorDmpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDTTorDmp_Value()
  {
        return (EAttribute)getnDTTorDmp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDTTorDmp_Name()
  {
        return (EAttribute)getnDTTorDmp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSIG_SlPc()
  {
    if (nSIG_SlPcEClass == null)
    {
      nSIG_SlPcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(106);
    }
    return nSIG_SlPcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSIG_SlPc_Value()
  {
        return (EAttribute)getnSIG_SlPc().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSIG_SlPc_Name()
  {
        return (EAttribute)getnSIG_SlPc().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSIG_SySp()
  {
    if (nSIG_SySpEClass == null)
    {
      nSIG_SySpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(107);
    }
    return nSIG_SySpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSIG_SySp_Value()
  {
        return (EAttribute)getnSIG_SySp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSIG_SySp_Name()
  {
        return (EAttribute)getnSIG_SySp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSIG_RtTq()
  {
    if (nSIG_RtTqEClass == null)
    {
      nSIG_RtTqEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(108);
    }
    return nSIG_RtTqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSIG_RtTq_Value()
  {
        return (EAttribute)getnSIG_RtTq().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSIG_RtTq_Name()
  {
        return (EAttribute)getnSIG_RtTq().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSIG_PORt()
  {
    if (nSIG_PORtEClass == null)
    {
      nSIG_PORtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(109);
    }
    return nSIG_PORtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSIG_PORt_Value()
  {
        return (EAttribute)getnSIG_PORt().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSIG_PORt_Name()
  {
        return (EAttribute)getnSIG_PORt().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTEC_Freq()
  {
    if (nTEC_FreqEClass == null)
    {
      nTEC_FreqEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(110);
    }
    return nTEC_FreqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_Freq_Value()
  {
        return (EAttribute)getnTEC_Freq().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_Freq_Name()
  {
        return (EAttribute)getnTEC_Freq().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTEC_Npol()
  {
    if (nTEC_NpolEClass == null)
    {
      nTEC_NpolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(111);
    }
    return nTEC_NpolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_Npol_Value()
  {
        return (EAttribute)getnTEC_Npol().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_Npol_Name()
  {
        return (EAttribute)getnTEC_Npol().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTEC_Sres()
  {
    if (nTEC_SresEClass == null)
    {
      nTEC_SresEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(112);
    }
    return nTEC_SresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_Sres_Value()
  {
        return (EAttribute)getnTEC_Sres().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_Sres_Name()
  {
        return (EAttribute)getnTEC_Sres().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTEC_Rres()
  {
    if (nTEC_RresEClass == null)
    {
      nTEC_RresEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(113);
    }
    return nTEC_RresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_Rres_Value()
  {
        return (EAttribute)getnTEC_Rres().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_Rres_Name()
  {
        return (EAttribute)getnTEC_Rres().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTEC_VLL()
  {
    if (nTEC_VLLEClass == null)
    {
      nTEC_VLLEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(114);
    }
    return nTEC_VLLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_VLL_Value()
  {
        return (EAttribute)getnTEC_VLL().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_VLL_Name()
  {
        return (EAttribute)getnTEC_VLL().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTEC_SLR()
  {
    if (nTEC_SLREClass == null)
    {
      nTEC_SLREClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(115);
    }
    return nTEC_SLREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_SLR_Value()
  {
        return (EAttribute)getnTEC_SLR().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_SLR_Name()
  {
        return (EAttribute)getnTEC_SLR().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTEC_RLR()
  {
    if (nTEC_RLREClass == null)
    {
      nTEC_RLREClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(116);
    }
    return nTEC_RLREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_RLR_Value()
  {
        return (EAttribute)getnTEC_RLR().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_RLR_Name()
  {
        return (EAttribute)getnTEC_RLR().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTEC_MR()
  {
    if (nTEC_MREClass == null)
    {
      nTEC_MREClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(117);
    }
    return nTEC_MREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_MR_Value()
  {
        return (EAttribute)getnTEC_MR().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTEC_MR_Name()
  {
        return (EAttribute)getnTEC_MR().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiPtfmModel()
  {
    if (iPtfmModelEClass == null)
    {
      iPtfmModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(118);
    }
    return iPtfmModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiPtfmModel_Value()
  {
        return (EAttribute)getiPtfmModel().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiPtfmModel_Name()
  {
        return (EAttribute)getiPtfmModel().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfPtfmFile()
  {
    if (fPtfmFileEClass == null)
    {
      fPtfmFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(119);
    }
    return fPtfmFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfPtfmFile_Value()
  {
        return (EAttribute)getfPtfmFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfPtfmFile_Name()
  {
        return (EAttribute)getfPtfmFile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiTwrNodes()
  {
    if (iTwrNodesEClass == null)
    {
      iTwrNodesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(120);
    }
    return iTwrNodesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiTwrNodes_Value()
  {
        return (EAttribute)getiTwrNodes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiTwrNodes_Name()
  {
        return (EAttribute)getiTwrNodes().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfTwrFile()
  {
    if (fTwrFileEClass == null)
    {
      fTwrFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(121);
    }
    return fTwrFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfTwrFile_Value()
  {
        return (EAttribute)getfTwrFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfTwrFile_Name()
  {
        return (EAttribute)getfTwrFile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnYawSpr()
  {
    if (nYawSprEClass == null)
    {
      nYawSprEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(122);
    }
    return nYawSprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnYawSpr_Value()
  {
        return (EAttribute)getnYawSpr().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnYawSpr_Name()
  {
        return (EAttribute)getnYawSpr().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnYawDamp()
  {
    if (nYawDampEClass == null)
    {
      nYawDampEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(123);
    }
    return nYawDampEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnYawDamp_Value()
  {
        return (EAttribute)getnYawDamp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnYawDamp_Name()
  {
        return (EAttribute)getnYawDamp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnYawNeut()
  {
    if (nYawNeutEClass == null)
    {
      nYawNeutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(124);
    }
    return nYawNeutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnYawNeut_Value()
  {
        return (EAttribute)getnYawNeut().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnYawNeut_Name()
  {
        return (EAttribute)getnYawNeut().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbFurling()
  {
    if (bFurlingEClass == null)
    {
      bFurlingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(125);
    }
    return bFurlingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbFurling_Value()
  {
        return (EAttribute)getbFurling().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbFurling_Name()
  {
        return (EAttribute)getbFurling().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfFurlFile()
  {
    if (fFurlFileEClass == null)
    {
      fFurlFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(126);
    }
    return fFurlFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfFurlFile_Value()
  {
        return (EAttribute)getfFurlFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfFurlFile_Name()
  {
        return (EAttribute)getfFurlFile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiTeetMod()
  {
    if (iTeetModEClass == null)
    {
      iTeetModEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(127);
    }
    return iTeetModEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiTeetMod_Value()
  {
        return (EAttribute)getiTeetMod().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiTeetMod_Name()
  {
        return (EAttribute)getiTeetMod().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTeetDmpP()
  {
    if (nTeetDmpPEClass == null)
    {
      nTeetDmpPEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(128);
    }
    return nTeetDmpPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetDmpP_Value()
  {
        return (EAttribute)getnTeetDmpP().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetDmpP_Name()
  {
        return (EAttribute)getnTeetDmpP().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTeetDmp()
  {
    if (nTeetDmpEClass == null)
    {
      nTeetDmpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(129);
    }
    return nTeetDmpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetDmp_Value()
  {
        return (EAttribute)getnTeetDmp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetDmp_Name()
  {
        return (EAttribute)getnTeetDmp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTeetCDmp()
  {
    if (nTeetCDmpEClass == null)
    {
      nTeetCDmpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(130);
    }
    return nTeetCDmpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetCDmp_Value()
  {
        return (EAttribute)getnTeetCDmp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetCDmp_Name()
  {
        return (EAttribute)getnTeetCDmp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTeetSStP()
  {
    if (nTeetSStPEClass == null)
    {
      nTeetSStPEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(131);
    }
    return nTeetSStPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetSStP_Value()
  {
        return (EAttribute)getnTeetSStP().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetSStP_Name()
  {
        return (EAttribute)getnTeetSStP().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTeetHStP()
  {
    if (nTeetHStPEClass == null)
    {
      nTeetHStPEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(132);
    }
    return nTeetHStPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetHStP_Value()
  {
        return (EAttribute)getnTeetHStP().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetHStP_Name()
  {
        return (EAttribute)getnTeetHStP().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTeetSSSp()
  {
    if (nTeetSSSpEClass == null)
    {
      nTeetSSSpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(133);
    }
    return nTeetSSSpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetSSSp_Value()
  {
        return (EAttribute)getnTeetSSSp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetSSSp_Name()
  {
        return (EAttribute)getnTeetSSSp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTeetHSSp()
  {
    if (nTeetHSSpEClass == null)
    {
      nTeetHSSpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(134);
    }
    return nTeetHSSpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetHSSp_Value()
  {
        return (EAttribute)getnTeetHSSp().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTeetHSSp_Name()
  {
        return (EAttribute)getnTeetHSSp().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTBDrConN()
  {
    if (nTBDrConNEClass == null)
    {
      nTBDrConNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(135);
    }
    return nTBDrConNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDrConN_Value()
  {
        return (EAttribute)getnTBDrConN().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDrConN_Name()
  {
        return (EAttribute)getnTBDrConN().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTBDrConD()
  {
    if (nTBDrConDEClass == null)
    {
      nTBDrConDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(136);
    }
    return nTBDrConDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDrConD_Value()
  {
        return (EAttribute)getnTBDrConD().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTBDrConD_Name()
  {
        return (EAttribute)getnTBDrConD().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTpBrDT()
  {
    if (nTpBrDTEClass == null)
    {
      nTpBrDTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(137);
    }
    return nTpBrDTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTpBrDT_Value()
  {
        return (EAttribute)getnTpBrDT().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTpBrDT_Name()
  {
        return (EAttribute)getnTpBrDT().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfBldFile_1_()
  {
    if (fBldFile_1_EClass == null)
    {
      fBldFile_1_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(138);
    }
    return fBldFile_1_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfBldFile_1__Value()
  {
        return (EAttribute)getfBldFile_1_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfBldFile_1__Name()
  {
        return (EAttribute)getfBldFile_1_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfBldFile_2_()
  {
    if (fBldFile_2_EClass == null)
    {
      fBldFile_2_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(139);
    }
    return fBldFile_2_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfBldFile_2__Value()
  {
        return (EAttribute)getfBldFile_2_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfBldFile_2__Name()
  {
        return (EAttribute)getfBldFile_2_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfBldFile_3_()
  {
    if (fBldFile_3_EClass == null)
    {
      fBldFile_3_EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(140);
    }
    return fBldFile_3_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfBldFile_3__Value()
  {
        return (EAttribute)getfBldFile_3_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfBldFile_3__Name()
  {
        return (EAttribute)getfBldFile_3_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfADFile()
  {
    if (fADFileEClass == null)
    {
      fADFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(141);
    }
    return fADFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfADFile_Value()
  {
        return (EAttribute)getfADFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfADFile_Name()
  {
        return (EAttribute)getfADFile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfNoiseFile()
  {
    if (fNoiseFileEClass == null)
    {
      fNoiseFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(142);
    }
    return fNoiseFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfNoiseFile_Value()
  {
        return (EAttribute)getfNoiseFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfNoiseFile_Name()
  {
        return (EAttribute)getfNoiseFile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfADAMSFile()
  {
    if (fADAMSFileEClass == null)
    {
      fADAMSFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(143);
    }
    return fADAMSFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfADAMSFile_Value()
  {
        return (EAttribute)getfADAMSFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfADAMSFile_Name()
  {
        return (EAttribute)getfADAMSFile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfLinFile()
  {
    if (fLinFileEClass == null)
    {
      fLinFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(144);
    }
    return fLinFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfLinFile_Value()
  {
        return (EAttribute)getfLinFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfLinFile_Name()
  {
        return (EAttribute)getfLinFile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbSumPrint()
  {
    if (bSumPrintEClass == null)
    {
      bSumPrintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(145);
    }
    return bSumPrintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbSumPrint_Value()
  {
        return (EAttribute)getbSumPrint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbSumPrint_Name()
  {
        return (EAttribute)getbSumPrint().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbOutFileFmt()
  {
    if (bOutFileFmtEClass == null)
    {
      bOutFileFmtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(146);
    }
    return bOutFileFmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbOutFileFmt_Value()
  {
        return (EAttribute)getbOutFileFmt().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbOutFileFmt_Name()
  {
        return (EAttribute)getbOutFileFmt().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTabDelim()
  {
    if (bTabDelimEClass == null)
    {
      bTabDelimEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(147);
    }
    return bTabDelimEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTabDelim_Value()
  {
        return (EAttribute)getbTabDelim().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTabDelim_Name()
  {
        return (EAttribute)getbTabDelim().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsOutFmt()
  {
    if (sOutFmtEClass == null)
    {
      sOutFmtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(148);
    }
    return sOutFmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsOutFmt_Value()
  {
        return (EAttribute)getsOutFmt().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsOutFmt_Name()
  {
        return (EAttribute)getsOutFmt().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTStart()
  {
    if (nTStartEClass == null)
    {
      nTStartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(149);
    }
    return nTStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTStart_Value()
  {
        return (EAttribute)getnTStart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTStart_Name()
  {
        return (EAttribute)getnTStart().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiDecFact()
  {
    if (iDecFactEClass == null)
    {
      iDecFactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(150);
    }
    return iDecFactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiDecFact_Value()
  {
        return (EAttribute)getiDecFact().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiDecFact_Name()
  {
        return (EAttribute)getiDecFact().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSttsTime()
  {
    if (nSttsTimeEClass == null)
    {
      nSttsTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(151);
    }
    return nSttsTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSttsTime_Value()
  {
        return (EAttribute)getnSttsTime().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSttsTime_Name()
  {
        return (EAttribute)getnSttsTime().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNcIMUxn()
  {
    if (nNcIMUxnEClass == null)
    {
      nNcIMUxnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(152);
    }
    return nNcIMUxnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNcIMUxn_Value()
  {
        return (EAttribute)getnNcIMUxn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNcIMUxn_Name()
  {
        return (EAttribute)getnNcIMUxn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNcIMUyn()
  {
    if (nNcIMUynEClass == null)
    {
      nNcIMUynEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(153);
    }
    return nNcIMUynEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNcIMUyn_Value()
  {
        return (EAttribute)getnNcIMUyn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNcIMUyn_Name()
  {
        return (EAttribute)getnNcIMUyn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnNcIMUzn()
  {
    if (nNcIMUznEClass == null)
    {
      nNcIMUznEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(154);
    }
    return nNcIMUznEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNcIMUzn_Value()
  {
        return (EAttribute)getnNcIMUzn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnNcIMUzn_Name()
  {
        return (EAttribute)getnNcIMUzn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnShftGagL()
  {
    if (nShftGagLEClass == null)
    {
      nShftGagLEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(155);
    }
    return nShftGagLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnShftGagL_Value()
  {
        return (EAttribute)getnShftGagL().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnShftGagL_Name()
  {
        return (EAttribute)getnShftGagL().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiNTwGages()
  {
    if (iNTwGagesEClass == null)
    {
      iNTwGagesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(156);
    }
    return iNTwGagesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNTwGages_Value()
  {
        return (EAttribute)getiNTwGages().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNTwGages_Name()
  {
        return (EAttribute)getiNTwGages().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaTwrGagNd()
  {
    if (aTwrGagNdEClass == null)
    {
      aTwrGagNdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(157);
    }
    return aTwrGagNdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrGagNd_Value()
  {
        return (EAttribute)getaTwrGagNd().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrGagNd_Name()
  {
        return (EAttribute)getaTwrGagNd().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiNBlGages()
  {
    if (iNBlGagesEClass == null)
    {
      iNBlGagesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(158);
    }
    return iNBlGagesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNBlGages_Value()
  {
        return (EAttribute)getiNBlGages().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNBlGages_Name()
  {
        return (EAttribute)getiNBlGages().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaBldGagNd()
  {
    if (aBldGagNdEClass == null)
    {
      aBldGagNdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(159);
    }
    return aBldGagNdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaBldGagNd_Value()
  {
        return (EAttribute)getaBldGagNd().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaBldGagNd_Name()
  {
        return (EAttribute)getaBldGagNd().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvOutList()
  {
    if (vOutListEClass == null)
    {
      vOutListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FastfstPackage.eNS_URI).getEClassifiers().get(160);
    }
    return vOutListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvOutList_Name()
  {
        return (EAttribute)getvOutList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvOutList_Value()
  {
        return (EAttribute)getvOutList().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastfstFactory getFastfstFactory()
  {
    return (FastfstFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("sc.ndt.editor.fast.fastfst." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //FastfstPackageImpl
