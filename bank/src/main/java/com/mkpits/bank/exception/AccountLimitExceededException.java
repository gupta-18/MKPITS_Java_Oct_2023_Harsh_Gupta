package com.mkpits.bank.exception;

public class AccountLimitExceededException  extends  RuntimeException{
    public   AccountLimitExceededException (String message){
        super(message);
    }
}
