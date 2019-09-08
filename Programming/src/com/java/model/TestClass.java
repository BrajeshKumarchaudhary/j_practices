package com.java.model;



import java.util.*;
class TestClass {
   
    public static void main(String args[] ) {


        //Scanner
        Scanner s = new Scanner(System.in);

         System.out.print("Enter the till number");
          int N=s.nextInt();
          int count=0;
          
          for(int i=2;i<=N;i++)
          {
       	   count=0;
              for(int j=2;j<i;j++)
              {
               if(i%j==0)
               {
                   count++;
                   break;
                   
               }
              }
              if(count==0||i==2)
              {
                  System.out.println(i);
              }
              else
              {
            	 // System.out.println(count);
              }
              }    

        // Write your code here

    }
}
