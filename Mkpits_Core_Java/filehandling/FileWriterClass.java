package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass {
//for char data we use file  writer
	//here we are creating file similar like outstream
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the data");
String var = br.readLine();
var= var+ "\n";

FileWriter fw = new FileWriter("E:\\mkpits_workspace\\CoreJava_Harsh_Gupta\\src\\com\\mkpits\\filehandling\\logic.txt", true);
fw.write(var);
fw.close();
	}

}
