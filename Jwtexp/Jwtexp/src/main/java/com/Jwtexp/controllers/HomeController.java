package com.Jwtexp.controllers;


import com.Jwtexp.models.User;
import com.Jwtexp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController

@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("Getting users");
        return userService.getusers();
    }

    @GetMapping("/current-user")
    public String getLoggedUser(Principal principal){
        return principal.getName();
    }
}
