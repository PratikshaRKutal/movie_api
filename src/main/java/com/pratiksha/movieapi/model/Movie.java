package com.pratiksha.movieapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

public class Movie {
	private Long id;
	
	@NotBlank(message="Movie name is required")
	private String name;
	
	private String description;
	
	@NotNull(message="Rating is required")
	@Min(value=0, message="Rating must be at least 0")
	@Max(value=10, message="Rating must be at most 10")
	private Double rating;
	
	public Movie() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
}
