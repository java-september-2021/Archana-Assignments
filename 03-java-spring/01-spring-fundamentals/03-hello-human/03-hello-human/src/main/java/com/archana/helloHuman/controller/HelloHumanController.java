package com.archana.helloHuman.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	
	
	@RequestMapping("/")
	public String helloHuman() {
		return "Hello Human";
		
	}
	
	@RequestMapping("/{name}")
	public String helloName(@PathVariable("name") String name, Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		
		return "Hello" +" "+name;
		
	}
}
