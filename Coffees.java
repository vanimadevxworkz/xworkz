package com.xworkz.test.things;

public class Coffees {
private Milk milk;
private Coffeepowder coffeepowder;

public Coffees() {
	System.out.println("no arguments constructor");
}
public Coffees( Milk milk,Coffeepowder coffeepowder) {
	System.out.println("all arguments construtor");
	this.milk=milk;
	this.coffeepowder=coffeepowder;
}
public void setMilk(Milk milk){
	this.milk=milk;
}
public void setCoffeepowder(Coffeepowder coffeepowder) {
	this.coffeepowder= coffeepowder;
}
public Milk getMilk() {
	return milk;
}
public Coffeepowder getCoffeepowder() {
	return coffeepowder;
}
}
