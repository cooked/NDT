/**
 */
package sc.ndt.editor.bmodesbmi.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sc.ndt.editor.bmodesbmi.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.bmodesbmi.BmodesbmiPackage
 * @generated
 */
public class BmodesbmiSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BmodesbmiPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesbmiSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BmodesbmiPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BmodesbmiPackage.MODEL_BMODESBMI:
      {
        ModelBmodesbmi modelBmodesbmi = (ModelBmodesbmi)theEObject;
        T result = caseModelBmodesbmi(modelBmodesbmi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.BECHO:
      {
        bEcho bEcho = (bEcho)theEObject;
        T result = casebEcho(bEcho);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.IBEAM_TYPE:
      {
        iBeamType iBeamType = (iBeamType)theEObject;
        T result = caseiBeamType(iBeamType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NROT_RPM:
      {
        nRotRpm nRotRpm = (nRotRpm)theEObject;
        T result = casenRotRpm(nRotRpm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NRPM_MULT:
      {
        nRpmMult nRpmMult = (nRpmMult)theEObject;
        T result = casenRpmMult(nRpmMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NRADIUS:
      {
        nRadius nRadius = (nRadius)theEObject;
        T result = casenRadius(nRadius);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NHUB_RAD:
      {
        nHubRad nHubRad = (nHubRad)theEObject;
        T result = casenHubRad(nHubRad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NPRECONE:
      {
        nPrecone nPrecone = (nPrecone)theEObject;
        T result = casenPrecone(nPrecone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NBL_THP:
      {
        nBlThp nBlThp = (nBlThp)theEObject;
        T result = casenBlThp(nBlThp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.IHUB_CONN:
      {
        iHubConn iHubConn = (iHubConn)theEObject;
        T result = caseiHubConn(iHubConn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.IMODE_PR:
      {
        iModePr iModePr = (iModePr)theEObject;
        T result = caseiModePr(iModePr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.BTAB_DELIM:
      {
        bTabDelim bTabDelim = (bTabDelim)theEObject;
        T result = casebTabDelim(bTabDelim);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.BMID_NODE_TW:
      {
        bMidNodeTw bMidNodeTw = (bMidNodeTw)theEObject;
        T result = casebMidNodeTw(bMidNodeTw);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NTIP_MASS:
      {
        nTipMass nTipMass = (nTipMass)theEObject;
        T result = casenTipMass(nTipMass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NCM_LOC:
      {
        nCmLoc nCmLoc = (nCmLoc)theEObject;
        T result = casenCmLoc(nCmLoc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NCM_AXIAL:
      {
        nCmAxial nCmAxial = (nCmAxial)theEObject;
        T result = casenCmAxial(nCmAxial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NIXX_TIP:
      {
        nIxxTip nIxxTip = (nIxxTip)theEObject;
        T result = casenIxxTip(nIxxTip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NIYY_TIP:
      {
        nIyyTip nIyyTip = (nIyyTip)theEObject;
        T result = casenIyyTip(nIyyTip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NIZZ_TIP:
      {
        nIzzTip nIzzTip = (nIzzTip)theEObject;
        T result = casenIzzTip(nIzzTip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NIXY_TIP:
      {
        nIxyTip nIxyTip = (nIxyTip)theEObject;
        T result = casenIxyTip(nIxyTip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NIZX_TIP:
      {
        nIzxTip nIzxTip = (nIzxTip)theEObject;
        T result = casenIzxTip(nIzxTip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NIYZ_TIP:
      {
        nIyzTip nIyzTip = (nIyzTip)theEObject;
        T result = casenIyzTip(nIyzTip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.IID_MAT:
      {
        iIdMat iIdMat = (iIdMat)theEObject;
        T result = caseiIdMat(iIdMat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.ISEC_FILE:
      {
        iSecFile iSecFile = (iSecFile)theEObject;
        T result = caseiSecFile(iSecFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NSEC_MAS_MULT:
      {
        nSecMasMult nSecMasMult = (nSecMasMult)theEObject;
        T result = casenSecMasMult(nSecMasMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NFLP_INR_MULT:
      {
        nFlpInrMult nFlpInrMult = (nFlpInrMult)theEObject;
        T result = casenFlpInrMult(nFlpInrMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NLAG_INR_MULT:
      {
        nLagInrMult nLagInrMult = (nLagInrMult)theEObject;
        T result = casenLagInrMult(nLagInrMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NFLPSTF_MULT:
      {
        nFlpstfMult nFlpstfMult = (nFlpstfMult)theEObject;
        T result = casenFlpstfMult(nFlpstfMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NEDG_STF_MULT:
      {
        nEdgStfMult nEdgStfMult = (nEdgStfMult)theEObject;
        T result = casenEdgStfMult(nEdgStfMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NTOR_STF_MULT:
      {
        nTorStfMult nTorStfMult = (nTorStfMult)theEObject;
        T result = casenTorStfMult(nTorStfMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NAXI_STF_MULT:
      {
        nAxiStfMult nAxiStfMult = (nAxiStfMult)theEObject;
        T result = casenAxiStfMult(nAxiStfMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NCG_OFFS_MULT:
      {
        nCgOffsMult nCgOffsMult = (nCgOffsMult)theEObject;
        T result = casenCgOffsMult(nCgOffsMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NSC_OFFS_MULT:
      {
        nScOffsMult nScOffsMult = (nScOffsMult)theEObject;
        T result = casenScOffsMult(nScOffsMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.NTC_OFFS_MULT:
      {
        nTcOffsMult nTcOffsMult = (nTcOffsMult)theEObject;
        T result = casenTcOffsMult(nTcOffsMult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.IN_SELT:
      {
        iNSelt iNSelt = (iNSelt)theEObject;
        T result = caseiNSelt(iNSelt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.AEL_LOC:
      {
        aElLoc aElLoc = (aElLoc)theEObject;
        T result = caseaElLoc(aElLoc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.ITWR_SUPPORT:
      {
        iTwrSupport iTwrSupport = (iTwrSupport)theEObject;
        T result = caseiTwrSupport(iTwrSupport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.ITWR_ATTACH:
      {
        iTwrAttach iTwrAttach = (iTwrAttach)theEObject;
        T result = caseiTwrAttach(iTwrAttach);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.ATWR_WIRES:
      {
        aTwrWires aTwrWires = (aTwrWires)theEObject;
        T result = caseaTwrWires(aTwrWires);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.ANODE_ATTACH:
      {
        aNodeAttach aNodeAttach = (aNodeAttach)theEObject;
        T result = caseaNodeAttach(aNodeAttach);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.AWIRE_STIFF:
      {
        aWireStiff aWireStiff = (aWireStiff)theEObject;
        T result = caseaWireStiff(aWireStiff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BmodesbmiPackage.AWIRE_ANGLE:
      {
        aWireAngle aWireAngle = (aWireAngle)theEObject;
        T result = caseaWireAngle(aWireAngle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Bmodesbmi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Bmodesbmi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelBmodesbmi(ModelBmodesbmi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeader(Header object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bEcho</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bEcho</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebEcho(bEcho object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iBeam Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iBeam Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiBeamType(iBeamType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRot Rpm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRot Rpm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRotRpm(nRotRpm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRpm Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRpm Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRpmMult(nRpmMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRadius</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRadius</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRadius(nRadius object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHub Rad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHub Rad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHubRad(nHubRad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nPrecone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nPrecone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPrecone(nPrecone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBl Thp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBl Thp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBlThp(nBlThp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iHub Conn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iHub Conn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiHubConn(iHubConn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iMode Pr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iMode Pr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiModePr(iModePr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTab Delim</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTab Delim</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTabDelim(bTabDelim object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bMid Node Tw</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bMid Node Tw</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebMidNodeTw(bMidNodeTw object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTip Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTip Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTipMass(nTipMass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nCm Loc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nCm Loc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenCmLoc(nCmLoc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nCm Axial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nCm Axial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenCmAxial(nCmAxial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nIxx Tip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nIxx Tip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIxxTip(nIxxTip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nIyy Tip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nIyy Tip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIyyTip(nIyyTip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nIzz Tip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nIzz Tip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIzzTip(nIzzTip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nIxy Tip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nIxy Tip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIxyTip(nIxyTip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nIzx Tip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nIzx Tip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIzxTip(nIzxTip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nIyz Tip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nIyz Tip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIyzTip(nIyzTip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iId Mat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iId Mat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiIdMat(iIdMat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iSec File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iSec File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiSecFile(iSecFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSec Mas Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSec Mas Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSecMasMult(nSecMasMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nFlp Inr Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nFlp Inr Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenFlpInrMult(nFlpInrMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nLag Inr Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nLag Inr Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenLagInrMult(nLagInrMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nFlpstf Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nFlpstf Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenFlpstfMult(nFlpstfMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nEdg Stf Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nEdg Stf Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenEdgStfMult(nEdgStfMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTor Stf Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTor Stf Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTorStfMult(nTorStfMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nAxi Stf Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nAxi Stf Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenAxiStfMult(nAxiStfMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nCg Offs Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nCg Offs Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenCgOffsMult(nCgOffsMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSc Offs Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSc Offs Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenScOffsMult(nScOffsMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTc Offs Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTc Offs Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTcOffsMult(nTcOffsMult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iN Selt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iN Selt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiNSelt(iNSelt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aEl Loc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aEl Loc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaElLoc(aElLoc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iTwr Support</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iTwr Support</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiTwrSupport(iTwrSupport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iTwr Attach</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iTwr Attach</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiTwrAttach(iTwrAttach object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aTwr Wires</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aTwr Wires</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaTwrWires(aTwrWires object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aNode Attach</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aNode Attach</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaNodeAttach(aNodeAttach object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aWire Stiff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aWire Stiff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaWireStiff(aWireStiff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aWire Angle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aWire Angle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaWireAngle(aWireAngle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BmodesbmiSwitch
