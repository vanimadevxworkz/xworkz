package com.xworkz.content.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ContentDto {
	
	private String userName;
	private String password;
	private String email;
	private String website;
	private String pages;
	private String contentType;
	private int contentLength;
	private int ammountPaid;
	
	

}
