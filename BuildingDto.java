package com.xworkz.building.dto;

public class BuildingDto {
	
	private String name="school building";
	private String hight;
	private int flors=9;
	
	
	public BuildingDto() {
		System.out.println("no args constructor");
	}
	
	public BuildingDto(String name,String hight,int flors) {
		System.out.println("all args constructor");
		this.name=name;
		this.hight=hight;
		this.flors=flors;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHight(String hight) {
		this.hight = hight;
	}

	public void setFlors(int flors) {
		this.flors = flors;
	}

	public String getName() {
		return name;
	}

	public String getHight() {
		return hight;
	}

	public int getFlors() {
		return flors;
	}

	@Override
	public String toString() {
		System.out.println("this is to sring method");
		return "BuildingDto [name=" + name + ", hight=" + hight + ", flors=" + flors + "]";
	}

	@Override
	public int hashCode() {
	System.out.println("this is hashcode method");			
		int result = 1;
		return result;
	}

	public boolean equals(Object obj) {
		return true;
			
	}
	

}
