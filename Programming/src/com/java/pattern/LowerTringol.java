package com.java.pattern;

import java.util.Scanner;

public class LowerTringol {
	public int printLowerTringle(int row,int column)
	{
		/**
		 * First loop print number of row
		 * Second loop print number of column
		 */
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < column; j++) {
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
				
			}
			System.out.println();
		}
		
		
		
		return 0;
	}
	public static void main(String args[])
	{
		System.out.print("Enter the number of row");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		System.out.print("Enter the number of column");
		int c=sc.nextInt();
		LowerTringol l=new LowerTringol();
		l.printLowerTringle(row, c);
	}
	
	

}
