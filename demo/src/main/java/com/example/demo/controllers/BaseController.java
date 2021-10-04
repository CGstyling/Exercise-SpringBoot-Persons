package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    //how to make a QuerySTring with a requestParam
    @GetMapping(value= "/")
    public static String sayName(@RequestParam(required = false) String naam) {
        if (naam == null) {
            return "Hello World";
        } else {
            return "Hello " + naam + "!";
        }
    }

    @GetMapping(value = "/say")
    public static String sayHello() {

        return "Hello World";
    }

    @GetMapping(value = "/christina")
    public static String sayChrisina() {
        return "Hello Christina";
    }

    @GetMapping(value = "/info/first")
    public static String info() {
        return "Dit is mijn eerste endpoint";
    }

}
