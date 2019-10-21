package com.example.demo.service;

import com.example.demo.Model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
    }
    public List<Movie> getMovies(){
        return movieRepository.getMovies();
    }
    public Boolean addMovie(Movie movie){
        return movieRepository.getMovies().add(movie);
    }
    public Movie getLastAddedMovie(){return movieRepository.getMovies().get(movieRepository.getMovies().size()-1);}
}
