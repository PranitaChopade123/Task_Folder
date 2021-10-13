package practice;
import java.util.Arrays;
import java.util.Scanner;

public class Index {

			static int arr[] = new int[]{14, 15, 16};
		    static int index[] = new int[]{ 1,  2, 0};
		     
		    // Method to reorder elements of arr[] according
		    // to index[]
		    static void Index()
		    {
		        int temp[] = new int[arr.length];
		      
		        // arr[i] should be present at index[i] index
		        for (int i=0; i<arr.length; i++)
		            temp[index[i]] = arr[i];
		      
		        // Copy temp[] to arr[]
		        for (int i=0; i<arr.length; i++)
		        {
		           arr[i]   = temp[i];
		           index[i] = i;
		        }
		    }
		     
		    // Driver method to test the above function
		    public static void main(String[] args)
		    {
		         
		        Index();
		         
		        System.out.println("Reordered array is: ");
		        System.out.println(Arrays.toString(arr));
		        System.out.println("Modified Index is:");
		        System.out.println(Arrays.toString(index));
		         
		    }
		
		

	}
