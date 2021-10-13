package practice;

import java.util.Scanner;

public class Bigger_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		int rem,ans=1;
		
		while(n!=0)
		{
		rem=n%10;
		ans=ans*10+rem;
		n=n/10;
		
		for(int i=rem+1;i<=9;i++)
		{
			count++;
		}
		
		}
		System.out.println("Possible Ways : " + count);
		
		
		
		
		
		
		
	}

}
