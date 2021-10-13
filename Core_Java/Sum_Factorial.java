package practice;

import java.util.Scanner;

public class Sum_Factorial {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		if(n>32767){
			System.out.println("Number too large");
		}
		else if(n<0)
			System.out.println("Invalid input");
        int i=1;
        int fact =1;
        int rem;
        int ans=0,ans1=1;
        while(n!=1)
        {
            rem=n%10;
//             if(n%2!=0 || n>=2) 
//              {
            while(rem!=0)
            {
             
               
            fact=fact*i;
            
            i++;
            rem--;
//              }
            }
            
        ans=ans+fact;
            n=n/10;
            fact=1;
            i=1;
        }
        
        System.out.println("Total sum : " + ans);
        
    }

}