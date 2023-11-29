package com.xworkz.buildingimplementation;

import com.xworkz.building.abstracts.Building;
import com.xworkz.building.dto.BuildingDto;



public class SchoolBuilding extends Building {
	
@Override
	public void cement() {
		System.out.println("this is schoolbuilding method");
	}
	public void pillars() {
		System.out.println("pillars in the building");
		
	}

	public void rod() {
		System.out.println("total number of rods are using the building method");
		
	}

	
	public void design() {
		System.out.println("this is the design of the building");
		
	}

	
	public void flors() {
		System.out.println("total flors in the building");
		
	}
	

	 Object obj[]=new Object[2];
	    int index=0;
		@Override
		public boolean onSave(BuildingDto buildingDto) {
			if(buildingDto!=null) {
				System.out.println("dto is not null");
				if(index<obj.length) {
				obj[index]=buildingDto;
				index++;
				}
			}else {
				System.out.println("dto is   null");
			}
			return false;
		}
		
	}
	
	


