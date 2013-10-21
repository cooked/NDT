/**
 */
package sc.ndt.editor.bmodesbmi.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sc.ndt.editor.bmodesbmi.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.bmodesbmi.BmodesbmiPackage
 * @generated
 */
public class BmodesbmiAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BmodesbmiPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesbmiAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BmodesbmiPackage.eINSTANCE;
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
  protected BmodesbmiSwitch<Adapter> modelSwitch =
    new BmodesbmiSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelBmodesbmi(ModelBmodesbmi object)
      {
        return createModelBmodesbmiAdapter();
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
      public Adapter casebEcho(bEcho object)
      {
        return createbEchoAdapter();
      }
      @Override
      public Adapter caseiBeamType(iBeamType object)
      {
        return createiBeamTypeAdapter();
      }
      @Override
      public Adapter casenRotRpm(nRotRpm object)
      {
        return createnRotRpmAdapter();
      }
      @Override
      public Adapter casenRpmMult(nRpmMult object)
      {
        return createnRpmMultAdapter();
      }
      @Override
      public Adapter casenRadius(nRadius object)
      {
        return createnRadiusAdapter();
      }
      @Override
      public Adapter casenHubRad(nHubRad object)
      {
        return createnHubRadAdapter();
      }
      @Override
      public Adapter casenPrecone(nPrecone object)
      {
        return createnPreconeAdapter();
      }
      @Override
      public Adapter casenBlThp(nBlThp object)
      {
        return createnBlThpAdapter();
      }
      @Override
      public Adapter caseiHubConn(iHubConn object)
      {
        return createiHubConnAdapter();
      }
      @Override
      public Adapter caseiModePr(iModePr object)
      {
        return createiModePrAdapter();
      }
      @Override
      public Adapter casebTabDelim(bTabDelim object)
      {
        return createbTabDelimAdapter();
      }
      @Override
      public Adapter casebMidNodeTw(bMidNodeTw object)
      {
        return createbMidNodeTwAdapter();
      }
      @Override
      public Adapter casenTipMass(nTipMass object)
      {
        return createnTipMassAdapter();
      }
      @Override
      public Adapter casenCmLoc(nCmLoc object)
      {
        return createnCmLocAdapter();
      }
      @Override
      public Adapter casenCmAxial(nCmAxial object)
      {
        return createnCmAxialAdapter();
      }
      @Override
      public Adapter casenIxxTip(nIxxTip object)
      {
        return createnIxxTipAdapter();
      }
      @Override
      public Adapter casenIyyTip(nIyyTip object)
      {
        return createnIyyTipAdapter();
      }
      @Override
      public Adapter casenIzzTip(nIzzTip object)
      {
        return createnIzzTipAdapter();
      }
      @Override
      public Adapter casenIxyTip(nIxyTip object)
      {
        return createnIxyTipAdapter();
      }
      @Override
      public Adapter casenIzxTip(nIzxTip object)
      {
        return createnIzxTipAdapter();
      }
      @Override
      public Adapter casenIyzTip(nIyzTip object)
      {
        return createnIyzTipAdapter();
      }
      @Override
      public Adapter caseiIdMat(iIdMat object)
      {
        return createiIdMatAdapter();
      }
      @Override
      public Adapter caseiSecFile(iSecFile object)
      {
        return createiSecFileAdapter();
      }
      @Override
      public Adapter casenSecMasMult(nSecMasMult object)
      {
        return createnSecMasMultAdapter();
      }
      @Override
      public Adapter casenFlpInrMult(nFlpInrMult object)
      {
        return createnFlpInrMultAdapter();
      }
      @Override
      public Adapter casenLagInrMult(nLagInrMult object)
      {
        return createnLagInrMultAdapter();
      }
      @Override
      public Adapter casenFlpstfMult(nFlpstfMult object)
      {
        return createnFlpstfMultAdapter();
      }
      @Override
      public Adapter casenEdgStfMult(nEdgStfMult object)
      {
        return createnEdgStfMultAdapter();
      }
      @Override
      public Adapter casenTorStfMult(nTorStfMult object)
      {
        return createnTorStfMultAdapter();
      }
      @Override
      public Adapter casenAxiStfMult(nAxiStfMult object)
      {
        return createnAxiStfMultAdapter();
      }
      @Override
      public Adapter casenCgOffsMult(nCgOffsMult object)
      {
        return createnCgOffsMultAdapter();
      }
      @Override
      public Adapter casenScOffsMult(nScOffsMult object)
      {
        return createnScOffsMultAdapter();
      }
      @Override
      public Adapter casenTcOffsMult(nTcOffsMult object)
      {
        return createnTcOffsMultAdapter();
      }
      @Override
      public Adapter caseiNSelt(iNSelt object)
      {
        return createiNSeltAdapter();
      }
      @Override
      public Adapter caseaElLoc(aElLoc object)
      {
        return createaElLocAdapter();
      }
      @Override
      public Adapter caseiTwrSupport(iTwrSupport object)
      {
        return createiTwrSupportAdapter();
      }
      @Override
      public Adapter caseiTwrAttach(iTwrAttach object)
      {
        return createiTwrAttachAdapter();
      }
      @Override
      public Adapter caseaTwrWires(aTwrWires object)
      {
        return createaTwrWiresAdapter();
      }
      @Override
      public Adapter caseaNodeAttach(aNodeAttach object)
      {
        return createaNodeAttachAdapter();
      }
      @Override
      public Adapter caseaWireStiff(aWireStiff object)
      {
        return createaWireStiffAdapter();
      }
      @Override
      public Adapter caseaWireAngle(aWireAngle object)
      {
        return createaWireAngleAdapter();
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
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.ModelBmodesbmi <em>Model Bmodesbmi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.ModelBmodesbmi
   * @generated
   */
  public Adapter createModelBmodesbmiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.bEcho <em>bEcho</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.bEcho
   * @generated
   */
  public Adapter createbEchoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.iBeamType <em>iBeam Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.iBeamType
   * @generated
   */
  public Adapter createiBeamTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nRotRpm <em>nRot Rpm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nRotRpm
   * @generated
   */
  public Adapter createnRotRpmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nRpmMult <em>nRpm Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nRpmMult
   * @generated
   */
  public Adapter createnRpmMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nRadius <em>nRadius</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nRadius
   * @generated
   */
  public Adapter createnRadiusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nHubRad <em>nHub Rad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nHubRad
   * @generated
   */
  public Adapter createnHubRadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nPrecone <em>nPrecone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nPrecone
   * @generated
   */
  public Adapter createnPreconeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nBlThp <em>nBl Thp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nBlThp
   * @generated
   */
  public Adapter createnBlThpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.iHubConn <em>iHub Conn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.iHubConn
   * @generated
   */
  public Adapter createiHubConnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.iModePr <em>iMode Pr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.iModePr
   * @generated
   */
  public Adapter createiModePrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.bTabDelim <em>bTab Delim</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.bTabDelim
   * @generated
   */
  public Adapter createbTabDelimAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.bMidNodeTw <em>bMid Node Tw</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.bMidNodeTw
   * @generated
   */
  public Adapter createbMidNodeTwAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nTipMass <em>nTip Mass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nTipMass
   * @generated
   */
  public Adapter createnTipMassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nCmLoc <em>nCm Loc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nCmLoc
   * @generated
   */
  public Adapter createnCmLocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nCmAxial <em>nCm Axial</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nCmAxial
   * @generated
   */
  public Adapter createnCmAxialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nIxxTip <em>nIxx Tip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nIxxTip
   * @generated
   */
  public Adapter createnIxxTipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nIyyTip <em>nIyy Tip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nIyyTip
   * @generated
   */
  public Adapter createnIyyTipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nIzzTip <em>nIzz Tip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nIzzTip
   * @generated
   */
  public Adapter createnIzzTipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nIxyTip <em>nIxy Tip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nIxyTip
   * @generated
   */
  public Adapter createnIxyTipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nIzxTip <em>nIzx Tip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nIzxTip
   * @generated
   */
  public Adapter createnIzxTipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nIyzTip <em>nIyz Tip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nIyzTip
   * @generated
   */
  public Adapter createnIyzTipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.iIdMat <em>iId Mat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.iIdMat
   * @generated
   */
  public Adapter createiIdMatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.iSecFile <em>iSec File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.iSecFile
   * @generated
   */
  public Adapter createiSecFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nSecMasMult <em>nSec Mas Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nSecMasMult
   * @generated
   */
  public Adapter createnSecMasMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nFlpInrMult <em>nFlp Inr Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nFlpInrMult
   * @generated
   */
  public Adapter createnFlpInrMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nLagInrMult <em>nLag Inr Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nLagInrMult
   * @generated
   */
  public Adapter createnLagInrMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nFlpstfMult <em>nFlpstf Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nFlpstfMult
   * @generated
   */
  public Adapter createnFlpstfMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nEdgStfMult <em>nEdg Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nEdgStfMult
   * @generated
   */
  public Adapter createnEdgStfMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nTorStfMult <em>nTor Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nTorStfMult
   * @generated
   */
  public Adapter createnTorStfMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nAxiStfMult <em>nAxi Stf Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nAxiStfMult
   * @generated
   */
  public Adapter createnAxiStfMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nCgOffsMult <em>nCg Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nCgOffsMult
   * @generated
   */
  public Adapter createnCgOffsMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nScOffsMult <em>nSc Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nScOffsMult
   * @generated
   */
  public Adapter createnScOffsMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.nTcOffsMult <em>nTc Offs Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.nTcOffsMult
   * @generated
   */
  public Adapter createnTcOffsMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.iNSelt <em>iN Selt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.iNSelt
   * @generated
   */
  public Adapter createiNSeltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.aElLoc <em>aEl Loc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.aElLoc
   * @generated
   */
  public Adapter createaElLocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.iTwrSupport <em>iTwr Support</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.iTwrSupport
   * @generated
   */
  public Adapter createiTwrSupportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.iTwrAttach <em>iTwr Attach</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.iTwrAttach
   * @generated
   */
  public Adapter createiTwrAttachAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.aTwrWires <em>aTwr Wires</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.aTwrWires
   * @generated
   */
  public Adapter createaTwrWiresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.aNodeAttach <em>aNode Attach</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.aNodeAttach
   * @generated
   */
  public Adapter createaNodeAttachAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.aWireStiff <em>aWire Stiff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.aWireStiff
   * @generated
   */
  public Adapter createaWireStiffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesbmi.aWireAngle <em>aWire Angle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesbmi.aWireAngle
   * @generated
   */
  public Adapter createaWireAngleAdapter()
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

} //BmodesbmiAdapterFactory
