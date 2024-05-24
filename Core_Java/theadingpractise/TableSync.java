package com.mkpits.theadingpractise;

public class TableSync {

	
	//synchronized method ye hai
//	synchronized public void printTable(int n) {
//		for (int i = 1; i <=10 ; i++) {
//            
//			System.out.println(n*i);		
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//			e.printStackTrace();}
	
	//synchronized block ye hai 
			public void printTable(int n) {
				
				synchronized (this) {
					
					for (int i = 1; i <=10 ; i++) {
						
						System.out.println(n*i);		
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();}
				
				}
				
		}
	}
}
