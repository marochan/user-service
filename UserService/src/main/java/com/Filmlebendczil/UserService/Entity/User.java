package com.Filmlebendczil.UserService.Entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String token;
	private  String username;
	
	
	public User(String token, String username) {
		super();
		this.token = token;
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
