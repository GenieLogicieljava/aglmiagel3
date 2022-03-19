package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.ComandeBoissons;


public interface IComandeBoissons {
	com.restaurant.dao.ComandeBoissons getComandeBoissonsById(int id);

	 List<ComandeBoissons> getAllComandeBoissons();

	 void deleteComandeBoissons(int id);

	void updateComandeBoissons(com.restaurant.dao.ComandeBoissons comandeBoissons);

	void saveComandeBoissons(com.restaurant.dao.ComandeBoissons comandeBoissons);

}
