package com.xworkz.Shopping.things;

public class Pen {
	private String name="Bright";
	private int price=5;
	private String types="blue";
	private boolean isBlue=true;
	
	public String toString() {
		System.out.println("to string method from prn....");
	 return "Pen:{name:"+name+
				""+"price:"+price+
				""+"types:"+types+
				""+"isBlue:"+isBlue+
				"}";
	}
	@Override
	public int hashCode() {
		System.out.println("hash code method");
		return 65;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method");
		return false;
	}
			
}
	


