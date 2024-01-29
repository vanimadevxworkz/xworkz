package com.xworkz.comparable.driver;

import com.xworkz.comparable.Plan;

public class PlanRunner {

	public static void main(String[] args) {
		System.out.println("main method is running");
		 Plan plan=new Plan() {
			 //Anonymous class: means without any specific name
			 @Override
			 public void buildHome() {
				 System.out.println("this is buildHome Method");
			 }
			 
		 };
		 
		 plan.buildHome();
		 
		
	}
}
