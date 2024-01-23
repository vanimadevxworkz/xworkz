package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("Civil");
		list.add("mechanical");
		list.add("cs");
		list.add("Aeronetic");
		list.add("chemical");
		list.add("Biotechnology engineering");
		list.add("Automobile");
		list.add("Software devloper");
		list.add("data science");
		list.add("Elctrical");
		
		list.add("Electrinic city");
		list.add("bhansankari");
		list.add("sarjapur road");
		list.add("WhiteField");
		list.add("devanahalli");
		list.add("indiranagra");
		list.add("jayanagra");
		list.add("rajajinagra");
		list.add("kormangala");
		list.add("hsr layout");
		list.add("sadashivanagara");
		list.add("malleswram");
		list.add("cooke town");
		list.add("btm layout");
		list.add("krpurum");
		list.add("trinity");
		list.add("dasrahalli");
		list.add("jalhalli");
		list.add("mgroad");
		list.add("deepanjalinagara");
		
		list.add("java");
		list.add("c");
		list.add("c++");
		list.add("python");
		list.add("visual basic");
		list.add(".net");
		list.add("javascript");
		list.add("sql");
		list.add("html");
		list.add("css");
		list.add("R");
		list.add("Swift");
		list.add("datascience");
		list.add("Ruby");
		list.add("PHP");
		list.add("Dart");
		list.add("logo");
		list.add("haskell");
		list.add("transct sql");
		list.add("bash");
		list.add("lisp");
		list.add("cybernet");
		list.add("data science");
		list.add("sap");
		list.add("powershell");
		list.add("cobol");
		list.add("fortran");
		list.add("lua");
		list.add("julia");
		list.add("sas");
		
//		for(String storeList:list) {
//			System.out.println(storeList);
//		}
//			
//	
//	List<List<String>> list1=new ArrayList<>();
//	list1.add(list);
//	//list1.add(subList);
		
		//using   Iterator methods
		
		Iterator<String> iterator=list.iterator();
		
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
