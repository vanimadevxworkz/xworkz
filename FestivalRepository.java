package com.xworkz.festival.repository;

public interface FestivalRepository {
	
	boolean onSave(String name);
	
	String[] read();

	boolean update(String oldName, String newName);
	
	boolean delete(String name);

}
