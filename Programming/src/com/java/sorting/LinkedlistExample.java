package com.java.sorting;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExample {

	private static Object String;

	public static void main(String[] args) {
		/**
		 * Java LinkedList class uses a doubly linked list to store the elements. It
		 * provides a linked-list data structure. It inherits the AbstractList class and
		 * implements List and Deque interfaces.
		 * 
		 * The important points about Java LinkedList are:
		 * 
		 * Java LinkedList class can contain duplicate elements. Java LinkedList class
		 * maintains insertion order. Java LinkedList class is non synchronized. In Java
		 * LinkedList class, manipulation is fast because no shifting needs to occur.
		 * Java LinkedList class can be used as a list, stack or queue.
		 */
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("brajesh kumar");
		l.add("MAneesh kumar");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}

	}

}
