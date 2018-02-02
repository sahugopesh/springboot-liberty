package com.springboot.study.controller;

import com.springboot.study.assembler.PersonAssembler;
import com.springboot.study.domain.Person;
import com.springboot.study.dto.PersonDTO;
import com.springboot.study.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aduraisamy on 12/29/2016.
 */
@RestController
public class PersonController {

    //@Autowired
    //private PersonRepository personRepository;

    //@Autowired
    //private PersonAssembler personAssembler;

    @RequestMapping("/person")
    public PersonDTO post(@RequestParam(value = "firstName", defaultValue = "defaultFirstName") String firstName, @RequestParam(value = "lastName", defaultValue = "defaultLastName") String lastName) {

        //Person person = personAssembler.toPerson(firstName, lastName);
        //personRepository.save(person);
        //PersonDTO personDTO = personAssembler.toPersonDTO(person);
    	PersonDTO personDTO = new PersonDTO(1l, "Gopesh", "Sahu");
        return personDTO;
    }

    @RequestMapping(value = "/home" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getData() {

        //Person person = personAssembler.toPerson(firstName, lastName);
        //personRepository.save(person);
        //PersonDTO personDTO = personAssembler.toPersonDTO(person);
    	//PersonDTO personDTO = new PersonDTO(1l, "Gopesh", "Sahu");
        return "{Hello World!}";
    }
}
