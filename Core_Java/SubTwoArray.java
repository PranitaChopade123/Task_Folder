package practice;

import java.util.Scanner;

public class SubTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=sc.nextInt();
		if(n<0)
			System.out.println("Invalid input");
		else
		{
			System.out.println("Enter the first array element");
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
			if(arr[i]<0)
				System.out.println("Invalid input");
			}
			int count=0;
			System.out.println("Enter the second array element");
			int arr1[]=new int[n];
			for(int i=0;i<n;i++)
			{
			arr1[i]=sc.nextInt();
			if(arr1[i]<0)
				System.out.println("Invalid input");
			}
			System.out.println("Output :");
		for(int i=0;i<n;i++)
		{
			int j;
			for( j=0;j<n;j++)
			{
				if(arr[i]==arr1[j])
				break;
					
			}
			
			if(j==n)
			System.out.println(arr[i]);
		
		}

	}

	}
}
