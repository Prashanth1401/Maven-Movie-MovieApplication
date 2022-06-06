package com.movie;



import java.util.List;

import java.util.Optional;
import java.util.Scanner;

import com.prashanth.dao.MovieDaoImpl;
import com.prashanth.dto.Movie;

public class MovieApplication
{

	public static void main(String[] args) 
	{
		MovieDaoImpl moviedaoIMPL=new MovieDaoImpl();
		   int p,x,y,z,m;
	        System.out.println("\n");
	        System.err.println(" 💐 💐 💐  💐 🎷 🎷 🎷WELCOME TO Award Futcions🎷 🎷 🎷 💐 💐 💐  💐  💐 ");
	        System.out.println("\n");
	        System.out.println("\n");
	       
	        Scanner s = new Scanner(System.in);
	        System.out.println("If You Want to Inroll Your movie Details📝 In IFA Functions \n1.press 1 for yes \n2. press 2 for NO");
	        x = s.nextInt();
	        switch (x)
	        {
	        case 1:
	        System.err.println(" 📽️ 📽️ Plz Add Your Movie Details 📽️ 📽️");
	        System.out.println("\n");
	        System.out.println("\n");
	        System.err.println("Enter Movie ID Number");
	       
	        Integer movieid=s.nextInt();
	        System.err.println("Enter Movie Name");
	        String movieName=s.next();
	        System.err.println("Enter Movie Budjet");
	        Double movieBudjet=s.nextDouble();
	        System.err.println("Enter Movie ReviewDetails");
	        String movieReview=s.next();
	        
	        Movie movie=new Movie(movieid,movieName,movieBudjet,movieReview);
	        Optional<Movie> addedMovie=moviedaoIMPL.addMovie(movie);
	        if(addedMovie.isPresent()) {
	        	System.out.println("\n");
	       	 System.err.println("Movie Details Added SuccessFully");
	        }
	        System.out.println("\n");
	        System.out.println("\n");
	       System.err.println("Options if You want to Add Movie Details Again \n1.press 1 for Yes \n2. press 2 FOR SHOW the list of movies");
	       System.out.println("\n");
	       p=s.nextInt();
	       switch(p) {
	       case 1:
	    	   System.err.println(" 📽️ 📽️ Plz Add Your Movie Details 📽️ 📽️");
		        System.out.println("\n");
		        System.err.println("Enter Movie ID Number");
		        Integer movieid2=s.nextInt();
		        System.err.println("Enter Movie Name");
		        String movieName2=s.next();
		        System.err.println("Enter Movie Budjet");
		        Double movieBudjet2=s.nextDouble();
		        System.err.println("Enter Movie ReviewDetails");
		        String movieReview2=s.next();
		        Movie movie2=new Movie(movieid2,movieName2,movieBudjet2,movieReview2);
		        Optional<Movie> addedMovie2=moviedaoIMPL.addMovie(movie2);
		        if(addedMovie2.isPresent()) {
		        	System.out.println("\n");
		       	 System.err.println("Movie Details Added SuccessFully");
		        }
		        List<Movie> allMovie=moviedaoIMPL.getAllMovieList(movie);
		        System.out.println("\n");
		        System.out.println(allMovie);
		        break;
		       
	       case 2:
	    	   List<Movie> allMovie1=moviedaoIMPL.getAllMovieList(movie);
	    	   System.out.println("\n");
		        System.out.println(allMovie1);
	    	   }
	       System.out.println("\n");
		   System.err.println("options Update MovieDetails \n1.press 1 for YES \n2.press 2 for NO");
		   System.out.println("\n");
		   y=s.nextInt();
	       switch(y) {
	       
	       case 1: System.err.println("Enter Movie Id");
	       Integer movieidupdate=s.nextInt();
	       if(movie.getMovieId().equals(movieidupdate)) {
	    	   System.out.println("\n");
	    	   System.err.println("options to Update \n1. Movie Name \n2. Budjet \n3. Review");
		       z=s.nextInt();
		       switch(z) {
		       case 1:
		    	   System.out.println("Enter update A Movie Name");
		    	   String UpdateMovieName=s.next();
		    	   movie.setMovieName(UpdateMovieName);
		    	  
		       case 2: System.out.println("Enter a Update Budjet");
		       Double updateBudjet=s.nextDouble();
		       movie.setMovieBudjet(updateBudjet);
		       moviedaoIMPL.updateMovieDetails(movie);
		       case 3:System.out.println("Enter a update Review");
		       String updateMovieReview=s.next();
		       movie.setMovieReviewe(updateMovieReview);
		       System.out.println("\n");
		     System.err.println("Movie details updated");
		       List<Movie> allMovie=moviedaoIMPL.getAllMovieList(movie);
		        System.err.println(allMovie);
	       }
		      
	       }
	  
	    	   
	        case 2:
		        System.err.println("Options \n1. press 1 for Show movieDetails bY MovieId \n2. for NO");
		        m=s.nextInt();
		        switch(m) {
		        case 1:
		        
		        System.err.println("Enter MvoieID");
		        Integer getMovieByID1=s.nextInt();
		        if(movie.getMovieId().equals(getMovieByID1)) {
		        	System.err.println("Movie Name : "+movie.getMovieName()); 
		        	System.err.println("\n Movie Budjet : "+movie.getMovieBudjet()); 
		        	System.err.println("\n Movie Reviewe : "+movie.getMovieReviewe()); 
		        	
		        		
		        }
		        case 2:
		        	System.err.println(" \n 🙏 🙏 bye bye SEE YOU AGAIN 🙏 🙏");
		        } 
	        }
	       
	        }}}
	

	        
	        
	        
	        
	        
	        
		



	


