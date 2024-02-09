package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCase {
	static BufferedReader br ;
	static SwitchCase obj;
	static float money, amount;
	public static void main(String[] args) throws NumberFormatException, IOException {
	br = new BufferedReader(new InputStreamReader(System.in));
	obj= new SwitchCase();
	
	System.out.println("\nChoose one of the below \n1.Create account\n2.Deposit\n3.Withdrawl\n4.Check balance");
	int choice = Integer.parseInt(br.readLine());
	
	switch (choice) {
	case 1:

		
		createAccount();
		System.out.println(" \nYou have successfully created your account now \n\n2.Press 2 for Deposit");
		 choice = Integer.parseInt(br.readLine());
		
		     switch (choice) {
		case 2:
			deposite();
			 System.out.println(" \nYou have successfully deposited your money \n3.Press 3 to Withdrawl\n");
			 choice = Integer.parseInt(br.readLine());
		
		 }
			
			 switch(choice){
		case 3:
		    withdrawl();
		    System.out.println("\nChoose one of the below\n4.Check balance");
			 choice = Integer.parseInt(br.readLine());
			}
		
			 switch(choice){
	    case 4:
				 checkBalance();
			 }
			 
			
			 System.out.println("\n*Thanks for using this application*\n");
			
		
		break;
	case 2:
		deposite();
		System.out.println("\nChoose one of the below\n3.Withdrawl\n4.Check balance");
		 choice = Integer.parseInt(br.readLine());
		        
		        switch(choice){
			case 3:
			    withdrawl();
			    System.out.println("\nChoose one of the below\n4.Check balance");
				 choice = Integer.parseInt(br.readLine());
				}
			
				 switch(choice){
		    case 4:
					 checkBalance();
				 }
		
		break;
	case 3:
		
		System.out.println("\nDeposite some amount first.");
		System.out.println("\nChoose one of the below\n4.Check balance");
		 choice = Integer.parseInt(br.readLine());
		 
		 switch(choice){
		    case 4:
					 checkBalance();
				 }
		
		break;
	case 4:
		System.out.println("Deposite some amount first");
		break;

	default:
		System.out.println("You are exiting from the application\nPress y to exit \n n to continue");
		char opinion = (char)br.read();
		br.readLine();
		if (opinion=='n') {
			System.out.println("Choose one of the below \n1.Create account\n2.Deposit\n3.Withdrawl\n4.Check balance");
			 choice = Integer.parseInt(br.readLine());
		}
		else {
			System.out.println("\n*Thanks for using this application*\n");
		}
		
		break;
	}

	}
	
	private static void checkBalance() {
		float balance = obj.money - obj.amount;
		System.out.println("Your account balance is "+balance +" ruppees.");
		
	}

	private static void withdrawl() throws NumberFormatException, IOException {
		System.out.println("How much amount you want to withdrawl?");
		 amount = Float.parseFloat(br.readLine());
		System.out.println("you have withdrawed "+ amount +" ruppees from your account");
		
	}

	public static void createAccount() throws IOException {
		
		System.out.println("Enter your name");
		String name = br.readLine();
		 
		System.out.println("Enter your number");
		long number = Long.parseLong(br.readLine());
	
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter your email");
		String email = br.readLine();
		
		System.out.println("Enter your gender");
		String gender = br.readLine();		
		
		System.out.println("\n*Your Accout Is Created*\n");
		System.out.println("Your name is :-"+name +"\n");
		System.out.println("Your age is :-"+age+"\n");
		System.out.println("Your gender is :-"+gender+"\n");
		System.out.println("Your number is :-"+number+"\n");
		System.out.println("Your email is :-"+email+"\n");
	
	}

	public static void deposite() throws NumberFormatException, IOException {
	System.out.println("How much money do you want to deposite?");
	money =Float.parseFloat(br.readLine());
	System.out.println("You have deposited "+money+" ruppees in your account");
	}
}
