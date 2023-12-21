package com.xworkz.movie.service;

import com.xworkz.movie.repository.MovieRepository;

public class MovieServiceImpl implements MovieService {
	
	private MovieRepository repository;
	
	public MovieServiceImpl(MovieRepository repository) {
		this.repository=repository;
	}
	

	@Override
	public boolean validateAndSave(String movieName) {
		if(movieName.isEmpty()
		||movieName.isBlank()
		||movieName.length()<2
		||movieName.length()>30
		||movieName==null) {
			System.out.println("to givr correct movie name");
		}else {
			
			boolean exist=isExist(movieName);
			if(exist!=true) {
		
		
		boolean save=repository.onSave(movieName);
		if(save){
			System.out.println("name is saved successfully");
			return true;
		}else {
			System.out.println("name is not saved successfully");
			return false;
		}
		}else {
			System.out.println("name is exist suceessfully");
			return true;
		}
		
	}
		return false;
	}


	@Override
	public boolean isExist(String movieName) {
		String[] name=repository.read();
		if(name!=null) {
			for(String names:name) {
				if(names!=null) {
					if(names.equals(movieName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
