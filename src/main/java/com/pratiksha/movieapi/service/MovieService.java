package com.pratiksha.movieapi.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.pratiksha.movieapi.model.Movie;

@Service
public class MovieService {
	private List<Movie> movies=new ArrayList<>();
	private Long idCounter=1L;
	
	public Movie addMovie(Movie movie) {
		movie.setId(idCounter);
		idCounter++;
		movies.add(movie);
		return movie;
	}
	
	public Movie getMovieById(Long id) {
		for(Movie movie:movies) {
			if(movie.getId().equals(id)) {
				return movie;
			}
		}
		return null;
	}
}
