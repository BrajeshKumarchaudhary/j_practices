package com.java.model;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two string");
        String s1=sc.next();
        String s2=sc.next();
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
      if(a.equals(b))
      {
    	  System.out.print("String are anagram");
      }
      else
      {
    	  System.out.print("String are not anagram");
      }
		
        
		
		
		
	}

}
