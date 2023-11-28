package com.xworkz.interview.things;

public class CurdOperation {
	int index=0;
	
	char[] size=new char[3];
	
	public void onSave(char cloth) {
		System.out.println("size of the array is:"+cloth);
		
		if(index<size.length) {
			size[index]=cloth;
			index++;
		}else {
			System.out.println("size is full....");
		}
	}
	
	public void getRead() {
		for(int i=0;i<size.length;i++) {
			System.out.println("cloth size is:"+size[i]);
		}
	} 
	
	public void getUpdate(char oldSize,char newSize) {
		for(int i=0;i<size.length;i++) {
			if(size[i]==oldSize) {
				size[i]=newSize;
			}else {
				System.out.println("array size is not exists...");
				break;
			}
		}
	}
	
	public void getDelete(char cloth) {
		for(int i=0;i<size.length;i++) {
			if(size[i]==cloth) {
				size[i]='l';
			}else {
				System.out.println("size is not found");
				break;
			}
		}
	}
	

}
