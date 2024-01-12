package com.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) throws IOException {
//we cannot write system.out.print statement in console web screen it can be only written in console thats why this print writer class is used for screen printing
// this second true is for automatic flush out (flush means it will be removed from queue pipe) 
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("It works");
		
		
		
		//here we are writing  file path in file writer so  it will write this  below print statement directly into the 
		//what we write in print will be directly appended in file                                                 
		
		PrintWriter pw1 = new PrintWriter(new FileWriter("E:\\\\mkpits_workspace\\\\CoreJava_Harsh_Gupta\\\\src\\\\com\\\\mkpits\\\\filehandling\\\\inputstream.txt",true), true);		
		pw1.println("File Writer says hello");
		pw1.close();
		
	}

}

