/**
 */
package sc.ndt.editor.bmodes.bmodesbmi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>nRot Rpm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.nRotRpm#getValue <em>Value</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.nRotRpm#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getnRotRpm()
 * @model
 * @generated
 */
public interface nRotRpm extends EObject
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
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getnRotRpm_Value()
   * @model
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.nRotRpm#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

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
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#getnRotRpm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodes.bmodesbmi.nRotRpm#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // nRotRpm
