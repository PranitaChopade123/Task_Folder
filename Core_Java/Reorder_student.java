package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Reorder_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number :");
		 int n=sc.nextInt();
		 int[] arr =new int[n];
		 int[] index=new int[n];
		 int temp[]=new int[n];
		 System.out.println("Enter the array element :");
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("Enter the index for array element :");
		 for(int i=0;i<n;i++)
		 {
			 index[i]=sc.nextInt();
		 }
		// Arrays.sort(index);
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 temp[index[i]] =arr[i];
			 
			 
		 }
		 System.out.println("Modified array element according to index :");
		 for(int i=0;i<arr.length;i++)
		 {
			
			 System.out.print(temp[i] + "\t"); 
		 }
		
	}

}
