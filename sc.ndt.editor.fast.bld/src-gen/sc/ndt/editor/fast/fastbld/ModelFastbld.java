/**
 */
package sc.ndt.editor.fast.fastbld;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Fastbld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getSections <em>Sections</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getNblInpSt <em>Nbl Inp St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getCalcBMode <em>Calc BMode</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFlDmp1 <em>Bld Fl Dmp1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFlDmp2 <em>Bld Fl Dmp2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdDmp1 <em>Bld Ed Dmp1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getFlStTunr1 <em>Fl St Tunr1</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getFlStTunr2 <em>Fl St Tunr2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjBlMs <em>Adj Bl Ms</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjFlSt <em>Adj Fl St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjEdSt <em>Adj Ed St</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAirStat <em>Air Stat</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh2 <em>Bld Fl1 Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh3 <em>Bld Fl1 Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh4 <em>Bld Fl1 Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh5 <em>Bld Fl1 Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh6 <em>Bld Fl1 Sh6</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh2 <em>Bld Fl2 Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh3 <em>Bld Fl2 Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh4 <em>Bld Fl2 Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh5 <em>Bld Fl2 Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh6 <em>Bld Fl2 Sh6</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh2 <em>Bld Edg Sh2</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh3 <em>Bld Edg Sh3</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh4 <em>Bld Edg Sh4</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh5 <em>Bld Edg Sh5</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh6 <em>Bld Edg Sh6</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld()
 * @model
 * @generated
 */
public interface ModelFastbld extends EObject
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
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_Head()
   * @model containment="true"
   * @generated
   */
  Header getHead();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Header value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link sc.ndt.editor.fast.fastbld.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

  /**
   * Returns the value of the '<em><b>Nbl Inp St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nbl Inp St</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nbl Inp St</em>' containment reference.
   * @see #setNblInpSt(nNblInpSt)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_NblInpSt()
   * @model containment="true"
   * @generated
   */
  nNblInpSt getNblInpSt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getNblInpSt <em>Nbl Inp St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nbl Inp St</em>' containment reference.
   * @see #getNblInpSt()
   * @generated
   */
  void setNblInpSt(nNblInpSt value);

  /**
   * Returns the value of the '<em><b>Calc BMode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calc BMode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calc BMode</em>' containment reference.
   * @see #setCalcBMode(bCalcBMode)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_CalcBMode()
   * @model containment="true"
   * @generated
   */
  bCalcBMode getCalcBMode();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getCalcBMode <em>Calc BMode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Calc BMode</em>' containment reference.
   * @see #getCalcBMode()
   * @generated
   */
  void setCalcBMode(bCalcBMode value);

  /**
   * Returns the value of the '<em><b>Bld Fl Dmp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl Dmp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl Dmp1</em>' containment reference.
   * @see #setBldFlDmp1(nBldFlDmp1)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFlDmp1()
   * @model containment="true"
   * @generated
   */
  nBldFlDmp1 getBldFlDmp1();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFlDmp1 <em>Bld Fl Dmp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl Dmp1</em>' containment reference.
   * @see #getBldFlDmp1()
   * @generated
   */
  void setBldFlDmp1(nBldFlDmp1 value);

  /**
   * Returns the value of the '<em><b>Bld Fl Dmp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl Dmp2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl Dmp2</em>' containment reference.
   * @see #setBldFlDmp2(nBldFlDmp2)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFlDmp2()
   * @model containment="true"
   * @generated
   */
  nBldFlDmp2 getBldFlDmp2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFlDmp2 <em>Bld Fl Dmp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl Dmp2</em>' containment reference.
   * @see #getBldFlDmp2()
   * @generated
   */
  void setBldFlDmp2(nBldFlDmp2 value);

  /**
   * Returns the value of the '<em><b>Bld Ed Dmp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Ed Dmp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Ed Dmp1</em>' containment reference.
   * @see #setBldEdDmp1(nBldEdDmp1)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldEdDmp1()
   * @model containment="true"
   * @generated
   */
  nBldEdDmp1 getBldEdDmp1();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdDmp1 <em>Bld Ed Dmp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Ed Dmp1</em>' containment reference.
   * @see #getBldEdDmp1()
   * @generated
   */
  void setBldEdDmp1(nBldEdDmp1 value);

  /**
   * Returns the value of the '<em><b>Fl St Tunr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fl St Tunr1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fl St Tunr1</em>' containment reference.
   * @see #setFlStTunr1(nFlStTunr1)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_FlStTunr1()
   * @model containment="true"
   * @generated
   */
  nFlStTunr1 getFlStTunr1();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getFlStTunr1 <em>Fl St Tunr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fl St Tunr1</em>' containment reference.
   * @see #getFlStTunr1()
   * @generated
   */
  void setFlStTunr1(nFlStTunr1 value);

  /**
   * Returns the value of the '<em><b>Fl St Tunr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fl St Tunr2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fl St Tunr2</em>' containment reference.
   * @see #setFlStTunr2(nFlStTunr2)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_FlStTunr2()
   * @model containment="true"
   * @generated
   */
  nFlStTunr2 getFlStTunr2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getFlStTunr2 <em>Fl St Tunr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fl St Tunr2</em>' containment reference.
   * @see #getFlStTunr2()
   * @generated
   */
  void setFlStTunr2(nFlStTunr2 value);

  /**
   * Returns the value of the '<em><b>Adj Bl Ms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adj Bl Ms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adj Bl Ms</em>' containment reference.
   * @see #setAdjBlMs(AdjBlMs)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_AdjBlMs()
   * @model containment="true"
   * @generated
   */
  AdjBlMs getAdjBlMs();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjBlMs <em>Adj Bl Ms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adj Bl Ms</em>' containment reference.
   * @see #getAdjBlMs()
   * @generated
   */
  void setAdjBlMs(AdjBlMs value);

  /**
   * Returns the value of the '<em><b>Adj Fl St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adj Fl St</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adj Fl St</em>' containment reference.
   * @see #setAdjFlSt(AdjFlSt)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_AdjFlSt()
   * @model containment="true"
   * @generated
   */
  AdjFlSt getAdjFlSt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjFlSt <em>Adj Fl St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adj Fl St</em>' containment reference.
   * @see #getAdjFlSt()
   * @generated
   */
  void setAdjFlSt(AdjFlSt value);

  /**
   * Returns the value of the '<em><b>Adj Ed St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adj Ed St</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adj Ed St</em>' containment reference.
   * @see #setAdjEdSt(AdjEdSt)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_AdjEdSt()
   * @model containment="true"
   * @generated
   */
  AdjEdSt getAdjEdSt();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAdjEdSt <em>Adj Ed St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adj Ed St</em>' containment reference.
   * @see #getAdjEdSt()
   * @generated
   */
  void setAdjEdSt(AdjEdSt value);

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
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_AirStat()
   * @model containment="true"
   * @generated
   */
  aAirStat getAirStat();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getAirStat <em>Air Stat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Air Stat</em>' containment reference.
   * @see #getAirStat()
   * @generated
   */
  void setAirStat(aAirStat value);

  /**
   * Returns the value of the '<em><b>Bld Fl1 Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl1 Sh2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl1 Sh2</em>' containment reference.
   * @see #setBldFl1Sh2(nBldFl1Sh2)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl1Sh2()
   * @model containment="true"
   * @generated
   */
  nBldFl1Sh2 getBldFl1Sh2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh2 <em>Bld Fl1 Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl1 Sh2</em>' containment reference.
   * @see #getBldFl1Sh2()
   * @generated
   */
  void setBldFl1Sh2(nBldFl1Sh2 value);

  /**
   * Returns the value of the '<em><b>Bld Fl1 Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl1 Sh3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl1 Sh3</em>' containment reference.
   * @see #setBldFl1Sh3(nBldFl1Sh3)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl1Sh3()
   * @model containment="true"
   * @generated
   */
  nBldFl1Sh3 getBldFl1Sh3();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh3 <em>Bld Fl1 Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl1 Sh3</em>' containment reference.
   * @see #getBldFl1Sh3()
   * @generated
   */
  void setBldFl1Sh3(nBldFl1Sh3 value);

  /**
   * Returns the value of the '<em><b>Bld Fl1 Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl1 Sh4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl1 Sh4</em>' containment reference.
   * @see #setBldFl1Sh4(nBldFl1Sh4)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl1Sh4()
   * @model containment="true"
   * @generated
   */
  nBldFl1Sh4 getBldFl1Sh4();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh4 <em>Bld Fl1 Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl1 Sh4</em>' containment reference.
   * @see #getBldFl1Sh4()
   * @generated
   */
  void setBldFl1Sh4(nBldFl1Sh4 value);

  /**
   * Returns the value of the '<em><b>Bld Fl1 Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl1 Sh5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl1 Sh5</em>' containment reference.
   * @see #setBldFl1Sh5(nBldFl1Sh5)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl1Sh5()
   * @model containment="true"
   * @generated
   */
  nBldFl1Sh5 getBldFl1Sh5();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh5 <em>Bld Fl1 Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl1 Sh5</em>' containment reference.
   * @see #getBldFl1Sh5()
   * @generated
   */
  void setBldFl1Sh5(nBldFl1Sh5 value);

  /**
   * Returns the value of the '<em><b>Bld Fl1 Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl1 Sh6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl1 Sh6</em>' containment reference.
   * @see #setBldFl1Sh6(nBldFl1Sh6)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl1Sh6()
   * @model containment="true"
   * @generated
   */
  nBldFl1Sh6 getBldFl1Sh6();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl1Sh6 <em>Bld Fl1 Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl1 Sh6</em>' containment reference.
   * @see #getBldFl1Sh6()
   * @generated
   */
  void setBldFl1Sh6(nBldFl1Sh6 value);

  /**
   * Returns the value of the '<em><b>Bld Fl2 Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl2 Sh2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl2 Sh2</em>' containment reference.
   * @see #setBldFl2Sh2(nBldFl2Sh2)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl2Sh2()
   * @model containment="true"
   * @generated
   */
  nBldFl2Sh2 getBldFl2Sh2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh2 <em>Bld Fl2 Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl2 Sh2</em>' containment reference.
   * @see #getBldFl2Sh2()
   * @generated
   */
  void setBldFl2Sh2(nBldFl2Sh2 value);

  /**
   * Returns the value of the '<em><b>Bld Fl2 Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl2 Sh3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl2 Sh3</em>' containment reference.
   * @see #setBldFl2Sh3(nBldFl2Sh3)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl2Sh3()
   * @model containment="true"
   * @generated
   */
  nBldFl2Sh3 getBldFl2Sh3();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh3 <em>Bld Fl2 Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl2 Sh3</em>' containment reference.
   * @see #getBldFl2Sh3()
   * @generated
   */
  void setBldFl2Sh3(nBldFl2Sh3 value);

  /**
   * Returns the value of the '<em><b>Bld Fl2 Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl2 Sh4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl2 Sh4</em>' containment reference.
   * @see #setBldFl2Sh4(nBldFl2Sh4)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl2Sh4()
   * @model containment="true"
   * @generated
   */
  nBldFl2Sh4 getBldFl2Sh4();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh4 <em>Bld Fl2 Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl2 Sh4</em>' containment reference.
   * @see #getBldFl2Sh4()
   * @generated
   */
  void setBldFl2Sh4(nBldFl2Sh4 value);

  /**
   * Returns the value of the '<em><b>Bld Fl2 Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl2 Sh5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl2 Sh5</em>' containment reference.
   * @see #setBldFl2Sh5(nBldFl2Sh5)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl2Sh5()
   * @model containment="true"
   * @generated
   */
  nBldFl2Sh5 getBldFl2Sh5();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh5 <em>Bld Fl2 Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl2 Sh5</em>' containment reference.
   * @see #getBldFl2Sh5()
   * @generated
   */
  void setBldFl2Sh5(nBldFl2Sh5 value);

  /**
   * Returns the value of the '<em><b>Bld Fl2 Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Fl2 Sh6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Fl2 Sh6</em>' containment reference.
   * @see #setBldFl2Sh6(nBldFl2Sh6)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldFl2Sh6()
   * @model containment="true"
   * @generated
   */
  nBldFl2Sh6 getBldFl2Sh6();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldFl2Sh6 <em>Bld Fl2 Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Fl2 Sh6</em>' containment reference.
   * @see #getBldFl2Sh6()
   * @generated
   */
  void setBldFl2Sh6(nBldFl2Sh6 value);

  /**
   * Returns the value of the '<em><b>Bld Edg Sh2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Edg Sh2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Edg Sh2</em>' containment reference.
   * @see #setBldEdgSh2(nBldEdgSh2)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldEdgSh2()
   * @model containment="true"
   * @generated
   */
  nBldEdgSh2 getBldEdgSh2();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh2 <em>Bld Edg Sh2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Edg Sh2</em>' containment reference.
   * @see #getBldEdgSh2()
   * @generated
   */
  void setBldEdgSh2(nBldEdgSh2 value);

  /**
   * Returns the value of the '<em><b>Bld Edg Sh3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Edg Sh3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Edg Sh3</em>' containment reference.
   * @see #setBldEdgSh3(nBldEdgSh3)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldEdgSh3()
   * @model containment="true"
   * @generated
   */
  nBldEdgSh3 getBldEdgSh3();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh3 <em>Bld Edg Sh3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Edg Sh3</em>' containment reference.
   * @see #getBldEdgSh3()
   * @generated
   */
  void setBldEdgSh3(nBldEdgSh3 value);

  /**
   * Returns the value of the '<em><b>Bld Edg Sh4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Edg Sh4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Edg Sh4</em>' containment reference.
   * @see #setBldEdgSh4(nBldEdgSh4)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldEdgSh4()
   * @model containment="true"
   * @generated
   */
  nBldEdgSh4 getBldEdgSh4();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh4 <em>Bld Edg Sh4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Edg Sh4</em>' containment reference.
   * @see #getBldEdgSh4()
   * @generated
   */
  void setBldEdgSh4(nBldEdgSh4 value);

  /**
   * Returns the value of the '<em><b>Bld Edg Sh5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Edg Sh5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Edg Sh5</em>' containment reference.
   * @see #setBldEdgSh5(nBldEdgSh5)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldEdgSh5()
   * @model containment="true"
   * @generated
   */
  nBldEdgSh5 getBldEdgSh5();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh5 <em>Bld Edg Sh5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Edg Sh5</em>' containment reference.
   * @see #getBldEdgSh5()
   * @generated
   */
  void setBldEdgSh5(nBldEdgSh5 value);

  /**
   * Returns the value of the '<em><b>Bld Edg Sh6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bld Edg Sh6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bld Edg Sh6</em>' containment reference.
   * @see #setBldEdgSh6(nBldEdgSh6)
   * @see sc.ndt.editor.fast.fastbld.FastbldPackage#getModelFastbld_BldEdgSh6()
   * @model containment="true"
   * @generated
   */
  nBldEdgSh6 getBldEdgSh6();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastbld.ModelFastbld#getBldEdgSh6 <em>Bld Edg Sh6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bld Edg Sh6</em>' containment reference.
   * @see #getBldEdgSh6()
   * @generated
   */
  void setBldEdgSh6(nBldEdgSh6 value);

} // ModelFastbld
