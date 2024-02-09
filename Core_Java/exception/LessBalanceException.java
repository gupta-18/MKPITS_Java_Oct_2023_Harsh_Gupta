package com.mkpits.exception;

public class LessBalanceException extends Exception {

	
	int amount;




public  LessBalanceException(int amount) {
	this.amount =amount;
}

//tostring method system ki hai ye append hoke ayegi hi  constructor chahe parametrized ho ya na ho
//or koi or method likhte khud se to koi call nahi jata hai
@Override
public String toString() {
	return "LessBalanceException [amount=" + amount + "]";
}

}
