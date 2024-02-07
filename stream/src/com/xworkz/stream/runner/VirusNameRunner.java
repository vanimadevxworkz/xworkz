package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;


public class VirusNameRunner {
	
	public static void main(String[] args) {
		Collection<String> virusList=new ArrayList<String>();
		virusList.add("Carona");
		virusList.add("HIV");
		virusList.add("dengue");
		virusList.add("Maleria");
		virusList.add("HEV");
		
		System.out.println("list virus names:"+virusList);
		
		System.out.println("total size:"+virusList.size());
		
		Iterator<String> iterator=virusList.iterator();
		
		iterator.forEachRemaining(s->System.out.println(s));
		while(iterator.hasNext()) {
			System.out.println("next element:"+iterator.next());
		}
		
		Stream<String>stream=virusList.stream();
		System.out.println("count:"+stream.count());
		
		stream.close();
		System.out.println("close the stream:"+stream);
	}

}
