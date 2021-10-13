package practice;

import java.util.Scanner;

public class Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,i=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n<0)
			System.out.println("Number too small");
		else if(n>32767)
			System.out.println("Number too large");
		
		else 
			{
			System.out.println("Enter the number whose occurence to be calculated ");
			
		int count=sc.nextInt();
			
		while(n!=0)
		{
			rem=n%10;
			if(rem==count)
			i++;
			n=n/10;
			
			
		}
		System.out.println("Count=" + i);

	}

}
}