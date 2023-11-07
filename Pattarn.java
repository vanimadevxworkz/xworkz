package com.xworkz.Shopping.things;

public class Pattarn extends Sand {

	@Override
	public void getArtInfo() {
		System.out.println("added new method infomation");
	}
	@Override
	public void getName(String artName) {
		System.out.println("this method art name infomation");
	}
	
	@Override
	public void getArtType(int totalItem) {
		System.out.println("this is totalItem infomation metod");
	}
}
