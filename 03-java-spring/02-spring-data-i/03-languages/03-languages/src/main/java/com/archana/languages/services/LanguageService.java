package com.archana.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archana.languages.models.Language;
import com.archana.languages.repositories.LanguageRepository;

@Service 
public class LanguageService {
	@Autowired
	private LanguageRepository lRepository;
	
	//Get All the Languages

	public  List<Language>  allLanguage() {
		return this.lRepository.findAll();
		
	}
	
	
	//Get one language
	
	public Language getOneLanguage(Long id) {
		return this.lRepository.findById(id).orElse(null);
		
	}
	
	// create Language
	
	public Language createLanguage(Language newLanguage) {
		return this.lRepository.save(newLanguage);
		
	}
	
	//update language
	
	public Language updateLanguage(Language updateLanguage) {
		return this.lRepository.save(updateLanguage);
	}
	
	//Delete Language
		public void deleteLanguage(Long id) {
			 this.lRepository.deleteById(id);
	
			}
}
