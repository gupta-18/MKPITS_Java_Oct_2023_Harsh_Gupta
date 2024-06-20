package com.mkpits.bank.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class AccountResponseDto {
    private List<AccountGetResponseDto> accounts;

}
