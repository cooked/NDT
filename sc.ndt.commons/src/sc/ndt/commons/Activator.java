package sc.ndt.commons;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.google.gson.Gson;

import sc.ndt.commons.model.OutListRegistry;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "sc.ndt.commons"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private static Gson gson;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		gson = new Gson();
		
	}

	static public Gson getGson() {
		if(gson==null)
			gson = new Gson();
		return gson;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	// SC: this manage shared images
	// see 
	// http://richclientplatform.blogspot.it/2007/05/plugin-your-images.html
		
	public static final String IMG_OUT_CH_ID = "image.outch";
	public static final String IMG_OUT_CHD_ID = "image.outch.disconnected";
	public static final String IMG_OUT_BLK_ID = "image.outblk";

	@Override
	protected void initializeImageRegistry(ImageRegistry registry) {
		super.initializeImageRegistry(registry);
		Bundle bundle = Platform.getBundle(PLUGIN_ID);

		registry.put(IMG_OUT_CH_ID, ImageDescriptor.createFromURL(FileLocator
				.find(bundle, new Path("icons/connect.png"), null)));
		registry.put(IMG_OUT_CHD_ID, ImageDescriptor.createFromURL(FileLocator
				.find(bundle, new Path("icons/disconnect.png"), null)));
		registry.put(IMG_OUT_BLK_ID, ImageDescriptor.createFromURL(FileLocator
				.find(bundle, new Path("icons/database_connect.png"), null)));
	}

	// SC: initialize OutList registry
	
	
}
