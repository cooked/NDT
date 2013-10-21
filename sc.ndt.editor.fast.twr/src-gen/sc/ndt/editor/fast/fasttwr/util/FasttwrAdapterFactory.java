/**
 */
package sc.ndt.editor.fast.fasttwr.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sc.ndt.editor.fast.fasttwr.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.fast.fasttwr.FasttwrPackage
 * @generated
 */
public class FasttwrAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FasttwrPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FasttwrAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FasttwrPackage.eINSTANCE;
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
  protected FasttwrSwitch<Adapter> modelSwitch =
    new FasttwrSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelFasttwr(ModelFasttwr object)
      {
        return createModelFasttwrAdapter();
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
      public Adapter casenNTwInpSt(nNTwInpSt object)
      {
        return createnNTwInpStAdapter();
      }
      @Override
      public Adapter casebCalcTMode(bCalcTMode object)
      {
        return createbCalcTModeAdapter();
      }
      @Override
      public Adapter casenTwrFADmp1(nTwrFADmp1 object)
      {
        return createnTwrFADmp1Adapter();
      }
      @Override
      public Adapter casenTwrFADmp2(nTwrFADmp2 object)
      {
        return createnTwrFADmp2Adapter();
      }
      @Override
      public Adapter casenTwrSSDmp1(nTwrSSDmp1 object)
      {
        return createnTwrSSDmp1Adapter();
      }
      @Override
      public Adapter casenTwrSSDmp2(nTwrSSDmp2 object)
      {
        return createnTwrSSDmp2Adapter();
      }
      @Override
      public Adapter casenFAStTunr1(nFAStTunr1 object)
      {
        return createnFAStTunr1Adapter();
      }
      @Override
      public Adapter casenFAStTunr2(nFAStTunr2 object)
      {
        return createnFAStTunr2Adapter();
      }
      @Override
      public Adapter casenSSStTunr1(nSSStTunr1 object)
      {
        return createnSSStTunr1Adapter();
      }
      @Override
      public Adapter casenSSStTunr2(nSSStTunr2 object)
      {
        return createnSSStTunr2Adapter();
      }
      @Override
      public Adapter caseAdjTwMa(AdjTwMa object)
      {
        return createAdjTwMaAdapter();
      }
      @Override
      public Adapter caseAdjFASt(AdjFASt object)
      {
        return createAdjFAStAdapter();
      }
      @Override
      public Adapter caseAdjSSSt(AdjSSSt object)
      {
        return createAdjSSStAdapter();
      }
      @Override
      public Adapter casenTwFAM1Sh2(nTwFAM1Sh2 object)
      {
        return createnTwFAM1Sh2Adapter();
      }
      @Override
      public Adapter casenTwFAM1Sh3(nTwFAM1Sh3 object)
      {
        return createnTwFAM1Sh3Adapter();
      }
      @Override
      public Adapter casenTwFAM1Sh4(nTwFAM1Sh4 object)
      {
        return createnTwFAM1Sh4Adapter();
      }
      @Override
      public Adapter casenTwFAM1Sh5(nTwFAM1Sh5 object)
      {
        return createnTwFAM1Sh5Adapter();
      }
      @Override
      public Adapter casenTwFAM1Sh6(nTwFAM1Sh6 object)
      {
        return createnTwFAM1Sh6Adapter();
      }
      @Override
      public Adapter casenTwFAM2Sh2(nTwFAM2Sh2 object)
      {
        return createnTwFAM2Sh2Adapter();
      }
      @Override
      public Adapter casenTwFAM2Sh3(nTwFAM2Sh3 object)
      {
        return createnTwFAM2Sh3Adapter();
      }
      @Override
      public Adapter casenTwFAM2Sh4(nTwFAM2Sh4 object)
      {
        return createnTwFAM2Sh4Adapter();
      }
      @Override
      public Adapter casenTwFAM2Sh5(nTwFAM2Sh5 object)
      {
        return createnTwFAM2Sh5Adapter();
      }
      @Override
      public Adapter casenTwFAM2Sh6(nTwFAM2Sh6 object)
      {
        return createnTwFAM2Sh6Adapter();
      }
      @Override
      public Adapter casenTwSSM1Sh2(nTwSSM1Sh2 object)
      {
        return createnTwSSM1Sh2Adapter();
      }
      @Override
      public Adapter casenTwSSM1Sh3(nTwSSM1Sh3 object)
      {
        return createnTwSSM1Sh3Adapter();
      }
      @Override
      public Adapter casenTwSSM1Sh4(nTwSSM1Sh4 object)
      {
        return createnTwSSM1Sh4Adapter();
      }
      @Override
      public Adapter casenTwSSM1Sh5(nTwSSM1Sh5 object)
      {
        return createnTwSSM1Sh5Adapter();
      }
      @Override
      public Adapter casenTwSSM1Sh6(nTwSSM1Sh6 object)
      {
        return createnTwSSM1Sh6Adapter();
      }
      @Override
      public Adapter casenTwSSM2Sh2(nTwSSM2Sh2 object)
      {
        return createnTwSSM2Sh2Adapter();
      }
      @Override
      public Adapter casenTwSSM2Sh3(nTwSSM2Sh3 object)
      {
        return createnTwSSM2Sh3Adapter();
      }
      @Override
      public Adapter casenTwSSM2Sh4(nTwSSM2Sh4 object)
      {
        return createnTwSSM2Sh4Adapter();
      }
      @Override
      public Adapter casenTwSSM2Sh5(nTwSSM2Sh5 object)
      {
        return createnTwSSM2Sh5Adapter();
      }
      @Override
      public Adapter casenTwSSM2Sh6(nTwSSM2Sh6 object)
      {
        return createnTwSSM2Sh6Adapter();
      }
      @Override
      public Adapter caseaTwrStat(aTwrStat object)
      {
        return createaTwrStatAdapter();
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
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.ModelFasttwr <em>Model Fasttwr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.ModelFasttwr
   * @generated
   */
  public Adapter createModelFasttwrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nNTwInpSt <em>nN Tw Inp St</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nNTwInpSt
   * @generated
   */
  public Adapter createnNTwInpStAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.bCalcTMode <em>bCalc TMode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.bCalcTMode
   * @generated
   */
  public Adapter createbCalcTModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwrFADmp1 <em>nTwr FA Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwrFADmp1
   * @generated
   */
  public Adapter createnTwrFADmp1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwrFADmp2 <em>nTwr FA Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwrFADmp2
   * @generated
   */
  public Adapter createnTwrFADmp2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwrSSDmp1 <em>nTwr SS Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwrSSDmp1
   * @generated
   */
  public Adapter createnTwrSSDmp1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwrSSDmp2 <em>nTwr SS Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwrSSDmp2
   * @generated
   */
  public Adapter createnTwrSSDmp2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nFAStTunr1 <em>nFA St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nFAStTunr1
   * @generated
   */
  public Adapter createnFAStTunr1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nFAStTunr2 <em>nFA St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nFAStTunr2
   * @generated
   */
  public Adapter createnFAStTunr2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nSSStTunr1 <em>nSS St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nSSStTunr1
   * @generated
   */
  public Adapter createnSSStTunr1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nSSStTunr2 <em>nSS St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nSSStTunr2
   * @generated
   */
  public Adapter createnSSStTunr2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.AdjTwMa <em>Adj Tw Ma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.AdjTwMa
   * @generated
   */
  public Adapter createAdjTwMaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.AdjFASt <em>Adj FA St</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.AdjFASt
   * @generated
   */
  public Adapter createAdjFAStAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.AdjSSSt <em>Adj SS St</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.AdjSSSt
   * @generated
   */
  public Adapter createAdjSSStAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2 <em>nTw FAM1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2
   * @generated
   */
  public Adapter createnTwFAM1Sh2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3 <em>nTw FAM1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3
   * @generated
   */
  public Adapter createnTwFAM1Sh3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4 <em>nTw FAM1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4
   * @generated
   */
  public Adapter createnTwFAM1Sh4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5 <em>nTw FAM1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5
   * @generated
   */
  public Adapter createnTwFAM1Sh5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6 <em>nTw FAM1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6
   * @generated
   */
  public Adapter createnTwFAM1Sh6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2 <em>nTw FAM2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2
   * @generated
   */
  public Adapter createnTwFAM2Sh2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3 <em>nTw FAM2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3
   * @generated
   */
  public Adapter createnTwFAM2Sh3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4 <em>nTw FAM2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4
   * @generated
   */
  public Adapter createnTwFAM2Sh4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5 <em>nTw FAM2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5
   * @generated
   */
  public Adapter createnTwFAM2Sh5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6 <em>nTw FAM2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6
   * @generated
   */
  public Adapter createnTwFAM2Sh6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2 <em>nTw SSM1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2
   * @generated
   */
  public Adapter createnTwSSM1Sh2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3 <em>nTw SSM1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3
   * @generated
   */
  public Adapter createnTwSSM1Sh3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4 <em>nTw SSM1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4
   * @generated
   */
  public Adapter createnTwSSM1Sh4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5 <em>nTw SSM1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5
   * @generated
   */
  public Adapter createnTwSSM1Sh5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6 <em>nTw SSM1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6
   * @generated
   */
  public Adapter createnTwSSM1Sh6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2 <em>nTw SSM2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2
   * @generated
   */
  public Adapter createnTwSSM2Sh2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3 <em>nTw SSM2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3
   * @generated
   */
  public Adapter createnTwSSM2Sh3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4 <em>nTw SSM2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4
   * @generated
   */
  public Adapter createnTwSSM2Sh4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5 <em>nTw SSM2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5
   * @generated
   */
  public Adapter createnTwSSM2Sh5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6 <em>nTw SSM2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6
   * @generated
   */
  public Adapter createnTwSSM2Sh6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fasttwr.aTwrStat <em>aTwr Stat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fasttwr.aTwrStat
   * @generated
   */
  public Adapter createaTwrStatAdapter()
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

} //FasttwrAdapterFactory
