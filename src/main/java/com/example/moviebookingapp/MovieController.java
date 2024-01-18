package com.example.moviebookingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    // Add your other controller methods here

}
