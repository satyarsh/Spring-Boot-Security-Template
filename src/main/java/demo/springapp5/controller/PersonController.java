package demo.springapp5.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.springapp5.model.personModel;
import demo.springapp5.repository.personRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@Slf4j
@RestController
public class PersonController {

	private personModel personmodel;

	private personRepository repository;

	public PersonController(personRepository repository, personModel personModel) {
		this.personmodel = personModel;
		this.repository = repository;
	}

	@PostMapping("/person")
	public String postPerson(@RequestBody String entity) {
		return entity;
	}
	
	@GetMapping("/person")
	public List<personModel> getPerson() {

		log.info("-------- im a logger and /person is hit--------");

		repository.save(personModel.builder()
		.firstname("Jason")
		.lastname("M")
		.email("email@gmail.com")
		.phoneNumber("888777999222")
		.build());

		return repository.findAll();

	}

	@GetMapping("/POST")
	public String PostFormPage(@RequestParam String param) {
		return "POST";
	}
	

}
