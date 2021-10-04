package com.example.demo.service;

import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    @Autowired //moderne manier om autowired te gebruiken met een constructer
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Iterable<Person> findAll() {
        Iterable<Person> persons = personRepository.findAll();
        return persons;
    }

    public Person findById(long nr) {
        Optional<Person> person = personRepository.findById(nr);
        if (person.isPresent()) {
            return person.get();
        } else {
            throw new RecordNotFoundException("Person with id " + nr + " not found");
        }
//        try {
//            Optional<Person> person = personRepository.findById(nr);
//            return person;
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println(ex);
//            throw new RecordNotFoundException();
//        }
    }

    public void save(Person person) {
        personRepository.save(person);
   }

    public void deleteById(long nr) {
        try {
            personRepository.deleteById(nr);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
            throw new RecordNotFoundException();
        }
    }

    @Override
    public Iterable<Person> findByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

}
