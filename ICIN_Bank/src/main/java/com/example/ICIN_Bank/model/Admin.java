package com.example.ICIN_Bank.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Admin {

	@Id
	@GeneratedValue()
	private String username;
	private  String passworad;
	public Admin(String username, String passworad) {
		super();
		this.username = username;
		this.passworad = passworad;
	}
	public Admin() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassworad() {
		return passworad;
	}
	public void setPassworad(String passworad) {
		this.passworad = passworad;
	}
	
	
}