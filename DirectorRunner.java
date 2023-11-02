package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Movie;

public class DirectorRunner {
	public static void main(String args[]) {
		Movie director=new Movie();
		director.setName("daali");
		director.setFilmName("tagrupalya");
		director.setEducation("engineer");
		director.setSalary(10000);
		
		String name=director.getName();
		System.out.println("director name is:"+name);
		
		String filmName=director.getFilmName();
		System.out.println("film name is:"+filmName);
		
		String education=director.getEducation();
		System.out.println("education is:"+education);
		
		int salary=director.getSalary();
		System.out.println("salary is:"+salary);
	}

}
