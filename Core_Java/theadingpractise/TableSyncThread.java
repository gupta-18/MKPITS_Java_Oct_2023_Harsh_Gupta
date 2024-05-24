package com.mkpits.theadingpractise;

public class TableSyncThread extends Thread {

	TableSync t;
	
	public TableSyncThread(TableSync t) {
		this.t =t;
		
	}
	@Override
	public void run() {
		t.printTable(4);
	}
	
}
