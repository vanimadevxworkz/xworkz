package com.xworkz.festival.repository;

public class FestivalRepoImpl implements FestivalRepository {
 
	
	  private String[] names=new String[10];
	  private int index=0;
	  
	  
	public String[] getNames() {
		return names;
	}
	
	@Override
	public boolean onSave(String name) {
		if(names==null&&index>=names.length) {
			System.out.println("name is null or check the length");
		}else {
			
			if(index<names.length) {
				names[index]=name;
				index++;
				return true;
			}
		}
		return false;
	}
	@Override
	public String[] read() {
		return names;
	}
	@Override
	public boolean update(String oldName, String newName) {
			for(int i=0;i<names.length;i++) {
	     	if(names[i]!=null) {
				if(names[i].equalsIgnoreCase(oldName)) {
				names[i]=newName;
				return true;
			}
		}
				}
			
		return false;
	}
	@Override
	public boolean delete(String name) {
			for(int i=0;i<names.length;i++) {
				if(names[i]!=null) {
					if(names[i].equalsIgnoreCase(name)) {
						names[i]=null;
						return true;
					}
					
				}
			}
		
		return false;
	}

}
