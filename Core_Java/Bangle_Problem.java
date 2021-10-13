package practice;

import java.util.Scanner;

public class Bangle_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X1 and Y1");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("Enter the value of X2 and Y2");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		System.out.println("Enter the value of R1 and R2");
		int R1=sc.nextInt();
		int R2=sc.nextInt();
		
		int a1=x2-x1;
		int a2=a1*a1;
		
		int b1=y2-y1;
		int b2=b1*b1;
		
		int c1=a2+b2;
		double d1=Math.sqrt(c1);
		
		int e1=R1+R2;
		
		if(d1==e1)
		{
			System.out.println("Circle touches");
			System.out.println(d1);
		}
		else if(d1>e1)
		{
			System.out.println("Circle do not touch");	
			System.out.println(d1);
		}
		else 
		{
			System.out.println("Circle intersects");
			System.out.println(d1);
		}
	}

}
