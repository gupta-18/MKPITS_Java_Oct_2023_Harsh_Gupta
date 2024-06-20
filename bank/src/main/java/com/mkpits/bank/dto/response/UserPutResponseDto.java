package com.mkpits.bank.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPutResponseDto {
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String mobile;
    private String email;
    private String address;
    private String city;
    private LocalDate dob;
}
