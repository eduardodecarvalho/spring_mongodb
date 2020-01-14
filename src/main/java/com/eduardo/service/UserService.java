package com.eduardo.service;

import java.util.List;

import com.eduardo.model.User;
import com.eduardo.model.dto.UserDTO;
import com.eduardo.model.mapper.UserMapper;

public class UserService {

    private final UserMapper userMapper = null;

    public List<User> findAll() {

        final UserDTO users = userMapper(user);

        return null;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

}
