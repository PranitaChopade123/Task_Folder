package practice;

import java.util.Scanner;

public class countEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
	
		System.out.println("Enter the array element:");
		int arr[]=new int[n];
		int Ans;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		CountEvenRepeat c=new CountEvenRepeat();
		
		Ans=c.countEvenRepeat(arr,n);
		
		System.out.println("Count : " + Ans );
	}

}

class CountEvenRepeat
{
	public int countEvenRepeat(int arr[],int n)
	{
		int count=0,i;
		for( i=1;i<n;i++)
		{
			int j=0;
			for(j=0;j<i;j++)
			       if(arr[i]==arr[j])
			    	   break;
			if(i!=j)
		        	  count++;
	
		    
		}
		return count;	
	}
}
		
	

