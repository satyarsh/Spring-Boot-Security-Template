package demo.springapp5.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.springapp5.service.JsonPlaceHolderService;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class JsonPlaceHolderController {

	private final JsonPlaceHolderService service;

	JsonPlaceHolderController(JsonPlaceHolderService service) {
		this.service = service;
	}
	
	// Returns Json from the https://jsonplaceholder.typicode.com
	@GetMapping("/placeholderjson")
	public JsonNode findall() throws IOException {
		return service.getJSON();
	}
	
}
