package com.java.model;
public class LinearSearch {
	
	public static int linear(int a[],int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]==x) {
				return i;
				}
		}
		return -1;
		
	}
	public static void main(String args[])
	{
		int a[]= {3,5,6,7,8};
		int k=8;
		int result=LinearSearch.linear(a,k);
		if(result==-1)
		{
			System.out.print("The number is not found");
		}
		else
		{
			System.out.print("the number is found at position--"+result);
		}
	}

}
