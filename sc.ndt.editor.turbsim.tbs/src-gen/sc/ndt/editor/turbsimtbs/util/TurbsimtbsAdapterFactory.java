/**
 */
package sc.ndt.editor.turbsimtbs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sc.ndt.editor.turbsimtbs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.turbsimtbs.TurbsimtbsPackage
 * @generated
 */
public class TurbsimtbsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TurbsimtbsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurbsimtbsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TurbsimtbsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TurbsimtbsSwitch<Adapter> modelSwitch =
    new TurbsimtbsSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelTurbsimtbs(ModelTurbsimtbs object)
      {
        return createModelTurbsimtbsAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter casenRandSeed1(nRandSeed1 object)
      {
        return createnRandSeed1Adapter();
      }
      @Override
      public Adapter casenRandSeed2(nRandSeed2 object)
      {
        return createnRandSeed2Adapter();
      }
      @Override
      public Adapter casebWrBHHTP(bWrBHHTP object)
      {
        return createbWrBHHTPAdapter();
      }
      @Override
      public Adapter casebWrFHHTP(bWrFHHTP object)
      {
        return createbWrFHHTPAdapter();
      }
      @Override
      public Adapter casebWrADHH(bWrADHH object)
      {
        return createbWrADHHAdapter();
      }
      @Override
      public Adapter casebWrADFF(bWrADFF object)
      {
        return createbWrADFFAdapter();
      }
      @Override
      public Adapter casebWrBLFF(bWrBLFF object)
      {
        return createbWrBLFFAdapter();
      }
      @Override
      public Adapter casebWrADTWR(bWrADTWR object)
      {
        return createbWrADTWRAdapter();
      }
      @Override
      public Adapter casebWrFMTFF(bWrFMTFF object)
      {
        return createbWrFMTFFAdapter();
      }
      @Override
      public Adapter casebWrACT(bWrACT object)
      {
        return createbWrACTAdapter();
      }
      @Override
      public Adapter casebClockwise(bClockwise object)
      {
        return createbClockwiseAdapter();
      }
      @Override
      public Adapter caseiScaleIEC(iScaleIEC object)
      {
        return createiScaleIECAdapter();
      }
      @Override
      public Adapter caseiNumGrid_Z(iNumGrid_Z object)
      {
        return createiNumGrid_ZAdapter();
      }
      @Override
      public Adapter caseiNumGrid_Y(iNumGrid_Y object)
      {
        return createiNumGrid_YAdapter();
      }
      @Override
      public Adapter casenTimeStep(nTimeStep object)
      {
        return createnTimeStepAdapter();
      }
      @Override
      public Adapter casenAnalysisTime(nAnalysisTime object)
      {
        return createnAnalysisTimeAdapter();
      }
      @Override
      public Adapter casenUsableTime(nUsableTime object)
      {
        return createnUsableTimeAdapter();
      }
      @Override
      public Adapter casenHubHt(nHubHt object)
      {
        return createnHubHtAdapter();
      }
      @Override
      public Adapter casenGridHeight(nGridHeight object)
      {
        return createnGridHeightAdapter();
      }
      @Override
      public Adapter casenGridWidth(nGridWidth object)
      {
        return createnGridWidthAdapter();
      }
      @Override
      public Adapter casenVFlowAng(nVFlowAng object)
      {
        return createnVFlowAngAdapter();
      }
      @Override
      public Adapter casenHFlowAng(nHFlowAng object)
      {
        return createnHFlowAngAdapter();
      }
      @Override
      public Adapter casesTurbModel(sTurbModel object)
      {
        return createsTurbModelAdapter();
      }
      @Override
      public Adapter casesIECstandard(sIECstandard object)
      {
        return createsIECstandardAdapter();
      }
      @Override
      public Adapter casesIECturbc(sIECturbc object)
      {
        return createsIECturbcAdapter();
      }
      @Override
      public Adapter casesIEC_WindType(sIEC_WindType object)
      {
        return createsIEC_WindTypeAdapter();
      }
      @Override
      public Adapter casesETMc(sETMc object)
      {
        return createsETMcAdapter();
      }
      @Override
      public Adapter casesWindProfileType(sWindProfileType object)
      {
        return createsWindProfileTypeAdapter();
      }
      @Override
      public Adapter casenRefHt(nRefHt object)
      {
        return createnRefHtAdapter();
      }
      @Override
      public Adapter casenUref(nUref object)
      {
        return createnUrefAdapter();
      }
      @Override
      public Adapter casenZJetMax(nZJetMax object)
      {
        return createnZJetMaxAdapter();
      }
      @Override
      public Adapter casenPLExp(nPLExp object)
      {
        return createnPLExpAdapter();
      }
      @Override
      public Adapter casenZ0(nZ0 object)
      {
        return createnZ0Adapter();
      }
      @Override
      public Adapter casenLocation(nLocation object)
      {
        return createnLocationAdapter();
      }
      @Override
      public Adapter casenRICH_NO(nRICH_NO object)
      {
        return createnRICH_NOAdapter();
      }
      @Override
      public Adapter casenUStar(nUStar object)
      {
        return createnUStarAdapter();
      }
      @Override
      public Adapter casenZI(nZI object)
      {
        return createnZIAdapter();
      }
      @Override
      public Adapter casenPC_UW(nPC_UW object)
      {
        return createnPC_UWAdapter();
      }
      @Override
      public Adapter casenPC_UV(nPC_UV object)
      {
        return createnPC_UVAdapter();
      }
      @Override
      public Adapter casenPC_VW(nPC_VW object)
      {
        return createnPC_VWAdapter();
      }
      @Override
      public Adapter casenIncDec1(nIncDec1 object)
      {
        return createnIncDec1Adapter();
      }
      @Override
      public Adapter casenIncDec2(nIncDec2 object)
      {
        return createnIncDec2Adapter();
      }
      @Override
      public Adapter casenIncDec3(nIncDec3 object)
      {
        return createnIncDec3Adapter();
      }
      @Override
      public Adapter casenCohExp(nCohExp object)
      {
        return createnCohExpAdapter();
      }
      @Override
      public Adapter casesCTEventPath(sCTEventPath object)
      {
        return createsCTEventPathAdapter();
      }
      @Override
      public Adapter casesCTEventFile(sCTEventFile object)
      {
        return createsCTEventFileAdapter();
      }
      @Override
      public Adapter casebRandomize(bRandomize object)
      {
        return createbRandomizeAdapter();
      }
      @Override
      public Adapter casenDistScl(nDistScl object)
      {
        return createnDistSclAdapter();
      }
      @Override
      public Adapter casenCTLy(nCTLy object)
      {
        return createnCTLyAdapter();
      }
      @Override
      public Adapter casenCTLz(nCTLz object)
      {
        return createnCTLzAdapter();
      }
      @Override
      public Adapter casenCTStartTime(nCTStartTime object)
      {
        return createnCTStartTimeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.ModelTurbsimtbs <em>Model Turbsimtbs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.ModelTurbsimtbs
   * @generated
   */
  public Adapter createModelTurbsimtbsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nRandSeed1 <em>nRand Seed1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nRandSeed1
   * @generated
   */
  public Adapter createnRandSeed1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nRandSeed2 <em>nRand Seed2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nRandSeed2
   * @generated
   */
  public Adapter createnRandSeed2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bWrBHHTP <em>bWr BHHTP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bWrBHHTP
   * @generated
   */
  public Adapter createbWrBHHTPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bWrFHHTP <em>bWr FHHTP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bWrFHHTP
   * @generated
   */
  public Adapter createbWrFHHTPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bWrADHH <em>bWr ADHH</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bWrADHH
   * @generated
   */
  public Adapter createbWrADHHAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bWrADFF <em>bWr ADFF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bWrADFF
   * @generated
   */
  public Adapter createbWrADFFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bWrBLFF <em>bWr BLFF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bWrBLFF
   * @generated
   */
  public Adapter createbWrBLFFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bWrADTWR <em>bWr ADTWR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bWrADTWR
   * @generated
   */
  public Adapter createbWrADTWRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bWrFMTFF <em>bWr FMTFF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bWrFMTFF
   * @generated
   */
  public Adapter createbWrFMTFFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bWrACT <em>bWr ACT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bWrACT
   * @generated
   */
  public Adapter createbWrACTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bClockwise <em>bClockwise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bClockwise
   * @generated
   */
  public Adapter createbClockwiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.iScaleIEC <em>iScale IEC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.iScaleIEC
   * @generated
   */
  public Adapter createiScaleIECAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.iNumGrid_Z <em>iNum Grid Z</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.iNumGrid_Z
   * @generated
   */
  public Adapter createiNumGrid_ZAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.iNumGrid_Y <em>iNum Grid Y</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.iNumGrid_Y
   * @generated
   */
  public Adapter createiNumGrid_YAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nTimeStep <em>nTime Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nTimeStep
   * @generated
   */
  public Adapter createnTimeStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nAnalysisTime <em>nAnalysis Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nAnalysisTime
   * @generated
   */
  public Adapter createnAnalysisTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nUsableTime <em>nUsable Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nUsableTime
   * @generated
   */
  public Adapter createnUsableTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nHubHt <em>nHub Ht</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nHubHt
   * @generated
   */
  public Adapter createnHubHtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nGridHeight <em>nGrid Height</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nGridHeight
   * @generated
   */
  public Adapter createnGridHeightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nGridWidth <em>nGrid Width</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nGridWidth
   * @generated
   */
  public Adapter createnGridWidthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nVFlowAng <em>nV Flow Ang</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nVFlowAng
   * @generated
   */
  public Adapter createnVFlowAngAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nHFlowAng <em>nH Flow Ang</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nHFlowAng
   * @generated
   */
  public Adapter createnHFlowAngAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.sTurbModel <em>sTurb Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.sTurbModel
   * @generated
   */
  public Adapter createsTurbModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.sIECstandard <em>sIE Cstandard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.sIECstandard
   * @generated
   */
  public Adapter createsIECstandardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.sIECturbc <em>sIE Cturbc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.sIECturbc
   * @generated
   */
  public Adapter createsIECturbcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.sIEC_WindType <em>sIEC Wind Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.sIEC_WindType
   * @generated
   */
  public Adapter createsIEC_WindTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.sETMc <em>sET Mc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.sETMc
   * @generated
   */
  public Adapter createsETMcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.sWindProfileType <em>sWind Profile Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.sWindProfileType
   * @generated
   */
  public Adapter createsWindProfileTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nRefHt <em>nRef Ht</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nRefHt
   * @generated
   */
  public Adapter createnRefHtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nUref <em>nUref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nUref
   * @generated
   */
  public Adapter createnUrefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nZJetMax <em>nZ Jet Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nZJetMax
   * @generated
   */
  public Adapter createnZJetMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nPLExp <em>nPL Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nPLExp
   * @generated
   */
  public Adapter createnPLExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nZ0 <em>nZ0</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nZ0
   * @generated
   */
  public Adapter createnZ0Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nLocation <em>nLocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nLocation
   * @generated
   */
  public Adapter createnLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nRICH_NO <em>nRICH NO</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nRICH_NO
   * @generated
   */
  public Adapter createnRICH_NOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nUStar <em>nU Star</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nUStar
   * @generated
   */
  public Adapter createnUStarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nZI <em>nZI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nZI
   * @generated
   */
  public Adapter createnZIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nPC_UW <em>nPC UW</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nPC_UW
   * @generated
   */
  public Adapter createnPC_UWAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nPC_UV <em>nPC UV</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nPC_UV
   * @generated
   */
  public Adapter createnPC_UVAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nPC_VW <em>nPC VW</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nPC_VW
   * @generated
   */
  public Adapter createnPC_VWAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nIncDec1 <em>nInc Dec1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nIncDec1
   * @generated
   */
  public Adapter createnIncDec1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nIncDec2 <em>nInc Dec2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nIncDec2
   * @generated
   */
  public Adapter createnIncDec2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nIncDec3 <em>nInc Dec3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nIncDec3
   * @generated
   */
  public Adapter createnIncDec3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nCohExp <em>nCoh Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nCohExp
   * @generated
   */
  public Adapter createnCohExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.sCTEventPath <em>sCT Event Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.sCTEventPath
   * @generated
   */
  public Adapter createsCTEventPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.sCTEventFile <em>sCT Event File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.sCTEventFile
   * @generated
   */
  public Adapter createsCTEventFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.bRandomize <em>bRandomize</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.bRandomize
   * @generated
   */
  public Adapter createbRandomizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nDistScl <em>nDist Scl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nDistScl
   * @generated
   */
  public Adapter createnDistSclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nCTLy <em>nCT Ly</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nCTLy
   * @generated
   */
  public Adapter createnCTLyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nCTLz <em>nCT Lz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nCTLz
   * @generated
   */
  public Adapter createnCTLzAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.turbsimtbs.nCTStartTime <em>nCT Start Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.turbsimtbs.nCTStartTime
   * @generated
   */
  public Adapter createnCTStartTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TurbsimtbsAdapterFactory
