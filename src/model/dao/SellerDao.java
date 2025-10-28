package model.dao;

import java.util.List;


import model.entites.Seller;

public interface SellerDao {

	void inseert(Seller sel);
	void update(Seller sel);
	void deletById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	
	
	
}
