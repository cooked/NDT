/**
 */
package sc.ndt.editor.iecwind.iecwindiec.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.iecwind.iecwindiec.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IecwindiecFactoryImpl extends EFactoryImpl implements IecwindiecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IecwindiecFactory init()
  {
    try
    {
      IecwindiecFactory theIecwindiecFactory = (IecwindiecFactory)EPackage.Registry.INSTANCE.getEFactory(IecwindiecPackage.eNS_URI);
      if (theIecwindiecFactory != null)
      {
        return theIecwindiecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IecwindiecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IecwindiecFactoryImpl()
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
      case IecwindiecPackage.MODEL_IECWINDIEC: return createModelIecwindiec();
      case IecwindiecPackage.HEADER: return createHeader();
      case IecwindiecPackage.SECTION: return createSection();
      case IecwindiecPackage.SI_UNITS: return createsiUnits();
      case IecwindiecPackage.ISTART: return createiStart();
      case IecwindiecPackage.IIEC_CLASS: return createiIECClass();
      case IecwindiecPackage.SWIND_TURB: return createsWindTurb();
      case IecwindiecPackage.NWIND_SLOPE: return createnWindSlope();
      case IecwindiecPackage.IIEC_STD: return createiIECStd();
      case IecwindiecPackage.NHUB_HEIGHT: return createnHubHeight();
      case IecwindiecPackage.NROT_DIAM: return createnRotDiam();
      case IecwindiecPackage.NWIND_IN: return createnWindIn();
      case IecwindiecPackage.NWIND_NOM: return createnWindNom();
      case IecwindiecPackage.NWIND_OUT: return createnWindOut();
      case IecwindiecPackage.VOUT_LIST: return createvOutList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelIecwindiec createModelIecwindiec()
  {
    ModelIecwindiecImpl modelIecwindiec = new ModelIecwindiecImpl();
    return modelIecwindiec;
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
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public siUnits createsiUnits()
  {
    siUnitsImpl siUnits = new siUnitsImpl();
    return siUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iStart createiStart()
  {
    iStartImpl iStart = new iStartImpl();
    return iStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iIECClass createiIECClass()
  {
    iIECClassImpl iIECClass = new iIECClassImpl();
    return iIECClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sWindTurb createsWindTurb()
  {
    sWindTurbImpl sWindTurb = new sWindTurbImpl();
    return sWindTurb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nWindSlope createnWindSlope()
  {
    nWindSlopeImpl nWindSlope = new nWindSlopeImpl();
    return nWindSlope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iIECStd createiIECStd()
  {
    iIECStdImpl iIECStd = new iIECStdImpl();
    return iIECStd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubHeight createnHubHeight()
  {
    nHubHeightImpl nHubHeight = new nHubHeightImpl();
    return nHubHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRotDiam createnRotDiam()
  {
    nRotDiamImpl nRotDiam = new nRotDiamImpl();
    return nRotDiam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nWindIn createnWindIn()
  {
    nWindInImpl nWindIn = new nWindInImpl();
    return nWindIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nWindNom createnWindNom()
  {
    nWindNomImpl nWindNom = new nWindNomImpl();
    return nWindNom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nWindOut createnWindOut()
  {
    nWindOutImpl nWindOut = new nWindOutImpl();
    return nWindOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vOutList createvOutList()
  {
    vOutListImpl vOutList = new vOutListImpl();
    return vOutList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IecwindiecPackage getIecwindiecPackage()
  {
    return (IecwindiecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IecwindiecPackage getPackage()
  {
    return IecwindiecPackage.eINSTANCE;
  }

} //IecwindiecFactoryImpl
