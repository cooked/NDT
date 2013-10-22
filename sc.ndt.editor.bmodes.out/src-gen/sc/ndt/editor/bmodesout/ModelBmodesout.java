/**
 */
package sc.ndt.editor.bmodesout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Bmodesout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodesout.ModelBmodesout#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesout.ModelBmodesout#getModes <em>Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.bmodesout.BmodesoutPackage#getModelBmodesout()
 * @model
 * @generated
 */
public interface ModelBmodesout extends EObject
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
   * @see sc.ndt.editor.bmodesout.BmodesoutPackage#getModelBmodesout_Head()
   * @model containment="true"
   * @generated
   */
  Header getHead();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodesout.ModelBmodesout#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Header value);

  /**
   * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
   * The list contents are of type {@link sc.ndt.editor.bmodesout.Mode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modes</em>' containment reference list.
   * @see sc.ndt.editor.bmodesout.BmodesoutPackage#getModelBmodesout_Modes()
   * @model containment="true"
   * @generated
   */
  EList<Mode> getModes();

} // ModelBmodesout
