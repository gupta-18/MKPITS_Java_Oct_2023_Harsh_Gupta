package com.mkpits.bank.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;


import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestDto {

     private  Integer id;//updateUser me controller or service k liye banaye hai
     private  Integer userId;//updateAccount me controller or service k liye banaye hai


    @NotNull(message = "'firstName' cannot be null")
    @Size(min = 1, max = 30)
    @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
     private  String firstName;

    @NotNull(message = "'middleName' cannot be null")
    @Size(min = 1, max = 30)
    @Pattern(regexp = "[a-zA-Z]+", message = "'middleName' can only contain alphabets")
     private  String middleName;

    @NotNull(message = "'lastName' cannot be null")
    @Size(min = 1, max = 30)
    @Pattern(regexp = "[a-zA-Z]+", message = "'lastName' can only contain alphabets")
     private  String lastName;

    @NotNull(message = "'gender' cannot be null")
    @Size(max = 1)
    @Pattern(regexp = "^[mMfFoO]$", message = "'gender' must be one of the following characters: m, M, f, F, o, O")
    private  String  gender;//sql me char(1) liya hai

    @NotNull(message = "'mobile' number cannot be null")
    @Size(min = 10, message = "'mobile' must contain 10 digits")
    @Pattern(regexp = "^[0-9]+$", message = "mobile No. Must be a number")
     private  String mobile;

    @NotNull(message = "'email' cannot be null and must follow xyz3@gmail.com format")
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "'email' contain Ex:- xyz3@gmail.com")
     private  String email;

    @Pattern(regexp = "^[a-zA-Z0-9\\s,.'-]{5,100}$", message = "'address' can contain letters, numbers, spaces, and punctuation marks (,.'-), and must be between 5 and 100 characters")
     private  String address;

    @Pattern(regexp = "^[a-zA-Z\\s]{2,50}$", message = "'city' can contain letters and spaces, and must be between 2 and 50 characters")
     private  String city;

    @NotNull(message = "'dob' cannot be null and must follow yyyy-mm-dd format")
     private LocalDate dob;

    @NotNull(message = "'accountType' cannot be null and must follow yyyy-mm-dd format")
    private  String accountType;

    @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "'rateOfInterest' must contain numeric characters only")
    private  String rateOfInterest;

    @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "'balance' must contain numeric characters only")
    private  String balance;


}
