package com.xworkz.Shopping.things;

public class Vehical {
	public String name;
	public int price;
	
	public class Car{
		public String carName;
		public int price;
		public char size;
		
		public Car(){
			this("benz",70000,'l');
			System.out.println("this is default constructor");
		}
		public Car(String carName,int price,char size) {
			System.out.println("this is all args constructor");
			this.carName=carName;
			this.price=price;
			this.size=size;
		}
		
		
	}

}
