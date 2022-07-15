package com.Svkp.Scanner;
import java.util.Scanner;

public class Smallest 
{
	public static void main(String[]args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1=in.nextInt();
		System.out.println("Enter the second number :");
		int num2=in.nextInt();
		System.out.println("Enter the third number :");
		int num3=in.nextInt();
		
		if(num1<=num2 && num1<=num3)
		{
			System.out.println("The Smallest number is : " + num1);
			}
		if(num2<=num1 && num2<=num3) 
		{
			System.out.println("The smallest number is : " + num2);
		}
		if(num3<=num1 && num3<=num2) 
		{
			System.out.println("The smallest number is : " + num3);
		}
	}

}
