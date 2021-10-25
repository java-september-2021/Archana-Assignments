package com.archana.beltExam.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
//@RequestMapping("/event")
//public class HomeController {
//	@GetMapping("/")								need to change ModelAttribute and taskto current model.
//	public String index(Model viewModel, HttpSession session,@ModelAttribute("Task") Task task) {
//		if(session.getAttribute("user__id") == null) {
//			return "redirect:/";
//		}
//		viewModel.addAttribute("user", this.uService.getOneUser((Long)session.getAttribute("user__id")));
//		viewModel.addAttribute("allTask", this.tService.getAll());
//		return "dashboard.jsp";
//	}

}
