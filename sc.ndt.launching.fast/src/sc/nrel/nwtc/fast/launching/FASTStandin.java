package sc.nrel.nwtc.fast.launching;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * An implementation of IVMInstall that is used for manipulating VMs without necessarily 
 * committing changes.
 * <p>
 * Instances of this class act like wrappers.  All other instances of IVMInstall represent 
 * 'real live' VMs that may be used for building or launching.  Instances of this class
 * behave like 'temporary' VMs that are not visible and not available for building or launching.
 * </p>
 * <p>
 * Instances of this class may be constructed as a preliminary step to creating a 'live' VM
 * or as a preliminary step to making changes to a 'real' VM.
 * </p>
 * When <code>convertToRealVM</code> is called, a corresponding 'real' VM is created
 * if one did not previously exist, or the corresponding 'real' VM is updated.
 * </p>
 * <p>
 * Clients may instantiate this class.
 * </p>
 * 
 * @since 2.1
 * @noextend This class is not intended to be subclassed by clients.
 */
public class FASTStandin extends AbstractFASTInstall {
    
    /**
     * <code>java.version</code> system property, or <code>null</code>
     * @since 3.1
     */
    private String fJavaVersion = null;

	/*
	 * @see org.eclipse.jdt.launching.AbstractVMInstall#AbstractVMInstall(org.eclipse.jdt.launching.IVMInstallType, java.lang.String)
	 */
	public FASTStandin(IFASTInstallType type, String id) {
		super(type, id);
		// TODO setNotify(false);
	}
	
	/**
	 * Constructs a copy of the specified VM with the given identifier.
	 * 
	 * @param sourceVM
	 * @param id
	 * @since 3.2
	 */
	public FASTStandin(IFASTInstall sourceVM, String id) {
		super(sourceVM.getFASTInstallType(), id);
		setNotify(false);
		init(sourceVM);
	}
	
	/**
	 * Construct a <code>VMStandin</code> instance based on the specified <code>IVMInstall</code>.
	 * Changes to this standin will not be reflected in the 'real' VM until <code>convertToRealVM</code>
	 * is called.
	 * 
	 * @param realVM the 'real' VM from which to construct this standin VM
	 */
	public FASTStandin(IFASTInstall realVM) {
		this (realVM.getFASTInstallType(), realVM.getId());
		init(realVM);
	}

	/**
	 * Initializes the settings of this standin based on the settings in the given
	 * VM install.
	 * 
	 * @param realVM VM to copy settings from
	 */
	private void init(IFASTInstall realVM) {
		setName(realVM.getName());
		setInstallLocation(realVM.getInstallLocation());
		// TODO setLibraryLocations(realVM.getLibraryLocations());
		// TODO setJavadocLocation(realVM.getJavadocLocation());
		/* if (realVM instanceof IVMInstall2) {
			IVMInstall2 vm2 = (IVMInstall2) realVM;
			setVMArgs(vm2.getVMArgs());
	        fJavaVersion = vm2.getJavaVersion();			
		} else {
			setVMArguments(realVM.getFASTArguments());
			fJavaVersion = null;
		}*/
		if (realVM instanceof AbstractFASTInstall) {
			AbstractFASTInstall vm2 = (AbstractFASTInstall) realVM;
			Map attributes = vm2.getAttributes();
			Iterator iterator = attributes.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry entry = (Entry) iterator.next();
				// TODO setAttribute((String)entry.getKey(), (String)entry.getValue());
			}
		}
	}
	
	/**
	 * If no corresponding 'real' VM exists, create one and populate it from this standin instance. 
	 * If a corresponding VM exists, update its attributes from this standin instance.
	 * 
	 * @return IVMInstall the 'real' corresponding to this standin VM
	 */
	public IFASTInstall convertToRealVM() {
		IFASTInstallType vmType= getFASTInstallType();
		IFASTInstall realVM= vmType.findFASTInstall(getId());
		boolean notify = true;
		
		if (realVM == null) {
			realVM= vmType.createFASTInstall(getId());
			notify = false;
		}
		// do not notify of property changes on new VMs
		if (realVM instanceof AbstractFASTInstall) {
			 ((AbstractFASTInstall)realVM).setNotify(notify);
		}
		realVM.setName(getName());
		realVM.setInstallLocation(getInstallLocation());
		//realVM.setLibraryLocations(getLibraryLocations());
		//realVM.setJavadocLocation(getJavadocLocation());
		/*if (realVM instanceof IVMInstall2) {
			IVMInstall2 vm2 = (IVMInstall2) realVM;
			vm2.setVMArgs(getVMArgs());
		} else {
			realVM.setVMArguments(getVMArguments());
		}*/
		
		/*
		if (realVM instanceof AbstractFASTInstall) {
		
			AbstractFASTInstall avm = (AbstractFASTInstall) realVM;
			Iterator iterator = getAttributes().entrySet().iterator();
			while (iterator.hasNext()) {
				Entry entry = (Entry) iterator.next();
				avm.setAttribute((String)entry.getKey(), (String)entry.getValue());
			}
			avm.setNotify(true);
		}
		*/
		
		if (!notify) {
			FASTRuntime.fireVMAdded(realVM);
		}
		
		return realVM;
		
	}
		
    /* (non-Javadoc)
     * @see org.eclipse.jdt.launching.IVMInstall#getJavaVersion()
     */
    public String getJavaVersion() {
        return fJavaVersion;
    }
}
