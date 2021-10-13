package practice;

import java.util.Scanner;

public class Sum_Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int c=0;
      System.out.println("Enter number (n) :");
      int n=sc.nextInt();
      if (n<0)
    	  System.out.println("Invalid input");
       
      System.out.println("Enter number (m) :");
      int m=sc.nextInt();
        if (m<0)
    	  System.out.println("Invalid input");
     
      for(int i=0;i<n;i++)
      {
    	  if(i%m==0)
    		  c=c+i;
      }
      System.out.println("Sum of the number divisible by " + m + " is " + c);
		
	}
	
}
