package com.mkpits.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FirstOutputStreamClass {

	//output stream is used for byte type data
	//here we will give path for file creation and  input some data  which will be stored in the created file
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your data here");
	String str = br.readLine();
	//providing input as string in file   \n  is used for every time we insert data it will be taken in new line
	str = str+"\n";
	
	//we are using constructors here
FileOutputStream fos = new FileOutputStream("E:\\\\mkpits_workspace\\\\CoreJava_Harsh_Gupta\\\\src\\\\com\\\\mkpits\\\\filehandling\\\\inputstream.txt", true);
//string data will be converted into byte array and written in file with write method
byte b[]= str.getBytes();
fos.write(b);
System.out.println("Data is written in file");
	}

}
