package com.xworkz.food.runner;

import com.xworkz.food.repository.FoodRepoImplementation;
import com.xworkz.food.repository.FoodRepository;
import com.xworkz.food.service.FoodService;
import com.xworkz.food.service.FoodServiceImplementation;

public class FoodsRunner {
	
	public static void main(String[] args) {
		FoodRepository repository=new FoodRepoImplementation();
		
//		boolean save=repository.onSave("fridrice");
//		System.out.println(save);
		
		FoodService service=new FoodServiceImplementation(repository);
		
		service.ValidateAndSave("chicken biriyani");
		service.ValidateAndSave("ice cream");
	}

}
