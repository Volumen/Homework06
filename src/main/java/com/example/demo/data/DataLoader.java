package com.example.demo.data;

import com.example.demo.Model.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(DataLoader.class);
    private MovieRepository movieRepository;
    private MovieService movieService;

    public DataLoader(MovieRepository movieRepository, MovieService movieService) {
        this.movieRepository = movieRepository;
        this.movieService = movieService;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading data from DataLoader...");
        movieRepository.getMovies().add(new Movie("Matrix", 1999,"Joel Silver"));
        movieRepository.getMovies().add(new Movie("Green Book", 2018,"Jim Burke"));
    }
}
