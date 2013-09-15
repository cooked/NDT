/**
 */
package sc.ndt.editor.fast.fastfst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>iPtfm Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastfst.iPtfmModel#getValue <em>Value</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.iPtfmModel#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getiPtfmModel()
 * @model
 * @generated
 */
public interface iPtfmModel extends EObject
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
   * @see #setValue(int)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getiPtfmModel_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.iPtfmModel#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

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
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getiPtfmModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.iPtfmModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // iPtfmModel
