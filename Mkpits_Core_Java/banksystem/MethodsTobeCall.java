package com.mkpits.banksystem;

import java.io.IOException;

public interface MethodsTobeCall {

	abstract void setName() throws IOException;
	abstract void setMobile() throws IOException;
	abstract void setEmail() throws IOException;
	abstract void setGender() throws IOException;
	abstract void setOtp() throws NumberFormatException, IOException ;

	
	abstract void getDeposite() throws NumberFormatException, IOException;
	abstract void getWithdrawl() throws NumberFormatException, IOException;
	abstract void getBalance();
	abstract void getName(String name) throws IOException;
	abstract void getMobile(String number) throws IOException;
	abstract void getEmail(String mail) throws IOException;
	abstract void getGender(String gender) throws IOException;
	
	abstract void getAccountNumber() ;
	
	
	
	
}
