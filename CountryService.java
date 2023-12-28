package com.xworkz.country.service;

public interface CountryService {
	
	boolean validate(String countryName);
	
	boolean isExist(String countryName);
	
	boolean update(String oldName, String newName);
	
	 void read();
	
	boolean delete(String countryName);
	
	
	

}
