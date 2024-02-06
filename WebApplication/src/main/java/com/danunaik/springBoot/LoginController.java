package com.danunaik.springBoot;

import java.io.PrintWriter;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController implements CommandLineRunner {
	
	
	
	@Autowired
	private JobJpaRepository repository;
	
	
	
	
	
	
	
@RequestMapping(value = "login",method = RequestMethod.GET)
	public String sayLogin() {
	// 
	
		return "login";
	}

@RequestMapping(value = "login",method = RequestMethod.POST)
public String gotonewpage(@RequestParam String email,@RequestParam String password,ModelMap model) {
repository.insert(new  Storager(1,email,password));
//if(repository.findbyemail(email.toString()).equals(email) && repository.findbypass(password.toString()).equals(password)) {
if(email.equals("daneshnaik14@gmail.com") && password.equals("dabyf") ) {
   model.put("email", email);
   model.put("password", password);
   return "newpage";
}	
	else {
		model.put("errorMsg","please provide correct information");
		return "login";
	}
	
	
}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
}



}
