/**
 */
package sc.ndt.editor.iecwind.iecwindiec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage
 * @generated
 */
public interface IecwindiecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IecwindiecFactory eINSTANCE = sc.ndt.editor.iecwind.iecwindiec.impl.IecwindiecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model Iecwindiec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Iecwindiec</em>'.
   * @generated
   */
  ModelIecwindiec createModelIecwindiec();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  Header createHeader();

  /**
   * Returns a new object of class '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Section</em>'.
   * @generated
   */
  Section createSection();

  /**
   * Returns a new object of class '<em>si Units</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>si Units</em>'.
   * @generated
   */
  siUnits createsiUnits();

  /**
   * Returns a new object of class '<em>iStart</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>iStart</em>'.
   * @generated
   */
  iStart createiStart();

  /**
   * Returns a new object of class '<em>iIEC Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>iIEC Class</em>'.
   * @generated
   */
  iIECClass createiIECClass();

  /**
   * Returns a new object of class '<em>sWind Turb</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sWind Turb</em>'.
   * @generated
   */
  sWindTurb createsWindTurb();

  /**
   * Returns a new object of class '<em>nWind Slope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nWind Slope</em>'.
   * @generated
   */
  nWindSlope createnWindSlope();

  /**
   * Returns a new object of class '<em>iIEC Std</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>iIEC Std</em>'.
   * @generated
   */
  iIECStd createiIECStd();

  /**
   * Returns a new object of class '<em>nHub Height</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nHub Height</em>'.
   * @generated
   */
  nHubHeight createnHubHeight();

  /**
   * Returns a new object of class '<em>nRot Diam</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nRot Diam</em>'.
   * @generated
   */
  nRotDiam createnRotDiam();

  /**
   * Returns a new object of class '<em>nWind In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nWind In</em>'.
   * @generated
   */
  nWindIn createnWindIn();

  /**
   * Returns a new object of class '<em>nWind Nom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nWind Nom</em>'.
   * @generated
   */
  nWindNom createnWindNom();

  /**
   * Returns a new object of class '<em>nWind Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nWind Out</em>'.
   * @generated
   */
  nWindOut createnWindOut();

  /**
   * Returns a new object of class '<em>vOut List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>vOut List</em>'.
   * @generated
   */
  vOutList createvOutList();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IecwindiecPackage getIecwindiecPackage();

} //IecwindiecFactory
