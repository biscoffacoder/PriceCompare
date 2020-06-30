package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.PriceDirectory;

public interface PriceDirectoryRepo extends JpaRepository<PriceDirectory, Integer> {

	PriceDirectory findByProductId(String productId);
	
	

}
