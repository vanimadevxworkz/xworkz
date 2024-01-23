package com.xworkx.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenNumbers {
	
	public static void main(String[] args) {
		List<Integer> evenNumber=new ArrayList<>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(8);
		evenNumber.add(10);
		evenNumber.add(12);
		evenNumber.add(14);
		evenNumber.add(16);
		evenNumber.add(18);
		evenNumber.add(20);
		
		System.out.println(evenNumber);
		
		System.out.println(evenNumber.contains(10));
		
		Collections.sort(evenNumber);
		System.out.println("After sorting");
		System.out.println(evenNumber);
		
		System.out.println("display the even number of its multiple of 6");
		
	}

}
