package com.senforage.dao;

import java.util.List;

import com.senforage.entities.Abonne;
import com.senforage.entities.Village;

public interface IAbonne {

	public int add(Abonne abonne);
	public List<Abonne> findAllAbonnes();
	public Abonne findByIdAbonne(int id);
	public List<Village> findAllVillages();
	public void delete(Abonne abonne);
}
