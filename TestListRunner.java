package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collection;

public class TestListRunner {
	
	public static void main(String[] args) {
		
		Collection<String> collection=new ArrayList<String>();
		collection.add("Java");
		collection.add("Sql");
		collection.add("Jdbc");
		collection.add("HTML");
		collection.add("CSS");
		//add method
		System.out.println("add all the collection:"+collection);
		//check the contains
		System.out.println("contains:"+collection.contains("Sql"));
		//equals
		System.out.println("check the equals:"+collection.equals(collection));
		//size()
		System.out.println("size of collection:"+collection.size());
		//forEach ()
		collection.forEach(s->System.out.println(s));
		//remove
		collection.remove("CSS");
		System.out.println("remove the collections:"+collection);
		
		System.out.println("hash code:"+collection.hashCode());
		
		
		System.out.println("check the is empty:"+collection.isEmpty());
		
		
		System.out.println("chek the iterator:"+collection.iterator());
		
		System.out.println("check the parallel stream:"+collection.parallelStream());
		
		
		System.out.println("spilterator:"+collection.spliterator());
		
		System.out.println("stream:"+collection.stream());
		
		System.out.println("to array:"+collection.toArray());
		
		collection.clear();
		System.out.println("clear the collection:"+collection);
	}

}
