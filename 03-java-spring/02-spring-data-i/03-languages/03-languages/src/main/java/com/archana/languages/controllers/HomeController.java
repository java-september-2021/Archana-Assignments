package com.archana.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.archana.languages.models.Language;
import com.archana.languages.services.LanguageService;

@Controller
public class HomeController {
	@Autowired
	private LanguageService lservice;
	
	@GetMapping("/")
	public String index(Model model ,@ModelAttribute("language") Language language ,BindingResult result) {
		model.addAttribute("allLanguages", this.lservice.allLanguage());
		return "languages.jsp";
	
	}
	
	@PostMapping("/")
		public String addNew(@Valid @ModelAttribute("language") Language language,BindingResult result ,Model model ) {
		System.out.println(language.getCurrentVersion());
			if(result.hasErrors()) {
				model.addAttribute("allLanguages", this.lservice.allLanguage());
				return "languages.jsp";
			}
			this.lservice.createLanguage(language);
			return "redirect:/";
		}
	
	@GetMapping("/show/{id}")
	public String showDetails(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisLang", this.lservice.getOneLanguage(id));
		return "show.jsp";
	}
	
	
	@GetMapping("/edit/{id}")
	public String index(Model model,@ModelAttribute("language") Language language , @PathVariable("id") Long id) {
		model.addAttribute("language", this.lservice.getOneLanguage(id));
		return "edit.jsp";
	
	}
	@PutMapping("/edit/{id}")
	public String editNew(@Valid @ModelAttribute("language") Language language,BindingResult result ,Model model, @PathVariable("id") Long id) {
	
		if(result.hasErrors()) {
			model.addAttribute("language", this.lservice.getOneLanguage(id));
			return  "edit.jsp";
		}
		this.lservice.updateLanguage(language);
		return "redirect:/";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.lservice.deleteLanguage(id);
		return "redirect:/";
		
	}
	
	}
