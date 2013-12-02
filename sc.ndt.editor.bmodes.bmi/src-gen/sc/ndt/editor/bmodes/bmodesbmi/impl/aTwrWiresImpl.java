/**
 */
package sc.ndt.editor.bmodes.bmodesbmi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage;
import sc.ndt.editor.bmodes.bmodesbmi.aTwrWires;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aTwr Wires</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aTwrWiresImpl#getEl_loc <em>El loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesbmi.impl.aTwrWiresImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class aTwrWiresImpl extends MinimalEObjectImpl.Container implements aTwrWires
{
  /**
   * The cached value of the '{@link #getEl_loc() <em>El loc</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEl_loc()
   * @generated
   * @ordered
   */
  protected EList<Integer> el_loc;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected aTwrWiresImpl()
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
    return BmodesbmiPackage.Literals.ATWR_WIRES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getEl_loc()
  {
    if (el_loc == null)
    {
      el_loc = new EDataTypeEList<Integer>(Integer.class, this, BmodesbmiPackage.ATWR_WIRES__EL_LOC);
    }
    return el_loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.ATWR_WIRES__NAME, oldName, name));
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
      case BmodesbmiPackage.ATWR_WIRES__EL_LOC:
        return getEl_loc();
      case BmodesbmiPackage.ATWR_WIRES__NAME:
        return getName();
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
      case BmodesbmiPackage.ATWR_WIRES__EL_LOC:
        getEl_loc().clear();
        getEl_loc().addAll((Collection<? extends Integer>)newValue);
        return;
      case BmodesbmiPackage.ATWR_WIRES__NAME:
        setName((String)newValue);
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
      case BmodesbmiPackage.ATWR_WIRES__EL_LOC:
        getEl_loc().clear();
        return;
      case BmodesbmiPackage.ATWR_WIRES__NAME:
        setName(NAME_EDEFAULT);
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
      case BmodesbmiPackage.ATWR_WIRES__EL_LOC:
        return el_loc != null && !el_loc.isEmpty();
      case BmodesbmiPackage.ATWR_WIRES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //aTwrWiresImpl
