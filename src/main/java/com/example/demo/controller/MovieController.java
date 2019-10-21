package com.example.demo.controller;

import com.example.demo.Model.Movie;
import com.example.demo.email.EmailAspect;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie")
    public String getMovies(Model model)
    {
        model.addAttribute("movies", movieService.getMovies());
        model.addAttribute("newMovie",new Movie());

        return "movie";
    }
    @EmailAspect
    @PostMapping("/add")
    public String addMovie(@ModelAttribute Movie movie)
    {
        movieService.addMovie(movie);
        System.out.println("cos sie stalo!: "+movie);
        return "redirect:/movie";
    }
}
