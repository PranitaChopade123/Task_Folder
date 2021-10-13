package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sliding_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		int m=sc.nextInt();
		
		System.out.println("Enter second no");
		int n=sc.nextInt();
		int i,firstno=0,lastno=0;
		
			
		
		for(i=m;i<n;i++)
		{
			while(m!=n+1)
			{
				//System.out.println(m);
				lastno=m%10;
				 System.out.println("Last no" +lastno);
			     m++;
	    
			}
			
		}
			
			
		
		
	}
}


