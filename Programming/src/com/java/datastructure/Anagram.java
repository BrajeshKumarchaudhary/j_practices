package com.java.datastructure;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
		StringBuffer s= new StringBuffer(aa);
		StringBuffer s2= new StringBuffer(aa);
		int count=0;
		int x=0;
		for(int j=0;j < s.length();j++){
            
            for(int k=0;k<s2.length();k++){
            
                if( s.charAt(j) == s2.charAt(k) ){
                    s.deleteCharAt(j);
                    s2.deleteCharAt(k);
                    count = count + 1;
                    j--;
                    break;
                    
                }
            }
            
            
		}
        x =a.length() + b.length() - 2*count;
        System.out.println(x);
		}
		

	}

}
