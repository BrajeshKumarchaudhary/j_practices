package com.java.pattern;

import java.util.Scanner;

public class Fibbonaci {
 
	static void printFib(int last)
	{
		int a=0;
		int b=1;
		System.out.println(a);
		for (int i = 2; i <=last; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int last=sc.nextInt();
		printFib(last);
	}
	
	
	
}
