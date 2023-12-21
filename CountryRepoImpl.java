package com.xworkz.country.repository;

public class CountryRepoImpl implements CountryRepository{

	
	private String[] name=new String[5];
	private int index=0;
	
	
	public String[] getName() {
		return name;
	}




	@Override
	public boolean onSave(String countryName) {
		if(name==null||index>=name.length) {
			System.out.println("name is null or check the length");
			return true;
		}else {
			if(index<name.length) {
				name[index]=countryName;
				index++;
				System.out.println("saved country name");
				return true;
			}
		}
		return false;
	}




	@Override
	public String[] read() {
		return name;
	}
	
	


}
