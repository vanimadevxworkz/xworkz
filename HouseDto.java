package com.xworkz.house.dto;

public class HouseDto {
	
	private String name;
	private int homeRent;
	private boolean isGood;
	
	public HouseDto() {
		System.out.println("no args constructor");
	}

	public HouseDto(String name, int homeRent, boolean isGood) {
		System.out.println("all args constructor");
		this.name = name;
		this.homeRent = homeRent;
		this.isGood = isGood;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHomeRent(int homeRent) {
		this.homeRent = homeRent;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}

	public String getName() {
		return name;
	}

	public int getHomeRent() {
		return homeRent;
	}

	public boolean isGood() {
		return isGood;
	}

	@Override
	public String toString() {
		System.out.println("this is to String method");
		return "HouseDto [name=" + name + ", homeRent=" + homeRent + ", isGood=" + isGood + "]";
	}

	@Override
	public int hashCode() {
	System.out.println("this is hash code method")	;
		int result = 21;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HouseDto hd = (HouseDto) obj;		
			return false;
		
	}
	
}	
	
	
	


