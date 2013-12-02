/**
 */
package sc.ndt.editor.bmodes.bmodesout.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.bmodes.bmodesout.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BmodesoutFactoryImpl extends EFactoryImpl implements BmodesoutFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BmodesoutFactory init()
  {
    try
    {
      BmodesoutFactory theBmodesoutFactory = (BmodesoutFactory)EPackage.Registry.INSTANCE.getEFactory(BmodesoutPackage.eNS_URI);
      if (theBmodesoutFactory != null)
      {
        return theBmodesoutFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BmodesoutFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesoutFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BmodesoutPackage.MODEL_BMODESOUT: return createModelBmodesout();
      case BmodesoutPackage.HEADER: return createHeader();
      case BmodesoutPackage.MODE: return createMode();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelBmodesout createModelBmodesout()
  {
    ModelBmodesoutImpl modelBmodesout = new ModelBmodesoutImpl();
    return modelBmodesout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode createMode()
  {
    ModeImpl mode = new ModeImpl();
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesoutPackage getBmodesoutPackage()
  {
    return (BmodesoutPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BmodesoutPackage getPackage()
  {
    return BmodesoutPackage.eINSTANCE;
  }

} //BmodesoutFactoryImpl
