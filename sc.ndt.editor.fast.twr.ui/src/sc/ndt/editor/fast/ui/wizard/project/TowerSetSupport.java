package sc.ndt.editor.fast.ui.wizard.project;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class TowerSetSupport {
	
	//static Bundle currentBundle;
	static Bundle commonsBundle;
	
    public static IProject createProjectTwr(IProject project, String projectName, URI location) {
    	
        Assert.isNotNull(projectName);
        Assert.isTrue(projectName.trim().length() > 0);
 
        commonsBundle = Platform.getBundle("sc.ndt.commons");
        
        try {
            String[] files = { 
            		projectName+"/tower.twr",
            		projectName+"/tower.tsp",
            		projectName+"/tower.tsv",
            		projectName+"/tower.bmi"
            		};
            addToProjectStructure(project, files);
        } catch (CoreException e) {
            e.printStackTrace();
            project = null;
        }
 
        return project;
    }
 
    private static void createFolder(IFolder folder) throws CoreException {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolder((IFolder) parent);
        }
        if (!folder.exists()) {
            folder.create(false, true, null);
        }
    }
    
    private static void createFile(IFile file) throws CoreException, IOException {
        IContainer parent = file.getParent();
        if (parent instanceof IFolder)
            createFolder((IFolder) parent);
   
        if (!file.exists()) {
        	//IPath path = file.getProjectRelativePath();
    		URL url = commonsBundle.getEntry("templates/input/tower/tower."+file.getFileExtension());
        	InputStream inputStream = url.openConnection().getInputStream();
    	    file.create(inputStream, IResource.NONE, null);
    	}
    }
    
    /**
     * Create a folder structure with a parent root, overlay, and a few child
     * folders.
     *
     * @param newProject
     * @param paths
     * @throws CoreException
     */
    private static void addToProjectStructure(IProject newProject, /*String[] folders,*/ String[] files) throws CoreException {
        
    	for (String file : files) {
            IFile etcFile = newProject.getFile(file);
            try {
				createFile(etcFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    	
    }
 
}