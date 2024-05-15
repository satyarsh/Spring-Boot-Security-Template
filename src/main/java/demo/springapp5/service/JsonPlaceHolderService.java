package demo.springapp5.service;

import java.io.IOException;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JsonPlaceHolderService {

    	/*
	 * Fetchs the JSON from the jsonplaceholder.typicode.com And Returns a JsonNode to
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
