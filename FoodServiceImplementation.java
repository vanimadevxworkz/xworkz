package com.xworkz.food.service;

import com.xworkz.food.repository.FoodRepository;

public class FoodServiceImplementation implements FoodService {
	
	 private FoodRepository repository;
	 
	 public FoodServiceImplementation(FoodRepository repository) {
		 this.repository=repository;
	 }
	 

	@Override
	public boolean ValidateAndSave(String foodName) {
		if(foodName.isEmpty()
		||foodName.isBlank()
		||foodName.length()<3
		||foodName.length()>25
		||foodName==null
		) {
			System.out.println("give the correct foodname");
		}else {
			
			boolean save=repository.onSave(foodName);
			if(save) {
				System.out.println("added and validate name successfully");
				return true;
			}else {
				System.out.println("not added name is successfully");
				return false;
			}
		}
				return false;
	}
	
	

}
