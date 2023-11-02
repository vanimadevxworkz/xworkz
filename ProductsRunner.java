package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Ecommerce;
public class ProductsRunner {
	public static void main(String[] args) {
		 Ecommerce e=new Ecommerce();
		 
		 e.setProductname("xx");
		 e.setPrice(450);
		 e.setQuality(9.0f);
		 e.setStores("vv");
		 
		 System.out.println(e.getProductname());
		 System.out.println(e.getQuality());
		 System.out.println(e.getQuality());
		 System.out.println(e.getStores());
		 
		 
	}
	

}
