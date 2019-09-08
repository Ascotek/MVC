package com.mvc.demo.controller;

import com.mvc.demo.model.Person;
import com.mvc.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/person")
public class PersonWebController {

    @Autowired
    private PersonService service;

    @GetMapping
    public String getPerson(Model model){
        model.addAttribute("person", service.getSimplePerson());
        return "personView";
    }

    @PostMapping
    public String setPerson(Person newPerson, Model model){
        model.addAttribute("person", service.modifyPerson(newPerson));
        return "personView";
    }

    @GetMapping("/add")
    public String gotToPersonForm(Model model){
        model.addAttribute("person", service.getEmptyPerson());
        return "personForm";
    }

    @GetMapping("/list")
    public ModelAndView showALlPersons(ModelAndView mav){
        mav.setViewName("personList");
        mav.addObject("personList", service.getAll());
        return mav;
    }

}
