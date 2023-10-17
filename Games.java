package com.xworkz.test.things;

public class Games {
	int index=0;
	String []gamesName=new String[6];
	
	public void onSave(String name) {
		if(index<gamesName.length) {
			gamesName[index]=name;
			index++;
		}else {
			System.out.println("names is full....");
		}
	}
	//update the elements of array
	public void read(){
		for(int i=0;i<gamesName.length;i++) {
			System.out.println("name of the games:"+gamesName[i]);
		}
		
	}
	public void update(String oldElement,String newElement) {
		for(int i=0;i<gamesName.length;i++) {
			if(gamesName[i]==oldElement) {
				gamesName[i]=newElement;
				System.out.println("not existing.....");
				break;
			}
		}
	}
	public void delet(String element) {
		for(int i=0;i<gamesName.length;i++) {
			if(gamesName[i]==element) {
				gamesName[i]=null;
			}
			/*else {
				System.out.println("element is not found...");//two statments are same
				break;*/
			
			if(i==gamesName.length-1 &&gamesName[i]!=element){
				System.out.println("not exist");
				
			}
		}
	}
}
	
	

