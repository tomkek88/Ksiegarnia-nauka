package com.creatium.ksiegarnia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
	@RequestMapping("/myAccount")
	public String myAccount() {
		return "myAccount";
	}
}
