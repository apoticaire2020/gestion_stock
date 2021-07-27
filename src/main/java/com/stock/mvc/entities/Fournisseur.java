package com.stock.mvc.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur {
	
	@Id
	@GeneratedValue
	private Long idfournisseur;
	private String nom;
	private String tel;
	private String email;
	
	
	@OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseur;
    
	public Long getIdfournisseur() {
		return idfournisseur;
	}

	public void setIdfournisseur(Long idfournisseur) {
		this.idfournisseur = idfournisseur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return idfournisseur;
	}

	public void setId(Long id) {
		this.idfournisseur = id;
	}

	public List<CommandeFournisseur> getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(List<CommandeFournisseur> commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
	
	

}
