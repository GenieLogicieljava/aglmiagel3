package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.Plats;

public interface IPlats {
	com.restaurant.dao.Plats getPlatsById(int id);

	 List<Plats> getAllPlats();

	 void deletePlats(int id);

	void updatePlats(com.restaurant.dao.Plats plats);

	void savePlats(com.restaurant.dao.Plats plats);

}
