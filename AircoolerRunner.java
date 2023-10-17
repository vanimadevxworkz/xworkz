package com.xworkz.test.driver;

import com.xworkz.test.things.Aircooler;

public class AircoolerRunner {
		public static void main(String args[]) {
			Aircooler aircooler=new Aircooler();
			aircooler.price=3000;
			aircooler.brand="symphony";
			aircooler.speed="capacity"; 
			aircooler.temp=26.0;
			aircooler.implNumber=34567l;
			//aircooler.priceDiscount=100;
			
			{
				if(aircooler.price==1000) {
					System.out.println("aircooler price is equal to 1000");}
					else {
						System.out.println("price is not equal to 1000");
					}
					if(aircooler.price<=2000 && aircooler.price>=1000) {
						System.out.println(aircooler.price);
						System.out.println(aircooler.brand);
						System.out.println(aircooler.speed);
						System.out.println(aircooler.temp);
						System.out.println(aircooler.implNumber);
						//System.out.println(aircooler.priceDiscount);
						
							} 
						double totalPrice=3000;
						double discount=(3000*10/100);
	                    totalPrice=3000-100;//price-discount;
						System.out.println(totalPrice);
			System.out.println(aircooler.price);
			System.out.println(aircooler.brand);
			System.out.println(aircooler.speed);
			System.out.println(aircooler.temp);
			System.out.println(aircooler.implNumber);
			//System.out.println(aircooler.priceDiscount);
			}
		}
}
