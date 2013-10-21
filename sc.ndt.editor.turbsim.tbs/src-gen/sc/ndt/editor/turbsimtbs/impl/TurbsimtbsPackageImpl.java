/**
 */
package sc.ndt.editor.turbsimtbs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.ndt.editor.turbsimtbs.Header;
import sc.ndt.editor.turbsimtbs.ModelTurbsimtbs;
import sc.ndt.editor.turbsimtbs.Section;
import sc.ndt.editor.turbsimtbs.TurbsimtbsFactory;
import sc.ndt.editor.turbsimtbs.TurbsimtbsPackage;
import sc.ndt.editor.turbsimtbs.bClockwise;
import sc.ndt.editor.turbsimtbs.bRandomize;
import sc.ndt.editor.turbsimtbs.bWrACT;
import sc.ndt.editor.turbsimtbs.bWrADFF;
import sc.ndt.editor.turbsimtbs.bWrADHH;
import sc.ndt.editor.turbsimtbs.bWrADTWR;
import sc.ndt.editor.turbsimtbs.bWrBHHTP;
import sc.ndt.editor.turbsimtbs.bWrBLFF;
import sc.ndt.editor.turbsimtbs.bWrFHHTP;
import sc.ndt.editor.turbsimtbs.bWrFMTFF;
import sc.ndt.editor.turbsimtbs.iNumGrid_Y;
import sc.ndt.editor.turbsimtbs.iNumGrid_Z;
import sc.ndt.editor.turbsimtbs.iScaleIEC;
import sc.ndt.editor.turbsimtbs.nAnalysisTime;
import sc.ndt.editor.turbsimtbs.nCTLy;
import sc.ndt.editor.turbsimtbs.nCTLz;
import sc.ndt.editor.turbsimtbs.nCTStartTime;
import sc.ndt.editor.turbsimtbs.nCohExp;
import sc.ndt.editor.turbsimtbs.nDistScl;
import sc.ndt.editor.turbsimtbs.nGridHeight;
import sc.ndt.editor.turbsimtbs.nGridWidth;
import sc.ndt.editor.turbsimtbs.nHFlowAng;
import sc.ndt.editor.turbsimtbs.nHubHt;
import sc.ndt.editor.turbsimtbs.nIncDec1;
import sc.ndt.editor.turbsimtbs.nIncDec2;
import sc.ndt.editor.turbsimtbs.nIncDec3;
import sc.ndt.editor.turbsimtbs.nLocation;
import sc.ndt.editor.turbsimtbs.nPC_UV;
import sc.ndt.editor.turbsimtbs.nPC_UW;
import sc.ndt.editor.turbsimtbs.nPC_VW;
import sc.ndt.editor.turbsimtbs.nPLExp;
import sc.ndt.editor.turbsimtbs.nRICH_NO;
import sc.ndt.editor.turbsimtbs.nRandSeed1;
import sc.ndt.editor.turbsimtbs.nRandSeed2;
import sc.ndt.editor.turbsimtbs.nRefHt;
import sc.ndt.editor.turbsimtbs.nTimeStep;
import sc.ndt.editor.turbsimtbs.nUStar;
import sc.ndt.editor.turbsimtbs.nUref;
import sc.ndt.editor.turbsimtbs.nUsableTime;
import sc.ndt.editor.turbsimtbs.nVFlowAng;
import sc.ndt.editor.turbsimtbs.nZ0;
import sc.ndt.editor.turbsimtbs.nZI;
import sc.ndt.editor.turbsimtbs.nZJetMax;
import sc.ndt.editor.turbsimtbs.sCTEventFile;
import sc.ndt.editor.turbsimtbs.sCTEventPath;
import sc.ndt.editor.turbsimtbs.sETMc;
import sc.ndt.editor.turbsimtbs.sIEC_WindType;
import sc.ndt.editor.turbsimtbs.sIECstandard;
import sc.ndt.editor.turbsimtbs.sIECturbc;
import sc.ndt.editor.turbsimtbs.sTurbModel;
import sc.ndt.editor.turbsimtbs.sWindProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurbsimtbsPackageImpl extends EPackageImpl implements TurbsimtbsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelTurbsimtbsEClass = null;

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
  private EClass sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRandSeed1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRandSeed2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bWrBHHTPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bWrFHHTPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bWrADHHEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bWrADFFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bWrBLFFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bWrADTWREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bWrFMTFFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bWrACTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bClockwiseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iScaleIECEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iNumGrid_ZEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iNumGrid_YEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nTimeStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nAnalysisTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nUsableTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHubHtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nGridHeightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nGridWidthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nVFlowAngEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nHFlowAngEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sTurbModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sIECstandardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sIECturbcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sIEC_WindTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sETMcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sWindProfileTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRefHtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nUrefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nZJetMaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPLExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nZ0EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nLocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nRICH_NOEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nUStarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nZIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPC_UWEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPC_UVEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nPC_VWEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIncDec1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIncDec2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nIncDec3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nCohExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sCTEventPathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sCTEventFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bRandomizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nDistSclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nCTLyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nCTLzEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nCTStartTimeEClass = null;

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
   * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TurbsimtbsPackageImpl()
  {
    super(eNS_URI, TurbsimtbsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TurbsimtbsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TurbsimtbsPackage init()
  {
    if (isInited) return (TurbsimtbsPackage)EPackage.Registry.INSTANCE.getEPackage(TurbsimtbsPackage.eNS_URI);

    // Obtain or create and register package
    TurbsimtbsPackageImpl theTurbsimtbsPackage = (TurbsimtbsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TurbsimtbsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TurbsimtbsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTurbsimtbsPackage.createPackageContents();

    // Initialize created meta-data
    theTurbsimtbsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTurbsimtbsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TurbsimtbsPackage.eNS_URI, theTurbsimtbsPackage);
    return theTurbsimtbsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelTurbsimtbs()
  {
    return modelTurbsimtbsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_Head()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_Sections()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_RandSeed1()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_RandSeed2()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WrBHHTP()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WrFHHTP()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WrADHH()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WrADFF()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WrBLFF()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WrADTWR()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WrFMTFF()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WrACT()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_Clockwise()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_ScaleIEC()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_NumGrid_Z()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_NumGrid_Y()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_TimeStep()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_AnalysisTime()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_UsableTime()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_HubHt()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_GridHeight()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_GridWidth()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_VFlowAng()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_HFlowAng()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_TurbModel()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_IECstandard()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_IECturbc()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_IEC_WindType()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_ETMc()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_WindProfileType()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_RefHt()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_Uref()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_ZJetMax()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_PLExp()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_Z0()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_Location()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_RICH_NO()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_UStar()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_ZI()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_PC_UW()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_PC_UV()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_PC_VW()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_IncDec1()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_IncDec2()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(43);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_IncDec3()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(44);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_CohExp()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(45);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_CTEventPath()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(46);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_CTEventFile()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(47);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_Randomize()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(48);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_DistScl()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(49);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_CTLy()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(50);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_CTLz()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(51);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelTurbsimtbs_CTStartTime()
  {
    return (EReference)modelTurbsimtbsEClass.getEStructuralFeatures().get(52);
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
  public EAttribute getHeader_Rows()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Name()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRandSeed1()
  {
    return nRandSeed1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRandSeed1_Value()
  {
    return (EAttribute)nRandSeed1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRandSeed1_Name()
  {
    return (EAttribute)nRandSeed1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRandSeed2()
  {
    return nRandSeed2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRandSeed2_Value()
  {
    return (EAttribute)nRandSeed2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRandSeed2_Name()
  {
    return (EAttribute)nRandSeed2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbWrBHHTP()
  {
    return bWrBHHTPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrBHHTP_Value()
  {
    return (EAttribute)bWrBHHTPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrBHHTP_Name()
  {
    return (EAttribute)bWrBHHTPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbWrFHHTP()
  {
    return bWrFHHTPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrFHHTP_Value()
  {
    return (EAttribute)bWrFHHTPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrFHHTP_Name()
  {
    return (EAttribute)bWrFHHTPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbWrADHH()
  {
    return bWrADHHEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrADHH_Value()
  {
    return (EAttribute)bWrADHHEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrADHH_Name()
  {
    return (EAttribute)bWrADHHEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbWrADFF()
  {
    return bWrADFFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrADFF_Value()
  {
    return (EAttribute)bWrADFFEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrADFF_Name()
  {
    return (EAttribute)bWrADFFEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbWrBLFF()
  {
    return bWrBLFFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrBLFF_Value()
  {
    return (EAttribute)bWrBLFFEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrBLFF_Name()
  {
    return (EAttribute)bWrBLFFEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbWrADTWR()
  {
    return bWrADTWREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrADTWR_Value()
  {
    return (EAttribute)bWrADTWREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrADTWR_Name()
  {
    return (EAttribute)bWrADTWREClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbWrFMTFF()
  {
    return bWrFMTFFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrFMTFF_Value()
  {
    return (EAttribute)bWrFMTFFEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrFMTFF_Name()
  {
    return (EAttribute)bWrFMTFFEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbWrACT()
  {
    return bWrACTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrACT_Value()
  {
    return (EAttribute)bWrACTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbWrACT_Name()
  {
    return (EAttribute)bWrACTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbClockwise()
  {
    return bClockwiseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbClockwise_Value()
  {
    return (EAttribute)bClockwiseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbClockwise_Name()
  {
    return (EAttribute)bClockwiseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiScaleIEC()
  {
    return iScaleIECEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiScaleIEC_Value()
  {
    return (EAttribute)iScaleIECEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiScaleIEC_Name()
  {
    return (EAttribute)iScaleIECEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiNumGrid_Z()
  {
    return iNumGrid_ZEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNumGrid_Z_Value()
  {
    return (EAttribute)iNumGrid_ZEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNumGrid_Z_Name()
  {
    return (EAttribute)iNumGrid_ZEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getiNumGrid_Y()
  {
    return iNumGrid_YEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNumGrid_Y_Value()
  {
    return (EAttribute)iNumGrid_YEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getiNumGrid_Y_Name()
  {
    return (EAttribute)iNumGrid_YEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnTimeStep()
  {
    return nTimeStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTimeStep_Value()
  {
    return (EAttribute)nTimeStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnTimeStep_Name()
  {
    return (EAttribute)nTimeStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnAnalysisTime()
  {
    return nAnalysisTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAnalysisTime_Value()
  {
    return (EAttribute)nAnalysisTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAnalysisTime_Name()
  {
    return (EAttribute)nAnalysisTimeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnUsableTime()
  {
    return nUsableTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnUsableTime_Value()
  {
    return (EAttribute)nUsableTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnUsableTime_Name()
  {
    return (EAttribute)nUsableTimeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHubHt()
  {
    return nHubHtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubHt_Value()
  {
    return (EAttribute)nHubHtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHubHt_Name()
  {
    return (EAttribute)nHubHtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnGridHeight()
  {
    return nGridHeightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGridHeight_Value()
  {
    return (EAttribute)nGridHeightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGridHeight_Name()
  {
    return (EAttribute)nGridHeightEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnGridWidth()
  {
    return nGridWidthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGridWidth_Value()
  {
    return (EAttribute)nGridWidthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnGridWidth_Name()
  {
    return (EAttribute)nGridWidthEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnVFlowAng()
  {
    return nVFlowAngEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVFlowAng_Value()
  {
    return (EAttribute)nVFlowAngEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnVFlowAng_Name()
  {
    return (EAttribute)nVFlowAngEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnHFlowAng()
  {
    return nHFlowAngEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHFlowAng_Value()
  {
    return (EAttribute)nHFlowAngEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnHFlowAng_Name()
  {
    return (EAttribute)nHFlowAngEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsTurbModel()
  {
    return sTurbModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsTurbModel_Value()
  {
    return (EAttribute)sTurbModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsTurbModel_Name()
  {
    return (EAttribute)sTurbModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsIECstandard()
  {
    return sIECstandardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsIECstandard_Value()
  {
    return (EAttribute)sIECstandardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsIECstandard_Name()
  {
    return (EAttribute)sIECstandardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsIECturbc()
  {
    return sIECturbcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsIECturbc_Value()
  {
    return (EAttribute)sIECturbcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsIECturbc_Name()
  {
    return (EAttribute)sIECturbcEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsIEC_WindType()
  {
    return sIEC_WindTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsIEC_WindType_Value()
  {
    return (EAttribute)sIEC_WindTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsIEC_WindType_Name()
  {
    return (EAttribute)sIEC_WindTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsETMc()
  {
    return sETMcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsETMc_Value()
  {
    return (EAttribute)sETMcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsETMc_Name()
  {
    return (EAttribute)sETMcEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsWindProfileType()
  {
    return sWindProfileTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsWindProfileType_Value()
  {
    return (EAttribute)sWindProfileTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsWindProfileType_Name()
  {
    return (EAttribute)sWindProfileTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRefHt()
  {
    return nRefHtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRefHt_Value()
  {
    return (EAttribute)nRefHtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRefHt_Name()
  {
    return (EAttribute)nRefHtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnUref()
  {
    return nUrefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnUref_Value()
  {
    return (EAttribute)nUrefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnUref_Name()
  {
    return (EAttribute)nUrefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnZJetMax()
  {
    return nZJetMaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnZJetMax_Value()
  {
    return (EAttribute)nZJetMaxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnZJetMax_Name()
  {
    return (EAttribute)nZJetMaxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPLExp()
  {
    return nPLExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPLExp_Value()
  {
    return (EAttribute)nPLExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPLExp_Name()
  {
    return (EAttribute)nPLExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnZ0()
  {
    return nZ0EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnZ0_Value()
  {
    return (EAttribute)nZ0EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnZ0_Name()
  {
    return (EAttribute)nZ0EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnLocation()
  {
    return nLocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnLocation_Value()
  {
    return (EAttribute)nLocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnLocation_Name()
  {
    return (EAttribute)nLocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnRICH_NO()
  {
    return nRICH_NOEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRICH_NO_Value()
  {
    return (EAttribute)nRICH_NOEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnRICH_NO_Name()
  {
    return (EAttribute)nRICH_NOEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnUStar()
  {
    return nUStarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnUStar_Value()
  {
    return (EAttribute)nUStarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnUStar_Name()
  {
    return (EAttribute)nUStarEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnZI()
  {
    return nZIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnZI_Value()
  {
    return (EAttribute)nZIEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnZI_Name()
  {
    return (EAttribute)nZIEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPC_UW()
  {
    return nPC_UWEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPC_UW_Value()
  {
    return (EAttribute)nPC_UWEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPC_UW_Name()
  {
    return (EAttribute)nPC_UWEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPC_UV()
  {
    return nPC_UVEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPC_UV_Value()
  {
    return (EAttribute)nPC_UVEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPC_UV_Name()
  {
    return (EAttribute)nPC_UVEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnPC_VW()
  {
    return nPC_VWEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPC_VW_Value()
  {
    return (EAttribute)nPC_VWEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnPC_VW_Name()
  {
    return (EAttribute)nPC_VWEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIncDec1()
  {
    return nIncDec1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIncDec1_Value()
  {
    return (EAttribute)nIncDec1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIncDec1_Name()
  {
    return (EAttribute)nIncDec1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIncDec2()
  {
    return nIncDec2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIncDec2_Value()
  {
    return (EAttribute)nIncDec2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIncDec2_Name()
  {
    return (EAttribute)nIncDec2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnIncDec3()
  {
    return nIncDec3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIncDec3_Value()
  {
    return (EAttribute)nIncDec3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnIncDec3_Name()
  {
    return (EAttribute)nIncDec3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnCohExp()
  {
    return nCohExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCohExp_Value()
  {
    return (EAttribute)nCohExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCohExp_Name()
  {
    return (EAttribute)nCohExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsCTEventPath()
  {
    return sCTEventPathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsCTEventPath_Value()
  {
    return (EAttribute)sCTEventPathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsCTEventPath_Name()
  {
    return (EAttribute)sCTEventPathEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsCTEventFile()
  {
    return sCTEventFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsCTEventFile_Value()
  {
    return (EAttribute)sCTEventFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsCTEventFile_Name()
  {
    return (EAttribute)sCTEventFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbRandomize()
  {
    return bRandomizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbRandomize_Value()
  {
    return (EAttribute)bRandomizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbRandomize_Name()
  {
    return (EAttribute)bRandomizeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnDistScl()
  {
    return nDistSclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDistScl_Value()
  {
    return (EAttribute)nDistSclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnDistScl_Name()
  {
    return (EAttribute)nDistSclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnCTLy()
  {
    return nCTLyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCTLy_Value()
  {
    return (EAttribute)nCTLyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCTLy_Name()
  {
    return (EAttribute)nCTLyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnCTLz()
  {
    return nCTLzEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCTLz_Value()
  {
    return (EAttribute)nCTLzEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCTLz_Name()
  {
    return (EAttribute)nCTLzEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnCTStartTime()
  {
    return nCTStartTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCTStartTime_Value()
  {
    return (EAttribute)nCTStartTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnCTStartTime_Name()
  {
    return (EAttribute)nCTStartTimeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurbsimtbsFactory getTurbsimtbsFactory()
  {
    return (TurbsimtbsFactory)getEFactoryInstance();
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
    modelTurbsimtbsEClass = createEClass(MODEL_TURBSIMTBS);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__HEAD);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__SECTIONS);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__RAND_SEED1);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__RAND_SEED2);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WR_BHHTP);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WR_FHHTP);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WR_ADHH);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WR_ADFF);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WR_BLFF);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WR_ADTWR);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WR_FMTFF);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WR_ACT);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__CLOCKWISE);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__SCALE_IEC);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__NUM_GRID_Z);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__NUM_GRID_Y);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__TIME_STEP);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__ANALYSIS_TIME);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__USABLE_TIME);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__HUB_HT);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__GRID_HEIGHT);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__GRID_WIDTH);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__VFLOW_ANG);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__HFLOW_ANG);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__TURB_MODEL);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__IE_CSTANDARD);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__IE_CTURBC);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__IEC_WIND_TYPE);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__ET_MC);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__WIND_PROFILE_TYPE);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__REF_HT);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__UREF);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__ZJET_MAX);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__PL_EXP);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__Z0);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__LOCATION);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__RICH_NO);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__USTAR);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__ZI);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__PC_UW);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__PC_UV);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__PC_VW);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__INC_DEC1);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__INC_DEC2);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__INC_DEC3);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__COH_EXP);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__CT_EVENT_PATH);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__CT_EVENT_FILE);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__RANDOMIZE);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__DIST_SCL);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__CT_LY);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__CT_LZ);
    createEReference(modelTurbsimtbsEClass, MODEL_TURBSIMTBS__CT_START_TIME);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__ROWS);

    sectionEClass = createEClass(SECTION);
    createEAttribute(sectionEClass, SECTION__NAME);

    nRandSeed1EClass = createEClass(NRAND_SEED1);
    createEAttribute(nRandSeed1EClass, NRAND_SEED1__VALUE);
    createEAttribute(nRandSeed1EClass, NRAND_SEED1__NAME);

    nRandSeed2EClass = createEClass(NRAND_SEED2);
    createEAttribute(nRandSeed2EClass, NRAND_SEED2__VALUE);
    createEAttribute(nRandSeed2EClass, NRAND_SEED2__NAME);

    bWrBHHTPEClass = createEClass(BWR_BHHTP);
    createEAttribute(bWrBHHTPEClass, BWR_BHHTP__VALUE);
    createEAttribute(bWrBHHTPEClass, BWR_BHHTP__NAME);

    bWrFHHTPEClass = createEClass(BWR_FHHTP);
    createEAttribute(bWrFHHTPEClass, BWR_FHHTP__VALUE);
    createEAttribute(bWrFHHTPEClass, BWR_FHHTP__NAME);

    bWrADHHEClass = createEClass(BWR_ADHH);
    createEAttribute(bWrADHHEClass, BWR_ADHH__VALUE);
    createEAttribute(bWrADHHEClass, BWR_ADHH__NAME);

    bWrADFFEClass = createEClass(BWR_ADFF);
    createEAttribute(bWrADFFEClass, BWR_ADFF__VALUE);
    createEAttribute(bWrADFFEClass, BWR_ADFF__NAME);

    bWrBLFFEClass = createEClass(BWR_BLFF);
    createEAttribute(bWrBLFFEClass, BWR_BLFF__VALUE);
    createEAttribute(bWrBLFFEClass, BWR_BLFF__NAME);

    bWrADTWREClass = createEClass(BWR_ADTWR);
    createEAttribute(bWrADTWREClass, BWR_ADTWR__VALUE);
    createEAttribute(bWrADTWREClass, BWR_ADTWR__NAME);

    bWrFMTFFEClass = createEClass(BWR_FMTFF);
    createEAttribute(bWrFMTFFEClass, BWR_FMTFF__VALUE);
    createEAttribute(bWrFMTFFEClass, BWR_FMTFF__NAME);

    bWrACTEClass = createEClass(BWR_ACT);
    createEAttribute(bWrACTEClass, BWR_ACT__VALUE);
    createEAttribute(bWrACTEClass, BWR_ACT__NAME);

    bClockwiseEClass = createEClass(BCLOCKWISE);
    createEAttribute(bClockwiseEClass, BCLOCKWISE__VALUE);
    createEAttribute(bClockwiseEClass, BCLOCKWISE__NAME);

    iScaleIECEClass = createEClass(ISCALE_IEC);
    createEAttribute(iScaleIECEClass, ISCALE_IEC__VALUE);
    createEAttribute(iScaleIECEClass, ISCALE_IEC__NAME);

    iNumGrid_ZEClass = createEClass(INUM_GRID_Z);
    createEAttribute(iNumGrid_ZEClass, INUM_GRID_Z__VALUE);
    createEAttribute(iNumGrid_ZEClass, INUM_GRID_Z__NAME);

    iNumGrid_YEClass = createEClass(INUM_GRID_Y);
    createEAttribute(iNumGrid_YEClass, INUM_GRID_Y__VALUE);
    createEAttribute(iNumGrid_YEClass, INUM_GRID_Y__NAME);

    nTimeStepEClass = createEClass(NTIME_STEP);
    createEAttribute(nTimeStepEClass, NTIME_STEP__VALUE);
    createEAttribute(nTimeStepEClass, NTIME_STEP__NAME);

    nAnalysisTimeEClass = createEClass(NANALYSIS_TIME);
    createEAttribute(nAnalysisTimeEClass, NANALYSIS_TIME__VALUE);
    createEAttribute(nAnalysisTimeEClass, NANALYSIS_TIME__NAME);

    nUsableTimeEClass = createEClass(NUSABLE_TIME);
    createEAttribute(nUsableTimeEClass, NUSABLE_TIME__VALUE);
    createEAttribute(nUsableTimeEClass, NUSABLE_TIME__NAME);

    nHubHtEClass = createEClass(NHUB_HT);
    createEAttribute(nHubHtEClass, NHUB_HT__VALUE);
    createEAttribute(nHubHtEClass, NHUB_HT__NAME);

    nGridHeightEClass = createEClass(NGRID_HEIGHT);
    createEAttribute(nGridHeightEClass, NGRID_HEIGHT__VALUE);
    createEAttribute(nGridHeightEClass, NGRID_HEIGHT__NAME);

    nGridWidthEClass = createEClass(NGRID_WIDTH);
    createEAttribute(nGridWidthEClass, NGRID_WIDTH__VALUE);
    createEAttribute(nGridWidthEClass, NGRID_WIDTH__NAME);

    nVFlowAngEClass = createEClass(NV_FLOW_ANG);
    createEAttribute(nVFlowAngEClass, NV_FLOW_ANG__VALUE);
    createEAttribute(nVFlowAngEClass, NV_FLOW_ANG__NAME);

    nHFlowAngEClass = createEClass(NH_FLOW_ANG);
    createEAttribute(nHFlowAngEClass, NH_FLOW_ANG__VALUE);
    createEAttribute(nHFlowAngEClass, NH_FLOW_ANG__NAME);

    sTurbModelEClass = createEClass(STURB_MODEL);
    createEAttribute(sTurbModelEClass, STURB_MODEL__VALUE);
    createEAttribute(sTurbModelEClass, STURB_MODEL__NAME);

    sIECstandardEClass = createEClass(SIE_CSTANDARD);
    createEAttribute(sIECstandardEClass, SIE_CSTANDARD__VALUE);
    createEAttribute(sIECstandardEClass, SIE_CSTANDARD__NAME);

    sIECturbcEClass = createEClass(SIE_CTURBC);
    createEAttribute(sIECturbcEClass, SIE_CTURBC__VALUE);
    createEAttribute(sIECturbcEClass, SIE_CTURBC__NAME);

    sIEC_WindTypeEClass = createEClass(SIEC_WIND_TYPE);
    createEAttribute(sIEC_WindTypeEClass, SIEC_WIND_TYPE__VALUE);
    createEAttribute(sIEC_WindTypeEClass, SIEC_WIND_TYPE__NAME);

    sETMcEClass = createEClass(SET_MC);
    createEAttribute(sETMcEClass, SET_MC__VALUE);
    createEAttribute(sETMcEClass, SET_MC__NAME);

    sWindProfileTypeEClass = createEClass(SWIND_PROFILE_TYPE);
    createEAttribute(sWindProfileTypeEClass, SWIND_PROFILE_TYPE__VALUE);
    createEAttribute(sWindProfileTypeEClass, SWIND_PROFILE_TYPE__NAME);

    nRefHtEClass = createEClass(NREF_HT);
    createEAttribute(nRefHtEClass, NREF_HT__VALUE);
    createEAttribute(nRefHtEClass, NREF_HT__NAME);

    nUrefEClass = createEClass(NUREF);
    createEAttribute(nUrefEClass, NUREF__VALUE);
    createEAttribute(nUrefEClass, NUREF__NAME);

    nZJetMaxEClass = createEClass(NZ_JET_MAX);
    createEAttribute(nZJetMaxEClass, NZ_JET_MAX__VALUE);
    createEAttribute(nZJetMaxEClass, NZ_JET_MAX__NAME);

    nPLExpEClass = createEClass(NPL_EXP);
    createEAttribute(nPLExpEClass, NPL_EXP__VALUE);
    createEAttribute(nPLExpEClass, NPL_EXP__NAME);

    nZ0EClass = createEClass(NZ0);
    createEAttribute(nZ0EClass, NZ0__VALUE);
    createEAttribute(nZ0EClass, NZ0__NAME);

    nLocationEClass = createEClass(NLOCATION);
    createEAttribute(nLocationEClass, NLOCATION__VALUE);
    createEAttribute(nLocationEClass, NLOCATION__NAME);

    nRICH_NOEClass = createEClass(NRICH_NO);
    createEAttribute(nRICH_NOEClass, NRICH_NO__VALUE);
    createEAttribute(nRICH_NOEClass, NRICH_NO__NAME);

    nUStarEClass = createEClass(NU_STAR);
    createEAttribute(nUStarEClass, NU_STAR__VALUE);
    createEAttribute(nUStarEClass, NU_STAR__NAME);

    nZIEClass = createEClass(NZI);
    createEAttribute(nZIEClass, NZI__VALUE);
    createEAttribute(nZIEClass, NZI__NAME);

    nPC_UWEClass = createEClass(NPC_UW);
    createEAttribute(nPC_UWEClass, NPC_UW__VALUE);
    createEAttribute(nPC_UWEClass, NPC_UW__NAME);

    nPC_UVEClass = createEClass(NPC_UV);
    createEAttribute(nPC_UVEClass, NPC_UV__VALUE);
    createEAttribute(nPC_UVEClass, NPC_UV__NAME);

    nPC_VWEClass = createEClass(NPC_VW);
    createEAttribute(nPC_VWEClass, NPC_VW__VALUE);
    createEAttribute(nPC_VWEClass, NPC_VW__NAME);

    nIncDec1EClass = createEClass(NINC_DEC1);
    createEAttribute(nIncDec1EClass, NINC_DEC1__VALUE);
    createEAttribute(nIncDec1EClass, NINC_DEC1__NAME);

    nIncDec2EClass = createEClass(NINC_DEC2);
    createEAttribute(nIncDec2EClass, NINC_DEC2__VALUE);
    createEAttribute(nIncDec2EClass, NINC_DEC2__NAME);

    nIncDec3EClass = createEClass(NINC_DEC3);
    createEAttribute(nIncDec3EClass, NINC_DEC3__VALUE);
    createEAttribute(nIncDec3EClass, NINC_DEC3__NAME);

    nCohExpEClass = createEClass(NCOH_EXP);
    createEAttribute(nCohExpEClass, NCOH_EXP__VALUE);
    createEAttribute(nCohExpEClass, NCOH_EXP__NAME);

    sCTEventPathEClass = createEClass(SCT_EVENT_PATH);
    createEAttribute(sCTEventPathEClass, SCT_EVENT_PATH__VALUE);
    createEAttribute(sCTEventPathEClass, SCT_EVENT_PATH__NAME);

    sCTEventFileEClass = createEClass(SCT_EVENT_FILE);
    createEAttribute(sCTEventFileEClass, SCT_EVENT_FILE__VALUE);
    createEAttribute(sCTEventFileEClass, SCT_EVENT_FILE__NAME);

    bRandomizeEClass = createEClass(BRANDOMIZE);
    createEAttribute(bRandomizeEClass, BRANDOMIZE__VALUE);
    createEAttribute(bRandomizeEClass, BRANDOMIZE__NAME);

    nDistSclEClass = createEClass(NDIST_SCL);
    createEAttribute(nDistSclEClass, NDIST_SCL__VALUE);
    createEAttribute(nDistSclEClass, NDIST_SCL__NAME);

    nCTLyEClass = createEClass(NCT_LY);
    createEAttribute(nCTLyEClass, NCT_LY__VALUE);
    createEAttribute(nCTLyEClass, NCT_LY__NAME);

    nCTLzEClass = createEClass(NCT_LZ);
    createEAttribute(nCTLzEClass, NCT_LZ__VALUE);
    createEAttribute(nCTLzEClass, NCT_LZ__NAME);

    nCTStartTimeEClass = createEClass(NCT_START_TIME);
    createEAttribute(nCTStartTimeEClass, NCT_START_TIME__VALUE);
    createEAttribute(nCTStartTimeEClass, NCT_START_TIME__NAME);
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
    initEClass(modelTurbsimtbsEClass, ModelTurbsimtbs.class, "ModelTurbsimtbs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelTurbsimtbs_Head(), this.getHeader(), null, "Head", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_Sections(), this.getSection(), null, "sections", null, 0, -1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_RandSeed1(), this.getnRandSeed1(), null, "RandSeed1", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_RandSeed2(), this.getnRandSeed2(), null, "RandSeed2", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WrBHHTP(), this.getbWrBHHTP(), null, "WrBHHTP", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WrFHHTP(), this.getbWrFHHTP(), null, "WrFHHTP", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WrADHH(), this.getbWrADHH(), null, "WrADHH", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WrADFF(), this.getbWrADFF(), null, "WrADFF", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WrBLFF(), this.getbWrBLFF(), null, "WrBLFF", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WrADTWR(), this.getbWrADTWR(), null, "WrADTWR", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WrFMTFF(), this.getbWrFMTFF(), null, "WrFMTFF", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WrACT(), this.getbWrACT(), null, "WrACT", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_Clockwise(), this.getbClockwise(), null, "Clockwise", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_ScaleIEC(), this.getiScaleIEC(), null, "ScaleIEC", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_NumGrid_Z(), this.getiNumGrid_Z(), null, "NumGrid_Z", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_NumGrid_Y(), this.getiNumGrid_Y(), null, "NumGrid_Y", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_TimeStep(), this.getnTimeStep(), null, "TimeStep", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_AnalysisTime(), this.getnAnalysisTime(), null, "AnalysisTime", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_UsableTime(), this.getnUsableTime(), null, "UsableTime", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_HubHt(), this.getnHubHt(), null, "HubHt", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_GridHeight(), this.getnGridHeight(), null, "GridHeight", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_GridWidth(), this.getnGridWidth(), null, "GridWidth", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_VFlowAng(), this.getnVFlowAng(), null, "VFlowAng", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_HFlowAng(), this.getnHFlowAng(), null, "HFlowAng", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_TurbModel(), this.getsTurbModel(), null, "TurbModel", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_IECstandard(), this.getsIECstandard(), null, "IECstandard", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_IECturbc(), this.getsIECturbc(), null, "IECturbc", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_IEC_WindType(), this.getsIEC_WindType(), null, "IEC_WindType", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_ETMc(), this.getsETMc(), null, "ETMc", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_WindProfileType(), this.getsWindProfileType(), null, "WindProfileType", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_RefHt(), this.getnRefHt(), null, "RefHt", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_Uref(), this.getnUref(), null, "Uref", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_ZJetMax(), this.getnZJetMax(), null, "ZJetMax", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_PLExp(), this.getnPLExp(), null, "PLExp", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_Z0(), this.getnZ0(), null, "Z0", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_Location(), this.getnLocation(), null, "Location", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_RICH_NO(), this.getnRICH_NO(), null, "RICH_NO", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_UStar(), this.getnUStar(), null, "UStar", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_ZI(), this.getnZI(), null, "ZI", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_PC_UW(), this.getnPC_UW(), null, "PC_UW", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_PC_UV(), this.getnPC_UV(), null, "PC_UV", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_PC_VW(), this.getnPC_VW(), null, "PC_VW", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_IncDec1(), this.getnIncDec1(), null, "IncDec1", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_IncDec2(), this.getnIncDec2(), null, "IncDec2", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_IncDec3(), this.getnIncDec3(), null, "IncDec3", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_CohExp(), this.getnCohExp(), null, "CohExp", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_CTEventPath(), this.getsCTEventPath(), null, "CTEventPath", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_CTEventFile(), this.getsCTEventFile(), null, "CTEventFile", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_Randomize(), this.getbRandomize(), null, "Randomize", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_DistScl(), this.getnDistScl(), null, "DistScl", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_CTLy(), this.getnCTLy(), null, "CTLy", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_CTLz(), this.getnCTLz(), null, "CTLz", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelTurbsimtbs_CTStartTime(), this.getnCTStartTime(), null, "CTStartTime", null, 0, 1, ModelTurbsimtbs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_Rows(), ecorePackage.getEString(), "rows", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRandSeed1EClass, nRandSeed1.class, "nRandSeed1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRandSeed1_Value(), ecorePackage.getEString(), "value", null, 0, 1, nRandSeed1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnRandSeed1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nRandSeed1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRandSeed2EClass, nRandSeed2.class, "nRandSeed2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRandSeed2_Value(), ecorePackage.getEString(), "value", null, 0, 1, nRandSeed2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnRandSeed2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nRandSeed2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bWrBHHTPEClass, bWrBHHTP.class, "bWrBHHTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbWrBHHTP_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bWrBHHTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbWrBHHTP_Name(), ecorePackage.getEString(), "name", null, 0, 1, bWrBHHTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bWrFHHTPEClass, bWrFHHTP.class, "bWrFHHTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbWrFHHTP_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bWrFHHTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbWrFHHTP_Name(), ecorePackage.getEString(), "name", null, 0, 1, bWrFHHTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bWrADHHEClass, bWrADHH.class, "bWrADHH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbWrADHH_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bWrADHH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbWrADHH_Name(), ecorePackage.getEString(), "name", null, 0, 1, bWrADHH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bWrADFFEClass, bWrADFF.class, "bWrADFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbWrADFF_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bWrADFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbWrADFF_Name(), ecorePackage.getEString(), "name", null, 0, 1, bWrADFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bWrBLFFEClass, bWrBLFF.class, "bWrBLFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbWrBLFF_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bWrBLFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbWrBLFF_Name(), ecorePackage.getEString(), "name", null, 0, 1, bWrBLFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bWrADTWREClass, bWrADTWR.class, "bWrADTWR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbWrADTWR_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bWrADTWR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbWrADTWR_Name(), ecorePackage.getEString(), "name", null, 0, 1, bWrADTWR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bWrFMTFFEClass, bWrFMTFF.class, "bWrFMTFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbWrFMTFF_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bWrFMTFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbWrFMTFF_Name(), ecorePackage.getEString(), "name", null, 0, 1, bWrFMTFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bWrACTEClass, bWrACT.class, "bWrACT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbWrACT_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bWrACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbWrACT_Name(), ecorePackage.getEString(), "name", null, 0, 1, bWrACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bClockwiseEClass, bClockwise.class, "bClockwise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbClockwise_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bClockwise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbClockwise_Name(), ecorePackage.getEString(), "name", null, 0, 1, bClockwise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iScaleIECEClass, iScaleIEC.class, "iScaleIEC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiScaleIEC_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iScaleIEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiScaleIEC_Name(), ecorePackage.getEString(), "name", null, 0, 1, iScaleIEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iNumGrid_ZEClass, iNumGrid_Z.class, "iNumGrid_Z", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiNumGrid_Z_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iNumGrid_Z.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiNumGrid_Z_Name(), ecorePackage.getEString(), "name", null, 0, 1, iNumGrid_Z.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iNumGrid_YEClass, iNumGrid_Y.class, "iNumGrid_Y", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getiNumGrid_Y_Value(), ecorePackage.getEInt(), "value", null, 0, 1, iNumGrid_Y.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getiNumGrid_Y_Name(), ecorePackage.getEString(), "name", null, 0, 1, iNumGrid_Y.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nTimeStepEClass, nTimeStep.class, "nTimeStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnTimeStep_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nTimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnTimeStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, nTimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nAnalysisTimeEClass, nAnalysisTime.class, "nAnalysisTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnAnalysisTime_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nAnalysisTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAnalysisTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, nAnalysisTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nUsableTimeEClass, nUsableTime.class, "nUsableTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnUsableTime_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nUsableTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnUsableTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, nUsableTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nHubHtEClass, nHubHt.class, "nHubHt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnHubHt_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nHubHt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnHubHt_Name(), ecorePackage.getEString(), "name", null, 0, 1, nHubHt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nGridHeightEClass, nGridHeight.class, "nGridHeight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnGridHeight_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nGridHeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnGridHeight_Name(), ecorePackage.getEString(), "name", null, 0, 1, nGridHeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nGridWidthEClass, nGridWidth.class, "nGridWidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnGridWidth_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nGridWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnGridWidth_Name(), ecorePackage.getEString(), "name", null, 0, 1, nGridWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nVFlowAngEClass, nVFlowAng.class, "nVFlowAng", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnVFlowAng_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nVFlowAng.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnVFlowAng_Name(), ecorePackage.getEString(), "name", null, 0, 1, nVFlowAng.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nHFlowAngEClass, nHFlowAng.class, "nHFlowAng", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnHFlowAng_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nHFlowAng.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnHFlowAng_Name(), ecorePackage.getEString(), "name", null, 0, 1, nHFlowAng.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sTurbModelEClass, sTurbModel.class, "sTurbModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsTurbModel_Value(), ecorePackage.getEString(), "value", null, 0, 1, sTurbModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsTurbModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, sTurbModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sIECstandardEClass, sIECstandard.class, "sIECstandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsIECstandard_Value(), ecorePackage.getEString(), "value", null, 0, 1, sIECstandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsIECstandard_Name(), ecorePackage.getEString(), "name", null, 0, 1, sIECstandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sIECturbcEClass, sIECturbc.class, "sIECturbc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsIECturbc_Value(), ecorePackage.getEString(), "value", null, 0, 1, sIECturbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsIECturbc_Name(), ecorePackage.getEString(), "name", null, 0, 1, sIECturbc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sIEC_WindTypeEClass, sIEC_WindType.class, "sIEC_WindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsIEC_WindType_Value(), ecorePackage.getEString(), "value", null, 0, 1, sIEC_WindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsIEC_WindType_Name(), ecorePackage.getEString(), "name", null, 0, 1, sIEC_WindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sETMcEClass, sETMc.class, "sETMc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsETMc_Value(), ecorePackage.getEString(), "value", null, 0, 1, sETMc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsETMc_Name(), ecorePackage.getEString(), "name", null, 0, 1, sETMc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sWindProfileTypeEClass, sWindProfileType.class, "sWindProfileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsWindProfileType_Value(), ecorePackage.getEString(), "value", null, 0, 1, sWindProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsWindProfileType_Name(), ecorePackage.getEString(), "name", null, 0, 1, sWindProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRefHtEClass, nRefHt.class, "nRefHt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRefHt_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nRefHt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnRefHt_Name(), ecorePackage.getEString(), "name", null, 0, 1, nRefHt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nUrefEClass, nUref.class, "nUref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnUref_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nUref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnUref_Name(), ecorePackage.getEString(), "name", null, 0, 1, nUref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nZJetMaxEClass, nZJetMax.class, "nZJetMax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnZJetMax_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nZJetMax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnZJetMax_Name(), ecorePackage.getEString(), "name", null, 0, 1, nZJetMax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nPLExpEClass, nPLExp.class, "nPLExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnPLExp_Value(), ecorePackage.getEString(), "value", null, 0, 1, nPLExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnPLExp_Name(), ecorePackage.getEString(), "name", null, 0, 1, nPLExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nZ0EClass, nZ0.class, "nZ0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnZ0_Value(), ecorePackage.getEString(), "value", null, 0, 1, nZ0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnZ0_Name(), ecorePackage.getEString(), "name", null, 0, 1, nZ0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nLocationEClass, nLocation.class, "nLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnLocation_Value(), ecorePackage.getEString(), "value", null, 0, 1, nLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnLocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, nLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nRICH_NOEClass, nRICH_NO.class, "nRICH_NO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnRICH_NO_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nRICH_NO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnRICH_NO_Name(), ecorePackage.getEString(), "name", null, 0, 1, nRICH_NO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nUStarEClass, nUStar.class, "nUStar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnUStar_Value(), ecorePackage.getEString(), "value", null, 0, 1, nUStar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnUStar_Name(), ecorePackage.getEString(), "name", null, 0, 1, nUStar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nZIEClass, nZI.class, "nZI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnZI_Value(), ecorePackage.getEString(), "value", null, 0, 1, nZI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnZI_Name(), ecorePackage.getEString(), "name", null, 0, 1, nZI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nPC_UWEClass, nPC_UW.class, "nPC_UW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnPC_UW_Value(), ecorePackage.getEString(), "value", null, 0, 1, nPC_UW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnPC_UW_Name(), ecorePackage.getEString(), "name", null, 0, 1, nPC_UW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nPC_UVEClass, nPC_UV.class, "nPC_UV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnPC_UV_Value(), ecorePackage.getEString(), "value", null, 0, 1, nPC_UV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnPC_UV_Name(), ecorePackage.getEString(), "name", null, 0, 1, nPC_UV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nPC_VWEClass, nPC_VW.class, "nPC_VW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnPC_VW_Value(), ecorePackage.getEString(), "value", null, 0, 1, nPC_VW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnPC_VW_Name(), ecorePackage.getEString(), "name", null, 0, 1, nPC_VW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIncDec1EClass, nIncDec1.class, "nIncDec1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIncDec1_Value(), ecorePackage.getEString(), "value", null, 0, 1, nIncDec1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIncDec1_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIncDec1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIncDec2EClass, nIncDec2.class, "nIncDec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIncDec2_Value(), ecorePackage.getEString(), "value", null, 0, 1, nIncDec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIncDec2_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIncDec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nIncDec3EClass, nIncDec3.class, "nIncDec3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnIncDec3_Value(), ecorePackage.getEString(), "value", null, 0, 1, nIncDec3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnIncDec3_Name(), ecorePackage.getEString(), "name", null, 0, 1, nIncDec3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nCohExpEClass, nCohExp.class, "nCohExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnCohExp_Value(), ecorePackage.getEString(), "value", null, 0, 1, nCohExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnCohExp_Name(), ecorePackage.getEString(), "name", null, 0, 1, nCohExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sCTEventPathEClass, sCTEventPath.class, "sCTEventPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsCTEventPath_Value(), ecorePackage.getEString(), "value", null, 0, 1, sCTEventPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsCTEventPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, sCTEventPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sCTEventFileEClass, sCTEventFile.class, "sCTEventFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsCTEventFile_Value(), ecorePackage.getEString(), "value", null, 0, 1, sCTEventFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsCTEventFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, sCTEventFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bRandomizeEClass, bRandomize.class, "bRandomize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbRandomize_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, bRandomize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbRandomize_Name(), ecorePackage.getEString(), "name", null, 0, 1, bRandomize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nDistSclEClass, nDistScl.class, "nDistScl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnDistScl_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nDistScl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnDistScl_Name(), ecorePackage.getEString(), "name", null, 0, 1, nDistScl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nCTLyEClass, nCTLy.class, "nCTLy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnCTLy_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nCTLy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnCTLy_Name(), ecorePackage.getEString(), "name", null, 0, 1, nCTLy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nCTLzEClass, nCTLz.class, "nCTLz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnCTLz_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nCTLz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnCTLz_Name(), ecorePackage.getEString(), "name", null, 0, 1, nCTLz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nCTStartTimeEClass, nCTStartTime.class, "nCTStartTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnCTStartTime_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, nCTStartTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnCTStartTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, nCTStartTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TurbsimtbsPackageImpl
