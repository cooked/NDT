/**
 */
package sc.ndt.editor.fast.fasttwr.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import sc.ndt.editor.fast.fasttwr.FasttwrPackage;
import sc.ndt.editor.fast.fasttwr.aTwrStat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aTwr Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getHtFract <em>Ht Fract</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTMassDen <em>TMass Den</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTwFAStif <em>Tw FA Stif</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTwSSStif <em>Tw SS Stif</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTwGJStif <em>Tw GJ Stif</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTwEAStif <em>Tw EA Stif</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTwFAIner <em>Tw FA Iner</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTwSSIner <em>Tw SS Iner</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTwFAcgOf <em>Tw FAcg Of</em>}</li>
 *   <li>{@link sc.ndt.editor.fast.fasttwr.impl.aTwrStatImpl#getTwSScgOf <em>Tw SScg Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class aTwrStatImpl extends MinimalEObjectImpl.Container implements aTwrStat
{
  /**
   * The cached value of the '{@link #getHtFract() <em>Ht Fract</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtFract()
   * @generated
   * @ordered
   */
  protected EList<Float> htFract;

  /**
   * The cached value of the '{@link #getTMassDen() <em>TMass Den</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTMassDen()
   * @generated
   * @ordered
   */
  protected EList<Float> tMassDen;

  /**
   * The cached value of the '{@link #getTwFAStif() <em>Tw FA Stif</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAStif()
   * @generated
   * @ordered
   */
  protected EList<Float> twFAStif;

  /**
   * The cached value of the '{@link #getTwSSStif() <em>Tw SS Stif</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSStif()
   * @generated
   * @ordered
   */
  protected EList<Float> twSSStif;

  /**
   * The cached value of the '{@link #getTwGJStif() <em>Tw GJ Stif</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwGJStif()
   * @generated
   * @ordered
   */
  protected EList<Float> twGJStif;

  /**
   * The cached value of the '{@link #getTwEAStif() <em>Tw EA Stif</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwEAStif()
   * @generated
   * @ordered
   */
  protected EList<Float> twEAStif;

  /**
   * The cached value of the '{@link #getTwFAIner() <em>Tw FA Iner</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAIner()
   * @generated
   * @ordered
   */
  protected EList<Float> twFAIner;

  /**
   * The cached value of the '{@link #getTwSSIner() <em>Tw SS Iner</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSSIner()
   * @generated
   * @ordered
   */
  protected EList<Float> twSSIner;

  /**
   * The cached value of the '{@link #getTwFAcgOf() <em>Tw FAcg Of</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwFAcgOf()
   * @generated
   * @ordered
   */
  protected EList<Float> twFAcgOf;

  /**
   * The cached value of the '{@link #getTwSScgOf() <em>Tw SScg Of</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwSScgOf()
   * @generated
   * @ordered
   */
  protected EList<Float> twSScgOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected aTwrStatImpl()
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
    return FasttwrPackage.Literals.ATWR_STAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getHtFract()
  {
    if (htFract == null)
    {
      htFract = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__HT_FRACT);
    }
    return htFract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTMassDen()
  {
    if (tMassDen == null)
    {
      tMassDen = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TMASS_DEN);
    }
    return tMassDen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwFAStif()
  {
    if (twFAStif == null)
    {
      twFAStif = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TW_FA_STIF);
    }
    return twFAStif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwSSStif()
  {
    if (twSSStif == null)
    {
      twSSStif = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TW_SS_STIF);
    }
    return twSSStif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwGJStif()
  {
    if (twGJStif == null)
    {
      twGJStif = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TW_GJ_STIF);
    }
    return twGJStif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwEAStif()
  {
    if (twEAStif == null)
    {
      twEAStif = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TW_EA_STIF);
    }
    return twEAStif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwFAIner()
  {
    if (twFAIner == null)
    {
      twFAIner = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TW_FA_INER);
    }
    return twFAIner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwSSIner()
  {
    if (twSSIner == null)
    {
      twSSIner = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TW_SS_INER);
    }
    return twSSIner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwFAcgOf()
  {
    if (twFAcgOf == null)
    {
      twFAcgOf = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TW_FACG_OF);
    }
    return twFAcgOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Float> getTwSScgOf()
  {
    if (twSScgOf == null)
    {
      twSScgOf = new EDataTypeEList<Float>(Float.class, this, FasttwrPackage.ATWR_STAT__TW_SSCG_OF);
    }
    return twSScgOf;
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
      case FasttwrPackage.ATWR_STAT__HT_FRACT:
        return getHtFract();
      case FasttwrPackage.ATWR_STAT__TMASS_DEN:
        return getTMassDen();
      case FasttwrPackage.ATWR_STAT__TW_FA_STIF:
        return getTwFAStif();
      case FasttwrPackage.ATWR_STAT__TW_SS_STIF:
        return getTwSSStif();
      case FasttwrPackage.ATWR_STAT__TW_GJ_STIF:
        return getTwGJStif();
      case FasttwrPackage.ATWR_STAT__TW_EA_STIF:
        return getTwEAStif();
      case FasttwrPackage.ATWR_STAT__TW_FA_INER:
        return getTwFAIner();
      case FasttwrPackage.ATWR_STAT__TW_SS_INER:
        return getTwSSIner();
      case FasttwrPackage.ATWR_STAT__TW_FACG_OF:
        return getTwFAcgOf();
      case FasttwrPackage.ATWR_STAT__TW_SSCG_OF:
        return getTwSScgOf();
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
      case FasttwrPackage.ATWR_STAT__HT_FRACT:
        getHtFract().clear();
        getHtFract().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TMASS_DEN:
        getTMassDen().clear();
        getTMassDen().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TW_FA_STIF:
        getTwFAStif().clear();
        getTwFAStif().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TW_SS_STIF:
        getTwSSStif().clear();
        getTwSSStif().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TW_GJ_STIF:
        getTwGJStif().clear();
        getTwGJStif().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TW_EA_STIF:
        getTwEAStif().clear();
        getTwEAStif().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TW_FA_INER:
        getTwFAIner().clear();
        getTwFAIner().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TW_SS_INER:
        getTwSSIner().clear();
        getTwSSIner().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TW_FACG_OF:
        getTwFAcgOf().clear();
        getTwFAcgOf().addAll((Collection<? extends Float>)newValue);
        return;
      case FasttwrPackage.ATWR_STAT__TW_SSCG_OF:
        getTwSScgOf().clear();
        getTwSScgOf().addAll((Collection<? extends Float>)newValue);
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
      case FasttwrPackage.ATWR_STAT__HT_FRACT:
        getHtFract().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TMASS_DEN:
        getTMassDen().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TW_FA_STIF:
        getTwFAStif().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TW_SS_STIF:
        getTwSSStif().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TW_GJ_STIF:
        getTwGJStif().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TW_EA_STIF:
        getTwEAStif().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TW_FA_INER:
        getTwFAIner().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TW_SS_INER:
        getTwSSIner().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TW_FACG_OF:
        getTwFAcgOf().clear();
        return;
      case FasttwrPackage.ATWR_STAT__TW_SSCG_OF:
        getTwSScgOf().clear();
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
      case FasttwrPackage.ATWR_STAT__HT_FRACT:
        return htFract != null && !htFract.isEmpty();
      case FasttwrPackage.ATWR_STAT__TMASS_DEN:
        return tMassDen != null && !tMassDen.isEmpty();
      case FasttwrPackage.ATWR_STAT__TW_FA_STIF:
        return twFAStif != null && !twFAStif.isEmpty();
      case FasttwrPackage.ATWR_STAT__TW_SS_STIF:
        return twSSStif != null && !twSSStif.isEmpty();
      case FasttwrPackage.ATWR_STAT__TW_GJ_STIF:
        return twGJStif != null && !twGJStif.isEmpty();
      case FasttwrPackage.ATWR_STAT__TW_EA_STIF:
        return twEAStif != null && !twEAStif.isEmpty();
      case FasttwrPackage.ATWR_STAT__TW_FA_INER:
        return twFAIner != null && !twFAIner.isEmpty();
      case FasttwrPackage.ATWR_STAT__TW_SS_INER:
        return twSSIner != null && !twSSIner.isEmpty();
      case FasttwrPackage.ATWR_STAT__TW_FACG_OF:
        return twFAcgOf != null && !twFAcgOf.isEmpty();
      case FasttwrPackage.ATWR_STAT__TW_SSCG_OF:
        return twSScgOf != null && !twSScgOf.isEmpty();
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
    result.append(" (HtFract: ");
    result.append(htFract);
    result.append(", TMassDen: ");
    result.append(tMassDen);
    result.append(", TwFAStif: ");
    result.append(twFAStif);
    result.append(", TwSSStif: ");
    result.append(twSSStif);
    result.append(", TwGJStif: ");
    result.append(twGJStif);
    result.append(", TwEAStif: ");
    result.append(twEAStif);
    result.append(", TwFAIner: ");
    result.append(twFAIner);
    result.append(", TwSSIner: ");
    result.append(twSSIner);
    result.append(", TwFAcgOf: ");
    result.append(twFAcgOf);
    result.append(", TwSScgOf: ");
    result.append(twSScgOf);
    result.append(')');
    return result.toString();
  }

} //aTwrStatImpl
