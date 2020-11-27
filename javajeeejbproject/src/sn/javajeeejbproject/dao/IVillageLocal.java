package sn.javajeeejbproject.dao;

import java.util.List;

import javax.ejb.Local;

import sn.javajeeejbproject.entities.Village;

@Local
public interface IVillageLocal {

	public List<Village> liste();
	public int add(Village village);
}
