package com.xworkz.Shopping.things;

public class Toy {
	private String name;
	private int price;
	private String type;
	private char size;
	private boolean isTeddy;
	
	
	public String toString() {
		System.out.println("to string method from toy....");
		 return "Pen:{name:"+name+
					""+"price:"+price+
					""+"type:"+type+
					""+"size:"+size+
					""+"isTeddy:"+isTeddy+
					"}";
	}
	
	public int hashCode() {
		System.out.println("hash code method");
		return 'a';
	}
	
        public boolean equals(Object obj) {
        	System.out.println("equlas method");
        	if(this==obj)
        		return true;
        	return false;
        }
}
