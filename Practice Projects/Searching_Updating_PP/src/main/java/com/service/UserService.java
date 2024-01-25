package com.service;

import com.entity.User;

public interface UserService {
	    boolean validateUserId(Long id);
	    User findById(Long id);
	    void updateUser(User user);
	}

