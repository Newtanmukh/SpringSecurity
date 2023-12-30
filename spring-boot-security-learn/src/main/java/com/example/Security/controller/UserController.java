package com.example.Security.controller;


import com.example.Security.models.User;
import com.example.Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //basically means that data returned will be JSON  data.
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //all users
    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userService.getUsers();
    }

    //return single user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }

    @GetMapping("/{username}")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

 }
