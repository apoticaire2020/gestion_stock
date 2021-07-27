package com.stock.mvc.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable{

	@Id
	@GeneratedValue
	private Long idArticle ;
	

	private String codeArticle;
	private String designation;
	private BigDecimal pph;
	private BigDecimal ppv;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;
	
	

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPph() {
		return pph;
	}

	public void setPph(BigDecimal pph) {
		this.pph = pph;
	}

	public BigDecimal getPpv() {
		return ppv;
	}

	public void setPpv(BigDecimal ppv) {
		this.ppv = ppv;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getId() {
		return idArticle;
	}

	public void setId(Long id) {
		this.idArticle = id;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}
	
}
