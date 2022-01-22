package com.ty.login.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.login.dto.User;

public class UserDao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction;
	
	
	
	public User validateUser(String email,String password) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE email=?1 && password-?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<User> users = query.getResultList();
		if(users != null && users.size() ==0) {
			
			return users.get(0);
			
		} else {
			return null;
		}
	}
	
}
