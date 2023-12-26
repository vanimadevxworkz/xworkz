package com.xworkz.festival.service;

public interface FestivalService {
	
	boolean validateAndSave(String name);
	
	boolean isExist(String name);

  boolean update(String oldName, String newName);

void read();

boolean delete(String name);

}
