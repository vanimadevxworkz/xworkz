package com.xworkz.house;

import com.xworkz.house.abstracts.House;
import com.xworkz.houseimpl.HikeHouse;

public class HouseRunner {
	
	public static void main(String[] args) {
		House house=new HikeHouse();
		house.houseDesig();
		house.getHouseMethod();
		house.houseType();
		
		
	}

}
