/**
 */
package sc.ndt.editor.fast.fastadn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sc.ndt.editor.fast.fastadn.*;

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
 * @see sc.ndt.editor.fast.fastadn.FastadnPackage
 * @generated
 */
public class FastadnSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FastadnPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastadnSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FastadnPackage.eINSTANCE;
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
      case FastadnPackage.MODEL_FASTADN:
      {
        ModelFastadn modelFastadn = (ModelFastadn)theEObject;
        T result = caseModelFastadn(modelFastadn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.SUNITS:
      {
        sUnits sUnits = (sUnits)theEObject;
        T result = casesUnits(sUnits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.SSTALL_MOD:
      {
        sStallMod sStallMod = (sStallMod)theEObject;
        T result = casesStallMod(sStallMod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.SUSE_CM:
      {
        sUseCm sUseCm = (sUseCm)theEObject;
        T result = casesUseCm(sUseCm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.SINF_MODEL:
      {
        sInfModel sInfModel = (sInfModel)theEObject;
        T result = casesInfModel(sInfModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.SIND_MODEL:
      {
        sIndModel sIndModel = (sIndModel)theEObject;
        T result = casesIndModel(sIndModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.NATOLER:
      {
        nAtoler nAtoler = (nAtoler)theEObject;
        T result = casenAtoler(nAtoler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.STL_MODEL:
      {
        sTLModel sTLModel = (sTLModel)theEObject;
        T result = casesTLModel(sTLModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.SHL_MODEL:
      {
        sHLModel sHLModel = (sHLModel)theEObject;
        T result = casesHLModel(sHLModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.FWIND_FILE:
      {
        fWindFile fWindFile = (fWindFile)theEObject;
        T result = casefWindFile(fWindFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.NHH:
      {
        nHH nHH = (nHH)theEObject;
        T result = casenHH(nHH);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.NTWR_SHAD:
      {
        nTwrShad nTwrShad = (nTwrShad)theEObject;
        T result = casenTwrShad(nTwrShad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.BTWR_POT:
      {
        bTwrPot bTwrPot = (bTwrPot)theEObject;
        T result = casebTwrPot(bTwrPot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.BTWR_SHD:
      {
        bTwrShd bTwrShd = (bTwrShd)theEObject;
        T result = casebTwrShd(bTwrShd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.FTWR_FILE:
      {
        fTwrFile fTwrFile = (fTwrFile)theEObject;
        T result = casefTwrFile(fTwrFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.BCALC_TWR_AERO:
      {
        bCalcTwrAero bCalcTwrAero = (bCalcTwrAero)theEObject;
        T result = casebCalcTwrAero(bCalcTwrAero);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.NSHAD_HWID:
      {
        nShadHWid nShadHWid = (nShadHWid)theEObject;
        T result = casenShadHWid(nShadHWid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.NT_SHAD_REF_PT:
      {
        nTShadRefPt nTShadRefPt = (nTShadRefPt)theEObject;
        T result = casenTShadRefPt(nTShadRefPt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.NRHO:
      {
        nRho nRho = (nRho)theEObject;
        T result = casenRho(nRho);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.NKIN_VISC:
      {
        nKinVisc nKinVisc = (nKinVisc)theEObject;
        T result = casenKinVisc(nKinVisc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.NDT_AERO:
      {
        nDTAero nDTAero = (nDTAero)theEObject;
        T result = casenDTAero(nDTAero);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.INUM_FOIL:
      {
        iNumFoil iNumFoil = (iNumFoil)theEObject;
        T result = caseiNumFoil(iNumFoil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.AAIRFOIL_LIST:
      {
        aAirfoilList aAirfoilList = (aAirfoilList)theEObject;
        T result = caseaAirfoilList(aAirfoilList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.IBLD_NODES:
      {
        iBldNodes iBldNodes = (iBldNodes)theEObject;
        T result = caseiBldNodes(iBldNodes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastadnPackage.AAIR_STAT:
      {
        aAirStat aAirStat = (aAirStat)theEObject;
        T result = caseaAirStat(aAirStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Fastadn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Fastadn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelFastadn(ModelFastadn object)
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
   * Returns the result of interpreting the object as an instance of '<em>sUnits</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sUnits</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesUnits(sUnits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sStall Mod</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sStall Mod</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesStallMod(sStallMod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sUse Cm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sUse Cm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesUseCm(sUseCm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sInf Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sInf Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesInfModel(sInfModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sInd Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sInd Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesIndModel(sIndModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nAtoler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nAtoler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenAtoler(nAtoler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sTL Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sTL Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesTLModel(sTLModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sHL Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sHL Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesHLModel(sHLModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fWind File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fWind File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefWindFile(fWindFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHH</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHH(nHH object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTwr Shad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTwr Shad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwrShad(nTwrShad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTwr Pot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTwr Pot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTwrPot(bTwrPot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bTwr Shd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bTwr Shd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebTwrShd(bTwrShd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fTwr File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fTwr File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefTwrFile(fTwrFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bCalc Twr Aero</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bCalc Twr Aero</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebCalcTwrAero(bCalcTwrAero object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nShad HWid</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nShad HWid</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenShadHWid(nShadHWid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nT Shad Ref Pt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nT Shad Ref Pt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTShadRefPt(nTShadRefPt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRho</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRho</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRho(nRho object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nKin Visc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nKin Visc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenKinVisc(nKinVisc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nDT Aero</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nDT Aero</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenDTAero(nDTAero object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iNum Foil</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iNum Foil</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiNumFoil(iNumFoil object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aAirfoil List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aAirfoil List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaAirfoilList(aAirfoilList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iBld Nodes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iBld Nodes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiBldNodes(iBldNodes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aAir Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aAir Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaAirStat(aAirStat object)
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

} //FastadnSwitch
