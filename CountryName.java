package com.xworkz.test.things;

public class CountryName {
int index=0;
String[] countryName=new String[4];
 public void save(String name) {
	 if(index<countryName.length) {
		 countryName[index]=name;
		 index++;
	 }else {
		 System.out.println("list is full.....");
	 }
 }
 public void read() {
	 for(int i=0;i<countryName.length;i++) {
		 System.out.println("countryName are:"+countryName[i]);
	 }
 }
 public void update(String oldName,String newName) {
	 for(int i=0;i<countryName.length;i++) {
		 if(countryName[i]==oldName) {
			 countryName[i]=newName;
			 System.out.println("not existing......");
			 break;
		 }
	 }
 }
 public void delet(String name) {
	 for(int i=0;i<countryName.length;i++) {
		 if(countryName[i]==name) {
			 countryName[i]="china";
		 }
	 if(i==(countryName.length-1)&&countryName[i]!=name) {
		 System.out.println("not existing.....");
	 }
	 }
 }
}
