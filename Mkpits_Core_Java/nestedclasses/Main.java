package com.mkpits.nestedclasses;

import com.mkpits.nestedclasses.OuterClass.OuterInnerClass;

public class Main {

	public static void main(String[] args) {
		OuterClass outerobj =new OuterClass();
		
		OuterClass.InnerClass outerInnerObj = outerobj.new InnerClass();
		OuterClass.OuterInnerClass objforoi = outerobj.new OuterInnerClass();
		
		
		System.out.println(outerobj.x);
		System.out.println(outerInnerObj.z);
		 objforoi.getMethod();
	}

}
