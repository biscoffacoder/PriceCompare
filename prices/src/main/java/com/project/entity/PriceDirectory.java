package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class PriceDirectory {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String productName;
	@Column
	private String productId;
	@Column
	private int price;
	@Column
	private String currencyCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public PriceDirectory(String productName, String productId, int price, String currencyCode) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.currencyCode = currencyCode;
	}
	public PriceDirectory() {
		// TODO Auto-generated constructor stub
	}
	
}
