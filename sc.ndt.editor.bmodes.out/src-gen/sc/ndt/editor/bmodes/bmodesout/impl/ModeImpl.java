/**
 */
package sc.ndt.editor.bmodes.bmodesout.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import sc.ndt.editor.bmodes.bmodesout.BmodesoutPackage;
import sc.ndt.editor.bmodes.bmodesout.Mode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl#getFreq <em>Freq</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl#getSpan_loc <em>Span loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl#getFlap_disp <em>Flap disp</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl#getFlap_slope <em>Flap slope</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl#getLag_disp <em>Lag disp</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl#getLag_slope <em>Lag slope</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodesout.impl.ModeImpl#getTwist <em>Twist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeImpl extends MinimalEObjectImpl.Container implements Mode
{
  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * The default value of the '{@link #getFreq() <em>Freq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFreq()
   * @generated
   * @ordered
   */
  protected static final float FREQ_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getFreq() <em>Freq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFreq()
   * @generated
   * @ordered
   */
  protected float freq = FREQ_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpan_loc() <em>Span loc</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpan_loc()
   * @generated
   * @ordered
   */
  protected EList<Float> span_loc;

  /**
   * The cached value of the '{@link #getFlap_disp() <em>Flap disp</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlap_disp()
   * @generated
   * @ordered
   */
  protected EList<Float> flap_disp;

  /**
   * The cached value of the '{@link #getFlap_slope() <em>Flap slope</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlap_slope()
   * @generated
   * @ordered
   */
  protected EList<Float> flap_slope;

  /**
   * The cached value of the '{@link #getLag_disp() <em>Lag disp</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLag_disp()
   * @generated
   * @ordered
   */
  protected EList<Float> lag_disp;

  /**
   * The cached value of the '{@link #getLag_slope() <em>Lag slope</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLag_slope()
   * @generated
   * @ordered
   */
  protected EList<Float> lag_slope;

  /**
   * The cached value of the '{@link #getTwist() <em>Twist</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwist()
   * @generated
   * @ordered
   */
  protected EList<Float> twist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModeImpl()
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
    return BmodesoutPackage.Literals.MODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesoutPackage.MODE__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getFreq()
  {
    return freq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFreq(float newFreq)
  {
    float oldFreq = freq;
    freq = newFreq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BmodesoutPackage.MODE__FREQ, oldFreq, freq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getSpan_loc()
  {
    if (span_loc == null)
    {
      span_loc = new EDataTypeEList<Float>(Float.class, this, BmodesoutPackage.MODE__SPAN_LOC);
    }
    return span_loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getFlap_disp()
  {
    if (flap_disp == null)
    {
      flap_disp = new EDataTypeEList<Float>(Float.class, this, BmodesoutPackage.MODE__FLAP_DISP);
    }
    return flap_disp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getFlap_slope()
  {
    if (flap_slope == null)
    {
      flap_slope = new EDataTypeEList<Float>(Float.class, this, BmodesoutPackage.MODE__FLAP_SLOPE);
    }
    return flap_slope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getLag_disp()
  {
    if (lag_disp == null)
    {
      lag_disp = new EDataTypeEList<Float>(Float.class, this, BmodesoutPackage.MODE__LAG_DISP);
    }
    return lag_disp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getLag_slope()
  {
    if (lag_slope == null)
    {
      lag_slope = new EDataTypeEList<Float>(Float.class, this, BmodesoutPackage.MODE__LAG_SLOPE);
    }
    return lag_slope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwist()
  {
    if (twist == null)
    {
      twist = new EDataTypeEList<Float>(Float.class, this, BmodesoutPackage.MODE__TWIST);
    }
    return twist;
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
      case BmodesoutPackage.MODE__INDEX:
        return getIndex();
      case BmodesoutPackage.MODE__FREQ:
        return getFreq();
      case BmodesoutPackage.MODE__SPAN_LOC:
        return getSpan_loc();
      case BmodesoutPackage.MODE__FLAP_DISP:
        return getFlap_disp();
      case BmodesoutPackage.MODE__FLAP_SLOPE:
        return getFlap_slope();
      case BmodesoutPackage.MODE__LAG_DISP:
        return getLag_disp();
      case BmodesoutPackage.MODE__LAG_SLOPE:
        return getLag_slope();
      case BmodesoutPackage.MODE__TWIST:
        return getTwist();
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
      case BmodesoutPackage.MODE__INDEX:
        setIndex((Integer)newValue);
        return;
      case BmodesoutPackage.MODE__FREQ:
        setFreq((Float)newValue);
        return;
      case BmodesoutPackage.MODE__SPAN_LOC:
        getSpan_loc().clear();
        getSpan_loc().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodesoutPackage.MODE__FLAP_DISP:
        getFlap_disp().clear();
        getFlap_disp().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodesoutPackage.MODE__FLAP_SLOPE:
        getFlap_slope().clear();
        getFlap_slope().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodesoutPackage.MODE__LAG_DISP:
        getLag_disp().clear();
        getLag_disp().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodesoutPackage.MODE__LAG_SLOPE:
        getLag_slope().clear();
        getLag_slope().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodesoutPackage.MODE__TWIST:
        getTwist().clear();
        getTwist().addAll((Collection<? extends Float>)newValue);
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
      case BmodesoutPackage.MODE__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case BmodesoutPackage.MODE__FREQ:
        setFreq(FREQ_EDEFAULT);
        return;
      case BmodesoutPackage.MODE__SPAN_LOC:
        getSpan_loc().clear();
        return;
      case BmodesoutPackage.MODE__FLAP_DISP:
        getFlap_disp().clear();
        return;
      case BmodesoutPackage.MODE__FLAP_SLOPE:
        getFlap_slope().clear();
        return;
      case BmodesoutPackage.MODE__LAG_DISP:
        getLag_disp().clear();
        return;
      case BmodesoutPackage.MODE__LAG_SLOPE:
        getLag_slope().clear();
        return;
      case BmodesoutPackage.MODE__TWIST:
        getTwist().clear();
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
      case BmodesoutPackage.MODE__INDEX:
        return index != INDEX_EDEFAULT;
      case BmodesoutPackage.MODE__FREQ:
        return freq != FREQ_EDEFAULT;
      case BmodesoutPackage.MODE__SPAN_LOC:
        return span_loc != null && !span_loc.isEmpty();
      case BmodesoutPackage.MODE__FLAP_DISP:
        return flap_disp != null && !flap_disp.isEmpty();
      case BmodesoutPackage.MODE__FLAP_SLOPE:
        return flap_slope != null && !flap_slope.isEmpty();
      case BmodesoutPackage.MODE__LAG_DISP:
        return lag_disp != null && !lag_disp.isEmpty();
      case BmodesoutPackage.MODE__LAG_SLOPE:
        return lag_slope != null && !lag_slope.isEmpty();
      case BmodesoutPackage.MODE__TWIST:
        return twist != null && !twist.isEmpty();
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
    result.append(" (index: ");
    result.append(index);
    result.append(", freq: ");
    result.append(freq);
    result.append(", span_loc: ");
    result.append(span_loc);
    result.append(", flap_disp: ");
    result.append(flap_disp);
    result.append(", flap_slope: ");
    result.append(flap_slope);
    result.append(", lag_disp: ");
    result.append(lag_disp);
    result.append(", lag_slope: ");
    result.append(lag_slope);
    result.append(", twist: ");
    result.append(twist);
    result.append(')');
    return result.toString();
  }

} //ModeImpl
