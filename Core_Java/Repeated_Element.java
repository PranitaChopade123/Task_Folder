package practice;

import java.util.Scanner;

public class Repeated_Element {

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
			
			int ans=maxRepeatedElement(arr,n);
		
				System.out.println("Repeated element :" + ans);
			}
		
		
		
		
		
	}

	public static int maxRepeatedElement(int[] arr, int n) {
		// TODO Auto-generated method stub
		int count=0,ecount=0;
		int s1 = 0,s2=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(arr[i]==arr[j])
			{
				s1=arr[i];
			       count++;
			}
			}
			
		}
	
if(count>0 && count<=20)
	return s1;
else
	return s2;
		
	}

}
