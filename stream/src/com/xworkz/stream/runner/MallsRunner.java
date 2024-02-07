package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class MallsRunner {
	
	public static void main(String[] args) {
		Collection<String> mallsList=new ArrayList<String>();
		
		mallsList.add("LULU mall");
		mallsList.add("orian");
		mallsList.add("UBCity");
		mallsList.add("Pinoxy");
		mallsList.add("forum");
		mallsList.add("veghacity");
		
		System.out.println("list mall:"+mallsList);
		System.out.println("size of the collection:"+mallsList.size());
		
		Iterator<String>iterator=mallsList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("naex element:"+iterator.next());
		}
		
		iterator.forEachRemaining(s->System.out.println(s));
		
		Stream<String>stream=mallsList.stream();
		
		System.out.println("total count:"+stream.count());
		
		stream.close();
		System.out.println("close the stream:"+stream);
	}

}
