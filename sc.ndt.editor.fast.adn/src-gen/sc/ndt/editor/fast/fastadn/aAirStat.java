/**
 */
package sc.ndt.editor.fast.fastadn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>aAir Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastadn.aAirStat#getRnodes <em>Rnodes</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.aAirStat#getAerotwst <em>Aerotwst</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.aAirStat#getDrnodes <em>Drnodes</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.aAirStat#getChord <em>Chord</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.aAirStat#getNfoil <em>Nfoil</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.aAirStat#getPrnelm <em>Prnelm</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaAirStat()
 * @model
 * @generated
 */
public interface aAirStat extends EObject
{
  /**
   * Returns the value of the '<em><b>Rnodes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rnodes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rnodes</em>' attribute list.
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaAirStat_Rnodes()
   * @model unique="false"
   * @generated
   */
  EList<Float> getRnodes();

  /**
   * Returns the value of the '<em><b>Aerotwst</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aerotwst</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aerotwst</em>' attribute list.
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaAirStat_Aerotwst()
   * @model unique="false"
   * @generated
   */
  EList<Float> getAerotwst();

  /**
   * Returns the value of the '<em><b>Drnodes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drnodes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drnodes</em>' attribute list.
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaAirStat_Drnodes()
   * @model unique="false"
   * @generated
   */
  EList<Float> getDrnodes();

  /**
   * Returns the value of the '<em><b>Chord</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chord</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chord</em>' attribute list.
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaAirStat_Chord()
   * @model unique="false"
   * @generated
   */
  EList<Float> getChord();

  /**
   * Returns the value of the '<em><b>Nfoil</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nfoil</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nfoil</em>' attribute list.
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaAirStat_Nfoil()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getNfoil();

  /**
   * Returns the value of the '<em><b>Prnelm</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prnelm</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prnelm</em>' attribute list.
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#getaAirStat_Prnelm()
   * @model unique="false"
   * @generated
   */
  EList<String> getPrnelm();

} // aAirStat
