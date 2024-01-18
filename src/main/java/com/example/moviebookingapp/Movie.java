package com.example.moviebookingapp.controller;

import com.example.moviebookingapp.model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> movieList = new ArrayList<>();

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieList;
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        // Logic to fetch movie by id from the list
        // Return a movie or handle the case when the movie is not found
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        // Logic to add a new movie to the list
        // You may want to set an ID for the movie before adding it
        // Return the added movie
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie updatedMovie) {
        // Logic to update an existing movie in the list based on the provided ID
        // Return the updated movie or handle the case when the movie is not found
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        // Logic to delete a movie from the list based on the provided ID
        // You may choose to return a response or handle it as needed
    }
}
