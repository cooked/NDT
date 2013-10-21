/**
 */
package sc.ndt.editor.bmodesbmi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sc.ndt.editor.bmodesbmi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BmodesbmiFactoryImpl extends EFactoryImpl implements BmodesbmiFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BmodesbmiFactory init()
  {
    try
    {
      BmodesbmiFactory theBmodesbmiFactory = (BmodesbmiFactory)EPackage.Registry.INSTANCE.getEFactory(BmodesbmiPackage.eNS_URI);
      if (theBmodesbmiFactory != null)
      {
        return theBmodesbmiFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BmodesbmiFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesbmiFactoryImpl()
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
      case BmodesbmiPackage.MODEL_BMODESBMI: return createModelBmodesbmi();
      case BmodesbmiPackage.HEADER: return createHeader();
      case BmodesbmiPackage.SECTION: return createSection();
      case BmodesbmiPackage.BECHO: return createbEcho();
      case BmodesbmiPackage.IBEAM_TYPE: return createiBeamType();
      case BmodesbmiPackage.NROT_RPM: return createnRotRpm();
      case BmodesbmiPackage.NRPM_MULT: return createnRpmMult();
      case BmodesbmiPackage.NRADIUS: return createnRadius();
      case BmodesbmiPackage.NHUB_RAD: return createnHubRad();
      case BmodesbmiPackage.NPRECONE: return createnPrecone();
      case BmodesbmiPackage.NBL_THP: return createnBlThp();
      case BmodesbmiPackage.IHUB_CONN: return createiHubConn();
      case BmodesbmiPackage.IMODE_PR: return createiModePr();
      case BmodesbmiPackage.BTAB_DELIM: return createbTabDelim();
      case BmodesbmiPackage.BMID_NODE_TW: return createbMidNodeTw();
      case BmodesbmiPackage.NTIP_MASS: return createnTipMass();
      case BmodesbmiPackage.NCM_LOC: return createnCmLoc();
      case BmodesbmiPackage.NCM_AXIAL: return createnCmAxial();
      case BmodesbmiPackage.NIXX_TIP: return createnIxxTip();
      case BmodesbmiPackage.NIYY_TIP: return createnIyyTip();
      case BmodesbmiPackage.NIZZ_TIP: return createnIzzTip();
      case BmodesbmiPackage.NIXY_TIP: return createnIxyTip();
      case BmodesbmiPackage.NIZX_TIP: return createnIzxTip();
      case BmodesbmiPackage.NIYZ_TIP: return createnIyzTip();
      case BmodesbmiPackage.IID_MAT: return createiIdMat();
      case BmodesbmiPackage.ISEC_FILE: return createiSecFile();
      case BmodesbmiPackage.NSEC_MAS_MULT: return createnSecMasMult();
      case BmodesbmiPackage.NFLP_INR_MULT: return createnFlpInrMult();
      case BmodesbmiPackage.NLAG_INR_MULT: return createnLagInrMult();
      case BmodesbmiPackage.NFLPSTF_MULT: return createnFlpstfMult();
      case BmodesbmiPackage.NEDG_STF_MULT: return createnEdgStfMult();
      case BmodesbmiPackage.NTOR_STF_MULT: return createnTorStfMult();
      case BmodesbmiPackage.NAXI_STF_MULT: return createnAxiStfMult();
      case BmodesbmiPackage.NCG_OFFS_MULT: return createnCgOffsMult();
      case BmodesbmiPackage.NSC_OFFS_MULT: return createnScOffsMult();
      case BmodesbmiPackage.NTC_OFFS_MULT: return createnTcOffsMult();
      case BmodesbmiPackage.IN_SELT: return createiNSelt();
      case BmodesbmiPackage.AEL_LOC: return createaElLoc();
      case BmodesbmiPackage.ITWR_SUPPORT: return createiTwrSupport();
      case BmodesbmiPackage.ITWR_ATTACH: return createiTwrAttach();
      case BmodesbmiPackage.ATWR_WIRES: return createaTwrWires();
      case BmodesbmiPackage.ANODE_ATTACH: return createaNodeAttach();
      case BmodesbmiPackage.AWIRE_STIFF: return createaWireStiff();
      case BmodesbmiPackage.AWIRE_ANGLE: return createaWireAngle();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelBmodesbmi createModelBmodesbmi()
  {
    ModelBmodesbmiImpl modelBmodesbmi = new ModelBmodesbmiImpl();
    return modelBmodesbmi;
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
  public bEcho createbEcho()
  {
    bEchoImpl bEcho = new bEchoImpl();
    return bEcho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iBeamType createiBeamType()
  {
    iBeamTypeImpl iBeamType = new iBeamTypeImpl();
    return iBeamType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRotRpm createnRotRpm()
  {
    nRotRpmImpl nRotRpm = new nRotRpmImpl();
    return nRotRpm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRpmMult createnRpmMult()
  {
    nRpmMultImpl nRpmMult = new nRpmMultImpl();
    return nRpmMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nRadius createnRadius()
  {
    nRadiusImpl nRadius = new nRadiusImpl();
    return nRadius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nHubRad createnHubRad()
  {
    nHubRadImpl nHubRad = new nHubRadImpl();
    return nHubRad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nPrecone createnPrecone()
  {
    nPreconeImpl nPrecone = new nPreconeImpl();
    return nPrecone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nBlThp createnBlThp()
  {
    nBlThpImpl nBlThp = new nBlThpImpl();
    return nBlThp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iHubConn createiHubConn()
  {
    iHubConnImpl iHubConn = new iHubConnImpl();
    return iHubConn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iModePr createiModePr()
  {
    iModePrImpl iModePr = new iModePrImpl();
    return iModePr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bTabDelim createbTabDelim()
  {
    bTabDelimImpl bTabDelim = new bTabDelimImpl();
    return bTabDelim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bMidNodeTw createbMidNodeTw()
  {
    bMidNodeTwImpl bMidNodeTw = new bMidNodeTwImpl();
    return bMidNodeTw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTipMass createnTipMass()
  {
    nTipMassImpl nTipMass = new nTipMassImpl();
    return nTipMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCmLoc createnCmLoc()
  {
    nCmLocImpl nCmLoc = new nCmLocImpl();
    return nCmLoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCmAxial createnCmAxial()
  {
    nCmAxialImpl nCmAxial = new nCmAxialImpl();
    return nCmAxial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIxxTip createnIxxTip()
  {
    nIxxTipImpl nIxxTip = new nIxxTipImpl();
    return nIxxTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIyyTip createnIyyTip()
  {
    nIyyTipImpl nIyyTip = new nIyyTipImpl();
    return nIyyTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIzzTip createnIzzTip()
  {
    nIzzTipImpl nIzzTip = new nIzzTipImpl();
    return nIzzTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIxyTip createnIxyTip()
  {
    nIxyTipImpl nIxyTip = new nIxyTipImpl();
    return nIxyTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIzxTip createnIzxTip()
  {
    nIzxTipImpl nIzxTip = new nIzxTipImpl();
    return nIzxTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nIyzTip createnIyzTip()
  {
    nIyzTipImpl nIyzTip = new nIyzTipImpl();
    return nIyzTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iIdMat createiIdMat()
  {
    iIdMatImpl iIdMat = new iIdMatImpl();
    return iIdMat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iSecFile createiSecFile()
  {
    iSecFileImpl iSecFile = new iSecFileImpl();
    return iSecFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nSecMasMult createnSecMasMult()
  {
    nSecMasMultImpl nSecMasMult = new nSecMasMultImpl();
    return nSecMasMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFlpInrMult createnFlpInrMult()
  {
    nFlpInrMultImpl nFlpInrMult = new nFlpInrMultImpl();
    return nFlpInrMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nLagInrMult createnLagInrMult()
  {
    nLagInrMultImpl nLagInrMult = new nLagInrMultImpl();
    return nLagInrMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nFlpstfMult createnFlpstfMult()
  {
    nFlpstfMultImpl nFlpstfMult = new nFlpstfMultImpl();
    return nFlpstfMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nEdgStfMult createnEdgStfMult()
  {
    nEdgStfMultImpl nEdgStfMult = new nEdgStfMultImpl();
    return nEdgStfMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTorStfMult createnTorStfMult()
  {
    nTorStfMultImpl nTorStfMult = new nTorStfMultImpl();
    return nTorStfMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAxiStfMult createnAxiStfMult()
  {
    nAxiStfMultImpl nAxiStfMult = new nAxiStfMultImpl();
    return nAxiStfMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nCgOffsMult createnCgOffsMult()
  {
    nCgOffsMultImpl nCgOffsMult = new nCgOffsMultImpl();
    return nCgOffsMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nScOffsMult createnScOffsMult()
  {
    nScOffsMultImpl nScOffsMult = new nScOffsMultImpl();
    return nScOffsMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nTcOffsMult createnTcOffsMult()
  {
    nTcOffsMultImpl nTcOffsMult = new nTcOffsMultImpl();
    return nTcOffsMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iNSelt createiNSelt()
  {
    iNSeltImpl iNSelt = new iNSeltImpl();
    return iNSelt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aElLoc createaElLoc()
  {
    aElLocImpl aElLoc = new aElLocImpl();
    return aElLoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iTwrSupport createiTwrSupport()
  {
    iTwrSupportImpl iTwrSupport = new iTwrSupportImpl();
    return iTwrSupport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public iTwrAttach createiTwrAttach()
  {
    iTwrAttachImpl iTwrAttach = new iTwrAttachImpl();
    return iTwrAttach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aTwrWires createaTwrWires()
  {
    aTwrWiresImpl aTwrWires = new aTwrWiresImpl();
    return aTwrWires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aNodeAttach createaNodeAttach()
  {
    aNodeAttachImpl aNodeAttach = new aNodeAttachImpl();
    return aNodeAttach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aWireStiff createaWireStiff()
  {
    aWireStiffImpl aWireStiff = new aWireStiffImpl();
    return aWireStiff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aWireAngle createaWireAngle()
  {
    aWireAngleImpl aWireAngle = new aWireAngleImpl();
    return aWireAngle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesbmiPackage getBmodesbmiPackage()
  {
    return (BmodesbmiPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BmodesbmiPackage getPackage()
  {
    return BmodesbmiPackage.eINSTANCE;
  }

} //BmodesbmiFactoryImpl
