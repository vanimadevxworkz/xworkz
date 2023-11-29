package com.xworkz.houseimpl;

import com.xworkz.house.abstracts.House;
import com.xworkz.house.dto.HouseDto;

public class HikeHouse extends House {

	@Override
	public void getHouseMethod() {
		System.out.println("this is get house method");
	}

	@Override
	public void houseType() {
		System.out.println("house type metod");
		
	}

	@Override
	public void houseDesig() {
		System.out.println("house design metod");
		
	}
	
	Object obj[]=new Object[2];
	int index=0;
	@Override
	public boolean onSave(HouseDto houseDto) {
	if(houseDto!=null) {
		System.out.println("dto is not null");
		if(index<obj.length) {
		obj[index]=houseDto;
		index++;
		}
	}else {
		System.out.println("dto is   null");
	}
	return false;
	
	
}
}
