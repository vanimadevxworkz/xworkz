package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company {
	private String name;
	private String qualification;
	private int salary;
	private String place;
	
	public Company() {
		System.out.println("this is parent class constructor");
	}
	

}
