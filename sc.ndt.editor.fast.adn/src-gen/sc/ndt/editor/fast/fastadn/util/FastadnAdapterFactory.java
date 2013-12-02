/**
 */
package sc.ndt.editor.fast.fastadn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sc.ndt.editor.fast.fastadn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.fast.fastadn.FastadnPackage
 * @generated
 */
public class FastadnAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FastadnPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastadnAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FastadnPackage.eINSTANCE;
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
  protected FastadnSwitch<Adapter> modelSwitch =
    new FastadnSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelFastadn(ModelFastadn object)
      {
        return createModelFastadnAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter casesUnits(sUnits object)
      {
        return createsUnitsAdapter();
      }
      @Override
      public Adapter casesStallMod(sStallMod object)
      {
        return createsStallModAdapter();
      }
      @Override
      public Adapter casesUseCm(sUseCm object)
      {
        return createsUseCmAdapter();
      }
      @Override
      public Adapter casesInfModel(sInfModel object)
      {
        return createsInfModelAdapter();
      }
      @Override
      public Adapter casesIndModel(sIndModel object)
      {
        return createsIndModelAdapter();
      }
      @Override
      public Adapter casenAtoler(nAtoler object)
      {
        return createnAtolerAdapter();
      }
      @Override
      public Adapter casesTLModel(sTLModel object)
      {
        return createsTLModelAdapter();
      }
      @Override
      public Adapter casesHLModel(sHLModel object)
      {
        return createsHLModelAdapter();
      }
      @Override
      public Adapter casefWindFile(fWindFile object)
      {
        return createfWindFileAdapter();
      }
      @Override
      public Adapter casenHH(nHH object)
      {
        return createnHHAdapter();
      }
      @Override
      public Adapter casenTwrShad(nTwrShad object)
      {
        return createnTwrShadAdapter();
      }
      @Override
      public Adapter casebTwrPot(bTwrPot object)
      {
        return createbTwrPotAdapter();
      }
      @Override
      public Adapter casebTwrShd(bTwrShd object)
      {
        return createbTwrShdAdapter();
      }
      @Override
      public Adapter casefTwrFile(fTwrFile object)
      {
        return createfTwrFileAdapter();
      }
      @Override
      public Adapter casebCalcTwrAero(bCalcTwrAero object)
      {
        return createbCalcTwrAeroAdapter();
      }
      @Override
      public Adapter casenShadHWid(nShadHWid object)
      {
        return createnShadHWidAdapter();
      }
      @Override
      public Adapter casenTShadRefPt(nTShadRefPt object)
      {
        return createnTShadRefPtAdapter();
      }
      @Override
      public Adapter casenRho(nRho object)
      {
        return createnRhoAdapter();
      }
      @Override
      public Adapter casenKinVisc(nKinVisc object)
      {
        return createnKinViscAdapter();
      }
      @Override
      public Adapter casenDTAero(nDTAero object)
      {
        return createnDTAeroAdapter();
      }
      @Override
      public Adapter caseiNumFoil(iNumFoil object)
      {
        return createiNumFoilAdapter();
      }
      @Override
      public Adapter caseaAirfoilList(aAirfoilList object)
      {
        return createaAirfoilListAdapter();
      }
      @Override
      public Adapter caseiBldNodes(iBldNodes object)
      {
        return createiBldNodesAdapter();
      }
      @Override
      public Adapter caseaAirStat(aAirStat object)
      {
        return createaAirStatAdapter();
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
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.ModelFastadn <em>Model Fastadn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.ModelFastadn
   * @generated
   */
  public Adapter createModelFastadnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.sUnits <em>sUnits</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.sUnits
   * @generated
   */
  public Adapter createsUnitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.sStallMod <em>sStall Mod</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.sStallMod
   * @generated
   */
  public Adapter createsStallModAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.sUseCm <em>sUse Cm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.sUseCm
   * @generated
   */
  public Adapter createsUseCmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.sInfModel <em>sInf Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.sInfModel
   * @generated
   */
  public Adapter createsInfModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.sIndModel <em>sInd Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.sIndModel
   * @generated
   */
  public Adapter createsIndModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.nAtoler <em>nAtoler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.nAtoler
   * @generated
   */
  public Adapter createnAtolerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.sTLModel <em>sTL Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.sTLModel
   * @generated
   */
  public Adapter createsTLModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.sHLModel <em>sHL Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.sHLModel
   * @generated
   */
  public Adapter createsHLModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.fWindFile <em>fWind File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.fWindFile
   * @generated
   */
  public Adapter createfWindFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.nHH <em>nHH</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.nHH
   * @generated
   */
  public Adapter createnHHAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.nTwrShad <em>nTwr Shad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.nTwrShad
   * @generated
   */
  public Adapter createnTwrShadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.bTwrPot <em>bTwr Pot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.bTwrPot
   * @generated
   */
  public Adapter createbTwrPotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.bTwrShd <em>bTwr Shd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.bTwrShd
   * @generated
   */
  public Adapter createbTwrShdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.fTwrFile <em>fTwr File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.fTwrFile
   * @generated
   */
  public Adapter createfTwrFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.bCalcTwrAero <em>bCalc Twr Aero</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.bCalcTwrAero
   * @generated
   */
  public Adapter createbCalcTwrAeroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.nShadHWid <em>nShad HWid</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.nShadHWid
   * @generated
   */
  public Adapter createnShadHWidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.nTShadRefPt <em>nT Shad Ref Pt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.nTShadRefPt
   * @generated
   */
  public Adapter createnTShadRefPtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.nRho <em>nRho</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.nRho
   * @generated
   */
  public Adapter createnRhoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.nKinVisc <em>nKin Visc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.nKinVisc
   * @generated
   */
  public Adapter createnKinViscAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.nDTAero <em>nDT Aero</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.nDTAero
   * @generated
   */
  public Adapter createnDTAeroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.iNumFoil <em>iNum Foil</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.iNumFoil
   * @generated
   */
  public Adapter createiNumFoilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.aAirfoilList <em>aAirfoil List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.aAirfoilList
   * @generated
   */
  public Adapter createaAirfoilListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.iBldNodes <em>iBld Nodes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.iBldNodes
   * @generated
   */
  public Adapter createiBldNodesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastadn.aAirStat <em>aAir Stat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastadn.aAirStat
   * @generated
   */
  public Adapter createaAirStatAdapter()
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

} //FastadnAdapterFactory
