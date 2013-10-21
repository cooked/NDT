/**
 */
package sc.ndt.editor.fast.fasttwr.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sc.ndt.editor.fast.fasttwr.*;

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
 * @see sc.ndt.editor.fast.fasttwr.FasttwrPackage
 * @generated
 */
public class FasttwrSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FasttwrPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FasttwrSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FasttwrPackage.eINSTANCE;
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
      case FasttwrPackage.MODEL_FASTTWR:
      {
        ModelFasttwr modelFasttwr = (ModelFasttwr)theEObject;
        T result = caseModelFasttwr(modelFasttwr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NN_TW_INP_ST:
      {
        nNTwInpSt nNTwInpSt = (nNTwInpSt)theEObject;
        T result = casenNTwInpSt(nNTwInpSt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.BCALC_TMODE:
      {
        bCalcTMode bCalcTMode = (bCalcTMode)theEObject;
        T result = casebCalcTMode(bCalcTMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTWR_FA_DMP1:
      {
        nTwrFADmp1 nTwrFADmp1 = (nTwrFADmp1)theEObject;
        T result = casenTwrFADmp1(nTwrFADmp1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTWR_FA_DMP2:
      {
        nTwrFADmp2 nTwrFADmp2 = (nTwrFADmp2)theEObject;
        T result = casenTwrFADmp2(nTwrFADmp2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTWR_SS_DMP1:
      {
        nTwrSSDmp1 nTwrSSDmp1 = (nTwrSSDmp1)theEObject;
        T result = casenTwrSSDmp1(nTwrSSDmp1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTWR_SS_DMP2:
      {
        nTwrSSDmp2 nTwrSSDmp2 = (nTwrSSDmp2)theEObject;
        T result = casenTwrSSDmp2(nTwrSSDmp2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NFA_ST_TUNR1:
      {
        nFAStTunr1 nFAStTunr1 = (nFAStTunr1)theEObject;
        T result = casenFAStTunr1(nFAStTunr1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NFA_ST_TUNR2:
      {
        nFAStTunr2 nFAStTunr2 = (nFAStTunr2)theEObject;
        T result = casenFAStTunr2(nFAStTunr2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NSS_ST_TUNR1:
      {
        nSSStTunr1 nSSStTunr1 = (nSSStTunr1)theEObject;
        T result = casenSSStTunr1(nSSStTunr1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NSS_ST_TUNR2:
      {
        nSSStTunr2 nSSStTunr2 = (nSSStTunr2)theEObject;
        T result = casenSSStTunr2(nSSStTunr2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.ADJ_TW_MA:
      {
        AdjTwMa adjTwMa = (AdjTwMa)theEObject;
        T result = caseAdjTwMa(adjTwMa);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.ADJ_FA_ST:
      {
        AdjFASt adjFASt = (AdjFASt)theEObject;
        T result = caseAdjFASt(adjFASt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.ADJ_SS_ST:
      {
        AdjSSSt adjSSSt = (AdjSSSt)theEObject;
        T result = caseAdjSSSt(adjSSSt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM1_SH2:
      {
        nTwFAM1Sh2 nTwFAM1Sh2 = (nTwFAM1Sh2)theEObject;
        T result = casenTwFAM1Sh2(nTwFAM1Sh2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM1_SH3:
      {
        nTwFAM1Sh3 nTwFAM1Sh3 = (nTwFAM1Sh3)theEObject;
        T result = casenTwFAM1Sh3(nTwFAM1Sh3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM1_SH4:
      {
        nTwFAM1Sh4 nTwFAM1Sh4 = (nTwFAM1Sh4)theEObject;
        T result = casenTwFAM1Sh4(nTwFAM1Sh4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM1_SH5:
      {
        nTwFAM1Sh5 nTwFAM1Sh5 = (nTwFAM1Sh5)theEObject;
        T result = casenTwFAM1Sh5(nTwFAM1Sh5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM1_SH6:
      {
        nTwFAM1Sh6 nTwFAM1Sh6 = (nTwFAM1Sh6)theEObject;
        T result = casenTwFAM1Sh6(nTwFAM1Sh6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM2_SH2:
      {
        nTwFAM2Sh2 nTwFAM2Sh2 = (nTwFAM2Sh2)theEObject;
        T result = casenTwFAM2Sh2(nTwFAM2Sh2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM2_SH3:
      {
        nTwFAM2Sh3 nTwFAM2Sh3 = (nTwFAM2Sh3)theEObject;
        T result = casenTwFAM2Sh3(nTwFAM2Sh3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM2_SH4:
      {
        nTwFAM2Sh4 nTwFAM2Sh4 = (nTwFAM2Sh4)theEObject;
        T result = casenTwFAM2Sh4(nTwFAM2Sh4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM2_SH5:
      {
        nTwFAM2Sh5 nTwFAM2Sh5 = (nTwFAM2Sh5)theEObject;
        T result = casenTwFAM2Sh5(nTwFAM2Sh5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_FAM2_SH6:
      {
        nTwFAM2Sh6 nTwFAM2Sh6 = (nTwFAM2Sh6)theEObject;
        T result = casenTwFAM2Sh6(nTwFAM2Sh6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM1_SH2:
      {
        nTwSSM1Sh2 nTwSSM1Sh2 = (nTwSSM1Sh2)theEObject;
        T result = casenTwSSM1Sh2(nTwSSM1Sh2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM1_SH3:
      {
        nTwSSM1Sh3 nTwSSM1Sh3 = (nTwSSM1Sh3)theEObject;
        T result = casenTwSSM1Sh3(nTwSSM1Sh3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM1_SH4:
      {
        nTwSSM1Sh4 nTwSSM1Sh4 = (nTwSSM1Sh4)theEObject;
        T result = casenTwSSM1Sh4(nTwSSM1Sh4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM1_SH5:
      {
        nTwSSM1Sh5 nTwSSM1Sh5 = (nTwSSM1Sh5)theEObject;
        T result = casenTwSSM1Sh5(nTwSSM1Sh5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM1_SH6:
      {
        nTwSSM1Sh6 nTwSSM1Sh6 = (nTwSSM1Sh6)theEObject;
        T result = casenTwSSM1Sh6(nTwSSM1Sh6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM2_SH2:
      {
        nTwSSM2Sh2 nTwSSM2Sh2 = (nTwSSM2Sh2)theEObject;
        T result = casenTwSSM2Sh2(nTwSSM2Sh2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM2_SH3:
      {
        nTwSSM2Sh3 nTwSSM2Sh3 = (nTwSSM2Sh3)theEObject;
        T result = casenTwSSM2Sh3(nTwSSM2Sh3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM2_SH4:
      {
        nTwSSM2Sh4 nTwSSM2Sh4 = (nTwSSM2Sh4)theEObject;
        T result = casenTwSSM2Sh4(nTwSSM2Sh4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM2_SH5:
      {
        nTwSSM2Sh5 nTwSSM2Sh5 = (nTwSSM2Sh5)theEObject;
        T result = casenTwSSM2Sh5(nTwSSM2Sh5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.NTW_SSM2_SH6:
      {
        nTwSSM2Sh6 nTwSSM2Sh6 = (nTwSSM2Sh6)theEObject;
        T result = casenTwSSM2Sh6(nTwSSM2Sh6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FasttwrPackage.ATWR_STAT:
      {
        aTwrStat aTwrStat = (aTwrStat)theEObject;
        T result = caseaTwrStat(aTwrStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Fasttwr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Fasttwr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelFasttwr(ModelFasttwr object)
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
   * Returns the result of interpreting the object as an instance of '<em>nN Tw Inp St</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nN Tw Inp St</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNTwInpSt(nNTwInpSt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bCalc TMode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bCalc TMode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebCalcTMode(bCalcTMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTwr FA Dmp1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTwr FA Dmp1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwrFADmp1(nTwrFADmp1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTwr FA Dmp2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTwr FA Dmp2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwrFADmp2(nTwrFADmp2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTwr SS Dmp1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTwr SS Dmp1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwrSSDmp1(nTwrSSDmp1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTwr SS Dmp2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTwr SS Dmp2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwrSSDmp2(nTwrSSDmp2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nFA St Tunr1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nFA St Tunr1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenFAStTunr1(nFAStTunr1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nFA St Tunr2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nFA St Tunr2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenFAStTunr2(nFAStTunr2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSS St Tunr1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSS St Tunr1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSSStTunr1(nSSStTunr1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nSS St Tunr2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nSS St Tunr2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenSSStTunr2(nSSStTunr2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adj Tw Ma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adj Tw Ma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdjTwMa(AdjTwMa object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adj FA St</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adj FA St</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdjFASt(AdjFASt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adj SS St</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adj SS St</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdjSSSt(AdjSSSt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM1 Sh2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM1 Sh2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM1Sh2(nTwFAM1Sh2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM1 Sh3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM1 Sh3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM1Sh3(nTwFAM1Sh3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM1 Sh4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM1 Sh4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM1Sh4(nTwFAM1Sh4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM1 Sh5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM1 Sh5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM1Sh5(nTwFAM1Sh5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM1 Sh6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM1 Sh6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM1Sh6(nTwFAM1Sh6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM2 Sh2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM2 Sh2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM2Sh2(nTwFAM2Sh2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM2 Sh3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM2 Sh3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM2Sh3(nTwFAM2Sh3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM2 Sh4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM2 Sh4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM2Sh4(nTwFAM2Sh4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM2 Sh5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM2 Sh5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM2Sh5(nTwFAM2Sh5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw FAM2 Sh6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw FAM2 Sh6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwFAM2Sh6(nTwFAM2Sh6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM1 Sh2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM1 Sh2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM1Sh2(nTwSSM1Sh2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM1 Sh3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM1 Sh3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM1Sh3(nTwSSM1Sh3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM1 Sh4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM1 Sh4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM1Sh4(nTwSSM1Sh4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM1 Sh5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM1 Sh5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM1Sh5(nTwSSM1Sh5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM1 Sh6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM1 Sh6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM1Sh6(nTwSSM1Sh6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM2 Sh2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM2 Sh2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM2Sh2(nTwSSM2Sh2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM2 Sh3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM2 Sh3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM2Sh3(nTwSSM2Sh3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM2 Sh4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM2 Sh4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM2Sh4(nTwSSM2Sh4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM2 Sh5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM2 Sh5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM2Sh5(nTwSSM2Sh5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nTw SSM2 Sh6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nTw SSM2 Sh6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenTwSSM2Sh6(nTwSSM2Sh6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aTwr Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aTwr Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaTwrStat(aTwrStat object)
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

} //FasttwrSwitch
