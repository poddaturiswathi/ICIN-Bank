package com.example.ICIN_Bank.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ICIN_Bank.model.Admin;
import com.example.ICIN_Bank.repo.adminrepoo;


@RestController
public class AdminController {
	
	@Autowired
	adminrepoo  repoo;

	 @GetMapping("/allusers")
	public List<Admin> getuserss(){
		return repoo.findAll();
	}
	 
	

}