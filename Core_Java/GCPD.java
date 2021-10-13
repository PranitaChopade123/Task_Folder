package practice;

import java.util.Scanner;

public class GCPD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number ");
		int n2=sc.nextInt();
		
		if(n1%2==0 && n2%2==0)
		{
			while(n1!=n2)
			{
				if(n1>n2)
				{
					n1-=n2;
				}
				else
				{
					n2=n2-n1;
				}
				
			}
			System.out.println("Answer : " + n1);
		}
		else if(n1%2!=0 && n2%2==0)
		{
			System.out.println("Answer : 1");
		}
		else
		{
			System.out.println("Answer : -1");
		}
		

	}

}
