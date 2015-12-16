package org.xtext.smokingtext.diagramclass;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

public class DslToXmi {
			
	 public static void main(String[] args) {
	        DiagramClassStandaloneSetup.doSetup();
	        XtextResourceSet resourceSet = new XtextResourceSet();
	        URI uri = URI.createURI("/home/david/Documents/M2ALMA/MDE/Projet/runtime-EclipseApplication/DiagramClassInstance/books.st");
	        Resource xtextResource = resourceSet.getResource(uri , true);
	        Resource xmiResource = new EcoreResourceFactoryImpl().createResource(URI.createURI("model/generated/booksDiagramClass.ecore"));
	        xmiResource.getContents().add(xtextResource.getContents().get(0));
	        try {
	            xmiResource.save(null);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	               
	    }
}

	

	

	