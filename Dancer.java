package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Dancer {
	private String name;
	private String dancePlace;
	private int salary;
	private boolean isKatakali;

	public Dancer() {
		System.out.println("this is super class constructor");
	}
}
