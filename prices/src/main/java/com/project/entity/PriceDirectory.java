package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class PriceDirectory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String productName;
	@Column
	private String productId;
	@Column
	private int price;
	@Column
	private String currencyCode;
	@Column
	private String brandName;
	@Column
	private String url;
	@Column
	private int discountPercentage;
	@Column
	private String websiteName;

	
	public PriceDirectory(String productName, String productId, int price, String currencyCode, String brandName,
			String url, int discountPercentage, String websiteName) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.currencyCode = currencyCode;
		this.brandName = brandName;
		this.url = url;
		this.discountPercentage = discountPercentage;
		this.websiteName = websiteName;
	}


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


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public int getDiscountPercentage() {
		return discountPercentage;
	}


	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}


	public String getWebsiteName() {
		return websiteName;
	}


	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}


	public PriceDirectory() {
		// TODO Auto-generated constructor stub
	}

}
