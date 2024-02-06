package com.danunaik.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository // something make contact to database
@Transactional
public class JobJpaRepository {
	@PersistenceContext
  EntityManager entityManager;
  
  
  public void insert(Storager storager) {
	  entityManager.merge(storager);
	
}
  public Storager findByID(long id) {
	 return entityManager.find(Storager.class, id);
}
  public void deletebyId(long id) {
	Storager storager=  entityManager.find(Storager.class, id);
	  entityManager.remove(storager);;
	
}
  public Storager findbyemail(String email) {
	  
	return entityManager.find(Storager.class, email);
}
  public Storager findbypass(String pass) {
	return entityManager.find(Storager.class,pass);
}
}
