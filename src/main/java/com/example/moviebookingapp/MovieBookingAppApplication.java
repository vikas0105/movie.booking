package com.example.moviebookingapp.model;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int durationMinutes;

    // Constructors, getters, and setters

    // Example constructor
    public Movie(String title, String genre, int durationMinutes) {
        this.title = title;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
    }
}
