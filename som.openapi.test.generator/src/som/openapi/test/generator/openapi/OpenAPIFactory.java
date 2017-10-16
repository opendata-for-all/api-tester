package som.openapi.test.generator.openapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import core.CoreFactory;
import core.Root;

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
		return null;
		
	}
	public Root createOpenAPIModelFromYaml() {
		return null;
		
	}

}
