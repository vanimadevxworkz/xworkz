package com.xworkz.test.things;

public class TopicName {
	int index = 0;
	String[] traineeNames = new String[5];

	public void onNames(String names) {
		//System.out.println("traineeNames are:" + names);
		if (index<traineeNames.length) {
			traineeNames[index] = names;
		index++;
		} else {
			System.out.println("traineeNames is full....");
		}
	}

	public void getNames() {
		for (int i = 0; i < traineeNames.length; i++) {
			System.out.println("traineeNames are:" + traineeNames[i]);
		}
	}
}
