package com.java.model;

import java.util.Scanner;

public class PrimeNumber {

	public static int isPrime(int a)
	{
		{
			for (int i = 2; i < a/2; i++) {
				if(a%i==0)
				{
					return 1;
				}
				
			}
		}
		
		return 0;
		
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.print("The number is nor prime or composite");
		}
	int result=PrimeNumber.isPrime(n);
	if(result==1)
	{
		System.out.print("the number is not prime");
	}
	else
	{
		System.out.print("the number is prime");
	}
	}
	
	
}
