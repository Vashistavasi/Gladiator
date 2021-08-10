package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


public class Generic_Dao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save (Object obj) {
		entityManager.merge(obj);
	}

	public <T> T fetchById(Class<T> clazz, int pk) {
		System.out.println("in generic dao");
		return entityManager.find(clazz, pk);
	}

}
