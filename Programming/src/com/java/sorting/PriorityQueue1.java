package com.java.sorting;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
/*
 * 
Java Queue interface orders the element in FIFO(First In First Out) manner. In FIFO, first element is removed first and last element is removed at last.
 * 
 * 		
 */
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("barjesh kumar");
		pq.add("Sonu kumar");
		Iterator<String> it=pq.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		pq.remove();
		Iterator<String> i=pq.iterator();
		System.out.print("after removing the elemet");
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		

	}

}

