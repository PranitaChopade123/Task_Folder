package practice;

import java.util.Scanner;

public class Change_Minimal_Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int arr[]=new int[]{500,100,50,10,5,1};
		int ans[]=new int[10000];
		int count=0;
		if(n<0)
		{
			System.out.println("Invalid input");
		}
		
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				ans[i]=arr[i]+ans[i];
				if(ans[i]!=n)
					count++;
			}
			System.out.println("Count " + count);
		}
		
	}

}
