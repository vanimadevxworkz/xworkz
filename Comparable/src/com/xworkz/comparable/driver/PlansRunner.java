package com.xworkz.comparable.driver;

import com.xworkz.comparable.Plan;

public class PlansRunner {

	public static void main(String[] args) {
		System.out.println("main method is running");
		//lambda expression
		Plan plan=()->{
			
			System.out.println("this is build home method");
		};
		
		plan.buildHome();
	}
}
