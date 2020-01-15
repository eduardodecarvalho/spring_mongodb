package com.eduardo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.model.User;
import com.eduardo.model.dto.UserDTO;
import com.eduardo.model.mapper.UserMapper;

@Service
public class UserService {

    private UserMapper mapper;

    public List<UserDTO> findAll() {
        final User user = new User();
        final UserDTO users = mapper.map(user);

        return null;
    }

}
