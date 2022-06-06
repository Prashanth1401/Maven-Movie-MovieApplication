package com.prashanth.service;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

import com.prashanth.dto.Movie;

public class MovieServiceImplTest {
	MovieServiceImpl  movieServiceImpl=new MovieServiceImpl();
	Movie movie=new Movie(1402,"MAJOR",501.50,"HIT");
	
	@Test
	public void AddMovie() {
	Optional<Movie> addedMovie = movieServiceImpl.addMovie(movie);
		assertTrue(addedMovie.isPresent());
     }
     @SuppressWarnings("unlikely-arg-type")
	@Test
     public void GetAllMovieList() {
	 movieServiceImpl.addMovie(movie);
	 equals(movieServiceImpl.getAllMovieList(movie));
    }
     @Test
     public void GetMovieById() {
    	 movieServiceImpl.addMovie(movie);
    		Optional<Movie> movie =movieServiceImpl.getMovieById(1402);
    		assertTrue(movie.isPresent());
    		assertNotNull(movie.get());
     }
     
 	@Test
 	public void testUpdateMovieDetails() {
 		movieServiceImpl.addMovie(movie);
 	movieServiceImpl.updateMovieDetails(movie);
        movie.setMovieName("rrrr");
        assertEquals(true,movie.equals(movie));
}}
