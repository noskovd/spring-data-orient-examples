package org.hello.rest;

import java.util.List;

import org.hello.data.Person;
import org.hello.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository repository;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Person> findAllPersons() {
        return repository.findAll();
    }
    
    @RequestMapping("/findByFirstName")
    public List<Person> findByFirstName(@RequestParam String firstName) {
        return repository.findByFirstName(firstName);
    }
    
    @RequestMapping("/findByLastName")
    public List<Person> findByLastName(@RequestParam String lastName) {
        return repository.findByLastName(lastName);
    }
    
    @RequestMapping("/findByAge")
    public List<Person> findByAge(@RequestParam Integer age) {
        return repository.findByAge(age);
    }
}
