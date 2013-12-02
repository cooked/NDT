/**
 */
package sc.ndt.editor.bmodes.bmodesbmi.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage;
import sc.ndt.editor.bmodes.bmodesbmi.aElLoc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aEl Loc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aElLocImpl#getEl_loc <em>El loc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class aElLocImpl extends MinimalEObjectImpl.Container implements aElLoc
{
  /**
   * The cached value of the '{@link #getEl_loc() <em>El loc</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEl_loc()
   * @generated
   * @ordered
   */
  protected EList<Float> el_loc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected aElLocImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BmodesbmiPackage.Literals.AEL_LOC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getEl_loc()
  {
    if (el_loc == null)
    {
      el_loc = new EDataTypeEList<Float>(Float.class, this, BmodesbmiPackage.AEL_LOC__EL_LOC);
    }
    return el_loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BmodesbmiPackage.AEL_LOC__EL_LOC:
        return getEl_loc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BmodesbmiPackage.AEL_LOC__EL_LOC:
        getEl_loc().clear();
        getEl_loc().addAll((Collection<? extends Float>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BmodesbmiPackage.AEL_LOC__EL_LOC:
        getEl_loc().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BmodesbmiPackage.AEL_LOC__EL_LOC:
        return el_loc != null && !el_loc.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (el_loc: ");
    result.append(el_loc);
    result.append(')');
    return result.toString();
  }

} //aElLocImpl
