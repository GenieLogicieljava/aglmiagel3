package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.Tables;

public interface ITables {
	com.restaurant.dao.Tables getTablesById(int id);

	 List<Tables> getAllTables();

	 void deleteTables(int id);

	void updateTables(com.restaurant.dao.Tables tables);

	void saveTables(com.restaurant.dao.Tables tables);

}
