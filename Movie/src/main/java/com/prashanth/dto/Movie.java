package com.prashanth.dto;

public class Movie {
	private Integer movieId;
	private String movieName;
	private Double movieBudjet;
	private String movieReviewe;
	public Movie(Integer movieId, String movieName, Double movieBudjet, String movieReviewe) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieBudjet = movieBudjet;
		this.movieReviewe = movieReviewe;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Double getMovieBudjet() {
		return movieBudjet;
	}
	public void setMovieBudjet(Double movieBudjet) {
		this.movieBudjet = movieBudjet;
	}
	public String getMovieReviewe() {
		return movieReviewe;
	}
	public void setMovieReviewe(String movieReviewe) {
		this.movieReviewe = movieReviewe;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieBudjet=" + movieBudjet
				+ ", movieReviewe=" + movieReviewe + "]";
	}
	

}
