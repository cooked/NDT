/*******************************************************************************
 * Copyright (C) 2013 Stefano Cottafavi - All Rights Reserved
 ******************************************************************************/
package sc.ndt.editor.fast;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class FastfstStandaloneSetup extends FastfstStandaloneSetupGenerated {

	public static void doSetup() {
		new FastfstStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
