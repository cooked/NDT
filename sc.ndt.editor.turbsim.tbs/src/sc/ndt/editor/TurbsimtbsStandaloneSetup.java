/*
* generated by Xtext
*/
package sc.ndt.editor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TurbsimtbsStandaloneSetup extends TurbsimtbsStandaloneSetupGenerated{

	public static void doSetup() {
		new TurbsimtbsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

