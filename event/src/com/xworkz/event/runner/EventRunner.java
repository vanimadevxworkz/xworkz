package com.xworkz.event.runner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;

import com.xworkz.event.dto.EventDto;

public class EventRunner {
	
	public static void main(String[] args) {
		
		EventDto dto=new EventDto("5thAnniversry", "xxx", 10/2/2024);
		System.out.println("dto list:"+dto.toString());
		
		EventDto dto1=new EventDto("AnualDay", "YYY", 20/2/2024);
		System.out.println("dto list:"+dto1.toString());
		
		
         HashSet<EventDto> hashset=new HashSet<EventDto>();
		
		hashset.add(dto);
		hashset.add(dto);

		System.out.println(hashset);        
		 
		System.out.println(hashset.contains(dto));
		
		System.out.println(hashset.iterator());
		

		System.out.println(hashset.spliterator());
		

		System.out.println(hashset.size());
		

		System.out.println(hashset.remove(dto));
		System.out.println(hashset);
		
   
		hashset.clear();
		System.out.println("clear the set:"+hashset);
			
		
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		
		 linkedHashSet.spliterator();
		 System.out.println( linkedHashSet);
		 
		 
	}

	}


