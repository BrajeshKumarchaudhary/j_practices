package com.java.sorting;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSet1 {

	protected int id;
	protected String name;

	public LinkedHashSet1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<LinkedHashSet1> lhs = new LinkedHashSet<LinkedHashSet1>();
		int i = 1;
		int id;
		String name;
		while (i <= 4) {
			System.out.println("Enter the id and name");
			id = sc.nextInt();
			name = sc.next();
			LinkedHashSet1 b1 = new LinkedHashSet1(id, name);
			lhs.add(b1);
			i++;
		}
		for(LinkedHashSet1 s:lhs)
		{
			System.out.println(s.name+"Employee information----------********");
			System.out.println(s.id+"  "+s.name);
		}

	}

}
