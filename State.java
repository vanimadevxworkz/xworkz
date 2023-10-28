package com.xworkz.test.things;

public class State {
	private String name;
	private int totalTaluku;
	private String district;
	private int totalVilages;
	private String totalPeople;
	
	public State() {
		System.out.println("no arguments constructor");
	}
	public State(String name,int totalTaluku,String district,int totalVilages, String totalPeople) {
		System.out.println("all arguments constructor");
		this.name=name;
		this.totalTaluku=totalTaluku;
		this.district=district;
		this.totalVilages=totalVilages;
		this.totalPeople=totalPeople;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setTotalTaluku(int totalTaluku) {
		this.totalTaluku=totalTaluku;
	}
	public void setDistrict(String district) {
		this.district=district;
	}
	public void setTotalVilages(int totalVilages) {
		this.totalVilages=totalVilages;
	}
	public void setTotalPeople(String totalPeople) {
		this.totalPeople=totalPeople;
	}
	public String getName() {
		return name;
	}
	public int getTotalTaluku() {
		return totalTaluku;
	}
	public String getDistrict() {
		return district;
	}
	public int getTotalVilages() {
		return totalVilages;
	}
	public String getTotalPeople() {
		return totalPeople;
	}
}
