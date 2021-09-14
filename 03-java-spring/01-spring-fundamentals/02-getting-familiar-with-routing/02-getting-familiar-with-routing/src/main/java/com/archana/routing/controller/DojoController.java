package com.archana.routing.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {
	
	
	@RequestMapping("/dojo")
	public String dojo(@PathVariable String dojo) {
		
		
		return "The dojo is awesome!'.";
	}
	
	@RequestMapping("/dojo/burbank")
	public String burbank(@PathVariable String dojo,@PathVariable String burbank) {
		
		
		return "'Burbank Dojo is located in Southern California'.";
	}
	
	
	@RequestMapping("/dojo/san-jose")
	public String headQuater(@PathVariable String dojo,@PathVariable String burbank) {
		
		
	
	
	 return " 'SJ dojo is the headquarters'.";       
	}

}
