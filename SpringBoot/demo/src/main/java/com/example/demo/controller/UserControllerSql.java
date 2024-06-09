package com.example.demo.controller;


import com.example.demo.dto.request.UserRequestDtoSql;
import com.example.demo.dto.response.UserResponseDtoSql;
import com.example.demo.service.IUserSql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControllerSql {
    @Autowired
    IUserSql iUserSql;

//    @RequestMapping("/sql/users")
//    public ResponseEntity<Object> getUser() {
//        UserDtoSql userDtoSql = userServiceSql.getUserById();
//        return  ResponseEntity.ok(userDtoSql);
//    }


    //    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.GET)
    @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        UserRequestDtoSql userRequestDtoSql = iUserSql.getUserById(id);
        System.out.println("Service Constructor: " + iUserSql.hashCode());
        return ResponseEntity.ok(userRequestDtoSql);

    }

    //    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PUT)
    @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDtoSql userRequestDtoSql) {
        userRequestDtoSql.setId(id);
        UserRequestDtoSql userDtoReturn = iUserSql.updateUser(userRequestDtoSql);
        return ResponseEntity.ok(userDtoReturn);
    }

//@RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PATCH)
    @PatchMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updatePatchUser(@PathVariable("id") Integer id, @RequestBody UserRequestDtoSql userRequestDtoSql) {
        userRequestDtoSql.setId(id);
        UserRequestDtoSql userDtoReturn = iUserSql.updatePatchUser(userRequestDtoSql);
        return ResponseEntity.ok(userDtoReturn);
    }

    //@RequestMapping(value = "/v1/users", method = RequestMethod.POST)
    @PostMapping(path = "/v1/users")
    public ResponseEntity<Object> createUser(@RequestBody UserRequestDtoSql userRequestDtoSql) {
        UserResponseDtoSql userResponseDtoSqlReturn = iUserSql.createUser(userRequestDtoSql);
        return ResponseEntity.ok(userResponseDtoSqlReturn);
    }

   // @RequestMapping(value = "/v1/users", method = RequestMethod.GET)
   @GetMapping(path = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Object> getAllUsers() {
        List<UserRequestDtoSql> userRequestDtoSqlList = iUserSql.getAllUsers();
        return ResponseEntity.ok(userRequestDtoSqlList);

    }

    //@RequestMapping(value = "/v1/users/{id}", method = RequestMethod.DELETE)
    @DeleteMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserRequestDtoSql userRequestDtoSql = iUserSql.deleteUser(id);
        if (userRequestDtoSql != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }

    }
}
