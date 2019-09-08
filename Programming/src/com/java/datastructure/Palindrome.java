package com.java.datastructure;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	        StringBuffer s1=new StringBuffer(s);
	        StringBuffer s2=new StringBuffer(s);
	        if(s2.reverse()==s1)
	        {
	            System.out.print("YES");
	        }
	        else
	        {
	            System.out.print("NO");
	        }
	}

}
