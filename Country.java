package com.xworkz.test.things;

public class Country {
	private State state;
	
	public Country() {
		System.out.println("no arguments constructor");
	}
	public Country(State state) {
		System.out.println("all arguments constructor");
		this.state =state;
	}
	public void setState(State state) {
		this.state=state;
	}
	public State getState() {
		return state;
	}

}
