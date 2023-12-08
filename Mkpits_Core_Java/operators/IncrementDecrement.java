package com.mkpits.operators;

//increment decrement comes in unary operator

public  class IncrementDecrement {
// public static class IncrementDecrement{   ----- aisa nahi kar sakte means class static nahi ban sakti.
	
	int value =56;
	
//	IncrementDecrement obj1 = new IncrementDecrement(); This line is creating its instance and making it stackoverflow
// hum class me object bana sakte hai wo puri class me accesible rahega but eg: value = 10
//if main method me uski value  increment karke12 ho gayi to
//baad me dusri method me mujhe if wahi 10 chahiye to updated value 12 hi milegi.matlab har jagah pr value change hojayegi
	
	public static void main(String[] args) {
		IncrementDecrement obj = new IncrementDecrement();
//		System.out.println("The Increment values are :-");
//		obj.increment();
//		System.out.println("The Decrement values are :-");
//		obj.decrement();
		
//obj.value me ek ek karke value assign karna pad raha hai tabhi wo increase ho rahi hai 
//otherwise same value print hogi 
		obj.value=obj.returnvalue(obj.value);
		System.out.println(obj.value);
		obj.value=obj.returnvalue(obj.value);
		System.out.println(obj.value);
		//System.out.println(obj.returnvalue(obj.value));
		
		System.out.println(obj.returnvalue(obj.value));
		System.out.println(obj.returnvalue(obj.value));
		//obj.print();

	}
		
//	private void decrement() {
//		// int value = 56;
//		  
//		 System.out.println(--value);//55  memory holding 55
//		 System.out.println(--value);//54  memory holding 54
//		 System.out.println(value--);//54  memory holding 53a
//		 System.out.println(value--);//53  memory holding 52
//		 System.out.println(--value);//51  memory holding 51
//		 System.out.println(value--);//51  memory holding 50
//		 System.out.println(--value);//49  memory holding 49
//		 System.out.println(--value);//48  memory holding 48
//	}
//	private void increment() {
//		// int value = 56;
//		  
//		 System.out.println(++value);//57  memory holding 57
//		 System.out.println(++value);//58  memory holding 58
//		 System.out.println(value++);//58  memory holding 59
//		 System.out.println(value++);//59  memory holding 60
//		 System.out.println(++value);//61  memory holding 61
//		 System.out.println(value++);//61  memory holding 62
//		 System.out.println(++value);//63  memory holding 63
//		 System.out.println(++value);//64  memory holding 64
//	}
	
	public int returnvalue(int a)
	{
	
	//int h = obj.value;ye dusre method ka object hai isliyecall nhi hoga error show hoga
		
		return ++a;		
	}
	
//	public void print() {
//		int  g =	obj1.value;
//		System.out.println(g);
//	}
	
	
	
}
