package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.ComandePlats;


public interface IComandePlats {
	com.restaurant.dao.ComandePlats getComandePlatsById(int id);

	 List<ComandePlats> getAllComandePlats();

	 void deleteComandePlats(int id);

	void updateComandePlats(com.restaurant.dao.ComandePlats comandePlats);

	void saveComandePlats(com.restaurant.dao.ComandePlats comandePlats);

}
