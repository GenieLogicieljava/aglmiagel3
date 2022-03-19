package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.Boissons;


public interface IBoissons {
	
	

	 List<Boissons> getAllBoissons();

	 void deleteBoissons(int id);

	void updateBoissons(com.restaurant.dao.Boissons boissons);

	void saveBoisson(com.restaurant.dao.Boissons boissons);

	com.restaurant.dao.Boissons getBoissonById(int id);

	
}
