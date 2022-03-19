package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.ClientExternes;

public interface IClientExternes {

	 com.restaurant.dao.ClientExternes getClientExternesById(int id);

	 List<ClientExternes> getAllClientExternes();

	 void deleteClientExternes(int id);

	void updateClientExternes(com.restaurant.dao.ClientExternes clientExternes);

	void saveClientExternes(com.restaurant.dao.ClientExternes clientExternes);

}
