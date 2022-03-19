package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.Commandes;

public interface ICommandes {

	 com.restaurant.dao.Commandes getCommandesById(int id);

	 List<Commandes> getAllCommandes();

	 void deleteCommandes(int id);

	void updateCommandes(com.restaurant.dao.Commandes commandes);

	void saveCommandes(com.restaurant.dao.Commandes commandes);

}
