package som.openapi.test.generator.transformation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.Module;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

import core.OpenAPIFactory;
import core.OpenAPIPackage;
import som.rest.test.TestPackage;

public class ATLRunner {

	public static void run(URI sourceModel, URI targetModel) throws IOException, URISyntaxException {
		
		URI inputLocation = sourceModel;
		URI outputLocation = targetModel;

		ResourceSet resourceSet = new ResourceSetImpl();

		URI transformationUri = URI.createPlatformPluginURI("/som.openapi.test.generator/transformation/openapi2test.emftvm", true);
		Resource transformationResource = resourceSet.getResource(transformationUri, true);
		Module module = (Module) transformationResource.getContents().get(0);

		String moduleName = module.getName();

		String sourcemmName = null;
		String inputName = null;
		if (!module.getInputModels().isEmpty()) {
			sourcemmName = module.getInputModels().get(0).getMetaModelName();
			inputName = module.getInputModels().get(0).getModelName();
		}

		String targetmmName = null;
		String outputName = null;
		if (!module.getOutputModels().isEmpty()) {
			targetmmName = module.getOutputModels().get(0).getMetaModelName();
			outputName = module.getOutputModels().get(0).getModelName();
		}

		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();

		// Source metamodel
		if (sourcemmName != null) {
			Metamodel sourcemm = EmftvmFactory.eINSTANCE.createMetamodel();
			sourcemm.setResource(resourceSet.getResource(URI.createURI(OpenAPIPackage.eNS_URI), true));
			env.registerMetaModel(sourcemmName, sourcemm);
		}

		// Target metamodel
		if (targetmmName != null) {
			Metamodel targetmm = EmftvmFactory.eINSTANCE.createMetamodel();
			targetmm.setResource(resourceSet.getResource(URI.createURI(TestPackage.eNS_URI), true));
			env.registerMetaModel(targetmmName, targetmm);
		}

		// Input model
		if (inputName != null) {
			Model input = EmftvmFactory.eINSTANCE.createModel();
			input.setResource(resourceSet.getResource(inputLocation, true));
			env.registerInputModel(inputName, input);
		}

		// Output model
		if (outputName != null) {
			Model output = EmftvmFactory.eINSTANCE.createModel();
			output.setResource(resourceSet.createResource(outputLocation));
			env.registerOutputModel(outputName, output);
		}

		// Load and run module
		ModuleResolver mr = new DefaultModuleResolver(transformationUri.trimSegments(1).toString() + "/",
				new ResourceSetImpl());

		TimingData td = new TimingData();

		env.loadModule(mr, moduleName);
		td.finishLoading();
		env.run(td);
		td.finish();

		ATLLogger.info(td.toString());

		// Save models
		for (Model model : env.getOutputModels().values()) {
			model.getResource().save(Collections.emptyMap());
		}
		for (Model model : env.getInoutModels().values()) {
			model.getResource().save(Collections.emptyMap());
		}

	
	

	}

	

	private static void registerPackages(ResourceSet rs, Resource resource) {
		EObject eObject = resource.getContents().get(0);
		if (eObject instanceof EPackage) {
			EPackage p = (EPackage) eObject;
			rs.getPackageRegistry().put(p.getNsURI(), p);
		}
	}

	static URL getFileURL(String fileName) throws IOException {
		URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = ATLRunner.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = ATLRunner.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}