package som.openapi.test.generator.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import core.API;
import core.Operation;
import core.Root;
import core.Schema;

public class OpenAPIUtils {

	public static void saveOpenAPIModel(Root apiRoot, URI uri) throws FileNotFoundException {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("oas", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(uri);
		resource.getContents().add(apiRoot);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Schema getSchemaByPathReference(String ref, API api) {
		List<Schema> schemas = api.getDefinitions();
		for (Schema schema : schemas) {
			if (schema.getRef().equalsIgnoreCase(ref))
				return schema;
		}
		return null;
	}

	public static Schema getSchemaByName(String name, API api) {
		for (Schema schema : api.getDefinitions()) {
			if (schema.getName().equalsIgnoreCase(name))
				return schema;
		}
		return null;
	}

	public static Schema getPropertyByName(String name, Schema schema) {
		for (Schema property : schema.getProperties())
			if (property.getName().equals(name))
				return property;
		return null;

	}

	public static List<Operation> getAllOperations(Root apiRoot) {
		TreeIterator<EObject> allElements = apiRoot.eAllContents();
		List<Operation> allOperations = new ArrayList<>();
		while (allElements.hasNext()) {
			EObject object = allElements.next();
			if (object instanceof Operation) {
				allOperations.add((Operation) object);
			}
		}
		return allOperations;
	}

	public static Operation getOperationById(Root apiRoot, String operationId) {
		List<Operation> allOperations = getAllOperations(apiRoot);
		for (Operation operation : allOperations) {
			if (operation.getOperationId().equals(operationId))
				return operation;
		}
		return null;
	}

	public static String getPathFromOperation(Operation operation) {
		return ((API) operation.getPath().eContainer()).getHost()
				+ ((API) operation.getPath().eContainer()).getBasePath() + operation.getPath().getPattern();

	}

}
