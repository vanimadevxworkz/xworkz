package com.xworkz.comparable.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.Flowers;

public class FlowersRunner {
	
	public static void main(String[] args) {
		
		Flowers flower=new Flowers("Rose",30,"red");
		
		List<Flowers> listOfFlower=new ArrayList<>();
		listOfFlower.add(flower);
		//we can create object this type also
		listOfFlower.add(new Flowers("Jasmin",25,"white"));
		listOfFlower.add(new Flowers("sunFlower",10,"yellow"));
		
		Collections.sort(listOfFlower);
		System.out.println("list Of Flower is:"+listOfFlower);
		
	}

}
