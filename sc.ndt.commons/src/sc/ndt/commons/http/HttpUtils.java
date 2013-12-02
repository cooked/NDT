package sc.ndt.commons.http;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;


public class HttpUtils {

	/**
     * XULRUNNER_ENV
     */
    public static final String XULRUNNER_ENV = "org.eclipse.swt.browser.XULRunnerPath"; //$NON-NLS-1$

    /**
     * XULRUNNER_MAC_PLUGIN
     */
    public static final String XULRUNNER_MAC_PLUGIN = "org.mozilla.xulrunner.macosx"; //$NON-NLS-1$

    /**
     * XULRUNNER_WIN32_PLUGIN
     */
    public static final String XULRUNNER_WIN32_PLUGIN = "org.mozilla.xulrunner.win32.win32.x86"; //$NON-NLS-1$

    /**
     * XULRUNNER_PATH
     */
    public static final String XULRUNNER_PATH = "/xulrunner"; //$NON-NLS-1$


    
	// The shared instance
	static HttpUtils util;
	
	// The shared instance
	static Server server;
	
	public static HttpUtils getInstance() {
		if(util==null)
			util = new HttpUtils();
		return util;
	}
	
	public static Server getDefaultServer() {
		if(server==null)
			try {
				startServer();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return server;
	}

	
	static void startServer() throws Exception {
		
		getInstance();
		
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
        	HttpUtils.class.getClassLoader().getResource("http").toExternalForm()
        );
        resource_handler.setWelcomeFiles(new String[]{"index.html"});
       
        
        ResourceHandler resource_handlerF = new ResourceHandler();
        resource_handlerF.setDirectoriesListed(true);
        resource_handlerF.setResourceBase(
        	HttpUtils.class.getClassLoader().getResource("http").toExternalForm()
        );
        resource_handlerF.setWelcomeFiles(new String[]{"index_flot.html"});
        
        
        /*ResourceHandler resource_handler_2 = new ResourceHandler();
        resource_handler_2.setDirectoriesListed(true);
        resource_handler_2.setResourceBase(
        	HttpUtils.class.getClassLoader().getResource("http").toExternalForm()
        );
        resource_handler_2.setWelcomeFiles(new String[]{"outline.html"});
        
        ResourceHandler resource_handler_4 = new ResourceHandler();
        resource_handler_4.setDirectoriesListed(true);
        resource_handler_4.setResourceBase(
        	HttpUtils.class.getClassLoader().getResource("http").toExternalForm()
        );
        resource_handler_4.setWelcomeFiles(new String[]{"outline_flot.html"});
        
        ResourceHandler resource_handler_3 = new ResourceHandler();
        resource_handler_3.setDirectoriesListed(true);
        resource_handler_3.setResourceBase(
        	HttpUtils.class.getClassLoader().getResource("http").toExternalForm()
        );
        resource_handler_3.setWelcomeFiles(new String[]{"quickChart.html"});
        */
        
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { 
        		resource_handler, 
        		resource_handlerF,
        		/*
        		resource_handler_2, 
        		resource_handler_3,
        		resource_handler_4,*/
        		new DefaultHandler() });
        
        server = new Server();
        server.setConnectors(new Connector[]{connector});
        server.setHandler(handlers);
        server.start();
        
	}
	
	public void stopServer() throws Exception {
		server.stop();
	}

	// specify browser type 	- http://www.eclipse.org/swt/faq.php#browserspecifydefault
    // SWT.MOZILLA 				- http://www.eclipse.org/swt/faq.php#howusemozilla
    // 							- https://developer.mozilla.org/en/docs/XULRunner
    // XULRunner Eclipse plugin - http://forge.ispras.ru/projects/xulrunner-eclipse
    // XULRunner vs WebKit 		- http://dottorblaster.it/2011/04/eclipse-sostituire-xulrunner-con-webkit/
	public static int getEngine() {
		if(Platform.getOS().matches(Platform.OS_WIN32))
			return SWT.MOZILLA;
		else
			return SWT.NONE;
	}
	
}
