package com.xworkz.movie.runner;

import com.xworkz.movie.repository.MovieRepoImpl;
import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImpl;

public class Movie1Runner {

	
	public static void main(String[] args) {
		
		MovieRepository repo=new MovieRepoImpl();
		
		MovieService service=new MovieServiceImpl(repo);
		service.validateAndSave("sse");
		service.validateAndSave("katera");
		service.validateAndSave("appu");
		service.validateAndSave("rrr");
		service.validateAndSave("jani");
		
		
	}
}
