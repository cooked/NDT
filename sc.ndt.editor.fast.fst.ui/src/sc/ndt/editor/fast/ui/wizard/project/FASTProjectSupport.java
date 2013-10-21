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

import sc.ndt.editor.fast.ui.addon.nature.FASTProjectNature;

public class FASTProjectSupport {
	
	//static Bundle currentBundle;
	static Bundle commonsBundle;
	
    public static IProject createProject(String projectName, URI location) {
        Assert.isNotNull(projectName);
        Assert.isTrue(projectName.trim().length() > 0);
 
        commonsBundle = Platform.getBundle("sc.ndt.commons");
        
        IProject project = createBaseProject(projectName, location);
        try {
        	
        	// TODO BUG: if the project has this nature, when Xtext one will be added
        	// workspace building will stuck!!! 
        	
            addNature(project);
 
            String[] folders = {
            		"output",
            		"output/dlc",
            		"output/linear"
            		};
            String[] files = { 
            		".build/build.xml",
            		".build/build.properties",
            		"input/aero/aerodyn.adn",
            		"input/tower/tower.twr",
            		"input/blade/blade.bld",
            		"input/aero/foil/01.dat",
            		"input/aero/foil/02.dat",
            		"input/wind/iecwind/iecwind.iec",
            		"input/wind/turbsim/turbsim.tbs",
            		"wind/rated.wnd",
            		"FAST.fst"
            		};
            addToProjectStructure(project, folders, files);
        } catch (CoreException e) {
            e.printStackTrace();
            project = null;
        }
 
        return project;
    }
 
    /**
     * Just do the basics: create a basic project.
     *
     * @param location
     * @param projectName
     */
    private static IProject createBaseProject(String projectName, URI location) {
        // it is acceptable to use the ResourcesPlugin class
        IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
 
        if (!newProject.exists()) {
            URI projectLocation = location;
            IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
            if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
                projectLocation = null;
            }
 
            desc.setLocationURI(projectLocation);
            try {
                newProject.create(desc, null);
                if (!newProject.isOpen()) {
                    newProject.open(null);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
 
        return newProject;
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
        	IPath path = file.getProjectRelativePath();
    		URL url = commonsBundle.getEntry("templates/"+path.toString());
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
    private static void addToProjectStructure(IProject newProject, String[] folders, String[] files) throws CoreException {
        
    	for (String folder : folders) {
            IFolder etcFolder = newProject.getFolder(folder);
            createFolder(etcFolder);
        }
        
    	for (String file : files) {
            IFile etcFile = newProject.getFile(file);
            try {
				createFile(etcFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    	
    }
 
    private static void addNature(IProject project) throws CoreException {
        if (!project.hasNature(FASTProjectNature.NATURE_ID)) {
            IProjectDescription description = project.getDescription();
            String[] prevNatures = description.getNatureIds();
            String[] newNatures = new String[prevNatures.length + 1];
            System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
            newNatures[prevNatures.length] = FASTProjectNature.NATURE_ID;
            description.setNatureIds(newNatures);
 
            IProgressMonitor monitor = null;
            project.setDescription(description, monitor);
        }
    }
    
    /*private static void createNewFileFromTemplate(IProject proj, String src, String dst) throws CoreException, IOException {
	
	// http://blog.vogella.com/2010/07/06/reading-resources-from-plugin/
	// http://wiki.eclipse.org/FAQ_How_are_resources_created%3F
	if(dest instanceof IFile)
		IFile dir = ((IFolder)(dest.getParent())).getFile(dest.getName());
	
	else if (dest instanceof IFolder) {
    	IFile destFile = delse.getFile(file);
    	if(dstFile!=null)
    		 destFile = dest.getFile(dstFile);
	}
	
	if (!destFile.exists()) {
		URL url = commonsBundle.getEntry(templatePath+file);
    	InputStream inputStream = url.openConnection().getInputStream();
	    destFile.create(inputStream, IResource.NONE, null);
	}

}*/
 
}