package com.prashanth.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.prashanth.dto.Movie;




public class MovieDaoImpl implements MovieDao {
Map<Integer,Movie> movieDB=new HashMap<Integer,Movie>();
	@Override
	public Optional<Movie> addMovie(Movie movie) {
	
		movieDB.put(movie.getMovieId(), movie);
		return Optional.of(movieDB.get(movie.getMovieId()));
	}

	@Override
	public Optional<Movie> updateMovieDetails(Movie movie) {

		if(movieDB.containsKey(movie.getMovieId())) {
			movieDB.replace(movie.getMovieId(), movie);
			return Optional.of(movie);
		}else {
			return Optional.of(null);
		}
		
	}

	@Override
	public Optional<Movie> getMovieById(Integer movieId) {
if(movieDB.containsKey(movieId)) {
	Movie movie=movieDB.get(movieId);
	
	
	return Optional.of(movie);
}else
	return Optional.of(null);

}
		 
		
		
	

	@Override
	public List<Movie> getAllMovieList(Movie movie) {
	
		return new ArrayList<Movie> (movieDB.values());
	}

	

}
