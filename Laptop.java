package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Laptop {
	
	public static void main(String[] args) {
		List<String> companyList=new ArrayList<>();
		companyList.add("Apple");
		companyList.add("Dell");
		companyList.add("Hp");
		companyList.add("Samsung");
		companyList.add("Lenova");
		companyList.add("asus");
		companyList.add("Lg");
		companyList.add("microsoft");
		
		
		//using contains
		companyList.contains(companyList);
		System.out.println("contains:"+companyList);
		
		//using for each
		for(String list:companyList) {
	    System.out.println("total names:"+list);
		}
		
		System.out.println("last index:"+companyList.lastIndexOf("Lenova"));
		
		    //use sorting method
		  	System.out.println("before sorting:"+companyList);
				
			Collections.sort(companyList);
			System.out.println("after sorting:"+companyList);
			System.out.println(companyList);
				
			//remove method	
			System.out.println(companyList.remove("Lenova"));
			System.out.println(companyList);
		
		
		//Using list of list method
		List<String> companyList1=new ArrayList<>();
		companyList1.add("Apple");
		companyList1.add("Dell");
		companyList1.add("Hp");
		companyList1.add("Samsung");
		companyList1.add("Lenova");
		companyList1.add("Asus");
		companyList1.add("Lg");
		companyList1.add("Microsoft");
		
		List<String> companyList2=new ArrayList<>();
		companyList2.add("Apple");
		companyList2.add("Dell");
		companyList2.add("Hp");
		companyList2.add("Samsung");
		companyList2.add("Lenova");
		companyList2.add("Asus");
		companyList2.add("Lg");
		companyList2.add("Microsoft");
		
		List<List<String>> listOfList=new ArrayList<>();
		listOfList.add(companyList);
		listOfList.add(companyList1);
		listOfList.add(companyList2);
		System.out.println("using list of list:"+listOfList);
		
		listOfList.forEach(s->System.out.println(s));
		
		//using all iterator methods
		Iterator<List<String>> iterator1=listOfList.iterator();
		while(iterator1.hasNext()) {
			System.out.println("iteartor list:"+iterator1.next());
		}
		iterator1.forEachRemaining(s->System.out.println(s));
		
		System.out.println("remove methods");
		iterator1.remove();
		//System.out.println(companyList);
		
		
	}

}
