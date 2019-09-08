package com.java.pattern;

import java.util.Scanner;

public class NumberToword {

	private static final String num[]= {"","one","two","Three","Four","Five","Six","Seven","Eight","Nine"};
	private static final String tenNum[]= {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	private static final String lacNum[]= {"Hundred","lac"}; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc=new Scanner(System.in);
               System.out.print("Enter th number");
               int n=sc.nextInt();
               String s=Integer.toString(n);
               System.out.print(""+s.length());
	}

}
