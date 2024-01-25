package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public class userImp implements userInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }
}
