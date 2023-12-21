package com.xworkz.movie.repository;

public interface MovieRepository {
	
	boolean onSave(String movieName);
	
	String[] read();

}
