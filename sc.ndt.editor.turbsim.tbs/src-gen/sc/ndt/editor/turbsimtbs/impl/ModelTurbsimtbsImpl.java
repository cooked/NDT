/**
 */
package sc.ndt.editor.turbsimtbs.impl;

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

import sc.ndt.editor.turbsimtbs.Header;
import sc.ndt.editor.turbsimtbs.ModelTurbsimtbs;
import sc.ndt.editor.turbsimtbs.Section;
import sc.ndt.editor.turbsimtbs.TurbsimtbsPackage;
import sc.ndt.editor.turbsimtbs.bClockwise;
import sc.ndt.editor.turbsimtbs.bRandomize;
import sc.ndt.editor.turbsimtbs.bWrACT;
import sc.ndt.editor.turbsimtbs.bWrADFF;
import sc.ndt.editor.turbsimtbs.bWrADHH;
import sc.ndt.editor.turbsimtbs.bWrADTWR;
import sc.ndt.editor.turbsimtbs.bWrBHHTP;
import sc.ndt.editor.turbsimtbs.bWrBLFF;
import sc.ndt.editor.turbsimtbs.bWrFHHTP;
import sc.ndt.editor.turbsimtbs.bWrFMTFF;
import sc.ndt.editor.turbsimtbs.iNumGrid_Y;
import sc.ndt.editor.turbsimtbs.iNumGrid_Z;
import sc.ndt.editor.turbsimtbs.iScaleIEC;
import sc.ndt.editor.turbsimtbs.nAnalysisTime;
import sc.ndt.editor.turbsimtbs.nCTLy;
import sc.ndt.editor.turbsimtbs.nCTLz;
import sc.ndt.editor.turbsimtbs.nCTStartTime;
import sc.ndt.editor.turbsimtbs.nCohExp;
import sc.ndt.editor.turbsimtbs.nDistScl;
import sc.ndt.editor.turbsimtbs.nGridHeight;
import sc.ndt.editor.turbsimtbs.nGridWidth;
import sc.ndt.editor.turbsimtbs.nHFlowAng;
import sc.ndt.editor.turbsimtbs.nHubHt;
import sc.ndt.editor.turbsimtbs.nIncDec1;
import sc.ndt.editor.turbsimtbs.nIncDec2;
import sc.ndt.editor.turbsimtbs.nIncDec3;
import sc.ndt.editor.turbsimtbs.nLocation;
import sc.ndt.editor.turbsimtbs.nPC_UV;
import sc.ndt.editor.turbsimtbs.nPC_UW;
import sc.ndt.editor.turbsimtbs.nPC_VW;
import sc.ndt.editor.turbsimtbs.nPLExp;
import sc.ndt.editor.turbsimtbs.nRICH_NO;
import sc.ndt.editor.turbsimtbs.nRandSeed1;
import sc.ndt.editor.turbsimtbs.nRandSeed2;
import sc.ndt.editor.turbsimtbs.nRefHt;
import sc.ndt.editor.turbsimtbs.nTimeStep;
import sc.ndt.editor.turbsimtbs.nUStar;
import sc.ndt.editor.turbsimtbs.nUref;
import sc.ndt.editor.turbsimtbs.nUsableTime;
import sc.ndt.editor.turbsimtbs.nVFlowAng;
import sc.ndt.editor.turbsimtbs.nZ0;
import sc.ndt.editor.turbsimtbs.nZI;
import sc.ndt.editor.turbsimtbs.nZJetMax;
import sc.ndt.editor.turbsimtbs.sCTEventFile;
import sc.ndt.editor.turbsimtbs.sCTEventPath;
import sc.ndt.editor.turbsimtbs.sETMc;
import sc.ndt.editor.turbsimtbs.sIEC_WindType;
import sc.ndt.editor.turbsimtbs.sIECstandard;
import sc.ndt.editor.turbsimtbs.sIECturbc;
import sc.ndt.editor.turbsimtbs.sTurbModel;
import sc.ndt.editor.turbsimtbs.sWindProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Turbsimtbs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getRandSeed1 <em>Rand Seed1</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getRandSeed2 <em>Rand Seed2</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWrBHHTP <em>Wr BHHTP</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWrFHHTP <em>Wr FHHTP</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWrADHH <em>Wr ADHH</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWrADFF <em>Wr ADFF</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWrBLFF <em>Wr BLFF</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWrADTWR <em>Wr ADTWR</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWrFMTFF <em>Wr FMTFF</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWrACT <em>Wr ACT</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getClockwise <em>Clockwise</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getScaleIEC <em>Scale IEC</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getNumGrid_Z <em>Num Grid Z</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getNumGrid_Y <em>Num Grid Y</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getAnalysisTime <em>Analysis Time</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getUsableTime <em>Usable Time</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getHubHt <em>Hub Ht</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getGridHeight <em>Grid Height</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getVFlowAng <em>VFlow Ang</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getHFlowAng <em>HFlow Ang</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getTurbModel <em>Turb Model</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getIECstandard <em>IE Cstandard</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getIECturbc <em>IE Cturbc</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getIEC_WindType <em>IEC Wind Type</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getETMc <em>ET Mc</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getWindProfileType <em>Wind Profile Type</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getRefHt <em>Ref Ht</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getUref <em>Uref</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getZJetMax <em>ZJet Max</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getPLExp <em>PL Exp</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getZ0 <em>Z0</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getRICH_NO <em>RICH NO</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getUStar <em>UStar</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getZI <em>ZI</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getPC_UW <em>PC UW</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getPC_UV <em>PC UV</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getPC_VW <em>PC VW</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getIncDec1 <em>Inc Dec1</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getIncDec2 <em>Inc Dec2</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getIncDec3 <em>Inc Dec3</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getCohExp <em>Coh Exp</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getCTEventPath <em>CT Event Path</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getCTEventFile <em>CT Event File</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getRandomize <em>Randomize</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getDistScl <em>Dist Scl</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getCTLy <em>CT Ly</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getCTLz <em>CT Lz</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.impl.ModelTurbsimtbsImpl#getCTStartTime <em>CT Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTurbsimtbsImpl extends MinimalEObjectImpl.Container implements ModelTurbsimtbs
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
   * The cached value of the '{@link #getRandSeed1() <em>Rand Seed1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandSeed1()
   * @generated
   * @ordered
   */
  protected nRandSeed1 randSeed1;

  /**
   * The cached value of the '{@link #getRandSeed2() <em>Rand Seed2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandSeed2()
   * @generated
   * @ordered
   */
  protected nRandSeed2 randSeed2;

  /**
   * The cached value of the '{@link #getWrBHHTP() <em>Wr BHHTP</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrBHHTP()
   * @generated
   * @ordered
   */
  protected bWrBHHTP wrBHHTP;

  /**
   * The cached value of the '{@link #getWrFHHTP() <em>Wr FHHTP</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrFHHTP()
   * @generated
   * @ordered
   */
  protected bWrFHHTP wrFHHTP;

  /**
   * The cached value of the '{@link #getWrADHH() <em>Wr ADHH</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrADHH()
   * @generated
   * @ordered
   */
  protected bWrADHH wrADHH;

  /**
   * The cached value of the '{@link #getWrADFF() <em>Wr ADFF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrADFF()
   * @generated
   * @ordered
   */
  protected bWrADFF wrADFF;

  /**
   * The cached value of the '{@link #getWrBLFF() <em>Wr BLFF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrBLFF()
   * @generated
   * @ordered
   */
  protected bWrBLFF wrBLFF;

  /**
   * The cached value of the '{@link #getWrADTWR() <em>Wr ADTWR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrADTWR()
   * @generated
   * @ordered
   */
  protected bWrADTWR wrADTWR;

  /**
   * The cached value of the '{@link #getWrFMTFF() <em>Wr FMTFF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrFMTFF()
   * @generated
   * @ordered
   */
  protected bWrFMTFF wrFMTFF;

  /**
   * The cached value of the '{@link #getWrACT() <em>Wr ACT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrACT()
   * @generated
   * @ordered
   */
  protected bWrACT wrACT;

  /**
   * The cached value of the '{@link #getClockwise() <em>Clockwise</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClockwise()
   * @generated
   * @ordered
   */
  protected bClockwise clockwise;

  /**
   * The cached value of the '{@link #getScaleIEC() <em>Scale IEC</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaleIEC()
   * @generated
   * @ordered
   */
  protected iScaleIEC scaleIEC;

  /**
   * The cached value of the '{@link #getNumGrid_Z() <em>Num Grid Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumGrid_Z()
   * @generated
   * @ordered
   */
  protected iNumGrid_Z numGrid_Z;

  /**
   * The cached value of the '{@link #getNumGrid_Y() <em>Num Grid Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumGrid_Y()
   * @generated
   * @ordered
   */
  protected iNumGrid_Y numGrid_Y;

  /**
   * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeStep()
   * @generated
   * @ordered
   */
  protected nTimeStep timeStep;

  /**
   * The cached value of the '{@link #getAnalysisTime() <em>Analysis Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalysisTime()
   * @generated
   * @ordered
   */
  protected nAnalysisTime analysisTime;

  /**
   * The cached value of the '{@link #getUsableTime() <em>Usable Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsableTime()
   * @generated
   * @ordered
   */
  protected nUsableTime usableTime;

  /**
   * The cached value of the '{@link #getHubHt() <em>Hub Ht</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubHt()
   * @generated
   * @ordered
   */
  protected nHubHt hubHt;

  /**
   * The cached value of the '{@link #getGridHeight() <em>Grid Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridHeight()
   * @generated
   * @ordered
   */
  protected nGridHeight gridHeight;

  /**
   * The cached value of the '{@link #getGridWidth() <em>Grid Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridWidth()
   * @generated
   * @ordered
   */
  protected nGridWidth gridWidth;

  /**
   * The cached value of the '{@link #getVFlowAng() <em>VFlow Ang</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVFlowAng()
   * @generated
   * @ordered
   */
  protected nVFlowAng vFlowAng;

  /**
   * The cached value of the '{@link #getHFlowAng() <em>HFlow Ang</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHFlowAng()
   * @generated
   * @ordered
   */
  protected nHFlowAng hFlowAng;

  /**
   * The cached value of the '{@link #getTurbModel() <em>Turb Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurbModel()
   * @generated
   * @ordered
   */
  protected sTurbModel turbModel;

  /**
   * The cached value of the '{@link #getIECstandard() <em>IE Cstandard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIECstandard()
   * @generated
   * @ordered
   */
  protected sIECstandard ieCstandard;

  /**
   * The cached value of the '{@link #getIECturbc() <em>IE Cturbc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIECturbc()
   * @generated
   * @ordered
   */
  protected sIECturbc ieCturbc;

  /**
   * The cached value of the '{@link #getIEC_WindType() <em>IEC Wind Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIEC_WindType()
   * @generated
   * @ordered
   */
  protected sIEC_WindType ieC_WindType;

  /**
   * The cached value of the '{@link #getETMc() <em>ET Mc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getETMc()
   * @generated
   * @ordered
   */
  protected sETMc etMc;

  /**
   * The cached value of the '{@link #getWindProfileType() <em>Wind Profile Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindProfileType()
   * @generated
   * @ordered
   */
  protected sWindProfileType windProfileType;

  /**
   * The cached value of the '{@link #getRefHt() <em>Ref Ht</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefHt()
   * @generated
   * @ordered
   */
  protected nRefHt refHt;

  /**
   * The cached value of the '{@link #getUref() <em>Uref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUref()
   * @generated
   * @ordered
   */
  protected nUref uref;

  /**
   * The cached value of the '{@link #getZJetMax() <em>ZJet Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZJetMax()
   * @generated
   * @ordered
   */
  protected nZJetMax zJetMax;

  /**
   * The cached value of the '{@link #getPLExp() <em>PL Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPLExp()
   * @generated
   * @ordered
   */
  protected nPLExp plExp;

  /**
   * The cached value of the '{@link #getZ0() <em>Z0</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ0()
   * @generated
   * @ordered
   */
  protected nZ0 z0;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected nLocation location;

  /**
   * The cached value of the '{@link #getRICH_NO() <em>RICH NO</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRICH_NO()
   * @generated
   * @ordered
   */
  protected nRICH_NO ricH_NO;

  /**
   * The cached value of the '{@link #getUStar() <em>UStar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUStar()
   * @generated
   * @ordered
   */
  protected nUStar uStar;

  /**
   * The cached value of the '{@link #getZI() <em>ZI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZI()
   * @generated
   * @ordered
   */
  protected nZI zi;

  /**
   * The cached value of the '{@link #getPC_UW() <em>PC UW</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPC_UW()
   * @generated
   * @ordered
   */
  protected nPC_UW pC_UW;

  /**
   * The cached value of the '{@link #getPC_UV() <em>PC UV</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPC_UV()
   * @generated
   * @ordered
   */
  protected nPC_UV pC_UV;

  /**
   * The cached value of the '{@link #getPC_VW() <em>PC VW</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPC_VW()
   * @generated
   * @ordered
   */
  protected nPC_VW pC_VW;

  /**
   * The cached value of the '{@link #getIncDec1() <em>Inc Dec1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncDec1()
   * @generated
   * @ordered
   */
  protected nIncDec1 incDec1;

  /**
   * The cached value of the '{@link #getIncDec2() <em>Inc Dec2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncDec2()
   * @generated
   * @ordered
   */
  protected nIncDec2 incDec2;

  /**
   * The cached value of the '{@link #getIncDec3() <em>Inc Dec3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncDec3()
   * @generated
   * @ordered
   */
  protected nIncDec3 incDec3;

  /**
   * The cached value of the '{@link #getCohExp() <em>Coh Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCohExp()
   * @generated
   * @ordered
   */
  protected nCohExp cohExp;

  /**
   * The cached value of the '{@link #getCTEventPath() <em>CT Event Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCTEventPath()
   * @generated
   * @ordered
   */
  protected sCTEventPath ctEventPath;

  /**
   * The cached value of the '{@link #getCTEventFile() <em>CT Event File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCTEventFile()
   * @generated
   * @ordered
   */
  protected sCTEventFile ctEventFile;

  /**
   * The cached value of the '{@link #getRandomize() <em>Randomize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandomize()
   * @generated
   * @ordered
   */
  protected bRandomize randomize;

  /**
   * The cached value of the '{@link #getDistScl() <em>Dist Scl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistScl()
   * @generated
   * @ordered
   */
  protected nDistScl distScl;

  /**
   * The cached value of the '{@link #getCTLy() <em>CT Ly</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCTLy()
   * @generated
   * @ordered
   */
  protected nCTLy ctLy;

  /**
   * The cached value of the '{@link #getCTLz() <em>CT Lz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCTLz()
   * @generated
   * @ordered
   */
  protected nCTLz ctLz;

  /**
   * The cached value of the '{@link #getCTStartTime() <em>CT Start Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCTStartTime()
   * @generated
   * @ordered
   */
  protected nCTStartTime ctStartTime;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelTurbsimtbsImpl()
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
    return TurbsimtbsPackage.Literals.MODEL_TURBSIMTBS;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD, oldHead, newHead);
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
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD, newHead, newHead));
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
      sections = new EObjectContainmentEList<Section>(Section.class, this, TurbsimtbsPackage.MODEL_TURBSIMTBS__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRandSeed1 getRandSeed1()
  {
    return randSeed1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRandSeed1(nRandSeed1 newRandSeed1, NotificationChain msgs)
  {
    nRandSeed1 oldRandSeed1 = randSeed1;
    randSeed1 = newRandSeed1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1, oldRandSeed1, newRandSeed1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRandSeed1(nRandSeed1 newRandSeed1)
  {
    if (newRandSeed1 != randSeed1)
    {
      NotificationChain msgs = null;
      if (randSeed1 != null)
        msgs = ((InternalEObject)randSeed1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1, null, msgs);
      if (newRandSeed1 != null)
        msgs = ((InternalEObject)newRandSeed1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1, null, msgs);
      msgs = basicSetRandSeed1(newRandSeed1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1, newRandSeed1, newRandSeed1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRandSeed2 getRandSeed2()
  {
    return randSeed2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRandSeed2(nRandSeed2 newRandSeed2, NotificationChain msgs)
  {
    nRandSeed2 oldRandSeed2 = randSeed2;
    randSeed2 = newRandSeed2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2, oldRandSeed2, newRandSeed2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRandSeed2(nRandSeed2 newRandSeed2)
  {
    if (newRandSeed2 != randSeed2)
    {
      NotificationChain msgs = null;
      if (randSeed2 != null)
        msgs = ((InternalEObject)randSeed2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2, null, msgs);
      if (newRandSeed2 != null)
        msgs = ((InternalEObject)newRandSeed2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2, null, msgs);
      msgs = basicSetRandSeed2(newRandSeed2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2, newRandSeed2, newRandSeed2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrBHHTP getWrBHHTP()
  {
    return wrBHHTP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrBHHTP(bWrBHHTP newWrBHHTP, NotificationChain msgs)
  {
    bWrBHHTP oldWrBHHTP = wrBHHTP;
    wrBHHTP = newWrBHHTP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP, oldWrBHHTP, newWrBHHTP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrBHHTP(bWrBHHTP newWrBHHTP)
  {
    if (newWrBHHTP != wrBHHTP)
    {
      NotificationChain msgs = null;
      if (wrBHHTP != null)
        msgs = ((InternalEObject)wrBHHTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP, null, msgs);
      if (newWrBHHTP != null)
        msgs = ((InternalEObject)newWrBHHTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP, null, msgs);
      msgs = basicSetWrBHHTP(newWrBHHTP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP, newWrBHHTP, newWrBHHTP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrFHHTP getWrFHHTP()
  {
    return wrFHHTP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrFHHTP(bWrFHHTP newWrFHHTP, NotificationChain msgs)
  {
    bWrFHHTP oldWrFHHTP = wrFHHTP;
    wrFHHTP = newWrFHHTP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP, oldWrFHHTP, newWrFHHTP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrFHHTP(bWrFHHTP newWrFHHTP)
  {
    if (newWrFHHTP != wrFHHTP)
    {
      NotificationChain msgs = null;
      if (wrFHHTP != null)
        msgs = ((InternalEObject)wrFHHTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP, null, msgs);
      if (newWrFHHTP != null)
        msgs = ((InternalEObject)newWrFHHTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP, null, msgs);
      msgs = basicSetWrFHHTP(newWrFHHTP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP, newWrFHHTP, newWrFHHTP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrADHH getWrADHH()
  {
    return wrADHH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrADHH(bWrADHH newWrADHH, NotificationChain msgs)
  {
    bWrADHH oldWrADHH = wrADHH;
    wrADHH = newWrADHH;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH, oldWrADHH, newWrADHH);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrADHH(bWrADHH newWrADHH)
  {
    if (newWrADHH != wrADHH)
    {
      NotificationChain msgs = null;
      if (wrADHH != null)
        msgs = ((InternalEObject)wrADHH).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH, null, msgs);
      if (newWrADHH != null)
        msgs = ((InternalEObject)newWrADHH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH, null, msgs);
      msgs = basicSetWrADHH(newWrADHH, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH, newWrADHH, newWrADHH));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrADFF getWrADFF()
  {
    return wrADFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrADFF(bWrADFF newWrADFF, NotificationChain msgs)
  {
    bWrADFF oldWrADFF = wrADFF;
    wrADFF = newWrADFF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF, oldWrADFF, newWrADFF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrADFF(bWrADFF newWrADFF)
  {
    if (newWrADFF != wrADFF)
    {
      NotificationChain msgs = null;
      if (wrADFF != null)
        msgs = ((InternalEObject)wrADFF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF, null, msgs);
      if (newWrADFF != null)
        msgs = ((InternalEObject)newWrADFF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF, null, msgs);
      msgs = basicSetWrADFF(newWrADFF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF, newWrADFF, newWrADFF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrBLFF getWrBLFF()
  {
    return wrBLFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrBLFF(bWrBLFF newWrBLFF, NotificationChain msgs)
  {
    bWrBLFF oldWrBLFF = wrBLFF;
    wrBLFF = newWrBLFF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF, oldWrBLFF, newWrBLFF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrBLFF(bWrBLFF newWrBLFF)
  {
    if (newWrBLFF != wrBLFF)
    {
      NotificationChain msgs = null;
      if (wrBLFF != null)
        msgs = ((InternalEObject)wrBLFF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF, null, msgs);
      if (newWrBLFF != null)
        msgs = ((InternalEObject)newWrBLFF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF, null, msgs);
      msgs = basicSetWrBLFF(newWrBLFF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF, newWrBLFF, newWrBLFF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrADTWR getWrADTWR()
  {
    return wrADTWR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrADTWR(bWrADTWR newWrADTWR, NotificationChain msgs)
  {
    bWrADTWR oldWrADTWR = wrADTWR;
    wrADTWR = newWrADTWR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR, oldWrADTWR, newWrADTWR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrADTWR(bWrADTWR newWrADTWR)
  {
    if (newWrADTWR != wrADTWR)
    {
      NotificationChain msgs = null;
      if (wrADTWR != null)
        msgs = ((InternalEObject)wrADTWR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR, null, msgs);
      if (newWrADTWR != null)
        msgs = ((InternalEObject)newWrADTWR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR, null, msgs);
      msgs = basicSetWrADTWR(newWrADTWR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR, newWrADTWR, newWrADTWR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrFMTFF getWrFMTFF()
  {
    return wrFMTFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrFMTFF(bWrFMTFF newWrFMTFF, NotificationChain msgs)
  {
    bWrFMTFF oldWrFMTFF = wrFMTFF;
    wrFMTFF = newWrFMTFF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF, oldWrFMTFF, newWrFMTFF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrFMTFF(bWrFMTFF newWrFMTFF)
  {
    if (newWrFMTFF != wrFMTFF)
    {
      NotificationChain msgs = null;
      if (wrFMTFF != null)
        msgs = ((InternalEObject)wrFMTFF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF, null, msgs);
      if (newWrFMTFF != null)
        msgs = ((InternalEObject)newWrFMTFF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF, null, msgs);
      msgs = basicSetWrFMTFF(newWrFMTFF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF, newWrFMTFF, newWrFMTFF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bWrACT getWrACT()
  {
    return wrACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrACT(bWrACT newWrACT, NotificationChain msgs)
  {
    bWrACT oldWrACT = wrACT;
    wrACT = newWrACT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT, oldWrACT, newWrACT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrACT(bWrACT newWrACT)
  {
    if (newWrACT != wrACT)
    {
      NotificationChain msgs = null;
      if (wrACT != null)
        msgs = ((InternalEObject)wrACT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT, null, msgs);
      if (newWrACT != null)
        msgs = ((InternalEObject)newWrACT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT, null, msgs);
      msgs = basicSetWrACT(newWrACT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT, newWrACT, newWrACT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bClockwise getClockwise()
  {
    return clockwise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClockwise(bClockwise newClockwise, NotificationChain msgs)
  {
    bClockwise oldClockwise = clockwise;
    clockwise = newClockwise;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE, oldClockwise, newClockwise);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClockwise(bClockwise newClockwise)
  {
    if (newClockwise != clockwise)
    {
      NotificationChain msgs = null;
      if (clockwise != null)
        msgs = ((InternalEObject)clockwise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE, null, msgs);
      if (newClockwise != null)
        msgs = ((InternalEObject)newClockwise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE, null, msgs);
      msgs = basicSetClockwise(newClockwise, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE, newClockwise, newClockwise));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iScaleIEC getScaleIEC()
  {
    return scaleIEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScaleIEC(iScaleIEC newScaleIEC, NotificationChain msgs)
  {
    iScaleIEC oldScaleIEC = scaleIEC;
    scaleIEC = newScaleIEC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC, oldScaleIEC, newScaleIEC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScaleIEC(iScaleIEC newScaleIEC)
  {
    if (newScaleIEC != scaleIEC)
    {
      NotificationChain msgs = null;
      if (scaleIEC != null)
        msgs = ((InternalEObject)scaleIEC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC, null, msgs);
      if (newScaleIEC != null)
        msgs = ((InternalEObject)newScaleIEC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC, null, msgs);
      msgs = basicSetScaleIEC(newScaleIEC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC, newScaleIEC, newScaleIEC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNumGrid_Z getNumGrid_Z()
  {
    return numGrid_Z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumGrid_Z(iNumGrid_Z newNumGrid_Z, NotificationChain msgs)
  {
    iNumGrid_Z oldNumGrid_Z = numGrid_Z;
    numGrid_Z = newNumGrid_Z;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z, oldNumGrid_Z, newNumGrid_Z);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumGrid_Z(iNumGrid_Z newNumGrid_Z)
  {
    if (newNumGrid_Z != numGrid_Z)
    {
      NotificationChain msgs = null;
      if (numGrid_Z != null)
        msgs = ((InternalEObject)numGrid_Z).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z, null, msgs);
      if (newNumGrid_Z != null)
        msgs = ((InternalEObject)newNumGrid_Z).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z, null, msgs);
      msgs = basicSetNumGrid_Z(newNumGrid_Z, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z, newNumGrid_Z, newNumGrid_Z));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNumGrid_Y getNumGrid_Y()
  {
    return numGrid_Y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumGrid_Y(iNumGrid_Y newNumGrid_Y, NotificationChain msgs)
  {
    iNumGrid_Y oldNumGrid_Y = numGrid_Y;
    numGrid_Y = newNumGrid_Y;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y, oldNumGrid_Y, newNumGrid_Y);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumGrid_Y(iNumGrid_Y newNumGrid_Y)
  {
    if (newNumGrid_Y != numGrid_Y)
    {
      NotificationChain msgs = null;
      if (numGrid_Y != null)
        msgs = ((InternalEObject)numGrid_Y).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y, null, msgs);
      if (newNumGrid_Y != null)
        msgs = ((InternalEObject)newNumGrid_Y).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y, null, msgs);
      msgs = basicSetNumGrid_Y(newNumGrid_Y, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y, newNumGrid_Y, newNumGrid_Y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTimeStep getTimeStep()
  {
    return timeStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeStep(nTimeStep newTimeStep, NotificationChain msgs)
  {
    nTimeStep oldTimeStep = timeStep;
    timeStep = newTimeStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP, oldTimeStep, newTimeStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeStep(nTimeStep newTimeStep)
  {
    if (newTimeStep != timeStep)
    {
      NotificationChain msgs = null;
      if (timeStep != null)
        msgs = ((InternalEObject)timeStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP, null, msgs);
      if (newTimeStep != null)
        msgs = ((InternalEObject)newTimeStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP, null, msgs);
      msgs = basicSetTimeStep(newTimeStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP, newTimeStep, newTimeStep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAnalysisTime getAnalysisTime()
  {
    return analysisTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnalysisTime(nAnalysisTime newAnalysisTime, NotificationChain msgs)
  {
    nAnalysisTime oldAnalysisTime = analysisTime;
    analysisTime = newAnalysisTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME, oldAnalysisTime, newAnalysisTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnalysisTime(nAnalysisTime newAnalysisTime)
  {
    if (newAnalysisTime != analysisTime)
    {
      NotificationChain msgs = null;
      if (analysisTime != null)
        msgs = ((InternalEObject)analysisTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME, null, msgs);
      if (newAnalysisTime != null)
        msgs = ((InternalEObject)newAnalysisTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME, null, msgs);
      msgs = basicSetAnalysisTime(newAnalysisTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME, newAnalysisTime, newAnalysisTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nUsableTime getUsableTime()
  {
    return usableTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUsableTime(nUsableTime newUsableTime, NotificationChain msgs)
  {
    nUsableTime oldUsableTime = usableTime;
    usableTime = newUsableTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME, oldUsableTime, newUsableTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsableTime(nUsableTime newUsableTime)
  {
    if (newUsableTime != usableTime)
    {
      NotificationChain msgs = null;
      if (usableTime != null)
        msgs = ((InternalEObject)usableTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME, null, msgs);
      if (newUsableTime != null)
        msgs = ((InternalEObject)newUsableTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME, null, msgs);
      msgs = basicSetUsableTime(newUsableTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME, newUsableTime, newUsableTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubHt getHubHt()
  {
    return hubHt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHubHt(nHubHt newHubHt, NotificationChain msgs)
  {
    nHubHt oldHubHt = hubHt;
    hubHt = newHubHt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT, oldHubHt, newHubHt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHubHt(nHubHt newHubHt)
  {
    if (newHubHt != hubHt)
    {
      NotificationChain msgs = null;
      if (hubHt != null)
        msgs = ((InternalEObject)hubHt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT, null, msgs);
      if (newHubHt != null)
        msgs = ((InternalEObject)newHubHt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT, null, msgs);
      msgs = basicSetHubHt(newHubHt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT, newHubHt, newHubHt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGridHeight getGridHeight()
  {
    return gridHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGridHeight(nGridHeight newGridHeight, NotificationChain msgs)
  {
    nGridHeight oldGridHeight = gridHeight;
    gridHeight = newGridHeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT, oldGridHeight, newGridHeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGridHeight(nGridHeight newGridHeight)
  {
    if (newGridHeight != gridHeight)
    {
      NotificationChain msgs = null;
      if (gridHeight != null)
        msgs = ((InternalEObject)gridHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT, null, msgs);
      if (newGridHeight != null)
        msgs = ((InternalEObject)newGridHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT, null, msgs);
      msgs = basicSetGridHeight(newGridHeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT, newGridHeight, newGridHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nGridWidth getGridWidth()
  {
    return gridWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGridWidth(nGridWidth newGridWidth, NotificationChain msgs)
  {
    nGridWidth oldGridWidth = gridWidth;
    gridWidth = newGridWidth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH, oldGridWidth, newGridWidth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGridWidth(nGridWidth newGridWidth)
  {
    if (newGridWidth != gridWidth)
    {
      NotificationChain msgs = null;
      if (gridWidth != null)
        msgs = ((InternalEObject)gridWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH, null, msgs);
      if (newGridWidth != null)
        msgs = ((InternalEObject)newGridWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH, null, msgs);
      msgs = basicSetGridWidth(newGridWidth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH, newGridWidth, newGridWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nVFlowAng getVFlowAng()
  {
    return vFlowAng;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVFlowAng(nVFlowAng newVFlowAng, NotificationChain msgs)
  {
    nVFlowAng oldVFlowAng = vFlowAng;
    vFlowAng = newVFlowAng;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG, oldVFlowAng, newVFlowAng);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVFlowAng(nVFlowAng newVFlowAng)
  {
    if (newVFlowAng != vFlowAng)
    {
      NotificationChain msgs = null;
      if (vFlowAng != null)
        msgs = ((InternalEObject)vFlowAng).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG, null, msgs);
      if (newVFlowAng != null)
        msgs = ((InternalEObject)newVFlowAng).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG, null, msgs);
      msgs = basicSetVFlowAng(newVFlowAng, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG, newVFlowAng, newVFlowAng));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHFlowAng getHFlowAng()
  {
    return hFlowAng;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHFlowAng(nHFlowAng newHFlowAng, NotificationChain msgs)
  {
    nHFlowAng oldHFlowAng = hFlowAng;
    hFlowAng = newHFlowAng;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG, oldHFlowAng, newHFlowAng);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHFlowAng(nHFlowAng newHFlowAng)
  {
    if (newHFlowAng != hFlowAng)
    {
      NotificationChain msgs = null;
      if (hFlowAng != null)
        msgs = ((InternalEObject)hFlowAng).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG, null, msgs);
      if (newHFlowAng != null)
        msgs = ((InternalEObject)newHFlowAng).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG, null, msgs);
      msgs = basicSetHFlowAng(newHFlowAng, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG, newHFlowAng, newHFlowAng));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sTurbModel getTurbModel()
  {
    return turbModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTurbModel(sTurbModel newTurbModel, NotificationChain msgs)
  {
    sTurbModel oldTurbModel = turbModel;
    turbModel = newTurbModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL, oldTurbModel, newTurbModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurbModel(sTurbModel newTurbModel)
  {
    if (newTurbModel != turbModel)
    {
      NotificationChain msgs = null;
      if (turbModel != null)
        msgs = ((InternalEObject)turbModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL, null, msgs);
      if (newTurbModel != null)
        msgs = ((InternalEObject)newTurbModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL, null, msgs);
      msgs = basicSetTurbModel(newTurbModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL, newTurbModel, newTurbModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sIECstandard getIECstandard()
  {
    return ieCstandard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIECstandard(sIECstandard newIECstandard, NotificationChain msgs)
  {
    sIECstandard oldIECstandard = ieCstandard;
    ieCstandard = newIECstandard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD, oldIECstandard, newIECstandard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIECstandard(sIECstandard newIECstandard)
  {
    if (newIECstandard != ieCstandard)
    {
      NotificationChain msgs = null;
      if (ieCstandard != null)
        msgs = ((InternalEObject)ieCstandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD, null, msgs);
      if (newIECstandard != null)
        msgs = ((InternalEObject)newIECstandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD, null, msgs);
      msgs = basicSetIECstandard(newIECstandard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD, newIECstandard, newIECstandard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sIECturbc getIECturbc()
  {
    return ieCturbc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIECturbc(sIECturbc newIECturbc, NotificationChain msgs)
  {
    sIECturbc oldIECturbc = ieCturbc;
    ieCturbc = newIECturbc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC, oldIECturbc, newIECturbc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIECturbc(sIECturbc newIECturbc)
  {
    if (newIECturbc != ieCturbc)
    {
      NotificationChain msgs = null;
      if (ieCturbc != null)
        msgs = ((InternalEObject)ieCturbc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC, null, msgs);
      if (newIECturbc != null)
        msgs = ((InternalEObject)newIECturbc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC, null, msgs);
      msgs = basicSetIECturbc(newIECturbc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC, newIECturbc, newIECturbc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sIEC_WindType getIEC_WindType()
  {
    return ieC_WindType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIEC_WindType(sIEC_WindType newIEC_WindType, NotificationChain msgs)
  {
    sIEC_WindType oldIEC_WindType = ieC_WindType;
    ieC_WindType = newIEC_WindType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE, oldIEC_WindType, newIEC_WindType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIEC_WindType(sIEC_WindType newIEC_WindType)
  {
    if (newIEC_WindType != ieC_WindType)
    {
      NotificationChain msgs = null;
      if (ieC_WindType != null)
        msgs = ((InternalEObject)ieC_WindType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE, null, msgs);
      if (newIEC_WindType != null)
        msgs = ((InternalEObject)newIEC_WindType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE, null, msgs);
      msgs = basicSetIEC_WindType(newIEC_WindType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE, newIEC_WindType, newIEC_WindType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sETMc getETMc()
  {
    return etMc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetETMc(sETMc newETMc, NotificationChain msgs)
  {
    sETMc oldETMc = etMc;
    etMc = newETMc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC, oldETMc, newETMc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setETMc(sETMc newETMc)
  {
    if (newETMc != etMc)
    {
      NotificationChain msgs = null;
      if (etMc != null)
        msgs = ((InternalEObject)etMc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC, null, msgs);
      if (newETMc != null)
        msgs = ((InternalEObject)newETMc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC, null, msgs);
      msgs = basicSetETMc(newETMc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC, newETMc, newETMc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sWindProfileType getWindProfileType()
  {
    return windProfileType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWindProfileType(sWindProfileType newWindProfileType, NotificationChain msgs)
  {
    sWindProfileType oldWindProfileType = windProfileType;
    windProfileType = newWindProfileType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE, oldWindProfileType, newWindProfileType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindProfileType(sWindProfileType newWindProfileType)
  {
    if (newWindProfileType != windProfileType)
    {
      NotificationChain msgs = null;
      if (windProfileType != null)
        msgs = ((InternalEObject)windProfileType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE, null, msgs);
      if (newWindProfileType != null)
        msgs = ((InternalEObject)newWindProfileType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE, null, msgs);
      msgs = basicSetWindProfileType(newWindProfileType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE, newWindProfileType, newWindProfileType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRefHt getRefHt()
  {
    return refHt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefHt(nRefHt newRefHt, NotificationChain msgs)
  {
    nRefHt oldRefHt = refHt;
    refHt = newRefHt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT, oldRefHt, newRefHt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefHt(nRefHt newRefHt)
  {
    if (newRefHt != refHt)
    {
      NotificationChain msgs = null;
      if (refHt != null)
        msgs = ((InternalEObject)refHt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT, null, msgs);
      if (newRefHt != null)
        msgs = ((InternalEObject)newRefHt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT, null, msgs);
      msgs = basicSetRefHt(newRefHt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT, newRefHt, newRefHt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nUref getUref()
  {
    return uref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUref(nUref newUref, NotificationChain msgs)
  {
    nUref oldUref = uref;
    uref = newUref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF, oldUref, newUref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUref(nUref newUref)
  {
    if (newUref != uref)
    {
      NotificationChain msgs = null;
      if (uref != null)
        msgs = ((InternalEObject)uref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF, null, msgs);
      if (newUref != null)
        msgs = ((InternalEObject)newUref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF, null, msgs);
      msgs = basicSetUref(newUref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF, newUref, newUref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nZJetMax getZJetMax()
  {
    return zJetMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZJetMax(nZJetMax newZJetMax, NotificationChain msgs)
  {
    nZJetMax oldZJetMax = zJetMax;
    zJetMax = newZJetMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX, oldZJetMax, newZJetMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZJetMax(nZJetMax newZJetMax)
  {
    if (newZJetMax != zJetMax)
    {
      NotificationChain msgs = null;
      if (zJetMax != null)
        msgs = ((InternalEObject)zJetMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX, null, msgs);
      if (newZJetMax != null)
        msgs = ((InternalEObject)newZJetMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX, null, msgs);
      msgs = basicSetZJetMax(newZJetMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX, newZJetMax, newZJetMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPLExp getPLExp()
  {
    return plExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPLExp(nPLExp newPLExp, NotificationChain msgs)
  {
    nPLExp oldPLExp = plExp;
    plExp = newPLExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP, oldPLExp, newPLExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPLExp(nPLExp newPLExp)
  {
    if (newPLExp != plExp)
    {
      NotificationChain msgs = null;
      if (plExp != null)
        msgs = ((InternalEObject)plExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP, null, msgs);
      if (newPLExp != null)
        msgs = ((InternalEObject)newPLExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP, null, msgs);
      msgs = basicSetPLExp(newPLExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP, newPLExp, newPLExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nZ0 getZ0()
  {
    return z0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZ0(nZ0 newZ0, NotificationChain msgs)
  {
    nZ0 oldZ0 = z0;
    z0 = newZ0;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0, oldZ0, newZ0);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ0(nZ0 newZ0)
  {
    if (newZ0 != z0)
    {
      NotificationChain msgs = null;
      if (z0 != null)
        msgs = ((InternalEObject)z0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0, null, msgs);
      if (newZ0 != null)
        msgs = ((InternalEObject)newZ0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0, null, msgs);
      msgs = basicSetZ0(newZ0, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0, newZ0, newZ0));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nLocation getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(nLocation newLocation, NotificationChain msgs)
  {
    nLocation oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION, oldLocation, newLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(nLocation newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION, newLocation, newLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRICH_NO getRICH_NO()
  {
    return ricH_NO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRICH_NO(nRICH_NO newRICH_NO, NotificationChain msgs)
  {
    nRICH_NO oldRICH_NO = ricH_NO;
    ricH_NO = newRICH_NO;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO, oldRICH_NO, newRICH_NO);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRICH_NO(nRICH_NO newRICH_NO)
  {
    if (newRICH_NO != ricH_NO)
    {
      NotificationChain msgs = null;
      if (ricH_NO != null)
        msgs = ((InternalEObject)ricH_NO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO, null, msgs);
      if (newRICH_NO != null)
        msgs = ((InternalEObject)newRICH_NO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO, null, msgs);
      msgs = basicSetRICH_NO(newRICH_NO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO, newRICH_NO, newRICH_NO));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nUStar getUStar()
  {
    return uStar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUStar(nUStar newUStar, NotificationChain msgs)
  {
    nUStar oldUStar = uStar;
    uStar = newUStar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR, oldUStar, newUStar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUStar(nUStar newUStar)
  {
    if (newUStar != uStar)
    {
      NotificationChain msgs = null;
      if (uStar != null)
        msgs = ((InternalEObject)uStar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR, null, msgs);
      if (newUStar != null)
        msgs = ((InternalEObject)newUStar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR, null, msgs);
      msgs = basicSetUStar(newUStar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR, newUStar, newUStar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nZI getZI()
  {
    return zi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZI(nZI newZI, NotificationChain msgs)
  {
    nZI oldZI = zi;
    zi = newZI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI, oldZI, newZI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZI(nZI newZI)
  {
    if (newZI != zi)
    {
      NotificationChain msgs = null;
      if (zi != null)
        msgs = ((InternalEObject)zi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI, null, msgs);
      if (newZI != null)
        msgs = ((InternalEObject)newZI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI, null, msgs);
      msgs = basicSetZI(newZI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI, newZI, newZI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPC_UW getPC_UW()
  {
    return pC_UW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPC_UW(nPC_UW newPC_UW, NotificationChain msgs)
  {
    nPC_UW oldPC_UW = pC_UW;
    pC_UW = newPC_UW;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW, oldPC_UW, newPC_UW);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPC_UW(nPC_UW newPC_UW)
  {
    if (newPC_UW != pC_UW)
    {
      NotificationChain msgs = null;
      if (pC_UW != null)
        msgs = ((InternalEObject)pC_UW).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW, null, msgs);
      if (newPC_UW != null)
        msgs = ((InternalEObject)newPC_UW).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW, null, msgs);
      msgs = basicSetPC_UW(newPC_UW, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW, newPC_UW, newPC_UW));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPC_UV getPC_UV()
  {
    return pC_UV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPC_UV(nPC_UV newPC_UV, NotificationChain msgs)
  {
    nPC_UV oldPC_UV = pC_UV;
    pC_UV = newPC_UV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV, oldPC_UV, newPC_UV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPC_UV(nPC_UV newPC_UV)
  {
    if (newPC_UV != pC_UV)
    {
      NotificationChain msgs = null;
      if (pC_UV != null)
        msgs = ((InternalEObject)pC_UV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV, null, msgs);
      if (newPC_UV != null)
        msgs = ((InternalEObject)newPC_UV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV, null, msgs);
      msgs = basicSetPC_UV(newPC_UV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV, newPC_UV, newPC_UV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPC_VW getPC_VW()
  {
    return pC_VW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPC_VW(nPC_VW newPC_VW, NotificationChain msgs)
  {
    nPC_VW oldPC_VW = pC_VW;
    pC_VW = newPC_VW;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW, oldPC_VW, newPC_VW);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPC_VW(nPC_VW newPC_VW)
  {
    if (newPC_VW != pC_VW)
    {
      NotificationChain msgs = null;
      if (pC_VW != null)
        msgs = ((InternalEObject)pC_VW).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW, null, msgs);
      if (newPC_VW != null)
        msgs = ((InternalEObject)newPC_VW).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW, null, msgs);
      msgs = basicSetPC_VW(newPC_VW, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW, newPC_VW, newPC_VW));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIncDec1 getIncDec1()
  {
    return incDec1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncDec1(nIncDec1 newIncDec1, NotificationChain msgs)
  {
    nIncDec1 oldIncDec1 = incDec1;
    incDec1 = newIncDec1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1, oldIncDec1, newIncDec1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncDec1(nIncDec1 newIncDec1)
  {
    if (newIncDec1 != incDec1)
    {
      NotificationChain msgs = null;
      if (incDec1 != null)
        msgs = ((InternalEObject)incDec1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1, null, msgs);
      if (newIncDec1 != null)
        msgs = ((InternalEObject)newIncDec1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1, null, msgs);
      msgs = basicSetIncDec1(newIncDec1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1, newIncDec1, newIncDec1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIncDec2 getIncDec2()
  {
    return incDec2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncDec2(nIncDec2 newIncDec2, NotificationChain msgs)
  {
    nIncDec2 oldIncDec2 = incDec2;
    incDec2 = newIncDec2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2, oldIncDec2, newIncDec2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncDec2(nIncDec2 newIncDec2)
  {
    if (newIncDec2 != incDec2)
    {
      NotificationChain msgs = null;
      if (incDec2 != null)
        msgs = ((InternalEObject)incDec2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2, null, msgs);
      if (newIncDec2 != null)
        msgs = ((InternalEObject)newIncDec2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2, null, msgs);
      msgs = basicSetIncDec2(newIncDec2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2, newIncDec2, newIncDec2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIncDec3 getIncDec3()
  {
    return incDec3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncDec3(nIncDec3 newIncDec3, NotificationChain msgs)
  {
    nIncDec3 oldIncDec3 = incDec3;
    incDec3 = newIncDec3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3, oldIncDec3, newIncDec3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncDec3(nIncDec3 newIncDec3)
  {
    if (newIncDec3 != incDec3)
    {
      NotificationChain msgs = null;
      if (incDec3 != null)
        msgs = ((InternalEObject)incDec3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3, null, msgs);
      if (newIncDec3 != null)
        msgs = ((InternalEObject)newIncDec3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3, null, msgs);
      msgs = basicSetIncDec3(newIncDec3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3, newIncDec3, newIncDec3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCohExp getCohExp()
  {
    return cohExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCohExp(nCohExp newCohExp, NotificationChain msgs)
  {
    nCohExp oldCohExp = cohExp;
    cohExp = newCohExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP, oldCohExp, newCohExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCohExp(nCohExp newCohExp)
  {
    if (newCohExp != cohExp)
    {
      NotificationChain msgs = null;
      if (cohExp != null)
        msgs = ((InternalEObject)cohExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP, null, msgs);
      if (newCohExp != null)
        msgs = ((InternalEObject)newCohExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP, null, msgs);
      msgs = basicSetCohExp(newCohExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP, newCohExp, newCohExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sCTEventPath getCTEventPath()
  {
    return ctEventPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCTEventPath(sCTEventPath newCTEventPath, NotificationChain msgs)
  {
    sCTEventPath oldCTEventPath = ctEventPath;
    ctEventPath = newCTEventPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH, oldCTEventPath, newCTEventPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCTEventPath(sCTEventPath newCTEventPath)
  {
    if (newCTEventPath != ctEventPath)
    {
      NotificationChain msgs = null;
      if (ctEventPath != null)
        msgs = ((InternalEObject)ctEventPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH, null, msgs);
      if (newCTEventPath != null)
        msgs = ((InternalEObject)newCTEventPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH, null, msgs);
      msgs = basicSetCTEventPath(newCTEventPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH, newCTEventPath, newCTEventPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sCTEventFile getCTEventFile()
  {
    return ctEventFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCTEventFile(sCTEventFile newCTEventFile, NotificationChain msgs)
  {
    sCTEventFile oldCTEventFile = ctEventFile;
    ctEventFile = newCTEventFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE, oldCTEventFile, newCTEventFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCTEventFile(sCTEventFile newCTEventFile)
  {
    if (newCTEventFile != ctEventFile)
    {
      NotificationChain msgs = null;
      if (ctEventFile != null)
        msgs = ((InternalEObject)ctEventFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE, null, msgs);
      if (newCTEventFile != null)
        msgs = ((InternalEObject)newCTEventFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE, null, msgs);
      msgs = basicSetCTEventFile(newCTEventFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE, newCTEventFile, newCTEventFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bRandomize getRandomize()
  {
    return randomize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRandomize(bRandomize newRandomize, NotificationChain msgs)
  {
    bRandomize oldRandomize = randomize;
    randomize = newRandomize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE, oldRandomize, newRandomize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRandomize(bRandomize newRandomize)
  {
    if (newRandomize != randomize)
    {
      NotificationChain msgs = null;
      if (randomize != null)
        msgs = ((InternalEObject)randomize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE, null, msgs);
      if (newRandomize != null)
        msgs = ((InternalEObject)newRandomize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE, null, msgs);
      msgs = basicSetRandomize(newRandomize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE, newRandomize, newRandomize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nDistScl getDistScl()
  {
    return distScl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDistScl(nDistScl newDistScl, NotificationChain msgs)
  {
    nDistScl oldDistScl = distScl;
    distScl = newDistScl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL, oldDistScl, newDistScl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistScl(nDistScl newDistScl)
  {
    if (newDistScl != distScl)
    {
      NotificationChain msgs = null;
      if (distScl != null)
        msgs = ((InternalEObject)distScl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL, null, msgs);
      if (newDistScl != null)
        msgs = ((InternalEObject)newDistScl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL, null, msgs);
      msgs = basicSetDistScl(newDistScl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL, newDistScl, newDistScl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCTLy getCTLy()
  {
    return ctLy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCTLy(nCTLy newCTLy, NotificationChain msgs)
  {
    nCTLy oldCTLy = ctLy;
    ctLy = newCTLy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY, oldCTLy, newCTLy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCTLy(nCTLy newCTLy)
  {
    if (newCTLy != ctLy)
    {
      NotificationChain msgs = null;
      if (ctLy != null)
        msgs = ((InternalEObject)ctLy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY, null, msgs);
      if (newCTLy != null)
        msgs = ((InternalEObject)newCTLy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY, null, msgs);
      msgs = basicSetCTLy(newCTLy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY, newCTLy, newCTLy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCTLz getCTLz()
  {
    return ctLz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCTLz(nCTLz newCTLz, NotificationChain msgs)
  {
    nCTLz oldCTLz = ctLz;
    ctLz = newCTLz;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ, oldCTLz, newCTLz);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCTLz(nCTLz newCTLz)
  {
    if (newCTLz != ctLz)
    {
      NotificationChain msgs = null;
      if (ctLz != null)
        msgs = ((InternalEObject)ctLz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ, null, msgs);
      if (newCTLz != null)
        msgs = ((InternalEObject)newCTLz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ, null, msgs);
      msgs = basicSetCTLz(newCTLz, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ, newCTLz, newCTLz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCTStartTime getCTStartTime()
  {
    return ctStartTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCTStartTime(nCTStartTime newCTStartTime, NotificationChain msgs)
  {
    nCTStartTime oldCTStartTime = ctStartTime;
    ctStartTime = newCTStartTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME, oldCTStartTime, newCTStartTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCTStartTime(nCTStartTime newCTStartTime)
  {
    if (newCTStartTime != ctStartTime)
    {
      NotificationChain msgs = null;
      if (ctStartTime != null)
        msgs = ((InternalEObject)ctStartTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME, null, msgs);
      if (newCTStartTime != null)
        msgs = ((InternalEObject)newCTStartTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME, null, msgs);
      msgs = basicSetCTStartTime(newCTStartTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME, newCTStartTime, newCTStartTime));
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
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD:
        return basicSetHead(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1:
        return basicSetRandSeed1(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2:
        return basicSetRandSeed2(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP:
        return basicSetWrBHHTP(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP:
        return basicSetWrFHHTP(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH:
        return basicSetWrADHH(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF:
        return basicSetWrADFF(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF:
        return basicSetWrBLFF(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR:
        return basicSetWrADTWR(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF:
        return basicSetWrFMTFF(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT:
        return basicSetWrACT(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE:
        return basicSetClockwise(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC:
        return basicSetScaleIEC(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z:
        return basicSetNumGrid_Z(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y:
        return basicSetNumGrid_Y(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP:
        return basicSetTimeStep(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME:
        return basicSetAnalysisTime(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME:
        return basicSetUsableTime(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT:
        return basicSetHubHt(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT:
        return basicSetGridHeight(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH:
        return basicSetGridWidth(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG:
        return basicSetVFlowAng(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG:
        return basicSetHFlowAng(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL:
        return basicSetTurbModel(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD:
        return basicSetIECstandard(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC:
        return basicSetIECturbc(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE:
        return basicSetIEC_WindType(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC:
        return basicSetETMc(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE:
        return basicSetWindProfileType(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT:
        return basicSetRefHt(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF:
        return basicSetUref(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX:
        return basicSetZJetMax(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP:
        return basicSetPLExp(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0:
        return basicSetZ0(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION:
        return basicSetLocation(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO:
        return basicSetRICH_NO(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR:
        return basicSetUStar(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI:
        return basicSetZI(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW:
        return basicSetPC_UW(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV:
        return basicSetPC_UV(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW:
        return basicSetPC_VW(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1:
        return basicSetIncDec1(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2:
        return basicSetIncDec2(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3:
        return basicSetIncDec3(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP:
        return basicSetCohExp(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH:
        return basicSetCTEventPath(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE:
        return basicSetCTEventFile(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE:
        return basicSetRandomize(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL:
        return basicSetDistScl(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY:
        return basicSetCTLy(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ:
        return basicSetCTLz(null, msgs);
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME:
        return basicSetCTStartTime(null, msgs);
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
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD:
        return getHead();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SECTIONS:
        return getSections();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1:
        return getRandSeed1();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2:
        return getRandSeed2();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP:
        return getWrBHHTP();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP:
        return getWrFHHTP();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH:
        return getWrADHH();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF:
        return getWrADFF();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF:
        return getWrBLFF();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR:
        return getWrADTWR();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF:
        return getWrFMTFF();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT:
        return getWrACT();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE:
        return getClockwise();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC:
        return getScaleIEC();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z:
        return getNumGrid_Z();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y:
        return getNumGrid_Y();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP:
        return getTimeStep();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME:
        return getAnalysisTime();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME:
        return getUsableTime();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT:
        return getHubHt();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT:
        return getGridHeight();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH:
        return getGridWidth();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG:
        return getVFlowAng();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG:
        return getHFlowAng();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL:
        return getTurbModel();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD:
        return getIECstandard();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC:
        return getIECturbc();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE:
        return getIEC_WindType();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC:
        return getETMc();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE:
        return getWindProfileType();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT:
        return getRefHt();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF:
        return getUref();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX:
        return getZJetMax();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP:
        return getPLExp();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0:
        return getZ0();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION:
        return getLocation();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO:
        return getRICH_NO();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR:
        return getUStar();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI:
        return getZI();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW:
        return getPC_UW();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV:
        return getPC_UV();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW:
        return getPC_VW();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1:
        return getIncDec1();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2:
        return getIncDec2();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3:
        return getIncDec3();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP:
        return getCohExp();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH:
        return getCTEventPath();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE:
        return getCTEventFile();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE:
        return getRandomize();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL:
        return getDistScl();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY:
        return getCTLy();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ:
        return getCTLz();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME:
        return getCTStartTime();
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
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD:
        setHead((Header)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1:
        setRandSeed1((nRandSeed1)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2:
        setRandSeed2((nRandSeed2)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP:
        setWrBHHTP((bWrBHHTP)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP:
        setWrFHHTP((bWrFHHTP)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH:
        setWrADHH((bWrADHH)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF:
        setWrADFF((bWrADFF)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF:
        setWrBLFF((bWrBLFF)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR:
        setWrADTWR((bWrADTWR)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF:
        setWrFMTFF((bWrFMTFF)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT:
        setWrACT((bWrACT)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE:
        setClockwise((bClockwise)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC:
        setScaleIEC((iScaleIEC)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z:
        setNumGrid_Z((iNumGrid_Z)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y:
        setNumGrid_Y((iNumGrid_Y)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP:
        setTimeStep((nTimeStep)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME:
        setAnalysisTime((nAnalysisTime)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME:
        setUsableTime((nUsableTime)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT:
        setHubHt((nHubHt)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT:
        setGridHeight((nGridHeight)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH:
        setGridWidth((nGridWidth)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG:
        setVFlowAng((nVFlowAng)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG:
        setHFlowAng((nHFlowAng)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL:
        setTurbModel((sTurbModel)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD:
        setIECstandard((sIECstandard)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC:
        setIECturbc((sIECturbc)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE:
        setIEC_WindType((sIEC_WindType)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC:
        setETMc((sETMc)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE:
        setWindProfileType((sWindProfileType)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT:
        setRefHt((nRefHt)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF:
        setUref((nUref)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX:
        setZJetMax((nZJetMax)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP:
        setPLExp((nPLExp)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0:
        setZ0((nZ0)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION:
        setLocation((nLocation)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO:
        setRICH_NO((nRICH_NO)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR:
        setUStar((nUStar)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI:
        setZI((nZI)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW:
        setPC_UW((nPC_UW)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV:
        setPC_UV((nPC_UV)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW:
        setPC_VW((nPC_VW)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1:
        setIncDec1((nIncDec1)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2:
        setIncDec2((nIncDec2)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3:
        setIncDec3((nIncDec3)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP:
        setCohExp((nCohExp)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH:
        setCTEventPath((sCTEventPath)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE:
        setCTEventFile((sCTEventFile)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE:
        setRandomize((bRandomize)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL:
        setDistScl((nDistScl)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY:
        setCTLy((nCTLy)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ:
        setCTLz((nCTLz)newValue);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME:
        setCTStartTime((nCTStartTime)newValue);
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
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD:
        setHead((Header)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SECTIONS:
        getSections().clear();
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1:
        setRandSeed1((nRandSeed1)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2:
        setRandSeed2((nRandSeed2)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP:
        setWrBHHTP((bWrBHHTP)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP:
        setWrFHHTP((bWrFHHTP)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH:
        setWrADHH((bWrADHH)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF:
        setWrADFF((bWrADFF)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF:
        setWrBLFF((bWrBLFF)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR:
        setWrADTWR((bWrADTWR)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF:
        setWrFMTFF((bWrFMTFF)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT:
        setWrACT((bWrACT)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE:
        setClockwise((bClockwise)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC:
        setScaleIEC((iScaleIEC)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z:
        setNumGrid_Z((iNumGrid_Z)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y:
        setNumGrid_Y((iNumGrid_Y)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP:
        setTimeStep((nTimeStep)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME:
        setAnalysisTime((nAnalysisTime)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME:
        setUsableTime((nUsableTime)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT:
        setHubHt((nHubHt)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT:
        setGridHeight((nGridHeight)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH:
        setGridWidth((nGridWidth)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG:
        setVFlowAng((nVFlowAng)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG:
        setHFlowAng((nHFlowAng)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL:
        setTurbModel((sTurbModel)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD:
        setIECstandard((sIECstandard)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC:
        setIECturbc((sIECturbc)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE:
        setIEC_WindType((sIEC_WindType)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC:
        setETMc((sETMc)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE:
        setWindProfileType((sWindProfileType)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT:
        setRefHt((nRefHt)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF:
        setUref((nUref)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX:
        setZJetMax((nZJetMax)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP:
        setPLExp((nPLExp)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0:
        setZ0((nZ0)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION:
        setLocation((nLocation)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO:
        setRICH_NO((nRICH_NO)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR:
        setUStar((nUStar)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI:
        setZI((nZI)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW:
        setPC_UW((nPC_UW)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV:
        setPC_UV((nPC_UV)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW:
        setPC_VW((nPC_VW)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1:
        setIncDec1((nIncDec1)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2:
        setIncDec2((nIncDec2)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3:
        setIncDec3((nIncDec3)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP:
        setCohExp((nCohExp)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH:
        setCTEventPath((sCTEventPath)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE:
        setCTEventFile((sCTEventFile)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE:
        setRandomize((bRandomize)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL:
        setDistScl((nDistScl)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY:
        setCTLy((nCTLy)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ:
        setCTLz((nCTLz)null);
        return;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME:
        setCTStartTime((nCTStartTime)null);
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
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HEAD:
        return head != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SECTIONS:
        return sections != null && !sections.isEmpty();
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED1:
        return randSeed1 != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RAND_SEED2:
        return randSeed2 != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BHHTP:
        return wrBHHTP != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FHHTP:
        return wrFHHTP != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADHH:
        return wrADHH != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADFF:
        return wrADFF != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_BLFF:
        return wrBLFF != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ADTWR:
        return wrADTWR != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_FMTFF:
        return wrFMTFF != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WR_ACT:
        return wrACT != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CLOCKWISE:
        return clockwise != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__SCALE_IEC:
        return scaleIEC != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Z:
        return numGrid_Z != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__NUM_GRID_Y:
        return numGrid_Y != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TIME_STEP:
        return timeStep != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ANALYSIS_TIME:
        return analysisTime != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USABLE_TIME:
        return usableTime != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HUB_HT:
        return hubHt != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_HEIGHT:
        return gridHeight != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__GRID_WIDTH:
        return gridWidth != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__VFLOW_ANG:
        return vFlowAng != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__HFLOW_ANG:
        return hFlowAng != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__TURB_MODEL:
        return turbModel != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CSTANDARD:
        return ieCstandard != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IE_CTURBC:
        return ieCturbc != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__IEC_WIND_TYPE:
        return ieC_WindType != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ET_MC:
        return etMc != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__WIND_PROFILE_TYPE:
        return windProfileType != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__REF_HT:
        return refHt != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__UREF:
        return uref != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZJET_MAX:
        return zJetMax != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PL_EXP:
        return plExp != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__Z0:
        return z0 != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__LOCATION:
        return location != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RICH_NO:
        return ricH_NO != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__USTAR:
        return uStar != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__ZI:
        return zi != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UW:
        return pC_UW != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_UV:
        return pC_UV != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__PC_VW:
        return pC_VW != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC1:
        return incDec1 != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC2:
        return incDec2 != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__INC_DEC3:
        return incDec3 != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__COH_EXP:
        return cohExp != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_PATH:
        return ctEventPath != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_EVENT_FILE:
        return ctEventFile != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__RANDOMIZE:
        return randomize != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__DIST_SCL:
        return distScl != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LY:
        return ctLy != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_LZ:
        return ctLz != null;
      case TurbsimtbsPackage.MODEL_TURBSIMTBS__CT_START_TIME:
        return ctStartTime != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelTurbsimtbsImpl
