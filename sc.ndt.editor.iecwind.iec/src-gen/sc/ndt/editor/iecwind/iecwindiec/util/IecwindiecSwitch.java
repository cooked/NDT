/**
 */
package sc.ndt.editor.iecwind.iecwindiec.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sc.ndt.editor.iecwind.iecwindiec.*;

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
 * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage
 * @generated
 */
public class IecwindiecSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IecwindiecPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IecwindiecSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = IecwindiecPackage.eINSTANCE;
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
      case IecwindiecPackage.MODEL_IECWINDIEC:
      {
        ModelIecwindiec modelIecwindiec = (ModelIecwindiec)theEObject;
        T result = caseModelIecwindiec(modelIecwindiec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.SI_UNITS:
      {
        siUnits siUnits = (siUnits)theEObject;
        T result = casesiUnits(siUnits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.ISTART:
      {
        iStart iStart = (iStart)theEObject;
        T result = caseiStart(iStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.IIEC_CLASS:
      {
        iIECClass iIECClass = (iIECClass)theEObject;
        T result = caseiIECClass(iIECClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.SWIND_TURB:
      {
        sWindTurb sWindTurb = (sWindTurb)theEObject;
        T result = casesWindTurb(sWindTurb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.NWIND_SLOPE:
      {
        nWindSlope nWindSlope = (nWindSlope)theEObject;
        T result = casenWindSlope(nWindSlope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.IIEC_STD:
      {
        iIECStd iIECStd = (iIECStd)theEObject;
        T result = caseiIECStd(iIECStd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.NHUB_HEIGHT:
      {
        nHubHeight nHubHeight = (nHubHeight)theEObject;
        T result = casenHubHeight(nHubHeight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.NROT_DIAM:
      {
        nRotDiam nRotDiam = (nRotDiam)theEObject;
        T result = casenRotDiam(nRotDiam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.NWIND_IN:
      {
        nWindIn nWindIn = (nWindIn)theEObject;
        T result = casenWindIn(nWindIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.NWIND_NOM:
      {
        nWindNom nWindNom = (nWindNom)theEObject;
        T result = casenWindNom(nWindNom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.NWIND_OUT:
      {
        nWindOut nWindOut = (nWindOut)theEObject;
        T result = casenWindOut(nWindOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IecwindiecPackage.VOUT_LIST:
      {
        vOutList vOutList = (vOutList)theEObject;
        T result = casevOutList(vOutList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Iecwindiec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Iecwindiec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelIecwindiec(ModelIecwindiec object)
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
   * Returns the result of interpreting the object as an instance of '<em>si Units</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>si Units</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesiUnits(siUnits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iStart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iStart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiStart(iStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iIEC Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iIEC Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiIECClass(iIECClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sWind Turb</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sWind Turb</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesWindTurb(sWindTurb object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nWind Slope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nWind Slope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenWindSlope(nWindSlope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iIEC Std</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iIEC Std</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiIECStd(iIECStd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nHub Height</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nHub Height</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenHubHeight(nHubHeight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nRot Diam</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nRot Diam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenRotDiam(nRotDiam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nWind In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nWind In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenWindIn(nWindIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nWind Nom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nWind Nom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenWindNom(nWindNom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nWind Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nWind Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenWindOut(nWindOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>vOut List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>vOut List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevOutList(vOutList object)
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

} //IecwindiecSwitch
