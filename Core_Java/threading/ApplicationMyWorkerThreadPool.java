package com.mkpits.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationMyWorkerThreadPool {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		
		for (int i = 0; i <5; i++) {
            Runnable worker = new MyWorkerThread("task" +i)	;	
              executor.execute(worker);
		}
		boolean var = executor.isTerminated();
     	executor.shutdown();
     
     	System.out.println(var);
		
			System.out.println("Finished all threads");
		
		
	}

}
