/**
 */
package sc.ndt.editor.iecwind.iecwindiec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Iecwindiec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getSIUnits <em>SI Units</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getStart <em>Start</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getIECClass <em>IEC Class</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindTurb <em>Wind Turb</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindSlope <em>Wind Slope</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getIECStandard <em>IEC Standard</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getHubHeight <em>Hub Height</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getRotDiam <em>Rot Diam</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindIn <em>Wind In</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindNom <em>Wind Nom</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindOut <em>Wind Out</em>}</li>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getOutList <em>Out List</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec()
 * @model
 * @generated
 */
public interface ModelIecwindiec extends EObject
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
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_Head()
   * @model containment="true"
   * @generated
   */
  Header getHead();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Header value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link sc.ndt.editor.iecwind.iecwindiec.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

  /**
   * Returns the value of the '<em><b>SI Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SI Units</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SI Units</em>' containment reference.
   * @see #setSIUnits(siUnits)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_SIUnits()
   * @model containment="true"
   * @generated
   */
  siUnits getSIUnits();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getSIUnits <em>SI Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SI Units</em>' containment reference.
   * @see #getSIUnits()
   * @generated
   */
  void setSIUnits(siUnits value);

  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(iStart)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_Start()
   * @model containment="true"
   * @generated
   */
  iStart getStart();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(iStart value);

  /**
   * Returns the value of the '<em><b>IEC Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IEC Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IEC Class</em>' containment reference.
   * @see #setIECClass(iIECClass)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_IECClass()
   * @model containment="true"
   * @generated
   */
  iIECClass getIECClass();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getIECClass <em>IEC Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IEC Class</em>' containment reference.
   * @see #getIECClass()
   * @generated
   */
  void setIECClass(iIECClass value);

  /**
   * Returns the value of the '<em><b>Wind Turb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wind Turb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wind Turb</em>' containment reference.
   * @see #setWindTurb(sWindTurb)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_WindTurb()
   * @model containment="true"
   * @generated
   */
  sWindTurb getWindTurb();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindTurb <em>Wind Turb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wind Turb</em>' containment reference.
   * @see #getWindTurb()
   * @generated
   */
  void setWindTurb(sWindTurb value);

  /**
   * Returns the value of the '<em><b>Wind Slope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wind Slope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wind Slope</em>' containment reference.
   * @see #setWindSlope(nWindSlope)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_WindSlope()
   * @model containment="true"
   * @generated
   */
  nWindSlope getWindSlope();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindSlope <em>Wind Slope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wind Slope</em>' containment reference.
   * @see #getWindSlope()
   * @generated
   */
  void setWindSlope(nWindSlope value);

  /**
   * Returns the value of the '<em><b>IEC Standard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IEC Standard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IEC Standard</em>' containment reference.
   * @see #setIECStandard(iIECStd)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_IECStandard()
   * @model containment="true"
   * @generated
   */
  iIECStd getIECStandard();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getIECStandard <em>IEC Standard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IEC Standard</em>' containment reference.
   * @see #getIECStandard()
   * @generated
   */
  void setIECStandard(iIECStd value);

  /**
   * Returns the value of the '<em><b>Hub Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub Height</em>' containment reference.
   * @see #setHubHeight(nHubHeight)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_HubHeight()
   * @model containment="true"
   * @generated
   */
  nHubHeight getHubHeight();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getHubHeight <em>Hub Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub Height</em>' containment reference.
   * @see #getHubHeight()
   * @generated
   */
  void setHubHeight(nHubHeight value);

  /**
   * Returns the value of the '<em><b>Rot Diam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rot Diam</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rot Diam</em>' containment reference.
   * @see #setRotDiam(nRotDiam)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_RotDiam()
   * @model containment="true"
   * @generated
   */
  nRotDiam getRotDiam();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getRotDiam <em>Rot Diam</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rot Diam</em>' containment reference.
   * @see #getRotDiam()
   * @generated
   */
  void setRotDiam(nRotDiam value);

  /**
   * Returns the value of the '<em><b>Wind In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wind In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wind In</em>' containment reference.
   * @see #setWindIn(nWindIn)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_WindIn()
   * @model containment="true"
   * @generated
   */
  nWindIn getWindIn();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindIn <em>Wind In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wind In</em>' containment reference.
   * @see #getWindIn()
   * @generated
   */
  void setWindIn(nWindIn value);

  /**
   * Returns the value of the '<em><b>Wind Nom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wind Nom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wind Nom</em>' containment reference.
   * @see #setWindNom(nWindNom)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_WindNom()
   * @model containment="true"
   * @generated
   */
  nWindNom getWindNom();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindNom <em>Wind Nom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wind Nom</em>' containment reference.
   * @see #getWindNom()
   * @generated
   */
  void setWindNom(nWindNom value);

  /**
   * Returns the value of the '<em><b>Wind Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wind Out</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wind Out</em>' containment reference.
   * @see #setWindOut(nWindOut)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_WindOut()
   * @model containment="true"
   * @generated
   */
  nWindOut getWindOut();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getWindOut <em>Wind Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wind Out</em>' containment reference.
   * @see #getWindOut()
   * @generated
   */
  void setWindOut(nWindOut value);

  /**
   * Returns the value of the '<em><b>Out List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out List</em>' containment reference.
   * @see #setOutList(vOutList)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getModelIecwindiec_OutList()
   * @model containment="true"
   * @generated
   */
  vOutList getOutList();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec#getOutList <em>Out List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out List</em>' containment reference.
   * @see #getOutList()
   * @generated
   */
  void setOutList(vOutList value);

} // ModelIecwindiec
