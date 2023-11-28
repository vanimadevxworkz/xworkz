package com.xworkz.interview.things;

public class Curd3 {
		int index=0;
		
		double[] curdList=new double[2];
		
		public void getInsert(double rate) {
			System.out.println("rate is:"+rate);
			if(index<curdList.length) {
				curdList[index]=rate;
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
		
		public void getUpdate(double oldRate,double newRate) {
			for(int i=0;i<curdList.length;i++) {
				if(curdList[i]==oldRate) {
					curdList[i]=newRate;
				}else {
					System.out.println("not exists...");
					break;
				}
			}
		}
		public void getDelete(double rate) {
			for(int i=0;i<curdList.length;i++) {
				if(curdList[i]==rate) {
					curdList[i]=25.0;
				}else {
					System.out.println("rate is not found");
					break;
				}
			}
		}
	}



