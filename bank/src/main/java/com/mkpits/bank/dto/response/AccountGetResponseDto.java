package com.mkpits.bank.dto.response;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountGetResponseDto {
    private  Integer userId;
    private  String accountType;
    private  String rateOfInterest;
    private  String balance;

}
