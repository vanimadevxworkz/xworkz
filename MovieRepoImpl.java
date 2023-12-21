package com.xworkz.movie.repository;

public class MovieRepoImpl implements MovieRepository{
	
	 private String[] name=new String[5];
	 private int index=0;
	 
	 

	public String[] getName() {
		return name;
	}


	@Override
	public boolean onSave(String movieName) {
		if(name==null||index>=name.length) {
			System.out.println("name is null or check the length");
		}else {
			
			if(index<name.length) {
				name[index]=movieName;
				index++;
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
