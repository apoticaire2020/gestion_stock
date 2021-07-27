package com.stock.mvc.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vente {
	
	@Id
	@GeneratedValue
	private Long idvente ;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datevente;
	
	@OneToMany(mappedBy = "vente")
	private List<LigneVente> ligneVentes;

	public Long getIdvente() {
		return idvente;
	}

	public void setIdvente(Long idvente) {
		this.idvente = idvente;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDatevente() {
		return datevente;
	}

	public void setDatevente(Date datevente) {
		this.datevente = datevente;
	}

	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}

	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}
	
	

	
	
	

}
