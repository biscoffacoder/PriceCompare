package com.project.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.PriceDirectory;
import com.project.repository.PriceDirectoryRepo;
import com.project.service.PriceInsertService;

@Component
public class PriceInsertDelegate {
	
	@Autowired
	private PriceDirectoryRepo repo;
	
	@Autowired
	private PriceInsertService priceService;
	
	@Autowired
	private PriceDirectory price;
	
	public void insertProduct()
	{
		//price = new PriceDirectory(productName, productId, price, currencyCode, brandName, url, discountPercentage, websiteName);
		price = new PriceDirectory("Shoe","SH001",4500,"INR","Adidas","https://test1SH001",20,"Myntra");
		priceService.savePrice(price);
		
		
	}

	public void insertProductObj(PriceDirectory priceObj) {
		priceService.savePrice(priceObj);
		
	}
}
