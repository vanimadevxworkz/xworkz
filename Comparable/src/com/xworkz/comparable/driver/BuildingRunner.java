package com.xworkz.comparable.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.Building;

public class BuildingRunner {

	public static void main(String[] args) {
		
		Building building=new Building("sweet home",4);
		
		List<Building> list=new ArrayList<>();
		list.add(building);
		list.add(new Building("Kaveri", 2));
		list.add(new Building("Home",5));
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
