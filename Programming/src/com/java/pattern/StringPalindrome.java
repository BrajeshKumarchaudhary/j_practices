package com.java.pattern;

import java.util.Scanner;

public class StringPalindrome {
	  
	
	  static void checkPalindrome(String st)
	  {

	        String a, b = "";
	        a=st;
	        int n = a.length();

		  for (int i =n-1;i>=0; i--) {
			  b = b + a.charAt(i);
		}
		  if(b.equalsIgnoreCase(st))
		  {
			  System.out.print("The string are palindrome");
		  }
		  else
		  {
			  System.out.print("The string are not palindrome");
		  }
		  
	  }

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		checkPalindrome(str);
		
    }


	
	

}
