package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Article;

public interface IArticleService {

	public Article save(Article entity);
	public Article update(Article entity);
	public Article getById(Long id);
	public Article findOne(String paramName , Object paramValue);
	public Article findOne(String[] paramName , Object[] paramValue);
	
	public int findCountBy(String paramName , String paramValue);
	
	public List<Article> selectAll();
	public List<Article> selectAll(String sortField , String sort);
	
	public void remove(Long id);
}
