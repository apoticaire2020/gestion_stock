package com.stock.mvc.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Long idcategory;
	
	private String designation;
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@OneToMany(mappedBy = "category")
	private List<Article> articles;

	public Long getIdcategory() {
		return idcategory;
	}

	public void setIdcategory(Long idcategory) {
		this.idcategory = idcategory;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	

}
