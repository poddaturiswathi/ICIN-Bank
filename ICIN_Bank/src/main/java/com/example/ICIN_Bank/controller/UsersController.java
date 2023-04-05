package com.example.ICIN_Bank.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ICIN_Bank.model.Users;
import com.example.ICIN_Bank.repo.userrepo;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200/")
public class UsersController {
	
	@Autowired
	userrepo rep;
	
	 @GetMapping("/allusers")
	public List<Users> getuserss(){
		return rep.findAll();
	}
	 
	  @DeleteMapping("/allusers/{id}")
	 public void deleteusre(@PathVariable int id) {
		 Optional<Users> uss =rep.findById(id);
		 if(uss.isPresent()) {
			 rep.deleteById(id);
		 }
		 
		 
		    
	 }
	   
	 
	 
	 

}