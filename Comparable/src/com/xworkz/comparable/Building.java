package com.xworkz.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Building implements Comparable<Building>{

	private String nameOfBuilding;
	private int noOfRooms;
	
	@Override
	public int compareTo(Building o) {
		System.out.println("this is comparable method");
		
	int value=this.nameOfBuilding.compareTo(o.nameOfBuilding);
	System.out.println(value);
		return value;
		
		//int value=this.noOfRooms-o.noOfRooms;
		//return value;
	}

	

}
