package com.project.dao;

import com.project.entity.PriceDirectory;

public class PriceInsert {
	
	private PriceDirectory price;
	public PriceDirectory insertPrice() 
	{
		System.err.println("inside insertPrice()");
		price= new PriceDirectory("NewProduct", "newID123", 400, "USD");
		return price;
	}

}
