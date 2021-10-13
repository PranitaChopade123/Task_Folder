package practice;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			System.out.println("Enter the array element :");
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]<0)
				{
					System.out.println("Invalid input");
				}
			}
			System.out.println("Which element you want to search :");
			int s=sc.nextInt();
			
			int ans=isElementPresent(arr,n,s);
			
			if(ans==1)
				System.out.println("YES " + s + " is present.");
			else
				System.out.println("NO " +  s + " is not present.");
		}
		
		
		
		
		
	}

	public static int isElementPresent(int[] arr, int n, int s) {
		// TODO Auto-generated method stub
		int count=0,ecount=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==s)
			       count++;
			else 
				ecount++;
		}
if(count>0)
	return 1;
else
	return 0;
		
	}

}
