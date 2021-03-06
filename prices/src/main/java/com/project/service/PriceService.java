package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.PriceFindDAO;
import com.project.entity.PriceDirectory;
import com.project.repository.PriceDirectoryRepo;

@Service
public class PriceService {

	/*@Autowired
	PriceDirectoryRepo priceRepo;
	
	public List<PriceDirectory> getAllPrices()
	{
		
		return priceRepo.findAll();
	}

	public PriceDirectory getProductById(String productId) {
		// TODO Auto-generated method stub
		return priceRepo.findByProductId(productId);
	}*/
	
	@Autowired
	PriceFindDAO priceFindObj;
	
	public List<PriceDirectory> getAllPrices()
	{
		return priceFindObj.getAllPrices();
	}
	
	public PriceDirectory getProductById(String productId) 
	{
		return priceFindObj.getProductById(productId);
	}
}
