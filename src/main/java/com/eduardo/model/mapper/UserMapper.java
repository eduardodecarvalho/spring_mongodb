package com.eduardo.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.eduardo.model.User;
import com.eduardo.model.dto.UserDTO;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    User map(UserDTO dto);

    UserDTO map(User user);

}