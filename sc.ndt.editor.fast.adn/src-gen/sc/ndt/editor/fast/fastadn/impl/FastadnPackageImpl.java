/**
 */
package sc.ndt.editor.fast.fastadn.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.ndt.editor.fast.fastadn.FastadnFactory;
import sc.ndt.editor.fast.fastadn.FastadnPackage;
import sc.ndt.editor.fast.fastadn.Header;
import sc.ndt.editor.fast.fastadn.ModelFastadn;
import sc.ndt.editor.fast.fastadn.aAirStat;
import sc.ndt.editor.fast.fastadn.aAirfoilList;
import sc.ndt.editor.fast.fastadn.bCalcTwrAero;
import sc.ndt.editor.fast.fastadn.bTwrPot;
import sc.ndt.editor.fast.fastadn.bTwrShd;
import sc.ndt.editor.fast.fastadn.fTwrFile;
import sc.ndt.editor.fast.fastadn.fWindFile;
import sc.ndt.editor.fast.fastadn.iBldNodes;
import sc.ndt.editor.fast.fastadn.iNumFoil;
import sc.ndt.editor.fast.fastadn.nAtoler;
import sc.ndt.editor.fast.fastadn.nDTAero;
import sc.ndt.editor.fast.fastadn.nHH;
import sc.ndt.editor.fast.fastadn.nKinVisc;
import sc.ndt.editor.fast.fastadn.nRho;
import sc.ndt.editor.fast.fastadn.nShadHWid;
import sc.ndt.editor.fast.fastadn.nTShadRefPt;
import sc.ndt.editor.fast.fastadn.nTwrShad;
import sc.ndt.editor.fast.fastadn.sHLModel;
import sc.ndt.editor.fast.fastadn.sIndModel;
import sc.ndt.editor.fast.fastadn.sInfModel;
import sc.ndt.editor.fast.fastadn.sStallMod;
import sc.ndt.editor.fast.fastadn.sTLModel;
import sc.ndt.editor.fast.fastadn.sUnits;
import sc.ndt.editor.fast.fastadn.sUseCm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FastadnPackageImpl extends EPackageImpl implements FastadnPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelFastadnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sUnitsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sStallModEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sUseCmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sInfModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sIndModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nAtolerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sTLModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sHLModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fWindFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHHEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTwrShadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTwrPotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTwrShdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fTwrFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bCalcTwrAeroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nShadHWidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTShadRefPtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRhoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nKinViscEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nDTAeroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iNumFoilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aAirfoilListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iBldNodesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aAirStatEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see sc.ndt.editor.fast.fastadn.FastadnPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FastadnPackageImpl()
  {
    super(eNS_URI, FastadnFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FastadnPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FastadnPackage init()
  {
    if (isInited) return (FastadnPackage)EPackage.Registry.INSTANCE.getEPackage(FastadnPackage.eNS_URI);

    // Obtain or create and register package
    FastadnPackageImpl theFastadnPackage = (FastadnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FastadnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FastadnPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFastadnPackage.createPackageContents();

    // Initialize created meta-data
    theFastadnPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFastadnPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FastadnPackage.eNS_URI, theFastadnPackage);
    return theFastadnPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelFastadn()
  {
    return modelFastadnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_Head()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_SIUnits()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_StallMod()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_UseCm()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_InfModel()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_IndModel()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_Atoler()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_TLModel()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_HLModel()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_WindFile()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_HH()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_TwrShad()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_ShadHWid()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_TShadRefPt()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_Rho()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_KinVisc()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_DTAero()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_NumFoil()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_FoilNm()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_BldNodes()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFastadn_AirStat()
  {
    return (EReference)modelFastadnEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader()
  {
    return headerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader_Name()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsUnits()
  {
    return sUnitsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsUnits_Value()
  {
    return (EAttribute)sUnitsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsUnits_Name()
  {
    return (EAttribute)sUnitsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsStallMod()
  {
    return sStallModEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsStallMod_Value()
  {
    return (EAttribute)sStallModEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsStallMod_Name()
  {
    return (EAttribute)sStallModEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsUseCm()
  {
    return sUseCmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsUseCm_Value()
  {
    return (EAttribute)sUseCmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsUseCm_Name()
  {
    return (EAttribute)sUseCmEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsInfModel()
  {
    return sInfModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsInfModel_Value()
  {
    return (EAttribute)sInfModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsInfModel_Name()
  {
    return (EAttribute)sInfModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsIndModel()
  {
    return sIndModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsIndModel_Value()
  {
    return (EAttribute)sIndModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsIndModel_Name()
  {
    return (EAttribute)sIndModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnAtoler()
  {
    return nAtolerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAtoler_Value()
  {
    return (EAttribute)nAtolerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAtoler_Name()
  {
    return (EAttribute)nAtolerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsTLModel()
  {
    return sTLModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsTLModel_Value()
  {
    return (EAttribute)sTLModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsTLModel_Name()
  {
    return (EAttribute)sTLModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsHLModel()
  {
    return sHLModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsHLModel_Value()
  {
    return (EAttribute)sHLModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsHLModel_Name()
  {
    return (EAttribute)sHLModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfWindFile()
  {
    return fWindFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfWindFile_Value()
  {
    return (EAttribute)fWindFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfWindFile_Name()
  {
    return (EAttribute)fWindFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHH()
  {
    return nHHEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHH_Value()
  {
    return (EAttribute)nHHEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHH_Name()
  {
    return (EAttribute)nHHEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTwrShad()
  {
    return nTwrShadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrShad_Value()
  {
    return (EAttribute)nTwrShadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTwrShad_Name()
  {
    return (EAttribute)nTwrShadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTwrPot()
  {
    return bTwrPotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwrPot_Value()
  {
    return (EAttribute)bTwrPotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwrPot_Name()
  {
    return (EAttribute)bTwrPotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbTwrShd()
  {
    return bTwrShdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwrShd_Value()
  {
    return (EAttribute)bTwrShdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbTwrShd_Name()
  {
    return (EAttribute)bTwrShdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfTwrFile()
  {
    return fTwrFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfTwrFile_Value()
  {
    return (EAttribute)fTwrFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfTwrFile_Name()
  {
    return (EAttribute)fTwrFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbCalcTwrAero()
  {
    return bCalcTwrAeroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCalcTwrAero_Value()
  {
    return (EAttribute)bCalcTwrAeroEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbCalcTwrAero_Name()
  {
    return (EAttribute)bCalcTwrAeroEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnShadHWid()
  {
    return nShadHWidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnShadHWid_Value()
  {
    return (EAttribute)nShadHWidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnShadHWid_Name()
  {
    return (EAttribute)nShadHWidEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTShadRefPt()
  {
    return nTShadRefPtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTShadRefPt_Value()
  {
    return (EAttribute)nTShadRefPtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTShadRefPt_Name()
  {
    return (EAttribute)nTShadRefPtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRho()
  {
    return nRhoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRho_Value()
  {
    return (EAttribute)nRhoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRho_Name()
  {
    return (EAttribute)nRhoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnKinVisc()
  {
    return nKinViscEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnKinVisc_Value()
  {
    return (EAttribute)nKinViscEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnKinVisc_Name()
  {
    return (EAttribute)nKinViscEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnDTAero()
  {
    return nDTAeroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDTAero_Value()
  {
    return (EAttribute)nDTAeroEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDTAero_Name()
  {
    return (EAttribute)nDTAeroEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiNumFoil()
  {
    return iNumFoilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNumFoil_Value()
  {
    return (EAttribute)iNumFoilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNumFoil_Name()
  {
    return (EAttribute)iNumFoilEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaAirfoilList()
  {
    return aAirfoilListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirfoilList_Value()
  {
    return (EAttribute)aAirfoilListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirfoilList_Name()
  {
    return (EAttribute)aAirfoilListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiBldNodes()
  {
    return iBldNodesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiBldNodes_Value()
  {
    return (EAttribute)iBldNodesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiBldNodes_Name()
  {
    return (EAttribute)iBldNodesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaAirStat()
  {
    return aAirStatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_Rnodes()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_Aerotwst()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_Drnodes()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_Chord()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_Nfoil()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaAirStat_Prnelm()
  {
    return (EAttribute)aAirStatEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastadnFactory getFastadnFactory()
  {
    return (FastadnFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelFastadnEClass = createEClass(MODEL_FASTADN);
    createEReference(modelFastadnEClass, MODEL_FASTADN__HEAD);
    createEReference(modelFastadnEClass, MODEL_FASTADN__SI_UNITS);
    createEReference(modelFastadnEClass, MODEL_FASTADN__STALL_MOD);
    createEReference(modelFastadnEClass, MODEL_FASTADN__USE_CM);
    createEReference(modelFastadnEClass, MODEL_FASTADN__INF_MODEL);
    createEReference(modelFastadnEClass, MODEL_FASTADN__IND_MODEL);
    createEReference(modelFastadnEClass, MODEL_FASTADN__ATOLER);
    createEReference(modelFastadnEClass, MODEL_FASTADN__TL_MODEL);
    createEReference(modelFastadnEClass, MODEL_FASTADN__HL_MODEL);
    createEReference(modelFastadnEClass, MODEL_FASTADN__WIND_FILE);
    createEReference(modelFastadnEClass, MODEL_FASTADN__HH);
    createEReference(modelFastadnEClass, MODEL_FASTADN__TWR_SHAD);
    createEReference(modelFastadnEClass, MODEL_FASTADN__SHAD_HWID);
    createEReference(modelFastadnEClass, MODEL_FASTADN__TSHAD_REF_PT);
    createEReference(modelFastadnEClass, MODEL_FASTADN__RHO);
    createEReference(modelFastadnEClass, MODEL_FASTADN__KIN_VISC);
    createEReference(modelFastadnEClass, MODEL_FASTADN__DT_AERO);
    createEReference(modelFastadnEClass, MODEL_FASTADN__NUM_FOIL);
    createEReference(modelFastadnEClass, MODEL_FASTADN__FOIL_NM);
    createEReference(modelFastadnEClass, MODEL_FASTADN__BLD_NODES);
    createEReference(modelFastadnEClass, MODEL_FASTADN__AIR_STAT);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__NAME);

    sUnitsEClass = createEClass(SUNITS);
    createEAttribute(sUnitsEClass, SUNITS__VALUE);
    createEAttribute(sUnitsEClass, SUNITS__NAME);

    sStallModEClass = createEClass(SSTALL_MOD);
    createEAttribute(sStallModEClass, SSTALL_MOD__VALUE);
    createEAttribute(sStallModEClass, SSTALL_MOD__NAME);

    sUseCmEClass = createEClass(SUSE_CM);
    createEAttribute(sUseCmEClass, SUSE_CM__VALUE);
    createEAttribute(sUseCmEClass, SUSE_CM__NAME);

    sInfModelEClass = createEClass(SINF_MODEL);
    createEAttribute(sInfModelEClass, SINF_MODEL__VALUE);
    createEAttribute(sInfModelEClass, SINF_MODEL__NAME);

    sIndModelEClass = createEClass(SIND_MODEL);
    createEAttribute(sIndModelEClass, SIND_MODEL__VALUE);
    createEAttribute(sIndModelEClass, SIND_MODEL__NAME);

    nAtolerEClass = createEClass(NATOLER);
    createEAttribute(nAtolerEClass, NATOLER__VALUE);
    createEAttribute(nAtolerEClass, NATOLER__NAME);

    sTLModelEClass = createEClass(STL_MODEL);
    createEAttribute(sTLModelEClass, STL_MODEL__VALUE);
    createEAttribute(sTLModelEClass, STL_MODEL__NAME);

    sHLModelEClass = createEClass(SHL_MODEL);
    createEAttribute(sHLModelEClass, SHL_MODEL__VALUE);
    createEAttribute(sHLModelEClass, SHL_MODEL__NAME);

    fWindFileEClass = createEClass(FWIND_FILE);
    createEAttribute(fWindFileEClass, FWIND_FILE__VALUE);
    createEAttribute(fWindFileEClass, FWIND_FILE__NAME);

    nHHEClass = createEClass(NHH);
    createEAttribute(nHHEClass, NHH__VALUE);
    createEAttribute(nHHEClass, NHH__NAME);

    nTwrShadEClass = createEClass(NTWR_SHAD);
    createEAttribute(nTwrShadEClass, NTWR_SHAD__VALUE);
    createEAttribute(nTwrShadEClass, NTWR_SHAD__NAME);

    bTwrPotEClass = createEClass(BTWR_POT);
    createEAttribute(bTwrPotEClass, BTWR_POT__VALUE);
    createEAttribute(bTwrPotEClass, BTWR_POT__NAME);

    bTwrShdEClass = createEClass(BTWR_SHD);
    createEAttribute(bTwrShdEClass, BTWR_SHD__VALUE);
    createEAttribute(bTwrShdEClass, BTWR_SHD__NAME);

    fTwrFileEClass = createEClass(FTWR_FILE);
    createEAttribute(fTwrFileEClass, FTWR_FILE__VALUE);
    createEAttribute(fTwrFileEClass, FTWR_FILE__NAME);

    bCalcTwrAeroEClass = createEClass(BCALC_TWR_AERO);
    createEAttribute(bCalcTwrAeroEClass, BCALC_TWR_AERO__VALUE);
    createEAttribute(bCalcTwrAeroEClass, BCALC_TWR_AERO__NAME);

    nShadHWidEClass = createEClass(NSHAD_HWID);
    createEAttribute(nShadHWidEClass, NSHAD_HWID__VALUE);
    createEAttribute(nShadHWidEClass, NSHAD_HWID__NAME);

    nTShadRefPtEClass = createEClass(NT_SHAD_REF_PT);
    createEAttribute(nTShadRefPtEClass, NT_SHAD_REF_PT__VALUE);
    createEAttribute(nTShadRefPtEClass, NT_SHAD_REF_PT__NAME);

    nRhoEClass = createEClass(NRHO);
    createEAttribute(nRhoEClass, NRHO__VALUE);
    createEAttribute(nRhoEClass, NRHO__NAME);

    nKinViscEClass = createEClass(NKIN_VISC);
    createEAttribute(nKinViscEClass, NKIN_VISC__VALUE);
    createEAttribute(nKinViscEClass, NKIN_VISC__NAME);

    nDTAeroEClass = createEClass(NDT_AERO);
    createEAttribute(nDTAeroEClass, NDT_AERO__VALUE);
    createEAttribute(nDTAeroEClass, NDT_AERO__NAME);

    iNumFoilEClass = createEClass(INUM_FOIL);
    createEAttribute(iNumFoilEClass, INUM_FOIL__VALUE);
    createEAttribute(iNumFoilEClass, INUM_FOIL__NAME);

    aAirfoilListEClass = createEClass(AAIRFOIL_LIST);
    createEAttribute(aAirfoilListEClass, AAIRFOIL_LIST__VALUE);
    createEAttribute(aAirfoilListEClass, AAIRFOIL_LIST__NAME);

    iBldNodesEClass = createEClass(IBLD_NODES);
    createEAttribute(iBldNodesEClass, IBLD_NODES__VALUE);
    createEAttribute(iBldNodesEClass, IBLD_NODES__NAME);

    aAirStatEClass = createEClass(AAIR_STAT);
    createEAttribute(aAirStatEClass, AAIR_STAT__RNODES);
    createEAttribute(aAirStatEClass, AAIR_STAT__AEROTWST);
    createEAttribute(aAirStatEClass, AAIR_STAT__DRNODES);
    createEAttribute(aAirStatEClass, AAIR_STAT__CHORD);
    createEAttribute(aAirStatEClass, AAIR_STAT__NFOIL);
    createEAttribute(aAirStatEClass, AAIR_STAT__PRNELM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelFastadnEClass, ModelFastadn.class, "ModelFastadn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelFastadn_Head(), this.getHeader(), null, "Head", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_SIUnits(), this.getsUnits(), null, "SIUnits", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_StallMod(), this.getsStallMod(), null, "StallMod", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_UseCm(), this.getsUseCm(), null, "UseCm", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_InfModel(), this.getsInfModel(), null, "InfModel", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_IndModel(), this.getsIndModel(), null, "IndModel", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_Atoler(), this.getnAtoler(), null, "Atoler", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_TLModel(), this.getsTLModel(), null, "TLModel", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_HLModel(), this.getsHLModel(), null, "HLModel", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_WindFile(), this.getfWindFile(), null, "WindFile", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_HH(), this.getnHH(), null, "HH", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_TwrShad(), this.getnTwrShad(), null, "TwrShad", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_ShadHWid(), this.getnShadHWid(), null, "ShadHWid", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_TShadRefPt(), this.getnTShadRefPt(), null, "TShadRefPt", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_Rho(), this.getnRho(), null, "Rho", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_KinVisc(), this.getnKinVisc(), null, "KinVisc", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_DTAero(), this.getnDTAero(), null, "DTAero", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_NumFoil(), this.getiNumFoil(), null, "NumFoil", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_FoilNm(), this.getaAirfoilList(), null, "FoilNm", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_BldNodes(), this.getiBldNodes(), null, "BldNodes", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFastadn_AirStat(), this.getaAirStat(), null, "AirStat", null, 0, 1, ModelFastadn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sUnitsEClass, sUnits.class, "sUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsUnits_Value(), ecorePackage.getEString(), "value", null, 0, 1, sUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsUnits_Name(), ecorePackage.getEString(), "name", null, 0, 1, sUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sStallModEClass, sStallMod.class, "sStallMod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsStallMod_Value(), ecorePackage.getEString(), "value", null, 0, 1, sStallMod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsStallMod_Name(), ecorePackage.getEString(), "name", null, 0, 1, sStallMod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sUseCmEClass, sUseCm.class, "sUseCm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsUseCm_Value(), ecorePackage.getEString(), "value", null, 0, 1, sUseCm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsUseCm_Name(), ecorePackage.getEString(), "name", null, 0, 1, sUseCm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sInfModelEClass, sInfModel.class, "sInfModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsInfModel_Value(), ecorePackage.getEString(), "value", null, 0, 1, sInfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsInfModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, sInfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sIndModelEClass, sIndModel.class, "sIndModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsIndModel_Value(), ecorePackage.getEString(), "value", null, 0, 1, sIndModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsIndModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, sIndModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nAtolerEClass, nAtoler.class, "nAtoler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnAtoler_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nAtoler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAtoler_Name(), ecorePackage.getEString(), "name", null, 0, 1, nAtoler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sTLModelEClass, sTLModel.class, "sTLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsTLModel_Value(), ecorePackage.getEString(), "value", null, 0, 1, sTLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsTLModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, sTLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sHLModelEClass, sHLModel.class, "sHLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsHLModel_Value(), ecorePackage.getEString(), "value", null, 0, 1, sHLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsHLModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, sHLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fWindFileEClass, fWindFile.class, "fWindFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfWindFile_Value(), ecorePackage.getEString(), "value", null, 0, 1, fWindFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfWindFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, fWindFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nHHEClass, nHH.class, "nHH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnHH_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nHH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnHH_Name(), ecorePackage.getEString(), "name", null, 0, 1, nHH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTwrShadEClass, nTwrShad.class, "nTwrShad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTwrShad_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTwrShad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTwrShad_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTwrShad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bTwrPotEClass, bTwrPot.class, "bTwrPot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbTwrPot_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bTwrPot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbTwrPot_Name(), ecorePackage.getEString(), "name", null, 0, 1, bTwrPot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bTwrShdEClass, bTwrShd.class, "bTwrShd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbTwrShd_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bTwrShd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbTwrShd_Name(), ecorePackage.getEString(), "name", null, 0, 1, bTwrShd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fTwrFileEClass, fTwrFile.class, "fTwrFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfTwrFile_Value(), ecorePackage.getEString(), "value", null, 0, 1, fTwrFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfTwrFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, fTwrFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bCalcTwrAeroEClass, bCalcTwrAero.class, "bCalcTwrAero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbCalcTwrAero_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bCalcTwrAero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbCalcTwrAero_Name(), ecorePackage.getEString(), "name", null, 0, 1, bCalcTwrAero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nShadHWidEClass, nShadHWid.class, "nShadHWid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnShadHWid_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nShadHWid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnShadHWid_Name(), ecorePackage.getEString(), "name", null, 0, 1, nShadHWid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTShadRefPtEClass, nTShadRefPt.class, "nTShadRefPt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTShadRefPt_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTShadRefPt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTShadRefPt_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTShadRefPt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRhoEClass, nRho.class, "nRho", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRho_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nRho.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnRho_Name(), ecorePackage.getEString(), "name", null, 0, 1, nRho.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nKinViscEClass, nKinVisc.class, "nKinVisc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnKinVisc_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nKinVisc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnKinVisc_Name(), ecorePackage.getEString(), "name", null, 0, 1, nKinVisc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nDTAeroEClass, nDTAero.class, "nDTAero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnDTAero_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nDTAero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnDTAero_Name(), ecorePackage.getEString(), "name", null, 0, 1, nDTAero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iNumFoilEClass, iNumFoil.class, "iNumFoil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiNumFoil_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iNumFoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiNumFoil_Name(), ecorePackage.getEString(), "name", null, 0, 1, iNumFoil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aAirfoilListEClass, aAirfoilList.class, "aAirfoilList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaAirfoilList_Value(), ecorePackage.getEString(), "value", null, 0, -1, aAirfoilList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirfoilList_Name(), ecorePackage.getEString(), "name", null, 0, 1, aAirfoilList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iBldNodesEClass, iBldNodes.class, "iBldNodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiBldNodes_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iBldNodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiBldNodes_Name(), ecorePackage.getEString(), "name", null, 0, 1, iBldNodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aAirStatEClass, aAirStat.class, "aAirStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaAirStat_Rnodes(), ecorePackage.getEFloat(), "rnodes", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_Aerotwst(), ecorePackage.getEFloat(), "aerotwst", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_Drnodes(), ecorePackage.getEFloat(), "drnodes", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_Chord(), ecorePackage.getEFloat(), "chord", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_Nfoil(), ecorePackage.getEInt(), "nfoil", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaAirStat_Prnelm(), ecorePackage.getEString(), "prnelm", null, 0, -1, aAirStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FastadnPackageImpl
