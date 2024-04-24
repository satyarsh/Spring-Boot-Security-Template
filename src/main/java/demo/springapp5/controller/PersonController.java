package demo.springapp5.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.springapp5.model.personModel;
import demo.springapp5.repository.personRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class PersonController {

	private personModel personmodel;

	private personRepository repository;

	public PersonController(personRepository repository, personModel personModel) {
		this.personmodel = personModel;
		this.repository = repository;
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World From a Returned String";
	}

	@GetMapping("/json")
	public List<String> helloJSON() {
		return List.of("Hello", "world");
	}

	@GetMapping("/person")
	public List<personModel> getPerson() {

		log.info("-------- im a logger and /person is hit--------");

		// THIS IS BROKEN FOR NOW!
		repository.save(personmodel.builder()
		.firstname("Ali")
		.lastname("Jafari")
		.build());

		repository.save(personmodel.builder()
		.firstname("Ali")
		.lastname("Asghari")
		.build());

		repository.save(personmodel.builder()
		.firstname("Ahmad")
		.lastname("Asghari")
		.build());

		return repository.findAll();

	}

}
