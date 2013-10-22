/**
 */
package sc.ndt.editor.bmodestsp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Bmodestsp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getHead <em>Head</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getNNodes <em>NNodes</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see sc.ndt.editor.bmodestsp.BmodestspPackage#getModelBmodestsp()
 * @model
 * @generated
 */
public interface ModelBmodestsp extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(Header)
   * @see sc.ndt.editor.bmodestsp.BmodestspPackage#getModelBmodestsp_Head()
   * @model containment="true"
   * @generated
   */
  Header getHead();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Header value);

  /**
   * Returns the value of the '<em><b>NNodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>NNodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>NNodes</em>' containment reference.
   * @see #setNNodes(iNodes)
   * @see sc.ndt.editor.bmodestsp.BmodestspPackage#getModelBmodestsp_NNodes()
   * @model containment="true"
   * @generated
   */
  iNodes getNNodes();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getNNodes <em>NNodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NNodes</em>' containment reference.
   * @see #getNNodes()
   * @generated
   */
  void setNNodes(iNodes value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference.
   * @see #setSections(aSec)
   * @see sc.ndt.editor.bmodestsp.BmodestspPackage#getModelBmodestsp_Sections()
   * @model containment="true"
   * @generated
   */
  aSec getSections();

  /**
   * Sets the value of the '{@link sc.ndt.editor.bmodestsp.ModelBmodestsp#getSections <em>Sections</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sections</em>' containment reference.
   * @see #getSections()
   * @generated
   */
  void setSections(aSec value);

} // ModelBmodestsp
