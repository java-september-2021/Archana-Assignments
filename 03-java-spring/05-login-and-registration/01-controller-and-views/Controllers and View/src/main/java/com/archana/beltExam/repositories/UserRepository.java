package com.archana.beltExam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.archana.beltExam.models.User;

public interface UserRepository  extends CrudRepository<User,Long>{
	List<User> findAll();
	boolean existsByEmail(String email);
	User findByEmail(String email);
	
}
