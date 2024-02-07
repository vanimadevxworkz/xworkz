package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class Jobportal {
	
	public static void main(String[] args) {
		Collection<String> jobportal=new ArrayList<String>();
		jobportal.add("LinkedIn");
		jobportal.add("Naukri");
		jobportal.add("Indeed");
		jobportal.add("JobSearch");
		jobportal.add("Apna");
		System.out.println("job list:"+jobportal);
		
		System.out.println("size of the collection:"+jobportal.size());
		
		Iterator<String> iterator=jobportal.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("next elemnt:"+iterator.next());
		}
		
		iterator.forEachRemaining(s->System.out.println(s));
		
		Stream<String> stream=jobportal.stream();
		System.out.println(stream.count());
		
		stream.close();
		System.out.println("close the stream:"+stream);

	}

}
