package com.archana.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String WelcomePage(HttpSession session ,Model model ) {
		session.setAttribute("count", 0);
		model.addAttribute("userLogin", model);
		return "index.jsp";
		
	}
	
	
	@RequestMapping("/counter")
	public String visitCount( HttpSession session, Model model) {
		
		Integer counter=(Integer)session.getAttribute("count");
		counter ++;
		session.setAttribute("count", counter);
		model.addAttribute("countVisited",counter);
		
		return "count.jsp";
		
	
	}
	
}
