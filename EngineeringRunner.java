package com.xworkz.test.driver;

import com.xworkz.test.things.Engineering;

public class EngineeringRunner {
	public static void main(String args[]) {
		Engineering engineering=new Engineering();
		engineering.save("comuterScience");
		engineering.save("mechanical");
		engineering.save("electronic");
		engineering.save("civil");
		engineering.save("aeronatic");
		
		engineering.read();
		
		engineering.update("mechanical","merin");
		engineering.read();
		System.out.println("it is updated");
		
		engineering.delet("civil");
		engineering.read();
		System.out.println("it is deleted");
		
		
	}

}
