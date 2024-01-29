 package com.xworkz.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flowers implements Comparable<Flowers> {

	private String flowerName;
	private int price; 
	private String color;
	
	@Override
	public int compareTo(Flowers o) {
		System.out.println("this is compareto method");
		//sorting the string values
		int value=this.flowerName.compareTo(o.flowerName);
		System.out.println("compare method:"+value);
		return value;
		
//		int value=this.price-o.price;
//		System.out.println("sorting the int value:"+value);
//		return value;
	}

}
