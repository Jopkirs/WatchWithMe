package com.kaigo.watchwithme.controllers;

import com.kaigo.watchwithme.domain.User;
import com.kaigo.watchwithme.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //TODO: postUser нужно

    @GetMapping(path = "/user/{id}")
    public User getRoomById(@PathVariable long id) {
        return userService.getUserById(id);
    }

}
