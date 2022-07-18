package com.Svkp.Scanner;
import java.io.*;
public class BufferReader 
{
	public static void main(String[]args) throws IOException
	
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double a;
		System.out.print("Enter the value of anumber : ");
		a = Double.parseDouble(in.readLine());
		if(a<0)
			System.out.println("Negative");
		else
			System.out.println("Positive");
	}
}
