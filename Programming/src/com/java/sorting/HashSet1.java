package com.java.sorting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet1 {
  private int id;
  private String name;
	
	public HashSet1(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		/*
		 * Java HashSet class is used to create a collection that uses a hash table for
		 * storage. It inherits the AbstractSet class and implements Set interface.
		 * 
		 * The important points about Java HashSet class are:
		 * 
		 * HashSet stores the elements by using a mechanism called hashing. HashSet
		 * contains unique elements only. HashSet allows null value. HashSet class is
		 * non synchronized. HashSet doesn't maintain the insertion order. Here,
		 * elements are inserted on the basis of their hashcode. HashSet is the best
		 * approach for search operations. The initial default capacity of HashSet is
		 * 16, and the load factor is 0.75.
		 */
		Scanner sc=new Scanner(System.in);
		HashSet<HashSet1> sh=new HashSet<HashSet1>();
		int i=1;
		while(i<=2)
		{
			System.out.println("Enter th id and name of the employee");
			int id=sc.nextInt();
			String name=sc.next();
			HashSet1 h1=new HashSet1(id, name);
			sh.add(h1);
			i++;
		}
		   for(HashSet1 b:sh)
		{
			System.out.println(b.id+" "+b.name);
		}
		

	}

}
