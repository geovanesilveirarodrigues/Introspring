package com.example.demo.service;

import java.util.ArrayList;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
@Service
public class PersonService {
	private List<Person> listOfPersons = new ArrayList<Person>();

	public List<Person> findAll() {
		return this.listOfPersons;

	}

	public Person findOne(String emaill) {
		for (Person person : this.listOfPersons) {
			if (person.getEmaill().equals(emaill)) {
				return person;
			}
		}
		return null;
	}

	public Map<String, String> insert(Person person) {
		boolean isSuccess = this.listOfPersons.add(person);
		Map<String, String> result = new HashMap();
		if(isSuccess) {
			result.put("result", "Pessoa cadastrada com sucesso!!!");
			
		}else {
			result.put("result","Não foi posivel cadastrar a pessoa!!!");
		}
		return result;
		
	}
	
}
