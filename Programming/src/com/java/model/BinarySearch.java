package com.java.model;

public class BinarySearch {

	public static int isBinarySearch(int a[],int r,int l,int s)
	{
		try
		{
		int mid=Math.floorDiv(l+r, 2);
		
			if(a[mid]==s)
			{
				return mid;
			}
			else
			{
				if(a[mid]>s)
				{
					
				
				isBinarySearch(a, mid+1, l, s);
				}
				else
				{
					isBinarySearch(a, r, mid-1, s);
				}
			}
		}
		catch(Exception ex)
		{
			//System.out.print(ex.getMessage());
		}
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int s=6;
	int r=BinarySearch.isBinarySearch(a, 0, a.length, s);
	if(r==0)
	{
		System.out.print("the number is not found");
	}
	else
	{
		System.out.print("the number is found at position--"+r);
	}

	}

}
