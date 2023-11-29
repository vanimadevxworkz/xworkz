package com.xworkz.education.dto;

public class EducationDto {
	
	private String eduMinister;
	private String commite;
	private int type;
	
	public EducationDto() {
		System.out.println("no args constructor");
	}

	public EducationDto(String eduMinister, String commite, int type) {
		System.out.println("all args constructor");
		this.eduMinister = eduMinister;
		this.commite = commite;
		this.type = type;
	}

	public void setEduMinister(String eduMinister) {
		this.eduMinister = eduMinister;
	}

	public void setCommite(String commite) {
		this.commite = commite;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getEduMinister() {
		return eduMinister;
	}

	public String getCommite() {
		return commite;
	}

	public int getType() {
		return type;
	}

	@Override
	public String toString() {
		System.out.println("this is to string method");
		return "EducationDto [eduMinister=" + eduMinister + ", commite=" + commite + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("this is hash code method");
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
		EducationDto ed = (EducationDto) obj;
		if (commite == null) 			
				return false;
		return true;
	}
	
	
	
	
	
	
	

}
