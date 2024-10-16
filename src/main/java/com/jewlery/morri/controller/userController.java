package com.jewlery.morri.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jewlery.morri.model.User;
import com.jewlery.morri.service.userService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class userController {
    @Autowired
    private userService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) throws ExecutionException, InterruptedException {
        return userService.registerUser(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    


}
