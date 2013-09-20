/**
 */
package sc.ndt.editor.turbsimtbs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.turbsimtbs.TurbsimtbsFactory
 * @model kind="package"
 * @generated
 */
public interface TurbsimtbsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "turbsimtbs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ndt.sc/editor/Turbsimtbs";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "turbsimtbs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TurbsimtbsPackage eINSTANCE = sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl.init();

  /**
   * The meta object id for the '{@link sc.ndt.editor.turbsimtbs.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sc.ndt.editor.turbsimtbs.impl.ModelImpl
   * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__A = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link sc.ndt.editor.turbsimtbs.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see sc.ndt.editor.turbsimtbs.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link sc.ndt.editor.turbsimtbs.Model#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A</em>'.
   * @see sc.ndt.editor.turbsimtbs.Model#getA()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_A();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TurbsimtbsFactory getTurbsimtbsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link sc.ndt.editor.turbsimtbs.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sc.ndt.editor.turbsimtbs.impl.ModelImpl
     * @see sc.ndt.editor.turbsimtbs.impl.TurbsimtbsPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__A = eINSTANCE.getModel_A();

  }

} //TurbsimtbsPackage