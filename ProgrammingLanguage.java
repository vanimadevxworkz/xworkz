package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgrammingLanguage {
	private String name;
	private String foundert;
	private int totalLanguages;
	private boolean isLanguages;
	
	public ProgrammingLanguage() {
		System.out.println("this is parent class");
		
	}

}
