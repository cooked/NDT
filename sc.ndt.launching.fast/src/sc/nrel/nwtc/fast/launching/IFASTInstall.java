package sc.nrel.nwtc.fast.launching;


import java.io.File;
import java.net.URL;

public interface IFASTInstall {

	    /**
	     * Returns a VM runner that runs this installed VM in the given mode.
	     * 
	     * @param mode the mode the VM should be launched in; one of the constants
	     *   declared in <code>org.eclipse.debug.core.ILaunchManager</code>
	     * @return  a VMRunner for a given mode May return <code>null</code> if the given mode
	     *          is not supported by this VM.
	     * @see org.eclipse.debug.core.ILaunchManager
	     */
	    IFASTRunner getFASTRunner(String mode);
	    /**
	     * Returns the id for this VM. VM IDs are unique within the VMs 
	     * of a given VM type. The VM id is not intended to be presented to users.
	     * 
	     * @return the VM identifier. Must not return <code>null</code>.
	     */
	    String getId();
	    /**
	     * Returns the display name of this VM.
	     * The VM name is intended to be presented to users.
	     * 
	     * @return the display name of this VM. May return <code>null</code>.
	     */
	    String getName();
	    /**
	     * Sets the display name of this VM.
	     * The VM name is intended to be presented to users.
	     * 
	     * @param name the display name of this VM
	     */
	    void setName(String name);
	    /**
	     * Returns the root directory of the install location of this VM.
	     * 
	     * @return the root directory of this VM installation. May
	     *          return <code>null</code>.
	     */
	    File getInstallLocation();
	    /**
	     * Sets the root directory of the install location of this VM.
	     * 
	     * @param installLocation the root directory of this VM installation
	     */
	    void setInstallLocation(File installLocation);
	        
	    /**
	     * Returns the VM type of this VM.
	     * 
	     * @return the VM type that created this IVMInstall instance
	     */
	    IFASTInstallType getFASTInstallType();
	    
	    /**
	     * Returns the library locations of this IVMInstall. Generally,
	     * clients should use <code>JavaRuntime.getLibraryLocations(IVMInstall)</code>
	     * to determine the libraries associated with this VM install.
	     * 
	     * @see IVMInstall#setLibraryLocations(LibraryLocation[])
	     * @return  The library locations of this IVMInstall.
	     *          Returns <code>null</code> to indicate that this VM install uses
	     *          the default library locations associated with this VM's install type.
	     * @since 2.0
	     */
	    //LibraryLocation[] getLibraryLocations();    
	    
	    /**
	     * Sets the library locations of this IVMInstall.
	     * @param   locations The <code>LibraryLocation</code>s to associate
	     *          with this IVMInstall.
	     *          May be <code>null</code> to indicate that this VM install uses
	     *          the default library locations associated with this VM's install type.
	     * @since 2.0
	     */
	    //void setLibraryLocations(LibraryLocation[] locations);  
	    
	    /**
	     * Sets the Javadoc location associated with this VM install.
	     * 
	     * @param url a url pointing to the Javadoc location associated with
	     *  this VM install
	     * @since 2.0
	     */
	    //public void setJavadocLocation(URL url);
	    
	    /**
	     * Returns the Javadoc location associated with this VM install.
	     * 
	     * @return a url pointing to the Javadoc location associated with
	     *  this VM install, or <code>null</code> if none
	     * @since 2.0
	     */
	    //public URL getJavadocLocation();
	    
	    /**
	     * Returns VM arguments to be used with this vm install whenever this
	     * VM is launched as they should be passed to the command line, or
	     * <code>null</code> if none.
	     * 
	     * @return VM arguments to be used with this vm install whenever this
	     * VM is launched as they should be passed to the command line, or
	     * <code>null</code> if none
	     * @since 3.0
	     */
	    //public String[] getFASTArguments();
	    
	    /**
	     * Sets VM arguments to be used with this vm install whenever this
	     * VM is launched, possibly <code>null</code>. This is equivalent
	     * to <code>setVMArgs(String)</code> with whitespace character delimited
	     * arguments.  
	     * 
	     * @param vmArgs VM arguments to be used with this vm install whenever this
	     * VM is launched, possibly <code>null</code>
	     * @since 3.0
	     * @deprecated if possible, clients should use setVMArgs(String) on
	     *  {@link IVMInstall2} when possible
	     */
	    //public void setFASTArguments(String[] vmArgs);
	
}
