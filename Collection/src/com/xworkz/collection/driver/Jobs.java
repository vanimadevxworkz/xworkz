package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Jobs {
	
	public static void main(String[] args) {
		List<String> jobList=new ArrayList<>();
		jobList.add("Developer");
		jobList.add("full stack Developer");
		jobList.add("back end Developer");
		jobList.add("front end Developer");
		jobList.add("Sql Developer");
		jobList.add("Dev oops");
		jobList.add("hacking");
		jobList.add("network admin");
		
//		//sorting
//		System.out.println("before sorting");
//		System.out.println(jobList);
//		
//		Collections.sort(jobList);
//		System.out.println("after sorting");
//		System.out.println(jobList);
//		 
		//using list of list method
		
		List<String> jobList1=new ArrayList<>();
		jobList1.add("Developer");
		jobList1.add("full stack Developer");
		jobList1.add("back end Developer");
		jobList1.add("front end Developer");
		jobList1.add("Sql Developer");
		jobList1.add("Dev oops");
		jobList1.add("hacking");
		jobList1.add("network admin");
		
		List<String> jobList2=new ArrayList<>();
		jobList2.add("Developer");
		jobList2.add("full stack Developer");
		jobList2.add("back end Developer");
		jobList2.add("front end Developer");
		jobList2.add("Sql Developer");
		jobList2.add("Dev oops");
		jobList2.add("hacking");
		jobList2.add("network admin");
		
		List<List<String>> list=new ArrayList<>();
		list.add(jobList);
		list.add(jobList1);
		list.add(jobList2);
		System.out.println(list);
		
		//in iterable method using forEach()
		list.forEach(s->System.out.println(s));
	
		
		Iterator<List<String>> iterator1=list.iterator();
		while(iterator1.hasNext()) {
			System.out.println("iterator list:"+iterator1.next());
			}
		//in iterator method using forEachRemaing()
		iterator1.forEachRemaining(s->System.out.println(s));
		
	}

}
