package com.xworkz.test.things;

public class SoftWareNames {
	 int index=0;
	 String[] softWaresList=new String[6];
	 
	 public void getNames(String names) {
		// System.out.println("names ars:"+names);
		 if(index<softWaresList.length) {
			 softWaresList[index]=names;
			 index++;
		 }else {
			 System.out.println("list is full..");
			 
		 }
	 }
	  public void getList() {
		  for(int i=0;i<softWaresList.length;i++) {
			  System.out.println("softWare list are:"+softWaresList[i]);
		  }
	  }

}
