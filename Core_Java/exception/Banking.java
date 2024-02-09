package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mkpits.cfs.SwitchCase;

public class Banking {

	static int bal,amt,c;
	static BufferedReader br;
	
	void deposite() {
		System.out.println("Enter Deposite amount");
		try {
			this.amt= Integer.parseInt(br.readLine());
			System.out.println("Amount deposited");
		}catch (IOException e) {
			e.printStackTrace();
		}
		bal = bal+this.amt;
	}
	
	
	
	void withdraw() throws LessBalanceException {
		System.out.println("Enter withdraw Amount");
		try {
			this.amt = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		if((bal-this.amt)<500) {
			throw new LessBalanceException(bal);
//yaha se ctach pr jayega or exception apni  manually created subclass lessbalance pr call dega or fir us hisab se constructor call hoga
			//tostring bhi append hoke hi ayegi usme
		}else {
			bal-=this.amt;
		}
	}
	
	
	
	int getBalance() {
		return bal;
	}
	
	public static void main(String[] args) {

		Banking b = new Banking();
		
		try {
			char ch = 'y';
			while(ch == 'y' || ch == 'Y') {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("1.Deposite \n2.Withdrawl \3.Check Balance \n Enter your choice ");
			c =Integer.parseInt(br.readLine());
			switch (c) {
			case 1:
				b.deposite();
				System.out.println("Your balance is " + bal);
				break;
			case 2:
				b.withdraw();
				System.out.println("Your balance is "+ bal);
				break;
			case 3:
				System.out.println("Your account balance is " + bal);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you wish to continue ? \n y/n");
			ch = (char) br.read();
			br.readLine();
			}
		}catch( Exception e) {
			System.out.println(e);
		}
		
	}

}
