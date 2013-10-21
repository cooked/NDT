/**
 */
package sc.ndt.editor.fast.fastbld.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sc.ndt.editor.fast.fastbld.*;

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
 * @see sc.ndt.editor.fast.fastbld.FastbldPackage
 * @generated
 */
public class FastbldSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FastbldPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastbldSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FastbldPackage.eINSTANCE;
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
      case FastbldPackage.MODEL_FASTBLD:
      {
        ModelFastbld modelFastbld = (ModelFastbld)theEObject;
        T result = caseModelFastbld(modelFastbld);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NNBL_INP_ST:
      {
        nNblInpSt nNblInpSt = (nNblInpSt)theEObject;
        T result = casenNblInpSt(nNblInpSt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.BCALC_BMODE:
      {
        bCalcBMode bCalcBMode = (bCalcBMode)theEObject;
        T result = casebCalcBMode(bCalcBMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL_DMP1:
      {
        nBldFlDmp1 nBldFlDmp1 = (nBldFlDmp1)theEObject;
        T result = casenBldFlDmp1(nBldFlDmp1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL_DMP2:
      {
        nBldFlDmp2 nBldFlDmp2 = (nBldFlDmp2)theEObject;
        T result = casenBldFlDmp2(nBldFlDmp2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_ED_DMP1:
      {
        nBldEdDmp1 nBldEdDmp1 = (nBldEdDmp1)theEObject;
        T result = casenBldEdDmp1(nBldEdDmp1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NFL_ST_TUNR1:
      {
        nFlStTunr1 nFlStTunr1 = (nFlStTunr1)theEObject;
        T result = casenFlStTunr1(nFlStTunr1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NFL_ST_TUNR2:
      {
        nFlStTunr2 nFlStTunr2 = (nFlStTunr2)theEObject;
        T result = casenFlStTunr2(nFlStTunr2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.ADJ_BL_MS:
      {
        AdjBlMs adjBlMs = (AdjBlMs)theEObject;
        T result = caseAdjBlMs(adjBlMs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.ADJ_FL_ST:
      {
        AdjFlSt adjFlSt = (AdjFlSt)theEObject;
        T result = caseAdjFlSt(adjFlSt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.ADJ_ED_ST:
      {
        AdjEdSt adjEdSt = (AdjEdSt)theEObject;
        T result = caseAdjEdSt(adjEdSt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL1_SH2:
      {
        nBldFl1Sh2 nBldFl1Sh2 = (nBldFl1Sh2)theEObject;
        T result = casenBldFl1Sh2(nBldFl1Sh2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL1_SH3:
      {
        nBldFl1Sh3 nBldFl1Sh3 = (nBldFl1Sh3)theEObject;
        T result = casenBldFl1Sh3(nBldFl1Sh3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL1_SH4:
      {
        nBldFl1Sh4 nBldFl1Sh4 = (nBldFl1Sh4)theEObject;
        T result = casenBldFl1Sh4(nBldFl1Sh4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL1_SH5:
      {
        nBldFl1Sh5 nBldFl1Sh5 = (nBldFl1Sh5)theEObject;
        T result = casenBldFl1Sh5(nBldFl1Sh5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL1_SH6:
      {
        nBldFl1Sh6 nBldFl1Sh6 = (nBldFl1Sh6)theEObject;
        T result = casenBldFl1Sh6(nBldFl1Sh6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL2_SH2:
      {
        nBldFl2Sh2 nBldFl2Sh2 = (nBldFl2Sh2)theEObject;
        T result = casenBldFl2Sh2(nBldFl2Sh2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL2_SH3:
      {
        nBldFl2Sh3 nBldFl2Sh3 = (nBldFl2Sh3)theEObject;
        T result = casenBldFl2Sh3(nBldFl2Sh3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL2_SH4:
      {
        nBldFl2Sh4 nBldFl2Sh4 = (nBldFl2Sh4)theEObject;
        T result = casenBldFl2Sh4(nBldFl2Sh4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL2_SH5:
      {
        nBldFl2Sh5 nBldFl2Sh5 = (nBldFl2Sh5)theEObject;
        T result = casenBldFl2Sh5(nBldFl2Sh5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_FL2_SH6:
      {
        nBldFl2Sh6 nBldFl2Sh6 = (nBldFl2Sh6)theEObject;
        T result = casenBldFl2Sh6(nBldFl2Sh6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_EDG_SH2:
      {
        nBldEdgSh2 nBldEdgSh2 = (nBldEdgSh2)theEObject;
        T result = casenBldEdgSh2(nBldEdgSh2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_EDG_SH3:
      {
        nBldEdgSh3 nBldEdgSh3 = (nBldEdgSh3)theEObject;
        T result = casenBldEdgSh3(nBldEdgSh3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_EDG_SH4:
      {
        nBldEdgSh4 nBldEdgSh4 = (nBldEdgSh4)theEObject;
        T result = casenBldEdgSh4(nBldEdgSh4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_EDG_SH5:
      {
        nBldEdgSh5 nBldEdgSh5 = (nBldEdgSh5)theEObject;
        T result = casenBldEdgSh5(nBldEdgSh5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.NBLD_EDG_SH6:
      {
        nBldEdgSh6 nBldEdgSh6 = (nBldEdgSh6)theEObject;
        T result = casenBldEdgSh6(nBldEdgSh6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FastbldPackage.AAIR_STAT:
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
   * Returns the result of interpreting the object as an instance of '<em>Model Fastbld</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Fastbld</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelFastbld(ModelFastbld object)
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
   * Returns the result of interpreting the object as an instance of '<em>nNbl Inp St</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nNbl Inp St</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenNblInpSt(nNblInpSt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bCalc BMode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bCalc BMode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebCalcBMode(bCalcBMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl Dmp1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl Dmp1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFlDmp1(nBldFlDmp1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl Dmp2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl Dmp2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFlDmp2(nBldFlDmp2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Ed Dmp1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Ed Dmp1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldEdDmp1(nBldEdDmp1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nFl St Tunr1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nFl St Tunr1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenFlStTunr1(nFlStTunr1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nFl St Tunr2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nFl St Tunr2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenFlStTunr2(nFlStTunr2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adj Bl Ms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adj Bl Ms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdjBlMs(AdjBlMs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adj Fl St</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adj Fl St</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdjFlSt(AdjFlSt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adj Ed St</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adj Ed St</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdjEdSt(AdjEdSt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl1 Sh2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl1 Sh2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl1Sh2(nBldFl1Sh2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl1 Sh3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl1 Sh3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl1Sh3(nBldFl1Sh3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl1 Sh4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl1 Sh4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl1Sh4(nBldFl1Sh4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl1 Sh5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl1 Sh5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl1Sh5(nBldFl1Sh5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl1 Sh6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl1 Sh6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl1Sh6(nBldFl1Sh6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl2 Sh2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl2 Sh2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl2Sh2(nBldFl2Sh2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl2 Sh3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl2 Sh3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl2Sh3(nBldFl2Sh3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl2 Sh4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl2 Sh4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl2Sh4(nBldFl2Sh4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl2 Sh5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl2 Sh5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl2Sh5(nBldFl2Sh5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Fl2 Sh6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Fl2 Sh6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldFl2Sh6(nBldFl2Sh6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Edg Sh2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Edg Sh2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldEdgSh2(nBldEdgSh2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Edg Sh3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Edg Sh3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldEdgSh3(nBldEdgSh3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Edg Sh4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Edg Sh4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldEdgSh4(nBldEdgSh4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Edg Sh5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Edg Sh5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldEdgSh5(nBldEdgSh5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nBld Edg Sh6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nBld Edg Sh6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenBldEdgSh6(nBldEdgSh6 object)
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

} //FastbldSwitch
