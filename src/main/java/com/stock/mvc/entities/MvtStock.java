package com.stock.mvc.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MvtStock {
	
	public static final int ENTREE =1;
	public static final int SORTIE =2;
	
	
	@Id
	@GeneratedValue
	private Long idMvt;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;

	private BigDecimal quantite;
	
	private int typeMvt;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	public Long getIdMvt() {
		return idMvt;
	}

	public void setIdMvt(Long idMvt) {
		this.idMvt = idMvt;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	
	
	
	

}
