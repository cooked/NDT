/**
 */
package sc.ndt.editor.fast.fastadn.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import sc.ndt.editor.fast.fastadn.FastadnPackage;
import sc.ndt.editor.fast.fastadn.aAirStat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aAir Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.aAirStatImpl#getRnodes <em>Rnodes</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.aAirStatImpl#getAerotwst <em>Aerotwst</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.aAirStatImpl#getDrnodes <em>Drnodes</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.aAirStatImpl#getChord <em>Chord</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.aAirStatImpl#getNfoil <em>Nfoil</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fastadn.impl.aAirStatImpl#getPrnelm <em>Prnelm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class aAirStatImpl extends MinimalEObjectImpl.Container implements aAirStat
{
  /**
   * The cached value of the '{@link #getRnodes() <em>Rnodes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRnodes()
   * @generated
   * @ordered
   */
  protected EList<Float> rnodes;

  /**
   * The cached value of the '{@link #getAerotwst() <em>Aerotwst</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAerotwst()
   * @generated
   * @ordered
   */
  protected EList<Float> aerotwst;

  /**
   * The cached value of the '{@link #getDrnodes() <em>Drnodes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrnodes()
   * @generated
   * @ordered
   */
  protected EList<Float> drnodes;

  /**
   * The cached value of the '{@link #getChord() <em>Chord</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChord()
   * @generated
   * @ordered
   */
  protected EList<Float> chord;

  /**
   * The cached value of the '{@link #getNfoil() <em>Nfoil</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNfoil()
   * @generated
   * @ordered
   */
  protected EList<Float> nfoil;

  /**
   * The cached value of the '{@link #getPrnelm() <em>Prnelm</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrnelm()
   * @generated
   * @ordered
   */
  protected EList<String> prnelm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected aAirStatImpl()
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
    return FastadnPackage.Literals.AAIR_STAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getRnodes()
  {
    if (rnodes == null)
    {
      rnodes = new EDataTypeEList<Float>(Float.class, this, FastadnPackage.AAIR_STAT__RNODES);
    }
    return rnodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getAerotwst()
  {
    if (aerotwst == null)
    {
      aerotwst = new EDataTypeEList<Float>(Float.class, this, FastadnPackage.AAIR_STAT__AEROTWST);
    }
    return aerotwst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getDrnodes()
  {
    if (drnodes == null)
    {
      drnodes = new EDataTypeEList<Float>(Float.class, this, FastadnPackage.AAIR_STAT__DRNODES);
    }
    return drnodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getChord()
  {
    if (chord == null)
    {
      chord = new EDataTypeEList<Float>(Float.class, this, FastadnPackage.AAIR_STAT__CHORD);
    }
    return chord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getNfoil()
  {
    if (nfoil == null)
    {
      nfoil = new EDataTypeEList<Float>(Float.class, this, FastadnPackage.AAIR_STAT__NFOIL);
    }
    return nfoil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPrnelm()
  {
    if (prnelm == null)
    {
      prnelm = new EDataTypeEList<String>(String.class, this, FastadnPackage.AAIR_STAT__PRNELM);
    }
    return prnelm;
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
      case FastadnPackage.AAIR_STAT__RNODES:
        return getRnodes();
      case FastadnPackage.AAIR_STAT__AEROTWST:
        return getAerotwst();
      case FastadnPackage.AAIR_STAT__DRNODES:
        return getDrnodes();
      case FastadnPackage.AAIR_STAT__CHORD:
        return getChord();
      case FastadnPackage.AAIR_STAT__NFOIL:
        return getNfoil();
      case FastadnPackage.AAIR_STAT__PRNELM:
        return getPrnelm();
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
      case FastadnPackage.AAIR_STAT__RNODES:
        getRnodes().clear();
        getRnodes().addAll((Collection<? extends Float>)newValue);
        return;
      case FastadnPackage.AAIR_STAT__AEROTWST:
        getAerotwst().clear();
        getAerotwst().addAll((Collection<? extends Float>)newValue);
        return;
      case FastadnPackage.AAIR_STAT__DRNODES:
        getDrnodes().clear();
        getDrnodes().addAll((Collection<? extends Float>)newValue);
        return;
      case FastadnPackage.AAIR_STAT__CHORD:
        getChord().clear();
        getChord().addAll((Collection<? extends Float>)newValue);
        return;
      case FastadnPackage.AAIR_STAT__NFOIL:
        getNfoil().clear();
        getNfoil().addAll((Collection<? extends Float>)newValue);
        return;
      case FastadnPackage.AAIR_STAT__PRNELM:
        getPrnelm().clear();
        getPrnelm().addAll((Collection<? extends String>)newValue);
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
      case FastadnPackage.AAIR_STAT__RNODES:
        getRnodes().clear();
        return;
      case FastadnPackage.AAIR_STAT__AEROTWST:
        getAerotwst().clear();
        return;
      case FastadnPackage.AAIR_STAT__DRNODES:
        getDrnodes().clear();
        return;
      case FastadnPackage.AAIR_STAT__CHORD:
        getChord().clear();
        return;
      case FastadnPackage.AAIR_STAT__NFOIL:
        getNfoil().clear();
        return;
      case FastadnPackage.AAIR_STAT__PRNELM:
        getPrnelm().clear();
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
      case FastadnPackage.AAIR_STAT__RNODES:
        return rnodes != null && !rnodes.isEmpty();
      case FastadnPackage.AAIR_STAT__AEROTWST:
        return aerotwst != null && !aerotwst.isEmpty();
      case FastadnPackage.AAIR_STAT__DRNODES:
        return drnodes != null && !drnodes.isEmpty();
      case FastadnPackage.AAIR_STAT__CHORD:
        return chord != null && !chord.isEmpty();
      case FastadnPackage.AAIR_STAT__NFOIL:
        return nfoil != null && !nfoil.isEmpty();
      case FastadnPackage.AAIR_STAT__PRNELM:
        return prnelm != null && !prnelm.isEmpty();
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
    result.append(" (rnodes: ");
    result.append(rnodes);
    result.append(", aerotwst: ");
    result.append(aerotwst);
    result.append(", drnodes: ");
    result.append(drnodes);
    result.append(", chord: ");
    result.append(chord);
    result.append(", nfoil: ");
    result.append(nfoil);
    result.append(", prnelm: ");
    result.append(prnelm);
    result.append(')');
    return result.toString();
  }

} //aAirStatImpl
