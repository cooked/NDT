/**
 */
package sc.ndt.editor.fast.fastfst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bGen Ti Str</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastfst.bGenTiStr#isValue <em>Value</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastfst.bGenTiStr#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getbGenTiStr()
 * @model
 * @generated
 */
public interface bGenTiStr extends EObject
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
   * @see #setValue(boolean)
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getbGenTiStr_Value()
   * @model
   * @generated
   */
  boolean isValue();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.bGenTiStr#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);

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
   * @see sc.ndt.editor.fast.fastfst.FastfstPackage#getbGenTiStr_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastfst.bGenTiStr#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // bGenTiStr
