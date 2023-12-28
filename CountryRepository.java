package com.xworkz.country.repository;

public interface CountryRepository {
	
	boolean onSave(String countryName);
	
	String[] read();
	
	boolean update(String oldName,String newName);
	
	boolean delete(String countryName);

}
