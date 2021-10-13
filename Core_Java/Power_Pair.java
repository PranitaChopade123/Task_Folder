package practice;

import java.util.Scanner;

public class Power_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		
		System.out.println("Enter the array element");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int high=n-1;
		int low=0;
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(low<high)
				high--;
			else
				low++;
			count++;
		}
		System.out.println("Count : " + count);
	}

}
