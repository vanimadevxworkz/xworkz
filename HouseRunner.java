package com.xworkz.house;

import com.xworkz.house.abstracts.House;
import com.xworkz.house.dto.HouseDto;
import com.xworkz.houseimpl.HikeHouse;

public class HouseRunner {
	
	public static void main(String[] args) {
		House house=new HikeHouse();
		house.houseDesig();
		house.getHouseMethod();
		house.houseType();
		
		house.onSave(null);
		house.onSave(null);
		
		
		HouseDto hd=new HouseDto();
		hd.setName("xxx");
		hd.setHomeRent(5000);
		hd.setGood(false);
		
		System.out.println(hd.getHomeRent());
		System.out.println(hd.getName());
		System.out.println(hd.isGood());
		
		System.out.println("to string values:"+hd.toString());
		System.out.println("hash code values:"+hd.hashCode());
		System.out.println("equals values:"+hd.equals(hd));
	}

}
