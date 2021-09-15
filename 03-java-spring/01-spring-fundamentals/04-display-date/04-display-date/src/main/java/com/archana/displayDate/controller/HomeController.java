package com.archana.displayDate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	
	@RequestMapping("/date")
	public String displayDate(@RequestParam("date") String date, Model model) {
		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String displayTime(@RequestParam("time") String time, Model model) {
		
		model.addAttribute("time", time);
		return "time.jsp";
		
	}

}
