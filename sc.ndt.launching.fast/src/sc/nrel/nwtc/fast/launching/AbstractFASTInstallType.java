package sc.nrel.nwtc.fast.launching;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.osgi.util.NLS;

/**
 * Abstract implementation of a VM install type.
 * Subclasses should implement
 * <ul>
 * <li><code>IVMInstall doCreateVMInstall(String id)</code></li>
 * <li><code>String getName()</code></li>
 * <li><code>IStatus validateInstallLocation(File installLocation)</code></li>
 * </ul>
 * <p>
 * Clients implementing VM install types should subclass this class.
 * </p>
 */

public abstract class AbstractFASTInstallType implements IFASTInstallType, IExecutableExtension {
	private List<IFASTInstall> fVMs;
	private String fId;
	
	/**
	 * Constructs a new VM install type.
	 */
	protected AbstractFASTInstallType() {
		fVMs= new ArrayList<IFASTInstall>(10);
	}

	/* (non-Javadoc)
	 * Subclasses should not override this method.
	 * @see IVMType#getVMs()
	 */
	public IFASTInstall[] getFASTInstalls() {
		IFASTInstall[] vms= new IFASTInstall[fVMs.size()];
		return fVMs.toArray(vms);
	}

	/* (non-Javadoc)
	 * Subclasses should not override this method.
	 * @see IVMType#disposeVM(String)
	 */
	public void disposeFASTInstall(String id) {
		for (int i= 0; i < fVMs.size(); i++) {
			IFASTInstall vm= fVMs.get(i);
			if (vm.getId().equals(id)) {
				fVMs.remove(i);
				// TODO JavaRuntime.fireVMRemoved(vm);
				return;
			}
		}
	}

	/* (non-Javadoc)
	 * Subclasses should not override this method.
	 * @see IVMType#getVM(String)
	 */
	public IFASTInstall findFASTInstall(String id) {
		for (int i= 0; i < fVMs.size(); i++) {
			IFASTInstall vm= fVMs.get(i);
			if (vm.getId().equals(id)) {
				return vm;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * Subclasses should not override this method.
	 * @see IVMType#createVM(String)
	 */
	public IFASTInstall createFASTInstall(String id) throws IllegalArgumentException {
		if (findFASTInstall(id) != null) {
			String format= LaunchingMessages.vmInstallType_duplicateVM; 
			throw new IllegalArgumentException(NLS.bind(format, new String[] { id }));
		}
		IFASTInstall vm= doCreateFASTInstall(id);
		fVMs.add(vm);
		return vm;
	}
	
	/**
	 * Subclasses should return a new instance of the appropriate
	 * <code>IVMInstall</code> subclass from this method.
	 * @param	id	The vm's id. The <code>IVMInstall</code> instance that is created must
	 * 				return <code>id</code> from its <code>getId()</code> method.
	 * 				Must not be <code>null</code>.
	 * @return	the newly created IVMInstall instance. Must not return <code>null</code>.
	 */
	protected abstract IFASTInstall doCreateFASTInstall(String id);

	/**
	 * Initializes the id parameter from the "id" attribute
	 * in the configuration markup.
	 * Subclasses should not override this method.
	 * @param config the configuration element used to trigger this execution. 
	 *		It can be queried by the executable extension for specific
	 *		configuration properties
	 * @param propertyName the name of an attribute of the configuration element
	 *		used on the <code>createExecutableExtension(String)</code> call. This
	 *		argument can be used in the cases where a single configuration element
	 *		is used to define multiple executable extensions.
	 * @param data adapter data in the form of a <code>String</code>, 
	 *		a <code>Hashtable</code>, or <code>null</code>.
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) {
		fId= config.getAttribute("id"); //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * Subclasses should not override this method.
	 * @see IVMType#getId()
	 */
	public String getId() {
		return fId;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.IVMInstallType#findVMInstallByName(java.lang.String)
	 */
	public IFASTInstall findFASTInstallByName(String name) {
		for (int i= 0; i < fVMs.size(); i++) {
			IFASTInstall vm= fVMs.get(i);
			if (vm.getName().equals(name)) {
				return vm;
			}
		}
		return null;
	}

	/**
	 * Returns a URL for the default javadoc location of a VM installed at the
	 * given home location, or <code>null</code> if none. The default
	 * implementation returns <code>null</code>, subclasses must override as
	 * appropriate.
	 * <p>
	 * Note, this method would ideally be added to <code>IVMInstallType</code>,
	 * but it would have been a breaking API change between 2.0 and 2.1. Thus,
	 * it has been added to the abstract base class that VM install types should
	 * subclass.
	 * </p>
	 * 
	 * @param installLocation home location
	 * @return default javadoc location or <code>null</code>
	 * @since 2.1
	 */
	public URL getDefaultJavadocLocation(File installLocation) {
		return null;		
	}
	
	/**
	 * Returns a string of default VM arguments for a VM installed at the
	 * given home location, or <code>null</code> if none.
	 * The default implementation returns <code>null</code>, subclasses must override
	 * as appropriate.
	 * <p>
	 * Note, this method would ideally be added to <code>IVMInstallType</code>,
	 * but it would have been a breaking API change between 2.0 and 3.4. Thus,
	 * it has been added to the abstract base class that VM install types should
	 * subclass.
	 * </p>
	 * @param installLocation home location
	 * @return default VM arguments or <code>null</code> if none
	 * @since 3.4
	 */
	public String getDefaultFASTArguments(File installLocation) {
		return null;
	}
}
