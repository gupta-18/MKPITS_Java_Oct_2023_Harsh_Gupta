package com.mkpits.bank.validator;

import com.mkpits.bank.dto.request.UserRequestDto;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {

    public void validateAndSetAccountType(UserRequestDto userRequestDto) {
        String accountType = userRequestDto.getAccountType();
        if (accountType == null || (!accountType.equalsIgnoreCase("savings")   && !accountType.equalsIgnoreCase("fixed deposit")  && !accountType.equalsIgnoreCase("recurring deposit")  && !accountType.equalsIgnoreCase("current"))) {
            throw new RuntimeException("'accountType' must be 'savings','current','fixed deposit' or 'recurring deposit'");
        }
        userRequestDto.setAccountType(accountType.toLowerCase());
    }

}
