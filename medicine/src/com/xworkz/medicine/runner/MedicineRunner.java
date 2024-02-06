package com.xworkz.medicine.runner;

import java.util.ArrayList;
import java.util.ListIterator;

import com.xworkz.medicine.dto.MedicineDto;

public class MedicineRunner {
	
	public static void main(String[] args) {
		MedicineDto dto=new MedicineDto("Dolo650", 5, 8);
		System.out.println("dto list:"+dto.toString());
		
		MedicineDto dto1=new MedicineDto("Cipla", 2, 6);
		System.out.println("dto list:"+dto1.toString());
		
		ArrayList<MedicineDto> arrayList=new ArrayList<MedicineDto>();
		arrayList.add(dto);
		arrayList.add(dto1);
		System.out.println(arrayList);
		
		System.out.println(arrayList.contains(dto1));
		
		System.out.println(arrayList.equals(arrayList));
		
		System.out.println(arrayList.indexOf(dto1));
		
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.get(1));
		
		System.out.println(arrayList.iterator());
		
		System.out.println(arrayList.listIterator());
		
		System.out.println(arrayList.listIterator(0));
		
		System.out.println(arrayList.set(1, dto1));
		
		System.out.println(arrayList.spliterator());
		
		System.out.println(arrayList.subList(0, 1));
		
		System.out.println(arrayList.subList(0, 1));
		
		arrayList.forEach(s->System.out.println(s));
		
		System.out.println(arrayList.remove(dto1));
		
		//arrayList.clear();
		//System.out.println("clear the list:"+arrayList);
		
		ListIterator listIterator=arrayList.listIterator();
		while(listIterator.hasNext()) {
			//System.out.println(" previous index number:"+listIterator.previousIndex());//-1
			
			System.out.println("index number:"+listIterator.nextIndex());
			
			System.out.println("next element:"+listIterator.next());
			
			System.out.println(" previous index number:"+listIterator.previousIndex());//0
			
			listIterator.set(dto);
			System.out.println("set the dto:"+dto1);
			
			listIterator.remove();
			System.out.println("remove the  method");
			
		
	if(listIterator.hasPrevious()) {
			System.out.println("next element:"+listIterator.previous());
		
	}
		}
		
	}

}
