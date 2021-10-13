package practice;

import java.util.Scanner;

public class Practical_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int lastno,i=0;
			while(n!=0)
			{
				//System.out.println(m);
				lastno=i%10;
				 System.out.println("Last no" +lastno);
			     i++;
	    
			}
		
	}

}
