package sc.nrel.nwtc.fast.launching;

import java.io.File;

import org.eclipse.debug.core.ILaunchManager;

import sc.nrel.nwtc.fast.launching.AbstractFASTInstall;
import sc.nrel.nwtc.fast.launching.IFASTInstallType;
import sc.nrel.nwtc.fast.launching.IFASTRunner;

public class StandardFAST extends AbstractFASTInstall {

	/**
	 * If a StandardVM returns a string for #getDebugArgs(), the string may contain
	 * the variable ${port}.  This will be replaced with the port that the vm is 
	 * using when launching.
	 */
	public static final String VAR_PORT = "${port}"; //$NON-NLS-1$

	StandardFAST(IFASTInstallType type, String id) {
		super(type, id);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.IVMInstall#getVMRunner(java.lang.String)
	 */
	public IFASTRunner getFASTRunner(String mode) {
		if (ILaunchManager.RUN_MODE.equals(mode)) {
			return new StandardFASTRunner(this);
		} /* TODO else if (ILaunchManager.DEBUG_MODE.equals(mode)) {
			return new StandardVMDebugger(this);
		} */
		return null;
	}

    /* (non-Javadoc)
     * @see org.eclipse.jdt.launching.IVMInstall#getJavaVersion()
     */
    public String getJavaVersion() {
        StandardFASTType installType = (StandardFASTType) getFASTInstallType();
        File installLocation = getInstallLocation();
        if (installLocation != null) {
            File executable = getJavaExecutable();
            if (executable != null) {
                String vmVersion = installType.getVMVersion(installLocation, executable);
                // strip off extra info
                StringBuffer version = new StringBuffer();
                for (int i = 0; i < vmVersion.length(); i++) {
                    char ch = vmVersion.charAt(i);
                    if (Character.isDigit(ch) || ch == '.') {
                        version.append(ch);
                    } else {
                        break;
                    }
                }
                if (version.length() > 0) {
                    return version.toString();
                }
            }
        }
        return null;
    }
    
    /**
     * Returns the java executable for this VM or <code>null</code> if cannot be found
     * 
     * @return executable for this VM or <code>null</code> if none
     */
    File getJavaExecutable() {
    	File installLocation = getInstallLocation();
        if (installLocation != null) {
            return StandardFASTType.findFASTExecutable(installLocation);
        }
        return null;
    }    
    
    /**
     * Returns arguments used to start this VM in debug mode or 
     * <code>null</code> if default arguments should be used.
     * 
     * @return arguments used to start this VM in debug mode
     * or <code>null</code> if default arguments should be used
     */
    public String getDebugArgs() {
    	return null;
    }
    
}
