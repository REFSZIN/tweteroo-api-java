package com.tweteroo.tweteroo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.dtos.UserDTO;
import com.tweteroo.tweteroo.services.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth")
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping("/sign-up")
    public void create(@RequestBody UserDTO req) {
        service.save(req);
    }
}
