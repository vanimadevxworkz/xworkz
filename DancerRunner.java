package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Person;

public class DancerRunner {
	public static void main(String args[]) {
		Person dancer=new Person();
		dancer.setName("vanii");
		dancer.setDancePlace("Tengingundi");
		dancer.setSalary(1200);
		dancer.setKatakali(true);
		 
		String name=dancer.getName();
		System.out.println("name is:"+name);
		
		String dancePlace=dancer.getDancePlace();
		System.out.println("place is:"+dancePlace);
		 
		int salary=dancer.getSalary();
		System.out.println("salary is:"+salary);
		
		boolean isKatakali=dancer.isKatakali();
		System.out.println("is katakali:"+isKatakali);
		
	}

}
