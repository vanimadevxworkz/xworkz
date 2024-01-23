package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Movies2 {
	public static void main(String[] args) {
		List<String> movieList=new ArrayList<>();
		
		movieList.add("Mejestic");
		movieList.add("Dhurva");
		movieList.add("Ningoskra");
		movieList.add("Kitti");
		movieList.add("Kariya");
		movieList.add("Lalihadu");
		movieList.add("Niinandre ista");
		movieList.add("Lankesh patrike");
		movieList.add("Namma preetiya ramu");
		movieList.add("Dasa");
		movieList.add("Dahrma");
		movieList.add("Annavru");
		movieList.add("Dahrshn");
		movieList.add("Bhagvan");
		movieList.add("Kalasipalya");
		movieList.add("Sardra");
		movieList.add("Ayya");
		movieList.add("Swami");
		movieList.add("Mandya");
		movieList.add("Suntragali");
		movieList.add("Datta");
		movieList.add("Tangigagi");
		movieList.add("Jotejoteyali");
		movieList.add("Bhupati");
		movieList.add("Anatharu");
		movieList.add("Snehana pretina");
		movieList.add("I bandhna");
		movieList.add("Gaja");
		movieList.add("Indra");
		movieList.add("Arjun");
		movieList.add("Navagrha");
		movieList.add("Yodha");
		movieList.add("abhaya");
		movieList.add("Porki");
		movieList.add("Shourya");
		movieList.add("Bass");
		movieList.add("Prince");
		movieList.add("Sarthi");
		movieList.add("chinhgari");
		movieList.add("karntiveera sangollirayanna");
		movieList.add("Bulbul");
		movieList.add("Bhurndava");
		movieList.add("amberresh");
		movieList.add("Mr Iravata");
		movieList.add("Virat");
		movieList.add("Jaggudada");
		movieList.add("Chakravatrti");
		movieList.add("Tark");
		movieList.add("yajamana");
		movieList.add("katera");
		  
//		//System.out.println(movieList.contains("katera"));
//		 System.out.println(movieList.equals(movieList));
		
//		 //Using for each method
//		for(String list:movieList) {
//			System.out.println("movie list:"+list);
//			
//		}
//		System.out.println("total size:"+movieList.size());
//		System.out.println("sub list:"+movieList.subList(1, 10));
//		
//	   //System.out.println(movieList.equals("katera"));
//		
//		System.out.println(movieList.set(0, "kranti"));
//		System.out.println("set moive name:"+movieList);	
//		
//		System.out.println("contains:"+movieList.contains("katera"));
//		
//		movieList.clear();
//		System.out.println("clear all list:"+movieList);
//		
		//using iterator method
		
       
       Iterator<String> iterator=movieList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		iterator.forEachRemaining((s->System.out.println(s)));
		
		System.out.println("using remove method");
		iterator.remove();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
