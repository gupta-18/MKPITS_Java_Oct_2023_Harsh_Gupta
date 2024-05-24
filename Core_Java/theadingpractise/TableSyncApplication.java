package com.mkpits.theadingpractise;

public class TableSyncApplication {

	public static void main(String[] args) {

		TableSync table1 = new TableSync();
		
		TableSyncThread t1 = new TableSyncThread(table1);
		TableSyncThread2 t2 = new TableSyncThread2(table1);
		t1.start();
		t2.start();
		
		
	}

}
