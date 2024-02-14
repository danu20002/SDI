package com.danunaik.firstspr.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.danunaik.firstspr.entity.Account;


@Controller
public class UserController {
	
	@GetMapping("/")
	public String register(Model model) {
		Account account=new Account();
		model.addAttribute("account",account);
		return "index";
	}
    @PostMapping("/registerUser")
	public String regsiterUser(@ModelAttribute("account") Account account ) {
	    System.out.println(account);
		return "home";
	}
}
