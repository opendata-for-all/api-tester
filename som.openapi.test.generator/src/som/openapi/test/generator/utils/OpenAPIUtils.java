package som.openapi.test.generator.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import core.API;
import core.APIKeyLocation;
import core.Contact;
import core.CoreFactory;
import core.CorePackage;
import core.Example;
import core.ExternalDocs;
import core.Header;
import core.Info;
import core.ItemsDefinition;
import core.License;
import core.OAuth2FlowType;
import core.Operation;
import core.Parameter;
import core.ParameterLocation;
import core.Path;
import core.Response;
import core.Root;
import core.Schema;
import core.SchemeType;
import core.SecurityRequirement;
import core.SecuritySchema;
import core.SecuritySchemeType;
import core.SecurityScope;
import core.Tag;
import core.XMLElement;

public class OpenAPIUtils {

	

	public static Root getModelFromSwaggerJson(JsonObject swaggerRoot) {

		CorePackage.eINSTANCE.eClass();
		CoreFactory factory = CoreFactory.eINSTANCE;
		Root root = factory.createRoot();
		API api = factory.createAPI();
		root.setApi(api);
		if (swaggerRoot.has("swagger"))
			api.setSwagger(swaggerRoot.get("swagger").getAsString());
		if (swaggerRoot.has("info")) {
			Info info = factory.createInfo();
			api.setInfo(info);
			discoverInfo(swaggerRoot.get("info"), info, factory);
		}
		if (swaggerRoot.has("host"))
			api.setHost(swaggerRoot.get("host").getAsString());

		if (swaggerRoot.has("basePath"))
			api.setBasePath(swaggerRoot.get("basePath").getAsString());
		if (swaggerRoot.has("schemes")) {
			JsonArray schemes = swaggerRoot.get("schemes").getAsJsonArray();
			for (JsonElement scheme : schemes) {
				api.getSchemes().add(SchemeType.get(scheme.getAsString()));
			}
		}
		if (swaggerRoot.has("consumes")) {
			JsonArray mimeTypes = swaggerRoot.get("consumes").getAsJsonArray();
			for (JsonElement mimeType : mimeTypes) {
				api.getConsumes().add(mimeType.getAsString());
			}
		}

		if (swaggerRoot.has("produces")) {
			JsonArray mimeTypes = swaggerRoot.get("produces").getAsJsonArray();
			for (JsonElement mimeType : mimeTypes) {
				api.getProduces().add(mimeType.getAsString());
			}
		}
		if (swaggerRoot.has("definitions")) {
			discoverDefinitions(swaggerRoot.get("definitions"), api, root, factory);
		}
		if (swaggerRoot.has("responses")) {
			discoverResponses(swaggerRoot.get("responses"), api, factory);
		}
		if (swaggerRoot.has("paths")) {
			discoverPaths(swaggerRoot.get("paths"), api, factory);
		}
		
		if (swaggerRoot.has("parameters")) {
			discoverParameters(swaggerRoot.get("parameters"), api, factory);
		}
		
		if (swaggerRoot.has("securityDefinitions")) {
			discoverSecurityDefinitions(swaggerRoot.get("securityDefinitions"), api, factory);
		}

//		if (swaggerRoot.has("security")) {
//			discoverSecurity(swaggerRoot.get("security"), api, factory);
//		}
		if (swaggerRoot.has("tags")) {
			discoverTags(swaggerRoot.get("tags"), api, factory);
		}
		if (swaggerRoot.has("externalDocs")) {
			ExternalDocs externalDocs = factory.createExternalDocs();
			api.setExternalDocs(externalDocs);
			discoverExternalDocs(swaggerRoot.get("externalDocs"), externalDocs);
		}
		return root;

	}

	private static void discoverTags(JsonElement jsonElement, API api, CoreFactory factory) {
		JsonArray tagArray = jsonElement.getAsJsonArray();
		for (JsonElement tagElement : tagArray) {
			Tag tag = factory.createTag();
			api.getTags().add(tag);
			discoverTag(tagElement, tag, factory);
		}

	}

	private static void discoverTag(JsonElement tagElement, Tag tag, CoreFactory factory) {
		JsonObject tagObject = tagElement.getAsJsonObject();
		if (tagObject.has("name"))
			tag.setName(tagObject.get("name").getAsString());
		if (tagObject.has("description"))
			tag.setDescription(tagObject.get("description").getAsString());
		if (tagObject.has("externalDocs")) {
			ExternalDocs externalDocs = factory.createExternalDocs();
			tag.setExternalDocs(externalDocs);
			discoverExternalDocs(tagObject.get("externalDocs"), externalDocs);
		}

	}

//	private static void discoverSecurity(JsonElement jsonElement, API api, CoreFactory factory) {
//		JsonArray securityArray = jsonElement.getAsJsonArray();
//		for (JsonElement securityElement : securityArray) {
//			SecurityRequirement security = factory.createSecurityScope();
//			api.getSecurityRequirement()
//			discoverSecurityRequirement(securityElement, security);
//		}
//
//	}

	private static void discoverParameters(JsonElement jsonElement, API api, CoreFactory factory) {
		JsonObject aPIParametersObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> aPIParameters = aPIParametersObject.entrySet();
		for (Entry<String, JsonElement> aPIParameterElement : aPIParameters) {
			Parameter aPIParameter = factory.createParameter();
			aPIParameter.setName(aPIParameterElement.getKey());
			api.getParameters().add(aPIParameter);
			discoverParameter(aPIParameterElement.getValue(), aPIParameter, factory);
		}

	}

	private static void discoverSecurityDefinitions(JsonElement jsonElement, API api, CoreFactory factory) {
		JsonObject securityDefinitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> securityDefinitions = securityDefinitionsObject.entrySet();
		for (Entry<String, JsonElement> securityDefinitionElement : securityDefinitions) {
			SecuritySchema securityDefinition = factory.createSecuritySchema();
			securityDefinition.setGlobalName(securityDefinitionElement.getKey());
			api.getSecurityDefinitions().add(securityDefinition);
			discoverSecuritySchema(securityDefinitionElement.getValue(), securityDefinition, factory);
		}

	}

	private static void discoverSecuritySchema(JsonElement jsonElement, SecuritySchema securitySchema,
			CoreFactory factory) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("type"))
			securitySchema.setType(SecuritySchemeType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("description"))
			securitySchema.setDescription(jsonObject.get("description").getAsString());
		if (jsonObject.has("name"))
			securitySchema.setName(jsonObject.get("name").getAsString());
		if (jsonObject.has("in"))
			securitySchema.setLocation(APIKeyLocation.get(jsonObject.get("in").getAsString()));
		if (jsonObject.has("flow"))
			securitySchema.setFlow(OAuth2FlowType.get(jsonObject.get("flow").getAsString()));
		if (jsonObject.has("authorizationUrl"))
			securitySchema.setAuthorizationUrl(jsonObject.get("authorizationUrl").getAsString());
		if (jsonObject.has("tokenUrl"))
			securitySchema.setTokenUrl(jsonObject.get("tokenUrl").getAsString());
		if (jsonObject.has("scopes")) {
			Set<Entry<String, JsonElement>> scopesElements = jsonObject.get("scopes").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> scopeElement : scopesElements) {
				SecurityScope scope = factory.createSecurityScope();
				securitySchema.getScopes().add(scope);

				scope.setName(scopeElement.getKey());

				scope.setDescription(scopeElement.getValue().getAsString());
			}
		}

	}

	private static void discoverResponses(JsonElement jsonElement, API api, CoreFactory factory) {
		JsonObject responsesObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> responses = responsesObject.entrySet();
		for (Entry<String, JsonElement> responseElement : responses) {
			Response response = factory.createResponse();
			response.setCode(responseElement.getKey());
			api.getResponses().add(response);
			discoverResponse(responseElement.getValue(), response, factory);
		}
	}

	private static void discoverDefinitions(JsonElement jsonElement, API api, Root root, CoreFactory factory) {
		JsonObject definitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> definitions = definitionsObject.entrySet();
		for (Entry<String, JsonElement> definitionElement : definitions) {
			Schema schema = factory.createSchema();
			schema.setName(definitionElement.getKey());
			root.getSchemas().add(schema);
			schema.setDeclaringContext(api);
			api.getDefinitions().add(schema);
			discoverSchema(definitionElement.getValue(), schema, factory);
		}
	}

	private static void discoverSchema(JsonElement jsonElement, Schema schema, CoreFactory factory) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
//		if (jsonObject.has("$ref"))
//			schema.setRef(jsonObject.get("$ref").getAsString());
		if (jsonObject.has("format"))
			schema.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("description"))
			schema.setDescription(jsonObject.get("description").getAsString());
		if (jsonObject.has("title"))
			schema.setTitle(jsonObject.get("title").getAsString());
		if (jsonObject.has("type"))
			schema.setType(core.JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("default"))
			schema.setDefault(jsonObject.get("default").toString());
		if (jsonObject.has("maximum"))
			schema.setMaximum(jsonObject.get("maximum").getAsDouble());
		if (jsonObject.has("exclusiveMaximum"))
			schema.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());
		if (jsonObject.has("minimum"))
			schema.setMinimum(jsonObject.get("minimum").getAsDouble());
		if (jsonObject.has("exclusiveMinimim"))
			schema.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
		if (jsonObject.has("maxLength"))
			schema.setMaxLength(jsonObject.get("maxLength").getAsInt());
		if (jsonObject.has("minLength"))
			schema.setMinLength(jsonObject.get("minLength").getAsInt());
		if (jsonObject.has("pattern"))
			schema.setPattern(jsonObject.get("pattern").getAsString());
		if (jsonObject.has("maxItems"))
			schema.setMaxItems(jsonObject.get("maxItems").getAsInt());
		if (jsonObject.has("minItems"))
			schema.setMinItems(jsonObject.get("minItems").getAsInt());
		if (jsonObject.has("uniqueItems"))
			schema.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
		if (jsonObject.has("enum")) {
			JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
			for (JsonElement item : enumItems)
				schema.getEnum().add(item.getAsString());
		}
		if (jsonObject.has("multipleOf"))
			schema.setMultipleOf(jsonObject.get("multipleOf").getAsInt());
		if (jsonObject.has("maxProperties"))
			schema.setMaxProperties(jsonObject.get("maxProperties").getAsInt());
		if (jsonObject.has("minProperties"))
			schema.setMinProperties(jsonObject.get("minProperties").getAsInt());
		if (jsonObject.has("required")) {
			for (JsonElement element : jsonObject.get("required").getAsJsonArray()) {
				schema.getRequired().add(element.getAsString());
			}
		}
		if (jsonObject.has("properties")) {
			Set<Entry<String, JsonElement>> properties = jsonObject.get("properties").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> jsonProperty : properties) {
				Schema property = factory.createSchema();
				property.setName(jsonProperty.getKey());
				schema.getProperties().add(property);
				discoverSchema(jsonProperty.getValue(), property, factory);
			}
		}
		if (jsonObject.has("additionalProperties")) {
			Schema property = factory.createSchema();
			schema.setAdditonalProperties(property);
			discoverSchema(jsonObject.get("additionalProperties"), property, factory);
		}
		if (jsonObject.has("allOf")) {
			JsonArray allOfArray = jsonObject.get("allOf").getAsJsonArray();
			for (JsonElement allOfElement : allOfArray) {
				Schema allOf = factory.createSchema();
				schema.getAllOf().add(allOf);
				discoverSchema(allOfElement, allOf, factory);
			}
		}
		if (jsonObject.has("items")) {

				if (jsonObject.get("items").isJsonObject()) {
				Schema item = factory.createSchema();
				schema.setItems(item);
				discoverSchema(jsonObject.get("items"), item, factory);
			}
		}
		if (jsonObject.has("discrimitaor")) {
			schema.setDiscriminator(jsonObject.get("discriminator").getAsString());
		}
		if (jsonObject.has("readOnly"))
			schema.setReadOnly(jsonObject.get("readOnly").getAsBoolean());
		if (jsonObject.has("xml")) {
			XMLElement xml = factory.createXMLElement();
			JsonObject xmlObject = jsonObject.get("xml").getAsJsonObject();
			if (xmlObject.has("name"))
				xml.setName(xmlObject.get("name").getAsString());
			if (xmlObject.has("namespace"))
				xml.setNamespace(xmlObject.get("namespace").getAsString());
			if (xmlObject.has("prefix"))
				xml.setPrefix(xmlObject.get("prefix").getAsString());
			if (xmlObject.has("attribute"))
				xml.setAttribute(xmlObject.get("attribute").getAsBoolean());
			if (xmlObject.has("wrapped"))
				xml.setWrapped(xmlObject.get("wrapped").getAsBoolean());
			schema.setXml(xml);
		}
		if (jsonObject.has("externalDocs")) {
			ExternalDocs externalDocs = factory.createExternalDocs();
			schema.setExternalDocs(externalDocs);
			discoverExternalDocs(jsonObject.get("externalDocs"), externalDocs);
		}
		if (jsonObject.has("example"))
			schema.setExample(jsonObject.get("example").toString());
	}

	private static void discoverPaths(JsonElement jsonElement, API api, CoreFactory factory) {
		JsonObject pathsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> paths = pathsObject.entrySet();
		for (Entry<String, JsonElement> pathElement : paths) {
			JsonObject pathObject = pathElement.getValue().getAsJsonObject();
			Path path = factory.createPath();
			api.getPaths().add(path);
			path.setPattern(pathElement.getKey());
//			if (pathObject.has("$ref")) {
//				path.setRef(pathObject.get("$ref").getAsString());
//			}
			if (pathObject.has("get")) {
			Operation getAPIOperation = factory.createOperation();
				path.setGet(getAPIOperation);
				discoverOperation(pathObject.get("get"), getAPIOperation, factory);
			}
			if (pathObject.has("put")) {
				Operation putAPIOperation = factory.createOperation();
				path.setPut(putAPIOperation);
				discoverOperation(pathObject.get("put"), putAPIOperation, factory);
			}
			if (pathObject.has("post")) {
				Operation aPIOperation = factory.createOperation();
				path.setPost(aPIOperation);
				discoverOperation(pathObject.get("post"), aPIOperation, factory);
			}
			if (pathObject.has("delete")) {
				Operation aPIOperation = factory.createOperation();
				path.setDelete(aPIOperation);
				discoverOperation(pathObject.get("delete"), aPIOperation, factory);
			}
			if (pathObject.has("options")) {
				Operation aPIOperation = factory.createOperation();
				path.setOptions(aPIOperation);
				discoverOperation(pathObject.get("options"), aPIOperation, factory);
			}
			if (pathObject.has("head")) {
				Operation aPIOperation = factory.createOperation();
				path.setHead(aPIOperation);
				discoverOperation(pathObject.get("head"), aPIOperation, factory);
			}
			if (pathObject.has("patch")) {
				Operation aPIOperation = factory.createOperation();
				path.setPatch(aPIOperation);
				discoverOperation(pathObject.get("patch"), aPIOperation, factory);
			}
			if (pathObject.has("parameters")) {
				JsonArray aPIParametersArray = pathObject.get("parameters").getAsJsonArray();
				for (JsonElement aPIParameterElement : aPIParametersArray) {
					Parameter aPIParameter = factory.createParameter();
					path.getParameters().add(aPIParameter);
					discoverParameter(aPIParameterElement, aPIParameter, factory);
				}
			}

		}

	}

	private static void discoverOperation(JsonElement jsonElement, Operation aPIOperation, CoreFactory factory) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("tags")) {
			JsonArray tagsArray = jsonObject.get("tags").getAsJsonArray();
			for (JsonElement tagElement : tagsArray)
				aPIOperation.getTagReferences().add(tagElement.getAsString());
		}
		if (jsonObject.has("summary"))
			aPIOperation.setSummary(jsonObject.get("summary").getAsString());

		if (jsonObject.has("description"))
			aPIOperation.setDescription(jsonObject.get("description").getAsString());
		if (jsonObject.has("externalDocs")) {
			ExternalDocs externalDocs = factory.createExternalDocs();
			aPIOperation.setExternalDocs(externalDocs);
			discoverExternalDocs(jsonObject.get("externalDocs"), externalDocs);
		}
		if (jsonObject.has("operationId"))
			aPIOperation.setOperationId(jsonObject.get("operationId").getAsString());

		if (jsonObject.has("consumes")) {
			JsonArray mimeArray = jsonObject.get("consumes").getAsJsonArray();
			for (JsonElement mimeType : mimeArray)
				aPIOperation.getConsumes().add(mimeType.getAsString());
		}
		if (jsonObject.has("produces")) {
			JsonArray mimeArray = jsonObject.get("produces").getAsJsonArray();
			for (JsonElement mimeType : mimeArray)
				aPIOperation.getProduces().add(mimeType.getAsString());
		}
		if (jsonObject.has("parameters")) {
			JsonArray aPIParameterArray = jsonObject.get("parameters").getAsJsonArray();
			for (JsonElement aPIParameterElement : aPIParameterArray) {
				Parameter aPIParameter = factory.createParameter();
				aPIOperation.getParameters().add(aPIParameter);
				discoverParameter(aPIParameterElement, aPIParameter, factory);
			}

		}
		if (jsonObject.has("responses")) {
			Set<Entry<String, JsonElement>> responses = jsonObject.get("responses").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> responseElement : responses) {
				Response response = factory.createResponse();
				aPIOperation.getResponses().add(response);
				response.setCode(responseElement.getKey());
				discoverResponse(responseElement.getValue(), response, factory);
			}
		}
		if (jsonObject.has("schemes")) {
			JsonArray schemeArray = jsonObject.get("schemes").getAsJsonArray();
			for (JsonElement schemeElement : schemeArray)
				aPIOperation.getSchemes().add(SchemeType.get(schemeElement.getAsString()));
		}
		if (jsonObject.has("deprecated")) {
			aPIOperation.setDeprecated(jsonObject.get("deprecated").getAsBoolean());
		}
		if (jsonObject.has("security")) {
			JsonArray securityArray = jsonObject.get("security").getAsJsonArray();
			for (JsonElement securityElement : securityArray) {
//				SecurityRequirement security = factory.createSecurityScope();
//				aPIOperation.getSecurity().add(security);
//				discoverSecurityRequirement(securityElement, security);

			}

		}
	}

	private static void discoverSecurityRequirement(JsonElement securityElement, SecurityRequirement security) {
		Set<Entry<String, JsonElement>> securityAttributes = securityElement.getAsJsonObject().entrySet();
		Entry<String, JsonElement> first = (Entry<String, JsonElement>) securityAttributes.toArray()[0];
		security.setName(first.getKey());
		for (JsonElement value : first.getValue().getAsJsonArray())
			security.getValues().add(value.getAsString());

	}

	private static void discoverResponse(JsonElement responseElement, Response response, CoreFactory factory) {
		JsonObject responseObject = responseElement.getAsJsonObject();
		if (responseObject.has("description"))
			response.setDescription(responseObject.get("description").getAsString());
		if (responseObject.has("schema")) {
			Schema responseSchema = factory.createSchema();
			response.setSchema(responseSchema);
			discoverSchema(responseObject.get("schema"), responseSchema, factory);
		}
		if (responseObject.has("headers")) {
			Set<Entry<String, JsonElement>> headers = responseObject.get("headers").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> headerEntry : headers) {
				Header header = factory.createHeader();
				header.setName(headerEntry.getKey());
				discoverHeader(headerEntry.getValue(), header, factory);
			}
		}
		if (responseObject.has("example")) {
			Set<Entry<String, JsonElement>> examples = responseObject.get("example").getAsJsonObject().entrySet();

			for (Entry<String, JsonElement> exampleEntry : examples) {
				Example example = factory.createExample();
				example.setMimeType(exampleEntry.getKey());
				example.setValue(exampleEntry.getValue().toString());
				response.getExamples().add(example);
			}

		}

	}

	private static void discoverHeader(JsonElement jsonElement, Header header, CoreFactory factory) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();

		if (jsonObject.has("description"))
			header.setDescription(jsonObject.get("description").getAsString());

		if (jsonObject.has("type"))
			header.setType(core.JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			header.setFormat(jsonObject.get("format").getAsString());

		if (jsonObject.has("items")) {
			ItemsDefinition items = factory.createItemsDefinition();
			header.setItems(items);
			discoverItems(jsonObject.get("items"), items, factory);
		}
		if (jsonObject.has("collectionFormat"))
			header.setCollectionFormat(core.CollectionFormat.get(jsonObject.get("collectionFormat").getAsString()));
		if (jsonObject.has("default"))
			header.setDefault(jsonObject.get("default").toString());
		if (jsonObject.has("maximum"))
			header.setMaximum(jsonObject.get("maximum").getAsDouble());
		if (jsonObject.has("exclusiveMaximum"))
			header.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());//to fix 
		if (jsonObject.has("minimum"))
			header.setMinimum(jsonObject.get("minimum").getAsDouble());
		if (jsonObject.has("exclusiveMinimim"))
			header.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
		if (jsonObject.has("maxLength"))
			header.setMaxLength(jsonObject.get("maxLength").getAsInt());
		if (jsonObject.has("minLength"))
			header.setMinLength(jsonObject.get("minLength").getAsInt());
		if (jsonObject.has("pattern"))
			header.setPattern(jsonObject.get("pattern").getAsString());
		if (jsonObject.has("maxItems"))
			header.setMaxItems(jsonObject.get("maxItems").getAsInt());
		if (jsonObject.has("minItems"))
			header.setMinItems(jsonObject.get("minItems").getAsInt());
		if (jsonObject.has("uniqueItems"))
			header.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
		if (jsonObject.has("enum")) {
			JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
			for (JsonElement item : enumItems)
				header.getEnum().add(item.getAsString());
		}
		if (jsonObject.has("multipleOf"))
			header.setMultipleOf(jsonObject.get("multipleOf").getAsInt());

	}

	private static void discoverParameter(JsonElement aPIParameterElement,Parameter aPIParameter, CoreFactory factory) {
		JsonObject jsonObject = aPIParameterElement.getAsJsonObject();
		if (jsonObject.has("name"))
			aPIParameter.setName(jsonObject.get("name").getAsString());

		if (jsonObject.has("in")){
			aPIParameter.setLocation(ParameterLocation.get(jsonObject.get("in").getAsString()));
		}
		if (jsonObject.has("description"))
			aPIParameter.setDescription(jsonObject.get("description").getAsString());
		if (jsonObject.has("required"))
			aPIParameter.setRequired(jsonObject.get("required").getAsBoolean());
		if (jsonObject.has("schema")) {
			Schema schema = factory.createSchema();
			aPIParameter.setSchema(schema);
			discoverSchema(jsonObject.get("schema"), schema, factory);
		}
		if (jsonObject.has("type"))
			aPIParameter.setType(core.JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			aPIParameter.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("allowEmptyValue")) {
			aPIParameter.setAllowEmplyValue(jsonObject.get("allowEmptyValue").getAsBoolean());
			if (jsonObject.has("items")) {
				ItemsDefinition items = factory.createItemsDefinition();
				aPIParameter.setItems(items);
				discoverItems(jsonObject.get("items"), items, factory);
			}
			if (jsonObject.has("collectionFormat"))
				aPIParameter.setCollectionFormat(core.CollectionFormat.get(jsonObject.get("collectionFormat").getAsString()));
			if (jsonObject.has("default"))
				aPIParameter.setDefault(jsonObject.get("default").toString());
			if (jsonObject.has("maximum"))
				aPIParameter.setMaximum(jsonObject.get("maximum").getAsDouble());
			if (jsonObject.has("exclusiveMaximum"))
				aPIParameter.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());
			if (jsonObject.has("minimum"))
				aPIParameter.setMinimum(jsonObject.get("minimum").getAsDouble());
			if (jsonObject.has("exclusiveMinimim"))
				aPIParameter.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
			if (jsonObject.has("maxLength"))
				aPIParameter.setMaxLength(jsonObject.get("maxLength").getAsInt());
			if (jsonObject.has("minLength"))
				aPIParameter.setMinLength(jsonObject.get("minLength").getAsInt());
			if (jsonObject.has("pattern"))
				aPIParameter.setPattern(jsonObject.get("pattern").getAsString());
			if (jsonObject.has("maxItems"))
				aPIParameter.setMaxItems(jsonObject.get("maxItems").getAsInt());
			if (jsonObject.has("minItems"))
				aPIParameter.setMinItems(jsonObject.get("minItems").getAsInt());
			if (jsonObject.has("uniqueItems"))
				aPIParameter.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
			if (jsonObject.has("enum")) {
				JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
				for (JsonElement item : enumItems)
					aPIParameter.getEnum().add(item.getAsString());
			}
			if (jsonObject.has("multipleOf"))
				aPIParameter.setMultipleOf(jsonObject.get("multipleOf").getAsInt());

		}
	}

	private static void discoverItems(JsonElement jsonElement, ItemsDefinition items, CoreFactory factory) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("type"))
			items.setType(core.JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			items.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("items")) {
			ItemsDefinition innerItmes = factory.createItemsDefinition();
			items.setItems(innerItmes);
			discoverItems(jsonObject.get("items"), innerItmes, factory);
		}
		if (jsonObject.has("collectionFormat"))
			items.setCollectionFormat(core.CollectionFormat.get(jsonObject.get("collectionFormat").getAsString()));
		if (jsonObject.has("default"))
			items.setDefault(jsonObject.get("default").toString());
		if (jsonObject.has("maximum"))
			items.setMaximum(jsonObject.get("maximum").getAsDouble());
		if (jsonObject.has("exclusiveMaximum"))
			items.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());
		if (jsonObject.has("minimum"))
			items.setMinimum(jsonObject.get("minimum").getAsDouble());
		if (jsonObject.has("exclusiveMinimim"))
			items.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
		if (jsonObject.has("maxLength"))
			items.setMaxLength(jsonObject.get("maxLength").getAsInt());
		if (jsonObject.has("minLength"))
			items.setMinLength(jsonObject.get("minLength").getAsInt());
		if (jsonObject.has("pattern"))
			items.setPattern(jsonObject.get("pattern").getAsString());
		if (jsonObject.has("maxItems"))
			items.setMaxItems(jsonObject.get("maxItems").getAsInt());
		if (jsonObject.has("minItems"))
			items.setMinItems(jsonObject.get("minItems").getAsInt());
		if (jsonObject.has("uniqueItems"))
			items.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
		if (jsonObject.has("enum")) {
			JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
			for (JsonElement item : enumItems)
				items.getEnum().add(item.getAsString());
		}
		if (jsonObject.has("multipleOf"))
			items.setMultipleOf(jsonObject.get("multipleOf").getAsInt());
	}

	private static void discoverExternalDocs(JsonElement jsonElement, ExternalDocs externalDocs) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("description"))
			externalDocs.setDescription(jsonObject.get("description").getAsString());

		if (jsonObject.has("url"))
			externalDocs.setUrl(jsonObject.get("url").getAsString());

	}

	private static void discoverInfo(JsonElement jsonElement, Info info, CoreFactory factory) {
		JsonObject infoObject = jsonElement.getAsJsonObject();
		if (infoObject.has("title")) {
			info.setTitle(infoObject.get("title").getAsString());
		}
		if (infoObject.has("description"))
			info.setDescription(infoObject.get("description").getAsString());
		if (infoObject.has("termsOfServices"))
			info.setTermsOfServices(infoObject.get("termsOfService").getAsString());
		if (infoObject.has("contact"))
			discoverContact(infoObject.get("contact"), factory, info);
		if (infoObject.has("license"))
			discoverLicense(infoObject.get("license"), factory, info);
		if (infoObject.has("version"))
			info.setVersion(infoObject.get("version").getAsString());

	}

	private static void discoverLicense(JsonElement jsonElement, CoreFactory factory, Info info) {
		JsonObject licenseObject = jsonElement.getAsJsonObject();
		License license = factory.createLicense();
		info.setLicense(license);
		if (licenseObject.has("name"))
			license.setName(licenseObject.get("name").getAsString());
		if (licenseObject.has("url"))
			license.setUrl(licenseObject.get("url").getAsString());
	}

	private static void discoverContact(JsonElement jsonElement, CoreFactory factory, Info info) {
		JsonObject contactObject = jsonElement.getAsJsonObject();
		Contact contact = factory.createContact();
		info.setContact(contact);
		if (contactObject.has("name"))
			contact.setName(contactObject.get("name").getAsString());
		if (contactObject.has("url"))
			contact.setUrl(contactObject.get("url").getAsString());
		if (contactObject.has("email"))
			contact.setEmail(contactObject.get("email").getAsString());

	}

	public static void saveModel(Root api, String modelName, String location) throws FileNotFoundException {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(location + File.separator + modelName + ".xmi"));
		resource.getContents().add(api);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Schema getSchemaByPathReference(String ref, API api){
		List<Schema> schemas = api.getDefinitions();
		for(Schema schema : schemas){
			if(schema.getRef().equalsIgnoreCase(ref))
				return schema;
		}
		return null;
	}
	public static List<Operation> getAllOperations(Root apiRoot){
		TreeIterator<EObject> allElements = apiRoot.eAllContents();
		List<Operation> allOperations = new ArrayList<>();
		while(allElements.hasNext()){
			EObject object = allElements.next();
			if(object instanceof Operation){
				allOperations.add((Operation) object);
			}
		}
		return allOperations;
	}

	public static Operation getOperationById(Root apiRoot, String operationId) {
		List<Operation> allOperations = getAllOperations(apiRoot);
		for(Operation operation: allOperations){
			if(operation.getOperationId().equals(operationId))
				return operation;
		}
		return null;
	}

	public static String getPathFromOperation(Operation operation){
		return ((API)operation.getPath().eContainer()).getHost()+ ((API)operation.getPath().eContainer()).getBasePath() + operation.getPath().getPattern();
		
	
	}
	
}
