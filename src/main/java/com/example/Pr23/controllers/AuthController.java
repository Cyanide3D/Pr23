package com.example.Pr23.controllers;

import com.example.Pr23.models.User;
import com.example.Pr23.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/reg")
    public void registration(@RequestBody User user) {
        userService.save(user);
    }

}
