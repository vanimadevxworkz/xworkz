package com.xworkz.test.driver;

import com.xworkz.test.things.TraineeName;

public class TraineeNameRunner {
public static void main(String[] args) {
	String[] name={"sse","ttt","rrr"};
	TraineeName.getName(name);
	String[] place= {"karnataka","tamilnadu","kerla"};
	TraineeName.getPlace(place);
}
}
