package www.program.hackerrank;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int num, counter, item, array[];
		 
		//To capture user input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of item");

		num=sc.nextInt();
		
		//creating an array to store all the elements
		
				array = new int[num];
		System.out.println("Enter " + num + "integers");
		//Loop to store each number in array
		
		for(counter = 0;counter < num; counter++)
			array[counter] 	= sc.nextInt();
		
		System.out.println("Enter the item has to be search");
				
		item = sc.nextInt();
		
		sc.close();
				
		for(counter = 0; counter < num; counter++)
		{
			if(array[counter] == item)
			{
				System.out.println(item+ " is present at location "+(counter+1));
						break; // Use break to come out from the loop
			}
			if (counter == num) {
				System.out.println(item+ "doean't exists");
			}
				
		}
		
		
		}

}
