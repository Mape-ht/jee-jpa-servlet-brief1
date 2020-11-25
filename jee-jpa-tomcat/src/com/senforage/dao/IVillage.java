package com.senforage.dao;

import java.util.List;

import com.senforage.entities.Village;


public interface IVillage {

	public int add(Village village);
	public List<Village> findAllVillages();
	public Village findByIdVillage(int id);
	public Village getVillage(int village_id);
	public void delete(Village village);
	
}
