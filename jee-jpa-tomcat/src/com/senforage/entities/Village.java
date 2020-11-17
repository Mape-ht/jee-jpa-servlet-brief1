package com.senforage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Village implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	
	@OneToMany(mappedBy="village", targetEntity = Abonne.class, fetch = FetchType.LAZY)
	private List<Abonne>abonne;
	
	
	public List<Abonne> getAbonne() {
		return abonne;
	}

	public void setAbonne(List<Abonne> abonne) {
		this.abonne = abonne;
	}

	public Village() {
		super();
	}

	public Village(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	

}
