package com.Svkp.Swapping;

public class Swapping 
{
	public static void main(String[]args) 
	{
		int a = 10, b = 20;
		System.out.println("Original values of x and b");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swapped values of a and b");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
