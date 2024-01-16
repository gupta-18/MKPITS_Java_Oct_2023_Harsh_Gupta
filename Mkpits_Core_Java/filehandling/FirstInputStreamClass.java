package com.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FirstInputStreamClass {
//it is used to read files data exactly it appears in file
	//in outstream we have created a file in this instream we are reading it 
	//we are using constructors here
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\mkpits_workspace\\CoreJava_Harsh_Gupta\\src\\com\\mkpits\\filehandling\\inputstream.txt"); 
		int b =0;
//file data is completely taken till last '}' but after that if all data is taken then it takes it -1 if -1 is taken then it simply means all data is taken for reading
		while((b=fis.read()) != -1) {
			System.out.print((char)b);
		}
//we close file everytime so no one  can use that file we have opened before
		//open kiya hai to close bhi karna padta hai
		fis.close();
	}

}
