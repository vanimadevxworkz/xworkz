package com.xworkz.test.driver;

import com.xworkz.test.things.Country;
import com.xworkz.test.things.State;

public class CountryRunner {
public static void main(String args[]) {
	Country country=new Country();
	State state=new State();
	state.setName("karnataka");
	state.setTotalTaluku(240);
	state.setDistrict("uttarakannada");
	state.setTotalVilages(27481);
	state.setTotalPeople("7.7 crores");
	
	country.setState(state);
	System.out.println(country.getState().getName());
	System.out.println(country.getState().getTotalTaluku());
	System.out.println(country.getState().getDistrict());
	System.out.println(country.getState().getTotalVilages());
	System.out.println(country.getState().getTotalPeople());
	
	
	
}
}
