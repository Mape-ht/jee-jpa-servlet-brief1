package com.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.senforage.entities.Village;



public class VillageImpl implements IVillage {

	private EntityManager em;
	
	public VillageImpl() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SenForageClientPU");
		em = emf.createEntityManager();
	}
	@Override
	public int add(Village village) {
		try {
			em.getTransaction().begin();
			em.persist(village);
			em.getTransaction().commit();
			return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public List<Village> findAllVillages() {
		
		return em.createQuery("SELECT v FROM Village v",Village.class).getResultList();
	} 
	
	@Override
	public Village getVillage(int id) {
	
		return (Village)em.createQuery("SELECT v FROM Village v WHERE v.id=:id")
				.setParameter("id", id)
				.getSingleResult();
		
		
	}
	
	public void delete(Village village) {
		
	}
	@Override
	public Village findByIdVillage(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
