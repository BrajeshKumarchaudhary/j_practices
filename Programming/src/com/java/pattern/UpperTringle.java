package com.java.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class UpperTringle {

	public static void printUpperTringle(int row,int column)
	{
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(j>=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		UpperTringle.printUpperTringle(r, c);
	}

}
