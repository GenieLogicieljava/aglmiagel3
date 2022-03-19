package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.Paiements;

public interface IPaiements {
	com.restaurant.dao.Paiements getPaiementsById(int id);

	 List<Paiements> getAllPaiements();

	 void deletePaiements(int id);

	void updatePaiements(com.restaurant.dao.Paiements paiements);

	void savePaiements(com.restaurant.dao.Paiements paiements);

}
