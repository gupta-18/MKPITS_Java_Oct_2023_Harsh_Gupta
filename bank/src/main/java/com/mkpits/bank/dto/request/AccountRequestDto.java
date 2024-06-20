package com.mkpits.bank.dto.request;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountRequestDto {

    private Integer userId;


    @Pattern(regexp = "^(current|savings|fixed deposit|recurring deposit)$",
            message = "Invalid account type. Allowed values are: current, savings, fixed deposit, recurring deposit")
    private String accountType;


    @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "'rateOfInterest' must contain numeric characters only")
    private String rateOfInterest;

    @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "'balance' must contain numeric characters only")
    private String balance;
}
