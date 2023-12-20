package com.xworkz.roadmap.repository;

public class StreamRepositoryImplementation implements StreamRepository{
	
	
    private String[] streams=new String[3];//use getter method bcz property is private
    private int index=0;
    
	public String[] getStreams() {
		return streams;
	}

	@Override
	public boolean onSave(String streamName) {
		if(streams==null||index>=streams.length) {
			System.out.println("streams value is null or check the length");
		}else {
		if(index<streams.length) {
			streams[index]=streamName;
			index++;
			//System.out.println("stream save successfully");
			return true;
		}}
		
		return false;
	}

}
