package practice;

import java.util.Scanner;

public class firstMiddleSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n=sc.nextInt();
       int i,j;
       if(n<0)
       {
    	   System.out.println("Invalid Input");
       }
       else
       {
    	   System.out.println("Enter the array element");
    	   int arr[]=new int[n];
    	   for( i=0;i<n;i++)
    	   {
    		   arr[i]=sc.nextInt();
    		   if(arr[i]<0)
    		   {
    			   System.out.println("Invalid Input");
    		   }
    	   }
    	if(n%2==1 && arr[0]==arr[((n+1)/2)-1])
   		{
   			System.out.println("100");
   		}
   		else if(n%2==1 && arr[0]!=arr[(n+1)/2-1])
   		{
   			System.out.println(arr[0]);
   		}
     
		}
}
}