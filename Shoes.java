package com.xworkz.Shopping.things;

public class Shoes {
	private String brand;
	private int price=40;
	private char size;
	
	@Override
	public String toString() {
		System.out.println("this is to string method from shoes...");
		return "Shoes:{brand:"+brand+
		""+"price:"+price+
		""+"size:"+size+
		"}";
		}
	
	public int hashCode() {
		System.out.println("hash code method");
		return 'G';
		
		//appling logic 
		/*int number=(455%10)+2*2;
		return number;*/
	}
	
	public boolean equals(Object obj) {
		System.out.println("equals method");
		return true;
	}

}
