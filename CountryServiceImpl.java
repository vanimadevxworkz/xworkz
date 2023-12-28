package com.xworkz.country.service;

import com.xworkz.country.repository.CountryRepository;

public class CountryServiceImpl implements CountryService {

	private CountryRepository repository;

	public CountryServiceImpl(CountryRepository repository) {

		this.repository = repository;
	}

	public boolean validate(String countryName) {
		if (countryName.isEmpty() || countryName.isBlank() || countryName.length() < 2 || countryName.length() > 25
				|| countryName == null) {
			System.out.println("give the correct place name");
		} else {

			// check the duplicate values
			boolean exist = isExist(countryName);
			if (exist == true) {

				// check onSave methods
				boolean save = repository.onSave(countryName);
				if (save) {
					System.out.println("name is saved and validate successfully");
					return true;
				} else {
					System.out.println("not saved successfully");
					return false;
				}

			} else {
				System.out.println("exist sucessfully");
			}
		}

		return false;
	}

	@Override
	public boolean isExist(String countryName) {
		String[] name = repository.read();
		if (name != null) {
			for (String names : name) {
				if (names != null) {
					if (names.equals(countryName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(String oldName, String newName) {
		if (oldName!= null && newName != null) {
			System.out.println("update running");

			boolean oldValueCheck = isExist(oldName);
			System.out.println("isExist:" + oldValueCheck);
//		    boolean newValueCheck=isExist(newName);
//			System.out.println(" validate new name is exist:"+newName)	;		
//			
			if (oldValueCheck) {
				boolean check = repository.update(oldName, newName);
				System.out.println("check the oldName:" + check);

				if (check == true) {
					System.out.println("update sucessfully");
					return true;
				} else {
					System.out.println("not update");
				}
			} else {
				System.out.println("old name not present");
			}

		}

		return false;
	}
	public void read() {
		String[] read=repository.read();
		for(String list:read) {
			System.out.println(list);
			
			}
	}
	

	@Override
	public boolean delete(String countryName) {
		if(countryName!=null) {
			boolean delete=repository.delete(countryName);
			if(delete) {
				System.out.println("deleted sucessfully");
				return true;
			}else {
				System.out.println("not deleted");
			}}else {
				System.out.println("name is null");
			}
		
		return false;
}

	

	
}

