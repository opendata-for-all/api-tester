package som.openapi.test.generator.popup.actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import core.CoreFactory;
import core.CorePackage;
import core.Root;
import som.openapi.test.generator.utils.OpenAPIUtils;





public class GenerateOpenAPIModelAction implements IObjectActionDelegate {

	private Shell shell;

	private IFile file;

	/**
	 * Constructor for Action1.
	 */
	public GenerateOpenAPIModelAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		 // Initialize the model
        CorePackage.eINSTANCE.eClass();
      

  
     
        Resource.Factory.Registry resOpenAPI= Resource.Factory.Registry.INSTANCE;
        Map<String, Object> mOData = resOpenAPI.getExtensionToFactoryMap();
        mOData.put("oas", new XMIResourceFactoryImpl());
        IContainer target = file.getProject().getFolder("src-gen");
        if (!target.getLocation().toFile().exists()) {
			target.getLocation().toFile().mkdirs();
		}
        try {
        
        InputStream in = new FileInputStream(file.getLocation().toString());
        Reader reader = new InputStreamReader(in, "UTF-8");
		JsonParser parser = new JsonParser();
		JsonElement jsonElement =  parser.parse(reader);
		JsonObject jsonAPI = jsonElement.getAsJsonObject();
		Root	apiRoot = OpenAPIUtils.getModelFromSwaggerJson(jsonAPI);
        ResourceSet resourceSetOpenAPI = new ResourceSetImpl();
        Resource resourceOpenAPI = resourceSetOpenAPI.createResource(URI.createPlatformResourceURI(target.getFullPath().toString(), true).appendSegment(file.getName().substring(0, file.getName().lastIndexOf('.'))).appendFileExtension("oas"));
	

		
		
			resourceOpenAPI.getContents().add(apiRoot);
			
				resourceOpenAPI.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IFile) {
				file = (IFile) structuredSelection.getFirstElement();
			}
		}
	}

}
