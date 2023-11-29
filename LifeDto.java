package com.xworkz.life.dto;

public class LifeDto {

	private boolean isHappy;
	private String lifeStyle;
	
	public  LifeDto() {
		System.out.println("no args constructor");
	}

	public LifeDto(boolean isHappy, String lifeStyle) {
		System.out.println("all args constructor");
		this.isHappy = isHappy;
		this.lifeStyle = lifeStyle;
	}

	public void setHappy(boolean isHappy) {
		this.isHappy = isHappy;
	}

	public void setLifeStyle(String lifeStyle) {
		this.lifeStyle = lifeStyle;
	}

	public boolean isHappy() {
		return isHappy;
	}

	public String getLifeStyle() {
		return lifeStyle;
	}

	@Override
	public String toString() {
		return "LifeDto [isHappy=" + isHappy + ", lifeStyle=" + lifeStyle + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("hash code method");
		int result = 25;
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
		LifeDto other = (LifeDto) obj;
		if (isHappy != other.isHappy)
			return false;
		return true;
	}
	
	
}
