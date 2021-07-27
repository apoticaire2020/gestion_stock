package com.stock.mvc.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
	
	@Id
	@GeneratedValue
	private Long idclient;
	
	private String nom;
	private String tel;
	private String email;
	

	public Client() {
		super();
			}
    @OneToMany(mappedBy = "client")
    List<CommandeClient>  commandeClient;
	
	public Long getIdclient() {
		return idclient;
	}


	public void setIdclient(Long idclient) {
		this.idclient = idclient;
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


	public List<CommandeClient> getCommandeClient() {
		return commandeClient;
	}


	public void setCommandeClient(List<CommandeClient> commandeClient) {
		this.commandeClient = commandeClient;
	}

	
	

}
