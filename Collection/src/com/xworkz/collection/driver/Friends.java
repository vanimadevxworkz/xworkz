package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Friends {
	public static void main(String[] args) {
		List<String> friendsName=new ArrayList<>();
		friendsName.add("uma");
		friendsName.add("priyanka");
		friendsName.add("Moni");
		friendsName.add("Hita");
		friendsName.add("Bhavya");
		friendsName.add("Bhagya");
		
		//using all list methods
		System.out.println(friendsName);
		
		for(String list:friendsName) {
			System.out.println(friendsName);
		}
		
		System.out.println("check the contains:"+friendsName.contains("Hita"));
		
		System.out.println("set the name:"+friendsName.set(2, "Hema"));
		System.out.println(friendsName);
		
		System.out.println(friendsName.equals("Hita"));
		
		System.out.println(friendsName.subList(3, 5));
		
		friendsName.remove("Moni");
		System.out.println(friendsName);
		
		//using all iterator methods
		Iterator<String> iterator=friendsName.iterator();
		
		System.out.println("using iterator methods:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		iterator.forEachRemaining(s->System.out.println(s));
		
		System.out.println("using remove method");
		iterator.remove();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//using sort method
		System.out.println("before sorting");
		Collections.sort(friendsName);
		System.out.println("After sorting");
		System.out.println(friendsName);
			
		
		
		
		
	}

}
