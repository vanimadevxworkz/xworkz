package com.xworkz.test.things;

public class ProductName {
	int index=0;
	String[] productList=new String[4];
	 
	public void onSave(String productName) {
		System.out.println("productName:"+productName);
		if(index<productList.length) {
			 productList[index]=productName;//productList[0]=productName;
			 index++;//index=index+1// 0+1=1 //1+1=2
			 }else {
				 System.out.println("product list is full....");
			 		}
	}
	//reading elements from array
	public void getElements() {
		for(int i=0;i<productList.length;i++) {
			System.out.println("product name is:"+productList[i]);
		}
	}
}
