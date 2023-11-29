package com.xworkz.house.abstracts;

import com.xworkz.house.dto.HouseDto;

public abstract class House {
	
	public abstract void getHouseMethod();
	
	public abstract void houseType();
	
	public abstract void houseDesig();
	
	public abstract boolean onSave(HouseDto houseDto);
	
	

	
}
