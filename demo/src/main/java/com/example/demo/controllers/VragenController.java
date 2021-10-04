package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VragenController {

    //normaal zet je dit niet bij de controllers ( de vragen en antwoorden )
    private static String[] questions = {
            "Where is Amsterdam?",
            "Where is New York?"
    };

    private static String[] answers = {
            "In the Netherlands",
            "In America"
    };


    //dit wel in de controllers, controllers zorgen voor de juiste mapping
    @GetMapping(value = "/questions")
    public String[] getQuestions() {

        return questions;
    }

    @GetMapping(value = "/questions/{nr}")
    public String getQuestion(@PathVariable int nr) {

        return questions[nr];
    }

    @GetMapping(value = "/questions/{nr}/answer")
    public String getAnswer(@PathVariable int nr) {

        return answers[nr];
    }


}
