package com.xworkz.company.dto;

public class CompanyDto {
	
	private String name;
	private int salary;
	private String qualification;
	
	public CompanyDto() {
		System.out.println("no args constructor");
	}

	public CompanyDto(String name, int salary, String qualification) {
		System.out.println("all args constructor");
		this.name = name;
		this.salary = salary;
		this.qualification = qualification;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getQualification() {
		return qualification;
	}

	@Override
	public String toString() {
		System.out.println("this is to string method");
		return "CompanyDto [name=" + name + ", salary=" + salary + ", qualification=" + qualification + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("this is hash code method");
		int result = 11;
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
		CompanyDto other = (CompanyDto) obj;
		if (name == null) 				
			return false;
				return true;
	}
	
	

}
