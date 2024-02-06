package com.danunaik.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ClassPushed {
	@Autowired
  private JobJpaRepository repo;
	
public void alreadypushed() {
	//repo.insert(new Storager(1,"daneshnaik14@gmail.com","ddyy"));
}
	
     
}
