package com.stock.mvc.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CommandeFournisseur {
	
	@Id
	@GeneratedValue
	private Long idcommandeFournisseur;

	
	@ManyToOne
	@JoinColumn(name = "idfournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy = "commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseur;
	
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Long getIdcommandeFournisseur() {
		return idcommandeFournisseur;
	}

	public void setIdcommandeFournisseur(Long idcommandeFournisseur) {
		this.idcommandeFournisseur = idcommandeFournisseur;
	}

	public List<LigneCommandeFournisseur> getLigneCommandeFournisseur() {
		return ligneCommandeFournisseur;
	}

	public void setLigneCommandeFournisseur(List<LigneCommandeFournisseur> ligneCommandeFournisseur) {
		this.ligneCommandeFournisseur = ligneCommandeFournisseur;
	}

	
	
	

}
