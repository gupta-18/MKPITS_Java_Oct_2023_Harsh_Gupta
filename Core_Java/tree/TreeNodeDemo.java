package com.mkpits.tree;

import java.util.ArrayList;

public class TreeNodeDemo {

	String data;
	ArrayList<TreeNodeDemo>treeObj;
	
	public TreeNodeDemo(String data){
		this.data =data;
	this.treeObj =new ArrayList<TreeNodeDemo>();
	}
	
	
	void child (TreeNodeDemo obj) {
		this.treeObj.add(obj);
	}
	
	
	
	String print (int level) {
		String ret = "  ".repeat(level) + data + "\n";
		for (TreeNodeDemo treeNodeDemo : treeObj) {
			ret += treeNodeDemo.print(level+1);
		}
		return ret;
	}
	
	
}
