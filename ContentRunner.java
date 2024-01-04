package com.xworkz.content.runner;


import com.xworkz.content.constants.ContentType;
import com.xworkz.content.dto.ContentDto;
import com.xworkz.content.repository.ContentRepoImpl;
import com.xworkz.content.repository.ContentRepository;
import com.xworkz.content.service.ContentService;
import com.xworkz.content.service.ContentServiceImpl;

public class ContentRunner {
	
	public static void main(String[] args) {
		ContentDto dto=new ContentDto("vani","Vani!@#*9","vanigond09@gmail","javatpoint","xxx",ContentType.C01.toString(),50,250);
		
		ContentDto dto1=new ContentDto("priyanka","Priya!@#*9","priya09@gmail","java","yyy",ContentType.C02.toString(),40,350);
		
		ContentDto dto2=new ContentDto("Bhavya","Bhavya!@#*9","Bhavya09@gmail","java code","zzz",ContentType.C03.toString(),90,450);
			
		System.out.println("dto is:"+dto.toString());
		
		
		ContentRepository repository=new ContentRepoImpl();
		
		ContentService service=new ContentServiceImpl(repository);
		service.validate(dto);
		service.validate(dto1);
		service.validate(dto2);
		
		//service.read();
		
		String email="vanigond09@gmail";
		//System.out.println("before update.....");
		
		ContentDto dtos=new ContentDto();
		dtos.setEmail("Vanishri@gmail");
		//System.out.println("after update......");
		
		service.update(email, dtos);
		service.read();
		
		service.validateDelete("Vanishri@gmail");
		service.read();
		service.read();
		
	}

}
