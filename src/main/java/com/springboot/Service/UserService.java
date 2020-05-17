package com.springboot.Service;

import com.springboot.Model.User;

public interface UserService {

    void addUser(long id, String name, String surname);
    void removeUser(long id);
    User getUser(long id);
}
