package com.mkpits.bank.contoller;

import com.mkpits.bank.dto.request.AccountRequestDto;
import com.mkpits.bank.dto.request.MoneyTransferRequestDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.AccountGetResponseDto;
import com.mkpits.bank.dto.response.AccountPostResponseDto;
import com.mkpits.bank.dto.response.AccountPutResponseDto;
import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.service.IAccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    IAccountService iAccountService;


    @GetMapping(path = "/v1/accounts/users/{userId}")
    public ResponseEntity<Object> getAccount(@PathVariable("userId") Integer userId) {
        AccountGetResponseDto accountGetResponseDtoReturn = iAccountService.getAccountByUserId(userId);
        return ResponseEntity.ok(accountGetResponseDtoReturn);
    }


    @GetMapping("/api/v1/accounts/users/{userId}")
    public ResponseEntity<AccountResponseDto> getAccountsByUserId(@PathVariable Integer userId) {
        List<AccountGetResponseDto> accountGetResponseDtoList = iAccountService.getAccountsByUserId(userId);
        AccountResponseDto response = new AccountResponseDto(accountGetResponseDtoList);
        return ResponseEntity.ok(response);
    }


    @PostMapping(path="/api/v1/accounts")
    public ResponseEntity<Object> createAccount(@Valid @RequestBody AccountRequestDto accountRequestDto) {
        AccountPostResponseDto accountPostResponseDto = iAccountService.createAccount(accountRequestDto);
        return ResponseEntity.created(URI.create("/api/v1/accounts/" + accountPostResponseDto.getUserId())).body(accountPostResponseDto);
    }


        @PutMapping(path = "/api/v1/accounts/users/{userId}")
    public ResponseEntity<Object> updateAccount(@PathVariable("userId") Integer userId, @RequestBody UserRequestDto userRequestDto) {

        userRequestDto.setUserId(userId);
        AccountPutResponseDto accountPutResponseDto = iAccountService.updateAccount(userRequestDto);

        if (accountPutResponseDto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(accountPutResponseDto, HttpStatus.OK);
        }
    }

//for transaction
    @PostMapping(path ="/api/v1/accounts/users/{userId}")
    public ResponseEntity<Object> transferAmount(@PathVariable Integer userId, @RequestBody MoneyTransferRequestDto transferRequest) {
        transferRequest.setFromUserId(userId);
        iAccountService.transferAmount(transferRequest);
        return new ResponseEntity<>("Transfer successful", HttpStatus.OK);
    }
}
