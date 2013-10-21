/**
 */
package sc.ndt.editor.turbsimtbs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sc.ndt.editor.turbsimtbs.*;

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
 * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage
 * @generated
 */
public class TurbsimtbsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TurbsimtbsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurbsimtbsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TurbsimtbsPackage.eINSTANCE;
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
      case TurbsimtbsPackage.MODEL_TURBSIMTBS:
      {
        ModelTurbsimtbs modelTurbsimtbs = (ModelTurbsimtbs)theEObject;
        T result = caseModelTurbsimtbs(modelTurbsimtbs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NRAND_SEED1:
      {
        nRandSeed1 nRandSeed1 = (nRandSeed1)theEObject;
        T result = casenRandSeed1(nRandSeed1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NRAND_SEED2:
      {
        nRandSeed2 nRandSeed2 = (nRandSeed2)theEObject;
        T result = casenRandSeed2(nRandSeed2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BWR_BHHTP:
      {
        bWrBHHTP bWrBHHTP = (bWrBHHTP)theEObject;
        T result = casebWrBHHTP(bWrBHHTP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BWR_FHHTP:
      {
        bWrFHHTP bWrFHHTP = (bWrFHHTP)theEObject;
        T result = casebWrFHHTP(bWrFHHTP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BWR_ADHH:
      {
        bWrADHH bWrADHH = (bWrADHH)theEObject;
        T result = casebWrADHH(bWrADHH);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BWR_ADFF:
      {
        bWrADFF bWrADFF = (bWrADFF)theEObject;
        T result = casebWrADFF(bWrADFF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BWR_BLFF:
      {
        bWrBLFF bWrBLFF = (bWrBLFF)theEObject;
        T result = casebWrBLFF(bWrBLFF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BWR_ADTWR:
      {
        bWrADTWR bWrADTWR = (bWrADTWR)theEObject;
        T result = casebWrADTWR(bWrADTWR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BWR_FMTFF:
      {
        bWrFMTFF bWrFMTFF = (bWrFMTFF)theEObject;
        T result = casebWrFMTFF(bWrFMTFF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BWR_ACT:
      {
        bWrACT bWrACT = (bWrACT)theEObject;
        T result = casebWrACT(bWrACT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BCLOCKWISE:
      {
        bClockwise bClockwise = (bClockwise)theEObject;
        T result = casebClockwise(bClockwise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.ISCALE_IEC:
      {
        iScaleIEC iScaleIEC = (iScaleIEC)theEObject;
        T result = caseiScaleIEC(iScaleIEC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.INUM_GRID_Z:
      {
        iNumGrid_Z iNumGrid_Z = (iNumGrid_Z)theEObject;
        T result = caseiNumGrid_Z(iNumGrid_Z);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.INUM_GRID_Y:
      {
        iNumGrid_Y iNumGrid_Y = (iNumGrid_Y)theEObject;
        T result = caseiNumGrid_Y(iNumGrid_Y);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NTIME_STEP:
      {
        nTimeStep nTimeStep = (nTimeStep)theEObject;
        T result = casenTimeStep(nTimeStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NANALYSIS_TIME:
      {
        nAnalysisTime nAnalysisTime = (nAnalysisTime)theEObject;
        T result = casenAnalysisTime(nAnalysisTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NUSABLE_TIME:
      {
        nUsableTime nUsableTime = (nUsableTime)theEObject;
        T result = casenUsableTime(nUsableTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NHUB_HT:
      {
        nHubHt nHubHt = (nHubHt)theEObject;
        T result = casenHubHt(nHubHt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NGRID_HEIGHT:
      {
        nGridHeight nGridHeight = (nGridHeight)theEObject;
        T result = casenGridHeight(nGridHeight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NGRID_WIDTH:
      {
        nGridWidth nGridWidth = (nGridWidth)theEObject;
        T result = casenGridWidth(nGridWidth);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NV_FLOW_ANG:
      {
        nVFlowAng nVFlowAng = (nVFlowAng)theEObject;
        T result = casenVFlowAng(nVFlowAng);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NH_FLOW_ANG:
      {
        nHFlowAng nHFlowAng = (nHFlowAng)theEObject;
        T result = casenHFlowAng(nHFlowAng);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.STURB_MODEL:
      {
        sTurbModel sTurbModel = (sTurbModel)theEObject;
        T result = casesTurbModel(sTurbModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.SIE_CSTANDARD:
      {
        sIECstandard sIECstandard = (sIECstandard)theEObject;
        T result = casesIECstandard(sIECstandard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.SIE_CTURBC:
      {
        sIECturbc sIECturbc = (sIECturbc)theEObject;
        T result = casesIECturbc(sIECturbc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.SIEC_WIND_TYPE:
      {
        sIEC_WindType sIEC_WindType = (sIEC_WindType)theEObject;
        T result = casesIEC_WindType(sIEC_WindType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.SET_MC:
      {
        sETMc sETMc = (sETMc)theEObject;
        T result = casesETMc(sETMc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.SWIND_PROFILE_TYPE:
      {
        sWindProfileType sWindProfileType = (sWindProfileType)theEObject;
        T result = casesWindProfileType(sWindProfileType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NREF_HT:
      {
        nRefHt nRefHt = (nRefHt)theEObject;
        T result = casenRefHt(nRefHt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NUREF:
      {
        nUref nUref = (nUref)theEObject;
        T result = casenUref(nUref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NZ_JET_MAX:
      {
        nZJetMax nZJetMax = (nZJetMax)theEObject;
        T result = casenZJetMax(nZJetMax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NPL_EXP:
      {
        nPLExp nPLExp = (nPLExp)theEObject;
        T result = casenPLExp(nPLExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NZ0:
      {
        nZ0 nZ0 = (nZ0)theEObject;
        T result = casenZ0(nZ0);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NLOCATION:
      {
        nLocation nLocation = (nLocation)theEObject;
        T result = casenLocation(nLocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NRICH_NO:
      {
        nRICH_NO nRICH_NO = (nRICH_NO)theEObject;
        T result = casenRICH_NO(nRICH_NO);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NU_STAR:
      {
        nUStar nUStar = (nUStar)theEObject;
        T result = casenUStar(nUStar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NZI:
      {
        nZI nZI = (nZI)theEObject;
        T result = casenZI(nZI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NPC_UW:
      {
        nPC_UW nPC_UW = (nPC_UW)theEObject;
        T result = casenPC_UW(nPC_UW);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NPC_UV:
      {
        nPC_UV nPC_UV = (nPC_UV)theEObject;
        T result = casenPC_UV(nPC_UV);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NPC_VW:
      {
        nPC_VW nPC_VW = (nPC_VW)theEObject;
        T result = casenPC_VW(nPC_VW);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NINC_DEC1:
      {
        nIncDec1 nIncDec1 = (nIncDec1)theEObject;
        T result = casenIncDec1(nIncDec1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NINC_DEC2:
      {
        nIncDec2 nIncDec2 = (nIncDec2)theEObject;
        T result = casenIncDec2(nIncDec2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NINC_DEC3:
      {
        nIncDec3 nIncDec3 = (nIncDec3)theEObject;
        T result = casenIncDec3(nIncDec3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NCOH_EXP:
      {
        nCohExp nCohExp = (nCohExp)theEObject;
        T result = casenCohExp(nCohExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.SCT_EVENT_PATH:
      {
        sCTEventPath sCTEventPath = (sCTEventPath)theEObject;
        T result = casesCTEventPath(sCTEventPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.SCT_EVENT_FILE:
      {
        sCTEventFile sCTEventFile = (sCTEventFile)theEObject;
        T result = casesCTEventFile(sCTEventFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.BRANDOMIZE:
      {
        bRandomize bRandomize = (bRandomize)theEObject;
        T result = casebRandomize(bRandomize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NDIST_SCL:
      {
        nDistScl nDistScl = (nDistScl)theEObject;
        T result = casenDistScl(nDistScl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NCT_LY:
      {
        nCTLy nCTLy = (nCTLy)theEObject;
        T result = casenCTLy(nCTLy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NCT_LZ:
      {
        nCTLz nCTLz = (nCTLz)theEObject;
        T result = casenCTLz(nCTLz);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurbsimtbsPackage.NCT_START_TIME:
      {
        nCTStartTime nCTStartTime = (nCTStartTime)theEObject;
        T result = casenCTStartTime(nCTStartTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Turbsimtbs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Turbsimtbs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelTurbsimtbs(ModelTurbsimtbs object)
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
   * Returns the result of interpreting the object as an instance of '<em>nRand Seed1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRand Seed1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRandSeed1(nRandSeed1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRand Seed2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRand Seed2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRandSeed2(nRandSeed2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bWr BHHTP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bWr BHHTP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebWrBHHTP(bWrBHHTP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bWr FHHTP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bWr FHHTP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebWrFHHTP(bWrFHHTP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bWr ADHH</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bWr ADHH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebWrADHH(bWrADHH object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bWr ADFF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bWr ADFF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebWrADFF(bWrADFF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bWr BLFF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bWr BLFF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebWrBLFF(bWrBLFF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bWr ADTWR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bWr ADTWR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebWrADTWR(bWrADTWR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bWr FMTFF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bWr FMTFF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebWrFMTFF(bWrFMTFF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bWr ACT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bWr ACT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebWrACT(bWrACT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bClockwise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bClockwise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebClockwise(bClockwise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iScale IEC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iScale IEC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiScaleIEC(iScaleIEC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iNum Grid Z</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iNum Grid Z</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiNumGrid_Z(iNumGrid_Z object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iNum Grid Y</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iNum Grid Y</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiNumGrid_Y(iNumGrid_Y object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTime Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTime Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTimeStep(nTimeStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nAnalysis Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nAnalysis Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenAnalysisTime(nAnalysisTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nUsable Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nUsable Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenUsableTime(nUsableTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHub Ht</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHub Ht</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHubHt(nHubHt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nGrid Height</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nGrid Height</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenGridHeight(nGridHeight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nGrid Width</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nGrid Width</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenGridWidth(nGridWidth object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nV Flow Ang</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nV Flow Ang</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenVFlowAng(nVFlowAng object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nH Flow Ang</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nH Flow Ang</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHFlowAng(nHFlowAng object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sTurb Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sTurb Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesTurbModel(sTurbModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sIE Cstandard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sIE Cstandard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesIECstandard(sIECstandard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sIE Cturbc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sIE Cturbc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesIECturbc(sIECturbc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sIEC Wind Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sIEC Wind Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesIEC_WindType(sIEC_WindType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sET Mc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sET Mc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesETMc(sETMc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sWind Profile Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sWind Profile Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesWindProfileType(sWindProfileType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRef Ht</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRef Ht</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRefHt(nRefHt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nUref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nUref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenUref(nUref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nZ Jet Max</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nZ Jet Max</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenZJetMax(nZJetMax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nPL Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nPL Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPLExp(nPLExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nZ0</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nZ0</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenZ0(nZ0 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nLocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nLocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenLocation(nLocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRICH NO</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRICH NO</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRICH_NO(nRICH_NO object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nU Star</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nU Star</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenUStar(nUStar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nZI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nZI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenZI(nZI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nPC UW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nPC UW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPC_UW(nPC_UW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nPC UV</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nPC UV</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPC_UV(nPC_UV object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nPC VW</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nPC VW</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenPC_VW(nPC_VW object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nInc Dec1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nInc Dec1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIncDec1(nIncDec1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nInc Dec2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nInc Dec2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIncDec2(nIncDec2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nInc Dec3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nInc Dec3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenIncDec3(nIncDec3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nCoh Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nCoh Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenCohExp(nCohExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sCT Event Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sCT Event Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesCTEventPath(sCTEventPath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sCT Event File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sCT Event File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesCTEventFile(sCTEventFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bRandomize</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bRandomize</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebRandomize(bRandomize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nDist Scl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nDist Scl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenDistScl(nDistScl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nCT Ly</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nCT Ly</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenCTLy(nCTLy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nCT Lz</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nCT Lz</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenCTLz(nCTLz object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nCT Start Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nCT Start Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenCTStartTime(nCTStartTime object)
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

} //TurbsimtbsSwitch
