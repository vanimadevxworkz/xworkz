package com.xworkz.country.runner;

import com.xworkz.country.repository.CountryRepoImpl;
import com.xworkz.country.repository.CountryRepository;
import com.xworkz.country.service.CountryService;
import com.xworkz.country.service.CountryServiceImpl;

public class CountriesRunner {

	public static void main(String[] args) {
		
		CountryRepository repo=new CountryRepoImpl();
		
		CountryService service=new CountryServiceImpl(repo);
		
		service.validate("india");
		service.validate("pakistna");
		service.validate("chaina");
		service.validate("uk");
		service.validate("usa");
				
		
	}
}
