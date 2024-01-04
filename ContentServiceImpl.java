package com.xworkz.content.service;

import com.xworkz.content.dto.ContentDto;
import com.xworkz.content.repository.ContentRepository;


public class ContentServiceImpl implements ContentService{
	
	private ContentRepository repository;
	public ContentServiceImpl( ContentRepository repository) {
		this.repository=repository;
	}
	
	boolean validateName=true;
	boolean validatePassword=true;
	boolean validateEmail=true;
	boolean validateWebsite=true;
	boolean validatePage=true;
	boolean validateLength=true;
	boolean validateAmmount=true;
	
	
	@Override
	public boolean validate(ContentDto contentDto) {
		System.out.println("dto is running");
		System.out.println("content dto:"+contentDto);
		if(contentDto==null) {
			System.out.println("dto is null");
		}else {
			if(contentDto.getUserName().isEmpty()
				||contentDto.getUserName().isBlank()
				||contentDto.getUserName()==null
				||contentDto.getUserName().length()<2) {
				System.out.println("check the length or unique");
				validateName=false;
			}
			if(contentDto.getPassword().isEmpty()
					||contentDto.getPassword().isBlank()
					||contentDto.getPassword()==null
					||contentDto.getPassword().length()<8
					||contentDto.getPassword().length()>16
					||contentDto.getPassword().contains("A-Z")
					||contentDto.getPassword().contains("!,#,@,*")){
						System.out.println("check the password details");
						validatePassword=false;
						
					}
			if(contentDto.getEmail().isEmpty()
					 ||contentDto.getEmail().isBlank()
					 ||contentDto.getEmail()==null
					 ||!contentDto.getEmail().contains("@")
					 ||contentDto.getEmail().length()<2) {
						System.out.println("check the length or contains @");
						validateEmail=false;
					}
			if(contentDto.getWebsite().isEmpty()
				||contentDto.getWebsite().isBlank()
				||contentDto.getWebsite()==null)
			{
				System.out.println("check the website");
				validateWebsite=false;
			}
			if(contentDto.getPages().isEmpty()
				||contentDto.getPages().isBlank()
				||contentDto.getPages()==null
				||contentDto.getPages().length()<1) {
				System.out.println("check the page length");
				validatePage=false;
			}
			if(contentDto.getContentLength()<30) {
				System.out.println("check the content length");
				validateLength=false;
			}
			if(contentDto.getAmmountPaid()<100
					||contentDto.getAmmountPaid()>1000) {
				System.out.println("check the ammount");
				validateAmmount=false;
			}
			if(validateName&&validatePassword&&validateEmail&&validateWebsite&&validatePage&&
					validateLength&&validateAmmount) {
				System.out.println("validation done");
			
		 
				boolean exist=isExist(contentDto);
				if(exist!=true) {
					
				
		boolean save=this.repository.onSave(contentDto);
		if(save) {
			System.out.println("dto saved successfully");
			return true;
		}else {
			System.out.println("not saved ");
			return false;
		}}else {
			System.out.println("dto is already exist");
		}
		
			}
			}
		
		return false;
	}
	@Override
	public boolean isExist(ContentDto contentDto) {
		ContentDto[] dto=this.repository.read();
		if(dto!=null) {
			for(ContentDto dto1:dto) {
				if(dto1!=null) {
					if(dto1.equals(contentDto)) {
						return true;
					}
				}
			}
			
		}
		return false;
	}
	
	@Override
	public boolean update(String email, ContentDto contentDto) {
		boolean update=this.repository.update(email,contentDto);
		if(update) {
			System.out.println("update successfully");
			return true;
		}else {
			System.out.println("not update");
		}
		return false;
	}
	@Override
	public void read() {
		ContentDto[] dto=this.repository.read();
		for(ContentDto dto1:dto) {
			System.out.println(dto1);
		
	}

}
	@Override
	public boolean validateDelete(String email) {
		boolean checkdelete=repository.delete(email);
		if(checkdelete) {
			System.out.println("deleted successfully");
			return true;
		}else {
			System.out.println("not deleted");
		}
		return false;
	}
}

				
	
			
	


	

	
