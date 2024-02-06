package com.danunaik.springBoot;

import javax.management.loading.PrivateClassLoader;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Storager {
	
	     @Id
	     private long id;
		 private String  Email;
         private String password;
         
      public Storager(long id, String email, String password) {
		super();
		this.id = id;
		Email = email;
		this.password = password;
	}
         public Storager() {
			super();
		}
         public Storager(String email, String password) {
			super();
			Email = email;
			this.password = password;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
		
		
         

}
