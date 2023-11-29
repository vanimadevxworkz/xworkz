package com.xworkz.product.adbstract;

import com.xworkz.product.dto.ProductDto;

public abstract class Product {
	
	public abstract boolean onSave(ProductDto productDto);

}

