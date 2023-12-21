package com.xworkz.software.repository;

public class SoftwareRepoImpl implements SoftwareRepository {

	 
	private String[] name=new String[5];
	private int index=0;
	
	
	public String[] getName() {
		return name;
	}

	@Override
	public boolean onSave(String softwareName) {
		if(name==null||index>=name.length) {
			System.out.println("to check the length or name is null");
			
		}else {
			if(index<name.length) {
				name[index]=softwareName;
				index++;
				System.out.println("software name is saved");
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
