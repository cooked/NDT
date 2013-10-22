/**
 */
package sc.ndt.editor.bmodesbmi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import sc.ndt.editor.bmodesbmi.BmodesbmiPackage;
import sc.ndt.editor.bmodesbmi.aWireAngle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aWire Angle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.aWireAngleImpl#getEl_loc <em>El loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodesbmi.impl.aWireAngleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class aWireAngleImpl extends MinimalEObjectImpl.Container implements aWireAngle
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
  protected aWireAngleImpl()
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
    return BmodesbmiPackage.Literals.AWIRE_ANGLE;
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
      el_loc = new EDataTypeEList<Float>(Float.class, this, BmodesbmiPackage.AWIRE_ANGLE__EL_LOC);
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
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesbmiPackage.AWIRE_ANGLE__NAME, oldName, name));
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
      case BmodesbmiPackage.AWIRE_ANGLE__EL_LOC:
        return getEl_loc();
      case BmodesbmiPackage.AWIRE_ANGLE__NAME:
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
      case BmodesbmiPackage.AWIRE_ANGLE__EL_LOC:
        getEl_loc().clear();
        getEl_loc().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodesbmiPackage.AWIRE_ANGLE__NAME:
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
      case BmodesbmiPackage.AWIRE_ANGLE__EL_LOC:
        getEl_loc().clear();
        return;
      case BmodesbmiPackage.AWIRE_ANGLE__NAME:
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
      case BmodesbmiPackage.AWIRE_ANGLE__EL_LOC:
        return el_loc != null && !el_loc.isEmpty();
      case BmodesbmiPackage.AWIRE_ANGLE__NAME:
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

} //aWireAngleImpl