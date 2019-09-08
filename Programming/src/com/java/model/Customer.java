package com.java.model;
import com.java.model.Bankaccount;;
public class Customer extends Bankaccount {
	@Override
	public int calculate()
	{
		int result=10;
		return result;
	}
public static void main(String args[])
{
	Customer st=new  Customer();
          st.display();
          int result=st.calculate();
          System.out.print(result);
}
}
