package demo.springapp5.model;

import java.io.IOException;
import java.net.URL;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonPlaceHolderModel {

	/*
	 * Fetchs the JSON from the jsonplaceholder.typicode.com And Returns a String to
	 * be Used in Other Controllers
	 */

	/*--- https://www.baeldung.com/java-read-json-from-url ---*/
	
	/*
	 * ObjectMapper objectMapper = new ObjectMapper(); String person_json =
	 * objectMapper.writeValueAsString(json); return person_json;
	 */

	public JsonNode ProcessJSON(URL url) throws IOException {
	    ObjectMapper mapper = new ObjectMapper();
	    JsonNode jsonNode = mapper.readTree(url);
	    return jsonNode;
	}

	public JsonNode getJSON() throws IOException {
		/* https://www.baeldung.com/java-url */
		URL JsonPlaceHolderURL = new URL("https://jsonplaceholder.typicode.com/todos");
		return ProcessJSON(JsonPlaceHolderURL);
	}

}
