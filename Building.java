package com.xworkz.building.abstracts;

import com.xworkz.building.dto.BuildingDto;

public abstract class Building {

	public abstract void cement();
	
	public abstract void pillars();
	
	public abstract void rod();
	
	public abstract void design();
	
	public abstract void flors();
	
	public abstract boolean onSave(BuildingDto buildingDto);
	
}
