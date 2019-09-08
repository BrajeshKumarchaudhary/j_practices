package com.java.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Brajesh kumar");
		l.add("Ankit");
		l.add("Sresh tiwari");
//		Ways to iterate the elements of the collection in java
//		There are various ways to traverse the collection elements:
//
//		By Iterator interface.
//		By for-each loop.
//		By ListIterator interface.
//		By for loop.
//		By forEach() method.
//		By forEachRemaining() method.
		
		/**
		 * By Iterator interface
		 */
//		
//		Iterator itr=l.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next());
//		}
		/**
		 * By for-each loop
		 */
//		for (String obj : l) {
//			System.out.print(obj);
//		}
		
		/**
		 * by using for loop
		 */
//		for (int i = 0; i < l.size(); i++) {
//			System.out.print(l.get(i));
//			}
		/**
		 * By using Listiterator it works on reverse order
		 */
		ListIterator<String> list1=l.listIterator(l.size());
		while(list1.hasPrevious())
		{
			System.out.print(list1.hasPrevious());
		}
		
	}

}
