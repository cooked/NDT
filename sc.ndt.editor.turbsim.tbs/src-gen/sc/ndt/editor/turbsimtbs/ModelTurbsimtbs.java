/**
 */
package sc.ndt.editor.turbsimtbs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Turbsimtbs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandSeed1 <em>Rand Seed1</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandSeed2 <em>Rand Seed2</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrBHHTP <em>Wr BHHTP</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrFHHTP <em>Wr FHHTP</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADHH <em>Wr ADHH</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADFF <em>Wr ADFF</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrBLFF <em>Wr BLFF</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADTWR <em>Wr ADTWR</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrFMTFF <em>Wr FMTFF</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrACT <em>Wr ACT</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getClockwise <em>Clockwise</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getScaleIEC <em>Scale IEC</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getNumGrid_Z <em>Num Grid Z</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getNumGrid_Y <em>Num Grid Y</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getAnalysisTime <em>Analysis Time</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUsableTime <em>Usable Time</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHubHt <em>Hub Ht</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getGridHeight <em>Grid Height</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getVFlowAng <em>VFlow Ang</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHFlowAng <em>HFlow Ang</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getTurbModel <em>Turb Model</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIECstandard <em>IE Cstandard</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIECturbc <em>IE Cturbc</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIEC_WindType <em>IEC Wind Type</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getETMc <em>ET Mc</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWindProfileType <em>Wind Profile Type</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRefHt <em>Ref Ht</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUref <em>Uref</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZJetMax <em>ZJet Max</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPLExp <em>PL Exp</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZ0 <em>Z0</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getLocation <em>Location</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRICH_NO <em>RICH NO</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUStar <em>UStar</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZI <em>ZI</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_UW <em>PC UW</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_UV <em>PC UV</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_VW <em>PC VW</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec1 <em>Inc Dec1</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec2 <em>Inc Dec2</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec3 <em>Inc Dec3</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCohExp <em>Coh Exp</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTEventPath <em>CT Event Path</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTEventFile <em>CT Event File</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandomize <em>Randomize</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getDistScl <em>Dist Scl</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTLy <em>CT Ly</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTLz <em>CT Lz</em>}</li>
 *   <li>{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTStartTime <em>CT Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs()
 * @model
 * @generated
 */
public interface ModelTurbsimtbs extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(Header)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_Head()
   * @model containment="true"
   * @generated
   */
  Header getHead();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Header value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link sc.ndt.editor.turbsimtbs.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

  /**
   * Returns the value of the '<em><b>Rand Seed1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rand Seed1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rand Seed1</em>' containment reference.
   * @see #setRandSeed1(nRandSeed1)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_RandSeed1()
   * @model containment="true"
   * @generated
   */
  nRandSeed1 getRandSeed1();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandSeed1 <em>Rand Seed1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rand Seed1</em>' containment reference.
   * @see #getRandSeed1()
   * @generated
   */
  void setRandSeed1(nRandSeed1 value);

  /**
   * Returns the value of the '<em><b>Rand Seed2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rand Seed2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rand Seed2</em>' containment reference.
   * @see #setRandSeed2(nRandSeed2)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_RandSeed2()
   * @model containment="true"
   * @generated
   */
  nRandSeed2 getRandSeed2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandSeed2 <em>Rand Seed2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rand Seed2</em>' containment reference.
   * @see #getRandSeed2()
   * @generated
   */
  void setRandSeed2(nRandSeed2 value);

  /**
   * Returns the value of the '<em><b>Wr BHHTP</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wr BHHTP</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wr BHHTP</em>' containment reference.
   * @see #setWrBHHTP(bWrBHHTP)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WrBHHTP()
   * @model containment="true"
   * @generated
   */
  bWrBHHTP getWrBHHTP();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrBHHTP <em>Wr BHHTP</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wr BHHTP</em>' containment reference.
   * @see #getWrBHHTP()
   * @generated
   */
  void setWrBHHTP(bWrBHHTP value);

  /**
   * Returns the value of the '<em><b>Wr FHHTP</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wr FHHTP</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wr FHHTP</em>' containment reference.
   * @see #setWrFHHTP(bWrFHHTP)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WrFHHTP()
   * @model containment="true"
   * @generated
   */
  bWrFHHTP getWrFHHTP();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrFHHTP <em>Wr FHHTP</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wr FHHTP</em>' containment reference.
   * @see #getWrFHHTP()
   * @generated
   */
  void setWrFHHTP(bWrFHHTP value);

  /**
   * Returns the value of the '<em><b>Wr ADHH</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wr ADHH</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wr ADHH</em>' containment reference.
   * @see #setWrADHH(bWrADHH)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WrADHH()
   * @model containment="true"
   * @generated
   */
  bWrADHH getWrADHH();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADHH <em>Wr ADHH</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wr ADHH</em>' containment reference.
   * @see #getWrADHH()
   * @generated
   */
  void setWrADHH(bWrADHH value);

  /**
   * Returns the value of the '<em><b>Wr ADFF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wr ADFF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wr ADFF</em>' containment reference.
   * @see #setWrADFF(bWrADFF)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WrADFF()
   * @model containment="true"
   * @generated
   */
  bWrADFF getWrADFF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADFF <em>Wr ADFF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wr ADFF</em>' containment reference.
   * @see #getWrADFF()
   * @generated
   */
  void setWrADFF(bWrADFF value);

  /**
   * Returns the value of the '<em><b>Wr BLFF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wr BLFF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wr BLFF</em>' containment reference.
   * @see #setWrBLFF(bWrBLFF)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WrBLFF()
   * @model containment="true"
   * @generated
   */
  bWrBLFF getWrBLFF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrBLFF <em>Wr BLFF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wr BLFF</em>' containment reference.
   * @see #getWrBLFF()
   * @generated
   */
  void setWrBLFF(bWrBLFF value);

  /**
   * Returns the value of the '<em><b>Wr ADTWR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wr ADTWR</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wr ADTWR</em>' containment reference.
   * @see #setWrADTWR(bWrADTWR)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WrADTWR()
   * @model containment="true"
   * @generated
   */
  bWrADTWR getWrADTWR();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrADTWR <em>Wr ADTWR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wr ADTWR</em>' containment reference.
   * @see #getWrADTWR()
   * @generated
   */
  void setWrADTWR(bWrADTWR value);

  /**
   * Returns the value of the '<em><b>Wr FMTFF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wr FMTFF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wr FMTFF</em>' containment reference.
   * @see #setWrFMTFF(bWrFMTFF)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WrFMTFF()
   * @model containment="true"
   * @generated
   */
  bWrFMTFF getWrFMTFF();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrFMTFF <em>Wr FMTFF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wr FMTFF</em>' containment reference.
   * @see #getWrFMTFF()
   * @generated
   */
  void setWrFMTFF(bWrFMTFF value);

  /**
   * Returns the value of the '<em><b>Wr ACT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wr ACT</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wr ACT</em>' containment reference.
   * @see #setWrACT(bWrACT)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WrACT()
   * @model containment="true"
   * @generated
   */
  bWrACT getWrACT();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWrACT <em>Wr ACT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wr ACT</em>' containment reference.
   * @see #getWrACT()
   * @generated
   */
  void setWrACT(bWrACT value);

  /**
   * Returns the value of the '<em><b>Clockwise</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clockwise</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clockwise</em>' containment reference.
   * @see #setClockwise(bClockwise)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_Clockwise()
   * @model containment="true"
   * @generated
   */
  bClockwise getClockwise();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getClockwise <em>Clockwise</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clockwise</em>' containment reference.
   * @see #getClockwise()
   * @generated
   */
  void setClockwise(bClockwise value);

  /**
   * Returns the value of the '<em><b>Scale IEC</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scale IEC</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale IEC</em>' containment reference.
   * @see #setScaleIEC(iScaleIEC)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_ScaleIEC()
   * @model containment="true"
   * @generated
   */
  iScaleIEC getScaleIEC();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getScaleIEC <em>Scale IEC</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale IEC</em>' containment reference.
   * @see #getScaleIEC()
   * @generated
   */
  void setScaleIEC(iScaleIEC value);

  /**
   * Returns the value of the '<em><b>Num Grid Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Grid Z</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Grid Z</em>' containment reference.
   * @see #setNumGrid_Z(iNumGrid_Z)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_NumGrid_Z()
   * @model containment="true"
   * @generated
   */
  iNumGrid_Z getNumGrid_Z();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getNumGrid_Z <em>Num Grid Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Grid Z</em>' containment reference.
   * @see #getNumGrid_Z()
   * @generated
   */
  void setNumGrid_Z(iNumGrid_Z value);

  /**
   * Returns the value of the '<em><b>Num Grid Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Grid Y</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Grid Y</em>' containment reference.
   * @see #setNumGrid_Y(iNumGrid_Y)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_NumGrid_Y()
   * @model containment="true"
   * @generated
   */
  iNumGrid_Y getNumGrid_Y();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getNumGrid_Y <em>Num Grid Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Grid Y</em>' containment reference.
   * @see #getNumGrid_Y()
   * @generated
   */
  void setNumGrid_Y(iNumGrid_Y value);

  /**
   * Returns the value of the '<em><b>Time Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Step</em>' containment reference.
   * @see #setTimeStep(nTimeStep)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_TimeStep()
   * @model containment="true"
   * @generated
   */
  nTimeStep getTimeStep();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getTimeStep <em>Time Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Step</em>' containment reference.
   * @see #getTimeStep()
   * @generated
   */
  void setTimeStep(nTimeStep value);

  /**
   * Returns the value of the '<em><b>Analysis Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Analysis Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Analysis Time</em>' containment reference.
   * @see #setAnalysisTime(nAnalysisTime)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_AnalysisTime()
   * @model containment="true"
   * @generated
   */
  nAnalysisTime getAnalysisTime();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getAnalysisTime <em>Analysis Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Analysis Time</em>' containment reference.
   * @see #getAnalysisTime()
   * @generated
   */
  void setAnalysisTime(nAnalysisTime value);

  /**
   * Returns the value of the '<em><b>Usable Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usable Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usable Time</em>' containment reference.
   * @see #setUsableTime(nUsableTime)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_UsableTime()
   * @model containment="true"
   * @generated
   */
  nUsableTime getUsableTime();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUsableTime <em>Usable Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Usable Time</em>' containment reference.
   * @see #getUsableTime()
   * @generated
   */
  void setUsableTime(nUsableTime value);

  /**
   * Returns the value of the '<em><b>Hub Ht</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub Ht</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub Ht</em>' containment reference.
   * @see #setHubHt(nHubHt)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_HubHt()
   * @model containment="true"
   * @generated
   */
  nHubHt getHubHt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHubHt <em>Hub Ht</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub Ht</em>' containment reference.
   * @see #getHubHt()
   * @generated
   */
  void setHubHt(nHubHt value);

  /**
   * Returns the value of the '<em><b>Grid Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grid Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grid Height</em>' containment reference.
   * @see #setGridHeight(nGridHeight)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_GridHeight()
   * @model containment="true"
   * @generated
   */
  nGridHeight getGridHeight();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getGridHeight <em>Grid Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid Height</em>' containment reference.
   * @see #getGridHeight()
   * @generated
   */
  void setGridHeight(nGridHeight value);

  /**
   * Returns the value of the '<em><b>Grid Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grid Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grid Width</em>' containment reference.
   * @see #setGridWidth(nGridWidth)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_GridWidth()
   * @model containment="true"
   * @generated
   */
  nGridWidth getGridWidth();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getGridWidth <em>Grid Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid Width</em>' containment reference.
   * @see #getGridWidth()
   * @generated
   */
  void setGridWidth(nGridWidth value);

  /**
   * Returns the value of the '<em><b>VFlow Ang</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VFlow Ang</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VFlow Ang</em>' containment reference.
   * @see #setVFlowAng(nVFlowAng)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_VFlowAng()
   * @model containment="true"
   * @generated
   */
  nVFlowAng getVFlowAng();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getVFlowAng <em>VFlow Ang</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VFlow Ang</em>' containment reference.
   * @see #getVFlowAng()
   * @generated
   */
  void setVFlowAng(nVFlowAng value);

  /**
   * Returns the value of the '<em><b>HFlow Ang</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HFlow Ang</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HFlow Ang</em>' containment reference.
   * @see #setHFlowAng(nHFlowAng)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_HFlowAng()
   * @model containment="true"
   * @generated
   */
  nHFlowAng getHFlowAng();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getHFlowAng <em>HFlow Ang</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HFlow Ang</em>' containment reference.
   * @see #getHFlowAng()
   * @generated
   */
  void setHFlowAng(nHFlowAng value);

  /**
   * Returns the value of the '<em><b>Turb Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Turb Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Turb Model</em>' containment reference.
   * @see #setTurbModel(sTurbModel)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_TurbModel()
   * @model containment="true"
   * @generated
   */
  sTurbModel getTurbModel();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getTurbModel <em>Turb Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Turb Model</em>' containment reference.
   * @see #getTurbModel()
   * @generated
   */
  void setTurbModel(sTurbModel value);

  /**
   * Returns the value of the '<em><b>IE Cstandard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IE Cstandard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IE Cstandard</em>' containment reference.
   * @see #setIECstandard(sIECstandard)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_IECstandard()
   * @model containment="true"
   * @generated
   */
  sIECstandard getIECstandard();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIECstandard <em>IE Cstandard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IE Cstandard</em>' containment reference.
   * @see #getIECstandard()
   * @generated
   */
  void setIECstandard(sIECstandard value);

  /**
   * Returns the value of the '<em><b>IE Cturbc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IE Cturbc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IE Cturbc</em>' containment reference.
   * @see #setIECturbc(sIECturbc)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_IECturbc()
   * @model containment="true"
   * @generated
   */
  sIECturbc getIECturbc();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIECturbc <em>IE Cturbc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IE Cturbc</em>' containment reference.
   * @see #getIECturbc()
   * @generated
   */
  void setIECturbc(sIECturbc value);

  /**
   * Returns the value of the '<em><b>IEC Wind Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IEC Wind Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IEC Wind Type</em>' containment reference.
   * @see #setIEC_WindType(sIEC_WindType)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_IEC_WindType()
   * @model containment="true"
   * @generated
   */
  sIEC_WindType getIEC_WindType();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIEC_WindType <em>IEC Wind Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IEC Wind Type</em>' containment reference.
   * @see #getIEC_WindType()
   * @generated
   */
  void setIEC_WindType(sIEC_WindType value);

  /**
   * Returns the value of the '<em><b>ET Mc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ET Mc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ET Mc</em>' containment reference.
   * @see #setETMc(sETMc)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_ETMc()
   * @model containment="true"
   * @generated
   */
  sETMc getETMc();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getETMc <em>ET Mc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ET Mc</em>' containment reference.
   * @see #getETMc()
   * @generated
   */
  void setETMc(sETMc value);

  /**
   * Returns the value of the '<em><b>Wind Profile Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wind Profile Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wind Profile Type</em>' containment reference.
   * @see #setWindProfileType(sWindProfileType)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_WindProfileType()
   * @model containment="true"
   * @generated
   */
  sWindProfileType getWindProfileType();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getWindProfileType <em>Wind Profile Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wind Profile Type</em>' containment reference.
   * @see #getWindProfileType()
   * @generated
   */
  void setWindProfileType(sWindProfileType value);

  /**
   * Returns the value of the '<em><b>Ref Ht</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Ht</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Ht</em>' containment reference.
   * @see #setRefHt(nRefHt)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_RefHt()
   * @model containment="true"
   * @generated
   */
  nRefHt getRefHt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRefHt <em>Ref Ht</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Ht</em>' containment reference.
   * @see #getRefHt()
   * @generated
   */
  void setRefHt(nRefHt value);

  /**
   * Returns the value of the '<em><b>Uref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uref</em>' containment reference.
   * @see #setUref(nUref)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_Uref()
   * @model containment="true"
   * @generated
   */
  nUref getUref();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUref <em>Uref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uref</em>' containment reference.
   * @see #getUref()
   * @generated
   */
  void setUref(nUref value);

  /**
   * Returns the value of the '<em><b>ZJet Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ZJet Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ZJet Max</em>' containment reference.
   * @see #setZJetMax(nZJetMax)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_ZJetMax()
   * @model containment="true"
   * @generated
   */
  nZJetMax getZJetMax();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZJetMax <em>ZJet Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ZJet Max</em>' containment reference.
   * @see #getZJetMax()
   * @generated
   */
  void setZJetMax(nZJetMax value);

  /**
   * Returns the value of the '<em><b>PL Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PL Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PL Exp</em>' containment reference.
   * @see #setPLExp(nPLExp)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_PLExp()
   * @model containment="true"
   * @generated
   */
  nPLExp getPLExp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPLExp <em>PL Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PL Exp</em>' containment reference.
   * @see #getPLExp()
   * @generated
   */
  void setPLExp(nPLExp value);

  /**
   * Returns the value of the '<em><b>Z0</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Z0</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Z0</em>' containment reference.
   * @see #setZ0(nZ0)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_Z0()
   * @model containment="true"
   * @generated
   */
  nZ0 getZ0();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZ0 <em>Z0</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Z0</em>' containment reference.
   * @see #getZ0()
   * @generated
   */
  void setZ0(nZ0 value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(nLocation)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_Location()
   * @model containment="true"
   * @generated
   */
  nLocation getLocation();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(nLocation value);

  /**
   * Returns the value of the '<em><b>RICH NO</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RICH NO</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RICH NO</em>' containment reference.
   * @see #setRICH_NO(nRICH_NO)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_RICH_NO()
   * @model containment="true"
   * @generated
   */
  nRICH_NO getRICH_NO();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRICH_NO <em>RICH NO</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RICH NO</em>' containment reference.
   * @see #getRICH_NO()
   * @generated
   */
  void setRICH_NO(nRICH_NO value);

  /**
   * Returns the value of the '<em><b>UStar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>UStar</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>UStar</em>' containment reference.
   * @see #setUStar(nUStar)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_UStar()
   * @model containment="true"
   * @generated
   */
  nUStar getUStar();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getUStar <em>UStar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>UStar</em>' containment reference.
   * @see #getUStar()
   * @generated
   */
  void setUStar(nUStar value);

  /**
   * Returns the value of the '<em><b>ZI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ZI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ZI</em>' containment reference.
   * @see #setZI(nZI)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_ZI()
   * @model containment="true"
   * @generated
   */
  nZI getZI();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getZI <em>ZI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ZI</em>' containment reference.
   * @see #getZI()
   * @generated
   */
  void setZI(nZI value);

  /**
   * Returns the value of the '<em><b>PC UW</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PC UW</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PC UW</em>' containment reference.
   * @see #setPC_UW(nPC_UW)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_PC_UW()
   * @model containment="true"
   * @generated
   */
  nPC_UW getPC_UW();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_UW <em>PC UW</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PC UW</em>' containment reference.
   * @see #getPC_UW()
   * @generated
   */
  void setPC_UW(nPC_UW value);

  /**
   * Returns the value of the '<em><b>PC UV</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PC UV</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PC UV</em>' containment reference.
   * @see #setPC_UV(nPC_UV)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_PC_UV()
   * @model containment="true"
   * @generated
   */
  nPC_UV getPC_UV();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_UV <em>PC UV</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PC UV</em>' containment reference.
   * @see #getPC_UV()
   * @generated
   */
  void setPC_UV(nPC_UV value);

  /**
   * Returns the value of the '<em><b>PC VW</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PC VW</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PC VW</em>' containment reference.
   * @see #setPC_VW(nPC_VW)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_PC_VW()
   * @model containment="true"
   * @generated
   */
  nPC_VW getPC_VW();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getPC_VW <em>PC VW</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PC VW</em>' containment reference.
   * @see #getPC_VW()
   * @generated
   */
  void setPC_VW(nPC_VW value);

  /**
   * Returns the value of the '<em><b>Inc Dec1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc Dec1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc Dec1</em>' containment reference.
   * @see #setIncDec1(nIncDec1)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_IncDec1()
   * @model containment="true"
   * @generated
   */
  nIncDec1 getIncDec1();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec1 <em>Inc Dec1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc Dec1</em>' containment reference.
   * @see #getIncDec1()
   * @generated
   */
  void setIncDec1(nIncDec1 value);

  /**
   * Returns the value of the '<em><b>Inc Dec2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc Dec2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc Dec2</em>' containment reference.
   * @see #setIncDec2(nIncDec2)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_IncDec2()
   * @model containment="true"
   * @generated
   */
  nIncDec2 getIncDec2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec2 <em>Inc Dec2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc Dec2</em>' containment reference.
   * @see #getIncDec2()
   * @generated
   */
  void setIncDec2(nIncDec2 value);

  /**
   * Returns the value of the '<em><b>Inc Dec3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc Dec3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc Dec3</em>' containment reference.
   * @see #setIncDec3(nIncDec3)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_IncDec3()
   * @model containment="true"
   * @generated
   */
  nIncDec3 getIncDec3();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getIncDec3 <em>Inc Dec3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc Dec3</em>' containment reference.
   * @see #getIncDec3()
   * @generated
   */
  void setIncDec3(nIncDec3 value);

  /**
   * Returns the value of the '<em><b>Coh Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coh Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coh Exp</em>' containment reference.
   * @see #setCohExp(nCohExp)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_CohExp()
   * @model containment="true"
   * @generated
   */
  nCohExp getCohExp();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCohExp <em>Coh Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coh Exp</em>' containment reference.
   * @see #getCohExp()
   * @generated
   */
  void setCohExp(nCohExp value);

  /**
   * Returns the value of the '<em><b>CT Event Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CT Event Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CT Event Path</em>' containment reference.
   * @see #setCTEventPath(sCTEventPath)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_CTEventPath()
   * @model containment="true"
   * @generated
   */
  sCTEventPath getCTEventPath();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTEventPath <em>CT Event Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CT Event Path</em>' containment reference.
   * @see #getCTEventPath()
   * @generated
   */
  void setCTEventPath(sCTEventPath value);

  /**
   * Returns the value of the '<em><b>CT Event File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CT Event File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CT Event File</em>' containment reference.
   * @see #setCTEventFile(sCTEventFile)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_CTEventFile()
   * @model containment="true"
   * @generated
   */
  sCTEventFile getCTEventFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTEventFile <em>CT Event File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CT Event File</em>' containment reference.
   * @see #getCTEventFile()
   * @generated
   */
  void setCTEventFile(sCTEventFile value);

  /**
   * Returns the value of the '<em><b>Randomize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Randomize</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Randomize</em>' containment reference.
   * @see #setRandomize(bRandomize)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_Randomize()
   * @model containment="true"
   * @generated
   */
  bRandomize getRandomize();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getRandomize <em>Randomize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Randomize</em>' containment reference.
   * @see #getRandomize()
   * @generated
   */
  void setRandomize(bRandomize value);

  /**
   * Returns the value of the '<em><b>Dist Scl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dist Scl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dist Scl</em>' containment reference.
   * @see #setDistScl(nDistScl)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_DistScl()
   * @model containment="true"
   * @generated
   */
  nDistScl getDistScl();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getDistScl <em>Dist Scl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dist Scl</em>' containment reference.
   * @see #getDistScl()
   * @generated
   */
  void setDistScl(nDistScl value);

  /**
   * Returns the value of the '<em><b>CT Ly</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CT Ly</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CT Ly</em>' containment reference.
   * @see #setCTLy(nCTLy)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_CTLy()
   * @model containment="true"
   * @generated
   */
  nCTLy getCTLy();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTLy <em>CT Ly</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CT Ly</em>' containment reference.
   * @see #getCTLy()
   * @generated
   */
  void setCTLy(nCTLy value);

  /**
   * Returns the value of the '<em><b>CT Lz</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CT Lz</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CT Lz</em>' containment reference.
   * @see #setCTLz(nCTLz)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_CTLz()
   * @model containment="true"
   * @generated
   */
  nCTLz getCTLz();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTLz <em>CT Lz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CT Lz</em>' containment reference.
   * @see #getCTLz()
   * @generated
   */
  void setCTLz(nCTLz value);

  /**
   * Returns the value of the '<em><b>CT Start Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CT Start Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CT Start Time</em>' containment reference.
   * @see #setCTStartTime(nCTStartTime)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getModelTurbsimtbs_CTStartTime()
   * @model containment="true"
   * @generated
   */
  nCTStartTime getCTStartTime();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs#getCTStartTime <em>CT Start Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CT Start Time</em>' containment reference.
   * @see #getCTStartTime()
   * @generated
   */
  void setCTStartTime(nCTStartTime value);

} // ModelTurbsimtbs
