package com.archana.routing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CodingController {
	
	@RequestMapping(value="/coding", method=RequestMethod.GET)
	public String codingMethod() {
		return "'Hello Coding Dojo!'.";
		
	}
	
	@RequestMapping(value="/coding/python", method=RequestMethod.GET)
	public String pythonMethod() {
		
		return "'Python/Django was awesome!'.";
	}
	
	@RequestMapping(value="/coding/java", method=RequestMethod.GET)
	public String javaMethod() {
		
		return "'Java/Spring is better!'.";
	}
	
	

}
