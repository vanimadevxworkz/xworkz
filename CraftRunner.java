package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Wastage;

public class CraftRunner {
	public static void main(String args[]) {
		Wastage wastage=new Wastage();
		wastage.getCraftInfo();
		wastage.getCraftType("bottelart");
		wastage.getCraftPrice(8);
		
	}}	


