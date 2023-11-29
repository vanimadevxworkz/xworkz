package com.xworkz.product.runner;

import com.xworkz.product.abstractimplementation.ProductImplimentation;
import com.xworkz.product.adbstract.Product;
import com.xworkz.product.dto.ProductDto;

public class ProductRunner {
	public static void main(String[] args) {
		
		Product product=new ProductImplimentation();
		product.onSave(null);
		
		product.onSave(null);
		
		ProductDto pd=new ProductDto();
		pd.setDiscount(0);
		pd.setName(null);
		pd.setPrice(0);
		pd.setShopName(null);
		pd.setTypeOfProduct("cosmetic");

		System.out.println(pd.getDiscount());
		System.out.println(pd.getName());
		System.out.println(pd.getPrice());
		System.out.println(pd.getTypeOfProduct());	
		System.out.println(pd.getShopName());
		
		System.out.println(pd.toString());
		System.out.println(pd.hashCode());
		System.out.println(pd.equals(pd));
		
		
	}

}
