package com.springboot.Repository;

import com.springboot.Model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {

    private List<User> userList = new CopyOnWriteArrayList<>();

    @Override
    public User insertUser(long id, String name, String surname) {
        userList.add(new User(id, name, surname));
        return new User(id, name, surname);
    }

    @Override
    public User findUserById(long id) {
        return userList
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .get();
    }

    @Override
    public void deleteUser(long id) {
        userList
                .stream()
                .forEach(user -> {
                    if (user.getId() == id) {
                        userList.remove(user);
                    }
                });
    }
}
