/**
 */
package sc.ndt.editor.bmodes.bmodesbmi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>aNode Attach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach#getEl_loc <em>El loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getaNodeAttach()
 * @model
 * @generated
 */
public interface aNodeAttach extends EObject
{
  /**
   * Returns the value of the '<em><b>El loc</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El loc</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El loc</em>' attribute list.
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getaNodeAttach_El_loc()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getEl_loc();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getaNodeAttach_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // aNodeAttach
