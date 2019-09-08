package com.java.model;
import com.java.model.Student;;

class Registration implements Student{
	@Override
	public void signup()
	{
		System.out.print("My Signup successfully");
	}
 @Override
 public void singin()
 {
	 System.out.print(" My login is successfully");
 }
 public static void main(String args[])
 {
	 Registration rg=new Registration();
	  rg.signup();
	  rg.singin();
 }
 
 
 
}
