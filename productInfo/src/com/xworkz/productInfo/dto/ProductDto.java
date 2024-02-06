package com.xworkz.productInfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
	
	private String productName;
	private int numOfProduct;
	private int productCode;

}
