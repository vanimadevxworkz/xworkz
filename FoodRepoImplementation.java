package com.xworkz.food.repository;

public class FoodRepoImplementation implements FoodRepository {
	
	 
    private String[] name=new String[3];
     private  int index=0;
   
	public String[] getName() {
	return name;
}
	@Override
	public boolean onSave(String foodName) {
		if(name==null||index>=name.length) {
			System.out.println("name is null or check length");
		}else {
			
			if(index<name.length) {
				name[index]=foodName;
				index++;
				System.out.println("food name is saved");
				return true;
			}
		}
		return false;
	}
	

}
