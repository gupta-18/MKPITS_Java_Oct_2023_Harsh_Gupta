package com.mkpits.threading;

public class MyWorkerThread extends Thread {
	
	String  task;
	
	public MyWorkerThread(String s) {
		
		this.task=s;
		
	}
	
@Override
public void run() {
	System.out.println(Thread.currentThread().getName()+"(Start) task = " +task);
	processtask();
	System.out.println(Thread.currentThread().getName()+"(End)");
	
}

private void processtask() {
	
	
try {
	Thread t=new Thread();
	t.join();
	
} catch (Exception e) {
e.printStackTrace();}	



}
	
	
	
	
	

}
