package com.mkpits.theadingpractise;

public class TableSyncThread2 extends Thread {

	
TableSync t;
	
	public TableSyncThread2(TableSync t) {
		this.t =t;
		
	}
	@Override
	public void run() {
		t.printTable(5);
	}
	
}
