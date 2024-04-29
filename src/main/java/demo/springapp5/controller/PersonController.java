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

	@GetMapping("/person")
	public List<personModel> getPerson() {

		log.info("-------- im a logger and /person is hit--------");

		repository.save(personModel.builder()
		.firstname("Jason")
		.lastname("M")
		.build());

		repository.save(personModel.builder()
		.firstname("Chris")
		.lastname("T")
		.build());

		repository.save(personModel.builder()
		.firstname("Nergal")
		.lastname("M")
		.build());

		return repository.findAll();

	}

}
