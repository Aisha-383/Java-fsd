package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.userImp;
import com.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private userImp userDAO;

    @Override
    public boolean validateUserId(Long id) {
        return id != null && id > 0;
    }

    @Override
    public User findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.update(user);
    }

}
