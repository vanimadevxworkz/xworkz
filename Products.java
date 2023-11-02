package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {
	private String productname;
	private int price;
	private String stores;
	private float quality;
	
	public Products() {
		System.out.println("this is parent class");
	}

}
