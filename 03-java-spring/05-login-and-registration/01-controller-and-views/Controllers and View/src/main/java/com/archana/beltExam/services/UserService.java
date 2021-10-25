package com.archana.beltExam.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archana.beltExam.models.User;
import com.archana.beltExam.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository uRepo;
	
	//get all user
	public List<User > getAllUser() {
		return  this.uRepo.findAll();
		
	}
	
	// create user
	
	public User createUser(User user) {
		return this.uRepo.save(user);
		
	}
	
	// Get one user
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
		
	}
	
	// register User
	
	public User registerUser(User user) {
		
		//generate the password.
		String hash=BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		
	//Set the hashed password on the user password field
		user.setPassword(hash);
		
		//save the new user password and the user object to the database;
		return this.uRepo.save(user);
		
	}
	
	public boolean authenticateUser(String email, String password) {
		//QUery the user by email 
		User user = this.uRepo.findByEmail(email);
		
		if(user==null) {
			return false;
		}else {
			
			 if(BCrypt.checkpw(password, user.getPassword())) {
	                return true;
	            } else {
	                return false;
	            }
	        }
	    }
		
			
	public User getUserByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	
	

}
