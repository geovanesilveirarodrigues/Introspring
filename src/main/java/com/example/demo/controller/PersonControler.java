package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonControler {
	@Autowired
	private PersonService personService;

	@GetMapping
	public List<Person> findAll() {
		return personService.findAll();
	}

	@GetMapping("/{emaill}")
	public Person findOne(@PathVariable String emaill) {
		return personService.findOne(emaill);

	}

	@PostMapping
	public Map<String, String> insert(@RequestBody Person person){
		return personService.insert(person);
}
	}
