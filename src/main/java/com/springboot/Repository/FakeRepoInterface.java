package com.springboot.Repository;


import com.springboot.Model.User;

public interface FakeRepoInterface {

    User insertUser(long id, String name, String surname);
    User findUserById(long id);
    void deleteUser(long id);


}
