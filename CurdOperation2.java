package com.xworkz.interview.things;

public class CurdOperation2 {

	int index=0;
	
	int[] curdList=new int[2];
	
	public void insert(int rates) {
		System.out.println("rate is:"+rates);
		if(index<curdList.length) {
			curdList[index]=rates;
			index++;
			
		}else {
			System.out.println("curd list is full...");
		}
	}
	
	public void read() {
		for(int i=0;i<curdList.length;i++) {
			System.out.println("curd list:"+curdList[i]);
		}
	}
	
	public void getUpdate(int oldRate,int newRate) {
		for(int i=0;i<curdList.length;i++) {
			if(curdList[i]==oldRate) {
				curdList[i]=newRate;
			}else {
				System.out.println("not exists...");
				break;
			}
		}
	}
	public void getDelete(int rate) {
		for(int i=0;i<curdList.length;i++) {
			if(curdList[i]==rate) {
				curdList[i]=50;
			}else {
				System.out.println("rate is not found");
				break;
			}
		}
	}
}
