package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.Livreurs;


public interface ILivreurs {

	com.restaurant.dao.Livreurs getLivreursById(int id);

	 List<Livreurs> getAllLivreurs();

	 void deleteLivreurs(int id);

	void updateLivreurs(com.restaurant.dao.Livreurs livreurs);

	void saveLivreurs(com.restaurant.dao.Livreurs livreurs);

}
