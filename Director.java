package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Director {
	private String name;
	private int salary;
	private String education;
	private String filmName;
	
	public Director() {
		System.out.println("this is super class constructor");
	}

}
