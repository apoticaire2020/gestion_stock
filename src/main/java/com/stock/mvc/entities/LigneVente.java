package com.stock.mvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente {
	
	@Id
	@GeneratedValue
	private Long idLigneVente;

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	

	@ManyToOne
	@JoinColumn(name = "idvente")
	private Vente vente;

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	

}
