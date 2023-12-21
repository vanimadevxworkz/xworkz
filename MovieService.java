package com.xworkz.movie.service;

public interface MovieService {
	
	boolean validateAndSave(String movieName);
	
	boolean isExist(String movieName);

}
