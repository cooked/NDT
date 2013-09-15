package sc.ndt.editor.fast.ui;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "sc.ndt.editor.fast.out"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private Server server;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		Connector connector=new SelectChannelConnector();
		connector.setHost("localhost");
        connector.setPort(8888);
        
        // see 
        // http://www.vogella.com/blog/2010/07/06/reading-resources-from-plugin/
        // see
        // http://stackoverflow.com/questions/1462953/embedded-jetty-looking-for-files-inside-its-jar-file
        // http://docs.codehaus.org/display/JETTY/Embedding+Jetty
        
        ResourceHandler resource_handler = new ResourceHandler();

        resource_handler.setDirectoriesListed(true);
        resource_handler.setResourceBase(
        		this.getClass().getClassLoader().getResource("http").toExternalForm()
        	);
        resource_handler.setWelcomeFiles(new String[]{"index.html"});
        
           
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { resource_handler, new DefaultHandler() });
        
        server = new Server();
        server.setConnectors(new Connector[]{connector});
        server.setHandler(handlers);
        server.start();
		
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);

		server.stop();
		
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static String getAbsoluteURL(String path){
		Bundle bundle = Platform.getBundle(PLUGIN_ID);
		String loc = bundle.getLocation();
		loc = loc.substring(loc.indexOf("file:"), loc.length()).concat(path);
		return loc;
	}
	
}
