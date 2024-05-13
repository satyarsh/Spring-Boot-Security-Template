package demo.springapp5.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import demo.springapp5.model.personModel;
import demo.springapp5.repository.personRepository;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
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

	@PostMapping("/person/save")
	public ModelAndView postPerson(@Valid ModelMap model,
			BindingResult bindingResult,
			@RequestParam(name = "firstname") String name,
			@RequestParam(name = "lastname") String lastname,
			@RequestParam(name = "phone") String phoneNumber,
			@RequestParam(name = "email") String email) {

		log.info("----------- " + name +
				" " +
				lastname +
				" " +
				phoneNumber +
				" " +
				email +
				" -------------");

		if (bindingResult.hasErrors()) {
			throw new ValidationException(
					bindingResult
							.getAllErrors()
							.stream()
							.map((event) -> event.getDefaultMessage()).collect(Collectors.toList()).toString());
		} else {
			repository.save(personModel.builder()
					.firstname(name)
					.lastname(lastname)
					.email(email)
					.phoneNumber(phoneNumber)
					.build());

			/*
			 * https://www.baeldung.com/spring-redirect-and-forward
			 */
			model.addAttribute("attribute", "redirectWithRedirectPrefix");

			return new ModelAndView("redirect:/success.html", model);
		}

	}

	@GetMapping("/person")
	public List<personModel> getPerson() {
		log.info("-------- im a logger and /person is hit--------");
		return repository.findAll();

	}

	@PostMapping("/testpost")
	public String postMethodName(@RequestBody String entity) {
		return entity.toString();
	}

}
