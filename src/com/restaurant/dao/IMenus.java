package com.restaurant.dao;


public interface IMenus {
	
	com.restaurant.dao.Menus getMenusById(int id);

	 void deleteMenus(int id);

	void updateMenus(com.restaurant.dao.Menus menus);

	void saveMenus(com.restaurant.dao.Menus menus);

	java.util.List<com.restaurant.dao.Menus> getAllMenus();


}
