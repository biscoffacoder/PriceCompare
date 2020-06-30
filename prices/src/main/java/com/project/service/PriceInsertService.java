package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.PriceDirectory;
import com.project.repository.PriceDirectoryRepo;

@Service
public class PriceInsertService {
	
	@Autowired
	PriceDirectoryRepo priceRepo;
	
	public void savePrice(PriceDirectory price) 
	{
		priceRepo.save(price);
	}

}
