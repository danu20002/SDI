package com.danunaik.firstspr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danunaik.firstspr.entity.Account;
@Repository
public interface UserRepository extends JpaRepository<Account, String>{

}
