package com.mkpits.bank.contoller;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.UserGetResponseDto;
import com.mkpits.bank.dto.response.UserPostResponseDto;
import com.mkpits.bank.dto.response.UserPutResponseDto;
import com.mkpits.bank.entity.Accounts;
import com.mkpits.bank.service.IUserService;
import com.mkpits.bank.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService iUserService;




    @GetMapping(path ="/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id){
        UserGetResponseDto userGetResponseDtoReturn = iUserService.getUserById(id);
        return ResponseEntity.ok(userGetResponseDtoReturn);
    }

    @GetMapping(path ="/v1/users")
    public ResponseEntity<Object> getAllUsers(){
        List<UserGetResponseDto>userGetResponseDtoListReturn= iUserService.getAllUsers();
        return  ResponseEntity.ok(userGetResponseDtoListReturn);
    }


    @PostMapping(path = "/v1/users")
    public ResponseEntity<Object> createUser( @Valid @RequestBody UserRequestDto userRequestDto){
        UserPostResponseDto userPostResponseDtoReturn = iUserService.createUser(userRequestDto);
        return  ResponseEntity.created(URI.create("/v1/users" + userPostResponseDtoReturn.getId())).body(userPostResponseDtoReturn);
    }

    @PutMapping(path = "/v1/users/{id}")
     public  ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto ){
        userRequestDto.setId(id);
        UserPutResponseDto userPutResponseDtoReturn = iUserService.updateUser(userRequestDto);
        return  ResponseEntity.ok(userPutResponseDtoReturn);
    }

    @DeleteMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
    UserRequestDto userRequestDto = iUserService.deleteUser(id);
        if (userRequestDto != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }    }

}
