package som.openapi.test.generator.codegen.common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import core.OpenAPIPackage;
import core.Root;
import som.rest.test.TestSuite;

public class AcceleoUtils {

	public static Root loadAssociatedOpenAPIModel(TestSuite testSuite) {
		
		URI uri = testSuite.eResource().getURI().trimFileExtension().appendFileExtension("oas");
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(OpenAPIPackage.eNS_URI, OpenAPIPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		   .put("oas", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(uri, true);
		return (Root) resource.getContents().get(0);
	}

}
