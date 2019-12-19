package com.cinema.service;

import java.util.HashMap;

import com.cinema.dto.User;

public class AutheticationService {
	
	HashMap<String, User> dadesUsuaris = new HashMap<>();

	public AutheticationService() {
		dadesUsuaris.put("pedro", new User("123A", "Pedro", "Sánchez", "psanchez@moncloa.com", "pedro", "pass1", "Pedro Sánchez"));
		dadesUsuaris.put("joan", new User("456B", "Joan", "Nicolau", "jnicolau@mail.com", "joan", "pass2", "Joan Nicolau"));
		dadesUsuaris.put("xavi", new User("789C", "Xavi", "Pérez", "psanchez@mail.com", "xavi", "pass3", "Xavi Pérez"));
	}
	
	public User getUsuari (String userId) {
		return dadesUsuaris.get(userId);
	
	}
	public boolean existUsuari (String userId) {
		return dadesUsuaris.containsKey(userId);
	
	}
	public boolean validUser (String userId, String userPass ) {
		return dadesUsuaris.containsKey(userId);
		
	
	}	
	

}
