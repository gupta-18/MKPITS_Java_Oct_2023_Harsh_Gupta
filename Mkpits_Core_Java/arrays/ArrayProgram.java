package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayProgram
{
  static BufferedReader br;
  int ui;

  static int number[];
  
	public static void main(String[] args) throws NumberFormatException, IOException {
		 br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayProgram obj = new ArrayProgram();
		
		obj.input();
		obj.output();
		System.out.println("\n");
		obj.assendingSort();

	}

	private void assendingSort() {
		for(int i = 0;i<number.length;i++) 
		{ 
			for(int j= i+1;j<number.length;j++)
			{
				if(number[i]>number[j])
				{
				int temp = number[i];
				number[i] = number[j];
				number[j] = temp;
				
			}
				
		}
			System.out.println(number[i]);
			
		}
	}

	private void input() throws NumberFormatException, IOException
	{
		
		System.out.println("Enter number");
		 number = new int[5];
		for(int i=0;i<number.length;i++)
		{
			  number[i] =Integer.parseInt(br.readLine()); 
		}
	}
		
	private void output() throws NumberFormatException, IOException 
	{
			
		System.out.println("output");
		 // number = new int[5];
			for(int i=0;i<number.length;i++)
			{
				System.out.println(number[i]);
			}
			
	}

}
