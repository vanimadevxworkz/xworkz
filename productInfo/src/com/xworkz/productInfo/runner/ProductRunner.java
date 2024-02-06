package com.xworkz.productInfo.runner;

import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.productInfo.dto.ProductDto;

public class ProductRunner {

	
	public static void main(String[] args) {
		ProductDto dto=new ProductDto("Medicine", 20, 1);
		System.out.println("dto is:"+dto.toString());
		
		ProductDto dto1=new ProductDto("Tablets", 10, 2);
		System.out.println("dto is:"+dto1.toString());
		
		
		LinkedList<ProductDto> linkedList=new LinkedList<ProductDto>();
		linkedList.add(dto);
		linkedList.add(dto1);
		System.out.println("list of dto:"+linkedList);
		
		linkedList.addFirst(dto);
		System.out.println("add the fisrt:"+linkedList);
		
		linkedList.addLast(dto1);
		System.out.println("lsat name:"+linkedList);
		
		System.out.println("clone the list:"+linkedList.clone());
		
		System.out.println("check the contains:"+linkedList.contains(dto));
		
		System.out.println("get value:"+linkedList.get(2));
		
		System.out.println("get the first value:"+linkedList.getFirst());
		
		System.out.println("get last:"+linkedList.getLast());
		
		System.out.println("heck index of:"+linkedList.indexOf(dto1));
		
		System.out.println("last index of:"+linkedList.lastIndexOf(dto));
		
		System.out.println("offer:"+linkedList.offer(dto));
		
		System.out.println(linkedList.offerFirst(dto));
		
		System.out.println(linkedList.peek());
		
		System.out.println(linkedList.peekFirst());
		
		System.out.println(linkedList.peekLast());
		
		System.out.println(linkedList.poll());
		
		System.out.println(linkedList.pollFirst());
		
		System.out.println(linkedList.remove());
		
		System.out.println(linkedList.set(1, dto));
		System.out.println(linkedList);
		
		System.out.println("size of a linked list:"+linkedList.size());
		
		System.out.println(linkedList.descendingIterator());
		
		System.out.println(linkedList.listIterator(2));
		
		System.out.println(linkedList.spliterator());
		
		System.out.println(linkedList.toArray());
		 
		linkedList.push(dto1);
		System.out.println(linkedList);
		
//		linkedList.clear();
//		System.out.println("clear the movi list:"+linkedList);
//		
		
		ListIterator listIterator=linkedList.listIterator();
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

