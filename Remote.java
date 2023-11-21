package com.xworkz.Shopping.things;

public class Remote {
	private String model="xxx";
	private int price;
	private char size;
	private boolean isModelIsGood;
	private String company;
	private float discount;
	
	
	public String toString() {
		System.out.println("to string method from remote....");
		return "Remote:{model:"+model+
				""+"price:"+price+
				""+"company:"+company+
				""+"size:"+size+
				""+"discount:"+discount+
				""+"isModelIsGood:"+isModelIsGood+
				"}";
	}
	
	public int hashCode() {
		System.out.println("this is hash code method");
		return 'd';
	}
	
	public boolean equals(Object obj) {
		System.out.println("this is equals method");
		if(this==obj)
			return false;
		if(this==null)
			return true;
		Remote r=(Remote)obj;
		if(r instanceof Remote)
			return true;
		if(this.model.equals(r.model))
			return false;
		return true;
	}

}
