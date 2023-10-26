package com.xworkz.test.things;

public class Coffee {
		private String branchName;
		private String flovers;
		private int price;
		private String place;
		private int quantity;

		public  Coffee() {
			System.out.println("default constructor");
		}
		public Coffee(String branchName,String flovers, int price,String place,int quantity) {
			this.branchName=branchName;
			this.flovers=flovers;
			this.price=price;
			this.place=place;
			this.quantity=quantity;
		}
		public void setBranchName(String branchName) {
			this.branchName=branchName;
		}
		public void setFlovers(String flovers) {
			this.flovers=flovers;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		public void setPlace(String place) {
			this.place=place;
		}
		public void setQuantity(int quantity) {
			this.quantity=quantity;
		}
		public String getBranchName() {
			return this.branchName;
		}
		public String getFlovers() {
			return this.flovers;
		}
		public int getPrice() {
			return this.price;
		}
		public String getPlace() {
			return this.place;
		}
		public int getQuantity() {
			return this.quantity;
		}
		}



