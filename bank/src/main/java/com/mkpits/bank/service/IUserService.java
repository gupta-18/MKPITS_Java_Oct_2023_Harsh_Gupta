package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.UserGetResponseDto;
import com.mkpits.bank.dto.response.UserPostResponseDto;
import com.mkpits.bank.dto.response.UserPutResponseDto;

import java.util.List;

public interface IUserService {

    public UserGetResponseDto getUserById(Integer id);

    public List<UserGetResponseDto> getAllUsers();

    public UserPostResponseDto createUser(UserRequestDto userRequestDto);

    public UserPutResponseDto updateUser(UserRequestDto userRequestDtoSql);

    public UserRequestDto deleteUser(Integer id);


}
