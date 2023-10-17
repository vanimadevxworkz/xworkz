package com.xworkz.test.things;

public class Engineering {

	int index=0;
	String[] branchName=new String[5];
	 public void save(String name) {
		 if(index<branchName.length) {
			 branchName[index]=name;
			 index++;
		 }else {
			 System.out.println("branchName is full....");
		 }
	 }
	 public void read() {
		 for(int i=0;i<branchName.length;i++) {
			 System.out.println("branchNames are:"+branchName[i]);
		 }
	 }
	 public void update(String oldName,String newName) {
		 for(int i=0;i<branchName.length;i++) {
			 if(branchName[i]==oldName) {
				 branchName[i]=newName;
				 System.out.println("Not Existing....");
				 break;
				 
			 }
		 }
	 }
	 public void delet(String name) {
		 for(int i=0;i<branchName.length;i++) {
			 if(branchName[i]==name) {
				 branchName[i]="EC";
			 }
			 if(i==(branchName.length-1)&&branchName[i]!=name) {
				 System.out.println("not existing....");
			 }
		 }
	 }
}
