package com.mkpits.bank.service.impl;


import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.UserGetResponseDto;
import com.mkpits.bank.dto.response.UserPostResponseDto;
import com.mkpits.bank.dto.response.UserPutResponseDto;
import com.mkpits.bank.entity.Accounts;
import com.mkpits.bank.entity.Users;
import com.mkpits.bank.repository.AccountRepository;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IUserService;
import com.mkpits.bank.validator.UserValidator;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    private UserValidator userValidator;


    @Override
    public UserGetResponseDto getUserById(Integer id) {
        Optional<Users> users = userRepository.findById(id);
        UserGetResponseDto userGetResponseDto = new UserGetResponseDto();
        if (users.isPresent()) {
            userGetResponseDto = convertUsersToUserGetResponseDto(users.get());
        }
        return userGetResponseDto;
    }

    @Override
    public List<UserGetResponseDto> getAllUsers() {

        List<Users> usersList = (List<Users>) userRepository.findAll();
        List<UserGetResponseDto> userGetResponseDtoList = new ArrayList<>();
        for (Users users : usersList) {
            UserGetResponseDto userGetResponseDto = convertUsersToUserGetResponseDto(users);
            userGetResponseDtoList.add(userGetResponseDto);
        }
        return userGetResponseDtoList;
    }

    @Override
    @Transactional
    public UserPostResponseDto createUser(UserRequestDto userRequestDto) {

        userValidator.validateAndSetAccountType(userRequestDto);

        Users users = new Users();
        //setting values in users table
        users = convertUserRequestDtoToUsers(userRequestDto, users);
        users = userRepository.save(users);

        Accounts accounts = new Accounts();
        //setting values in accounts table
        accounts = convertUserRequestDtoToAccounts(userRequestDto, accounts, users);
        accounts = accountRepository.save(accounts);


        UserPostResponseDto userPostResponseDto = new UserPostResponseDto();
        //setting values for response
        userPostResponseDto = convertAccountsAndUsersToUserPostResponseDto(userPostResponseDto, accounts, users);

        //returning it because I want it in response only these fields
        return userPostResponseDto;
    }

    @Override
    public UserPutResponseDto updateUser(UserRequestDto userRequestDto) {
        Optional<Users> usersOptional = userRepository.findById(userRequestDto.getId());
        UserPutResponseDto userPutResponseDto = new UserPutResponseDto();
        if (usersOptional.isEmpty()) {
            System.out.println("ID not found ");
        }else {
            Users users = convertUserRequestDtoToUsers(userRequestDto,usersOptional.get() );
            users.setId(userRequestDto.getId());
            users = userRepository.save(users);
            return convertUsersToUserPutResponseDto(users);
        }

        return  userPutResponseDto;
    }

    @Override
    public UserRequestDto deleteUser(Integer id) {
       Optional<Users> usersOptional = userRepository.findById(id);
       if (usersOptional.isEmpty()){
           return  null;
       }else {
           userRepository.deleteById(id);
           return  convertUsersToUserRequestDto(usersOptional.get());
       }
    }


    private UserRequestDto convertUsersToUserRequestDto(Users users) {
        return  UserRequestDto.builder()
                .id(users.getId())
                .build();
    }

    private UserPutResponseDto convertUsersToUserPutResponseDto(Users users) {
    return  UserPutResponseDto.builder()
            .firstName(users.getFirstName())
            .middleName(users.getMiddleName())
            .lastName(users.getLastName())
            .gender(users.getGender())
            .mobile(users.getMobile())
            .email(users.getEmail())
            .address(users.getAddress())
            .city(users.getCity())
            .dob(users.getDob())
            .build();

    }

    private UserPostResponseDto convertAccountsAndUsersToUserPostResponseDto(UserPostResponseDto userPostResponseDto, Accounts accounts, Users users) {
        userPostResponseDto = UserPostResponseDto.builder()
                .id(users.getId())
                .firstName(users.getFirstName())
                .mobile(users.getMobile())
                .email(users.getEmail())
                .build();
        return userPostResponseDto;
    }

    private Accounts convertUserRequestDtoToAccounts(UserRequestDto userRequestDto, Accounts accounts, Users users) {

        accounts = Accounts.builder()
                //userId is fk to users se id lena hai
                .userId(users.getId())
                .accountType(userRequestDto.getAccountType())
                .balance(userRequestDto.getBalance())
                .rateOfInterest("0")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .createdBy(1)
                .updatedBy(1)
                .build();
        return accounts;
    }

    private Users convertUserRequestDtoToUsers(UserRequestDto userRequestDto, Users users) {
        //id is auto increment that's why no need to set it
        users = Users.builder()
                .firstName(userRequestDto.getFirstName())
                .middleName(userRequestDto.getMiddleName())
                .lastName(userRequestDto.getLastName())
                .gender(userRequestDto.getGender())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .address(userRequestDto.getAddress())
                .city(userRequestDto.getCity())
                .dob(userRequestDto.getDob())
                .updatedAt(LocalDateTime.now())
                .updatedBy(1)
                .createdAt(LocalDateTime.now())
                .createdBy(1)
                .build();
        return users;
    }

    private UserGetResponseDto convertUsersToUserGetResponseDto(Users users) {

        return UserGetResponseDto.builder()
                .id(users.getId())
                .firstName(users.getFirstName())
                .middleName(users.getMiddleName())
                .lastName(users.getLastName())
                .gender(users.getGender())
                .mobile(users.getMobile())
                .email(users.getEmail())
                .address(users.getAddress())
                .city(users.getCity())
                .dob(users.getDob())
                .build();
    }





}
