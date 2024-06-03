package com.example.demo.controller;


import com.example.demo.dto.UserDtoSql;
import com.example.demo.service.impl.UserServiceSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerSql {
    @Autowired
    UserServiceSql userServiceSql;

    @RequestMapping("/sql/users")
    public ResponseEntity<Object> getUser() {
        UserDtoSql userDtoSql = userServiceSql.getAllDetails();
        return  ResponseEntity.ok(userDtoSql);
    }
}
