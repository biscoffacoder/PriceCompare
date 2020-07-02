package com.project.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.delegate.PriceDelegate;
import com.project.delegate.PriceInsertDelegate;
import com.project.entity.PriceDirectory;
import com.project.service.LoggerService;

//push
@RestController
@Component
public class PriceCheckController {

	@Autowired
	LoggerService loggerObj;

	@Autowired
	PriceInsertDelegate priceInsertDelegate;

	@Autowired
	PriceDelegate priceDelegate;

	@GetMapping("/prices")
	public List<PriceDirectory> getPrices() 
	{
		Logger logger = loggerObj.getLogger(this.getClass().getName());
		logger.info(logger.getName()+" INSIDE "+ " getPrices()");
		logger.info(logger.getName()+" EXIT "+ " getPrices()");

		return priceDelegate.getAllProducts();
	}

	@GetMapping("/insertPrices")
	public void insertedPrices()
	{
		Logger logger = loggerObj.getLogger(this.getClass().getName());
		logger.info(logger.getName()+" INSIDE "+ " insertedPrices()");

		priceInsertDelegate.insertProduct();

		logger.info(logger.getName()+" EXIT "+ " insertedPrices()");

	}

	@GetMapping("/prices/{id}")
	public PriceDirectory getProductById(@PathVariable String id) 
	{
		Logger logger = loggerObj.getLogger(this.getClass().getName());
		logger.info(logger.getName()+" INSIDE "+ " getProductById()");
		logger.info(logger.getName()+" EXIT "+ " getProductById()");

		return priceDelegate.getProductById(id);
	}
	
	@GetMapping("/home")
	public String getHomepage()
	{
		return "welcome";
	}
	
	@PostMapping("/prices")
	public String insertPriceObj(@RequestBody PriceDirectory priceObj) 
	{
		Logger logger = loggerObj.getLogger(this.getClass().getName());
		logger.info(logger.getName()+" INSIDE "+ " insertPriceObj()");
		
		String objProductID = priceObj.getProductId();
		System.err.println("Obj ID :" + objProductID);
		priceInsertDelegate.insertProductObj(priceObj);
		
		logger.info(logger.getName()+" EXIT "+ " insertPriceObj()");
		return "New Value entered with productID : "+getProductById(objProductID).getProductId();
		
		

	}

}
