package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.Periodes;

public interface IPeriodes {
	com.restaurant.dao.Periodes getPeriodesById(int id);

	 List<Periodes> getAllPeriodes();

	 void deletePeriodes(int id);

	void updatePeriodes(com.restaurant.dao.Periodes periodes);

	void savePeriodes(com.restaurant.dao.Periodes periodes);

}
