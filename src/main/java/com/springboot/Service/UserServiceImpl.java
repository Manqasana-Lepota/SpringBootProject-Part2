package com.springboot.Service;

import com.springboot.Model.User;
import com.springboot.Repository.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;


public class UserServiceImpl implements UserService {

    @Autowired
    private FakeRepo fakeRepo;

    private User user;


    @Override
    public void addUser(long id, String name, String surname) {
        fakeRepo.insertUser(id,name,surname);
        System.out.println(user.getName() + " entered");


    }

    @Override
    public void removeUser(long id) {
        fakeRepo.deleteUser(id);
        System.out.println(user.getName() + " removed");

    }

    @Override
    @Cacheable("user{id}")
    public User getUser(long id) {

        System.out.println("Searching by ID  : " + id);

        try {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        return fakeRepo.findUserById(id);




    }
}
