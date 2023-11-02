package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Color;

public class PaintingRunner {
	public static void main(String bargs[]) {
		Color painting=new Color();
		painting.paintName="water paint";
		painting.setQuantity(20.0f);
		System.out.println("paint name is:"+painting.paintName);
		System.out.println("painting quantity:"+painting.getQuantity());
		
	}

}
