package com.xworkz.test.things;

public class Color {
public String colorName;

public Color() {
	System.out.println("this is default arguments");
}
public Color(String colorName) {
	System.out.println("this is parameterized constructor");
		this.colorName=colorName;
	}
 public void getColorName(String...colorName) {
	 System.out.println("colorname is:"+colorName.length);
	 for(int i=0;i<colorName.length;i++) {
		 System.out.println(colorName[i]);
	 }
 }

	
}
