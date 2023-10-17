package com.xworkz.test.driver;

import com.xworkz.test.things.CountryName;

public class CountryNameRunner {
	public static void main(String args[]) {
		CountryName countryName=new CountryName();
		countryName.save("India");
		countryName.save("Usa");
		countryName.save("uk");
		countryName.save("pakistana");
		
		countryName.read();
		
		countryName.update("India","astreliya");
		countryName.read();
		System.out.println("it is updated");
		
		countryName.delet("uk");
		countryName.read();
		System.out.println("it is deleted");
		
	}

}
