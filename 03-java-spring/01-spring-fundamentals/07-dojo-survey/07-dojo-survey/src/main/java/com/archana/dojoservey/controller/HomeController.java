package com.archana.dojoservey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
		
	}
	
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("firstName") String firstName,
			@RequestParam("email") String email,
			@RequestParam("program") String program, Model model) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("email", email);
		model.addAttribute("program", program);
		return "welcome.jsp";
	}
	
	

}
