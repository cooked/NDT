/**
 */
package sc.ndt.editor.bmodes.bmodestsp.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import sc.ndt.editor.bmodes.bmodestsp.BmodestspPackage;
import sc.ndt.editor.bmodes.bmodestsp.aSec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aSec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getSec_loc <em>Sec loc</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getStr_tw <em>Str tw</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getTw_iner <em>Tw iner</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getMass_den <em>Mass den</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getFlp_iner <em>Flp iner</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getEdge_iner <em>Edge iner</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getFlp_stff <em>Flp stff</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getEdge_stff <em>Edge stff</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getTor_stff <em>Tor stff</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getAxial_stff <em>Axial stff</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getCg_offst <em>Cg offst</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getSc_offst <em>Sc offst</em>}</li>
 *   <li>{@link sc.ndt.editor.bmodes.bmodestsp.impl.aSecImpl#getTc_offst <em>Tc offst</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class aSecImpl extends MinimalEObjectImpl.Container implements aSec
{
  /**
   * The cached value of the '{@link #getSec_loc() <em>Sec loc</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSec_loc()
   * @generated
   * @ordered
   */
  protected EList<Float> sec_loc;

  /**
   * The cached value of the '{@link #getStr_tw() <em>Str tw</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr_tw()
   * @generated
   * @ordered
   */
  protected EList<Float> str_tw;

  /**
   * The cached value of the '{@link #getTw_iner() <em>Tw iner</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTw_iner()
   * @generated
   * @ordered
   */
  protected EList<Float> tw_iner;

  /**
   * The cached value of the '{@link #getMass_den() <em>Mass den</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMass_den()
   * @generated
   * @ordered
   */
  protected EList<Float> mass_den;

  /**
   * The cached value of the '{@link #getFlp_iner() <em>Flp iner</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlp_iner()
   * @generated
   * @ordered
   */
  protected EList<Float> flp_iner;

  /**
   * The cached value of the '{@link #getEdge_iner() <em>Edge iner</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdge_iner()
   * @generated
   * @ordered
   */
  protected EList<Float> edge_iner;

  /**
   * The cached value of the '{@link #getFlp_stff() <em>Flp stff</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlp_stff()
   * @generated
   * @ordered
   */
  protected EList<Float> flp_stff;

  /**
   * The cached value of the '{@link #getEdge_stff() <em>Edge stff</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdge_stff()
   * @generated
   * @ordered
   */
  protected EList<Float> edge_stff;

  /**
   * The cached value of the '{@link #getTor_stff() <em>Tor stff</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTor_stff()
   * @generated
   * @ordered
   */
  protected EList<Float> tor_stff;

  /**
   * The cached value of the '{@link #getAxial_stff() <em>Axial stff</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxial_stff()
   * @generated
   * @ordered
   */
  protected EList<Float> axial_stff;

  /**
   * The cached value of the '{@link #getCg_offst() <em>Cg offst</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCg_offst()
   * @generated
   * @ordered
   */
  protected EList<Float> cg_offst;

  /**
   * The cached value of the '{@link #getSc_offst() <em>Sc offst</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSc_offst()
   * @generated
   * @ordered
   */
  protected EList<Float> sc_offst;

  /**
   * The cached value of the '{@link #getTc_offst() <em>Tc offst</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTc_offst()
   * @generated
   * @ordered
   */
  protected EList<Float> tc_offst;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected aSecImpl()
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
    return BmodestspPackage.Literals.ASEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getSec_loc()
  {
    if (sec_loc == null)
    {
      sec_loc = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__SEC_LOC);
    }
    return sec_loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getStr_tw()
  {
    if (str_tw == null)
    {
      str_tw = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__STR_TW);
    }
    return str_tw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTw_iner()
  {
    if (tw_iner == null)
    {
      tw_iner = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__TW_INER);
    }
    return tw_iner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getMass_den()
  {
    if (mass_den == null)
    {
      mass_den = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__MASS_DEN);
    }
    return mass_den;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getFlp_iner()
  {
    if (flp_iner == null)
    {
      flp_iner = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__FLP_INER);
    }
    return flp_iner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getEdge_iner()
  {
    if (edge_iner == null)
    {
      edge_iner = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__EDGE_INER);
    }
    return edge_iner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getFlp_stff()
  {
    if (flp_stff == null)
    {
      flp_stff = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__FLP_STFF);
    }
    return flp_stff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getEdge_stff()
  {
    if (edge_stff == null)
    {
      edge_stff = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__EDGE_STFF);
    }
    return edge_stff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTor_stff()
  {
    if (tor_stff == null)
    {
      tor_stff = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__TOR_STFF);
    }
    return tor_stff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getAxial_stff()
  {
    if (axial_stff == null)
    {
      axial_stff = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__AXIAL_STFF);
    }
    return axial_stff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getCg_offst()
  {
    if (cg_offst == null)
    {
      cg_offst = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__CG_OFFST);
    }
    return cg_offst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getSc_offst()
  {
    if (sc_offst == null)
    {
      sc_offst = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__SC_OFFST);
    }
    return sc_offst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTc_offst()
  {
    if (tc_offst == null)
    {
      tc_offst = new EDataTypeEList<Float>(Float.class, this, BmodestspPackage.ASEC__TC_OFFST);
    }
    return tc_offst;
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
      case BmodestspPackage.ASEC__SEC_LOC:
        return getSec_loc();
      case BmodestspPackage.ASEC__STR_TW:
        return getStr_tw();
      case BmodestspPackage.ASEC__TW_INER:
        return getTw_iner();
      case BmodestspPackage.ASEC__MASS_DEN:
        return getMass_den();
      case BmodestspPackage.ASEC__FLP_INER:
        return getFlp_iner();
      case BmodestspPackage.ASEC__EDGE_INER:
        return getEdge_iner();
      case BmodestspPackage.ASEC__FLP_STFF:
        return getFlp_stff();
      case BmodestspPackage.ASEC__EDGE_STFF:
        return getEdge_stff();
      case BmodestspPackage.ASEC__TOR_STFF:
        return getTor_stff();
      case BmodestspPackage.ASEC__AXIAL_STFF:
        return getAxial_stff();
      case BmodestspPackage.ASEC__CG_OFFST:
        return getCg_offst();
      case BmodestspPackage.ASEC__SC_OFFST:
        return getSc_offst();
      case BmodestspPackage.ASEC__TC_OFFST:
        return getTc_offst();
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
      case BmodestspPackage.ASEC__SEC_LOC:
        getSec_loc().clear();
        getSec_loc().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__STR_TW:
        getStr_tw().clear();
        getStr_tw().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__TW_INER:
        getTw_iner().clear();
        getTw_iner().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__MASS_DEN:
        getMass_den().clear();
        getMass_den().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__FLP_INER:
        getFlp_iner().clear();
        getFlp_iner().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__EDGE_INER:
        getEdge_iner().clear();
        getEdge_iner().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__FLP_STFF:
        getFlp_stff().clear();
        getFlp_stff().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__EDGE_STFF:
        getEdge_stff().clear();
        getEdge_stff().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__TOR_STFF:
        getTor_stff().clear();
        getTor_stff().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__AXIAL_STFF:
        getAxial_stff().clear();
        getAxial_stff().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__CG_OFFST:
        getCg_offst().clear();
        getCg_offst().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__SC_OFFST:
        getSc_offst().clear();
        getSc_offst().addAll((Collection<? extends Float>)newValue);
        return;
      case BmodestspPackage.ASEC__TC_OFFST:
        getTc_offst().clear();
        getTc_offst().addAll((Collection<? extends Float>)newValue);
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
      case BmodestspPackage.ASEC__SEC_LOC:
        getSec_loc().clear();
        return;
      case BmodestspPackage.ASEC__STR_TW:
        getStr_tw().clear();
        return;
      case BmodestspPackage.ASEC__TW_INER:
        getTw_iner().clear();
        return;
      case BmodestspPackage.ASEC__MASS_DEN:
        getMass_den().clear();
        return;
      case BmodestspPackage.ASEC__FLP_INER:
        getFlp_iner().clear();
        return;
      case BmodestspPackage.ASEC__EDGE_INER:
        getEdge_iner().clear();
        return;
      case BmodestspPackage.ASEC__FLP_STFF:
        getFlp_stff().clear();
        return;
      case BmodestspPackage.ASEC__EDGE_STFF:
        getEdge_stff().clear();
        return;
      case BmodestspPackage.ASEC__TOR_STFF:
        getTor_stff().clear();
        return;
      case BmodestspPackage.ASEC__AXIAL_STFF:
        getAxial_stff().clear();
        return;
      case BmodestspPackage.ASEC__CG_OFFST:
        getCg_offst().clear();
        return;
      case BmodestspPackage.ASEC__SC_OFFST:
        getSc_offst().clear();
        return;
      case BmodestspPackage.ASEC__TC_OFFST:
        getTc_offst().clear();
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
      case BmodestspPackage.ASEC__SEC_LOC:
        return sec_loc != null && !sec_loc.isEmpty();
      case BmodestspPackage.ASEC__STR_TW:
        return str_tw != null && !str_tw.isEmpty();
      case BmodestspPackage.ASEC__TW_INER:
        return tw_iner != null && !tw_iner.isEmpty();
      case BmodestspPackage.ASEC__MASS_DEN:
        return mass_den != null && !mass_den.isEmpty();
      case BmodestspPackage.ASEC__FLP_INER:
        return flp_iner != null && !flp_iner.isEmpty();
      case BmodestspPackage.ASEC__EDGE_INER:
        return edge_iner != null && !edge_iner.isEmpty();
      case BmodestspPackage.ASEC__FLP_STFF:
        return flp_stff != null && !flp_stff.isEmpty();
      case BmodestspPackage.ASEC__EDGE_STFF:
        return edge_stff != null && !edge_stff.isEmpty();
      case BmodestspPackage.ASEC__TOR_STFF:
        return tor_stff != null && !tor_stff.isEmpty();
      case BmodestspPackage.ASEC__AXIAL_STFF:
        return axial_stff != null && !axial_stff.isEmpty();
      case BmodestspPackage.ASEC__CG_OFFST:
        return cg_offst != null && !cg_offst.isEmpty();
      case BmodestspPackage.ASEC__SC_OFFST:
        return sc_offst != null && !sc_offst.isEmpty();
      case BmodestspPackage.ASEC__TC_OFFST:
        return tc_offst != null && !tc_offst.isEmpty();
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
    result.append(" (sec_loc: ");
    result.append(sec_loc);
    result.append(", str_tw: ");
    result.append(str_tw);
    result.append(", tw_iner: ");
    result.append(tw_iner);
    result.append(", mass_den: ");
    result.append(mass_den);
    result.append(", flp_iner: ");
    result.append(flp_iner);
    result.append(", edge_iner: ");
    result.append(edge_iner);
    result.append(", flp_stff: ");
    result.append(flp_stff);
    result.append(", edge_stff: ");
    result.append(edge_stff);
    result.append(", tor_stff: ");
    result.append(tor_stff);
    result.append(", axial_stff: ");
    result.append(axial_stff);
    result.append(", cg_offst: ");
    result.append(cg_offst);
    result.append(", sc_offst: ");
    result.append(sc_offst);
    result.append(", tc_offst: ");
    result.append(tc_offst);
    result.append(')');
    return result.toString();
  }

} //aSecImpl
