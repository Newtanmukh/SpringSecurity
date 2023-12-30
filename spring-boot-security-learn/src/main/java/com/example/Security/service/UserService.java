package com.example.Security.service;

import com.example.Security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<User>();

    public UserService() {
        list.add(new User("newtan","mukherjee", "abc@gmail.com"));
        list.add(new User("newtan2","mukherje2e", "xyz@gmail.com"));
    }

    //get all users

    public List<User> getUsers(){
        return this.list;
    }

    public User getUser(String username){
        return this.
                list.
                stream().
                filter(user -> user.getUsername().equals(username)).
                findAny().
                orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }

}
