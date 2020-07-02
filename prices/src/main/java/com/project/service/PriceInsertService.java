package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.PriceInsertDAO;
import com.project.entity.PriceDirectory;

@Service
public class PriceInsertService {
	
	/*@Autowired
	PriceDirectoryRepo priceRepo;
	
	
	public void savePrice(PriceDirectory price) 
	{
		priceRepo.save(price);
	}*/
	
	@Autowired
	PriceInsertDAO insertDao;
	
	public void savePrice(PriceDirectory price) 
	{
		insertDao.savePrice(price);
	}

}
