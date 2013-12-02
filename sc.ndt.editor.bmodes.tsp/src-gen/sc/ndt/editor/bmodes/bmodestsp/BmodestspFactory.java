/**
 */
package sc.ndt.editor.bmodes.bmodestsp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.bmodes.bmodestsp.BmodestspPackage
 * @generated
 */
public interface BmodestspFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BmodestspFactory eINSTANCE = sc.ndt.editor.bmodes.bmodestsp.impl.BmodestspFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model Bmodestsp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Bmodestsp</em>'.
   * @generated
   */
  ModelBmodestsp createModelBmodestsp();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  Header createHeader();

  /**
   * Returns a new object of class '<em>iNodes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>iNodes</em>'.
   * @generated
   */
  iNodes createiNodes();

  /**
   * Returns a new object of class '<em>aSec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>aSec</em>'.
   * @generated
   */
  aSec createaSec();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BmodestspPackage getBmodestspPackage();

} //BmodestspFactory
