package com.java.pattern;

import java.util.Scanner;

public class CrossDiagonalPattern {

	
	static void printPattern(int row,int column)
	{ 
		int c=column-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i==j||j==c)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			c--;
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the row and column");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		printPattern(r ,c);
	}

}
