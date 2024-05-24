package com.mkpits.threading;

import com.mkpits.exception.TryCatch;

public class MyThreads extends Thread {

	
@Override
public void run() {
	try {
		//itne seconds k baad run hoga
		Thread.sleep(10000);
	} catch (Exception e) {
	e.printStackTrace();
	}
		
		for (int i = 0; i <=5; i++) {
			System.out.println(i+"printb ho gaya");
			
		}
}
	
	
}
