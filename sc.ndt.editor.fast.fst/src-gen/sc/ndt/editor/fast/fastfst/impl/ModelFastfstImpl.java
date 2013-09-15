/**
 */
package sc.ndt.editor.fast.fastfst.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sc.ndt.editor.fast.fastfst.FastfstPackage;
import sc.ndt.editor.fast.fastfst.Header;
import sc.ndt.editor.fast.fastfst.ModelFastfst;
import sc.ndt.editor.fast.fastfst.Section;
import sc.ndt.editor.fast.fastfst.aBldGagNd;
import sc.ndt.editor.fast.fastfst.aTwrGagNd;
import sc.ndt.editor.fast.fastfst.bCompAero;
import sc.ndt.editor.fast.fastfst.bCompNoise;
import sc.ndt.editor.fast.fastfst.bDrTrDOF;
import sc.ndt.editor.fast.fastfst.bEcho;
import sc.ndt.editor.fast.fastfst.bEdgeDOF;
import sc.ndt.editor.fast.fastfst.bFlapDOF1;
import sc.ndt.editor.fast.fastfst.bFlapDOF2;
import sc.ndt.editor.fast.fastfst.bFurling;
import sc.ndt.editor.fast.fastfst.bGBRevers;
import sc.ndt.editor.fast.fastfst.bGenDOF;
import sc.ndt.editor.fast.fastfst.bGenTiStp;
import sc.ndt.editor.fast.fastfst.bGenTiStr;
import sc.ndt.editor.fast.fastfst.bOutFileFmt;
import sc.ndt.editor.fast.fastfst.bSumPrint;
import sc.ndt.editor.fast.fastfst.bTabDelim;
import sc.ndt.editor.fast.fastfst.bTeetDOF;
import sc.ndt.editor.fast.fastfst.bTwFADOF1;
import sc.ndt.editor.fast.fastfst.bTwFADOF2;
import sc.ndt.editor.fast.fastfst.bTwSSDOF1;
import sc.ndt.editor.fast.fastfst.bTwSSDOF2;
import sc.ndt.editor.fast.fastfst.bYawDOF;
import sc.ndt.editor.fast.fastfst.fADAMSFile;
import sc.ndt.editor.fast.fastfst.fADFile;
import sc.ndt.editor.fast.fastfst.fBldFile_1_;
import sc.ndt.editor.fast.fastfst.fBldFile_2_;
import sc.ndt.editor.fast.fastfst.fBldFile_3_;
import sc.ndt.editor.fast.fastfst.fDynBrkFi;
import sc.ndt.editor.fast.fastfst.fFurlFile;
import sc.ndt.editor.fast.fastfst.fLinFile;
import sc.ndt.editor.fast.fastfst.fNoiseFile;
import sc.ndt.editor.fast.fastfst.fPtfmFile;
import sc.ndt.editor.fast.fastfst.fTwrFile;
import sc.ndt.editor.fast.fastfst.iADAMSPrep;
import sc.ndt.editor.fast.fastfst.iAnalMode;
import sc.ndt.editor.fast.fastfst.iDecFact;
import sc.ndt.editor.fast.fastfst.iGenModel;
import sc.ndt.editor.fast.fastfst.iHSSBrMode;
import sc.ndt.editor.fast.fastfst.iNBlGages;
import sc.ndt.editor.fast.fastfst.iNTwGages;
import sc.ndt.editor.fast.fastfst.iNumBl;
import sc.ndt.editor.fast.fastfst.iPCMode;
import sc.ndt.editor.fast.fastfst.iPtfmModel;
import sc.ndt.editor.fast.fastfst.iTeetMod;
import sc.ndt.editor.fast.fastfst.iTwrNodes;
import sc.ndt.editor.fast.fastfst.iVSContrl;
import sc.ndt.editor.fast.fastfst.iYCMode;
import sc.ndt.editor.fast.fastfst.nAzimB1Up;
import sc.ndt.editor.fast.fastfst.nAzimuth;
import sc.ndt.editor.fast.fastfst.nBlPitchF_1_;
import sc.ndt.editor.fast.fastfst.nBlPitchF_2_;
import sc.ndt.editor.fast.fastfst.nBlPitchF_3_;
import sc.ndt.editor.fast.fastfst.nBlPitch_1_;
import sc.ndt.editor.fast.fastfst.nBlPitch_2_;
import sc.ndt.editor.fast.fastfst.nBlPitch_3_;
import sc.ndt.editor.fast.fastfst.nDT;
import sc.ndt.editor.fast.fastfst.nDTTorDmp;
import sc.ndt.editor.fast.fastfst.nDTTorSpr;
import sc.ndt.editor.fast.fastfst.nDelta3;
import sc.ndt.editor.fast.fastfst.nGBRatio;
import sc.ndt.editor.fast.fastfst.nGBoxEff;
import sc.ndt.editor.fast.fastfst.nGenEff;
import sc.ndt.editor.fast.fastfst.nGenIner;
import sc.ndt.editor.fast.fastfst.nGravity;
import sc.ndt.editor.fast.fastfst.nHSSBrDT;
import sc.ndt.editor.fast.fastfst.nHSSBrTqF;
import sc.ndt.editor.fast.fastfst.nHubCM;
import sc.ndt.editor.fast.fastfst.nHubIner;
import sc.ndt.editor.fast.fastfst.nHubMass;
import sc.ndt.editor.fast.fastfst.nHubRad;
import sc.ndt.editor.fast.fastfst.nIPDefl;
import sc.ndt.editor.fast.fastfst.nNacCMxn;
import sc.ndt.editor.fast.fastfst.nNacCMyn;
import sc.ndt.editor.fast.fastfst.nNacCMzn;
import sc.ndt.editor.fast.fastfst.nNacMass;
import sc.ndt.editor.fast.fastfst.nNacYIner;
import sc.ndt.editor.fast.fastfst.nNacYaw;
import sc.ndt.editor.fast.fastfst.nNacYawF;
import sc.ndt.editor.fast.fastfst.nNcIMUxn;
import sc.ndt.editor.fast.fastfst.nNcIMUyn;
import sc.ndt.editor.fast.fastfst.nNcIMUzn;
import sc.ndt.editor.fast.fastfst.nOoPDefl;
import sc.ndt.editor.fast.fastfst.nOverHang;
import sc.ndt.editor.fast.fastfst.nPSpnElN;
import sc.ndt.editor.fast.fastfst.nPreCone_1_;
import sc.ndt.editor.fast.fastfst.nPreCone_2_;
import sc.ndt.editor.fast.fastfst.nPreCone_3_;
import sc.ndt.editor.fast.fastfst.nRotSpeed;
import sc.ndt.editor.fast.fastfst.nSIG_PORt;
import sc.ndt.editor.fast.fastfst.nSIG_RtTq;
import sc.ndt.editor.fast.fastfst.nSIG_SlPc;
import sc.ndt.editor.fast.fastfst.nSIG_SySp;
import sc.ndt.editor.fast.fastfst.nShftGagL;
import sc.ndt.editor.fast.fastfst.nShftTilt;
import sc.ndt.editor.fast.fastfst.nSpdGenOn;
import sc.ndt.editor.fast.fastfst.nSttsTime;
import sc.ndt.editor.fast.fastfst.nTBDepISp_1_;
import sc.ndt.editor.fast.fastfst.nTBDepISp_2_;
import sc.ndt.editor.fast.fastfst.nTBDepISp_3_;
import sc.ndt.editor.fast.fastfst.nTBDrConD;
import sc.ndt.editor.fast.fastfst.nTBDrConN;
import sc.ndt.editor.fast.fastfst.nTEC_Freq;
import sc.ndt.editor.fast.fastfst.nTEC_MR;
import sc.ndt.editor.fast.fastfst.nTEC_Npol;
import sc.ndt.editor.fast.fastfst.nTEC_RLR;
import sc.ndt.editor.fast.fastfst.nTEC_Rres;
import sc.ndt.editor.fast.fastfst.nTEC_SLR;
import sc.ndt.editor.fast.fastfst.nTEC_Sres;
import sc.ndt.editor.fast.fastfst.nTEC_VLL;
import sc.ndt.editor.fast.fastfst.nTHSSBrDp;
import sc.ndt.editor.fast.fastfst.nTMax;
import sc.ndt.editor.fast.fastfst.nTPCOn;
import sc.ndt.editor.fast.fastfst.nTPitManE_1_;
import sc.ndt.editor.fast.fastfst.nTPitManE_2_;
import sc.ndt.editor.fast.fastfst.nTPitManE_3_;
import sc.ndt.editor.fast.fastfst.nTPitManS_1_;
import sc.ndt.editor.fast.fastfst.nTPitManS_2_;
import sc.ndt.editor.fast.fastfst.nTPitManS_3_;
import sc.ndt.editor.fast.fastfst.nTStart;
import sc.ndt.editor.fast.fastfst.nTTDspFA;
import sc.ndt.editor.fast.fastfst.nTTDspSS;
import sc.ndt.editor.fast.fastfst.nTTpBrDp_1_;
import sc.ndt.editor.fast.fastfst.nTTpBrDp_2_;
import sc.ndt.editor.fast.fastfst.nTTpBrDp_3_;
import sc.ndt.editor.fast.fastfst.nTYCOn;
import sc.ndt.editor.fast.fastfst.nTYawManE;
import sc.ndt.editor.fast.fastfst.nTYawManS;
import sc.ndt.editor.fast.fastfst.nTeetCDmp;
import sc.ndt.editor.fast.fastfst.nTeetDefl;
import sc.ndt.editor.fast.fastfst.nTeetDmp;
import sc.ndt.editor.fast.fastfst.nTeetDmpP;
import sc.ndt.editor.fast.fastfst.nTeetHSSp;
import sc.ndt.editor.fast.fastfst.nTeetHStP;
import sc.ndt.editor.fast.fastfst.nTeetSSSp;
import sc.ndt.editor.fast.fastfst.nTeetSStP;
import sc.ndt.editor.fast.fastfst.nTiDynBrk;
import sc.ndt.editor.fast.fastfst.nTimGenOf;
import sc.ndt.editor.fast.fastfst.nTimGenOn;
import sc.ndt.editor.fast.fastfst.nTipMass_1_;
import sc.ndt.editor.fast.fastfst.nTipMass_2_;
import sc.ndt.editor.fast.fastfst.nTipMass_3_;
import sc.ndt.editor.fast.fastfst.nTipRad;
import sc.ndt.editor.fast.fastfst.nTowerHt;
import sc.ndt.editor.fast.fastfst.nTpBrDT;
import sc.ndt.editor.fast.fastfst.nTwr2Shft;
import sc.ndt.editor.fast.fastfst.nTwrRBHt;
import sc.ndt.editor.fast.fastfst.nUndSling;
import sc.ndt.editor.fast.fastfst.nVS_Rgn2K;
import sc.ndt.editor.fast.fastfst.nVS_RtGnSp;
import sc.ndt.editor.fast.fastfst.nVS_RtTq;
import sc.ndt.editor.fast.fastfst.nVS_SlPc;
import sc.ndt.editor.fast.fastfst.nYawBrMass;
import sc.ndt.editor.fast.fastfst.nYawDamp;
import sc.ndt.editor.fast.fastfst.nYawNeut;
import sc.ndt.editor.fast.fastfst.nYawSpr;
import sc.ndt.editor.fast.fastfst.sOutFmt;
import sc.ndt.editor.fast.fastfst.vOutList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Fastfst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getEcho <em>Echo</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getADAMSPrep <em>ADAMS Prep</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getAnalMode <em>Anal Mode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNumBl <em>Num Bl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTMax <em>TMax</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getDT <em>DT</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getYCMode <em>YC Mode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTYCOn <em>TYC On</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getPCMode <em>PC Mode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTPCOn <em>TPC On</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getVSContrl <em>VS Contrl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getVS_RtGnSp <em>VS Rt Gn Sp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getVS_RtTq <em>VS Rt Tq</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getVS_Rgn2K <em>VS Rgn2 K</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getVS_SlPc <em>VS Sl Pc</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGenTiStr <em>Gen Ti Str</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGenTiStp <em>Gen Ti Stp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getSpdGenOn <em>Spd Gen On</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTimGenOn <em>Tim Gen On</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTimGenOf <em>Tim Gen Of</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getHSSBrMode <em>HSS Br Mode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTHSSBrDp <em>THSS Br Dp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTiDynBrk <em>Ti Dyn Brk</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTTpBrDp_1_ <em>TTp Br Dp 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTTpBrDp_2_ <em>TTp Br Dp 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTTpBrDp_3_ <em>TTp Br Dp 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTBDepISp_1_ <em>TB Dep ISp 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTBDepISp_2_ <em>TB Dep ISp 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTBDepISp_3_ <em>TB Dep ISp 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTYawManS <em>TYaw Man S</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTYawManE <em>TYaw Man E</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNacYawF <em>Nac Yaw F</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTPitManS_1_ <em>TPit Man S1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTPitManS_2_ <em>TPit Man S2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTPitManS_3_ <em>TPit Man S3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTPitManE_1_ <em>TPit Man E1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTPitManE_2_ <em>TPit Man E2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTPitManE_3_ <em>TPit Man E3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBlPitch_1_ <em>Bl Pitch 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBlPitch_2_ <em>Bl Pitch 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBlPitch_3_ <em>Bl Pitch 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBlPitchF_1_ <em>Bl Pitch F1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBlPitchF_2_ <em>Bl Pitch F2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBlPitchF_3_ <em>Bl Pitch F3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGravity <em>Gravity</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getFlapDOF1 <em>Flap DOF1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getFlapDOF2 <em>Flap DOF2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getEdgeDOF <em>Edge DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetDOF <em>Teet DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getDrTrDOF <em>Dr Tr DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGenDOF <em>Gen DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getYawDOF <em>Yaw DOF</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwFADOF1 <em>Tw FADOF1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwFADOF2 <em>Tw FADOF2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwSSDOF1 <em>Tw SSDOF1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwSSDOF2 <em>Tw SSDOF2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getCompAero <em>Comp Aero</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getCompNoise <em>Comp Noise</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getOoPDefl <em>Oo PDefl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getIPDefl <em>IP Defl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetDefl <em>Teet Defl</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getRotSpeed <em>Rot Speed</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNacYaw <em>Nac Yaw</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTTDspFA <em>TT Dsp FA</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTTDspSS <em>TT Dsp SS</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTipRad <em>Tip Rad</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getHubRad <em>Hub Rad</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getPSpnElN <em>PSpn El N</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getUndSling <em>Und Sling</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getHubCM <em>Hub CM</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getOverHang <em>Over Hang</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNacCMxn <em>Nac CMxn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNacCMyn <em>Nac CMyn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNacCMzn <em>Nac CMzn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTowerHt <em>Tower Ht</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwr2Shft <em>Twr2 Shft</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwrRBHt <em>Twr RB Ht</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getShftTilt <em>Shft Tilt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getDelta3 <em>Delta3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getPreCone_1_ <em>Pre Cone 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getPreCone_2_ <em>Pre Cone 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getPreCone_3_ <em>Pre Cone 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getAzimB1Up <em>Azim B1 Up</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getYawBrMass <em>Yaw Br Mass</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNacMass <em>Nac Mass</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getHubMass <em>Hub Mass</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTipMass_1_ <em>Tip Mass 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTipMass_2_ <em>Tip Mass 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTipMass_3_ <em>Tip Mass 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNacYIner <em>Nac YIner</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGenIner <em>Gen Iner</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getHubIner <em>Hub Iner</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGBoxEff <em>GBox Eff</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGenEff <em>Gen Eff</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGBRatio <em>GB Ratio</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getGBRevers <em>GB Revers</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getHSSBrTqF <em>HSS Br Tq F</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getHSSBrDT <em>HSS Br DT</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getDynBrkFi <em>Dyn Brk Fi</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getDTTorSpr <em>DT Tor Spr</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getDTTorDmp <em>DT Tor Dmp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getSIG_SlPc <em>SIG Sl Pc</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getSIG_SySp <em>SIG Sy Sp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getSIG_RtTq <em>SIG Rt Tq</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getSIG_PORt <em>SIG PO Rt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTEC_Freq <em>TEC Freq</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTEC_Npol <em>TEC Npol</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTEC_Sres <em>TEC Sres</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTEC_Rres <em>TEC Rres</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTEC_VLL <em>TEC VLL</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTEC_SLR <em>TEC SLR</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTEC_RLR <em>TEC RLR</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTEC_MR <em>TEC MR</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getPtfmModel <em>Ptfm Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getPtfmFile <em>Ptfm File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwrNodes <em>Twr Nodes</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwrFile <em>Twr File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getYawSpr <em>Yaw Spr</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getYawDamp <em>Yaw Damp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getYawNeut <em>Yaw Neut</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getFurling <em>Furling</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getFurlFile <em>Furl File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetMod <em>Teet Mod</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetDmpP <em>Teet Dmp P</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetDmp <em>Teet Dmp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetCDmp <em>Teet CDmp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetSStP <em>Teet SSt P</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetHStP <em>Teet HSt P</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetSSSp <em>Teet SS Sp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTeetHSSp <em>Teet HS Sp</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTBDrConN <em>TB Dr Con N</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTBDrConD <em>TB Dr Con D</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTpBrDT <em>Tp Br DT</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBldFile_1_ <em>Bld File 1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBldFile_2_ <em>Bld File 2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBldFile_3_ <em>Bld File 3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getADFile <em>AD File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNoiseFile <em>Noise File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getADAMSFile <em>ADAMS File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getLinFile <em>Lin File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getSumPrint <em>Sum Print</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getOutFileFmt <em>Out File Fmt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTabDelim <em>Tab Delim</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getOutFmt <em>Out Fmt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTStart <em>TStart</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getDecFact <em>Dec Fact</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getSttsTime <em>Stts Time</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNcIMUxn <em>Nc IM Uxn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNcIMUyn <em>Nc IM Uyn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNcIMUzn <em>Nc IM Uzn</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getShftGagL <em>Shft Gag L</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNTwGages <em>NTw Gages</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getTwrGagNd <em>Twr Gag Nd</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getNBlGages <em>NBl Gages</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getBldGagNd <em>Bld Gag Nd</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.impl.ModelFastfstImpl#getOutList <em>Out List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelFastfstImpl extends MinimalEObjectImpl.Container implements ModelFastfst
{
  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected Header head;

  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<Section> sections;

  /**
   * The cached value of the '{@link #getEcho() <em>Echo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcho()
   * @generated
   * @ordered
   */
  protected bEcho echo;

  /**
   * The cached value of the '{@link #getADAMSPrep() <em>ADAMS Prep</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADAMSPrep()
   * @generated
   * @ordered
   */
  protected iADAMSPrep adamsPrep;

  /**
   * The cached value of the '{@link #getAnalMode() <em>Anal Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalMode()
   * @generated
   * @ordered
   */
  protected iAnalMode analMode;

  /**
   * The cached value of the '{@link #getNumBl() <em>Num Bl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumBl()
   * @generated
   * @ordered
   */
  protected iNumBl numBl;

  /**
   * The cached value of the '{@link #getTMax() <em>TMax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTMax()
   * @generated
   * @ordered
   */
  protected nTMax tMax;

  /**
   * The cached value of the '{@link #getDT() <em>DT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDT()
   * @generated
   * @ordered
   */
  protected nDT dt;

  /**
   * The cached value of the '{@link #getYCMode() <em>YC Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYCMode()
   * @generated
   * @ordered
   */
  protected iYCMode ycMode;

  /**
   * The cached value of the '{@link #getTYCOn() <em>TYC On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTYCOn()
   * @generated
   * @ordered
   */
  protected nTYCOn tycOn;

  /**
   * The cached value of the '{@link #getPCMode() <em>PC Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPCMode()
   * @generated
   * @ordered
   */
  protected iPCMode pcMode;

  /**
   * The cached value of the '{@link #getTPCOn() <em>TPC On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTPCOn()
   * @generated
   * @ordered
   */
  protected nTPCOn tpcOn;

  /**
   * The cached value of the '{@link #getVSContrl() <em>VS Contrl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVSContrl()
   * @generated
   * @ordered
   */
  protected iVSContrl vsContrl;

  /**
   * The cached value of the '{@link #getVS_RtGnSp() <em>VS Rt Gn Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVS_RtGnSp()
   * @generated
   * @ordered
   */
  protected nVS_RtGnSp vS_RtGnSp;

  /**
   * The cached value of the '{@link #getVS_RtTq() <em>VS Rt Tq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVS_RtTq()
   * @generated
   * @ordered
   */
  protected nVS_RtTq vS_RtTq;

  /**
   * The cached value of the '{@link #getVS_Rgn2K() <em>VS Rgn2 K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVS_Rgn2K()
   * @generated
   * @ordered
   */
  protected nVS_Rgn2K vS_Rgn2K;

  /**
   * The cached value of the '{@link #getVS_SlPc() <em>VS Sl Pc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVS_SlPc()
   * @generated
   * @ordered
   */
  protected nVS_SlPc vS_SlPc;

  /**
   * The cached value of the '{@link #getGenModel() <em>Gen Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenModel()
   * @generated
   * @ordered
   */
  protected iGenModel genModel;

  /**
   * The cached value of the '{@link #getGenTiStr() <em>Gen Ti Str</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenTiStr()
   * @generated
   * @ordered
   */
  protected bGenTiStr genTiStr;

  /**
   * The cached value of the '{@link #getGenTiStp() <em>Gen Ti Stp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenTiStp()
   * @generated
   * @ordered
   */
  protected bGenTiStp genTiStp;

  /**
   * The cached value of the '{@link #getSpdGenOn() <em>Spd Gen On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpdGenOn()
   * @generated
   * @ordered
   */
  protected nSpdGenOn spdGenOn;

  /**
   * The cached value of the '{@link #getTimGenOn() <em>Tim Gen On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimGenOn()
   * @generated
   * @ordered
   */
  protected nTimGenOn timGenOn;

  /**
   * The cached value of the '{@link #getTimGenOf() <em>Tim Gen Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimGenOf()
   * @generated
   * @ordered
   */
  protected nTimGenOf timGenOf;

  /**
   * The cached value of the '{@link #getHSSBrMode() <em>HSS Br Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHSSBrMode()
   * @generated
   * @ordered
   */
  protected iHSSBrMode hssBrMode;

  /**
   * The cached value of the '{@link #getTHSSBrDp() <em>THSS Br Dp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTHSSBrDp()
   * @generated
   * @ordered
   */
  protected nTHSSBrDp thssBrDp;

  /**
   * The cached value of the '{@link #getTiDynBrk() <em>Ti Dyn Brk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTiDynBrk()
   * @generated
   * @ordered
   */
  protected nTiDynBrk tiDynBrk;

  /**
   * The cached value of the '{@link #getTTpBrDp_1_() <em>TTp Br Dp 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTTpBrDp_1_()
   * @generated
   * @ordered
   */
  protected nTTpBrDp_1_ tTpBrDp_1_;

  /**
   * The cached value of the '{@link #getTTpBrDp_2_() <em>TTp Br Dp 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTTpBrDp_2_()
   * @generated
   * @ordered
   */
  protected nTTpBrDp_2_ tTpBrDp_2_;

  /**
   * The cached value of the '{@link #getTTpBrDp_3_() <em>TTp Br Dp 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTTpBrDp_3_()
   * @generated
   * @ordered
   */
  protected nTTpBrDp_3_ tTpBrDp_3_;

  /**
   * The cached value of the '{@link #getTBDepISp_1_() <em>TB Dep ISp 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTBDepISp_1_()
   * @generated
   * @ordered
   */
  protected nTBDepISp_1_ tbDepISp_1_;

  /**
   * The cached value of the '{@link #getTBDepISp_2_() <em>TB Dep ISp 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTBDepISp_2_()
   * @generated
   * @ordered
   */
  protected nTBDepISp_2_ tbDepISp_2_;

  /**
   * The cached value of the '{@link #getTBDepISp_3_() <em>TB Dep ISp 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTBDepISp_3_()
   * @generated
   * @ordered
   */
  protected nTBDepISp_3_ tbDepISp_3_;

  /**
   * The cached value of the '{@link #getTYawManS() <em>TYaw Man S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTYawManS()
   * @generated
   * @ordered
   */
  protected nTYawManS tYawManS;

  /**
   * The cached value of the '{@link #getTYawManE() <em>TYaw Man E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTYawManE()
   * @generated
   * @ordered
   */
  protected nTYawManE tYawManE;

  /**
   * The cached value of the '{@link #getNacYawF() <em>Nac Yaw F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNacYawF()
   * @generated
   * @ordered
   */
  protected nNacYawF nacYawF;

  /**
   * The cached value of the '{@link #getTPitManS_1_() <em>TPit Man S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTPitManS_1_()
   * @generated
   * @ordered
   */
  protected nTPitManS_1_ tPitManS_1_;

  /**
   * The cached value of the '{@link #getTPitManS_2_() <em>TPit Man S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTPitManS_2_()
   * @generated
   * @ordered
   */
  protected nTPitManS_2_ tPitManS_2_;

  /**
   * The cached value of the '{@link #getTPitManS_3_() <em>TPit Man S3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTPitManS_3_()
   * @generated
   * @ordered
   */
  protected nTPitManS_3_ tPitManS_3_;

  /**
   * The cached value of the '{@link #getTPitManE_1_() <em>TPit Man E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTPitManE_1_()
   * @generated
   * @ordered
   */
  protected nTPitManE_1_ tPitManE_1_;

  /**
   * The cached value of the '{@link #getTPitManE_2_() <em>TPit Man E2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTPitManE_2_()
   * @generated
   * @ordered
   */
  protected nTPitManE_2_ tPitManE_2_;

  /**
   * The cached value of the '{@link #getTPitManE_3_() <em>TPit Man E3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTPitManE_3_()
   * @generated
   * @ordered
   */
  protected nTPitManE_3_ tPitManE_3_;

  /**
   * The cached value of the '{@link #getBlPitch_1_() <em>Bl Pitch 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlPitch_1_()
   * @generated
   * @ordered
   */
  protected nBlPitch_1_ blPitch_1_;

  /**
   * The cached value of the '{@link #getBlPitch_2_() <em>Bl Pitch 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlPitch_2_()
   * @generated
   * @ordered
   */
  protected nBlPitch_2_ blPitch_2_;

  /**
   * The cached value of the '{@link #getBlPitch_3_() <em>Bl Pitch 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlPitch_3_()
   * @generated
   * @ordered
   */
  protected nBlPitch_3_ blPitch_3_;

  /**
   * The cached value of the '{@link #getBlPitchF_1_() <em>Bl Pitch F1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlPitchF_1_()
   * @generated
   * @ordered
   */
  protected nBlPitchF_1_ blPitchF_1_;

  /**
   * The cached value of the '{@link #getBlPitchF_2_() <em>Bl Pitch F2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlPitchF_2_()
   * @generated
   * @ordered
   */
  protected nBlPitchF_2_ blPitchF_2_;

  /**
   * The cached value of the '{@link #getBlPitchF_3_() <em>Bl Pitch F3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlPitchF_3_()
   * @generated
   * @ordered
   */
  protected nBlPitchF_3_ blPitchF_3_;

  /**
   * The cached value of the '{@link #getGravity() <em>Gravity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
  protected nGravity gravity;

  /**
   * The cached value of the '{@link #getFlapDOF1() <em>Flap DOF1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlapDOF1()
   * @generated
   * @ordered
   */
  protected bFlapDOF1 flapDOF1;

  /**
   * The cached value of the '{@link #getFlapDOF2() <em>Flap DOF2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlapDOF2()
   * @generated
   * @ordered
   */
  protected bFlapDOF2 flapDOF2;

  /**
   * The cached value of the '{@link #getEdgeDOF() <em>Edge DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgeDOF()
   * @generated
   * @ordered
   */
  protected bEdgeDOF edgeDOF;

  /**
   * The cached value of the '{@link #getTeetDOF() <em>Teet DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetDOF()
   * @generated
   * @ordered
   */
  protected bTeetDOF teetDOF;

  /**
   * The cached value of the '{@link #getDrTrDOF() <em>Dr Tr DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrTrDOF()
   * @generated
   * @ordered
   */
  protected bDrTrDOF drTrDOF;

  /**
   * The cached value of the '{@link #getGenDOF() <em>Gen DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenDOF()
   * @generated
   * @ordered
   */
  protected bGenDOF genDOF;

  /**
   * The cached value of the '{@link #getYawDOF() <em>Yaw DOF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYawDOF()
   * @generated
   * @ordered
   */
  protected bYawDOF yawDOF;

  /**
   * The cached value of the '{@link #getTwFADOF1() <em>Tw FADOF1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFADOF1()
   * @generated
   * @ordered
   */
  protected bTwFADOF1 twFADOF1;

  /**
   * The cached value of the '{@link #getTwFADOF2() <em>Tw FADOF2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFADOF2()
   * @generated
   * @ordered
   */
  protected bTwFADOF2 twFADOF2;

  /**
   * The cached value of the '{@link #getTwSSDOF1() <em>Tw SSDOF1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSDOF1()
   * @generated
   * @ordered
   */
  protected bTwSSDOF1 twSSDOF1;

  /**
   * The cached value of the '{@link #getTwSSDOF2() <em>Tw SSDOF2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSDOF2()
   * @generated
   * @ordered
   */
  protected bTwSSDOF2 twSSDOF2;

  /**
   * The cached value of the '{@link #getCompAero() <em>Comp Aero</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompAero()
   * @generated
   * @ordered
   */
  protected bCompAero compAero;

  /**
   * The cached value of the '{@link #getCompNoise() <em>Comp Noise</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompNoise()
   * @generated
   * @ordered
   */
  protected bCompNoise compNoise;

  /**
   * The cached value of the '{@link #getOoPDefl() <em>Oo PDefl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOoPDefl()
   * @generated
   * @ordered
   */
  protected nOoPDefl ooPDefl;

  /**
   * The cached value of the '{@link #getIPDefl() <em>IP Defl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIPDefl()
   * @generated
   * @ordered
   */
  protected nIPDefl ipDefl;

  /**
   * The cached value of the '{@link #getTeetDefl() <em>Teet Defl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetDefl()
   * @generated
   * @ordered
   */
  protected nTeetDefl teetDefl;

  /**
   * The cached value of the '{@link #getAzimuth() <em>Azimuth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAzimuth()
   * @generated
   * @ordered
   */
  protected nAzimuth azimuth;

  /**
   * The cached value of the '{@link #getRotSpeed() <em>Rot Speed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotSpeed()
   * @generated
   * @ordered
   */
  protected nRotSpeed rotSpeed;

  /**
   * The cached value of the '{@link #getNacYaw() <em>Nac Yaw</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNacYaw()
   * @generated
   * @ordered
   */
  protected nNacYaw nacYaw;

  /**
   * The cached value of the '{@link #getTTDspFA() <em>TT Dsp FA</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTTDspFA()
   * @generated
   * @ordered
   */
  protected nTTDspFA ttDspFA;

  /**
   * The cached value of the '{@link #getTTDspSS() <em>TT Dsp SS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTTDspSS()
   * @generated
   * @ordered
   */
  protected nTTDspSS ttDspSS;

  /**
   * The cached value of the '{@link #getTipRad() <em>Tip Rad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipRad()
   * @generated
   * @ordered
   */
  protected nTipRad tipRad;

  /**
   * The cached value of the '{@link #getHubRad() <em>Hub Rad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubRad()
   * @generated
   * @ordered
   */
  protected nHubRad hubRad;

  /**
   * The cached value of the '{@link #getPSpnElN() <em>PSpn El N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPSpnElN()
   * @generated
   * @ordered
   */
  protected nPSpnElN pSpnElN;

  /**
   * The cached value of the '{@link #getUndSling() <em>Und Sling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUndSling()
   * @generated
   * @ordered
   */
  protected nUndSling undSling;

  /**
   * The cached value of the '{@link #getHubCM() <em>Hub CM</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubCM()
   * @generated
   * @ordered
   */
  protected nHubCM hubCM;

  /**
   * The cached value of the '{@link #getOverHang() <em>Over Hang</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverHang()
   * @generated
   * @ordered
   */
  protected nOverHang overHang;

  /**
   * The cached value of the '{@link #getNacCMxn() <em>Nac CMxn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNacCMxn()
   * @generated
   * @ordered
   */
  protected nNacCMxn nacCMxn;

  /**
   * The cached value of the '{@link #getNacCMyn() <em>Nac CMyn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNacCMyn()
   * @generated
   * @ordered
   */
  protected nNacCMyn nacCMyn;

  /**
   * The cached value of the '{@link #getNacCMzn() <em>Nac CMzn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNacCMzn()
   * @generated
   * @ordered
   */
  protected nNacCMzn nacCMzn;

  /**
   * The cached value of the '{@link #getTowerHt() <em>Tower Ht</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTowerHt()
   * @generated
   * @ordered
   */
  protected nTowerHt towerHt;

  /**
   * The cached value of the '{@link #getTwr2Shft() <em>Twr2 Shft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwr2Shft()
   * @generated
   * @ordered
   */
  protected nTwr2Shft twr2Shft;

  /**
   * The cached value of the '{@link #getTwrRBHt() <em>Twr RB Ht</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrRBHt()
   * @generated
   * @ordered
   */
  protected nTwrRBHt twrRBHt;

  /**
   * The cached value of the '{@link #getShftTilt() <em>Shft Tilt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShftTilt()
   * @generated
   * @ordered
   */
  protected nShftTilt shftTilt;

  /**
   * The cached value of the '{@link #getDelta3() <em>Delta3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta3()
   * @generated
   * @ordered
   */
  protected nDelta3 delta3;

  /**
   * The cached value of the '{@link #getPreCone_1_() <em>Pre Cone 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreCone_1_()
   * @generated
   * @ordered
   */
  protected nPreCone_1_ preCone_1_;

  /**
   * The cached value of the '{@link #getPreCone_2_() <em>Pre Cone 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreCone_2_()
   * @generated
   * @ordered
   */
  protected nPreCone_2_ preCone_2_;

  /**
   * The cached value of the '{@link #getPreCone_3_() <em>Pre Cone 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreCone_3_()
   * @generated
   * @ordered
   */
  protected nPreCone_3_ preCone_3_;

  /**
   * The cached value of the '{@link #getAzimB1Up() <em>Azim B1 Up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAzimB1Up()
   * @generated
   * @ordered
   */
  protected nAzimB1Up azimB1Up;

  /**
   * The cached value of the '{@link #getYawBrMass() <em>Yaw Br Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYawBrMass()
   * @generated
   * @ordered
   */
  protected nYawBrMass yawBrMass;

  /**
   * The cached value of the '{@link #getNacMass() <em>Nac Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNacMass()
   * @generated
   * @ordered
   */
  protected nNacMass nacMass;

  /**
   * The cached value of the '{@link #getHubMass() <em>Hub Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubMass()
   * @generated
   * @ordered
   */
  protected nHubMass hubMass;

  /**
   * The cached value of the '{@link #getTipMass_1_() <em>Tip Mass 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipMass_1_()
   * @generated
   * @ordered
   */
  protected nTipMass_1_ tipMass_1_;

  /**
   * The cached value of the '{@link #getTipMass_2_() <em>Tip Mass 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipMass_2_()
   * @generated
   * @ordered
   */
  protected nTipMass_2_ tipMass_2_;

  /**
   * The cached value of the '{@link #getTipMass_3_() <em>Tip Mass 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipMass_3_()
   * @generated
   * @ordered
   */
  protected nTipMass_3_ tipMass_3_;

  /**
   * The cached value of the '{@link #getNacYIner() <em>Nac YIner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNacYIner()
   * @generated
   * @ordered
   */
  protected nNacYIner nacYIner;

  /**
   * The cached value of the '{@link #getGenIner() <em>Gen Iner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenIner()
   * @generated
   * @ordered
   */
  protected nGenIner genIner;

  /**
   * The cached value of the '{@link #getHubIner() <em>Hub Iner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubIner()
   * @generated
   * @ordered
   */
  protected nHubIner hubIner;

  /**
   * The cached value of the '{@link #getGBoxEff() <em>GBox Eff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGBoxEff()
   * @generated
   * @ordered
   */
  protected nGBoxEff gBoxEff;

  /**
   * The cached value of the '{@link #getGenEff() <em>Gen Eff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenEff()
   * @generated
   * @ordered
   */
  protected nGenEff genEff;

  /**
   * The cached value of the '{@link #getGBRatio() <em>GB Ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGBRatio()
   * @generated
   * @ordered
   */
  protected nGBRatio gbRatio;

  /**
   * The cached value of the '{@link #getGBRevers() <em>GB Revers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGBRevers()
   * @generated
   * @ordered
   */
  protected bGBRevers gbRevers;

  /**
   * The cached value of the '{@link #getHSSBrTqF() <em>HSS Br Tq F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHSSBrTqF()
   * @generated
   * @ordered
   */
  protected nHSSBrTqF hssBrTqF;

  /**
   * The cached value of the '{@link #getHSSBrDT() <em>HSS Br DT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHSSBrDT()
   * @generated
   * @ordered
   */
  protected nHSSBrDT hssBrDT;

  /**
   * The cached value of the '{@link #getDynBrkFi() <em>Dyn Brk Fi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDynBrkFi()
   * @generated
   * @ordered
   */
  protected fDynBrkFi dynBrkFi;

  /**
   * The cached value of the '{@link #getDTTorSpr() <em>DT Tor Spr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDTTorSpr()
   * @generated
   * @ordered
   */
  protected nDTTorSpr dtTorSpr;

  /**
   * The cached value of the '{@link #getDTTorDmp() <em>DT Tor Dmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDTTorDmp()
   * @generated
   * @ordered
   */
  protected nDTTorDmp dtTorDmp;

  /**
   * The cached value of the '{@link #getSIG_SlPc() <em>SIG Sl Pc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSIG_SlPc()
   * @generated
   * @ordered
   */
  protected nSIG_SlPc siG_SlPc;

  /**
   * The cached value of the '{@link #getSIG_SySp() <em>SIG Sy Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSIG_SySp()
   * @generated
   * @ordered
   */
  protected nSIG_SySp siG_SySp;

  /**
   * The cached value of the '{@link #getSIG_RtTq() <em>SIG Rt Tq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSIG_RtTq()
   * @generated
   * @ordered
   */
  protected nSIG_RtTq siG_RtTq;

  /**
   * The cached value of the '{@link #getSIG_PORt() <em>SIG PO Rt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSIG_PORt()
   * @generated
   * @ordered
   */
  protected nSIG_PORt siG_PORt;

  /**
   * The cached value of the '{@link #getTEC_Freq() <em>TEC Freq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEC_Freq()
   * @generated
   * @ordered
   */
  protected nTEC_Freq teC_Freq;

  /**
   * The cached value of the '{@link #getTEC_Npol() <em>TEC Npol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEC_Npol()
   * @generated
   * @ordered
   */
  protected nTEC_Npol teC_Npol;

  /**
   * The cached value of the '{@link #getTEC_Sres() <em>TEC Sres</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEC_Sres()
   * @generated
   * @ordered
   */
  protected nTEC_Sres teC_Sres;

  /**
   * The cached value of the '{@link #getTEC_Rres() <em>TEC Rres</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEC_Rres()
   * @generated
   * @ordered
   */
  protected nTEC_Rres teC_Rres;

  /**
   * The cached value of the '{@link #getTEC_VLL() <em>TEC VLL</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEC_VLL()
   * @generated
   * @ordered
   */
  protected nTEC_VLL teC_VLL;

  /**
   * The cached value of the '{@link #getTEC_SLR() <em>TEC SLR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEC_SLR()
   * @generated
   * @ordered
   */
  protected nTEC_SLR teC_SLR;

  /**
   * The cached value of the '{@link #getTEC_RLR() <em>TEC RLR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEC_RLR()
   * @generated
   * @ordered
   */
  protected nTEC_RLR teC_RLR;

  /**
   * The cached value of the '{@link #getTEC_MR() <em>TEC MR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTEC_MR()
   * @generated
   * @ordered
   */
  protected nTEC_MR teC_MR;

  /**
   * The cached value of the '{@link #getPtfmModel() <em>Ptfm Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtfmModel()
   * @generated
   * @ordered
   */
  protected iPtfmModel ptfmModel;

  /**
   * The cached value of the '{@link #getPtfmFile() <em>Ptfm File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtfmFile()
   * @generated
   * @ordered
   */
  protected fPtfmFile ptfmFile;

  /**
   * The cached value of the '{@link #getTwrNodes() <em>Twr Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrNodes()
   * @generated
   * @ordered
   */
  protected iTwrNodes twrNodes;

  /**
   * The cached value of the '{@link #getTwrFile() <em>Twr File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrFile()
   * @generated
   * @ordered
   */
  protected fTwrFile twrFile;

  /**
   * The cached value of the '{@link #getYawSpr() <em>Yaw Spr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYawSpr()
   * @generated
   * @ordered
   */
  protected nYawSpr yawSpr;

  /**
   * The cached value of the '{@link #getYawDamp() <em>Yaw Damp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYawDamp()
   * @generated
   * @ordered
   */
  protected nYawDamp yawDamp;

  /**
   * The cached value of the '{@link #getYawNeut() <em>Yaw Neut</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYawNeut()
   * @generated
   * @ordered
   */
  protected nYawNeut yawNeut;

  /**
   * The cached value of the '{@link #getFurling() <em>Furling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFurling()
   * @generated
   * @ordered
   */
  protected bFurling furling;

  /**
   * The cached value of the '{@link #getFurlFile() <em>Furl File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFurlFile()
   * @generated
   * @ordered
   */
  protected fFurlFile furlFile;

  /**
   * The cached value of the '{@link #getTeetMod() <em>Teet Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetMod()
   * @generated
   * @ordered
   */
  protected iTeetMod teetMod;

  /**
   * The cached value of the '{@link #getTeetDmpP() <em>Teet Dmp P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetDmpP()
   * @generated
   * @ordered
   */
  protected nTeetDmpP teetDmpP;

  /**
   * The cached value of the '{@link #getTeetDmp() <em>Teet Dmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetDmp()
   * @generated
   * @ordered
   */
  protected nTeetDmp teetDmp;

  /**
   * The cached value of the '{@link #getTeetCDmp() <em>Teet CDmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetCDmp()
   * @generated
   * @ordered
   */
  protected nTeetCDmp teetCDmp;

  /**
   * The cached value of the '{@link #getTeetSStP() <em>Teet SSt P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetSStP()
   * @generated
   * @ordered
   */
  protected nTeetSStP teetSStP;

  /**
   * The cached value of the '{@link #getTeetHStP() <em>Teet HSt P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetHStP()
   * @generated
   * @ordered
   */
  protected nTeetHStP teetHStP;

  /**
   * The cached value of the '{@link #getTeetSSSp() <em>Teet SS Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetSSSp()
   * @generated
   * @ordered
   */
  protected nTeetSSSp teetSSSp;

  /**
   * The cached value of the '{@link #getTeetHSSp() <em>Teet HS Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeetHSSp()
   * @generated
   * @ordered
   */
  protected nTeetHSSp teetHSSp;

  /**
   * The cached value of the '{@link #getTBDrConN() <em>TB Dr Con N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTBDrConN()
   * @generated
   * @ordered
   */
  protected nTBDrConN tbDrConN;

  /**
   * The cached value of the '{@link #getTBDrConD() <em>TB Dr Con D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTBDrConD()
   * @generated
   * @ordered
   */
  protected nTBDrConD tbDrConD;

  /**
   * The cached value of the '{@link #getTpBrDT() <em>Tp Br DT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTpBrDT()
   * @generated
   * @ordered
   */
  protected nTpBrDT tpBrDT;

  /**
   * The cached value of the '{@link #getBldFile_1_() <em>Bld File 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFile_1_()
   * @generated
   * @ordered
   */
  protected fBldFile_1_ bldFile_1_;

  /**
   * The cached value of the '{@link #getBldFile_2_() <em>Bld File 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFile_2_()
   * @generated
   * @ordered
   */
  protected fBldFile_2_ bldFile_2_;

  /**
   * The cached value of the '{@link #getBldFile_3_() <em>Bld File 3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldFile_3_()
   * @generated
   * @ordered
   */
  protected fBldFile_3_ bldFile_3_;

  /**
   * The cached value of the '{@link #getADFile() <em>AD File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADFile()
   * @generated
   * @ordered
   */
  protected fADFile adFile;

  /**
   * The cached value of the '{@link #getNoiseFile() <em>Noise File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoiseFile()
   * @generated
   * @ordered
   */
  protected fNoiseFile noiseFile;

  /**
   * The cached value of the '{@link #getADAMSFile() <em>ADAMS File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADAMSFile()
   * @generated
   * @ordered
   */
  protected fADAMSFile adamsFile;

  /**
   * The cached value of the '{@link #getLinFile() <em>Lin File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinFile()
   * @generated
   * @ordered
   */
  protected fLinFile linFile;

  /**
   * The cached value of the '{@link #getSumPrint() <em>Sum Print</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSumPrint()
   * @generated
   * @ordered
   */
  protected bSumPrint sumPrint;

  /**
   * The cached value of the '{@link #getOutFileFmt() <em>Out File Fmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutFileFmt()
   * @generated
   * @ordered
   */
  protected bOutFileFmt outFileFmt;

  /**
   * The cached value of the '{@link #getTabDelim() <em>Tab Delim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabDelim()
   * @generated
   * @ordered
   */
  protected bTabDelim tabDelim;

  /**
   * The cached value of the '{@link #getOutFmt() <em>Out Fmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutFmt()
   * @generated
   * @ordered
   */
  protected sOutFmt outFmt;

  /**
   * The cached value of the '{@link #getTStart() <em>TStart</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTStart()
   * @generated
   * @ordered
   */
  protected nTStart tStart;

  /**
   * The cached value of the '{@link #getDecFact() <em>Dec Fact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecFact()
   * @generated
   * @ordered
   */
  protected iDecFact decFact;

  /**
   * The cached value of the '{@link #getSttsTime() <em>Stts Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSttsTime()
   * @generated
   * @ordered
   */
  protected nSttsTime sttsTime;

  /**
   * The cached value of the '{@link #getNcIMUxn() <em>Nc IM Uxn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNcIMUxn()
   * @generated
   * @ordered
   */
  protected nNcIMUxn ncIMUxn;

  /**
   * The cached value of the '{@link #getNcIMUyn() <em>Nc IM Uyn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNcIMUyn()
   * @generated
   * @ordered
   */
  protected nNcIMUyn ncIMUyn;

  /**
   * The cached value of the '{@link #getNcIMUzn() <em>Nc IM Uzn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNcIMUzn()
   * @generated
   * @ordered
   */
  protected nNcIMUzn ncIMUzn;

  /**
   * The cached value of the '{@link #getShftGagL() <em>Shft Gag L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShftGagL()
   * @generated
   * @ordered
   */
  protected nShftGagL shftGagL;

  /**
   * The cached value of the '{@link #getNTwGages() <em>NTw Gages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNTwGages()
   * @generated
   * @ordered
   */
  protected iNTwGages nTwGages;

  /**
   * The cached value of the '{@link #getTwrGagNd() <em>Twr Gag Nd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwrGagNd()
   * @generated
   * @ordered
   */
  protected aTwrGagNd twrGagNd;

  /**
   * The cached value of the '{@link #getNBlGages() <em>NBl Gages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNBlGages()
   * @generated
   * @ordered
   */
  protected iNBlGages nBlGages;

  /**
   * The cached value of the '{@link #getBldGagNd() <em>Bld Gag Nd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBldGagNd()
   * @generated
   * @ordered
   */
  protected aBldGagNd bldGagNd;

  /**
   * The cached value of the '{@link #getOutList() <em>Out List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutList()
   * @generated
   * @ordered
   */
  protected vOutList outList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelFastfstImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FastfstPackage.eINSTANCE.getModelFastfst();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(Header newHead, NotificationChain msgs)
  {
    Header oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(Header newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Section> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<Section>(Section.class, this, FastfstPackage.MODEL_FASTFST__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bEcho getEcho()
  {
    return echo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEcho(bEcho newEcho, NotificationChain msgs)
  {
    bEcho oldEcho = echo;
    echo = newEcho;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ECHO, oldEcho, newEcho);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcho(bEcho newEcho)
  {
    if (newEcho != echo)
    {
      NotificationChain msgs = null;
      if (echo != null)
        msgs = ((InternalEObject)echo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ECHO, null, msgs);
      if (newEcho != null)
        msgs = ((InternalEObject)newEcho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ECHO, null, msgs);
      msgs = basicSetEcho(newEcho, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ECHO, newEcho, newEcho));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iADAMSPrep getADAMSPrep()
  {
    return adamsPrep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetADAMSPrep(iADAMSPrep newADAMSPrep, NotificationChain msgs)
  {
    iADAMSPrep oldADAMSPrep = adamsPrep;
    adamsPrep = newADAMSPrep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ADAMS_PREP, oldADAMSPrep, newADAMSPrep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setADAMSPrep(iADAMSPrep newADAMSPrep)
  {
    if (newADAMSPrep != adamsPrep)
    {
      NotificationChain msgs = null;
      if (adamsPrep != null)
        msgs = ((InternalEObject)adamsPrep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ADAMS_PREP, null, msgs);
      if (newADAMSPrep != null)
        msgs = ((InternalEObject)newADAMSPrep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ADAMS_PREP, null, msgs);
      msgs = basicSetADAMSPrep(newADAMSPrep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ADAMS_PREP, newADAMSPrep, newADAMSPrep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iAnalMode getAnalMode()
  {
    return analMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnalMode(iAnalMode newAnalMode, NotificationChain msgs)
  {
    iAnalMode oldAnalMode = analMode;
    analMode = newAnalMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ANAL_MODE, oldAnalMode, newAnalMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnalMode(iAnalMode newAnalMode)
  {
    if (newAnalMode != analMode)
    {
      NotificationChain msgs = null;
      if (analMode != null)
        msgs = ((InternalEObject)analMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ANAL_MODE, null, msgs);
      if (newAnalMode != null)
        msgs = ((InternalEObject)newAnalMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ANAL_MODE, null, msgs);
      msgs = basicSetAnalMode(newAnalMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ANAL_MODE, newAnalMode, newAnalMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNumBl getNumBl()
  {
    return numBl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumBl(iNumBl newNumBl, NotificationChain msgs)
  {
    iNumBl oldNumBl = numBl;
    numBl = newNumBl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NUM_BL, oldNumBl, newNumBl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumBl(iNumBl newNumBl)
  {
    if (newNumBl != numBl)
    {
      NotificationChain msgs = null;
      if (numBl != null)
        msgs = ((InternalEObject)numBl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NUM_BL, null, msgs);
      if (newNumBl != null)
        msgs = ((InternalEObject)newNumBl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NUM_BL, null, msgs);
      msgs = basicSetNumBl(newNumBl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NUM_BL, newNumBl, newNumBl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTMax getTMax()
  {
    return tMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTMax(nTMax newTMax, NotificationChain msgs)
  {
    nTMax oldTMax = tMax;
    tMax = newTMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TMAX, oldTMax, newTMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTMax(nTMax newTMax)
  {
    if (newTMax != tMax)
    {
      NotificationChain msgs = null;
      if (tMax != null)
        msgs = ((InternalEObject)tMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TMAX, null, msgs);
      if (newTMax != null)
        msgs = ((InternalEObject)newTMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TMAX, null, msgs);
      msgs = basicSetTMax(newTMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TMAX, newTMax, newTMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDT getDT()
  {
    return dt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDT(nDT newDT, NotificationChain msgs)
  {
    nDT oldDT = dt;
    dt = newDT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DT, oldDT, newDT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDT(nDT newDT)
  {
    if (newDT != dt)
    {
      NotificationChain msgs = null;
      if (dt != null)
        msgs = ((InternalEObject)dt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DT, null, msgs);
      if (newDT != null)
        msgs = ((InternalEObject)newDT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DT, null, msgs);
      msgs = basicSetDT(newDT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DT, newDT, newDT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iYCMode getYCMode()
  {
    return ycMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYCMode(iYCMode newYCMode, NotificationChain msgs)
  {
    iYCMode oldYCMode = ycMode;
    ycMode = newYCMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YC_MODE, oldYCMode, newYCMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYCMode(iYCMode newYCMode)
  {
    if (newYCMode != ycMode)
    {
      NotificationChain msgs = null;
      if (ycMode != null)
        msgs = ((InternalEObject)ycMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YC_MODE, null, msgs);
      if (newYCMode != null)
        msgs = ((InternalEObject)newYCMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YC_MODE, null, msgs);
      msgs = basicSetYCMode(newYCMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YC_MODE, newYCMode, newYCMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTYCOn getTYCOn()
  {
    return tycOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTYCOn(nTYCOn newTYCOn, NotificationChain msgs)
  {
    nTYCOn oldTYCOn = tycOn;
    tycOn = newTYCOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TYC_ON, oldTYCOn, newTYCOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTYCOn(nTYCOn newTYCOn)
  {
    if (newTYCOn != tycOn)
    {
      NotificationChain msgs = null;
      if (tycOn != null)
        msgs = ((InternalEObject)tycOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TYC_ON, null, msgs);
      if (newTYCOn != null)
        msgs = ((InternalEObject)newTYCOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TYC_ON, null, msgs);
      msgs = basicSetTYCOn(newTYCOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TYC_ON, newTYCOn, newTYCOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iPCMode getPCMode()
  {
    return pcMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPCMode(iPCMode newPCMode, NotificationChain msgs)
  {
    iPCMode oldPCMode = pcMode;
    pcMode = newPCMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PC_MODE, oldPCMode, newPCMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPCMode(iPCMode newPCMode)
  {
    if (newPCMode != pcMode)
    {
      NotificationChain msgs = null;
      if (pcMode != null)
        msgs = ((InternalEObject)pcMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PC_MODE, null, msgs);
      if (newPCMode != null)
        msgs = ((InternalEObject)newPCMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PC_MODE, null, msgs);
      msgs = basicSetPCMode(newPCMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PC_MODE, newPCMode, newPCMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPCOn getTPCOn()
  {
    return tpcOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTPCOn(nTPCOn newTPCOn, NotificationChain msgs)
  {
    nTPCOn oldTPCOn = tpcOn;
    tpcOn = newTPCOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPC_ON, oldTPCOn, newTPCOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTPCOn(nTPCOn newTPCOn)
  {
    if (newTPCOn != tpcOn)
    {
      NotificationChain msgs = null;
      if (tpcOn != null)
        msgs = ((InternalEObject)tpcOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPC_ON, null, msgs);
      if (newTPCOn != null)
        msgs = ((InternalEObject)newTPCOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPC_ON, null, msgs);
      msgs = basicSetTPCOn(newTPCOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPC_ON, newTPCOn, newTPCOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iVSContrl getVSContrl()
  {
    return vsContrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVSContrl(iVSContrl newVSContrl, NotificationChain msgs)
  {
    iVSContrl oldVSContrl = vsContrl;
    vsContrl = newVSContrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_CONTRL, oldVSContrl, newVSContrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVSContrl(iVSContrl newVSContrl)
  {
    if (newVSContrl != vsContrl)
    {
      NotificationChain msgs = null;
      if (vsContrl != null)
        msgs = ((InternalEObject)vsContrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_CONTRL, null, msgs);
      if (newVSContrl != null)
        msgs = ((InternalEObject)newVSContrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_CONTRL, null, msgs);
      msgs = basicSetVSContrl(newVSContrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_CONTRL, newVSContrl, newVSContrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVS_RtGnSp getVS_RtGnSp()
  {
    return vS_RtGnSp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVS_RtGnSp(nVS_RtGnSp newVS_RtGnSp, NotificationChain msgs)
  {
    nVS_RtGnSp oldVS_RtGnSp = vS_RtGnSp;
    vS_RtGnSp = newVS_RtGnSp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP, oldVS_RtGnSp, newVS_RtGnSp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVS_RtGnSp(nVS_RtGnSp newVS_RtGnSp)
  {
    if (newVS_RtGnSp != vS_RtGnSp)
    {
      NotificationChain msgs = null;
      if (vS_RtGnSp != null)
        msgs = ((InternalEObject)vS_RtGnSp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP, null, msgs);
      if (newVS_RtGnSp != null)
        msgs = ((InternalEObject)newVS_RtGnSp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP, null, msgs);
      msgs = basicSetVS_RtGnSp(newVS_RtGnSp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP, newVS_RtGnSp, newVS_RtGnSp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVS_RtTq getVS_RtTq()
  {
    return vS_RtTq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVS_RtTq(nVS_RtTq newVS_RtTq, NotificationChain msgs)
  {
    nVS_RtTq oldVS_RtTq = vS_RtTq;
    vS_RtTq = newVS_RtTq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_RT_TQ, oldVS_RtTq, newVS_RtTq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVS_RtTq(nVS_RtTq newVS_RtTq)
  {
    if (newVS_RtTq != vS_RtTq)
    {
      NotificationChain msgs = null;
      if (vS_RtTq != null)
        msgs = ((InternalEObject)vS_RtTq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_RT_TQ, null, msgs);
      if (newVS_RtTq != null)
        msgs = ((InternalEObject)newVS_RtTq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_RT_TQ, null, msgs);
      msgs = basicSetVS_RtTq(newVS_RtTq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_RT_TQ, newVS_RtTq, newVS_RtTq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVS_Rgn2K getVS_Rgn2K()
  {
    return vS_Rgn2K;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVS_Rgn2K(nVS_Rgn2K newVS_Rgn2K, NotificationChain msgs)
  {
    nVS_Rgn2K oldVS_Rgn2K = vS_Rgn2K;
    vS_Rgn2K = newVS_Rgn2K;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_RGN2_K, oldVS_Rgn2K, newVS_Rgn2K);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVS_Rgn2K(nVS_Rgn2K newVS_Rgn2K)
  {
    if (newVS_Rgn2K != vS_Rgn2K)
    {
      NotificationChain msgs = null;
      if (vS_Rgn2K != null)
        msgs = ((InternalEObject)vS_Rgn2K).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_RGN2_K, null, msgs);
      if (newVS_Rgn2K != null)
        msgs = ((InternalEObject)newVS_Rgn2K).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_RGN2_K, null, msgs);
      msgs = basicSetVS_Rgn2K(newVS_Rgn2K, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_RGN2_K, newVS_Rgn2K, newVS_Rgn2K));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVS_SlPc getVS_SlPc()
  {
    return vS_SlPc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVS_SlPc(nVS_SlPc newVS_SlPc, NotificationChain msgs)
  {
    nVS_SlPc oldVS_SlPc = vS_SlPc;
    vS_SlPc = newVS_SlPc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_SL_PC, oldVS_SlPc, newVS_SlPc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVS_SlPc(nVS_SlPc newVS_SlPc)
  {
    if (newVS_SlPc != vS_SlPc)
    {
      NotificationChain msgs = null;
      if (vS_SlPc != null)
        msgs = ((InternalEObject)vS_SlPc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_SL_PC, null, msgs);
      if (newVS_SlPc != null)
        msgs = ((InternalEObject)newVS_SlPc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__VS_SL_PC, null, msgs);
      msgs = basicSetVS_SlPc(newVS_SlPc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__VS_SL_PC, newVS_SlPc, newVS_SlPc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iGenModel getGenModel()
  {
    return genModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenModel(iGenModel newGenModel, NotificationChain msgs)
  {
    iGenModel oldGenModel = genModel;
    genModel = newGenModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_MODEL, oldGenModel, newGenModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenModel(iGenModel newGenModel)
  {
    if (newGenModel != genModel)
    {
      NotificationChain msgs = null;
      if (genModel != null)
        msgs = ((InternalEObject)genModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_MODEL, null, msgs);
      if (newGenModel != null)
        msgs = ((InternalEObject)newGenModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_MODEL, null, msgs);
      msgs = basicSetGenModel(newGenModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_MODEL, newGenModel, newGenModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bGenTiStr getGenTiStr()
  {
    return genTiStr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenTiStr(bGenTiStr newGenTiStr, NotificationChain msgs)
  {
    bGenTiStr oldGenTiStr = genTiStr;
    genTiStr = newGenTiStr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_TI_STR, oldGenTiStr, newGenTiStr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenTiStr(bGenTiStr newGenTiStr)
  {
    if (newGenTiStr != genTiStr)
    {
      NotificationChain msgs = null;
      if (genTiStr != null)
        msgs = ((InternalEObject)genTiStr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_TI_STR, null, msgs);
      if (newGenTiStr != null)
        msgs = ((InternalEObject)newGenTiStr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_TI_STR, null, msgs);
      msgs = basicSetGenTiStr(newGenTiStr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_TI_STR, newGenTiStr, newGenTiStr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bGenTiStp getGenTiStp()
  {
    return genTiStp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenTiStp(bGenTiStp newGenTiStp, NotificationChain msgs)
  {
    bGenTiStp oldGenTiStp = genTiStp;
    genTiStp = newGenTiStp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_TI_STP, oldGenTiStp, newGenTiStp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenTiStp(bGenTiStp newGenTiStp)
  {
    if (newGenTiStp != genTiStp)
    {
      NotificationChain msgs = null;
      if (genTiStp != null)
        msgs = ((InternalEObject)genTiStp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_TI_STP, null, msgs);
      if (newGenTiStp != null)
        msgs = ((InternalEObject)newGenTiStp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_TI_STP, null, msgs);
      msgs = basicSetGenTiStp(newGenTiStp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_TI_STP, newGenTiStp, newGenTiStp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSpdGenOn getSpdGenOn()
  {
    return spdGenOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpdGenOn(nSpdGenOn newSpdGenOn, NotificationChain msgs)
  {
    nSpdGenOn oldSpdGenOn = spdGenOn;
    spdGenOn = newSpdGenOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SPD_GEN_ON, oldSpdGenOn, newSpdGenOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpdGenOn(nSpdGenOn newSpdGenOn)
  {
    if (newSpdGenOn != spdGenOn)
    {
      NotificationChain msgs = null;
      if (spdGenOn != null)
        msgs = ((InternalEObject)spdGenOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SPD_GEN_ON, null, msgs);
      if (newSpdGenOn != null)
        msgs = ((InternalEObject)newSpdGenOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SPD_GEN_ON, null, msgs);
      msgs = basicSetSpdGenOn(newSpdGenOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SPD_GEN_ON, newSpdGenOn, newSpdGenOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTimGenOn getTimGenOn()
  {
    return timGenOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimGenOn(nTimGenOn newTimGenOn, NotificationChain msgs)
  {
    nTimGenOn oldTimGenOn = timGenOn;
    timGenOn = newTimGenOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIM_GEN_ON, oldTimGenOn, newTimGenOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimGenOn(nTimGenOn newTimGenOn)
  {
    if (newTimGenOn != timGenOn)
    {
      NotificationChain msgs = null;
      if (timGenOn != null)
        msgs = ((InternalEObject)timGenOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIM_GEN_ON, null, msgs);
      if (newTimGenOn != null)
        msgs = ((InternalEObject)newTimGenOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIM_GEN_ON, null, msgs);
      msgs = basicSetTimGenOn(newTimGenOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIM_GEN_ON, newTimGenOn, newTimGenOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTimGenOf getTimGenOf()
  {
    return timGenOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimGenOf(nTimGenOf newTimGenOf, NotificationChain msgs)
  {
    nTimGenOf oldTimGenOf = timGenOf;
    timGenOf = newTimGenOf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIM_GEN_OF, oldTimGenOf, newTimGenOf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimGenOf(nTimGenOf newTimGenOf)
  {
    if (newTimGenOf != timGenOf)
    {
      NotificationChain msgs = null;
      if (timGenOf != null)
        msgs = ((InternalEObject)timGenOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIM_GEN_OF, null, msgs);
      if (newTimGenOf != null)
        msgs = ((InternalEObject)newTimGenOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIM_GEN_OF, null, msgs);
      msgs = basicSetTimGenOf(newTimGenOf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIM_GEN_OF, newTimGenOf, newTimGenOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iHSSBrMode getHSSBrMode()
  {
    return hssBrMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHSSBrMode(iHSSBrMode newHSSBrMode, NotificationChain msgs)
  {
    iHSSBrMode oldHSSBrMode = hssBrMode;
    hssBrMode = newHSSBrMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HSS_BR_MODE, oldHSSBrMode, newHSSBrMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHSSBrMode(iHSSBrMode newHSSBrMode)
  {
    if (newHSSBrMode != hssBrMode)
    {
      NotificationChain msgs = null;
      if (hssBrMode != null)
        msgs = ((InternalEObject)hssBrMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HSS_BR_MODE, null, msgs);
      if (newHSSBrMode != null)
        msgs = ((InternalEObject)newHSSBrMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HSS_BR_MODE, null, msgs);
      msgs = basicSetHSSBrMode(newHSSBrMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HSS_BR_MODE, newHSSBrMode, newHSSBrMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTHSSBrDp getTHSSBrDp()
  {
    return thssBrDp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTHSSBrDp(nTHSSBrDp newTHSSBrDp, NotificationChain msgs)
  {
    nTHSSBrDp oldTHSSBrDp = thssBrDp;
    thssBrDp = newTHSSBrDp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__THSS_BR_DP, oldTHSSBrDp, newTHSSBrDp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTHSSBrDp(nTHSSBrDp newTHSSBrDp)
  {
    if (newTHSSBrDp != thssBrDp)
    {
      NotificationChain msgs = null;
      if (thssBrDp != null)
        msgs = ((InternalEObject)thssBrDp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__THSS_BR_DP, null, msgs);
      if (newTHSSBrDp != null)
        msgs = ((InternalEObject)newTHSSBrDp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__THSS_BR_DP, null, msgs);
      msgs = basicSetTHSSBrDp(newTHSSBrDp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__THSS_BR_DP, newTHSSBrDp, newTHSSBrDp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTiDynBrk getTiDynBrk()
  {
    return tiDynBrk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTiDynBrk(nTiDynBrk newTiDynBrk, NotificationChain msgs)
  {
    nTiDynBrk oldTiDynBrk = tiDynBrk;
    tiDynBrk = newTiDynBrk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TI_DYN_BRK, oldTiDynBrk, newTiDynBrk);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTiDynBrk(nTiDynBrk newTiDynBrk)
  {
    if (newTiDynBrk != tiDynBrk)
    {
      NotificationChain msgs = null;
      if (tiDynBrk != null)
        msgs = ((InternalEObject)tiDynBrk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TI_DYN_BRK, null, msgs);
      if (newTiDynBrk != null)
        msgs = ((InternalEObject)newTiDynBrk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TI_DYN_BRK, null, msgs);
      msgs = basicSetTiDynBrk(newTiDynBrk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TI_DYN_BRK, newTiDynBrk, newTiDynBrk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTpBrDp_1_ getTTpBrDp_1_()
  {
    return tTpBrDp_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTTpBrDp_1_(nTTpBrDp_1_ newTTpBrDp_1_, NotificationChain msgs)
  {
    nTTpBrDp_1_ oldTTpBrDp_1_ = tTpBrDp_1_;
    tTpBrDp_1_ = newTTpBrDp_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1, oldTTpBrDp_1_, newTTpBrDp_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTTpBrDp_1_(nTTpBrDp_1_ newTTpBrDp_1_)
  {
    if (newTTpBrDp_1_ != tTpBrDp_1_)
    {
      NotificationChain msgs = null;
      if (tTpBrDp_1_ != null)
        msgs = ((InternalEObject)tTpBrDp_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1, null, msgs);
      if (newTTpBrDp_1_ != null)
        msgs = ((InternalEObject)newTTpBrDp_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1, null, msgs);
      msgs = basicSetTTpBrDp_1_(newTTpBrDp_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1, newTTpBrDp_1_, newTTpBrDp_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTpBrDp_2_ getTTpBrDp_2_()
  {
    return tTpBrDp_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTTpBrDp_2_(nTTpBrDp_2_ newTTpBrDp_2_, NotificationChain msgs)
  {
    nTTpBrDp_2_ oldTTpBrDp_2_ = tTpBrDp_2_;
    tTpBrDp_2_ = newTTpBrDp_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2, oldTTpBrDp_2_, newTTpBrDp_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTTpBrDp_2_(nTTpBrDp_2_ newTTpBrDp_2_)
  {
    if (newTTpBrDp_2_ != tTpBrDp_2_)
    {
      NotificationChain msgs = null;
      if (tTpBrDp_2_ != null)
        msgs = ((InternalEObject)tTpBrDp_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2, null, msgs);
      if (newTTpBrDp_2_ != null)
        msgs = ((InternalEObject)newTTpBrDp_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2, null, msgs);
      msgs = basicSetTTpBrDp_2_(newTTpBrDp_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2, newTTpBrDp_2_, newTTpBrDp_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTpBrDp_3_ getTTpBrDp_3_()
  {
    return tTpBrDp_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTTpBrDp_3_(nTTpBrDp_3_ newTTpBrDp_3_, NotificationChain msgs)
  {
    nTTpBrDp_3_ oldTTpBrDp_3_ = tTpBrDp_3_;
    tTpBrDp_3_ = newTTpBrDp_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3, oldTTpBrDp_3_, newTTpBrDp_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTTpBrDp_3_(nTTpBrDp_3_ newTTpBrDp_3_)
  {
    if (newTTpBrDp_3_ != tTpBrDp_3_)
    {
      NotificationChain msgs = null;
      if (tTpBrDp_3_ != null)
        msgs = ((InternalEObject)tTpBrDp_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3, null, msgs);
      if (newTTpBrDp_3_ != null)
        msgs = ((InternalEObject)newTTpBrDp_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3, null, msgs);
      msgs = basicSetTTpBrDp_3_(newTTpBrDp_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3, newTTpBrDp_3_, newTTpBrDp_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDepISp_1_ getTBDepISp_1_()
  {
    return tbDepISp_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTBDepISp_1_(nTBDepISp_1_ newTBDepISp_1_, NotificationChain msgs)
  {
    nTBDepISp_1_ oldTBDepISp_1_ = tbDepISp_1_;
    tbDepISp_1_ = newTBDepISp_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1, oldTBDepISp_1_, newTBDepISp_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTBDepISp_1_(nTBDepISp_1_ newTBDepISp_1_)
  {
    if (newTBDepISp_1_ != tbDepISp_1_)
    {
      NotificationChain msgs = null;
      if (tbDepISp_1_ != null)
        msgs = ((InternalEObject)tbDepISp_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1, null, msgs);
      if (newTBDepISp_1_ != null)
        msgs = ((InternalEObject)newTBDepISp_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1, null, msgs);
      msgs = basicSetTBDepISp_1_(newTBDepISp_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1, newTBDepISp_1_, newTBDepISp_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDepISp_2_ getTBDepISp_2_()
  {
    return tbDepISp_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTBDepISp_2_(nTBDepISp_2_ newTBDepISp_2_, NotificationChain msgs)
  {
    nTBDepISp_2_ oldTBDepISp_2_ = tbDepISp_2_;
    tbDepISp_2_ = newTBDepISp_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2, oldTBDepISp_2_, newTBDepISp_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTBDepISp_2_(nTBDepISp_2_ newTBDepISp_2_)
  {
    if (newTBDepISp_2_ != tbDepISp_2_)
    {
      NotificationChain msgs = null;
      if (tbDepISp_2_ != null)
        msgs = ((InternalEObject)tbDepISp_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2, null, msgs);
      if (newTBDepISp_2_ != null)
        msgs = ((InternalEObject)newTBDepISp_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2, null, msgs);
      msgs = basicSetTBDepISp_2_(newTBDepISp_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2, newTBDepISp_2_, newTBDepISp_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDepISp_3_ getTBDepISp_3_()
  {
    return tbDepISp_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTBDepISp_3_(nTBDepISp_3_ newTBDepISp_3_, NotificationChain msgs)
  {
    nTBDepISp_3_ oldTBDepISp_3_ = tbDepISp_3_;
    tbDepISp_3_ = newTBDepISp_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3, oldTBDepISp_3_, newTBDepISp_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTBDepISp_3_(nTBDepISp_3_ newTBDepISp_3_)
  {
    if (newTBDepISp_3_ != tbDepISp_3_)
    {
      NotificationChain msgs = null;
      if (tbDepISp_3_ != null)
        msgs = ((InternalEObject)tbDepISp_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3, null, msgs);
      if (newTBDepISp_3_ != null)
        msgs = ((InternalEObject)newTBDepISp_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3, null, msgs);
      msgs = basicSetTBDepISp_3_(newTBDepISp_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3, newTBDepISp_3_, newTBDepISp_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTYawManS getTYawManS()
  {
    return tYawManS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTYawManS(nTYawManS newTYawManS, NotificationChain msgs)
  {
    nTYawManS oldTYawManS = tYawManS;
    tYawManS = newTYawManS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TYAW_MAN_S, oldTYawManS, newTYawManS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTYawManS(nTYawManS newTYawManS)
  {
    if (newTYawManS != tYawManS)
    {
      NotificationChain msgs = null;
      if (tYawManS != null)
        msgs = ((InternalEObject)tYawManS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TYAW_MAN_S, null, msgs);
      if (newTYawManS != null)
        msgs = ((InternalEObject)newTYawManS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TYAW_MAN_S, null, msgs);
      msgs = basicSetTYawManS(newTYawManS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TYAW_MAN_S, newTYawManS, newTYawManS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTYawManE getTYawManE()
  {
    return tYawManE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTYawManE(nTYawManE newTYawManE, NotificationChain msgs)
  {
    nTYawManE oldTYawManE = tYawManE;
    tYawManE = newTYawManE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TYAW_MAN_E, oldTYawManE, newTYawManE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTYawManE(nTYawManE newTYawManE)
  {
    if (newTYawManE != tYawManE)
    {
      NotificationChain msgs = null;
      if (tYawManE != null)
        msgs = ((InternalEObject)tYawManE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TYAW_MAN_E, null, msgs);
      if (newTYawManE != null)
        msgs = ((InternalEObject)newTYawManE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TYAW_MAN_E, null, msgs);
      msgs = basicSetTYawManE(newTYawManE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TYAW_MAN_E, newTYawManE, newTYawManE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacYawF getNacYawF()
  {
    return nacYawF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNacYawF(nNacYawF newNacYawF, NotificationChain msgs)
  {
    nNacYawF oldNacYawF = nacYawF;
    nacYawF = newNacYawF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_YAW_F, oldNacYawF, newNacYawF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNacYawF(nNacYawF newNacYawF)
  {
    if (newNacYawF != nacYawF)
    {
      NotificationChain msgs = null;
      if (nacYawF != null)
        msgs = ((InternalEObject)nacYawF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_YAW_F, null, msgs);
      if (newNacYawF != null)
        msgs = ((InternalEObject)newNacYawF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_YAW_F, null, msgs);
      msgs = basicSetNacYawF(newNacYawF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_YAW_F, newNacYawF, newNacYawF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManS_1_ getTPitManS_1_()
  {
    return tPitManS_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTPitManS_1_(nTPitManS_1_ newTPitManS_1_, NotificationChain msgs)
  {
    nTPitManS_1_ oldTPitManS_1_ = tPitManS_1_;
    tPitManS_1_ = newTPitManS_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1, oldTPitManS_1_, newTPitManS_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTPitManS_1_(nTPitManS_1_ newTPitManS_1_)
  {
    if (newTPitManS_1_ != tPitManS_1_)
    {
      NotificationChain msgs = null;
      if (tPitManS_1_ != null)
        msgs = ((InternalEObject)tPitManS_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1, null, msgs);
      if (newTPitManS_1_ != null)
        msgs = ((InternalEObject)newTPitManS_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1, null, msgs);
      msgs = basicSetTPitManS_1_(newTPitManS_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1, newTPitManS_1_, newTPitManS_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManS_2_ getTPitManS_2_()
  {
    return tPitManS_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTPitManS_2_(nTPitManS_2_ newTPitManS_2_, NotificationChain msgs)
  {
    nTPitManS_2_ oldTPitManS_2_ = tPitManS_2_;
    tPitManS_2_ = newTPitManS_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2, oldTPitManS_2_, newTPitManS_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTPitManS_2_(nTPitManS_2_ newTPitManS_2_)
  {
    if (newTPitManS_2_ != tPitManS_2_)
    {
      NotificationChain msgs = null;
      if (tPitManS_2_ != null)
        msgs = ((InternalEObject)tPitManS_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2, null, msgs);
      if (newTPitManS_2_ != null)
        msgs = ((InternalEObject)newTPitManS_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2, null, msgs);
      msgs = basicSetTPitManS_2_(newTPitManS_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2, newTPitManS_2_, newTPitManS_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManS_3_ getTPitManS_3_()
  {
    return tPitManS_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTPitManS_3_(nTPitManS_3_ newTPitManS_3_, NotificationChain msgs)
  {
    nTPitManS_3_ oldTPitManS_3_ = tPitManS_3_;
    tPitManS_3_ = newTPitManS_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3, oldTPitManS_3_, newTPitManS_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTPitManS_3_(nTPitManS_3_ newTPitManS_3_)
  {
    if (newTPitManS_3_ != tPitManS_3_)
    {
      NotificationChain msgs = null;
      if (tPitManS_3_ != null)
        msgs = ((InternalEObject)tPitManS_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3, null, msgs);
      if (newTPitManS_3_ != null)
        msgs = ((InternalEObject)newTPitManS_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3, null, msgs);
      msgs = basicSetTPitManS_3_(newTPitManS_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3, newTPitManS_3_, newTPitManS_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManE_1_ getTPitManE_1_()
  {
    return tPitManE_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTPitManE_1_(nTPitManE_1_ newTPitManE_1_, NotificationChain msgs)
  {
    nTPitManE_1_ oldTPitManE_1_ = tPitManE_1_;
    tPitManE_1_ = newTPitManE_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1, oldTPitManE_1_, newTPitManE_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTPitManE_1_(nTPitManE_1_ newTPitManE_1_)
  {
    if (newTPitManE_1_ != tPitManE_1_)
    {
      NotificationChain msgs = null;
      if (tPitManE_1_ != null)
        msgs = ((InternalEObject)tPitManE_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1, null, msgs);
      if (newTPitManE_1_ != null)
        msgs = ((InternalEObject)newTPitManE_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1, null, msgs);
      msgs = basicSetTPitManE_1_(newTPitManE_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1, newTPitManE_1_, newTPitManE_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManE_2_ getTPitManE_2_()
  {
    return tPitManE_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTPitManE_2_(nTPitManE_2_ newTPitManE_2_, NotificationChain msgs)
  {
    nTPitManE_2_ oldTPitManE_2_ = tPitManE_2_;
    tPitManE_2_ = newTPitManE_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2, oldTPitManE_2_, newTPitManE_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTPitManE_2_(nTPitManE_2_ newTPitManE_2_)
  {
    if (newTPitManE_2_ != tPitManE_2_)
    {
      NotificationChain msgs = null;
      if (tPitManE_2_ != null)
        msgs = ((InternalEObject)tPitManE_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2, null, msgs);
      if (newTPitManE_2_ != null)
        msgs = ((InternalEObject)newTPitManE_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2, null, msgs);
      msgs = basicSetTPitManE_2_(newTPitManE_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2, newTPitManE_2_, newTPitManE_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTPitManE_3_ getTPitManE_3_()
  {
    return tPitManE_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTPitManE_3_(nTPitManE_3_ newTPitManE_3_, NotificationChain msgs)
  {
    nTPitManE_3_ oldTPitManE_3_ = tPitManE_3_;
    tPitManE_3_ = newTPitManE_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3, oldTPitManE_3_, newTPitManE_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTPitManE_3_(nTPitManE_3_ newTPitManE_3_)
  {
    if (newTPitManE_3_ != tPitManE_3_)
    {
      NotificationChain msgs = null;
      if (tPitManE_3_ != null)
        msgs = ((InternalEObject)tPitManE_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3, null, msgs);
      if (newTPitManE_3_ != null)
        msgs = ((InternalEObject)newTPitManE_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3, null, msgs);
      msgs = basicSetTPitManE_3_(newTPitManE_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3, newTPitManE_3_, newTPitManE_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitch_1_ getBlPitch_1_()
  {
    return blPitch_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlPitch_1_(nBlPitch_1_ newBlPitch_1_, NotificationChain msgs)
  {
    nBlPitch_1_ oldBlPitch_1_ = blPitch_1_;
    blPitch_1_ = newBlPitch_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_1, oldBlPitch_1_, newBlPitch_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlPitch_1_(nBlPitch_1_ newBlPitch_1_)
  {
    if (newBlPitch_1_ != blPitch_1_)
    {
      NotificationChain msgs = null;
      if (blPitch_1_ != null)
        msgs = ((InternalEObject)blPitch_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_1, null, msgs);
      if (newBlPitch_1_ != null)
        msgs = ((InternalEObject)newBlPitch_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_1, null, msgs);
      msgs = basicSetBlPitch_1_(newBlPitch_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_1, newBlPitch_1_, newBlPitch_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitch_2_ getBlPitch_2_()
  {
    return blPitch_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlPitch_2_(nBlPitch_2_ newBlPitch_2_, NotificationChain msgs)
  {
    nBlPitch_2_ oldBlPitch_2_ = blPitch_2_;
    blPitch_2_ = newBlPitch_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_2, oldBlPitch_2_, newBlPitch_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlPitch_2_(nBlPitch_2_ newBlPitch_2_)
  {
    if (newBlPitch_2_ != blPitch_2_)
    {
      NotificationChain msgs = null;
      if (blPitch_2_ != null)
        msgs = ((InternalEObject)blPitch_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_2, null, msgs);
      if (newBlPitch_2_ != null)
        msgs = ((InternalEObject)newBlPitch_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_2, null, msgs);
      msgs = basicSetBlPitch_2_(newBlPitch_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_2, newBlPitch_2_, newBlPitch_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitch_3_ getBlPitch_3_()
  {
    return blPitch_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlPitch_3_(nBlPitch_3_ newBlPitch_3_, NotificationChain msgs)
  {
    nBlPitch_3_ oldBlPitch_3_ = blPitch_3_;
    blPitch_3_ = newBlPitch_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_3, oldBlPitch_3_, newBlPitch_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlPitch_3_(nBlPitch_3_ newBlPitch_3_)
  {
    if (newBlPitch_3_ != blPitch_3_)
    {
      NotificationChain msgs = null;
      if (blPitch_3_ != null)
        msgs = ((InternalEObject)blPitch_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_3, null, msgs);
      if (newBlPitch_3_ != null)
        msgs = ((InternalEObject)newBlPitch_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_3, null, msgs);
      msgs = basicSetBlPitch_3_(newBlPitch_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_3, newBlPitch_3_, newBlPitch_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitchF_1_ getBlPitchF_1_()
  {
    return blPitchF_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlPitchF_1_(nBlPitchF_1_ newBlPitchF_1_, NotificationChain msgs)
  {
    nBlPitchF_1_ oldBlPitchF_1_ = blPitchF_1_;
    blPitchF_1_ = newBlPitchF_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_F1, oldBlPitchF_1_, newBlPitchF_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlPitchF_1_(nBlPitchF_1_ newBlPitchF_1_)
  {
    if (newBlPitchF_1_ != blPitchF_1_)
    {
      NotificationChain msgs = null;
      if (blPitchF_1_ != null)
        msgs = ((InternalEObject)blPitchF_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_F1, null, msgs);
      if (newBlPitchF_1_ != null)
        msgs = ((InternalEObject)newBlPitchF_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_F1, null, msgs);
      msgs = basicSetBlPitchF_1_(newBlPitchF_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_F1, newBlPitchF_1_, newBlPitchF_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitchF_2_ getBlPitchF_2_()
  {
    return blPitchF_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlPitchF_2_(nBlPitchF_2_ newBlPitchF_2_, NotificationChain msgs)
  {
    nBlPitchF_2_ oldBlPitchF_2_ = blPitchF_2_;
    blPitchF_2_ = newBlPitchF_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_F2, oldBlPitchF_2_, newBlPitchF_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlPitchF_2_(nBlPitchF_2_ newBlPitchF_2_)
  {
    if (newBlPitchF_2_ != blPitchF_2_)
    {
      NotificationChain msgs = null;
      if (blPitchF_2_ != null)
        msgs = ((InternalEObject)blPitchF_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_F2, null, msgs);
      if (newBlPitchF_2_ != null)
        msgs = ((InternalEObject)newBlPitchF_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_F2, null, msgs);
      msgs = basicSetBlPitchF_2_(newBlPitchF_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_F2, newBlPitchF_2_, newBlPitchF_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlPitchF_3_ getBlPitchF_3_()
  {
    return blPitchF_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlPitchF_3_(nBlPitchF_3_ newBlPitchF_3_, NotificationChain msgs)
  {
    nBlPitchF_3_ oldBlPitchF_3_ = blPitchF_3_;
    blPitchF_3_ = newBlPitchF_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_F3, oldBlPitchF_3_, newBlPitchF_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlPitchF_3_(nBlPitchF_3_ newBlPitchF_3_)
  {
    if (newBlPitchF_3_ != blPitchF_3_)
    {
      NotificationChain msgs = null;
      if (blPitchF_3_ != null)
        msgs = ((InternalEObject)blPitchF_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_F3, null, msgs);
      if (newBlPitchF_3_ != null)
        msgs = ((InternalEObject)newBlPitchF_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BL_PITCH_F3, null, msgs);
      msgs = basicSetBlPitchF_3_(newBlPitchF_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BL_PITCH_F3, newBlPitchF_3_, newBlPitchF_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGravity getGravity()
  {
    return gravity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGravity(nGravity newGravity, NotificationChain msgs)
  {
    nGravity oldGravity = gravity;
    gravity = newGravity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GRAVITY, oldGravity, newGravity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGravity(nGravity newGravity)
  {
    if (newGravity != gravity)
    {
      NotificationChain msgs = null;
      if (gravity != null)
        msgs = ((InternalEObject)gravity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GRAVITY, null, msgs);
      if (newGravity != null)
        msgs = ((InternalEObject)newGravity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GRAVITY, null, msgs);
      msgs = basicSetGravity(newGravity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GRAVITY, newGravity, newGravity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bFlapDOF1 getFlapDOF1()
  {
    return flapDOF1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFlapDOF1(bFlapDOF1 newFlapDOF1, NotificationChain msgs)
  {
    bFlapDOF1 oldFlapDOF1 = flapDOF1;
    flapDOF1 = newFlapDOF1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__FLAP_DOF1, oldFlapDOF1, newFlapDOF1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlapDOF1(bFlapDOF1 newFlapDOF1)
  {
    if (newFlapDOF1 != flapDOF1)
    {
      NotificationChain msgs = null;
      if (flapDOF1 != null)
        msgs = ((InternalEObject)flapDOF1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__FLAP_DOF1, null, msgs);
      if (newFlapDOF1 != null)
        msgs = ((InternalEObject)newFlapDOF1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__FLAP_DOF1, null, msgs);
      msgs = basicSetFlapDOF1(newFlapDOF1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__FLAP_DOF1, newFlapDOF1, newFlapDOF1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bFlapDOF2 getFlapDOF2()
  {
    return flapDOF2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFlapDOF2(bFlapDOF2 newFlapDOF2, NotificationChain msgs)
  {
    bFlapDOF2 oldFlapDOF2 = flapDOF2;
    flapDOF2 = newFlapDOF2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__FLAP_DOF2, oldFlapDOF2, newFlapDOF2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlapDOF2(bFlapDOF2 newFlapDOF2)
  {
    if (newFlapDOF2 != flapDOF2)
    {
      NotificationChain msgs = null;
      if (flapDOF2 != null)
        msgs = ((InternalEObject)flapDOF2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__FLAP_DOF2, null, msgs);
      if (newFlapDOF2 != null)
        msgs = ((InternalEObject)newFlapDOF2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__FLAP_DOF2, null, msgs);
      msgs = basicSetFlapDOF2(newFlapDOF2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__FLAP_DOF2, newFlapDOF2, newFlapDOF2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bEdgeDOF getEdgeDOF()
  {
    return edgeDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEdgeDOF(bEdgeDOF newEdgeDOF, NotificationChain msgs)
  {
    bEdgeDOF oldEdgeDOF = edgeDOF;
    edgeDOF = newEdgeDOF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__EDGE_DOF, oldEdgeDOF, newEdgeDOF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEdgeDOF(bEdgeDOF newEdgeDOF)
  {
    if (newEdgeDOF != edgeDOF)
    {
      NotificationChain msgs = null;
      if (edgeDOF != null)
        msgs = ((InternalEObject)edgeDOF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__EDGE_DOF, null, msgs);
      if (newEdgeDOF != null)
        msgs = ((InternalEObject)newEdgeDOF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__EDGE_DOF, null, msgs);
      msgs = basicSetEdgeDOF(newEdgeDOF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__EDGE_DOF, newEdgeDOF, newEdgeDOF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTeetDOF getTeetDOF()
  {
    return teetDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetDOF(bTeetDOF newTeetDOF, NotificationChain msgs)
  {
    bTeetDOF oldTeetDOF = teetDOF;
    teetDOF = newTeetDOF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_DOF, oldTeetDOF, newTeetDOF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetDOF(bTeetDOF newTeetDOF)
  {
    if (newTeetDOF != teetDOF)
    {
      NotificationChain msgs = null;
      if (teetDOF != null)
        msgs = ((InternalEObject)teetDOF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_DOF, null, msgs);
      if (newTeetDOF != null)
        msgs = ((InternalEObject)newTeetDOF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_DOF, null, msgs);
      msgs = basicSetTeetDOF(newTeetDOF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_DOF, newTeetDOF, newTeetDOF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bDrTrDOF getDrTrDOF()
  {
    return drTrDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDrTrDOF(bDrTrDOF newDrTrDOF, NotificationChain msgs)
  {
    bDrTrDOF oldDrTrDOF = drTrDOF;
    drTrDOF = newDrTrDOF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DR_TR_DOF, oldDrTrDOF, newDrTrDOF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDrTrDOF(bDrTrDOF newDrTrDOF)
  {
    if (newDrTrDOF != drTrDOF)
    {
      NotificationChain msgs = null;
      if (drTrDOF != null)
        msgs = ((InternalEObject)drTrDOF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DR_TR_DOF, null, msgs);
      if (newDrTrDOF != null)
        msgs = ((InternalEObject)newDrTrDOF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DR_TR_DOF, null, msgs);
      msgs = basicSetDrTrDOF(newDrTrDOF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DR_TR_DOF, newDrTrDOF, newDrTrDOF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bGenDOF getGenDOF()
  {
    return genDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenDOF(bGenDOF newGenDOF, NotificationChain msgs)
  {
    bGenDOF oldGenDOF = genDOF;
    genDOF = newGenDOF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_DOF, oldGenDOF, newGenDOF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenDOF(bGenDOF newGenDOF)
  {
    if (newGenDOF != genDOF)
    {
      NotificationChain msgs = null;
      if (genDOF != null)
        msgs = ((InternalEObject)genDOF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_DOF, null, msgs);
      if (newGenDOF != null)
        msgs = ((InternalEObject)newGenDOF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_DOF, null, msgs);
      msgs = basicSetGenDOF(newGenDOF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_DOF, newGenDOF, newGenDOF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bYawDOF getYawDOF()
  {
    return yawDOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYawDOF(bYawDOF newYawDOF, NotificationChain msgs)
  {
    bYawDOF oldYawDOF = yawDOF;
    yawDOF = newYawDOF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_DOF, oldYawDOF, newYawDOF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYawDOF(bYawDOF newYawDOF)
  {
    if (newYawDOF != yawDOF)
    {
      NotificationChain msgs = null;
      if (yawDOF != null)
        msgs = ((InternalEObject)yawDOF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_DOF, null, msgs);
      if (newYawDOF != null)
        msgs = ((InternalEObject)newYawDOF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_DOF, null, msgs);
      msgs = basicSetYawDOF(newYawDOF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_DOF, newYawDOF, newYawDOF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTwFADOF1 getTwFADOF1()
  {
    return twFADOF1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFADOF1(bTwFADOF1 newTwFADOF1, NotificationChain msgs)
  {
    bTwFADOF1 oldTwFADOF1 = twFADOF1;
    twFADOF1 = newTwFADOF1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TW_FADOF1, oldTwFADOF1, newTwFADOF1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFADOF1(bTwFADOF1 newTwFADOF1)
  {
    if (newTwFADOF1 != twFADOF1)
    {
      NotificationChain msgs = null;
      if (twFADOF1 != null)
        msgs = ((InternalEObject)twFADOF1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TW_FADOF1, null, msgs);
      if (newTwFADOF1 != null)
        msgs = ((InternalEObject)newTwFADOF1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TW_FADOF1, null, msgs);
      msgs = basicSetTwFADOF1(newTwFADOF1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TW_FADOF1, newTwFADOF1, newTwFADOF1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTwFADOF2 getTwFADOF2()
  {
    return twFADOF2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwFADOF2(bTwFADOF2 newTwFADOF2, NotificationChain msgs)
  {
    bTwFADOF2 oldTwFADOF2 = twFADOF2;
    twFADOF2 = newTwFADOF2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TW_FADOF2, oldTwFADOF2, newTwFADOF2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwFADOF2(bTwFADOF2 newTwFADOF2)
  {
    if (newTwFADOF2 != twFADOF2)
    {
      NotificationChain msgs = null;
      if (twFADOF2 != null)
        msgs = ((InternalEObject)twFADOF2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TW_FADOF2, null, msgs);
      if (newTwFADOF2 != null)
        msgs = ((InternalEObject)newTwFADOF2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TW_FADOF2, null, msgs);
      msgs = basicSetTwFADOF2(newTwFADOF2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TW_FADOF2, newTwFADOF2, newTwFADOF2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTwSSDOF1 getTwSSDOF1()
  {
    return twSSDOF1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSDOF1(bTwSSDOF1 newTwSSDOF1, NotificationChain msgs)
  {
    bTwSSDOF1 oldTwSSDOF1 = twSSDOF1;
    twSSDOF1 = newTwSSDOF1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TW_SSDOF1, oldTwSSDOF1, newTwSSDOF1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSDOF1(bTwSSDOF1 newTwSSDOF1)
  {
    if (newTwSSDOF1 != twSSDOF1)
    {
      NotificationChain msgs = null;
      if (twSSDOF1 != null)
        msgs = ((InternalEObject)twSSDOF1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TW_SSDOF1, null, msgs);
      if (newTwSSDOF1 != null)
        msgs = ((InternalEObject)newTwSSDOF1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TW_SSDOF1, null, msgs);
      msgs = basicSetTwSSDOF1(newTwSSDOF1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TW_SSDOF1, newTwSSDOF1, newTwSSDOF1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTwSSDOF2 getTwSSDOF2()
  {
    return twSSDOF2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwSSDOF2(bTwSSDOF2 newTwSSDOF2, NotificationChain msgs)
  {
    bTwSSDOF2 oldTwSSDOF2 = twSSDOF2;
    twSSDOF2 = newTwSSDOF2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TW_SSDOF2, oldTwSSDOF2, newTwSSDOF2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwSSDOF2(bTwSSDOF2 newTwSSDOF2)
  {
    if (newTwSSDOF2 != twSSDOF2)
    {
      NotificationChain msgs = null;
      if (twSSDOF2 != null)
        msgs = ((InternalEObject)twSSDOF2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TW_SSDOF2, null, msgs);
      if (newTwSSDOF2 != null)
        msgs = ((InternalEObject)newTwSSDOF2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TW_SSDOF2, null, msgs);
      msgs = basicSetTwSSDOF2(newTwSSDOF2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TW_SSDOF2, newTwSSDOF2, newTwSSDOF2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bCompAero getCompAero()
  {
    return compAero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompAero(bCompAero newCompAero, NotificationChain msgs)
  {
    bCompAero oldCompAero = compAero;
    compAero = newCompAero;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__COMP_AERO, oldCompAero, newCompAero);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompAero(bCompAero newCompAero)
  {
    if (newCompAero != compAero)
    {
      NotificationChain msgs = null;
      if (compAero != null)
        msgs = ((InternalEObject)compAero).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__COMP_AERO, null, msgs);
      if (newCompAero != null)
        msgs = ((InternalEObject)newCompAero).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__COMP_AERO, null, msgs);
      msgs = basicSetCompAero(newCompAero, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__COMP_AERO, newCompAero, newCompAero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bCompNoise getCompNoise()
  {
    return compNoise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompNoise(bCompNoise newCompNoise, NotificationChain msgs)
  {
    bCompNoise oldCompNoise = compNoise;
    compNoise = newCompNoise;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__COMP_NOISE, oldCompNoise, newCompNoise);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompNoise(bCompNoise newCompNoise)
  {
    if (newCompNoise != compNoise)
    {
      NotificationChain msgs = null;
      if (compNoise != null)
        msgs = ((InternalEObject)compNoise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__COMP_NOISE, null, msgs);
      if (newCompNoise != null)
        msgs = ((InternalEObject)newCompNoise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__COMP_NOISE, null, msgs);
      msgs = basicSetCompNoise(newCompNoise, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__COMP_NOISE, newCompNoise, newCompNoise));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nOoPDefl getOoPDefl()
  {
    return ooPDefl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOoPDefl(nOoPDefl newOoPDefl, NotificationChain msgs)
  {
    nOoPDefl oldOoPDefl = ooPDefl;
    ooPDefl = newOoPDefl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OO_PDEFL, oldOoPDefl, newOoPDefl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOoPDefl(nOoPDefl newOoPDefl)
  {
    if (newOoPDefl != ooPDefl)
    {
      NotificationChain msgs = null;
      if (ooPDefl != null)
        msgs = ((InternalEObject)ooPDefl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OO_PDEFL, null, msgs);
      if (newOoPDefl != null)
        msgs = ((InternalEObject)newOoPDefl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OO_PDEFL, null, msgs);
      msgs = basicSetOoPDefl(newOoPDefl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OO_PDEFL, newOoPDefl, newOoPDefl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIPDefl getIPDefl()
  {
    return ipDefl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIPDefl(nIPDefl newIPDefl, NotificationChain msgs)
  {
    nIPDefl oldIPDefl = ipDefl;
    ipDefl = newIPDefl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__IP_DEFL, oldIPDefl, newIPDefl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIPDefl(nIPDefl newIPDefl)
  {
    if (newIPDefl != ipDefl)
    {
      NotificationChain msgs = null;
      if (ipDefl != null)
        msgs = ((InternalEObject)ipDefl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__IP_DEFL, null, msgs);
      if (newIPDefl != null)
        msgs = ((InternalEObject)newIPDefl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__IP_DEFL, null, msgs);
      msgs = basicSetIPDefl(newIPDefl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__IP_DEFL, newIPDefl, newIPDefl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetDefl getTeetDefl()
  {
    return teetDefl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetDefl(nTeetDefl newTeetDefl, NotificationChain msgs)
  {
    nTeetDefl oldTeetDefl = teetDefl;
    teetDefl = newTeetDefl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_DEFL, oldTeetDefl, newTeetDefl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetDefl(nTeetDefl newTeetDefl)
  {
    if (newTeetDefl != teetDefl)
    {
      NotificationChain msgs = null;
      if (teetDefl != null)
        msgs = ((InternalEObject)teetDefl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_DEFL, null, msgs);
      if (newTeetDefl != null)
        msgs = ((InternalEObject)newTeetDefl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_DEFL, null, msgs);
      msgs = basicSetTeetDefl(newTeetDefl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_DEFL, newTeetDefl, newTeetDefl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAzimuth getAzimuth()
  {
    return azimuth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAzimuth(nAzimuth newAzimuth, NotificationChain msgs)
  {
    nAzimuth oldAzimuth = azimuth;
    azimuth = newAzimuth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__AZIMUTH, oldAzimuth, newAzimuth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAzimuth(nAzimuth newAzimuth)
  {
    if (newAzimuth != azimuth)
    {
      NotificationChain msgs = null;
      if (azimuth != null)
        msgs = ((InternalEObject)azimuth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__AZIMUTH, null, msgs);
      if (newAzimuth != null)
        msgs = ((InternalEObject)newAzimuth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__AZIMUTH, null, msgs);
      msgs = basicSetAzimuth(newAzimuth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__AZIMUTH, newAzimuth, newAzimuth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRotSpeed getRotSpeed()
  {
    return rotSpeed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRotSpeed(nRotSpeed newRotSpeed, NotificationChain msgs)
  {
    nRotSpeed oldRotSpeed = rotSpeed;
    rotSpeed = newRotSpeed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ROT_SPEED, oldRotSpeed, newRotSpeed);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotSpeed(nRotSpeed newRotSpeed)
  {
    if (newRotSpeed != rotSpeed)
    {
      NotificationChain msgs = null;
      if (rotSpeed != null)
        msgs = ((InternalEObject)rotSpeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ROT_SPEED, null, msgs);
      if (newRotSpeed != null)
        msgs = ((InternalEObject)newRotSpeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ROT_SPEED, null, msgs);
      msgs = basicSetRotSpeed(newRotSpeed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ROT_SPEED, newRotSpeed, newRotSpeed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacYaw getNacYaw()
  {
    return nacYaw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNacYaw(nNacYaw newNacYaw, NotificationChain msgs)
  {
    nNacYaw oldNacYaw = nacYaw;
    nacYaw = newNacYaw;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_YAW, oldNacYaw, newNacYaw);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNacYaw(nNacYaw newNacYaw)
  {
    if (newNacYaw != nacYaw)
    {
      NotificationChain msgs = null;
      if (nacYaw != null)
        msgs = ((InternalEObject)nacYaw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_YAW, null, msgs);
      if (newNacYaw != null)
        msgs = ((InternalEObject)newNacYaw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_YAW, null, msgs);
      msgs = basicSetNacYaw(newNacYaw, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_YAW, newNacYaw, newNacYaw));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTDspFA getTTDspFA()
  {
    return ttDspFA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTTDspFA(nTTDspFA newTTDspFA, NotificationChain msgs)
  {
    nTTDspFA oldTTDspFA = ttDspFA;
    ttDspFA = newTTDspFA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TT_DSP_FA, oldTTDspFA, newTTDspFA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTTDspFA(nTTDspFA newTTDspFA)
  {
    if (newTTDspFA != ttDspFA)
    {
      NotificationChain msgs = null;
      if (ttDspFA != null)
        msgs = ((InternalEObject)ttDspFA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TT_DSP_FA, null, msgs);
      if (newTTDspFA != null)
        msgs = ((InternalEObject)newTTDspFA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TT_DSP_FA, null, msgs);
      msgs = basicSetTTDspFA(newTTDspFA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TT_DSP_FA, newTTDspFA, newTTDspFA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTTDspSS getTTDspSS()
  {
    return ttDspSS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTTDspSS(nTTDspSS newTTDspSS, NotificationChain msgs)
  {
    nTTDspSS oldTTDspSS = ttDspSS;
    ttDspSS = newTTDspSS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TT_DSP_SS, oldTTDspSS, newTTDspSS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTTDspSS(nTTDspSS newTTDspSS)
  {
    if (newTTDspSS != ttDspSS)
    {
      NotificationChain msgs = null;
      if (ttDspSS != null)
        msgs = ((InternalEObject)ttDspSS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TT_DSP_SS, null, msgs);
      if (newTTDspSS != null)
        msgs = ((InternalEObject)newTTDspSS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TT_DSP_SS, null, msgs);
      msgs = basicSetTTDspSS(newTTDspSS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TT_DSP_SS, newTTDspSS, newTTDspSS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipRad getTipRad()
  {
    return tipRad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipRad(nTipRad newTipRad, NotificationChain msgs)
  {
    nTipRad oldTipRad = tipRad;
    tipRad = newTipRad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIP_RAD, oldTipRad, newTipRad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipRad(nTipRad newTipRad)
  {
    if (newTipRad != tipRad)
    {
      NotificationChain msgs = null;
      if (tipRad != null)
        msgs = ((InternalEObject)tipRad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIP_RAD, null, msgs);
      if (newTipRad != null)
        msgs = ((InternalEObject)newTipRad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIP_RAD, null, msgs);
      msgs = basicSetTipRad(newTipRad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIP_RAD, newTipRad, newTipRad));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubRad getHubRad()
  {
    return hubRad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHubRad(nHubRad newHubRad, NotificationChain msgs)
  {
    nHubRad oldHubRad = hubRad;
    hubRad = newHubRad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HUB_RAD, oldHubRad, newHubRad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHubRad(nHubRad newHubRad)
  {
    if (newHubRad != hubRad)
    {
      NotificationChain msgs = null;
      if (hubRad != null)
        msgs = ((InternalEObject)hubRad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HUB_RAD, null, msgs);
      if (newHubRad != null)
        msgs = ((InternalEObject)newHubRad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HUB_RAD, null, msgs);
      msgs = basicSetHubRad(newHubRad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HUB_RAD, newHubRad, newHubRad));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPSpnElN getPSpnElN()
  {
    return pSpnElN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPSpnElN(nPSpnElN newPSpnElN, NotificationChain msgs)
  {
    nPSpnElN oldPSpnElN = pSpnElN;
    pSpnElN = newPSpnElN;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PSPN_EL_N, oldPSpnElN, newPSpnElN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPSpnElN(nPSpnElN newPSpnElN)
  {
    if (newPSpnElN != pSpnElN)
    {
      NotificationChain msgs = null;
      if (pSpnElN != null)
        msgs = ((InternalEObject)pSpnElN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PSPN_EL_N, null, msgs);
      if (newPSpnElN != null)
        msgs = ((InternalEObject)newPSpnElN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PSPN_EL_N, null, msgs);
      msgs = basicSetPSpnElN(newPSpnElN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PSPN_EL_N, newPSpnElN, newPSpnElN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nUndSling getUndSling()
  {
    return undSling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUndSling(nUndSling newUndSling, NotificationChain msgs)
  {
    nUndSling oldUndSling = undSling;
    undSling = newUndSling;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__UND_SLING, oldUndSling, newUndSling);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUndSling(nUndSling newUndSling)
  {
    if (newUndSling != undSling)
    {
      NotificationChain msgs = null;
      if (undSling != null)
        msgs = ((InternalEObject)undSling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__UND_SLING, null, msgs);
      if (newUndSling != null)
        msgs = ((InternalEObject)newUndSling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__UND_SLING, null, msgs);
      msgs = basicSetUndSling(newUndSling, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__UND_SLING, newUndSling, newUndSling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubCM getHubCM()
  {
    return hubCM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHubCM(nHubCM newHubCM, NotificationChain msgs)
  {
    nHubCM oldHubCM = hubCM;
    hubCM = newHubCM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HUB_CM, oldHubCM, newHubCM);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHubCM(nHubCM newHubCM)
  {
    if (newHubCM != hubCM)
    {
      NotificationChain msgs = null;
      if (hubCM != null)
        msgs = ((InternalEObject)hubCM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HUB_CM, null, msgs);
      if (newHubCM != null)
        msgs = ((InternalEObject)newHubCM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HUB_CM, null, msgs);
      msgs = basicSetHubCM(newHubCM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HUB_CM, newHubCM, newHubCM));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nOverHang getOverHang()
  {
    return overHang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOverHang(nOverHang newOverHang, NotificationChain msgs)
  {
    nOverHang oldOverHang = overHang;
    overHang = newOverHang;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OVER_HANG, oldOverHang, newOverHang);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverHang(nOverHang newOverHang)
  {
    if (newOverHang != overHang)
    {
      NotificationChain msgs = null;
      if (overHang != null)
        msgs = ((InternalEObject)overHang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OVER_HANG, null, msgs);
      if (newOverHang != null)
        msgs = ((InternalEObject)newOverHang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OVER_HANG, null, msgs);
      msgs = basicSetOverHang(newOverHang, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OVER_HANG, newOverHang, newOverHang));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacCMxn getNacCMxn()
  {
    return nacCMxn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNacCMxn(nNacCMxn newNacCMxn, NotificationChain msgs)
  {
    nNacCMxn oldNacCMxn = nacCMxn;
    nacCMxn = newNacCMxn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_CMXN, oldNacCMxn, newNacCMxn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNacCMxn(nNacCMxn newNacCMxn)
  {
    if (newNacCMxn != nacCMxn)
    {
      NotificationChain msgs = null;
      if (nacCMxn != null)
        msgs = ((InternalEObject)nacCMxn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_CMXN, null, msgs);
      if (newNacCMxn != null)
        msgs = ((InternalEObject)newNacCMxn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_CMXN, null, msgs);
      msgs = basicSetNacCMxn(newNacCMxn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_CMXN, newNacCMxn, newNacCMxn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacCMyn getNacCMyn()
  {
    return nacCMyn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNacCMyn(nNacCMyn newNacCMyn, NotificationChain msgs)
  {
    nNacCMyn oldNacCMyn = nacCMyn;
    nacCMyn = newNacCMyn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_CMYN, oldNacCMyn, newNacCMyn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNacCMyn(nNacCMyn newNacCMyn)
  {
    if (newNacCMyn != nacCMyn)
    {
      NotificationChain msgs = null;
      if (nacCMyn != null)
        msgs = ((InternalEObject)nacCMyn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_CMYN, null, msgs);
      if (newNacCMyn != null)
        msgs = ((InternalEObject)newNacCMyn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_CMYN, null, msgs);
      msgs = basicSetNacCMyn(newNacCMyn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_CMYN, newNacCMyn, newNacCMyn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacCMzn getNacCMzn()
  {
    return nacCMzn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNacCMzn(nNacCMzn newNacCMzn, NotificationChain msgs)
  {
    nNacCMzn oldNacCMzn = nacCMzn;
    nacCMzn = newNacCMzn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_CMZN, oldNacCMzn, newNacCMzn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNacCMzn(nNacCMzn newNacCMzn)
  {
    if (newNacCMzn != nacCMzn)
    {
      NotificationChain msgs = null;
      if (nacCMzn != null)
        msgs = ((InternalEObject)nacCMzn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_CMZN, null, msgs);
      if (newNacCMzn != null)
        msgs = ((InternalEObject)newNacCMzn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_CMZN, null, msgs);
      msgs = basicSetNacCMzn(newNacCMzn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_CMZN, newNacCMzn, newNacCMzn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTowerHt getTowerHt()
  {
    return towerHt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTowerHt(nTowerHt newTowerHt, NotificationChain msgs)
  {
    nTowerHt oldTowerHt = towerHt;
    towerHt = newTowerHt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TOWER_HT, oldTowerHt, newTowerHt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTowerHt(nTowerHt newTowerHt)
  {
    if (newTowerHt != towerHt)
    {
      NotificationChain msgs = null;
      if (towerHt != null)
        msgs = ((InternalEObject)towerHt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TOWER_HT, null, msgs);
      if (newTowerHt != null)
        msgs = ((InternalEObject)newTowerHt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TOWER_HT, null, msgs);
      msgs = basicSetTowerHt(newTowerHt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TOWER_HT, newTowerHt, newTowerHt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwr2Shft getTwr2Shft()
  {
    return twr2Shft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwr2Shft(nTwr2Shft newTwr2Shft, NotificationChain msgs)
  {
    nTwr2Shft oldTwr2Shft = twr2Shft;
    twr2Shft = newTwr2Shft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR2_SHFT, oldTwr2Shft, newTwr2Shft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwr2Shft(nTwr2Shft newTwr2Shft)
  {
    if (newTwr2Shft != twr2Shft)
    {
      NotificationChain msgs = null;
      if (twr2Shft != null)
        msgs = ((InternalEObject)twr2Shft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR2_SHFT, null, msgs);
      if (newTwr2Shft != null)
        msgs = ((InternalEObject)newTwr2Shft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR2_SHFT, null, msgs);
      msgs = basicSetTwr2Shft(newTwr2Shft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR2_SHFT, newTwr2Shft, newTwr2Shft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTwrRBHt getTwrRBHt()
  {
    return twrRBHt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrRBHt(nTwrRBHt newTwrRBHt, NotificationChain msgs)
  {
    nTwrRBHt oldTwrRBHt = twrRBHt;
    twrRBHt = newTwrRBHt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR_RB_HT, oldTwrRBHt, newTwrRBHt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrRBHt(nTwrRBHt newTwrRBHt)
  {
    if (newTwrRBHt != twrRBHt)
    {
      NotificationChain msgs = null;
      if (twrRBHt != null)
        msgs = ((InternalEObject)twrRBHt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR_RB_HT, null, msgs);
      if (newTwrRBHt != null)
        msgs = ((InternalEObject)newTwrRBHt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR_RB_HT, null, msgs);
      msgs = basicSetTwrRBHt(newTwrRBHt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR_RB_HT, newTwrRBHt, newTwrRBHt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nShftTilt getShftTilt()
  {
    return shftTilt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShftTilt(nShftTilt newShftTilt, NotificationChain msgs)
  {
    nShftTilt oldShftTilt = shftTilt;
    shftTilt = newShftTilt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SHFT_TILT, oldShftTilt, newShftTilt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShftTilt(nShftTilt newShftTilt)
  {
    if (newShftTilt != shftTilt)
    {
      NotificationChain msgs = null;
      if (shftTilt != null)
        msgs = ((InternalEObject)shftTilt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SHFT_TILT, null, msgs);
      if (newShftTilt != null)
        msgs = ((InternalEObject)newShftTilt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SHFT_TILT, null, msgs);
      msgs = basicSetShftTilt(newShftTilt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SHFT_TILT, newShftTilt, newShftTilt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDelta3 getDelta3()
  {
    return delta3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelta3(nDelta3 newDelta3, NotificationChain msgs)
  {
    nDelta3 oldDelta3 = delta3;
    delta3 = newDelta3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DELTA3, oldDelta3, newDelta3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelta3(nDelta3 newDelta3)
  {
    if (newDelta3 != delta3)
    {
      NotificationChain msgs = null;
      if (delta3 != null)
        msgs = ((InternalEObject)delta3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DELTA3, null, msgs);
      if (newDelta3 != null)
        msgs = ((InternalEObject)newDelta3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DELTA3, null, msgs);
      msgs = basicSetDelta3(newDelta3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DELTA3, newDelta3, newDelta3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPreCone_1_ getPreCone_1_()
  {
    return preCone_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreCone_1_(nPreCone_1_ newPreCone_1_, NotificationChain msgs)
  {
    nPreCone_1_ oldPreCone_1_ = preCone_1_;
    preCone_1_ = newPreCone_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PRE_CONE_1, oldPreCone_1_, newPreCone_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreCone_1_(nPreCone_1_ newPreCone_1_)
  {
    if (newPreCone_1_ != preCone_1_)
    {
      NotificationChain msgs = null;
      if (preCone_1_ != null)
        msgs = ((InternalEObject)preCone_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PRE_CONE_1, null, msgs);
      if (newPreCone_1_ != null)
        msgs = ((InternalEObject)newPreCone_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PRE_CONE_1, null, msgs);
      msgs = basicSetPreCone_1_(newPreCone_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PRE_CONE_1, newPreCone_1_, newPreCone_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPreCone_2_ getPreCone_2_()
  {
    return preCone_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreCone_2_(nPreCone_2_ newPreCone_2_, NotificationChain msgs)
  {
    nPreCone_2_ oldPreCone_2_ = preCone_2_;
    preCone_2_ = newPreCone_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PRE_CONE_2, oldPreCone_2_, newPreCone_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreCone_2_(nPreCone_2_ newPreCone_2_)
  {
    if (newPreCone_2_ != preCone_2_)
    {
      NotificationChain msgs = null;
      if (preCone_2_ != null)
        msgs = ((InternalEObject)preCone_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PRE_CONE_2, null, msgs);
      if (newPreCone_2_ != null)
        msgs = ((InternalEObject)newPreCone_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PRE_CONE_2, null, msgs);
      msgs = basicSetPreCone_2_(newPreCone_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PRE_CONE_2, newPreCone_2_, newPreCone_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPreCone_3_ getPreCone_3_()
  {
    return preCone_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreCone_3_(nPreCone_3_ newPreCone_3_, NotificationChain msgs)
  {
    nPreCone_3_ oldPreCone_3_ = preCone_3_;
    preCone_3_ = newPreCone_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PRE_CONE_3, oldPreCone_3_, newPreCone_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreCone_3_(nPreCone_3_ newPreCone_3_)
  {
    if (newPreCone_3_ != preCone_3_)
    {
      NotificationChain msgs = null;
      if (preCone_3_ != null)
        msgs = ((InternalEObject)preCone_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PRE_CONE_3, null, msgs);
      if (newPreCone_3_ != null)
        msgs = ((InternalEObject)newPreCone_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PRE_CONE_3, null, msgs);
      msgs = basicSetPreCone_3_(newPreCone_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PRE_CONE_3, newPreCone_3_, newPreCone_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAzimB1Up getAzimB1Up()
  {
    return azimB1Up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAzimB1Up(nAzimB1Up newAzimB1Up, NotificationChain msgs)
  {
    nAzimB1Up oldAzimB1Up = azimB1Up;
    azimB1Up = newAzimB1Up;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__AZIM_B1_UP, oldAzimB1Up, newAzimB1Up);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAzimB1Up(nAzimB1Up newAzimB1Up)
  {
    if (newAzimB1Up != azimB1Up)
    {
      NotificationChain msgs = null;
      if (azimB1Up != null)
        msgs = ((InternalEObject)azimB1Up).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__AZIM_B1_UP, null, msgs);
      if (newAzimB1Up != null)
        msgs = ((InternalEObject)newAzimB1Up).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__AZIM_B1_UP, null, msgs);
      msgs = basicSetAzimB1Up(newAzimB1Up, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__AZIM_B1_UP, newAzimB1Up, newAzimB1Up));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nYawBrMass getYawBrMass()
  {
    return yawBrMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYawBrMass(nYawBrMass newYawBrMass, NotificationChain msgs)
  {
    nYawBrMass oldYawBrMass = yawBrMass;
    yawBrMass = newYawBrMass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_BR_MASS, oldYawBrMass, newYawBrMass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYawBrMass(nYawBrMass newYawBrMass)
  {
    if (newYawBrMass != yawBrMass)
    {
      NotificationChain msgs = null;
      if (yawBrMass != null)
        msgs = ((InternalEObject)yawBrMass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_BR_MASS, null, msgs);
      if (newYawBrMass != null)
        msgs = ((InternalEObject)newYawBrMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_BR_MASS, null, msgs);
      msgs = basicSetYawBrMass(newYawBrMass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_BR_MASS, newYawBrMass, newYawBrMass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacMass getNacMass()
  {
    return nacMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNacMass(nNacMass newNacMass, NotificationChain msgs)
  {
    nNacMass oldNacMass = nacMass;
    nacMass = newNacMass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_MASS, oldNacMass, newNacMass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNacMass(nNacMass newNacMass)
  {
    if (newNacMass != nacMass)
    {
      NotificationChain msgs = null;
      if (nacMass != null)
        msgs = ((InternalEObject)nacMass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_MASS, null, msgs);
      if (newNacMass != null)
        msgs = ((InternalEObject)newNacMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_MASS, null, msgs);
      msgs = basicSetNacMass(newNacMass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_MASS, newNacMass, newNacMass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubMass getHubMass()
  {
    return hubMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHubMass(nHubMass newHubMass, NotificationChain msgs)
  {
    nHubMass oldHubMass = hubMass;
    hubMass = newHubMass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HUB_MASS, oldHubMass, newHubMass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHubMass(nHubMass newHubMass)
  {
    if (newHubMass != hubMass)
    {
      NotificationChain msgs = null;
      if (hubMass != null)
        msgs = ((InternalEObject)hubMass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HUB_MASS, null, msgs);
      if (newHubMass != null)
        msgs = ((InternalEObject)newHubMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HUB_MASS, null, msgs);
      msgs = basicSetHubMass(newHubMass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HUB_MASS, newHubMass, newHubMass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipMass_1_ getTipMass_1_()
  {
    return tipMass_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipMass_1_(nTipMass_1_ newTipMass_1_, NotificationChain msgs)
  {
    nTipMass_1_ oldTipMass_1_ = tipMass_1_;
    tipMass_1_ = newTipMass_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIP_MASS_1, oldTipMass_1_, newTipMass_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipMass_1_(nTipMass_1_ newTipMass_1_)
  {
    if (newTipMass_1_ != tipMass_1_)
    {
      NotificationChain msgs = null;
      if (tipMass_1_ != null)
        msgs = ((InternalEObject)tipMass_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIP_MASS_1, null, msgs);
      if (newTipMass_1_ != null)
        msgs = ((InternalEObject)newTipMass_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIP_MASS_1, null, msgs);
      msgs = basicSetTipMass_1_(newTipMass_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIP_MASS_1, newTipMass_1_, newTipMass_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipMass_2_ getTipMass_2_()
  {
    return tipMass_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipMass_2_(nTipMass_2_ newTipMass_2_, NotificationChain msgs)
  {
    nTipMass_2_ oldTipMass_2_ = tipMass_2_;
    tipMass_2_ = newTipMass_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIP_MASS_2, oldTipMass_2_, newTipMass_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipMass_2_(nTipMass_2_ newTipMass_2_)
  {
    if (newTipMass_2_ != tipMass_2_)
    {
      NotificationChain msgs = null;
      if (tipMass_2_ != null)
        msgs = ((InternalEObject)tipMass_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIP_MASS_2, null, msgs);
      if (newTipMass_2_ != null)
        msgs = ((InternalEObject)newTipMass_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIP_MASS_2, null, msgs);
      msgs = basicSetTipMass_2_(newTipMass_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIP_MASS_2, newTipMass_2_, newTipMass_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipMass_3_ getTipMass_3_()
  {
    return tipMass_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipMass_3_(nTipMass_3_ newTipMass_3_, NotificationChain msgs)
  {
    nTipMass_3_ oldTipMass_3_ = tipMass_3_;
    tipMass_3_ = newTipMass_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIP_MASS_3, oldTipMass_3_, newTipMass_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipMass_3_(nTipMass_3_ newTipMass_3_)
  {
    if (newTipMass_3_ != tipMass_3_)
    {
      NotificationChain msgs = null;
      if (tipMass_3_ != null)
        msgs = ((InternalEObject)tipMass_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIP_MASS_3, null, msgs);
      if (newTipMass_3_ != null)
        msgs = ((InternalEObject)newTipMass_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TIP_MASS_3, null, msgs);
      msgs = basicSetTipMass_3_(newTipMass_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TIP_MASS_3, newTipMass_3_, newTipMass_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNacYIner getNacYIner()
  {
    return nacYIner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNacYIner(nNacYIner newNacYIner, NotificationChain msgs)
  {
    nNacYIner oldNacYIner = nacYIner;
    nacYIner = newNacYIner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_YINER, oldNacYIner, newNacYIner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNacYIner(nNacYIner newNacYIner)
  {
    if (newNacYIner != nacYIner)
    {
      NotificationChain msgs = null;
      if (nacYIner != null)
        msgs = ((InternalEObject)nacYIner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_YINER, null, msgs);
      if (newNacYIner != null)
        msgs = ((InternalEObject)newNacYIner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NAC_YINER, null, msgs);
      msgs = basicSetNacYIner(newNacYIner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NAC_YINER, newNacYIner, newNacYIner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGenIner getGenIner()
  {
    return genIner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenIner(nGenIner newGenIner, NotificationChain msgs)
  {
    nGenIner oldGenIner = genIner;
    genIner = newGenIner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_INER, oldGenIner, newGenIner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenIner(nGenIner newGenIner)
  {
    if (newGenIner != genIner)
    {
      NotificationChain msgs = null;
      if (genIner != null)
        msgs = ((InternalEObject)genIner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_INER, null, msgs);
      if (newGenIner != null)
        msgs = ((InternalEObject)newGenIner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_INER, null, msgs);
      msgs = basicSetGenIner(newGenIner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_INER, newGenIner, newGenIner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubIner getHubIner()
  {
    return hubIner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHubIner(nHubIner newHubIner, NotificationChain msgs)
  {
    nHubIner oldHubIner = hubIner;
    hubIner = newHubIner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HUB_INER, oldHubIner, newHubIner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHubIner(nHubIner newHubIner)
  {
    if (newHubIner != hubIner)
    {
      NotificationChain msgs = null;
      if (hubIner != null)
        msgs = ((InternalEObject)hubIner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HUB_INER, null, msgs);
      if (newHubIner != null)
        msgs = ((InternalEObject)newHubIner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HUB_INER, null, msgs);
      msgs = basicSetHubIner(newHubIner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HUB_INER, newHubIner, newHubIner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGBoxEff getGBoxEff()
  {
    return gBoxEff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGBoxEff(nGBoxEff newGBoxEff, NotificationChain msgs)
  {
    nGBoxEff oldGBoxEff = gBoxEff;
    gBoxEff = newGBoxEff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GBOX_EFF, oldGBoxEff, newGBoxEff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGBoxEff(nGBoxEff newGBoxEff)
  {
    if (newGBoxEff != gBoxEff)
    {
      NotificationChain msgs = null;
      if (gBoxEff != null)
        msgs = ((InternalEObject)gBoxEff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GBOX_EFF, null, msgs);
      if (newGBoxEff != null)
        msgs = ((InternalEObject)newGBoxEff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GBOX_EFF, null, msgs);
      msgs = basicSetGBoxEff(newGBoxEff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GBOX_EFF, newGBoxEff, newGBoxEff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGenEff getGenEff()
  {
    return genEff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenEff(nGenEff newGenEff, NotificationChain msgs)
  {
    nGenEff oldGenEff = genEff;
    genEff = newGenEff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_EFF, oldGenEff, newGenEff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenEff(nGenEff newGenEff)
  {
    if (newGenEff != genEff)
    {
      NotificationChain msgs = null;
      if (genEff != null)
        msgs = ((InternalEObject)genEff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_EFF, null, msgs);
      if (newGenEff != null)
        msgs = ((InternalEObject)newGenEff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GEN_EFF, null, msgs);
      msgs = basicSetGenEff(newGenEff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GEN_EFF, newGenEff, newGenEff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGBRatio getGBRatio()
  {
    return gbRatio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGBRatio(nGBRatio newGBRatio, NotificationChain msgs)
  {
    nGBRatio oldGBRatio = gbRatio;
    gbRatio = newGBRatio;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GB_RATIO, oldGBRatio, newGBRatio);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGBRatio(nGBRatio newGBRatio)
  {
    if (newGBRatio != gbRatio)
    {
      NotificationChain msgs = null;
      if (gbRatio != null)
        msgs = ((InternalEObject)gbRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GB_RATIO, null, msgs);
      if (newGBRatio != null)
        msgs = ((InternalEObject)newGBRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GB_RATIO, null, msgs);
      msgs = basicSetGBRatio(newGBRatio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GB_RATIO, newGBRatio, newGBRatio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bGBRevers getGBRevers()
  {
    return gbRevers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGBRevers(bGBRevers newGBRevers, NotificationChain msgs)
  {
    bGBRevers oldGBRevers = gbRevers;
    gbRevers = newGBRevers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GB_REVERS, oldGBRevers, newGBRevers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGBRevers(bGBRevers newGBRevers)
  {
    if (newGBRevers != gbRevers)
    {
      NotificationChain msgs = null;
      if (gbRevers != null)
        msgs = ((InternalEObject)gbRevers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GB_REVERS, null, msgs);
      if (newGBRevers != null)
        msgs = ((InternalEObject)newGBRevers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__GB_REVERS, null, msgs);
      msgs = basicSetGBRevers(newGBRevers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__GB_REVERS, newGBRevers, newGBRevers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHSSBrTqF getHSSBrTqF()
  {
    return hssBrTqF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHSSBrTqF(nHSSBrTqF newHSSBrTqF, NotificationChain msgs)
  {
    nHSSBrTqF oldHSSBrTqF = hssBrTqF;
    hssBrTqF = newHSSBrTqF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F, oldHSSBrTqF, newHSSBrTqF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHSSBrTqF(nHSSBrTqF newHSSBrTqF)
  {
    if (newHSSBrTqF != hssBrTqF)
    {
      NotificationChain msgs = null;
      if (hssBrTqF != null)
        msgs = ((InternalEObject)hssBrTqF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F, null, msgs);
      if (newHSSBrTqF != null)
        msgs = ((InternalEObject)newHSSBrTqF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F, null, msgs);
      msgs = basicSetHSSBrTqF(newHSSBrTqF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F, newHSSBrTqF, newHSSBrTqF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHSSBrDT getHSSBrDT()
  {
    return hssBrDT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHSSBrDT(nHSSBrDT newHSSBrDT, NotificationChain msgs)
  {
    nHSSBrDT oldHSSBrDT = hssBrDT;
    hssBrDT = newHSSBrDT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HSS_BR_DT, oldHSSBrDT, newHSSBrDT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHSSBrDT(nHSSBrDT newHSSBrDT)
  {
    if (newHSSBrDT != hssBrDT)
    {
      NotificationChain msgs = null;
      if (hssBrDT != null)
        msgs = ((InternalEObject)hssBrDT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HSS_BR_DT, null, msgs);
      if (newHSSBrDT != null)
        msgs = ((InternalEObject)newHSSBrDT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__HSS_BR_DT, null, msgs);
      msgs = basicSetHSSBrDT(newHSSBrDT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__HSS_BR_DT, newHSSBrDT, newHSSBrDT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fDynBrkFi getDynBrkFi()
  {
    return dynBrkFi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDynBrkFi(fDynBrkFi newDynBrkFi, NotificationChain msgs)
  {
    fDynBrkFi oldDynBrkFi = dynBrkFi;
    dynBrkFi = newDynBrkFi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DYN_BRK_FI, oldDynBrkFi, newDynBrkFi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDynBrkFi(fDynBrkFi newDynBrkFi)
  {
    if (newDynBrkFi != dynBrkFi)
    {
      NotificationChain msgs = null;
      if (dynBrkFi != null)
        msgs = ((InternalEObject)dynBrkFi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DYN_BRK_FI, null, msgs);
      if (newDynBrkFi != null)
        msgs = ((InternalEObject)newDynBrkFi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DYN_BRK_FI, null, msgs);
      msgs = basicSetDynBrkFi(newDynBrkFi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DYN_BRK_FI, newDynBrkFi, newDynBrkFi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDTTorSpr getDTTorSpr()
  {
    return dtTorSpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDTTorSpr(nDTTorSpr newDTTorSpr, NotificationChain msgs)
  {
    nDTTorSpr oldDTTorSpr = dtTorSpr;
    dtTorSpr = newDTTorSpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DT_TOR_SPR, oldDTTorSpr, newDTTorSpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDTTorSpr(nDTTorSpr newDTTorSpr)
  {
    if (newDTTorSpr != dtTorSpr)
    {
      NotificationChain msgs = null;
      if (dtTorSpr != null)
        msgs = ((InternalEObject)dtTorSpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DT_TOR_SPR, null, msgs);
      if (newDTTorSpr != null)
        msgs = ((InternalEObject)newDTTorSpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DT_TOR_SPR, null, msgs);
      msgs = basicSetDTTorSpr(newDTTorSpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DT_TOR_SPR, newDTTorSpr, newDTTorSpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDTTorDmp getDTTorDmp()
  {
    return dtTorDmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDTTorDmp(nDTTorDmp newDTTorDmp, NotificationChain msgs)
  {
    nDTTorDmp oldDTTorDmp = dtTorDmp;
    dtTorDmp = newDTTorDmp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DT_TOR_DMP, oldDTTorDmp, newDTTorDmp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDTTorDmp(nDTTorDmp newDTTorDmp)
  {
    if (newDTTorDmp != dtTorDmp)
    {
      NotificationChain msgs = null;
      if (dtTorDmp != null)
        msgs = ((InternalEObject)dtTorDmp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DT_TOR_DMP, null, msgs);
      if (newDTTorDmp != null)
        msgs = ((InternalEObject)newDTTorDmp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DT_TOR_DMP, null, msgs);
      msgs = basicSetDTTorDmp(newDTTorDmp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DT_TOR_DMP, newDTTorDmp, newDTTorDmp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSIG_SlPc getSIG_SlPc()
  {
    return siG_SlPc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSIG_SlPc(nSIG_SlPc newSIG_SlPc, NotificationChain msgs)
  {
    nSIG_SlPc oldSIG_SlPc = siG_SlPc;
    siG_SlPc = newSIG_SlPc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SIG_SL_PC, oldSIG_SlPc, newSIG_SlPc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSIG_SlPc(nSIG_SlPc newSIG_SlPc)
  {
    if (newSIG_SlPc != siG_SlPc)
    {
      NotificationChain msgs = null;
      if (siG_SlPc != null)
        msgs = ((InternalEObject)siG_SlPc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SIG_SL_PC, null, msgs);
      if (newSIG_SlPc != null)
        msgs = ((InternalEObject)newSIG_SlPc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SIG_SL_PC, null, msgs);
      msgs = basicSetSIG_SlPc(newSIG_SlPc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SIG_SL_PC, newSIG_SlPc, newSIG_SlPc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSIG_SySp getSIG_SySp()
  {
    return siG_SySp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSIG_SySp(nSIG_SySp newSIG_SySp, NotificationChain msgs)
  {
    nSIG_SySp oldSIG_SySp = siG_SySp;
    siG_SySp = newSIG_SySp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SIG_SY_SP, oldSIG_SySp, newSIG_SySp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSIG_SySp(nSIG_SySp newSIG_SySp)
  {
    if (newSIG_SySp != siG_SySp)
    {
      NotificationChain msgs = null;
      if (siG_SySp != null)
        msgs = ((InternalEObject)siG_SySp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SIG_SY_SP, null, msgs);
      if (newSIG_SySp != null)
        msgs = ((InternalEObject)newSIG_SySp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SIG_SY_SP, null, msgs);
      msgs = basicSetSIG_SySp(newSIG_SySp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SIG_SY_SP, newSIG_SySp, newSIG_SySp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSIG_RtTq getSIG_RtTq()
  {
    return siG_RtTq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSIG_RtTq(nSIG_RtTq newSIG_RtTq, NotificationChain msgs)
  {
    nSIG_RtTq oldSIG_RtTq = siG_RtTq;
    siG_RtTq = newSIG_RtTq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SIG_RT_TQ, oldSIG_RtTq, newSIG_RtTq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSIG_RtTq(nSIG_RtTq newSIG_RtTq)
  {
    if (newSIG_RtTq != siG_RtTq)
    {
      NotificationChain msgs = null;
      if (siG_RtTq != null)
        msgs = ((InternalEObject)siG_RtTq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SIG_RT_TQ, null, msgs);
      if (newSIG_RtTq != null)
        msgs = ((InternalEObject)newSIG_RtTq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SIG_RT_TQ, null, msgs);
      msgs = basicSetSIG_RtTq(newSIG_RtTq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SIG_RT_TQ, newSIG_RtTq, newSIG_RtTq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSIG_PORt getSIG_PORt()
  {
    return siG_PORt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSIG_PORt(nSIG_PORt newSIG_PORt, NotificationChain msgs)
  {
    nSIG_PORt oldSIG_PORt = siG_PORt;
    siG_PORt = newSIG_PORt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SIG_PO_RT, oldSIG_PORt, newSIG_PORt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSIG_PORt(nSIG_PORt newSIG_PORt)
  {
    if (newSIG_PORt != siG_PORt)
    {
      NotificationChain msgs = null;
      if (siG_PORt != null)
        msgs = ((InternalEObject)siG_PORt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SIG_PO_RT, null, msgs);
      if (newSIG_PORt != null)
        msgs = ((InternalEObject)newSIG_PORt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SIG_PO_RT, null, msgs);
      msgs = basicSetSIG_PORt(newSIG_PORt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SIG_PO_RT, newSIG_PORt, newSIG_PORt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_Freq getTEC_Freq()
  {
    return teC_Freq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEC_Freq(nTEC_Freq newTEC_Freq, NotificationChain msgs)
  {
    nTEC_Freq oldTEC_Freq = teC_Freq;
    teC_Freq = newTEC_Freq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_FREQ, oldTEC_Freq, newTEC_Freq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEC_Freq(nTEC_Freq newTEC_Freq)
  {
    if (newTEC_Freq != teC_Freq)
    {
      NotificationChain msgs = null;
      if (teC_Freq != null)
        msgs = ((InternalEObject)teC_Freq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_FREQ, null, msgs);
      if (newTEC_Freq != null)
        msgs = ((InternalEObject)newTEC_Freq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_FREQ, null, msgs);
      msgs = basicSetTEC_Freq(newTEC_Freq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_FREQ, newTEC_Freq, newTEC_Freq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_Npol getTEC_Npol()
  {
    return teC_Npol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEC_Npol(nTEC_Npol newTEC_Npol, NotificationChain msgs)
  {
    nTEC_Npol oldTEC_Npol = teC_Npol;
    teC_Npol = newTEC_Npol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_NPOL, oldTEC_Npol, newTEC_Npol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEC_Npol(nTEC_Npol newTEC_Npol)
  {
    if (newTEC_Npol != teC_Npol)
    {
      NotificationChain msgs = null;
      if (teC_Npol != null)
        msgs = ((InternalEObject)teC_Npol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_NPOL, null, msgs);
      if (newTEC_Npol != null)
        msgs = ((InternalEObject)newTEC_Npol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_NPOL, null, msgs);
      msgs = basicSetTEC_Npol(newTEC_Npol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_NPOL, newTEC_Npol, newTEC_Npol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_Sres getTEC_Sres()
  {
    return teC_Sres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEC_Sres(nTEC_Sres newTEC_Sres, NotificationChain msgs)
  {
    nTEC_Sres oldTEC_Sres = teC_Sres;
    teC_Sres = newTEC_Sres;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_SRES, oldTEC_Sres, newTEC_Sres);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEC_Sres(nTEC_Sres newTEC_Sres)
  {
    if (newTEC_Sres != teC_Sres)
    {
      NotificationChain msgs = null;
      if (teC_Sres != null)
        msgs = ((InternalEObject)teC_Sres).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_SRES, null, msgs);
      if (newTEC_Sres != null)
        msgs = ((InternalEObject)newTEC_Sres).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_SRES, null, msgs);
      msgs = basicSetTEC_Sres(newTEC_Sres, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_SRES, newTEC_Sres, newTEC_Sres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_Rres getTEC_Rres()
  {
    return teC_Rres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEC_Rres(nTEC_Rres newTEC_Rres, NotificationChain msgs)
  {
    nTEC_Rres oldTEC_Rres = teC_Rres;
    teC_Rres = newTEC_Rres;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_RRES, oldTEC_Rres, newTEC_Rres);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEC_Rres(nTEC_Rres newTEC_Rres)
  {
    if (newTEC_Rres != teC_Rres)
    {
      NotificationChain msgs = null;
      if (teC_Rres != null)
        msgs = ((InternalEObject)teC_Rres).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_RRES, null, msgs);
      if (newTEC_Rres != null)
        msgs = ((InternalEObject)newTEC_Rres).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_RRES, null, msgs);
      msgs = basicSetTEC_Rres(newTEC_Rres, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_RRES, newTEC_Rres, newTEC_Rres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_VLL getTEC_VLL()
  {
    return teC_VLL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEC_VLL(nTEC_VLL newTEC_VLL, NotificationChain msgs)
  {
    nTEC_VLL oldTEC_VLL = teC_VLL;
    teC_VLL = newTEC_VLL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_VLL, oldTEC_VLL, newTEC_VLL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEC_VLL(nTEC_VLL newTEC_VLL)
  {
    if (newTEC_VLL != teC_VLL)
    {
      NotificationChain msgs = null;
      if (teC_VLL != null)
        msgs = ((InternalEObject)teC_VLL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_VLL, null, msgs);
      if (newTEC_VLL != null)
        msgs = ((InternalEObject)newTEC_VLL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_VLL, null, msgs);
      msgs = basicSetTEC_VLL(newTEC_VLL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_VLL, newTEC_VLL, newTEC_VLL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_SLR getTEC_SLR()
  {
    return teC_SLR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEC_SLR(nTEC_SLR newTEC_SLR, NotificationChain msgs)
  {
    nTEC_SLR oldTEC_SLR = teC_SLR;
    teC_SLR = newTEC_SLR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_SLR, oldTEC_SLR, newTEC_SLR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEC_SLR(nTEC_SLR newTEC_SLR)
  {
    if (newTEC_SLR != teC_SLR)
    {
      NotificationChain msgs = null;
      if (teC_SLR != null)
        msgs = ((InternalEObject)teC_SLR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_SLR, null, msgs);
      if (newTEC_SLR != null)
        msgs = ((InternalEObject)newTEC_SLR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_SLR, null, msgs);
      msgs = basicSetTEC_SLR(newTEC_SLR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_SLR, newTEC_SLR, newTEC_SLR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_RLR getTEC_RLR()
  {
    return teC_RLR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEC_RLR(nTEC_RLR newTEC_RLR, NotificationChain msgs)
  {
    nTEC_RLR oldTEC_RLR = teC_RLR;
    teC_RLR = newTEC_RLR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_RLR, oldTEC_RLR, newTEC_RLR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEC_RLR(nTEC_RLR newTEC_RLR)
  {
    if (newTEC_RLR != teC_RLR)
    {
      NotificationChain msgs = null;
      if (teC_RLR != null)
        msgs = ((InternalEObject)teC_RLR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_RLR, null, msgs);
      if (newTEC_RLR != null)
        msgs = ((InternalEObject)newTEC_RLR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_RLR, null, msgs);
      msgs = basicSetTEC_RLR(newTEC_RLR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_RLR, newTEC_RLR, newTEC_RLR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTEC_MR getTEC_MR()
  {
    return teC_MR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTEC_MR(nTEC_MR newTEC_MR, NotificationChain msgs)
  {
    nTEC_MR oldTEC_MR = teC_MR;
    teC_MR = newTEC_MR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_MR, oldTEC_MR, newTEC_MR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTEC_MR(nTEC_MR newTEC_MR)
  {
    if (newTEC_MR != teC_MR)
    {
      NotificationChain msgs = null;
      if (teC_MR != null)
        msgs = ((InternalEObject)teC_MR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_MR, null, msgs);
      if (newTEC_MR != null)
        msgs = ((InternalEObject)newTEC_MR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEC_MR, null, msgs);
      msgs = basicSetTEC_MR(newTEC_MR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEC_MR, newTEC_MR, newTEC_MR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iPtfmModel getPtfmModel()
  {
    return ptfmModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPtfmModel(iPtfmModel newPtfmModel, NotificationChain msgs)
  {
    iPtfmModel oldPtfmModel = ptfmModel;
    ptfmModel = newPtfmModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PTFM_MODEL, oldPtfmModel, newPtfmModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPtfmModel(iPtfmModel newPtfmModel)
  {
    if (newPtfmModel != ptfmModel)
    {
      NotificationChain msgs = null;
      if (ptfmModel != null)
        msgs = ((InternalEObject)ptfmModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PTFM_MODEL, null, msgs);
      if (newPtfmModel != null)
        msgs = ((InternalEObject)newPtfmModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PTFM_MODEL, null, msgs);
      msgs = basicSetPtfmModel(newPtfmModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PTFM_MODEL, newPtfmModel, newPtfmModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fPtfmFile getPtfmFile()
  {
    return ptfmFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPtfmFile(fPtfmFile newPtfmFile, NotificationChain msgs)
  {
    fPtfmFile oldPtfmFile = ptfmFile;
    ptfmFile = newPtfmFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PTFM_FILE, oldPtfmFile, newPtfmFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPtfmFile(fPtfmFile newPtfmFile)
  {
    if (newPtfmFile != ptfmFile)
    {
      NotificationChain msgs = null;
      if (ptfmFile != null)
        msgs = ((InternalEObject)ptfmFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PTFM_FILE, null, msgs);
      if (newPtfmFile != null)
        msgs = ((InternalEObject)newPtfmFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__PTFM_FILE, null, msgs);
      msgs = basicSetPtfmFile(newPtfmFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__PTFM_FILE, newPtfmFile, newPtfmFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iTwrNodes getTwrNodes()
  {
    return twrNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrNodes(iTwrNodes newTwrNodes, NotificationChain msgs)
  {
    iTwrNodes oldTwrNodes = twrNodes;
    twrNodes = newTwrNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR_NODES, oldTwrNodes, newTwrNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrNodes(iTwrNodes newTwrNodes)
  {
    if (newTwrNodes != twrNodes)
    {
      NotificationChain msgs = null;
      if (twrNodes != null)
        msgs = ((InternalEObject)twrNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR_NODES, null, msgs);
      if (newTwrNodes != null)
        msgs = ((InternalEObject)newTwrNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR_NODES, null, msgs);
      msgs = basicSetTwrNodes(newTwrNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR_NODES, newTwrNodes, newTwrNodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fTwrFile getTwrFile()
  {
    return twrFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrFile(fTwrFile newTwrFile, NotificationChain msgs)
  {
    fTwrFile oldTwrFile = twrFile;
    twrFile = newTwrFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR_FILE, oldTwrFile, newTwrFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrFile(fTwrFile newTwrFile)
  {
    if (newTwrFile != twrFile)
    {
      NotificationChain msgs = null;
      if (twrFile != null)
        msgs = ((InternalEObject)twrFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR_FILE, null, msgs);
      if (newTwrFile != null)
        msgs = ((InternalEObject)newTwrFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR_FILE, null, msgs);
      msgs = basicSetTwrFile(newTwrFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR_FILE, newTwrFile, newTwrFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nYawSpr getYawSpr()
  {
    return yawSpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYawSpr(nYawSpr newYawSpr, NotificationChain msgs)
  {
    nYawSpr oldYawSpr = yawSpr;
    yawSpr = newYawSpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_SPR, oldYawSpr, newYawSpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYawSpr(nYawSpr newYawSpr)
  {
    if (newYawSpr != yawSpr)
    {
      NotificationChain msgs = null;
      if (yawSpr != null)
        msgs = ((InternalEObject)yawSpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_SPR, null, msgs);
      if (newYawSpr != null)
        msgs = ((InternalEObject)newYawSpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_SPR, null, msgs);
      msgs = basicSetYawSpr(newYawSpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_SPR, newYawSpr, newYawSpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nYawDamp getYawDamp()
  {
    return yawDamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYawDamp(nYawDamp newYawDamp, NotificationChain msgs)
  {
    nYawDamp oldYawDamp = yawDamp;
    yawDamp = newYawDamp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_DAMP, oldYawDamp, newYawDamp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYawDamp(nYawDamp newYawDamp)
  {
    if (newYawDamp != yawDamp)
    {
      NotificationChain msgs = null;
      if (yawDamp != null)
        msgs = ((InternalEObject)yawDamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_DAMP, null, msgs);
      if (newYawDamp != null)
        msgs = ((InternalEObject)newYawDamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_DAMP, null, msgs);
      msgs = basicSetYawDamp(newYawDamp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_DAMP, newYawDamp, newYawDamp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nYawNeut getYawNeut()
  {
    return yawNeut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYawNeut(nYawNeut newYawNeut, NotificationChain msgs)
  {
    nYawNeut oldYawNeut = yawNeut;
    yawNeut = newYawNeut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_NEUT, oldYawNeut, newYawNeut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYawNeut(nYawNeut newYawNeut)
  {
    if (newYawNeut != yawNeut)
    {
      NotificationChain msgs = null;
      if (yawNeut != null)
        msgs = ((InternalEObject)yawNeut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_NEUT, null, msgs);
      if (newYawNeut != null)
        msgs = ((InternalEObject)newYawNeut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__YAW_NEUT, null, msgs);
      msgs = basicSetYawNeut(newYawNeut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__YAW_NEUT, newYawNeut, newYawNeut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bFurling getFurling()
  {
    return furling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFurling(bFurling newFurling, NotificationChain msgs)
  {
    bFurling oldFurling = furling;
    furling = newFurling;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__FURLING, oldFurling, newFurling);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFurling(bFurling newFurling)
  {
    if (newFurling != furling)
    {
      NotificationChain msgs = null;
      if (furling != null)
        msgs = ((InternalEObject)furling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__FURLING, null, msgs);
      if (newFurling != null)
        msgs = ((InternalEObject)newFurling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__FURLING, null, msgs);
      msgs = basicSetFurling(newFurling, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__FURLING, newFurling, newFurling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fFurlFile getFurlFile()
  {
    return furlFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFurlFile(fFurlFile newFurlFile, NotificationChain msgs)
  {
    fFurlFile oldFurlFile = furlFile;
    furlFile = newFurlFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__FURL_FILE, oldFurlFile, newFurlFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFurlFile(fFurlFile newFurlFile)
  {
    if (newFurlFile != furlFile)
    {
      NotificationChain msgs = null;
      if (furlFile != null)
        msgs = ((InternalEObject)furlFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__FURL_FILE, null, msgs);
      if (newFurlFile != null)
        msgs = ((InternalEObject)newFurlFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__FURL_FILE, null, msgs);
      msgs = basicSetFurlFile(newFurlFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__FURL_FILE, newFurlFile, newFurlFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iTeetMod getTeetMod()
  {
    return teetMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetMod(iTeetMod newTeetMod, NotificationChain msgs)
  {
    iTeetMod oldTeetMod = teetMod;
    teetMod = newTeetMod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_MOD, oldTeetMod, newTeetMod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetMod(iTeetMod newTeetMod)
  {
    if (newTeetMod != teetMod)
    {
      NotificationChain msgs = null;
      if (teetMod != null)
        msgs = ((InternalEObject)teetMod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_MOD, null, msgs);
      if (newTeetMod != null)
        msgs = ((InternalEObject)newTeetMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_MOD, null, msgs);
      msgs = basicSetTeetMod(newTeetMod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_MOD, newTeetMod, newTeetMod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetDmpP getTeetDmpP()
  {
    return teetDmpP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetDmpP(nTeetDmpP newTeetDmpP, NotificationChain msgs)
  {
    nTeetDmpP oldTeetDmpP = teetDmpP;
    teetDmpP = newTeetDmpP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_DMP_P, oldTeetDmpP, newTeetDmpP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetDmpP(nTeetDmpP newTeetDmpP)
  {
    if (newTeetDmpP != teetDmpP)
    {
      NotificationChain msgs = null;
      if (teetDmpP != null)
        msgs = ((InternalEObject)teetDmpP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_DMP_P, null, msgs);
      if (newTeetDmpP != null)
        msgs = ((InternalEObject)newTeetDmpP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_DMP_P, null, msgs);
      msgs = basicSetTeetDmpP(newTeetDmpP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_DMP_P, newTeetDmpP, newTeetDmpP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetDmp getTeetDmp()
  {
    return teetDmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetDmp(nTeetDmp newTeetDmp, NotificationChain msgs)
  {
    nTeetDmp oldTeetDmp = teetDmp;
    teetDmp = newTeetDmp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_DMP, oldTeetDmp, newTeetDmp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetDmp(nTeetDmp newTeetDmp)
  {
    if (newTeetDmp != teetDmp)
    {
      NotificationChain msgs = null;
      if (teetDmp != null)
        msgs = ((InternalEObject)teetDmp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_DMP, null, msgs);
      if (newTeetDmp != null)
        msgs = ((InternalEObject)newTeetDmp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_DMP, null, msgs);
      msgs = basicSetTeetDmp(newTeetDmp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_DMP, newTeetDmp, newTeetDmp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetCDmp getTeetCDmp()
  {
    return teetCDmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetCDmp(nTeetCDmp newTeetCDmp, NotificationChain msgs)
  {
    nTeetCDmp oldTeetCDmp = teetCDmp;
    teetCDmp = newTeetCDmp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_CDMP, oldTeetCDmp, newTeetCDmp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetCDmp(nTeetCDmp newTeetCDmp)
  {
    if (newTeetCDmp != teetCDmp)
    {
      NotificationChain msgs = null;
      if (teetCDmp != null)
        msgs = ((InternalEObject)teetCDmp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_CDMP, null, msgs);
      if (newTeetCDmp != null)
        msgs = ((InternalEObject)newTeetCDmp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_CDMP, null, msgs);
      msgs = basicSetTeetCDmp(newTeetCDmp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_CDMP, newTeetCDmp, newTeetCDmp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetSStP getTeetSStP()
  {
    return teetSStP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetSStP(nTeetSStP newTeetSStP, NotificationChain msgs)
  {
    nTeetSStP oldTeetSStP = teetSStP;
    teetSStP = newTeetSStP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_SST_P, oldTeetSStP, newTeetSStP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetSStP(nTeetSStP newTeetSStP)
  {
    if (newTeetSStP != teetSStP)
    {
      NotificationChain msgs = null;
      if (teetSStP != null)
        msgs = ((InternalEObject)teetSStP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_SST_P, null, msgs);
      if (newTeetSStP != null)
        msgs = ((InternalEObject)newTeetSStP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_SST_P, null, msgs);
      msgs = basicSetTeetSStP(newTeetSStP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_SST_P, newTeetSStP, newTeetSStP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetHStP getTeetHStP()
  {
    return teetHStP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetHStP(nTeetHStP newTeetHStP, NotificationChain msgs)
  {
    nTeetHStP oldTeetHStP = teetHStP;
    teetHStP = newTeetHStP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_HST_P, oldTeetHStP, newTeetHStP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetHStP(nTeetHStP newTeetHStP)
  {
    if (newTeetHStP != teetHStP)
    {
      NotificationChain msgs = null;
      if (teetHStP != null)
        msgs = ((InternalEObject)teetHStP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_HST_P, null, msgs);
      if (newTeetHStP != null)
        msgs = ((InternalEObject)newTeetHStP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_HST_P, null, msgs);
      msgs = basicSetTeetHStP(newTeetHStP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_HST_P, newTeetHStP, newTeetHStP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetSSSp getTeetSSSp()
  {
    return teetSSSp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetSSSp(nTeetSSSp newTeetSSSp, NotificationChain msgs)
  {
    nTeetSSSp oldTeetSSSp = teetSSSp;
    teetSSSp = newTeetSSSp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_SS_SP, oldTeetSSSp, newTeetSSSp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetSSSp(nTeetSSSp newTeetSSSp)
  {
    if (newTeetSSSp != teetSSSp)
    {
      NotificationChain msgs = null;
      if (teetSSSp != null)
        msgs = ((InternalEObject)teetSSSp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_SS_SP, null, msgs);
      if (newTeetSSSp != null)
        msgs = ((InternalEObject)newTeetSSSp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_SS_SP, null, msgs);
      msgs = basicSetTeetSSSp(newTeetSSSp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_SS_SP, newTeetSSSp, newTeetSSSp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTeetHSSp getTeetHSSp()
  {
    return teetHSSp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTeetHSSp(nTeetHSSp newTeetHSSp, NotificationChain msgs)
  {
    nTeetHSSp oldTeetHSSp = teetHSSp;
    teetHSSp = newTeetHSSp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_HS_SP, oldTeetHSSp, newTeetHSSp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeetHSSp(nTeetHSSp newTeetHSSp)
  {
    if (newTeetHSSp != teetHSSp)
    {
      NotificationChain msgs = null;
      if (teetHSSp != null)
        msgs = ((InternalEObject)teetHSSp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_HS_SP, null, msgs);
      if (newTeetHSSp != null)
        msgs = ((InternalEObject)newTeetHSSp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TEET_HS_SP, null, msgs);
      msgs = basicSetTeetHSSp(newTeetHSSp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TEET_HS_SP, newTeetHSSp, newTeetHSSp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDrConN getTBDrConN()
  {
    return tbDrConN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTBDrConN(nTBDrConN newTBDrConN, NotificationChain msgs)
  {
    nTBDrConN oldTBDrConN = tbDrConN;
    tbDrConN = newTBDrConN;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DR_CON_N, oldTBDrConN, newTBDrConN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTBDrConN(nTBDrConN newTBDrConN)
  {
    if (newTBDrConN != tbDrConN)
    {
      NotificationChain msgs = null;
      if (tbDrConN != null)
        msgs = ((InternalEObject)tbDrConN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DR_CON_N, null, msgs);
      if (newTBDrConN != null)
        msgs = ((InternalEObject)newTBDrConN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DR_CON_N, null, msgs);
      msgs = basicSetTBDrConN(newTBDrConN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DR_CON_N, newTBDrConN, newTBDrConN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTBDrConD getTBDrConD()
  {
    return tbDrConD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTBDrConD(nTBDrConD newTBDrConD, NotificationChain msgs)
  {
    nTBDrConD oldTBDrConD = tbDrConD;
    tbDrConD = newTBDrConD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DR_CON_D, oldTBDrConD, newTBDrConD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTBDrConD(nTBDrConD newTBDrConD)
  {
    if (newTBDrConD != tbDrConD)
    {
      NotificationChain msgs = null;
      if (tbDrConD != null)
        msgs = ((InternalEObject)tbDrConD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DR_CON_D, null, msgs);
      if (newTBDrConD != null)
        msgs = ((InternalEObject)newTBDrConD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TB_DR_CON_D, null, msgs);
      msgs = basicSetTBDrConD(newTBDrConD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TB_DR_CON_D, newTBDrConD, newTBDrConD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTpBrDT getTpBrDT()
  {
    return tpBrDT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTpBrDT(nTpBrDT newTpBrDT, NotificationChain msgs)
  {
    nTpBrDT oldTpBrDT = tpBrDT;
    tpBrDT = newTpBrDT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TP_BR_DT, oldTpBrDT, newTpBrDT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTpBrDT(nTpBrDT newTpBrDT)
  {
    if (newTpBrDT != tpBrDT)
    {
      NotificationChain msgs = null;
      if (tpBrDT != null)
        msgs = ((InternalEObject)tpBrDT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TP_BR_DT, null, msgs);
      if (newTpBrDT != null)
        msgs = ((InternalEObject)newTpBrDT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TP_BR_DT, null, msgs);
      msgs = basicSetTpBrDT(newTpBrDT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TP_BR_DT, newTpBrDT, newTpBrDT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fBldFile_1_ getBldFile_1_()
  {
    return bldFile_1_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFile_1_(fBldFile_1_ newBldFile_1_, NotificationChain msgs)
  {
    fBldFile_1_ oldBldFile_1_ = bldFile_1_;
    bldFile_1_ = newBldFile_1_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BLD_FILE_1, oldBldFile_1_, newBldFile_1_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFile_1_(fBldFile_1_ newBldFile_1_)
  {
    if (newBldFile_1_ != bldFile_1_)
    {
      NotificationChain msgs = null;
      if (bldFile_1_ != null)
        msgs = ((InternalEObject)bldFile_1_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BLD_FILE_1, null, msgs);
      if (newBldFile_1_ != null)
        msgs = ((InternalEObject)newBldFile_1_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BLD_FILE_1, null, msgs);
      msgs = basicSetBldFile_1_(newBldFile_1_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BLD_FILE_1, newBldFile_1_, newBldFile_1_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fBldFile_2_ getBldFile_2_()
  {
    return bldFile_2_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFile_2_(fBldFile_2_ newBldFile_2_, NotificationChain msgs)
  {
    fBldFile_2_ oldBldFile_2_ = bldFile_2_;
    bldFile_2_ = newBldFile_2_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BLD_FILE_2, oldBldFile_2_, newBldFile_2_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFile_2_(fBldFile_2_ newBldFile_2_)
  {
    if (newBldFile_2_ != bldFile_2_)
    {
      NotificationChain msgs = null;
      if (bldFile_2_ != null)
        msgs = ((InternalEObject)bldFile_2_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BLD_FILE_2, null, msgs);
      if (newBldFile_2_ != null)
        msgs = ((InternalEObject)newBldFile_2_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BLD_FILE_2, null, msgs);
      msgs = basicSetBldFile_2_(newBldFile_2_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BLD_FILE_2, newBldFile_2_, newBldFile_2_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fBldFile_3_ getBldFile_3_()
  {
    return bldFile_3_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldFile_3_(fBldFile_3_ newBldFile_3_, NotificationChain msgs)
  {
    fBldFile_3_ oldBldFile_3_ = bldFile_3_;
    bldFile_3_ = newBldFile_3_;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BLD_FILE_3, oldBldFile_3_, newBldFile_3_);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldFile_3_(fBldFile_3_ newBldFile_3_)
  {
    if (newBldFile_3_ != bldFile_3_)
    {
      NotificationChain msgs = null;
      if (bldFile_3_ != null)
        msgs = ((InternalEObject)bldFile_3_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BLD_FILE_3, null, msgs);
      if (newBldFile_3_ != null)
        msgs = ((InternalEObject)newBldFile_3_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BLD_FILE_3, null, msgs);
      msgs = basicSetBldFile_3_(newBldFile_3_, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BLD_FILE_3, newBldFile_3_, newBldFile_3_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fADFile getADFile()
  {
    return adFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetADFile(fADFile newADFile, NotificationChain msgs)
  {
    fADFile oldADFile = adFile;
    adFile = newADFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__AD_FILE, oldADFile, newADFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setADFile(fADFile newADFile)
  {
    if (newADFile != adFile)
    {
      NotificationChain msgs = null;
      if (adFile != null)
        msgs = ((InternalEObject)adFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__AD_FILE, null, msgs);
      if (newADFile != null)
        msgs = ((InternalEObject)newADFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__AD_FILE, null, msgs);
      msgs = basicSetADFile(newADFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__AD_FILE, newADFile, newADFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fNoiseFile getNoiseFile()
  {
    return noiseFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNoiseFile(fNoiseFile newNoiseFile, NotificationChain msgs)
  {
    fNoiseFile oldNoiseFile = noiseFile;
    noiseFile = newNoiseFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NOISE_FILE, oldNoiseFile, newNoiseFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoiseFile(fNoiseFile newNoiseFile)
  {
    if (newNoiseFile != noiseFile)
    {
      NotificationChain msgs = null;
      if (noiseFile != null)
        msgs = ((InternalEObject)noiseFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NOISE_FILE, null, msgs);
      if (newNoiseFile != null)
        msgs = ((InternalEObject)newNoiseFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NOISE_FILE, null, msgs);
      msgs = basicSetNoiseFile(newNoiseFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NOISE_FILE, newNoiseFile, newNoiseFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fADAMSFile getADAMSFile()
  {
    return adamsFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetADAMSFile(fADAMSFile newADAMSFile, NotificationChain msgs)
  {
    fADAMSFile oldADAMSFile = adamsFile;
    adamsFile = newADAMSFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ADAMS_FILE, oldADAMSFile, newADAMSFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setADAMSFile(fADAMSFile newADAMSFile)
  {
    if (newADAMSFile != adamsFile)
    {
      NotificationChain msgs = null;
      if (adamsFile != null)
        msgs = ((InternalEObject)adamsFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ADAMS_FILE, null, msgs);
      if (newADAMSFile != null)
        msgs = ((InternalEObject)newADAMSFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__ADAMS_FILE, null, msgs);
      msgs = basicSetADAMSFile(newADAMSFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__ADAMS_FILE, newADAMSFile, newADAMSFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fLinFile getLinFile()
  {
    return linFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinFile(fLinFile newLinFile, NotificationChain msgs)
  {
    fLinFile oldLinFile = linFile;
    linFile = newLinFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__LIN_FILE, oldLinFile, newLinFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinFile(fLinFile newLinFile)
  {
    if (newLinFile != linFile)
    {
      NotificationChain msgs = null;
      if (linFile != null)
        msgs = ((InternalEObject)linFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__LIN_FILE, null, msgs);
      if (newLinFile != null)
        msgs = ((InternalEObject)newLinFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__LIN_FILE, null, msgs);
      msgs = basicSetLinFile(newLinFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__LIN_FILE, newLinFile, newLinFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bSumPrint getSumPrint()
  {
    return sumPrint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSumPrint(bSumPrint newSumPrint, NotificationChain msgs)
  {
    bSumPrint oldSumPrint = sumPrint;
    sumPrint = newSumPrint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SUM_PRINT, oldSumPrint, newSumPrint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSumPrint(bSumPrint newSumPrint)
  {
    if (newSumPrint != sumPrint)
    {
      NotificationChain msgs = null;
      if (sumPrint != null)
        msgs = ((InternalEObject)sumPrint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SUM_PRINT, null, msgs);
      if (newSumPrint != null)
        msgs = ((InternalEObject)newSumPrint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SUM_PRINT, null, msgs);
      msgs = basicSetSumPrint(newSumPrint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SUM_PRINT, newSumPrint, newSumPrint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bOutFileFmt getOutFileFmt()
  {
    return outFileFmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutFileFmt(bOutFileFmt newOutFileFmt, NotificationChain msgs)
  {
    bOutFileFmt oldOutFileFmt = outFileFmt;
    outFileFmt = newOutFileFmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT, oldOutFileFmt, newOutFileFmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutFileFmt(bOutFileFmt newOutFileFmt)
  {
    if (newOutFileFmt != outFileFmt)
    {
      NotificationChain msgs = null;
      if (outFileFmt != null)
        msgs = ((InternalEObject)outFileFmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT, null, msgs);
      if (newOutFileFmt != null)
        msgs = ((InternalEObject)newOutFileFmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT, null, msgs);
      msgs = basicSetOutFileFmt(newOutFileFmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT, newOutFileFmt, newOutFileFmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTabDelim getTabDelim()
  {
    return tabDelim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTabDelim(bTabDelim newTabDelim, NotificationChain msgs)
  {
    bTabDelim oldTabDelim = tabDelim;
    tabDelim = newTabDelim;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TAB_DELIM, oldTabDelim, newTabDelim);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTabDelim(bTabDelim newTabDelim)
  {
    if (newTabDelim != tabDelim)
    {
      NotificationChain msgs = null;
      if (tabDelim != null)
        msgs = ((InternalEObject)tabDelim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TAB_DELIM, null, msgs);
      if (newTabDelim != null)
        msgs = ((InternalEObject)newTabDelim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TAB_DELIM, null, msgs);
      msgs = basicSetTabDelim(newTabDelim, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TAB_DELIM, newTabDelim, newTabDelim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sOutFmt getOutFmt()
  {
    return outFmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutFmt(sOutFmt newOutFmt, NotificationChain msgs)
  {
    sOutFmt oldOutFmt = outFmt;
    outFmt = newOutFmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OUT_FMT, oldOutFmt, newOutFmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutFmt(sOutFmt newOutFmt)
  {
    if (newOutFmt != outFmt)
    {
      NotificationChain msgs = null;
      if (outFmt != null)
        msgs = ((InternalEObject)outFmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OUT_FMT, null, msgs);
      if (newOutFmt != null)
        msgs = ((InternalEObject)newOutFmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OUT_FMT, null, msgs);
      msgs = basicSetOutFmt(newOutFmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OUT_FMT, newOutFmt, newOutFmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTStart getTStart()
  {
    return tStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTStart(nTStart newTStart, NotificationChain msgs)
  {
    nTStart oldTStart = tStart;
    tStart = newTStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TSTART, oldTStart, newTStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTStart(nTStart newTStart)
  {
    if (newTStart != tStart)
    {
      NotificationChain msgs = null;
      if (tStart != null)
        msgs = ((InternalEObject)tStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TSTART, null, msgs);
      if (newTStart != null)
        msgs = ((InternalEObject)newTStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TSTART, null, msgs);
      msgs = basicSetTStart(newTStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TSTART, newTStart, newTStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iDecFact getDecFact()
  {
    return decFact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecFact(iDecFact newDecFact, NotificationChain msgs)
  {
    iDecFact oldDecFact = decFact;
    decFact = newDecFact;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DEC_FACT, oldDecFact, newDecFact);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecFact(iDecFact newDecFact)
  {
    if (newDecFact != decFact)
    {
      NotificationChain msgs = null;
      if (decFact != null)
        msgs = ((InternalEObject)decFact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DEC_FACT, null, msgs);
      if (newDecFact != null)
        msgs = ((InternalEObject)newDecFact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__DEC_FACT, null, msgs);
      msgs = basicSetDecFact(newDecFact, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__DEC_FACT, newDecFact, newDecFact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSttsTime getSttsTime()
  {
    return sttsTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSttsTime(nSttsTime newSttsTime, NotificationChain msgs)
  {
    nSttsTime oldSttsTime = sttsTime;
    sttsTime = newSttsTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__STTS_TIME, oldSttsTime, newSttsTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSttsTime(nSttsTime newSttsTime)
  {
    if (newSttsTime != sttsTime)
    {
      NotificationChain msgs = null;
      if (sttsTime != null)
        msgs = ((InternalEObject)sttsTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__STTS_TIME, null, msgs);
      if (newSttsTime != null)
        msgs = ((InternalEObject)newSttsTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__STTS_TIME, null, msgs);
      msgs = basicSetSttsTime(newSttsTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__STTS_TIME, newSttsTime, newSttsTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNcIMUxn getNcIMUxn()
  {
    return ncIMUxn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNcIMUxn(nNcIMUxn newNcIMUxn, NotificationChain msgs)
  {
    nNcIMUxn oldNcIMUxn = ncIMUxn;
    ncIMUxn = newNcIMUxn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NC_IM_UXN, oldNcIMUxn, newNcIMUxn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNcIMUxn(nNcIMUxn newNcIMUxn)
  {
    if (newNcIMUxn != ncIMUxn)
    {
      NotificationChain msgs = null;
      if (ncIMUxn != null)
        msgs = ((InternalEObject)ncIMUxn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NC_IM_UXN, null, msgs);
      if (newNcIMUxn != null)
        msgs = ((InternalEObject)newNcIMUxn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NC_IM_UXN, null, msgs);
      msgs = basicSetNcIMUxn(newNcIMUxn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NC_IM_UXN, newNcIMUxn, newNcIMUxn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNcIMUyn getNcIMUyn()
  {
    return ncIMUyn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNcIMUyn(nNcIMUyn newNcIMUyn, NotificationChain msgs)
  {
    nNcIMUyn oldNcIMUyn = ncIMUyn;
    ncIMUyn = newNcIMUyn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NC_IM_UYN, oldNcIMUyn, newNcIMUyn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNcIMUyn(nNcIMUyn newNcIMUyn)
  {
    if (newNcIMUyn != ncIMUyn)
    {
      NotificationChain msgs = null;
      if (ncIMUyn != null)
        msgs = ((InternalEObject)ncIMUyn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NC_IM_UYN, null, msgs);
      if (newNcIMUyn != null)
        msgs = ((InternalEObject)newNcIMUyn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NC_IM_UYN, null, msgs);
      msgs = basicSetNcIMUyn(newNcIMUyn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NC_IM_UYN, newNcIMUyn, newNcIMUyn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nNcIMUzn getNcIMUzn()
  {
    return ncIMUzn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNcIMUzn(nNcIMUzn newNcIMUzn, NotificationChain msgs)
  {
    nNcIMUzn oldNcIMUzn = ncIMUzn;
    ncIMUzn = newNcIMUzn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NC_IM_UZN, oldNcIMUzn, newNcIMUzn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNcIMUzn(nNcIMUzn newNcIMUzn)
  {
    if (newNcIMUzn != ncIMUzn)
    {
      NotificationChain msgs = null;
      if (ncIMUzn != null)
        msgs = ((InternalEObject)ncIMUzn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NC_IM_UZN, null, msgs);
      if (newNcIMUzn != null)
        msgs = ((InternalEObject)newNcIMUzn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NC_IM_UZN, null, msgs);
      msgs = basicSetNcIMUzn(newNcIMUzn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NC_IM_UZN, newNcIMUzn, newNcIMUzn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nShftGagL getShftGagL()
  {
    return shftGagL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShftGagL(nShftGagL newShftGagL, NotificationChain msgs)
  {
    nShftGagL oldShftGagL = shftGagL;
    shftGagL = newShftGagL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SHFT_GAG_L, oldShftGagL, newShftGagL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShftGagL(nShftGagL newShftGagL)
  {
    if (newShftGagL != shftGagL)
    {
      NotificationChain msgs = null;
      if (shftGagL != null)
        msgs = ((InternalEObject)shftGagL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SHFT_GAG_L, null, msgs);
      if (newShftGagL != null)
        msgs = ((InternalEObject)newShftGagL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__SHFT_GAG_L, null, msgs);
      msgs = basicSetShftGagL(newShftGagL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__SHFT_GAG_L, newShftGagL, newShftGagL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNTwGages getNTwGages()
  {
    return nTwGages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNTwGages(iNTwGages newNTwGages, NotificationChain msgs)
  {
    iNTwGages oldNTwGages = nTwGages;
    nTwGages = newNTwGages;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NTW_GAGES, oldNTwGages, newNTwGages);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNTwGages(iNTwGages newNTwGages)
  {
    if (newNTwGages != nTwGages)
    {
      NotificationChain msgs = null;
      if (nTwGages != null)
        msgs = ((InternalEObject)nTwGages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NTW_GAGES, null, msgs);
      if (newNTwGages != null)
        msgs = ((InternalEObject)newNTwGages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NTW_GAGES, null, msgs);
      msgs = basicSetNTwGages(newNTwGages, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NTW_GAGES, newNTwGages, newNTwGages));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aTwrGagNd getTwrGagNd()
  {
    return twrGagNd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwrGagNd(aTwrGagNd newTwrGagNd, NotificationChain msgs)
  {
    aTwrGagNd oldTwrGagNd = twrGagNd;
    twrGagNd = newTwrGagNd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR_GAG_ND, oldTwrGagNd, newTwrGagNd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwrGagNd(aTwrGagNd newTwrGagNd)
  {
    if (newTwrGagNd != twrGagNd)
    {
      NotificationChain msgs = null;
      if (twrGagNd != null)
        msgs = ((InternalEObject)twrGagNd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR_GAG_ND, null, msgs);
      if (newTwrGagNd != null)
        msgs = ((InternalEObject)newTwrGagNd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__TWR_GAG_ND, null, msgs);
      msgs = basicSetTwrGagNd(newTwrGagNd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__TWR_GAG_ND, newTwrGagNd, newTwrGagNd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNBlGages getNBlGages()
  {
    return nBlGages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNBlGages(iNBlGages newNBlGages, NotificationChain msgs)
  {
    iNBlGages oldNBlGages = nBlGages;
    nBlGages = newNBlGages;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NBL_GAGES, oldNBlGages, newNBlGages);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNBlGages(iNBlGages newNBlGages)
  {
    if (newNBlGages != nBlGages)
    {
      NotificationChain msgs = null;
      if (nBlGages != null)
        msgs = ((InternalEObject)nBlGages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NBL_GAGES, null, msgs);
      if (newNBlGages != null)
        msgs = ((InternalEObject)newNBlGages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__NBL_GAGES, null, msgs);
      msgs = basicSetNBlGages(newNBlGages, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__NBL_GAGES, newNBlGages, newNBlGages));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aBldGagNd getBldGagNd()
  {
    return bldGagNd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBldGagNd(aBldGagNd newBldGagNd, NotificationChain msgs)
  {
    aBldGagNd oldBldGagNd = bldGagNd;
    bldGagNd = newBldGagNd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BLD_GAG_ND, oldBldGagNd, newBldGagNd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBldGagNd(aBldGagNd newBldGagNd)
  {
    if (newBldGagNd != bldGagNd)
    {
      NotificationChain msgs = null;
      if (bldGagNd != null)
        msgs = ((InternalEObject)bldGagNd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BLD_GAG_ND, null, msgs);
      if (newBldGagNd != null)
        msgs = ((InternalEObject)newBldGagNd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__BLD_GAG_ND, null, msgs);
      msgs = basicSetBldGagNd(newBldGagNd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__BLD_GAG_ND, newBldGagNd, newBldGagNd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vOutList getOutList()
  {
    return outList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutList(vOutList newOutList, NotificationChain msgs)
  {
    vOutList oldOutList = outList;
    outList = newOutList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OUT_LIST, oldOutList, newOutList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutList(vOutList newOutList)
  {
    if (newOutList != outList)
    {
      NotificationChain msgs = null;
      if (outList != null)
        msgs = ((InternalEObject)outList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OUT_LIST, null, msgs);
      if (newOutList != null)
        msgs = ((InternalEObject)newOutList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FastfstPackage.MODEL_FASTFST__OUT_LIST, null, msgs);
      msgs = basicSetOutList(newOutList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FastfstPackage.MODEL_FASTFST__OUT_LIST, newOutList, newOutList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FastfstPackage.MODEL_FASTFST__HEAD:
        return basicSetHead(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
      case FastfstPackage.MODEL_FASTFST__ECHO:
        return basicSetEcho(null, msgs);
      case FastfstPackage.MODEL_FASTFST__ADAMS_PREP:
        return basicSetADAMSPrep(null, msgs);
      case FastfstPackage.MODEL_FASTFST__ANAL_MODE:
        return basicSetAnalMode(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NUM_BL:
        return basicSetNumBl(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TMAX:
        return basicSetTMax(null, msgs);
      case FastfstPackage.MODEL_FASTFST__DT:
        return basicSetDT(null, msgs);
      case FastfstPackage.MODEL_FASTFST__YC_MODE:
        return basicSetYCMode(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TYC_ON:
        return basicSetTYCOn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__PC_MODE:
        return basicSetPCMode(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TPC_ON:
        return basicSetTPCOn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__VS_CONTRL:
        return basicSetVSContrl(null, msgs);
      case FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP:
        return basicSetVS_RtGnSp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__VS_RT_TQ:
        return basicSetVS_RtTq(null, msgs);
      case FastfstPackage.MODEL_FASTFST__VS_RGN2_K:
        return basicSetVS_Rgn2K(null, msgs);
      case FastfstPackage.MODEL_FASTFST__VS_SL_PC:
        return basicSetVS_SlPc(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GEN_MODEL:
        return basicSetGenModel(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STR:
        return basicSetGenTiStr(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STP:
        return basicSetGenTiStp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SPD_GEN_ON:
        return basicSetSpdGenOn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_ON:
        return basicSetTimGenOn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_OF:
        return basicSetTimGenOf(null, msgs);
      case FastfstPackage.MODEL_FASTFST__HSS_BR_MODE:
        return basicSetHSSBrMode(null, msgs);
      case FastfstPackage.MODEL_FASTFST__THSS_BR_DP:
        return basicSetTHSSBrDp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TI_DYN_BRK:
        return basicSetTiDynBrk(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1:
        return basicSetTTpBrDp_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2:
        return basicSetTTpBrDp_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3:
        return basicSetTTpBrDp_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1:
        return basicSetTBDepISp_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2:
        return basicSetTBDepISp_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3:
        return basicSetTBDepISp_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_S:
        return basicSetTYawManS(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_E:
        return basicSetTYawManE(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NAC_YAW_F:
        return basicSetNacYawF(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1:
        return basicSetTPitManS_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2:
        return basicSetTPitManS_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3:
        return basicSetTPitManS_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1:
        return basicSetTPitManE_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2:
        return basicSetTPitManE_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3:
        return basicSetTPitManE_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_1:
        return basicSetBlPitch_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_2:
        return basicSetBlPitch_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_3:
        return basicSetBlPitch_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F1:
        return basicSetBlPitchF_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F2:
        return basicSetBlPitchF_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F3:
        return basicSetBlPitchF_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GRAVITY:
        return basicSetGravity(null, msgs);
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF1:
        return basicSetFlapDOF1(null, msgs);
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF2:
        return basicSetFlapDOF2(null, msgs);
      case FastfstPackage.MODEL_FASTFST__EDGE_DOF:
        return basicSetEdgeDOF(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_DOF:
        return basicSetTeetDOF(null, msgs);
      case FastfstPackage.MODEL_FASTFST__DR_TR_DOF:
        return basicSetDrTrDOF(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GEN_DOF:
        return basicSetGenDOF(null, msgs);
      case FastfstPackage.MODEL_FASTFST__YAW_DOF:
        return basicSetYawDOF(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TW_FADOF1:
        return basicSetTwFADOF1(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TW_FADOF2:
        return basicSetTwFADOF2(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF1:
        return basicSetTwSSDOF1(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF2:
        return basicSetTwSSDOF2(null, msgs);
      case FastfstPackage.MODEL_FASTFST__COMP_AERO:
        return basicSetCompAero(null, msgs);
      case FastfstPackage.MODEL_FASTFST__COMP_NOISE:
        return basicSetCompNoise(null, msgs);
      case FastfstPackage.MODEL_FASTFST__OO_PDEFL:
        return basicSetOoPDefl(null, msgs);
      case FastfstPackage.MODEL_FASTFST__IP_DEFL:
        return basicSetIPDefl(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_DEFL:
        return basicSetTeetDefl(null, msgs);
      case FastfstPackage.MODEL_FASTFST__AZIMUTH:
        return basicSetAzimuth(null, msgs);
      case FastfstPackage.MODEL_FASTFST__ROT_SPEED:
        return basicSetRotSpeed(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NAC_YAW:
        return basicSetNacYaw(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TT_DSP_FA:
        return basicSetTTDspFA(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TT_DSP_SS:
        return basicSetTTDspSS(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TIP_RAD:
        return basicSetTipRad(null, msgs);
      case FastfstPackage.MODEL_FASTFST__HUB_RAD:
        return basicSetHubRad(null, msgs);
      case FastfstPackage.MODEL_FASTFST__PSPN_EL_N:
        return basicSetPSpnElN(null, msgs);
      case FastfstPackage.MODEL_FASTFST__UND_SLING:
        return basicSetUndSling(null, msgs);
      case FastfstPackage.MODEL_FASTFST__HUB_CM:
        return basicSetHubCM(null, msgs);
      case FastfstPackage.MODEL_FASTFST__OVER_HANG:
        return basicSetOverHang(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NAC_CMXN:
        return basicSetNacCMxn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NAC_CMYN:
        return basicSetNacCMyn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NAC_CMZN:
        return basicSetNacCMzn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TOWER_HT:
        return basicSetTowerHt(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TWR2_SHFT:
        return basicSetTwr2Shft(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TWR_RB_HT:
        return basicSetTwrRBHt(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SHFT_TILT:
        return basicSetShftTilt(null, msgs);
      case FastfstPackage.MODEL_FASTFST__DELTA3:
        return basicSetDelta3(null, msgs);
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_1:
        return basicSetPreCone_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_2:
        return basicSetPreCone_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_3:
        return basicSetPreCone_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__AZIM_B1_UP:
        return basicSetAzimB1Up(null, msgs);
      case FastfstPackage.MODEL_FASTFST__YAW_BR_MASS:
        return basicSetYawBrMass(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NAC_MASS:
        return basicSetNacMass(null, msgs);
      case FastfstPackage.MODEL_FASTFST__HUB_MASS:
        return basicSetHubMass(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_1:
        return basicSetTipMass_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_2:
        return basicSetTipMass_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_3:
        return basicSetTipMass_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NAC_YINER:
        return basicSetNacYIner(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GEN_INER:
        return basicSetGenIner(null, msgs);
      case FastfstPackage.MODEL_FASTFST__HUB_INER:
        return basicSetHubIner(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GBOX_EFF:
        return basicSetGBoxEff(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GEN_EFF:
        return basicSetGenEff(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GB_RATIO:
        return basicSetGBRatio(null, msgs);
      case FastfstPackage.MODEL_FASTFST__GB_REVERS:
        return basicSetGBRevers(null, msgs);
      case FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F:
        return basicSetHSSBrTqF(null, msgs);
      case FastfstPackage.MODEL_FASTFST__HSS_BR_DT:
        return basicSetHSSBrDT(null, msgs);
      case FastfstPackage.MODEL_FASTFST__DYN_BRK_FI:
        return basicSetDynBrkFi(null, msgs);
      case FastfstPackage.MODEL_FASTFST__DT_TOR_SPR:
        return basicSetDTTorSpr(null, msgs);
      case FastfstPackage.MODEL_FASTFST__DT_TOR_DMP:
        return basicSetDTTorDmp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SIG_SL_PC:
        return basicSetSIG_SlPc(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SIG_SY_SP:
        return basicSetSIG_SySp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SIG_RT_TQ:
        return basicSetSIG_RtTq(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SIG_PO_RT:
        return basicSetSIG_PORt(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEC_FREQ:
        return basicSetTEC_Freq(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEC_NPOL:
        return basicSetTEC_Npol(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEC_SRES:
        return basicSetTEC_Sres(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEC_RRES:
        return basicSetTEC_Rres(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEC_VLL:
        return basicSetTEC_VLL(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEC_SLR:
        return basicSetTEC_SLR(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEC_RLR:
        return basicSetTEC_RLR(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEC_MR:
        return basicSetTEC_MR(null, msgs);
      case FastfstPackage.MODEL_FASTFST__PTFM_MODEL:
        return basicSetPtfmModel(null, msgs);
      case FastfstPackage.MODEL_FASTFST__PTFM_FILE:
        return basicSetPtfmFile(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TWR_NODES:
        return basicSetTwrNodes(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TWR_FILE:
        return basicSetTwrFile(null, msgs);
      case FastfstPackage.MODEL_FASTFST__YAW_SPR:
        return basicSetYawSpr(null, msgs);
      case FastfstPackage.MODEL_FASTFST__YAW_DAMP:
        return basicSetYawDamp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__YAW_NEUT:
        return basicSetYawNeut(null, msgs);
      case FastfstPackage.MODEL_FASTFST__FURLING:
        return basicSetFurling(null, msgs);
      case FastfstPackage.MODEL_FASTFST__FURL_FILE:
        return basicSetFurlFile(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_MOD:
        return basicSetTeetMod(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_DMP_P:
        return basicSetTeetDmpP(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_DMP:
        return basicSetTeetDmp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_CDMP:
        return basicSetTeetCDmp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_SST_P:
        return basicSetTeetSStP(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_HST_P:
        return basicSetTeetHStP(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_SS_SP:
        return basicSetTeetSSSp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TEET_HS_SP:
        return basicSetTeetHSSp(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_N:
        return basicSetTBDrConN(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_D:
        return basicSetTBDrConD(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TP_BR_DT:
        return basicSetTpBrDT(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_1:
        return basicSetBldFile_1_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_2:
        return basicSetBldFile_2_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_3:
        return basicSetBldFile_3_(null, msgs);
      case FastfstPackage.MODEL_FASTFST__AD_FILE:
        return basicSetADFile(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NOISE_FILE:
        return basicSetNoiseFile(null, msgs);
      case FastfstPackage.MODEL_FASTFST__ADAMS_FILE:
        return basicSetADAMSFile(null, msgs);
      case FastfstPackage.MODEL_FASTFST__LIN_FILE:
        return basicSetLinFile(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SUM_PRINT:
        return basicSetSumPrint(null, msgs);
      case FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT:
        return basicSetOutFileFmt(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TAB_DELIM:
        return basicSetTabDelim(null, msgs);
      case FastfstPackage.MODEL_FASTFST__OUT_FMT:
        return basicSetOutFmt(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TSTART:
        return basicSetTStart(null, msgs);
      case FastfstPackage.MODEL_FASTFST__DEC_FACT:
        return basicSetDecFact(null, msgs);
      case FastfstPackage.MODEL_FASTFST__STTS_TIME:
        return basicSetSttsTime(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NC_IM_UXN:
        return basicSetNcIMUxn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NC_IM_UYN:
        return basicSetNcIMUyn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NC_IM_UZN:
        return basicSetNcIMUzn(null, msgs);
      case FastfstPackage.MODEL_FASTFST__SHFT_GAG_L:
        return basicSetShftGagL(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NTW_GAGES:
        return basicSetNTwGages(null, msgs);
      case FastfstPackage.MODEL_FASTFST__TWR_GAG_ND:
        return basicSetTwrGagNd(null, msgs);
      case FastfstPackage.MODEL_FASTFST__NBL_GAGES:
        return basicSetNBlGages(null, msgs);
      case FastfstPackage.MODEL_FASTFST__BLD_GAG_ND:
        return basicSetBldGagNd(null, msgs);
      case FastfstPackage.MODEL_FASTFST__OUT_LIST:
        return basicSetOutList(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FastfstPackage.MODEL_FASTFST__HEAD:
        return getHead();
      case FastfstPackage.MODEL_FASTFST__SECTIONS:
        return getSections();
      case FastfstPackage.MODEL_FASTFST__ECHO:
        return getEcho();
      case FastfstPackage.MODEL_FASTFST__ADAMS_PREP:
        return getADAMSPrep();
      case FastfstPackage.MODEL_FASTFST__ANAL_MODE:
        return getAnalMode();
      case FastfstPackage.MODEL_FASTFST__NUM_BL:
        return getNumBl();
      case FastfstPackage.MODEL_FASTFST__TMAX:
        return getTMax();
      case FastfstPackage.MODEL_FASTFST__DT:
        return getDT();
      case FastfstPackage.MODEL_FASTFST__YC_MODE:
        return getYCMode();
      case FastfstPackage.MODEL_FASTFST__TYC_ON:
        return getTYCOn();
      case FastfstPackage.MODEL_FASTFST__PC_MODE:
        return getPCMode();
      case FastfstPackage.MODEL_FASTFST__TPC_ON:
        return getTPCOn();
      case FastfstPackage.MODEL_FASTFST__VS_CONTRL:
        return getVSContrl();
      case FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP:
        return getVS_RtGnSp();
      case FastfstPackage.MODEL_FASTFST__VS_RT_TQ:
        return getVS_RtTq();
      case FastfstPackage.MODEL_FASTFST__VS_RGN2_K:
        return getVS_Rgn2K();
      case FastfstPackage.MODEL_FASTFST__VS_SL_PC:
        return getVS_SlPc();
      case FastfstPackage.MODEL_FASTFST__GEN_MODEL:
        return getGenModel();
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STR:
        return getGenTiStr();
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STP:
        return getGenTiStp();
      case FastfstPackage.MODEL_FASTFST__SPD_GEN_ON:
        return getSpdGenOn();
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_ON:
        return getTimGenOn();
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_OF:
        return getTimGenOf();
      case FastfstPackage.MODEL_FASTFST__HSS_BR_MODE:
        return getHSSBrMode();
      case FastfstPackage.MODEL_FASTFST__THSS_BR_DP:
        return getTHSSBrDp();
      case FastfstPackage.MODEL_FASTFST__TI_DYN_BRK:
        return getTiDynBrk();
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1:
        return getTTpBrDp_1_();
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2:
        return getTTpBrDp_2_();
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3:
        return getTTpBrDp_3_();
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1:
        return getTBDepISp_1_();
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2:
        return getTBDepISp_2_();
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3:
        return getTBDepISp_3_();
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_S:
        return getTYawManS();
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_E:
        return getTYawManE();
      case FastfstPackage.MODEL_FASTFST__NAC_YAW_F:
        return getNacYawF();
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1:
        return getTPitManS_1_();
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2:
        return getTPitManS_2_();
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3:
        return getTPitManS_3_();
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1:
        return getTPitManE_1_();
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2:
        return getTPitManE_2_();
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3:
        return getTPitManE_3_();
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_1:
        return getBlPitch_1_();
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_2:
        return getBlPitch_2_();
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_3:
        return getBlPitch_3_();
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F1:
        return getBlPitchF_1_();
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F2:
        return getBlPitchF_2_();
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F3:
        return getBlPitchF_3_();
      case FastfstPackage.MODEL_FASTFST__GRAVITY:
        return getGravity();
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF1:
        return getFlapDOF1();
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF2:
        return getFlapDOF2();
      case FastfstPackage.MODEL_FASTFST__EDGE_DOF:
        return getEdgeDOF();
      case FastfstPackage.MODEL_FASTFST__TEET_DOF:
        return getTeetDOF();
      case FastfstPackage.MODEL_FASTFST__DR_TR_DOF:
        return getDrTrDOF();
      case FastfstPackage.MODEL_FASTFST__GEN_DOF:
        return getGenDOF();
      case FastfstPackage.MODEL_FASTFST__YAW_DOF:
        return getYawDOF();
      case FastfstPackage.MODEL_FASTFST__TW_FADOF1:
        return getTwFADOF1();
      case FastfstPackage.MODEL_FASTFST__TW_FADOF2:
        return getTwFADOF2();
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF1:
        return getTwSSDOF1();
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF2:
        return getTwSSDOF2();
      case FastfstPackage.MODEL_FASTFST__COMP_AERO:
        return getCompAero();
      case FastfstPackage.MODEL_FASTFST__COMP_NOISE:
        return getCompNoise();
      case FastfstPackage.MODEL_FASTFST__OO_PDEFL:
        return getOoPDefl();
      case FastfstPackage.MODEL_FASTFST__IP_DEFL:
        return getIPDefl();
      case FastfstPackage.MODEL_FASTFST__TEET_DEFL:
        return getTeetDefl();
      case FastfstPackage.MODEL_FASTFST__AZIMUTH:
        return getAzimuth();
      case FastfstPackage.MODEL_FASTFST__ROT_SPEED:
        return getRotSpeed();
      case FastfstPackage.MODEL_FASTFST__NAC_YAW:
        return getNacYaw();
      case FastfstPackage.MODEL_FASTFST__TT_DSP_FA:
        return getTTDspFA();
      case FastfstPackage.MODEL_FASTFST__TT_DSP_SS:
        return getTTDspSS();
      case FastfstPackage.MODEL_FASTFST__TIP_RAD:
        return getTipRad();
      case FastfstPackage.MODEL_FASTFST__HUB_RAD:
        return getHubRad();
      case FastfstPackage.MODEL_FASTFST__PSPN_EL_N:
        return getPSpnElN();
      case FastfstPackage.MODEL_FASTFST__UND_SLING:
        return getUndSling();
      case FastfstPackage.MODEL_FASTFST__HUB_CM:
        return getHubCM();
      case FastfstPackage.MODEL_FASTFST__OVER_HANG:
        return getOverHang();
      case FastfstPackage.MODEL_FASTFST__NAC_CMXN:
        return getNacCMxn();
      case FastfstPackage.MODEL_FASTFST__NAC_CMYN:
        return getNacCMyn();
      case FastfstPackage.MODEL_FASTFST__NAC_CMZN:
        return getNacCMzn();
      case FastfstPackage.MODEL_FASTFST__TOWER_HT:
        return getTowerHt();
      case FastfstPackage.MODEL_FASTFST__TWR2_SHFT:
        return getTwr2Shft();
      case FastfstPackage.MODEL_FASTFST__TWR_RB_HT:
        return getTwrRBHt();
      case FastfstPackage.MODEL_FASTFST__SHFT_TILT:
        return getShftTilt();
      case FastfstPackage.MODEL_FASTFST__DELTA3:
        return getDelta3();
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_1:
        return getPreCone_1_();
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_2:
        return getPreCone_2_();
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_3:
        return getPreCone_3_();
      case FastfstPackage.MODEL_FASTFST__AZIM_B1_UP:
        return getAzimB1Up();
      case FastfstPackage.MODEL_FASTFST__YAW_BR_MASS:
        return getYawBrMass();
      case FastfstPackage.MODEL_FASTFST__NAC_MASS:
        return getNacMass();
      case FastfstPackage.MODEL_FASTFST__HUB_MASS:
        return getHubMass();
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_1:
        return getTipMass_1_();
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_2:
        return getTipMass_2_();
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_3:
        return getTipMass_3_();
      case FastfstPackage.MODEL_FASTFST__NAC_YINER:
        return getNacYIner();
      case FastfstPackage.MODEL_FASTFST__GEN_INER:
        return getGenIner();
      case FastfstPackage.MODEL_FASTFST__HUB_INER:
        return getHubIner();
      case FastfstPackage.MODEL_FASTFST__GBOX_EFF:
        return getGBoxEff();
      case FastfstPackage.MODEL_FASTFST__GEN_EFF:
        return getGenEff();
      case FastfstPackage.MODEL_FASTFST__GB_RATIO:
        return getGBRatio();
      case FastfstPackage.MODEL_FASTFST__GB_REVERS:
        return getGBRevers();
      case FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F:
        return getHSSBrTqF();
      case FastfstPackage.MODEL_FASTFST__HSS_BR_DT:
        return getHSSBrDT();
      case FastfstPackage.MODEL_FASTFST__DYN_BRK_FI:
        return getDynBrkFi();
      case FastfstPackage.MODEL_FASTFST__DT_TOR_SPR:
        return getDTTorSpr();
      case FastfstPackage.MODEL_FASTFST__DT_TOR_DMP:
        return getDTTorDmp();
      case FastfstPackage.MODEL_FASTFST__SIG_SL_PC:
        return getSIG_SlPc();
      case FastfstPackage.MODEL_FASTFST__SIG_SY_SP:
        return getSIG_SySp();
      case FastfstPackage.MODEL_FASTFST__SIG_RT_TQ:
        return getSIG_RtTq();
      case FastfstPackage.MODEL_FASTFST__SIG_PO_RT:
        return getSIG_PORt();
      case FastfstPackage.MODEL_FASTFST__TEC_FREQ:
        return getTEC_Freq();
      case FastfstPackage.MODEL_FASTFST__TEC_NPOL:
        return getTEC_Npol();
      case FastfstPackage.MODEL_FASTFST__TEC_SRES:
        return getTEC_Sres();
      case FastfstPackage.MODEL_FASTFST__TEC_RRES:
        return getTEC_Rres();
      case FastfstPackage.MODEL_FASTFST__TEC_VLL:
        return getTEC_VLL();
      case FastfstPackage.MODEL_FASTFST__TEC_SLR:
        return getTEC_SLR();
      case FastfstPackage.MODEL_FASTFST__TEC_RLR:
        return getTEC_RLR();
      case FastfstPackage.MODEL_FASTFST__TEC_MR:
        return getTEC_MR();
      case FastfstPackage.MODEL_FASTFST__PTFM_MODEL:
        return getPtfmModel();
      case FastfstPackage.MODEL_FASTFST__PTFM_FILE:
        return getPtfmFile();
      case FastfstPackage.MODEL_FASTFST__TWR_NODES:
        return getTwrNodes();
      case FastfstPackage.MODEL_FASTFST__TWR_FILE:
        return getTwrFile();
      case FastfstPackage.MODEL_FASTFST__YAW_SPR:
        return getYawSpr();
      case FastfstPackage.MODEL_FASTFST__YAW_DAMP:
        return getYawDamp();
      case FastfstPackage.MODEL_FASTFST__YAW_NEUT:
        return getYawNeut();
      case FastfstPackage.MODEL_FASTFST__FURLING:
        return getFurling();
      case FastfstPackage.MODEL_FASTFST__FURL_FILE:
        return getFurlFile();
      case FastfstPackage.MODEL_FASTFST__TEET_MOD:
        return getTeetMod();
      case FastfstPackage.MODEL_FASTFST__TEET_DMP_P:
        return getTeetDmpP();
      case FastfstPackage.MODEL_FASTFST__TEET_DMP:
        return getTeetDmp();
      case FastfstPackage.MODEL_FASTFST__TEET_CDMP:
        return getTeetCDmp();
      case FastfstPackage.MODEL_FASTFST__TEET_SST_P:
        return getTeetSStP();
      case FastfstPackage.MODEL_FASTFST__TEET_HST_P:
        return getTeetHStP();
      case FastfstPackage.MODEL_FASTFST__TEET_SS_SP:
        return getTeetSSSp();
      case FastfstPackage.MODEL_FASTFST__TEET_HS_SP:
        return getTeetHSSp();
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_N:
        return getTBDrConN();
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_D:
        return getTBDrConD();
      case FastfstPackage.MODEL_FASTFST__TP_BR_DT:
        return getTpBrDT();
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_1:
        return getBldFile_1_();
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_2:
        return getBldFile_2_();
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_3:
        return getBldFile_3_();
      case FastfstPackage.MODEL_FASTFST__AD_FILE:
        return getADFile();
      case FastfstPackage.MODEL_FASTFST__NOISE_FILE:
        return getNoiseFile();
      case FastfstPackage.MODEL_FASTFST__ADAMS_FILE:
        return getADAMSFile();
      case FastfstPackage.MODEL_FASTFST__LIN_FILE:
        return getLinFile();
      case FastfstPackage.MODEL_FASTFST__SUM_PRINT:
        return getSumPrint();
      case FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT:
        return getOutFileFmt();
      case FastfstPackage.MODEL_FASTFST__TAB_DELIM:
        return getTabDelim();
      case FastfstPackage.MODEL_FASTFST__OUT_FMT:
        return getOutFmt();
      case FastfstPackage.MODEL_FASTFST__TSTART:
        return getTStart();
      case FastfstPackage.MODEL_FASTFST__DEC_FACT:
        return getDecFact();
      case FastfstPackage.MODEL_FASTFST__STTS_TIME:
        return getSttsTime();
      case FastfstPackage.MODEL_FASTFST__NC_IM_UXN:
        return getNcIMUxn();
      case FastfstPackage.MODEL_FASTFST__NC_IM_UYN:
        return getNcIMUyn();
      case FastfstPackage.MODEL_FASTFST__NC_IM_UZN:
        return getNcIMUzn();
      case FastfstPackage.MODEL_FASTFST__SHFT_GAG_L:
        return getShftGagL();
      case FastfstPackage.MODEL_FASTFST__NTW_GAGES:
        return getNTwGages();
      case FastfstPackage.MODEL_FASTFST__TWR_GAG_ND:
        return getTwrGagNd();
      case FastfstPackage.MODEL_FASTFST__NBL_GAGES:
        return getNBlGages();
      case FastfstPackage.MODEL_FASTFST__BLD_GAG_ND:
        return getBldGagNd();
      case FastfstPackage.MODEL_FASTFST__OUT_LIST:
        return getOutList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FastfstPackage.MODEL_FASTFST__HEAD:
        setHead((Header)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__ECHO:
        setEcho((bEcho)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__ADAMS_PREP:
        setADAMSPrep((iADAMSPrep)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__ANAL_MODE:
        setAnalMode((iAnalMode)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NUM_BL:
        setNumBl((iNumBl)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TMAX:
        setTMax((nTMax)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__DT:
        setDT((nDT)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__YC_MODE:
        setYCMode((iYCMode)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TYC_ON:
        setTYCOn((nTYCOn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__PC_MODE:
        setPCMode((iPCMode)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TPC_ON:
        setTPCOn((nTPCOn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_CONTRL:
        setVSContrl((iVSContrl)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP:
        setVS_RtGnSp((nVS_RtGnSp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_RT_TQ:
        setVS_RtTq((nVS_RtTq)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_RGN2_K:
        setVS_Rgn2K((nVS_Rgn2K)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_SL_PC:
        setVS_SlPc((nVS_SlPc)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_MODEL:
        setGenModel((iGenModel)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STR:
        setGenTiStr((bGenTiStr)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STP:
        setGenTiStp((bGenTiStp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SPD_GEN_ON:
        setSpdGenOn((nSpdGenOn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_ON:
        setTimGenOn((nTimGenOn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_OF:
        setTimGenOf((nTimGenOf)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_MODE:
        setHSSBrMode((iHSSBrMode)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__THSS_BR_DP:
        setTHSSBrDp((nTHSSBrDp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TI_DYN_BRK:
        setTiDynBrk((nTiDynBrk)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1:
        setTTpBrDp_1_((nTTpBrDp_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2:
        setTTpBrDp_2_((nTTpBrDp_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3:
        setTTpBrDp_3_((nTTpBrDp_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1:
        setTBDepISp_1_((nTBDepISp_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2:
        setTBDepISp_2_((nTBDepISp_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3:
        setTBDepISp_3_((nTBDepISp_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_S:
        setTYawManS((nTYawManS)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_E:
        setTYawManE((nTYawManE)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_YAW_F:
        setNacYawF((nNacYawF)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1:
        setTPitManS_1_((nTPitManS_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2:
        setTPitManS_2_((nTPitManS_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3:
        setTPitManS_3_((nTPitManS_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1:
        setTPitManE_1_((nTPitManE_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2:
        setTPitManE_2_((nTPitManE_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3:
        setTPitManE_3_((nTPitManE_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_1:
        setBlPitch_1_((nBlPitch_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_2:
        setBlPitch_2_((nBlPitch_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_3:
        setBlPitch_3_((nBlPitch_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F1:
        setBlPitchF_1_((nBlPitchF_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F2:
        setBlPitchF_2_((nBlPitchF_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F3:
        setBlPitchF_3_((nBlPitchF_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GRAVITY:
        setGravity((nGravity)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF1:
        setFlapDOF1((bFlapDOF1)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF2:
        setFlapDOF2((bFlapDOF2)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__EDGE_DOF:
        setEdgeDOF((bEdgeDOF)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_DOF:
        setTeetDOF((bTeetDOF)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__DR_TR_DOF:
        setDrTrDOF((bDrTrDOF)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_DOF:
        setGenDOF((bGenDOF)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_DOF:
        setYawDOF((bYawDOF)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TW_FADOF1:
        setTwFADOF1((bTwFADOF1)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TW_FADOF2:
        setTwFADOF2((bTwFADOF2)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF1:
        setTwSSDOF1((bTwSSDOF1)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF2:
        setTwSSDOF2((bTwSSDOF2)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__COMP_AERO:
        setCompAero((bCompAero)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__COMP_NOISE:
        setCompNoise((bCompNoise)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__OO_PDEFL:
        setOoPDefl((nOoPDefl)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__IP_DEFL:
        setIPDefl((nIPDefl)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_DEFL:
        setTeetDefl((nTeetDefl)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__AZIMUTH:
        setAzimuth((nAzimuth)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__ROT_SPEED:
        setRotSpeed((nRotSpeed)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_YAW:
        setNacYaw((nNacYaw)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TT_DSP_FA:
        setTTDspFA((nTTDspFA)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TT_DSP_SS:
        setTTDspSS((nTTDspSS)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TIP_RAD:
        setTipRad((nTipRad)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__HUB_RAD:
        setHubRad((nHubRad)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__PSPN_EL_N:
        setPSpnElN((nPSpnElN)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__UND_SLING:
        setUndSling((nUndSling)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__HUB_CM:
        setHubCM((nHubCM)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__OVER_HANG:
        setOverHang((nOverHang)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_CMXN:
        setNacCMxn((nNacCMxn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_CMYN:
        setNacCMyn((nNacCMyn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_CMZN:
        setNacCMzn((nNacCMzn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TOWER_HT:
        setTowerHt((nTowerHt)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR2_SHFT:
        setTwr2Shft((nTwr2Shft)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR_RB_HT:
        setTwrRBHt((nTwrRBHt)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SHFT_TILT:
        setShftTilt((nShftTilt)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__DELTA3:
        setDelta3((nDelta3)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_1:
        setPreCone_1_((nPreCone_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_2:
        setPreCone_2_((nPreCone_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_3:
        setPreCone_3_((nPreCone_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__AZIM_B1_UP:
        setAzimB1Up((nAzimB1Up)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_BR_MASS:
        setYawBrMass((nYawBrMass)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_MASS:
        setNacMass((nNacMass)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__HUB_MASS:
        setHubMass((nHubMass)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_1:
        setTipMass_1_((nTipMass_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_2:
        setTipMass_2_((nTipMass_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_3:
        setTipMass_3_((nTipMass_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_YINER:
        setNacYIner((nNacYIner)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_INER:
        setGenIner((nGenIner)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__HUB_INER:
        setHubIner((nHubIner)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GBOX_EFF:
        setGBoxEff((nGBoxEff)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_EFF:
        setGenEff((nGenEff)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GB_RATIO:
        setGBRatio((nGBRatio)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__GB_REVERS:
        setGBRevers((bGBRevers)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F:
        setHSSBrTqF((nHSSBrTqF)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_DT:
        setHSSBrDT((nHSSBrDT)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__DYN_BRK_FI:
        setDynBrkFi((fDynBrkFi)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__DT_TOR_SPR:
        setDTTorSpr((nDTTorSpr)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__DT_TOR_DMP:
        setDTTorDmp((nDTTorDmp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SIG_SL_PC:
        setSIG_SlPc((nSIG_SlPc)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SIG_SY_SP:
        setSIG_SySp((nSIG_SySp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SIG_RT_TQ:
        setSIG_RtTq((nSIG_RtTq)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SIG_PO_RT:
        setSIG_PORt((nSIG_PORt)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_FREQ:
        setTEC_Freq((nTEC_Freq)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_NPOL:
        setTEC_Npol((nTEC_Npol)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_SRES:
        setTEC_Sres((nTEC_Sres)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_RRES:
        setTEC_Rres((nTEC_Rres)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_VLL:
        setTEC_VLL((nTEC_VLL)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_SLR:
        setTEC_SLR((nTEC_SLR)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_RLR:
        setTEC_RLR((nTEC_RLR)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_MR:
        setTEC_MR((nTEC_MR)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__PTFM_MODEL:
        setPtfmModel((iPtfmModel)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__PTFM_FILE:
        setPtfmFile((fPtfmFile)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR_NODES:
        setTwrNodes((iTwrNodes)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR_FILE:
        setTwrFile((fTwrFile)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_SPR:
        setYawSpr((nYawSpr)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_DAMP:
        setYawDamp((nYawDamp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_NEUT:
        setYawNeut((nYawNeut)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__FURLING:
        setFurling((bFurling)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__FURL_FILE:
        setFurlFile((fFurlFile)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_MOD:
        setTeetMod((iTeetMod)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_DMP_P:
        setTeetDmpP((nTeetDmpP)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_DMP:
        setTeetDmp((nTeetDmp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_CDMP:
        setTeetCDmp((nTeetCDmp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_SST_P:
        setTeetSStP((nTeetSStP)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_HST_P:
        setTeetHStP((nTeetHStP)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_SS_SP:
        setTeetSSSp((nTeetSSSp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_HS_SP:
        setTeetHSSp((nTeetHSSp)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_N:
        setTBDrConN((nTBDrConN)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_D:
        setTBDrConD((nTBDrConD)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TP_BR_DT:
        setTpBrDT((nTpBrDT)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_1:
        setBldFile_1_((fBldFile_1_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_2:
        setBldFile_2_((fBldFile_2_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_3:
        setBldFile_3_((fBldFile_3_)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__AD_FILE:
        setADFile((fADFile)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NOISE_FILE:
        setNoiseFile((fNoiseFile)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__ADAMS_FILE:
        setADAMSFile((fADAMSFile)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__LIN_FILE:
        setLinFile((fLinFile)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SUM_PRINT:
        setSumPrint((bSumPrint)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT:
        setOutFileFmt((bOutFileFmt)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TAB_DELIM:
        setTabDelim((bTabDelim)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__OUT_FMT:
        setOutFmt((sOutFmt)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TSTART:
        setTStart((nTStart)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__DEC_FACT:
        setDecFact((iDecFact)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__STTS_TIME:
        setSttsTime((nSttsTime)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UXN:
        setNcIMUxn((nNcIMUxn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UYN:
        setNcIMUyn((nNcIMUyn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UZN:
        setNcIMUzn((nNcIMUzn)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__SHFT_GAG_L:
        setShftGagL((nShftGagL)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NTW_GAGES:
        setNTwGages((iNTwGages)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR_GAG_ND:
        setTwrGagNd((aTwrGagNd)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__NBL_GAGES:
        setNBlGages((iNBlGages)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__BLD_GAG_ND:
        setBldGagNd((aBldGagNd)newValue);
        return;
      case FastfstPackage.MODEL_FASTFST__OUT_LIST:
        setOutList((vOutList)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FastfstPackage.MODEL_FASTFST__HEAD:
        setHead((Header)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SECTIONS:
        getSections().clear();
        return;
      case FastfstPackage.MODEL_FASTFST__ECHO:
        setEcho((bEcho)null);
        return;
      case FastfstPackage.MODEL_FASTFST__ADAMS_PREP:
        setADAMSPrep((iADAMSPrep)null);
        return;
      case FastfstPackage.MODEL_FASTFST__ANAL_MODE:
        setAnalMode((iAnalMode)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NUM_BL:
        setNumBl((iNumBl)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TMAX:
        setTMax((nTMax)null);
        return;
      case FastfstPackage.MODEL_FASTFST__DT:
        setDT((nDT)null);
        return;
      case FastfstPackage.MODEL_FASTFST__YC_MODE:
        setYCMode((iYCMode)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TYC_ON:
        setTYCOn((nTYCOn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__PC_MODE:
        setPCMode((iPCMode)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TPC_ON:
        setTPCOn((nTPCOn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_CONTRL:
        setVSContrl((iVSContrl)null);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP:
        setVS_RtGnSp((nVS_RtGnSp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_RT_TQ:
        setVS_RtTq((nVS_RtTq)null);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_RGN2_K:
        setVS_Rgn2K((nVS_Rgn2K)null);
        return;
      case FastfstPackage.MODEL_FASTFST__VS_SL_PC:
        setVS_SlPc((nVS_SlPc)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_MODEL:
        setGenModel((iGenModel)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STR:
        setGenTiStr((bGenTiStr)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STP:
        setGenTiStp((bGenTiStp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SPD_GEN_ON:
        setSpdGenOn((nSpdGenOn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_ON:
        setTimGenOn((nTimGenOn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_OF:
        setTimGenOf((nTimGenOf)null);
        return;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_MODE:
        setHSSBrMode((iHSSBrMode)null);
        return;
      case FastfstPackage.MODEL_FASTFST__THSS_BR_DP:
        setTHSSBrDp((nTHSSBrDp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TI_DYN_BRK:
        setTiDynBrk((nTiDynBrk)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1:
        setTTpBrDp_1_((nTTpBrDp_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2:
        setTTpBrDp_2_((nTTpBrDp_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3:
        setTTpBrDp_3_((nTTpBrDp_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1:
        setTBDepISp_1_((nTBDepISp_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2:
        setTBDepISp_2_((nTBDepISp_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3:
        setTBDepISp_3_((nTBDepISp_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_S:
        setTYawManS((nTYawManS)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_E:
        setTYawManE((nTYawManE)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_YAW_F:
        setNacYawF((nNacYawF)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1:
        setTPitManS_1_((nTPitManS_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2:
        setTPitManS_2_((nTPitManS_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3:
        setTPitManS_3_((nTPitManS_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1:
        setTPitManE_1_((nTPitManE_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2:
        setTPitManE_2_((nTPitManE_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3:
        setTPitManE_3_((nTPitManE_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_1:
        setBlPitch_1_((nBlPitch_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_2:
        setBlPitch_2_((nBlPitch_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_3:
        setBlPitch_3_((nBlPitch_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F1:
        setBlPitchF_1_((nBlPitchF_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F2:
        setBlPitchF_2_((nBlPitchF_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F3:
        setBlPitchF_3_((nBlPitchF_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GRAVITY:
        setGravity((nGravity)null);
        return;
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF1:
        setFlapDOF1((bFlapDOF1)null);
        return;
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF2:
        setFlapDOF2((bFlapDOF2)null);
        return;
      case FastfstPackage.MODEL_FASTFST__EDGE_DOF:
        setEdgeDOF((bEdgeDOF)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_DOF:
        setTeetDOF((bTeetDOF)null);
        return;
      case FastfstPackage.MODEL_FASTFST__DR_TR_DOF:
        setDrTrDOF((bDrTrDOF)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_DOF:
        setGenDOF((bGenDOF)null);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_DOF:
        setYawDOF((bYawDOF)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TW_FADOF1:
        setTwFADOF1((bTwFADOF1)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TW_FADOF2:
        setTwFADOF2((bTwFADOF2)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF1:
        setTwSSDOF1((bTwSSDOF1)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF2:
        setTwSSDOF2((bTwSSDOF2)null);
        return;
      case FastfstPackage.MODEL_FASTFST__COMP_AERO:
        setCompAero((bCompAero)null);
        return;
      case FastfstPackage.MODEL_FASTFST__COMP_NOISE:
        setCompNoise((bCompNoise)null);
        return;
      case FastfstPackage.MODEL_FASTFST__OO_PDEFL:
        setOoPDefl((nOoPDefl)null);
        return;
      case FastfstPackage.MODEL_FASTFST__IP_DEFL:
        setIPDefl((nIPDefl)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_DEFL:
        setTeetDefl((nTeetDefl)null);
        return;
      case FastfstPackage.MODEL_FASTFST__AZIMUTH:
        setAzimuth((nAzimuth)null);
        return;
      case FastfstPackage.MODEL_FASTFST__ROT_SPEED:
        setRotSpeed((nRotSpeed)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_YAW:
        setNacYaw((nNacYaw)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TT_DSP_FA:
        setTTDspFA((nTTDspFA)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TT_DSP_SS:
        setTTDspSS((nTTDspSS)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TIP_RAD:
        setTipRad((nTipRad)null);
        return;
      case FastfstPackage.MODEL_FASTFST__HUB_RAD:
        setHubRad((nHubRad)null);
        return;
      case FastfstPackage.MODEL_FASTFST__PSPN_EL_N:
        setPSpnElN((nPSpnElN)null);
        return;
      case FastfstPackage.MODEL_FASTFST__UND_SLING:
        setUndSling((nUndSling)null);
        return;
      case FastfstPackage.MODEL_FASTFST__HUB_CM:
        setHubCM((nHubCM)null);
        return;
      case FastfstPackage.MODEL_FASTFST__OVER_HANG:
        setOverHang((nOverHang)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_CMXN:
        setNacCMxn((nNacCMxn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_CMYN:
        setNacCMyn((nNacCMyn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_CMZN:
        setNacCMzn((nNacCMzn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TOWER_HT:
        setTowerHt((nTowerHt)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR2_SHFT:
        setTwr2Shft((nTwr2Shft)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR_RB_HT:
        setTwrRBHt((nTwrRBHt)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SHFT_TILT:
        setShftTilt((nShftTilt)null);
        return;
      case FastfstPackage.MODEL_FASTFST__DELTA3:
        setDelta3((nDelta3)null);
        return;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_1:
        setPreCone_1_((nPreCone_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_2:
        setPreCone_2_((nPreCone_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_3:
        setPreCone_3_((nPreCone_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__AZIM_B1_UP:
        setAzimB1Up((nAzimB1Up)null);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_BR_MASS:
        setYawBrMass((nYawBrMass)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_MASS:
        setNacMass((nNacMass)null);
        return;
      case FastfstPackage.MODEL_FASTFST__HUB_MASS:
        setHubMass((nHubMass)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_1:
        setTipMass_1_((nTipMass_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_2:
        setTipMass_2_((nTipMass_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_3:
        setTipMass_3_((nTipMass_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NAC_YINER:
        setNacYIner((nNacYIner)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_INER:
        setGenIner((nGenIner)null);
        return;
      case FastfstPackage.MODEL_FASTFST__HUB_INER:
        setHubIner((nHubIner)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GBOX_EFF:
        setGBoxEff((nGBoxEff)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GEN_EFF:
        setGenEff((nGenEff)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GB_RATIO:
        setGBRatio((nGBRatio)null);
        return;
      case FastfstPackage.MODEL_FASTFST__GB_REVERS:
        setGBRevers((bGBRevers)null);
        return;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F:
        setHSSBrTqF((nHSSBrTqF)null);
        return;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_DT:
        setHSSBrDT((nHSSBrDT)null);
        return;
      case FastfstPackage.MODEL_FASTFST__DYN_BRK_FI:
        setDynBrkFi((fDynBrkFi)null);
        return;
      case FastfstPackage.MODEL_FASTFST__DT_TOR_SPR:
        setDTTorSpr((nDTTorSpr)null);
        return;
      case FastfstPackage.MODEL_FASTFST__DT_TOR_DMP:
        setDTTorDmp((nDTTorDmp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SIG_SL_PC:
        setSIG_SlPc((nSIG_SlPc)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SIG_SY_SP:
        setSIG_SySp((nSIG_SySp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SIG_RT_TQ:
        setSIG_RtTq((nSIG_RtTq)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SIG_PO_RT:
        setSIG_PORt((nSIG_PORt)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_FREQ:
        setTEC_Freq((nTEC_Freq)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_NPOL:
        setTEC_Npol((nTEC_Npol)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_SRES:
        setTEC_Sres((nTEC_Sres)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_RRES:
        setTEC_Rres((nTEC_Rres)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_VLL:
        setTEC_VLL((nTEC_VLL)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_SLR:
        setTEC_SLR((nTEC_SLR)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_RLR:
        setTEC_RLR((nTEC_RLR)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEC_MR:
        setTEC_MR((nTEC_MR)null);
        return;
      case FastfstPackage.MODEL_FASTFST__PTFM_MODEL:
        setPtfmModel((iPtfmModel)null);
        return;
      case FastfstPackage.MODEL_FASTFST__PTFM_FILE:
        setPtfmFile((fPtfmFile)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR_NODES:
        setTwrNodes((iTwrNodes)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR_FILE:
        setTwrFile((fTwrFile)null);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_SPR:
        setYawSpr((nYawSpr)null);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_DAMP:
        setYawDamp((nYawDamp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__YAW_NEUT:
        setYawNeut((nYawNeut)null);
        return;
      case FastfstPackage.MODEL_FASTFST__FURLING:
        setFurling((bFurling)null);
        return;
      case FastfstPackage.MODEL_FASTFST__FURL_FILE:
        setFurlFile((fFurlFile)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_MOD:
        setTeetMod((iTeetMod)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_DMP_P:
        setTeetDmpP((nTeetDmpP)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_DMP:
        setTeetDmp((nTeetDmp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_CDMP:
        setTeetCDmp((nTeetCDmp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_SST_P:
        setTeetSStP((nTeetSStP)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_HST_P:
        setTeetHStP((nTeetHStP)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_SS_SP:
        setTeetSSSp((nTeetSSSp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TEET_HS_SP:
        setTeetHSSp((nTeetHSSp)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_N:
        setTBDrConN((nTBDrConN)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_D:
        setTBDrConD((nTBDrConD)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TP_BR_DT:
        setTpBrDT((nTpBrDT)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_1:
        setBldFile_1_((fBldFile_1_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_2:
        setBldFile_2_((fBldFile_2_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_3:
        setBldFile_3_((fBldFile_3_)null);
        return;
      case FastfstPackage.MODEL_FASTFST__AD_FILE:
        setADFile((fADFile)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NOISE_FILE:
        setNoiseFile((fNoiseFile)null);
        return;
      case FastfstPackage.MODEL_FASTFST__ADAMS_FILE:
        setADAMSFile((fADAMSFile)null);
        return;
      case FastfstPackage.MODEL_FASTFST__LIN_FILE:
        setLinFile((fLinFile)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SUM_PRINT:
        setSumPrint((bSumPrint)null);
        return;
      case FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT:
        setOutFileFmt((bOutFileFmt)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TAB_DELIM:
        setTabDelim((bTabDelim)null);
        return;
      case FastfstPackage.MODEL_FASTFST__OUT_FMT:
        setOutFmt((sOutFmt)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TSTART:
        setTStart((nTStart)null);
        return;
      case FastfstPackage.MODEL_FASTFST__DEC_FACT:
        setDecFact((iDecFact)null);
        return;
      case FastfstPackage.MODEL_FASTFST__STTS_TIME:
        setSttsTime((nSttsTime)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UXN:
        setNcIMUxn((nNcIMUxn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UYN:
        setNcIMUyn((nNcIMUyn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UZN:
        setNcIMUzn((nNcIMUzn)null);
        return;
      case FastfstPackage.MODEL_FASTFST__SHFT_GAG_L:
        setShftGagL((nShftGagL)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NTW_GAGES:
        setNTwGages((iNTwGages)null);
        return;
      case FastfstPackage.MODEL_FASTFST__TWR_GAG_ND:
        setTwrGagNd((aTwrGagNd)null);
        return;
      case FastfstPackage.MODEL_FASTFST__NBL_GAGES:
        setNBlGages((iNBlGages)null);
        return;
      case FastfstPackage.MODEL_FASTFST__BLD_GAG_ND:
        setBldGagNd((aBldGagNd)null);
        return;
      case FastfstPackage.MODEL_FASTFST__OUT_LIST:
        setOutList((vOutList)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FastfstPackage.MODEL_FASTFST__HEAD:
        return head != null;
      case FastfstPackage.MODEL_FASTFST__SECTIONS:
        return sections != null && !sections.isEmpty();
      case FastfstPackage.MODEL_FASTFST__ECHO:
        return echo != null;
      case FastfstPackage.MODEL_FASTFST__ADAMS_PREP:
        return adamsPrep != null;
      case FastfstPackage.MODEL_FASTFST__ANAL_MODE:
        return analMode != null;
      case FastfstPackage.MODEL_FASTFST__NUM_BL:
        return numBl != null;
      case FastfstPackage.MODEL_FASTFST__TMAX:
        return tMax != null;
      case FastfstPackage.MODEL_FASTFST__DT:
        return dt != null;
      case FastfstPackage.MODEL_FASTFST__YC_MODE:
        return ycMode != null;
      case FastfstPackage.MODEL_FASTFST__TYC_ON:
        return tycOn != null;
      case FastfstPackage.MODEL_FASTFST__PC_MODE:
        return pcMode != null;
      case FastfstPackage.MODEL_FASTFST__TPC_ON:
        return tpcOn != null;
      case FastfstPackage.MODEL_FASTFST__VS_CONTRL:
        return vsContrl != null;
      case FastfstPackage.MODEL_FASTFST__VS_RT_GN_SP:
        return vS_RtGnSp != null;
      case FastfstPackage.MODEL_FASTFST__VS_RT_TQ:
        return vS_RtTq != null;
      case FastfstPackage.MODEL_FASTFST__VS_RGN2_K:
        return vS_Rgn2K != null;
      case FastfstPackage.MODEL_FASTFST__VS_SL_PC:
        return vS_SlPc != null;
      case FastfstPackage.MODEL_FASTFST__GEN_MODEL:
        return genModel != null;
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STR:
        return genTiStr != null;
      case FastfstPackage.MODEL_FASTFST__GEN_TI_STP:
        return genTiStp != null;
      case FastfstPackage.MODEL_FASTFST__SPD_GEN_ON:
        return spdGenOn != null;
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_ON:
        return timGenOn != null;
      case FastfstPackage.MODEL_FASTFST__TIM_GEN_OF:
        return timGenOf != null;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_MODE:
        return hssBrMode != null;
      case FastfstPackage.MODEL_FASTFST__THSS_BR_DP:
        return thssBrDp != null;
      case FastfstPackage.MODEL_FASTFST__TI_DYN_BRK:
        return tiDynBrk != null;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_1:
        return tTpBrDp_1_ != null;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_2:
        return tTpBrDp_2_ != null;
      case FastfstPackage.MODEL_FASTFST__TTP_BR_DP_3:
        return tTpBrDp_3_ != null;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_1:
        return tbDepISp_1_ != null;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_2:
        return tbDepISp_2_ != null;
      case FastfstPackage.MODEL_FASTFST__TB_DEP_ISP_3:
        return tbDepISp_3_ != null;
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_S:
        return tYawManS != null;
      case FastfstPackage.MODEL_FASTFST__TYAW_MAN_E:
        return tYawManE != null;
      case FastfstPackage.MODEL_FASTFST__NAC_YAW_F:
        return nacYawF != null;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S1:
        return tPitManS_1_ != null;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S2:
        return tPitManS_2_ != null;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_S3:
        return tPitManS_3_ != null;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E1:
        return tPitManE_1_ != null;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E2:
        return tPitManE_2_ != null;
      case FastfstPackage.MODEL_FASTFST__TPIT_MAN_E3:
        return tPitManE_3_ != null;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_1:
        return blPitch_1_ != null;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_2:
        return blPitch_2_ != null;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_3:
        return blPitch_3_ != null;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F1:
        return blPitchF_1_ != null;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F2:
        return blPitchF_2_ != null;
      case FastfstPackage.MODEL_FASTFST__BL_PITCH_F3:
        return blPitchF_3_ != null;
      case FastfstPackage.MODEL_FASTFST__GRAVITY:
        return gravity != null;
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF1:
        return flapDOF1 != null;
      case FastfstPackage.MODEL_FASTFST__FLAP_DOF2:
        return flapDOF2 != null;
      case FastfstPackage.MODEL_FASTFST__EDGE_DOF:
        return edgeDOF != null;
      case FastfstPackage.MODEL_FASTFST__TEET_DOF:
        return teetDOF != null;
      case FastfstPackage.MODEL_FASTFST__DR_TR_DOF:
        return drTrDOF != null;
      case FastfstPackage.MODEL_FASTFST__GEN_DOF:
        return genDOF != null;
      case FastfstPackage.MODEL_FASTFST__YAW_DOF:
        return yawDOF != null;
      case FastfstPackage.MODEL_FASTFST__TW_FADOF1:
        return twFADOF1 != null;
      case FastfstPackage.MODEL_FASTFST__TW_FADOF2:
        return twFADOF2 != null;
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF1:
        return twSSDOF1 != null;
      case FastfstPackage.MODEL_FASTFST__TW_SSDOF2:
        return twSSDOF2 != null;
      case FastfstPackage.MODEL_FASTFST__COMP_AERO:
        return compAero != null;
      case FastfstPackage.MODEL_FASTFST__COMP_NOISE:
        return compNoise != null;
      case FastfstPackage.MODEL_FASTFST__OO_PDEFL:
        return ooPDefl != null;
      case FastfstPackage.MODEL_FASTFST__IP_DEFL:
        return ipDefl != null;
      case FastfstPackage.MODEL_FASTFST__TEET_DEFL:
        return teetDefl != null;
      case FastfstPackage.MODEL_FASTFST__AZIMUTH:
        return azimuth != null;
      case FastfstPackage.MODEL_FASTFST__ROT_SPEED:
        return rotSpeed != null;
      case FastfstPackage.MODEL_FASTFST__NAC_YAW:
        return nacYaw != null;
      case FastfstPackage.MODEL_FASTFST__TT_DSP_FA:
        return ttDspFA != null;
      case FastfstPackage.MODEL_FASTFST__TT_DSP_SS:
        return ttDspSS != null;
      case FastfstPackage.MODEL_FASTFST__TIP_RAD:
        return tipRad != null;
      case FastfstPackage.MODEL_FASTFST__HUB_RAD:
        return hubRad != null;
      case FastfstPackage.MODEL_FASTFST__PSPN_EL_N:
        return pSpnElN != null;
      case FastfstPackage.MODEL_FASTFST__UND_SLING:
        return undSling != null;
      case FastfstPackage.MODEL_FASTFST__HUB_CM:
        return hubCM != null;
      case FastfstPackage.MODEL_FASTFST__OVER_HANG:
        return overHang != null;
      case FastfstPackage.MODEL_FASTFST__NAC_CMXN:
        return nacCMxn != null;
      case FastfstPackage.MODEL_FASTFST__NAC_CMYN:
        return nacCMyn != null;
      case FastfstPackage.MODEL_FASTFST__NAC_CMZN:
        return nacCMzn != null;
      case FastfstPackage.MODEL_FASTFST__TOWER_HT:
        return towerHt != null;
      case FastfstPackage.MODEL_FASTFST__TWR2_SHFT:
        return twr2Shft != null;
      case FastfstPackage.MODEL_FASTFST__TWR_RB_HT:
        return twrRBHt != null;
      case FastfstPackage.MODEL_FASTFST__SHFT_TILT:
        return shftTilt != null;
      case FastfstPackage.MODEL_FASTFST__DELTA3:
        return delta3 != null;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_1:
        return preCone_1_ != null;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_2:
        return preCone_2_ != null;
      case FastfstPackage.MODEL_FASTFST__PRE_CONE_3:
        return preCone_3_ != null;
      case FastfstPackage.MODEL_FASTFST__AZIM_B1_UP:
        return azimB1Up != null;
      case FastfstPackage.MODEL_FASTFST__YAW_BR_MASS:
        return yawBrMass != null;
      case FastfstPackage.MODEL_FASTFST__NAC_MASS:
        return nacMass != null;
      case FastfstPackage.MODEL_FASTFST__HUB_MASS:
        return hubMass != null;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_1:
        return tipMass_1_ != null;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_2:
        return tipMass_2_ != null;
      case FastfstPackage.MODEL_FASTFST__TIP_MASS_3:
        return tipMass_3_ != null;
      case FastfstPackage.MODEL_FASTFST__NAC_YINER:
        return nacYIner != null;
      case FastfstPackage.MODEL_FASTFST__GEN_INER:
        return genIner != null;
      case FastfstPackage.MODEL_FASTFST__HUB_INER:
        return hubIner != null;
      case FastfstPackage.MODEL_FASTFST__GBOX_EFF:
        return gBoxEff != null;
      case FastfstPackage.MODEL_FASTFST__GEN_EFF:
        return genEff != null;
      case FastfstPackage.MODEL_FASTFST__GB_RATIO:
        return gbRatio != null;
      case FastfstPackage.MODEL_FASTFST__GB_REVERS:
        return gbRevers != null;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_TQ_F:
        return hssBrTqF != null;
      case FastfstPackage.MODEL_FASTFST__HSS_BR_DT:
        return hssBrDT != null;
      case FastfstPackage.MODEL_FASTFST__DYN_BRK_FI:
        return dynBrkFi != null;
      case FastfstPackage.MODEL_FASTFST__DT_TOR_SPR:
        return dtTorSpr != null;
      case FastfstPackage.MODEL_FASTFST__DT_TOR_DMP:
        return dtTorDmp != null;
      case FastfstPackage.MODEL_FASTFST__SIG_SL_PC:
        return siG_SlPc != null;
      case FastfstPackage.MODEL_FASTFST__SIG_SY_SP:
        return siG_SySp != null;
      case FastfstPackage.MODEL_FASTFST__SIG_RT_TQ:
        return siG_RtTq != null;
      case FastfstPackage.MODEL_FASTFST__SIG_PO_RT:
        return siG_PORt != null;
      case FastfstPackage.MODEL_FASTFST__TEC_FREQ:
        return teC_Freq != null;
      case FastfstPackage.MODEL_FASTFST__TEC_NPOL:
        return teC_Npol != null;
      case FastfstPackage.MODEL_FASTFST__TEC_SRES:
        return teC_Sres != null;
      case FastfstPackage.MODEL_FASTFST__TEC_RRES:
        return teC_Rres != null;
      case FastfstPackage.MODEL_FASTFST__TEC_VLL:
        return teC_VLL != null;
      case FastfstPackage.MODEL_FASTFST__TEC_SLR:
        return teC_SLR != null;
      case FastfstPackage.MODEL_FASTFST__TEC_RLR:
        return teC_RLR != null;
      case FastfstPackage.MODEL_FASTFST__TEC_MR:
        return teC_MR != null;
      case FastfstPackage.MODEL_FASTFST__PTFM_MODEL:
        return ptfmModel != null;
      case FastfstPackage.MODEL_FASTFST__PTFM_FILE:
        return ptfmFile != null;
      case FastfstPackage.MODEL_FASTFST__TWR_NODES:
        return twrNodes != null;
      case FastfstPackage.MODEL_FASTFST__TWR_FILE:
        return twrFile != null;
      case FastfstPackage.MODEL_FASTFST__YAW_SPR:
        return yawSpr != null;
      case FastfstPackage.MODEL_FASTFST__YAW_DAMP:
        return yawDamp != null;
      case FastfstPackage.MODEL_FASTFST__YAW_NEUT:
        return yawNeut != null;
      case FastfstPackage.MODEL_FASTFST__FURLING:
        return furling != null;
      case FastfstPackage.MODEL_FASTFST__FURL_FILE:
        return furlFile != null;
      case FastfstPackage.MODEL_FASTFST__TEET_MOD:
        return teetMod != null;
      case FastfstPackage.MODEL_FASTFST__TEET_DMP_P:
        return teetDmpP != null;
      case FastfstPackage.MODEL_FASTFST__TEET_DMP:
        return teetDmp != null;
      case FastfstPackage.MODEL_FASTFST__TEET_CDMP:
        return teetCDmp != null;
      case FastfstPackage.MODEL_FASTFST__TEET_SST_P:
        return teetSStP != null;
      case FastfstPackage.MODEL_FASTFST__TEET_HST_P:
        return teetHStP != null;
      case FastfstPackage.MODEL_FASTFST__TEET_SS_SP:
        return teetSSSp != null;
      case FastfstPackage.MODEL_FASTFST__TEET_HS_SP:
        return teetHSSp != null;
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_N:
        return tbDrConN != null;
      case FastfstPackage.MODEL_FASTFST__TB_DR_CON_D:
        return tbDrConD != null;
      case FastfstPackage.MODEL_FASTFST__TP_BR_DT:
        return tpBrDT != null;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_1:
        return bldFile_1_ != null;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_2:
        return bldFile_2_ != null;
      case FastfstPackage.MODEL_FASTFST__BLD_FILE_3:
        return bldFile_3_ != null;
      case FastfstPackage.MODEL_FASTFST__AD_FILE:
        return adFile != null;
      case FastfstPackage.MODEL_FASTFST__NOISE_FILE:
        return noiseFile != null;
      case FastfstPackage.MODEL_FASTFST__ADAMS_FILE:
        return adamsFile != null;
      case FastfstPackage.MODEL_FASTFST__LIN_FILE:
        return linFile != null;
      case FastfstPackage.MODEL_FASTFST__SUM_PRINT:
        return sumPrint != null;
      case FastfstPackage.MODEL_FASTFST__OUT_FILE_FMT:
        return outFileFmt != null;
      case FastfstPackage.MODEL_FASTFST__TAB_DELIM:
        return tabDelim != null;
      case FastfstPackage.MODEL_FASTFST__OUT_FMT:
        return outFmt != null;
      case FastfstPackage.MODEL_FASTFST__TSTART:
        return tStart != null;
      case FastfstPackage.MODEL_FASTFST__DEC_FACT:
        return decFact != null;
      case FastfstPackage.MODEL_FASTFST__STTS_TIME:
        return sttsTime != null;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UXN:
        return ncIMUxn != null;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UYN:
        return ncIMUyn != null;
      case FastfstPackage.MODEL_FASTFST__NC_IM_UZN:
        return ncIMUzn != null;
      case FastfstPackage.MODEL_FASTFST__SHFT_GAG_L:
        return shftGagL != null;
      case FastfstPackage.MODEL_FASTFST__NTW_GAGES:
        return nTwGages != null;
      case FastfstPackage.MODEL_FASTFST__TWR_GAG_ND:
        return twrGagNd != null;
      case FastfstPackage.MODEL_FASTFST__NBL_GAGES:
        return nBlGages != null;
      case FastfstPackage.MODEL_FASTFST__BLD_GAG_ND:
        return bldGagNd != null;
      case FastfstPackage.MODEL_FASTFST__OUT_LIST:
        return outList != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelFastfstImpl
