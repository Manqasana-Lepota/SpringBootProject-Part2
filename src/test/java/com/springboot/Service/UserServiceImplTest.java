package com.springboot.Service;

import com.springboot.Model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private TestRestTemplate template;

    @Test
    public void addUser() {
    }

    @Test
    public void removeUser() {
    }

    @Test
    public void getUser() {
    }

    @Test
    public void getUserCache() {
        User user1 = userService.getUser(1);
        User user2 = userService.getUser(2);
        User user3 = userService.getUser(3);
        User user4 = userService.getUser(4);


        System.out.println(user1 + "" + user2 + "" + user3 + "" + user4);
    }

}