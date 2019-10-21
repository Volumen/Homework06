package com.example.demo.repository;

import com.example.demo.Model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {
    List<Movie> movieList;

    public MovieRepository() {
        this.movieList = new ArrayList<>();
    }
    public List<Movie> getMovies(){return movieList;}
}
