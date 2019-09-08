package com.java.algorithm;

import java.util.Scanner;

public class Student {
   private  String name;
   private int id;
   private  String grade;
   public Student(String n,int id,String g) {
	// TODO Auto-generated constructor stub
	   this.name=n;
	   this.id=id;
	   this.grade=g;
}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of student");
		int n=sc.nextInt();
		Student[] arr; 
		 arr = new Student[5];
		 arr[0]=new Student("brajesh",200, "A");
		 for (int i = 0; i < arr.length; i++) {
             System.out.print("Student name"+arr[i].name+""+"student id"+arr[i].id+""+"Student grade"+arr[i].grade);			
		}

	}

}
