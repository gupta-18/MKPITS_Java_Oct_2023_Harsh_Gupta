package com.mkpits.bank.dto.response;

import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AccountPostResponseDto {
    private  Integer userId;

    private  String accountType;

    @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "'rateOfInterest' must contain numeric characters only")
    private  String rateOfInterest;

    @Pattern(regexp = "^\\d+(\\.\\d+)?$", message = "'balance' must contain numeric characters only")
    private  String balance;
}
