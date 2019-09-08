package com.mvc.demo.controller;

import com.mvc.demo.model.Person;
import com.mvc.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping(value = "/person")
    public Person getPerson(){
        return service.getSimplePerson();
    }
    @PostMapping("/person")
    public Person setPerson(@RequestBody Person newPerson){
        return service.modifyPerson(newPerson);
    }

}
