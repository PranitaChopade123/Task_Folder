package practice;

import java.util.Scanner;

public class Boat_Travel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_speed=0,T;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Speed of boat in KMPH : ");
		int s=sc.nextInt();
		
		System.out.println("Enter the water flow : ");
		int w=sc.nextInt();
		
		System.out.println("Enter the distance to be covered in KM : ");
		int d=sc.nextInt();
		
			total_speed=s+w;
			T=d/total_speed;
			System.out.println("Time taken :" + T);
			
		
	}

}
