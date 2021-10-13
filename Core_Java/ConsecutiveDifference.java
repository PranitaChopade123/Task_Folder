package practice;

import java.util.Scanner;

public class ConsecutiveDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);

int i;
	System.out.println("Enter the size of array :");
	int n=sc.nextInt();
	if(n<0)
	{
		System.out.println("Invalid input");
	}
	else
		{
		System.out.println("Enter the array element :");
		int ans[]=new int[n];	
	int arr[]=new int[n];
	int count=0;
	  for(i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
		  if(arr[i]<0)
			  System.out.println("Invalid input");
	  }
	  for( i=0;i<n-1;i++)
	  {
		  ans[i]=arr[i]-arr[i+1];
		   if(ans[i]>=4 ||ans[i]<=-4)
			   count++;
		   
	  }
	  if(count==n-1)
		  System.out.println("Consecutive Difference is 4 or greater than 4 = 1");
	  else
		  System.out.println("Consecutive Difference is not 4 or less than 4 = 0");
	
	}	
	}

}
