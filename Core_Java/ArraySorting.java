package practice;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the size of array");
	       int n=sc.nextInt();
	       if(n<0)
	       {
	    	   System.out.println("Invalid Input");
	       }
	       else
	       {
	    	   System.out.println("Enter the array element");
	    	   int arr[]=new int[n];
	    	   for(int i=0;i<n;i++)
	    	   {
	    		   arr[i]=sc.nextInt();
	    		   if(arr[i]<0)
	    		   {
	    			   System.out.println("Invalid Input");
	    		   }
	    	   }
	    	   System.out.println("Sorted element ");
	    	   for(int i=0;i<n/2;i++)
	    	   {
	    		   for(int j=i+1;j<=n/2;j++)
	    		   {
	    			   if(arr[i]>arr[j])
	    			   {
	    			   int temp=arr[i];
	    			   arr[i]=arr[j];
	    			   arr[j]=temp;
	    			   }
	    			   
	    		   }
	    		   System.out.println(arr[i]);
	    	   }
	    	   for(int i=n/2;i<n;i++)
	    	   {
	    		   for(int j=i+1;j<n;j++)
	    		   {
	    			   if(arr[i]<arr[j])
	    			   {
	    			   int temp=arr[i];
	    			   arr[i]=arr[j];
	    			   arr[j]=temp;
	    			   }
	    			   
	    		   }
	    		   System.out.println(arr[i]);
	    	   }
	    	   
	       }

		
	}

}
