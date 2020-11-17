package com.senforageAbonne.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.senforageAbonne.entities.Abonne;

public class AbonneImpl implements IAbonne
{

	private EntityManager em;
	public AbonneImpl()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionClientSenForagePU");
		em = emf.createEntityManager();
	}
	@Override
	public int add(Abonne abonne)
	{
		try 
		{
			em.getTransaction().begin();
			em.persist(abonne);
			em.getTransaction().commit();
			return 1;
			
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
