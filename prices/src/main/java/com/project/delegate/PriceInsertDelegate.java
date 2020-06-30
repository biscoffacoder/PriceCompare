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
		price = new PriceDirectory("Adidas","AD112",3200,"INR");
		priceService.savePrice(price);
		
		
	}
}
