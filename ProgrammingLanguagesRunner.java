package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Highlevel;

public class ProgrammingLanguagesRunner {
	
	public static void main(String[] args) {
		
		Highlevel e=new Highlevel();
		e.setName("java");
		e.setTotalLanguages(20);
		e.setLanguages(true);
		e.setFoundert("jg");
		
		System.out.println(e.getName());
		System.out.println(e.getTotalLanguages());
		System.out.println(e.getFoundert());
		System.out.println(e.isLanguages());
	}
}
