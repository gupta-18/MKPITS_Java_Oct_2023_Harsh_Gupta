package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		//irt also work as inputstream difference is it used for char type data
	//here also if all data is read after that it takes as null
FileReader fr =new FileReader("E:\\\\mkpits_workspace\\\\CoreJava_Harsh_Gupta\\\\src\\\\com\\\\mkpits\\\\filehandling\\\\logic.txt");
BufferedReader br = new BufferedReader(fr);
String data = "";
while((data=br.readLine())!=null) {
	System.out.println(data);
}
fr.close();
	}

}
