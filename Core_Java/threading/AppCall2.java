package com.mkpits.threading;

public class AppCall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThreads t1= new MyThreads();
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//ek hi bar start ya run kar sakte hai uske baad nhi
		//t1.start();
		
		MyThreads t2= new MyThreads();
		t2.start();
		

	}

}
