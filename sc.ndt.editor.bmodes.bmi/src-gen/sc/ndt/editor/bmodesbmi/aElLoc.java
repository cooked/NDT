/**
 */
package sc.ndt.editor.bmodesbmi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>aEl Loc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodesbmi.aElLoc#getEl_loc <em>El loc</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.bmodesbmi.BmodesbmiPackage#getaElLoc()
 * @model
 * @generated
 */
public interface aElLoc extends EObject
{
  /**
   * Returns the value of the '<em><b>El loc</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El loc</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El loc</em>' attribute list.
   * @see sc.ndt.editor.bmodesbmi.BmodesbmiPackage#getaElLoc_El_loc()
   * @model unique="false"
   * @generated
   */
  EList<Float> getEl_loc();

} // aElLoc
