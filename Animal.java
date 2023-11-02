package com.xworkz.Shopping.things;


import lombok.Getter;

import lombok.Setter;

@Getter
@Setter


public class Animal {
	private String name;
	private int price;
	private char size;
	private String hybrid;
	
public Animal() {
	System.out.println("this is super class constructor");
}
}
