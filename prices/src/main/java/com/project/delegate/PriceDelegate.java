package com.project.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.PriceDirectory;
import com.project.service.PriceService;

@Component
public class PriceDelegate {
	
	@Autowired
	PriceService priceServiceobj;
	
	public List<PriceDirectory> getAllProducts()
	{
		return priceServiceobj.getAllPrices();
	}
	
	public PriceDirectory getProductById(String productId) 
	{
		return priceServiceobj.getProductById(productId);
	}
}
