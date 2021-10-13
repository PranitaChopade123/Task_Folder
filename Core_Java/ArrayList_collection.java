package practice;

import java.util.*;

public class ArrayList_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList<>();
	
		a.add(1);
		a.add(101);
		a.add("Pranita");
		a.add("Pune");
		a.add("pranita@gmail.com");
		a.add("Edubridge");
		
		System.out.println("Original ArrayList : " + a);
		System.out.println();
		
		ArrayList a2 = (ArrayList)a.clone();
		
		System.out.println("Cloned Array List: " + a2);
		System.out.println();
		System.out.println("Removed the second element from the list : " + a.remove(1));
		System.out.println();

		System.out.println("original ArrayList : " + a);
		
			
		
		

		
		
	}

}
