package practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int rem=0,ans=0;

		//int[] arr= new int[n];

		//This Program Gives Pattern
//			for(int i=0;i<n;i++)
//			{
		//	
//				rem=n%10;
//				ans=ans*rem+10;
//				n=n/10;
//				System.out.println(n);
//			}

		while(n!=0){
				rem=n%10;
				ans=ans*10+rem;
				n=n/10;
				
			
			}
		
		System.out.print("Reverse number : " + ans);
	}

}
