package com.example.Security.controller;


import com.example.Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;


//http://localhost:8080/users/currentUser


@RestController  //basically means that data returned will be JSON  data.
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDetailsService userService;

    //all users
//    @GetMapping("/user")
//    public List<User> getAllUsers(){
//        return userService.getUsers();
//    }
    @GetMapping("/currentUser")
    public String getCurrentUser(Principal principal){
        return principal.getName();
    }


 }
