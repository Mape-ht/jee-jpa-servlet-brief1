package sn.javajeeejbproject.dao;

import java.util.List;

import javax.ejb.Remote;

import sn.javajeeejbproject.entities.Village;

@Remote
public interface IVillageRemote {

	public List<Village> liste();
	public int add(Village village);
}
