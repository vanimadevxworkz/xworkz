package com.xworkz.test.driver;

import com.xworkz.test.things.TopicName;

public class TopicNameRunner {
	public static void main(String args[]) {
		TopicName topicName=new TopicName();
		topicName.onNames("vanii");
		topicName.onNames("bhavya");
		topicName.onNames("hita");
		topicName.onNames("tejas");
		topicName.onNames("uma");
		
		topicName.getNames();
			
				
	}

}
