package com.eduardo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.model.dto.UserDTO;
import com.eduardo.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/v1/users")
    public List<UserDTO> findAll() {
        return userService.findAll();
    }
}
