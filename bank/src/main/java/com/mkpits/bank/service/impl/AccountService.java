package com.mkpits.bank.service.impl;


import com.mkpits.bank.dto.request.AccountRequestDto;
import com.mkpits.bank.dto.request.MoneyTransferRequestDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.AccountGetResponseDto;
import com.mkpits.bank.dto.response.AccountPostResponseDto;
import com.mkpits.bank.dto.response.AccountPutResponseDto;
import com.mkpits.bank.entity.Accounts;
import com.mkpits.bank.entity.Users;
import com.mkpits.bank.exception.AccountLimitExceededException;
import com.mkpits.bank.repository.AccountRepository;
import com.mkpits.bank.service.IAccountService;
import com.mkpits.bank.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountService implements IAccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    IUserService iUserService;

    @Autowired
    UserService userService;



    @Override
    public AccountGetResponseDto getAccountByUserId(Integer userId) {

        Optional<Accounts> accounts = accountRepository.findByUserId(userId);
        AccountGetResponseDto accountGetResponseDto = new AccountGetResponseDto();
        if (accounts.isPresent()) {
            accountGetResponseDto = convertAccountsToAccountGetResponseDto(accounts.get());
        }
        return accountGetResponseDto;
    }

    @Override
    public List<AccountGetResponseDto> getAccountsByUserId(Integer userId) {
        List<Accounts> accountsList = accountRepository.findAccountsByUserId(userId);
        List<AccountGetResponseDto> responseDtoList = new ArrayList<>();

        for (Accounts accounts : accountsList) {
            AccountGetResponseDto dto = convertAccountsToAccountGetResponseDto(accounts);
            responseDtoList.add(dto);
        }

        return responseDtoList;
    }

    @Transactional
    @Override
    public void transferAmount(MoneyTransferRequestDto transferRequest) {

        Integer fromUserId = transferRequest.getFromUserId();
        Integer toUserId = transferRequest.getToUserId();
        BigDecimal amount = transferRequest.getAmount();

        if (fromUserId.equals(toUserId)) {
            throw new RuntimeException("Sender cannot send money to themselves");
        }

        Accounts fromAccount = accountRepository.findByUserId(fromUserId)
                .orElseThrow(() -> new RuntimeException("Sender not found"));

        Accounts toAccount = accountRepository.findByUserId(toUserId)
                .orElseThrow(() -> new RuntimeException("Receiver not found"));

        BigDecimal fromBalance = new BigDecimal(fromAccount.getBalance());
        BigDecimal toBalance = new BigDecimal(toAccount.getBalance());

        if (fromBalance.compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient balance");
        }

        fromAccount.setBalance(fromBalance.subtract(amount).toString());
        toAccount.setBalance(toBalance.add(amount).toString());

        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);
    }

    @Override
    public AccountPutResponseDto updateAccount(UserRequestDto userRequestDto) {
        Optional<Accounts> accountsOptional = accountRepository.findByUserId(userRequestDto.getUserId());
        AccountPutResponseDto accountPutResponseDto = new AccountPutResponseDto();
        if (accountsOptional.isEmpty()) {
            System.out.println("ID not found ");
        } else {

            Accounts accounts = convertUserRequestDtoToAccounts(userRequestDto, accountsOptional.get());
            accounts = accountRepository.save(accounts);
            return convertAccountsToAccountPutResponseDto(accounts);
        }
        return accountPutResponseDto;
    }

    @Override
    public AccountPostResponseDto createAccount(AccountRequestDto accountRequestDto) {
        Users users = new Users();

        // Fetch counts for each account type
        int currentCount = accountRepository.countByAccountType("current");
        int savingsCount = accountRepository.countByAccountType("savings");
        int fdCount = accountRepository.countByAccountType("fixed deposit");
        int rdCount = accountRepository.countByAccountType("recurring deposit");

        // Convert account type to lowercase for consistency
        String accountType = accountRequestDto.getAccountType().toLowerCase();

        // Check if the limits for each account type are exceeded
        if ((accountType.equals("current") && currentCount >= 1)
                || (accountType.equals("savings") && savingsCount >= 1)
                || (accountType.equals("recurring deposit") && rdCount >= 5)
                || (accountType.equals("fixed deposit") && fdCount >= 5)) {
            throw new AccountLimitExceededException("You have reached the limit to open: " + accountType + " account.");
        }

        // Convert DTO to entity and save
        Accounts accounts = convertUserRequestDtoToAccounts(accountRequestDto, users);
        accounts = accountRepository.save(accounts);

        // Convert entity to response DTO and return
        return convertAccountsToAccountPostResponseDto(new AccountPostResponseDto(), accounts);
    }

    private AccountPostResponseDto convertAccountsToAccountPostResponseDto(AccountPostResponseDto accountPostResponseDto, Accounts accounts) {
        return AccountPostResponseDto.builder()
                .userId(accounts.getUserId())
                .accountType(accounts.getAccountType())
                .rateOfInterest(accounts.getRateOfInterest())
                .balance(accounts.getBalance())
                .build();
    }

    private Accounts convertUserRequestDtoToAccounts(AccountRequestDto accountRequestDto, Users users) {
        return Accounts.builder()
                .userId(accountRequestDto.getUserId())
                .accountType(accountRequestDto.getAccountType())
                .balance(accountRequestDto.getBalance())
                .rateOfInterest("0")
                .createdAt(LocalDateTime.now())
                .createdBy(1)
                .build();
    }



    private AccountPutResponseDto convertAccountsToAccountPutResponseDto(Accounts accounts) {
        return AccountPutResponseDto.builder()
                .rateOfInterest(accounts.getRateOfInterest())
                .build();
    }

    private Accounts convertUserRequestDtoToAccounts(UserRequestDto userRequestDto, Accounts accounts) {

//        accounts = Accounts.builder()
//                .username(userRequestDto.getUsername())
//                .accountType(userRequestDto.getAccountType())
//                .rateOfInterest(userRequestDto.getRateOfInterest())
//                .balance(userRequestDto.getBalance())
//                .build();

//        The error you are encountering is due to the fact that your convertUserRequestDtoToAccounts
//        method is creating a new Accounts object with only some fields set, leaving others as null.
//        When you save this new Accounts object, it attempts to insert it into the database with null values for the fields you didn't set, which violates the database constraints.


        if (userRequestDto.getRateOfInterest() != null) {
            accounts.setRateOfInterest(userRequestDto.getRateOfInterest());
        }
        return accounts;

    }


    private AccountGetResponseDto convertAccountsToAccountGetResponseDto(Accounts accounts) {

        return AccountGetResponseDto.builder()
                .userId(accounts.getUserId())
                .accountType(accounts.getAccountType())
                .rateOfInterest(accounts.getRateOfInterest())
                .balance(accounts.getBalance())
                .build();
    }


}
