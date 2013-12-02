/**
 */
package sc.ndt.editor.bmodes.bmodesout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.Mode#getIndex <em>Index</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.Mode#getFreq <em>Freq</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.Mode#getSpan_loc <em>Span loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.Mode#getFlap_disp <em>Flap disp</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.Mode#getFlap_slope <em>Flap slope</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.Mode#getLag_disp <em>Lag disp</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.Mode#getLag_slope <em>Lag slope</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.Mode#getTwist <em>Twist</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode()
 * @model
 * @generated
 */
public interface Mode extends EObject
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Freq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Freq</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Freq</em>' attribute.
   * @see #setFreq(float)
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode_Freq()
   * @model
   * @generated
   */
  float getFreq();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesout.Mode#getFreq <em>Freq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Freq</em>' attribute.
   * @see #getFreq()
   * @generated
   */
  void setFreq(float value);

  /**
   * Returns the value of the '<em><b>Span loc</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span loc</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span loc</em>' attribute list.
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode_Span_loc()
   * @model unique="false"
   * @generated
   */
  EList<Float> getSpan_loc();

  /**
   * Returns the value of the '<em><b>Flap disp</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flap disp</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flap disp</em>' attribute list.
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode_Flap_disp()
   * @model unique="false"
   * @generated
   */
  EList<Float> getFlap_disp();

  /**
   * Returns the value of the '<em><b>Flap slope</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flap slope</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flap slope</em>' attribute list.
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode_Flap_slope()
   * @model unique="false"
   * @generated
   */
  EList<Float> getFlap_slope();

  /**
   * Returns the value of the '<em><b>Lag disp</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lag disp</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lag disp</em>' attribute list.
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode_Lag_disp()
   * @model unique="false"
   * @generated
   */
  EList<Float> getLag_disp();

  /**
   * Returns the value of the '<em><b>Lag slope</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lag slope</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lag slope</em>' attribute list.
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode_Lag_slope()
   * @model unique="false"
   * @generated
   */
  EList<Float> getLag_slope();

  /**
   * Returns the value of the '<em><b>Twist</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twist</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twist</em>' attribute list.
   * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage#getMode_Twist()
   * @model unique="false"
   * @generated
   */
  EList<Float> getTwist();

} // Mode
