package com.example.demo.model;


import javax.persistence.*;

@Entity(name = "Persons")
public class Person {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) //ieder record die je opslaat krijgt een ID
    public long id;

    //atributen
    @Column(length =80)
    public String firstName;

    @Column(length =80)
    public String lastName;

    @Column(length =120)
    public String city;

    //getters en setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
