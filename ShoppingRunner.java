package com.xworkz.test.driver;

import com.xworkz.test.things.Shopping;

public class ShoppingRunner {
		public static void main(String[] args) {	
			
			String[] names=Shopping.getNames();
			for(int i=0;i<names.length;i++) {
				System.out.println(names[i]);
			}
			double[] rate=Shopping.getRate();
			for(int i=0;i<rate.length;i++) {
				System.out.println(rate[i]);
			}
			boolean[] payment=Shopping.getPayment();
			for(int i=0;i<payment.length;i++) {
				System.out.println(payment[i]);
			}
			char[] size=Shopping.getSize();
			for(int i=0;i<size.length;i++) {
				System.out.println(size[i]);
			}
			int[] number=Shopping.getNumbers();
			for(int i=0;i<number.length;i++) {
				System.out.println(number[i]);
			}
			
		}


}
