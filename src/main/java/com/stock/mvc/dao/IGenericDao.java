package com.stock.mvc.dao;

import java.util.List;

public interface IGenericDao<E> {

	public E save(E entity);
	public E update(E entity);
	public E getById(Long id);
	public E findOne(String paramName , Object paramValue);
	public E findOne(String[] paramName , Object[] paramValue);
	
	public int findCountBy(String paramName , String paramValue);
	
	public List<E> selectAll();
	public List<E> selectAll(String sortField , String sort);
	
	public void remove(Long id);
	
}
