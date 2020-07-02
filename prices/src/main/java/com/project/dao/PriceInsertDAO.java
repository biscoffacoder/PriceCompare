package com.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.PriceDirectory;
import com.project.repository.PriceDirectoryRepo;

@Component
public class PriceInsertDAO {

	@Autowired
	PriceDirectoryRepo priceRepo;
	
	public void savePrice(PriceDirectory price) 
	{
		priceRepo.save(price);
	}
}
