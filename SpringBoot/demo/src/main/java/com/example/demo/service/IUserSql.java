package com.example.demo.service;

import com.example.demo.dto.request.UserRequestDtoSql;
import com.example.demo.dto.response.UserResponseDtoSql;

import java.util.List;

public interface IUserSql {
//    public UserDtoSql getAllDetails();

    public UserRequestDtoSql getUserById(Integer id);
    public UserResponseDtoSql createUser(UserRequestDtoSql userRequestDtoSql);
    public List<UserRequestDtoSql> getAllUsers();

    public UserRequestDtoSql updateUser(UserRequestDtoSql userRequestDtoSql);
    public UserRequestDtoSql updatePatchUser(UserRequestDtoSql userRequestDtoSql);
    public UserRequestDtoSql deleteUser(Integer id);
}
