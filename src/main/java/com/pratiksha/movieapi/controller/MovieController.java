package com.pratiksha.movieapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import jakarta.validation.Valid;

import com.pratiksha.movieapi.model.Movie;
import com.pratiksha.movieapi.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	private final MovieService movieService;
	
	public MovieController(MovieService movieService) {
		this.movieService=movieService;
	}
	
	@PostMapping
	public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie){
		Movie savedMovie=movieService.addMovie(movie);
		return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getMovieById(@PathVariable Long id){
		Movie movie=movieService.getMovieById(id);
		
		if(movie==null) {
			return new ResponseEntity<>("Movie not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(movie, HttpStatus.OK);
	}
}
