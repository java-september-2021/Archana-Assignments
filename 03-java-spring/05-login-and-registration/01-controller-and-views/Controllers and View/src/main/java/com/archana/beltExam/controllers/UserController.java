package com.archana.beltExam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.archana.beltExam.models.User;
import com.archana.beltExam.services.UserService;
import com.archana.beltExam.validators.UserValidator;


@Controller
public class UserController {
	
	@Autowired
	private UserService uService;
	@Autowired
	private UserValidator validator;

	@GetMapping("/")
	public String landing(@ModelAttribute("user") User user) {
		return "landing.jsp";
		
	
	}
	@PostMapping("/register")
	public String createUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		validator.validate(user,result);
		if (result.hasErrors()) {
			return "landing.jsp";
		} else {
			User newUser = this.uService.registerUser(user);
			session.setAttribute("user__id",newUser.getId());
			return "redirect:/tasks/";
		}
		
	}
	
	@PostMapping("/login")
	public String login(HttpSession session, @RequestParam("lemail") String email, @RequestParam("lpassword") String password, RedirectAttributes redirectAttribute) {
		if(!this.uService.authenticateUser(email, password)) {
			redirectAttribute.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		User userToLogin = this.uService.getUserByEmail(email);
		session.setAttribute("user__id", userToLogin.getId());
		return "redirect:/tasks/";
	}

	@GetMapping("/logout")
	public String logoutUser(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
//	@GetMapping("/dashboard")
//	public String usertolog(Model model, HttpSession session) {
//		model.addAttribute("user", this.uService.getOneUser((Long)session.getAttribute("user__id")));
//		return "dashboard.jsp";
//	}
}
