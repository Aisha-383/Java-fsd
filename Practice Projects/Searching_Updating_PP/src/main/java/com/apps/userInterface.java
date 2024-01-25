package com.apps;

import com.entity.User;

public interface userInterface {
    User findById(Long id);
    void update(User user);
}
