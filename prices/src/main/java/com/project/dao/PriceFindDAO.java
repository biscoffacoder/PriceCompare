package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.PriceDirectory;
import com.project.repository.PriceDirectoryRepo;

@Component
public class PriceFindDAO {
	@Autowired
	PriceDirectoryRepo priceRepo;
	
	public List<PriceDirectory> getAllPrices()
	{
		
		return priceRepo.findAll();
	}

	public PriceDirectory getProductById(String productId) {
		// TODO Auto-generated method stub
		return priceRepo.findByProductId(productId);
	}

}
