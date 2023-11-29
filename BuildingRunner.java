package com.xworkz.building;

import com.xworkz.building.abstracts.Building;
import com.xworkz.building.dto.BuildingDto;
import com.xworkz.buildingimplementation.SchoolBuilding;

public class BuildingRunner {
	
	public static void main(String[] args) {
		
		Building building=new SchoolBuilding();
		building.cement();
		building.pillars();
		building.rod();
		building.design();
		building.flors();
		
		
		building.onSave(null);
		building.onSave(null);
		
		BuildingDto bd=new BuildingDto();
		bd.setFlors(9);
		bd.setHight(null);
		bd.setName("Schoolbuilding");
		
		System.out.println("getter method is:"+bd.getFlors());
		System.out.println("getter method is:"+bd.getName());
		System.out.println("getter method is:"+bd.getHight());
		
		System.out.println("hash code method is:"+bd.hashCode());
		System.out.println("to string method:"+bd.toString());
		System.out.println("equlas method:"+bd.equals(bd));
		
	}

}
