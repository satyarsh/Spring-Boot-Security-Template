package demo.springapp5.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.springapp5.model.JsonPlaceHolderModel;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class JsonPlaceHolderController {

	private final JsonPlaceHolderModel JPM;

	JsonPlaceHolderController(JsonPlaceHolderModel JPM) {
		this.JPM = JPM;
	}
	
	// Returns Json from the https://jsonplaceholder.typicode.com
	@GetMapping("/placeholderjson")
	public JsonNode findall() throws IOException {
		return JPM.getJSON();
	}
}
