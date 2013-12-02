/**
 */
package sc.ndt.editor.bmodes.bmodesout;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage
 * @generated
 */
public interface BmodesoutFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BmodesoutFactory eINSTANCE = sc.ndt.editor.bmodes.bmodesout.impl.BmodesoutFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model Bmodesout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Bmodesout</em>'.
   * @generated
   */
  ModelBmodesout createModelBmodesout();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  Header createHeader();

  /**
   * Returns a new object of class '<em>Mode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode</em>'.
   * @generated
   */
  Mode createMode();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BmodesoutPackage getBmodesoutPackage();

} //BmodesoutFactory
