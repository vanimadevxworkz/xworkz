package com.xworkz.test.driver;

import com.xworkz.test.things.Sweet;

public class SweetRunner {
	public static void main(String args[]) {
		Sweet sweet=new Sweet();
		System.out.println(sweet.name);
		System.out.println(sweet.totalSweet);
		System.out.println(sweet.price);
		System.out.println(sweet.bakeryName);
		System.out.println(sweet.totalBill);
		 
		Sweet sweet1=new Sweet();
		sweet1.name="peda";
		sweet1.totalSweet=15;
		sweet1.price=20;
		sweet1.bakeryName="durga";
		sweet1.totalBill=500;
		 System.out.println(sweet1.name); 
			System.out.println(sweet1.totalSweet);
			System.out.println(sweet1.price);
			System.out.println(sweet1.bakeryName);
			System.out.println(sweet1.totalBill);
		
			Sweet sweet2=new Sweet();
			sweet2.name="laddu";
			sweet2.totalSweet=30;
			sweet2.price=10;
			sweet2.bakeryName="vani";
			sweet2.totalBill=300;
			 System.out.println(sweet2.name);
				System.out.println(sweet2.totalSweet);
				System.out.println(sweet2.price);
				System.out.println(sweet2.bakeryName);
				System.out.println(sweet2.totalBill);
				
				Sweet sweet3=new Sweet();
				sweet3.name="laddu";
				sweet3.totalSweet=30;
				sweet3.price=10;
				sweet3.bakeryName="vani";
				sweet3.totalBill=300;
				 System.out.println(sweet3.name);
					System.out.println(sweet3.totalSweet);
					System.out.println(sweet3.price);
					System.out.println(sweet3.bakeryName);
					System.out.println(sweet3.totalBill);
					
					Sweet sweet4=new Sweet();
					System.out.println(sweet4.name);
					System.out.println(sweet4.totalSweet);
					System.out.println(sweet4.price);
					System.out.println(sweet4.bakeryName);
					System.out.println(sweet4.totalBill);
					 
					new Sweet();
					
					new Sweet("holige",40,(short)5,"prasad",1000);
					
	}
}
