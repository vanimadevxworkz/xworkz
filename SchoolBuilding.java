package com.xworkz.buildingimplementation;

import com.xworkz.building.abstracts.Building;

public class SchoolBuilding extends Building {
	@Override
	public void cement() {
		System.out.println("this is schoolbuilding method");
	}

	@Override
	public void pillars() {
		System.out.println("pillars in the building");
		
	}

	@Override
	public void rod() {
		System.out.println("total number of rods are using the building method");
		
	}

	@Override
	public void design() {
		System.out.println("this is the design of the building");
		
	}

	@Override
	public void flors() {
		System.out.println("total flors in the building");
		
	}
	
	

}
