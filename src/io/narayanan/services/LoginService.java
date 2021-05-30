package io.narayanan.services;

import java.util.HashMap;
import java.util.Map;

import io.narayanan.dto.User;

public class LoginService {
	
	Map<String, String> users = new HashMap<>();
	
	public LoginService() {
		users.put("jd", "John Doe");
		users.put("ns", "Narayanan S");
		users.put("ab", "abcd");
	}

	public boolean authenticate(String userId, String password) {
		if (password == null || password.trim() == "") return false;
		return true;
	}

	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserId(userId);
		int count = 0;
		for (String k : users.keySet()) {
			if(k.equals(userId)) {
				user.setUserName(users.get(userId));
				count = 1;
				break;
			}
		}
		if (count == 0) user.setUserName("New User");
		
		return user;
	}
	
	
}
