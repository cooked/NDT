/**
 */
package sc.ndt.editor.iecwind.iecwindiec.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sc.ndt.editor.iecwind.iecwindiec.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.iecwind.iecwindiec.IecwindiecPackage
 * @generated
 */
public class IecwindiecAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IecwindiecPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IecwindiecAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = IecwindiecPackage.eINSTANCE;
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
  protected IecwindiecSwitch<Adapter> modelSwitch =
    new IecwindiecSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelIecwindiec(ModelIecwindiec object)
      {
        return createModelIecwindiecAdapter();
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
      public Adapter casesiUnits(siUnits object)
      {
        return createsiUnitsAdapter();
      }
      @Override
      public Adapter caseiStart(iStart object)
      {
        return createiStartAdapter();
      }
      @Override
      public Adapter caseiIECClass(iIECClass object)
      {
        return createiIECClassAdapter();
      }
      @Override
      public Adapter casesWindTurb(sWindTurb object)
      {
        return createsWindTurbAdapter();
      }
      @Override
      public Adapter casenWindSlope(nWindSlope object)
      {
        return createnWindSlopeAdapter();
      }
      @Override
      public Adapter caseiIECStd(iIECStd object)
      {
        return createiIECStdAdapter();
      }
      @Override
      public Adapter casenHubHeight(nHubHeight object)
      {
        return createnHubHeightAdapter();
      }
      @Override
      public Adapter casenRotDiam(nRotDiam object)
      {
        return createnRotDiamAdapter();
      }
      @Override
      public Adapter casenWindIn(nWindIn object)
      {
        return createnWindInAdapter();
      }
      @Override
      public Adapter casenWindNom(nWindNom object)
      {
        return createnWindNomAdapter();
      }
      @Override
      public Adapter casenWindOut(nWindOut object)
      {
        return createnWindOutAdapter();
      }
      @Override
      public Adapter casevOutList(vOutList object)
      {
        return createvOutListAdapter();
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
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec <em>Model Iecwindiec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.ModelIecwindiec
   * @generated
   */
  public Adapter createModelIecwindiecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.siUnits <em>si Units</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.siUnits
   * @generated
   */
  public Adapter createsiUnitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.iStart <em>iStart</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.iStart
   * @generated
   */
  public Adapter createiStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.iIECClass <em>iIEC Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.iIECClass
   * @generated
   */
  public Adapter createiIECClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.sWindTurb <em>sWind Turb</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.sWindTurb
   * @generated
   */
  public Adapter createsWindTurbAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.nWindSlope <em>nWind Slope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindSlope
   * @generated
   */
  public Adapter createnWindSlopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.iIECStd <em>iIEC Std</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.iIECStd
   * @generated
   */
  public Adapter createiIECStdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.nHubHeight <em>nHub Height</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.nHubHeight
   * @generated
   */
  public Adapter createnHubHeightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.nRotDiam <em>nRot Diam</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.nRotDiam
   * @generated
   */
  public Adapter createnRotDiamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.nWindIn <em>nWind In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindIn
   * @generated
   */
  public Adapter createnWindInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.nWindNom <em>nWind Nom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindNom
   * @generated
   */
  public Adapter createnWindNomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.nWindOut <em>nWind Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.nWindOut
   * @generated
   */
  public Adapter createnWindOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.iecwind.iecwindiec.vOutList <em>vOut List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.iecwind.iecwindiec.vOutList
   * @generated
   */
  public Adapter createvOutListAdapter()
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

} //IecwindiecAdapterFactory
