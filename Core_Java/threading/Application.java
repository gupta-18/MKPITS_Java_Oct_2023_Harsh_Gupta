package com.mkpits.threading;

public class Application {

	public static void main(String[] args) {

		
		MyThread m1 = new MyThread();
		m1.start();
		try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//thread by runnable interface
		

		MyThread2 m2 = new MyThread2();
//		m2.run();
		//if run method directly call kiya hai to wo thread count nhi hoga 
		//kyunki start method  se hi new thread born hota hai
		Thread t1 = new Thread(m2);
		t1.start();
		
	}

}
