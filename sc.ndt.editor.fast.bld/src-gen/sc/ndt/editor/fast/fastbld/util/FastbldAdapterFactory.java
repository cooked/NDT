/**
 */
package sc.ndt.editor.fast.fastbld.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sc.ndt.editor.fast.fastbld.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.fast.fastbld.FastbldPackage
 * @generated
 */
public class FastbldAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FastbldPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FastbldAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FastbldPackage.eINSTANCE;
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
  protected FastbldSwitch<Adapter> modelSwitch =
    new FastbldSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelFastbld(ModelFastbld object)
      {
        return createModelFastbldAdapter();
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
      public Adapter casenNblInpSt(nNblInpSt object)
      {
        return createnNblInpStAdapter();
      }
      @Override
      public Adapter casebCalcBMode(bCalcBMode object)
      {
        return createbCalcBModeAdapter();
      }
      @Override
      public Adapter casenBldFlDmp1(nBldFlDmp1 object)
      {
        return createnBldFlDmp1Adapter();
      }
      @Override
      public Adapter casenBldFlDmp2(nBldFlDmp2 object)
      {
        return createnBldFlDmp2Adapter();
      }
      @Override
      public Adapter casenBldEdDmp1(nBldEdDmp1 object)
      {
        return createnBldEdDmp1Adapter();
      }
      @Override
      public Adapter casenFlStTunr1(nFlStTunr1 object)
      {
        return createnFlStTunr1Adapter();
      }
      @Override
      public Adapter casenFlStTunr2(nFlStTunr2 object)
      {
        return createnFlStTunr2Adapter();
      }
      @Override
      public Adapter caseAdjBlMs(AdjBlMs object)
      {
        return createAdjBlMsAdapter();
      }
      @Override
      public Adapter caseAdjFlSt(AdjFlSt object)
      {
        return createAdjFlStAdapter();
      }
      @Override
      public Adapter caseAdjEdSt(AdjEdSt object)
      {
        return createAdjEdStAdapter();
      }
      @Override
      public Adapter casenBldFl1Sh2(nBldFl1Sh2 object)
      {
        return createnBldFl1Sh2Adapter();
      }
      @Override
      public Adapter casenBldFl1Sh3(nBldFl1Sh3 object)
      {
        return createnBldFl1Sh3Adapter();
      }
      @Override
      public Adapter casenBldFl1Sh4(nBldFl1Sh4 object)
      {
        return createnBldFl1Sh4Adapter();
      }
      @Override
      public Adapter casenBldFl1Sh5(nBldFl1Sh5 object)
      {
        return createnBldFl1Sh5Adapter();
      }
      @Override
      public Adapter casenBldFl1Sh6(nBldFl1Sh6 object)
      {
        return createnBldFl1Sh6Adapter();
      }
      @Override
      public Adapter casenBldFl2Sh2(nBldFl2Sh2 object)
      {
        return createnBldFl2Sh2Adapter();
      }
      @Override
      public Adapter casenBldFl2Sh3(nBldFl2Sh3 object)
      {
        return createnBldFl2Sh3Adapter();
      }
      @Override
      public Adapter casenBldFl2Sh4(nBldFl2Sh4 object)
      {
        return createnBldFl2Sh4Adapter();
      }
      @Override
      public Adapter casenBldFl2Sh5(nBldFl2Sh5 object)
      {
        return createnBldFl2Sh5Adapter();
      }
      @Override
      public Adapter casenBldFl2Sh6(nBldFl2Sh6 object)
      {
        return createnBldFl2Sh6Adapter();
      }
      @Override
      public Adapter casenBldEdgSh2(nBldEdgSh2 object)
      {
        return createnBldEdgSh2Adapter();
      }
      @Override
      public Adapter casenBldEdgSh3(nBldEdgSh3 object)
      {
        return createnBldEdgSh3Adapter();
      }
      @Override
      public Adapter casenBldEdgSh4(nBldEdgSh4 object)
      {
        return createnBldEdgSh4Adapter();
      }
      @Override
      public Adapter casenBldEdgSh5(nBldEdgSh5 object)
      {
        return createnBldEdgSh5Adapter();
      }
      @Override
      public Adapter casenBldEdgSh6(nBldEdgSh6 object)
      {
        return createnBldEdgSh6Adapter();
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
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.ModelFastbld <em>Model Fastbld</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.ModelFastbld
   * @generated
   */
  public Adapter createModelFastbldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nNblInpSt <em>nNbl Inp St</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nNblInpSt
   * @generated
   */
  public Adapter createnNblInpStAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.bCalcBMode <em>bCalc BMode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.bCalcBMode
   * @generated
   */
  public Adapter createbCalcBModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFlDmp1 <em>nBld Fl Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFlDmp1
   * @generated
   */
  public Adapter createnBldFlDmp1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFlDmp2 <em>nBld Fl Dmp2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFlDmp2
   * @generated
   */
  public Adapter createnBldFlDmp2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldEdDmp1 <em>nBld Ed Dmp1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldEdDmp1
   * @generated
   */
  public Adapter createnBldEdDmp1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nFlStTunr1 <em>nFl St Tunr1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nFlStTunr1
   * @generated
   */
  public Adapter createnFlStTunr1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nFlStTunr2 <em>nFl St Tunr2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nFlStTunr2
   * @generated
   */
  public Adapter createnFlStTunr2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.AdjBlMs <em>Adj Bl Ms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.AdjBlMs
   * @generated
   */
  public Adapter createAdjBlMsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.AdjFlSt <em>Adj Fl St</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.AdjFlSt
   * @generated
   */
  public Adapter createAdjFlStAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.AdjEdSt <em>Adj Ed St</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.AdjEdSt
   * @generated
   */
  public Adapter createAdjEdStAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh2 <em>nBld Fl1 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh2
   * @generated
   */
  public Adapter createnBldFl1Sh2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh3 <em>nBld Fl1 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh3
   * @generated
   */
  public Adapter createnBldFl1Sh3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh4 <em>nBld Fl1 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh4
   * @generated
   */
  public Adapter createnBldFl1Sh4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh5 <em>nBld Fl1 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh5
   * @generated
   */
  public Adapter createnBldFl1Sh5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl1Sh6 <em>nBld Fl1 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl1Sh6
   * @generated
   */
  public Adapter createnBldFl1Sh6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh2 <em>nBld Fl2 Sh2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh2
   * @generated
   */
  public Adapter createnBldFl2Sh2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh3 <em>nBld Fl2 Sh3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh3
   * @generated
   */
  public Adapter createnBldFl2Sh3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh4 <em>nBld Fl2 Sh4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh4
   * @generated
   */
  public Adapter createnBldFl2Sh4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh5 <em>nBld Fl2 Sh5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh5
   * @generated
   */
  public Adapter createnBldFl2Sh5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldFl2Sh6 <em>nBld Fl2 Sh6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldFl2Sh6
   * @generated
   */
  public Adapter createnBldFl2Sh6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh2 <em>nBld Edg Sh2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh2
   * @generated
   */
  public Adapter createnBldEdgSh2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh3 <em>nBld Edg Sh3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh3
   * @generated
   */
  public Adapter createnBldEdgSh3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh4 <em>nBld Edg Sh4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh4
   * @generated
   */
  public Adapter createnBldEdgSh4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh5 <em>nBld Edg Sh5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh5
   * @generated
   */
  public Adapter createnBldEdgSh5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.nBldEdgSh6 <em>nBld Edg Sh6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.nBldEdgSh6
   * @generated
   */
  public Adapter createnBldEdgSh6Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.fast.fastbld.aAirStat <em>aAir Stat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.fast.fastbld.aAirStat
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

} //FastbldAdapterFactory
