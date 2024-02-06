package com.xworkz.hospitals.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.hospitals.dto.HospitalDto;

public class HospitalRunner {
	public static void main(String[] args) {
		
		HospitalDto dto=new HospitalDto("sprsha", "benglore", 12);
		System.out.println(dto.toString());
		
		HospitalDto dto1=new HospitalDto("Shreedevi", "manglore", 15);
		System.out.println(dto1.toString());
		
		List<HospitalDto> list=new ArrayList<HospitalDto>();
		list.add(dto);
		list.add(dto1);
		System.out.println(list);
		
		System.out.println(list.contains(dto));
		
		System.out.println(list.equals(list));
		
		System.out.println(list.indexOf(dto));
		
		System.out.println(list.lastIndexOf(dto));
		
		System.out.println(list.get(1));
		
		System.out.println(list.iterator());
		
		System.out.println(list.listIterator());
		
		System.out.println(list.listIterator(0));
		
		System.out.println(list.set(1, dto1));
		
		System.out.println(list.spliterator());
		
		System.out.println(list.subList(0, 1));
		
		System.out.println(list.size());
		
		System.out.println(list.remove(dto1));
		
		//list.clear();
		//System.out.println("clear the set:"+list);
		
		ListIterator listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			//System.out.println(" previous index number:"+listIterator.previousIndex());//-1
			
			System.out.println("index number:"+listIterator.nextIndex());
			
			System.out.println("next element:"+listIterator.next());
			
			System.out.println(" previous index number:"+listIterator.previousIndex());//0
			
			listIterator.set(dto);
			System.out.println("set the dto:"+dto1);
			
			listIterator.remove();
			System.out.println("remove the  method");
			
		
//	if(listIterator.hasPrevious()) {
//			System.out.println("next element:"+listIterator.previous());
//			
//		}
		}
	}

}
