package com.java.pattern;

import java.util.Scanner;

public class Diamond {
	
	public Diamond(int row)
	{
		/*
		 * First calculate the value middle row of diamond
		 */
          		int mid=(row+1)/2;
		
            // print first upper diamond
			for (int i = 1; i <=mid; i++) {
				//spaces print
				for (int s = i; s<=mid-1; s++) {
					System.out.print(" ");
				}
				for (int j = 1; j <=(2*i-1); j++) {
					System.out.print("*");
				}
				System.out.println();
				
				
			}
			//print lower part
			for (int i = 1;i<=mid-1; i++) {
				
				//space
				for (int j = 1; j <=i; j++) {
					System.out.print(" ");
				}
				//star
				for (int j = 1; j <=2*(mid-i)-1; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			
			
			
			
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of row(odd)");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		Diamond d=new Diamond(row);
		

	}

}
