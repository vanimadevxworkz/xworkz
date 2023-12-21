package com.xworkz.state.repository;

public class StateRepoImpl implements StateRepository {

	private String[] name=new String[5];
	private int index=0;
	
	
	public String[] getName() {
		return name;
	}




	@Override
	public boolean onSave(String stateName) {
		if(name==null||index>=name.length) {
			System.out.println("name is null or check the length");
			return true;
		}else {
			if(index<name.length) {
				name[index]=stateName;
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
	
	






