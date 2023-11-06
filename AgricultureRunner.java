package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Soils;

public class AgricultureRunner {
	public static void main(String args[]) {
		Soils obj=new Soils();
		obj.cropName="corn";
		obj.totalTypes=4;
		obj.types="wheat";
		
	System.out.println("crope name is:"+obj.cropName);
	System.out.println("totaltypes are:"+obj.totalTypes);
	System.out.println("types name is:"+obj.types);
	
	System.out.println("place name is:"+obj.name);
	System.out.println("is good:"+obj.isGood);
	
	System.out.println("product name is:"+obj.productName);
	System.out.println("product types is:"+obj.productsTypes);
	System.out.println("quantity is:"+obj.quantity);
	
	System.out.println("soil name is:"+obj.soilsName);
	System.out.println("soils types:"+obj.totalTypes);
	
		//System.out.println("implements of hybrid inheritance in java");
	}

}
