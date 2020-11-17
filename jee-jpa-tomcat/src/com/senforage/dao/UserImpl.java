package com.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.senforage.entities.User;
import com.senforage.entities.Village;

public class UserImpl implements IUser{
	
	private EntityManager em;
	
	public UserImpl() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SenForageClientPU");
		em = emf.createEntityManager();
	}
	@Override
	public int add(User user) {
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public List<User> list() {
		
		return em.createQuery("SELECT u FROM User u").getResultList();
	} 
}
