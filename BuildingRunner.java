package com.xworkz.building;

import com.xworkz.building.abstracts.Building;
import com.xworkz.buildingimplementation.SchoolBuilding;

public class BuildingRunner {
	
	public static void main(String[] args) {
		
		Building building=new SchoolBuilding();
		building.cement();
		building.pillars();
		building.rod();
		building.design();
		building.flors();
		
	}

}
