package com.stock.mvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeClient {
	
	@Id
	@GeneratedValue
	private Long idligneCmClt;

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idcommandeClient")
	private CommandeClient commandeClient;

	public Long getIdligneCmClt() {
		return idligneCmClt;
	}

	public void setIdligneCmClt(Long idligneCmClt) {
		this.idligneCmClt = idligneCmClt;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}
	
	
	
	

}
