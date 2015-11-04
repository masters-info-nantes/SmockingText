
package org.xtext.smokingtext.diagramclass;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DiagramClassStandaloneSetup extends DiagramClassStandaloneSetupGenerated{

	public static void doSetup() {
		new DiagramClassStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

