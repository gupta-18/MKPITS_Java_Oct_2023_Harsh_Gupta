package com.mkpits.bank.dto.response;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPostResponseDto {
    private Integer id;
    private String firstName;
    private String email;
    private String mobile;
}
