package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Vehical;
import com.xworkz.Shopping.things.Vehical.Car;

public class VehicalRunner {
	public static void main(String args[]) {
		Vehical vehical=new Vehical();
		vehical.name="car";
		
	System.out.println("vehical name is:"+vehical.name);
	
	Car car=vehical.new Car();
	System.out.println("assining properties from inner class");
	car.carName="benz";
	car.price=7000;
	car.size='l';
	System.out.println("car name is:"+car.carName);
	System.out.println("car price is:"+car.price);
	System.out.println("car size is:"+car.size);
	
	
	}

}
