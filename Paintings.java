package com.xworkz.Shopping.things;

public class Paintings extends Art {
	@Override
	public void getArtInfo() {
		System.out.println("added new method infomation");
	}
	
	public void getName(String artName) {
		System.out.println("this method art name infomation");
	}
	public void getArtType(int totalItem) {
		System.out.println("this is totalItem infomation metod");
	}


}
