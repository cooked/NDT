/**
 */
package sc.ndt.editor.fast.fastadn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Fastadn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getSIUnits <em>SI Units</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getStallMod <em>Stall Mod</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getUseCm <em>Use Cm</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getInfModel <em>Inf Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getIndModel <em>Ind Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getAtoler <em>Atoler</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTLModel <em>TL Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHLModel <em>HL Model</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getWindFile <em>Wind File</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHH <em>HH</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTwrShad <em>Twr Shad</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getShadHWid <em>Shad HWid</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTShadRefPt <em>TShad Ref Pt</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getRho <em>Rho</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getKinVisc <em>Kin Visc</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getDTAero <em>DT Aero</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getNumFoil <em>Num Foil</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getFoilNm <em>Foil Nm</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getBldNodes <em>Bld Nodes</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getAirStat <em>Air Stat</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn()
 * @model
 * @generated
 */
public interface ModelFastadn extends EObject
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
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_Head()
   * @model containment="true"
   * @generated
   */
  Header getHead();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Header value);

  /**
   * Returns the value of the '<em><b>SI Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SI Units</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SI Units</em>' containment reference.
   * @see #setSIUnits(sUnits)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_SIUnits()
   * @model containment="true"
   * @generated
   */
  sUnits getSIUnits();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getSIUnits <em>SI Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SI Units</em>' containment reference.
   * @see #getSIUnits()
   * @generated
   */
  void setSIUnits(sUnits value);

  /**
   * Returns the value of the '<em><b>Stall Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stall Mod</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stall Mod</em>' containment reference.
   * @see #setStallMod(sStallMod)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_StallMod()
   * @model containment="true"
   * @generated
   */
  sStallMod getStallMod();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getStallMod <em>Stall Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stall Mod</em>' containment reference.
   * @see #getStallMod()
   * @generated
   */
  void setStallMod(sStallMod value);

  /**
   * Returns the value of the '<em><b>Use Cm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Cm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Cm</em>' containment reference.
   * @see #setUseCm(sUseCm)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_UseCm()
   * @model containment="true"
   * @generated
   */
  sUseCm getUseCm();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getUseCm <em>Use Cm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Cm</em>' containment reference.
   * @see #getUseCm()
   * @generated
   */
  void setUseCm(sUseCm value);

  /**
   * Returns the value of the '<em><b>Inf Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inf Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inf Model</em>' containment reference.
   * @see #setInfModel(sInfModel)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_InfModel()
   * @model containment="true"
   * @generated
   */
  sInfModel getInfModel();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getInfModel <em>Inf Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inf Model</em>' containment reference.
   * @see #getInfModel()
   * @generated
   */
  void setInfModel(sInfModel value);

  /**
   * Returns the value of the '<em><b>Ind Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ind Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ind Model</em>' containment reference.
   * @see #setIndModel(sIndModel)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_IndModel()
   * @model containment="true"
   * @generated
   */
  sIndModel getIndModel();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getIndModel <em>Ind Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ind Model</em>' containment reference.
   * @see #getIndModel()
   * @generated
   */
  void setIndModel(sIndModel value);

  /**
   * Returns the value of the '<em><b>Atoler</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atoler</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atoler</em>' containment reference.
   * @see #setAtoler(nAtoler)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_Atoler()
   * @model containment="true"
   * @generated
   */
  nAtoler getAtoler();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getAtoler <em>Atoler</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atoler</em>' containment reference.
   * @see #getAtoler()
   * @generated
   */
  void setAtoler(nAtoler value);

  /**
   * Returns the value of the '<em><b>TL Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TL Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TL Model</em>' containment reference.
   * @see #setTLModel(sTLModel)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_TLModel()
   * @model containment="true"
   * @generated
   */
  sTLModel getTLModel();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTLModel <em>TL Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TL Model</em>' containment reference.
   * @see #getTLModel()
   * @generated
   */
  void setTLModel(sTLModel value);

  /**
   * Returns the value of the '<em><b>HL Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HL Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HL Model</em>' containment reference.
   * @see #setHLModel(sHLModel)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_HLModel()
   * @model containment="true"
   * @generated
   */
  sHLModel getHLModel();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHLModel <em>HL Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HL Model</em>' containment reference.
   * @see #getHLModel()
   * @generated
   */
  void setHLModel(sHLModel value);

  /**
   * Returns the value of the '<em><b>Wind File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wind File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wind File</em>' containment reference.
   * @see #setWindFile(fWindFile)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_WindFile()
   * @model containment="true"
   * @generated
   */
  fWindFile getWindFile();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getWindFile <em>Wind File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wind File</em>' containment reference.
   * @see #getWindFile()
   * @generated
   */
  void setWindFile(fWindFile value);

  /**
   * Returns the value of the '<em><b>HH</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HH</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HH</em>' containment reference.
   * @see #setHH(nHH)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_HH()
   * @model containment="true"
   * @generated
   */
  nHH getHH();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getHH <em>HH</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HH</em>' containment reference.
   * @see #getHH()
   * @generated
   */
  void setHH(nHH value);

  /**
   * Returns the value of the '<em><b>Twr Shad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twr Shad</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twr Shad</em>' containment reference.
   * @see #setTwrShad(nTwrShad)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_TwrShad()
   * @model containment="true"
   * @generated
   */
  nTwrShad getTwrShad();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTwrShad <em>Twr Shad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twr Shad</em>' containment reference.
   * @see #getTwrShad()
   * @generated
   */
  void setTwrShad(nTwrShad value);

  /**
   * Returns the value of the '<em><b>Shad HWid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shad HWid</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shad HWid</em>' containment reference.
   * @see #setShadHWid(nShadHWid)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_ShadHWid()
   * @model containment="true"
   * @generated
   */
  nShadHWid getShadHWid();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getShadHWid <em>Shad HWid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shad HWid</em>' containment reference.
   * @see #getShadHWid()
   * @generated
   */
  void setShadHWid(nShadHWid value);

  /**
   * Returns the value of the '<em><b>TShad Ref Pt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TShad Ref Pt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TShad Ref Pt</em>' containment reference.
   * @see #setTShadRefPt(nTShadRefPt)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_TShadRefPt()
   * @model containment="true"
   * @generated
   */
  nTShadRefPt getTShadRefPt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getTShadRefPt <em>TShad Ref Pt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TShad Ref Pt</em>' containment reference.
   * @see #getTShadRefPt()
   * @generated
   */
  void setTShadRefPt(nTShadRefPt value);

  /**
   * Returns the value of the '<em><b>Rho</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rho</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rho</em>' containment reference.
   * @see #setRho(nRho)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_Rho()
   * @model containment="true"
   * @generated
   */
  nRho getRho();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getRho <em>Rho</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rho</em>' containment reference.
   * @see #getRho()
   * @generated
   */
  void setRho(nRho value);

  /**
   * Returns the value of the '<em><b>Kin Visc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kin Visc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kin Visc</em>' containment reference.
   * @see #setKinVisc(nKinVisc)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_KinVisc()
   * @model containment="true"
   * @generated
   */
  nKinVisc getKinVisc();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getKinVisc <em>Kin Visc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kin Visc</em>' containment reference.
   * @see #getKinVisc()
   * @generated
   */
  void setKinVisc(nKinVisc value);

  /**
   * Returns the value of the '<em><b>DT Aero</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DT Aero</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DT Aero</em>' containment reference.
   * @see #setDTAero(nDTAero)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_DTAero()
   * @model containment="true"
   * @generated
   */
  nDTAero getDTAero();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getDTAero <em>DT Aero</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DT Aero</em>' containment reference.
   * @see #getDTAero()
   * @generated
   */
  void setDTAero(nDTAero value);

  /**
   * Returns the value of the '<em><b>Num Foil</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Foil</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Foil</em>' containment reference.
   * @see #setNumFoil(iNumFoil)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_NumFoil()
   * @model containment="true"
   * @generated
   */
  iNumFoil getNumFoil();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getNumFoil <em>Num Foil</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Foil</em>' containment reference.
   * @see #getNumFoil()
   * @generated
   */
  void setNumFoil(iNumFoil value);

  /**
   * Returns the value of the '<em><b>Foil Nm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foil Nm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foil Nm</em>' containment reference.
   * @see #setFoilNm(aAirfoilList)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_FoilNm()
   * @model containment="true"
   * @generated
   */
  aAirfoilList getFoilNm();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getFoilNm <em>Foil Nm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foil Nm</em>' containment reference.
   * @see #getFoilNm()
   * @generated
   */
  void setFoilNm(aAirfoilList value);

  /**
   * Returns the value of the '<em><b>Bld Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Nodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Nodes</em>' containment reference.
   * @see #setBldNodes(iBldNodes)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_BldNodes()
   * @model containment="true"
   * @generated
   */
  iBldNodes getBldNodes();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getBldNodes <em>Bld Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Nodes</em>' containment reference.
   * @see #getBldNodes()
   * @generated
   */
  void setBldNodes(iBldNodes value);

  /**
   * Returns the value of the '<em><b>Air Stat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Air Stat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Air Stat</em>' containment reference.
   * @see #setAirStat(aAirStat)
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getModelFastadn_AirStat()
   * @model containment="true"
   * @generated
   */
  aAirStat getAirStat();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.ModelFastadn#getAirStat <em>Air Stat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Air Stat</em>' containment reference.
   * @see #getAirStat()
   * @generated
   */
  void setAirStat(aAirStat value);

} // ModelFastadn
