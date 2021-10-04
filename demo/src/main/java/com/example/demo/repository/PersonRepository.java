package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    //we hebben tegen de repository gezegt we willen deze methode ook hebben
    Iterable<Person>findByLastName(String lastName);
    //hij vertaald dit in een select query
    //SELECT * FROM persons WHERE lastName = <lastName>

}
