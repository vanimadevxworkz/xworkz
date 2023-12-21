package com.xworkz.country.repository;

public interface CountryRepository {
	
	boolean onSave(String countryName);
	
	String[] read();

}
