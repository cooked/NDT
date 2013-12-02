/**
 */
package sc.ndt.editor.bmodes.bmodesbmi.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiFactory;
import sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage;
import sc.ndt.editor.bmodes.bmodesbmi.Header;
import sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi;
import sc.ndt.editor.bmodes.bmodesbmi.Section;
import sc.ndt.editor.bmodes.bmodesbmi.aElLoc;
import sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach;
import sc.ndt.editor.bmodes.bmodesbmi.aTwrWires;
import sc.ndt.editor.bmodes.bmodesbmi.aWireAngle;
import sc.ndt.editor.bmodes.bmodesbmi.aWireStiff;
import sc.ndt.editor.bmodes.bmodesbmi.bEcho;
import sc.ndt.editor.bmodes.bmodesbmi.bMidNodeTw;
import sc.ndt.editor.bmodes.bmodesbmi.bTabDelim;
import sc.ndt.editor.bmodes.bmodesbmi.iBeamType;
import sc.ndt.editor.bmodes.bmodesbmi.iHubConn;
import sc.ndt.editor.bmodes.bmodesbmi.iIdMat;
import sc.ndt.editor.bmodes.bmodesbmi.iModePr;
import sc.ndt.editor.bmodes.bmodesbmi.iNSelt;
import sc.ndt.editor.bmodes.bmodesbmi.iSecFile;
import sc.ndt.editor.bmodes.bmodesbmi.iTwrAttach;
import sc.ndt.editor.bmodes.bmodesbmi.iTwrSupport;
import sc.ndt.editor.bmodes.bmodesbmi.nAxiStfMult;
import sc.ndt.editor.bmodes.bmodesbmi.nBlThp;
import sc.ndt.editor.bmodes.bmodesbmi.nCgOffsMult;
import sc.ndt.editor.bmodes.bmodesbmi.nCmAxial;
import sc.ndt.editor.bmodes.bmodesbmi.nCmLoc;
import sc.ndt.editor.bmodes.bmodesbmi.nEdgStfMult;
import sc.ndt.editor.bmodes.bmodesbmi.nFlpInrMult;
import sc.ndt.editor.bmodes.bmodesbmi.nFlpstfMult;
import sc.ndt.editor.bmodes.bmodesbmi.nHubRad;
import sc.ndt.editor.bmodes.bmodesbmi.nIxxTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIxyTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIyyTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIyzTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIzxTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIzzTip;
import sc.ndt.editor.bmodes.bmodesbmi.nLagInrMult;
import sc.ndt.editor.bmodes.bmodesbmi.nPrecone;
import sc.ndt.editor.bmodes.bmodesbmi.nRadius;
import sc.ndt.editor.bmodes.bmodesbmi.nRotRpm;
import sc.ndt.editor.bmodes.bmodesbmi.nRpmMult;
import sc.ndt.editor.bmodes.bmodesbmi.nScOffsMult;
import sc.ndt.editor.bmodes.bmodesbmi.nSecMasMult;
import sc.ndt.editor.bmodes.bmodesbmi.nTcOffsMult;
import sc.ndt.editor.bmodes.bmodesbmi.nTipMass;
import sc.ndt.editor.bmodes.bmodesbmi.nTorStfMult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BmodesbmiPackageImpl extends EPackageImpl implements BmodesbmiPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelBmodesbmiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bEchoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iBeamTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRotRpmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRpmMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRadiusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHubRadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPreconeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nBlThpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iHubConnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iModePrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTabDelimEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bMidNodeTwEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTipMassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nCmLocEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nCmAxialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIxxTipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIyyTipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIzzTipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIxyTipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIzxTipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIyzTipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iIdMatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iSecFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nSecMasMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nFlpInrMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nLagInrMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nFlpstfMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nEdgStfMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTorStfMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nAxiStfMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nCgOffsMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nScOffsMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTcOffsMultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iNSeltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aElLocEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iTwrSupportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iTwrAttachEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aTwrWiresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aNodeAttachEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aWireStiffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aWireAngleEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BmodesbmiPackageImpl()
  {
    super(eNS_URI, BmodesbmiFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BmodesbmiPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BmodesbmiPackage init()
  {
    if (isInited) return (BmodesbmiPackage)EPackage.Registry.INSTANCE.getEPackage(BmodesbmiPackage.eNS_URI);

    // Obtain or create and register package
    BmodesbmiPackageImpl theBmodesbmiPackage = (BmodesbmiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BmodesbmiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BmodesbmiPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBmodesbmiPackage.createPackageContents();

    // Initialize created meta-data
    theBmodesbmiPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBmodesbmiPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BmodesbmiPackage.eNS_URI, theBmodesbmiPackage);
    return theBmodesbmiPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelBmodesbmi()
  {
    return modelBmodesbmiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_Head()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_Sec()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_Echo()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_BeamType()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_RotRpm()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_RpmMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_Radius()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_HubRad()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_PreCone()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_BlThp()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_HubConn()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_ModePr()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_TabDelim()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_MidNodeTw()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_TipMass()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_CmLoc()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_CmAxial()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_IxxTip()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_IyyTip()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_IzzTip()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_IxyTip()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_IzxTip()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_IyzTip()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_IdMat()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_SecFile()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_SecMasMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_FlpInrMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_LagInrMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_FlpstfMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_EdgStfMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_TorStfMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_AxiStfMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_CgOffsMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_ScOffsMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_TcOffsMult()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_NSelt()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_ElLoc()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_TwrSupport()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_TwrAttach()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_TwrWires()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_NodeAttach()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_WireStiff()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBmodesbmi_WireAngle()
  {
    return (EReference)modelBmodesbmiEClass.getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader()
  {
    return headerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader_Name()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader_Desc()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Name()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbEcho()
  {
    return bEchoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbEcho_Value()
  {
    return (EAttribute)bEchoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbEcho_Name()
  {
    return (EAttribute)bEchoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiBeamType()
  {
    return iBeamTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiBeamType_Value()
  {
    return (EAttribute)iBeamTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiBeamType_Name()
  {
    return (EAttribute)iBeamTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRotRpm()
  {
    return nRotRpmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRotRpm_Value()
  {
    return (EAttribute)nRotRpmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRotRpm_Name()
  {
    return (EAttribute)nRotRpmEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRpmMult()
  {
    return nRpmMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRpmMult_Value()
  {
    return (EAttribute)nRpmMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRpmMult_Name()
  {
    return (EAttribute)nRpmMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRadius()
  {
    return nRadiusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRadius_Value()
  {
    return (EAttribute)nRadiusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRadius_Name()
  {
    return (EAttribute)nRadiusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHubRad()
  {
    return nHubRadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubRad_Value()
  {
    return (EAttribute)nHubRadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubRad_Name()
  {
    return (EAttribute)nHubRadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPrecone()
  {
    return nPreconeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPrecone_Value()
  {
    return (EAttribute)nPreconeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPrecone_Name()
  {
    return (EAttribute)nPreconeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnBlThp()
  {
    return nBlThpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlThp_Value()
  {
    return (EAttribute)nBlThpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnBlThp_Name()
  {
    return (EAttribute)nBlThpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiHubConn()
  {
    return iHubConnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiHubConn_Value()
  {
    return (EAttribute)iHubConnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiHubConn_Name()
  {
    return (EAttribute)iHubConnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiModePr()
  {
    return iModePrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiModePr_Value()
  {
    return (EAttribute)iModePrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiModePr_Name()
  {
    return (EAttribute)iModePrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTabDelim()
  {
    return bTabDelimEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTabDelim_Value()
  {
    return (EAttribute)bTabDelimEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTabDelim_Name()
  {
    return (EAttribute)bTabDelimEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbMidNodeTw()
  {
    return bMidNodeTwEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbMidNodeTw_Value()
  {
    return (EAttribute)bMidNodeTwEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbMidNodeTw_Name()
  {
    return (EAttribute)bMidNodeTwEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTipMass()
  {
    return nTipMassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipMass_Value()
  {
    return (EAttribute)nTipMassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTipMass_Name()
  {
    return (EAttribute)nTipMassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnCmLoc()
  {
    return nCmLocEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCmLoc_Value()
  {
    return (EAttribute)nCmLocEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCmLoc_Name()
  {
    return (EAttribute)nCmLocEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnCmAxial()
  {
    return nCmAxialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCmAxial_Value()
  {
    return (EAttribute)nCmAxialEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCmAxial_Name()
  {
    return (EAttribute)nCmAxialEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIxxTip()
  {
    return nIxxTipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIxxTip_Value()
  {
    return (EAttribute)nIxxTipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIxxTip_Name()
  {
    return (EAttribute)nIxxTipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIyyTip()
  {
    return nIyyTipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIyyTip_Value()
  {
    return (EAttribute)nIyyTipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIyyTip_Name()
  {
    return (EAttribute)nIyyTipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIzzTip()
  {
    return nIzzTipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIzzTip_Value()
  {
    return (EAttribute)nIzzTipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIzzTip_Name()
  {
    return (EAttribute)nIzzTipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIxyTip()
  {
    return nIxyTipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIxyTip_Value()
  {
    return (EAttribute)nIxyTipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIxyTip_Name()
  {
    return (EAttribute)nIxyTipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIzxTip()
  {
    return nIzxTipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIzxTip_Value()
  {
    return (EAttribute)nIzxTipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIzxTip_Name()
  {
    return (EAttribute)nIzxTipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIyzTip()
  {
    return nIyzTipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIyzTip_Value()
  {
    return (EAttribute)nIyzTipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIyzTip_Name()
  {
    return (EAttribute)nIyzTipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiIdMat()
  {
    return iIdMatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiIdMat_Value()
  {
    return (EAttribute)iIdMatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiIdMat_Name()
  {
    return (EAttribute)iIdMatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiSecFile()
  {
    return iSecFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiSecFile_Value()
  {
    return (EAttribute)iSecFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiSecFile_Name()
  {
    return (EAttribute)iSecFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnSecMasMult()
  {
    return nSecMasMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSecMasMult_Value()
  {
    return (EAttribute)nSecMasMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnSecMasMult_Name()
  {
    return (EAttribute)nSecMasMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnFlpInrMult()
  {
    return nFlpInrMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFlpInrMult_Value()
  {
    return (EAttribute)nFlpInrMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFlpInrMult_Name()
  {
    return (EAttribute)nFlpInrMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnLagInrMult()
  {
    return nLagInrMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnLagInrMult_Value()
  {
    return (EAttribute)nLagInrMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnLagInrMult_Name()
  {
    return (EAttribute)nLagInrMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnFlpstfMult()
  {
    return nFlpstfMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFlpstfMult_Value()
  {
    return (EAttribute)nFlpstfMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnFlpstfMult_Name()
  {
    return (EAttribute)nFlpstfMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnEdgStfMult()
  {
    return nEdgStfMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnEdgStfMult_Value()
  {
    return (EAttribute)nEdgStfMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnEdgStfMult_Name()
  {
    return (EAttribute)nEdgStfMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTorStfMult()
  {
    return nTorStfMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTorStfMult_Value()
  {
    return (EAttribute)nTorStfMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTorStfMult_Name()
  {
    return (EAttribute)nTorStfMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnAxiStfMult()
  {
    return nAxiStfMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAxiStfMult_Value()
  {
    return (EAttribute)nAxiStfMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAxiStfMult_Name()
  {
    return (EAttribute)nAxiStfMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnCgOffsMult()
  {
    return nCgOffsMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCgOffsMult_Value()
  {
    return (EAttribute)nCgOffsMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCgOffsMult_Name()
  {
    return (EAttribute)nCgOffsMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnScOffsMult()
  {
    return nScOffsMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnScOffsMult_Value()
  {
    return (EAttribute)nScOffsMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnScOffsMult_Name()
  {
    return (EAttribute)nScOffsMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTcOffsMult()
  {
    return nTcOffsMultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTcOffsMult_Value()
  {
    return (EAttribute)nTcOffsMultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTcOffsMult_Name()
  {
    return (EAttribute)nTcOffsMultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiNSelt()
  {
    return iNSeltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNSelt_Value()
  {
    return (EAttribute)iNSeltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNSelt_Name()
  {
    return (EAttribute)iNSeltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaElLoc()
  {
    return aElLocEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaElLoc_El_loc()
  {
    return (EAttribute)aElLocEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiTwrSupport()
  {
    return iTwrSupportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiTwrSupport_Value()
  {
    return (EAttribute)iTwrSupportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiTwrSupport_Name()
  {
    return (EAttribute)iTwrSupportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiTwrAttach()
  {
    return iTwrAttachEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiTwrAttach_Value()
  {
    return (EAttribute)iTwrAttachEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiTwrAttach_Name()
  {
    return (EAttribute)iTwrAttachEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaTwrWires()
  {
    return aTwrWiresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrWires_El_loc()
  {
    return (EAttribute)aTwrWiresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaTwrWires_Name()
  {
    return (EAttribute)aTwrWiresEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaNodeAttach()
  {
    return aNodeAttachEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaNodeAttach_El_loc()
  {
    return (EAttribute)aNodeAttachEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaNodeAttach_Name()
  {
    return (EAttribute)aNodeAttachEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaWireStiff()
  {
    return aWireStiffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaWireStiff_El_loc()
  {
    return (EAttribute)aWireStiffEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaWireStiff_Name()
  {
    return (EAttribute)aWireStiffEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaWireAngle()
  {
    return aWireAngleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaWireAngle_El_loc()
  {
    return (EAttribute)aWireAngleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaWireAngle_Name()
  {
    return (EAttribute)aWireAngleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesbmiFactory getBmodesbmiFactory()
  {
    return (BmodesbmiFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelBmodesbmiEClass = createEClass(MODEL_BMODESBMI);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__HEAD);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__SEC);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__ECHO);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__BEAM_TYPE);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__ROT_RPM);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__RPM_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__RADIUS);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__HUB_RAD);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__PRE_CONE);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__BL_THP);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__HUB_CONN);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__MODE_PR);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__TAB_DELIM);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__MID_NODE_TW);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__TIP_MASS);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__CM_LOC);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__CM_AXIAL);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__IXX_TIP);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__IYY_TIP);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__IZZ_TIP);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__IXY_TIP);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__IZX_TIP);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__IYZ_TIP);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__ID_MAT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__SEC_FILE);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__SEC_MAS_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__FLP_INR_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__LAG_INR_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__FLPSTF_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__EDG_STF_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__TOR_STF_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__AXI_STF_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__CG_OFFS_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__SC_OFFS_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__TC_OFFS_MULT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__NSELT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__EL_LOC);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__TWR_SUPPORT);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__TWR_ATTACH);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__TWR_WIRES);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__NODE_ATTACH);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__WIRE_STIFF);
    createEReference(modelBmodesbmiEClass, MODEL_BMODESBMI__WIRE_ANGLE);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__NAME);
    createEAttribute(headerEClass, HEADER__DESC);

    sectionEClass = createEClass(SECTION);
    createEAttribute(sectionEClass, SECTION__NAME);

    bEchoEClass = createEClass(BECHO);
    createEAttribute(bEchoEClass, BECHO__VALUE);
    createEAttribute(bEchoEClass, BECHO__NAME);

    iBeamTypeEClass = createEClass(IBEAM_TYPE);
    createEAttribute(iBeamTypeEClass, IBEAM_TYPE__VALUE);
    createEAttribute(iBeamTypeEClass, IBEAM_TYPE__NAME);

    nRotRpmEClass = createEClass(NROT_RPM);
    createEAttribute(nRotRpmEClass, NROT_RPM__VALUE);
    createEAttribute(nRotRpmEClass, NROT_RPM__NAME);

    nRpmMultEClass = createEClass(NRPM_MULT);
    createEAttribute(nRpmMultEClass, NRPM_MULT__VALUE);
    createEAttribute(nRpmMultEClass, NRPM_MULT__NAME);

    nRadiusEClass = createEClass(NRADIUS);
    createEAttribute(nRadiusEClass, NRADIUS__VALUE);
    createEAttribute(nRadiusEClass, NRADIUS__NAME);

    nHubRadEClass = createEClass(NHUB_RAD);
    createEAttribute(nHubRadEClass, NHUB_RAD__VALUE);
    createEAttribute(nHubRadEClass, NHUB_RAD__NAME);

    nPreconeEClass = createEClass(NPRECONE);
    createEAttribute(nPreconeEClass, NPRECONE__VALUE);
    createEAttribute(nPreconeEClass, NPRECONE__NAME);

    nBlThpEClass = createEClass(NBL_THP);
    createEAttribute(nBlThpEClass, NBL_THP__VALUE);
    createEAttribute(nBlThpEClass, NBL_THP__NAME);

    iHubConnEClass = createEClass(IHUB_CONN);
    createEAttribute(iHubConnEClass, IHUB_CONN__VALUE);
    createEAttribute(iHubConnEClass, IHUB_CONN__NAME);

    iModePrEClass = createEClass(IMODE_PR);
    createEAttribute(iModePrEClass, IMODE_PR__VALUE);
    createEAttribute(iModePrEClass, IMODE_PR__NAME);

    bTabDelimEClass = createEClass(BTAB_DELIM);
    createEAttribute(bTabDelimEClass, BTAB_DELIM__VALUE);
    createEAttribute(bTabDelimEClass, BTAB_DELIM__NAME);

    bMidNodeTwEClass = createEClass(BMID_NODE_TW);
    createEAttribute(bMidNodeTwEClass, BMID_NODE_TW__VALUE);
    createEAttribute(bMidNodeTwEClass, BMID_NODE_TW__NAME);

    nTipMassEClass = createEClass(NTIP_MASS);
    createEAttribute(nTipMassEClass, NTIP_MASS__VALUE);
    createEAttribute(nTipMassEClass, NTIP_MASS__NAME);

    nCmLocEClass = createEClass(NCM_LOC);
    createEAttribute(nCmLocEClass, NCM_LOC__VALUE);
    createEAttribute(nCmLocEClass, NCM_LOC__NAME);

    nCmAxialEClass = createEClass(NCM_AXIAL);
    createEAttribute(nCmAxialEClass, NCM_AXIAL__VALUE);
    createEAttribute(nCmAxialEClass, NCM_AXIAL__NAME);

    nIxxTipEClass = createEClass(NIXX_TIP);
    createEAttribute(nIxxTipEClass, NIXX_TIP__VALUE);
    createEAttribute(nIxxTipEClass, NIXX_TIP__NAME);

    nIyyTipEClass = createEClass(NIYY_TIP);
    createEAttribute(nIyyTipEClass, NIYY_TIP__VALUE);
    createEAttribute(nIyyTipEClass, NIYY_TIP__NAME);

    nIzzTipEClass = createEClass(NIZZ_TIP);
    createEAttribute(nIzzTipEClass, NIZZ_TIP__VALUE);
    createEAttribute(nIzzTipEClass, NIZZ_TIP__NAME);

    nIxyTipEClass = createEClass(NIXY_TIP);
    createEAttribute(nIxyTipEClass, NIXY_TIP__VALUE);
    createEAttribute(nIxyTipEClass, NIXY_TIP__NAME);

    nIzxTipEClass = createEClass(NIZX_TIP);
    createEAttribute(nIzxTipEClass, NIZX_TIP__VALUE);
    createEAttribute(nIzxTipEClass, NIZX_TIP__NAME);

    nIyzTipEClass = createEClass(NIYZ_TIP);
    createEAttribute(nIyzTipEClass, NIYZ_TIP__VALUE);
    createEAttribute(nIyzTipEClass, NIYZ_TIP__NAME);

    iIdMatEClass = createEClass(IID_MAT);
    createEAttribute(iIdMatEClass, IID_MAT__VALUE);
    createEAttribute(iIdMatEClass, IID_MAT__NAME);

    iSecFileEClass = createEClass(ISEC_FILE);
    createEAttribute(iSecFileEClass, ISEC_FILE__VALUE);
    createEAttribute(iSecFileEClass, ISEC_FILE__NAME);

    nSecMasMultEClass = createEClass(NSEC_MAS_MULT);
    createEAttribute(nSecMasMultEClass, NSEC_MAS_MULT__VALUE);
    createEAttribute(nSecMasMultEClass, NSEC_MAS_MULT__NAME);

    nFlpInrMultEClass = createEClass(NFLP_INR_MULT);
    createEAttribute(nFlpInrMultEClass, NFLP_INR_MULT__VALUE);
    createEAttribute(nFlpInrMultEClass, NFLP_INR_MULT__NAME);

    nLagInrMultEClass = createEClass(NLAG_INR_MULT);
    createEAttribute(nLagInrMultEClass, NLAG_INR_MULT__VALUE);
    createEAttribute(nLagInrMultEClass, NLAG_INR_MULT__NAME);

    nFlpstfMultEClass = createEClass(NFLPSTF_MULT);
    createEAttribute(nFlpstfMultEClass, NFLPSTF_MULT__VALUE);
    createEAttribute(nFlpstfMultEClass, NFLPSTF_MULT__NAME);

    nEdgStfMultEClass = createEClass(NEDG_STF_MULT);
    createEAttribute(nEdgStfMultEClass, NEDG_STF_MULT__VALUE);
    createEAttribute(nEdgStfMultEClass, NEDG_STF_MULT__NAME);

    nTorStfMultEClass = createEClass(NTOR_STF_MULT);
    createEAttribute(nTorStfMultEClass, NTOR_STF_MULT__VALUE);
    createEAttribute(nTorStfMultEClass, NTOR_STF_MULT__NAME);

    nAxiStfMultEClass = createEClass(NAXI_STF_MULT);
    createEAttribute(nAxiStfMultEClass, NAXI_STF_MULT__VALUE);
    createEAttribute(nAxiStfMultEClass, NAXI_STF_MULT__NAME);

    nCgOffsMultEClass = createEClass(NCG_OFFS_MULT);
    createEAttribute(nCgOffsMultEClass, NCG_OFFS_MULT__VALUE);
    createEAttribute(nCgOffsMultEClass, NCG_OFFS_MULT__NAME);

    nScOffsMultEClass = createEClass(NSC_OFFS_MULT);
    createEAttribute(nScOffsMultEClass, NSC_OFFS_MULT__VALUE);
    createEAttribute(nScOffsMultEClass, NSC_OFFS_MULT__NAME);

    nTcOffsMultEClass = createEClass(NTC_OFFS_MULT);
    createEAttribute(nTcOffsMultEClass, NTC_OFFS_MULT__VALUE);
    createEAttribute(nTcOffsMultEClass, NTC_OFFS_MULT__NAME);

    iNSeltEClass = createEClass(IN_SELT);
    createEAttribute(iNSeltEClass, IN_SELT__VALUE);
    createEAttribute(iNSeltEClass, IN_SELT__NAME);

    aElLocEClass = createEClass(AEL_LOC);
    createEAttribute(aElLocEClass, AEL_LOC__EL_LOC);

    iTwrSupportEClass = createEClass(ITWR_SUPPORT);
    createEAttribute(iTwrSupportEClass, ITWR_SUPPORT__VALUE);
    createEAttribute(iTwrSupportEClass, ITWR_SUPPORT__NAME);

    iTwrAttachEClass = createEClass(ITWR_ATTACH);
    createEAttribute(iTwrAttachEClass, ITWR_ATTACH__VALUE);
    createEAttribute(iTwrAttachEClass, ITWR_ATTACH__NAME);

    aTwrWiresEClass = createEClass(ATWR_WIRES);
    createEAttribute(aTwrWiresEClass, ATWR_WIRES__EL_LOC);
    createEAttribute(aTwrWiresEClass, ATWR_WIRES__NAME);

    aNodeAttachEClass = createEClass(ANODE_ATTACH);
    createEAttribute(aNodeAttachEClass, ANODE_ATTACH__EL_LOC);
    createEAttribute(aNodeAttachEClass, ANODE_ATTACH__NAME);

    aWireStiffEClass = createEClass(AWIRE_STIFF);
    createEAttribute(aWireStiffEClass, AWIRE_STIFF__EL_LOC);
    createEAttribute(aWireStiffEClass, AWIRE_STIFF__NAME);

    aWireAngleEClass = createEClass(AWIRE_ANGLE);
    createEAttribute(aWireAngleEClass, AWIRE_ANGLE__EL_LOC);
    createEAttribute(aWireAngleEClass, AWIRE_ANGLE__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelBmodesbmiEClass, ModelBmodesbmi.class, "ModelBmodesbmi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelBmodesbmi_Head(), this.getHeader(), null, "Head", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_Sec(), this.getSection(), null, "sec", null, 0, -1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_Echo(), this.getbEcho(), null, "Echo", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_BeamType(), this.getiBeamType(), null, "BeamType", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_RotRpm(), this.getnRotRpm(), null, "RotRpm", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_RpmMult(), this.getnRpmMult(), null, "RpmMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_Radius(), this.getnRadius(), null, "Radius", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_HubRad(), this.getnHubRad(), null, "HubRad", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_PreCone(), this.getnPrecone(), null, "PreCone", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_BlThp(), this.getnBlThp(), null, "BlThp", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_HubConn(), this.getiHubConn(), null, "HubConn", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_ModePr(), this.getiModePr(), null, "ModePr", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_TabDelim(), this.getbTabDelim(), null, "TabDelim", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_MidNodeTw(), this.getbMidNodeTw(), null, "MidNodeTw", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_TipMass(), this.getnTipMass(), null, "TipMass", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_CmLoc(), this.getnCmLoc(), null, "CmLoc", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_CmAxial(), this.getnCmAxial(), null, "CmAxial", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_IxxTip(), this.getnIxxTip(), null, "IxxTip", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_IyyTip(), this.getnIyyTip(), null, "IyyTip", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_IzzTip(), this.getnIzzTip(), null, "IzzTip", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_IxyTip(), this.getnIxyTip(), null, "IxyTip", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_IzxTip(), this.getnIzxTip(), null, "IzxTip", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_IyzTip(), this.getnIyzTip(), null, "IyzTip", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_IdMat(), this.getiIdMat(), null, "IdMat", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_SecFile(), this.getiSecFile(), null, "SecFile", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_SecMasMult(), this.getnSecMasMult(), null, "SecMasMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_FlpInrMult(), this.getnFlpInrMult(), null, "FlpInrMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_LagInrMult(), this.getnLagInrMult(), null, "LagInrMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_FlpstfMult(), this.getnFlpstfMult(), null, "FlpstfMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_EdgStfMult(), this.getnEdgStfMult(), null, "EdgStfMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_TorStfMult(), this.getnTorStfMult(), null, "TorStfMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_AxiStfMult(), this.getnAxiStfMult(), null, "AxiStfMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_CgOffsMult(), this.getnCgOffsMult(), null, "CgOffsMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_ScOffsMult(), this.getnScOffsMult(), null, "ScOffsMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_TcOffsMult(), this.getnTcOffsMult(), null, "TcOffsMult", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_NSelt(), this.getiNSelt(), null, "NSelt", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_ElLoc(), this.getaElLoc(), null, "ElLoc", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_TwrSupport(), this.getiTwrSupport(), null, "TwrSupport", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_TwrAttach(), this.getiTwrAttach(), null, "TwrAttach", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_TwrWires(), this.getaTwrWires(), null, "TwrWires", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_NodeAttach(), this.getaNodeAttach(), null, "NodeAttach", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_WireStiff(), this.getaWireStiff(), null, "WireStiff", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBmodesbmi_WireAngle(), this.getaWireAngle(), null, "WireAngle", null, 0, 1, ModelBmodesbmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHeader_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bEchoEClass, bEcho.class, "bEcho", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbEcho_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bEcho.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbEcho_Name(), ecorePackage.getEString(), "name", null, 0, 1, bEcho.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iBeamTypeEClass, iBeamType.class, "iBeamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiBeamType_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iBeamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiBeamType_Name(), ecorePackage.getEString(), "name", null, 0, 1, iBeamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRotRpmEClass, nRotRpm.class, "nRotRpm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRotRpm_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nRotRpm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnRotRpm_Name(), ecorePackage.getEString(), "name", null, 0, 1, nRotRpm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRpmMultEClass, nRpmMult.class, "nRpmMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRpmMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nRpmMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnRpmMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nRpmMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRadiusEClass, nRadius.class, "nRadius", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRadius_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nRadius.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnRadius_Name(), ecorePackage.getEString(), "name", null, 0, 1, nRadius.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nHubRadEClass, nHubRad.class, "nHubRad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnHubRad_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nHubRad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnHubRad_Name(), ecorePackage.getEString(), "name", null, 0, 1, nHubRad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nPreconeEClass, nPrecone.class, "nPrecone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnPrecone_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nPrecone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnPrecone_Name(), ecorePackage.getEString(), "name", null, 0, 1, nPrecone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nBlThpEClass, nBlThp.class, "nBlThp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnBlThp_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nBlThp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnBlThp_Name(), ecorePackage.getEString(), "name", null, 0, 1, nBlThp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iHubConnEClass, iHubConn.class, "iHubConn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiHubConn_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iHubConn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiHubConn_Name(), ecorePackage.getEString(), "name", null, 0, 1, iHubConn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iModePrEClass, iModePr.class, "iModePr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiModePr_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iModePr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiModePr_Name(), ecorePackage.getEString(), "name", null, 0, 1, iModePr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bTabDelimEClass, bTabDelim.class, "bTabDelim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbTabDelim_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bTabDelim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbTabDelim_Name(), ecorePackage.getEString(), "name", null, 0, 1, bTabDelim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bMidNodeTwEClass, bMidNodeTw.class, "bMidNodeTw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbMidNodeTw_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bMidNodeTw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbMidNodeTw_Name(), ecorePackage.getEString(), "name", null, 0, 1, bMidNodeTw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTipMassEClass, nTipMass.class, "nTipMass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTipMass_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTipMass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTipMass_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTipMass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nCmLocEClass, nCmLoc.class, "nCmLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnCmLoc_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nCmLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnCmLoc_Name(), ecorePackage.getEString(), "name", null, 0, 1, nCmLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nCmAxialEClass, nCmAxial.class, "nCmAxial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnCmAxial_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nCmAxial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnCmAxial_Name(), ecorePackage.getEString(), "name", null, 0, 1, nCmAxial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIxxTipEClass, nIxxTip.class, "nIxxTip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIxxTip_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nIxxTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIxxTip_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIxxTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIyyTipEClass, nIyyTip.class, "nIyyTip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIyyTip_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nIyyTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIyyTip_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIyyTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIzzTipEClass, nIzzTip.class, "nIzzTip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIzzTip_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nIzzTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIzzTip_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIzzTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIxyTipEClass, nIxyTip.class, "nIxyTip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIxyTip_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nIxyTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIxyTip_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIxyTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIzxTipEClass, nIzxTip.class, "nIzxTip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIzxTip_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nIzxTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIzxTip_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIzxTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIyzTipEClass, nIyzTip.class, "nIyzTip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIyzTip_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nIyzTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIyzTip_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIyzTip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iIdMatEClass, iIdMat.class, "iIdMat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiIdMat_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iIdMat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiIdMat_Name(), ecorePackage.getEString(), "name", null, 0, 1, iIdMat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iSecFileEClass, iSecFile.class, "iSecFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiSecFile_Value(), ecorePackage.getEString(), "value", null, 0, 1, iSecFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiSecFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, iSecFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nSecMasMultEClass, nSecMasMult.class, "nSecMasMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnSecMasMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nSecMasMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnSecMasMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nSecMasMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nFlpInrMultEClass, nFlpInrMult.class, "nFlpInrMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnFlpInrMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nFlpInrMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnFlpInrMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nFlpInrMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nLagInrMultEClass, nLagInrMult.class, "nLagInrMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnLagInrMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nLagInrMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnLagInrMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nLagInrMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nFlpstfMultEClass, nFlpstfMult.class, "nFlpstfMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnFlpstfMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nFlpstfMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnFlpstfMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nFlpstfMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nEdgStfMultEClass, nEdgStfMult.class, "nEdgStfMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnEdgStfMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nEdgStfMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnEdgStfMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nEdgStfMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTorStfMultEClass, nTorStfMult.class, "nTorStfMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTorStfMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTorStfMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTorStfMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTorStfMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nAxiStfMultEClass, nAxiStfMult.class, "nAxiStfMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnAxiStfMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nAxiStfMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAxiStfMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nAxiStfMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nCgOffsMultEClass, nCgOffsMult.class, "nCgOffsMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnCgOffsMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nCgOffsMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnCgOffsMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nCgOffsMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nScOffsMultEClass, nScOffsMult.class, "nScOffsMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnScOffsMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nScOffsMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnScOffsMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nScOffsMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTcOffsMultEClass, nTcOffsMult.class, "nTcOffsMult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTcOffsMult_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTcOffsMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTcOffsMult_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTcOffsMult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iNSeltEClass, iNSelt.class, "iNSelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiNSelt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iNSelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiNSelt_Name(), ecorePackage.getEString(), "name", null, 0, 1, iNSelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aElLocEClass, aElLoc.class, "aElLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaElLoc_El_loc(), ecorePackage.getEFloat(), "el_loc", null, 0, -1, aElLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iTwrSupportEClass, iTwrSupport.class, "iTwrSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiTwrSupport_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iTwrSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiTwrSupport_Name(), ecorePackage.getEString(), "name", null, 0, 1, iTwrSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iTwrAttachEClass, iTwrAttach.class, "iTwrAttach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiTwrAttach_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iTwrAttach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiTwrAttach_Name(), ecorePackage.getEString(), "name", null, 0, 1, iTwrAttach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aTwrWiresEClass, aTwrWires.class, "aTwrWires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaTwrWires_El_loc(), ecorePackage.getEInt(), "el_loc", null, 0, -1, aTwrWires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaTwrWires_Name(), ecorePackage.getEString(), "name", null, 0, 1, aTwrWires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aNodeAttachEClass, aNodeAttach.class, "aNodeAttach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaNodeAttach_El_loc(), ecorePackage.getEInt(), "el_loc", null, 0, -1, aNodeAttach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaNodeAttach_Name(), ecorePackage.getEString(), "name", null, 0, 1, aNodeAttach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aWireStiffEClass, aWireStiff.class, "aWireStiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaWireStiff_El_loc(), ecorePackage.getEFloat(), "el_loc", null, 0, -1, aWireStiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaWireStiff_Name(), ecorePackage.getEString(), "name", null, 0, 1, aWireStiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aWireAngleEClass, aWireAngle.class, "aWireAngle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaWireAngle_El_loc(), ecorePackage.getEFloat(), "el_loc", null, 0, -1, aWireAngle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaWireAngle_Name(), ecorePackage.getEString(), "name", null, 0, 1, aWireAngle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BmodesbmiPackageImpl
