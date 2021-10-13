package practice;

import java.util.Scanner;

public class Diagonal_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ans=0,Ans1=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows and column");
		int n=sc.nextInt();
		
		
		int[][] arr=new int[n][n];
		
		System.out.println("Enter the Array element :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i==j)
			{
				
				Ans= Ans+arr[i][j];
				
			}
			}
		}
		System.out.println("Answer of primary digonal element : " + Ans);
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i+j==2)
			{
				
				Ans1= Ans1+arr[i][j];
				
			}
			}
		}
		System.out.println("Answer of secondary digonal element : " + Ans1);
		
		int X=Ans-Ans1;
		
		if(X<0)
		{
			X=-1*X;
		System.out.println("Absolute Difference between primary and secondary element (|4-19|) : " + X);
		}
		else
		{
			System.out.println(X);
		}

		
	}

}
