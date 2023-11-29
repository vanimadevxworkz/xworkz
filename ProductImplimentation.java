package com.xworkz.product.abstractimplementation;

import com.xworkz.product.adbstract.Product;
import com.xworkz.product.dto.ProductDto;

public class ProductImplimentation extends Product {
	
    Object obj[]=new Object[4];
    int index=0;
	@Override
	public boolean onSave(ProductDto productDto) {
		if(productDto!=null) {
			System.out.println("dto is not null");
			if(index<obj.length) {
			obj[index]=productDto;
			index++;
			}
		}else {
			System.out.println("dto is   null");
		}
		return false;
	}

}
