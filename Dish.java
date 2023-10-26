package com.xworkz.test.things;

public class Dish {
private String dishName;
private  byte type;
private  int price;
private int quantity;
private String place;

public void setDishName(String dishName) {
	this.dishName=dishName;
}
public void setType(byte type) {
	this.type=type;
}
public void setPrice(int price) {
	this.price=price;
}
public void setQuantity(int quantity) {
	this.quantity=quantity;
}
public void setPlace(String place) {
	this.place=place;
}
public String getDishName() {
return	this.dishName;
}
public byte getType() {
	return this.type;
}
public int getPrice() {
	return this.price;
}
public int getQuantity() {
	return this.quantity;
}
public String getPlace() {
	return this.place;
}

}
