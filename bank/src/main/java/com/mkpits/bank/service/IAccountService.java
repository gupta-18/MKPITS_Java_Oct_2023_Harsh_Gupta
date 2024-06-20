package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.AccountRequestDto;
import com.mkpits.bank.dto.request.MoneyTransferRequestDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.*;


import java.util.List;

public interface IAccountService {

    public AccountGetResponseDto getAccountByUserId(Integer id) ;
    public void transferAmount(MoneyTransferRequestDto transferRequest) ;
    public AccountPutResponseDto updateAccount( UserRequestDto userRequestDto) ;
    public AccountPostResponseDto createAccount(AccountRequestDto accountRequestDto);
    public List<AccountGetResponseDto> getAccountsByUserId(Integer userId);


}
