package com.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.senforage.entities.Abonne;
import com.senforage.entities.Village;

public class AbonneImpl implements IAbonne{
	
	private EntityManager em;
	
	public AbonneImpl() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SenForageClientPU");
		em = emf.createEntityManager();
	}
	@Override
	public int add(Abonne abonne) {
		try {
			em.getTransaction().begin();
			em.persist(abonne);
			em.getTransaction().commit();
			return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public List<Abonne> list() {
		
		return em.createQuery("SELECT a FROM Abonne a").getResultList();
	} 
}
	
	
	