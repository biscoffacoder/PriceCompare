package com.project.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.project.entity.PriceDirectory;

@Repository
public class PriceRepo {
	@PersistenceContext
    private EntityManager entityManager;
	
	@Transactional
	public void insertWithEntityManager(PriceDirectory price) {
		System.err.println("inside insertWithEntityManager"+price.getPrice()+" "+price.getProductName());
		
	    this.entityManager.persist(new PriceDirectory("ALLAN", "123ST",500, "INR"));
	    }
}
