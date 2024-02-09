package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoop {

	 static WhileLoop obj;
	 static BufferedReader br ;
	 float money, amount, balance;
	 String name, gender, email;
	 long number, account;
	 int age;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		obj = new WhileLoop();
		char ch ='y';
		
		
		
		while (ch =='y'|| ch =='Y') {
			
			System.out.println("\nChoose one of the below \n1.Create account\n2.Deposit\n3.Withdrawl\n4.Check balance\n5.Get your details");
			int choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				obj.createAccount();
				break;
			case 2:
				obj.deposite();
				break;
			case 3:
				obj.withdrawl();
				break;
			case 4:
				obj.checkBalance();
				break;
			case 5:
				obj.getData();
				break;

			default:
				System.out.println("Press valid key");
				break;
				
			}
			
			System.out.println("Do you wish to continue y/n");
			ch = (char)br.read();
			br.readLine();
			
			
		}
		
	}

public void getData() {
	System.out.println("\n*Your Accout Is Created*\n");
	System.out.println("Your name is :-"+name +"\n");
	System.out.println("Your age is :-"+age+"\n");
	System.out.println("Your gender is :-"+gender+"\n");
	System.out.println("Your number is :-"+number+"\n");
	System.out.println("Your email is :-"+email+"\n");
	System.out.println("Your Account number is :-"+account+"\n");
	System.out.println("Your account balance is "+balance +" ruppees.");
	}

public  void createAccount() throws IOException {
		
		System.out.println("Enter your name");
		 name = br.readLine();
		 
		System.out.println("Enter your number");
		 number = Long.parseLong(br.readLine());
	
		System.out.println("Enter your age");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter your email");
		 email = br.readLine();
		
		System.out.println("Enter your gender");
		 gender = br.readLine();		
		
		 account = (long)(Math.ceil((Math.random()*10000000000l))) ;
		 
		 System.out.println("Your account is created");
		
		
		
		
	
	}
public  void deposite() throws NumberFormatException, IOException {
	System.out.println("How much money do you want to deposite?");
	money =Float.parseFloat(br.readLine());
	System.out.println("You have deposited "+money+" ruppees in your account");
	}

private  void checkBalance() {
	balance = obj.money - obj.amount;
	System.out.println("Your account balance is "+balance +" ruppees.");
	
}

private  void withdrawl() throws NumberFormatException, IOException {
	System.out.println("How much amount you want to withdrawl?");
	 amount = Float.parseFloat(br.readLine());
	System.out.println("you have withdrawed "+ amount +" ruppees from your account");
	
}
}

