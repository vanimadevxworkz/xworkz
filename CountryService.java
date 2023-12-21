package com.xworkz.country.service;

public interface CountryService {
	
	boolean validate(String countryName);
	
	boolean isExist(String countryName);

}
