package com.example.demo.controllers;

import com.example.demo.model.Person;
import com.example.demo.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    //responseEntity geeft een response terug geven. Ok is status code en persons de body

    @GetMapping(value = "/persons")
    public ResponseEntity getPersons() {
        Iterable<Person> persons;
        persons = personService.findAll();
        return ResponseEntity.ok(persons);
    }

    //read
    @GetMapping(value = "/persons/{nr}")
    public ResponseEntity getPersons(@PathVariable long nr) {
        Person person = personService.findById(nr);
        return ResponseEntity.ok(person);
    }

    //create
    @PostMapping(value= "/persons")
    public ResponseEntity addPersons(@RequestBody Person person) {
        personService.save(person);
        return ResponseEntity.ok("Created a new person!");
    }

    //delete
    @DeleteMapping(value = "/persons/{nr}")
    public ResponseEntity deletePerson(@PathVariable long nr) {
        personService.deleteById(nr);
        return ResponseEntity.ok("You Deleted a person!");
    }

    //update
    @PutMapping(value = "/persons/{nr}")
    public ResponseEntity updatePerson(@PathVariable long nr, @RequestBody Person person) {
        return ResponseEntity.ok("You changed the name!");
    }

}
