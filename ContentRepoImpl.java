package com.xworkz.content.repository;

import com.xworkz.content.dto.ContentDto;

public class ContentRepoImpl implements ContentRepository {

	private ContentDto[] dto = new ContentDto[3];
	int index = 0;

	@Override
	public boolean onSave(ContentDto contentDto) {
		if (index < this.dto.length) {
			dto[this.index] = contentDto;
			this.index++;
			return true;
		}

		return false;
	}

	@Override
	public ContentDto[] read() {
		System.out.println("reading dto... ");
		return dto;
	}

	@Override
	public boolean update(String email, ContentDto contentDto) {
		for (int i = 0; i < this.dto.length; i++) {
			if (this.dto[i] != null) {
				if (this.dto[i].getEmail().equals(email)) {
					this.dto[i] = contentDto;
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public boolean delete(String email) {
		if(email!=null) {
			for(int i=0;i<dto.length;i++) {
				if(dto[i]!=null) {
					if(dto[i].getEmail().equalsIgnoreCase(email)) {
						dto[i]=null;
						return true;
					}
				}
			}
		}
		return false;
	}
	

}
