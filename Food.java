package com.xworkz.test.things;

public class Food {
public static void foodName() {
	System.out.println("chickenFridrice");
}
public static void rate() {
	System.out.println(145);
}
public static void price() {
	System.out.println(200);
}
public static void hotel() {
	System.out.println("swadist");
}
public static void name(String foodName) {
	System.out.println("foodName is:"+foodName);
}
public static void rate(int rate) {
	System.out.println("food rate is:"+rate);
}
public static void hotel(String hotel) {
	System.out.println("hotel is:"+hotel);
}
public static String name() {
	return "noodles";
}
public static double foodRate() {
	return 150;
}
public static float discount() {
	return 10f;
}
public static String hotelName() {
	return "kafiya";
}
public static String getItemName(String itemName) {
	String food=itemName;
	return food;
}
public static int getItemRate(int itemRate) {
	int cost=itemRate;
	return cost;
}
public static String getHotelNames(String hotelNames) {
	String type=hotelNames;
	return type;
}
public static int getThing(int thing) {
	int value=thing;
	return value;
}
}

