package com.mkpits.banksystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankMethodWritting implements MethodsTobeCall {
	String name,email,gender,number;
	int otp ;
	double balance ,deposite;
	long account;
	
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    


	

	@Override
	public void setName() throws IOException {
		
		while(true) {
			System.out.println("Enter your name: ");
			this.name = br.readLine();
			if(this.name.isBlank()) {
				System.out.println("Enter valid name, it cannot be blank");
				continue;
			}
			break;
		}
	}
	
	
	

	@Override
	
	public void setMobile() throws IOException {
		while(true) {
			System.out.println("Enter mobile number");
			this.number = br.readLine();
			
			if(!this.number.matches("\\d+") || this.number.isBlank()||this.number.length()!=10) {
				System.out.println("Enter valid number");
				continue;
			}
			
			break;
		}
	}

	
	
	@Override
	public void setEmail() throws IOException {
		while( true) {
			System.out.println("Enter your email: ");
			this.email = br.readLine();
			
			String regex = "^(.+)@(.+)$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(this.email);
			
			if(!m.matches()||this.email.isBlank()) {
				System.out.println("Enter valid email: ");
				continue;
			}
			break;
		} 
		
	}

	
	
	@Override
	public void setGender() throws IOException {
		
		while(true) {
			System.out.println("Enter your gender m/f/o");
			this.gender = br.readLine();
//if wo emty bhi hai or jo hamne choice diye hai isme wo bhi nhi hai to envalid dega
			if(!this.gender.equalsIgnoreCase("f") && !this.gender.equalsIgnoreCase("m") 
					&& !this.gender.equalsIgnoreCase("o")) {
				System.out.println("Enter valid choice");
				continue;	
			}
			
			break;
		}
		
	}

	
	
	@Override
	public void setOtp() throws NumberFormatException, IOException {
	  
		while(true) {
		this.otp = (int)Math.floor(Math.random()*10000);
		System.out.println("OTP sent to "+this.number+" this number");
		System.out.println("This is your OTP:- "+this.otp);
		System.out.println("Please enter your otp ");
		String num = br.readLine();
		String otps = String.valueOf(this.otp);
		if(!num.matches(otps)|| otps.isBlank()) {
			System.out.println("Enter valid otp");
			continue;
		}
		break;
		}
	}

	
	


	
	@Override
	public void getName(String name) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Your name is:- "+name);
		
	}

	@Override
	public void getMobile(String number) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Your number is:- "+number);
		
	}

	@Override
	public void getEmail(String mail) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Your email is:- "+mail);
	}

	@Override
	public void getGender(String gender) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Your gender is:- "+gender);
		
	}

	

	@Override
	public void getAccountNumber() {
		 this.account =(long) Math.floor(Math.random()*1000000000000l);
		  System.out.println("Your account is created\n"+"This is your account number:- " + this.account);

		  System.out.println("Your current balance is :-" + this.balance);
		
	}

	
	
	@Override
	public void getDeposite() throws NumberFormatException, IOException {
		
		String hold;
		while(true  ) {
		System.out.println("How much money u want to deposite?");
		hold = br.readLine();
		if (!hold.matches("\\d+")|| hold.isBlank()) {
			System.out.println("Only numbers can be used for transaction");
			continue;
		}
		break;
		}
		this.deposite =Double.parseDouble(hold);
		this.balance += this.deposite;
		System.out.println("Ruppess"+this.deposite+" are credited in your account :-"+this.account);
		System.out.println("\nYour current balance is:- "+this.balance);
	}

	@Override
	public void getWithdrawl() throws NumberFormatException, IOException {
		
		
		System.out.println("\nYour account balance is:- "+this.balance);
		double temp,temp1;
		String money;
		while(true) {	
		System.out.println( "\nHow much money you want to withdraw?");
		 money = br.readLine();
		 if(!money.matches("\\d+")|| money.isBlank()) {
			 System.out.println("Only numbers are allowed for transactions");
			 continue;
		 }
		temp1 = Double.parseDouble(money);
		temp =this.balance - temp1;
		
		if(temp<0) {
			System.out.println("Insufficient Balance");
		   }
		else {
			System.out.println("Ruppess "+money+" are debited from your account :- "+this.account);
			this.balance =temp;
		}
		
		break;
		}
		
		
		
	}
	
	
	@Override
	public void getBalance() {
		
		System.out.println("Your account balance is :- " + this.balance+" ruppess.");
		
	}

	
	
}
