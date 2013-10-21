/**
 */
package sc.ndt.editor.turbsimtbs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.turbsimtbs.Header#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject
{
  /**
   * Returns the value of the '<em><b>Rows</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' attribute.
   * @see #setRows(String)
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#getHeader_Rows()
   * @model
   * @generated
   */
  String getRows();

  /**
   * Sets the value of the '{@link sc.ndt.editor.turbsimtbs.Header#getRows <em>Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rows</em>' attribute.
   * @see #getRows()
   * @generated
   */
  void setRows(String value);

} // Header
