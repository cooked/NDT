/**
 */
package sc.ndt.editor.bmodestsp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.bmodestsp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BmodestspFactoryImpl extends EFactoryImpl implements BmodestspFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BmodestspFactory init()
  {
    try
    {
      BmodestspFactory theBmodestspFactory = (BmodestspFactory)EPackage.Registry.INSTANCE.getEFactory(BmodestspPackage.eNS_URI);
      if (theBmodestspFactory != null)
      {
        return theBmodestspFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BmodestspFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodestspFactoryImpl()
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
      case BmodestspPackage.MODEL_BMODESTSP: return createModelBmodestsp();
      case BmodestspPackage.HEADER: return createHeader();
      case BmodestspPackage.INODES: return createiNodes();
      case BmodestspPackage.ASEC: return createaSec();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelBmodestsp createModelBmodestsp()
  {
    ModelBmodestspImpl modelBmodestsp = new ModelBmodestspImpl();
    return modelBmodestsp;
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
  public iNodes createiNodes()
  {
    iNodesImpl iNodes = new iNodesImpl();
    return iNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aSec createaSec()
  {
    aSecImpl aSec = new aSecImpl();
    return aSec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodestspPackage getBmodestspPackage()
  {
    return (BmodestspPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BmodestspPackage getPackage()
  {
    return BmodestspPackage.eINSTANCE;
  }

} //BmodestspFactoryImpl
