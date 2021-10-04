package com.example.demo.service;

import com.example.demo.model.Person;

public interface PersonService {
    //inhouds opgave van alle methodes van de personserviceimpl

    Iterable<Person> findAll();
    public Person findById(long nr);
    void save(Person person);
    void deleteById(long nr);

    Iterable<Person> findByLastName(String lastName);

}
