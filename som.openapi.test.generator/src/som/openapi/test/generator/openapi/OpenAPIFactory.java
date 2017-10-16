package som.openapi.test.generator.openapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.Map.Entry;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import core.API;
import core.APIKeyLocation;
import core.Contact;
import core.CoreFactory;
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

public class OpenAPIFactory {
	CoreFactory coreFactory;

	public OpenAPIFactory() {
		coreFactory = CoreFactory.eINSTANCE;
	}
	public Root createOpenAPIModelFromJson(File jsonFile) throws FileNotFoundException, UnsupportedEncodingException {
		   InputStream in = new FileInputStream(jsonFile);
	        Reader reader = new InputStreamReader(in, "UTF-8");
			JsonParser parser = new JsonParser();
			JsonElement jsonElement =  parser.parse(reader);
		
		return createOpenAPIModelFromJson(jsonElement.getAsJsonObject());
		
	}
	public Root createOpenAPIModelFromJson(JsonObject jsonObject) {

		Root root = coreFactory.createRoot();
		API api = coreFactory.createAPI();
		root.setApi(api);
		if (jsonObject.has("swagger"))
			api.setSwagger(jsonObject.get("swagger").getAsString());
		if (jsonObject.has("info")) {
			Info info = coreFactory.createInfo();
			api.setInfo(info);
			discoverInfo(jsonObject.get("info"), info);
		}
		if (jsonObject.has("host"))
			api.setHost(jsonObject.get("host").getAsString());

		if (jsonObject.has("basePath"))
			api.setBasePath(jsonObject.get("basePath").getAsString());
		if (jsonObject.has("schemes")) {
			JsonArray schemes = jsonObject.get("schemes").getAsJsonArray();
			for (JsonElement scheme : schemes) {
				api.getSchemes().add(SchemeType.get(scheme.getAsString()));
			}
		}
		if (jsonObject.has("consumes")) {
			JsonArray mimeTypes = jsonObject.get("consumes").getAsJsonArray();
			for (JsonElement mimeType : mimeTypes) {
				api.getConsumes().add(mimeType.getAsString());
			}
		}

		if (jsonObject.has("produces")) {
			JsonArray mimeTypes = jsonObject.get("produces").getAsJsonArray();
			for (JsonElement mimeType : mimeTypes) {
				api.getProduces().add(mimeType.getAsString());
			}
		}
		if (jsonObject.has("definitions")) {
			discoverDefinitions(jsonObject.get("definitions"), root);
		}
		if (jsonObject.has("responses")) {
			discoverResponses(jsonObject.get("responses"), root);
		}
		if (jsonObject.has("paths")) {
			discoverPaths(jsonObject.get("paths"), root);
		}
		
		if (jsonObject.has("parameters")) {
			discoverParameters(jsonObject.get("parameters"), root);
		}
		
		if (jsonObject.has("securityDefinitions")) {
			discoverSecurityDefinitions(jsonObject.get("securityDefinitions"), root);
		}

//		if (swaggerRoot.has("security")) {
//			discoverSecurity(swaggerRoot.get("security"), api, factory);
//		}
		if (jsonObject.has("tags")) {
			discoverTags(jsonObject.get("tags"), root);
		}
		if (jsonObject.has("externalDocs")) {
			ExternalDocs externalDocs = coreFactory.createExternalDocs();
			api.setExternalDocs(externalDocs);
			discoverExternalDocs(jsonObject.get("externalDocs"), externalDocs);
		}
		return root;

	}

	private  void discoverTags(JsonElement jsonElement, Root root) {
		JsonArray tagArray = jsonElement.getAsJsonArray();
		for (JsonElement tagElement : tagArray) {
			Tag tag = coreFactory.createTag();
			root.getApi().getTags().add(tag);
			discoverTag(tagElement, tag);
		}

	}

	private  void discoverTag(JsonElement tagElement, Tag tag) {
		JsonObject tagObject = tagElement.getAsJsonObject();
		if (tagObject.has("name"))
			tag.setName(tagObject.get("name").getAsString());
		if (tagObject.has("description"))
			tag.setDescription(tagObject.get("description").getAsString());
		if (tagObject.has("externalDocs")) {
			ExternalDocs externalDocs = coreFactory.createExternalDocs();
			tag.setExternalDocs(externalDocs);
			discoverExternalDocs(tagObject.get("externalDocs"), externalDocs);
		}

	}

//	private  void discoverSecurity(JsonElement jsonElement, API api, CoreFactory factory) {
//		JsonArray securityArray = jsonElement.getAsJsonArray();
//		for (JsonElement securityElement : securityArray) {
//			SecurityRequirement security = factory.createSecurityScope();
//			api.getSecurityRequirement()
//			discoverSecurityRequirement(securityElement, security);
//		}
//
//	}

	private  void discoverParameters(JsonElement jsonElement, Root root) {
		JsonObject aPIParametersObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> aPIParameters = aPIParametersObject.entrySet();
		for (Entry<String, JsonElement> aPIParameterElement : aPIParameters) {
			Parameter aPIParameter = coreFactory.createParameter();
			aPIParameter.setName(aPIParameterElement.getKey());
			root.getApi().getParameters().add(aPIParameter);
			root.getParamters().add(aPIParameter);
			discoverParameter(aPIParameterElement.getValue(), aPIParameter, root);
		}

	}

	private  void discoverSecurityDefinitions(JsonElement jsonElement, Root root) {
		JsonObject securityDefinitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> securityDefinitions = securityDefinitionsObject.entrySet();
		for (Entry<String, JsonElement> securityDefinitionElement : securityDefinitions) {
			SecuritySchema securityDefinition = coreFactory.createSecuritySchema();
			securityDefinition.setGlobalName(securityDefinitionElement.getKey());
			root.getApi().getSecurityDefinitions().add(securityDefinition);
			discoverSecuritySchema(securityDefinitionElement.getValue(), securityDefinition);
		}

	}

	private  void discoverSecuritySchema(JsonElement jsonElement, SecuritySchema securitySchema) {
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
				SecurityScope scope = coreFactory.createSecurityScope();
				securitySchema.getScopes().add(scope);

				scope.setName(scopeElement.getKey());

				scope.setDescription(scopeElement.getValue().getAsString());
			}
		}

	}

	private  void discoverResponses(JsonElement jsonElement, Root root) {
		JsonObject responsesObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> responses = responsesObject.entrySet();
		for (Entry<String, JsonElement> responseElement : responses) {
			Response response = coreFactory.createResponse();
			response.setCode(responseElement.getKey());
			root.getApi().getResponses().add(response);
			discoverResponse(responseElement.getValue(), response, root);
		}
	}

	private  void discoverDefinitions(JsonElement jsonElement, Root root) {
		JsonObject definitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> definitions = definitionsObject.entrySet();
		for (Entry<String, JsonElement> definitionElement : definitions) {
			Schema schema = coreFactory.createSchema();
			schema.setName(definitionElement.getKey());
			root.getSchemas().add(schema);
			schema.setDeclaringContext(root.getApi());
			root.getApi().getDefinitions().add(schema);
			discoverSchema(definitionElement.getValue(), schema, root);
		}
	}

	private  void discoverSchema(JsonElement jsonElement, Schema schema,  Root root) {
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
	
		if (jsonObject.has("properties")) {
			Set<Entry<String, JsonElement>> properties = jsonObject.get("properties").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> jsonProperty : properties) {
				Schema property = coreFactory.createSchema();
				property.setName(jsonProperty.getKey());
				JsonObject value = jsonProperty.getValue().getAsJsonObject();
				if(value.has("#ref")) {
					String ref = value.get("#ref").getAsString();
					
				}
				schema.getProperties().add(property);
				property.setDeclaringContext(schema);
				root.getSchemas().add(property);
				property.setDeclaringContext(schema);
				discoverSchema(jsonProperty.getValue(), property, root);
			}
		}
		if (jsonObject.has("additionalProperties")) {
			Schema property = coreFactory.createSchema();
			schema.setAdditonalProperties(property);
			root.getSchemas().add(property);
			discoverSchema(jsonObject.get("additionalProperties"), property, root);
		}
		if (jsonObject.has("allOf")) {
			JsonArray allOfArray = jsonObject.get("allOf").getAsJsonArray();
			for (JsonElement allOfElement : allOfArray) {
				Schema allOf = coreFactory.createSchema();
				schema.getAllOf().add(allOf);
				root.getSchemas().add(allOf);
				discoverSchema(allOfElement, allOf, root);
			}
		}
		if (jsonObject.has("items")) {

				if (jsonObject.get("items").isJsonObject()) {
				Schema item = coreFactory.createSchema();
				schema.setItems(item);
				root.getSchemas().add(item);
				discoverSchema(jsonObject.get("items"), item, root);
			}
		}
		if (jsonObject.has("discrimitaor")) {
			schema.setDiscriminator(jsonObject.get("discriminator").getAsString());
		}
		if (jsonObject.has("readOnly"))
			schema.setReadOnly(jsonObject.get("readOnly").getAsBoolean());
		if (jsonObject.has("xml")) {
			XMLElement xml = coreFactory.createXMLElement();
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
			ExternalDocs externalDocs = coreFactory.createExternalDocs();
			schema.setExternalDocs(externalDocs);
			discoverExternalDocs(jsonObject.get("externalDocs"), externalDocs);
		}
		if (jsonObject.has("example"))
			schema.setExample(jsonObject.get("example").toString());
		if (jsonObject.has("required")) {
			for (JsonElement element : jsonObject.get("required").getAsJsonArray()) {
				//schema.getRequired().add(element.getAsString());
				// TODO 
			}
		}
	}

	private  void discoverPaths(JsonElement jsonElement, Root root) {
		JsonObject pathsObject = jsonElement.getAsJsonObject();
		Set<Entry<String, JsonElement>> paths = pathsObject.entrySet();
		for (Entry<String, JsonElement> pathElement : paths) {
			JsonObject pathObject = pathElement.getValue().getAsJsonObject();
			Path path = coreFactory.createPath();
			root.getApi().getPaths().add(path);
			path.setPattern(pathElement.getKey());
//			if (pathObject.has("$ref")) {
//				path.setRef(pathObject.get("$ref").getAsString());
//			}
			if (pathObject.has("get")) {
			Operation getAPIOperation = coreFactory.createOperation();
				path.setGet(getAPIOperation);
				discoverOperation(pathObject.get("get"), getAPIOperation, root);
			}
			if (pathObject.has("put")) {
				Operation putAPIOperation = coreFactory.createOperation();
				path.setPut(putAPIOperation);
				discoverOperation(pathObject.get("put"), putAPIOperation, root);
			}
			if (pathObject.has("post")) {
				Operation aPIOperation = coreFactory.createOperation();
				path.setPost(aPIOperation);
				discoverOperation(pathObject.get("post"), aPIOperation, root);
			}
			if (pathObject.has("delete")) {
				Operation aPIOperation = coreFactory.createOperation();
				path.setDelete(aPIOperation);
				discoverOperation(pathObject.get("delete"), aPIOperation, root);
			}
			if (pathObject.has("options")) {
				Operation aPIOperation = coreFactory.createOperation();
				path.setOptions(aPIOperation);
				discoverOperation(pathObject.get("options"), aPIOperation, root);
			}
			if (pathObject.has("head")) {
				Operation aPIOperation = coreFactory.createOperation();
				path.setHead(aPIOperation);
				discoverOperation(pathObject.get("head"), aPIOperation, root);
			}
			if (pathObject.has("patch")) {
				Operation aPIOperation = coreFactory.createOperation();
				path.setPatch(aPIOperation);
				discoverOperation(pathObject.get("patch"), aPIOperation, root);
			}
			if (pathObject.has("parameters")) {
				JsonArray aPIParametersArray = pathObject.get("parameters").getAsJsonArray();
				for (JsonElement aPIParameterElement : aPIParametersArray) {
					Parameter aPIParameter = coreFactory.createParameter();
					path.getParameters().add(aPIParameter);
					discoverParameter(aPIParameterElement, aPIParameter, root);
				}
			}

		}

	}

	private  void discoverOperation(JsonElement jsonElement, Operation aPIOperation, Root root) {
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
			ExternalDocs externalDocs = coreFactory.createExternalDocs();
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
				Parameter aPIParameter = coreFactory.createParameter();
				aPIOperation.getParameters().add(aPIParameter);
				root.getParamters().add(aPIParameter);
				discoverParameter(aPIParameterElement, aPIParameter, root);
			}

		}
		if (jsonObject.has("responses")) {
			Set<Entry<String, JsonElement>> responses = jsonObject.get("responses").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> responseElement : responses) {
				Response response = coreFactory.createResponse();
				aPIOperation.getResponses().add(response);
				root.getResponses().add(response);
				response.setCode(responseElement.getKey());
				discoverResponse(responseElement.getValue(), response, root);
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

	private  void discoverSecurityRequirement(JsonElement securityElement, SecurityRequirement security) {
		Set<Entry<String, JsonElement>> securityAttributes = securityElement.getAsJsonObject().entrySet();
		Entry<String, JsonElement> first = (Entry<String, JsonElement>) securityAttributes.toArray()[0];
		security.setName(first.getKey());
		for (JsonElement value : first.getValue().getAsJsonArray())
			security.getValues().add(value.getAsString());

	}

	private  void discoverResponse(JsonElement responseElement, Response response, Root root) {
		JsonObject responseObject = responseElement.getAsJsonObject();
		if (responseObject.has("description"))
			response.setDescription(responseObject.get("description").getAsString());
		if (responseObject.has("schema")) {
			Schema responseSchema = coreFactory.createSchema();
			response.setSchema(responseSchema);
			root.getSchemas().add(responseSchema);
			discoverSchema(responseObject.get("schema"), responseSchema, root);
		}
		if (responseObject.has("headers")) {
			Set<Entry<String, JsonElement>> headers = responseObject.get("headers").getAsJsonObject().entrySet();
			for (Entry<String, JsonElement> headerEntry : headers) {
				Header header = coreFactory.createHeader();
				header.setName(headerEntry.getKey());
				discoverHeader(headerEntry.getValue(), header);
			}
		}
		if (responseObject.has("example")) {
			Set<Entry<String, JsonElement>> examples = responseObject.get("example").getAsJsonObject().entrySet();

			for (Entry<String, JsonElement> exampleEntry : examples) {
				Example example = coreFactory.createExample();
				example.setMimeType(exampleEntry.getKey());
				example.setValue(exampleEntry.getValue().toString());
				response.getExamples().add(example);
			}

		}

	}

	private  void discoverHeader(JsonElement jsonElement, Header header) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();

		if (jsonObject.has("description"))
			header.setDescription(jsonObject.get("description").getAsString());

		if (jsonObject.has("type"))
			header.setType(core.JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			header.setFormat(jsonObject.get("format").getAsString());

		if (jsonObject.has("items")) {
			ItemsDefinition items = coreFactory.createItemsDefinition();
			header.setItems(items);
			discoverItems(jsonObject.get("items"), items);
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

	private  void discoverParameter(JsonElement aPIParameterElement,Parameter aPIParameter, Root root) {
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
			Schema schema = coreFactory.createSchema();
			aPIParameter.setSchema(schema);
			root.getSchemas().add(schema);
			discoverSchema(jsonObject.get("schema"), schema, root);
		}
		if (jsonObject.has("type"))
			aPIParameter.setType(core.JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			aPIParameter.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("allowEmptyValue")) {
			aPIParameter.setAllowEmplyValue(jsonObject.get("allowEmptyValue").getAsBoolean());
			if (jsonObject.has("items")) {
				ItemsDefinition items = coreFactory.createItemsDefinition();
				aPIParameter.setItems(items);
				discoverItems(jsonObject.get("items"), items);
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

	private  void discoverItems(JsonElement jsonElement, ItemsDefinition items) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("type"))
			items.setType(core.JSONDataType.get(jsonObject.get("type").getAsString()));
		if (jsonObject.has("format"))
			items.setFormat(jsonObject.get("format").getAsString());
		if (jsonObject.has("items")) {
			ItemsDefinition innerItmes = coreFactory.createItemsDefinition();
			items.setItems(innerItmes);
			discoverItems(jsonObject.get("items"), innerItmes);
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

	private  void discoverExternalDocs(JsonElement jsonElement, ExternalDocs externalDocs) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if (jsonObject.has("description"))
			externalDocs.setDescription(jsonObject.get("description").getAsString());

		if (jsonObject.has("url"))
			externalDocs.setUrl(jsonObject.get("url").getAsString());

	}

	private  void discoverInfo(JsonElement jsonElement, Info info) {
		JsonObject infoObject = jsonElement.getAsJsonObject();
		if (infoObject.has("title")) {
			info.setTitle(infoObject.get("title").getAsString());
		}
		if (infoObject.has("description"))
			info.setDescription(infoObject.get("description").getAsString());
		if (infoObject.has("termsOfServices"))
			info.setTermsOfServices(infoObject.get("termsOfService").getAsString());
		if (infoObject.has("contact"))
			discoverContact(infoObject.get("contact"), info);
		if (infoObject.has("license"))
			discoverLicense(infoObject.get("license"), info);
		if (infoObject.has("version"))
			info.setVersion(infoObject.get("version").getAsString());

	}

	private  void discoverLicense(JsonElement jsonElement, Info info) {
		JsonObject licenseObject = jsonElement.getAsJsonObject();
		License license = coreFactory.createLicense();
		info.setLicense(license);
		if (licenseObject.has("name"))
			license.setName(licenseObject.get("name").getAsString());
		if (licenseObject.has("url"))
			license.setUrl(licenseObject.get("url").getAsString());
	}

	private  void discoverContact(JsonElement jsonElement, Info info) {
		JsonObject contactObject = jsonElement.getAsJsonObject();
		Contact contact = coreFactory.createContact();
		info.setContact(contact);
		if (contactObject.has("name"))
			contact.setName(contactObject.get("name").getAsString());
		if (contactObject.has("url"))
			contact.setUrl(contactObject.get("url").getAsString());
		if (contactObject.has("email"))
			contact.setEmail(contactObject.get("email").getAsString());

	}
	public Root createOpenAPIModelFromYaml() {
		return null;
		
	}

}
