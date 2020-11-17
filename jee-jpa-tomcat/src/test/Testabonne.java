package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.senforage.dao.AbonneImpl;
import com.senforage.dao.IAbonne;
import com.senforage.entities.Abonne;
import com.senforage.entities.Village;

public class Testabonne {

	public static void main(String [] args) {
		
		IAbonne abonnedao = new AbonneImpl();
		Abonne a = new Abonne();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SenForageClientPU");
		EntityManager em = emf.createEntityManager();
		
		a.setNom("Abdou");
		a.setVillage (em.find(Village.class, 1));
		a.setAdresse("Keur Abdou");
		a.setTelephone("774567890");
		
		System.out.println(abonnedao.add(a));
	}
}
