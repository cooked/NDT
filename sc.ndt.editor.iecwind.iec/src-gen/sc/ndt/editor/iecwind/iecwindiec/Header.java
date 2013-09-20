/**
 */
package sc.ndt.editor.iecwind.iecwindiec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.Header#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject
{
  /**
   * Returns the value of the '<em><b>Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Row</em>' attribute.
   * @see #setRow(String)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getHeader_Row()
   * @model
   * @generated
   */
  String getRow();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.Header#getRow <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row</em>' attribute.
   * @see #getRow()
   * @generated
   */
  void setRow(String value);

} // Header
