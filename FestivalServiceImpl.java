package com.xworkz.festival.service;

import com.xworkz.festival.repository.FestivalRepository;

public class FestivalServiceImpl implements FestivalService {
        
	
	private FestivalRepository repository;
	
	public FestivalServiceImpl(FestivalRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String name) {
		if(name.isEmpty()
	 ||name.isBlank()
	 ||name.length()<3
	 ||name.length()>30
	 ||name==null
	 ) {
			System.out.println("give the corect name");
		}else {
			
			boolean exist=isExist(name);
			if(exist!=true) {
			
		
		
		boolean save=repository.onSave(name);
		if(save) {
			System.out.println("name is saved and validate successfully");
			return true;
		}else {
			System.out.println("not saved successfully");
			return false;
		}}else {
			System.out.println("name is exist");
		}
	}
	 
		return false;
	}
	@Override
	public boolean isExist(String name) {
		String[] names=repository.read();
		if(names!=null) {
			for(String list:names) {
				if(list!=null) {
				if(list.equalsIgnoreCase(name)) {
					return true;
				}
			}
		}
		
	}
		return false;

}
	@Override
	public boolean update(String oldName, String newName) {
		if(oldName!=null &&newName!=null) {
			System.out.println("update running");
			
			boolean oldNameCheck=isExist(oldName);
			System.out.println("check th old name:"+oldName);
			
			if(oldNameCheck!=false) {
				boolean check=repository.update(oldName, newName);
				if(check) {
					System.out.println("update the name successfully");
					return true;
				}}else {
					System.out.println("not update");
					return false;
					
				}}else {
					System.out.println("name is null");
				}
			
		
		return false;
	}
	
	@Override
	public void read() {
		String[] names=repository.read();
		for(String read:names) {
			System.out.println(read);
		}
	}
	@Override
	public boolean delete(String name) {
		if(name!=null) {
			boolean delete=repository.delete(name);
			if(delete) {
				System.out.println("deleted name  sucessfully");
				return true;
			}else {
				System.out.println("not deleted");
				return false;
			}}else {
				System.out.println("name is null");
			}
		
		return false;
}
}
