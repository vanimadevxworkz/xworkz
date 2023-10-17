package com.xworkz.test.driver;
import  com.xworkz.test.things.ProductName;


public class ProductNameRunner {
	public static void main(String args[]) {
		
		ProductName productName=new ProductName();
		productName.onSave("Monkey999");
		productName.onSave("Monkey555");
		productName.onSave("Monkey888");
		productName.onSave("Monkey777");
		
		productName.getElements();
	}
}
