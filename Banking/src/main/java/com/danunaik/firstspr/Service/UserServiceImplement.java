package com.danunaik.firstspr.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danunaik.firstspr.entity.Account;
import com.danunaik.firstspr.repository.UserRepository;
@Service
public class UserServiceImplement implements UserService {

	@Autowired
	private UserRepository repository;
	@Override
	public void registerUser(Account account) {
		// TODO Auto-generated method stub
		repository.save(account);
		
	}

}
