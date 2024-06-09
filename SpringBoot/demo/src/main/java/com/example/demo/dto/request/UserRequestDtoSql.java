package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDtoSql {

    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String mobile;
    private String email;

}
