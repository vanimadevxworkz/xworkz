package com.xworkz.test.things;

public class IplTeam {
	int index=0;
	String[] teamName=new String[4];
	 public void save(String name) {
		 if(index<teamName.length) {
			 teamName[index]=name;
			 index++;
		 }else {
			 System.out.println("list is full.....");
		 }
	 }
	 public void read() {
		 for(int i=0;i<teamName.length;i++) {
			 System.out.println("teamName is:"+teamName[i]);
		 }
	 }
	 public void update(String oldName,String newName) {
		 for(int i=0;i<teamName.length;i++) {
			 if(teamName[i]==oldName) {
				 teamName[i]=newName;
				 System.out.println("not existing......");
				 break;
			 }
		 }
	 }
	 public void delet(String name) {
		 for(int i=0;i<teamName.length;i++) {
			 if(teamName[i]==name) {
				teamName[i]="Delhi capitals";
			 }
		 if(i==(teamName.length-1)&&teamName[i]!=name) {
			 System.out.println("not existing.....");
		 }
		 }
	 }
	}



