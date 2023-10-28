package com.xworkz.test.things;

public class Coffeepowder {
	private String type;
	private int price;
	private float gram;
	
	public Coffeepowder() {
		System.out.println("no arguments constructor");
	}
	public Coffeepowder(String type,int price,float gram) {
		System.out.println("all arguments constructor");
		this.type=type;
		this.price=price;
		this.gram=gram;
	}
	public void setType(String type) {
		this.type=type;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setGram(float gram ) {
		this.gram=gram;
	}
	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}
	public float getGram() {
		return gram;
	}
	


}
