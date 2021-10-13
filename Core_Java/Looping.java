package practice;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int number=-5;
		do
		{
			
			sum=sum+number;
		//number=sc.nextInt();
		}while(number>=0);

		System.out.println(sum);
	}

}
