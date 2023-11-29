package com.xworkz.product.dto;

public class ProductDto {
	
	private String name;
	private int price;
	private double discount;
	private String typeOfProduct;
	private String shopName;
	
  //constructor
	public ProductDto() {
		System.out.println("no args constructor");
	}
	
	public ProductDto( String name,int price,double discount,String typeOfProduct,String shopName) {
		System.out.println("this is parameterized cnstructor");
		this.name=name;
		this.discount=discount;
		this.price=price;
		this.shopName=shopName;
		this.typeOfProduct=typeOfProduct;
	}
	
//getter and seter method
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct = typeOfProduct;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public String getTypeOfProduct() {
		return typeOfProduct;
	}

	public String getShopName() {
		return shopName;
	}
	
	//toString method
	@Override
	public String toString() {
		System.out.println("to string method from productdto");
		return  "ProductDto:{name:"+name+
				" "+" discount:"+discount+
				" "+" typeOfProduct:"+typeOfProduct+
				" "+" shopName:"+shopName+
				" "+" price:"+price+"}";
	}
	
	//equals method
	@Override
	public boolean equals(Object obj) {
		System.out.println("this is equals method");
		if(this==obj) 
		return true;
		if(obj==null) 
			return false;	
		if(getClass()!=obj.getClass()) 
			return false;
		return true;
	}
	//hash code method
	@Override
	public int hashCode() {
		System.out.println("this is hashcode method");
		return 300;
	}
	
}
