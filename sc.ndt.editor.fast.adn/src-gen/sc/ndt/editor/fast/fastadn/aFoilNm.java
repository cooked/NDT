/**
 */
package sc.ndt.editor.fast.fastadn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>aFoil Nm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastadn.aFoilNm#getValue <em>Value</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.aFoilNm#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaFoilNm()
 * @model
 * @generated
 */
public interface aFoilNm extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute list.
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaFoilNm_Value()
   * @model unique="false"
   * @generated
   */
  EList<String> getValue();

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
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaFoilNm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sc.ndt.editor.fast.fastadn.aFoilNm#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // aFoilNm
