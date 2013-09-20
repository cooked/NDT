/**
 */
package sc.ndt.editor.iecwind.iecwindiec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>nWind Slope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.iecwind.iecwindiec.nWindSlope#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getnWindSlope()
 * @model
 * @generated
 */
public interface nWindSlope extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(float)
   * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage#getnWindSlope_Value()
   * @model
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link sc.ndt.editor.iecwind.iecwindiec.nWindSlope#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

} // nWindSlope
